package typingsJapgolly.chromeApps.chrome.displaySource

import typingsJapgolly.chromeApps.AnonCAPABILITIESNEGOTIATIONERROR
import typingsJapgolly.chromeApps.chrome.ToStringLiteral
import typingsJapgolly.chromeApps.chromeAppsStrings.capabilities_negotiation_error
import typingsJapgolly.chromeApps.chromeAppsStrings.connection_error
import typingsJapgolly.chromeApps.chromeAppsStrings.media_pipeline_error
import typingsJapgolly.chromeApps.chromeAppsStrings.timeout_error
import typingsJapgolly.chromeApps.chromeAppsStrings.unknown_error_
import typingsJapgolly.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorInfo extends js.Object {
  var description: js.UndefOr[String] = js.undefined
  /** @see ErrorType */
  var `type`: ToStringLiteral[
    AnonCAPABILITIESNEGOTIATIONERROR, 
    String, 
    Exclude[
      String, 
      unknown_error_ | media_pipeline_error | connection_error | capabilities_negotiation_error | timeout_error
    ]
  ]
}

object ErrorInfo {
  @scala.inline
  def apply(
    `type`: ToStringLiteral[
      AnonCAPABILITIESNEGOTIATIONERROR, 
      String, 
      Exclude[
        String, 
        unknown_error_ | media_pipeline_error | connection_error | capabilities_negotiation_error | timeout_error
      ]
    ],
    description: String = null
  ): ErrorInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorInfo]
  }
}

