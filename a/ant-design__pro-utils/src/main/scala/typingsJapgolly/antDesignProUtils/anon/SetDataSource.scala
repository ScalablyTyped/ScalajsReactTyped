package typingsJapgolly.antDesignProUtils.anon

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetDataSource[RecordType] extends StObject {
  
  var childrenColumnName: js.UndefOr[String] = js.undefined
  
  var dataSource: RecordType
  
  def setDataSource(dataSource: RecordType): Unit
}
object SetDataSource {
  
  inline def apply[RecordType](dataSource: RecordType, setDataSource: RecordType => Callback): SetDataSource[RecordType] = {
    val __obj = js.Dynamic.literal(dataSource = dataSource.asInstanceOf[js.Any], setDataSource = js.Any.fromFunction1((t0: RecordType) => setDataSource(t0).runNow()))
    __obj.asInstanceOf[SetDataSource[RecordType]]
  }
  
  extension [Self <: SetDataSource[?], RecordType](x: Self & SetDataSource[RecordType]) {
    
    inline def setChildrenColumnName(value: String): Self = StObject.set(x, "childrenColumnName", value.asInstanceOf[js.Any])
    
    inline def setChildrenColumnNameUndefined: Self = StObject.set(x, "childrenColumnName", js.undefined)
    
    inline def setDataSource(value: RecordType): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    inline def setSetDataSource(value: RecordType => Callback): Self = StObject.set(x, "setDataSource", js.Any.fromFunction1((t0: RecordType) => value(t0).runNow()))
  }
}
