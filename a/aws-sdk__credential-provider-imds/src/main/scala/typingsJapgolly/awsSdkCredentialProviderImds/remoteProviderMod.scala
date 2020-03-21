package typingsJapgolly.awsSdkCredentialProviderImds

import typingsJapgolly.awsSdkCredentialProviderImds.awsSdkCredentialProviderImdsNumbers.`0`
import typingsJapgolly.awsSdkCredentialProviderImds.awsSdkCredentialProviderImdsNumbers.`1000`
import typingsJapgolly.awsSdkCredentialProviderImds.imdsCredentialsMod.ImdsCredentials
import typingsJapgolly.awsSdkCredentialProviderImds.remoteProviderInitMod.RemoteProviderConfig
import typingsJapgolly.awsSdkCredentialProviderImds.remoteProviderInitMod.RemoteProviderInit
import typingsJapgolly.awsSdkTypes.credentialsMod.Credentials
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/credential-provider-imds/build/remoteProvider", JSImport.Namespace)
@js.native
object remoteProviderMod extends js.Object {
  val DEFAULT_MAX_RETRIES: `0` = js.native
  val DEFAULT_TIMEOUT: `1000` = js.native
  def fromImdsCredentials(creds: ImdsCredentials): Credentials = js.native
  def isImdsCredentials(arg: js.Any): /* is @aws-sdk/credential-provider-imds.@aws-sdk/credential-provider-imds/build/remoteProvider/ImdsCredentials.ImdsCredentials */ Boolean = js.native
  def providerConfigFromInit(init: RemoteProviderInit): RemoteProviderConfig = js.native
}

