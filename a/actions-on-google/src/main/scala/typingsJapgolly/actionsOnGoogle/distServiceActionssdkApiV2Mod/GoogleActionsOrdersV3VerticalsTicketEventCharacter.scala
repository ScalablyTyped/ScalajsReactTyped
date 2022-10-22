package typingsJapgolly.actionsOnGoogle.distServiceActionssdkApiV2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleActionsOrdersV3VerticalsTicketEventCharacter extends StObject {
  
  /**
    * Character's images.
    */
  var image: js.UndefOr[GoogleActionsV2UiElementsImage] = js.undefined
  
  /**
    * Name of the character.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Type of the event character, e.g. actor or director.
    */
  var `type`: js.UndefOr[GoogleActionsOrdersV3VerticalsTicketEventCharacterType] = js.undefined
}
object GoogleActionsOrdersV3VerticalsTicketEventCharacter {
  
  inline def apply(): GoogleActionsOrdersV3VerticalsTicketEventCharacter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsOrdersV3VerticalsTicketEventCharacter]
  }
  
  extension [Self <: GoogleActionsOrdersV3VerticalsTicketEventCharacter](x: Self) {
    
    inline def setImage(value: GoogleActionsV2UiElementsImage): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setType(value: GoogleActionsOrdersV3VerticalsTicketEventCharacterType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
