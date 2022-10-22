package typingsJapgolly.sharepoint.SP.UI

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.HTMLElement
import typingsJapgolly.std.HTMLFrameElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a modal dialog */
trait ModalDialog
  extends StObject
     with Dialog {
  
  /** Closes the dialog using the specified dialog result. */
  def close(dialogResult: DialogResult): Unit
}
object ModalDialog {
  
  inline def apply(
    autoSize: Callback,
    autoSizeSuppressScrollbar: Any => Callback,
    close: DialogResult => Callback,
    get_allowMaximize: CallbackTo[Boolean],
    get_args: CallbackTo[Any],
    get_closed: CallbackTo[Boolean],
    get_dialogElement: CallbackTo[HTMLElement],
    get_firstTabStop: CallbackTo[HTMLElement],
    get_frameElement: CallbackTo[HTMLFrameElement],
    get_html: CallbackTo[String],
    get_isMaximized: CallbackTo[Boolean],
    get_lastTabStop: CallbackTo[HTMLElement],
    get_returnValue: CallbackTo[Any],
    get_showClose: CallbackTo[Boolean],
    get_title: CallbackTo[String],
    get_url: CallbackTo[String],
    set_returnValue: Any => Callback
  ): ModalDialog = {
    val __obj = js.Dynamic.literal(autoSize = autoSize.toJsFn, autoSizeSuppressScrollbar = js.Any.fromFunction1((t0: Any) => autoSizeSuppressScrollbar(t0).runNow()), close = js.Any.fromFunction1((t0: DialogResult) => close(t0).runNow()), get_allowMaximize = get_allowMaximize.toJsFn, get_args = get_args.toJsFn, get_closed = get_closed.toJsFn, get_dialogElement = get_dialogElement.toJsFn, get_firstTabStop = get_firstTabStop.toJsFn, get_frameElement = get_frameElement.toJsFn, get_html = get_html.toJsFn, get_isMaximized = get_isMaximized.toJsFn, get_lastTabStop = get_lastTabStop.toJsFn, get_returnValue = get_returnValue.toJsFn, get_showClose = get_showClose.toJsFn, get_title = get_title.toJsFn, get_url = get_url.toJsFn, set_returnValue = js.Any.fromFunction1((t0: Any) => set_returnValue(t0).runNow()))
    __obj.asInstanceOf[ModalDialog]
  }
  
  extension [Self <: ModalDialog](x: Self) {
    
    inline def setClose(value: DialogResult => Callback): Self = StObject.set(x, "close", js.Any.fromFunction1((t0: DialogResult) => value(t0).runNow()))
  }
}
