package typingsJapgolly.reactElemental.mod

import typingsJapgolly.reactElemental.AnonRegular
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FontOpts extends js.Object {
  var primary: js.UndefOr[AnonRegular] = js.undefined
  var secondary: js.UndefOr[AnonRegular] = js.undefined
}

object FontOpts {
  @scala.inline
  def apply(primary: AnonRegular = null, secondary: AnonRegular = null): FontOpts = {
    val __obj = js.Dynamic.literal()
    if (primary != null) __obj.updateDynamic("primary")(primary.asInstanceOf[js.Any])
    if (secondary != null) __obj.updateDynamic("secondary")(secondary.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontOpts]
  }
}

