package typingsJapgolly.detectBrowser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("detect-browser", "parseUserAgent")
@js.native
object parseUserAgent extends js.Object {
  def apply(ua: String): BrowserInfo | BotInfo | Null = js.native
}

