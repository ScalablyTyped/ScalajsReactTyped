package typingsJapgolly.reactKonva.components

import japgolly.scalajs.react.Callback
import org.scalajs.dom.CanvasGradient
import org.scalajs.dom.DragEvent
import org.scalajs.dom.Event
import org.scalajs.dom.HTMLImageElement
import org.scalajs.dom.MouseEvent
import org.scalajs.dom.PointerEvent
import org.scalajs.dom.TouchEvent
import org.scalajs.dom.WheelEvent
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.konva.libContextMod.Context
import typingsJapgolly.konva.libNodeMod.Filter
import typingsJapgolly.konva.libNodeMod.Node
import typingsJapgolly.konva.libNodeMod.globalCompositeOperationType
import typingsJapgolly.konva.libShapeMod.LineCap
import typingsJapgolly.konva.libShapeMod.LineJoin
import typingsJapgolly.konva.libTypesMod.Vector2d
import typingsJapgolly.konva.mod.Konva.ArcConfig
import typingsJapgolly.konva.mod.Konva.KonvaEventObject
import typingsJapgolly.react.mod.ClassAttributes
import typingsJapgolly.reactKonva.reactKonvaCoreMod.KonvaNodeEvents
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Arc {
  
  inline def apply(angle: Double, innerRadius: Double, outerRadius: Double): Builder = {
    val __props = js.Dynamic.literal(angle = angle.asInstanceOf[js.Any], innerRadius = innerRadius.asInstanceOf[js.Any], outerRadius = outerRadius.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ArcConfig & KonvaNodeEvents & ClassAttributes[typingsJapgolly.konva.mod.Konva.Arc]]))
  }
  
  @JSImport("react-konva", "Arc")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.konva.mod.Konva.Arc & js.Object] {
    
    inline def clockwise(value: Boolean): this.type = set("clockwise", value.asInstanceOf[js.Any])
    
    inline def dash(value: js.Array[Double]): this.type = set("dash", value.asInstanceOf[js.Any])
    
    inline def dashEnabled(value: Boolean): this.type = set("dashEnabled", value.asInstanceOf[js.Any])
    
    inline def dashOffset(value: Double): this.type = set("dashOffset", value.asInstanceOf[js.Any])
    
    inline def dashVarargs(value: Double*): this.type = set("dash", js.Array(value*))
    
    inline def dragBoundFunc(
      value: js.ThisFunction1[
          /* this */ Node[typingsJapgolly.konva.libShapesArcMod.ArcConfig], 
          /* pos */ Vector2d, 
          Vector2d
        ]
    ): this.type = set("dragBoundFunc", value.asInstanceOf[js.Any])
    
    inline def dragDistance(value: Double): this.type = set("dragDistance", value.asInstanceOf[js.Any])
    
    inline def draggable(value: Boolean): this.type = set("draggable", value.asInstanceOf[js.Any])
    
    inline def fill(value: String): this.type = set("fill", value.asInstanceOf[js.Any])
    
    inline def fillAfterStrokeEnabled(value: Boolean): this.type = set("fillAfterStrokeEnabled", value.asInstanceOf[js.Any])
    
    inline def fillEnabled(value: Boolean): this.type = set("fillEnabled", value.asInstanceOf[js.Any])
    
    inline def fillLinearGradientColorStops(value: js.Array[Double | String]): this.type = set("fillLinearGradientColorStops", value.asInstanceOf[js.Any])
    
    inline def fillLinearGradientColorStopsVarargs(value: (Double | String)*): this.type = set("fillLinearGradientColorStops", js.Array(value*))
    
    inline def fillLinearGradientEndPoint(value: Vector2d): this.type = set("fillLinearGradientEndPoint", value.asInstanceOf[js.Any])
    
    inline def fillLinearGradientEndPointX(value: Double): this.type = set("fillLinearGradientEndPointX", value.asInstanceOf[js.Any])
    
    inline def fillLinearGradientEndPointY(value: Double): this.type = set("fillLinearGradientEndPointY", value.asInstanceOf[js.Any])
    
    inline def fillLinearGradientStartPoint(value: Vector2d): this.type = set("fillLinearGradientStartPoint", value.asInstanceOf[js.Any])
    
    inline def fillLinearGradientStartPointX(value: Double): this.type = set("fillLinearGradientStartPointX", value.asInstanceOf[js.Any])
    
    inline def fillLinearGradientStartPointY(value: Double): this.type = set("fillLinearGradientStartPointY", value.asInstanceOf[js.Any])
    
    inline def fillPatternImage(value: HTMLImageElement): this.type = set("fillPatternImage", value.asInstanceOf[js.Any])
    
    inline def fillPatternOffset(value: Vector2d): this.type = set("fillPatternOffset", value.asInstanceOf[js.Any])
    
    inline def fillPatternOffsetX(value: Double): this.type = set("fillPatternOffsetX", value.asInstanceOf[js.Any])
    
    inline def fillPatternOffsetY(value: Double): this.type = set("fillPatternOffsetY", value.asInstanceOf[js.Any])
    
    inline def fillPatternRepeat(value: String): this.type = set("fillPatternRepeat", value.asInstanceOf[js.Any])
    
    inline def fillPatternRotation(value: Double): this.type = set("fillPatternRotation", value.asInstanceOf[js.Any])
    
    inline def fillPatternScale(value: Vector2d): this.type = set("fillPatternScale", value.asInstanceOf[js.Any])
    
    inline def fillPatternScaleX(value: Double): this.type = set("fillPatternScaleX", value.asInstanceOf[js.Any])
    
    inline def fillPatternScaleY(value: Double): this.type = set("fillPatternScaleY", value.asInstanceOf[js.Any])
    
    inline def fillPatternX(value: Double): this.type = set("fillPatternX", value.asInstanceOf[js.Any])
    
    inline def fillPatternY(value: Double): this.type = set("fillPatternY", value.asInstanceOf[js.Any])
    
    inline def fillPriority(value: String): this.type = set("fillPriority", value.asInstanceOf[js.Any])
    
    inline def fillRadialGradientColorStops(value: js.Array[Double | String]): this.type = set("fillRadialGradientColorStops", value.asInstanceOf[js.Any])
    
    inline def fillRadialGradientColorStopsVarargs(value: (Double | String)*): this.type = set("fillRadialGradientColorStops", js.Array(value*))
    
    inline def fillRadialGradientEndPoint(value: Vector2d): this.type = set("fillRadialGradientEndPoint", value.asInstanceOf[js.Any])
    
    inline def fillRadialGradientEndPointX(value: Double): this.type = set("fillRadialGradientEndPointX", value.asInstanceOf[js.Any])
    
    inline def fillRadialGradientEndPointY(value: Double): this.type = set("fillRadialGradientEndPointY", value.asInstanceOf[js.Any])
    
    inline def fillRadialGradientEndRadius(value: Double): this.type = set("fillRadialGradientEndRadius", value.asInstanceOf[js.Any])
    
    inline def fillRadialGradientStartPoint(value: Vector2d): this.type = set("fillRadialGradientStartPoint", value.asInstanceOf[js.Any])
    
    inline def fillRadialGradientStartPointX(value: Double): this.type = set("fillRadialGradientStartPointX", value.asInstanceOf[js.Any])
    
    inline def fillRadialGradientStartPointY(value: Double): this.type = set("fillRadialGradientStartPointY", value.asInstanceOf[js.Any])
    
    inline def fillRadialGradientStartRadius(value: Double): this.type = set("fillRadialGradientStartRadius", value.asInstanceOf[js.Any])
    
    inline def filters(value: js.Array[Filter]): this.type = set("filters", value.asInstanceOf[js.Any])
    
    inline def filtersVarargs(value: Filter*): this.type = set("filters", js.Array(value*))
    
    inline def globalCompositeOperation(value: globalCompositeOperationType): this.type = set("globalCompositeOperation", value.asInstanceOf[js.Any])
    
    inline def height(value: Double): this.type = set("height", value.asInstanceOf[js.Any])
    
    inline def hitFunc(
      value: (/* con */ Context, /* shape */ typingsJapgolly.konva.libShapeMod.Shape[typingsJapgolly.konva.libShapesArcMod.ArcConfig]) => Callback
    ): this.type = set("hitFunc", js.Any.fromFunction2((t0: /* con */ Context, t1: /* shape */ typingsJapgolly.konva.libShapeMod.Shape[typingsJapgolly.konva.libShapesArcMod.ArcConfig]) => (value(t0, t1)).runNow()))
    
    inline def hitStrokeWidth(value: Double | String): this.type = set("hitStrokeWidth", value.asInstanceOf[js.Any])
    
    inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    inline def lineCap(value: LineCap): this.type = set("lineCap", value.asInstanceOf[js.Any])
    
    inline def lineJoin(value: LineJoin): this.type = set("lineJoin", value.asInstanceOf[js.Any])
    
    inline def listening(value: Boolean): this.type = set("listening", value.asInstanceOf[js.Any])
    
    inline def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
    
    inline def offset(value: Vector2d): this.type = set("offset", value.asInstanceOf[js.Any])
    
    inline def offsetX(value: Double): this.type = set("offsetX", value.asInstanceOf[js.Any])
    
    inline def offsetY(value: Double): this.type = set("offsetY", value.asInstanceOf[js.Any])
    
    inline def onClick(value: /* evt */ KonvaEventObject[MouseEvent] => Callback): this.type = set("onClick", js.Any.fromFunction1((t0: /* evt */ KonvaEventObject[MouseEvent]) => value(t0).runNow()))
    
    inline def onContextMenu(value: /* evt */ KonvaEventObject[PointerEvent] => Callback): this.type = set("onContextMenu", js.Any.fromFunction1((t0: /* evt */ KonvaEventObject[PointerEvent]) => value(t0).runNow()))
    
    inline def onDblClick(value: /* evt */ KonvaEventObject[MouseEvent] => Callback): this.type = set("onDblClick", js.Any.fromFunction1((t0: /* evt */ KonvaEventObject[MouseEvent]) => value(t0).runNow()))
    
    inline def onDblTap(value: /* evt */ KonvaEventObject[Event] => Callback): this.type = set("onDblTap", js.Any.fromFunction1((t0: /* evt */ KonvaEventObject[Event]) => value(t0).runNow()))
    
    inline def onDragEnd(value: /* evt */ KonvaEventObject[DragEvent] => Callback): this.type = set("onDragEnd", js.Any.fromFunction1((t0: /* evt */ KonvaEventObject[DragEvent]) => value(t0).runNow()))
    
    inline def onDragMove(value: /* evt */ KonvaEventObject[DragEvent] => Callback): this.type = set("onDragMove", js.Any.fromFunction1((t0: /* evt */ KonvaEventObject[DragEvent]) => value(t0).runNow()))
    
    inline def onDragStart(value: /* evt */ KonvaEventObject[DragEvent] => Callback): this.type = set("onDragStart", js.Any.fromFunction1((t0: /* evt */ KonvaEventObject[DragEvent]) => value(t0).runNow()))
    
    inline def onMouseDown(value: /* evt */ KonvaEventObject[MouseEvent] => Callback): this.type = set("onMouseDown", js.Any.fromFunction1((t0: /* evt */ KonvaEventObject[MouseEvent]) => value(t0).runNow()))
    
    inline def onMouseEnter(value: /* evt */ KonvaEventObject[MouseEvent] => Callback): this.type = set("onMouseEnter", js.Any.fromFunction1((t0: /* evt */ KonvaEventObject[MouseEvent]) => value(t0).runNow()))
    
    inline def onMouseLeave(value: /* evt */ KonvaEventObject[MouseEvent] => Callback): this.type = set("onMouseLeave", js.Any.fromFunction1((t0: /* evt */ KonvaEventObject[MouseEvent]) => value(t0).runNow()))
    
    inline def onMouseMove(value: /* evt */ KonvaEventObject[MouseEvent] => Callback): this.type = set("onMouseMove", js.Any.fromFunction1((t0: /* evt */ KonvaEventObject[MouseEvent]) => value(t0).runNow()))
    
    inline def onMouseOut(value: /* evt */ KonvaEventObject[MouseEvent] => Callback): this.type = set("onMouseOut", js.Any.fromFunction1((t0: /* evt */ KonvaEventObject[MouseEvent]) => value(t0).runNow()))
    
    inline def onMouseOver(value: /* evt */ KonvaEventObject[MouseEvent] => Callback): this.type = set("onMouseOver", js.Any.fromFunction1((t0: /* evt */ KonvaEventObject[MouseEvent]) => value(t0).runNow()))
    
    inline def onMouseUp(value: /* evt */ KonvaEventObject[MouseEvent] => Callback): this.type = set("onMouseUp", js.Any.fromFunction1((t0: /* evt */ KonvaEventObject[MouseEvent]) => value(t0).runNow()))
    
    inline def onTap(value: /* evt */ KonvaEventObject[Event] => Callback): this.type = set("onTap", js.Any.fromFunction1((t0: /* evt */ KonvaEventObject[Event]) => value(t0).runNow()))
    
    inline def onTouchEnd(value: /* evt */ KonvaEventObject[TouchEvent] => Callback): this.type = set("onTouchEnd", js.Any.fromFunction1((t0: /* evt */ KonvaEventObject[TouchEvent]) => value(t0).runNow()))
    
    inline def onTouchMove(value: /* evt */ KonvaEventObject[TouchEvent] => Callback): this.type = set("onTouchMove", js.Any.fromFunction1((t0: /* evt */ KonvaEventObject[TouchEvent]) => value(t0).runNow()))
    
    inline def onTouchStart(value: /* evt */ KonvaEventObject[TouchEvent] => Callback): this.type = set("onTouchStart", js.Any.fromFunction1((t0: /* evt */ KonvaEventObject[TouchEvent]) => value(t0).runNow()))
    
    inline def onTransform(value: /* evt */ KonvaEventObject[Event] => Callback): this.type = set("onTransform", js.Any.fromFunction1((t0: /* evt */ KonvaEventObject[Event]) => value(t0).runNow()))
    
    inline def onTransformEnd(value: /* evt */ KonvaEventObject[Event] => Callback): this.type = set("onTransformEnd", js.Any.fromFunction1((t0: /* evt */ KonvaEventObject[Event]) => value(t0).runNow()))
    
    inline def onTransformStart(value: /* evt */ KonvaEventObject[Event] => Callback): this.type = set("onTransformStart", js.Any.fromFunction1((t0: /* evt */ KonvaEventObject[Event]) => value(t0).runNow()))
    
    inline def onWheel(value: /* evt */ KonvaEventObject[WheelEvent] => Callback): this.type = set("onWheel", js.Any.fromFunction1((t0: /* evt */ KonvaEventObject[WheelEvent]) => value(t0).runNow()))
    
    inline def opacity(value: Double): this.type = set("opacity", value.asInstanceOf[js.Any])
    
    inline def perfectDrawEnabled(value: Boolean): this.type = set("perfectDrawEnabled", value.asInstanceOf[js.Any])
    
    inline def preventDefault(value: Boolean): this.type = set("preventDefault", value.asInstanceOf[js.Any])
    
    inline def rotation(value: Double): this.type = set("rotation", value.asInstanceOf[js.Any])
    
    inline def rotationDeg(value: Double): this.type = set("rotationDeg", value.asInstanceOf[js.Any])
    
    inline def scale(value: Vector2d): this.type = set("scale", value.asInstanceOf[js.Any])
    
    inline def scaleX(value: Double): this.type = set("scaleX", value.asInstanceOf[js.Any])
    
    inline def scaleY(value: Double): this.type = set("scaleY", value.asInstanceOf[js.Any])
    
    inline def sceneFunc(
      value: (/* con */ Context, /* shape */ typingsJapgolly.konva.libShapeMod.Shape[typingsJapgolly.konva.libShapesArcMod.ArcConfig]) => Callback
    ): this.type = set("sceneFunc", js.Any.fromFunction2((t0: /* con */ Context, t1: /* shape */ typingsJapgolly.konva.libShapeMod.Shape[typingsJapgolly.konva.libShapesArcMod.ArcConfig]) => (value(t0, t1)).runNow()))
    
    inline def shadowBlur(value: Double): this.type = set("shadowBlur", value.asInstanceOf[js.Any])
    
    inline def shadowColor(value: String): this.type = set("shadowColor", value.asInstanceOf[js.Any])
    
    inline def shadowEnabled(value: Boolean): this.type = set("shadowEnabled", value.asInstanceOf[js.Any])
    
    inline def shadowForStrokeEnabled(value: Boolean): this.type = set("shadowForStrokeEnabled", value.asInstanceOf[js.Any])
    
    inline def shadowOffset(value: Vector2d): this.type = set("shadowOffset", value.asInstanceOf[js.Any])
    
    inline def shadowOffsetX(value: Double): this.type = set("shadowOffsetX", value.asInstanceOf[js.Any])
    
    inline def shadowOffsetY(value: Double): this.type = set("shadowOffsetY", value.asInstanceOf[js.Any])
    
    inline def shadowOpacity(value: Double): this.type = set("shadowOpacity", value.asInstanceOf[js.Any])
    
    inline def stroke(value: String | CanvasGradient): this.type = set("stroke", value.asInstanceOf[js.Any])
    
    inline def strokeEnabled(value: Boolean): this.type = set("strokeEnabled", value.asInstanceOf[js.Any])
    
    inline def strokeHitEnabled(value: Boolean): this.type = set("strokeHitEnabled", value.asInstanceOf[js.Any])
    
    inline def strokeScaleEnabled(value: Boolean): this.type = set("strokeScaleEnabled", value.asInstanceOf[js.Any])
    
    inline def strokeWidth(value: Double): this.type = set("strokeWidth", value.asInstanceOf[js.Any])
    
    inline def visible(value: Boolean): this.type = set("visible", value.asInstanceOf[js.Any])
    
    inline def width(value: Double): this.type = set("width", value.asInstanceOf[js.Any])
    
    inline def x(value: Double): this.type = set("x", value.asInstanceOf[js.Any])
    
    inline def y(value: Double): this.type = set("y", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ArcConfig & KonvaNodeEvents & ClassAttributes[typingsJapgolly.konva.mod.Konva.Arc]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
