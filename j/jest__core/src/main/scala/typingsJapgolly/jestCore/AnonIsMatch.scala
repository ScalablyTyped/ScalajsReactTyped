package typingsJapgolly.jestCore

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.jestTypes.configMod.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIsMatch extends js.Object {
  var stat: String
  def isMatch(path: Path): Boolean
}

object AnonIsMatch {
  @scala.inline
  def apply(isMatch: Path => CallbackTo[Boolean], stat: String): AnonIsMatch = {
    val __obj = js.Dynamic.literal(stat = stat.asInstanceOf[js.Any])
    __obj.updateDynamic("isMatch")(js.Any.fromFunction1((t0: typingsJapgolly.jestTypes.configMod.Path) => isMatch(t0).runNow()))
    __obj.asInstanceOf[AnonIsMatch]
  }
}

