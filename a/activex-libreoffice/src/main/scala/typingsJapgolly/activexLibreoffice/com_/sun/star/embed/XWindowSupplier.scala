package typingsJapgolly.activexLibreoffice.com_.sun.star.embed

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.XWindow
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** provides access to a VCL window implementation. */
trait XWindowSupplier
  extends StObject
     with XInterface {
  
  /**
    * allows to get access to a VCL window implementation.
    * @returns VCL window implementation
    */
  val Window: XWindow
  
  /**
    * allows to get access to a VCL window implementation.
    * @returns VCL window implementation
    */
  def getWindow(): XWindow
}
object XWindowSupplier {
  
  inline def apply(
    Window: XWindow,
    acquire: Callback,
    getWindow: CallbackTo[XWindow],
    queryInterface: `type` => Any,
    release: Callback
  ): XWindowSupplier = {
    val __obj = js.Dynamic.literal(Window = Window.asInstanceOf[js.Any], acquire = acquire.toJsFn, getWindow = getWindow.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XWindowSupplier]
  }
  
  extension [Self <: XWindowSupplier](x: Self) {
    
    inline def setGetWindow(value: CallbackTo[XWindow]): Self = StObject.set(x, "getWindow", value.toJsFn)
    
    inline def setWindow(value: XWindow): Self = StObject.set(x, "Window", value.asInstanceOf[js.Any])
  }
}
