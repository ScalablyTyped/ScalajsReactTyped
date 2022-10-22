package typingsJapgolly.braftEditor.anon

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.braftEditor.braftEditorStrings.modal
import typingsJapgolly.braftEditor.mod.ExtendControlType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Disabled
  extends StObject
     with ExtendControlType {
  
  var className: js.UndefOr[String] = js.undefined
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  var html: js.UndefOr[String | Null] = js.undefined
  
  var key: String
  
  var modal: BottomText
  
  var onClick: js.UndefOr[js.Function] = js.undefined
  
  var text: js.UndefOr[String | Node] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
  
  var `type`: modal
}
object Disabled {
  
  inline def apply(key: String, modal: BottomText): Disabled = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], modal = modal.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("modal")
    __obj.asInstanceOf[Disabled]
  }
  
  extension [Self <: Disabled](x: Self) {
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setHtml(value: String): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
    
    inline def setHtmlNull: Self = StObject.set(x, "html", null)
    
    inline def setHtmlUndefined: Self = StObject.set(x, "html", js.undefined)
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setModal(value: BottomText): Self = StObject.set(x, "modal", value.asInstanceOf[js.Any])
    
    inline def setOnClick(value: js.Function): Self = StObject.set(x, "onClick", value.asInstanceOf[js.Any])
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    inline def setText(value: String | Node): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextNull: Self = StObject.set(x, "text", null)
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setTextVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "text", js.Array(value*))
    
    inline def setTextVdomElement(value: VdomElement): Self = StObject.set(x, "text", value.rawElement.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setType(value: modal): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
