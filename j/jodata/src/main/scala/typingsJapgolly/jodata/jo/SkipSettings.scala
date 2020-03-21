package typingsJapgolly.jodata.jo

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SkipSettings extends ISettings {
  var DefaultSkip: Double
  var Skip: Double
}

object SkipSettings {
  @scala.inline
  def apply(DefaultSkip: Double, Skip: Double, isSet: CallbackTo[Boolean], reset: Callback): SkipSettings = {
    val __obj = js.Dynamic.literal(DefaultSkip = DefaultSkip.asInstanceOf[js.Any], Skip = Skip.asInstanceOf[js.Any])
    __obj.updateDynamic("isSet")(isSet.toJsFn)
    __obj.updateDynamic("reset")(reset.toJsFn)
    __obj.asInstanceOf[SkipSettings]
  }
}

