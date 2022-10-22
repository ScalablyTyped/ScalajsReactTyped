package typingsJapgolly.iobroker.mod.global.ioBroker

import typingsJapgolly.iobroker.iobrokerStrings.execute
import typingsJapgolly.iobroker.iobrokerStrings.http
import typingsJapgolly.iobroker.iobrokerStrings.other
import typingsJapgolly.iobroker.iobrokerStrings.sendto
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OtherPermission
  extends StObject
     with Permission {
  
  @JSName("operation")
  var operation_OtherPermission: execute | http | sendto
  
  @JSName("type")
  var type_OtherPermission: other
}
object OtherPermission {
  
  inline def apply(operation: execute | http | sendto): OtherPermission = {
    val __obj = js.Dynamic.literal(operation = operation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("other")
    __obj.asInstanceOf[OtherPermission]
  }
  
  extension [Self <: OtherPermission](x: Self) {
    
    inline def setOperation(value: execute | http | sendto): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
    
    inline def setType(value: other): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
