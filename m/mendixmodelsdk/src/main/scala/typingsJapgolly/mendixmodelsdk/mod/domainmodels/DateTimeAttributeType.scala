package typingsJapgolly.mendixmodelsdk.mod.domainmodels

import typingsJapgolly.mendixmodelsdk.baseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.domainmodelsMod.StructureVersionInfo
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractElement
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractModel
import typingsJapgolly.mendixmodelsdk.internalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk", "domainmodels.DateTimeAttributeType")
@js.native
class DateTimeAttributeType protected ()
  extends typingsJapgolly.mendixmodelsdk.allModelClassesMod.domainmodels.DateTimeAttributeType {
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
@JSImport("mendixmodelsdk", "domainmodels.DateTimeAttributeType")
@js.native
object DateTimeAttributeType extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new DateTimeAttributeType instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsJapgolly.mendixmodelsdk.domainmodelsMod.domainmodels.DateTimeAttributeType = js.native
  /**
    * Creates and returns a new DateTimeAttributeType instance in the SDK and on the server.
    * The new DateTimeAttributeType will be automatically stored in the 'type' property
    * of the parent Attribute element passed as argument.
    */
  def createIn(container: typingsJapgolly.mendixmodelsdk.domainmodelsMod.domainmodels.Attribute): typingsJapgolly.mendixmodelsdk.domainmodelsMod.domainmodels.DateTimeAttributeType = js.native
}

