package typingsJapgolly.nivoChord.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.Element
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.nivoChord.distTypesChordRibbonsMod.ChordRibbonsProps
import typingsJapgolly.nivoChord.distTypesTypesMod.ArcDatum
import typingsJapgolly.nivoChord.distTypesTypesMod.RibbonDatum
import typingsJapgolly.nivoChord.distTypesTypesMod.RibbonGenerator
import typingsJapgolly.nivoChord.distTypesTypesMod.RibbonTooltipComponent
import typingsJapgolly.nivoColors.distTypesInheritedColorMod.InheritedColorConfig
import typingsJapgolly.nivoCore.mod.CssMixBlendMode
import typingsJapgolly.std.NonNullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ChordRibbons {
  
  inline def apply(
    blendMode: NonNullable[js.UndefOr[CssMixBlendMode]],
    borderColor: InheritedColorConfig[ArcDatum],
    borderWidth: Double,
    getOpacity: RibbonDatum => Double,
    isInteractive: Boolean,
    ribbonGenerator: RibbonGenerator,
    ribbons: js.Array[RibbonDatum],
    setCurrent: js.UndefOr[RibbonDatum] => Callback,
    tooltip: NonNullable[js.UndefOr[RibbonTooltipComponent]]
  ): Builder = {
    val __props = js.Dynamic.literal(blendMode = blendMode.asInstanceOf[js.Any], borderColor = borderColor.asInstanceOf[js.Any], borderWidth = borderWidth.asInstanceOf[js.Any], getOpacity = js.Any.fromFunction1(getOpacity), isInteractive = isInteractive.asInstanceOf[js.Any], ribbonGenerator = ribbonGenerator.asInstanceOf[js.Any], ribbons = ribbons.asInstanceOf[js.Any], setCurrent = js.Any.fromFunction1((t0: js.UndefOr[RibbonDatum]) => setCurrent(t0).runNow()), tooltip = tooltip.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[/* hasRibbonsRibbonGeneratorBorderWidthBorderColorGetOpacityBlendModeIsInteractiveSetCurrentOnMouseEnterOnMouseMoveOnMouseLeaveOnClickTooltip */ ChordRibbonsProps]))
  }
  
  @JSImport("@nivo/chord/dist/types/ChordRibbons", "ChordRibbons")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def onClick(value: (/* ribbon */ Any, /* event */ ReactMouseEventFrom[Element]) => Callback): this.type = set("onClick", js.Any.fromFunction2((t0: /* ribbon */ Any, t1: /* event */ ReactMouseEventFrom[Element]) => (value(t0, t1)).runNow()))
    
    inline def onMouseEnter(value: (/* ribbon */ Any, /* event */ ReactMouseEventFrom[Element]) => Callback): this.type = set("onMouseEnter", js.Any.fromFunction2((t0: /* ribbon */ Any, t1: /* event */ ReactMouseEventFrom[Element]) => (value(t0, t1)).runNow()))
    
    inline def onMouseLeave(value: (/* ribbon */ Any, /* event */ ReactMouseEventFrom[Element]) => Callback): this.type = set("onMouseLeave", js.Any.fromFunction2((t0: /* ribbon */ Any, t1: /* event */ ReactMouseEventFrom[Element]) => (value(t0, t1)).runNow()))
    
    inline def onMouseMove(value: (/* ribbon */ Any, /* event */ ReactMouseEventFrom[Element]) => Callback): this.type = set("onMouseMove", js.Any.fromFunction2((t0: /* ribbon */ Any, t1: /* event */ ReactMouseEventFrom[Element]) => (value(t0, t1)).runNow()))
  }
  
  def withProps(
    p: /* hasRibbonsRibbonGeneratorBorderWidthBorderColorGetOpacityBlendModeIsInteractiveSetCurrentOnMouseEnterOnMouseMoveOnMouseLeaveOnClickTooltip */ ChordRibbonsProps
  ): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
