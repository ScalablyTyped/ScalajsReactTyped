package typingsJapgolly.koaSession.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.koa.mod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExternalKeys extends js.Object {
  /**
    * get session object by key
    */
  def get(ctx: Context): String
  /**
    * set session object for key, with a maxAge (in ms)
    */
  def set(ctx: Context, value: js.Any): Unit
}

object ExternalKeys {
  @scala.inline
  def apply(get: Context => CallbackTo[String], set: (Context, js.Any) => Callback): ExternalKeys = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.koa.mod.Context) => get(t0).runNow()))
    __obj.updateDynamic("set")(js.Any.fromFunction2((t0: typingsJapgolly.koa.mod.Context, t1: js.Any) => set(t0, t1).runNow()))
    __obj.asInstanceOf[ExternalKeys]
  }
}

