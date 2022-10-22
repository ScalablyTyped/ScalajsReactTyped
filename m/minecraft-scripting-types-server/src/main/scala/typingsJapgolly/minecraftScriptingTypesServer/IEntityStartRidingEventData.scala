package typingsJapgolly.minecraftScriptingTypesServer

import typingsJapgolly.minecraftScriptingTypesShared.IEntity
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This event is triggered whenever an entity becomes a rider on another entity.
  */
trait IEntityStartRidingEventData extends StObject {
  
  /**
    * The rider
    */
  var entity: IEntity
  
  /**
    * The entity being ridden
    */
  var ride: IEntity
}
object IEntityStartRidingEventData {
  
  inline def apply(entity: IEntity, ride: IEntity): IEntityStartRidingEventData = {
    val __obj = js.Dynamic.literal(entity = entity.asInstanceOf[js.Any], ride = ride.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEntityStartRidingEventData]
  }
  
  extension [Self <: IEntityStartRidingEventData](x: Self) {
    
    inline def setEntity(value: IEntity): Self = StObject.set(x, "entity", value.asInstanceOf[js.Any])
    
    inline def setRide(value: IEntity): Self = StObject.set(x, "ride", value.asInstanceOf[js.Any])
  }
}
