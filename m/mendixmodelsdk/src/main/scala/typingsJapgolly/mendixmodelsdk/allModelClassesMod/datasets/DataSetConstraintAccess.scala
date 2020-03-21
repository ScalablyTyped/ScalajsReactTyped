package typingsJapgolly.mendixmodelsdk.allModelClassesMod.datasets

import typingsJapgolly.mendixmodelsdk.baseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.datasetsMod.StructureVersionInfo
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractElement
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractModel
import typingsJapgolly.mendixmodelsdk.internalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datasets.DataSetConstraintAccess")
@js.native
class DataSetConstraintAccess protected ()
  extends typingsJapgolly.mendixmodelsdk.datasetsMod.datasets.DataSetConstraintAccess {
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
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datasets.DataSetConstraintAccess")
@js.native
object DataSetConstraintAccess extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new DataSetConstraintAccess instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsJapgolly.mendixmodelsdk.datasetsMod.datasets.DataSetConstraintAccess = js.native
  /**
    * Creates and returns a new DataSetConstraintAccess instance in the SDK and on the server.
    * The new DataSetConstraintAccess will be automatically stored in the 'constraintAccessList' property
    * of the parent DataSetParameterAccess element passed as argument.
    */
  def createIn(container: typingsJapgolly.mendixmodelsdk.datasetsMod.datasets.DataSetParameterAccess): typingsJapgolly.mendixmodelsdk.datasetsMod.datasets.DataSetConstraintAccess = js.native
}

