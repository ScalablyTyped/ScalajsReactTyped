package typingsJapgolly.reactNativePaper.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.TextStyle
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativePaper.anon.DeepPartialTheme
import typingsJapgolly.reactNativePaper.anon.PickPropslabelstylecoloro
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

object CheckboxItem {
  
  inline def apply(label: String, status: checked | unchecked | indeterminate): Builder = {
    val __props = js.Dynamic.literal(label = label.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[PickPropslabelstylecoloro]))
  }
  
  @JSImport("react-native-paper/lib/typescript/components/Checkbox/CheckboxItem", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def color(value: String): this.type = set("color", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def labelStyle(value: StyleProp[TextStyle]): this.type = set("labelStyle", value.asInstanceOf[js.Any])
    
    inline def labelStyleNull: this.type = set("labelStyle", null)
    
    inline def mode(value: android | ios): this.type = set("mode", value.asInstanceOf[js.Any])
    
    inline def onPress(value: Callback): this.type = set("onPress", value.toJsFn)
    
    inline def position(value: leading | trailing): this.type = set("position", value.asInstanceOf[js.Any])
    
    inline def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def styleNull: this.type = set("style", null)
    
    inline def testID(value: String): this.type = set("testID", value.asInstanceOf[js.Any])
    
    inline def theme(value: DeepPartialTheme): this.type = set("theme", value.asInstanceOf[js.Any])
    
    inline def uncheckedColor(value: String): this.type = set("uncheckedColor", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: PickPropslabelstylecoloro): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
