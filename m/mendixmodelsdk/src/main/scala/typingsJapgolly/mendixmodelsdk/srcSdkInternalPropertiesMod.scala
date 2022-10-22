package typingsJapgolly.mendixmodelsdk

import org.scalablytyped.runtime.Instantiable2
import typingsJapgolly.mendixmodelsdk.anon.ToRawChangeValue
import typingsJapgolly.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typingsJapgolly.mendixmodelsdk.srcSdkInternalElementsMod.AbstractElement
import typingsJapgolly.mendixmodelsdk.srcSdkInternalElementsMod.Element
import typingsJapgolly.mendixmodelsdk.srcSdkInternalElementsMod.IAbstractElement
import typingsJapgolly.mendixmodelsdk.srcSdkInternalInstancesMod.AbstractEnum
import typingsJapgolly.mendixmodelsdk.srcSdkInternalInstancesMod.IList
import typingsJapgolly.mendixmodelsdk.srcSdkInternalPropertiesLocalByNameReferencePropertyMod.INamedElement
import typingsJapgolly.mendixmodelsdk.srcSdkInternalStructuresMod.IStructure
import typingsJapgolly.mendixmodelsdk.srcSdkInternalStructuresMod.IStructureClass
import typingsJapgolly.mendixmodelsdk.srcSdkInternalStructuresMod.Structure
import typingsJapgolly.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
import typingsJapgolly.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.IContainer
import typingsJapgolly.mendixmodelsdk.srcSdkInternalTransportInterfacesMod.IAbstractElementJson
import typingsJapgolly.mendixmodelsdk.srcSdkInternalUnitsMod.IModelUnit
import typingsJapgolly.mendixmodelsdk.srcSdkInternalUnitsMod.IStructuralUnit
import typingsJapgolly.mendixmodelsdk.srcSdkInternalUnitsMod.StructuralUnit
import typingsJapgolly.mendixmodelsdk.srcSdkInternalVersionChecksMod.ILifeCycle
import typingsJapgolly.mobx.distTypesObservablearrayMod.IArrayWillChange
import typingsJapgolly.mobx.distTypesObservablearrayMod.IArrayWillSplice
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcSdkInternalPropertiesMod {
  
  @JSImport("mendixmodelsdk/src/sdk/internal/properties", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* note: abstract class */ @JSImport("mendixmodelsdk/src/sdk/internal/properties", "AbstractProperty")
  @js.native
  open class AbstractProperty[T, P] protected ()
    extends typingsJapgolly.mendixmodelsdk.srcSdkInternalPropertiesAbstractPropertyMod.AbstractProperty[T, P] {
    /**
      * parent is the structure that the value of this property attaches to,
      * so e.g. for all values `item` of Part(List)Property we (should) have the invariant:
      *    item.container === this.parent.
      *
      * initialValue is default value except parts and GUID-typed primitives.
      * (by-id/name references do not have default values.)
      */
    def this(
      declaredOn: IStructureClass,
      parent: Structure[IAbstractModel, IContainer | Null],
      name: String,
      initialValue: T,
      moreArgs: Any*
    ) = this()
  }
  
  @JSImport("mendixmodelsdk/src/sdk/internal/properties", "ByIdReferenceProperty")
  @js.native
  open class ByIdReferenceProperty[T /* <: AbstractElement[IAbstractModel, Container] */] protected ()
    extends typingsJapgolly.mendixmodelsdk.srcSdkInternalPropertiesByIdReferencePropertyMod.ByIdReferenceProperty[T] {
    /**
      * parent is the structure that the value of this property attaches to,
      * so e.g. for all values `item` of Part(List)Property we (should) have the invariant:
      *    item.container === this.parent.
      *
      * initialValue is default value except parts and GUID-typed primitives.
      * (by-id/name references do not have default values.)
      */
    def this(
      declaredOn: IStructureClass,
      parent: Structure[IAbstractModel, IContainer | Null],
      name: String,
      initialValue: T,
      moreArgs: Any*
    ) = this()
    def this(
      declaredOn: IStructureClass,
      parent: Structure[IAbstractModel, IContainer | Null],
      name: String,
      initialValue: Null,
      moreArgs: Any*
    ) = this()
  }
  
  @JSImport("mendixmodelsdk/src/sdk/internal/properties", "ByNameReferenceListProperty")
  @js.native
  open class ByNameReferenceListProperty[T /* <: IAbstractElement */] protected ()
    extends typingsJapgolly.mendixmodelsdk.srcSdkInternalPropertiesByNameReferencePropertyMod.ByNameReferenceListProperty[T] {
    def this(
      declaredOn: IStructureClass,
      parent: AbstractElement[IAbstractModel, Container],
      name: String,
      value: js.Array[T],
      _targetType: String
    ) = this()
  }
  
  @JSImport("mendixmodelsdk/src/sdk/internal/properties", "ByNameReferenceProperty")
  @js.native
  open class ByNameReferenceProperty[T /* <: IAbstractElement */] protected ()
    extends typingsJapgolly.mendixmodelsdk.srcSdkInternalPropertiesByNameReferencePropertyMod.ByNameReferenceProperty[T] {
    def this(
      declaredOn: IStructureClass,
      parent: AbstractElement[IAbstractModel, Container],
      name: String,
      initialValue: T,
      _targetType: String
    ) = this()
    def this(
      declaredOn: IStructureClass,
      parent: AbstractElement[IAbstractModel, Container],
      name: String,
      initialValue: Null,
      _targetType: String
    ) = this()
  }
  
  @JSImport("mendixmodelsdk/src/sdk/internal/properties", "EnumListProperty")
  @js.native
  open class EnumListProperty[T /* <: AbstractEnum */] protected ()
    extends typingsJapgolly.mendixmodelsdk.srcSdkInternalPropertiesEnumListPropertyMod.EnumListProperty[T] {
    def this(
      declaredOn: IStructureClass,
      parent: Structure[IAbstractModel, IContainer | Null],
      name: String,
      initialValue: js.Array[T],
      enumType: Instantiable2[/* key */ String, /* lifeCycle */ ILifeCycle, AbstractEnum]
    ) = this()
  }
  
  @JSImport("mendixmodelsdk/src/sdk/internal/properties", "EnumProperty")
  @js.native
  open class EnumProperty[T /* <: AbstractEnum */] protected ()
    extends typingsJapgolly.mendixmodelsdk.srcSdkInternalPropertiesEnumPropertyMod.EnumProperty[T] {
    def this(
      declaredOn: IStructureClass,
      parent: Structure[IAbstractModel, IContainer | Null],
      name: String,
      initialValue: T,
      enumType: Instantiable2[/* key */ String, /* lifeCycle */ ILifeCycle, AbstractEnum]
    ) = this()
  }
  
  @JSImport("mendixmodelsdk/src/sdk/internal/properties", "LocalByNameReferenceProperty")
  @js.native
  open class LocalByNameReferenceProperty[T /* <: INamedElement */] protected ()
    extends typingsJapgolly.mendixmodelsdk.srcSdkInternalPropertiesLocalByNameReferencePropertyMod.LocalByNameReferenceProperty[T] {
    def this(
      declaredOn: IStructureClass,
      parent: AbstractElement[IAbstractModel, Container],
      name: String,
      initialValue: T,
      _targetType: String
    ) = this()
    def this(
      declaredOn: IStructureClass,
      parent: AbstractElement[IAbstractModel, Container],
      name: String,
      initialValue: Null,
      _targetType: String
    ) = this()
  }
  
  @JSImport("mendixmodelsdk/src/sdk/internal/properties", "PartListProperty")
  @js.native
  open class PartListProperty[T /* <: Element[IAbstractModel] */] protected ()
    extends typingsJapgolly.mendixmodelsdk.srcSdkInternalPropertiesPartListPropertyMod.PartListProperty[T] {
    /**
      * parent is the structure that the value of this property attaches to,
      * so e.g. for all values `item` of Part(List)Property we (should) have the invariant:
      *    item.container === this.parent.
      *
      * initialValue is default value except parts and GUID-typed primitives.
      * (by-id/name references do not have default values.)
      */
    def this(
      declaredOn: IStructureClass,
      parent: Structure[IAbstractModel, IContainer | Null],
      name: String,
      initialValue: js.Array[T],
      moreArgs: Any*
    ) = this()
  }
  
  @JSImport("mendixmodelsdk/src/sdk/internal/properties", "PartProperty")
  @js.native
  open class PartProperty[T /* <: Element[IAbstractModel] */] protected ()
    extends typingsJapgolly.mendixmodelsdk.srcSdkInternalPropertiesPartPropertyMod.PartProperty[T] {
    /**
      * parent is the structure that the value of this property attaches to,
      * so e.g. for all values `item` of Part(List)Property we (should) have the invariant:
      *    item.container === this.parent.
      *
      * initialValue is default value except parts and GUID-typed primitives.
      * (by-id/name references do not have default values.)
      */
    def this(
      declaredOn: IStructureClass,
      parent: Structure[IAbstractModel, IContainer | Null],
      name: String,
      initialValue: T,
      moreArgs: Any*
    ) = this()
    def this(
      declaredOn: IStructureClass,
      parent: Structure[IAbstractModel, IContainer | Null],
      name: String,
      initialValue: Null,
      moreArgs: Any*
    ) = this()
  }
  
  @JSImport("mendixmodelsdk/src/sdk/internal/properties", "PrimitiveListProperty")
  @js.native
  open class PrimitiveListProperty[T] protected ()
    extends typingsJapgolly.mendixmodelsdk.srcSdkInternalPropertiesPrimitiveListPropertyMod.PrimitiveListProperty[T] {
    /**
      * parent is the structure that the value of this property attaches to,
      * so e.g. for all values `item` of Part(List)Property we (should) have the invariant:
      *    item.container === this.parent.
      *
      * initialValue is default value except parts and GUID-typed primitives.
      * (by-id/name references do not have default values.)
      */
    def this(
      declaredOn: IStructureClass,
      parent: Structure[IAbstractModel, IContainer | Null],
      name: String,
      initialValue: js.Array[T],
      moreArgs: Any*
    ) = this()
  }
  
  @JSImport("mendixmodelsdk/src/sdk/internal/properties", "PrimitiveProperty")
  @js.native
  open class PrimitiveProperty[T] protected ()
    extends typingsJapgolly.mendixmodelsdk.srcSdkInternalPropertiesPrimitivePropertyMod.PrimitiveProperty[T] {
    /**
      * parent is the structure that the value of this property attaches to,
      * so e.g. for all values `item` of Part(List)Property we (should) have the invariant:
      *    item.container === this.parent.
      *
      * initialValue is default value except parts and GUID-typed primitives.
      * (by-id/name references do not have default values.)
      */
    def this(
      declaredOn: IStructureClass,
      parent: Structure[IAbstractModel, IContainer | Null],
      name: String,
      initialValue: T,
      moreArgs: Any*
    ) = this()
  }
  
  @JSImport("mendixmodelsdk/src/sdk/internal/properties", "PrimitiveTypeEnum")
  @js.native
  object PrimitiveTypeEnum extends StObject {
    
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[
        typingsJapgolly.mendixmodelsdk.srcSdkInternalPropertiesPrimitiveTypeEnumMod.PrimitiveTypeEnum & scala.Double
      ] = js.native
    
    /* 9 */ val Blob: typingsJapgolly.mendixmodelsdk.srcSdkInternalPropertiesPrimitiveTypeEnumMod.PrimitiveTypeEnum.Blob & scala.Double = js.native
    
    /* 2 */ val Boolean: typingsJapgolly.mendixmodelsdk.srcSdkInternalPropertiesPrimitiveTypeEnumMod.PrimitiveTypeEnum.Boolean & scala.Double = js.native
    
    /* 8 */ val Color: typingsJapgolly.mendixmodelsdk.srcSdkInternalPropertiesPrimitiveTypeEnumMod.PrimitiveTypeEnum.Color & scala.Double = js.native
    
    /* 4 */ val DateTime: typingsJapgolly.mendixmodelsdk.srcSdkInternalPropertiesPrimitiveTypeEnumMod.PrimitiveTypeEnum.DateTime & scala.Double = js.native
    
    /* 3 */ val Double: typingsJapgolly.mendixmodelsdk.srcSdkInternalPropertiesPrimitiveTypeEnumMod.PrimitiveTypeEnum.Double & scala.Double = js.native
    
    /* 5 */ val Guid: typingsJapgolly.mendixmodelsdk.srcSdkInternalPropertiesPrimitiveTypeEnumMod.PrimitiveTypeEnum.Guid & scala.Double = js.native
    
    /* 0 */ val Integer: typingsJapgolly.mendixmodelsdk.srcSdkInternalPropertiesPrimitiveTypeEnumMod.PrimitiveTypeEnum.Integer & scala.Double = js.native
    
    /* 6 */ val Point: typingsJapgolly.mendixmodelsdk.srcSdkInternalPropertiesPrimitiveTypeEnumMod.PrimitiveTypeEnum.Point & scala.Double = js.native
    
    /* 7 */ val Size: typingsJapgolly.mendixmodelsdk.srcSdkInternalPropertiesPrimitiveTypeEnumMod.PrimitiveTypeEnum.Size & scala.Double = js.native
    
    /* 1 */ val String: typingsJapgolly.mendixmodelsdk.srcSdkInternalPropertiesPrimitiveTypeEnumMod.PrimitiveTypeEnum.String & scala.Double = js.native
  }
  
  @JSImport("mendixmodelsdk/src/sdk/internal/properties", "StructuralChildListProperty")
  @js.native
  open class StructuralChildListProperty[T /* <: IStructuralUnit | IModelUnit */] protected ()
    extends typingsJapgolly.mendixmodelsdk.srcSdkInternalPropertiesStructuralMod.StructuralChildListProperty[T] {
    def this(
      declaredOn: IStructureClass,
      parent: StructuralUnit[IAbstractModel],
      name: String,
      value: js.Array[T]
    ) = this()
    def this(
      declaredOn: IStructureClass,
      parent: StructuralUnit[IAbstractModel],
      name: String,
      value: js.Array[T],
      targetRefType: String
    ) = this()
  }
  
  @JSImport("mendixmodelsdk/src/sdk/internal/properties", "StructuralChildProperty")
  @js.native
  open class StructuralChildProperty[T /* <: IStructuralUnit | IModelUnit */] protected ()
    extends typingsJapgolly.mendixmodelsdk.srcSdkInternalPropertiesStructuralMod.StructuralChildProperty[T] {
    def this(declaredOn: IStructureClass, parent: StructuralUnit[IAbstractModel], name: String) = this()
    def this(declaredOn: IStructureClass, parent: StructuralUnit[IAbstractModel], name: String, value: T) = this()
    def this(
      declaredOn: IStructureClass,
      parent: StructuralUnit[IAbstractModel],
      name: String,
      value: T,
      targetRefType: String
    ) = this()
    def this(
      declaredOn: IStructureClass,
      parent: StructuralUnit[IAbstractModel],
      name: String,
      value: Null,
      targetRefType: String
    ) = this()
  }
  
  inline def instantiateChildElement(parent: AbstractElement[IAbstractModel, Container]): Element[IAbstractModel] | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("instantiateChildElement")(parent.asInstanceOf[js.Any]).asInstanceOf[Element[IAbstractModel] | Null]
  inline def instantiateChildElement(parent: AbstractElement[IAbstractModel, Container], value: IAbstractElementJson): Element[IAbstractModel] | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("instantiateChildElement")(parent.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Element[IAbstractModel] | Null]
  
  inline def isNamedElement(element: IStructure): /* is mendixmodelsdk.mendixmodelsdk/src/sdk/internal/properties/LocalByNameReferenceProperty.INamedElement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNamedElement")(element.asInstanceOf[js.Any]).asInstanceOf[/* is mendixmodelsdk.mendixmodelsdk/src/sdk/internal/properties/LocalByNameReferenceProperty.INamedElement */ Boolean]
  
  inline def sendListChangeDeltas[T, P](
    property: (typingsJapgolly.mendixmodelsdk.srcSdkInternalPropertiesAbstractPropertyMod.AbstractProperty[js.Array[T], IList[P]]) & ToRawChangeValue[P],
    change: IArrayWillChange[P]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sendListChangeDeltas")(property.asInstanceOf[js.Any], change.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def sendListChangeDeltas[T, P](
    property: (typingsJapgolly.mendixmodelsdk.srcSdkInternalPropertiesAbstractPropertyMod.AbstractProperty[js.Array[T], IList[P]]) & ToRawChangeValue[P],
    change: IArrayWillSplice[P]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sendListChangeDeltas")(property.asInstanceOf[js.Any], change.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
