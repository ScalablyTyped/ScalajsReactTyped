package typingsJapgolly.reactNavigationStack

import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.reactNative.mod.Animated.WithAnimatedValue
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewProps
import typingsJapgolly.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptSrcVendorViewsHeaderHeaderBackgroundMod {
  
  @JSImport("react-navigation-stack/lib/typescript/src/vendor/views/Header/HeaderBackground", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(hasStyleRest: Props): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasStyleRest.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait Props
    extends StObject
       with ViewProps {
    
    @JSName("style")
    var style_Props: js.UndefOr[WithAnimatedValue[StyleProp[ViewStyle]]] = js.undefined
  }
  object Props {
    
    inline def apply(): Props = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setStyle(value: WithAnimatedValue[StyleProp[ViewStyle]]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
