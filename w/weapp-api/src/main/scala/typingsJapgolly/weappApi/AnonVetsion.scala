package typingsJapgolly.weappApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonVetsion extends js.Object {
  //  插件appId
  var appId: String
  //  插件版本号
  var vetsion: String
}

object AnonVetsion {
  @scala.inline
  def apply(appId: String, vetsion: String): AnonVetsion = {
    val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any], vetsion = vetsion.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonVetsion]
  }
}

