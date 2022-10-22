package typingsJapgolly.photonui.photonui

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.HTMLElement
import typingsJapgolly.photonui.anon.X
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Text
  extends StObject
     with Widget {
  
  var rawHtml: String
  
  var text: String
}
object Text {
  
  inline def apply(
    absolutePosition: X,
    addClass: String => Callback,
    contextMenu: PopupWindow,
    contextMenuName: String,
    destroy: Callback,
    hide: Callback,
    html: HTMLElement,
    layoutOptions: StringDictionary[Any],
    name: String,
    offsetHeight: Double,
    offsetWidth: Double,
    parent: Widget,
    parentName: String,
    rawHtml: String,
    registerCallback: (String, String, js.Function, Any) => Callback,
    removeCallback: String => Callback,
    removeClass: String => Callback,
    show: Callback,
    text: String,
    tooltip: String,
    unparent: Callback,
    visible: Boolean
  ): Text = {
    val __obj = js.Dynamic.literal(absolutePosition = absolutePosition.asInstanceOf[js.Any], addClass = js.Any.fromFunction1((t0: String) => addClass(t0).runNow()), contextMenu = contextMenu.asInstanceOf[js.Any], contextMenuName = contextMenuName.asInstanceOf[js.Any], destroy = destroy.toJsFn, hide = hide.toJsFn, html = html.asInstanceOf[js.Any], layoutOptions = layoutOptions.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], offsetHeight = offsetHeight.asInstanceOf[js.Any], offsetWidth = offsetWidth.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], parentName = parentName.asInstanceOf[js.Any], rawHtml = rawHtml.asInstanceOf[js.Any], registerCallback = js.Any.fromFunction4((t0: String, t1: String, t2: js.Function, t3: Any) => (registerCallback(t0, t1, t2, t3)).runNow()), removeCallback = js.Any.fromFunction1((t0: String) => removeCallback(t0).runNow()), removeClass = js.Any.fromFunction1((t0: String) => removeClass(t0).runNow()), show = show.toJsFn, text = text.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any], unparent = unparent.toJsFn, visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[Text]
  }
  
  extension [Self <: Text](x: Self) {
    
    inline def setRawHtml(value: String): Self = StObject.set(x, "rawHtml", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
