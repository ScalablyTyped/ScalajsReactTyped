package typingsJapgolly.iobroker.mod.global.ioBroker

import typingsJapgolly.iobroker.iobrokerStrings.`object`
import typingsJapgolly.iobroker.iobrokerStrings.create
import typingsJapgolly.iobroker.iobrokerStrings.delete
import typingsJapgolly.iobroker.iobrokerStrings.file
import typingsJapgolly.iobroker.iobrokerStrings.list
import typingsJapgolly.iobroker.iobrokerStrings.read
import typingsJapgolly.iobroker.iobrokerStrings.state
import typingsJapgolly.iobroker.iobrokerStrings.users
import typingsJapgolly.iobroker.iobrokerStrings.write
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObjectOrStatePermission
  extends StObject
     with Permission {
  
  @JSName("operation")
  var operation_ObjectOrStatePermission: list | read | write | create | delete
  
  @JSName("type")
  var type_ObjectOrStatePermission: `object` | file | users | state
}
object ObjectOrStatePermission {
  
  inline def apply(operation: list | read | write | create | delete, `type`: `object` | file | users | state): ObjectOrStatePermission = {
    val __obj = js.Dynamic.literal(operation = operation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectOrStatePermission]
  }
  
  extension [Self <: ObjectOrStatePermission](x: Self) {
    
    inline def setOperation(value: list | read | write | create | delete): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
    
    inline def setType(value: `object` | file | users | state): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
