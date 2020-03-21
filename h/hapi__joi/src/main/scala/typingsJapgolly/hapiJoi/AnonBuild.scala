package typingsJapgolly.hapiJoi

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.hapiJoi.mod.ExtensionBoundSchema
import typingsJapgolly.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBuild extends js.Object {
  var build: js.UndefOr[js.Function2[/* obj */ ExtensionBoundSchema, /* desc */ Record[String, _], _]] = js.undefined
}

object AnonBuild {
  @scala.inline
  def apply(
    build: (/* obj */ ExtensionBoundSchema, /* desc */ Record[String, js.Any]) => CallbackTo[js.Any] = null
  ): AnonBuild = {
    val __obj = js.Dynamic.literal()
    if (build != null) __obj.updateDynamic("build")(js.Any.fromFunction2((t0: /* obj */ typingsJapgolly.hapiJoi.mod.ExtensionBoundSchema, t1: /* desc */ typingsJapgolly.std.Record[java.lang.String, js.Any]) => build(t0, t1).runNow()))
    __obj.asInstanceOf[AnonBuild]
  }
}

