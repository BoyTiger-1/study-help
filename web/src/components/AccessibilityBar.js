import React, { useState } from 'react';

export default function AccessibilityBar() {
  const [fontSize, setFontSize] = useState(16);
  const [contrast, setContrast] = useState(false);

  return (
    <div style={{
      background: contrast ? '#222' : '#fff',
      color: contrast ? '#fff' : '#222',
      padding: '10px'
    }}>
      <button onClick={() => setFontSize(fontSize + 2)}>A+</button>
      <button onClick={() => setFontSize(fontSize - 2)}>A-</button>
      <button onClick={() => setContrast(!contrast)}>Toggle Contrast</button>
      <style>{`body { font-size: ${fontSize}px; }`}</style>
    </div>
  );
}