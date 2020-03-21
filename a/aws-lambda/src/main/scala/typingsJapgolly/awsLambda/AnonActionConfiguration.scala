package typingsJapgolly.awsLambda

import typingsJapgolly.awsLambda.codepipelineMod.Artifact
import typingsJapgolly.awsLambda.codepipelineMod.Credentials
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonActionConfiguration extends js.Object {
  var actionConfiguration: AnonConfiguration
  var artifactCredentials: Credentials
  var continuationToken: js.UndefOr[String] = js.undefined
  var encryptionKey: js.UndefOr[EncryptionKeytypeKMS] = js.undefined
  var inputArtifacts: js.Array[Artifact]
  var outputArtifacts: js.Array[Artifact]
}

object AnonActionConfiguration {
  @scala.inline
  def apply(
    actionConfiguration: AnonConfiguration,
    artifactCredentials: Credentials,
    inputArtifacts: js.Array[Artifact],
    outputArtifacts: js.Array[Artifact],
    continuationToken: String = null,
    encryptionKey: EncryptionKeytypeKMS = null
  ): AnonActionConfiguration = {
    val __obj = js.Dynamic.literal(actionConfiguration = actionConfiguration.asInstanceOf[js.Any], artifactCredentials = artifactCredentials.asInstanceOf[js.Any], inputArtifacts = inputArtifacts.asInstanceOf[js.Any], outputArtifacts = outputArtifacts.asInstanceOf[js.Any])
    if (continuationToken != null) __obj.updateDynamic("continuationToken")(continuationToken.asInstanceOf[js.Any])
    if (encryptionKey != null) __obj.updateDynamic("encryptionKey")(encryptionKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonActionConfiguration]
  }
}

