package typingsJapgolly.firefoxWebextBrowser.browser.cookies

import typingsJapgolly.firefoxWebextBrowser.AnonFirstPartyDomain
import typingsJapgolly.firefoxWebextBrowser.AnonStoreId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.cookies.remove")
@js.native
object remove extends js.Object {
  /**
    * Deletes a cookie by name.
    * @param details Information to identify the cookie to remove.
    */
  def apply(details: AnonFirstPartyDomain): js.Promise[AnonStoreId] = js.native
}

