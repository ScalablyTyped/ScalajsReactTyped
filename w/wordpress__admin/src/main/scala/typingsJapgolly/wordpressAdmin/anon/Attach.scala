package typingsJapgolly.wordpressAdmin.anon

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.lodash.mod.TemplateExecutor
import typingsJapgolly.wordpressAdmin.componentsMediaViewsMod.MediaFrame
import typingsJapgolly.wordpressAdmin.componentsMediaViewsMod.UploaderWindow
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Attach extends StObject {
  
  def attach(): MediaFrame
  
  // Object properties
  var className: String
  
  def close(): MediaFrame
  
  def createIframeStates(options: Any): Unit
  
  def createMenu(menu: Any): Unit
  
  def createRouter(router: Any): Unit
  
  def createTitle(title: Any): Unit
  
  def createToolbar(toolbar: Any): Unit
  
  def detach(): MediaFrame
  
  def escape(): MediaFrame
  
  var events: StringDictionary[String]
  
  def hijackThickbox(): Unit
  
  def iframeContent(content: Any): Unit
  
  def iframeContentCleanup(): Unit
  
  def iframeMenu(view: Any): Unit
  
  var modal: Any
  
  def open(): MediaFrame
  
  var options: StringDictionary[Any]
  
  var regions: js.Array[String]
  
  def render(): MediaFrame
  
  def restoreThickbox(): Unit
  
  // Object methods
  /**
    * Sets the attributes to be used on the menu ARIA tab panel.
    */
  def setMenuTabPanelAriaAttributes(): Unit
  
  /**
    * Sets the attributes to be used on the router ARIA tab panel.
    */
  def setRouterTabPanelAriaAttributes(): Unit
  
  def template(): String
  def template(data: js.Object): String
  @JSName("template")
  var template_Original: TemplateExecutor
  
  def toggleMenu(event: Any): Unit
  
  var uploader: UploaderWindow
}
object Attach {
  
  inline def apply(
    attach: CallbackTo[MediaFrame],
    className: String,
    close: CallbackTo[MediaFrame],
    createIframeStates: Any => Callback,
    createMenu: Any => Callback,
    createRouter: Any => Callback,
    createTitle: Any => Callback,
    createToolbar: Any => Callback,
    detach: CallbackTo[MediaFrame],
    escape: CallbackTo[MediaFrame],
    events: StringDictionary[String],
    hijackThickbox: Callback,
    iframeContent: Any => Callback,
    iframeContentCleanup: Callback,
    iframeMenu: Any => Callback,
    modal: Any,
    open: CallbackTo[MediaFrame],
    options: StringDictionary[Any],
    regions: js.Array[String],
    render: CallbackTo[MediaFrame],
    restoreThickbox: Callback,
    setMenuTabPanelAriaAttributes: Callback,
    setRouterTabPanelAriaAttributes: Callback,
    template: TemplateExecutor,
    toggleMenu: Any => Callback,
    uploader: UploaderWindow
  ): Attach = {
    val __obj = js.Dynamic.literal(attach = attach.toJsFn, className = className.asInstanceOf[js.Any], close = close.toJsFn, createIframeStates = js.Any.fromFunction1((t0: Any) => createIframeStates(t0).runNow()), createMenu = js.Any.fromFunction1((t0: Any) => createMenu(t0).runNow()), createRouter = js.Any.fromFunction1((t0: Any) => createRouter(t0).runNow()), createTitle = js.Any.fromFunction1((t0: Any) => createTitle(t0).runNow()), createToolbar = js.Any.fromFunction1((t0: Any) => createToolbar(t0).runNow()), detach = detach.toJsFn, escape = escape.toJsFn, events = events.asInstanceOf[js.Any], hijackThickbox = hijackThickbox.toJsFn, iframeContent = js.Any.fromFunction1((t0: Any) => iframeContent(t0).runNow()), iframeContentCleanup = iframeContentCleanup.toJsFn, iframeMenu = js.Any.fromFunction1((t0: Any) => iframeMenu(t0).runNow()), modal = modal.asInstanceOf[js.Any], open = open.toJsFn, options = options.asInstanceOf[js.Any], regions = regions.asInstanceOf[js.Any], render = render.toJsFn, restoreThickbox = restoreThickbox.toJsFn, setMenuTabPanelAriaAttributes = setMenuTabPanelAriaAttributes.toJsFn, setRouterTabPanelAriaAttributes = setRouterTabPanelAriaAttributes.toJsFn, template = template.asInstanceOf[js.Any], toggleMenu = js.Any.fromFunction1((t0: Any) => toggleMenu(t0).runNow()), uploader = uploader.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attach]
  }
  
  extension [Self <: Attach](x: Self) {
    
    inline def setAttach(value: CallbackTo[MediaFrame]): Self = StObject.set(x, "attach", value.toJsFn)
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClose(value: CallbackTo[MediaFrame]): Self = StObject.set(x, "close", value.toJsFn)
    
    inline def setCreateIframeStates(value: Any => Callback): Self = StObject.set(x, "createIframeStates", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setCreateMenu(value: Any => Callback): Self = StObject.set(x, "createMenu", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setCreateRouter(value: Any => Callback): Self = StObject.set(x, "createRouter", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setCreateTitle(value: Any => Callback): Self = StObject.set(x, "createTitle", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setCreateToolbar(value: Any => Callback): Self = StObject.set(x, "createToolbar", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setDetach(value: CallbackTo[MediaFrame]): Self = StObject.set(x, "detach", value.toJsFn)
    
    inline def setEscape(value: CallbackTo[MediaFrame]): Self = StObject.set(x, "escape", value.toJsFn)
    
    inline def setEvents(value: StringDictionary[String]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setHijackThickbox(value: Callback): Self = StObject.set(x, "hijackThickbox", value.toJsFn)
    
    inline def setIframeContent(value: Any => Callback): Self = StObject.set(x, "iframeContent", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setIframeContentCleanup(value: Callback): Self = StObject.set(x, "iframeContentCleanup", value.toJsFn)
    
    inline def setIframeMenu(value: Any => Callback): Self = StObject.set(x, "iframeMenu", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setModal(value: Any): Self = StObject.set(x, "modal", value.asInstanceOf[js.Any])
    
    inline def setOpen(value: CallbackTo[MediaFrame]): Self = StObject.set(x, "open", value.toJsFn)
    
    inline def setOptions(value: StringDictionary[Any]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setRegions(value: js.Array[String]): Self = StObject.set(x, "regions", value.asInstanceOf[js.Any])
    
    inline def setRegionsVarargs(value: String*): Self = StObject.set(x, "regions", js.Array(value*))
    
    inline def setRender(value: CallbackTo[MediaFrame]): Self = StObject.set(x, "render", value.toJsFn)
    
    inline def setRestoreThickbox(value: Callback): Self = StObject.set(x, "restoreThickbox", value.toJsFn)
    
    inline def setSetMenuTabPanelAriaAttributes(value: Callback): Self = StObject.set(x, "setMenuTabPanelAriaAttributes", value.toJsFn)
    
    inline def setSetRouterTabPanelAriaAttributes(value: Callback): Self = StObject.set(x, "setRouterTabPanelAriaAttributes", value.toJsFn)
    
    inline def setTemplate(value: TemplateExecutor): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    inline def setToggleMenu(value: Any => Callback): Self = StObject.set(x, "toggleMenu", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setUploader(value: UploaderWindow): Self = StObject.set(x, "uploader", value.asInstanceOf[js.Any])
  }
}
