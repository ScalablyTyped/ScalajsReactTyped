package typingsJapgolly.wixStyleReact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.wixStyleReact.anon.AddedIndex
import typingsJapgolly.wixStyleReact.distTypesDragAndDropDraggableMod.DragEventParams
import typingsJapgolly.wixStyleReact.distTypesSortableGridBaseMod.SortableGridBaseProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SortableGridBase {
  
  @JSImport("wix-style-react", "SortableGridBase")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.wixStyleReact.mod.SortableGridBase] {
    
    inline def animationDuration(value: Double): this.type = set("animationDuration", value.asInstanceOf[js.Any])
    
    inline def animationTiming(value: String): this.type = set("animationTiming", value.asInstanceOf[js.Any])
    
    inline def canDrag(value: /* params */ DragEventParams => Callback): this.type = set("canDrag", js.Any.fromFunction1((t0: /* params */ DragEventParams) => value(t0).runNow()))
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def containerId(value: String): this.type = set("containerId", value.asInstanceOf[js.Any])
    
    inline def contentClassName(value: String): this.type = set("contentClassName", value.asInstanceOf[js.Any])
    
    inline def dataHook(value: String): this.type = set("dataHook", value.asInstanceOf[js.Any])
    
    inline def delay(value: Double): this.type = set("delay", value.asInstanceOf[js.Any])
    
    inline def dragPreview(value: Boolean): this.type = set("dragPreview", value.asInstanceOf[js.Any])
    
    inline def droppable(value: Boolean): this.type = set("droppable", value.asInstanceOf[js.Any])
    
    inline def endFixedElement(value: VdomNode): this.type = set("endFixedElement", value.rawNode.asInstanceOf[js.Any])
    
    inline def endFixedElementNull: this.type = set("endFixedElement", null)
    
    inline def endFixedElementVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("endFixedElement", js.Array(value*))
    
    inline def endFixedElementVdomElement(value: VdomElement): this.type = set("endFixedElement", value.rawElement.asInstanceOf[js.Any])
    
    inline def groupName(value: String): this.type = set("groupName", value.asInstanceOf[js.Any])
    
    inline def hasDragged(value: Boolean): this.type = set("hasDragged", value.asInstanceOf[js.Any])
    
    inline def id(value: Double | String): this.type = set("id", value.asInstanceOf[js.Any])
    
    inline def index(value: Double): this.type = set("index", value.asInstanceOf[js.Any])
    
    inline def item(value: js.Object): this.type = set("item", value.asInstanceOf[js.Any])
    
    inline def items(value: js.Array[js.Object]): this.type = set("items", value.asInstanceOf[js.Any])
    
    inline def itemsVarargs(value: js.Object*): this.type = set("items", js.Array(value*))
    
    inline def listOfPropsThatAffectItems(value: js.Array[Any]): this.type = set("listOfPropsThatAffectItems", value.asInstanceOf[js.Any])
    
    inline def listOfPropsThatAffectItemsVarargs(value: Any*): this.type = set("listOfPropsThatAffectItems", js.Array(value*))
    
    inline def onDragEnd(value: /* params */ DragEventParams => Callback): this.type = set("onDragEnd", js.Any.fromFunction1((t0: /* params */ DragEventParams) => value(t0).runNow()))
    
    inline def onDragStart(value: /* params */ DragEventParams => Callback): this.type = set("onDragStart", js.Any.fromFunction1((t0: /* params */ DragEventParams) => value(t0).runNow()))
    
    inline def onDrop(value: js.Function): this.type = set("onDrop", value.asInstanceOf[js.Any])
    
    inline def onHover(value: /* params */ AddedIndex => Callback): this.type = set("onHover", js.Any.fromFunction1((t0: /* params */ AddedIndex) => value(t0).runNow()))
    
    inline def onMoveOut(value: /* id */ Any => Callback): this.type = set("onMoveOut", js.Any.fromFunction1((t0: /* id */ Any) => value(t0).runNow()))
    
    inline def renderItem(value: /* data */ js.Object => Node): this.type = set("renderItem", js.Any.fromFunction1(value))
    
    inline def setWrapperNode(value: (/* node */ HTMLElement, /* index */ Double, /* item */ js.Object) => Callback): this.type = set("setWrapperNode", js.Any.fromFunction3((t0: /* node */ HTMLElement, t1: /* index */ Double, t2: /* item */ js.Object) => (value(t0, t1, t2)).runNow()))
    
    inline def shift(value: js.Array[Double]): this.type = set("shift", value.asInstanceOf[js.Any])
    
    inline def shiftVarargs(value: Double*): this.type = set("shift", js.Array(value*))
    
    inline def startFixedElement(value: VdomNode): this.type = set("startFixedElement", value.rawNode.asInstanceOf[js.Any])
    
    inline def startFixedElementNull: this.type = set("startFixedElement", null)
    
    inline def startFixedElementVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("startFixedElement", js.Array(value*))
    
    inline def startFixedElementVdomElement(value: VdomElement): this.type = set("startFixedElement", value.rawElement.asInstanceOf[js.Any])
    
    inline def usePortal(value: Boolean): this.type = set("usePortal", value.asInstanceOf[js.Any])
    
    inline def withHandle(value: Boolean): this.type = set("withHandle", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: SortableGridBase.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: SortableGridBaseProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
