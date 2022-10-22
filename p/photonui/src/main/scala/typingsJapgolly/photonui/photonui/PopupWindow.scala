package typingsJapgolly.photonui.photonui

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.HTMLElement
import typingsJapgolly.photonui.anon.X
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PopupWindow
  extends StObject
     with BaseWindow {
  
  def popupWidget(widget: Widget): Unit
  
  def popupXY(x: Double, y: Double): Unit
}
object PopupWindow {
  
  inline def apply(
    absolutePosition: X,
    addClass: String => Callback,
    center: Callback,
    child: Widget,
    childName: String,
    containerNode: HTMLElement,
    contextMenu: PopupWindow,
    contextMenuName: String,
    destroy: Callback,
    height: Double,
    hide: Callback,
    horizontalChildExpansion: Boolean,
    html: HTMLElement,
    layoutOptions: StringDictionary[Any],
    maxHeight: Double,
    maxWidth: Double,
    minHeight: Double,
    minWidth: Double,
    name: String,
    offsetHeight: Double,
    offsetWidth: Double,
    padding: Double,
    parent: Widget,
    parentName: String,
    popupWidget: Widget => Callback,
    popupXY: (Double, Double) => Callback,
    position: X,
    registerCallback: (String, String, js.Function, Any) => Callback,
    removeCallback: String => Callback,
    removeChild: Widget => Callback,
    removeClass: String => Callback,
    show: Callback,
    tooltip: String,
    unparent: Callback,
    verticalChildExpansion: Boolean,
    visible: Boolean,
    width: Double,
    x: Double,
    y: Double
  ): PopupWindow = {
    val __obj = js.Dynamic.literal(absolutePosition = absolutePosition.asInstanceOf[js.Any], addClass = js.Any.fromFunction1((t0: String) => addClass(t0).runNow()), center = center.toJsFn, child = child.asInstanceOf[js.Any], childName = childName.asInstanceOf[js.Any], containerNode = containerNode.asInstanceOf[js.Any], contextMenu = contextMenu.asInstanceOf[js.Any], contextMenuName = contextMenuName.asInstanceOf[js.Any], destroy = destroy.toJsFn, height = height.asInstanceOf[js.Any], hide = hide.toJsFn, horizontalChildExpansion = horizontalChildExpansion.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], layoutOptions = layoutOptions.asInstanceOf[js.Any], maxHeight = maxHeight.asInstanceOf[js.Any], maxWidth = maxWidth.asInstanceOf[js.Any], minHeight = minHeight.asInstanceOf[js.Any], minWidth = minWidth.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], offsetHeight = offsetHeight.asInstanceOf[js.Any], offsetWidth = offsetWidth.asInstanceOf[js.Any], padding = padding.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], parentName = parentName.asInstanceOf[js.Any], popupWidget = js.Any.fromFunction1((t0: Widget) => popupWidget(t0).runNow()), popupXY = js.Any.fromFunction2((t0: Double, t1: Double) => (popupXY(t0, t1)).runNow()), position = position.asInstanceOf[js.Any], registerCallback = js.Any.fromFunction4((t0: String, t1: String, t2: js.Function, t3: Any) => (registerCallback(t0, t1, t2, t3)).runNow()), removeCallback = js.Any.fromFunction1((t0: String) => removeCallback(t0).runNow()), removeChild = js.Any.fromFunction1((t0: Widget) => removeChild(t0).runNow()), removeClass = js.Any.fromFunction1((t0: String) => removeClass(t0).runNow()), show = show.toJsFn, tooltip = tooltip.asInstanceOf[js.Any], unparent = unparent.toJsFn, verticalChildExpansion = verticalChildExpansion.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[PopupWindow]
  }
  
  extension [Self <: PopupWindow](x: Self) {
    
    inline def setPopupWidget(value: Widget => Callback): Self = StObject.set(x, "popupWidget", js.Any.fromFunction1((t0: Widget) => value(t0).runNow()))
    
    inline def setPopupXY(value: (Double, Double) => Callback): Self = StObject.set(x, "popupXY", js.Any.fromFunction2((t0: Double, t1: Double) => (value(t0, t1)).runNow()))
  }
}
