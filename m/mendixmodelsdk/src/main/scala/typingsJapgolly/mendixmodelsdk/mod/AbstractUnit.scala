package typingsJapgolly.mendixmodelsdk.mod

import typingsJapgolly.mendixmodelsdk.unitsMod.IStructuralUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk", "AbstractUnit")
@js.native
abstract class AbstractUnit protected ()
  extends typingsJapgolly.mendixmodelsdk.internalMod.AbstractUnit {
  def this(
    model: typingsJapgolly.mendixmodelsdk.abstractModelMod.AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    container: IStructuralUnit
  ) = this()
}

