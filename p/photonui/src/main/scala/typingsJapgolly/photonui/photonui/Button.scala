package typingsJapgolly.photonui.photonui

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.HTMLElement
import typingsJapgolly.photonui.anon.X
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Button
  extends StObject
     with Widget {
  
  var appearance: String
  
  //  normal | flat
  var buttonColor: String
  
  var leftIcon: BaseIcon
  
  var leftIconName: String
  
  var leftIconVisible: Boolean
  
  var rightIcon: BaseIcon
  
  var rightIconName: String
  
  var rightIconVisible: Boolean
  
  var text: String
  
  var textVisible: Boolean
}
object Button {
  
  inline def apply(
    absolutePosition: X,
    addClass: String => Callback,
    appearance: String,
    buttonColor: String,
    contextMenu: PopupWindow,
    contextMenuName: String,
    destroy: Callback,
    hide: Callback,
    html: HTMLElement,
    layoutOptions: StringDictionary[Any],
    leftIcon: BaseIcon,
    leftIconName: String,
    leftIconVisible: Boolean,
    name: String,
    offsetHeight: Double,
    offsetWidth: Double,
    parent: Widget,
    parentName: String,
    registerCallback: (String, String, js.Function, Any) => Callback,
    removeCallback: String => Callback,
    removeClass: String => Callback,
    rightIcon: BaseIcon,
    rightIconName: String,
    rightIconVisible: Boolean,
    show: Callback,
    text: String,
    textVisible: Boolean,
    tooltip: String,
    unparent: Callback,
    visible: Boolean
  ): Button = {
    val __obj = js.Dynamic.literal(absolutePosition = absolutePosition.asInstanceOf[js.Any], addClass = js.Any.fromFunction1((t0: String) => addClass(t0).runNow()), appearance = appearance.asInstanceOf[js.Any], buttonColor = buttonColor.asInstanceOf[js.Any], contextMenu = contextMenu.asInstanceOf[js.Any], contextMenuName = contextMenuName.asInstanceOf[js.Any], destroy = destroy.toJsFn, hide = hide.toJsFn, html = html.asInstanceOf[js.Any], layoutOptions = layoutOptions.asInstanceOf[js.Any], leftIcon = leftIcon.asInstanceOf[js.Any], leftIconName = leftIconName.asInstanceOf[js.Any], leftIconVisible = leftIconVisible.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], offsetHeight = offsetHeight.asInstanceOf[js.Any], offsetWidth = offsetWidth.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], parentName = parentName.asInstanceOf[js.Any], registerCallback = js.Any.fromFunction4((t0: String, t1: String, t2: js.Function, t3: Any) => (registerCallback(t0, t1, t2, t3)).runNow()), removeCallback = js.Any.fromFunction1((t0: String) => removeCallback(t0).runNow()), removeClass = js.Any.fromFunction1((t0: String) => removeClass(t0).runNow()), rightIcon = rightIcon.asInstanceOf[js.Any], rightIconName = rightIconName.asInstanceOf[js.Any], rightIconVisible = rightIconVisible.asInstanceOf[js.Any], show = show.toJsFn, text = text.asInstanceOf[js.Any], textVisible = textVisible.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any], unparent = unparent.toJsFn, visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[Button]
  }
  
  extension [Self <: Button](x: Self) {
    
    inline def setAppearance(value: String): Self = StObject.set(x, "appearance", value.asInstanceOf[js.Any])
    
    inline def setButtonColor(value: String): Self = StObject.set(x, "buttonColor", value.asInstanceOf[js.Any])
    
    inline def setLeftIcon(value: BaseIcon): Self = StObject.set(x, "leftIcon", value.asInstanceOf[js.Any])
    
    inline def setLeftIconName(value: String): Self = StObject.set(x, "leftIconName", value.asInstanceOf[js.Any])
    
    inline def setLeftIconVisible(value: Boolean): Self = StObject.set(x, "leftIconVisible", value.asInstanceOf[js.Any])
    
    inline def setRightIcon(value: BaseIcon): Self = StObject.set(x, "rightIcon", value.asInstanceOf[js.Any])
    
    inline def setRightIconName(value: String): Self = StObject.set(x, "rightIconName", value.asInstanceOf[js.Any])
    
    inline def setRightIconVisible(value: Boolean): Self = StObject.set(x, "rightIconVisible", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextVisible(value: Boolean): Self = StObject.set(x, "textVisible", value.asInstanceOf[js.Any])
  }
}
