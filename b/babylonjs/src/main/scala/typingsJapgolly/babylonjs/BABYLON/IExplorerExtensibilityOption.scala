package typingsJapgolly.babylonjs.BABYLON

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IExplorerExtensibilityOption extends StObject {
  
  /**
    * Defines the action to execute on click
    */
  def action(entity: Any): Unit
  
  /**
    * Define the option label
    */
  var label: String
}
object IExplorerExtensibilityOption {
  
  inline def apply(action: Any => Callback, label: String): IExplorerExtensibilityOption = {
    val __obj = js.Dynamic.literal(action = js.Any.fromFunction1((t0: Any) => action(t0).runNow()), label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[IExplorerExtensibilityOption]
  }
  
  extension [Self <: IExplorerExtensibilityOption](x: Self) {
    
    inline def setAction(value: Any => Callback): Self = StObject.set(x, "action", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
