package typingsJapgolly.mendixmodelsdk.datasetsMod.datasets

import typingsJapgolly.mendixmodelsdk.baseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.datasetsMod.StructureVersionInfo
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractElement
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractModel
import typingsJapgolly.mendixmodelsdk.internalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/datasets", "datasets.DataSetNumericConstraint")
@js.native
class DataSetNumericConstraint protected () extends DataSetParameterConstraint {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FDataSetNumericConstraint: IModel = js.native
  def applyBegin(): Boolean = js.native
  def applyBegin(newValue: Boolean): js.Any = js.native
  def applyEnd(): Boolean = js.native
  def applyEnd(newValue: Boolean): js.Any = js.native
  def begin(): String = js.native
  def begin(newValue: String): js.Any = js.native
  def end(): String = js.native
  def end(newValue: String): js.Any = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/datasets", "datasets.DataSetNumericConstraint")
@js.native
object DataSetNumericConstraint extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new DataSetNumericConstraint instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): DataSetNumericConstraint = js.native
  /**
    * Creates and returns a new DataSetNumericConstraint instance in the SDK and on the server.
    * The new DataSetNumericConstraint will be automatically stored in the 'constraints' property
    * of the parent DataSetParameter element passed as argument.
    */
  def createIn(container: DataSetParameter): DataSetNumericConstraint = js.native
}

