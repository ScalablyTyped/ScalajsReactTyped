package typingsJapgolly.activexLibreoffice.com_.sun.star.drawing

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.KeyEvent
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.MouseEvent
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.XKeyHandler
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.XMouseClickHandler
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.XMouseMotionHandler
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typingsJapgolly.activexLibreoffice.com_.sun.star.frame.XDispatch
import typingsJapgolly.activexLibreoffice.com_.sun.star.frame.XStatusListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XComponent
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XServiceInfo
import typingsJapgolly.activexLibreoffice.com_.sun.star.util.URL
import typingsJapgolly.activexLibreoffice.com_.sun.star.view.XSelectionChangeListener
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XSelectionFunction
  extends StObject
     with XComponent
     with XServiceInfo
     with XDispatch
     with XKeyHandler
     with XMouseClickHandler
     with XMouseMotionHandler
     with XSelectionChangeListener
object XSelectionFunction {
  
  inline def apply(
    ImplementationName: String,
    SupportedServiceNames: SafeArray[String],
    acquire: Callback,
    addEventListener: XEventListener => Callback,
    addStatusListener: (XStatusListener, URL) => Callback,
    dispatch: (URL, SeqEquiv[PropertyValue]) => Callback,
    dispose: Callback,
    disposing: EventObject => Callback,
    getImplementationName: CallbackTo[String],
    getSupportedServiceNames: CallbackTo[SafeArray[String]],
    keyPressed: KeyEvent => Boolean,
    keyReleased: KeyEvent => Boolean,
    mouseDragged: MouseEvent => Boolean,
    mouseMoved: MouseEvent => Boolean,
    mousePressed: MouseEvent => Boolean,
    mouseReleased: MouseEvent => Boolean,
    queryInterface: `type` => Any,
    release: Callback,
    removeEventListener: XEventListener => Callback,
    removeStatusListener: (XStatusListener, URL) => Callback,
    selectionChanged: EventObject => Callback,
    supportsService: String => Boolean
  ): XSelectionFunction = {
    val __obj = js.Dynamic.literal(ImplementationName = ImplementationName.asInstanceOf[js.Any], SupportedServiceNames = SupportedServiceNames.asInstanceOf[js.Any], acquire = acquire.toJsFn, addEventListener = js.Any.fromFunction1((t0: XEventListener) => addEventListener(t0).runNow()), addStatusListener = js.Any.fromFunction2((t0: XStatusListener, t1: URL) => (addStatusListener(t0, t1)).runNow()), dispatch = js.Any.fromFunction2((t0: URL, t1: SeqEquiv[PropertyValue]) => (dispatch(t0, t1)).runNow()), dispose = dispose.toJsFn, disposing = js.Any.fromFunction1((t0: EventObject) => disposing(t0).runNow()), getImplementationName = getImplementationName.toJsFn, getSupportedServiceNames = getSupportedServiceNames.toJsFn, keyPressed = js.Any.fromFunction1(keyPressed), keyReleased = js.Any.fromFunction1(keyReleased), mouseDragged = js.Any.fromFunction1(mouseDragged), mouseMoved = js.Any.fromFunction1(mouseMoved), mousePressed = js.Any.fromFunction1(mousePressed), mouseReleased = js.Any.fromFunction1(mouseReleased), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeEventListener = js.Any.fromFunction1((t0: XEventListener) => removeEventListener(t0).runNow()), removeStatusListener = js.Any.fromFunction2((t0: XStatusListener, t1: URL) => (removeStatusListener(t0, t1)).runNow()), selectionChanged = js.Any.fromFunction1((t0: EventObject) => selectionChanged(t0).runNow()), supportsService = js.Any.fromFunction1(supportsService))
    __obj.asInstanceOf[XSelectionFunction]
  }
}
