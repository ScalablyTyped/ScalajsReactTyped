package typingsJapgolly.activexLibreoffice.com_.sun.star.frame

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.XWindow
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XInitialization
import typingsJapgolly.activexLibreoffice.com_.sun.star.util.XUpdatable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * is an abstract service for a component which offers a more complex user interface to users within a toolbar.
  *
  * A generic toolbar function is represented as a button which has a state (enabled,disabled and selected, not selected). A toolbar controller can be
  * added to a toolbar and provide information or functions within a more sophisticated user interface. ;  A typical example for toolbar controller is the
  * font chooser within the toolbar. It provides all available fonts in a dropdown box and shows the current chosen font.
  * @see com.sun.star.frame.XDispatchProvider
  * @since OOo 2.0
  */
trait ToolbarController
  extends StObject
     with XStatusListener
     with XInitialization
     with XUpdatable
     with XToolbarController
     with XSubToolbarController
object ToolbarController {
  
  inline def apply(
    SubToolbarName: String,
    acquire: Callback,
    click: Callback,
    createItemWindow: XWindow => XWindow,
    createPopupWindow: CallbackTo[XWindow],
    disposing: EventObject => Callback,
    doubleClick: Callback,
    execute: Double => Callback,
    functionSelected: String => Callback,
    getSubToolbarName: CallbackTo[String],
    initialize: SeqEquiv[Any] => Callback,
    opensSubToolbar: CallbackTo[Boolean],
    queryInterface: `type` => Any,
    release: Callback,
    statusChanged: FeatureStateEvent => Callback,
    update: Callback,
    updateImage: Callback
  ): ToolbarController = {
    val __obj = js.Dynamic.literal(SubToolbarName = SubToolbarName.asInstanceOf[js.Any], acquire = acquire.toJsFn, click = click.toJsFn, createItemWindow = js.Any.fromFunction1(createItemWindow), createPopupWindow = createPopupWindow.toJsFn, disposing = js.Any.fromFunction1((t0: EventObject) => disposing(t0).runNow()), doubleClick = doubleClick.toJsFn, execute = js.Any.fromFunction1((t0: Double) => execute(t0).runNow()), functionSelected = js.Any.fromFunction1((t0: String) => functionSelected(t0).runNow()), getSubToolbarName = getSubToolbarName.toJsFn, initialize = js.Any.fromFunction1((t0: SeqEquiv[Any]) => initialize(t0).runNow()), opensSubToolbar = opensSubToolbar.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, statusChanged = js.Any.fromFunction1((t0: FeatureStateEvent) => statusChanged(t0).runNow()), update = update.toJsFn, updateImage = updateImage.toJsFn)
    __obj.asInstanceOf[ToolbarController]
  }
}
