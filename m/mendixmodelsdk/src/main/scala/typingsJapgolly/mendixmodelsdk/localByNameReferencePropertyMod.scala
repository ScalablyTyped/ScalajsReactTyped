package typingsJapgolly.mendixmodelsdk

import typingsJapgolly.mendixmodelsdk.abstractPropertyMod.AbstractProperty
import typingsJapgolly.mendixmodelsdk.elementsMod.AbstractElement
import typingsJapgolly.mendixmodelsdk.elementsMod.IElement
import typingsJapgolly.mendixmodelsdk.structuresMod.IStructure
import typingsJapgolly.mendixmodelsdk.structuresMod.IStructureClass
import typingsJapgolly.mendixmodelsdk.structuresMod.Structure
import typingsJapgolly.mendixmodelsdk.utilsMod.utils.IMap
import typingsJapgolly.mobx.observablevalueMod.IObservableValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/sdk/internal/properties/LocalByNameReferenceProperty", JSImport.Namespace)
@js.native
object localByNameReferencePropertyMod extends js.Object {
  @js.native
  trait INamedElement extends IElement {
    var name: String = js.native
  }
  
  @js.native
  class LocalByNameReferenceProperty[T /* <: INamedElement */] protected () extends AbstractProperty[T | Null, IObservableValue[String | Null]] {
    def this(
      declaredOn: IStructureClass,
      parent: AbstractElement,
      name: String,
      initialValue: T,
      _targetType: String
    ) = this()
    def this(
      declaredOn: IStructureClass,
      parent: AbstractElement,
      name: String,
      initialValue: Null,
      _targetType: String
    ) = this()
    @JSName("parent")
    var parent_LocalByNameReferenceProperty: AbstractElement = js.native
    def deepCopyInto(clone: Structure): Unit = js.native
    def deepCopyInto(clone: Structure, idMap: IMap[Structure]): Unit = js.native
    def localName(): String | Null = js.native
    def set(): Unit = js.native
    def set(newValue: T): Unit = js.native
    def targetType(): String = js.native
    def updateWithRawValue(value: String): Unit = js.native
  }
  
  def isNamedElement(element: IStructure): /* is mendixmodelsdk.mendixmodelsdk/dist/sdk/internal/properties/LocalByNameReferenceProperty.INamedElement */ Boolean = js.native
}

