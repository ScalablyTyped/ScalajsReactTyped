package typingsJapgolly.activexLibreoffice.com_.sun.star.awt

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * represents a VCL container window.
  * @deprecated Deprecated
  */
trait XVclContainer
  extends StObject
     with XInterface {
  
  /** returns all windows. */
  val Windows: SafeArray[XWindow]
  
  /** adds the specified container listener to receive container events from this container. */
  def addVclContainerListener(l: XVclContainerListener): Unit
  
  /** returns all windows. */
  def getWindows(): SafeArray[XWindow]
  
  /** removes the specified container listener so that it no longer receives container events from this container. */
  def removeVclContainerListener(l: XVclContainerListener): Unit
}
object XVclContainer {
  
  inline def apply(
    Windows: SafeArray[XWindow],
    acquire: Callback,
    addVclContainerListener: XVclContainerListener => Callback,
    getWindows: CallbackTo[SafeArray[XWindow]],
    queryInterface: `type` => Any,
    release: Callback,
    removeVclContainerListener: XVclContainerListener => Callback
  ): XVclContainer = {
    val __obj = js.Dynamic.literal(Windows = Windows.asInstanceOf[js.Any], acquire = acquire.toJsFn, addVclContainerListener = js.Any.fromFunction1((t0: XVclContainerListener) => addVclContainerListener(t0).runNow()), getWindows = getWindows.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeVclContainerListener = js.Any.fromFunction1((t0: XVclContainerListener) => removeVclContainerListener(t0).runNow()))
    __obj.asInstanceOf[XVclContainer]
  }
  
  extension [Self <: XVclContainer](x: Self) {
    
    inline def setAddVclContainerListener(value: XVclContainerListener => Callback): Self = StObject.set(x, "addVclContainerListener", js.Any.fromFunction1((t0: XVclContainerListener) => value(t0).runNow()))
    
    inline def setGetWindows(value: CallbackTo[SafeArray[XWindow]]): Self = StObject.set(x, "getWindows", value.toJsFn)
    
    inline def setRemoveVclContainerListener(value: XVclContainerListener => Callback): Self = StObject.set(x, "removeVclContainerListener", js.Any.fromFunction1((t0: XVclContainerListener) => value(t0).runNow()))
    
    inline def setWindows(value: SafeArray[XWindow]): Self = StObject.set(x, "Windows", value.asInstanceOf[js.Any])
  }
}
