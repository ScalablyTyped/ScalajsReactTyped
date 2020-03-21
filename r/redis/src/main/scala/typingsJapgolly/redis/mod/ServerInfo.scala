package typingsJapgolly.redis.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerInfo extends js.Object {
  var redis_version: String
  var versions: js.Array[Double]
}

object ServerInfo {
  @scala.inline
  def apply(redis_version: String, versions: js.Array[Double]): ServerInfo = {
    val __obj = js.Dynamic.literal(redis_version = redis_version.asInstanceOf[js.Any], versions = versions.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ServerInfo]
  }
}

