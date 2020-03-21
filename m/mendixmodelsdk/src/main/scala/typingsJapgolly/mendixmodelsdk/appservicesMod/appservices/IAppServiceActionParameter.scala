package typingsJapgolly.mendixmodelsdk.appservicesMod.appservices

import typingsJapgolly.mendixmodelsdk.baseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.elementsMod.IByNameReferrable
import typingsJapgolly.mendixmodelsdk.elementsMod.IElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAppServiceActionParameter
  extends IElement
     with IByNameReferrable {
  val containerAsAppServiceAction: IAppServiceAction = js.native
  @JSName("model")
  val model_IAppServiceActionParameter: IModel = js.native
  val name: String = js.native
}

