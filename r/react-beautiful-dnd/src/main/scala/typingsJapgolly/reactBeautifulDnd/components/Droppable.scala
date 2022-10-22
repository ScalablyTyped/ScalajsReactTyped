package typingsJapgolly.reactBeautifulDnd.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.facade.React.Element
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactBeautifulDnd.mod.Direction
import typingsJapgolly.reactBeautifulDnd.mod.DraggableProvided
import typingsJapgolly.reactBeautifulDnd.mod.DraggableRubric
import typingsJapgolly.reactBeautifulDnd.mod.DraggableStateSnapshot
import typingsJapgolly.reactBeautifulDnd.mod.DroppableId
import typingsJapgolly.reactBeautifulDnd.mod.DroppableMode
import typingsJapgolly.reactBeautifulDnd.mod.DroppableProps
import typingsJapgolly.reactBeautifulDnd.mod.DroppableProvided
import typingsJapgolly.reactBeautifulDnd.mod.DroppableStateSnapshot
import typingsJapgolly.reactBeautifulDnd.mod.TypeId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Droppable {
  
  inline def apply(children: (DroppableProvided, DroppableStateSnapshot) => Element, droppableId: DroppableId): Builder = {
    val __props = js.Dynamic.literal(children = js.Any.fromFunction2(children), droppableId = droppableId.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[DroppableProps]))
  }
  
  @JSImport("react-beautiful-dnd", "Droppable")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactBeautifulDnd.mod.Droppable] {
    
    inline def direction(value: Direction): this.type = set("direction", value.asInstanceOf[js.Any])
    
    inline def getContainerForClone(value: CallbackTo[Element]): this.type = set("getContainerForClone", value.toJsFn)
    
    inline def ignoreContainerClipping(value: Boolean): this.type = set("ignoreContainerClipping", value.asInstanceOf[js.Any])
    
    inline def isCombineEnabled(value: Boolean): this.type = set("isCombineEnabled", value.asInstanceOf[js.Any])
    
    inline def isDropDisabled(value: Boolean): this.type = set("isDropDisabled", value.asInstanceOf[js.Any])
    
    inline def mode(value: DroppableMode): this.type = set("mode", value.asInstanceOf[js.Any])
    
    inline def renderClone(
      value: (/* provided */ DraggableProvided, /* snapshot */ DraggableStateSnapshot, /* rubric */ DraggableRubric) => Element
    ): this.type = set("renderClone", js.Any.fromFunction3(value))
    
    inline def `type`(value: TypeId): this.type = set("type", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: DroppableProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
