package typingsJapgolly.jstimezonedetect

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonName extends js.Object {
  def name(): String
}

object AnonName {
  @scala.inline
  def apply(name: CallbackTo[String]): AnonName = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name.toJsFn)
    __obj.asInstanceOf[AnonName]
  }
}

