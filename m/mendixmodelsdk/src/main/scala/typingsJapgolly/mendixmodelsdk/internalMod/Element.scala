package typingsJapgolly.mendixmodelsdk.internalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/sdk/internal", "Element")
@js.native
abstract class Element protected ()
  extends typingsJapgolly.mendixmodelsdk.elementsMod.Element {
  def this(
    model: typingsJapgolly.mendixmodelsdk.abstractModelMod.AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: typingsJapgolly.mendixmodelsdk.unitsMod.ModelUnit,
    container: typingsJapgolly.mendixmodelsdk.elementsMod.AbstractElement
  ) = this()
}

