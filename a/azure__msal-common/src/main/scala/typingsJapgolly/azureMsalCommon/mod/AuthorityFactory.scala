package typingsJapgolly.azureMsalCommon.mod

import typingsJapgolly.azureMsalCommon.distAuthorityAuthorityOptionsMod.AuthorityOptions
import typingsJapgolly.azureMsalCommon.distCacheInterfaceIcachemanagerMod.ICacheManager
import typingsJapgolly.azureMsalCommon.distNetworkInetworkmoduleMod.INetworkModule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@azure/msal-common", "AuthorityFactory")
@js.native
open class AuthorityFactory ()
  extends typingsJapgolly.azureMsalCommon.distAuthorityAuthorityFactoryMod.AuthorityFactory
/* static members */
object AuthorityFactory {
  
  @JSImport("@azure/msal-common", "AuthorityFactory")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Create an authority object of the correct type based on the url
    * Performs basic authority validation - checks to see if the authority is of a valid type (i.e. aad, b2c, adfs)
    *
    * Also performs endpoint discovery.
    *
    * @param authorityUri
    * @param networkClient
    * @param protocolMode
    */
  inline def createDiscoveredInstance(
    authorityUri: String,
    networkClient: INetworkModule,
    cacheManager: ICacheManager,
    authorityOptions: AuthorityOptions
  ): js.Promise[typingsJapgolly.azureMsalCommon.distAuthorityAuthorityMod.Authority] = (^.asInstanceOf[js.Dynamic].applyDynamic("createDiscoveredInstance")(authorityUri.asInstanceOf[js.Any], networkClient.asInstanceOf[js.Any], cacheManager.asInstanceOf[js.Any], authorityOptions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.azureMsalCommon.distAuthorityAuthorityMod.Authority]]
  inline def createDiscoveredInstance(
    authorityUri: String,
    networkClient: INetworkModule,
    cacheManager: ICacheManager,
    authorityOptions: AuthorityOptions,
    proxyUrl: String
  ): js.Promise[typingsJapgolly.azureMsalCommon.distAuthorityAuthorityMod.Authority] = (^.asInstanceOf[js.Dynamic].applyDynamic("createDiscoveredInstance")(authorityUri.asInstanceOf[js.Any], networkClient.asInstanceOf[js.Any], cacheManager.asInstanceOf[js.Any], authorityOptions.asInstanceOf[js.Any], proxyUrl.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.azureMsalCommon.distAuthorityAuthorityMod.Authority]]
  
  /**
    * Create an authority object of the correct type based on the url
    * Performs basic authority validation - checks to see if the authority is of a valid type (i.e. aad, b2c, adfs)
    *
    * Does not perform endpoint discovery.
    *
    * @param authorityUrl
    * @param networkInterface
    * @param protocolMode
    */
  inline def createInstance(
    authorityUrl: String,
    networkInterface: INetworkModule,
    cacheManager: ICacheManager,
    authorityOptions: AuthorityOptions
  ): typingsJapgolly.azureMsalCommon.distAuthorityAuthorityMod.Authority = (^.asInstanceOf[js.Dynamic].applyDynamic("createInstance")(authorityUrl.asInstanceOf[js.Any], networkInterface.asInstanceOf[js.Any], cacheManager.asInstanceOf[js.Any], authorityOptions.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.azureMsalCommon.distAuthorityAuthorityMod.Authority]
  inline def createInstance(
    authorityUrl: String,
    networkInterface: INetworkModule,
    cacheManager: ICacheManager,
    authorityOptions: AuthorityOptions,
    proxyUrl: String
  ): typingsJapgolly.azureMsalCommon.distAuthorityAuthorityMod.Authority = (^.asInstanceOf[js.Dynamic].applyDynamic("createInstance")(authorityUrl.asInstanceOf[js.Any], networkInterface.asInstanceOf[js.Any], cacheManager.asInstanceOf[js.Any], authorityOptions.asInstanceOf[js.Any], proxyUrl.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.azureMsalCommon.distAuthorityAuthorityMod.Authority]
}
