package typingsJapgolly.ionic

import typingsJapgolly.ionic.cordovaConfigMod.CordovaConfig
import typingsJapgolly.ionic.definitionsMod.ProjectIntegration
import typingsJapgolly.ionic.definitionsMod.ProjectType
import typingsJapgolly.ionic.ionicStrings.`Target native iOS and Android with Apache Cordova`
import typingsJapgolly.ionic.ionicStrings.`httpsColonSlashSlashd2ql0qc7j8u4b2DotcloudfrontDotnetSlashintegration-cordovaDottarDotgz`
import typingsJapgolly.ionic.libIntegrationsMod.BaseIntegration
import typingsJapgolly.ionic.libIntegrationsMod.IntegationUnion
import typingsJapgolly.ionic.libIntegrationsMod.IntegrationConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/lib/integrations/cordova", JSImport.Namespace)
@js.native
object integrationsCordovaMod extends js.Object {
  @js.native
  class Integration ()
    extends BaseIntegration[ProjectIntegration]
       with IntegationUnion {
    @JSName("archiveUrl")
    val archiveUrl_Integration: `httpsColonSlashSlashd2ql0qc7j8u4b2DotcloudfrontDotnetSlashintegration-cordovaDottarDotgz` = js.native
    @JSName("summary")
    val summary_Integration: `Target native iOS and Android with Apache Cordova` = js.native
    @JSName("config")
    def config_MIntegration(): IntegrationConfig = js.native
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
  
  val SUPPORTED_PROJECT_TYPES: js.Array[ProjectType] = js.native
}

