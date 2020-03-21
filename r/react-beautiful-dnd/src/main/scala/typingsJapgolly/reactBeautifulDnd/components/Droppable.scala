package typingsJapgolly.reactBeautifulDnd.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Element
import org.scalablytyped.runtime.StringDictionary
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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Droppable {
  def apply(
    droppableId: DroppableId,
    direction: Direction = null,
    getContainerForClone: js.UndefOr[CallbackTo[Element]] = js.undefined,
    ignoreContainerClipping: js.UndefOr[Boolean] = js.undefined,
    isCombineEnabled: js.UndefOr[Boolean] = js.undefined,
    isDropDisabled: js.UndefOr[Boolean] = js.undefined,
    mode: DroppableMode = null,
    renderClone: (/* provided */ DraggableProvided, /* snapshot */ DraggableStateSnapshot, /* rubric */ DraggableRubric) => CallbackTo[Element] = null,
    `type`: TypeId = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: (DroppableProvided, DroppableStateSnapshot) => CallbackTo[Element]
  ): UnmountedWithRoot[DroppableProps, typingsJapgolly.reactBeautifulDnd.mod.Droppable, Unit, DroppableProps] = {
    val __obj = js.Dynamic.literal(droppableId = droppableId.asInstanceOf[js.Any])
  
      __obj.updateDynamic("children")(js.Any.fromFunction2((t0: typingsJapgolly.reactBeautifulDnd.mod.DroppableProvided, t1: typingsJapgolly.reactBeautifulDnd.mod.DroppableStateSnapshot) => children(t0, t1).runNow()))
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    getContainerForClone.foreach(p => __obj.updateDynamic("getContainerForClone")(p.toJsFn))
    if (!js.isUndefined(ignoreContainerClipping)) __obj.updateDynamic("ignoreContainerClipping")(ignoreContainerClipping.asInstanceOf[js.Any])
    if (!js.isUndefined(isCombineEnabled)) __obj.updateDynamic("isCombineEnabled")(isCombineEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(isDropDisabled)) __obj.updateDynamic("isDropDisabled")(isDropDisabled.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (renderClone != null) __obj.updateDynamic("renderClone")(js.Any.fromFunction3((t0: /* provided */ typingsJapgolly.reactBeautifulDnd.mod.DraggableProvided, t1: /* snapshot */ typingsJapgolly.reactBeautifulDnd.mod.DraggableStateSnapshot, t2: /* rubric */ typingsJapgolly.reactBeautifulDnd.mod.DraggableRubric) => renderClone(t0, t1, t2).runNow()))
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactBeautifulDnd.mod.DroppableProps, 
  japgolly.scalajs.react.Children.None, 
  typingsJapgolly.reactBeautifulDnd.mod.Droppable](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactBeautifulDnd.mod.DroppableProps])
  }
  @JSImport("react-beautiful-dnd", "Droppable")
  @js.native
  object componentImport extends js.Object
  
}

