package typingsJapgolly.kendoUi.kendo.data

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataSourceEvent extends StObject {
  
  var sender: js.UndefOr[DataSource] = js.undefined
}
object DataSourceEvent {
  
  inline def apply(): DataSourceEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSourceEvent]
  }
  
  extension [Self <: DataSourceEvent](x: Self) {
    
    inline def setSender(value: DataSource): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
    
    inline def setSenderUndefined: Self = StObject.set(x, "sender", js.undefined)
  }
}
