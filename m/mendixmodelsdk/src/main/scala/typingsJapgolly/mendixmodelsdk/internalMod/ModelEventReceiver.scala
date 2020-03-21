package typingsJapgolly.mendixmodelsdk.internalMod

import typingsJapgolly.mendixmodelsdk.AnonHandleError
import typingsJapgolly.mendixmodelsdk.imodelserverclientMod.IModelServerClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/sdk/internal", "ModelEventReceiver")
@js.native
class ModelEventReceiver protected ()
  extends typingsJapgolly.mendixmodelsdk.modelEventReceiverMod.ModelEventReceiver {
  def this(workingCopyId: String, client: IModelServerClient, errorHandler: AnonHandleError) = this()
}

