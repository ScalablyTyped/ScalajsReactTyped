package typingsJapgolly.cypress

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDefaults extends js.Object {
  def defaults(options: PartialServerOptions): Unit
}

object AnonDefaults {
  @scala.inline
  def apply(defaults: PartialServerOptions => Callback): AnonDefaults = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("defaults")(js.Any.fromFunction1((t0: typingsJapgolly.cypress.PartialServerOptions) => defaults(t0).runNow()))
    __obj.asInstanceOf[AnonDefaults]
  }
}

