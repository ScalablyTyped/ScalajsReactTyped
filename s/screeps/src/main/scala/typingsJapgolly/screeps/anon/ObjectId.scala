package typingsJapgolly.screeps.anon

import typingsJapgolly.screeps.EVENT_ATTACK_CONTROLLER
import typingsJapgolly.screeps.EventItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObjectId
  extends StObject
     with EventItem {
  
  var data: /* import warning: importer.ImportType#apply Failed type conversion: screeps.EventData[screeps.EVENT_ATTACK_CONTROLLER] */ js.Any
  
  var event: EVENT_ATTACK_CONTROLLER
  
  var objectId: String
}
object ObjectId {
  
  inline def apply(
    data: /* import warning: importer.ImportType#apply Failed type conversion: screeps.EventData[screeps.EVENT_ATTACK_CONTROLLER] */ js.Any,
    event: EVENT_ATTACK_CONTROLLER,
    objectId: String
  ): ObjectId = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], objectId = objectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectId]
  }
  
  extension [Self <: ObjectId](x: Self) {
    
    inline def setData(
      value: /* import warning: importer.ImportType#apply Failed type conversion: screeps.EventData[screeps.EVENT_ATTACK_CONTROLLER] */ js.Any
    ): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setEvent(value: EVENT_ATTACK_CONTROLLER): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
  }
}
