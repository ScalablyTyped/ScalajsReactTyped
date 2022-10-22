package typingsJapgolly.officeUiFabricReact.components

import japgolly.scalajs.react.Callback
import org.scalajs.dom.HTMLButtonElement
import org.scalajs.dom.KeyboardEvent
import org.scalajs.dom.MouseEvent
import org.scalajs.dom.TouchEvent
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.fluentuiTheme.libTypesIthemeMod.ITheme
import typingsJapgolly.officeUiFabricReact.libComponentsSliderSliderDottypesMod.ISlider
import typingsJapgolly.officeUiFabricReact.libComponentsSliderSliderDottypesMod.ISliderProps
import typingsJapgolly.officeUiFabricReact.libComponentsSliderSliderDottypesMod.ISliderStyleProps
import typingsJapgolly.officeUiFabricReact.libComponentsSliderSliderDottypesMod.ISliderStyles
import typingsJapgolly.react.mod.HTMLAttributes
import typingsJapgolly.uifabricMergeStyles.libDeepPartialMod.DeepPartial
import typingsJapgolly.uifabricMergeStyles.libIstylefunctionMod.IStyleFunctionOrObject
import typingsJapgolly.uifabricUtilities.libCreateRefMod.IRefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Slider {
  
  @JSImport("office-ui-fabric-react", "Slider")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[
          typingsJapgolly.officeUiFabricReact.libComponentsSliderSliderDotbaseMod.SliderBase
        ] {
    
    inline def ariaLabel(value: String): this.type = set("ariaLabel", value.asInstanceOf[js.Any])
    
    inline def ariaValueText(value: /* value */ Double => String): this.type = set("ariaValueText", js.Any.fromFunction1(value))
    
    inline def buttonProps(value: HTMLAttributes[HTMLButtonElement]): this.type = set("buttonProps", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def componentRef(value: IRefObject[ISlider]): this.type = set("componentRef", value.asInstanceOf[js.Any])
    
    inline def componentRefFunction1(value: /* ref */ ISlider | Null => Callback): this.type = set("componentRef", js.Any.fromFunction1((t0: /* ref */ ISlider | Null) => value(t0).runNow()))
    
    inline def defaultLowerValue(value: Double): this.type = set("defaultLowerValue", value.asInstanceOf[js.Any])
    
    inline def defaultValue(value: Double): this.type = set("defaultValue", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def label(value: String): this.type = set("label", value.asInstanceOf[js.Any])
    
    inline def lowerValue(value: Double): this.type = set("lowerValue", value.asInstanceOf[js.Any])
    
    inline def max(value: Double): this.type = set("max", value.asInstanceOf[js.Any])
    
    inline def min(value: Double): this.type = set("min", value.asInstanceOf[js.Any])
    
    inline def onChange(value: (/* value */ Double, /* range */ js.UndefOr[js.Tuple2[Double, Double]]) => Callback): this.type = set("onChange", js.Any.fromFunction2((t0: /* value */ Double, t1: /* range */ js.UndefOr[js.Tuple2[Double, Double]]) => (value(t0, t1)).runNow()))
    
    inline def onChanged(value: (/* event */ MouseEvent | TouchEvent | KeyboardEvent, /* value */ Double) => Callback): this.type = set("onChanged", js.Any.fromFunction2((t0: /* event */ MouseEvent | TouchEvent | KeyboardEvent, t1: /* value */ Double) => (value(t0, t1)).runNow()))
    
    inline def originFromZero(value: Boolean): this.type = set("originFromZero", value.asInstanceOf[js.Any])
    
    inline def ranged(value: Boolean): this.type = set("ranged", value.asInstanceOf[js.Any])
    
    inline def showValue(value: Boolean): this.type = set("showValue", value.asInstanceOf[js.Any])
    
    inline def snapToStep(value: Boolean): this.type = set("snapToStep", value.asInstanceOf[js.Any])
    
    inline def step(value: Double): this.type = set("step", value.asInstanceOf[js.Any])
    
    inline def styles(value: IStyleFunctionOrObject[ISliderStyleProps, ISliderStyles]): this.type = set("styles", value.asInstanceOf[js.Any])
    
    inline def stylesFunction1(value: ISliderStyleProps => DeepPartial[ISliderStyles]): this.type = set("styles", js.Any.fromFunction1(value))
    
    inline def theme(value: ITheme): this.type = set("theme", value.asInstanceOf[js.Any])
    
    inline def value(value: Double): this.type = set("value", value.asInstanceOf[js.Any])
    
    inline def valueFormat(value: /* value */ Double => String): this.type = set("valueFormat", js.Any.fromFunction1(value))
    
    inline def vertical(value: Boolean): this.type = set("vertical", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Slider.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ISliderProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
