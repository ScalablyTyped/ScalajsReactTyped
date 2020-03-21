package typingsJapgolly.mendixmodelsdk.allModelClassesMod.appservices

import typingsJapgolly.mendixmodelsdk.appservicesMod.StructureVersionInfo
import typingsJapgolly.mendixmodelsdk.baseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractElement
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractModel
import typingsJapgolly.mendixmodelsdk.internalMod.ModelUnit
import typingsJapgolly.mendixmodelsdk.webservicesMod.webservices.PublishedParameter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "appservices.MsdMicroflowParameter")
@js.native
class MsdMicroflowParameter protected ()
  extends typingsJapgolly.mendixmodelsdk.appservicesMod.appservices.MsdMicroflowParameter {
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
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "appservices.MsdMicroflowParameter")
@js.native
object MsdMicroflowParameter extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new MsdMicroflowParameter instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsJapgolly.mendixmodelsdk.appservicesMod.appservices.MsdMicroflowParameter = js.native
  /**
    * Creates and returns a new MsdMicroflowParameter instance in the SDK and on the server.
    * The new MsdMicroflowParameter will be automatically stored in the 'parameters' property
    * of the parent MsdMicroflow element passed as argument.
    */
  def createInMsdMicroflowUnderParameters(container: typingsJapgolly.mendixmodelsdk.appservicesMod.appservices.MsdMicroflow): typingsJapgolly.mendixmodelsdk.appservicesMod.appservices.MsdMicroflowParameter = js.native
  /**
    * Creates and returns a new MsdMicroflowParameter instance in the SDK and on the server.
    * The new MsdMicroflowParameter will be automatically stored in the 'parameterByContract' property
    * of the parent webservices.PublishedParameter element passed as argument.
    */
  def createInPublishedParameterUnderParameterByContract(container: PublishedParameter): typingsJapgolly.mendixmodelsdk.appservicesMod.appservices.MsdMicroflowParameter = js.native
}

