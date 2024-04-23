import React from 'react';
import { useHistory } from 'react-router-dom';

const Home = () => {
  const history = useHistory();

  const handleLogout = () => {
    // Handle logout logic, e.g., clear session
    history.push('/');
  };

  return (
    <div>
      <h1>My Todo List</h1>
      {/* Todo list component */}
      {/* Project details component */}
      <button onClick={handleLogout}>Logout</button>
    </div>
  );
};

export default Home;
