package typingsJapgolly.awsSdkCredentialProviderImds

import typingsJapgolly.awsSdkCredentialProviderImds.anon.Logger
import typingsJapgolly.awsSdkCredentialProviderImds.distTypesTypesMod.InstanceMetadataCredentials
import typingsJapgolly.awsSdkTypes.distTypesUtilMod.Provider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesUtilsStaticStabilityProviderMod {
  
  @JSImport("@aws-sdk/credential-provider-imds/dist-types/utils/staticStabilityProvider", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def staticStabilityProvider(provider: Provider[InstanceMetadataCredentials]): Provider[InstanceMetadataCredentials] = ^.asInstanceOf[js.Dynamic].applyDynamic("staticStabilityProvider")(provider.asInstanceOf[js.Any]).asInstanceOf[Provider[InstanceMetadataCredentials]]
  inline def staticStabilityProvider(provider: Provider[InstanceMetadataCredentials], options: Logger): Provider[InstanceMetadataCredentials] = (^.asInstanceOf[js.Dynamic].applyDynamic("staticStabilityProvider")(provider.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Provider[InstanceMetadataCredentials]]
}
