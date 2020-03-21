package typingsJapgolly.gulpTypescript.reporterMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.gulpTypescript.Typeofts
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Reporter extends js.Object {
  var error: js.UndefOr[js.Function2[/* error */ TypeScriptError, /* typescript */ Typeofts, Unit]] = js.undefined
  var finish: js.UndefOr[js.Function1[/* results */ CompilationResult, Unit]] = js.undefined
}

object Reporter {
  @scala.inline
  def apply(
    error: (/* error */ TypeScriptError, /* typescript */ Typeofts) => Callback = null,
    finish: /* results */ CompilationResult => Callback = null
  ): Reporter = {
    val __obj = js.Dynamic.literal()
    if (error != null) __obj.updateDynamic("error")(js.Any.fromFunction2((t0: /* error */ typingsJapgolly.gulpTypescript.reporterMod.TypeScriptError, t1: /* typescript */ typingsJapgolly.gulpTypescript.Typeofts) => error(t0, t1).runNow()))
    if (finish != null) __obj.updateDynamic("finish")(js.Any.fromFunction1((t0: /* results */ typingsJapgolly.gulpTypescript.reporterMod.CompilationResult) => finish(t0).runNow()))
    __obj.asInstanceOf[Reporter]
  }
}

