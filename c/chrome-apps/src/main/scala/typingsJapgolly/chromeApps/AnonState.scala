package typingsJapgolly.chromeApps

import typingsJapgolly.chromeApps.chrome.ToStringLiteral
import typingsJapgolly.chromeApps.chromeAppsStrings.authentication_required
import typingsJapgolly.chromeApps.chromeAppsStrings.disabled_
import typingsJapgolly.chromeApps.chromeAppsStrings.initializing
import typingsJapgolly.chromeApps.chromeAppsStrings.running
import typingsJapgolly.chromeApps.chromeAppsStrings.temporary_unavailable
import typingsJapgolly.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonState extends js.Object {
  var description: String
  var state: ToStringLiteral[
    AnonAUTHENTICATIONREQUIRED, 
    String, 
    Exclude[
      String, 
      temporary_unavailable | authentication_required | disabled_ | initializing | running
    ]
  ]
}

object AnonState {
  @scala.inline
  def apply(
    description: String,
    state: ToStringLiteral[
      AnonAUTHENTICATIONREQUIRED, 
      String, 
      Exclude[
        String, 
        temporary_unavailable | authentication_required | disabled_ | initializing | running
      ]
    ]
  ): AnonState = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonState]
  }
}

