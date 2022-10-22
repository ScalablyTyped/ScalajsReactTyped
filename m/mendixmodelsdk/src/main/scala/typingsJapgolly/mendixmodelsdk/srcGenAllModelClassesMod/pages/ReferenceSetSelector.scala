package typingsJapgolly.mendixmodelsdk.srcGenAllModelClassesMod.pages

import typingsJapgolly.mendixmodelsdk.srcGenBaseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetValue
import typingsJapgolly.mendixmodelsdk.srcGenNativepagesMod.nativepages.NativeLayout
import typingsJapgolly.mendixmodelsdk.srcGenNativepagesMod.nativepages.NativeLayoutCallArgument
import typingsJapgolly.mendixmodelsdk.srcGenPagesMod.StructureVersionInfo
import typingsJapgolly.mendixmodelsdk.srcGenReportsMod.reports.ReportPane
import typingsJapgolly.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractElement
import typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractModel
import typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.ModelUnit
import typingsJapgolly.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://docs.mendix.com/refguide/reference-set-selector relevant section in reference guide}
  */
@JSImport("mendixmodelsdk/src/gen/all-model-classes", "pages.ReferenceSetSelector")
@js.native
open class ReferenceSetSelector protected ()
  extends typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ReferenceSetSelector {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
object ReferenceSetSelector {
  
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "pages.ReferenceSetSelector")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new ReferenceSetSelector instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ReferenceSetSelector = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ReferenceSetSelector]
  
  /**
    * Creates and returns a new ReferenceSetSelector instance in the SDK and on the server.
    * The new ReferenceSetSelector will be automatically stored in the 'widget' property
    * of the parent BuildingBlock element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.7.0 to 7.14.0
    */
  /* static member */
  inline def createInBuildingBlockUnderWidget(container: typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.BuildingBlock): typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ReferenceSetSelector = ^.asInstanceOf[js.Dynamic].applyDynamic("createInBuildingBlockUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ReferenceSetSelector]
  
  /**
    * Creates and returns a new ReferenceSetSelector instance in the SDK and on the server.
    * The new ReferenceSetSelector will be automatically stored in the 'widgets' property
    * of the parent BuildingBlock element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  inline def createInBuildingBlockUnderWidgets(container: typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.BuildingBlock): typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ReferenceSetSelector = ^.asInstanceOf[js.Dynamic].applyDynamic("createInBuildingBlockUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ReferenceSetSelector]
  
  /**
    * Creates and returns a new ReferenceSetSelector instance in the SDK and on the server.
    * The new ReferenceSetSelector will be automatically stored in the 'footerWidget' property
    * of the parent DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.7.0 to 7.14.0
    */
  /* static member */
  inline def createInDataViewUnderFooterWidget(container: typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.DataView): typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ReferenceSetSelector = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDataViewUnderFooterWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ReferenceSetSelector]
  
  /**
    * Creates and returns a new ReferenceSetSelector instance in the SDK and on the server.
    * The new ReferenceSetSelector will be automatically stored in the 'footerWidgets' property
    * of the parent DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  inline def createInDataViewUnderFooterWidgets(container: typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.DataView): typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ReferenceSetSelector = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDataViewUnderFooterWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ReferenceSetSelector]
  
  /**
    * Creates and returns a new ReferenceSetSelector instance in the SDK and on the server.
    * The new ReferenceSetSelector will be automatically stored in the 'widget' property
    * of the parent DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  inline def createInDataViewUnderWidget(container: typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.DataView): typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ReferenceSetSelector = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDataViewUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ReferenceSetSelector]
  
  /**
    * Creates and returns a new ReferenceSetSelector instance in the SDK and on the server.
    * The new ReferenceSetSelector will be automatically stored in the 'widgets' property
    * of the parent DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  inline def createInDataViewUnderWidgets(container: typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.DataView): typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ReferenceSetSelector = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDataViewUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ReferenceSetSelector]
  
  /**
    * Creates and returns a new ReferenceSetSelector instance in the SDK and on the server.
    * The new ReferenceSetSelector will be automatically stored in the 'widget' property
    * of the parent DivContainer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  inline def createInDivContainerUnderWidget(container: typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.DivContainer): typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ReferenceSetSelector = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDivContainerUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ReferenceSetSelector]
  
  /**
    * Creates and returns a new ReferenceSetSelector instance in the SDK and on the server.
    * The new ReferenceSetSelector will be automatically stored in the 'widgets' property
    * of the parent DivContainer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  inline def createInDivContainerUnderWidgets(container: typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.DivContainer): typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ReferenceSetSelector = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDivContainerUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ReferenceSetSelector]
  
  /**
    * Creates and returns a new ReferenceSetSelector instance in the SDK and on the server.
    * The new ReferenceSetSelector will be automatically stored in the 'widget' property
    * of the parent GroupBox element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  inline def createInGroupBoxUnderWidget(container: typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.GroupBox): typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ReferenceSetSelector = ^.asInstanceOf[js.Dynamic].applyDynamic("createInGroupBoxUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ReferenceSetSelector]
  
  /**
    * Creates and returns a new ReferenceSetSelector instance in the SDK and on the server.
    * The new ReferenceSetSelector will be automatically stored in the 'widgets' property
    * of the parent GroupBox element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  inline def createInGroupBoxUnderWidgets(container: typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.GroupBox): typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ReferenceSetSelector = ^.asInstanceOf[js.Dynamic].applyDynamic("createInGroupBoxUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ReferenceSetSelector]
  
  /**
    * Creates and returns a new ReferenceSetSelector instance in the SDK and on the server.
    * The new ReferenceSetSelector will be automatically stored in the 'leftWidget' property
    * of the parent Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  inline def createInHeaderUnderLeftWidget(container: typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.Header): typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ReferenceSetSelector = ^.asInstanceOf[js.Dynamic].applyDynamic("createInHeaderUnderLeftWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ReferenceSetSelector]
  
  /**
    * Creates and returns a new ReferenceSetSelector instance in the SDK and on the server.
    * The new ReferenceSetSelector will be automatically stored in the 'leftWidgets' property
    * of the parent Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  inline def createInHeaderUnderLeftWidgets(container: typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.Header): typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ReferenceSetSelector = ^.asInstanceOf[js.Dynamic].applyDynamic("createInHeaderUnderLeftWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ReferenceSetSelector]
  
  /**
    * Creates and returns a new ReferenceSetSelector instance in the SDK and on the server.
    * The new ReferenceSetSelector will be automatically stored in the 'rightWidget' property
    * of the parent Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  inline def createInHeaderUnderRightWidget(container: typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.Header): typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ReferenceSetSelector = ^.asInstanceOf[js.Dynamic].applyDynamic("createInHeaderUnderRightWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ReferenceSetSelector]
  
  /**
    * Creates and returns a new ReferenceSetSelector instance in the SDK and on the server.
    * The new ReferenceSetSelector will be automatically stored in the 'rightWidgets' property
    * of the parent Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  inline def createInHeaderUnderRightWidgets(container: typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.Header): typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ReferenceSetSelector = ^.asInstanceOf[js.Dynamic].applyDynamic("createInHeaderUnderRightWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ReferenceSetSelector]
  
  /**
    * Creates and returns a new ReferenceSetSelector instance in the SDK and on the server.
    * The new ReferenceSetSelector will be automatically stored in the 'widget' property
    * of the parent LayoutCallArgument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  inline def createInLayoutCallArgumentUnderWidget(container: typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.LayoutCallArgument): typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ReferenceSetSelector = ^.asInstanceOf[js.Dynamic].applyDynamic("createInLayoutCallArgumentUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ReferenceSetSelector]
  
  /**
    * Creates and returns a new ReferenceSetSelector instance in the SDK and on the server.
    * The new ReferenceSetSelector will be automatically stored in the 'widgets' property
    * of the parent LayoutCallArgument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  inline def createInLayoutCallArgumentUnderWidgets(container: typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.LayoutCallArgument): typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ReferenceSetSelector = ^.asInstanceOf[js.Dynamic].applyDynamic("createInLayoutCallArgumentUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ReferenceSetSelector]
  
  /**
    * Creates and returns a new ReferenceSetSelector instance in the SDK and on the server.
    * The new ReferenceSetSelector will be automatically stored in the 'widget' property
    * of the parent LayoutGridColumn element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  inline def createInLayoutGridColumnUnderWidget(container: typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.LayoutGridColumn): typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ReferenceSetSelector = ^.asInstanceOf[js.Dynamic].applyDynamic("createInLayoutGridColumnUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ReferenceSetSelector]
  
  /**
    * Creates and returns a new ReferenceSetSelector instance in the SDK and on the server.
    * The new ReferenceSetSelector will be automatically stored in the 'widgets' property
    * of the parent LayoutGridColumn element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  inline def createInLayoutGridColumnUnderWidgets(container: typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.LayoutGridColumn): typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ReferenceSetSelector = ^.asInstanceOf[js.Dynamic].applyDynamic("createInLayoutGridColumnUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ReferenceSetSelector]
  
  /**
    * Creates and returns a new ReferenceSetSelector instance in the SDK and on the server.
    * The new ReferenceSetSelector will be automatically stored in the 'widget' property
    * of the parent Layout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  inline def createInLayoutUnderWidget(container: typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.Layout): typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ReferenceSetSelector = ^.asInstanceOf[js.Dynamic].applyDynamic("createInLayoutUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ReferenceSetSelector]
  
  /**
    * Creates and returns a new ReferenceSetSelector instance in the SDK and on the server.
    * The new ReferenceSetSelector will be automatically stored in the 'widgets' property
    * of the parent Layout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.23.0
    */
  /* static member */
  inline def createInLayoutUnderWidgets(container: typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.Layout): typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ReferenceSetSelector = ^.asInstanceOf[js.Dynamic].applyDynamic("createInLayoutUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ReferenceSetSelector]
  
  /**
    * Creates and returns a new ReferenceSetSelector instance in the SDK and on the server.
    * The new ReferenceSetSelector will be automatically stored in the 'widget' property
    * of the parent ListViewTemplate element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  inline def createInListViewTemplateUnderWidget(container: typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ListViewTemplate): typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ReferenceSetSelector = ^.asInstanceOf[js.Dynamic].applyDynamic("createInListViewTemplateUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ReferenceSetSelector]
  
  /**
    * Creates and returns a new ReferenceSetSelector instance in the SDK and on the server.
    * The new ReferenceSetSelector will be automatically stored in the 'widgets' property
    * of the parent ListViewTemplate element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  inline def createInListViewTemplateUnderWidgets(container: typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ListViewTemplate): typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ReferenceSetSelector = ^.asInstanceOf[js.Dynamic].applyDynamic("createInListViewTemplateUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ReferenceSetSelector]
  
  /**
    * Creates and returns a new ReferenceSetSelector instance in the SDK and on the server.
    * The new ReferenceSetSelector will be automatically stored in the 'widget' property
    * of the parent ListView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  inline def createInListViewUnderWidget(container: typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ListView): typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ReferenceSetSelector = ^.asInstanceOf[js.Dynamic].applyDynamic("createInListViewUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ReferenceSetSelector]
  
  /**
    * Creates and returns a new ReferenceSetSelector instance in the SDK and on the server.
    * The new ReferenceSetSelector will be automatically stored in the 'widgets' property
    * of the parent ListView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  inline def createInListViewUnderWidgets(container: typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ListView): typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ReferenceSetSelector = ^.asInstanceOf[js.Dynamic].applyDynamic("createInListViewUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ReferenceSetSelector]
  
  /**
    * Creates and returns a new ReferenceSetSelector instance in the SDK and on the server.
    * The new ReferenceSetSelector will be automatically stored in the 'widget' property
    * of the parent MasterDetailRegion element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.1.0 to 7.14.0
    */
  /* static member */
  inline def createInMasterDetailRegionUnderWidget(container: typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.MasterDetailRegion): typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ReferenceSetSelector = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMasterDetailRegionUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ReferenceSetSelector]
  
  /**
    * Creates and returns a new ReferenceSetSelector instance in the SDK and on the server.
    * The new ReferenceSetSelector will be automatically stored in the 'widgets' property
    * of the parent nativepages.NativeLayoutCallArgument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.23.0 to 7.23.0
    */
  /* static member */
  inline def createInNativeLayoutCallArgumentUnderWidgets(container: NativeLayoutCallArgument): typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ReferenceSetSelector = ^.asInstanceOf[js.Dynamic].applyDynamic("createInNativeLayoutCallArgumentUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ReferenceSetSelector]
  
  /**
    * Creates and returns a new ReferenceSetSelector instance in the SDK and on the server.
    * The new ReferenceSetSelector will be automatically stored in the 'sidebarWidgets' property
    * of the parent NativeLayoutContent element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.5.0 and higher
    */
  /* static member */
  inline def createInNativeLayoutContentUnderSidebarWidgets(container: typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.NativeLayoutContent): typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ReferenceSetSelector = ^.asInstanceOf[js.Dynamic].applyDynamic("createInNativeLayoutContentUnderSidebarWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ReferenceSetSelector]
  
  /**
    * Creates and returns a new ReferenceSetSelector instance in the SDK and on the server.
    * The new ReferenceSetSelector will be automatically stored in the 'widgets' property
    * of the parent NativeLayoutContent element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  /* static member */
  inline def createInNativeLayoutContentUnderWidgets(container: typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.NativeLayoutContent): typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ReferenceSetSelector = ^.asInstanceOf[js.Dynamic].applyDynamic("createInNativeLayoutContentUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ReferenceSetSelector]
  
  /**
    * Creates and returns a new ReferenceSetSelector instance in the SDK and on the server.
    * The new ReferenceSetSelector will be automatically stored in the 'headerWidget' property
    * of the parent nativepages.NativeLayout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.22.0 to 7.23.0
    */
  /* static member */
  inline def createInNativeLayoutUnderHeaderWidget(container: NativeLayout): typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ReferenceSetSelector = ^.asInstanceOf[js.Dynamic].applyDynamic("createInNativeLayoutUnderHeaderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ReferenceSetSelector]
  
  /**
    * Creates and returns a new ReferenceSetSelector instance in the SDK and on the server.
    * The new ReferenceSetSelector will be automatically stored in the 'widgets' property
    * of the parent nativepages.NativeLayout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.21.0 to 7.23.0
    */
  /* static member */
  inline def createInNativeLayoutUnderWidgets(container: NativeLayout): typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ReferenceSetSelector = ^.asInstanceOf[js.Dynamic].applyDynamic("createInNativeLayoutUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ReferenceSetSelector]
  
  /**
    * Creates and returns a new ReferenceSetSelector instance in the SDK and on the server.
    * The new ReferenceSetSelector will be automatically stored in the 'widget' property
    * of the parent NavigationListItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  inline def createInNavigationListItemUnderWidget(container: typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.NavigationListItem): typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ReferenceSetSelector = ^.asInstanceOf[js.Dynamic].applyDynamic("createInNavigationListItemUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ReferenceSetSelector]
  
  /**
    * Creates and returns a new ReferenceSetSelector instance in the SDK and on the server.
    * The new ReferenceSetSelector will be automatically stored in the 'widgets' property
    * of the parent NavigationListItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  inline def createInNavigationListItemUnderWidgets(container: typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.NavigationListItem): typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ReferenceSetSelector = ^.asInstanceOf[js.Dynamic].applyDynamic("createInNavigationListItemUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ReferenceSetSelector]
  
  /**
    * Creates and returns a new ReferenceSetSelector instance in the SDK and on the server.
    * The new ReferenceSetSelector will be automatically stored in the 'parameterWidget' property
    * of the parent reports.ReportPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 6.9.0
    */
  /* static member */
  inline def createInReportPaneUnderParameterWidget(container: ReportPane): typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ReferenceSetSelector = ^.asInstanceOf[js.Dynamic].applyDynamic("createInReportPaneUnderParameterWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ReferenceSetSelector]
  
  /**
    * Creates and returns a new ReferenceSetSelector instance in the SDK and on the server.
    * The new ReferenceSetSelector will be automatically stored in the 'reportWidget' property
    * of the parent reports.ReportPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 6.9.0
    */
  /* static member */
  inline def createInReportPaneUnderReportWidget(container: ReportPane): typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ReferenceSetSelector = ^.asInstanceOf[js.Dynamic].applyDynamic("createInReportPaneUnderReportWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ReferenceSetSelector]
  
  /**
    * Creates and returns a new ReferenceSetSelector instance in the SDK and on the server.
    * The new ReferenceSetSelector will be automatically stored in the 'widget' property
    * of the parent ScrollContainerRegion element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  inline def createInScrollContainerRegionUnderWidget(container: typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ScrollContainerRegion): typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ReferenceSetSelector = ^.asInstanceOf[js.Dynamic].applyDynamic("createInScrollContainerRegionUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ReferenceSetSelector]
  
  /**
    * Creates and returns a new ReferenceSetSelector instance in the SDK and on the server.
    * The new ReferenceSetSelector will be automatically stored in the 'widgets' property
    * of the parent ScrollContainerRegion element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  inline def createInScrollContainerRegionUnderWidgets(container: typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ScrollContainerRegion): typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ReferenceSetSelector = ^.asInstanceOf[js.Dynamic].applyDynamic("createInScrollContainerRegionUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ReferenceSetSelector]
  
  /**
    * Creates and returns a new ReferenceSetSelector instance in the SDK and on the server.
    * The new ReferenceSetSelector will be automatically stored in the 'widget' property
    * of the parent Snippet element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  inline def createInSnippetUnderWidget(container: typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.Snippet): typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ReferenceSetSelector = ^.asInstanceOf[js.Dynamic].applyDynamic("createInSnippetUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ReferenceSetSelector]
  
  /**
    * Creates and returns a new ReferenceSetSelector instance in the SDK and on the server.
    * The new ReferenceSetSelector will be automatically stored in the 'widgets' property
    * of the parent Snippet element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  inline def createInSnippetUnderWidgets(container: typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.Snippet): typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ReferenceSetSelector = ^.asInstanceOf[js.Dynamic].applyDynamic("createInSnippetUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ReferenceSetSelector]
  
  /**
    * Creates and returns a new ReferenceSetSelector instance in the SDK and on the server.
    * The new ReferenceSetSelector will be automatically stored in the 'firstWidget' property
    * of the parent SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  inline def createInSplitPaneUnderFirstWidget(container: typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.SplitPane): typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ReferenceSetSelector = ^.asInstanceOf[js.Dynamic].applyDynamic("createInSplitPaneUnderFirstWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ReferenceSetSelector]
  
  /**
    * Creates and returns a new ReferenceSetSelector instance in the SDK and on the server.
    * The new ReferenceSetSelector will be automatically stored in the 'firstWidgets' property
    * of the parent SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.23.0
    */
  /* static member */
  inline def createInSplitPaneUnderFirstWidgets(container: typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.SplitPane): typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ReferenceSetSelector = ^.asInstanceOf[js.Dynamic].applyDynamic("createInSplitPaneUnderFirstWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ReferenceSetSelector]
  
  /**
    * Creates and returns a new ReferenceSetSelector instance in the SDK and on the server.
    * The new ReferenceSetSelector will be automatically stored in the 'secondWidget' property
    * of the parent SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  inline def createInSplitPaneUnderSecondWidget(container: typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.SplitPane): typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ReferenceSetSelector = ^.asInstanceOf[js.Dynamic].applyDynamic("createInSplitPaneUnderSecondWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ReferenceSetSelector]
  
  /**
    * Creates and returns a new ReferenceSetSelector instance in the SDK and on the server.
    * The new ReferenceSetSelector will be automatically stored in the 'secondWidgets' property
    * of the parent SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.23.0
    */
  /* static member */
  inline def createInSplitPaneUnderSecondWidgets(container: typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.SplitPane): typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ReferenceSetSelector = ^.asInstanceOf[js.Dynamic].applyDynamic("createInSplitPaneUnderSecondWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ReferenceSetSelector]
  
  /**
    * Creates and returns a new ReferenceSetSelector instance in the SDK and on the server.
    * The new ReferenceSetSelector will be automatically stored in the 'widget' property
    * of the parent TabPage element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  inline def createInTabPageUnderWidget(container: typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.TabPage): typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ReferenceSetSelector = ^.asInstanceOf[js.Dynamic].applyDynamic("createInTabPageUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ReferenceSetSelector]
  
  /**
    * Creates and returns a new ReferenceSetSelector instance in the SDK and on the server.
    * The new ReferenceSetSelector will be automatically stored in the 'widgets' property
    * of the parent TabPage element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  inline def createInTabPageUnderWidgets(container: typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.TabPage): typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ReferenceSetSelector = ^.asInstanceOf[js.Dynamic].applyDynamic("createInTabPageUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ReferenceSetSelector]
  
  /**
    * Creates and returns a new ReferenceSetSelector instance in the SDK and on the server.
    * The new ReferenceSetSelector will be automatically stored in the 'widget' property
    * of the parent TableCell element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  inline def createInTableCellUnderWidget(container: typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.TableCell): typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ReferenceSetSelector = ^.asInstanceOf[js.Dynamic].applyDynamic("createInTableCellUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ReferenceSetSelector]
  
  /**
    * Creates and returns a new ReferenceSetSelector instance in the SDK and on the server.
    * The new ReferenceSetSelector will be automatically stored in the 'widgets' property
    * of the parent TableCell element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  inline def createInTableCellUnderWidgets(container: typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.TableCell): typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ReferenceSetSelector = ^.asInstanceOf[js.Dynamic].applyDynamic("createInTableCellUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ReferenceSetSelector]
  
  /**
    * Creates and returns a new ReferenceSetSelector instance in the SDK and on the server.
    * The new ReferenceSetSelector will be automatically stored in the 'widget' property
    * of the parent TemplateGridContents element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  inline def createInTemplateGridContentsUnderWidget(container: typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.TemplateGridContents): typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ReferenceSetSelector = ^.asInstanceOf[js.Dynamic].applyDynamic("createInTemplateGridContentsUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ReferenceSetSelector]
  
  /**
    * Creates and returns a new ReferenceSetSelector instance in the SDK and on the server.
    * The new ReferenceSetSelector will be automatically stored in the 'widgets' property
    * of the parent TemplateGridContents element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  inline def createInTemplateGridContentsUnderWidgets(container: typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.TemplateGridContents): typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ReferenceSetSelector = ^.asInstanceOf[js.Dynamic].applyDynamic("createInTemplateGridContentsUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ReferenceSetSelector]
  
  /**
    * Creates and returns a new ReferenceSetSelector instance in the SDK and on the server.
    * The new ReferenceSetSelector will be automatically stored in the 'widgets' property
    * of the parent VerticalFlow element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  inline def createInVerticalFlowUnderWidgets(container: typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.VerticalFlow): typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ReferenceSetSelector = ^.asInstanceOf[js.Dynamic].applyDynamic("createInVerticalFlowUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ReferenceSetSelector]
  
  /**
    * Creates and returns a new ReferenceSetSelector instance in the SDK and on the server.
    * The new ReferenceSetSelector will be automatically stored in the 'widgets' property
    * of the parent WebLayoutContent element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  /* static member */
  inline def createInWebLayoutContentUnderWidgets(container: typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.WebLayoutContent): typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ReferenceSetSelector = ^.asInstanceOf[js.Dynamic].applyDynamic("createInWebLayoutContentUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ReferenceSetSelector]
  
  /**
    * Creates and returns a new ReferenceSetSelector instance in the SDK and on the server.
    * The new ReferenceSetSelector will be automatically stored in the 'widgets' property
    * of the parent customwidgets.WidgetValue element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.2.0 and higher
    */
  /* static member */
  inline def createInWidgetValueUnderWidgets(container: WidgetValue): typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ReferenceSetSelector = ^.asInstanceOf[js.Dynamic].applyDynamic("createInWidgetValueUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ReferenceSetSelector]
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "pages.ReferenceSetSelector.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "pages.ReferenceSetSelector.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
