package typingsJapgolly.postmanCollection

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFile extends js.Object {
  var file: String
  var formdata: String
  var raw: String
  var urlencoded: String
}

object AnonFile {
  @scala.inline
  def apply(file: String, formdata: String, raw: String, urlencoded: String): AnonFile = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], formdata = formdata.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], urlencoded = urlencoded.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonFile]
  }
}

