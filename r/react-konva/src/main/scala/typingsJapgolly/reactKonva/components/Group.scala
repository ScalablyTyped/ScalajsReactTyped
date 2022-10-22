package typingsJapgolly.reactKonva.components

import japgolly.scalajs.react.Callback
import org.scalajs.dom.DragEvent
import org.scalajs.dom.Event
import org.scalajs.dom.MouseEvent
import org.scalajs.dom.PointerEvent
import org.scalajs.dom.TouchEvent
import org.scalajs.dom.WheelEvent
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.konva.libContainerMod.ContainerConfig
import typingsJapgolly.konva.libContextMod.SceneContext
import typingsJapgolly.konva.libNodeMod.Filter
import typingsJapgolly.konva.libNodeMod.Node
import typingsJapgolly.konva.libNodeMod.globalCompositeOperationType
import typingsJapgolly.konva.libTypesMod.Vector2d
import typingsJapgolly.konva.mod.Konva.GroupConfig
import typingsJapgolly.konva.mod.Konva.KonvaEventObject
import typingsJapgolly.react.mod.ClassAttributes
import typingsJapgolly.reactKonva.reactKonvaCoreMod.KonvaNodeEvents
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Group {
  
  @JSImport("react-konva", "Group")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.konva.mod.Konva.Group & js.Object] {
    
    inline def clearBeforeDraw(value: Boolean): this.type = set("clearBeforeDraw", value.asInstanceOf[js.Any])
    
    inline def clipFunc(value: /* ctx */ SceneContext => Callback): this.type = set("clipFunc", js.Any.fromFunction1((t0: /* ctx */ SceneContext) => value(t0).runNow()))
    
    inline def clipHeight(value: Double): this.type = set("clipHeight", value.asInstanceOf[js.Any])
    
    inline def clipWidth(value: Double): this.type = set("clipWidth", value.asInstanceOf[js.Any])
    
    inline def clipX(value: Double): this.type = set("clipX", value.asInstanceOf[js.Any])
    
    inline def clipY(value: Double): this.type = set("clipY", value.asInstanceOf[js.Any])
    
    inline def dragBoundFunc(value: js.ThisFunction1[/* this */ Node[ContainerConfig], /* pos */ Vector2d, Vector2d]): this.type = set("dragBoundFunc", value.asInstanceOf[js.Any])
    
    inline def dragDistance(value: Double): this.type = set("dragDistance", value.asInstanceOf[js.Any])
    
    inline def draggable(value: Boolean): this.type = set("draggable", value.asInstanceOf[js.Any])
    
    inline def filters(value: js.Array[Filter]): this.type = set("filters", value.asInstanceOf[js.Any])
    
    inline def filtersVarargs(value: Filter*): this.type = set("filters", js.Array(value*))
    
    inline def globalCompositeOperation(value: globalCompositeOperationType): this.type = set("globalCompositeOperation", value.asInstanceOf[js.Any])
    
    inline def height(value: Double): this.type = set("height", value.asInstanceOf[js.Any])
    
    inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
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
    
    inline def preventDefault(value: Boolean): this.type = set("preventDefault", value.asInstanceOf[js.Any])
    
    inline def rotation(value: Double): this.type = set("rotation", value.asInstanceOf[js.Any])
    
    inline def rotationDeg(value: Double): this.type = set("rotationDeg", value.asInstanceOf[js.Any])
    
    inline def scale(value: Vector2d): this.type = set("scale", value.asInstanceOf[js.Any])
    
    inline def scaleX(value: Double): this.type = set("scaleX", value.asInstanceOf[js.Any])
    
    inline def scaleY(value: Double): this.type = set("scaleY", value.asInstanceOf[js.Any])
    
    inline def visible(value: Boolean): this.type = set("visible", value.asInstanceOf[js.Any])
    
    inline def width(value: Double): this.type = set("width", value.asInstanceOf[js.Any])
    
    inline def x(value: Double): this.type = set("x", value.asInstanceOf[js.Any])
    
    inline def y(value: Double): this.type = set("y", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Group.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: GroupConfig & KonvaNodeEvents & ClassAttributes[typingsJapgolly.konva.mod.Konva.Group]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
