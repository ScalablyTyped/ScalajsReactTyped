package typingsJapgolly.activexLibreoffice.com_.sun.star.script

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XEventAttacher2
  extends StObject
     with XEventAttacher {
  
  /**
    * Register a multiple set of listeners listening for the same target. Besides passing multiple listeners, the behavior of this method is identical to
    * that of {@link attachSingleEventListener()} .
    * @see com.sun.star.script.XEventAttacher.attachSingleEventListener
    */
  def attachMultipleEventListeners(xTarget: XInterface, aListeners: SeqEquiv[EventListener]): SafeArray[XEventListener]
}
object XEventAttacher2 {
  
  inline def apply(
    acquire: Callback,
    attachListener: (XInterface, XAllListener, Any, String, String) => XEventListener,
    attachMultipleEventListeners: (XInterface, SeqEquiv[EventListener]) => SafeArray[XEventListener],
    attachSingleEventListener: (XInterface, XAllListener, Any, String, String, String) => XEventListener,
    queryInterface: `type` => Any,
    release: Callback,
    removeListener: (XInterface, String, String, XEventListener) => Callback
  ): XEventAttacher2 = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, attachListener = js.Any.fromFunction5(attachListener), attachMultipleEventListeners = js.Any.fromFunction2(attachMultipleEventListeners), attachSingleEventListener = js.Any.fromFunction6(attachSingleEventListener), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeListener = js.Any.fromFunction4((t0: XInterface, t1: String, t2: String, t3: XEventListener) => (removeListener(t0, t1, t2, t3)).runNow()))
    __obj.asInstanceOf[XEventAttacher2]
  }
  
  extension [Self <: XEventAttacher2](x: Self) {
    
    inline def setAttachMultipleEventListeners(value: (XInterface, SeqEquiv[EventListener]) => SafeArray[XEventListener]): Self = StObject.set(x, "attachMultipleEventListeners", js.Any.fromFunction2(value))
  }
}
