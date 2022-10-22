package typingsJapgolly.photonui.photonui

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.HTMLElement
import typingsJapgolly.photonui.anon.X
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColorPalette
  extends StObject
     with Widget {
  
  var color: Color
  
  var palette: js.Array[js.Array[String]]
  
  var value: String
}
object ColorPalette {
  
  inline def apply(
    absolutePosition: X,
    addClass: String => Callback,
    color: Color,
    contextMenu: PopupWindow,
    contextMenuName: String,
    destroy: Callback,
    hide: Callback,
    html: HTMLElement,
    layoutOptions: StringDictionary[Any],
    name: String,
    offsetHeight: Double,
    offsetWidth: Double,
    palette: js.Array[js.Array[String]],
    parent: Widget,
    parentName: String,
    registerCallback: (String, String, js.Function, Any) => Callback,
    removeCallback: String => Callback,
    removeClass: String => Callback,
    show: Callback,
    tooltip: String,
    unparent: Callback,
    value: String,
    visible: Boolean
  ): ColorPalette = {
    val __obj = js.Dynamic.literal(absolutePosition = absolutePosition.asInstanceOf[js.Any], addClass = js.Any.fromFunction1((t0: String) => addClass(t0).runNow()), color = color.asInstanceOf[js.Any], contextMenu = contextMenu.asInstanceOf[js.Any], contextMenuName = contextMenuName.asInstanceOf[js.Any], destroy = destroy.toJsFn, hide = hide.toJsFn, html = html.asInstanceOf[js.Any], layoutOptions = layoutOptions.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], offsetHeight = offsetHeight.asInstanceOf[js.Any], offsetWidth = offsetWidth.asInstanceOf[js.Any], palette = palette.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], parentName = parentName.asInstanceOf[js.Any], registerCallback = js.Any.fromFunction4((t0: String, t1: String, t2: js.Function, t3: Any) => (registerCallback(t0, t1, t2, t3)).runNow()), removeCallback = js.Any.fromFunction1((t0: String) => removeCallback(t0).runNow()), removeClass = js.Any.fromFunction1((t0: String) => removeClass(t0).runNow()), show = show.toJsFn, tooltip = tooltip.asInstanceOf[js.Any], unparent = unparent.toJsFn, value = value.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorPalette]
  }
  
  extension [Self <: ColorPalette](x: Self) {
    
    inline def setColor(value: Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setPalette(value: js.Array[js.Array[String]]): Self = StObject.set(x, "palette", value.asInstanceOf[js.Any])
    
    inline def setPaletteVarargs(value: js.Array[String]*): Self = StObject.set(x, "palette", js.Array(value*))
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
