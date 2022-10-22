package typingsJapgolly.mendixmodelsdk.mod

import typingsJapgolly.mendixmodelsdk.srcGenBaseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.srcGenNativepagesMod.nativepages.NativeLayout
import typingsJapgolly.mendixmodelsdk.srcGenNativepagesMod.nativepages.NativeLayoutCallArgument
import typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.BuildingBlock
import typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.DataView
import typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.DivContainer
import typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.EntityWidget
import typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.GroupBox
import typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.Header
import typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.Layout
import typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.LayoutCallArgument
import typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.LayoutGridColumn
import typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ListView
import typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ListViewTemplate
import typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.MasterDetailRegion
import typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.NativeLayoutContent
import typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.NavigationListItem
import typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ScrollContainerRegion
import typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.Snippet
import typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.SplitPane
import typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.TabPage
import typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.TableCell
import typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.TemplateGridContents
import typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.VerticalFlow
import typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.WebLayoutContent
import typingsJapgolly.mendixmodelsdk.srcGenReportsMod.reports.ReportPane
import typingsJapgolly.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typingsJapgolly.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
import typingsJapgolly.mendixmodelsdk.srcSdkInternalVersionChecksMod.ILifeCycle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object customwidgets {
  
  /**
    * Interfaces and instance classes for types from the Mendix sub meta model `CustomWidgets`.
    */
  @JSImport("mendixmodelsdk", "customwidgets.CustomWidget")
  @js.native
  open class CustomWidget protected ()
    extends typingsJapgolly.mendixmodelsdk.srcGenAllModelClassesMod.customwidgets.CustomWidget {
    def this(
      model: typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.ModelUnit[IAbstractModel],
      container: typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object CustomWidget {
    
    @JSImport("mendixmodelsdk", "customwidgets.CustomWidget")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    inline def create(model: IModel): typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget]
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widget' property
      * of the parent pages.BuildingBlock element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.7.0 to 7.14.0
      */
    /* static member */
    inline def createInBuildingBlockUnderWidget(container: BuildingBlock): typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget = ^.asInstanceOf[js.Dynamic].applyDynamic("createInBuildingBlockUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget]
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widgets' property
      * of the parent pages.BuildingBlock element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    inline def createInBuildingBlockUnderWidgets(container: BuildingBlock): typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget = ^.asInstanceOf[js.Dynamic].applyDynamic("createInBuildingBlockUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget]
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'footerWidget' property
      * of the parent pages.DataView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.7.0 to 7.14.0
      */
    /* static member */
    inline def createInDataViewUnderFooterWidget(container: DataView): typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDataViewUnderFooterWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget]
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'footerWidgets' property
      * of the parent pages.DataView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    inline def createInDataViewUnderFooterWidgets(container: DataView): typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDataViewUnderFooterWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget]
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widget' property
      * of the parent pages.DataView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    inline def createInDataViewUnderWidget(container: DataView): typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDataViewUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget]
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widgets' property
      * of the parent pages.DataView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    inline def createInDataViewUnderWidgets(container: DataView): typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDataViewUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget]
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widget' property
      * of the parent pages.DivContainer element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    inline def createInDivContainerUnderWidget(container: DivContainer): typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDivContainerUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget]
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widgets' property
      * of the parent pages.DivContainer element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    inline def createInDivContainerUnderWidgets(container: DivContainer): typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDivContainerUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget]
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widget' property
      * of the parent pages.GroupBox element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    inline def createInGroupBoxUnderWidget(container: GroupBox): typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget = ^.asInstanceOf[js.Dynamic].applyDynamic("createInGroupBoxUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget]
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widgets' property
      * of the parent pages.GroupBox element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    inline def createInGroupBoxUnderWidgets(container: GroupBox): typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget = ^.asInstanceOf[js.Dynamic].applyDynamic("createInGroupBoxUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget]
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'leftWidget' property
      * of the parent pages.Header element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    inline def createInHeaderUnderLeftWidget(container: Header): typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget = ^.asInstanceOf[js.Dynamic].applyDynamic("createInHeaderUnderLeftWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget]
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'leftWidgets' property
      * of the parent pages.Header element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    inline def createInHeaderUnderLeftWidgets(container: Header): typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget = ^.asInstanceOf[js.Dynamic].applyDynamic("createInHeaderUnderLeftWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget]
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'rightWidget' property
      * of the parent pages.Header element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    inline def createInHeaderUnderRightWidget(container: Header): typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget = ^.asInstanceOf[js.Dynamic].applyDynamic("createInHeaderUnderRightWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget]
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'rightWidgets' property
      * of the parent pages.Header element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    inline def createInHeaderUnderRightWidgets(container: Header): typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget = ^.asInstanceOf[js.Dynamic].applyDynamic("createInHeaderUnderRightWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget]
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widget' property
      * of the parent pages.LayoutCallArgument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    inline def createInLayoutCallArgumentUnderWidget(container: LayoutCallArgument): typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget = ^.asInstanceOf[js.Dynamic].applyDynamic("createInLayoutCallArgumentUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget]
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widgets' property
      * of the parent pages.LayoutCallArgument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    inline def createInLayoutCallArgumentUnderWidgets(container: LayoutCallArgument): typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget = ^.asInstanceOf[js.Dynamic].applyDynamic("createInLayoutCallArgumentUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget]
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widget' property
      * of the parent pages.LayoutGridColumn element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    inline def createInLayoutGridColumnUnderWidget(container: LayoutGridColumn): typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget = ^.asInstanceOf[js.Dynamic].applyDynamic("createInLayoutGridColumnUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget]
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widgets' property
      * of the parent pages.LayoutGridColumn element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    inline def createInLayoutGridColumnUnderWidgets(container: LayoutGridColumn): typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget = ^.asInstanceOf[js.Dynamic].applyDynamic("createInLayoutGridColumnUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget]
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widget' property
      * of the parent pages.Layout element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    inline def createInLayoutUnderWidget(container: Layout): typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget = ^.asInstanceOf[js.Dynamic].applyDynamic("createInLayoutUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget]
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widgets' property
      * of the parent pages.Layout element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 to 7.23.0
      */
    /* static member */
    inline def createInLayoutUnderWidgets(container: Layout): typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget = ^.asInstanceOf[js.Dynamic].applyDynamic("createInLayoutUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget]
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widget' property
      * of the parent pages.ListViewTemplate element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    inline def createInListViewTemplateUnderWidget(container: ListViewTemplate): typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget = ^.asInstanceOf[js.Dynamic].applyDynamic("createInListViewTemplateUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget]
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widgets' property
      * of the parent pages.ListViewTemplate element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    inline def createInListViewTemplateUnderWidgets(container: ListViewTemplate): typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget = ^.asInstanceOf[js.Dynamic].applyDynamic("createInListViewTemplateUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget]
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widget' property
      * of the parent pages.ListView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    inline def createInListViewUnderWidget(container: ListView): typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget = ^.asInstanceOf[js.Dynamic].applyDynamic("createInListViewUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget]
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widgets' property
      * of the parent pages.ListView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    inline def createInListViewUnderWidgets(container: ListView): typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget = ^.asInstanceOf[js.Dynamic].applyDynamic("createInListViewUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget]
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widget' property
      * of the parent pages.MasterDetailRegion element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.1.0 to 7.14.0
      */
    /* static member */
    inline def createInMasterDetailRegionUnderWidget(container: MasterDetailRegion): typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMasterDetailRegionUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget]
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widgets' property
      * of the parent nativepages.NativeLayoutCallArgument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    /* static member */
    inline def createInNativeLayoutCallArgumentUnderWidgets(container: NativeLayoutCallArgument): typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget = ^.asInstanceOf[js.Dynamic].applyDynamic("createInNativeLayoutCallArgumentUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget]
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'sidebarWidgets' property
      * of the parent pages.NativeLayoutContent element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.5.0 and higher
      */
    /* static member */
    inline def createInNativeLayoutContentUnderSidebarWidgets(container: NativeLayoutContent): typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget = ^.asInstanceOf[js.Dynamic].applyDynamic("createInNativeLayoutContentUnderSidebarWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget]
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widgets' property
      * of the parent pages.NativeLayoutContent element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.0.0 and higher
      */
    /* static member */
    inline def createInNativeLayoutContentUnderWidgets(container: NativeLayoutContent): typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget = ^.asInstanceOf[js.Dynamic].applyDynamic("createInNativeLayoutContentUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget]
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'headerWidget' property
      * of the parent nativepages.NativeLayout element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.22.0 to 7.23.0
      */
    /* static member */
    inline def createInNativeLayoutUnderHeaderWidget(container: NativeLayout): typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget = ^.asInstanceOf[js.Dynamic].applyDynamic("createInNativeLayoutUnderHeaderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget]
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widgets' property
      * of the parent nativepages.NativeLayout element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.21.0 to 7.23.0
      */
    /* static member */
    inline def createInNativeLayoutUnderWidgets(container: NativeLayout): typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget = ^.asInstanceOf[js.Dynamic].applyDynamic("createInNativeLayoutUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget]
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widget' property
      * of the parent pages.NavigationListItem element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    inline def createInNavigationListItemUnderWidget(container: NavigationListItem): typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget = ^.asInstanceOf[js.Dynamic].applyDynamic("createInNavigationListItemUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget]
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widgets' property
      * of the parent pages.NavigationListItem element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    inline def createInNavigationListItemUnderWidgets(container: NavigationListItem): typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget = ^.asInstanceOf[js.Dynamic].applyDynamic("createInNavigationListItemUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget]
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'parameterWidget' property
      * of the parent reports.ReportPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 6.9.0
      */
    /* static member */
    inline def createInReportPaneUnderParameterWidget(container: ReportPane): typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget = ^.asInstanceOf[js.Dynamic].applyDynamic("createInReportPaneUnderParameterWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget]
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'reportWidget' property
      * of the parent reports.ReportPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 6.9.0
      */
    /* static member */
    inline def createInReportPaneUnderReportWidget(container: ReportPane): typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget = ^.asInstanceOf[js.Dynamic].applyDynamic("createInReportPaneUnderReportWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget]
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widget' property
      * of the parent pages.ScrollContainerRegion element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    inline def createInScrollContainerRegionUnderWidget(container: ScrollContainerRegion): typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget = ^.asInstanceOf[js.Dynamic].applyDynamic("createInScrollContainerRegionUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget]
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widgets' property
      * of the parent pages.ScrollContainerRegion element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    inline def createInScrollContainerRegionUnderWidgets(container: ScrollContainerRegion): typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget = ^.asInstanceOf[js.Dynamic].applyDynamic("createInScrollContainerRegionUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget]
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widget' property
      * of the parent pages.Snippet element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    inline def createInSnippetUnderWidget(container: Snippet): typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget = ^.asInstanceOf[js.Dynamic].applyDynamic("createInSnippetUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget]
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widgets' property
      * of the parent pages.Snippet element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    inline def createInSnippetUnderWidgets(container: Snippet): typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget = ^.asInstanceOf[js.Dynamic].applyDynamic("createInSnippetUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget]
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'firstWidget' property
      * of the parent pages.SplitPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    inline def createInSplitPaneUnderFirstWidget(container: SplitPane): typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget = ^.asInstanceOf[js.Dynamic].applyDynamic("createInSplitPaneUnderFirstWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget]
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'firstWidgets' property
      * of the parent pages.SplitPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 to 7.23.0
      */
    /* static member */
    inline def createInSplitPaneUnderFirstWidgets(container: SplitPane): typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget = ^.asInstanceOf[js.Dynamic].applyDynamic("createInSplitPaneUnderFirstWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget]
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'secondWidget' property
      * of the parent pages.SplitPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    inline def createInSplitPaneUnderSecondWidget(container: SplitPane): typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget = ^.asInstanceOf[js.Dynamic].applyDynamic("createInSplitPaneUnderSecondWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget]
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'secondWidgets' property
      * of the parent pages.SplitPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 to 7.23.0
      */
    /* static member */
    inline def createInSplitPaneUnderSecondWidgets(container: SplitPane): typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget = ^.asInstanceOf[js.Dynamic].applyDynamic("createInSplitPaneUnderSecondWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget]
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widget' property
      * of the parent pages.TabPage element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    inline def createInTabPageUnderWidget(container: TabPage): typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget = ^.asInstanceOf[js.Dynamic].applyDynamic("createInTabPageUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget]
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widgets' property
      * of the parent pages.TabPage element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    inline def createInTabPageUnderWidgets(container: TabPage): typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget = ^.asInstanceOf[js.Dynamic].applyDynamic("createInTabPageUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget]
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widget' property
      * of the parent pages.TableCell element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    inline def createInTableCellUnderWidget(container: TableCell): typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget = ^.asInstanceOf[js.Dynamic].applyDynamic("createInTableCellUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget]
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widgets' property
      * of the parent pages.TableCell element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    inline def createInTableCellUnderWidgets(container: TableCell): typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget = ^.asInstanceOf[js.Dynamic].applyDynamic("createInTableCellUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget]
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widget' property
      * of the parent pages.TemplateGridContents element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    inline def createInTemplateGridContentsUnderWidget(container: TemplateGridContents): typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget = ^.asInstanceOf[js.Dynamic].applyDynamic("createInTemplateGridContentsUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget]
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widgets' property
      * of the parent pages.TemplateGridContents element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    inline def createInTemplateGridContentsUnderWidgets(container: TemplateGridContents): typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget = ^.asInstanceOf[js.Dynamic].applyDynamic("createInTemplateGridContentsUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget]
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widgets' property
      * of the parent pages.VerticalFlow element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    inline def createInVerticalFlowUnderWidgets(container: VerticalFlow): typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget = ^.asInstanceOf[js.Dynamic].applyDynamic("createInVerticalFlowUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget]
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widgets' property
      * of the parent pages.WebLayoutContent element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.0.0 and higher
      */
    /* static member */
    inline def createInWebLayoutContentUnderWidgets(container: WebLayoutContent): typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget = ^.asInstanceOf[js.Dynamic].applyDynamic("createInWebLayoutContentUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget]
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widgets' property
      * of the parent WidgetValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.2.0 and higher
      */
    /* static member */
    inline def createInWidgetValueUnderWidgets(container: typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetValue): typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget = ^.asInstanceOf[js.Dynamic].applyDynamic("createInWidgetValueUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget]
    
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.CustomWidget.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.CustomWidget.versionInfo")
    @js.native
    def versionInfo: typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk", "customwidgets.CustomWidgetAssociationType")
  @js.native
  open class CustomWidgetAssociationType protected ()
    extends typingsJapgolly.mendixmodelsdk.srcGenAllModelClassesMod.customwidgets.CustomWidgetAssociationType {
    def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
  }
  object CustomWidgetAssociationType {
    
    @JSImport("mendixmodelsdk", "customwidgets.CustomWidgetAssociationType")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.CustomWidgetAssociationType.Reference")
    @js.native
    def Reference: typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidgetAssociationType = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.CustomWidgetAssociationType.ReferenceSet")
    @js.native
    def ReferenceSet: typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidgetAssociationType = js.native
    inline def ReferenceSet_=(x: typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidgetAssociationType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ReferenceSet")(x.asInstanceOf[js.Any])
    
    inline def Reference_=(x: typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidgetAssociationType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Reference")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk", "customwidgets.CustomWidgetAttributeType")
  @js.native
  open class CustomWidgetAttributeType protected ()
    extends typingsJapgolly.mendixmodelsdk.srcGenAllModelClassesMod.customwidgets.CustomWidgetAttributeType {
    def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
  }
  object CustomWidgetAttributeType {
    
    @JSImport("mendixmodelsdk", "customwidgets.CustomWidgetAttributeType")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.CustomWidgetAttributeType.AutoNumber")
    @js.native
    def AutoNumber: typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidgetAttributeType = js.native
    inline def AutoNumber_=(x: typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidgetAttributeType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AutoNumber")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.CustomWidgetAttributeType.Binary")
    @js.native
    def Binary: typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidgetAttributeType = js.native
    inline def Binary_=(x: typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidgetAttributeType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Binary")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.CustomWidgetAttributeType.Boolean")
    @js.native
    def Boolean: typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidgetAttributeType = js.native
    inline def Boolean_=(x: typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidgetAttributeType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Boolean")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.CustomWidgetAttributeType.Currency")
    @js.native
    def Currency: typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidgetAttributeType = js.native
    inline def Currency_=(x: typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidgetAttributeType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Currency")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.CustomWidgetAttributeType.DateTime")
    @js.native
    def DateTime: typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidgetAttributeType = js.native
    inline def DateTime_=(x: typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidgetAttributeType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DateTime")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.CustomWidgetAttributeType.Decimal")
    @js.native
    def Decimal: typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidgetAttributeType = js.native
    inline def Decimal_=(x: typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidgetAttributeType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Decimal")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.CustomWidgetAttributeType.Enum")
    @js.native
    def Enum: typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidgetAttributeType = js.native
    inline def Enum_=(x: typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidgetAttributeType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Enum")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.CustomWidgetAttributeType.Float")
    @js.native
    def Float: typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidgetAttributeType = js.native
    inline def Float_=(x: typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidgetAttributeType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Float")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.CustomWidgetAttributeType.HashString")
    @js.native
    def HashString: typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidgetAttributeType = js.native
    inline def HashString_=(x: typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidgetAttributeType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HashString")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.CustomWidgetAttributeType.Integer")
    @js.native
    def Integer: typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidgetAttributeType = js.native
    inline def Integer_=(x: typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidgetAttributeType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Integer")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.CustomWidgetAttributeType.Long")
    @js.native
    def Long: typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidgetAttributeType = js.native
    inline def Long_=(x: typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidgetAttributeType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Long")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.CustomWidgetAttributeType.String")
    @js.native
    def String: typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidgetAttributeType = js.native
    inline def String_=(x: typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidgetAttributeType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("String")(x.asInstanceOf[js.Any])
  }
  
  /**
    * In version 8.5.0: introduced
    */
  @JSImport("mendixmodelsdk", "customwidgets.CustomWidgetDatabaseSource")
  @js.native
  open class CustomWidgetDatabaseSource protected ()
    extends typingsJapgolly.mendixmodelsdk.srcGenAllModelClassesMod.customwidgets.CustomWidgetDatabaseSource {
    def this(
      model: typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.ModelUnit[IAbstractModel],
      container: typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object CustomWidgetDatabaseSource {
    
    @JSImport("mendixmodelsdk", "customwidgets.CustomWidgetDatabaseSource")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new CustomWidgetDatabaseSource instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    inline def create(model: IModel): typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidgetDatabaseSource = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidgetDatabaseSource]
    
    /**
      * Creates and returns a new CustomWidgetDatabaseSource instance in the SDK and on the server.
      * The new CustomWidgetDatabaseSource will be automatically stored in the 'dataSource' property
      * of the parent pages.EntityWidget element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.5.0 and higher
      */
    /* static member */
    inline def createInEntityWidgetUnderDataSource(container: EntityWidget): typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidgetDatabaseSource = ^.asInstanceOf[js.Dynamic].applyDynamic("createInEntityWidgetUnderDataSource")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidgetDatabaseSource]
    
    /**
      * Creates and returns a new CustomWidgetDatabaseSource instance in the SDK and on the server.
      * The new CustomWidgetDatabaseSource will be automatically stored in the 'dataSource' property
      * of the parent WidgetValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.5.0 and higher
      */
    /* static member */
    inline def createInWidgetValueUnderDataSource(container: typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetValue): typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidgetDatabaseSource = ^.asInstanceOf[js.Dynamic].applyDynamic("createInWidgetValueUnderDataSource")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidgetDatabaseSource]
    
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.CustomWidgetDatabaseSource.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.CustomWidgetDatabaseSource.versionInfo")
    @js.native
    def versionInfo: typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk", "customwidgets.CustomWidgetType")
  @js.native
  open class CustomWidgetType protected ()
    extends typingsJapgolly.mendixmodelsdk.srcGenAllModelClassesMod.customwidgets.CustomWidgetType {
    def this(
      model: typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.ModelUnit[IAbstractModel],
      container: typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object CustomWidgetType {
    
    @JSImport("mendixmodelsdk", "customwidgets.CustomWidgetType")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new CustomWidgetType instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    inline def create(model: IModel): typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidgetType = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidgetType]
    
    /**
      * Creates and returns a new CustomWidgetType instance in the SDK and on the server.
      * The new CustomWidgetType will be automatically stored in the 'type' property
      * of the parent CustomWidget element passed as argument.
      */
    /* static member */
    inline def createIn(container: typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget): typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidgetType = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidgetType]
    
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.CustomWidgetType.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.CustomWidgetType.versionInfo")
    @js.native
    def versionInfo: typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * In version 8.5.0: introduced
    */
  @JSImport("mendixmodelsdk", "customwidgets.CustomWidgetXPathSource")
  @js.native
  open class CustomWidgetXPathSource protected ()
    extends typingsJapgolly.mendixmodelsdk.srcGenAllModelClassesMod.customwidgets.CustomWidgetXPathSource {
    def this(
      model: typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.ModelUnit[IAbstractModel],
      container: typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object CustomWidgetXPathSource {
    
    @JSImport("mendixmodelsdk", "customwidgets.CustomWidgetXPathSource")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new CustomWidgetXPathSource instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    inline def create(model: IModel): typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidgetXPathSource = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidgetXPathSource]
    
    /**
      * Creates and returns a new CustomWidgetXPathSource instance in the SDK and on the server.
      * The new CustomWidgetXPathSource will be automatically stored in the 'dataSource' property
      * of the parent pages.EntityWidget element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.5.0 and higher
      */
    /* static member */
    inline def createInEntityWidgetUnderDataSource(container: EntityWidget): typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidgetXPathSource = ^.asInstanceOf[js.Dynamic].applyDynamic("createInEntityWidgetUnderDataSource")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidgetXPathSource]
    
    /**
      * Creates and returns a new CustomWidgetXPathSource instance in the SDK and on the server.
      * The new CustomWidgetXPathSource will be automatically stored in the 'dataSource' property
      * of the parent WidgetValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.5.0 and higher
      */
    /* static member */
    inline def createInWidgetValueUnderDataSource(container: typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetValue): typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidgetXPathSource = ^.asInstanceOf[js.Dynamic].applyDynamic("createInWidgetValueUnderDataSource")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidgetXPathSource]
    
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.CustomWidgetXPathSource.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.CustomWidgetXPathSource.versionInfo")
    @js.native
    def versionInfo: typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk", "customwidgets.IsPath")
  @js.native
  open class IsPath protected ()
    extends typingsJapgolly.mendixmodelsdk.srcGenAllModelClassesMod.customwidgets.IsPath {
    def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
  }
  object IsPath {
    
    @JSImport("mendixmodelsdk", "customwidgets.IsPath")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.IsPath.No")
    @js.native
    def No: typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.IsPath = js.native
    inline def No_=(x: typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.IsPath): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("No")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.IsPath.Optional")
    @js.native
    def Optional: typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.IsPath = js.native
    inline def Optional_=(x: typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.IsPath): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Optional")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.IsPath.Yes")
    @js.native
    def Yes: typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.IsPath = js.native
    inline def Yes_=(x: typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.IsPath): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Yes")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk", "customwidgets.PathType")
  @js.native
  open class PathType protected ()
    extends typingsJapgolly.mendixmodelsdk.srcGenAllModelClassesMod.customwidgets.PathType {
    def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
  }
  object PathType {
    
    @JSImport("mendixmodelsdk", "customwidgets.PathType")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.PathType.None")
    @js.native
    def None: typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.PathType = js.native
    inline def None_=(x: typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.PathType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("None")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.PathType.Reference")
    @js.native
    def Reference: typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.PathType = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.PathType.ReferenceSet")
    @js.native
    def ReferenceSet: typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.PathType = js.native
    inline def ReferenceSet_=(x: typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.PathType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ReferenceSet")(x.asInstanceOf[js.Any])
    
    inline def Reference_=(x: typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.PathType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Reference")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk", "customwidgets.SystemPropertyEnum")
  @js.native
  open class SystemPropertyEnum protected ()
    extends typingsJapgolly.mendixmodelsdk.srcGenAllModelClassesMod.customwidgets.SystemPropertyEnum {
    def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
  }
  object SystemPropertyEnum {
    
    @JSImport("mendixmodelsdk", "customwidgets.SystemPropertyEnum")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.SystemPropertyEnum.Editability")
    @js.native
    def Editability: typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.SystemPropertyEnum = js.native
    inline def Editability_=(x: typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.SystemPropertyEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Editability")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.SystemPropertyEnum.Label")
    @js.native
    def Label: typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.SystemPropertyEnum = js.native
    inline def Label_=(x: typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.SystemPropertyEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Label")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.SystemPropertyEnum.Name")
    @js.native
    def Name: typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.SystemPropertyEnum = js.native
    inline def Name_=(x: typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.SystemPropertyEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Name")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.SystemPropertyEnum.TabIndex")
    @js.native
    def TabIndex: typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.SystemPropertyEnum = js.native
    inline def TabIndex_=(x: typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.SystemPropertyEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TabIndex")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.SystemPropertyEnum.Visibility")
    @js.native
    def Visibility: typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.SystemPropertyEnum = js.native
    inline def Visibility_=(x: typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.SystemPropertyEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Visibility")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk", "customwidgets.WidgetEnumerationValue")
  @js.native
  open class WidgetEnumerationValue protected ()
    extends typingsJapgolly.mendixmodelsdk.srcGenAllModelClassesMod.customwidgets.WidgetEnumerationValue {
    def this(
      model: typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.ModelUnit[IAbstractModel],
      container: typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object WidgetEnumerationValue {
    
    @JSImport("mendixmodelsdk", "customwidgets.WidgetEnumerationValue")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new WidgetEnumerationValue instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    inline def create(model: IModel): typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetEnumerationValue = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetEnumerationValue]
    
    /**
      * Creates and returns a new WidgetEnumerationValue instance in the SDK and on the server.
      * The new WidgetEnumerationValue will be automatically stored in the 'enumerationValues' property
      * of the parent WidgetValueType element passed as argument.
      */
    /* static member */
    inline def createIn(container: typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetValueType): typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetEnumerationValue = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetEnumerationValue]
    
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.WidgetEnumerationValue.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.WidgetEnumerationValue.versionInfo")
    @js.native
    def versionInfo: typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk", "customwidgets.WidgetObject")
  @js.native
  open class WidgetObject protected ()
    extends typingsJapgolly.mendixmodelsdk.srcGenAllModelClassesMod.customwidgets.WidgetObject {
    def this(
      model: typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.ModelUnit[IAbstractModel],
      container: typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object WidgetObject {
    
    @JSImport("mendixmodelsdk", "customwidgets.WidgetObject")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new WidgetObject instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    inline def create(model: IModel): typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetObject = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetObject]
    
    /**
      * Creates and returns a new WidgetObject instance in the SDK and on the server.
      * The new WidgetObject will be automatically stored in the 'object' property
      * of the parent CustomWidget element passed as argument.
      */
    /* static member */
    inline def createInCustomWidgetUnderObject(container: typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget): typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetObject = ^.asInstanceOf[js.Dynamic].applyDynamic("createInCustomWidgetUnderObject")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetObject]
    
    /**
      * Creates and returns a new WidgetObject instance in the SDK and on the server.
      * The new WidgetObject will be automatically stored in the 'objects' property
      * of the parent WidgetValue element passed as argument.
      */
    /* static member */
    inline def createInWidgetValueUnderObjects(container: typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetValue): typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetObject = ^.asInstanceOf[js.Dynamic].applyDynamic("createInWidgetValueUnderObjects")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetObject]
    
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.WidgetObject.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.WidgetObject.versionInfo")
    @js.native
    def versionInfo: typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk", "customwidgets.WidgetObjectType")
  @js.native
  open class WidgetObjectType protected ()
    extends typingsJapgolly.mendixmodelsdk.srcGenAllModelClassesMod.customwidgets.WidgetObjectType {
    def this(
      model: typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.ModelUnit[IAbstractModel],
      container: typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object WidgetObjectType {
    
    @JSImport("mendixmodelsdk", "customwidgets.WidgetObjectType")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new WidgetObjectType instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    inline def create(model: IModel): typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetObjectType = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetObjectType]
    
    /**
      * Creates and returns a new WidgetObjectType instance in the SDK and on the server.
      * The new WidgetObjectType will be automatically stored in the 'objectType' property
      * of the parent CustomWidgetType element passed as argument.
      */
    /* static member */
    inline def createInCustomWidgetTypeUnderObjectType(container: typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidgetType): typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetObjectType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInCustomWidgetTypeUnderObjectType")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetObjectType]
    
    /**
      * Creates and returns a new WidgetObjectType instance in the SDK and on the server.
      * The new WidgetObjectType will be automatically stored in the 'objectType' property
      * of the parent WidgetValueType element passed as argument.
      */
    /* static member */
    inline def createInWidgetValueTypeUnderObjectType(container: typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetValueType): typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetObjectType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInWidgetValueTypeUnderObjectType")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetObjectType]
    
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.WidgetObjectType.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.WidgetObjectType.versionInfo")
    @js.native
    def versionInfo: typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk", "customwidgets.WidgetProperty")
  @js.native
  open class WidgetProperty protected ()
    extends typingsJapgolly.mendixmodelsdk.srcGenAllModelClassesMod.customwidgets.WidgetProperty {
    def this(
      model: typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.ModelUnit[IAbstractModel],
      container: typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object WidgetProperty {
    
    @JSImport("mendixmodelsdk", "customwidgets.WidgetProperty")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new WidgetProperty instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    inline def create(model: IModel): typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetProperty = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetProperty]
    
    /**
      * Creates and returns a new WidgetProperty instance in the SDK and on the server.
      * The new WidgetProperty will be automatically stored in the 'properties' property
      * of the parent WidgetObject element passed as argument.
      */
    /* static member */
    inline def createIn(container: typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetObject): typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetProperty = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetProperty]
    
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.WidgetProperty.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.WidgetProperty.versionInfo")
    @js.native
    def versionInfo: typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk", "customwidgets.WidgetPropertyType")
  @js.native
  open class WidgetPropertyType protected ()
    extends typingsJapgolly.mendixmodelsdk.srcGenAllModelClassesMod.customwidgets.WidgetPropertyType {
    def this(
      model: typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.ModelUnit[IAbstractModel],
      container: typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object WidgetPropertyType {
    
    @JSImport("mendixmodelsdk", "customwidgets.WidgetPropertyType")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new WidgetPropertyType instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    inline def create(model: IModel): typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetPropertyType = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetPropertyType]
    
    /**
      * Creates and returns a new WidgetPropertyType instance in the SDK and on the server.
      * The new WidgetPropertyType will be automatically stored in the 'propertyTypes' property
      * of the parent WidgetObjectType element passed as argument.
      */
    /* static member */
    inline def createIn(container: typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetObjectType): typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetPropertyType = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetPropertyType]
    
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.WidgetPropertyType.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.WidgetPropertyType.versionInfo")
    @js.native
    def versionInfo: typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk", "customwidgets.WidgetReturnType")
  @js.native
  open class WidgetReturnType protected ()
    extends typingsJapgolly.mendixmodelsdk.srcGenAllModelClassesMod.customwidgets.WidgetReturnType {
    def this(
      model: typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.ModelUnit[IAbstractModel],
      container: typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object WidgetReturnType {
    
    @JSImport("mendixmodelsdk", "customwidgets.WidgetReturnType")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new WidgetReturnType instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    inline def create(model: IModel): typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetReturnType = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetReturnType]
    
    /**
      * Creates and returns a new WidgetReturnType instance in the SDK and on the server.
      * The new WidgetReturnType will be automatically stored in the 'returnType' property
      * of the parent WidgetValueType element passed as argument.
      */
    /* static member */
    inline def createIn(container: typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetValueType): typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetReturnType = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetReturnType]
    
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.WidgetReturnType.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.WidgetReturnType.versionInfo")
    @js.native
    def versionInfo: typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk", "customwidgets.WidgetReturnTypeEnum")
  @js.native
  open class WidgetReturnTypeEnum protected ()
    extends typingsJapgolly.mendixmodelsdk.srcGenAllModelClassesMod.customwidgets.WidgetReturnTypeEnum {
    def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
  }
  object WidgetReturnTypeEnum {
    
    @JSImport("mendixmodelsdk", "customwidgets.WidgetReturnTypeEnum")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.WidgetReturnTypeEnum.Boolean")
    @js.native
    def Boolean: typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetReturnTypeEnum = js.native
    inline def Boolean_=(x: typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetReturnTypeEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Boolean")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.WidgetReturnTypeEnum.DateTime")
    @js.native
    def DateTime: typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetReturnTypeEnum = js.native
    inline def DateTime_=(x: typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetReturnTypeEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DateTime")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.WidgetReturnTypeEnum.Decimal")
    @js.native
    def Decimal: typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetReturnTypeEnum = js.native
    inline def Decimal_=(x: typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetReturnTypeEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Decimal")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.WidgetReturnTypeEnum.Float")
    @js.native
    def Float: typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetReturnTypeEnum = js.native
    inline def Float_=(x: typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetReturnTypeEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Float")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.WidgetReturnTypeEnum.Integer")
    @js.native
    def Integer: typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetReturnTypeEnum = js.native
    inline def Integer_=(x: typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetReturnTypeEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Integer")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.WidgetReturnTypeEnum.Object")
    @js.native
    def Object: typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetReturnTypeEnum = js.native
    inline def Object_=(x: typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetReturnTypeEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Object")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.WidgetReturnTypeEnum.String")
    @js.native
    def String: typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetReturnTypeEnum = js.native
    inline def String_=(x: typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetReturnTypeEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("String")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.WidgetReturnTypeEnum.Void")
    @js.native
    def Void: typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetReturnTypeEnum = js.native
    inline def Void_=(x: typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetReturnTypeEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Void")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk", "customwidgets.WidgetTranslation")
  @js.native
  open class WidgetTranslation protected ()
    extends typingsJapgolly.mendixmodelsdk.srcGenAllModelClassesMod.customwidgets.WidgetTranslation {
    def this(
      model: typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.ModelUnit[IAbstractModel],
      container: typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object WidgetTranslation {
    
    @JSImport("mendixmodelsdk", "customwidgets.WidgetTranslation")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new WidgetTranslation instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    inline def create(model: IModel): typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetTranslation = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetTranslation]
    
    /**
      * Creates and returns a new WidgetTranslation instance in the SDK and on the server.
      * The new WidgetTranslation will be automatically stored in the 'translations' property
      * of the parent WidgetValueType element passed as argument.
      */
    /* static member */
    inline def createIn(container: typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetValueType): typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetTranslation = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetTranslation]
    
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.WidgetTranslation.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.WidgetTranslation.versionInfo")
    @js.native
    def versionInfo: typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk", "customwidgets.WidgetValue")
  @js.native
  open class WidgetValue protected ()
    extends typingsJapgolly.mendixmodelsdk.srcGenAllModelClassesMod.customwidgets.WidgetValue {
    def this(
      model: typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.ModelUnit[IAbstractModel],
      container: typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object WidgetValue {
    
    @JSImport("mendixmodelsdk", "customwidgets.WidgetValue")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new WidgetValue instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    inline def create(model: IModel): typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetValue = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetValue]
    
    /**
      * Creates and returns a new WidgetValue instance in the SDK and on the server.
      * The new WidgetValue will be automatically stored in the 'value' property
      * of the parent WidgetProperty element passed as argument.
      */
    /* static member */
    inline def createIn(container: typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetProperty): typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetValue = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetValue]
    
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.WidgetValue.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.WidgetValue.versionInfo")
    @js.native
    def versionInfo: typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk", "customwidgets.WidgetValueType")
  @js.native
  open class WidgetValueType protected ()
    extends typingsJapgolly.mendixmodelsdk.srcGenAllModelClassesMod.customwidgets.WidgetValueType {
    def this(
      model: typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.ModelUnit[IAbstractModel],
      container: typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object WidgetValueType {
    
    @JSImport("mendixmodelsdk", "customwidgets.WidgetValueType")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new WidgetValueType instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    inline def create(model: IModel): typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetValueType = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetValueType]
    
    /**
      * Creates and returns a new WidgetValueType instance in the SDK and on the server.
      * The new WidgetValueType will be automatically stored in the 'valueType' property
      * of the parent WidgetPropertyType element passed as argument.
      */
    /* static member */
    inline def createIn(container: typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetPropertyType): typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetValueType = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetValueType]
    
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.WidgetValueType.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.WidgetValueType.versionInfo")
    @js.native
    def versionInfo: typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk", "customwidgets.WidgetValueTypeEnum")
  @js.native
  open class WidgetValueTypeEnum protected ()
    extends typingsJapgolly.mendixmodelsdk.srcGenAllModelClassesMod.customwidgets.WidgetValueTypeEnum {
    def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
  }
  object WidgetValueTypeEnum {
    
    @JSImport("mendixmodelsdk", "customwidgets.WidgetValueTypeEnum")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.WidgetValueTypeEnum.Action")
    @js.native
    def Action: typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetValueTypeEnum = js.native
    inline def Action_=(x: typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetValueTypeEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Action")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.WidgetValueTypeEnum.Association")
    @js.native
    def Association: typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetValueTypeEnum = js.native
    inline def Association_=(x: typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetValueTypeEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Association")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.WidgetValueTypeEnum.Attribute")
    @js.native
    def Attribute: typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetValueTypeEnum = js.native
    inline def Attribute_=(x: typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetValueTypeEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Attribute")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.WidgetValueTypeEnum.Boolean")
    @js.native
    def Boolean: typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetValueTypeEnum = js.native
    inline def Boolean_=(x: typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetValueTypeEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Boolean")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.WidgetValueTypeEnum.DataSource")
    @js.native
    def DataSource: typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetValueTypeEnum = js.native
    inline def DataSource_=(x: typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetValueTypeEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DataSource")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.WidgetValueTypeEnum.Decimal")
    @js.native
    def Decimal: typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetValueTypeEnum = js.native
    inline def Decimal_=(x: typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetValueTypeEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Decimal")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.WidgetValueTypeEnum.Entity")
    @js.native
    def Entity: typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetValueTypeEnum = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.WidgetValueTypeEnum.EntityConstraint")
    @js.native
    def EntityConstraint: typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetValueTypeEnum = js.native
    inline def EntityConstraint_=(x: typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetValueTypeEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EntityConstraint")(x.asInstanceOf[js.Any])
    
    inline def Entity_=(x: typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetValueTypeEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Entity")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.WidgetValueTypeEnum.Enumeration")
    @js.native
    def Enumeration: typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetValueTypeEnum = js.native
    inline def Enumeration_=(x: typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetValueTypeEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Enumeration")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.WidgetValueTypeEnum.Expression")
    @js.native
    def Expression: typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetValueTypeEnum = js.native
    inline def Expression_=(x: typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetValueTypeEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Expression")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.WidgetValueTypeEnum.File")
    @js.native
    def File: typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetValueTypeEnum = js.native
    inline def File_=(x: typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetValueTypeEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("File")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.WidgetValueTypeEnum.Form")
    @js.native
    def Form: typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetValueTypeEnum = js.native
    inline def Form_=(x: typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetValueTypeEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Form")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.WidgetValueTypeEnum.Icon")
    @js.native
    def Icon: typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetValueTypeEnum = js.native
    inline def Icon_=(x: typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetValueTypeEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Icon")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.WidgetValueTypeEnum.Image")
    @js.native
    def Image: typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetValueTypeEnum = js.native
    inline def Image_=(x: typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetValueTypeEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Image")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.WidgetValueTypeEnum.Integer")
    @js.native
    def Integer: typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetValueTypeEnum = js.native
    inline def Integer_=(x: typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetValueTypeEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Integer")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.WidgetValueTypeEnum.Microflow")
    @js.native
    def Microflow: typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetValueTypeEnum = js.native
    inline def Microflow_=(x: typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetValueTypeEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Microflow")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.WidgetValueTypeEnum.Nanoflow")
    @js.native
    def Nanoflow: typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetValueTypeEnum = js.native
    inline def Nanoflow_=(x: typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetValueTypeEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Nanoflow")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.WidgetValueTypeEnum.Object")
    @js.native
    def Object: typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetValueTypeEnum = js.native
    inline def Object_=(x: typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetValueTypeEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Object")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.WidgetValueTypeEnum.String")
    @js.native
    def String: typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetValueTypeEnum = js.native
    inline def String_=(x: typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetValueTypeEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("String")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.WidgetValueTypeEnum.System")
    @js.native
    def System: typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetValueTypeEnum = js.native
    inline def System_=(x: typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetValueTypeEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("System")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.WidgetValueTypeEnum.TextTemplate")
    @js.native
    def TextTemplate: typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetValueTypeEnum = js.native
    inline def TextTemplate_=(x: typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetValueTypeEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TextTemplate")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.WidgetValueTypeEnum.TranslatableString")
    @js.native
    def TranslatableString: typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetValueTypeEnum = js.native
    inline def TranslatableString_=(x: typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetValueTypeEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TranslatableString")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.WidgetValueTypeEnum.Widgets")
    @js.native
    def Widgets: typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetValueTypeEnum = js.native
    inline def Widgets_=(x: typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetValueTypeEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Widgets")(x.asInstanceOf[js.Any])
  }
}
