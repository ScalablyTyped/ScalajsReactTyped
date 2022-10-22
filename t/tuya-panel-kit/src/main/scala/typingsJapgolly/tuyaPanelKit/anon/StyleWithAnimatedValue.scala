package typingsJapgolly.tuyaPanelKit.anon

import typingsJapgolly.reactNative.mod.Animated.WithAnimatedValue
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StyleWithAnimatedValue extends StObject {
  
  var style: WithAnimatedValue[StyleProp[ViewStyle]]
}
object StyleWithAnimatedValue {
  
  inline def apply(style: WithAnimatedValue[StyleProp[ViewStyle]]): StyleWithAnimatedValue = {
    val __obj = js.Dynamic.literal(style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[StyleWithAnimatedValue]
  }
  
  extension [Self <: StyleWithAnimatedValue](x: Self) {
    
    inline def setStyle(value: WithAnimatedValue[StyleProp[ViewStyle]]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
  }
}
