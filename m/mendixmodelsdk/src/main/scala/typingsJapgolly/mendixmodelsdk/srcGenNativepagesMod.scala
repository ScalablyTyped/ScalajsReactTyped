package typingsJapgolly.mendixmodelsdk

import typingsJapgolly.mendixmodelsdk.srcGenBaseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetValue
import typingsJapgolly.mendixmodelsdk.srcGenMenusMod.menus.MenuItem
import typingsJapgolly.mendixmodelsdk.srcGenNavigationMod.navigation.NativeNavigationProfile
import typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ActionButton
import typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ActionItem
import typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.AssociationWidget
import typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.AttributeWidget
import typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.BuildingBlock
import typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ClientAction
import typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.DataView
import typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.DivContainer
import typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.DynamicImageViewer
import typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.FormBase
import typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.GridActionButton
import typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.GroupBox
import typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.Header
import typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.IFormBase
import typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ILayoutParameter
import typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.IPage
import typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.Icon
import typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.Layout
import typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.LayoutCallArgument
import typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.LayoutGridColumn
import typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ListView
import typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ListViewTemplate
import typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.NavigationListItem
import typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ReferenceSetSelector
import typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ScrollContainerRegion
import typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.Snippet
import typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.SplitPane
import typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.StaticImageViewer
import typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.TabPage
import typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.TableCell
import typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.TemplateGridContents
import typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.Widget
import typingsJapgolly.mendixmodelsdk.srcGenProjectsMod.projects.FolderBase
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

object srcGenNativepagesMod {
  
  @JSImport("mendixmodelsdk/src/gen/nativepages", "StructureVersionInfo")
  @js.native
  open class StructureVersionInfo protected ()
    extends typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.StructureVersionInfo {
    def this(info: IStructureVersionInfo, structureType: StructureType) = this()
  }
  
  object nativepages {
    
    /**
      * Interfaces and instance classes for types from the Mendix sub meta model `NativePages`.
      */
    /**
      * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
      *
      * @ignore
      *
      * In version 8.0.0: introduced
      */
    @JSImport("mendixmodelsdk/src/gen/nativepages", "nativepages.BottomBarItem")
    @js.native
    open class BottomBarItem protected () extends Element[IModel] {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        unit: ModelUnit[IAbstractModel],
        container: AbstractElement[IAbstractModel, Container]
      ) = this()
      
      /**
        * In version 8.15.0: deleted
        */
      def action: ClientAction = js.native
      def action_=(newValue: ClientAction): Unit = js.native
      
      def caption: Text = js.native
      def caption_=(newValue: Text): Unit = js.native
      
      def containerAsNativeNavigationProfile: NativeNavigationProfile = js.native
      
      def icon: Icon | Null = js.native
      def icon_=(newValue: Icon | Null): Unit = js.native
      
      /**
        * In version 8.15.0: introduced
        */
      def page: IPage | Null = js.native
      
      def pageQualifiedName: String | Null = js.native
      
      def page_=(newValue: IPage | Null): Unit = js.native
    }
    object BottomBarItem {
      
      @JSImport("mendixmodelsdk/src/gen/nativepages", "nativepages.BottomBarItem")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates and returns a new BottomBarItem instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      /* static member */
      inline def create(model: IModel): BottomBarItem = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[BottomBarItem]
      
      /**
        * Creates and returns a new BottomBarItem instance in the SDK and on the server.
        * The new BottomBarItem will be automatically stored in the 'bottomBarItems' property
        * of the parent navigation.NativeNavigationProfile element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  8.0.0 and higher
        */
      /* static member */
      inline def createIn(container: NativeNavigationProfile): BottomBarItem = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[BottomBarItem]
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/nativepages", "nativepages.BottomBarItem.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/nativepages", "nativepages.BottomBarItem.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    /**
      * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
      *
      * @ignore
      *
      * In version 8.0.0: deleted
      * In version 7.21.0: introduced
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
    - typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.IFormBase because Already inherited
    - typingsJapgolly.mendixmodelsdk.srcGenNativepagesMod.nativepages.INativeLayout because var conflicts: containerAsFolderBase, id, isLoaded, model, structureTypeName, unit. Inlined  */ @JSImport("mendixmodelsdk/src/gen/nativepages", "nativepages.NativeLayout")
    @js.native
    open class NativeLayout protected () extends FormBase {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        container: IFolderBase
      ) = this()
      
      @JSName("containerAsFolderBase")
      def containerAsFolderBase_MNativeLayout: FolderBase = js.native
      
      /**
        * In version 7.22.0: introduced
        */
      def headerWidget: Widget | Null = js.native
      def headerWidget_=(newValue: Widget | Null): Unit = js.native
      
      def widgets: IList[Widget] = js.native
    }
    object NativeLayout {
      
      @JSImport("mendixmodelsdk/src/gen/nativepages", "nativepages.NativeLayout")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates a new NativeLayout unit in the SDK and on the server.
        * Expects one argument, the projects.IFolderBase in which this unit is contained.
        */
      /* static member */
      inline def createIn(container: IFolderBase): NativeLayout = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[NativeLayout]
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/nativepages", "nativepages.NativeLayout.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/nativepages", "nativepages.NativeLayout.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    /**
      * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
      *
      * @ignore
      *
      * In version 8.0.0: deleted
      * In version 7.23.0: introduced
      */
    @JSImport("mendixmodelsdk/src/gen/nativepages", "nativepages.NativeLayoutCallArgument")
    @js.native
    open class NativeLayoutCallArgument protected () extends Element[IModel] {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        unit: ModelUnit[IAbstractModel],
        container: AbstractElement[IAbstractModel, Container]
      ) = this()
      
      def containerAsNativePage: NativePage = js.native
      
      def parameter: ILayoutParameter = js.native
      
      def parameterQualifiedName: String = js.native
      
      def parameter_=(newValue: ILayoutParameter): Unit = js.native
      
      def widgets: IList[Widget] = js.native
    }
    object NativeLayoutCallArgument {
      
      @JSImport("mendixmodelsdk/src/gen/nativepages", "nativepages.NativeLayoutCallArgument")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates and returns a new NativeLayoutCallArgument instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      /* static member */
      inline def create(model: IModel): NativeLayoutCallArgument = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[NativeLayoutCallArgument]
      
      /**
        * Creates and returns a new NativeLayoutCallArgument instance in the SDK and on the server.
        * The new NativeLayoutCallArgument will be automatically stored in the 'arguments' property
        * of the parent NativePage element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.23.0 to 7.23.0
        */
      /* static member */
      inline def createIn(container: NativePage): NativeLayoutCallArgument = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[NativeLayoutCallArgument]
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/nativepages", "nativepages.NativeLayoutCallArgument.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/nativepages", "nativepages.NativeLayoutCallArgument.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    /**
      * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
      *
      * @ignore
      *
      * In version 8.0.0: deleted
      * In version 7.21.0: introduced
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
    - typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.IFormBase because Already inherited
    - typingsJapgolly.mendixmodelsdk.srcGenNativepagesMod.nativepages.INativePage because var conflicts: containerAsFolderBase, id, isLoaded, model, structureTypeName, unit. Inlined  */ @JSImport("mendixmodelsdk/src/gen/nativepages", "nativepages.NativePage")
    @js.native
    open class NativePage protected () extends FormBase {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        container: IFolderBase
      ) = this()
      
      /**
        * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
        *
        * @ignore
        *
        * In version 7.23.0: introduced
        */
      def arguments: IList[NativeLayoutCallArgument] = js.native
      
      @JSName("containerAsFolderBase")
      def containerAsFolderBase_MNativePage: FolderBase = js.native
      
      /**
        * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
        *
        * @ignore
        */
      def layout: INativeLayout = js.native
      
      def layoutQualifiedName: String = js.native
      
      def layout_=(newValue: INativeLayout): Unit = js.native
    }
    object NativePage {
      
      @JSImport("mendixmodelsdk/src/gen/nativepages", "nativepages.NativePage")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates a new NativePage unit in the SDK and on the server.
        * Expects one argument, the projects.IFolderBase in which this unit is contained.
        */
      /* static member */
      inline def createIn(container: IFolderBase): NativePage = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[NativePage]
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/nativepages", "nativepages.NativePage.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/nativepages", "nativepages.NativePage.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    /**
      * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
      *
      * @ignore
      *
      * In version 8.0.0: deleted
      * In version 7.23.0: introduced
      */
    @JSImport("mendixmodelsdk/src/gen/nativepages", "nativepages.NativePageClientAction")
    @js.native
    open class NativePageClientAction protected () extends ClientAction {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        unit: ModelUnit[IAbstractModel],
        container: AbstractElement[IAbstractModel, Container]
      ) = this()
      
      /**
        * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
        *
        * @ignore
        */
      def page: INativePage | Null = js.native
      
      def pageQualifiedName: String | Null = js.native
      
      def page_=(newValue: INativePage | Null): Unit = js.native
    }
    object NativePageClientAction {
      
      @JSImport("mendixmodelsdk/src/gen/nativepages", "nativepages.NativePageClientAction")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates and returns a new NativePageClientAction instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      /* static member */
      inline def create(model: IModel): NativePageClientAction = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[NativePageClientAction]
      
      /**
        * Creates and returns a new NativePageClientAction instance in the SDK and on the server.
        * The new NativePageClientAction will be automatically stored in the 'action' property
        * of the parent pages.ActionButton element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.23.0 to 7.23.0
        */
      /* static member */
      inline def createInActionButtonUnderAction(container: ActionButton): NativePageClientAction = ^.asInstanceOf[js.Dynamic].applyDynamic("createInActionButtonUnderAction")(container.asInstanceOf[js.Any]).asInstanceOf[NativePageClientAction]
      
      /**
        * Creates and returns a new NativePageClientAction instance in the SDK and on the server.
        * The new NativePageClientAction will be automatically stored in the 'action' property
        * of the parent pages.ActionItem element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.23.0 to 7.23.0
        */
      /* static member */
      inline def createInActionItemUnderAction(container: ActionItem): NativePageClientAction = ^.asInstanceOf[js.Dynamic].applyDynamic("createInActionItemUnderAction")(container.asInstanceOf[js.Any]).asInstanceOf[NativePageClientAction]
      
      /**
        * Creates and returns a new NativePageClientAction instance in the SDK and on the server.
        * The new NativePageClientAction will be automatically stored in the 'onChangeAction' property
        * of the parent pages.AssociationWidget element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.23.0 to 7.23.0
        */
      /* static member */
      inline def createInAssociationWidgetUnderOnChangeAction(container: AssociationWidget): NativePageClientAction = ^.asInstanceOf[js.Dynamic].applyDynamic("createInAssociationWidgetUnderOnChangeAction")(container.asInstanceOf[js.Any]).asInstanceOf[NativePageClientAction]
      
      /**
        * Creates and returns a new NativePageClientAction instance in the SDK and on the server.
        * The new NativePageClientAction will be automatically stored in the 'onChangeAction' property
        * of the parent pages.AttributeWidget element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.23.0 to 7.23.0
        */
      /* static member */
      inline def createInAttributeWidgetUnderOnChangeAction(container: AttributeWidget): NativePageClientAction = ^.asInstanceOf[js.Dynamic].applyDynamic("createInAttributeWidgetUnderOnChangeAction")(container.asInstanceOf[js.Any]).asInstanceOf[NativePageClientAction]
      
      /**
        * Creates and returns a new NativePageClientAction instance in the SDK and on the server.
        * The new NativePageClientAction will be automatically stored in the 'onEnterAction' property
        * of the parent pages.AttributeWidget element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.23.0 to 7.23.0
        */
      /* static member */
      inline def createInAttributeWidgetUnderOnEnterAction(container: AttributeWidget): NativePageClientAction = ^.asInstanceOf[js.Dynamic].applyDynamic("createInAttributeWidgetUnderOnEnterAction")(container.asInstanceOf[js.Any]).asInstanceOf[NativePageClientAction]
      
      /**
        * Creates and returns a new NativePageClientAction instance in the SDK and on the server.
        * The new NativePageClientAction will be automatically stored in the 'onLeaveAction' property
        * of the parent pages.AttributeWidget element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.23.0 to 7.23.0
        */
      /* static member */
      inline def createInAttributeWidgetUnderOnLeaveAction(container: AttributeWidget): NativePageClientAction = ^.asInstanceOf[js.Dynamic].applyDynamic("createInAttributeWidgetUnderOnLeaveAction")(container.asInstanceOf[js.Any]).asInstanceOf[NativePageClientAction]
      
      /**
        * Creates and returns a new NativePageClientAction instance in the SDK and on the server.
        * The new NativePageClientAction will be automatically stored in the 'clickAction' property
        * of the parent pages.DynamicImageViewer element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.23.0 to 7.23.0
        */
      /* static member */
      inline def createInDynamicImageViewerUnderClickAction(container: DynamicImageViewer): NativePageClientAction = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDynamicImageViewerUnderClickAction")(container.asInstanceOf[js.Any]).asInstanceOf[NativePageClientAction]
      
      /**
        * Creates and returns a new NativePageClientAction instance in the SDK and on the server.
        * The new NativePageClientAction will be automatically stored in the 'action' property
        * of the parent pages.GridActionButton element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.23.0 to 7.23.0
        */
      /* static member */
      inline def createInGridActionButtonUnderAction(container: GridActionButton): NativePageClientAction = ^.asInstanceOf[js.Dynamic].applyDynamic("createInGridActionButtonUnderAction")(container.asInstanceOf[js.Any]).asInstanceOf[NativePageClientAction]
      
      /**
        * Creates and returns a new NativePageClientAction instance in the SDK and on the server.
        * The new NativePageClientAction will be automatically stored in the 'clickAction' property
        * of the parent pages.ListView element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.23.0 to 7.23.0
        */
      /* static member */
      inline def createInListViewUnderClickAction(container: ListView): NativePageClientAction = ^.asInstanceOf[js.Dynamic].applyDynamic("createInListViewUnderClickAction")(container.asInstanceOf[js.Any]).asInstanceOf[NativePageClientAction]
      
      /**
        * Creates and returns a new NativePageClientAction instance in the SDK and on the server.
        * The new NativePageClientAction will be automatically stored in the 'action' property
        * of the parent menus.MenuItem element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.23.0 to 7.23.0
        */
      /* static member */
      inline def createInMenuItemUnderAction(container: MenuItem): NativePageClientAction = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMenuItemUnderAction")(container.asInstanceOf[js.Any]).asInstanceOf[NativePageClientAction]
      
      /**
        * Creates and returns a new NativePageClientAction instance in the SDK and on the server.
        * The new NativePageClientAction will be automatically stored in the 'onChangeAction' property
        * of the parent pages.ReferenceSetSelector element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.23.0 to 7.23.0
        */
      /* static member */
      inline def createInReferenceSetSelectorUnderOnChangeAction(container: ReferenceSetSelector): NativePageClientAction = ^.asInstanceOf[js.Dynamic].applyDynamic("createInReferenceSetSelectorUnderOnChangeAction")(container.asInstanceOf[js.Any]).asInstanceOf[NativePageClientAction]
      
      /**
        * Creates and returns a new NativePageClientAction instance in the SDK and on the server.
        * The new NativePageClientAction will be automatically stored in the 'clickAction' property
        * of the parent pages.StaticImageViewer element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.23.0 to 7.23.0
        */
      /* static member */
      inline def createInStaticImageViewerUnderClickAction(container: StaticImageViewer): NativePageClientAction = ^.asInstanceOf[js.Dynamic].applyDynamic("createInStaticImageViewerUnderClickAction")(container.asInstanceOf[js.Any]).asInstanceOf[NativePageClientAction]
      
      /**
        * Creates and returns a new NativePageClientAction instance in the SDK and on the server.
        * The new NativePageClientAction will be automatically stored in the 'action' property
        * of the parent customwidgets.WidgetValue element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.23.0 to 7.23.0
        */
      /* static member */
      inline def createInWidgetValueUnderAction(container: WidgetValue): NativePageClientAction = ^.asInstanceOf[js.Dynamic].applyDynamic("createInWidgetValueUnderAction")(container.asInstanceOf[js.Any]).asInstanceOf[NativePageClientAction]
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/nativepages", "nativepages.NativePageClientAction.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/nativepages", "nativepages.NativePageClientAction.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    /**
      * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
      *
      * @ignore
      *
      * In version 8.0.0: deleted
      * In version 7.23.0: introduced
      */
    @JSImport("mendixmodelsdk/src/gen/nativepages", "nativepages.NativePlaceholder")
    @js.native
    open class NativePlaceholder protected () extends Widget {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        unit: ModelUnit[IAbstractModel],
        container: AbstractElement[IAbstractModel, Container]
      ) = this()
    }
    object NativePlaceholder {
      
      @JSImport("mendixmodelsdk/src/gen/nativepages", "nativepages.NativePlaceholder")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      /* static member */
      inline def create(model: IModel): NativePlaceholder = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[NativePlaceholder]
      
      /**
        * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
        * The new NativePlaceholder will be automatically stored in the 'widgets' property
        * of the parent pages.BuildingBlock element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.23.0 to 7.23.0
        */
      /* static member */
      inline def createInBuildingBlockUnderWidgets(container: BuildingBlock): NativePlaceholder = ^.asInstanceOf[js.Dynamic].applyDynamic("createInBuildingBlockUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[NativePlaceholder]
      
      /**
        * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
        * The new NativePlaceholder will be automatically stored in the 'footerWidgets' property
        * of the parent pages.DataView element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.23.0 to 7.23.0
        */
      /* static member */
      inline def createInDataViewUnderFooterWidgets(container: DataView): NativePlaceholder = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDataViewUnderFooterWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[NativePlaceholder]
      
      /**
        * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
        * The new NativePlaceholder will be automatically stored in the 'widgets' property
        * of the parent pages.DataView element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.23.0 to 7.23.0
        */
      /* static member */
      inline def createInDataViewUnderWidgets(container: DataView): NativePlaceholder = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDataViewUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[NativePlaceholder]
      
      /**
        * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
        * The new NativePlaceholder will be automatically stored in the 'widgets' property
        * of the parent pages.DivContainer element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.23.0 to 7.23.0
        */
      /* static member */
      inline def createInDivContainerUnderWidgets(container: DivContainer): NativePlaceholder = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDivContainerUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[NativePlaceholder]
      
      /**
        * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
        * The new NativePlaceholder will be automatically stored in the 'widgets' property
        * of the parent pages.GroupBox element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.23.0 to 7.23.0
        */
      /* static member */
      inline def createInGroupBoxUnderWidgets(container: GroupBox): NativePlaceholder = ^.asInstanceOf[js.Dynamic].applyDynamic("createInGroupBoxUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[NativePlaceholder]
      
      /**
        * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
        * The new NativePlaceholder will be automatically stored in the 'leftWidgets' property
        * of the parent pages.Header element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.23.0 to 7.23.0
        */
      /* static member */
      inline def createInHeaderUnderLeftWidgets(container: Header): NativePlaceholder = ^.asInstanceOf[js.Dynamic].applyDynamic("createInHeaderUnderLeftWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[NativePlaceholder]
      
      /**
        * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
        * The new NativePlaceholder will be automatically stored in the 'rightWidgets' property
        * of the parent pages.Header element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.23.0 to 7.23.0
        */
      /* static member */
      inline def createInHeaderUnderRightWidgets(container: Header): NativePlaceholder = ^.asInstanceOf[js.Dynamic].applyDynamic("createInHeaderUnderRightWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[NativePlaceholder]
      
      /**
        * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
        * The new NativePlaceholder will be automatically stored in the 'widgets' property
        * of the parent pages.LayoutCallArgument element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.23.0 to 7.23.0
        */
      /* static member */
      inline def createInLayoutCallArgumentUnderWidgets(container: LayoutCallArgument): NativePlaceholder = ^.asInstanceOf[js.Dynamic].applyDynamic("createInLayoutCallArgumentUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[NativePlaceholder]
      
      /**
        * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
        * The new NativePlaceholder will be automatically stored in the 'widgets' property
        * of the parent pages.LayoutGridColumn element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.23.0 to 7.23.0
        */
      /* static member */
      inline def createInLayoutGridColumnUnderWidgets(container: LayoutGridColumn): NativePlaceholder = ^.asInstanceOf[js.Dynamic].applyDynamic("createInLayoutGridColumnUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[NativePlaceholder]
      
      /**
        * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
        * The new NativePlaceholder will be automatically stored in the 'widgets' property
        * of the parent pages.Layout element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.23.0 to 7.23.0
        */
      /* static member */
      inline def createInLayoutUnderWidgets(container: Layout): NativePlaceholder = ^.asInstanceOf[js.Dynamic].applyDynamic("createInLayoutUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[NativePlaceholder]
      
      /**
        * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
        * The new NativePlaceholder will be automatically stored in the 'widgets' property
        * of the parent pages.ListViewTemplate element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.23.0 to 7.23.0
        */
      /* static member */
      inline def createInListViewTemplateUnderWidgets(container: ListViewTemplate): NativePlaceholder = ^.asInstanceOf[js.Dynamic].applyDynamic("createInListViewTemplateUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[NativePlaceholder]
      
      /**
        * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
        * The new NativePlaceholder will be automatically stored in the 'widgets' property
        * of the parent pages.ListView element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.23.0 to 7.23.0
        */
      /* static member */
      inline def createInListViewUnderWidgets(container: ListView): NativePlaceholder = ^.asInstanceOf[js.Dynamic].applyDynamic("createInListViewUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[NativePlaceholder]
      
      /**
        * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
        * The new NativePlaceholder will be automatically stored in the 'widgets' property
        * of the parent NativeLayoutCallArgument element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.23.0 to 7.23.0
        */
      /* static member */
      inline def createInNativeLayoutCallArgumentUnderWidgets(container: NativeLayoutCallArgument): NativePlaceholder = ^.asInstanceOf[js.Dynamic].applyDynamic("createInNativeLayoutCallArgumentUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[NativePlaceholder]
      
      /**
        * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
        * The new NativePlaceholder will be automatically stored in the 'headerWidget' property
        * of the parent NativeLayout element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.23.0 to 7.23.0
        */
      /* static member */
      inline def createInNativeLayoutUnderHeaderWidget(container: NativeLayout): NativePlaceholder = ^.asInstanceOf[js.Dynamic].applyDynamic("createInNativeLayoutUnderHeaderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[NativePlaceholder]
      
      /**
        * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
        * The new NativePlaceholder will be automatically stored in the 'widgets' property
        * of the parent NativeLayout element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.23.0 to 7.23.0
        */
      /* static member */
      inline def createInNativeLayoutUnderWidgets(container: NativeLayout): NativePlaceholder = ^.asInstanceOf[js.Dynamic].applyDynamic("createInNativeLayoutUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[NativePlaceholder]
      
      /**
        * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
        * The new NativePlaceholder will be automatically stored in the 'widgets' property
        * of the parent pages.NavigationListItem element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.23.0 to 7.23.0
        */
      /* static member */
      inline def createInNavigationListItemUnderWidgets(container: NavigationListItem): NativePlaceholder = ^.asInstanceOf[js.Dynamic].applyDynamic("createInNavigationListItemUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[NativePlaceholder]
      
      /**
        * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
        * The new NativePlaceholder will be automatically stored in the 'widgets' property
        * of the parent pages.ScrollContainerRegion element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.23.0 to 7.23.0
        */
      /* static member */
      inline def createInScrollContainerRegionUnderWidgets(container: ScrollContainerRegion): NativePlaceholder = ^.asInstanceOf[js.Dynamic].applyDynamic("createInScrollContainerRegionUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[NativePlaceholder]
      
      /**
        * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
        * The new NativePlaceholder will be automatically stored in the 'widgets' property
        * of the parent pages.Snippet element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.23.0 to 7.23.0
        */
      /* static member */
      inline def createInSnippetUnderWidgets(container: Snippet): NativePlaceholder = ^.asInstanceOf[js.Dynamic].applyDynamic("createInSnippetUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[NativePlaceholder]
      
      /**
        * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
        * The new NativePlaceholder will be automatically stored in the 'firstWidgets' property
        * of the parent pages.SplitPane element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.23.0 to 7.23.0
        */
      /* static member */
      inline def createInSplitPaneUnderFirstWidgets(container: SplitPane): NativePlaceholder = ^.asInstanceOf[js.Dynamic].applyDynamic("createInSplitPaneUnderFirstWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[NativePlaceholder]
      
      /**
        * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
        * The new NativePlaceholder will be automatically stored in the 'secondWidgets' property
        * of the parent pages.SplitPane element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.23.0 to 7.23.0
        */
      /* static member */
      inline def createInSplitPaneUnderSecondWidgets(container: SplitPane): NativePlaceholder = ^.asInstanceOf[js.Dynamic].applyDynamic("createInSplitPaneUnderSecondWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[NativePlaceholder]
      
      /**
        * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
        * The new NativePlaceholder will be automatically stored in the 'widgets' property
        * of the parent pages.TabPage element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.23.0 to 7.23.0
        */
      /* static member */
      inline def createInTabPageUnderWidgets(container: TabPage): NativePlaceholder = ^.asInstanceOf[js.Dynamic].applyDynamic("createInTabPageUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[NativePlaceholder]
      
      /**
        * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
        * The new NativePlaceholder will be automatically stored in the 'widgets' property
        * of the parent pages.TableCell element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.23.0 to 7.23.0
        */
      /* static member */
      inline def createInTableCellUnderWidgets(container: TableCell): NativePlaceholder = ^.asInstanceOf[js.Dynamic].applyDynamic("createInTableCellUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[NativePlaceholder]
      
      /**
        * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
        * The new NativePlaceholder will be automatically stored in the 'widgets' property
        * of the parent pages.TemplateGridContents element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.23.0 to 7.23.0
        */
      /* static member */
      inline def createInTemplateGridContentsUnderWidgets(container: TemplateGridContents): NativePlaceholder = ^.asInstanceOf[js.Dynamic].applyDynamic("createInTemplateGridContentsUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[NativePlaceholder]
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/nativepages", "nativepages.NativePlaceholder.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/nativepages", "nativepages.NativePlaceholder.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    /**
      * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
      *
      * @ignore
      *
      * In version 8.0.0: deleted
      * In version 7.21.0: introduced
      */
    @js.native
    trait INativeLayout
      extends StObject
         with IFormBase
    
    /**
      * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
      *
      * @ignore
      *
      * In version 8.0.0: deleted
      * In version 7.21.0: introduced
      */
    @js.native
    trait INativePage
      extends StObject
         with IFormBase
  }
}
