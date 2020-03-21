package typingsJapgolly.octokitRest

import japgolly.scalajs.react.Callback
import typingsJapgolly.octokitRest.mod.Octokit.HookError
import typingsJapgolly.octokitRest.mod.Octokit.HookOptions
import typingsJapgolly.octokitRest.mod.Octokit.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAfter extends js.Object {
  def after(name: String, callback: js.Function2[/* response */ Response[_], /* options */ HookOptions, Unit]): Unit
  def before(name: String, callback: js.Function1[/* options */ HookOptions, Unit]): Unit
  def error(name: String, callback: js.Function2[/* error */ HookError, /* options */ HookOptions, Unit]): Unit
  def wrap(
    name: String,
    callback: js.Function2[
      /* request */ js.Function1[/* options */ HookOptions, js.Promise[Response[_]]], 
      /* options */ HookOptions, 
      Unit
    ]
  ): Unit
}

object AnonAfter {
  @scala.inline
  def apply(
    after: (String, js.Function2[/* response */ Response[js.Any], /* options */ HookOptions, Unit]) => Callback,
    before: (String, js.Function1[/* options */ HookOptions, Unit]) => Callback,
    error: (String, js.Function2[/* error */ HookError, /* options */ HookOptions, Unit]) => Callback,
    wrap: (String, js.Function2[
      /* request */ js.Function1[/* options */ HookOptions, js.Promise[Response[js.Any]]], 
      /* options */ HookOptions, 
      Unit
    ]) => Callback
  ): AnonAfter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("after")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function2[
  /* response */ typingsJapgolly.octokitRest.mod.Octokit.Response[js.Any], 
  /* options */ typingsJapgolly.octokitRest.mod.Octokit.HookOptions, 
  scala.Unit]) => after(t0, t1).runNow()))
    __obj.updateDynamic("before")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[/* options */ typingsJapgolly.octokitRest.mod.Octokit.HookOptions, scala.Unit]) => before(t0, t1).runNow()))
    __obj.updateDynamic("error")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function2[
  /* error */ typingsJapgolly.octokitRest.mod.Octokit.HookError, 
  /* options */ typingsJapgolly.octokitRest.mod.Octokit.HookOptions, 
  scala.Unit]) => error(t0, t1).runNow()))
    __obj.updateDynamic("wrap")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function2[
  /* request */ js.Function1[
    /* options */ typingsJapgolly.octokitRest.mod.Octokit.HookOptions, 
    js.Promise[typingsJapgolly.octokitRest.mod.Octokit.Response[js.Any]]
  ], 
  /* options */ typingsJapgolly.octokitRest.mod.Octokit.HookOptions, 
  scala.Unit]) => wrap(t0, t1).runNow()))
    __obj.asInstanceOf[AnonAfter]
  }
}

