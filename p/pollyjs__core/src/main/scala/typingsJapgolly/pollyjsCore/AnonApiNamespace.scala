package typingsJapgolly.pollyjsCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonApiNamespace extends js.Object {
  var apiNamespace: js.UndefOr[String] = js.undefined
  var host: js.UndefOr[String] = js.undefined
}

object AnonApiNamespace {
  @scala.inline
  def apply(apiNamespace: String = null, host: String = null): AnonApiNamespace = {
    val __obj = js.Dynamic.literal()
    if (apiNamespace != null) __obj.updateDynamic("apiNamespace")(apiNamespace.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonApiNamespace]
  }
}

