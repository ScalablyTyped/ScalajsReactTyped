package typingsJapgolly.awsSdkCredentialProviderImds

import typingsJapgolly.awsSdkCredentialProviderImds.distTypesRemoteProviderRemoteProviderInitMod.RemoteProviderInit
import typingsJapgolly.awsSdkCredentialProviderImds.distTypesTypesMod.InstanceMetadataCredentials
import typingsJapgolly.awsSdkTypes.distTypesUtilMod.Provider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesFromInstanceMetadataMod {
  
  @JSImport("@aws-sdk/credential-provider-imds/dist-types/fromInstanceMetadata", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromInstanceMetadata(): Provider[InstanceMetadataCredentials] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromInstanceMetadata")().asInstanceOf[Provider[InstanceMetadataCredentials]]
  inline def fromInstanceMetadata(init: RemoteProviderInit): Provider[InstanceMetadataCredentials] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromInstanceMetadata")(init.asInstanceOf[js.Any]).asInstanceOf[Provider[InstanceMetadataCredentials]]
}
