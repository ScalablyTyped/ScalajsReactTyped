package typingsJapgolly.babylonjs.BABYLON

import japgolly.scalajs.react.Callback
import org.scalajs.dom.HTMLElement
import typingsJapgolly.babylonjs.XRReferenceSpaceType
import typingsJapgolly.babylonjs.XRSessionMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebXREnterExitUIButton extends StObject {
  
  /** button element */
  var element: HTMLElement
  
  /** Reference space type */
  var referenceSpaceType: XRReferenceSpaceType
  
  /** XR initialization options for the button */
  var sessionMode: XRSessionMode
  
  /**
    * Extendable function which can be used to update the button's visuals when the state changes
    * @param activeButton the current active button in the UI
    */
  def update(activeButton: Nullable[WebXREnterExitUIButton]): Unit
}
object WebXREnterExitUIButton {
  
  inline def apply(
    element: HTMLElement,
    referenceSpaceType: XRReferenceSpaceType,
    sessionMode: XRSessionMode,
    update: Nullable[WebXREnterExitUIButton] => Callback
  ): WebXREnterExitUIButton = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], referenceSpaceType = referenceSpaceType.asInstanceOf[js.Any], sessionMode = sessionMode.asInstanceOf[js.Any], update = js.Any.fromFunction1((t0: Nullable[WebXREnterExitUIButton]) => update(t0).runNow()))
    __obj.asInstanceOf[WebXREnterExitUIButton]
  }
  
  extension [Self <: WebXREnterExitUIButton](x: Self) {
    
    inline def setElement(value: HTMLElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setReferenceSpaceType(value: XRReferenceSpaceType): Self = StObject.set(x, "referenceSpaceType", value.asInstanceOf[js.Any])
    
    inline def setSessionMode(value: XRSessionMode): Self = StObject.set(x, "sessionMode", value.asInstanceOf[js.Any])
    
    inline def setUpdate(value: Nullable[WebXREnterExitUIButton] => Callback): Self = StObject.set(x, "update", js.Any.fromFunction1((t0: Nullable[WebXREnterExitUIButton]) => value(t0).runNow()))
  }
}
