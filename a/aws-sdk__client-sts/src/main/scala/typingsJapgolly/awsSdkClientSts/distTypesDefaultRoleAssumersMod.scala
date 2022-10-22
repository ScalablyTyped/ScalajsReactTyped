package typingsJapgolly.awsSdkClientSts

import typingsJapgolly.awsSdkClientSts.anon.PickSTSClientConfiglogger
import typingsJapgolly.awsSdkClientSts.distTypesDefaultStsRoleAssumersMod.DefaultCredentialProvider
import typingsJapgolly.awsSdkClientSts.distTypesDefaultStsRoleAssumersMod.RoleAssumer
import typingsJapgolly.awsSdkClientSts.distTypesDefaultStsRoleAssumersMod.RoleAssumerWithWebIdentity
import typingsJapgolly.awsSdkClientSts.distTypesStsclientMod.ServiceInputTypes
import typingsJapgolly.awsSdkClientSts.distTypesStsclientMod.ServiceOutputTypes
import typingsJapgolly.awsSdkTypes.distTypesMiddlewareMod.Pluggable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesDefaultRoleAssumersMod {
  
  @JSImport("@aws-sdk/client-sts/dist-types/defaultRoleAssumers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def decorateDefaultCredentialProvider(provider: DefaultCredentialProvider): DefaultCredentialProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("decorateDefaultCredentialProvider")(provider.asInstanceOf[js.Any]).asInstanceOf[DefaultCredentialProvider]
  
  inline def getDefaultRoleAssumer(): RoleAssumer = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultRoleAssumer")().asInstanceOf[RoleAssumer]
  inline def getDefaultRoleAssumer(stsOptions: Unit, stsPlugins: js.Array[Pluggable[ServiceInputTypes, ServiceOutputTypes]]): RoleAssumer = (^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultRoleAssumer")(stsOptions.asInstanceOf[js.Any], stsPlugins.asInstanceOf[js.Any])).asInstanceOf[RoleAssumer]
  inline def getDefaultRoleAssumer(stsOptions: PickSTSClientConfiglogger): RoleAssumer = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultRoleAssumer")(stsOptions.asInstanceOf[js.Any]).asInstanceOf[RoleAssumer]
  inline def getDefaultRoleAssumer(
    stsOptions: PickSTSClientConfiglogger,
    stsPlugins: js.Array[Pluggable[ServiceInputTypes, ServiceOutputTypes]]
  ): RoleAssumer = (^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultRoleAssumer")(stsOptions.asInstanceOf[js.Any], stsPlugins.asInstanceOf[js.Any])).asInstanceOf[RoleAssumer]
  
  inline def getDefaultRoleAssumerWithWebIdentity(): RoleAssumerWithWebIdentity = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultRoleAssumerWithWebIdentity")().asInstanceOf[RoleAssumerWithWebIdentity]
  inline def getDefaultRoleAssumerWithWebIdentity(stsOptions: Unit, stsPlugins: js.Array[Pluggable[ServiceInputTypes, ServiceOutputTypes]]): RoleAssumerWithWebIdentity = (^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultRoleAssumerWithWebIdentity")(stsOptions.asInstanceOf[js.Any], stsPlugins.asInstanceOf[js.Any])).asInstanceOf[RoleAssumerWithWebIdentity]
  inline def getDefaultRoleAssumerWithWebIdentity(stsOptions: PickSTSClientConfiglogger): RoleAssumerWithWebIdentity = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultRoleAssumerWithWebIdentity")(stsOptions.asInstanceOf[js.Any]).asInstanceOf[RoleAssumerWithWebIdentity]
  inline def getDefaultRoleAssumerWithWebIdentity(
    stsOptions: PickSTSClientConfiglogger,
    stsPlugins: js.Array[Pluggable[ServiceInputTypes, ServiceOutputTypes]]
  ): RoleAssumerWithWebIdentity = (^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultRoleAssumerWithWebIdentity")(stsOptions.asInstanceOf[js.Any], stsPlugins.asInstanceOf[js.Any])).asInstanceOf[RoleAssumerWithWebIdentity]
}
