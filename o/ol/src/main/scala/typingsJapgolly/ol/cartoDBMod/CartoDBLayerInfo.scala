package typingsJapgolly.ol.cartoDBMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CartoDBLayerInfo extends js.Object {
  var cdn_url: js.Any
  var layergroupid: String
}

object CartoDBLayerInfo {
  @scala.inline
  def apply(cdn_url: js.Any, layergroupid: String): CartoDBLayerInfo = {
    val __obj = js.Dynamic.literal(cdn_url = cdn_url.asInstanceOf[js.Any], layergroupid = layergroupid.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CartoDBLayerInfo]
  }
}

