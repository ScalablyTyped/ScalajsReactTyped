package typingsJapgolly.hexo.mod.extend

import japgolly.scalajs.react.Callback
import typingsJapgolly.minimist.mod.ParsedArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Migrator extends js.Object {
  def register(
    name: String,
    fn: js.Function2[/* args */ ParsedArgs, /* fn */ js.Function1[/* err */ js.Any, Unit], Unit]
  ): Unit
}

object Migrator {
  @scala.inline
  def apply(
    register: (String, js.Function2[/* args */ ParsedArgs, /* fn */ js.Function1[/* err */ js.Any, Unit], Unit]) => Callback
  ): Migrator = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("register")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function2[
  /* args */ typingsJapgolly.minimist.mod.ParsedArgs, 
  /* fn */ js.Function1[/* err */ js.Any, scala.Unit], 
  scala.Unit]) => register(t0, t1).runNow()))
    __obj.asInstanceOf[Migrator]
  }
}

