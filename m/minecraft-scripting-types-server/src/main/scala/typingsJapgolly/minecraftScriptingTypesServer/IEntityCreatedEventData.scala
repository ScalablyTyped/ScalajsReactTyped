package typingsJapgolly.minecraftScriptingTypesServer

import typingsJapgolly.minecraftScriptingTypesShared.IEntity
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This event is triggered whenever an entity is added to the world.
  */
trait IEntityCreatedEventData extends StObject {
  
  /**
    * The entity that was just created
    */
  var entity: IEntity
}
object IEntityCreatedEventData {
  
  inline def apply(entity: IEntity): IEntityCreatedEventData = {
    val __obj = js.Dynamic.literal(entity = entity.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEntityCreatedEventData]
  }
  
  extension [Self <: IEntityCreatedEventData](x: Self) {
    
    inline def setEntity(value: IEntity): Self = StObject.set(x, "entity", value.asInstanceOf[js.Any])
  }
}
