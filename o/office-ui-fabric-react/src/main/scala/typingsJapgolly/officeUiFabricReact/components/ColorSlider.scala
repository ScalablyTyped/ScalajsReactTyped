package typingsJapgolly.officeUiFabricReact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.Element
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.fluentuiTheme.libTypesIthemeMod.ITheme
import typingsJapgolly.officeUiFabricReact.libComponentsColorPickerColorSliderColorSliderDottypesMod.IColorSlider
import typingsJapgolly.officeUiFabricReact.libComponentsColorPickerColorSliderColorSliderDottypesMod.IColorSliderProps
import typingsJapgolly.officeUiFabricReact.libComponentsColorPickerColorSliderColorSliderDottypesMod.IColorSliderStyleProps
import typingsJapgolly.officeUiFabricReact.libComponentsColorPickerColorSliderColorSliderDottypesMod.IColorSliderStyles
import typingsJapgolly.officeUiFabricReact.officeUiFabricReactStrings.alpha
import typingsJapgolly.officeUiFabricReact.officeUiFabricReactStrings.hue
import typingsJapgolly.officeUiFabricReact.officeUiFabricReactStrings.transparency
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.uifabricMergeStyles.libDeepPartialMod.DeepPartial
import typingsJapgolly.uifabricMergeStyles.libIstylefunctionMod.IStyleFunctionOrObject
import typingsJapgolly.uifabricUtilities.libCreateRefMod.IRefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ColorSlider {
  
  @JSImport("office-ui-fabric-react/lib/components/ColorPicker/ColorSlider/ColorSlider", "ColorSlider")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def ariaLabel(value: String): this.type = set("ariaLabel", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def componentRef(value: IRefObject[IColorSlider]): this.type = set("componentRef", value.asInstanceOf[js.Any])
    
    inline def componentRefFunction1(value: /* ref */ IColorSlider | Null => Callback): this.type = set("componentRef", js.Any.fromFunction1((t0: /* ref */ IColorSlider | Null) => value(t0).runNow()))
    
    inline def isAlpha(value: Boolean): this.type = set("isAlpha", value.asInstanceOf[js.Any])
    
    inline def maxValue(value: Double): this.type = set("maxValue", value.asInstanceOf[js.Any])
    
    inline def minValue(value: Double): this.type = set("minValue", value.asInstanceOf[js.Any])
    
    inline def onChange(
      value: (/* event */ ReactMouseEventFrom[Element] | ReactKeyboardEventFrom[Element], /* newValue */ js.UndefOr[Double]) => Callback
    ): this.type = set("onChange", js.Any.fromFunction2((t0: /* event */ ReactMouseEventFrom[Element] | ReactKeyboardEventFrom[Element], t1: /* newValue */ js.UndefOr[Double]) => (value(t0, t1)).runNow()))
    
    inline def overlayColor(value: String): this.type = set("overlayColor", value.asInstanceOf[js.Any])
    
    inline def overlayStyle(value: CSSProperties): this.type = set("overlayStyle", value.asInstanceOf[js.Any])
    
    inline def styles(value: IStyleFunctionOrObject[IColorSliderStyleProps, IColorSliderStyles]): this.type = set("styles", value.asInstanceOf[js.Any])
    
    inline def stylesFunction1(value: IColorSliderStyleProps => DeepPartial[IColorSliderStyles]): this.type = set("styles", js.Any.fromFunction1(value))
    
    inline def theme(value: ITheme): this.type = set("theme", value.asInstanceOf[js.Any])
    
    inline def thumbColor(value: String): this.type = set("thumbColor", value.asInstanceOf[js.Any])
    
    inline def `type`(value: hue | alpha | transparency): this.type = set("type", value.asInstanceOf[js.Any])
    
    inline def value(value: Double): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ColorSlider.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: IColorSliderProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
