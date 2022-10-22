package typingsJapgolly.mendixmodelsdk

import org.scalablytyped.runtime.Instantiable2
import typingsJapgolly.mendixmodelsdk.anon.HandleError
import typingsJapgolly.mendixmodelsdk.anon.ToRawChangeValue
import typingsJapgolly.mendixmodelsdk.srcCommonMod.common.IErrorCallback
import typingsJapgolly.mendixmodelsdk.srcSdkConfigurationMod.configuration.ISdkConfig
import typingsJapgolly.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typingsJapgolly.mendixmodelsdk.srcSdkInternalDeltasDeltaManagerMod.IDeltaManager
import typingsJapgolly.mendixmodelsdk.srcSdkInternalElementsMod.IAbstractElement
import typingsJapgolly.mendixmodelsdk.srcSdkInternalImodelserverclientMod.IModelServerClient
import typingsJapgolly.mendixmodelsdk.srcSdkInternalInstancesMod.IList
import typingsJapgolly.mendixmodelsdk.srcSdkInternalInstancesMod.InstanceConstructor
import typingsJapgolly.mendixmodelsdk.srcSdkInternalPropertiesLocalByNameReferencePropertyMod.INamedElement
import typingsJapgolly.mendixmodelsdk.srcSdkInternalStructuresMod.IStructure
import typingsJapgolly.mendixmodelsdk.srcSdkInternalStructuresMod.IStructureClass
import typingsJapgolly.mendixmodelsdk.srcSdkInternalStructuresMod.IStructureConstructor
import typingsJapgolly.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
import typingsJapgolly.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.IContainer
import typingsJapgolly.mendixmodelsdk.srcSdkInternalTransportInterfacesMod.IAbstractElementJson
import typingsJapgolly.mendixmodelsdk.srcSdkInternalTransportInterfacesMod.IAbstractUnitJson
import typingsJapgolly.mendixmodelsdk.srcSdkInternalUnitsMod.IAbstractUnit
import typingsJapgolly.mendixmodelsdk.srcSdkInternalUnitsMod.IAbstractUnitConstructor
import typingsJapgolly.mendixmodelsdk.srcSdkInternalUnitsMod.IModelUnit
import typingsJapgolly.mendixmodelsdk.srcSdkInternalUnitsMod.IStructuralUnit
import typingsJapgolly.mendixmodelsdk.srcSdkInternalVersionChecksMod.ILifeCycle
import typingsJapgolly.mendixmodelsdk.srcSdkInternalVersionChecksMod.IModifierValueHistory
import typingsJapgolly.mendixmodelsdk.srcSdkInternalVersionChecksMod.IPropertyVersionInfo
import typingsJapgolly.mendixmodelsdk.srcSdkInternalVersionChecksMod.IStructureVersionInfo
import typingsJapgolly.mendixmodelsdk.srcSdkInternalVersionChecksMod.IVersionRange
import typingsJapgolly.mendixmodelsdk.srcSdkInternalVersionChecksMod.StructureType
import typingsJapgolly.mendixmodelsdk.srcSdkUtilsMod.utils.IMap
import typingsJapgolly.mobx.distTypesObservablearrayMod.IArrayWillChange
import typingsJapgolly.mobx.distTypesObservablearrayMod.IArrayWillSplice
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcSdkInternalMod {
  
  @JSImport("mendixmodelsdk/src/sdk/internal", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* note: abstract class */ @JSImport("mendixmodelsdk/src/sdk/internal", "AbstractElement")
  @js.native
  open class AbstractElement[TModel /* <: IAbstractModel */, TContainer /* <: Container */] protected ()
    extends typingsJapgolly.mendixmodelsdk.srcSdkInternalElementsMod.AbstractElement[TModel, TContainer] {
    def this(
      model: typingsJapgolly.mendixmodelsdk.srcSdkInternalAbstractModelMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean
    ) = this()
    def this(
      model: typingsJapgolly.mendixmodelsdk.srcSdkInternalAbstractModelMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IContainer
    ) = this()
  }
  
  /* note: abstract class */ @JSImport("mendixmodelsdk/src/sdk/internal", "AbstractEnum")
  @js.native
  open class AbstractEnum protected ()
    extends typingsJapgolly.mendixmodelsdk.srcSdkInternalInstancesMod.AbstractEnum {
    def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
  }
  
  /* note: abstract class */ @JSImport("mendixmodelsdk/src/sdk/internal", "AbstractModel")
  @js.native
  open class AbstractModel protected ()
    extends typingsJapgolly.mendixmodelsdk.srcSdkInternalAbstractModelMod.AbstractModel {
    def this(_client: IModelServerClient, _errorHandler: IErrorCallback) = this()
  }
  
  /* note: abstract class */ @JSImport("mendixmodelsdk/src/sdk/internal", "AbstractProperty")
  @js.native
  open class AbstractProperty[T, P] protected ()
    extends typingsJapgolly.mendixmodelsdk.srcSdkInternalPropertiesMod.AbstractProperty[T, P] {
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
      parent: typingsJapgolly.mendixmodelsdk.srcSdkInternalStructuresMod.Structure[IAbstractModel, IContainer | Null],
      name: String,
      initialValue: T,
      moreArgs: Any*
    ) = this()
  }
  
  /* note: abstract class */ @JSImport("mendixmodelsdk/src/sdk/internal", "AbstractUnit")
  @js.native
  open class AbstractUnit[TModel /* <: IAbstractModel */] protected ()
    extends typingsJapgolly.mendixmodelsdk.srcSdkInternalUnitsMod.AbstractUnit[TModel] {
    def this(
      model: typingsJapgolly.mendixmodelsdk.srcSdkInternalAbstractModelMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IStructuralUnit
    ) = this()
  }
  
  @JSImport("mendixmodelsdk/src/sdk/internal", "ByIdReference")
  @js.native
  open class ByIdReference[T /* <: typingsJapgolly.mendixmodelsdk.srcSdkInternalElementsMod.AbstractElement[IAbstractModel, Container] */] protected ()
    extends typingsJapgolly.mendixmodelsdk.srcSdkInternalByIdReferenceMod.ByIdReference[T] {
    /**
      * Constructs and returns a new reference instance, that is owned (by a property of) an abstract element.
      */
    def this(owner: typingsJapgolly.mendixmodelsdk.srcSdkInternalElementsMod.AbstractElement[IAbstractModel, Container]) = this()
  }
  
  @JSImport("mendixmodelsdk/src/sdk/internal", "ByIdReferenceProperty")
  @js.native
  open class ByIdReferenceProperty[T /* <: typingsJapgolly.mendixmodelsdk.srcSdkInternalElementsMod.AbstractElement[IAbstractModel, Container] */] protected ()
    extends typingsJapgolly.mendixmodelsdk.srcSdkInternalPropertiesMod.ByIdReferenceProperty[T] {
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
      parent: typingsJapgolly.mendixmodelsdk.srcSdkInternalStructuresMod.Structure[IAbstractModel, IContainer | Null],
      name: String,
      initialValue: T,
      moreArgs: Any*
    ) = this()
    def this(
      declaredOn: IStructureClass,
      parent: typingsJapgolly.mendixmodelsdk.srcSdkInternalStructuresMod.Structure[IAbstractModel, IContainer | Null],
      name: String,
      initialValue: Null,
      moreArgs: Any*
    ) = this()
  }
  
  @JSImport("mendixmodelsdk/src/sdk/internal", "ByNameReferenceListProperty")
  @js.native
  open class ByNameReferenceListProperty[T /* <: IAbstractElement */] protected ()
    extends typingsJapgolly.mendixmodelsdk.srcSdkInternalPropertiesMod.ByNameReferenceListProperty[T] {
    def this(
      declaredOn: IStructureClass,
      parent: typingsJapgolly.mendixmodelsdk.srcSdkInternalElementsMod.AbstractElement[IAbstractModel, Container],
      name: String,
      value: js.Array[T],
      _targetType: String
    ) = this()
  }
  
  @JSImport("mendixmodelsdk/src/sdk/internal", "ByNameReferenceProperty")
  @js.native
  open class ByNameReferenceProperty[T /* <: IAbstractElement */] protected ()
    extends typingsJapgolly.mendixmodelsdk.srcSdkInternalPropertiesMod.ByNameReferenceProperty[T] {
    def this(
      declaredOn: IStructureClass,
      parent: typingsJapgolly.mendixmodelsdk.srcSdkInternalElementsMod.AbstractElement[IAbstractModel, Container],
      name: String,
      initialValue: T,
      _targetType: String
    ) = this()
    def this(
      declaredOn: IStructureClass,
      parent: typingsJapgolly.mendixmodelsdk.srcSdkInternalElementsMod.AbstractElement[IAbstractModel, Container],
      name: String,
      initialValue: Null,
      _targetType: String
    ) = this()
  }
  
  @JSImport("mendixmodelsdk/src/sdk/internal", "DeltaManager")
  @js.native
  open class DeltaManager protected ()
    extends typingsJapgolly.mendixmodelsdk.srcSdkInternalDeltasMod.DeltaManager {
    def this(model: typingsJapgolly.mendixmodelsdk.srcSdkInternalAbstractModelMod.AbstractModel) = this()
  }
  
  /* note: abstract class */ @JSImport("mendixmodelsdk/src/sdk/internal", "Element")
  @js.native
  open class Element[TModel /* <: IAbstractModel */] protected ()
    extends typingsJapgolly.mendixmodelsdk.srcSdkInternalElementsMod.Element[TModel] {
    def this(
      model: typingsJapgolly.mendixmodelsdk.srcSdkInternalAbstractModelMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typingsJapgolly.mendixmodelsdk.srcSdkInternalUnitsMod.ModelUnit[IAbstractModel],
      container: typingsJapgolly.mendixmodelsdk.srcSdkInternalElementsMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  
  @JSImport("mendixmodelsdk/src/sdk/internal", "EnumListProperty")
  @js.native
  open class EnumListProperty[T /* <: typingsJapgolly.mendixmodelsdk.srcSdkInternalInstancesMod.AbstractEnum */] protected ()
    extends typingsJapgolly.mendixmodelsdk.srcSdkInternalPropertiesMod.EnumListProperty[T] {
    def this(
      declaredOn: IStructureClass,
      parent: typingsJapgolly.mendixmodelsdk.srcSdkInternalStructuresMod.Structure[IAbstractModel, IContainer | Null],
      name: String,
      initialValue: js.Array[T],
      enumType: Instantiable2[
            /* key */ String, 
            /* lifeCycle */ ILifeCycle, 
            typingsJapgolly.mendixmodelsdk.srcSdkInternalInstancesMod.AbstractEnum
          ]
    ) = this()
  }
  
  @JSImport("mendixmodelsdk/src/sdk/internal", "EnumProperty")
  @js.native
  open class EnumProperty[T /* <: typingsJapgolly.mendixmodelsdk.srcSdkInternalInstancesMod.AbstractEnum */] protected ()
    extends typingsJapgolly.mendixmodelsdk.srcSdkInternalPropertiesMod.EnumProperty[T] {
    def this(
      declaredOn: IStructureClass,
      parent: typingsJapgolly.mendixmodelsdk.srcSdkInternalStructuresMod.Structure[IAbstractModel, IContainer | Null],
      name: String,
      initialValue: T,
      enumType: Instantiable2[
            /* key */ String, 
            /* lifeCycle */ ILifeCycle, 
            typingsJapgolly.mendixmodelsdk.srcSdkInternalInstancesMod.AbstractEnum
          ]
    ) = this()
  }
  
  @JSImport("mendixmodelsdk/src/sdk/internal", "LifeCycle")
  @js.native
  open class LifeCycle ()
    extends typingsJapgolly.mendixmodelsdk.srcSdkInternalVersionChecksMod.LifeCycle {
    def this(info: ILifeCycle) = this()
  }
  
  @JSImport("mendixmodelsdk/src/sdk/internal", "LifeCycleState")
  @js.native
  object LifeCycleState extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.mendixmodelsdk.srcSdkInternalVersionChecksMod.LifeCycleState & Double
      ] = js.native
    
    /* 1 */ val AVAILABLE: typingsJapgolly.mendixmodelsdk.srcSdkInternalVersionChecksMod.LifeCycleState.AVAILABLE & Double = js.native
    
    /* 2 */ val REMOVED: typingsJapgolly.mendixmodelsdk.srcSdkInternalVersionChecksMod.LifeCycleState.REMOVED & Double = js.native
    
    /* 0 */ val UNAVAILABLE: typingsJapgolly.mendixmodelsdk.srcSdkInternalVersionChecksMod.LifeCycleState.UNAVAILABLE & Double = js.native
  }
  
  @JSImport("mendixmodelsdk/src/sdk/internal", "LocalByNameReferenceProperty")
  @js.native
  open class LocalByNameReferenceProperty[T /* <: INamedElement */] protected ()
    extends typingsJapgolly.mendixmodelsdk.srcSdkInternalPropertiesMod.LocalByNameReferenceProperty[T] {
    def this(
      declaredOn: IStructureClass,
      parent: typingsJapgolly.mendixmodelsdk.srcSdkInternalElementsMod.AbstractElement[IAbstractModel, Container],
      name: String,
      initialValue: T,
      _targetType: String
    ) = this()
    def this(
      declaredOn: IStructureClass,
      parent: typingsJapgolly.mendixmodelsdk.srcSdkInternalElementsMod.AbstractElement[IAbstractModel, Container],
      name: String,
      initialValue: Null,
      _targetType: String
    ) = this()
  }
  
  @JSImport("mendixmodelsdk/src/sdk/internal", "ModelEventReceiver")
  @js.native
  open class ModelEventReceiver protected ()
    extends typingsJapgolly.mendixmodelsdk.srcSdkInternalModelEventsModelEventReceiverMod.ModelEventReceiver {
    def this(workingCopyId: String, client: IModelServerClient, errorHandler: HandleError) = this()
  }
  
  @JSImport("mendixmodelsdk/src/sdk/internal", "ModelServerClientImpl")
  @js.native
  open class ModelServerClientImpl protected ()
    extends typingsJapgolly.mendixmodelsdk.srcSdkInternalModelServerClientImplMod.ModelServerClientImpl {
    def this(config: ISdkConfig) = this()
  }
  
  /* note: abstract class */ @JSImport("mendixmodelsdk/src/sdk/internal", "ModelUnit")
  @js.native
  open class ModelUnit[TModel /* <: IAbstractModel */] protected ()
    extends typingsJapgolly.mendixmodelsdk.srcSdkInternalUnitsMod.ModelUnit[TModel] {
    def this(
      model: typingsJapgolly.mendixmodelsdk.srcSdkInternalAbstractModelMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean
    ) = this()
    def this(
      model: typingsJapgolly.mendixmodelsdk.srcSdkInternalAbstractModelMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IStructuralUnit
    ) = this()
  }
  
  @JSImport("mendixmodelsdk/src/sdk/internal", "ModifierValueHistory")
  @js.native
  open class ModifierValueHistory protected ()
    extends typingsJapgolly.mendixmodelsdk.srcSdkInternalVersionChecksMod.ModifierValueHistory {
    def this(lifecycle: Null, defaultFallback: Boolean) = this()
    def this(lifecycle: Unit, defaultFallback: Boolean) = this()
    /**
      * defaultFallback indiciates whether the absence of a lifecycle yields true or false
      */
    def this(lifecycle: IModifierValueHistory, defaultFallback: Boolean) = this()
  }
  
  @JSImport("mendixmodelsdk/src/sdk/internal", "PartListProperty")
  @js.native
  open class PartListProperty[T /* <: typingsJapgolly.mendixmodelsdk.srcSdkInternalElementsMod.Element[IAbstractModel] */] protected ()
    extends typingsJapgolly.mendixmodelsdk.srcSdkInternalPropertiesMod.PartListProperty[T] {
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
      parent: typingsJapgolly.mendixmodelsdk.srcSdkInternalStructuresMod.Structure[IAbstractModel, IContainer | Null],
      name: String,
      initialValue: js.Array[T],
      moreArgs: Any*
    ) = this()
  }
  
  @JSImport("mendixmodelsdk/src/sdk/internal", "PartProperty")
  @js.native
  open class PartProperty[T /* <: typingsJapgolly.mendixmodelsdk.srcSdkInternalElementsMod.Element[IAbstractModel] */] protected ()
    extends typingsJapgolly.mendixmodelsdk.srcSdkInternalPropertiesMod.PartProperty[T] {
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
      parent: typingsJapgolly.mendixmodelsdk.srcSdkInternalStructuresMod.Structure[IAbstractModel, IContainer | Null],
      name: String,
      initialValue: T,
      moreArgs: Any*
    ) = this()
    def this(
      declaredOn: IStructureClass,
      parent: typingsJapgolly.mendixmodelsdk.srcSdkInternalStructuresMod.Structure[IAbstractModel, IContainer | Null],
      name: String,
      initialValue: Null,
      moreArgs: Any*
    ) = this()
  }
  
  @JSImport("mendixmodelsdk/src/sdk/internal", "PrimitiveListProperty")
  @js.native
  open class PrimitiveListProperty[T] protected ()
    extends typingsJapgolly.mendixmodelsdk.srcSdkInternalPropertiesMod.PrimitiveListProperty[T] {
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
      parent: typingsJapgolly.mendixmodelsdk.srcSdkInternalStructuresMod.Structure[IAbstractModel, IContainer | Null],
      name: String,
      initialValue: js.Array[T],
      moreArgs: Any*
    ) = this()
  }
  
  @JSImport("mendixmodelsdk/src/sdk/internal", "PrimitiveProperty")
  @js.native
  open class PrimitiveProperty[T] protected ()
    extends typingsJapgolly.mendixmodelsdk.srcSdkInternalPropertiesMod.PrimitiveProperty[T] {
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
      parent: typingsJapgolly.mendixmodelsdk.srcSdkInternalStructuresMod.Structure[IAbstractModel, IContainer | Null],
      name: String,
      initialValue: T,
      moreArgs: Any*
    ) = this()
  }
  
  @JSImport("mendixmodelsdk/src/sdk/internal", "PrimitiveTypeEnum")
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
  
  @JSImport("mendixmodelsdk/src/sdk/internal", "PropertyVersionInfo")
  @js.native
  open class PropertyVersionInfo protected ()
    extends typingsJapgolly.mendixmodelsdk.srcSdkInternalVersionChecksMod.PropertyVersionInfo {
    def this(info: Null, publicByDefault: Boolean) = this()
    def this(info: IPropertyVersionInfo, publicByDefault: Boolean) = this()
  }
  
  @JSImport("mendixmodelsdk/src/sdk/internal", "RestTransportation")
  @js.native
  open class RestTransportation protected ()
    extends typingsJapgolly.mendixmodelsdk.srcSdkInternalRestTransportationMod.RestTransportation {
    def this(config: ISdkConfig) = this()
  }
  
  @JSImport("mendixmodelsdk/src/sdk/internal", "StructuralChildListProperty")
  @js.native
  open class StructuralChildListProperty[T /* <: IStructuralUnit | IModelUnit */] protected ()
    extends typingsJapgolly.mendixmodelsdk.srcSdkInternalPropertiesMod.StructuralChildListProperty[T] {
    def this(
      declaredOn: IStructureClass,
      parent: typingsJapgolly.mendixmodelsdk.srcSdkInternalUnitsMod.StructuralUnit[IAbstractModel],
      name: String,
      value: js.Array[T]
    ) = this()
    def this(
      declaredOn: IStructureClass,
      parent: typingsJapgolly.mendixmodelsdk.srcSdkInternalUnitsMod.StructuralUnit[IAbstractModel],
      name: String,
      value: js.Array[T],
      targetRefType: String
    ) = this()
  }
  
  @JSImport("mendixmodelsdk/src/sdk/internal", "StructuralChildProperty")
  @js.native
  open class StructuralChildProperty[T /* <: IStructuralUnit | IModelUnit */] protected ()
    extends typingsJapgolly.mendixmodelsdk.srcSdkInternalPropertiesMod.StructuralChildProperty[T] {
    def this(
      declaredOn: IStructureClass,
      parent: typingsJapgolly.mendixmodelsdk.srcSdkInternalUnitsMod.StructuralUnit[IAbstractModel],
      name: String
    ) = this()
    def this(
      declaredOn: IStructureClass,
      parent: typingsJapgolly.mendixmodelsdk.srcSdkInternalUnitsMod.StructuralUnit[IAbstractModel],
      name: String,
      value: T
    ) = this()
    def this(
      declaredOn: IStructureClass,
      parent: typingsJapgolly.mendixmodelsdk.srcSdkInternalUnitsMod.StructuralUnit[IAbstractModel],
      name: String,
      value: T,
      targetRefType: String
    ) = this()
    def this(
      declaredOn: IStructureClass,
      parent: typingsJapgolly.mendixmodelsdk.srcSdkInternalUnitsMod.StructuralUnit[IAbstractModel],
      name: String,
      value: Null,
      targetRefType: String
    ) = this()
  }
  
  /* note: abstract class */ @JSImport("mendixmodelsdk/src/sdk/internal", "StructuralUnit")
  @js.native
  open class StructuralUnit[TModel /* <: IAbstractModel */] protected ()
    extends typingsJapgolly.mendixmodelsdk.srcSdkInternalUnitsMod.StructuralUnit[TModel] {
    def this(
      model: typingsJapgolly.mendixmodelsdk.srcSdkInternalAbstractModelMod.AbstractModel,
      structureTypeName: String,
      id: String,
      _ignoredIsPartial: Boolean,
      container: IStructuralUnit
    ) = this()
  }
  
  /* note: abstract class */ @JSImport("mendixmodelsdk/src/sdk/internal", "Structure")
  @js.native
  open class Structure[TModel /* <: IAbstractModel */, TContainer /* <: IContainer | Null */] protected ()
    extends typingsJapgolly.mendixmodelsdk.srcSdkInternalStructuresMod.Structure[TModel, TContainer] {
    def this(
      _model: typingsJapgolly.mendixmodelsdk.srcSdkInternalAbstractModelMod.AbstractModel,
      structureTypeName: String,
      id: String
    ) = this()
    def this(
      _model: typingsJapgolly.mendixmodelsdk.srcSdkInternalAbstractModelMod.AbstractModel,
      structureTypeName: String,
      id: String,
      _isPartial: Boolean
    ) = this()
    def this(
      _model: typingsJapgolly.mendixmodelsdk.srcSdkInternalAbstractModelMod.AbstractModel,
      structureTypeName: String,
      id: String,
      _isPartial: Boolean,
      container: IContainer
    ) = this()
    def this(
      _model: typingsJapgolly.mendixmodelsdk.srcSdkInternalAbstractModelMod.AbstractModel,
      structureTypeName: String,
      id: String,
      _isPartial: Unit,
      container: IContainer
    ) = this()
  }
  
  @JSImport("mendixmodelsdk/src/sdk/internal", "StructureType")
  @js.native
  object StructureType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.mendixmodelsdk.srcSdkInternalVersionChecksMod.StructureType & Double
      ] = js.native
    
    /* 2 */ val Element: typingsJapgolly.mendixmodelsdk.srcSdkInternalVersionChecksMod.StructureType.Element & Double = js.native
    
    /* 1 */ val ModelUnit: typingsJapgolly.mendixmodelsdk.srcSdkInternalVersionChecksMod.StructureType.ModelUnit & Double = js.native
    
    /* 0 */ val StructuralUnit: typingsJapgolly.mendixmodelsdk.srcSdkInternalVersionChecksMod.StructureType.StructuralUnit & Double = js.native
  }
  
  @JSImport("mendixmodelsdk/src/sdk/internal", "StructureVersionInfo")
  @js.native
  open class StructureVersionInfo protected ()
    extends typingsJapgolly.mendixmodelsdk.srcSdkInternalVersionChecksMod.StructureVersionInfo {
    def this(info: IStructureVersionInfo, structureType: StructureType) = this()
  }
  
  @JSImport("mendixmodelsdk/src/sdk/internal", "UndoManager")
  @js.native
  open class UndoManager protected ()
    extends typingsJapgolly.mendixmodelsdk.srcSdkInternalUndoManagerMod.UndoManager {
    def this(_model: IAbstractModel) = this()
  }
  
  @JSImport("mendixmodelsdk/src/sdk/internal", "UndoState")
  @js.native
  open class UndoState protected ()
    extends typingsJapgolly.mendixmodelsdk.srcSdkInternalUndoManagerMod.UndoState {
    def this(deltaManager: IDeltaManager) = this()
  }
  
  @JSImport("mendixmodelsdk/src/sdk/internal", "Version")
  @js.native
  open class Version protected ()
    extends typingsJapgolly.mendixmodelsdk.srcSdkInternalVersionChecksMod.Version {
    def this(major: Double, minor: Double, patch: Double) = this()
  }
  /* static members */
  object Version {
    
    @JSImport("mendixmodelsdk/src/sdk/internal", "Version")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("mendixmodelsdk/src/sdk/internal", "Version.memoisMap")
    @js.native
    def memoisMap: Any = js.native
    inline def memoisMap_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("memoisMap")(x.asInstanceOf[js.Any])
    
    /**
      * Parses and @returns the given string as a Version object.
      *
      * This function is memoised to keep memory and time consumption low,
      * given that only a handful of versions exist at any time anyway.
      */
    inline def parse(versionString: String): typingsJapgolly.mendixmodelsdk.srcSdkInternalVersionChecksMod.Version = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(versionString.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcSdkInternalVersionChecksMod.Version]
  }
  
  /* note: abstract class */ @JSImport("mendixmodelsdk/src/sdk/internal", "VersionInfo")
  @js.native
  open class VersionInfo ()
    extends typingsJapgolly.mendixmodelsdk.srcSdkInternalVersionChecksMod.VersionInfo
  
  inline def contains(
    range: IVersionRange,
    version: typingsJapgolly.mendixmodelsdk.srcSdkInternalVersionChecksMod.Version
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("contains")(range.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def createElementFromJSON(model: IAbstractModel, json: IAbstractElementJson): typingsJapgolly.mendixmodelsdk.srcSdkInternalElementsMod.Element[IAbstractModel] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElementFromJSON")(model.asInstanceOf[js.Any], json.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcSdkInternalElementsMod.Element[IAbstractModel]]
  inline def createElementFromJSON(
    model: IAbstractModel,
    json: IAbstractElementJson,
    idToStructureMap: IMap[
      typingsJapgolly.mendixmodelsdk.srcSdkInternalStructuresMod.Structure[IAbstractModel, IContainer | Null]
    ]
  ): typingsJapgolly.mendixmodelsdk.srcSdkInternalElementsMod.Element[IAbstractModel] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElementFromJSON")(model.asInstanceOf[js.Any], json.asInstanceOf[js.Any], idToStructureMap.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcSdkInternalElementsMod.Element[IAbstractModel]]
  
  inline def createInVersionCheck(model: IAbstractModel, structureTypeName: String, versionRange: IVersionRange): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createInVersionCheck")(model.asInstanceOf[js.Any], structureTypeName.asInstanceOf[js.Any], versionRange.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def createModelUnitFromJSON(containerUnit: IStructuralUnit, containmentName: String, contents: IAbstractElementJson): typingsJapgolly.mendixmodelsdk.srcSdkInternalUnitsMod.ModelUnit[IAbstractModel] = (^.asInstanceOf[js.Dynamic].applyDynamic("createModelUnitFromJSON")(containerUnit.asInstanceOf[js.Any], containmentName.asInstanceOf[js.Any], contents.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcSdkInternalUnitsMod.ModelUnit[IAbstractModel]]
  
  object instancehelpers {
    
    @JSImport("mendixmodelsdk/src/sdk/internal", "instancehelpers")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Given some a (normalized) JSON representation of a unit,
      * creates an instance of the corresponding `unit.AbstractUnit` sub class (structural/model)
      * and populates that from the JSON.
      * Should only be called if this unit was not already in memory.
      */
    inline def abstractUnitJsonToInstance(
      model: typingsJapgolly.mendixmodelsdk.srcSdkInternalAbstractModelMod.AbstractModel,
      json: IAbstractUnitJson,
      isPartial: Boolean
    ): typingsJapgolly.mendixmodelsdk.srcSdkInternalUnitsMod.AbstractUnit[IAbstractModel] | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("abstractUnitJsonToInstance")(model.asInstanceOf[js.Any], json.asInstanceOf[js.Any], isPartial.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcSdkInternalUnitsMod.AbstractUnit[IAbstractModel] | Null]
    
    /**
      * Creates a new element for a SDK user.
      */
    inline def createElement[T /* <: typingsJapgolly.mendixmodelsdk.srcSdkInternalElementsMod.Element[IAbstractModel] */](owner: IAbstractModel, constructor: IStructureConstructor[T]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(owner.asInstanceOf[js.Any], constructor.asInstanceOf[js.Any])).asInstanceOf[T]
    inline def createElement[T /* <: typingsJapgolly.mendixmodelsdk.srcSdkInternalElementsMod.Element[IAbstractModel] */](owner: IAbstractModel, constructor: IStructureConstructor[T], parentPropName: String): T = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(owner.asInstanceOf[js.Any], constructor.asInstanceOf[js.Any], parentPropName.asInstanceOf[js.Any])).asInstanceOf[T]
    inline def createElement[T /* <: typingsJapgolly.mendixmodelsdk.srcSdkInternalElementsMod.Element[IAbstractModel] */](
      owner: IAbstractModel,
      constructor: IStructureConstructor[T],
      parentPropName: String,
      parentPropIsList: Boolean
    ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(owner.asInstanceOf[js.Any], constructor.asInstanceOf[js.Any], parentPropName.asInstanceOf[js.Any], parentPropIsList.asInstanceOf[js.Any])).asInstanceOf[T]
    inline def createElement[T /* <: typingsJapgolly.mendixmodelsdk.srcSdkInternalElementsMod.Element[IAbstractModel] */](
      owner: IAbstractModel,
      constructor: IStructureConstructor[T],
      parentPropName: Unit,
      parentPropIsList: Boolean
    ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(owner.asInstanceOf[js.Any], constructor.asInstanceOf[js.Any], parentPropName.asInstanceOf[js.Any], parentPropIsList.asInstanceOf[js.Any])).asInstanceOf[T]
    inline def createElement[T /* <: typingsJapgolly.mendixmodelsdk.srcSdkInternalElementsMod.Element[IAbstractModel] */](
      owner: typingsJapgolly.mendixmodelsdk.srcSdkInternalElementsMod.AbstractElement[IAbstractModel, Container],
      constructor: IStructureConstructor[T]
    ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(owner.asInstanceOf[js.Any], constructor.asInstanceOf[js.Any])).asInstanceOf[T]
    inline def createElement[T /* <: typingsJapgolly.mendixmodelsdk.srcSdkInternalElementsMod.Element[IAbstractModel] */](
      owner: typingsJapgolly.mendixmodelsdk.srcSdkInternalElementsMod.AbstractElement[IAbstractModel, Container],
      constructor: IStructureConstructor[T],
      parentPropName: String
    ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(owner.asInstanceOf[js.Any], constructor.asInstanceOf[js.Any], parentPropName.asInstanceOf[js.Any])).asInstanceOf[T]
    inline def createElement[T /* <: typingsJapgolly.mendixmodelsdk.srcSdkInternalElementsMod.Element[IAbstractModel] */](
      owner: typingsJapgolly.mendixmodelsdk.srcSdkInternalElementsMod.AbstractElement[IAbstractModel, Container],
      constructor: IStructureConstructor[T],
      parentPropName: String,
      parentPropIsList: Boolean
    ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(owner.asInstanceOf[js.Any], constructor.asInstanceOf[js.Any], parentPropName.asInstanceOf[js.Any], parentPropIsList.asInstanceOf[js.Any])).asInstanceOf[T]
    inline def createElement[T /* <: typingsJapgolly.mendixmodelsdk.srcSdkInternalElementsMod.Element[IAbstractModel] */](
      owner: typingsJapgolly.mendixmodelsdk.srcSdkInternalElementsMod.AbstractElement[IAbstractModel, Container],
      constructor: IStructureConstructor[T],
      parentPropName: Unit,
      parentPropIsList: Boolean
    ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(owner.asInstanceOf[js.Any], constructor.asInstanceOf[js.Any], parentPropName.asInstanceOf[js.Any], parentPropIsList.asInstanceOf[js.Any])).asInstanceOf[T]
    
    inline def createNewElementInstanceFromJSON(
      model: typingsJapgolly.mendixmodelsdk.srcSdkInternalAbstractModelMod.AbstractModel,
      json: IAbstractElementJson
    ): typingsJapgolly.mendixmodelsdk.srcSdkInternalElementsMod.Element[IAbstractModel] = (^.asInstanceOf[js.Dynamic].applyDynamic("createNewElementInstanceFromJSON")(model.asInstanceOf[js.Any], json.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcSdkInternalElementsMod.Element[IAbstractModel]]
    
    /**
      * Creates a new unit for a SDK user.
      */
    inline def createUnit(container: IStructuralUnit, constructor: IAbstractUnitConstructor): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createUnit")(container.asInstanceOf[js.Any], constructor.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def createUnitFromJSON(
      model: typingsJapgolly.mendixmodelsdk.srcSdkInternalAbstractModelMod.AbstractModel,
      json: IAbstractUnitJson
    ): IAbstractUnit = (^.asInstanceOf[js.Dynamic].applyDynamic("createUnitFromJSON")(model.asInstanceOf[js.Any], json.asInstanceOf[js.Any])).asInstanceOf[IAbstractUnit]
    inline def createUnitFromJSON(
      model: typingsJapgolly.mendixmodelsdk.srcSdkInternalAbstractModelMod.AbstractModel,
      json: IAbstractUnitJson,
      resolveByIdReferences: Boolean
    ): IAbstractUnit = (^.asInstanceOf[js.Dynamic].applyDynamic("createUnitFromJSON")(model.asInstanceOf[js.Any], json.asInstanceOf[js.Any], resolveByIdReferences.asInstanceOf[js.Any])).asInstanceOf[IAbstractUnit]
    
    /**
      * Type -> class (the constructor function, technically) lookup, e.g. "DomainModels$Entity" -> DomainModels.Entity
      */
    inline def lookupClass(qualifiedTypeName: String, classes: Any): InstanceConstructor = (^.asInstanceOf[js.Dynamic].applyDynamic("lookupClass")(qualifiedTypeName.asInstanceOf[js.Any], classes.asInstanceOf[js.Any])).asInstanceOf[InstanceConstructor]
    
    inline def modelElementJsonToInstance(
      model: typingsJapgolly.mendixmodelsdk.srcSdkInternalAbstractModelMod.AbstractModel,
      unit: typingsJapgolly.mendixmodelsdk.srcSdkInternalUnitsMod.ModelUnit[IAbstractModel],
      container: typingsJapgolly.mendixmodelsdk.srcSdkInternalElementsMod.AbstractElement[IAbstractModel, Container],
      json: Null,
      isPartial: Boolean
    ): typingsJapgolly.mendixmodelsdk.srcSdkInternalElementsMod.Element[IAbstractModel] | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("modelElementJsonToInstance")(model.asInstanceOf[js.Any], unit.asInstanceOf[js.Any], container.asInstanceOf[js.Any], json.asInstanceOf[js.Any], isPartial.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcSdkInternalElementsMod.Element[IAbstractModel] | Null]
    /**
      * Given some a (normalized) JSON representation of a model element,
      * creates an instance of the corresponding `elements.Element`
      * and populates that from the JSON.
      * Will update existing elements if this element was created before.
      */
    inline def modelElementJsonToInstance(
      model: typingsJapgolly.mendixmodelsdk.srcSdkInternalAbstractModelMod.AbstractModel,
      unit: typingsJapgolly.mendixmodelsdk.srcSdkInternalUnitsMod.ModelUnit[IAbstractModel],
      container: typingsJapgolly.mendixmodelsdk.srcSdkInternalElementsMod.AbstractElement[IAbstractModel, Container],
      json: IAbstractElementJson,
      isPartial: Boolean
    ): typingsJapgolly.mendixmodelsdk.srcSdkInternalElementsMod.Element[IAbstractModel] | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("modelElementJsonToInstance")(model.asInstanceOf[js.Any], unit.asInstanceOf[js.Any], container.asInstanceOf[js.Any], json.asInstanceOf[js.Any], isPartial.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcSdkInternalElementsMod.Element[IAbstractModel] | Null]
    
    inline def structureAffectsQualifiedNames(structure: IStructure): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("structureAffectsQualifiedNames")(structure.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def structureIsByNameReferrable(structure: IStructure): /* is mendixmodelsdk.mendixmodelsdk/src/sdk/internal/elements.AbstractElement<mendixmodelsdk.mendixmodelsdk/src/sdk/internal/AbstractModel.IAbstractModel, mendixmodelsdk.mendixmodelsdk/src/sdk/internal/structures.aliases.Container> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("structureIsByNameReferrable")(structure.asInstanceOf[js.Any]).asInstanceOf[/* is mendixmodelsdk.mendixmodelsdk/src/sdk/internal/elements.AbstractElement<mendixmodelsdk.mendixmodelsdk/src/sdk/internal/AbstractModel.IAbstractModel, mendixmodelsdk.mendixmodelsdk/src/sdk/internal/structures.aliases.Container> */ Boolean]
  }
  
  inline def instantiateChildElement(
    parent: typingsJapgolly.mendixmodelsdk.srcSdkInternalElementsMod.AbstractElement[IAbstractModel, Container]
  ): typingsJapgolly.mendixmodelsdk.srcSdkInternalElementsMod.Element[IAbstractModel] | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("instantiateChildElement")(parent.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcSdkInternalElementsMod.Element[IAbstractModel] | Null]
  inline def instantiateChildElement(
    parent: typingsJapgolly.mendixmodelsdk.srcSdkInternalElementsMod.AbstractElement[IAbstractModel, Container],
    value: IAbstractElementJson
  ): typingsJapgolly.mendixmodelsdk.srcSdkInternalElementsMod.Element[IAbstractModel] | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("instantiateChildElement")(parent.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcSdkInternalElementsMod.Element[IAbstractModel] | Null]
  
  inline def isAtLeast(versionString: String, model: IAbstractModel): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isAtLeast")(versionString.asInstanceOf[js.Any], model.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isNamedElement(element: IStructure): /* is mendixmodelsdk.mendixmodelsdk/src/sdk/internal/properties/LocalByNameReferenceProperty.INamedElement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNamedElement")(element.asInstanceOf[js.Any]).asInstanceOf[/* is mendixmodelsdk.mendixmodelsdk/src/sdk/internal/properties/LocalByNameReferenceProperty.INamedElement */ Boolean]
  
  inline def parseAsNormalizedVersion(versionString: String): typingsJapgolly.mendixmodelsdk.srcSdkInternalVersionChecksMod.Version = ^.asInstanceOf[js.Dynamic].applyDynamic("parseAsNormalizedVersion")(versionString.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcSdkInternalVersionChecksMod.Version]
  
  inline def sendListChangeDeltas[T, P](
    property: (typingsJapgolly.mendixmodelsdk.srcSdkInternalPropertiesAbstractPropertyMod.AbstractProperty[js.Array[T], IList[P]]) & ToRawChangeValue[P],
    change: IArrayWillChange[P]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sendListChangeDeltas")(property.asInstanceOf[js.Any], change.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def sendListChangeDeltas[T, P](
    property: (typingsJapgolly.mendixmodelsdk.srcSdkInternalPropertiesAbstractPropertyMod.AbstractProperty[js.Array[T], IList[P]]) & ToRawChangeValue[P],
    change: IArrayWillSplice[P]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sendListChangeDeltas")(property.asInstanceOf[js.Any], change.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
