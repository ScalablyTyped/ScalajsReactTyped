package typingsJapgolly.datatablesNetButtons.DataTables

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ButtonsApiExportInfoReturn extends js.Object {
  var filename: String
  var messageBottom: String
  var messageTop: String
  var title: String
}

object ButtonsApiExportInfoReturn {
  @scala.inline
  def apply(filename: String, messageBottom: String, messageTop: String, title: String): ButtonsApiExportInfoReturn = {
    val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any], messageBottom = messageBottom.asInstanceOf[js.Any], messageTop = messageTop.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ButtonsApiExportInfoReturn]
  }
}

