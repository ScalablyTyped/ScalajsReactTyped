package typingsJapgolly.nivoAxes.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.SVGGElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.nivoAxes.anon.Length
import typingsJapgolly.nivoAxes.distTypesTypesMod.AxisLegendPosition
import typingsJapgolly.nivoAxes.distTypesTypesMod.AxisProps
import typingsJapgolly.nivoAxes.distTypesTypesMod.AxisTickProps
import typingsJapgolly.nivoAxes.distTypesTypesMod.ValueFormatter
import typingsJapgolly.nivoAxes.nivoAxesStrings.after
import typingsJapgolly.nivoAxes.nivoAxesStrings.before
import typingsJapgolly.nivoAxes.nivoAxesStrings.x
import typingsJapgolly.nivoAxes.nivoAxesStrings.y
import typingsJapgolly.nivoScales.distTypesTypesMod.AnyScale
import typingsJapgolly.nivoScales.distTypesTypesMod.ScaleValue
import typingsJapgolly.nivoScales.distTypesTypesMod.TicksSpec
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Axis {
  
  inline def apply[Value /* <: ScaleValue */](axis: x | y, length: Double, scale: AnyScale): Builder[Value] = {
    val __props = js.Dynamic.literal(axis = axis.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any])
    new Builder[Value](js.Array(this.component, __props.asInstanceOf[AxisProps[Value] & Length[Value]]))
  }
  
  @JSImport("@nivo/axes", "Axis")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[Value /* <: ScaleValue */] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def ariaHidden(value: Boolean): this.type = set("ariaHidden", value.asInstanceOf[js.Any])
    
    inline def format(value: String | ValueFormatter[Value]): this.type = set("format", value.asInstanceOf[js.Any])
    
    inline def formatFunction1(value: Value => Value | String): this.type = set("format", js.Any.fromFunction1(value))
    
    inline def legend(value: VdomNode): this.type = set("legend", value.rawNode.asInstanceOf[js.Any])
    
    inline def legendNull: this.type = set("legend", null)
    
    inline def legendOffset(value: Double): this.type = set("legendOffset", value.asInstanceOf[js.Any])
    
    inline def legendPosition(value: AxisLegendPosition): this.type = set("legendPosition", value.asInstanceOf[js.Any])
    
    inline def legendVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("legend", js.Array(value*))
    
    inline def legendVdomElement(value: VdomElement): this.type = set("legend", value.rawElement.asInstanceOf[js.Any])
    
    inline def onClick(value: (/* event */ ReactMouseEventFrom[SVGGElement], /* value */ String | Value) => Callback): this.type = set("onClick", js.Any.fromFunction2((t0: /* event */ ReactMouseEventFrom[SVGGElement], t1: /* value */ String | Value) => (value(t0, t1)).runNow()))
    
    inline def renderTick(value: /* props */ AxisTickProps[Value] => typingsJapgolly.react.mod.global.JSX.Element): this.type = set("renderTick", js.Any.fromFunction1(value))
    
    inline def tickPadding(value: Double): this.type = set("tickPadding", value.asInstanceOf[js.Any])
    
    inline def tickRotation(value: Double): this.type = set("tickRotation", value.asInstanceOf[js.Any])
    
    inline def tickSize(value: Double): this.type = set("tickSize", value.asInstanceOf[js.Any])
    
    inline def tickValues(value: TicksSpec[Value]): this.type = set("tickValues", value.asInstanceOf[js.Any])
    
    inline def tickValuesVarargs(value: Value*): this.type = set("tickValues", js.Array(value*))
    
    inline def ticksPosition(value: before | after): this.type = set("ticksPosition", value.asInstanceOf[js.Any])
    
    inline def x(value: Double): this.type = set("x", value.asInstanceOf[js.Any])
    
    inline def y(value: Double): this.type = set("y", value.asInstanceOf[js.Any])
  }
  
  def withProps[Value /* <: ScaleValue */](p: AxisProps[Value] & Length[Value]): Builder[Value] = new Builder[Value](js.Array(this.component, p.asInstanceOf[js.Any]))
}
