package typingsJapgolly.reactNativeSvgCharts.components

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.d3Scale.mod.ScaleBand_
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativeSvgCharts.anon.Left
import typingsJapgolly.reactNativeSvgCharts.anon.PartialTextProps
import typingsJapgolly.reactNativeSvgCharts.mod.AccessorFunctionProps
import typingsJapgolly.reactNativeSvgCharts.mod.ScaleType
import typingsJapgolly.reactNativeSvgCharts.mod.XAxisProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object XAxis {
  
  inline def apply[T](data: js.Array[T]): Builder[T] = {
    val __props = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    new Builder[T](js.Array(this.component, __props.asInstanceOf[XAxisProps[T]]))
  }
  
  @JSImport("react-native-svg-charts", "XAxis")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[T] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactNativeSvgCharts.mod.XAxis[T]] {
    
    inline def contentInset(value: Left): this.type = set("contentInset", value.asInstanceOf[js.Any])
    
    inline def formatLabel(value: (/* value */ Any, /* index */ Double) => Double | String): this.type = set("formatLabel", js.Any.fromFunction2(value))
    
    inline def numberOfTicks(value: Double): this.type = set("numberOfTicks", value.asInstanceOf[js.Any])
    
    inline def scale(value: CallbackTo[(ScaleType[Any, Any]) | ScaleBand_[Any]]): this.type = set("scale", value.toJsFn)
    
    inline def spacingInner(value: Double): this.type = set("spacingInner", value.asInstanceOf[js.Any])
    
    inline def spacingOuter(value: Double): this.type = set("spacingOuter", value.asInstanceOf[js.Any])
    
    inline def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def styleNull: this.type = set("style", null)
    
    inline def svg(value: PartialTextProps): this.type = set("svg", value.asInstanceOf[js.Any])
    
    inline def xAccessor(value: /* props */ AccessorFunctionProps[T] => Any): this.type = set("xAccessor", js.Any.fromFunction1(value))
  }
  
  def withProps[T](p: XAxisProps[T]): Builder[T] = new Builder[T](js.Array(this.component, p.asInstanceOf[js.Any]))
}
