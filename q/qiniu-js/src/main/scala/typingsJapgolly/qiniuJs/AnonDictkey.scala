package typingsJapgolly.qiniuJs

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDictkey extends /* key */ StringDictionary[String] {
  var creation_time: String
}

object AnonDictkey {
  @scala.inline
  def apply(creation_time: String, StringDictionary: /* key */ StringDictionary[String] = null): AnonDictkey = {
    val __obj = js.Dynamic.literal(creation_time = creation_time.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[AnonDictkey]
  }
}

