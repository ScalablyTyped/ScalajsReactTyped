package typingsJapgolly.ionicCore.searchbarInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchbarChangeEventDetail extends js.Object {
  var value: js.UndefOr[String] = js.undefined
}

object SearchbarChangeEventDetail {
  @scala.inline
  def apply(value: String = null): SearchbarChangeEventDetail = {
    val __obj = js.Dynamic.literal()
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchbarChangeEventDetail]
  }
}

