package typingsJapgolly.atStorybookApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DismissedVersionNotification extends js.Object {
  var dismissedVersionNotification: String
  var lastVersionCheck: Double
  var versions: Anon_Current
}

object Anon_DismissedVersionNotification {
  @scala.inline
  def apply(dismissedVersionNotification: String, lastVersionCheck: Double, versions: Anon_Current): Anon_DismissedVersionNotification = {
    val __obj = js.Dynamic.literal(dismissedVersionNotification = dismissedVersionNotification.asInstanceOf[js.Any], lastVersionCheck = lastVersionCheck.asInstanceOf[js.Any], versions = versions.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_DismissedVersionNotification]
  }
}

