package typingsJapgolly.mendixmodelsdk.mod.domainmodels

import typingsJapgolly.mendixmodelsdk.baseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.domainmodelsMod.StructureVersionInfo
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractElement
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractModel
import typingsJapgolly.mendixmodelsdk.internalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk", "domainmodels.MemberAccess")
@js.native
class MemberAccess protected ()
  extends typingsJapgolly.mendixmodelsdk.allModelClassesMod.domainmodels.MemberAccess {
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
@JSImport("mendixmodelsdk", "domainmodels.MemberAccess")
@js.native
object MemberAccess extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new MemberAccess instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsJapgolly.mendixmodelsdk.domainmodelsMod.domainmodels.MemberAccess = js.native
  /**
    * Creates and returns a new MemberAccess instance in the SDK and on the server.
    * The new MemberAccess will be automatically stored in the 'memberAccesses' property
    * of the parent AccessRule element passed as argument.
    */
  def createIn(container: typingsJapgolly.mendixmodelsdk.domainmodelsMod.domainmodels.AccessRule): typingsJapgolly.mendixmodelsdk.domainmodelsMod.domainmodels.MemberAccess = js.native
}

