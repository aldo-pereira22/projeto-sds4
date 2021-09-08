import Footer from "components/Footer";
import NavBar from "components/NavBar";
import DataTable from "components/DataTable";

function App() {
  return (
    <>
      <NavBar></NavBar>
      <div className="container">
        <h1 className="text-primary" > Olá Mundo! </h1>
        <DataTable></DataTable>
      </div>

      <Footer />
    </>
  );
}

export default App;
