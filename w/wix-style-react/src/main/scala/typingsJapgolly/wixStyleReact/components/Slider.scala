package typingsJapgolly.wixStyleReact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactFocusEventFrom
import org.scalablytyped.runtime.NumberDictionary
import org.scalajs.dom.Element
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.wixStyleReact.distTypesSliderMod.SliderProps
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.horizontal
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.vertical
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Slider {
  
  inline def apply(onChange: js.Array[Double] | Double => Callback): Builder = {
    val __props = js.Dynamic.literal(onChange = js.Any.fromFunction1((t0: js.Array[Double] | Double) => onChange(t0).runNow()))
    new Builder(js.Array(this.component, __props.asInstanceOf[SliderProps]))
  }
  
  @JSImport("wix-style-react", "Slider")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.wixStyleReact.mod.Slider] {
    
    inline def allowCross(value: Boolean): this.type = set("allowCross", value.asInstanceOf[js.Any])
    
    inline def ariaLabelForHandle(value: js.Array[String] | String): this.type = set("ariaLabelForHandle", value.asInstanceOf[js.Any])
    
    inline def ariaLabelForHandleVarargs(value: String*): this.type = set("ariaLabelForHandle", js.Array(value*))
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def dataHook(value: String): this.type = set("dataHook", value.asInstanceOf[js.Any])
    
    inline def direction(value: vertical | horizontal): this.type = set("direction", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def displayMarks(value: Boolean): this.type = set("displayMarks", value.asInstanceOf[js.Any])
    
    inline def displayTooltip(value: Boolean): this.type = set("displayTooltip", value.asInstanceOf[js.Any])
    
    inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    inline def marks(value: NumberDictionary[Double | String]): this.type = set("marks", value.asInstanceOf[js.Any])
    
    inline def max(value: Double): this.type = set("max", value.asInstanceOf[js.Any])
    
    inline def min(value: Double): this.type = set("min", value.asInstanceOf[js.Any])
    
    inline def onAfterChange(value: /* value */ js.Array[Double] | Double => Callback): this.type = set("onAfterChange", js.Any.fromFunction1((t0: /* value */ js.Array[Double] | Double) => value(t0).runNow()))
    
    inline def onBeforeChange(value: /* value */ js.Array[Double] | Double => Callback): this.type = set("onBeforeChange", js.Any.fromFunction1((t0: /* value */ js.Array[Double] | Double) => value(t0).runNow()))
    
    inline def onBlur(
      value: (/* value */ js.Array[Double] | Double, /* event */ js.UndefOr[ReactFocusEventFrom[Element]]) => Callback
    ): this.type = set("onBlur", js.Any.fromFunction2((t0: /* value */ js.Array[Double] | Double, t1: /* event */ js.UndefOr[ReactFocusEventFrom[Element]]) => (value(t0, t1)).runNow()))
    
    inline def onFocus(
      value: (/* value */ js.Array[Double] | Double, /* event */ js.UndefOr[ReactFocusEventFrom[Element]]) => Callback
    ): this.type = set("onFocus", js.Any.fromFunction2((t0: /* value */ js.Array[Double] | Double, t1: /* event */ js.UndefOr[ReactFocusEventFrom[Element]]) => (value(t0, t1)).runNow()))
    
    inline def pushable(value: Boolean | Double): this.type = set("pushable", value.asInstanceOf[js.Any])
    
    inline def rtl(value: Boolean): this.type = set("rtl", value.asInstanceOf[js.Any])
    
    inline def startPoint(value: Double): this.type = set("startPoint", value.asInstanceOf[js.Any])
    
    inline def step(value: Double): this.type = set("step", value.asInstanceOf[js.Any])
    
    inline def value(value: js.Array[Double] | Double): this.type = set("value", value.asInstanceOf[js.Any])
    
    inline def valueVarargs(value: Double*): this.type = set("value", js.Array(value*))
  }
  
  def withProps(p: SliderProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
