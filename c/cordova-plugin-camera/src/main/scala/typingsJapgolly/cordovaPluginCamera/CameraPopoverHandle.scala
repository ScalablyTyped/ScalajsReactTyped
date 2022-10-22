package typingsJapgolly.cordovaPluginCamera

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A handle to the popover dialog created by navigator.camera.getPicture. Used on iOS only.
  */
trait CameraPopoverHandle extends StObject {
  
  /**
    * Set the position of the popover.
    * @param popoverOptions the CameraPopoverOptions that specify the new position.
    */
  def setPosition(popoverOptions: CameraPopoverOptions): Unit
}
object CameraPopoverHandle {
  
  inline def apply(setPosition: CameraPopoverOptions => Callback): CameraPopoverHandle = {
    val __obj = js.Dynamic.literal(setPosition = js.Any.fromFunction1((t0: CameraPopoverOptions) => setPosition(t0).runNow()))
    __obj.asInstanceOf[CameraPopoverHandle]
  }
  
  extension [Self <: CameraPopoverHandle](x: Self) {
    
    inline def setSetPosition(value: CameraPopoverOptions => Callback): Self = StObject.set(x, "setPosition", js.Any.fromFunction1((t0: CameraPopoverOptions) => value(t0).runNow()))
  }
}
