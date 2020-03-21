package typingsJapgolly.ionic.libIntegrationsMod

import typingsJapgolly.ionic.definitionsMod.IIntegration
import typingsJapgolly.ionic.definitionsMod.IntegrationName
import typingsJapgolly.ionic.definitionsMod.ProjectIntegration
import typingsJapgolly.ionic.integrationsCapacitorMod.Integration
import typingsJapgolly.ionic.ionicStrings.capacitor
import typingsJapgolly.ionic.ionicStrings.cordova
import typingsJapgolly.ionic.ionicStrings.enterprise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/lib/integrations", "BaseIntegration")
@js.native
abstract class BaseIntegration[T /* <: ProjectIntegration */] protected () extends IIntegration[T] {
  def this(e: IntegrationDeps) = this()
  val e: IntegrationDeps = js.native
  def enable(config: ProjectIntegration): js.Promise[Unit] = js.native
}

/* static members */
@JSImport("ionic/lib/integrations", "BaseIntegration")
@js.native
object BaseIntegration extends js.Object {
  def createFromName(deps: IntegrationDeps, name: IntegrationName): js.Promise[IIntegration[ProjectIntegration]] = js.native
  @JSName("createFromName")
  def createFromName_capacitor(deps: IntegrationDeps, name: capacitor): js.Promise[Integration] = js.native
  @JSName("createFromName")
  def createFromName_cordova(deps: IntegrationDeps, name: cordova): js.Promise[typingsJapgolly.ionic.integrationsCordovaMod.Integration] = js.native
  @JSName("createFromName")
  def createFromName_enterprise(deps: IntegrationDeps, name: enterprise): js.Promise[typingsJapgolly.ionic.integrationsEnterpriseMod.Integration] = js.native
}

