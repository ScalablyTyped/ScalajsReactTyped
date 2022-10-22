package typingsJapgolly.nivoBullet.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.Element
import org.scalajs.dom.SVGLineElement
import org.scalajs.dom.SVGRectElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.nivoBullet.anon.WithDatumIdComputedMarker
import typingsJapgolly.nivoBullet.anon.WithDatumIdComputedRangeD
import typingsJapgolly.nivoBullet.distTypesTypesMod.BulletMarkersItemProps
import typingsJapgolly.nivoBullet.distTypesTypesMod.BulletRectsItemProps
import typingsJapgolly.nivoBullet.distTypesTypesMod.BulletSvgProps
import typingsJapgolly.nivoBullet.distTypesTypesMod.BulletTooltipProps
import typingsJapgolly.nivoBullet.distTypesTypesMod.ComputedRangeDatum
import typingsJapgolly.nivoBullet.distTypesTypesMod.Datum
import typingsJapgolly.nivoBullet.nivoBulletStrings.after
import typingsJapgolly.nivoBullet.nivoBulletStrings.auto
import typingsJapgolly.nivoBullet.nivoBulletStrings.before
import typingsJapgolly.nivoBullet.nivoBulletStrings.end
import typingsJapgolly.nivoBullet.nivoBulletStrings.horizontal
import typingsJapgolly.nivoBullet.nivoBulletStrings.middle
import typingsJapgolly.nivoBullet.nivoBulletStrings.start
import typingsJapgolly.nivoBullet.nivoBulletStrings.vertical
import typingsJapgolly.nivoColors.distTypesInheritedColorMod.InheritedColorConfig
import typingsJapgolly.nivoCore.mod.Box
import typingsJapgolly.nivoCore.mod.Colors
import typingsJapgolly.nivoCore.mod.Theme
import typingsJapgolly.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Bullet {
  
  inline def apply(data: js.Array[Datum], height: js.UndefOr[Double] & Double, width: js.UndefOr[Double] & Double): Builder = {
    val __props = js.Dynamic.literal(data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[BulletSvgProps]))
  }
  
  @JSImport("@nivo/bullet", "Bullet")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def animate(value: Boolean): this.type = set("animate", value.asInstanceOf[js.Any])
    
    inline def axisPosition(value: before | after): this.type = set("axisPosition", value.asInstanceOf[js.Any])
    
    inline def isInteractive(value: Boolean): this.type = set("isInteractive", value.asInstanceOf[js.Any])
    
    inline def layout(value: horizontal | vertical): this.type = set("layout", value.asInstanceOf[js.Any])
    
    inline def margin(value: Box): this.type = set("margin", value.asInstanceOf[js.Any])
    
    inline def markerColors(value: Colors): this.type = set("markerColors", value.asInstanceOf[js.Any])
    
    inline def markerColorsVarargs(value: String*): this.type = set("markerColors", js.Array(value*))
    
    inline def markerComponent(value: ComponentType[BulletMarkersItemProps]): this.type = set("markerComponent", value.asInstanceOf[js.Any])
    
    inline def markerSize(value: Double): this.type = set("markerSize", value.asInstanceOf[js.Any])
    
    inline def maxValue(value: auto | Double): this.type = set("maxValue", value.asInstanceOf[js.Any])
    
    inline def measureBorderColor(value: InheritedColorConfig[ComputedRangeDatum]): this.type = set("measureBorderColor", value.asInstanceOf[js.Any])
    
    inline def measureBorderWidth(value: Double): this.type = set("measureBorderWidth", value.asInstanceOf[js.Any])
    
    inline def measureColors(value: Colors): this.type = set("measureColors", value.asInstanceOf[js.Any])
    
    inline def measureColorsVarargs(value: String*): this.type = set("measureColors", js.Array(value*))
    
    inline def measureComponent(value: ComponentType[BulletRectsItemProps]): this.type = set("measureComponent", value.asInstanceOf[js.Any])
    
    inline def measureSize(value: Double): this.type = set("measureSize", value.asInstanceOf[js.Any])
    
    inline def minValue(value: auto | Double): this.type = set("minValue", value.asInstanceOf[js.Any])
    
    inline def motionConfig(
      value: String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpringConfig */ Any)
    ): this.type = set("motionConfig", value.asInstanceOf[js.Any])
    
    inline def onMarkerClick(
      value: (WithDatumIdComputedMarker, /* event */ ReactMouseEventFrom[SVGLineElement & Element]) => Callback
    ): this.type = set("onMarkerClick", js.Any.fromFunction2((t0: WithDatumIdComputedMarker, t1: /* event */ ReactMouseEventFrom[SVGLineElement & Element]) => (value(t0, t1)).runNow()))
    
    inline def onMeasureClick(
      value: (WithDatumIdComputedRangeD, /* event */ ReactMouseEventFrom[SVGRectElement & Element]) => Callback
    ): this.type = set("onMeasureClick", js.Any.fromFunction2((t0: WithDatumIdComputedRangeD, t1: /* event */ ReactMouseEventFrom[SVGRectElement & Element]) => (value(t0, t1)).runNow()))
    
    inline def onRangeClick(
      value: (WithDatumIdComputedRangeD, /* event */ ReactMouseEventFrom[SVGRectElement & Element]) => Callback
    ): this.type = set("onRangeClick", js.Any.fromFunction2((t0: WithDatumIdComputedRangeD, t1: /* event */ ReactMouseEventFrom[SVGRectElement & Element]) => (value(t0, t1)).runNow()))
    
    inline def rangeBorderColor(value: InheritedColorConfig[ComputedRangeDatum]): this.type = set("rangeBorderColor", value.asInstanceOf[js.Any])
    
    inline def rangeBorderWidth(value: Double): this.type = set("rangeBorderWidth", value.asInstanceOf[js.Any])
    
    inline def rangeColors(value: Colors): this.type = set("rangeColors", value.asInstanceOf[js.Any])
    
    inline def rangeColorsVarargs(value: String*): this.type = set("rangeColors", js.Array(value*))
    
    inline def rangeComponent(value: ComponentType[BulletRectsItemProps]): this.type = set("rangeComponent", value.asInstanceOf[js.Any])
    
    inline def reverse(value: Boolean): this.type = set("reverse", value.asInstanceOf[js.Any])
    
    inline def role(value: String): this.type = set("role", value.asInstanceOf[js.Any])
    
    inline def spacing(value: Double): this.type = set("spacing", value.asInstanceOf[js.Any])
    
    inline def theme(value: Theme): this.type = set("theme", value.asInstanceOf[js.Any])
    
    inline def titleAlign(value: start | middle | end): this.type = set("titleAlign", value.asInstanceOf[js.Any])
    
    inline def titleOffsetX(value: Double): this.type = set("titleOffsetX", value.asInstanceOf[js.Any])
    
    inline def titleOffsetY(value: Double): this.type = set("titleOffsetY", value.asInstanceOf[js.Any])
    
    inline def titlePosition(value: before | after): this.type = set("titlePosition", value.asInstanceOf[js.Any])
    
    inline def titleRotation(value: Double): this.type = set("titleRotation", value.asInstanceOf[js.Any])
    
    inline def tooltip(value: ComponentType[BulletTooltipProps]): this.type = set("tooltip", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: BulletSvgProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
