package typingsJapgolly.activexLibreoffice.com_.sun.star.frame

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.EventObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This was created from its sole place of use, so it might be incomplete.
  * @since LibreOffice 4.1
  */
trait SessionListener
  extends StObject
     with XSessionManagerListener2 {
  
  def createWithOnQuitFlag(AllowUserInteractionOnQuit: Boolean): Unit
}
object SessionListener {
  
  inline def apply(
    acquire: Callback,
    approveInteraction: Boolean => Callback,
    createWithOnQuitFlag: Boolean => Callback,
    disposing: EventObject => Callback,
    doQuit: Callback,
    doRestore: CallbackTo[Boolean],
    doSave: (Boolean, Boolean) => Callback,
    queryInterface: `type` => Any,
    release: Callback,
    shutdownCanceled: Callback
  ): SessionListener = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, approveInteraction = js.Any.fromFunction1((t0: Boolean) => approveInteraction(t0).runNow()), createWithOnQuitFlag = js.Any.fromFunction1((t0: Boolean) => createWithOnQuitFlag(t0).runNow()), disposing = js.Any.fromFunction1((t0: EventObject) => disposing(t0).runNow()), doQuit = doQuit.toJsFn, doRestore = doRestore.toJsFn, doSave = js.Any.fromFunction2((t0: Boolean, t1: Boolean) => (doSave(t0, t1)).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, shutdownCanceled = shutdownCanceled.toJsFn)
    __obj.asInstanceOf[SessionListener]
  }
  
  extension [Self <: SessionListener](x: Self) {
    
    inline def setCreateWithOnQuitFlag(value: Boolean => Callback): Self = StObject.set(x, "createWithOnQuitFlag", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
  }
}
