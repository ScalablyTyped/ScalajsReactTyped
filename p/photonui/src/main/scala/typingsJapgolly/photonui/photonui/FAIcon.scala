package typingsJapgolly.photonui.photonui

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.HTMLElement
import typingsJapgolly.photonui.anon.X
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FAIcon
  extends StObject
     with Widget {
  
  var color: String
  
  var iconName: String
  
  var size: String
}
object FAIcon {
  
  inline def apply(
    absolutePosition: X,
    addClass: String => Callback,
    color: String,
    contextMenu: PopupWindow,
    contextMenuName: String,
    destroy: Callback,
    hide: Callback,
    html: HTMLElement,
    iconName: String,
    layoutOptions: StringDictionary[Any],
    name: String,
    offsetHeight: Double,
    offsetWidth: Double,
    parent: Widget,
    parentName: String,
    registerCallback: (String, String, js.Function, Any) => Callback,
    removeCallback: String => Callback,
    removeClass: String => Callback,
    show: Callback,
    size: String,
    tooltip: String,
    unparent: Callback,
    visible: Boolean
  ): FAIcon = {
    val __obj = js.Dynamic.literal(absolutePosition = absolutePosition.asInstanceOf[js.Any], addClass = js.Any.fromFunction1((t0: String) => addClass(t0).runNow()), color = color.asInstanceOf[js.Any], contextMenu = contextMenu.asInstanceOf[js.Any], contextMenuName = contextMenuName.asInstanceOf[js.Any], destroy = destroy.toJsFn, hide = hide.toJsFn, html = html.asInstanceOf[js.Any], iconName = iconName.asInstanceOf[js.Any], layoutOptions = layoutOptions.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], offsetHeight = offsetHeight.asInstanceOf[js.Any], offsetWidth = offsetWidth.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], parentName = parentName.asInstanceOf[js.Any], registerCallback = js.Any.fromFunction4((t0: String, t1: String, t2: js.Function, t3: Any) => (registerCallback(t0, t1, t2, t3)).runNow()), removeCallback = js.Any.fromFunction1((t0: String) => removeCallback(t0).runNow()), removeClass = js.Any.fromFunction1((t0: String) => removeClass(t0).runNow()), show = show.toJsFn, size = size.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any], unparent = unparent.toJsFn, visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[FAIcon]
  }
  
  extension [Self <: FAIcon](x: Self) {
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setIconName(value: String): Self = StObject.set(x, "iconName", value.asInstanceOf[js.Any])
    
    inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
