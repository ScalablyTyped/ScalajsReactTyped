package typingsJapgolly.activexLibreoffice.com_.sun.star.datatransfer.dnd

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XComponent
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XInitialization
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This service connects the Java-like UNO Drag and Drop protocol to the X Drag and Drop protocol used on X-Servers to transfer data between application
  * via Drag and Drop operations.
  * @see XDragSource
  * @see XDropTarget
  */
trait X11DropTarget
  extends StObject
     with XDropTarget
     with XInitialization
     with XComponent
object X11DropTarget {
  
  inline def apply(
    DefaultActions: Double,
    acquire: Callback,
    addDropTargetListener: XDropTargetListener => Callback,
    addEventListener: XEventListener => Callback,
    dispose: Callback,
    getDefaultActions: CallbackTo[Double],
    initialize: SeqEquiv[Any] => Callback,
    isActive: CallbackTo[Boolean],
    queryInterface: `type` => Any,
    release: Callback,
    removeDropTargetListener: XDropTargetListener => Callback,
    removeEventListener: XEventListener => Callback,
    setActive: Boolean => Callback,
    setDefaultActions: Double => Callback
  ): X11DropTarget = {
    val __obj = js.Dynamic.literal(DefaultActions = DefaultActions.asInstanceOf[js.Any], acquire = acquire.toJsFn, addDropTargetListener = js.Any.fromFunction1((t0: XDropTargetListener) => addDropTargetListener(t0).runNow()), addEventListener = js.Any.fromFunction1((t0: XEventListener) => addEventListener(t0).runNow()), dispose = dispose.toJsFn, getDefaultActions = getDefaultActions.toJsFn, initialize = js.Any.fromFunction1((t0: SeqEquiv[Any]) => initialize(t0).runNow()), isActive = isActive.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeDropTargetListener = js.Any.fromFunction1((t0: XDropTargetListener) => removeDropTargetListener(t0).runNow()), removeEventListener = js.Any.fromFunction1((t0: XEventListener) => removeEventListener(t0).runNow()), setActive = js.Any.fromFunction1((t0: Boolean) => setActive(t0).runNow()), setDefaultActions = js.Any.fromFunction1((t0: Double) => setDefaultActions(t0).runNow()))
    __obj.asInstanceOf[X11DropTarget]
  }
}
