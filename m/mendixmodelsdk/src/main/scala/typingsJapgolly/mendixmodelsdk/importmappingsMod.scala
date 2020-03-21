package typingsJapgolly.mendixmodelsdk

import typingsJapgolly.mendixmodelsdk.baseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.datatypesMod.datatypes.DataType
import typingsJapgolly.mendixmodelsdk.domainmodelsMod.domainmodels.IEntity
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractElement
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractModel
import typingsJapgolly.mendixmodelsdk.internalMod.ModelUnit
import typingsJapgolly.mendixmodelsdk.mappingsMod.mappings.IMappingDocument
import typingsJapgolly.mendixmodelsdk.mappingsMod.mappings.MappingDocument
import typingsJapgolly.mendixmodelsdk.mappingsMod.mappings.ObjectMappingElement
import typingsJapgolly.mendixmodelsdk.mappingsMod.mappings.ValueMappingElement
import typingsJapgolly.mendixmodelsdk.projectsMod.projects.FolderBase
import typingsJapgolly.mendixmodelsdk.projectsMod.projects.IFolderBase
import typingsJapgolly.mendixmodelsdk.versionChecksMod.IStructureVersionInfo
import typingsJapgolly.mendixmodelsdk.versionChecksMod.StructureType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/importmappings", JSImport.Namespace)
@js.native
object importmappingsMod extends js.Object {
  @js.native
  class StructureVersionInfo protected ()
    extends typingsJapgolly.mendixmodelsdk.internalMod.StructureVersionInfo {
    def this(info: IStructureVersionInfo, structureType: StructureType) = this()
  }
  
  @js.native
  object importmappings extends js.Object {
    /**
      * Interfaces and instance classes for types from the Mendix sub meta model `ImportMappings`.
      */
    /**
      * See: {@link https://docs.mendix.com/refguide7/import-mappings relevant section in reference guide}
      */
    @js.native
    trait IImportMapping extends IMappingDocument
    
    /**
      * See: {@link https://docs.mendix.com/refguide7/import-mappings relevant section in reference guide}
      */
    /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
    - typingsJapgolly.mendixmodelsdk.structuresMod.IStructure because Already inherited
    - typingsJapgolly.mendixmodelsdk.elementsMod.IAbstractElement because Already inherited
    - typingsJapgolly.mendixmodelsdk.unitsMod.IAbstractUnit because Already inherited
    - typingsJapgolly.mendixmodelsdk.unitsMod.IModelUnit because Already inherited
    - typingsJapgolly.mendixmodelsdk.elementsMod.IByNameReferrable because Already inherited
    - typingsJapgolly.mendixmodelsdk.projectsMod.projects.IModuleDocument because Already inherited
    - typingsJapgolly.mendixmodelsdk.projectsMod.projects.IDocument because Already inherited
    - typingsJapgolly.mendixmodelsdk.mappingsMod.mappings.IMappingDocument because Already inherited
    - typingsJapgolly.mendixmodelsdk.importmappingsMod.importmappings.IImportMapping because var conflicts: containerAsFolderBase, id, isLoaded, model, structureTypeName, unit. Inlined  */ @js.native
    class ImportMapping protected () extends MappingDocument {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        container: IFolderBase
      ) = this()
      @JSName("model")
      var model_FImportMapping: IModel = js.native
      @JSName("containerAsFolderBase")
      def containerAsFolderBase_MImportMapping(): FolderBase = js.native
      def parameter(): js.Any = js.native
      def parameter(newValue: IEntity): js.Any = js.native
      def parameterQualifiedName(): String | Null = js.native
      /**
        * In version 7.16.0: introduced
        */
      def parameterType(): DataType = js.native
      def parameterType(newValue: DataType): js.Any = js.native
      /**
        * In version 7.16.0: deleted
        */
      @JSName("parameter")
      def parameter_Union(): IEntity | Null = js.native
      def useSubtransactionsForMicroflows(): Boolean = js.native
      def useSubtransactionsForMicroflows(newValue: Boolean): js.Any = js.native
    }
    
    /**
      * See: {@link https://docs.mendix.com/refguide7/import-mappings relevant section in reference guide}
      */
    @js.native
    class ImportObjectMappingElement protected () extends ObjectMappingElement {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        unit: ModelUnit,
        container: AbstractElement
      ) = this()
      @JSName("model")
      var model_FImportObjectMappingElement: IModel = js.native
    }
    
    /**
      * See: {@link https://docs.mendix.com/refguide7/import-mappings relevant section in reference guide}
      */
    @js.native
    class ImportValueMappingElement protected () extends ValueMappingElement {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        unit: ModelUnit,
        container: AbstractElement
      ) = this()
      @JSName("model")
      var model_FImportValueMappingElement: IModel = js.native
    }
    
    /* static members */
    @js.native
    object ImportMapping extends js.Object {
      var structureTypeName: String = js.native
      var versionInfo: StructureVersionInfo = js.native
      /**
        * Creates a new ImportMapping unit in the SDK and on the server.
        * Expects one argument, the projects.IFolderBase in which this unit is contained.
        */
      def createIn(container: IFolderBase): ImportMapping = js.native
    }
    
    /* static members */
    @js.native
    object ImportObjectMappingElement extends js.Object {
      var structureTypeName: String = js.native
      var versionInfo: StructureVersionInfo = js.native
      /**
        * Creates and returns a new ImportObjectMappingElement instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      def create(model: IModel): ImportObjectMappingElement = js.native
      /**
        * Creates and returns a new ImportObjectMappingElement instance in the SDK and on the server.
        * The new ImportObjectMappingElement will be automatically stored in the 'rootMappingElements' property
        * of the parent mappings.MappingDocument element passed as argument.
        */
      def createInMappingDocumentUnderRootMappingElements(container: MappingDocument): ImportObjectMappingElement = js.native
      /**
        * Creates and returns a new ImportObjectMappingElement instance in the SDK and on the server.
        * The new ImportObjectMappingElement will be automatically stored in the 'children' property
        * of the parent mappings.ObjectMappingElement element passed as argument.
        */
      def createInObjectMappingElementUnderChildren(container: ObjectMappingElement): ImportObjectMappingElement = js.native
    }
    
    /* static members */
    @js.native
    object ImportValueMappingElement extends js.Object {
      var structureTypeName: String = js.native
      var versionInfo: StructureVersionInfo = js.native
      /**
        * Creates and returns a new ImportValueMappingElement instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      def create(model: IModel): ImportValueMappingElement = js.native
      /**
        * Creates and returns a new ImportValueMappingElement instance in the SDK and on the server.
        * The new ImportValueMappingElement will be automatically stored in the 'children' property
        * of the parent mappings.ObjectMappingElement element passed as argument.
        */
      def createIn(container: ObjectMappingElement): ImportValueMappingElement = js.native
    }
    
  }
  
}

