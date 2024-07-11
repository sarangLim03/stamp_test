import React, { useState } from 'react';
import axios from 'axios';

function MyComponent() {
    const [inputValue, setInputValue] = useState('');

    const handleInputChange = (event) => {
        setInputValue(event.target.value);
    };

    const handleSubmit = async (event) => {
        event.preventDefault();
        try {
            await axios.post('/api/data', { data: inputValue });
            setInputValue('');
            console.log('Data saved successfully!');
        } catch (error) {
            console.error('Error saving data:', error);
        }
    };

    return (
        <form onSubmit={handleSubmit}>
            <input type="text" value={inputValue} onChange={handleInputChange} />
            <button type="submit">Save Data</button>
        </form>
    );
}

export default MyComponent;