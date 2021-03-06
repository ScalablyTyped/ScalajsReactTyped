package typingsJapgolly.mendixmodelsdk.mod.domainmodels

import typingsJapgolly.mendixmodelsdk.domainmodelsMod.StructureVersionInfo
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractElement
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractModel
import typingsJapgolly.mendixmodelsdk.internalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk", "domainmodels.FloatAttributeTypeBase")
@js.native
abstract class FloatAttributeTypeBase protected ()
  extends typingsJapgolly.mendixmodelsdk.allModelClassesMod.domainmodels.FloatAttributeTypeBase {
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
@JSImport("mendixmodelsdk", "domainmodels.FloatAttributeTypeBase")
@js.native
object FloatAttributeTypeBase extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
}

