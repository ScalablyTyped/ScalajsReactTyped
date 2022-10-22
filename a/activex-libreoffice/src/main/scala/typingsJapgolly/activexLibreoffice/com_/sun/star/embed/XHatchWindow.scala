package typingsJapgolly.activexLibreoffice.com_.sun.star.embed

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.Size
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XComponent
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * specifies the operations for a hatch window.
  *
  * A hatch window is a kind of window that is adopted to contain an embedded object window to represent the contained window border and to handle
  * resizing/moving in a specific way: after user have selected the new size/placement the hatching window sends request to owner for resizing/moving.
  * Thus the window can not resize/move itself.
  */
trait XHatchWindow
  extends StObject
     with XComponent {
  
  var HatchBorderSize: Size
  
  /** sets the object that will control resizing/moving, if the object is not set the window can not be resized/moved. */
  def setController(xController: XHatchWindowController): Unit
}
object XHatchWindow {
  
  inline def apply(
    HatchBorderSize: Size,
    acquire: Callback,
    addEventListener: XEventListener => Callback,
    dispose: Callback,
    queryInterface: `type` => Any,
    release: Callback,
    removeEventListener: XEventListener => Callback,
    setController: XHatchWindowController => Callback
  ): XHatchWindow = {
    val __obj = js.Dynamic.literal(HatchBorderSize = HatchBorderSize.asInstanceOf[js.Any], acquire = acquire.toJsFn, addEventListener = js.Any.fromFunction1((t0: XEventListener) => addEventListener(t0).runNow()), dispose = dispose.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeEventListener = js.Any.fromFunction1((t0: XEventListener) => removeEventListener(t0).runNow()), setController = js.Any.fromFunction1((t0: XHatchWindowController) => setController(t0).runNow()))
    __obj.asInstanceOf[XHatchWindow]
  }
  
  extension [Self <: XHatchWindow](x: Self) {
    
    inline def setHatchBorderSize(value: Size): Self = StObject.set(x, "HatchBorderSize", value.asInstanceOf[js.Any])
    
    inline def setSetController(value: XHatchWindowController => Callback): Self = StObject.set(x, "setController", js.Any.fromFunction1((t0: XHatchWindowController) => value(t0).runNow()))
  }
}
