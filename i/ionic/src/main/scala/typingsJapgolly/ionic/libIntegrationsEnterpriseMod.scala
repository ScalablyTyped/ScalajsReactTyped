package typingsJapgolly.ionic

import typingsJapgolly.ionic.anon.PartialReadonlyEnterprise
import typingsJapgolly.ionic.definitionsMod.EnterpriseProjectIntegration
import typingsJapgolly.ionic.libIntegrationsMod.BaseIntegration
import typingsJapgolly.ionic.libIntegrationsMod.IntegationUnion
import typingsJapgolly.ionic.libIntegrationsMod.IntegrationDeps
import typingsJapgolly.ionicCliFramework.libConfigMod.BaseConfigOptions
import typingsJapgolly.ionicCliFramework.mod.BaseConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIntegrationsEnterpriseMod {
  
  @JSImport("ionic/lib/integrations/enterprise", "EnterpriseIntegrationConfig")
  @js.native
  open class EnterpriseIntegrationConfig protected () extends BaseConfig[EnterpriseProjectIntegration] {
    def this(p: String) = this()
    def this(p: String, hasSpacesPathPrefix: BaseConfigOptions) = this()
    
    def provideDefaults(c: PartialReadonlyEnterprise): EnterpriseProjectIntegration = js.native
  }
  
  @JSImport("ionic/lib/integrations/enterprise", "Integration")
  @js.native
  open class Integration protected ()
    extends BaseIntegration[EnterpriseProjectIntegration]
       with IntegationUnion {
    def this(e: IntegrationDeps) = this()
    
    @JSName("archiveUrl")
    val archiveUrl_Integration: Unit = js.native
    
    /* private */ var chooseApp: Any = js.native
    
    /* private */ var chooseAppToLink: Any = js.native
    
    @JSName("config")
    def config_MIntegration: EnterpriseIntegrationConfig = js.native
    
    /* private */ var createNewApp: Any = js.native
    
    /* private */ var getAppClient: Any = js.native
    
    /* private */ var getPK: Any = js.native
    
    /* private */ var registerKey: Any = js.native
    
    /* private */ var updateNPMRC: Any = js.native
    
    /* private */ var validatePK: Any = js.native
  }
}
