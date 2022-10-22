package typingsJapgolly.photonui.photonui

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.HTMLElement
import typingsJapgolly.photonui.anon.X
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Slider
  extends StObject
     with NumericField {
  
  var fieldVisible: Boolean
}
object Slider {
  
  inline def apply(
    absolutePosition: X,
    addClass: String => Callback,
    contextMenu: PopupWindow,
    contextMenuName: String,
    decimalDigits: Double,
    decimalSymbol: String,
    destroy: Callback,
    fieldVisible: Boolean,
    hide: Callback,
    html: HTMLElement,
    layoutOptions: StringDictionary[Any],
    max: Double,
    min: Double,
    name: String,
    offsetHeight: Double,
    offsetWidth: Double,
    parent: Widget,
    parentName: String,
    placeholder: String,
    registerCallback: (String, String, js.Function, Any) => Callback,
    removeCallback: String => Callback,
    removeClass: String => Callback,
    show: Callback,
    step: Double,
    tooltip: String,
    unparent: Callback,
    value: Boolean,
    visible: Boolean
  ): Slider = {
    val __obj = js.Dynamic.literal(absolutePosition = absolutePosition.asInstanceOf[js.Any], addClass = js.Any.fromFunction1((t0: String) => addClass(t0).runNow()), contextMenu = contextMenu.asInstanceOf[js.Any], contextMenuName = contextMenuName.asInstanceOf[js.Any], decimalDigits = decimalDigits.asInstanceOf[js.Any], decimalSymbol = decimalSymbol.asInstanceOf[js.Any], destroy = destroy.toJsFn, fieldVisible = fieldVisible.asInstanceOf[js.Any], hide = hide.toJsFn, html = html.asInstanceOf[js.Any], layoutOptions = layoutOptions.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], offsetHeight = offsetHeight.asInstanceOf[js.Any], offsetWidth = offsetWidth.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], parentName = parentName.asInstanceOf[js.Any], placeholder = placeholder.asInstanceOf[js.Any], registerCallback = js.Any.fromFunction4((t0: String, t1: String, t2: js.Function, t3: Any) => (registerCallback(t0, t1, t2, t3)).runNow()), removeCallback = js.Any.fromFunction1((t0: String) => removeCallback(t0).runNow()), removeClass = js.Any.fromFunction1((t0: String) => removeClass(t0).runNow()), show = show.toJsFn, step = step.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any], unparent = unparent.toJsFn, value = value.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[Slider]
  }
  
  extension [Self <: Slider](x: Self) {
    
    inline def setFieldVisible(value: Boolean): Self = StObject.set(x, "fieldVisible", value.asInstanceOf[js.Any])
  }
}
