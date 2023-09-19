# Android Clean Architecture + MVVM 樣板
一個採用 Clean Architecture 和 MVVM 設計模式的 Android 樣板專案。此外，它還包含了依賴注入和單元測試，以及 UI 測試的基本設置。

### 專案結構
遵循分層架構，包含以下層：
- **presentation**：包含了 UI 和 ViewModel，用於顯示資料。
- **domain**：包含了業務邏輯，用於定義用例和實體。
- **data**：負責資料的讀寫，並包含了本地和遠端資料源的實現。

### 相關的Library
- **Hilt**：用於依賴注入。
- **JUnit**：用於單元測試。
- **Mockito**：用於在單元測試中模擬對象。
- **Espresso**：用於 UI 測試。
