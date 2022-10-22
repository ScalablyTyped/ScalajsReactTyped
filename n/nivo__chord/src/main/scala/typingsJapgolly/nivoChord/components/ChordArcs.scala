package typingsJapgolly.nivoChord.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.Element
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.nivoChord.distTypesChordArcsMod.ChordArcsProps
import typingsJapgolly.nivoChord.distTypesTypesMod.ArcDatum
import typingsJapgolly.nivoChord.distTypesTypesMod.ArcGenerator
import typingsJapgolly.nivoChord.distTypesTypesMod.ArcTooltipComponent
import typingsJapgolly.nivoColors.distTypesInheritedColorMod.InheritedColorConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ChordArcs {
  
  inline def apply(
    arcGenerator: ArcGenerator,
    arcs: js.Array[ArcDatum],
    borderColor: InheritedColorConfig[ArcDatum],
    borderWidth: Double,
    getOpacity: ArcDatum => Double,
    isInteractive: Boolean,
    setCurrent: js.UndefOr[ArcDatum] => Callback,
    tooltip: ArcTooltipComponent
  ): Builder = {
    val __props = js.Dynamic.literal(arcGenerator = arcGenerator.asInstanceOf[js.Any], arcs = arcs.asInstanceOf[js.Any], borderColor = borderColor.asInstanceOf[js.Any], borderWidth = borderWidth.asInstanceOf[js.Any], getOpacity = js.Any.fromFunction1(getOpacity), isInteractive = isInteractive.asInstanceOf[js.Any], setCurrent = js.Any.fromFunction1((t0: js.UndefOr[ArcDatum]) => setCurrent(t0).runNow()), tooltip = tooltip.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[/* hasArcsBorderWidthBorderColorGetOpacityArcGeneratorSetCurrentIsInteractiveOnMouseEnterOnMouseMoveOnMouseLeaveOnClickTooltip */ ChordArcsProps]))
  }
  
  @JSImport("@nivo/chord/dist/types/ChordArcs", "ChordArcs")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def onClick(value: (/* arc */ Any, /* event */ ReactMouseEventFrom[Element]) => Callback): this.type = set("onClick", js.Any.fromFunction2((t0: /* arc */ Any, t1: /* event */ ReactMouseEventFrom[Element]) => (value(t0, t1)).runNow()))
    
    inline def onMouseEnter(value: (/* arc */ Any, /* event */ ReactMouseEventFrom[Element]) => Callback): this.type = set("onMouseEnter", js.Any.fromFunction2((t0: /* arc */ Any, t1: /* event */ ReactMouseEventFrom[Element]) => (value(t0, t1)).runNow()))
    
    inline def onMouseLeave(value: (/* arc */ Any, /* event */ ReactMouseEventFrom[Element]) => Callback): this.type = set("onMouseLeave", js.Any.fromFunction2((t0: /* arc */ Any, t1: /* event */ ReactMouseEventFrom[Element]) => (value(t0, t1)).runNow()))
    
    inline def onMouseMove(value: (/* arc */ Any, /* event */ ReactMouseEventFrom[Element]) => Callback): this.type = set("onMouseMove", js.Any.fromFunction2((t0: /* arc */ Any, t1: /* event */ ReactMouseEventFrom[Element]) => (value(t0, t1)).runNow()))
  }
  
  def withProps(
    p: /* hasArcsBorderWidthBorderColorGetOpacityArcGeneratorSetCurrentIsInteractiveOnMouseEnterOnMouseMoveOnMouseLeaveOnClickTooltip */ ChordArcsProps
  ): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
