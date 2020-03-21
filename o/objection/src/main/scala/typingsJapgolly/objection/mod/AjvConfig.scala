package typingsJapgolly.objection.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.ajv.mod.Ajv
import typingsJapgolly.ajv.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AjvConfig extends js.Object {
  var options: js.UndefOr[Options] = js.undefined
  def onCreateAjv(ajv: Ajv): Unit
}

object AjvConfig {
  @scala.inline
  def apply(onCreateAjv: Ajv => Callback, options: Options = null): AjvConfig = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onCreateAjv")(js.Any.fromFunction1((t0: typingsJapgolly.ajv.mod.Ajv) => onCreateAjv(t0).runNow()))
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[AjvConfig]
  }
}

