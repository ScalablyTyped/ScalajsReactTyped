package typingsJapgolly.mendixmodelsdk

import typingsJapgolly.mendixmodelsdk.srcGenBaseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.AttributeType
import typingsJapgolly.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.IEntity
import typingsJapgolly.mendixmodelsdk.srcGenProjectsMod.projects.Document
import typingsJapgolly.mendixmodelsdk.srcGenProjectsMod.projects.FolderBase
import typingsJapgolly.mendixmodelsdk.srcGenProjectsMod.projects.IDocument
import typingsJapgolly.mendixmodelsdk.srcGenProjectsMod.projects.IFolderBase
import typingsJapgolly.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typingsJapgolly.mendixmodelsdk.srcSdkInternalInstancesMod.IList
import typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractElement
import typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractEnum
import typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractModel
import typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.Element
import typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.ModelUnit
import typingsJapgolly.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
import typingsJapgolly.mendixmodelsdk.srcSdkInternalVersionChecksMod.ILifeCycle
import typingsJapgolly.mendixmodelsdk.srcSdkInternalVersionChecksMod.IStructureVersionInfo
import typingsJapgolly.mendixmodelsdk.srcSdkInternalVersionChecksMod.StructureType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcGenMlmappingsMod {
  
  @JSImport("mendixmodelsdk/src/gen/mlmappings", "StructureVersionInfo")
  @js.native
  open class StructureVersionInfo protected ()
    extends typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.StructureVersionInfo {
    def this(info: IStructureVersionInfo, structureType: StructureType) = this()
  }
  
  object mlmappings {
    
    /**
      * See: {@link https://docs.mendix.com/refguide/ml-mapping-documents relevant section in reference guide}
      *
      * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
      *
      * @ignore
      *
      * In version 9.17.0: introduced
      */
    /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
    - typingsJapgolly.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.IContainer because Already inherited
    - typingsJapgolly.mendixmodelsdk.srcSdkInternalStructuresMod.IStructure because Already inherited
    - typingsJapgolly.mendixmodelsdk.srcSdkInternalElementsMod.IAbstractElement because Already inherited
    - typingsJapgolly.mendixmodelsdk.srcSdkInternalUnitsMod.IAbstractUnit because Already inherited
    - typingsJapgolly.mendixmodelsdk.srcSdkInternalUnitsMod.IModelUnit because Already inherited
    - typingsJapgolly.mendixmodelsdk.srcSdkInternalElementsMod.IByNameReferrable because Already inherited
    - typingsJapgolly.mendixmodelsdk.srcGenProjectsMod.projects.IModuleDocument because Already inherited
    - typingsJapgolly.mendixmodelsdk.srcGenProjectsMod.projects.IDocument because Already inherited
    - typingsJapgolly.mendixmodelsdk.srcGenMlmappingsMod.mlmappings.IMLMappingDocument because var conflicts: containerAsFolderBase, documentation, excluded, id, isLoaded, model, name, qualifiedName, structureTypeName, unit. Inlined  */ @JSImport("mendixmodelsdk/src/gen/mlmappings", "mlmappings.MLMappingDocument")
    @js.native
    open class MLMappingDocument protected () extends Document {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        container: IFolderBase
      ) = this()
      
      @JSName("containerAsFolderBase")
      def containerAsFolderBase_MMLMappingDocument: FolderBase = js.native
      
      def mlModelFileName: String = js.native
      def mlModelFileName_=(newValue: String): Unit = js.native
      
      /**
        * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
        *
        * @ignore
        */
      def mlModelMappings: MLModelMappings | Null = js.native
      def mlModelMappings_=(newValue: MLModelMappings | Null): Unit = js.native
    }
    object MLMappingDocument {
      
      @JSImport("mendixmodelsdk/src/gen/mlmappings", "mlmappings.MLMappingDocument")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates a new MLMappingDocument unit in the SDK and on the server.
        * Expects one argument, the projects.IFolderBase in which this unit is contained.
        */
      /* static member */
      inline def createIn(container: IFolderBase): MLMappingDocument = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[MLMappingDocument]
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/mlmappings", "mlmappings.MLMappingDocument.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/mlmappings", "mlmappings.MLMappingDocument.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    /**
      * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
      *
      * @ignore
      *
      * In version 9.17.0: introduced
      */
    @JSImport("mendixmodelsdk/src/gen/mlmappings", "mlmappings.MLModelEntityMappings")
    @js.native
    open class MLModelEntityMappings protected () extends Element[IModel] {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        unit: ModelUnit[IAbstractModel],
        container: AbstractElement[IAbstractModel, Container]
      ) = this()
      
      def containerAsMLModelMappings: MLModelMappings = js.native
      
      def entity: IEntity | Null = js.native
      
      def entityQualifiedName: String | Null = js.native
      
      def entity_=(newValue: IEntity | Null): Unit = js.native
      
      /**
        * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
        *
        * @ignore
        */
      def mappings: IList[TensorMappingElement] = js.native
    }
    object MLModelEntityMappings {
      
      @JSImport("mendixmodelsdk/src/gen/mlmappings", "mlmappings.MLModelEntityMappings")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates and returns a new MLModelEntityMappings instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      /* static member */
      inline def create(model: IModel): MLModelEntityMappings = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[MLModelEntityMappings]
      
      /**
        * Creates and returns a new MLModelEntityMappings instance in the SDK and on the server.
        * The new MLModelEntityMappings will be automatically stored in the 'input' property
        * of the parent MLModelMappings element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  9.17.0 and higher
        */
      /* static member */
      inline def createInMLModelMappingsUnderInput(container: MLModelMappings): MLModelEntityMappings = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMLModelMappingsUnderInput")(container.asInstanceOf[js.Any]).asInstanceOf[MLModelEntityMappings]
      
      /**
        * Creates and returns a new MLModelEntityMappings instance in the SDK and on the server.
        * The new MLModelEntityMappings will be automatically stored in the 'output' property
        * of the parent MLModelMappings element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  9.17.0 and higher
        */
      /* static member */
      inline def createInMLModelMappingsUnderOutput(container: MLModelMappings): MLModelEntityMappings = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMLModelMappingsUnderOutput")(container.asInstanceOf[js.Any]).asInstanceOf[MLModelEntityMappings]
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/mlmappings", "mlmappings.MLModelEntityMappings.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/mlmappings", "mlmappings.MLModelEntityMappings.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    /**
      * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
      *
      * @ignore
      *
      * In version 9.17.0: introduced
      */
    @JSImport("mendixmodelsdk/src/gen/mlmappings", "mlmappings.MLModelMappings")
    @js.native
    open class MLModelMappings protected () extends Element[IModel] {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        unit: ModelUnit[IAbstractModel],
        container: AbstractElement[IAbstractModel, Container]
      ) = this()
      
      def containerAsMLMappingDocument: MLMappingDocument = js.native
      
      /**
        * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
        *
        * @ignore
        */
      def input: MLModelEntityMappings | Null = js.native
      def input_=(newValue: MLModelEntityMappings | Null): Unit = js.native
      
      /**
        * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
        *
        * @ignore
        */
      def output: MLModelEntityMappings | Null = js.native
      def output_=(newValue: MLModelEntityMappings | Null): Unit = js.native
    }
    object MLModelMappings {
      
      @JSImport("mendixmodelsdk/src/gen/mlmappings", "mlmappings.MLModelMappings")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates and returns a new MLModelMappings instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      /* static member */
      inline def create(model: IModel): MLModelMappings = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[MLModelMappings]
      
      /**
        * Creates and returns a new MLModelMappings instance in the SDK and on the server.
        * The new MLModelMappings will be automatically stored in the 'mlModelMappings' property
        * of the parent MLMappingDocument element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  9.17.0 and higher
        */
      /* static member */
      inline def createIn(container: MLMappingDocument): MLModelMappings = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[MLModelMappings]
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/mlmappings", "mlmappings.MLModelMappings.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/mlmappings", "mlmappings.MLModelMappings.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    /**
      * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
      *
      * @ignore
      *
      * In version 9.17.0: introduced
      */
    @JSImport("mendixmodelsdk/src/gen/mlmappings", "mlmappings.TensorDimension")
    @js.native
    open class TensorDimension protected () extends Element[IModel] {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        unit: ModelUnit[IAbstractModel],
        container: AbstractElement[IAbstractModel, Container]
      ) = this()
      
      def containerAsTensorMappingElement: TensorMappingElement = js.native
      
      def dimension: Double = js.native
      def dimension_=(newValue: Double): Unit = js.native
    }
    object TensorDimension {
      
      @JSImport("mendixmodelsdk/src/gen/mlmappings", "mlmappings.TensorDimension")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates and returns a new TensorDimension instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      /* static member */
      inline def create(model: IModel): TensorDimension = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[TensorDimension]
      
      /**
        * Creates and returns a new TensorDimension instance in the SDK and on the server.
        * The new TensorDimension will be automatically stored in the 'attributeShape' property
        * of the parent TensorMappingElement element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  9.17.0 and higher
        */
      /* static member */
      inline def createInTensorMappingElementUnderAttributeShape(container: TensorMappingElement): TensorDimension = ^.asInstanceOf[js.Dynamic].applyDynamic("createInTensorMappingElementUnderAttributeShape")(container.asInstanceOf[js.Any]).asInstanceOf[TensorDimension]
      
      /**
        * Creates and returns a new TensorDimension instance in the SDK and on the server.
        * The new TensorDimension will be automatically stored in the 'tensorShape' property
        * of the parent TensorMappingElement element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  9.17.0 and higher
        */
      /* static member */
      inline def createInTensorMappingElementUnderTensorShape(container: TensorMappingElement): TensorDimension = ^.asInstanceOf[js.Dynamic].applyDynamic("createInTensorMappingElementUnderTensorShape")(container.asInstanceOf[js.Any]).asInstanceOf[TensorDimension]
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/mlmappings", "mlmappings.TensorDimension.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/mlmappings", "mlmappings.TensorDimension.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    /**
      * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
      *
      * @ignore
      *
      * In version 9.17.0: introduced
      */
    @JSImport("mendixmodelsdk/src/gen/mlmappings", "mlmappings.TensorMappingElement")
    @js.native
    open class TensorMappingElement protected () extends Element[IModel] {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        unit: ModelUnit[IAbstractModel],
        container: AbstractElement[IAbstractModel, Container]
      ) = this()
      
      def attributeName: String = js.native
      def attributeName_=(newValue: String): Unit = js.native
      
      /**
        * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
        *
        * @ignore
        */
      def attributeShape: IList[TensorDimension] = js.native
      
      def attributeType: AttributeType | Null = js.native
      def attributeType_=(newValue: AttributeType | Null): Unit = js.native
      
      def containerAsMLModelEntityMappings: MLModelEntityMappings = js.native
      
      def tensorName: String = js.native
      def tensorName_=(newValue: String): Unit = js.native
      
      /**
        * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
        *
        * @ignore
        */
      def tensorShape: IList[TensorDimension] = js.native
      
      def tensorType: TensorType = js.native
      def tensorType_=(newValue: TensorType): Unit = js.native
    }
    object TensorMappingElement {
      
      @JSImport("mendixmodelsdk/src/gen/mlmappings", "mlmappings.TensorMappingElement")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates and returns a new TensorMappingElement instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      /* static member */
      inline def create(model: IModel): TensorMappingElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[TensorMappingElement]
      
      /**
        * Creates and returns a new TensorMappingElement instance in the SDK and on the server.
        * The new TensorMappingElement will be automatically stored in the 'mappings' property
        * of the parent MLModelEntityMappings element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  9.17.0 and higher
        */
      /* static member */
      inline def createIn(container: MLModelEntityMappings): TensorMappingElement = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[TensorMappingElement]
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/mlmappings", "mlmappings.TensorMappingElement.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/mlmappings", "mlmappings.TensorMappingElement.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    @JSImport("mendixmodelsdk/src/gen/mlmappings", "mlmappings.TensorType")
    @js.native
    open class TensorType protected () extends AbstractEnum {
      def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
    }
    object TensorType {
      
      @JSImport("mendixmodelsdk/src/gen/mlmappings", "mlmappings.TensorType")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/mlmappings", "mlmappings.TensorType.BooleanTensor")
      @js.native
      def BooleanTensor: TensorType = js.native
      inline def BooleanTensor_=(x: TensorType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BooleanTensor")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/mlmappings", "mlmappings.TensorType.Complex128Tensor")
      @js.native
      def Complex128Tensor: TensorType = js.native
      inline def Complex128Tensor_=(x: TensorType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Complex128Tensor")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/mlmappings", "mlmappings.TensorType.Complex64Tensor")
      @js.native
      def Complex64Tensor: TensorType = js.native
      inline def Complex64Tensor_=(x: TensorType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Complex64Tensor")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/mlmappings", "mlmappings.TensorType.Float16Tensor")
      @js.native
      def Float16Tensor: TensorType = js.native
      inline def Float16Tensor_=(x: TensorType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Float16Tensor")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/mlmappings", "mlmappings.TensorType.Float32Tensor")
      @js.native
      def Float32Tensor: TensorType = js.native
      inline def Float32Tensor_=(x: TensorType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Float32Tensor")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/mlmappings", "mlmappings.TensorType.Float64Tensor")
      @js.native
      def Float64Tensor: TensorType = js.native
      inline def Float64Tensor_=(x: TensorType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Float64Tensor")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/mlmappings", "mlmappings.TensorType.Integer16Tensor")
      @js.native
      def Integer16Tensor: TensorType = js.native
      inline def Integer16Tensor_=(x: TensorType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Integer16Tensor")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/mlmappings", "mlmappings.TensorType.Integer32Tensor")
      @js.native
      def Integer32Tensor: TensorType = js.native
      inline def Integer32Tensor_=(x: TensorType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Integer32Tensor")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/mlmappings", "mlmappings.TensorType.Integer64Tensor")
      @js.native
      def Integer64Tensor: TensorType = js.native
      inline def Integer64Tensor_=(x: TensorType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Integer64Tensor")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/mlmappings", "mlmappings.TensorType.Integer8Tensor")
      @js.native
      def Integer8Tensor: TensorType = js.native
      inline def Integer8Tensor_=(x: TensorType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Integer8Tensor")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/mlmappings", "mlmappings.TensorType.StringTensor")
      @js.native
      def StringTensor: TensorType = js.native
      inline def StringTensor_=(x: TensorType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("StringTensor")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/mlmappings", "mlmappings.TensorType.UnknownTensor")
      @js.native
      def UnknownTensor: TensorType = js.native
      inline def UnknownTensor_=(x: TensorType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UnknownTensor")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/mlmappings", "mlmappings.TensorType.UnsignedInteger16Tensor")
      @js.native
      def UnsignedInteger16Tensor: TensorType = js.native
      inline def UnsignedInteger16Tensor_=(x: TensorType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UnsignedInteger16Tensor")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/mlmappings", "mlmappings.TensorType.UnsignedInteger8Tensor")
      @js.native
      def UnsignedInteger8Tensor: TensorType = js.native
      inline def UnsignedInteger8Tensor_=(x: TensorType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UnsignedInteger8Tensor")(x.asInstanceOf[js.Any])
    }
    
    /**
      * Interfaces and instance classes for types from the Mendix sub meta model `MLMappings`.
      */
    /**
      * See: {@link https://docs.mendix.com/refguide/ml-mapping-documents relevant section in reference guide}
      *
      * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
      *
      * @ignore
      *
      * In version 9.17.0: introduced
      */
    @js.native
    trait IMLMappingDocument
      extends StObject
         with IDocument
  }
}
