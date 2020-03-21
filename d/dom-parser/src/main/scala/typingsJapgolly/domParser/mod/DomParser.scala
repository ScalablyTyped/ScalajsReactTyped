package typingsJapgolly.domParser.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DomParser extends js.Object {
  def parseFromString(html: String): Dom
}

object DomParser {
  @scala.inline
  def apply(parseFromString: String => CallbackTo[Dom]): DomParser = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("parseFromString")(js.Any.fromFunction1((t0: java.lang.String) => parseFromString(t0).runNow()))
    __obj.asInstanceOf[DomParser]
  }
}

