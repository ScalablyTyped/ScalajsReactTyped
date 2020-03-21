package typingsJapgolly.mendixmodelsdk.mod

import typingsJapgolly.mendixmodelsdk.elementsMod.IAbstractElement
import typingsJapgolly.mendixmodelsdk.structuresMod.IStructureClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk", "ByNameReferenceProperty")
@js.native
class ByNameReferenceProperty[T /* <: IAbstractElement */] protected ()
  extends typingsJapgolly.mendixmodelsdk.propertiesMod.ByNameReferenceProperty[T] {
  def this(
    declaredOn: IStructureClass,
    parent: typingsJapgolly.mendixmodelsdk.elementsMod.AbstractElement,
    name: String,
    initialValue: T,
    _targetType: String
  ) = this()
  def this(
    declaredOn: IStructureClass,
    parent: typingsJapgolly.mendixmodelsdk.elementsMod.AbstractElement,
    name: String,
    initialValue: Null,
    _targetType: String
  ) = this()
}

