package typingsJapgolly.navermaps.naver.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PanoramaLocation extends js.Object {
  var address: String
  var coord: LatLng
  var panoId: String
  var photodate: String
  var title: String
}

object PanoramaLocation {
  @scala.inline
  def apply(address: String, coord: LatLng, panoId: String, photodate: String, title: String): PanoramaLocation = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], coord = coord.asInstanceOf[js.Any], panoId = panoId.asInstanceOf[js.Any], photodate = photodate.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PanoramaLocation]
  }
}

