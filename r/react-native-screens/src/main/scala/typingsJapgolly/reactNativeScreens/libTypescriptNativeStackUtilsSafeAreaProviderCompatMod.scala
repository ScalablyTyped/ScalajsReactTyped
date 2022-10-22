package typingsJapgolly.reactNativeScreens

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativeSafeAreaContext.libTypescriptSafeAreaDottypesMod.Metrics
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptNativeStackUtilsSafeAreaProviderCompatMod {
  
  object default {
    
    inline def apply(hasChildrenStyle: Props): Element = ^.asInstanceOf[js.Dynamic].apply(hasChildrenStyle.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("react-native-screens/lib/typescript/native-stack/utils/SafeAreaProviderCompat", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-native-screens/lib/typescript/native-stack/utils/SafeAreaProviderCompat", "default.initialMetrics")
    @js.native
    def initialMetrics: Metrics = js.native
    inline def initialMetrics_=(x: Metrics): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("initialMetrics")(x.asInstanceOf[js.Any])
  }
  
  trait Props extends StObject {
    
    var children: Node
    
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  }
  object Props {
    
    inline def apply(): Props = {
      val __obj = js.Dynamic.literal(children = null)
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleNull: Self = StObject.set(x, "style", null)
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
