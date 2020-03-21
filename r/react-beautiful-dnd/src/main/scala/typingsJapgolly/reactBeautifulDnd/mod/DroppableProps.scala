package typingsJapgolly.reactBeautifulDnd.mod

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DroppableProps extends js.Object {
  var direction: js.UndefOr[Direction] = js.undefined
  var droppableId: DroppableId
  var getContainerForClone: js.UndefOr[js.Function0[Element]] = js.undefined
  var ignoreContainerClipping: js.UndefOr[Boolean] = js.undefined
  var isCombineEnabled: js.UndefOr[Boolean] = js.undefined
  var isDropDisabled: js.UndefOr[Boolean] = js.undefined
  var mode: js.UndefOr[DroppableMode] = js.undefined
  var renderClone: js.UndefOr[DraggableChildrenFn] = js.undefined
  var `type`: js.UndefOr[TypeId] = js.undefined
  def children(provided: DroppableProvided, snapshot: DroppableStateSnapshot): Element
}

object DroppableProps {
  @scala.inline
  def apply(
    children: (DroppableProvided, DroppableStateSnapshot) => CallbackTo[Element],
    droppableId: DroppableId,
    direction: Direction = null,
    getContainerForClone: js.UndefOr[CallbackTo[Element]] = js.undefined,
    ignoreContainerClipping: js.UndefOr[Boolean] = js.undefined,
    isCombineEnabled: js.UndefOr[Boolean] = js.undefined,
    isDropDisabled: js.UndefOr[Boolean] = js.undefined,
    mode: DroppableMode = null,
    renderClone: (/* provided */ DraggableProvided, /* snapshot */ DraggableStateSnapshot, /* rubric */ DraggableRubric) => CallbackTo[Element] = null,
    `type`: TypeId = null
  ): DroppableProps = {
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
    __obj.asInstanceOf[DroppableProps]
  }
}

