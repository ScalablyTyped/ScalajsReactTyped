package typingsJapgolly.interactjsTypes.anon

import typingsJapgolly.interactjsTypes.coreOptionsMod.OptionsArg
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InteractableOptions extends StObject {
  
  var interactable: InteractableAllowFrom
  
  var options: OptionsArg
}
object InteractableOptions {
  
  inline def apply(interactable: InteractableAllowFrom, options: OptionsArg): InteractableOptions = {
    val __obj = js.Dynamic.literal(interactable = interactable.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[InteractableOptions]
  }
  
  extension [Self <: InteractableOptions](x: Self) {
    
    inline def setInteractable(value: InteractableAllowFrom): Self = StObject.set(x, "interactable", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: OptionsArg): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
  }
}
