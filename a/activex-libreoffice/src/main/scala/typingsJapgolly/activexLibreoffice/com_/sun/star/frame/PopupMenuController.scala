package typingsJapgolly.activexLibreoffice.com_.sun.star.frame

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.XPopupMenu
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XComponent
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XInitialization
import typingsJapgolly.activexLibreoffice.com_.sun.star.util.URL
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides access to a pop-up menu controller.
  *
  * A pop-up menu controller is used to make special functions available to users, which depend on runtime or context specific conditions. ;  A typical
  * example for a pop-up menu controller can be a recent file list implementation which provides a list of latest files that a user has worked on. This
  * list gets changes consistently during a work session.
  * @since OOo 2.0
  */
trait PopupMenuController
  extends StObject
     with XPopupMenuController
     with XInitialization
     with XStatusListener
     with XDispatchProvider
     with XComponent
object PopupMenuController {
  
  inline def apply(
    acquire: Callback,
    addEventListener: XEventListener => Callback,
    dispose: Callback,
    disposing: EventObject => Callback,
    initialize: SeqEquiv[Any] => Callback,
    queryDispatch: (URL, String, Double) => XDispatch,
    queryDispatches: SeqEquiv[DispatchDescriptor] => SafeArray[XDispatch],
    queryInterface: `type` => Any,
    release: Callback,
    removeEventListener: XEventListener => Callback,
    setPopupMenu: XPopupMenu => Callback,
    statusChanged: FeatureStateEvent => Callback,
    updatePopupMenu: Callback
  ): PopupMenuController = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, addEventListener = js.Any.fromFunction1((t0: XEventListener) => addEventListener(t0).runNow()), dispose = dispose.toJsFn, disposing = js.Any.fromFunction1((t0: EventObject) => disposing(t0).runNow()), initialize = js.Any.fromFunction1((t0: SeqEquiv[Any]) => initialize(t0).runNow()), queryDispatch = js.Any.fromFunction3(queryDispatch), queryDispatches = js.Any.fromFunction1(queryDispatches), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeEventListener = js.Any.fromFunction1((t0: XEventListener) => removeEventListener(t0).runNow()), setPopupMenu = js.Any.fromFunction1((t0: XPopupMenu) => setPopupMenu(t0).runNow()), statusChanged = js.Any.fromFunction1((t0: FeatureStateEvent) => statusChanged(t0).runNow()), updatePopupMenu = updatePopupMenu.toJsFn)
    __obj.asInstanceOf[PopupMenuController]
  }
}
