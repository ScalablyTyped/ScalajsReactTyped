package typingsJapgolly.mendixmodelsdk.srcGenAllModelClassesMod

import typingsJapgolly.mendixmodelsdk.srcGenBaseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.srcGenProjectsMod.projects.IFolderBase
import typingsJapgolly.mendixmodelsdk.srcGenProjectsMod.projects.IModule
import typingsJapgolly.mendixmodelsdk.srcGenProjectsMod.projects.IProject
import typingsJapgolly.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractElement
import typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractModel
import typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.ModelUnit
import typingsJapgolly.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
import typingsJapgolly.mendixmodelsdk.srcSdkInternalUnitsMod.IStructuralUnit
import typingsJapgolly.mendixmodelsdk.srcSdkInternalVersionChecksMod.ILifeCycle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object projects {
  
  /* note: abstract class */ @JSImport("mendixmodelsdk/src/gen/all-model-classes", "projects.Document")
  @js.native
  open class Document protected ()
    extends typingsJapgolly.mendixmodelsdk.srcGenProjectsMod.projects.Document {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IFolderBase
    ) = this()
  }
  object Document {
    
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "projects.Document")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "projects.Document.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "projects.Document.versionInfo")
    @js.native
    def versionInfo: typingsJapgolly.mendixmodelsdk.srcGenProjectsMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typingsJapgolly.mendixmodelsdk.srcGenProjectsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "projects.ExportLevel")
  @js.native
  open class ExportLevel protected ()
    extends typingsJapgolly.mendixmodelsdk.srcGenProjectsMod.projects.ExportLevel {
    def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
  }
  object ExportLevel {
    
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "projects.ExportLevel")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "projects.ExportLevel.API")
    @js.native
    def API: typingsJapgolly.mendixmodelsdk.srcGenProjectsMod.projects.ExportLevel = js.native
    inline def API_=(x: typingsJapgolly.mendixmodelsdk.srcGenProjectsMod.projects.ExportLevel): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("API")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "projects.ExportLevel.Hidden")
    @js.native
    def Hidden: typingsJapgolly.mendixmodelsdk.srcGenProjectsMod.projects.ExportLevel = js.native
    inline def Hidden_=(x: typingsJapgolly.mendixmodelsdk.srcGenProjectsMod.projects.ExportLevel): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Hidden")(x.asInstanceOf[js.Any])
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide/resources relevant section in reference guide}
    */
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "projects.Folder")
  @js.native
  open class Folder protected ()
    extends typingsJapgolly.mendixmodelsdk.srcGenProjectsMod.projects.Folder {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IFolderBase
    ) = this()
  }
  object Folder {
    
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "projects.Folder")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new Folder unit in the SDK and on the server.
      * Expects one argument, the IFolderBase in which this unit is contained.
      */
    /* static member */
    inline def createIn(container: IFolderBase): typingsJapgolly.mendixmodelsdk.srcGenProjectsMod.projects.Folder = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenProjectsMod.projects.Folder]
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "projects.Folder.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "projects.Folder.versionInfo")
    @js.native
    def versionInfo: typingsJapgolly.mendixmodelsdk.srcGenProjectsMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typingsJapgolly.mendixmodelsdk.srcGenProjectsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /* note: abstract class */ @JSImport("mendixmodelsdk/src/gen/all-model-classes", "projects.FolderBase")
  @js.native
  open class FolderBase protected ()
    extends typingsJapgolly.mendixmodelsdk.srcGenProjectsMod.projects.FolderBase {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IFolderBase
    ) = this()
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IProject
    ) = this()
  }
  object FolderBase {
    
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "projects.FolderBase")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "projects.FolderBase.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "projects.FolderBase.versionInfo")
    @js.native
    def versionInfo: typingsJapgolly.mendixmodelsdk.srcGenProjectsMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typingsJapgolly.mendixmodelsdk.srcGenProjectsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide/modules relevant section in reference guide}
    */
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "projects.Module")
  @js.native
  open class Module protected ()
    extends typingsJapgolly.mendixmodelsdk.srcGenProjectsMod.projects.Module {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IProject
    ) = this()
  }
  object Module {
    
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "projects.Module")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new Module unit in the SDK and on the server.
      * Expects one argument, the IProject in which this unit is contained.
      */
    /* static member */
    inline def createIn(container: IProject): typingsJapgolly.mendixmodelsdk.srcGenProjectsMod.projects.Module = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenProjectsMod.projects.Module]
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "projects.Module.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "projects.Module.versionInfo")
    @js.native
    def versionInfo: typingsJapgolly.mendixmodelsdk.srcGenProjectsMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typingsJapgolly.mendixmodelsdk.srcGenProjectsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /* note: abstract class */ @JSImport("mendixmodelsdk/src/gen/all-model-classes", "projects.ModuleDocument")
  @js.native
  open class ModuleDocument protected ()
    extends typingsJapgolly.mendixmodelsdk.srcGenProjectsMod.projects.ModuleDocument {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IFolderBase
    ) = this()
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IModule
    ) = this()
  }
  object ModuleDocument {
    
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "projects.ModuleDocument")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "projects.ModuleDocument.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "projects.ModuleDocument.versionInfo")
    @js.native
    def versionInfo: typingsJapgolly.mendixmodelsdk.srcGenProjectsMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typingsJapgolly.mendixmodelsdk.srcGenProjectsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "projects.ModuleExportLevel")
  @js.native
  open class ModuleExportLevel protected ()
    extends typingsJapgolly.mendixmodelsdk.srcGenProjectsMod.projects.ModuleExportLevel {
    def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
  }
  object ModuleExportLevel {
    
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "projects.ModuleExportLevel")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "projects.ModuleExportLevel.Protected")
    @js.native
    def Protected: typingsJapgolly.mendixmodelsdk.srcGenProjectsMod.projects.ModuleExportLevel = js.native
    inline def Protected_=(x: typingsJapgolly.mendixmodelsdk.srcGenProjectsMod.projects.ModuleExportLevel): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Protected")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "projects.ModuleExportLevel.Source")
    @js.native
    def Source: typingsJapgolly.mendixmodelsdk.srcGenProjectsMod.projects.ModuleExportLevel = js.native
    inline def Source_=(x: typingsJapgolly.mendixmodelsdk.srcGenProjectsMod.projects.ModuleExportLevel): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Source")(x.asInstanceOf[js.Any])
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide/module-settings relevant section in reference guide}
    *
    * In version 9.8.0: introduced
    */
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "projects.ModuleSettings")
  @js.native
  open class ModuleSettings protected ()
    extends typingsJapgolly.mendixmodelsdk.srcGenProjectsMod.projects.ModuleSettings {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IModule
    ) = this()
  }
  object ModuleSettings {
    
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "projects.ModuleSettings")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new ModuleSettings unit in the SDK and on the server.
      * Expects one argument, the IModule in which this unit is contained.
      */
    /* static member */
    inline def createIn(container: IModule): typingsJapgolly.mendixmodelsdk.srcGenProjectsMod.projects.ModuleSettings = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenProjectsMod.projects.ModuleSettings]
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "projects.ModuleSettings.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "projects.ModuleSettings.versionInfo")
    @js.native
    def versionInfo: typingsJapgolly.mendixmodelsdk.srcGenProjectsMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typingsJapgolly.mendixmodelsdk.srcGenProjectsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "projects.OneTimeConversionMarker")
  @js.native
  open class OneTimeConversionMarker protected ()
    extends typingsJapgolly.mendixmodelsdk.srcGenProjectsMod.projects.OneTimeConversionMarker {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit[IAbstractModel],
      container: AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object OneTimeConversionMarker {
    
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "projects.OneTimeConversionMarker")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new OneTimeConversionMarker instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    inline def create(model: IModel): typingsJapgolly.mendixmodelsdk.srcGenProjectsMod.projects.OneTimeConversionMarker = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenProjectsMod.projects.OneTimeConversionMarker]
    
    /**
      * Creates and returns a new OneTimeConversionMarker instance in the SDK and on the server.
      * The new OneTimeConversionMarker will be automatically stored in the 'markers' property
      * of the parent ProjectConversion element passed as argument.
      */
    /* static member */
    inline def createIn(container: typingsJapgolly.mendixmodelsdk.srcGenProjectsMod.projects.ProjectConversion): typingsJapgolly.mendixmodelsdk.srcGenProjectsMod.projects.OneTimeConversionMarker = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenProjectsMod.projects.OneTimeConversionMarker]
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "projects.OneTimeConversionMarker.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "projects.OneTimeConversionMarker.versionInfo")
    @js.native
    def versionInfo: typingsJapgolly.mendixmodelsdk.srcGenProjectsMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typingsJapgolly.mendixmodelsdk.srcGenProjectsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide/project relevant section in reference guide}
    */
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "projects.Project")
  @js.native
  open class Project protected ()
    extends typingsJapgolly.mendixmodelsdk.srcGenProjectsMod.projects.Project {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IStructuralUnit
    ) = this()
  }
  object Project {
    
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "projects.Project")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "projects.Project.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "projects.Project.versionInfo")
    @js.native
    def versionInfo: typingsJapgolly.mendixmodelsdk.srcGenProjectsMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typingsJapgolly.mendixmodelsdk.srcGenProjectsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "projects.ProjectConversion")
  @js.native
  open class ProjectConversion protected ()
    extends typingsJapgolly.mendixmodelsdk.srcGenProjectsMod.projects.ProjectConversion {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IProject
    ) = this()
  }
  object ProjectConversion {
    
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "projects.ProjectConversion")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new ProjectConversion unit in the SDK and on the server.
      * Expects one argument, the IProject in which this unit is contained.
      */
    /* static member */
    inline def createIn(container: IProject): typingsJapgolly.mendixmodelsdk.srcGenProjectsMod.projects.ProjectConversion = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenProjectsMod.projects.ProjectConversion]
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "projects.ProjectConversion.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "projects.ProjectConversion.versionInfo")
    @js.native
    def versionInfo: typingsJapgolly.mendixmodelsdk.srcGenProjectsMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typingsJapgolly.mendixmodelsdk.srcGenProjectsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide/project relevant section in reference guide}
    */
  /* note: abstract class */ @JSImport("mendixmodelsdk/src/gen/all-model-classes", "projects.ProjectDocument")
  @js.native
  open class ProjectDocument protected ()
    extends typingsJapgolly.mendixmodelsdk.srcGenProjectsMod.projects.ProjectDocument {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IProject
    ) = this()
  }
  object ProjectDocument {
    
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "projects.ProjectDocument")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "projects.ProjectDocument.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "projects.ProjectDocument.versionInfo")
    @js.native
    def versionInfo: typingsJapgolly.mendixmodelsdk.srcGenProjectsMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typingsJapgolly.mendixmodelsdk.srcGenProjectsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "projects.ProtectedModuleType")
  @js.native
  open class ProtectedModuleType protected ()
    extends typingsJapgolly.mendixmodelsdk.srcGenProjectsMod.projects.ProtectedModuleType {
    def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
  }
  object ProtectedModuleType {
    
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "projects.ProtectedModuleType")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "projects.ProtectedModuleType.AddOn")
    @js.native
    def AddOn: typingsJapgolly.mendixmodelsdk.srcGenProjectsMod.projects.ProtectedModuleType = js.native
    inline def AddOn_=(x: typingsJapgolly.mendixmodelsdk.srcGenProjectsMod.projects.ProtectedModuleType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AddOn")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "projects.ProtectedModuleType.Solution")
    @js.native
    def Solution: typingsJapgolly.mendixmodelsdk.srcGenProjectsMod.projects.ProtectedModuleType = js.native
    inline def Solution_=(x: typingsJapgolly.mendixmodelsdk.srcGenProjectsMod.projects.ProtectedModuleType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Solution")(x.asInstanceOf[js.Any])
  }
}
