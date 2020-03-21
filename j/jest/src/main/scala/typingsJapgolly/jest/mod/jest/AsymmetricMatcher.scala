package typingsJapgolly.jest.mod.jest

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsymmetricMatcher extends js.Object {
  def asymmetricMatch(other: js.Any): Boolean
}

object AsymmetricMatcher {
  @scala.inline
  def apply(asymmetricMatch: js.Any => CallbackTo[Boolean]): AsymmetricMatcher = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("asymmetricMatch")(js.Any.fromFunction1((t0: js.Any) => asymmetricMatch(t0).runNow()))
    __obj.asInstanceOf[AsymmetricMatcher]
  }
}

