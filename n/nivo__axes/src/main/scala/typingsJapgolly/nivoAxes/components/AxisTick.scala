package typingsJapgolly.nivoAxes.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.SVGGElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.nivoAxes.distTypesTypesMod.AxisTickProps
import typingsJapgolly.nivoScales.distTypesTypesMod.ScaleValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AxisTick {
  
  inline def apply[Value /* <: ScaleValue */](
    animatedProps: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpringValues<{  opacity :number,   textTransform :string,   transform :string}> */ Any,
    lineX: Double,
    lineY: Double,
    textAnchor: String,
    textBaseline: String,
    textX: Double,
    textY: Double,
    tickIndex: Double,
    value: Value,
    x: Double,
    y: Double
  ): Builder[Value] = {
    val __props = js.Dynamic.literal(animatedProps = animatedProps.asInstanceOf[js.Any], lineX = lineX.asInstanceOf[js.Any], lineY = lineY.asInstanceOf[js.Any], textAnchor = textAnchor.asInstanceOf[js.Any], textBaseline = textBaseline.asInstanceOf[js.Any], textX = textX.asInstanceOf[js.Any], textY = textY.asInstanceOf[js.Any], tickIndex = tickIndex.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    new Builder[Value](js.Array(this.component, __props.asInstanceOf[AxisTickProps[Value]]))
  }
  
  @JSImport("@nivo/axes", "AxisTick")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[Value /* <: ScaleValue */] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def format(value: Value => Value | String): this.type = set("format", js.Any.fromFunction1(value))
    
    inline def onClick(value: (/* event */ ReactMouseEventFrom[SVGGElement], /* value */ Value | String) => Callback): this.type = set("onClick", js.Any.fromFunction2((t0: /* event */ ReactMouseEventFrom[SVGGElement], t1: /* value */ Value | String) => (value(t0, t1)).runNow()))
    
    inline def opacity(value: Double): this.type = set("opacity", value.asInstanceOf[js.Any])
    
    inline def rotate(value: Double): this.type = set("rotate", value.asInstanceOf[js.Any])
  }
  
  def withProps[Value /* <: ScaleValue */](p: AxisTickProps[Value]): Builder[Value] = new Builder[Value](js.Array(this.component, p.asInstanceOf[js.Any]))
}
