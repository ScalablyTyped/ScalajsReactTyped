package typingsJapgolly.mixpanelBrowser.mod

import typingsJapgolly.mixpanelBrowser.PartialConfigApihost
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mixpanel-browser", "init")
@js.native
object init extends js.Object {
  def apply(token: String): Mixpanel = js.native
  def apply(token: String, config: PartialConfigApihost): Mixpanel = js.native
  def apply(token: String, config: PartialConfigApihost, name: String): Mixpanel = js.native
}

