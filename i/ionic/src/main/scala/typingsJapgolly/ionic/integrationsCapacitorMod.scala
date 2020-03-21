package typingsJapgolly.ionic

import typingsJapgolly.ionic.capacitorConfigMod.CapacitorConfig
import typingsJapgolly.ionic.definitionsMod.ProjectIntegration
import typingsJapgolly.ionic.ionicStrings.`Target native iOS and Android with CapacitorComma IonicApostrophes new native layer`
import typingsJapgolly.ionic.libIntegrationsMod.BaseIntegration
import typingsJapgolly.ionic.libIntegrationsMod.IntegationUnion
import typingsJapgolly.ionic.libIntegrationsMod.IntegrationConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/lib/integrations/capacitor", JSImport.Namespace)
@js.native
object integrationsCapacitorMod extends js.Object {
  @js.native
  class Integration ()
    extends BaseIntegration[ProjectIntegration]
       with IntegationUnion {
    @JSName("archiveUrl")
    val archiveUrl_Integration: js.UndefOr[scala.Nothing] = js.native
    @JSName("summary")
    val summary_Integration: `Target native iOS and Android with CapacitorComma IonicApostrophes new native layer` = js.native
    @JSName("config")
    def config_MIntegration(): IntegrationConfig = js.native
    /* InferMemberOverrides */
    override def enable(config: ProjectIntegration): js.Promise[Unit] = js.native
    def getCapacitorCLIVersion(): js.Promise[js.UndefOr[String]] = js.native
    def getConfig(): js.Promise[CapacitorConfig] = js.native
    def installCapacitorCLI(): js.Promise[Unit] = js.native
    def installCapacitorCore(): js.Promise[Unit] = js.native
  }
  
}

