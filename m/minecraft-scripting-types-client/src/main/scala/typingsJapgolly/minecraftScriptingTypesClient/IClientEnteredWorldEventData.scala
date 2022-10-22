package typingsJapgolly.minecraftScriptingTypesClient

import typingsJapgolly.minecraftScriptingTypesShared.IEntity
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This event is fired whenever a player joins the world. The event data contains the player entity object.
  */
trait IClientEnteredWorldEventData extends StObject {
  
  /**
    * the player entering the world
    */
  var player: IEntity
}
object IClientEnteredWorldEventData {
  
  inline def apply(player: IEntity): IClientEnteredWorldEventData = {
    val __obj = js.Dynamic.literal(player = player.asInstanceOf[js.Any])
    __obj.asInstanceOf[IClientEnteredWorldEventData]
  }
  
  extension [Self <: IClientEnteredWorldEventData](x: Self) {
    
    inline def setPlayer(value: IEntity): Self = StObject.set(x, "player", value.asInstanceOf[js.Any])
  }
}
