package typingsJapgolly.mixpanelBrowser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HasOptedInOutOptions extends js.Object {
  var cookie_prefix: String
  var persistence_type: Persistence
}

object HasOptedInOutOptions {
  @scala.inline
  def apply(cookie_prefix: String, persistence_type: Persistence): HasOptedInOutOptions = {
    val __obj = js.Dynamic.literal(cookie_prefix = cookie_prefix.asInstanceOf[js.Any], persistence_type = persistence_type.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[HasOptedInOutOptions]
  }
}

