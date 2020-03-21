package typingsJapgolly.mendixmodelsdk

import org.scalablytyped.runtime.Instantiable2
import typingsJapgolly.mendixmodelsdk.elementsMod.AbstractElement
import typingsJapgolly.mendixmodelsdk.elementsMod.Element
import typingsJapgolly.mendixmodelsdk.elementsMod.IAbstractElement
import typingsJapgolly.mendixmodelsdk.instancesMod.AbstractEnum
import typingsJapgolly.mendixmodelsdk.instancesMod.IList
import typingsJapgolly.mendixmodelsdk.localByNameReferencePropertyMod.INamedElement
import typingsJapgolly.mendixmodelsdk.structuresMod.IStructure
import typingsJapgolly.mendixmodelsdk.structuresMod.IStructureClass
import typingsJapgolly.mendixmodelsdk.structuresMod.Structure
import typingsJapgolly.mendixmodelsdk.transportInterfacesMod.IAbstractElementJson
import typingsJapgolly.mendixmodelsdk.unitsMod.IModelUnit
import typingsJapgolly.mendixmodelsdk.unitsMod.IStructuralUnit
import typingsJapgolly.mendixmodelsdk.unitsMod.StructuralUnit
import typingsJapgolly.mendixmodelsdk.versionChecksMod.ILifeCycle
import typingsJapgolly.mobx.observablearrayMod.IArrayWillChange
import typingsJapgolly.mobx.observablearrayMod.IArrayWillSplice
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/sdk/internal/properties", JSImport.Namespace)
@js.native
object propertiesMod extends js.Object {
  @js.native
  abstract class AbstractProperty[T, P] protected ()
    extends typingsJapgolly.mendixmodelsdk.abstractPropertyMod.AbstractProperty[T, P] {
    /**
      * parent is the structure that the value of this property attaches to,
      * so e.g. for all values `item` of Part(List)Property we (should) have the invariant:
      *    item.container === this.parent.
      *
      * initialValue is default value except parts and GUID-typed primitives.
      * (by-id/name references do not have default values.)
      */
    def this(declaredOn: IStructureClass, parent: Structure, name: String, initialValue: T, moreArgs: js.Any*) = this()
  }
  
  @js.native
  class ByIdReferenceProperty[T /* <: AbstractElement */] ()
    extends typingsJapgolly.mendixmodelsdk.byIdReferencePropertyMod.ByIdReferenceProperty[T]
  
  @js.native
  class ByNameReferenceListProperty[T /* <: IAbstractElement */] protected ()
    extends typingsJapgolly.mendixmodelsdk.byNameReferencePropertyMod.ByNameReferenceListProperty[T] {
    def this(
      declaredOn: IStructureClass,
      parent: AbstractElement,
      name: String,
      value: js.Array[T],
      _targetType: String
    ) = this()
  }
  
  @js.native
  class ByNameReferenceProperty[T /* <: IAbstractElement */] protected ()
    extends typingsJapgolly.mendixmodelsdk.byNameReferencePropertyMod.ByNameReferenceProperty[T] {
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
  }
  
  @js.native
  class EnumListProperty[T /* <: AbstractEnum */] protected ()
    extends typingsJapgolly.mendixmodelsdk.enumListPropertyMod.EnumListProperty[T] {
    def this(
      declaredOn: IStructureClass,
      parent: Structure,
      name: String,
      initialValue: js.Array[T],
      enumType: Instantiable2[/* key */ String, /* lifeCycle */ ILifeCycle, AbstractEnum]
    ) = this()
  }
  
  @js.native
  class EnumProperty[T /* <: AbstractEnum */] protected ()
    extends typingsJapgolly.mendixmodelsdk.enumPropertyMod.EnumProperty[T] {
    def this(
      declaredOn: IStructureClass,
      parent: Structure,
      name: String,
      initialValue: T,
      enumType: Instantiable2[/* key */ String, /* lifeCycle */ ILifeCycle, AbstractEnum]
    ) = this()
  }
  
  @js.native
  class LocalByNameReferenceProperty[T /* <: INamedElement */] protected ()
    extends typingsJapgolly.mendixmodelsdk.localByNameReferencePropertyMod.LocalByNameReferenceProperty[T] {
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
  }
  
  @js.native
  class PartListProperty[T /* <: Element */] ()
    extends typingsJapgolly.mendixmodelsdk.partListPropertyMod.PartListProperty[T]
  
  @js.native
  class PartProperty[T /* <: Element */] ()
    extends typingsJapgolly.mendixmodelsdk.partPropertyMod.PartProperty[T]
  
  @js.native
  class PrimitiveListProperty[T] ()
    extends typingsJapgolly.mendixmodelsdk.primitiveListPropertyMod.PrimitiveListProperty[T]
  
  @js.native
  class PrimitiveProperty[T] ()
    extends typingsJapgolly.mendixmodelsdk.primitivePropertyMod.PrimitiveProperty[T]
  
  @js.native
  class StructuralChildListProperty[T /* <: IStructuralUnit | IModelUnit */] protected ()
    extends typingsJapgolly.mendixmodelsdk.structuralMod.StructuralChildListProperty[T] {
    def this(declaredOn: IStructureClass, parent: StructuralUnit, name: String, value: js.Array[T]) = this()
    def this(
      declaredOn: IStructureClass,
      parent: StructuralUnit,
      name: String,
      value: js.Array[T],
      targetRefType: String
    ) = this()
  }
  
  @js.native
  class StructuralChildProperty[T /* <: IStructuralUnit | IModelUnit */] protected ()
    extends typingsJapgolly.mendixmodelsdk.structuralMod.StructuralChildProperty[T] {
    def this(declaredOn: IStructureClass, parent: StructuralUnit, name: String) = this()
    def this(declaredOn: IStructureClass, parent: StructuralUnit, name: String, value: T) = this()
    def this(declaredOn: IStructureClass, parent: StructuralUnit, name: String, value: T, targetRefType: String) = this()
    def this(
      declaredOn: IStructureClass,
      parent: StructuralUnit,
      name: String,
      value: Null,
      targetRefType: String
    ) = this()
  }
  
  def instantiateChildElement(parent: AbstractElement): Element | Null = js.native
  def instantiateChildElement(parent: AbstractElement, value: IAbstractElementJson): Element | Null = js.native
  def isNamedElement(element: IStructure): /* is mendixmodelsdk.mendixmodelsdk/dist/sdk/internal/properties/LocalByNameReferenceProperty.INamedElement */ Boolean = js.native
  def sendListChangeDeltas[T, P](
    property: (typingsJapgolly.mendixmodelsdk.abstractPropertyMod.AbstractProperty[js.Array[T], IList[P]]) with AnonToRawChangeValue[P],
    change: IArrayWillChange[P]
  ): Unit = js.native
  def sendListChangeDeltas[T, P](
    property: (typingsJapgolly.mendixmodelsdk.abstractPropertyMod.AbstractProperty[js.Array[T], IList[P]]) with AnonToRawChangeValue[P],
    change: IArrayWillSplice[P]
  ): Unit = js.native
  @js.native
  object PrimitiveTypeEnum extends js.Object {
    /* 9 */ val Blob: typingsJapgolly.mendixmodelsdk.primitiveTypeEnumMod.PrimitiveTypeEnum.Blob with scala.Double = js.native
    /* 2 */ val Boolean: typingsJapgolly.mendixmodelsdk.primitiveTypeEnumMod.PrimitiveTypeEnum.Boolean with scala.Double = js.native
    /* 8 */ val Color: typingsJapgolly.mendixmodelsdk.primitiveTypeEnumMod.PrimitiveTypeEnum.Color with scala.Double = js.native
    /* 4 */ val DateTime: typingsJapgolly.mendixmodelsdk.primitiveTypeEnumMod.PrimitiveTypeEnum.DateTime with scala.Double = js.native
    /* 3 */ val Double: typingsJapgolly.mendixmodelsdk.primitiveTypeEnumMod.PrimitiveTypeEnum.Double with scala.Double = js.native
    /* 5 */ val Guid: typingsJapgolly.mendixmodelsdk.primitiveTypeEnumMod.PrimitiveTypeEnum.Guid with scala.Double = js.native
    /* 0 */ val Integer: typingsJapgolly.mendixmodelsdk.primitiveTypeEnumMod.PrimitiveTypeEnum.Integer with scala.Double = js.native
    /* 6 */ val Point: typingsJapgolly.mendixmodelsdk.primitiveTypeEnumMod.PrimitiveTypeEnum.Point with scala.Double = js.native
    /* 7 */ val Size: typingsJapgolly.mendixmodelsdk.primitiveTypeEnumMod.PrimitiveTypeEnum.Size with scala.Double = js.native
    /* 1 */ val String: typingsJapgolly.mendixmodelsdk.primitiveTypeEnumMod.PrimitiveTypeEnum.String with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[
        typingsJapgolly.mendixmodelsdk.primitiveTypeEnumMod.PrimitiveTypeEnum with scala.Double
      ] = js.native
  }
  
}

