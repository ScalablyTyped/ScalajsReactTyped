package typingsJapgolly.antdMobileRn.anon

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactNative.mod.RegisteredStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ButtonClick extends StObject {
  
  def buttonClick(): Unit
  
  var buttonType: String
  
  var styles: StringDictionary[RegisteredStyle[Any]]
}
object ButtonClick {
  
  inline def apply(buttonClick: Callback, buttonType: String, styles: StringDictionary[RegisteredStyle[Any]]): ButtonClick = {
    val __obj = js.Dynamic.literal(buttonClick = buttonClick.toJsFn, buttonType = buttonType.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[ButtonClick]
  }
  
  extension [Self <: ButtonClick](x: Self) {
    
    inline def setButtonClick(value: Callback): Self = StObject.set(x, "buttonClick", value.toJsFn)
    
    inline def setButtonType(value: String): Self = StObject.set(x, "buttonType", value.asInstanceOf[js.Any])
    
    inline def setStyles(value: StringDictionary[RegisteredStyle[Any]]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
  }
}
