package typingsJapgolly.vsoNodeApi.extensionManagementInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtensionState extends InstalledExtensionState {
  var extensionName: String
  /**
    * The time at which the version was last checked
    */
  var lastVersionCheck: js.Date
  var publisherName: String
  var version: String
}

object ExtensionState {
  @scala.inline
  def apply(
    extensionName: String,
    flags: ExtensionStateFlags,
    installationIssues: js.Array[InstalledExtensionStateIssue],
    lastUpdated: js.Date,
    lastVersionCheck: js.Date,
    publisherName: String,
    version: String
  ): ExtensionState = {
    val __obj = js.Dynamic.literal(extensionName = extensionName.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], installationIssues = installationIssues.asInstanceOf[js.Any], lastUpdated = lastUpdated.asInstanceOf[js.Any], lastVersionCheck = lastVersionCheck.asInstanceOf[js.Any], publisherName = publisherName.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ExtensionState]
  }
}

