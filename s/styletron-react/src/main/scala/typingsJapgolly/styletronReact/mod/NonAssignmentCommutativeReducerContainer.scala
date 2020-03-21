package typingsJapgolly.styletronReact.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.styletronReact.styletronReactBooleans.`false`
import typingsJapgolly.styletronStandard.mod.StyleObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NonAssignmentCommutativeReducerContainer extends ReducerContainer {
  var assignmentCommutative: `false`
  var reducer: Reducer
}

object NonAssignmentCommutativeReducerContainer {
  @scala.inline
  def apply(
    assignmentCommutative: `false`,
    reducer: (/* style */ StyleObject, /* props */ js.UndefOr[js.Object]) => CallbackTo[StyleObject]
  ): NonAssignmentCommutativeReducerContainer = {
    val __obj = js.Dynamic.literal(assignmentCommutative = assignmentCommutative.asInstanceOf[js.Any])
    __obj.updateDynamic("reducer")(js.Any.fromFunction2((t0: /* style */ typingsJapgolly.styletronStandard.mod.StyleObject, t1: /* props */ js.UndefOr[js.Object]) => reducer(t0, t1).runNow()))
    __obj.asInstanceOf[NonAssignmentCommutativeReducerContainer]
  }
}

