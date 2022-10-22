package typingsJapgolly.reactBootstrapTable2Toolkit

import japgolly.scalajs.react.Callback
import typingsJapgolly.reactBootstrapTableNext.mod.ColumnDescription
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Bootstrap4 extends StObject {
    
    var bootstrap4: js.UndefOr[Boolean] = js.undefined
    
    var columns: js.Array[ColumnDescription[Any, Any]]
    
    var data: js.Array[Any]
    
    /**
      * table key field
      */
    var keyField: Any
  }
  object Bootstrap4 {
    
    inline def apply(columns: js.Array[ColumnDescription[Any, Any]], data: js.Array[Any], keyField: Any): Bootstrap4 = {
      val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], keyField = keyField.asInstanceOf[js.Any])
      __obj.asInstanceOf[Bootstrap4]
    }
    
    extension [Self <: Bootstrap4](x: Self) {
      
      inline def setBootstrap4(value: Boolean): Self = StObject.set(x, "bootstrap4", value.asInstanceOf[js.Any])
      
      inline def setBootstrap4Undefined: Self = StObject.set(x, "bootstrap4", js.undefined)
      
      inline def setColumns(value: js.Array[ColumnDescription[Any, Any]]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      inline def setColumnsVarargs(value: (ColumnDescription[Any, Any])*): Self = StObject.set(x, "columns", js.Array(value*))
      
      inline def setData(value: js.Array[Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataVarargs(value: Any*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setKeyField(value: Any): Self = StObject.set(x, "keyField", value.asInstanceOf[js.Any])
    }
  }
  
  trait Columns extends StObject {
    
    var columns: js.Array[ColumnDescription[Any, Any]]
    
    def onColumnToggle(dataField: String): Unit
    
    /**
      * array of toggled columns
      */
    var toggles: js.Array[Boolean]
  }
  object Columns {
    
    inline def apply(
      columns: js.Array[ColumnDescription[Any, Any]],
      onColumnToggle: String => Callback,
      toggles: js.Array[Boolean]
    ): Columns = {
      val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], onColumnToggle = js.Any.fromFunction1((t0: String) => onColumnToggle(t0).runNow()), toggles = toggles.asInstanceOf[js.Any])
      __obj.asInstanceOf[Columns]
    }
    
    extension [Self <: Columns](x: Self) {
      
      inline def setColumns(value: js.Array[ColumnDescription[Any, Any]]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      inline def setColumnsVarargs(value: (ColumnDescription[Any, Any])*): Self = StObject.set(x, "columns", js.Array(value*))
      
      inline def setOnColumnToggle(value: String => Callback): Self = StObject.set(x, "onColumnToggle", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setToggles(value: js.Array[Boolean]): Self = StObject.set(x, "toggles", value.asInstanceOf[js.Any])
      
      inline def setTogglesVarargs(value: Boolean*): Self = StObject.set(x, "toggles", js.Array(value*))
    }
  }
  
  trait OnExport extends StObject {
    
    def onExport(): Unit
  }
  object OnExport {
    
    inline def apply(onExport: Callback): OnExport = {
      val __obj = js.Dynamic.literal(onExport = onExport.toJsFn)
      __obj.asInstanceOf[OnExport]
    }
    
    extension [Self <: OnExport](x: Self) {
      
      inline def setOnExport(value: Callback): Self = StObject.set(x, "onExport", value.toJsFn)
    }
  }
}
