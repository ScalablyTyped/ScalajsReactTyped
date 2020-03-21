package typingsJapgolly.mendixmodelsdk.datasetsMod.datasets

import typingsJapgolly.mendixmodelsdk.baseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.elementsMod.IByNameReferrable
import typingsJapgolly.mendixmodelsdk.elementsMod.IElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDataSetParameter
  extends IElement
     with IByNameReferrable {
  val containerAsDataSet: IDataSet = js.native
  @JSName("model")
  val model_IDataSetParameter: IModel = js.native
  val name: String = js.native
}

