package typingsJapgolly.mendixmodelsdk.mod

import typingsJapgolly.mendixmodelsdk.baseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValue
import typingsJapgolly.mendixmodelsdk.menusMod.menus.MenuItem
import typingsJapgolly.mendixmodelsdk.navigationMod.navigation.NativeNavigationProfile
import typingsJapgolly.mendixmodelsdk.pagesMod.pages.ActionButton
import typingsJapgolly.mendixmodelsdk.pagesMod.pages.ActionItem
import typingsJapgolly.mendixmodelsdk.pagesMod.pages.AssociationWidget
import typingsJapgolly.mendixmodelsdk.pagesMod.pages.AttributeWidget
import typingsJapgolly.mendixmodelsdk.pagesMod.pages.BuildingBlock
import typingsJapgolly.mendixmodelsdk.pagesMod.pages.DataView
import typingsJapgolly.mendixmodelsdk.pagesMod.pages.DivContainer
import typingsJapgolly.mendixmodelsdk.pagesMod.pages.DynamicImageViewer
import typingsJapgolly.mendixmodelsdk.pagesMod.pages.GridActionButton
import typingsJapgolly.mendixmodelsdk.pagesMod.pages.GroupBox
import typingsJapgolly.mendixmodelsdk.pagesMod.pages.Header
import typingsJapgolly.mendixmodelsdk.pagesMod.pages.Layout
import typingsJapgolly.mendixmodelsdk.pagesMod.pages.LayoutCallArgument
import typingsJapgolly.mendixmodelsdk.pagesMod.pages.LayoutGridColumn
import typingsJapgolly.mendixmodelsdk.pagesMod.pages.ListView
import typingsJapgolly.mendixmodelsdk.pagesMod.pages.ListViewTemplate
import typingsJapgolly.mendixmodelsdk.pagesMod.pages.NavigationListItem
import typingsJapgolly.mendixmodelsdk.pagesMod.pages.ReferenceSetSelector
import typingsJapgolly.mendixmodelsdk.pagesMod.pages.ScrollContainerRegion
import typingsJapgolly.mendixmodelsdk.pagesMod.pages.Snippet
import typingsJapgolly.mendixmodelsdk.pagesMod.pages.SplitPane
import typingsJapgolly.mendixmodelsdk.pagesMod.pages.StaticImageViewer
import typingsJapgolly.mendixmodelsdk.pagesMod.pages.TabPage
import typingsJapgolly.mendixmodelsdk.pagesMod.pages.TableCell
import typingsJapgolly.mendixmodelsdk.pagesMod.pages.TemplateGridContents
import typingsJapgolly.mendixmodelsdk.projectsMod.projects.IFolderBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk", "nativepages")
@js.native
object nativepages extends js.Object {
  /**
    * Interfaces and instance classes for types from the Mendix sub meta model `NativePages`.
    */
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 8.0.0: introduced
    */
  @js.native
  class BottomBarItem protected ()
    extends typingsJapgolly.mendixmodelsdk.allModelClassesMod.nativepages.BottomBarItem {
    def this(
      model: typingsJapgolly.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typingsJapgolly.mendixmodelsdk.internalMod.ModelUnit,
      container: typingsJapgolly.mendixmodelsdk.internalMod.AbstractElement
    ) = this()
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 8.0.0: deleted
    * In version 7.21.0: introduced
    */
  @js.native
  class NativeLayout protected ()
    extends typingsJapgolly.mendixmodelsdk.allModelClassesMod.nativepages.NativeLayout {
    def this(
      model: typingsJapgolly.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IFolderBase
    ) = this()
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 8.0.0: deleted
    * In version 7.23.0: introduced
    */
  @js.native
  class NativeLayoutCallArgument protected ()
    extends typingsJapgolly.mendixmodelsdk.allModelClassesMod.nativepages.NativeLayoutCallArgument {
    def this(
      model: typingsJapgolly.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typingsJapgolly.mendixmodelsdk.internalMod.ModelUnit,
      container: typingsJapgolly.mendixmodelsdk.internalMod.AbstractElement
    ) = this()
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 8.0.0: deleted
    * In version 7.21.0: introduced
    */
  @js.native
  class NativePage protected ()
    extends typingsJapgolly.mendixmodelsdk.allModelClassesMod.nativepages.NativePage {
    def this(
      model: typingsJapgolly.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IFolderBase
    ) = this()
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 8.0.0: deleted
    * In version 7.23.0: introduced
    */
  @js.native
  class NativePageClientAction protected ()
    extends typingsJapgolly.mendixmodelsdk.allModelClassesMod.nativepages.NativePageClientAction {
    def this(
      model: typingsJapgolly.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typingsJapgolly.mendixmodelsdk.internalMod.ModelUnit,
      container: typingsJapgolly.mendixmodelsdk.internalMod.AbstractElement
    ) = this()
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 8.0.0: deleted
    * In version 7.23.0: introduced
    */
  @js.native
  class NativePlaceholder protected ()
    extends typingsJapgolly.mendixmodelsdk.allModelClassesMod.nativepages.NativePlaceholder {
    def this(
      model: typingsJapgolly.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typingsJapgolly.mendixmodelsdk.internalMod.ModelUnit,
      container: typingsJapgolly.mendixmodelsdk.internalMod.AbstractElement
    ) = this()
  }
  
  /* static members */
  @js.native
  object BottomBarItem extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typingsJapgolly.mendixmodelsdk.nativepagesMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new BottomBarItem instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typingsJapgolly.mendixmodelsdk.nativepagesMod.nativepages.BottomBarItem = js.native
    /**
      * Creates and returns a new BottomBarItem instance in the SDK and on the server.
      * The new BottomBarItem will be automatically stored in the 'bottomBarItems' property
      * of the parent navigation.NativeNavigationProfile element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.0.0 and higher
      */
    def createIn(container: NativeNavigationProfile): typingsJapgolly.mendixmodelsdk.nativepagesMod.nativepages.BottomBarItem = js.native
  }
  
  /* static members */
  @js.native
  object NativeLayout extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typingsJapgolly.mendixmodelsdk.nativepagesMod.StructureVersionInfo = js.native
    /**
      * Creates a new NativeLayout unit in the SDK and on the server.
      * Expects one argument, the projects.IFolderBase in which this unit is contained.
      */
    def createIn(container: IFolderBase): typingsJapgolly.mendixmodelsdk.nativepagesMod.nativepages.NativeLayout = js.native
  }
  
  /* static members */
  @js.native
  object NativeLayoutCallArgument extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typingsJapgolly.mendixmodelsdk.nativepagesMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new NativeLayoutCallArgument instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typingsJapgolly.mendixmodelsdk.nativepagesMod.nativepages.NativeLayoutCallArgument = js.native
    /**
      * Creates and returns a new NativeLayoutCallArgument instance in the SDK and on the server.
      * The new NativeLayoutCallArgument will be automatically stored in the 'arguments' property
      * of the parent NativePage element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    def createIn(container: typingsJapgolly.mendixmodelsdk.nativepagesMod.nativepages.NativePage): typingsJapgolly.mendixmodelsdk.nativepagesMod.nativepages.NativeLayoutCallArgument = js.native
  }
  
  /* static members */
  @js.native
  object NativePage extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typingsJapgolly.mendixmodelsdk.nativepagesMod.StructureVersionInfo = js.native
    /**
      * Creates a new NativePage unit in the SDK and on the server.
      * Expects one argument, the projects.IFolderBase in which this unit is contained.
      */
    def createIn(container: IFolderBase): typingsJapgolly.mendixmodelsdk.nativepagesMod.nativepages.NativePage = js.native
  }
  
  /* static members */
  @js.native
  object NativePageClientAction extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typingsJapgolly.mendixmodelsdk.nativepagesMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new NativePageClientAction instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typingsJapgolly.mendixmodelsdk.nativepagesMod.nativepages.NativePageClientAction = js.native
    /**
      * Creates and returns a new NativePageClientAction instance in the SDK and on the server.
      * The new NativePageClientAction will be automatically stored in the 'action' property
      * of the parent pages.ActionButton element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    def createInActionButtonUnderAction(container: ActionButton): typingsJapgolly.mendixmodelsdk.nativepagesMod.nativepages.NativePageClientAction = js.native
    /**
      * Creates and returns a new NativePageClientAction instance in the SDK and on the server.
      * The new NativePageClientAction will be automatically stored in the 'action' property
      * of the parent pages.ActionItem element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    def createInActionItemUnderAction(container: ActionItem): typingsJapgolly.mendixmodelsdk.nativepagesMod.nativepages.NativePageClientAction = js.native
    /**
      * Creates and returns a new NativePageClientAction instance in the SDK and on the server.
      * The new NativePageClientAction will be automatically stored in the 'onChangeAction' property
      * of the parent pages.AssociationWidget element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    def createInAssociationWidgetUnderOnChangeAction(container: AssociationWidget): typingsJapgolly.mendixmodelsdk.nativepagesMod.nativepages.NativePageClientAction = js.native
    /**
      * Creates and returns a new NativePageClientAction instance in the SDK and on the server.
      * The new NativePageClientAction will be automatically stored in the 'onChangeAction' property
      * of the parent pages.AttributeWidget element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    def createInAttributeWidgetUnderOnChangeAction(container: AttributeWidget): typingsJapgolly.mendixmodelsdk.nativepagesMod.nativepages.NativePageClientAction = js.native
    /**
      * Creates and returns a new NativePageClientAction instance in the SDK and on the server.
      * The new NativePageClientAction will be automatically stored in the 'onEnterAction' property
      * of the parent pages.AttributeWidget element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    def createInAttributeWidgetUnderOnEnterAction(container: AttributeWidget): typingsJapgolly.mendixmodelsdk.nativepagesMod.nativepages.NativePageClientAction = js.native
    /**
      * Creates and returns a new NativePageClientAction instance in the SDK and on the server.
      * The new NativePageClientAction will be automatically stored in the 'onLeaveAction' property
      * of the parent pages.AttributeWidget element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    def createInAttributeWidgetUnderOnLeaveAction(container: AttributeWidget): typingsJapgolly.mendixmodelsdk.nativepagesMod.nativepages.NativePageClientAction = js.native
    /**
      * Creates and returns a new NativePageClientAction instance in the SDK and on the server.
      * The new NativePageClientAction will be automatically stored in the 'clickAction' property
      * of the parent pages.DynamicImageViewer element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    def createInDynamicImageViewerUnderClickAction(container: DynamicImageViewer): typingsJapgolly.mendixmodelsdk.nativepagesMod.nativepages.NativePageClientAction = js.native
    /**
      * Creates and returns a new NativePageClientAction instance in the SDK and on the server.
      * The new NativePageClientAction will be automatically stored in the 'action' property
      * of the parent pages.GridActionButton element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    def createInGridActionButtonUnderAction(container: GridActionButton): typingsJapgolly.mendixmodelsdk.nativepagesMod.nativepages.NativePageClientAction = js.native
    /**
      * Creates and returns a new NativePageClientAction instance in the SDK and on the server.
      * The new NativePageClientAction will be automatically stored in the 'clickAction' property
      * of the parent pages.ListView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    def createInListViewUnderClickAction(container: ListView): typingsJapgolly.mendixmodelsdk.nativepagesMod.nativepages.NativePageClientAction = js.native
    /**
      * Creates and returns a new NativePageClientAction instance in the SDK and on the server.
      * The new NativePageClientAction will be automatically stored in the 'action' property
      * of the parent menus.MenuItem element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    def createInMenuItemUnderAction(container: MenuItem): typingsJapgolly.mendixmodelsdk.nativepagesMod.nativepages.NativePageClientAction = js.native
    /**
      * Creates and returns a new NativePageClientAction instance in the SDK and on the server.
      * The new NativePageClientAction will be automatically stored in the 'onChangeAction' property
      * of the parent pages.ReferenceSetSelector element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    def createInReferenceSetSelectorUnderOnChangeAction(container: ReferenceSetSelector): typingsJapgolly.mendixmodelsdk.nativepagesMod.nativepages.NativePageClientAction = js.native
    /**
      * Creates and returns a new NativePageClientAction instance in the SDK and on the server.
      * The new NativePageClientAction will be automatically stored in the 'clickAction' property
      * of the parent pages.StaticImageViewer element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    def createInStaticImageViewerUnderClickAction(container: StaticImageViewer): typingsJapgolly.mendixmodelsdk.nativepagesMod.nativepages.NativePageClientAction = js.native
    /**
      * Creates and returns a new NativePageClientAction instance in the SDK and on the server.
      * The new NativePageClientAction will be automatically stored in the 'action' property
      * of the parent customwidgets.WidgetValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    def createInWidgetValueUnderAction(container: WidgetValue): typingsJapgolly.mendixmodelsdk.nativepagesMod.nativepages.NativePageClientAction = js.native
  }
  
  /* static members */
  @js.native
  object NativePlaceholder extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typingsJapgolly.mendixmodelsdk.nativepagesMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typingsJapgolly.mendixmodelsdk.nativepagesMod.nativepages.NativePlaceholder = js.native
    /**
      * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
      * The new NativePlaceholder will be automatically stored in the 'widgets' property
      * of the parent pages.BuildingBlock element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    def createInBuildingBlockUnderWidgets(container: BuildingBlock): typingsJapgolly.mendixmodelsdk.nativepagesMod.nativepages.NativePlaceholder = js.native
    /**
      * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
      * The new NativePlaceholder will be automatically stored in the 'footerWidgets' property
      * of the parent pages.DataView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    def createInDataViewUnderFooterWidgets(container: DataView): typingsJapgolly.mendixmodelsdk.nativepagesMod.nativepages.NativePlaceholder = js.native
    /**
      * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
      * The new NativePlaceholder will be automatically stored in the 'widgets' property
      * of the parent pages.DataView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    def createInDataViewUnderWidgets(container: DataView): typingsJapgolly.mendixmodelsdk.nativepagesMod.nativepages.NativePlaceholder = js.native
    /**
      * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
      * The new NativePlaceholder will be automatically stored in the 'widgets' property
      * of the parent pages.DivContainer element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    def createInDivContainerUnderWidgets(container: DivContainer): typingsJapgolly.mendixmodelsdk.nativepagesMod.nativepages.NativePlaceholder = js.native
    /**
      * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
      * The new NativePlaceholder will be automatically stored in the 'widgets' property
      * of the parent pages.GroupBox element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    def createInGroupBoxUnderWidgets(container: GroupBox): typingsJapgolly.mendixmodelsdk.nativepagesMod.nativepages.NativePlaceholder = js.native
    /**
      * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
      * The new NativePlaceholder will be automatically stored in the 'leftWidgets' property
      * of the parent pages.Header element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    def createInHeaderUnderLeftWidgets(container: Header): typingsJapgolly.mendixmodelsdk.nativepagesMod.nativepages.NativePlaceholder = js.native
    /**
      * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
      * The new NativePlaceholder will be automatically stored in the 'rightWidgets' property
      * of the parent pages.Header element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    def createInHeaderUnderRightWidgets(container: Header): typingsJapgolly.mendixmodelsdk.nativepagesMod.nativepages.NativePlaceholder = js.native
    /**
      * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
      * The new NativePlaceholder will be automatically stored in the 'widgets' property
      * of the parent pages.LayoutCallArgument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    def createInLayoutCallArgumentUnderWidgets(container: LayoutCallArgument): typingsJapgolly.mendixmodelsdk.nativepagesMod.nativepages.NativePlaceholder = js.native
    /**
      * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
      * The new NativePlaceholder will be automatically stored in the 'widgets' property
      * of the parent pages.LayoutGridColumn element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    def createInLayoutGridColumnUnderWidgets(container: LayoutGridColumn): typingsJapgolly.mendixmodelsdk.nativepagesMod.nativepages.NativePlaceholder = js.native
    /**
      * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
      * The new NativePlaceholder will be automatically stored in the 'widgets' property
      * of the parent pages.Layout element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    def createInLayoutUnderWidgets(container: Layout): typingsJapgolly.mendixmodelsdk.nativepagesMod.nativepages.NativePlaceholder = js.native
    /**
      * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
      * The new NativePlaceholder will be automatically stored in the 'widgets' property
      * of the parent pages.ListViewTemplate element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    def createInListViewTemplateUnderWidgets(container: ListViewTemplate): typingsJapgolly.mendixmodelsdk.nativepagesMod.nativepages.NativePlaceholder = js.native
    /**
      * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
      * The new NativePlaceholder will be automatically stored in the 'widgets' property
      * of the parent pages.ListView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    def createInListViewUnderWidgets(container: ListView): typingsJapgolly.mendixmodelsdk.nativepagesMod.nativepages.NativePlaceholder = js.native
    /**
      * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
      * The new NativePlaceholder will be automatically stored in the 'widgets' property
      * of the parent NativeLayoutCallArgument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    def createInNativeLayoutCallArgumentUnderWidgets(container: typingsJapgolly.mendixmodelsdk.nativepagesMod.nativepages.NativeLayoutCallArgument): typingsJapgolly.mendixmodelsdk.nativepagesMod.nativepages.NativePlaceholder = js.native
    /**
      * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
      * The new NativePlaceholder will be automatically stored in the 'headerWidget' property
      * of the parent NativeLayout element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    def createInNativeLayoutUnderHeaderWidget(container: typingsJapgolly.mendixmodelsdk.nativepagesMod.nativepages.NativeLayout): typingsJapgolly.mendixmodelsdk.nativepagesMod.nativepages.NativePlaceholder = js.native
    /**
      * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
      * The new NativePlaceholder will be automatically stored in the 'widgets' property
      * of the parent NativeLayout element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    def createInNativeLayoutUnderWidgets(container: typingsJapgolly.mendixmodelsdk.nativepagesMod.nativepages.NativeLayout): typingsJapgolly.mendixmodelsdk.nativepagesMod.nativepages.NativePlaceholder = js.native
    /**
      * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
      * The new NativePlaceholder will be automatically stored in the 'widgets' property
      * of the parent pages.NavigationListItem element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    def createInNavigationListItemUnderWidgets(container: NavigationListItem): typingsJapgolly.mendixmodelsdk.nativepagesMod.nativepages.NativePlaceholder = js.native
    /**
      * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
      * The new NativePlaceholder will be automatically stored in the 'widgets' property
      * of the parent pages.ScrollContainerRegion element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    def createInScrollContainerRegionUnderWidgets(container: ScrollContainerRegion): typingsJapgolly.mendixmodelsdk.nativepagesMod.nativepages.NativePlaceholder = js.native
    /**
      * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
      * The new NativePlaceholder will be automatically stored in the 'widgets' property
      * of the parent pages.Snippet element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    def createInSnippetUnderWidgets(container: Snippet): typingsJapgolly.mendixmodelsdk.nativepagesMod.nativepages.NativePlaceholder = js.native
    /**
      * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
      * The new NativePlaceholder will be automatically stored in the 'firstWidgets' property
      * of the parent pages.SplitPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    def createInSplitPaneUnderFirstWidgets(container: SplitPane): typingsJapgolly.mendixmodelsdk.nativepagesMod.nativepages.NativePlaceholder = js.native
    /**
      * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
      * The new NativePlaceholder will be automatically stored in the 'secondWidgets' property
      * of the parent pages.SplitPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    def createInSplitPaneUnderSecondWidgets(container: SplitPane): typingsJapgolly.mendixmodelsdk.nativepagesMod.nativepages.NativePlaceholder = js.native
    /**
      * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
      * The new NativePlaceholder will be automatically stored in the 'widgets' property
      * of the parent pages.TabPage element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    def createInTabPageUnderWidgets(container: TabPage): typingsJapgolly.mendixmodelsdk.nativepagesMod.nativepages.NativePlaceholder = js.native
    /**
      * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
      * The new NativePlaceholder will be automatically stored in the 'widgets' property
      * of the parent pages.TableCell element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    def createInTableCellUnderWidgets(container: TableCell): typingsJapgolly.mendixmodelsdk.nativepagesMod.nativepages.NativePlaceholder = js.native
    /**
      * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
      * The new NativePlaceholder will be automatically stored in the 'widgets' property
      * of the parent pages.TemplateGridContents element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    def createInTemplateGridContentsUnderWidgets(container: TemplateGridContents): typingsJapgolly.mendixmodelsdk.nativepagesMod.nativepages.NativePlaceholder = js.native
  }
  
}

