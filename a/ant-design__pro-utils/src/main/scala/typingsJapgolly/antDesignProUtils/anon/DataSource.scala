package typingsJapgolly.antDesignProUtils.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.rcTable.libInterfaceMod.GetRowKey
import typingsJapgolly.rcTable.libInterfaceMod.Key
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataSource[RecordType] extends StObject {
  
  var childrenColumnName: js.UndefOr[String] = js.undefined
  
  var dataSource: js.Array[RecordType]
  
  var getRowKey: GetRowKey[RecordType]
  
  var onValuesChange: js.UndefOr[
    js.Function2[/* record */ RecordType, /* dataSource */ js.Array[RecordType], Unit]
  ] = js.undefined
  
  def setDataSource(dataSource: js.Array[RecordType]): Unit
}
object DataSource {
  
  inline def apply[RecordType](
    dataSource: js.Array[RecordType],
    getRowKey: (RecordType, /* index */ js.UndefOr[Double]) => Key,
    setDataSource: js.Array[RecordType] => Callback
  ): DataSource[RecordType] = {
    val __obj = js.Dynamic.literal(dataSource = dataSource.asInstanceOf[js.Any], getRowKey = js.Any.fromFunction2(getRowKey), setDataSource = js.Any.fromFunction1((t0: js.Array[RecordType]) => setDataSource(t0).runNow()))
    __obj.asInstanceOf[DataSource[RecordType]]
  }
  
  extension [Self <: DataSource[?], RecordType](x: Self & DataSource[RecordType]) {
    
    inline def setChildrenColumnName(value: String): Self = StObject.set(x, "childrenColumnName", value.asInstanceOf[js.Any])
    
    inline def setChildrenColumnNameUndefined: Self = StObject.set(x, "childrenColumnName", js.undefined)
    
    inline def setDataSource(value: js.Array[RecordType]): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    inline def setDataSourceVarargs(value: RecordType*): Self = StObject.set(x, "dataSource", js.Array(value*))
    
    inline def setGetRowKey(value: (RecordType, /* index */ js.UndefOr[Double]) => Key): Self = StObject.set(x, "getRowKey", js.Any.fromFunction2(value))
    
    inline def setOnValuesChange(value: (/* record */ RecordType, /* dataSource */ js.Array[RecordType]) => Callback): Self = StObject.set(x, "onValuesChange", js.Any.fromFunction2((t0: /* record */ RecordType, t1: /* dataSource */ js.Array[RecordType]) => (value(t0, t1)).runNow()))
    
    inline def setOnValuesChangeUndefined: Self = StObject.set(x, "onValuesChange", js.undefined)
    
    inline def setSetDataSource(value: js.Array[RecordType] => Callback): Self = StObject.set(x, "setDataSource", js.Any.fromFunction1((t0: js.Array[RecordType]) => value(t0).runNow()))
  }
}
