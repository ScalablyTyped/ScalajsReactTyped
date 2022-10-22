package typingsJapgolly.ahooks.anon

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataSource[TData /* <: typingsJapgolly.ahooks.libUseAntdTableTypesMod.Data */] extends StObject {
  
  var dataSource: /* import warning: importer.ImportType#apply Failed type conversion: TData['list'] */ js.Any
  
  var loading: Boolean
  
  def onFilter(filterParams: Any): Unit
  
  def onSort(dataIndex: String, order: String): Unit
}
object DataSource {
  
  inline def apply[TData /* <: typingsJapgolly.ahooks.libUseAntdTableTypesMod.Data */](
    dataSource: /* import warning: importer.ImportType#apply Failed type conversion: TData['list'] */ js.Any,
    loading: Boolean,
    onFilter: Any => Callback,
    onSort: (String, String) => Callback
  ): DataSource[TData] = {
    val __obj = js.Dynamic.literal(dataSource = dataSource.asInstanceOf[js.Any], loading = loading.asInstanceOf[js.Any], onFilter = js.Any.fromFunction1((t0: Any) => onFilter(t0).runNow()), onSort = js.Any.fromFunction2((t0: String, t1: String) => (onSort(t0, t1)).runNow()))
    __obj.asInstanceOf[DataSource[TData]]
  }
  
  extension [Self <: DataSource[?], TData /* <: typingsJapgolly.ahooks.libUseAntdTableTypesMod.Data */](x: Self & DataSource[TData]) {
    
    inline def setDataSource(
      value: /* import warning: importer.ImportType#apply Failed type conversion: TData['list'] */ js.Any
    ): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    inline def setLoading(value: Boolean): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
    
    inline def setOnFilter(value: Any => Callback): Self = StObject.set(x, "onFilter", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setOnSort(value: (String, String) => Callback): Self = StObject.set(x, "onSort", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
  }
}
