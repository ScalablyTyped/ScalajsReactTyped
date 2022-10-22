package typingsJapgolly.tuyaPanelKit.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.tuyaPanelKit.anon.DividerColor
import typingsJapgolly.tuyaPanelKit.mod.PickerViewProps
import typingsJapgolly.tuyaPanelKit.tuyaPanelKitStrings.`DIN Alternate`
import typingsJapgolly.tuyaPanelKit.tuyaPanelKitStrings.`PingFangHK-Medium`
import typingsJapgolly.tuyaPanelKit.tuyaPanelKitStrings.`PingFangHK-Regular`
import typingsJapgolly.tuyaPanelKit.tuyaPanelKitStrings.`Times New Roman`
import typingsJapgolly.tuyaPanelKit.tuyaPanelKitStrings.`flex-end`
import typingsJapgolly.tuyaPanelKit.tuyaPanelKitStrings.`flex-start`
import typingsJapgolly.tuyaPanelKit.tuyaPanelKitStrings.baseline
import typingsJapgolly.tuyaPanelKit.tuyaPanelKitStrings.center
import typingsJapgolly.tuyaPanelKit.tuyaPanelKitStrings.stretch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Picker {
  
  @JSImport("tuya-panel-kit", "Picker")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.tuyaPanelKit.mod.Picker] {
    
    inline def accessibilityLabel(value: String): this.type = set("accessibilityLabel", value.asInstanceOf[js.Any])
    
    inline def dividerColor(value: String): this.type = set("dividerColor", value.asInstanceOf[js.Any])
    
    inline def fontFamily(
      value: (`DIN Alternate`) | (`Times New Roman`) | `PingFangHK-Regular` | `PingFangHK-Medium` | String
    ): this.type = set("fontFamily", value.asInstanceOf[js.Any])
    
    inline def fontWeight(value: String): this.type = set("fontWeight", value.asInstanceOf[js.Any])
    
    inline def itemAlign(value: `flex-end` | center | `flex-start` | baseline | stretch): this.type = set("itemAlign", value.asInstanceOf[js.Any])
    
    inline def itemPadding(value: Double): this.type = set("itemPadding", value.asInstanceOf[js.Any])
    
    inline def itemTextColor(value: String): this.type = set("itemTextColor", value.asInstanceOf[js.Any])
    
    inline def loop(value: Boolean): this.type = set("loop", value.asInstanceOf[js.Any])
    
    inline def onValueChange(value: (/* value */ String | Double, /* index */ Double) => Callback): this.type = set("onValueChange", js.Any.fromFunction2((t0: /* value */ String | Double, t1: /* index */ Double) => (value(t0, t1)).runNow()))
    
    inline def selectedItemTextColor(value: String): this.type = set("selectedItemTextColor", value.asInstanceOf[js.Any])
    
    inline def selectedValue(value: String): this.type = set("selectedValue", value.asInstanceOf[js.Any])
    
    inline def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def styleNull: this.type = set("style", null)
    
    inline def textSize(value: Double): this.type = set("textSize", value.asInstanceOf[js.Any])
    
    inline def theme(value: DividerColor): this.type = set("theme", value.asInstanceOf[js.Any])
    
    inline def useTYRCTPicker(value: Boolean): this.type = set("useTYRCTPicker", value.asInstanceOf[js.Any])
    
    inline def visibleItemCount(value: Double): this.type = set("visibleItemCount", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Picker.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: PickerViewProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
