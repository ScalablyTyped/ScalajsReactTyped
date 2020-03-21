package typingsJapgolly.gapiClientDeploymentmanager.gapi.client.deploymentmanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeploymentUpdate extends js.Object {
  /** Output only. An optional user-provided description of the deployment after the current update has been applied. */
  var description: js.UndefOr[String] = js.undefined
  /**
    * Output only. Map of labels; provided by the client when the resource is created or updated. Specifically: Label keys must be between 1 and 63
    * characters long and must conform to the following regular expression: [a-z]([-a-z0-9]&#42;[a-z0-9])? Label values must be between 0 and 63 characters long
    * and must conform to the regular expression ([a-z]([-a-z0-9]&#42;[a-z0-9])?)?
    */
  var labels: js.UndefOr[js.Array[DeploymentUpdateLabelEntry]] = js.undefined
  /** Output only. URL of the manifest representing the update configuration of this deployment. */
  var manifest: js.UndefOr[String] = js.undefined
}

object DeploymentUpdate {
  @scala.inline
  def apply(
    description: String = null,
    labels: js.Array[DeploymentUpdateLabelEntry] = null,
    manifest: String = null
  ): DeploymentUpdate = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (manifest != null) __obj.updateDynamic("manifest")(manifest.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeploymentUpdate]
  }
}

