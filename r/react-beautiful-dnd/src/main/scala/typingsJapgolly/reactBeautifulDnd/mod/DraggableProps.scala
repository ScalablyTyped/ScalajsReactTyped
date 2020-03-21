package typingsJapgolly.reactBeautifulDnd.mod

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DraggableProps extends js.Object {
  var children: DraggableChildrenFn
  var disableInteractiveElementBlocking: js.UndefOr[Boolean] = js.undefined
  var draggableId: DraggableId
  var index: Double
  var isDragDisabled: js.UndefOr[Boolean] = js.undefined
  var shouldRespectForcePress: js.UndefOr[Boolean] = js.undefined
}

object DraggableProps {
  @scala.inline
  def apply(
    children: (/* provided */ DraggableProvided, /* snapshot */ DraggableStateSnapshot, /* rubric */ DraggableRubric) => CallbackTo[Element],
    draggableId: DraggableId,
    index: Double,
    disableInteractiveElementBlocking: js.UndefOr[Boolean] = js.undefined,
    isDragDisabled: js.UndefOr[Boolean] = js.undefined,
    shouldRespectForcePress: js.UndefOr[Boolean] = js.undefined
  ): DraggableProps = {
    val __obj = js.Dynamic.literal(draggableId = draggableId.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
    __obj.updateDynamic("children")(js.Any.fromFunction3((t0: /* provided */ typingsJapgolly.reactBeautifulDnd.mod.DraggableProvided, t1: /* snapshot */ typingsJapgolly.reactBeautifulDnd.mod.DraggableStateSnapshot, t2: /* rubric */ typingsJapgolly.reactBeautifulDnd.mod.DraggableRubric) => children(t0, t1, t2).runNow()))
    if (!js.isUndefined(disableInteractiveElementBlocking)) __obj.updateDynamic("disableInteractiveElementBlocking")(disableInteractiveElementBlocking.asInstanceOf[js.Any])
    if (!js.isUndefined(isDragDisabled)) __obj.updateDynamic("isDragDisabled")(isDragDisabled.asInstanceOf[js.Any])
    if (!js.isUndefined(shouldRespectForcePress)) __obj.updateDynamic("shouldRespectForcePress")(shouldRespectForcePress.asInstanceOf[js.Any])
    __obj.asInstanceOf[DraggableProps]
  }
}

