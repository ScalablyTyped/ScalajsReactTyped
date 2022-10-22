package typingsJapgolly.reactNativePaper

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.FunctionComponent
import typingsJapgolly.reactNative.mod.Animated.Value
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.TextStyle
import typingsJapgolly.reactNativePaper.anon.Affix
import typingsJapgolly.reactNativePaper.anon.LeftRight
import typingsJapgolly.reactNativePaper.anon.`2`
import typingsJapgolly.reactNativePaper.libTypescriptComponentsTextInputAdornmentTypesMod.AdornmentConfig
import typingsJapgolly.reactNativePaper.libTypescriptComponentsTextInputAdornmentTypesMod.AdornmentStyleAdjustmentForNativeInput
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptComponentsTextInputAdornmentTextInputAdornmentMod {
  
  @JSImport("react-native-paper/lib/typescript/components/TextInput/Adornment/TextInputAdornment", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-native-paper/lib/typescript/components/TextInput/Adornment/TextInputAdornment", JSImport.Default)
  @js.native
  val default: FunctionComponent[TextInputAdornmentProps] = js.native
  
  inline def getAdornmentConfig(hasLeftRight: `2`): js.Array[AdornmentConfig] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAdornmentConfig")(hasLeftRight.asInstanceOf[js.Any]).asInstanceOf[js.Array[AdornmentConfig]]
  
  inline def getAdornmentStyleAdjustmentForNativeInput(
    hasAdornmentConfigLeftAffixWidthRightAffixWidthPaddingHorizontalInputOffsetMode: typingsJapgolly.reactNativePaper.anon.AdornmentConfig
  ): AdornmentStyleAdjustmentForNativeInput | js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("getAdornmentStyleAdjustmentForNativeInput")(hasAdornmentConfigLeftAffixWidthRightAffixWidthPaddingHorizontalInputOffsetMode.asInstanceOf[js.Any]).asInstanceOf[AdornmentStyleAdjustmentForNativeInput | js.Object]
  
  trait TextInputAdornmentProps extends StObject {
    
    var adornmentConfig: js.Array[AdornmentConfig]
    
    def forceFocus(): Unit
    
    var isTextInputFocused: Boolean
    
    var left: js.UndefOr[Node] = js.undefined
    
    var maxFontSizeMultiplier: js.UndefOr[Double | Null] = js.undefined
    
    var onAffixChange: LeftRight
    
    var paddingHorizontal: js.UndefOr[Double | String] = js.undefined
    
    var right: js.UndefOr[Node] = js.undefined
    
    var textStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
    
    var topPosition: Affix
    
    var visible: js.UndefOr[Value] = js.undefined
  }
  object TextInputAdornmentProps {
    
    inline def apply(
      adornmentConfig: js.Array[AdornmentConfig],
      forceFocus: Callback,
      isTextInputFocused: Boolean,
      onAffixChange: LeftRight,
      topPosition: Affix
    ): TextInputAdornmentProps = {
      val __obj = js.Dynamic.literal(adornmentConfig = adornmentConfig.asInstanceOf[js.Any], forceFocus = forceFocus.toJsFn, isTextInputFocused = isTextInputFocused.asInstanceOf[js.Any], onAffixChange = onAffixChange.asInstanceOf[js.Any], topPosition = topPosition.asInstanceOf[js.Any])
      __obj.asInstanceOf[TextInputAdornmentProps]
    }
    
    extension [Self <: TextInputAdornmentProps](x: Self) {
      
      inline def setAdornmentConfig(value: js.Array[AdornmentConfig]): Self = StObject.set(x, "adornmentConfig", value.asInstanceOf[js.Any])
      
      inline def setAdornmentConfigVarargs(value: AdornmentConfig*): Self = StObject.set(x, "adornmentConfig", js.Array(value*))
      
      inline def setForceFocus(value: Callback): Self = StObject.set(x, "forceFocus", value.toJsFn)
      
      inline def setIsTextInputFocused(value: Boolean): Self = StObject.set(x, "isTextInputFocused", value.asInstanceOf[js.Any])
      
      inline def setLeft(value: VdomNode): Self = StObject.set(x, "left", value.rawNode.asInstanceOf[js.Any])
      
      inline def setLeftNull: Self = StObject.set(x, "left", null)
      
      inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      inline def setLeftVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "left", js.Array(value*))
      
      inline def setLeftVdomElement(value: VdomElement): Self = StObject.set(x, "left", value.rawElement.asInstanceOf[js.Any])
      
      inline def setMaxFontSizeMultiplier(value: Double): Self = StObject.set(x, "maxFontSizeMultiplier", value.asInstanceOf[js.Any])
      
      inline def setMaxFontSizeMultiplierNull: Self = StObject.set(x, "maxFontSizeMultiplier", null)
      
      inline def setMaxFontSizeMultiplierUndefined: Self = StObject.set(x, "maxFontSizeMultiplier", js.undefined)
      
      inline def setOnAffixChange(value: LeftRight): Self = StObject.set(x, "onAffixChange", value.asInstanceOf[js.Any])
      
      inline def setPaddingHorizontal(value: Double | String): Self = StObject.set(x, "paddingHorizontal", value.asInstanceOf[js.Any])
      
      inline def setPaddingHorizontalUndefined: Self = StObject.set(x, "paddingHorizontal", js.undefined)
      
      inline def setRight(value: VdomNode): Self = StObject.set(x, "right", value.rawNode.asInstanceOf[js.Any])
      
      inline def setRightNull: Self = StObject.set(x, "right", null)
      
      inline def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
      
      inline def setRightVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "right", js.Array(value*))
      
      inline def setRightVdomElement(value: VdomElement): Self = StObject.set(x, "right", value.rawElement.asInstanceOf[js.Any])
      
      inline def setTextStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "textStyle", value.asInstanceOf[js.Any])
      
      inline def setTextStyleNull: Self = StObject.set(x, "textStyle", null)
      
      inline def setTextStyleUndefined: Self = StObject.set(x, "textStyle", js.undefined)
      
      inline def setTopPosition(value: Affix): Self = StObject.set(x, "topPosition", value.asInstanceOf[js.Any])
      
      inline def setVisible(value: Value): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
}
