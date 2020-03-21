package typingsJapgolly.ionic.libIntegrationsMod

import typingsJapgolly.ionic.PartialReadonlyProjectInt
import typingsJapgolly.ionic.definitionsMod.ProjectIntegration
import typingsJapgolly.ionicCliFramework.mod.BaseConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/lib/integrations", "IntegrationConfig")
@js.native
class IntegrationConfig () extends BaseConfig[ProjectIntegration] {
  def provideDefaults(c: PartialReadonlyProjectInt): ProjectIntegration = js.native
}

