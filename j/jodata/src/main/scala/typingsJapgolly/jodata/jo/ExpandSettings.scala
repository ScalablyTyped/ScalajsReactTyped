package typingsJapgolly.jodata.jo

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExpandSettings extends ISettings {
  var DefaultExpand: String
  var Expand: String
}

object ExpandSettings {
  @scala.inline
  def apply(DefaultExpand: String, Expand: String, isSet: CallbackTo[Boolean], reset: Callback): ExpandSettings = {
    val __obj = js.Dynamic.literal(DefaultExpand = DefaultExpand.asInstanceOf[js.Any], Expand = Expand.asInstanceOf[js.Any])
    __obj.updateDynamic("isSet")(isSet.toJsFn)
    __obj.updateDynamic("reset")(reset.toJsFn)
    __obj.asInstanceOf[ExpandSettings]
  }
}

