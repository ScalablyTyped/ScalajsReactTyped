package typingsJapgolly.mendixmodelsdk.mod

import typingsJapgolly.mendixmodelsdk.structuresMod.aliases.IContainer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk", "AbstractElement")
@js.native
abstract class AbstractElement protected ()
  extends typingsJapgolly.mendixmodelsdk.internalMod.AbstractElement {
  def this(
    model: typingsJapgolly.mendixmodelsdk.abstractModelMod.AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean
  ) = this()
  def this(
    model: typingsJapgolly.mendixmodelsdk.abstractModelMod.AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    container: IContainer
  ) = this()
}

