package typingsJapgolly.cesium

import typingsJapgolly.cesium.mod.Credit
import typingsJapgolly.cesium.mod.Ellipsoid
import typingsJapgolly.cesium.mod.Rectangle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCreditEllipsoid extends js.Object {
  var credit: js.UndefOr[Credit | String] = js.undefined
  var ellipsoid: js.UndefOr[Ellipsoid] = js.undefined
  var proxy: js.UndefOr[js.Any] = js.undefined
  var rectangle: js.UndefOr[Rectangle] = js.undefined
  var url: String
}

object AnonCreditEllipsoid {
  @scala.inline
  def apply(
    url: String,
    credit: Credit | String = null,
    ellipsoid: Ellipsoid = null,
    proxy: js.Any = null,
    rectangle: Rectangle = null
  ): AnonCreditEllipsoid = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (credit != null) __obj.updateDynamic("credit")(credit.asInstanceOf[js.Any])
    if (ellipsoid != null) __obj.updateDynamic("ellipsoid")(ellipsoid.asInstanceOf[js.Any])
    if (proxy != null) __obj.updateDynamic("proxy")(proxy.asInstanceOf[js.Any])
    if (rectangle != null) __obj.updateDynamic("rectangle")(rectangle.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCreditEllipsoid]
  }
}

