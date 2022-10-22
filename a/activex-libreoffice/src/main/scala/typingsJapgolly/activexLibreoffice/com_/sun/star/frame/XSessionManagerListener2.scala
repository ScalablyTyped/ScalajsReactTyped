package typingsJapgolly.activexLibreoffice.com_.sun.star.frame

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.EventObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XSessionManagerListener2
  extends StObject
     with XSessionManagerListener {
  
  /**
    * doQuit gets called when the session manager has decided the application should quit. Under these circumstances bringing up further UI will usually be
    * impossible and must be avoided.
    */
  def doQuit(): Unit
}
object XSessionManagerListener2 {
  
  inline def apply(
    acquire: Callback,
    approveInteraction: Boolean => Callback,
    disposing: EventObject => Callback,
    doQuit: Callback,
    doRestore: CallbackTo[Boolean],
    doSave: (Boolean, Boolean) => Callback,
    queryInterface: `type` => Any,
    release: Callback,
    shutdownCanceled: Callback
  ): XSessionManagerListener2 = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, approveInteraction = js.Any.fromFunction1((t0: Boolean) => approveInteraction(t0).runNow()), disposing = js.Any.fromFunction1((t0: EventObject) => disposing(t0).runNow()), doQuit = doQuit.toJsFn, doRestore = doRestore.toJsFn, doSave = js.Any.fromFunction2((t0: Boolean, t1: Boolean) => (doSave(t0, t1)).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, shutdownCanceled = shutdownCanceled.toJsFn)
    __obj.asInstanceOf[XSessionManagerListener2]
  }
  
  extension [Self <: XSessionManagerListener2](x: Self) {
    
    inline def setDoQuit(value: Callback): Self = StObject.set(x, "doQuit", value.toJsFn)
  }
}
