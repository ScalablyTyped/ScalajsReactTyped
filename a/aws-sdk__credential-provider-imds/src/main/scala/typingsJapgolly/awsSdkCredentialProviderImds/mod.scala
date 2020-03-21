package typingsJapgolly.awsSdkCredentialProviderImds

import typingsJapgolly.awsSdkCredentialProviderImds.awsSdkCredentialProviderImdsNumbers.`0`
import typingsJapgolly.awsSdkCredentialProviderImds.awsSdkCredentialProviderImdsNumbers.`1000`
import typingsJapgolly.awsSdkCredentialProviderImds.awsSdkCredentialProviderImdsStrings.AWS_CONTAINER_AUTHORIZATION_TOKEN
import typingsJapgolly.awsSdkCredentialProviderImds.awsSdkCredentialProviderImdsStrings.AWS_CONTAINER_CREDENTIALS_FULL_URI
import typingsJapgolly.awsSdkCredentialProviderImds.awsSdkCredentialProviderImdsStrings.AWS_CONTAINER_CREDENTIALS_RELATIVE_URI
import typingsJapgolly.awsSdkCredentialProviderImds.remoteProviderInitMod.RemoteProviderConfig
import typingsJapgolly.awsSdkCredentialProviderImds.remoteProviderInitMod.RemoteProviderInit
import typingsJapgolly.awsSdkTypes.credentialsMod.CredentialProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/credential-provider-imds", JSImport.Namespace)
@js.native
object mod extends js.Object {
  val DEFAULT_MAX_RETRIES: `0` = js.native
  val DEFAULT_TIMEOUT: `1000` = js.native
  val ENV_CMDS_AUTH_TOKEN: AWS_CONTAINER_AUTHORIZATION_TOKEN = js.native
  val ENV_CMDS_FULL_URI: AWS_CONTAINER_CREDENTIALS_FULL_URI = js.native
  val ENV_CMDS_RELATIVE_URI: AWS_CONTAINER_CREDENTIALS_RELATIVE_URI = js.native
  def fromContainerMetadata(): CredentialProvider = js.native
  def fromContainerMetadata(init: RemoteProviderInit): CredentialProvider = js.native
  def fromInstanceMetadata(): CredentialProvider = js.native
  def fromInstanceMetadata(init: RemoteProviderInit): CredentialProvider = js.native
  def providerConfigFromInit(init: RemoteProviderInit): RemoteProviderConfig = js.native
}

