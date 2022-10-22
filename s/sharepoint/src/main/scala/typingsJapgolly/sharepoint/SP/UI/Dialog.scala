package typingsJapgolly.sharepoint.SP.UI

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.HTMLElement
import typingsJapgolly.std.HTMLFrameElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a dialog. Do not use this class directly from your code. */
trait Dialog extends StObject {
  
  def autoSize(): Unit
  
  def autoSizeSuppressScrollbar(resizePageCallBack: Any): Unit
  
  def get_allowMaximize(): Boolean
  
  def get_args(): Any
  
  def get_closed(): Boolean
  
  def get_dialogElement(): HTMLElement
  
  def get_firstTabStop(): HTMLElement
  
  def get_frameElement(): HTMLFrameElement
  
  def get_html(): String
  
  def get_isMaximized(): Boolean
  
  def get_lastTabStop(): HTMLElement
  
  def get_returnValue(): Any
  
  def get_showClose(): Boolean
  
  def get_title(): String
  
  def get_url(): String
  
  def set_returnValue(value: Any): Unit
}
object Dialog {
  
  inline def apply(
    autoSize: Callback,
    autoSizeSuppressScrollbar: Any => Callback,
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
  ): Dialog = {
    val __obj = js.Dynamic.literal(autoSize = autoSize.toJsFn, autoSizeSuppressScrollbar = js.Any.fromFunction1((t0: Any) => autoSizeSuppressScrollbar(t0).runNow()), get_allowMaximize = get_allowMaximize.toJsFn, get_args = get_args.toJsFn, get_closed = get_closed.toJsFn, get_dialogElement = get_dialogElement.toJsFn, get_firstTabStop = get_firstTabStop.toJsFn, get_frameElement = get_frameElement.toJsFn, get_html = get_html.toJsFn, get_isMaximized = get_isMaximized.toJsFn, get_lastTabStop = get_lastTabStop.toJsFn, get_returnValue = get_returnValue.toJsFn, get_showClose = get_showClose.toJsFn, get_title = get_title.toJsFn, get_url = get_url.toJsFn, set_returnValue = js.Any.fromFunction1((t0: Any) => set_returnValue(t0).runNow()))
    __obj.asInstanceOf[Dialog]
  }
  
  extension [Self <: Dialog](x: Self) {
    
    inline def setAutoSize(value: Callback): Self = StObject.set(x, "autoSize", value.toJsFn)
    
    inline def setAutoSizeSuppressScrollbar(value: Any => Callback): Self = StObject.set(x, "autoSizeSuppressScrollbar", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setGet_allowMaximize(value: CallbackTo[Boolean]): Self = StObject.set(x, "get_allowMaximize", value.toJsFn)
    
    inline def setGet_args(value: CallbackTo[Any]): Self = StObject.set(x, "get_args", value.toJsFn)
    
    inline def setGet_closed(value: CallbackTo[Boolean]): Self = StObject.set(x, "get_closed", value.toJsFn)
    
    inline def setGet_dialogElement(value: CallbackTo[HTMLElement]): Self = StObject.set(x, "get_dialogElement", value.toJsFn)
    
    inline def setGet_firstTabStop(value: CallbackTo[HTMLElement]): Self = StObject.set(x, "get_firstTabStop", value.toJsFn)
    
    inline def setGet_frameElement(value: CallbackTo[HTMLFrameElement]): Self = StObject.set(x, "get_frameElement", value.toJsFn)
    
    inline def setGet_html(value: CallbackTo[String]): Self = StObject.set(x, "get_html", value.toJsFn)
    
    inline def setGet_isMaximized(value: CallbackTo[Boolean]): Self = StObject.set(x, "get_isMaximized", value.toJsFn)
    
    inline def setGet_lastTabStop(value: CallbackTo[HTMLElement]): Self = StObject.set(x, "get_lastTabStop", value.toJsFn)
    
    inline def setGet_returnValue(value: CallbackTo[Any]): Self = StObject.set(x, "get_returnValue", value.toJsFn)
    
    inline def setGet_showClose(value: CallbackTo[Boolean]): Self = StObject.set(x, "get_showClose", value.toJsFn)
    
    inline def setGet_title(value: CallbackTo[String]): Self = StObject.set(x, "get_title", value.toJsFn)
    
    inline def setGet_url(value: CallbackTo[String]): Self = StObject.set(x, "get_url", value.toJsFn)
    
    inline def setSet_returnValue(value: Any => Callback): Self = StObject.set(x, "set_returnValue", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
  }
}
