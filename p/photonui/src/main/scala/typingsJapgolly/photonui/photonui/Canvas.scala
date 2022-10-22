package typingsJapgolly.photonui.photonui

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.HTMLElement
import typingsJapgolly.photonui.anon.X
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Canvas
  extends StObject
     with Widget {
  
  var canvas: HTMLElement
  
  def getContext(contextId: String): Any
  
  var height: Double
  
  var interactiveMode: HTMLElement
  
  def setContext(contextId: String): Unit
  
  def supportsContext(contextId: String): Boolean
  
  def toBlod(imageFormat: String): Any
  
  // returns Blob
  def toBlodHD(imageFormat: String): Any
  
  // returns Blob
  def toDataUrl(imageFormat: String): String
  
  def toDataUrlHD(imageFormat: String): String
  
  def transferControlToProxy(): Unit
  
  var width: Double
}
object Canvas {
  
  inline def apply(
    absolutePosition: X,
    addClass: String => Callback,
    canvas: HTMLElement,
    contextMenu: PopupWindow,
    contextMenuName: String,
    destroy: Callback,
    getContext: String => Any,
    height: Double,
    hide: Callback,
    html: HTMLElement,
    interactiveMode: HTMLElement,
    layoutOptions: StringDictionary[Any],
    name: String,
    offsetHeight: Double,
    offsetWidth: Double,
    parent: Widget,
    parentName: String,
    registerCallback: (String, String, js.Function, Any) => Callback,
    removeCallback: String => Callback,
    removeClass: String => Callback,
    setContext: String => Callback,
    show: Callback,
    supportsContext: String => Boolean,
    toBlod: String => Any,
    toBlodHD: String => Any,
    toDataUrl: String => String,
    toDataUrlHD: String => String,
    tooltip: String,
    transferControlToProxy: Callback,
    unparent: Callback,
    visible: Boolean,
    width: Double
  ): Canvas = {
    val __obj = js.Dynamic.literal(absolutePosition = absolutePosition.asInstanceOf[js.Any], addClass = js.Any.fromFunction1((t0: String) => addClass(t0).runNow()), canvas = canvas.asInstanceOf[js.Any], contextMenu = contextMenu.asInstanceOf[js.Any], contextMenuName = contextMenuName.asInstanceOf[js.Any], destroy = destroy.toJsFn, getContext = js.Any.fromFunction1(getContext), height = height.asInstanceOf[js.Any], hide = hide.toJsFn, html = html.asInstanceOf[js.Any], interactiveMode = interactiveMode.asInstanceOf[js.Any], layoutOptions = layoutOptions.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], offsetHeight = offsetHeight.asInstanceOf[js.Any], offsetWidth = offsetWidth.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], parentName = parentName.asInstanceOf[js.Any], registerCallback = js.Any.fromFunction4((t0: String, t1: String, t2: js.Function, t3: Any) => (registerCallback(t0, t1, t2, t3)).runNow()), removeCallback = js.Any.fromFunction1((t0: String) => removeCallback(t0).runNow()), removeClass = js.Any.fromFunction1((t0: String) => removeClass(t0).runNow()), setContext = js.Any.fromFunction1((t0: String) => setContext(t0).runNow()), show = show.toJsFn, supportsContext = js.Any.fromFunction1(supportsContext), toBlod = js.Any.fromFunction1(toBlod), toBlodHD = js.Any.fromFunction1(toBlodHD), toDataUrl = js.Any.fromFunction1(toDataUrl), toDataUrlHD = js.Any.fromFunction1(toDataUrlHD), tooltip = tooltip.asInstanceOf[js.Any], transferControlToProxy = transferControlToProxy.toJsFn, unparent = unparent.toJsFn, visible = visible.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Canvas]
  }
  
  extension [Self <: Canvas](x: Self) {
    
    inline def setCanvas(value: HTMLElement): Self = StObject.set(x, "canvas", value.asInstanceOf[js.Any])
    
    inline def setGetContext(value: String => Any): Self = StObject.set(x, "getContext", js.Any.fromFunction1(value))
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setInteractiveMode(value: HTMLElement): Self = StObject.set(x, "interactiveMode", value.asInstanceOf[js.Any])
    
    inline def setSetContext(value: String => Callback): Self = StObject.set(x, "setContext", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSupportsContext(value: String => Boolean): Self = StObject.set(x, "supportsContext", js.Any.fromFunction1(value))
    
    inline def setToBlod(value: String => Any): Self = StObject.set(x, "toBlod", js.Any.fromFunction1(value))
    
    inline def setToBlodHD(value: String => Any): Self = StObject.set(x, "toBlodHD", js.Any.fromFunction1(value))
    
    inline def setToDataUrl(value: String => String): Self = StObject.set(x, "toDataUrl", js.Any.fromFunction1(value))
    
    inline def setToDataUrlHD(value: String => String): Self = StObject.set(x, "toDataUrlHD", js.Any.fromFunction1(value))
    
    inline def setTransferControlToProxy(value: Callback): Self = StObject.set(x, "transferControlToProxy", value.toJsFn)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
