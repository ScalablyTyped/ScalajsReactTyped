package typingsJapgolly.wixStyleReact.anon

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.inverted
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.standard
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisabledOnClick extends StObject {
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  def onClick(): Unit
  
  var prefixIcon: js.UndefOr[japgolly.scalajs.react.facade.React.Element] = js.undefined
  
  var skin: js.UndefOr[standard | inverted] = js.undefined
  
  var suffixIcon: js.UndefOr[japgolly.scalajs.react.facade.React.Element] = js.undefined
  
  var text: String
}
object DisabledOnClick {
  
  inline def apply(onClick: Callback, text: String): DisabledOnClick = {
    val __obj = js.Dynamic.literal(onClick = onClick.toJsFn, text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisabledOnClick]
  }
  
  extension [Self <: DisabledOnClick](x: Self) {
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setOnClick(value: Callback): Self = StObject.set(x, "onClick", value.toJsFn)
    
    inline def setPrefixIcon(value: VdomElement): Self = StObject.set(x, "prefixIcon", value.rawElement.asInstanceOf[js.Any])
    
    inline def setPrefixIconUndefined: Self = StObject.set(x, "prefixIcon", js.undefined)
    
    inline def setSkin(value: standard | inverted): Self = StObject.set(x, "skin", value.asInstanceOf[js.Any])
    
    inline def setSkinUndefined: Self = StObject.set(x, "skin", js.undefined)
    
    inline def setSuffixIcon(value: VdomElement): Self = StObject.set(x, "suffixIcon", value.rawElement.asInstanceOf[js.Any])
    
    inline def setSuffixIconUndefined: Self = StObject.set(x, "suffixIcon", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
