package typingsJapgolly.mendixmodelsdk

import typingsJapgolly.mendixmodelsdk.baseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.instancesMod.IList
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractElement
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractModel
import typingsJapgolly.mendixmodelsdk.internalMod.Element
import typingsJapgolly.mendixmodelsdk.internalMod.ModelUnit
import typingsJapgolly.mendixmodelsdk.navigationMod.navigation.NavigationProfile
import typingsJapgolly.mendixmodelsdk.pagesMod.pages.ClientAction
import typingsJapgolly.mendixmodelsdk.pagesMod.pages.Icon
import typingsJapgolly.mendixmodelsdk.projectsMod.projects.Document
import typingsJapgolly.mendixmodelsdk.projectsMod.projects.FolderBase
import typingsJapgolly.mendixmodelsdk.projectsMod.projects.IDocument
import typingsJapgolly.mendixmodelsdk.projectsMod.projects.IFolderBase
import typingsJapgolly.mendixmodelsdk.textsMod.texts.Text
import typingsJapgolly.mendixmodelsdk.versionChecksMod.IStructureVersionInfo
import typingsJapgolly.mendixmodelsdk.versionChecksMod.StructureType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/menus", JSImport.Namespace)
@js.native
object menusMod extends js.Object {
  @js.native
  class StructureVersionInfo protected ()
    extends typingsJapgolly.mendixmodelsdk.internalMod.StructureVersionInfo {
    def this(info: IStructureVersionInfo, structureType: StructureType) = this()
  }
  
  @js.native
  object menus extends js.Object {
    /**
      * Interfaces and instance classes for types from the Mendix sub meta model `Menus`.
      */
    /**
      * See: {@link https://docs.mendix.com/refguide7/menu relevant section in reference guide}
      */
    @js.native
    trait IMenuDocument extends IDocument
    
    /**
      * See: {@link https://docs.mendix.com/refguide7/menu relevant section in reference guide}
      */
    /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
    - typingsJapgolly.mendixmodelsdk.structuresMod.IStructure because Already inherited
    - typingsJapgolly.mendixmodelsdk.elementsMod.IAbstractElement because Already inherited
    - typingsJapgolly.mendixmodelsdk.unitsMod.IAbstractUnit because Already inherited
    - typingsJapgolly.mendixmodelsdk.unitsMod.IModelUnit because Already inherited
    - typingsJapgolly.mendixmodelsdk.elementsMod.IByNameReferrable because Already inherited
    - typingsJapgolly.mendixmodelsdk.projectsMod.projects.IModuleDocument because Already inherited
    - typingsJapgolly.mendixmodelsdk.projectsMod.projects.IDocument because Already inherited
    - typingsJapgolly.mendixmodelsdk.menusMod.menus.IMenuDocument because var conflicts: containerAsFolderBase, id, isLoaded, model, name, qualifiedName, structureTypeName, unit. Inlined  */ @js.native
    class MenuDocument protected () extends Document {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        container: IFolderBase
      ) = this()
      @JSName("model")
      var model_FMenuDocument: IModel = js.native
      @JSName("containerAsFolderBase")
      def containerAsFolderBase_MMenuDocument(): FolderBase = js.native
      def itemCollection(): MenuItemCollection = js.native
      def itemCollection(newValue: MenuItemCollection): js.Any = js.native
    }
    
    /**
      * See: {@link https://docs.mendix.com/refguide7/menu-item relevant section in reference guide}
      */
    @js.native
    class MenuItem protected () extends MenuItemContainer {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        unit: ModelUnit,
        container: AbstractElement
      ) = this()
      @JSName("model")
      var model_FMenuItem: IModel = js.native
      def action(): ClientAction = js.native
      def action(newValue: ClientAction): js.Any = js.native
      def caption(): Text = js.native
      def caption(newValue: Text): js.Any = js.native
      def icon(): js.Any = js.native
      def icon(newValue: Icon): js.Any = js.native
      @JSName("icon")
      def icon_Union(): Icon | Null = js.native
    }
    
    @js.native
    class MenuItemCollection protected () extends MenuItemContainer {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        unit: ModelUnit,
        container: AbstractElement
      ) = this()
      @JSName("model")
      var model_FMenuItemCollection: IModel = js.native
    }
    
    @js.native
    abstract class MenuItemContainer protected () extends Element {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        unit: ModelUnit,
        container: AbstractElement
      ) = this()
      @JSName("model")
      var model_FMenuItemContainer: IModel = js.native
      def containerAsMenuDocument(): MenuDocument = js.native
      def containerAsMenuItemContainer(): MenuItemContainer = js.native
      def containerAsNavigationProfile(): NavigationProfile = js.native
      def items(): IList[MenuItem] = js.native
    }
    
    /* static members */
    @js.native
    object MenuDocument extends js.Object {
      var structureTypeName: String = js.native
      var versionInfo: StructureVersionInfo = js.native
      /**
        * Creates a new MenuDocument unit in the SDK and on the server.
        * Expects one argument, the projects.IFolderBase in which this unit is contained.
        */
      def createIn(container: IFolderBase): MenuDocument = js.native
    }
    
    /* static members */
    @js.native
    object MenuItem extends js.Object {
      var structureTypeName: String = js.native
      var versionInfo: StructureVersionInfo = js.native
      /**
        * Creates and returns a new MenuItem instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      def create(model: IModel): MenuItem = js.native
      /**
        * Creates and returns a new MenuItem instance in the SDK and on the server.
        * The new MenuItem will be automatically stored in the 'items' property
        * of the parent MenuItemContainer element passed as argument.
        */
      def createIn(container: MenuItemContainer): MenuItem = js.native
    }
    
    /* static members */
    @js.native
    object MenuItemCollection extends js.Object {
      var structureTypeName: String = js.native
      var versionInfo: StructureVersionInfo = js.native
      /**
        * Creates and returns a new MenuItemCollection instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      def create(model: IModel): MenuItemCollection = js.native
      /**
        * Creates and returns a new MenuItemCollection instance in the SDK and on the server.
        * The new MenuItemCollection will be automatically stored in the 'itemCollection' property
        * of the parent MenuDocument element passed as argument.
        */
      def createInMenuDocumentUnderItemCollection(container: MenuDocument): MenuItemCollection = js.native
      /**
        * Creates and returns a new MenuItemCollection instance in the SDK and on the server.
        * The new MenuItemCollection will be automatically stored in the 'menuItemCollection' property
        * of the parent navigation.NavigationProfile element passed as argument.
        */
      def createInNavigationProfileUnderMenuItemCollection(container: NavigationProfile): MenuItemCollection = js.native
    }
    
    /* static members */
    @js.native
    object MenuItemContainer extends js.Object {
      var structureTypeName: String = js.native
      var versionInfo: StructureVersionInfo = js.native
    }
    
  }
  
}

