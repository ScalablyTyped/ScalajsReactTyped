package typingsJapgolly.styletronReact.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.styletronReact.styletronReactBooleans.`false`
import typingsJapgolly.styletronReact.styletronReactBooleans.`true`
import typingsJapgolly.styletronStandard.mod.StyleObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.styletronReact.mod.AssignmentCommutativeReducerContainer
  - typingsJapgolly.styletronReact.mod.NonAssignmentCommutativeReducerContainer
*/
trait ReducerContainer extends js.Object

object ReducerContainer {
  @scala.inline
  def AssignmentCommutativeReducerContainer(
    assignmentCommutative: `true`,
    factory: StyleObject => CallbackTo[typingsJapgolly.styletronReact.mod.AssignmentCommutativeReducerContainer],
    reducer: (/* style */ StyleObject, /* props */ js.UndefOr[js.Object]) => CallbackTo[StyleObject],
    style: StyleObject
  ): ReducerContainer = {
    val __obj = js.Dynamic.literal(assignmentCommutative = assignmentCommutative.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.updateDynamic("factory")(js.Any.fromFunction1((t0: typingsJapgolly.styletronStandard.mod.StyleObject) => factory(t0).runNow()))
    __obj.updateDynamic("reducer")(js.Any.fromFunction2((t0: /* style */ typingsJapgolly.styletronStandard.mod.StyleObject, t1: /* props */ js.UndefOr[js.Object]) => reducer(t0, t1).runNow()))
    __obj.asInstanceOf[ReducerContainer]
  }
  @scala.inline
  def NonAssignmentCommutativeReducerContainer(
    assignmentCommutative: `false`,
    reducer: (/* style */ StyleObject, /* props */ js.UndefOr[js.Object]) => CallbackTo[StyleObject]
  ): ReducerContainer = {
    val __obj = js.Dynamic.literal(assignmentCommutative = assignmentCommutative.asInstanceOf[js.Any])
    __obj.updateDynamic("reducer")(js.Any.fromFunction2((t0: /* style */ typingsJapgolly.styletronStandard.mod.StyleObject, t1: /* props */ js.UndefOr[js.Object]) => reducer(t0, t1).runNow()))
    __obj.asInstanceOf[ReducerContainer]
  }
}

