package typingsJapgolly.mendixmodelsdk

import typingsJapgolly.mendixmodelsdk.srcGenBaseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.srcGenNavigationMod.navigation.NavigationProfile
import typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ClientAction
import typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.Icon
import typingsJapgolly.mendixmodelsdk.srcGenProjectsMod.projects.Document
import typingsJapgolly.mendixmodelsdk.srcGenProjectsMod.projects.FolderBase
import typingsJapgolly.mendixmodelsdk.srcGenProjectsMod.projects.IDocument
import typingsJapgolly.mendixmodelsdk.srcGenProjectsMod.projects.IFolderBase
import typingsJapgolly.mendixmodelsdk.srcGenTextsMod.texts.Text
import typingsJapgolly.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typingsJapgolly.mendixmodelsdk.srcSdkInternalInstancesMod.IList
import typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractElement
import typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractModel
import typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.Element
import typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.ModelUnit
import typingsJapgolly.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
import typingsJapgolly.mendixmodelsdk.srcSdkInternalVersionChecksMod.IStructureVersionInfo
import typingsJapgolly.mendixmodelsdk.srcSdkInternalVersionChecksMod.StructureType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcGenMenusMod {
  
  @JSImport("mendixmodelsdk/src/gen/menus", "StructureVersionInfo")
  @js.native
  open class StructureVersionInfo protected ()
    extends typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.StructureVersionInfo {
    def this(info: IStructureVersionInfo, structureType: StructureType) = this()
  }
  
  object menus {
    
    /**
      * See: {@link https://docs.mendix.com/refguide/menu relevant section in reference guide}
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
    - typingsJapgolly.mendixmodelsdk.srcGenMenusMod.menus.IMenuDocument because var conflicts: containerAsFolderBase, documentation, excluded, id, isLoaded, model, name, qualifiedName, structureTypeName, unit. Inlined  */ @JSImport("mendixmodelsdk/src/gen/menus", "menus.MenuDocument")
    @js.native
    open class MenuDocument protected () extends Document {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        container: IFolderBase
      ) = this()
      
      @JSName("containerAsFolderBase")
      def containerAsFolderBase_MMenuDocument: FolderBase = js.native
      
      def itemCollection: MenuItemCollection = js.native
      def itemCollection_=(newValue: MenuItemCollection): Unit = js.native
    }
    object MenuDocument {
      
      @JSImport("mendixmodelsdk/src/gen/menus", "menus.MenuDocument")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates a new MenuDocument unit in the SDK and on the server.
        * Expects one argument, the projects.IFolderBase in which this unit is contained.
        */
      /* static member */
      inline def createIn(container: IFolderBase): MenuDocument = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[MenuDocument]
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/menus", "menus.MenuDocument.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/menus", "menus.MenuDocument.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    /**
      * See: {@link https://docs.mendix.com/refguide/menu relevant section in reference guide}
      */
    @JSImport("mendixmodelsdk/src/gen/menus", "menus.MenuItem")
    @js.native
    open class MenuItem protected () extends MenuItemContainer {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        unit: ModelUnit[IAbstractModel],
        container: AbstractElement[IAbstractModel, Container]
      ) = this()
      
      def action: ClientAction = js.native
      def action_=(newValue: ClientAction): Unit = js.native
      
      /**
        * In version 8.12.0: introduced
        */
      def alternativeText: Text | Null = js.native
      def alternativeText_=(newValue: Text | Null): Unit = js.native
      
      def caption: Text = js.native
      def caption_=(newValue: Text): Unit = js.native
      
      def icon: Icon | Null = js.native
      def icon_=(newValue: Icon | Null): Unit = js.native
    }
    object MenuItem {
      
      @JSImport("mendixmodelsdk/src/gen/menus", "menus.MenuItem")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates and returns a new MenuItem instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      /* static member */
      inline def create(model: IModel): MenuItem = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[MenuItem]
      
      /**
        * Creates and returns a new MenuItem instance in the SDK and on the server.
        * The new MenuItem will be automatically stored in the 'items' property
        * of the parent MenuItemContainer element passed as argument.
        */
      /* static member */
      inline def createIn(container: MenuItemContainer): MenuItem = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[MenuItem]
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/menus", "menus.MenuItem.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/menus", "menus.MenuItem.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    @JSImport("mendixmodelsdk/src/gen/menus", "menus.MenuItemCollection")
    @js.native
    open class MenuItemCollection protected () extends MenuItemContainer {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        unit: ModelUnit[IAbstractModel],
        container: AbstractElement[IAbstractModel, Container]
      ) = this()
    }
    object MenuItemCollection {
      
      @JSImport("mendixmodelsdk/src/gen/menus", "menus.MenuItemCollection")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates and returns a new MenuItemCollection instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      /* static member */
      inline def create(model: IModel): MenuItemCollection = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[MenuItemCollection]
      
      /**
        * Creates and returns a new MenuItemCollection instance in the SDK and on the server.
        * The new MenuItemCollection will be automatically stored in the 'itemCollection' property
        * of the parent MenuDocument element passed as argument.
        */
      /* static member */
      inline def createInMenuDocumentUnderItemCollection(container: MenuDocument): MenuItemCollection = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMenuDocumentUnderItemCollection")(container.asInstanceOf[js.Any]).asInstanceOf[MenuItemCollection]
      
      /**
        * Creates and returns a new MenuItemCollection instance in the SDK and on the server.
        * The new MenuItemCollection will be automatically stored in the 'menuItemCollection' property
        * of the parent navigation.NavigationProfile element passed as argument.
        */
      /* static member */
      inline def createInNavigationProfileUnderMenuItemCollection(container: NavigationProfile): MenuItemCollection = ^.asInstanceOf[js.Dynamic].applyDynamic("createInNavigationProfileUnderMenuItemCollection")(container.asInstanceOf[js.Any]).asInstanceOf[MenuItemCollection]
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/menus", "menus.MenuItemCollection.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/menus", "menus.MenuItemCollection.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    /* note: abstract class */ @JSImport("mendixmodelsdk/src/gen/menus", "menus.MenuItemContainer")
    @js.native
    open class MenuItemContainer protected () extends Element[IModel] {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        unit: ModelUnit[IAbstractModel],
        container: AbstractElement[IAbstractModel, Container]
      ) = this()
      
      def containerAsMenuDocument: MenuDocument = js.native
      
      def containerAsMenuItemContainer: MenuItemContainer = js.native
      
      def containerAsNavigationProfile: NavigationProfile = js.native
      
      def items: IList[MenuItem] = js.native
    }
    object MenuItemContainer {
      
      @JSImport("mendixmodelsdk/src/gen/menus", "menus.MenuItemContainer")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/menus", "menus.MenuItemContainer.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/menus", "menus.MenuItemContainer.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    /**
      * Interfaces and instance classes for types from the Mendix sub meta model `Menus`.
      */
    /**
      * See: {@link https://docs.mendix.com/refguide/menu relevant section in reference guide}
      */
    @js.native
    trait IMenuDocument
      extends StObject
         with IDocument
  }
}
