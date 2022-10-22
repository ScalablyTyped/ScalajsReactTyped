package typingsJapgolly.azureKustoData

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceCloudSettingsMod {
  
  @JSImport("azure-kusto-data/source/cloudSettings", "CloudSettings")
  @js.native
  /* private */ open class CloudSettings () extends StObject {
    
    var METADATA_ENDPOINT: String = js.native
    
    var cloudCache: StringDictionary[CloudInfo] = js.native
    
    var defaultCloudInfo: CloudInfo = js.native
    
    def getCloudInfoForCluster(kustoUri: String): js.Promise[CloudInfo] = js.native
  }
  /* static members */
  object CloudSettings {
    
    @JSImport("azure-kusto-data/source/cloudSettings", "CloudSettings")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getAuthorityUri(cloudInfo: CloudInfo): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getAuthorityUri")(cloudInfo.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def getAuthorityUri(cloudInfo: CloudInfo, authorityId: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getAuthorityUri")(cloudInfo.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def getInstance(): CloudSettings = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")().asInstanceOf[CloudSettings]
    
    @JSImport("azure-kusto-data/source/cloudSettings", "CloudSettings.instance")
    @js.native
    def instance: Any = js.native
    inline def instance_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("instance")(x.asInstanceOf[js.Any])
  }
  
  trait CloudInfo extends StObject {
    
    var FirstPartyAuthorityUrl: String
    
    var KustoClientAppId: String
    
    var KustoClientRedirectUri: String
    
    var KustoServiceResourceId: String
    
    var LoginEndpoint: String
    
    var LoginMfaRequired: Boolean
  }
  object CloudInfo {
    
    inline def apply(
      FirstPartyAuthorityUrl: String,
      KustoClientAppId: String,
      KustoClientRedirectUri: String,
      KustoServiceResourceId: String,
      LoginEndpoint: String,
      LoginMfaRequired: Boolean
    ): CloudInfo = {
      val __obj = js.Dynamic.literal(FirstPartyAuthorityUrl = FirstPartyAuthorityUrl.asInstanceOf[js.Any], KustoClientAppId = KustoClientAppId.asInstanceOf[js.Any], KustoClientRedirectUri = KustoClientRedirectUri.asInstanceOf[js.Any], KustoServiceResourceId = KustoServiceResourceId.asInstanceOf[js.Any], LoginEndpoint = LoginEndpoint.asInstanceOf[js.Any], LoginMfaRequired = LoginMfaRequired.asInstanceOf[js.Any])
      __obj.asInstanceOf[CloudInfo]
    }
    
    extension [Self <: CloudInfo](x: Self) {
      
      inline def setFirstPartyAuthorityUrl(value: String): Self = StObject.set(x, "FirstPartyAuthorityUrl", value.asInstanceOf[js.Any])
      
      inline def setKustoClientAppId(value: String): Self = StObject.set(x, "KustoClientAppId", value.asInstanceOf[js.Any])
      
      inline def setKustoClientRedirectUri(value: String): Self = StObject.set(x, "KustoClientRedirectUri", value.asInstanceOf[js.Any])
      
      inline def setKustoServiceResourceId(value: String): Self = StObject.set(x, "KustoServiceResourceId", value.asInstanceOf[js.Any])
      
      inline def setLoginEndpoint(value: String): Self = StObject.set(x, "LoginEndpoint", value.asInstanceOf[js.Any])
      
      inline def setLoginMfaRequired(value: Boolean): Self = StObject.set(x, "LoginMfaRequired", value.asInstanceOf[js.Any])
    }
  }
}
