package typingsJapgolly.koaSession.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.koa.mod.Application
import typingsJapgolly.koa.mod.Context
import typingsJapgolly.koa.mod.DefaultContext
import typingsJapgolly.koa.mod.DefaultState
import typingsJapgolly.koaSession.koaSessionBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContextSession extends js.Object {
  var app: Application[DefaultState, DefaultContext]
  var ctx: Context
  var opts: typingsJapgolly.koaSession.mod.opts
  var prevHash: String
  var session: Session | `false`
  var store: stores
  /**
    * Commit the session changes or removal.
    */
  def commit(): js.Promise[Unit]
  /**
    * internal logic of `ctx.session`
    */
  def get(): Session
  /**
    * init session from external store
    * will be called in the front of session middleware
    */
  def initFromExternal(): js.Promise[Unit]
  /**
    * internal logic of `ctx.session=`
    */
  def set(`val`: js.Any): Unit
}

object ContextSession {
  @scala.inline
  def apply(
    app: Application[DefaultState, DefaultContext],
    commit: CallbackTo[js.Promise[Unit]],
    ctx: Context,
    get: CallbackTo[Session],
    initFromExternal: CallbackTo[js.Promise[Unit]],
    opts: opts,
    prevHash: String,
    session: Session | `false`,
    set: js.Any => Callback,
    store: stores
  ): ContextSession = {
    val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any], ctx = ctx.asInstanceOf[js.Any], opts = opts.asInstanceOf[js.Any], prevHash = prevHash.asInstanceOf[js.Any], session = session.asInstanceOf[js.Any], store = store.asInstanceOf[js.Any])
    __obj.updateDynamic("commit")(commit.toJsFn)
    __obj.updateDynamic("get")(get.toJsFn)
    __obj.updateDynamic("initFromExternal")(initFromExternal.toJsFn)
    __obj.updateDynamic("set")(js.Any.fromFunction1((t0: js.Any) => set(t0).runNow()))
    __obj.asInstanceOf[ContextSession]
  }
}

