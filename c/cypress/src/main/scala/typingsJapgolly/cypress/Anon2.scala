package typingsJapgolly.cypress

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon2 extends js.Object {
  def defaults(options: PartialScreenshotDefaults): Unit
}

object Anon2 {
  @scala.inline
  def apply(defaults: PartialScreenshotDefaults => Callback): Anon2 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("defaults")(js.Any.fromFunction1((t0: typingsJapgolly.cypress.PartialScreenshotDefaults) => defaults(t0).runNow()))
    __obj.asInstanceOf[Anon2]
  }
}

