package typingsJapgolly.activexLibreoffice.com_.sun.star.accessibility

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XComponent
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The interface must be implemented for a server that can support MSAA com objects and send win32 accessible events */
trait XMSAAService
  extends StObject
     with XComponent {
  
  /**
    * Return com object pointer.
    * @returns A reference to the object that contains the actual accessibility information.
    * @see AccessibleContext
    */
  def getAccObjectPtr(hWnd: Double, lParam: Double, wParam: Double): Double
  
  def handleWindowOpened(i: Double): Unit
}
object XMSAAService {
  
  inline def apply(
    acquire: Callback,
    addEventListener: XEventListener => Callback,
    dispose: Callback,
    getAccObjectPtr: (Double, Double, Double) => Double,
    handleWindowOpened: Double => Callback,
    queryInterface: `type` => Any,
    release: Callback,
    removeEventListener: XEventListener => Callback
  ): XMSAAService = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, addEventListener = js.Any.fromFunction1((t0: XEventListener) => addEventListener(t0).runNow()), dispose = dispose.toJsFn, getAccObjectPtr = js.Any.fromFunction3(getAccObjectPtr), handleWindowOpened = js.Any.fromFunction1((t0: Double) => handleWindowOpened(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeEventListener = js.Any.fromFunction1((t0: XEventListener) => removeEventListener(t0).runNow()))
    __obj.asInstanceOf[XMSAAService]
  }
  
  extension [Self <: XMSAAService](x: Self) {
    
    inline def setGetAccObjectPtr(value: (Double, Double, Double) => Double): Self = StObject.set(x, "getAccObjectPtr", js.Any.fromFunction3(value))
    
    inline def setHandleWindowOpened(value: Double => Callback): Self = StObject.set(x, "handleWindowOpened", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
  }
}
