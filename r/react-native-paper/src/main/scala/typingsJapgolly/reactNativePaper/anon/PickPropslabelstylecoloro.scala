package typingsJapgolly.reactNativePaper.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.TextStyle
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativePaper.reactNativePaperStrings.android
import typingsJapgolly.reactNativePaper.reactNativePaperStrings.checked
import typingsJapgolly.reactNativePaper.reactNativePaperStrings.indeterminate
import typingsJapgolly.reactNativePaper.reactNativePaperStrings.ios
import typingsJapgolly.reactNativePaper.reactNativePaperStrings.leading
import typingsJapgolly.reactNativePaper.reactNativePaperStrings.trailing
import typingsJapgolly.reactNativePaper.reactNativePaperStrings.unchecked
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<react-native-paper.react-native-paper/lib/typescript/components/Checkbox/CheckboxItem.Props, 'label' | 'style' | 'color' | 'onPress' | 'testID' | 'position' | 'mode' | 'labelStyle' | 'disabled' | 'status' | 'uncheckedColor'> & {  theme :@callstack/react-theme-provider.@callstack/react-theme-provider.$DeepPartial<react-native-paper.react-native-paper/lib/typescript/types.<global>.ReactNativePaper.Theme> | undefined} */
trait PickPropslabelstylecoloro extends StObject {
  
  var color: js.UndefOr[String] = js.undefined
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  var label: String
  
  var labelStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  
  var mode: js.UndefOr[android | ios] = js.undefined
  
  var onPress: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var position: js.UndefOr[leading | trailing] = js.undefined
  
  var status: checked | unchecked | indeterminate
  
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  var testID: js.UndefOr[String] = js.undefined
  
  var theme: js.UndefOr[DeepPartialTheme] = js.undefined
  
  var uncheckedColor: js.UndefOr[String] = js.undefined
}
object PickPropslabelstylecoloro {
  
  inline def apply(label: String, status: checked | unchecked | indeterminate): PickPropslabelstylecoloro = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickPropslabelstylecoloro]
  }
  
  extension [Self <: PickPropslabelstylecoloro](x: Self) {
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "labelStyle", value.asInstanceOf[js.Any])
    
    inline def setLabelStyleNull: Self = StObject.set(x, "labelStyle", null)
    
    inline def setLabelStyleUndefined: Self = StObject.set(x, "labelStyle", js.undefined)
    
    inline def setMode(value: android | ios): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setOnPress(value: Callback): Self = StObject.set(x, "onPress", value.toJsFn)
    
    inline def setOnPressUndefined: Self = StObject.set(x, "onPress", js.undefined)
    
    inline def setPosition(value: leading | trailing): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setStatus(value: checked | unchecked | indeterminate): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleNull: Self = StObject.set(x, "style", null)
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setTestID(value: String): Self = StObject.set(x, "testID", value.asInstanceOf[js.Any])
    
    inline def setTestIDUndefined: Self = StObject.set(x, "testID", js.undefined)
    
    inline def setTheme(value: DeepPartialTheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    
    inline def setUncheckedColor(value: String): Self = StObject.set(x, "uncheckedColor", value.asInstanceOf[js.Any])
    
    inline def setUncheckedColorUndefined: Self = StObject.set(x, "uncheckedColor", js.undefined)
  }
}
