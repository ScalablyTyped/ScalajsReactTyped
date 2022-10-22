package typingsJapgolly.reactNativePaper.anon

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.reactNative.mod.LayoutChangeEvent
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.TextStyle
import typingsJapgolly.reactNativePaper.libTypescriptComponentsTextInputAdornmentEnumsMod.AdornmentSide
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  affix :react.react.ReactNode,   testID :string} & react-native-paper.react-native-paper/lib/typescript/components/TextInput/Adornment/TextInputAffix.ContextState */
trait affixReactNodetestIDstrin extends StObject {
  
  var affix: Node
  
  var maxFontSizeMultiplier: js.UndefOr[Double | Null] = js.undefined
  
  var onLayout: js.UndefOr[js.Function1[/* event */ LayoutChangeEvent, Unit]] = js.undefined
  
  var paddingHorizontal: js.UndefOr[Double | String] = js.undefined
  
  var side: AdornmentSide
  
  var testID: String
  
  var textStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  
  var topPosition: Double | Null
  
  var visible: js.UndefOr[typingsJapgolly.reactNative.mod.Animated.Value] = js.undefined
}
object affixReactNodetestIDstrin {
  
  inline def apply(side: AdornmentSide, testID: String): affixReactNodetestIDstrin = {
    val __obj = js.Dynamic.literal(side = side.asInstanceOf[js.Any], testID = testID.asInstanceOf[js.Any], affix = null, topPosition = null)
    __obj.asInstanceOf[affixReactNodetestIDstrin]
  }
  
  extension [Self <: affixReactNodetestIDstrin](x: Self) {
    
    inline def setAffix(value: VdomNode): Self = StObject.set(x, "affix", value.rawNode.asInstanceOf[js.Any])
    
    inline def setAffixNull: Self = StObject.set(x, "affix", null)
    
    inline def setAffixVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "affix", js.Array(value*))
    
    inline def setAffixVdomElement(value: VdomElement): Self = StObject.set(x, "affix", value.rawElement.asInstanceOf[js.Any])
    
    inline def setMaxFontSizeMultiplier(value: Double): Self = StObject.set(x, "maxFontSizeMultiplier", value.asInstanceOf[js.Any])
    
    inline def setMaxFontSizeMultiplierNull: Self = StObject.set(x, "maxFontSizeMultiplier", null)
    
    inline def setMaxFontSizeMultiplierUndefined: Self = StObject.set(x, "maxFontSizeMultiplier", js.undefined)
    
    inline def setOnLayout(value: /* event */ LayoutChangeEvent => Callback): Self = StObject.set(x, "onLayout", js.Any.fromFunction1((t0: /* event */ LayoutChangeEvent) => value(t0).runNow()))
    
    inline def setOnLayoutUndefined: Self = StObject.set(x, "onLayout", js.undefined)
    
    inline def setPaddingHorizontal(value: Double | String): Self = StObject.set(x, "paddingHorizontal", value.asInstanceOf[js.Any])
    
    inline def setPaddingHorizontalUndefined: Self = StObject.set(x, "paddingHorizontal", js.undefined)
    
    inline def setSide(value: AdornmentSide): Self = StObject.set(x, "side", value.asInstanceOf[js.Any])
    
    inline def setTestID(value: String): Self = StObject.set(x, "testID", value.asInstanceOf[js.Any])
    
    inline def setTextStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "textStyle", value.asInstanceOf[js.Any])
    
    inline def setTextStyleNull: Self = StObject.set(x, "textStyle", null)
    
    inline def setTextStyleUndefined: Self = StObject.set(x, "textStyle", js.undefined)
    
    inline def setTopPosition(value: Double): Self = StObject.set(x, "topPosition", value.asInstanceOf[js.Any])
    
    inline def setTopPositionNull: Self = StObject.set(x, "topPosition", null)
    
    inline def setVisible(value: typingsJapgolly.reactNative.mod.Animated.Value): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
