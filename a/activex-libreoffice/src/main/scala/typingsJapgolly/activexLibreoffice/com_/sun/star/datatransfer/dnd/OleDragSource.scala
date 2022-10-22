package typingsJapgolly.activexLibreoffice.com_.sun.star.datatransfer.dnd

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.datatransfer.XTransferable
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XComponent
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XInitialization
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This service connects the Java-like UNO drag and drop protocol to the protocol used on window platforms. It realized the drag source.
  * @see XDragSource
  */
trait OleDragSource
  extends StObject
     with XDragSource
     with XInitialization
     with XComponent
object OleDragSource {
  
  inline def apply(
    acquire: Callback,
    addEventListener: XEventListener => Callback,
    dispose: Callback,
    getDefaultCursor: Double => Double,
    initialize: SeqEquiv[Any] => Callback,
    isDragImageSupported: CallbackTo[Boolean],
    queryInterface: `type` => Any,
    release: Callback,
    removeEventListener: XEventListener => Callback,
    startDrag: (DragGestureEvent, Double, Double, Double, XTransferable, XDragSourceListener) => Callback
  ): OleDragSource = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, addEventListener = js.Any.fromFunction1((t0: XEventListener) => addEventListener(t0).runNow()), dispose = dispose.toJsFn, getDefaultCursor = js.Any.fromFunction1(getDefaultCursor), initialize = js.Any.fromFunction1((t0: SeqEquiv[Any]) => initialize(t0).runNow()), isDragImageSupported = isDragImageSupported.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeEventListener = js.Any.fromFunction1((t0: XEventListener) => removeEventListener(t0).runNow()), startDrag = js.Any.fromFunction6((t0: DragGestureEvent, t1: Double, t2: Double, t3: Double, t4: XTransferable, t5: XDragSourceListener) => (startDrag(t0, t1, t2, t3, t4, t5)).runNow()))
    __obj.asInstanceOf[OleDragSource]
  }
}
