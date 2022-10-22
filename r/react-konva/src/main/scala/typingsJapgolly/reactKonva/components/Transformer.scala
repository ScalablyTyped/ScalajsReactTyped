package typingsJapgolly.reactKonva.components

import japgolly.scalajs.react.Callback
import org.scalajs.dom.DragEvent
import org.scalajs.dom.Event
import org.scalajs.dom.MouseEvent
import org.scalajs.dom.PointerEvent
import org.scalajs.dom.TouchEvent
import org.scalajs.dom.WheelEvent
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.konva.libContextMod.SceneContext
import typingsJapgolly.konva.libNodeMod.Filter
import typingsJapgolly.konva.libNodeMod.Node
import typingsJapgolly.konva.libNodeMod.globalCompositeOperationType
import typingsJapgolly.konva.libShapesTransformerMod.Box
import typingsJapgolly.konva.libShapesTransformerMod.TransformerConfig
import typingsJapgolly.konva.libTypesMod.Vector2d
import typingsJapgolly.konva.mod.Konva.KonvaEventObject
import typingsJapgolly.react.mod.ClassAttributes
import typingsJapgolly.reactKonva.reactKonvaCoreMod.KonvaNodeEvents
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Transformer {
  
  @JSImport("react-konva", "Transformer")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.konva.mod.Konva.Transformer & js.Object] {
    
    inline def anchorCornerRadius(value: Double): this.type = set("anchorCornerRadius", value.asInstanceOf[js.Any])
    
    inline def anchorFill(value: String): this.type = set("anchorFill", value.asInstanceOf[js.Any])
    
    inline def anchorSize(value: Double): this.type = set("anchorSize", value.asInstanceOf[js.Any])
    
    inline def anchorStroke(value: String): this.type = set("anchorStroke", value.asInstanceOf[js.Any])
    
    inline def anchorStrokeWidth(value: Double): this.type = set("anchorStrokeWidth", value.asInstanceOf[js.Any])
    
    inline def borderDash(value: js.Array[Double]): this.type = set("borderDash", value.asInstanceOf[js.Any])
    
    inline def borderDashVarargs(value: Double*): this.type = set("borderDash", js.Array(value*))
    
    inline def borderEnabled(value: Boolean): this.type = set("borderEnabled", value.asInstanceOf[js.Any])
    
    inline def borderStroke(value: String): this.type = set("borderStroke", value.asInstanceOf[js.Any])
    
    inline def borderStrokeWidth(value: Double): this.type = set("borderStrokeWidth", value.asInstanceOf[js.Any])
    
    inline def boundBoxFunc(value: (/* oldBox */ Box, /* newBox */ Box) => Box): this.type = set("boundBoxFunc", js.Any.fromFunction2(value))
    
    inline def centeredScaling(value: Boolean): this.type = set("centeredScaling", value.asInstanceOf[js.Any])
    
    inline def clearBeforeDraw(value: Boolean): this.type = set("clearBeforeDraw", value.asInstanceOf[js.Any])
    
    inline def clipFunc(value: /* ctx */ SceneContext => Callback): this.type = set("clipFunc", js.Any.fromFunction1((t0: /* ctx */ SceneContext) => value(t0).runNow()))
    
    inline def clipHeight(value: Double): this.type = set("clipHeight", value.asInstanceOf[js.Any])
    
    inline def clipWidth(value: Double): this.type = set("clipWidth", value.asInstanceOf[js.Any])
    
    inline def clipX(value: Double): this.type = set("clipX", value.asInstanceOf[js.Any])
    
    inline def clipY(value: Double): this.type = set("clipY", value.asInstanceOf[js.Any])
    
    inline def dragBoundFunc(value: js.ThisFunction1[/* this */ Node[TransformerConfig], /* pos */ Vector2d, Vector2d]): this.type = set("dragBoundFunc", value.asInstanceOf[js.Any])
    
    inline def dragDistance(value: Double): this.type = set("dragDistance", value.asInstanceOf[js.Any])
    
    inline def draggable(value: Boolean): this.type = set("draggable", value.asInstanceOf[js.Any])
    
    inline def enabledAnchors(value: js.Array[String]): this.type = set("enabledAnchors", value.asInstanceOf[js.Any])
    
    inline def enabledAnchorsVarargs(value: String*): this.type = set("enabledAnchors", js.Array(value*))
    
    inline def filters(value: js.Array[Filter]): this.type = set("filters", value.asInstanceOf[js.Any])
    
    inline def filtersVarargs(value: Filter*): this.type = set("filters", js.Array(value*))
    
    inline def flipEnabled(value: Boolean): this.type = set("flipEnabled", value.asInstanceOf[js.Any])
    
    inline def globalCompositeOperation(value: globalCompositeOperationType): this.type = set("globalCompositeOperation", value.asInstanceOf[js.Any])
    
    inline def height(value: Double): this.type = set("height", value.asInstanceOf[js.Any])
    
    inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    inline def ignoreStroke(value: Boolean): this.type = set("ignoreStroke", value.asInstanceOf[js.Any])
    
    inline def keepRatio(value: Boolean): this.type = set("keepRatio", value.asInstanceOf[js.Any])
    
    inline def listening(value: Boolean): this.type = set("listening", value.asInstanceOf[js.Any])
    
    inline def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
    
    inline def node(value: typingsJapgolly.konva.libShapesRectMod.Rect): this.type = set("node", value.asInstanceOf[js.Any])
    
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
    
    inline def preventDefault(value: Boolean): this.type = set("preventDefault", value.asInstanceOf[js.Any])
    
    inline def resizeEnabled(value: Boolean): this.type = set("resizeEnabled", value.asInstanceOf[js.Any])
    
    inline def rotateAnchorOffset(value: Double): this.type = set("rotateAnchorOffset", value.asInstanceOf[js.Any])
    
    inline def rotateEnabled(value: Boolean): this.type = set("rotateEnabled", value.asInstanceOf[js.Any])
    
    inline def rotation(value: Double): this.type = set("rotation", value.asInstanceOf[js.Any])
    
    inline def rotationDeg(value: Double): this.type = set("rotationDeg", value.asInstanceOf[js.Any])
    
    inline def rotationSnapTolerance(value: Double): this.type = set("rotationSnapTolerance", value.asInstanceOf[js.Any])
    
    inline def rotationSnaps(value: js.Array[Double]): this.type = set("rotationSnaps", value.asInstanceOf[js.Any])
    
    inline def rotationSnapsVarargs(value: Double*): this.type = set("rotationSnaps", js.Array(value*))
    
    inline def scale(value: Vector2d): this.type = set("scale", value.asInstanceOf[js.Any])
    
    inline def scaleX(value: Double): this.type = set("scaleX", value.asInstanceOf[js.Any])
    
    inline def scaleY(value: Double): this.type = set("scaleY", value.asInstanceOf[js.Any])
    
    inline def shouldOverdrawWholeArea(value: Boolean): this.type = set("shouldOverdrawWholeArea", value.asInstanceOf[js.Any])
    
    inline def useSingleNodeRotation(value: Boolean): this.type = set("useSingleNodeRotation", value.asInstanceOf[js.Any])
    
    inline def visible(value: Boolean): this.type = set("visible", value.asInstanceOf[js.Any])
    
    inline def width(value: Double): this.type = set("width", value.asInstanceOf[js.Any])
    
    inline def x(value: Double): this.type = set("x", value.asInstanceOf[js.Any])
    
    inline def y(value: Double): this.type = set("y", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Transformer.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(
    p: typingsJapgolly.konva.mod.Konva.TransformerConfig & KonvaNodeEvents & ClassAttributes[typingsJapgolly.konva.mod.Konva.Transformer]
  ): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
