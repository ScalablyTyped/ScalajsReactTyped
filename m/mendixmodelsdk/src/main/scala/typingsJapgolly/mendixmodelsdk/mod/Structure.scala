package typingsJapgolly.mendixmodelsdk.mod

import typingsJapgolly.mendixmodelsdk.structuresMod.aliases.IContainer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk", "Structure")
@js.native
abstract class Structure protected ()
  extends typingsJapgolly.mendixmodelsdk.internalMod.Structure {
  def this(
    _model: typingsJapgolly.mendixmodelsdk.abstractModelMod.AbstractModel,
    structureTypeName: String,
    id: String
  ) = this()
  def this(
    _model: typingsJapgolly.mendixmodelsdk.abstractModelMod.AbstractModel,
    structureTypeName: String,
    id: String,
    _isPartial: Boolean
  ) = this()
  def this(
    _model: typingsJapgolly.mendixmodelsdk.abstractModelMod.AbstractModel,
    structureTypeName: String,
    id: String,
    _isPartial: Boolean,
    container: IContainer
  ) = this()
}

