package typingsJapgolly.mendixmodelsdk.srcGenAllModelClassesMod

import typingsJapgolly.mendixmodelsdk.srcGenBaseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.srcGenMappingsMod.mappings.MappingDocument
import typingsJapgolly.mendixmodelsdk.srcGenMappingsMod.mappings.ObjectMappingElement
import typingsJapgolly.mendixmodelsdk.srcGenProjectsMod.projects.IFolderBase
import typingsJapgolly.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractElement
import typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractModel
import typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.ModelUnit
import typingsJapgolly.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object importmappings {
  
  /**
    * See: {@link https://docs.mendix.com/refguide/import-mappings relevant section in reference guide}
    */
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "importmappings.ImportMapping")
  @js.native
  open class ImportMapping protected ()
    extends typingsJapgolly.mendixmodelsdk.srcGenImportmappingsMod.importmappings.ImportMapping {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IFolderBase
    ) = this()
  }
  object ImportMapping {
    
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "importmappings.ImportMapping")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new ImportMapping unit in the SDK and on the server.
      * Expects one argument, the projects.IFolderBase in which this unit is contained.
      */
    /* static member */
    inline def createIn(container: IFolderBase): typingsJapgolly.mendixmodelsdk.srcGenImportmappingsMod.importmappings.ImportMapping = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenImportmappingsMod.importmappings.ImportMapping]
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "importmappings.ImportMapping.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "importmappings.ImportMapping.versionInfo")
    @js.native
    def versionInfo: typingsJapgolly.mendixmodelsdk.srcGenImportmappingsMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typingsJapgolly.mendixmodelsdk.srcGenImportmappingsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide/import-mappings relevant section in reference guide}
    */
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "importmappings.ImportObjectMappingElement")
  @js.native
  open class ImportObjectMappingElement protected ()
    extends typingsJapgolly.mendixmodelsdk.srcGenImportmappingsMod.importmappings.ImportObjectMappingElement {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit[IAbstractModel],
      container: AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object ImportObjectMappingElement {
    
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "importmappings.ImportObjectMappingElement")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new ImportObjectMappingElement instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    inline def create(model: IModel): typingsJapgolly.mendixmodelsdk.srcGenImportmappingsMod.importmappings.ImportObjectMappingElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenImportmappingsMod.importmappings.ImportObjectMappingElement]
    
    /**
      * Creates and returns a new ImportObjectMappingElement instance in the SDK and on the server.
      * The new ImportObjectMappingElement will be automatically stored in the 'rootMappingElements' property
      * of the parent mappings.MappingDocument element passed as argument.
      */
    /* static member */
    inline def createInMappingDocumentUnderRootMappingElements(container: MappingDocument): typingsJapgolly.mendixmodelsdk.srcGenImportmappingsMod.importmappings.ImportObjectMappingElement = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMappingDocumentUnderRootMappingElements")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenImportmappingsMod.importmappings.ImportObjectMappingElement]
    
    /**
      * Creates and returns a new ImportObjectMappingElement instance in the SDK and on the server.
      * The new ImportObjectMappingElement will be automatically stored in the 'children' property
      * of the parent mappings.ObjectMappingElement element passed as argument.
      */
    /* static member */
    inline def createInObjectMappingElementUnderChildren(container: ObjectMappingElement): typingsJapgolly.mendixmodelsdk.srcGenImportmappingsMod.importmappings.ImportObjectMappingElement = ^.asInstanceOf[js.Dynamic].applyDynamic("createInObjectMappingElementUnderChildren")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenImportmappingsMod.importmappings.ImportObjectMappingElement]
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "importmappings.ImportObjectMappingElement.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "importmappings.ImportObjectMappingElement.versionInfo")
    @js.native
    def versionInfo: typingsJapgolly.mendixmodelsdk.srcGenImportmappingsMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typingsJapgolly.mendixmodelsdk.srcGenImportmappingsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide/import-mappings relevant section in reference guide}
    */
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "importmappings.ImportValueMappingElement")
  @js.native
  open class ImportValueMappingElement protected ()
    extends typingsJapgolly.mendixmodelsdk.srcGenImportmappingsMod.importmappings.ImportValueMappingElement {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit[IAbstractModel],
      container: AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object ImportValueMappingElement {
    
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "importmappings.ImportValueMappingElement")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new ImportValueMappingElement instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    inline def create(model: IModel): typingsJapgolly.mendixmodelsdk.srcGenImportmappingsMod.importmappings.ImportValueMappingElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenImportmappingsMod.importmappings.ImportValueMappingElement]
    
    /**
      * Creates and returns a new ImportValueMappingElement instance in the SDK and on the server.
      * The new ImportValueMappingElement will be automatically stored in the 'children' property
      * of the parent mappings.ObjectMappingElement element passed as argument.
      */
    /* static member */
    inline def createIn(container: ObjectMappingElement): typingsJapgolly.mendixmodelsdk.srcGenImportmappingsMod.importmappings.ImportValueMappingElement = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenImportmappingsMod.importmappings.ImportValueMappingElement]
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "importmappings.ImportValueMappingElement.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "importmappings.ImportValueMappingElement.versionInfo")
    @js.native
    def versionInfo: typingsJapgolly.mendixmodelsdk.srcGenImportmappingsMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typingsJapgolly.mendixmodelsdk.srcGenImportmappingsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
}
