package typingsJapgolly.sharepoint.SP.UI

import japgolly.scalajs.react.Callback
import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DialogOptions
  extends StObject
     with IDialogOptions {
  
  /** specifies if maximize button should be shown on the dialog */
  @JSName("allowMaximize")
  var allowMaximize_DialogOptions: Boolean
  
  /** minimum width of the dialog when using autoSize option */
  @JSName("autoSizeStartWidth")
  var autoSizeStartWidth_DialogOptions: Double
  
  /** automatically determine size of the dialog based on its contents. */
  @JSName("autoSize")
  var autoSize_DialogOptions: Boolean
  
  /** callback that is called after dialog is closed */
  @JSName("dialogReturnValueCallback")
  def dialogReturnValueCallback_MDialogOptions(dialogResult: DialogResult, returnValue: Any): Unit
  /** callback that is called after dialog is closed */
  @JSName("dialogReturnValueCallback")
  var dialogReturnValueCallback_Original: DialogReturnValueCallback
  
  /** height of the dialog. if not specified, will be determined automatically based on the contents of the dialog */
  @JSName("height")
  var height_DialogOptions: Double
  
  /** html element which will be used as contents of the dialog. You should use either html or url attribute, but not both. */
  @JSName("html")
  var html_DialogOptions: HTMLElement
  
  /** include padding for adding a scrollbar */
  @JSName("includeScrollBarPadding")
  var includeScrollBarPadding_DialogOptions: Boolean
  
  /** specifies if close button should be shown on the dialog */
  @JSName("showClose")
  var showClose_DialogOptions: Boolean
  
  /** The dialog will be maximized when shown. */
  @JSName("showMaximized")
  var showMaximized_DialogOptions: Boolean
  
  /** Text displayed in the title bar of the dialog box. If not defined, it will default to the title of the page defined by url property. */
  @JSName("title")
  var title_DialogOptions: String
  
  /** url of the page which is shown in the modal dialog. You should use either html or url attribute, but not both. */
  @JSName("url")
  var url_DialogOptions: String
  
  /** width of the dialog. if not specified, will be determined automatically based on the contents of the dialog */
  @JSName("width")
  var width_DialogOptions: Double
  
  /** X coordinate of the dialog box. */
  @JSName("x")
  var x_DialogOptions: Double
  
  /** Y coordinate of the dialog box. */
  @JSName("y")
  var y_DialogOptions: Double
}
object DialogOptions {
  
  inline def apply(
    allowMaximize: Boolean,
    autoSize: Boolean,
    autoSizeStartWidth: Double,
    dialogReturnValueCallback: (/* dialogResult */ DialogResult, /* returnValue */ Any) => Callback,
    height: Double,
    html: HTMLElement,
    includeScrollBarPadding: Boolean,
    showClose: Boolean,
    showMaximized: Boolean,
    title: String,
    url: String,
    width: Double,
    x: Double,
    y: Double
  ): DialogOptions = {
    val __obj = js.Dynamic.literal(allowMaximize = allowMaximize.asInstanceOf[js.Any], autoSize = autoSize.asInstanceOf[js.Any], autoSizeStartWidth = autoSizeStartWidth.asInstanceOf[js.Any], dialogReturnValueCallback = js.Any.fromFunction2((t0: /* dialogResult */ DialogResult, t1: /* returnValue */ Any) => (dialogReturnValueCallback(t0, t1)).runNow()), height = height.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], includeScrollBarPadding = includeScrollBarPadding.asInstanceOf[js.Any], showClose = showClose.asInstanceOf[js.Any], showMaximized = showMaximized.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogOptions]
  }
  
  extension [Self <: DialogOptions](x: Self) {
    
    inline def setAllowMaximize(value: Boolean): Self = StObject.set(x, "allowMaximize", value.asInstanceOf[js.Any])
    
    inline def setAutoSize(value: Boolean): Self = StObject.set(x, "autoSize", value.asInstanceOf[js.Any])
    
    inline def setAutoSizeStartWidth(value: Double): Self = StObject.set(x, "autoSizeStartWidth", value.asInstanceOf[js.Any])
    
    inline def setDialogReturnValueCallback(value: (/* dialogResult */ DialogResult, /* returnValue */ Any) => Callback): Self = StObject.set(x, "dialogReturnValueCallback", js.Any.fromFunction2((t0: /* dialogResult */ DialogResult, t1: /* returnValue */ Any) => (value(t0, t1)).runNow()))
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHtml(value: HTMLElement): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
    
    inline def setIncludeScrollBarPadding(value: Boolean): Self = StObject.set(x, "includeScrollBarPadding", value.asInstanceOf[js.Any])
    
    inline def setShowClose(value: Boolean): Self = StObject.set(x, "showClose", value.asInstanceOf[js.Any])
    
    inline def setShowMaximized(value: Boolean): Self = StObject.set(x, "showMaximized", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
