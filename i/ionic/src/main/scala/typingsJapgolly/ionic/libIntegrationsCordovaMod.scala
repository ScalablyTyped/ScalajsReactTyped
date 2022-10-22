package typingsJapgolly.ionic

import typingsJapgolly.ionic.definitionsMod.ProjectIntegration
import typingsJapgolly.ionic.definitionsMod.ProjectType
import typingsJapgolly.ionic.libIntegrationsCordovaConfigMod.CordovaConfig
import typingsJapgolly.ionic.libIntegrationsMod.BaseIntegration
import typingsJapgolly.ionic.libIntegrationsMod.IntegationUnion
import typingsJapgolly.ionic.libIntegrationsMod.IntegrationConfig
import typingsJapgolly.ionic.libIntegrationsMod.IntegrationDeps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIntegrationsCordovaMod {
  
  @JSImport("ionic/lib/integrations/cordova", "Integration")
  @js.native
  open class Integration protected ()
    extends BaseIntegration[ProjectIntegration]
       with IntegationUnion {
    def this(e: IntegrationDeps) = this()
    
    @JSName("archiveUrl")
    val archiveUrl_Integration: /* "https://d2ql0qc7j8u4b2.cloudfront.net/integration-cordova.tar.gz" */ String = js.native
    
    @JSName("config")
    def config_MIntegration: IntegrationConfig = js.native
    
    /* InferMemberOverrides */
    override def enable(config: ProjectIntegration): js.Promise[Unit] = js.native
    
    def getConfig(): js.Promise[js.UndefOr[CordovaConfig]] = js.native
    
    def getCordovaPlatformVersions(): js.Promise[String] = js.native
    
    def getCordovaPluginVersions(): js.Promise[String] = js.native
    
    def getCordovaVersion(): js.Promise[js.UndefOr[String]] = js.native
    
    def getIOSDeployVersion(): js.Promise[js.UndefOr[String]] = js.native
    
    def getIOSSimVersion(): js.Promise[js.UndefOr[String]] = js.native
    
    def getXcodebuildVersion(): js.Promise[js.UndefOr[String]] = js.native
    
    def requireConfig(): js.Promise[CordovaConfig] = js.native
  }
  
  @JSImport("ionic/lib/integrations/cordova", "SUPPORTED_PROJECT_TYPES")
  @js.native
  val SUPPORTED_PROJECT_TYPES: js.Array[ProjectType] = js.native
}
