package typingsJapgolly.mendixmodelsdk.mod

import typingsJapgolly.mendixmodelsdk.unitsMod.IStructuralUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk", "StructuralUnit")
@js.native
abstract class StructuralUnit protected ()
  extends typingsJapgolly.mendixmodelsdk.internalMod.StructuralUnit {
  def this(
    model: typingsJapgolly.mendixmodelsdk.abstractModelMod.AbstractModel,
    structureTypeName: String,
    id: String,
    _ignoredIsPartial: Boolean,
    container: IStructuralUnit
  ) = this()
}

