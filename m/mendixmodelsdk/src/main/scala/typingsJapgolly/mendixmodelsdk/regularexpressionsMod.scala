package typingsJapgolly.mendixmodelsdk

import typingsJapgolly.mendixmodelsdk.baseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractModel
import typingsJapgolly.mendixmodelsdk.projectsMod.projects.Document
import typingsJapgolly.mendixmodelsdk.projectsMod.projects.FolderBase
import typingsJapgolly.mendixmodelsdk.projectsMod.projects.IDocument
import typingsJapgolly.mendixmodelsdk.projectsMod.projects.IFolderBase
import typingsJapgolly.mendixmodelsdk.versionChecksMod.IStructureVersionInfo
import typingsJapgolly.mendixmodelsdk.versionChecksMod.StructureType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/regularexpressions", JSImport.Namespace)
@js.native
object regularexpressionsMod extends js.Object {
  @js.native
  class StructureVersionInfo protected ()
    extends typingsJapgolly.mendixmodelsdk.internalMod.StructureVersionInfo {
    def this(info: IStructureVersionInfo, structureType: StructureType) = this()
  }
  
  @js.native
  object regularexpressions extends js.Object {
    /**
      * Interfaces and instance classes for types from the Mendix sub meta model `RegularExpressions`.
      */
    /**
      * See: {@link https://docs.mendix.com/refguide7/regular-expressions relevant section in reference guide}
      */
    @js.native
    trait IRegularExpression extends IDocument
    
    /**
      * See: {@link https://docs.mendix.com/refguide7/regular-expressions relevant section in reference guide}
      */
    /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
    - typingsJapgolly.mendixmodelsdk.structuresMod.IStructure because Already inherited
    - typingsJapgolly.mendixmodelsdk.elementsMod.IAbstractElement because Already inherited
    - typingsJapgolly.mendixmodelsdk.unitsMod.IAbstractUnit because Already inherited
    - typingsJapgolly.mendixmodelsdk.unitsMod.IModelUnit because Already inherited
    - typingsJapgolly.mendixmodelsdk.elementsMod.IByNameReferrable because Already inherited
    - typingsJapgolly.mendixmodelsdk.projectsMod.projects.IModuleDocument because Already inherited
    - typingsJapgolly.mendixmodelsdk.projectsMod.projects.IDocument because Already inherited
    - typingsJapgolly.mendixmodelsdk.regularexpressionsMod.regularexpressions.IRegularExpression because var conflicts: containerAsFolderBase, id, isLoaded, model, name, qualifiedName, structureTypeName, unit. Inlined  */ @js.native
    class RegularExpression protected () extends Document {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        container: IFolderBase
      ) = this()
      @JSName("model")
      var model_FRegularExpression: IModel = js.native
      @JSName("containerAsFolderBase")
      def containerAsFolderBase_MRegularExpression(): FolderBase = js.native
      def regEx(): String = js.native
      def regEx(newValue: String): js.Any = js.native
    }
    
    /* static members */
    @js.native
    object RegularExpression extends js.Object {
      var structureTypeName: String = js.native
      var versionInfo: StructureVersionInfo = js.native
      /**
        * Creates a new RegularExpression unit in the SDK and on the server.
        * Expects one argument, the projects.IFolderBase in which this unit is contained.
        */
      def createIn(container: IFolderBase): RegularExpression = js.native
    }
    
  }
  
}

