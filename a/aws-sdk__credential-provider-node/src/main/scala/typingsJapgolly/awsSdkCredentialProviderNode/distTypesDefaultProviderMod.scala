package typingsJapgolly.awsSdkCredentialProviderNode

import typingsJapgolly.awsSdkClientSso.mod.SSOClient
import typingsJapgolly.awsSdkCredentialProviderImds.distTypesRemoteProviderRemoteProviderInitMod.RemoteProviderInit
import typingsJapgolly.awsSdkCredentialProviderIni.distTypesFromIniMod.FromIniInit
import typingsJapgolly.awsSdkCredentialProviderWebIdentity.anon.Arn
import typingsJapgolly.awsSdkTypes.distTypesCredentialsMod.Credentials
import typingsJapgolly.awsSdkTypes.distTypesUtilMod.MemoizedProvider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesDefaultProviderMod {
  
  @JSImport("@aws-sdk/credential-provider-node/dist-types/defaultProvider", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def defaultProvider(): MemoizedProvider[Credentials] = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultProvider")().asInstanceOf[MemoizedProvider[Credentials]]
  inline def defaultProvider(init: DefaultProviderInit): MemoizedProvider[Credentials] = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultProvider")(init.asInstanceOf[js.Any]).asInstanceOf[MemoizedProvider[Credentials]]
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsJapgolly.awsSdkSharedIniFileLoader.distTypesLoadSharedConfigFilesMod.SharedConfigInit because Already inherited
  - typingsJapgolly.awsSdkSharedIniFileLoader.distTypesParseKnownFilesMod.SourceProfileInit because Already inherited
  - typingsJapgolly.awsSdkCredentialProviderWebIdentity.distTypesFromTokenFileMod.FromTokenFileInit because var conflicts: roleAssumerWithWebIdentity. Inlined webIdentityTokenFile, PolicyArns, WebIdentityToken, roleSessionName, DurationSeconds, RoleSessionName, Policy, ProviderId, RoleArn
  - typingsJapgolly.awsSdkCredentialProviderSso.distTypesFromSSOMod.FromSSOInit because var conflicts: configFilepath, filepath, profile. Inlined ssoClient */ trait DefaultProviderInit
    extends StObject
       with FromIniInit
       with RemoteProviderInit {
    
    var DurationSeconds: js.UndefOr[Double] = js.undefined
    
    var Policy: js.UndefOr[String] = js.undefined
    
    var PolicyArns: js.UndefOr[js.Array[Arn]] = js.undefined
    
    var ProviderId: js.UndefOr[String] = js.undefined
    
    var RoleArn: js.UndefOr[String] = js.undefined
    
    var RoleSessionName: js.UndefOr[String] = js.undefined
    
    var WebIdentityToken: js.UndefOr[String] = js.undefined
    
    var roleSessionName: js.UndefOr[String] = js.undefined
    
    var ssoClient: js.UndefOr[SSOClient] = js.undefined
    
    /**
      * File location of where the `OIDC` token is stored.
      */
    var webIdentityTokenFile: js.UndefOr[String] = js.undefined
  }
  object DefaultProviderInit {
    
    inline def apply(): DefaultProviderInit = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DefaultProviderInit]
    }
    
    extension [Self <: DefaultProviderInit](x: Self) {
      
      inline def setDurationSeconds(value: Double): Self = StObject.set(x, "DurationSeconds", value.asInstanceOf[js.Any])
      
      inline def setDurationSecondsUndefined: Self = StObject.set(x, "DurationSeconds", js.undefined)
      
      inline def setPolicy(value: String): Self = StObject.set(x, "Policy", value.asInstanceOf[js.Any])
      
      inline def setPolicyArns(value: js.Array[Arn]): Self = StObject.set(x, "PolicyArns", value.asInstanceOf[js.Any])
      
      inline def setPolicyArnsUndefined: Self = StObject.set(x, "PolicyArns", js.undefined)
      
      inline def setPolicyArnsVarargs(value: Arn*): Self = StObject.set(x, "PolicyArns", js.Array(value*))
      
      inline def setPolicyUndefined: Self = StObject.set(x, "Policy", js.undefined)
      
      inline def setProviderId(value: String): Self = StObject.set(x, "ProviderId", value.asInstanceOf[js.Any])
      
      inline def setProviderIdUndefined: Self = StObject.set(x, "ProviderId", js.undefined)
      
      inline def setRoleArn(value: String): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
      
      inline def setRoleArnUndefined: Self = StObject.set(x, "RoleArn", js.undefined)
      
      inline def setRoleSessionName(value: String): Self = StObject.set(x, "RoleSessionName", value.asInstanceOf[js.Any])
      
      inline def setRoleSessionNameUndefined: Self = StObject.set(x, "RoleSessionName", js.undefined)
      
      inline def setSsoClient(value: SSOClient): Self = StObject.set(x, "ssoClient", value.asInstanceOf[js.Any])
      
      inline def setSsoClientUndefined: Self = StObject.set(x, "ssoClient", js.undefined)
      
      inline def setWebIdentityToken(value: String): Self = StObject.set(x, "WebIdentityToken", value.asInstanceOf[js.Any])
      
      inline def setWebIdentityTokenFile(value: String): Self = StObject.set(x, "webIdentityTokenFile", value.asInstanceOf[js.Any])
      
      inline def setWebIdentityTokenFileUndefined: Self = StObject.set(x, "webIdentityTokenFile", js.undefined)
      
      inline def setWebIdentityTokenUndefined: Self = StObject.set(x, "WebIdentityToken", js.undefined)
    }
  }
}
