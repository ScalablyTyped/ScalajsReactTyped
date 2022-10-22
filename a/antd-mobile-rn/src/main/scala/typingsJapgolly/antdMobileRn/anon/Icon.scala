package typingsJapgolly.antdMobileRn.anon

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.vdom.VdomElement
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.reactNative.mod.RegisteredStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Icon extends StObject {
  
  var icon: Element
  
  var mode: String
  
  def onClick(): Unit
  
  var styles: StringDictionary[RegisteredStyle[Any]]
}
object Icon {
  
  inline def apply(icon: VdomElement, mode: String, onClick: Callback, styles: StringDictionary[RegisteredStyle[Any]]): Icon = {
    val __obj = js.Dynamic.literal(icon = icon.rawElement.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], onClick = onClick.toJsFn, styles = styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[Icon]
  }
  
  extension [Self <: Icon](x: Self) {
    
    inline def setIcon(value: VdomElement): Self = StObject.set(x, "icon", value.rawElement.asInstanceOf[js.Any])
    
    inline def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setOnClick(value: Callback): Self = StObject.set(x, "onClick", value.toJsFn)
    
    inline def setStyles(value: StringDictionary[RegisteredStyle[Any]]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
  }
}
