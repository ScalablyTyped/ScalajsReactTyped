package typingsJapgolly.gapiClientBlogger

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLat extends js.Object {
  /** Location's latitude. */
  var lat: js.UndefOr[Double] = js.undefined
  /** Location's longitude. */
  var lng: js.UndefOr[Double] = js.undefined
  /** Location name. */
  var name: js.UndefOr[String] = js.undefined
  /** Location's viewport span. Can be used when rendering a map preview. */
  var span: js.UndefOr[String] = js.undefined
}

object AnonLat {
  @scala.inline
  def apply(lat: Int | Double = null, lng: Int | Double = null, name: String = null, span: String = null): AnonLat = {
    val __obj = js.Dynamic.literal()
    if (lat != null) __obj.updateDynamic("lat")(lat.asInstanceOf[js.Any])
    if (lng != null) __obj.updateDynamic("lng")(lng.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (span != null) __obj.updateDynamic("span")(span.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLat]
  }
}

