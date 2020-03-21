package typingsJapgolly.activexAccess

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonStatusCode extends js.Object {
  var Cancel: Boolean
  val StatusCode: js.Any
  val TargetFrameName: String | Null
  val URL: String
  val pDisp: js.Any
}

object AnonStatusCode {
  @scala.inline
  def apply(Cancel: Boolean, StatusCode: js.Any, URL: String, pDisp: js.Any, TargetFrameName: String = null): AnonStatusCode = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], StatusCode = StatusCode.asInstanceOf[js.Any], URL = URL.asInstanceOf[js.Any], pDisp = pDisp.asInstanceOf[js.Any])
    if (TargetFrameName != null) __obj.updateDynamic("TargetFrameName")(TargetFrameName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonStatusCode]
  }
}

