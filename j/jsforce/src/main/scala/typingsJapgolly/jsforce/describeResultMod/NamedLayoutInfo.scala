package typingsJapgolly.jsforce.describeResultMod

import typingsJapgolly.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NamedLayoutInfo extends js.Object {
  var name: String
  var urls: Record[String, String]
}

object NamedLayoutInfo {
  @scala.inline
  def apply(name: String, urls: Record[String, String]): NamedLayoutInfo = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], urls = urls.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[NamedLayoutInfo]
  }
}

