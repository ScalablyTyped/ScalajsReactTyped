package typingsJapgolly.mendixmodelsdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk", "Element")
@js.native
abstract class Element protected ()
  extends typingsJapgolly.mendixmodelsdk.internalMod.Element {
  def this(
    model: typingsJapgolly.mendixmodelsdk.abstractModelMod.AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: typingsJapgolly.mendixmodelsdk.unitsMod.ModelUnit,
    container: typingsJapgolly.mendixmodelsdk.elementsMod.AbstractElement
  ) = this()
}

