package typingsJapgolly.mendixmodelsdk.allModelClassesMod

import typingsJapgolly.mendixmodelsdk.baseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractElement
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractModel
import typingsJapgolly.mendixmodelsdk.internalMod.ModelUnit
import typingsJapgolly.mendixmodelsdk.projectsMod.projects.IFolderBase
import typingsJapgolly.mendixmodelsdk.projectsMod.projects.IModule
import typingsJapgolly.mendixmodelsdk.projectsMod.projects.IProject
import typingsJapgolly.mendixmodelsdk.unitsMod.IStructuralUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "projects")
@js.native
object projects extends js.Object {
  @js.native
  abstract class Document protected ()
    extends typingsJapgolly.mendixmodelsdk.projectsMod.projects.Document {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IFolderBase
    ) = this()
  }
  
  /**
    * See: {@link https://world.mendix.com/display/howto50/Add+documents+to+a+module relevant section in reference guide}
    */
  @js.native
  class Folder protected ()
    extends typingsJapgolly.mendixmodelsdk.projectsMod.projects.Folder {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IFolderBase
    ) = this()
  }
  
  @js.native
  abstract class FolderBase protected ()
    extends typingsJapgolly.mendixmodelsdk.projectsMod.projects.FolderBase {
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
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/modules relevant section in reference guide}
    */
  @js.native
  class Module protected ()
    extends typingsJapgolly.mendixmodelsdk.projectsMod.projects.Module {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IProject
    ) = this()
  }
  
  @js.native
  abstract class ModuleDocument protected ()
    extends typingsJapgolly.mendixmodelsdk.projectsMod.projects.ModuleDocument {
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
  
  @js.native
  class OneTimeConversionMarker protected ()
    extends typingsJapgolly.mendixmodelsdk.projectsMod.projects.OneTimeConversionMarker {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/project relevant section in reference guide}
    */
  @js.native
  class Project protected ()
    extends typingsJapgolly.mendixmodelsdk.projectsMod.projects.Project {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IStructuralUnit
    ) = this()
  }
  
  @js.native
  class ProjectConversion protected ()
    extends typingsJapgolly.mendixmodelsdk.projectsMod.projects.ProjectConversion {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IProject
    ) = this()
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/project relevant section in reference guide}
    */
  @js.native
  abstract class ProjectDocument protected ()
    extends typingsJapgolly.mendixmodelsdk.projectsMod.projects.ProjectDocument {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IProject
    ) = this()
  }
  
  /* static members */
  @js.native
  object Document extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typingsJapgolly.mendixmodelsdk.projectsMod.StructureVersionInfo = js.native
  }
  
  /* static members */
  @js.native
  object Folder extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typingsJapgolly.mendixmodelsdk.projectsMod.StructureVersionInfo = js.native
    /**
      * Creates a new Folder unit in the SDK and on the server.
      * Expects one argument, the IFolderBase in which this unit is contained.
      */
    def createIn(container: IFolderBase): typingsJapgolly.mendixmodelsdk.projectsMod.projects.Folder = js.native
  }
  
  /* static members */
  @js.native
  object FolderBase extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typingsJapgolly.mendixmodelsdk.projectsMod.StructureVersionInfo = js.native
  }
  
  /* static members */
  @js.native
  object Module extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typingsJapgolly.mendixmodelsdk.projectsMod.StructureVersionInfo = js.native
    /**
      * Creates a new Module unit in the SDK and on the server.
      * Expects one argument, the IProject in which this unit is contained.
      */
    def createIn(container: IProject): typingsJapgolly.mendixmodelsdk.projectsMod.projects.Module = js.native
  }
  
  /* static members */
  @js.native
  object ModuleDocument extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typingsJapgolly.mendixmodelsdk.projectsMod.StructureVersionInfo = js.native
  }
  
  /* static members */
  @js.native
  object OneTimeConversionMarker extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typingsJapgolly.mendixmodelsdk.projectsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new OneTimeConversionMarker instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typingsJapgolly.mendixmodelsdk.projectsMod.projects.OneTimeConversionMarker = js.native
    /**
      * Creates and returns a new OneTimeConversionMarker instance in the SDK and on the server.
      * The new OneTimeConversionMarker will be automatically stored in the 'markers' property
      * of the parent ProjectConversion element passed as argument.
      */
    def createIn(container: typingsJapgolly.mendixmodelsdk.projectsMod.projects.ProjectConversion): typingsJapgolly.mendixmodelsdk.projectsMod.projects.OneTimeConversionMarker = js.native
  }
  
  /* static members */
  @js.native
  object Project extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typingsJapgolly.mendixmodelsdk.projectsMod.StructureVersionInfo = js.native
  }
  
  /* static members */
  @js.native
  object ProjectConversion extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typingsJapgolly.mendixmodelsdk.projectsMod.StructureVersionInfo = js.native
    /**
      * Creates a new ProjectConversion unit in the SDK and on the server.
      * Expects one argument, the IProject in which this unit is contained.
      */
    def createIn(container: IProject): typingsJapgolly.mendixmodelsdk.projectsMod.projects.ProjectConversion = js.native
  }
  
  /* static members */
  @js.native
  object ProjectDocument extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typingsJapgolly.mendixmodelsdk.projectsMod.StructureVersionInfo = js.native
  }
  
}

