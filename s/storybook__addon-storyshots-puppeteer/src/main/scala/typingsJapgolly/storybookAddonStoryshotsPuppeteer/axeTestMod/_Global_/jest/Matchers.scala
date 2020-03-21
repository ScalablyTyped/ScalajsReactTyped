package typingsJapgolly.storybookAddonStoryshotsPuppeteer.axeTestMod._Global_.jest

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Matchers[R, T] extends js.Object {
  def toPassAxeTests(parameters: js.Any): R
}

object Matchers {
  @scala.inline
  def apply[R, T](toPassAxeTests: js.Any => CallbackTo[R]): Matchers[R, T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("toPassAxeTests")(js.Any.fromFunction1((t0: js.Any) => toPassAxeTests(t0).runNow()))
    __obj.asInstanceOf[Matchers[R, T]]
  }
}

