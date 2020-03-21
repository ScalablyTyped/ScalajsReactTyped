package typingsJapgolly.openfin.applicationMod

import typingsJapgolly.openfin.baseMod.Reply
import typingsJapgolly.openfin.openfinStrings.`window-navigation-rejected`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openfin/_v2/api/application/application", "NavigationRejectedReply")
@js.native
class NavigationRejectedReply () extends Reply[`window-navigation-rejected`, Unit] {
  var sourceName: String = js.native
  var url: String = js.native
}

