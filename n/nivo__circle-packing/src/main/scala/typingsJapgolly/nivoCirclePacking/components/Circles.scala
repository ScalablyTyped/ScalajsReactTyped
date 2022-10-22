package typingsJapgolly.nivoCirclePacking.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.nivoCirclePacking.distTypesCirclesMod.CirclesProps
import typingsJapgolly.nivoCirclePacking.distTypesTypesMod.CircleProps
import typingsJapgolly.nivoCirclePacking.distTypesTypesMod.ComputedDatum
import typingsJapgolly.nivoColors.distTypesInheritedColorMod.InheritedColorConfig
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Circles {
  
  inline def apply[RawDatum](
    borderColor: InheritedColorConfig[ComputedDatum[RawDatum]],
    borderWidth: Double,
    component: /* props */ CircleProps[RawDatum] => Element,
    isInteractive: Boolean,
    nodes: js.Array[ComputedDatum[RawDatum]],
    tooltip: /* props */ ComputedDatum[RawDatum] => Element
  ): Builder[RawDatum] = {
    val __props = js.Dynamic.literal(borderColor = borderColor.asInstanceOf[js.Any], borderWidth = borderWidth.asInstanceOf[js.Any], component = js.Any.fromFunction1(component), isInteractive = isInteractive.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any], tooltip = js.Any.fromFunction1(tooltip))
    new Builder[RawDatum](js.Array(this.component, __props.asInstanceOf[CirclesProps[RawDatum]]))
  }
  
  @JSImport("@nivo/circle-packing/dist/types/Circles", "Circles")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[RawDatum] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def onClick(
      value: (/* datum */ ComputedDatum[RawDatum], /* event */ ReactMouseEventFrom[org.scalajs.dom.Element]) => Callback
    ): this.type = set("onClick", js.Any.fromFunction2((t0: /* datum */ ComputedDatum[RawDatum], t1: /* event */ ReactMouseEventFrom[org.scalajs.dom.Element]) => (value(t0, t1)).runNow()))
    
    inline def onMouseEnter(
      value: (/* datum */ ComputedDatum[RawDatum], /* event */ ReactMouseEventFrom[org.scalajs.dom.Element]) => Callback
    ): this.type = set("onMouseEnter", js.Any.fromFunction2((t0: /* datum */ ComputedDatum[RawDatum], t1: /* event */ ReactMouseEventFrom[org.scalajs.dom.Element]) => (value(t0, t1)).runNow()))
    
    inline def onMouseLeave(
      value: (/* datum */ ComputedDatum[RawDatum], /* event */ ReactMouseEventFrom[org.scalajs.dom.Element]) => Callback
    ): this.type = set("onMouseLeave", js.Any.fromFunction2((t0: /* datum */ ComputedDatum[RawDatum], t1: /* event */ ReactMouseEventFrom[org.scalajs.dom.Element]) => (value(t0, t1)).runNow()))
    
    inline def onMouseMove(
      value: (/* datum */ ComputedDatum[RawDatum], /* event */ ReactMouseEventFrom[org.scalajs.dom.Element]) => Callback
    ): this.type = set("onMouseMove", js.Any.fromFunction2((t0: /* datum */ ComputedDatum[RawDatum], t1: /* event */ ReactMouseEventFrom[org.scalajs.dom.Element]) => (value(t0, t1)).runNow()))
  }
  
  def withProps[RawDatum](p: CirclesProps[RawDatum]): Builder[RawDatum] = new Builder[RawDatum](js.Array(this.component, p.asInstanceOf[js.Any]))
}
