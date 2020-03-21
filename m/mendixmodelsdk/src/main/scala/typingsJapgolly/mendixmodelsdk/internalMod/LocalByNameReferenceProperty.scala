package typingsJapgolly.mendixmodelsdk.internalMod

import typingsJapgolly.mendixmodelsdk.localByNameReferencePropertyMod.INamedElement
import typingsJapgolly.mendixmodelsdk.structuresMod.IStructureClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/sdk/internal", "LocalByNameReferenceProperty")
@js.native
class LocalByNameReferenceProperty[T /* <: INamedElement */] protected ()
  extends typingsJapgolly.mendixmodelsdk.propertiesMod.LocalByNameReferenceProperty[T] {
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

