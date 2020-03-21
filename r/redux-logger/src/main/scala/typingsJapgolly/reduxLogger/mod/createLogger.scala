package typingsJapgolly.reduxLogger.mod

import typingsJapgolly.redux.mod.AnyAction
import typingsJapgolly.redux.mod.Dispatch
import typingsJapgolly.redux.mod.Middleware
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-logger", "createLogger")
@js.native
object createLogger extends js.Object {
  def apply(): Middleware[js.Object, _, Dispatch[AnyAction]] = js.native
  def apply(options: ReduxLoggerOptions): Middleware[js.Object, _, Dispatch[AnyAction]] = js.native
}

