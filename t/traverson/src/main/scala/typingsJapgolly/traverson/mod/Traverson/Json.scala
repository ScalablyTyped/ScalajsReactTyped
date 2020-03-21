package typingsJapgolly.traverson.mod.Traverson

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Json extends js.Object {
  def parseJson(): js.Any
}

object Json {
  @scala.inline
  def apply(parseJson: CallbackTo[js.Any]): Json = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("parseJson")(parseJson.toJsFn)
    __obj.asInstanceOf[Json]
  }
}

