package typingsJapgolly.angularRouter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/router", "NavigationCancel")
@js.native
class NavigationCancel protected () extends RouterEvent {
  def this(
    /** @docsNotRequired */
  id: Double,
    /** @docsNotRequired */
  url: String,
    /** @docsNotRequired */
  reason: String
  ) = this()
  /** @docsNotRequired */
  var reason: String = js.native
}

