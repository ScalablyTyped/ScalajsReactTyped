package typingsJapgolly.photonui.photonui

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.HTMLElement
import typingsJapgolly.photonui.anon.X
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dialog
  extends StObject
     with Window {
  
  def addButton(widget: Widget, layoutOptions: Any): Unit
  
  var buttonNames: js.Array[String]
  
  var buttons: js.Array[Widget]
  
  def removeButton(widget: Widget): Unit
}
object Dialog {
  
  inline def apply(
    absolutePosition: X,
    addButton: (Widget, Any) => Callback,
    addClass: String => Callback,
    buttonNames: js.Array[String],
    buttons: js.Array[Widget],
    center: Callback,
    child: Widget,
    childName: String,
    closeButtonVisible: Boolean,
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
    modal: Boolean,
    movable: Boolean,
    moveToBack: Callback,
    moveToFront: Callback,
    name: String,
    offsetHeight: Double,
    offsetWidth: Double,
    padding: Double,
    parent: Widget,
    parentName: String,
    position: X,
    registerCallback: (String, String, js.Function, Any) => Callback,
    removeButton: Widget => Callback,
    removeCallback: String => Callback,
    removeChild: Widget => Callback,
    removeClass: String => Callback,
    show: Callback,
    title: String,
    tooltip: String,
    unparent: Callback,
    verticalChildExpansion: Boolean,
    visible: Boolean,
    width: Double,
    x: Double,
    y: Double
  ): Dialog = {
    val __obj = js.Dynamic.literal(absolutePosition = absolutePosition.asInstanceOf[js.Any], addButton = js.Any.fromFunction2((t0: Widget, t1: Any) => (addButton(t0, t1)).runNow()), addClass = js.Any.fromFunction1((t0: String) => addClass(t0).runNow()), buttonNames = buttonNames.asInstanceOf[js.Any], buttons = buttons.asInstanceOf[js.Any], center = center.toJsFn, child = child.asInstanceOf[js.Any], childName = childName.asInstanceOf[js.Any], closeButtonVisible = closeButtonVisible.asInstanceOf[js.Any], containerNode = containerNode.asInstanceOf[js.Any], contextMenu = contextMenu.asInstanceOf[js.Any], contextMenuName = contextMenuName.asInstanceOf[js.Any], destroy = destroy.toJsFn, height = height.asInstanceOf[js.Any], hide = hide.toJsFn, horizontalChildExpansion = horizontalChildExpansion.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], layoutOptions = layoutOptions.asInstanceOf[js.Any], maxHeight = maxHeight.asInstanceOf[js.Any], maxWidth = maxWidth.asInstanceOf[js.Any], minHeight = minHeight.asInstanceOf[js.Any], minWidth = minWidth.asInstanceOf[js.Any], modal = modal.asInstanceOf[js.Any], movable = movable.asInstanceOf[js.Any], moveToBack = moveToBack.toJsFn, moveToFront = moveToFront.toJsFn, name = name.asInstanceOf[js.Any], offsetHeight = offsetHeight.asInstanceOf[js.Any], offsetWidth = offsetWidth.asInstanceOf[js.Any], padding = padding.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], parentName = parentName.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], registerCallback = js.Any.fromFunction4((t0: String, t1: String, t2: js.Function, t3: Any) => (registerCallback(t0, t1, t2, t3)).runNow()), removeButton = js.Any.fromFunction1((t0: Widget) => removeButton(t0).runNow()), removeCallback = js.Any.fromFunction1((t0: String) => removeCallback(t0).runNow()), removeChild = js.Any.fromFunction1((t0: Widget) => removeChild(t0).runNow()), removeClass = js.Any.fromFunction1((t0: String) => removeClass(t0).runNow()), show = show.toJsFn, title = title.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any], unparent = unparent.toJsFn, verticalChildExpansion = verticalChildExpansion.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dialog]
  }
  
  extension [Self <: Dialog](x: Self) {
    
    inline def setAddButton(value: (Widget, Any) => Callback): Self = StObject.set(x, "addButton", js.Any.fromFunction2((t0: Widget, t1: Any) => (value(t0, t1)).runNow()))
    
    inline def setButtonNames(value: js.Array[String]): Self = StObject.set(x, "buttonNames", value.asInstanceOf[js.Any])
    
    inline def setButtonNamesVarargs(value: String*): Self = StObject.set(x, "buttonNames", js.Array(value*))
    
    inline def setButtons(value: js.Array[Widget]): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
    
    inline def setButtonsVarargs(value: Widget*): Self = StObject.set(x, "buttons", js.Array(value*))
    
    inline def setRemoveButton(value: Widget => Callback): Self = StObject.set(x, "removeButton", js.Any.fromFunction1((t0: Widget) => value(t0).runNow()))
  }
}
