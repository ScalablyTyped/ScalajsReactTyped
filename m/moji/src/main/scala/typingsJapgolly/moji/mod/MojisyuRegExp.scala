package typingsJapgolly.moji.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MojisyuRegExp extends js.Object {
  var list: js.Array[String]
  var regexp: js.RegExp
}

object MojisyuRegExp {
  @scala.inline
  def apply(list: js.Array[String], regexp: js.RegExp): MojisyuRegExp = {
    val __obj = js.Dynamic.literal(list = list.asInstanceOf[js.Any], regexp = regexp.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MojisyuRegExp]
  }
}

