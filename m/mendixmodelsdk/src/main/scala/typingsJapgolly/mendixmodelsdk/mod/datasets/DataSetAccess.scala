package typingsJapgolly.mendixmodelsdk.mod.datasets

import typingsJapgolly.mendixmodelsdk.baseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.datasetsMod.StructureVersionInfo
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractElement
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractModel
import typingsJapgolly.mendixmodelsdk.internalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk", "datasets.DataSetAccess")
@js.native
class DataSetAccess protected ()
  extends typingsJapgolly.mendixmodelsdk.allModelClassesMod.datasets.DataSetAccess {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
}

/* static members */
@JSImport("mendixmodelsdk", "datasets.DataSetAccess")
@js.native
object DataSetAccess extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new DataSetAccess instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsJapgolly.mendixmodelsdk.datasetsMod.datasets.DataSetAccess = js.native
  /**
    * Creates and returns a new DataSetAccess instance in the SDK and on the server.
    * The new DataSetAccess will be automatically stored in the 'dataSetAccess' property
    * of the parent DataSet element passed as argument.
    */
  def createIn(container: typingsJapgolly.mendixmodelsdk.datasetsMod.datasets.DataSet): typingsJapgolly.mendixmodelsdk.datasetsMod.datasets.DataSetAccess = js.native
}

