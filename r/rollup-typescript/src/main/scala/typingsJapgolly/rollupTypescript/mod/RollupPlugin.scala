package typingsJapgolly.rollupTypescript.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.rollupTypescript.AnonCode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RollupPlugin extends js.Object {
  def load(id: String): String
  def resolveId(importee: String, importer: String): js.Any
  def transform(code: String, id: String): AnonCode
}

object RollupPlugin {
  @scala.inline
  def apply(
    load: String => CallbackTo[String],
    resolveId: (String, String) => CallbackTo[js.Any],
    transform: (String, String) => CallbackTo[AnonCode]
  ): RollupPlugin = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("load")(js.Any.fromFunction1((t0: java.lang.String) => load(t0).runNow()))
    __obj.updateDynamic("resolveId")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => resolveId(t0, t1).runNow()))
    __obj.updateDynamic("transform")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => transform(t0, t1).runNow()))
    __obj.asInstanceOf[RollupPlugin]
  }
}

