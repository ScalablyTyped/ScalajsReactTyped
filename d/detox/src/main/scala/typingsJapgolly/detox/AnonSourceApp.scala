package typingsJapgolly.detox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSourceApp extends js.Object {
  var sourceApp: js.UndefOr[String] = js.undefined
  var url: String
}

object AnonSourceApp {
  @scala.inline
  def apply(url: String, sourceApp: String = null): AnonSourceApp = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (sourceApp != null) __obj.updateDynamic("sourceApp")(sourceApp.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSourceApp]
  }
}

