package typingsJapgolly.matcherCollection

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.minimatch.mod.IMinimatch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMatch extends js.Object {
  var matchers: js.Array[IMinimatch]
  def `match`(value: String): Boolean
  def mayContain(value: String): Boolean
}

object AnonMatch {
  @scala.inline
  def apply(
    `match`: String => CallbackTo[Boolean],
    matchers: js.Array[IMinimatch],
    mayContain: String => CallbackTo[Boolean]
  ): AnonMatch = {
    val __obj = js.Dynamic.literal(matchers = matchers.asInstanceOf[js.Any])
    __obj.updateDynamic("match")(js.Any.fromFunction1((t0: java.lang.String) => `match`(t0).runNow()))
    __obj.updateDynamic("mayContain")(js.Any.fromFunction1((t0: java.lang.String) => mayContain(t0).runNow()))
    __obj.asInstanceOf[AnonMatch]
  }
}

