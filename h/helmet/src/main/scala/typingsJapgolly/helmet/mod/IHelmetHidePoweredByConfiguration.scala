package typingsJapgolly.helmet.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHelmetHidePoweredByConfiguration extends js.Object {
  var setTo: js.UndefOr[String] = js.undefined
}

object IHelmetHidePoweredByConfiguration {
  @scala.inline
  def apply(setTo: String = null): IHelmetHidePoweredByConfiguration = {
    val __obj = js.Dynamic.literal()
    if (setTo != null) __obj.updateDynamic("setTo")(setTo.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHelmetHidePoweredByConfiguration]
  }
}

