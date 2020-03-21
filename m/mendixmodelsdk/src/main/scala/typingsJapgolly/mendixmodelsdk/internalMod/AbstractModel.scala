package typingsJapgolly.mendixmodelsdk.internalMod

import typingsJapgolly.mendixmodelsdk.commonMod.common.IErrorCallback
import typingsJapgolly.mendixmodelsdk.imodelserverclientMod.IModelServerClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/sdk/internal", "AbstractModel")
@js.native
abstract class AbstractModel protected ()
  extends typingsJapgolly.mendixmodelsdk.abstractModelMod.AbstractModel {
  def this(_client: IModelServerClient, _errorHandler: IErrorCallback) = this()
}

