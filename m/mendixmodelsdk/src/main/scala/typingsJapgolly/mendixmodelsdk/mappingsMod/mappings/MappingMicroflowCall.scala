package typingsJapgolly.mendixmodelsdk.mappingsMod.mappings

import typingsJapgolly.mendixmodelsdk.baseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.instancesMod.IList
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractElement
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractModel
import typingsJapgolly.mendixmodelsdk.internalMod.ModelUnit
import typingsJapgolly.mendixmodelsdk.mappingsMod.StructureVersionInfo
import typingsJapgolly.mendixmodelsdk.microflowsMod.microflows.IMicroflow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/mappings", "mappings.MappingMicroflowCall")
@js.native
class MappingMicroflowCall protected ()
  extends typingsJapgolly.mendixmodelsdk.internalMod.Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FMappingMicroflowCall: IModel = js.native
  def containerAsObjectMappingElement(): ObjectMappingElement = js.native
  def microflow(): js.Any = js.native
  def microflow(newValue: IMicroflow): js.Any = js.native
  def microflowQualifiedName(): String | Null = js.native
  @JSName("microflow")
  def microflow_Union(): IMicroflow | Null = js.native
  def parameterMappings(): IList[MappingMicroflowParameter] = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/mappings", "mappings.MappingMicroflowCall")
@js.native
object MappingMicroflowCall extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new MappingMicroflowCall instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): MappingMicroflowCall = js.native
  /**
    * Creates and returns a new MappingMicroflowCall instance in the SDK and on the server.
    * The new MappingMicroflowCall will be automatically stored in the 'mappingMicroflowCall' property
    * of the parent ObjectMappingElement element passed as argument.
    */
  def createIn(container: ObjectMappingElement): MappingMicroflowCall = js.native
}

