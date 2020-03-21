package typingsJapgolly.mendixmodelsdk.internalMod

import typingsJapgolly.mendixmodelsdk.elementsMod.IAbstractElement
import typingsJapgolly.mendixmodelsdk.structuresMod.IStructureClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/sdk/internal", "ByNameReferenceListProperty")
@js.native
class ByNameReferenceListProperty[T /* <: IAbstractElement */] protected ()
  extends typingsJapgolly.mendixmodelsdk.propertiesMod.ByNameReferenceListProperty[T] {
  def this(
    declaredOn: IStructureClass,
    parent: typingsJapgolly.mendixmodelsdk.elementsMod.AbstractElement,
    name: String,
    value: js.Array[T],
    _targetType: String
  ) = this()
}

