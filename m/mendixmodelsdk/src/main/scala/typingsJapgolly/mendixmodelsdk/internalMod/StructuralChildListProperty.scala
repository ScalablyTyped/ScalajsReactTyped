package typingsJapgolly.mendixmodelsdk.internalMod

import typingsJapgolly.mendixmodelsdk.structuresMod.IStructureClass
import typingsJapgolly.mendixmodelsdk.unitsMod.IModelUnit
import typingsJapgolly.mendixmodelsdk.unitsMod.IStructuralUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/sdk/internal", "StructuralChildListProperty")
@js.native
class StructuralChildListProperty[T /* <: IStructuralUnit | IModelUnit */] protected ()
  extends typingsJapgolly.mendixmodelsdk.propertiesMod.StructuralChildListProperty[T] {
  def this(
    declaredOn: IStructureClass,
    parent: typingsJapgolly.mendixmodelsdk.unitsMod.StructuralUnit,
    name: String,
    value: js.Array[T]
  ) = this()
  def this(
    declaredOn: IStructureClass,
    parent: typingsJapgolly.mendixmodelsdk.unitsMod.StructuralUnit,
    name: String,
    value: js.Array[T],
    targetRefType: String
  ) = this()
}

