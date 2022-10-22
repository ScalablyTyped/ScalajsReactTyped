package typingsJapgolly.azureMsalCommon.mod

import typingsJapgolly.azureMsalCommon.distConfigAppTokenProviderMod.IAppTokenProvider
import typingsJapgolly.azureMsalCommon.distConfigClientConfigurationMod.ClientConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@azure/msal-common", "ClientCredentialClient")
@js.native
open class ClientCredentialClient protected ()
  extends typingsJapgolly.azureMsalCommon.distClientClientCredentialClientMod.ClientCredentialClient {
  def this(configuration: ClientConfiguration) = this()
  def this(configuration: ClientConfiguration, appTokenProvider: IAppTokenProvider) = this()
}
