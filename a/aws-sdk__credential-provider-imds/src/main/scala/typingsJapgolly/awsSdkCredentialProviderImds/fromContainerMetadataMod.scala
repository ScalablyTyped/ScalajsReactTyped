package typingsJapgolly.awsSdkCredentialProviderImds

import typingsJapgolly.awsSdkCredentialProviderImds.awsSdkCredentialProviderImdsStrings.AWS_CONTAINER_AUTHORIZATION_TOKEN
import typingsJapgolly.awsSdkCredentialProviderImds.awsSdkCredentialProviderImdsStrings.AWS_CONTAINER_CREDENTIALS_FULL_URI
import typingsJapgolly.awsSdkCredentialProviderImds.awsSdkCredentialProviderImdsStrings.AWS_CONTAINER_CREDENTIALS_RELATIVE_URI
import typingsJapgolly.awsSdkCredentialProviderImds.remoteProviderInitMod.RemoteProviderInit
import typingsJapgolly.awsSdkTypes.credentialsMod.CredentialProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/credential-provider-imds/build/fromContainerMetadata", JSImport.Namespace)
@js.native
object fromContainerMetadataMod extends js.Object {
  val ENV_CMDS_AUTH_TOKEN: AWS_CONTAINER_AUTHORIZATION_TOKEN = js.native
  val ENV_CMDS_FULL_URI: AWS_CONTAINER_CREDENTIALS_FULL_URI = js.native
  val ENV_CMDS_RELATIVE_URI: AWS_CONTAINER_CREDENTIALS_RELATIVE_URI = js.native
  def fromContainerMetadata(): CredentialProvider = js.native
  def fromContainerMetadata(init: RemoteProviderInit): CredentialProvider = js.native
}

