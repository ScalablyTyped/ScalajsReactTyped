package typingsJapgolly.wordpressReduxRoutine

import typingsJapgolly.redux.mod.AnyAction
import typingsJapgolly.redux.mod.Dispatch
import typingsJapgolly.redux.mod.Middleware
import typingsJapgolly.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@wordpress/redux-routine", JSImport.Namespace)
@js.native
object mod extends js.Object {
  /**
    * Creates a Redux middleware, given an object of controls where each key is an action type for
    * which to act upon, the value a function which returns either a promise which is to resolve when
    * evaluation of the action should continue, or a value. The value or resolved promise value is
    * assigned on the return value of the yield assignment. If the control handler returns undefined,
    * the execution is not continued.
    *
    * @param controls - Object of control handlers.
    */
  def default(): Middleware[js.Object, _, Dispatch[AnyAction]] = js.native
  def default(controls: Record[String, js.Function1[/* action */ AnyAction, _]]): Middleware[js.Object, _, Dispatch[AnyAction]] = js.native
}

