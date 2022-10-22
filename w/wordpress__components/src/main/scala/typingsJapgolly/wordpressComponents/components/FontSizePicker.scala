package typingsJapgolly.wordpressComponents.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.wordpressComponents.fontSizePickerMod.FontSizePicker.FontSize
import typingsJapgolly.wordpressComponents.fontSizePickerMod.FontSizePicker.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FontSizePicker {
  
  inline def apply(onChange: js.UndefOr[Double] => Callback): Builder = {
    val __props = js.Dynamic.literal(onChange = js.Any.fromFunction1((t0: js.UndefOr[Double]) => onChange(t0).runNow()))
    new Builder(js.Array(this.component, __props.asInstanceOf[Props]))
  }
  
  @JSImport("@wordpress/components", "FontSizePicker")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def disableCustomFontSizes(value: Boolean): this.type = set("disableCustomFontSizes", value.asInstanceOf[js.Any])
    
    inline def fallbackFontSize(value: Double): this.type = set("fallbackFontSize", value.asInstanceOf[js.Any])
    
    inline def fontSizes(value: js.Array[FontSize]): this.type = set("fontSizes", value.asInstanceOf[js.Any])
    
    inline def fontSizesVarargs(value: FontSize*): this.type = set("fontSizes", js.Array(value*))
    
    inline def value(value: Double): this.type = set("value", value.asInstanceOf[js.Any])
    
    inline def withSlider(value: Boolean): this.type = set("withSlider", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
