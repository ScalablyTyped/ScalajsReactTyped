package typingsJapgolly.reactBeautifulDnd.components

import japgolly.scalajs.react.facade.React.Element
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactBeautifulDnd.mod.DraggableId
import typingsJapgolly.reactBeautifulDnd.mod.DraggableProps
import typingsJapgolly.reactBeautifulDnd.mod.DraggableProvided
import typingsJapgolly.reactBeautifulDnd.mod.DraggableRubric
import typingsJapgolly.reactBeautifulDnd.mod.DraggableStateSnapshot
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Draggable {
  
  inline def apply(
    children: (/* provided */ DraggableProvided, /* snapshot */ DraggableStateSnapshot, /* rubric */ DraggableRubric) => Element,
    draggableId: DraggableId,
    index: Double
  ): Builder = {
    val __props = js.Dynamic.literal(children = js.Any.fromFunction3(children), draggableId = draggableId.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[DraggableProps]))
  }
  
  @JSImport("react-beautiful-dnd", "Draggable")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactBeautifulDnd.mod.Draggable] {
    
    inline def disableInteractiveElementBlocking(value: Boolean): this.type = set("disableInteractiveElementBlocking", value.asInstanceOf[js.Any])
    
    inline def isDragDisabled(value: Boolean): this.type = set("isDragDisabled", value.asInstanceOf[js.Any])
    
    inline def shouldRespectForcePress(value: Boolean): this.type = set("shouldRespectForcePress", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: DraggableProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
