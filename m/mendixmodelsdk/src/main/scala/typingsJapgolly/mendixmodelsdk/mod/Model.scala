package typingsJapgolly.mendixmodelsdk.mod

import typingsJapgolly.mendixmodelsdk.configurationMod.configuration.ISdkConfig
import typingsJapgolly.mendixmodelsdk.modelMod.IModel
import typingsJapgolly.mendixmodelsdk.modelSdkClientImplMod.ModelSdkClientImpl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk", "Model")
@js.native
class Model ()
  extends typingsJapgolly.mendixmodelsdk.modelMod.Model

/* static members */
@JSImport("mendixmodelsdk", "Model")
@js.native
object Model extends js.Object {
  def createSdkClient(connectionConfig: ISdkConfig): ModelSdkClientImpl[IModel, typingsJapgolly.mendixmodelsdk.modelMod.Model] = js.native
}

