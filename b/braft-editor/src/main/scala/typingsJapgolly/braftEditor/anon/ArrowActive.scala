package typingsJapgolly.braftEditor.anon

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.braftEditor.braftEditorStrings.dropdown
import typingsJapgolly.braftEditor.mod.ExtendControlType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArrowActive
  extends StObject
     with ExtendControlType {
  
  var arrowActive: js.UndefOr[Boolean] = js.undefined
  
  var autoHide: js.UndefOr[Boolean] = js.undefined
  
  var className: js.UndefOr[String] = js.undefined
  
  var component: Node
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  var html: js.UndefOr[String | Null] = js.undefined
  
  var key: String
  
  var showArrow: js.UndefOr[Boolean] = js.undefined
  
  var text: js.UndefOr[String | Node] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
  
  var `type`: dropdown
}
object ArrowActive {
  
  inline def apply(key: String): ArrowActive = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], component = null)
    __obj.updateDynamic("type")("dropdown")
    __obj.asInstanceOf[ArrowActive]
  }
  
  extension [Self <: ArrowActive](x: Self) {
    
    inline def setArrowActive(value: Boolean): Self = StObject.set(x, "arrowActive", value.asInstanceOf[js.Any])
    
    inline def setArrowActiveUndefined: Self = StObject.set(x, "arrowActive", js.undefined)
    
    inline def setAutoHide(value: Boolean): Self = StObject.set(x, "autoHide", value.asInstanceOf[js.Any])
    
    inline def setAutoHideUndefined: Self = StObject.set(x, "autoHide", js.undefined)
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setComponent(value: VdomNode): Self = StObject.set(x, "component", value.rawNode.asInstanceOf[js.Any])
    
    inline def setComponentNull: Self = StObject.set(x, "component", null)
    
    inline def setComponentVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "component", js.Array(value*))
    
    inline def setComponentVdomElement(value: VdomElement): Self = StObject.set(x, "component", value.rawElement.asInstanceOf[js.Any])
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setHtml(value: String): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
    
    inline def setHtmlNull: Self = StObject.set(x, "html", null)
    
    inline def setHtmlUndefined: Self = StObject.set(x, "html", js.undefined)
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setShowArrow(value: Boolean): Self = StObject.set(x, "showArrow", value.asInstanceOf[js.Any])
    
    inline def setShowArrowUndefined: Self = StObject.set(x, "showArrow", js.undefined)
    
    inline def setText(value: String | Node): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextNull: Self = StObject.set(x, "text", null)
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setTextVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "text", js.Array(value*))
    
    inline def setTextVdomElement(value: VdomElement): Self = StObject.set(x, "text", value.rawElement.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setType(value: dropdown): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
