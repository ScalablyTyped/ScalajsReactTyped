package typingsJapgolly.reactSlider.components

import japgolly.scalajs.react.Callback
import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.HTMLSpanElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.reactSlider.anon.Index
import typingsJapgolly.reactSlider.anon.Value
import typingsJapgolly.reactSlider.mod.HTMLPropsWithRefCallback
import typingsJapgolly.reactSlider.mod.ReactSliderProps
import typingsJapgolly.reactSlider.mod.default
import typingsJapgolly.reactSlider.reactSliderStrings.horizontal
import typingsJapgolly.reactSlider.reactSliderStrings.vertical
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactSlider {
  
  inline def apply[T /* <: Double | js.Array[Double] */](): Builder[T] = {
    val __props = js.Dynamic.literal()
    new Builder[T](js.Array(this.component, __props.asInstanceOf[ReactSliderProps[T]]))
  }
  
  @JSImport("react-slider", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[T /* <: Double | js.Array[Double] */] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default[T]] {
    
    inline def ariaLabel(
      value: /* import warning: importer.ImportType#apply Failed type conversion: T extends number ? string : std.ReadonlyArray<string> | undefined */ js.Any
    ): this.type = set("ariaLabel", value.asInstanceOf[js.Any])
    
    inline def ariaLabelledby(
      value: /* import warning: importer.ImportType#apply Failed type conversion: T extends number ? string : std.ReadonlyArray<string> | undefined */ js.Any
    ): this.type = set("ariaLabelledby", value.asInstanceOf[js.Any])
    
    inline def ariaValuetext(value: String | (js.Function1[/* value */ Index[T], String])): this.type = set("ariaValuetext", value.asInstanceOf[js.Any])
    
    inline def ariaValuetextFunction1(value: /* value */ Index[T] => String): this.type = set("ariaValuetext", js.Any.fromFunction1(value))
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def defaultValue(
      value: /* import warning: importer.ImportType#apply Failed type conversion: this['value'] extends T ? never : T */ js.Any
    ): this.type = set("defaultValue", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def invert(value: Boolean): this.type = set("invert", value.asInstanceOf[js.Any])
    
    inline def markClassName(value: String): this.type = set("markClassName", value.asInstanceOf[js.Any])
    
    inline def marks(value: Boolean | Double | js.Array[Double]): this.type = set("marks", value.asInstanceOf[js.Any])
    
    inline def marksVarargs(value: Double*): this.type = set("marks", js.Array(value*))
    
    inline def max(value: Double): this.type = set("max", value.asInstanceOf[js.Any])
    
    inline def min(value: Double): this.type = set("min", value.asInstanceOf[js.Any])
    
    inline def minDistance(value: Double): this.type = set("minDistance", value.asInstanceOf[js.Any])
    
    inline def onAfterChange(value: (T, /* index */ Double) => Callback): this.type = set("onAfterChange", js.Any.fromFunction2((t0: T, t1: /* index */ Double) => (value(t0, t1)).runNow()))
    
    inline def onBeforeChange(value: (T, /* index */ Double) => Callback): this.type = set("onBeforeChange", js.Any.fromFunction2((t0: T, t1: /* index */ Double) => (value(t0, t1)).runNow()))
    
    inline def onChange(value: (T, /* index */ Double) => Callback): this.type = set("onChange", js.Any.fromFunction2((t0: T, t1: /* index */ Double) => (value(t0, t1)).runNow()))
    
    inline def onSliderClick(value: /* value */ Double => Callback): this.type = set("onSliderClick", js.Any.fromFunction1((t0: /* value */ Double) => value(t0).runNow()))
    
    inline def orientation(value: horizontal | vertical): this.type = set("orientation", value.asInstanceOf[js.Any])
    
    inline def pageFn(value: /* step */ Double => Double): this.type = set("pageFn", js.Any.fromFunction1(value))
    
    inline def pearling(value: Boolean): this.type = set("pearling", value.asInstanceOf[js.Any])
    
    inline def renderMark(value: /* props */ HTMLPropsWithRefCallback[HTMLSpanElement] => Element | Null): this.type = set("renderMark", js.Any.fromFunction1(value))
    
    inline def renderThumb(
      value: (/* props */ HTMLPropsWithRefCallback[HTMLDivElement], /* state */ Index[T]) => Element | Null
    ): this.type = set("renderThumb", js.Any.fromFunction2(value))
    
    inline def renderTrack(
      value: (/* props */ HTMLPropsWithRefCallback[HTMLDivElement], /* state */ Value[T]) => Element | Null
    ): this.type = set("renderTrack", js.Any.fromFunction2(value))
    
    inline def snapDragDisabled(value: Boolean): this.type = set("snapDragDisabled", value.asInstanceOf[js.Any])
    
    inline def step(value: Double): this.type = set("step", value.asInstanceOf[js.Any])
    
    inline def thumbActiveClassName(value: String): this.type = set("thumbActiveClassName", value.asInstanceOf[js.Any])
    
    inline def thumbClassName(value: String): this.type = set("thumbClassName", value.asInstanceOf[js.Any])
    
    inline def trackClassName(value: String): this.type = set("trackClassName", value.asInstanceOf[js.Any])
    
    inline def value(value: T): this.type = set("value", value.asInstanceOf[js.Any])
    
    inline def withTracks(value: Boolean): this.type = set("withTracks", value.asInstanceOf[js.Any])
  }
  
  implicit def make[T /* <: Double | js.Array[Double] */](companion: ReactSlider.type): Builder[T] = new Builder[T](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps[T /* <: Double | js.Array[Double] */](p: ReactSliderProps[T]): Builder[T] = new Builder[T](js.Array(this.component, p.asInstanceOf[js.Any]))
}
