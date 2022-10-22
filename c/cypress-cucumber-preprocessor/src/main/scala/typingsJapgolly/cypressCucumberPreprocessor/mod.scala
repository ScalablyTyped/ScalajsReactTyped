package typingsJapgolly.cypressCucumberPreprocessor

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("cypress-cucumber-preprocessor", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): js.Function1[/* file */ Any, js.Promise[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[js.Function1[/* file */ Any, js.Promise[String]]]
  inline def default(options: Any): js.Function1[/* file */ Any, js.Promise[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* file */ Any, js.Promise[String]]]
  
  inline def transform(file: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("transform")(file.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  trait TableDefinition extends StObject {
    
    /** Returns an array of objects where each row is converted to an object (column header is the key). */
    def hashes(): js.Array[StringDictionary[String]]
    
    /** Returns the table as a 2-D array. */
    def raw(): js.Array[js.Array[String]]
    
    /** Returns the table as a 2-D array, without the first row. */
    def rows(): js.Array[js.Array[String]]
    
    /** Returns an object where each row corresponds to an entry (first column is the key, second column is the value). */
    def rowsHash(): StringDictionary[String]
  }
  object TableDefinition {
    
    inline def apply(
      hashes: CallbackTo[js.Array[StringDictionary[String]]],
      raw: CallbackTo[js.Array[js.Array[String]]],
      rows: CallbackTo[js.Array[js.Array[String]]],
      rowsHash: CallbackTo[StringDictionary[String]]
    ): TableDefinition = {
      val __obj = js.Dynamic.literal(hashes = hashes.toJsFn, raw = raw.toJsFn, rows = rows.toJsFn, rowsHash = rowsHash.toJsFn)
      __obj.asInstanceOf[TableDefinition]
    }
    
    extension [Self <: TableDefinition](x: Self) {
      
      inline def setHashes(value: CallbackTo[js.Array[StringDictionary[String]]]): Self = StObject.set(x, "hashes", value.toJsFn)
      
      inline def setRaw(value: CallbackTo[js.Array[js.Array[String]]]): Self = StObject.set(x, "raw", value.toJsFn)
      
      inline def setRows(value: CallbackTo[js.Array[js.Array[String]]]): Self = StObject.set(x, "rows", value.toJsFn)
      
      inline def setRowsHash(value: CallbackTo[StringDictionary[String]]): Self = StObject.set(x, "rowsHash", value.toJsFn)
    }
  }
}
