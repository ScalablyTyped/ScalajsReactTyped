package typingsJapgolly.reduxDuck.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.redux.mod.Action
import typingsJapgolly.redux.mod.Reducer
import typingsJapgolly.reduxDuck.AnonType
import typingsJapgolly.std.Extract
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DuckBuilder[AppAction /* <: Action[_] */] extends js.Object {
  def createAction[T /* <: String with (/* import warning: importer.ImportType#apply Failed type conversion: AppAction['type'] */ js.Any) */](a: T): ActionCreator[Extract[AppAction, AnonType[T]]]
  def createReducer[S](a: ActionHandlers[S, AppAction], b: S): Reducer[S, AppAction]
  def defineType(a: ActionName): ActionType
}

object DuckBuilder {
  @scala.inline
  def apply[AppAction /* <: Action[_] */](
    createAction: js.Any => CallbackTo[ActionCreator[Extract[AppAction, AnonType[js.Any]]]],
    createReducer: (ActionHandlers[js.Any, AppAction], js.Any) => CallbackTo[Reducer[js.Any, AppAction]],
    defineType: ActionName => CallbackTo[ActionType]
  ): DuckBuilder[AppAction] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("createAction")(js.Any.fromFunction1((t0: js.Any) => createAction(t0).runNow()))
    __obj.updateDynamic("createReducer")(js.Any.fromFunction2((t0: typingsJapgolly.reduxDuck.mod.ActionHandlers[js.Any, AppAction], t1: js.Any) => createReducer(t0, t1).runNow()))
    __obj.updateDynamic("defineType")(js.Any.fromFunction1((t0: typingsJapgolly.reduxDuck.mod.ActionName) => defineType(t0).runNow()))
    __obj.asInstanceOf[DuckBuilder[AppAction]]
  }
}

