package typingsJapgolly.awsSdkCredentialProviderNode

import typingsJapgolly.awsSdkCredentialProviderImds.remoteProviderInitMod.RemoteProviderInit
import typingsJapgolly.awsSdkCredentialProviderIni.mod.FromIniInit
import typingsJapgolly.awsSdkCredentialProviderNode.awsSdkCredentialProviderNodeStrings.AWS_EC2_METADATA_DISABLED
import typingsJapgolly.awsSdkTypes.credentialsMod.CredentialProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/credential-provider-node", JSImport.Namespace)
@js.native
object mod extends js.Object {
  val ENV_IMDS_DISABLED: AWS_EC2_METADATA_DISABLED = js.native
  def defaultProvider(): CredentialProvider = js.native
  def defaultProvider(init: FromIniInit with RemoteProviderInit): CredentialProvider = js.native
}

