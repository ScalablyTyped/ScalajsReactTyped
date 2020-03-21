package typingsJapgolly.mendixmodelsdk.allModelClassesMod.appservices

import typingsJapgolly.mendixmodelsdk.appservicesMod.StructureVersionInfo
import typingsJapgolly.mendixmodelsdk.baseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractElement
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractModel
import typingsJapgolly.mendixmodelsdk.internalMod.ModelUnit
import typingsJapgolly.mendixmodelsdk.webservicesMod.webservices.DataAttribute
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "appservices.MsdAttribute")
@js.native
class MsdAttribute protected ()
  extends typingsJapgolly.mendixmodelsdk.appservicesMod.appservices.MsdAttribute {
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
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "appservices.MsdAttribute")
@js.native
object MsdAttribute extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new MsdAttribute instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsJapgolly.mendixmodelsdk.appservicesMod.appservices.MsdAttribute = js.native
  /**
    * Creates and returns a new MsdAttribute instance in the SDK and on the server.
    * The new MsdAttribute will be automatically stored in the 'attributeByContract' property
    * of the parent webservices.DataAttribute element passed as argument.
    */
  def createInDataAttributeUnderAttributeByContract(container: DataAttribute): typingsJapgolly.mendixmodelsdk.appservicesMod.appservices.MsdAttribute = js.native
  /**
    * Creates and returns a new MsdAttribute instance in the SDK and on the server.
    * The new MsdAttribute will be automatically stored in the 'attributes' property
    * of the parent MsdEntity element passed as argument.
    */
  def createInMsdEntityUnderAttributes(container: typingsJapgolly.mendixmodelsdk.appservicesMod.appservices.MsdEntity): typingsJapgolly.mendixmodelsdk.appservicesMod.appservices.MsdAttribute = js.native
}

