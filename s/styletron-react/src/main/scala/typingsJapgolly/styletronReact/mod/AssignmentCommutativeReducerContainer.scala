package typingsJapgolly.styletronReact.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.styletronReact.styletronReactBooleans.`true`
import typingsJapgolly.styletronStandard.mod.StyleObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssignmentCommutativeReducerContainer extends ReducerContainer {
  var assignmentCommutative: `true`
  var reducer: Reducer
  var style: StyleObject
  def factory(style: StyleObject): AssignmentCommutativeReducerContainer
}

object AssignmentCommutativeReducerContainer {
  @scala.inline
  def apply(
    assignmentCommutative: `true`,
    factory: StyleObject => CallbackTo[AssignmentCommutativeReducerContainer],
    reducer: (/* style */ StyleObject, /* props */ js.UndefOr[js.Object]) => CallbackTo[StyleObject],
    style: StyleObject
  ): AssignmentCommutativeReducerContainer = {
    val __obj = js.Dynamic.literal(assignmentCommutative = assignmentCommutative.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.updateDynamic("factory")(js.Any.fromFunction1((t0: typingsJapgolly.styletronStandard.mod.StyleObject) => factory(t0).runNow()))
    __obj.updateDynamic("reducer")(js.Any.fromFunction2((t0: /* style */ typingsJapgolly.styletronStandard.mod.StyleObject, t1: /* props */ js.UndefOr[js.Object]) => reducer(t0, t1).runNow()))
    __obj.asInstanceOf[AssignmentCommutativeReducerContainer]
  }
}

