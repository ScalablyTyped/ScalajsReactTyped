package typingsJapgolly.jodata.jo

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// TODO What is the most appropriate place for these interfaces?
// They are only required by the `jo` class.
trait ISettings extends js.Object {
  def isSet(): Boolean
  def reset(): Unit
}

object ISettings {
  @scala.inline
  def apply(isSet: CallbackTo[Boolean], reset: Callback): ISettings = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("isSet")(isSet.toJsFn)
    __obj.updateDynamic("reset")(reset.toJsFn)
    __obj.asInstanceOf[ISettings]
  }
}

