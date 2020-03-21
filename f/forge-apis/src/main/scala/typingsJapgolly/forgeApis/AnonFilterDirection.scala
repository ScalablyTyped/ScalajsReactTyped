package typingsJapgolly.forgeApis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFilterDirection extends js.Object {
  var filterDirection: js.UndefOr[String] = js.undefined
  var filterExtensionType: js.UndefOr[js.Array[String]] = js.undefined
  var filterId: js.UndefOr[js.Array[String]] = js.undefined
  var filterRefType: js.UndefOr[js.Array[String]] = js.undefined
  var filterType: js.UndefOr[js.Array[String]] = js.undefined
}

object AnonFilterDirection {
  @scala.inline
  def apply(
    filterDirection: String = null,
    filterExtensionType: js.Array[String] = null,
    filterId: js.Array[String] = null,
    filterRefType: js.Array[String] = null,
    filterType: js.Array[String] = null
  ): AnonFilterDirection = {
    val __obj = js.Dynamic.literal()
    if (filterDirection != null) __obj.updateDynamic("filterDirection")(filterDirection.asInstanceOf[js.Any])
    if (filterExtensionType != null) __obj.updateDynamic("filterExtensionType")(filterExtensionType.asInstanceOf[js.Any])
    if (filterId != null) __obj.updateDynamic("filterId")(filterId.asInstanceOf[js.Any])
    if (filterRefType != null) __obj.updateDynamic("filterRefType")(filterRefType.asInstanceOf[js.Any])
    if (filterType != null) __obj.updateDynamic("filterType")(filterType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFilterDirection]
  }
}

