import React from 'react';
import { BrowserRouter, Routes, Route, Link } from 'react-router-dom';
import HomePage from './pages/HomePage';
import ScanPage from './pages/ScanPage';
import SummarizePage from './pages/SummarizePage';
import QuizPage from './pages/QuizPage';
import VideoPage from './pages/VideoPage';
import TranslatePage from './pages/TranslatePage';
import AccessibilityBar from './components/AccessibilityBar';

function App() {
  return (
    <BrowserRouter>
      <AccessibilityBar />
      <nav>
        <Link to="/">Home</Link>
        <Link to="/scan">Scan</Link>
        <Link to="/summarize">Summarize</Link>
        <Link to="/quiz">Quiz</Link>
        <Link to="/video">Videos</Link>
        <Link to="/translate">Translate</Link>
      </nav>
      <Routes>
        <Route path="/" element={<HomePage />} />
        <Route path="/scan" element={<ScanPage />} />
        <Route path="/summarize" element={<SummarizePage />} />
        <Route path="/quiz" element={<QuizPage />} />
        <Route path="/video" element={<VideoPage />} />
        <Route path="/translate" element={<TranslatePage />} />
      </Routes>
    </BrowserRouter>
  );
}

export default App;