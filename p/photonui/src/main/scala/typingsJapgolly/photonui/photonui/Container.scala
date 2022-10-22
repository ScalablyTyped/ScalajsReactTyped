package typingsJapgolly.photonui.photonui

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.HTMLElement
import typingsJapgolly.photonui.anon.X
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// -----------------------------------
trait Container
  extends StObject
     with Widget {
  
  var child: Widget
  
  var childName: String
  
  var containerNode: HTMLElement
  
  // readonly
  var horizontalChildExpansion: Boolean
  
  def removeChild(widget: Widget): Unit
  
  var verticalChildExpansion: Boolean
}
object Container {
  
  inline def apply(
    absolutePosition: X,
    addClass: String => Callback,
    child: Widget,
    childName: String,
    containerNode: HTMLElement,
    contextMenu: PopupWindow,
    contextMenuName: String,
    destroy: Callback,
    hide: Callback,
    horizontalChildExpansion: Boolean,
    html: HTMLElement,
    layoutOptions: StringDictionary[Any],
    name: String,
    offsetHeight: Double,
    offsetWidth: Double,
    parent: Widget,
    parentName: String,
    registerCallback: (String, String, js.Function, Any) => Callback,
    removeCallback: String => Callback,
    removeChild: Widget => Callback,
    removeClass: String => Callback,
    show: Callback,
    tooltip: String,
    unparent: Callback,
    verticalChildExpansion: Boolean,
    visible: Boolean
  ): Container = {
    val __obj = js.Dynamic.literal(absolutePosition = absolutePosition.asInstanceOf[js.Any], addClass = js.Any.fromFunction1((t0: String) => addClass(t0).runNow()), child = child.asInstanceOf[js.Any], childName = childName.asInstanceOf[js.Any], containerNode = containerNode.asInstanceOf[js.Any], contextMenu = contextMenu.asInstanceOf[js.Any], contextMenuName = contextMenuName.asInstanceOf[js.Any], destroy = destroy.toJsFn, hide = hide.toJsFn, horizontalChildExpansion = horizontalChildExpansion.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], layoutOptions = layoutOptions.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], offsetHeight = offsetHeight.asInstanceOf[js.Any], offsetWidth = offsetWidth.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], parentName = parentName.asInstanceOf[js.Any], registerCallback = js.Any.fromFunction4((t0: String, t1: String, t2: js.Function, t3: Any) => (registerCallback(t0, t1, t2, t3)).runNow()), removeCallback = js.Any.fromFunction1((t0: String) => removeCallback(t0).runNow()), removeChild = js.Any.fromFunction1((t0: Widget) => removeChild(t0).runNow()), removeClass = js.Any.fromFunction1((t0: String) => removeClass(t0).runNow()), show = show.toJsFn, tooltip = tooltip.asInstanceOf[js.Any], unparent = unparent.toJsFn, verticalChildExpansion = verticalChildExpansion.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[Container]
  }
  
  extension [Self <: Container](x: Self) {
    
    inline def setChild(value: Widget): Self = StObject.set(x, "child", value.asInstanceOf[js.Any])
    
    inline def setChildName(value: String): Self = StObject.set(x, "childName", value.asInstanceOf[js.Any])
    
    inline def setContainerNode(value: HTMLElement): Self = StObject.set(x, "containerNode", value.asInstanceOf[js.Any])
    
    inline def setHorizontalChildExpansion(value: Boolean): Self = StObject.set(x, "horizontalChildExpansion", value.asInstanceOf[js.Any])
    
    inline def setRemoveChild(value: Widget => Callback): Self = StObject.set(x, "removeChild", js.Any.fromFunction1((t0: Widget) => value(t0).runNow()))
    
    inline def setVerticalChildExpansion(value: Boolean): Self = StObject.set(x, "verticalChildExpansion", value.asInstanceOf[js.Any])
  }
}
