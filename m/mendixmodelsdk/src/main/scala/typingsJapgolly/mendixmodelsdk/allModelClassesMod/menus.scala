package typingsJapgolly.mendixmodelsdk.allModelClassesMod

import typingsJapgolly.mendixmodelsdk.baseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractElement
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractModel
import typingsJapgolly.mendixmodelsdk.internalMod.ModelUnit
import typingsJapgolly.mendixmodelsdk.navigationMod.navigation.NavigationProfile
import typingsJapgolly.mendixmodelsdk.projectsMod.projects.IFolderBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "menus")
@js.native
object menus extends js.Object {
  /**
    * See: {@link https://docs.mendix.com/refguide7/menu relevant section in reference guide}
    */
  @js.native
  class MenuDocument protected ()
    extends typingsJapgolly.mendixmodelsdk.menusMod.menus.MenuDocument {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IFolderBase
    ) = this()
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/menu-item relevant section in reference guide}
    */
  @js.native
  class MenuItem protected ()
    extends typingsJapgolly.mendixmodelsdk.menusMod.menus.MenuItem {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
  }
  
  @js.native
  class MenuItemCollection protected ()
    extends typingsJapgolly.mendixmodelsdk.menusMod.menus.MenuItemCollection {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
  }
  
  @js.native
  abstract class MenuItemContainer protected ()
    extends typingsJapgolly.mendixmodelsdk.menusMod.menus.MenuItemContainer {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
  }
  
  /* static members */
  @js.native
  object MenuDocument extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typingsJapgolly.mendixmodelsdk.menusMod.StructureVersionInfo = js.native
    /**
      * Creates a new MenuDocument unit in the SDK and on the server.
      * Expects one argument, the projects.IFolderBase in which this unit is contained.
      */
    def createIn(container: IFolderBase): typingsJapgolly.mendixmodelsdk.menusMod.menus.MenuDocument = js.native
  }
  
  /* static members */
  @js.native
  object MenuItem extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typingsJapgolly.mendixmodelsdk.menusMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new MenuItem instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typingsJapgolly.mendixmodelsdk.menusMod.menus.MenuItem = js.native
    /**
      * Creates and returns a new MenuItem instance in the SDK and on the server.
      * The new MenuItem will be automatically stored in the 'items' property
      * of the parent MenuItemContainer element passed as argument.
      */
    def createIn(container: typingsJapgolly.mendixmodelsdk.menusMod.menus.MenuItemContainer): typingsJapgolly.mendixmodelsdk.menusMod.menus.MenuItem = js.native
  }
  
  /* static members */
  @js.native
  object MenuItemCollection extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typingsJapgolly.mendixmodelsdk.menusMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new MenuItemCollection instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typingsJapgolly.mendixmodelsdk.menusMod.menus.MenuItemCollection = js.native
    /**
      * Creates and returns a new MenuItemCollection instance in the SDK and on the server.
      * The new MenuItemCollection will be automatically stored in the 'itemCollection' property
      * of the parent MenuDocument element passed as argument.
      */
    def createInMenuDocumentUnderItemCollection(container: typingsJapgolly.mendixmodelsdk.menusMod.menus.MenuDocument): typingsJapgolly.mendixmodelsdk.menusMod.menus.MenuItemCollection = js.native
    /**
      * Creates and returns a new MenuItemCollection instance in the SDK and on the server.
      * The new MenuItemCollection will be automatically stored in the 'menuItemCollection' property
      * of the parent navigation.NavigationProfile element passed as argument.
      */
    def createInNavigationProfileUnderMenuItemCollection(container: NavigationProfile): typingsJapgolly.mendixmodelsdk.menusMod.menus.MenuItemCollection = js.native
  }
  
  /* static members */
  @js.native
  object MenuItemContainer extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typingsJapgolly.mendixmodelsdk.menusMod.StructureVersionInfo = js.native
  }
  
}

