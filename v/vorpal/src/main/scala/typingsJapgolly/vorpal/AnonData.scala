package typingsJapgolly.vorpal

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonData extends js.Object {
  def data(): js.Promise[js.Array[String]]
}

object AnonData {
  @scala.inline
  def apply(data: CallbackTo[js.Promise[js.Array[String]]]): AnonData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("data")(data.toJsFn)
    __obj.asInstanceOf[AnonData]
  }
}

