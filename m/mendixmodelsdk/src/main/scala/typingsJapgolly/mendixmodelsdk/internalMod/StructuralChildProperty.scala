package typingsJapgolly.mendixmodelsdk.internalMod

import typingsJapgolly.mendixmodelsdk.structuresMod.IStructureClass
import typingsJapgolly.mendixmodelsdk.unitsMod.IModelUnit
import typingsJapgolly.mendixmodelsdk.unitsMod.IStructuralUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/sdk/internal", "StructuralChildProperty")
@js.native
class StructuralChildProperty[T /* <: IStructuralUnit | IModelUnit */] protected ()
  extends typingsJapgolly.mendixmodelsdk.propertiesMod.StructuralChildProperty[T] {
  def this(
    declaredOn: IStructureClass,
    parent: typingsJapgolly.mendixmodelsdk.unitsMod.StructuralUnit,
    name: String
  ) = this()
  def this(
    declaredOn: IStructureClass,
    parent: typingsJapgolly.mendixmodelsdk.unitsMod.StructuralUnit,
    name: String,
    value: T
  ) = this()
  def this(
    declaredOn: IStructureClass,
    parent: typingsJapgolly.mendixmodelsdk.unitsMod.StructuralUnit,
    name: String,
    value: T,
    targetRefType: String
  ) = this()
  def this(
    declaredOn: IStructureClass,
    parent: typingsJapgolly.mendixmodelsdk.unitsMod.StructuralUnit,
    name: String,
    value: Null,
    targetRefType: String
  ) = this()
}

