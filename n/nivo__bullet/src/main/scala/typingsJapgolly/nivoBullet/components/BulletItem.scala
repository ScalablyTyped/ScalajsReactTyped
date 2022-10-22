package typingsJapgolly.nivoBullet.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.Element
import org.scalajs.dom.SVGLineElement
import org.scalajs.dom.SVGRectElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.nivoBullet.anon.WithDatumIdComputedMarker
import typingsJapgolly.nivoBullet.anon.WithDatumIdComputedRangeD
import typingsJapgolly.nivoBullet.distTypesTypesMod.BulletItemProps
import typingsJapgolly.nivoBullet.distTypesTypesMod.BulletMarkersItemProps
import typingsJapgolly.nivoBullet.distTypesTypesMod.BulletRectsItemProps
import typingsJapgolly.nivoBullet.distTypesTypesMod.BulletTooltipProps
import typingsJapgolly.nivoBullet.distTypesTypesMod.ComputedRangeDatum
import typingsJapgolly.nivoBullet.distTypesTypesMod.DatumId
import typingsJapgolly.nivoBullet.nivoBulletStrings.after
import typingsJapgolly.nivoBullet.nivoBulletStrings.before
import typingsJapgolly.nivoBullet.nivoBulletStrings.end
import typingsJapgolly.nivoBullet.nivoBulletStrings.horizontal
import typingsJapgolly.nivoBullet.nivoBulletStrings.middle
import typingsJapgolly.nivoBullet.nivoBulletStrings.start
import typingsJapgolly.nivoBullet.nivoBulletStrings.vertical
import typingsJapgolly.nivoColors.distTypesInheritedColorMod.InheritedColorConfig
import typingsJapgolly.nivoCore.mod.Colors
import typingsJapgolly.nivoScales.distTypesTypesMod.ScaleLinear
import typingsJapgolly.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object BulletItem {
  
  inline def apply(
    axisPosition: before | after,
    height: Double,
    id: DatumId,
    layout: horizontal | vertical,
    markerColors: Colors,
    markerComponent: ComponentType[BulletMarkersItemProps],
    markerHeight: Double,
    measureBorderColor: InheritedColorConfig[ComputedRangeDatum],
    measureBorderWidth: Double,
    measureColors: Colors,
    measureComponent: ComponentType[BulletRectsItemProps],
    measureHeight: Double,
    measures: js.Array[Double],
    rangeBorderColor: InheritedColorConfig[ComputedRangeDatum],
    rangeBorderWidth: Double,
    rangeColors: Colors,
    rangeComponent: ComponentType[BulletRectsItemProps],
    ranges: js.Array[Double],
    reverse: Boolean,
    scale: ScaleLinear[Double],
    titleAlign: start | middle | end,
    titleOffsetX: Double,
    titleOffsetY: Double,
    titlePosition: before | after,
    titleRotation: Double,
    tooltip: ComponentType[BulletTooltipProps],
    width: Double,
    x: Double,
    y: Double
  ): Builder = {
    val __props = js.Dynamic.literal(axisPosition = axisPosition.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any], markerColors = markerColors.asInstanceOf[js.Any], markerComponent = markerComponent.asInstanceOf[js.Any], markerHeight = markerHeight.asInstanceOf[js.Any], measureBorderColor = measureBorderColor.asInstanceOf[js.Any], measureBorderWidth = measureBorderWidth.asInstanceOf[js.Any], measureColors = measureColors.asInstanceOf[js.Any], measureComponent = measureComponent.asInstanceOf[js.Any], measureHeight = measureHeight.asInstanceOf[js.Any], measures = measures.asInstanceOf[js.Any], rangeBorderColor = rangeBorderColor.asInstanceOf[js.Any], rangeBorderWidth = rangeBorderWidth.asInstanceOf[js.Any], rangeColors = rangeColors.asInstanceOf[js.Any], rangeComponent = rangeComponent.asInstanceOf[js.Any], ranges = ranges.asInstanceOf[js.Any], reverse = reverse.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], titleAlign = titleAlign.asInstanceOf[js.Any], titleOffsetX = titleOffsetX.asInstanceOf[js.Any], titleOffsetY = titleOffsetY.asInstanceOf[js.Any], titlePosition = titlePosition.asInstanceOf[js.Any], titleRotation = titleRotation.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[BulletItemProps]))
  }
  
  @JSImport("@nivo/bullet", "BulletItem")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def animate(value: Boolean): this.type = set("animate", value.asInstanceOf[js.Any])
    
    inline def markers(value: js.Array[Double]): this.type = set("markers", value.asInstanceOf[js.Any])
    
    inline def markersVarargs(value: Double*): this.type = set("markers", js.Array(value*))
    
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
    
    inline def title(value: VdomNode): this.type = set("title", value.rawNode.asInstanceOf[js.Any])
    
    inline def titleNull: this.type = set("title", null)
    
    inline def titleVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): this.type = set("title", js.Array(value*))
    
    inline def titleVdomElement(value: VdomElement): this.type = set("title", value.rawElement.asInstanceOf[js.Any])
  }
  
  def withProps(p: BulletItemProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
