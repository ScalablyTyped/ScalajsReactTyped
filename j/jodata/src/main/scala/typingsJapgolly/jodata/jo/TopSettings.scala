package typingsJapgolly.jodata.jo

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TopSettings extends ISettings {
  var DefaultTop: Double
  var Top: Double
}

object TopSettings {
  @scala.inline
  def apply(DefaultTop: Double, Top: Double, isSet: CallbackTo[Boolean], reset: Callback): TopSettings = {
    val __obj = js.Dynamic.literal(DefaultTop = DefaultTop.asInstanceOf[js.Any], Top = Top.asInstanceOf[js.Any])
    __obj.updateDynamic("isSet")(isSet.toJsFn)
    __obj.updateDynamic("reset")(reset.toJsFn)
    __obj.asInstanceOf[TopSettings]
  }
}

