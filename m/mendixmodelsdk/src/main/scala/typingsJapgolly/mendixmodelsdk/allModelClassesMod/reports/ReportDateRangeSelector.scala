package typingsJapgolly.mendixmodelsdk.allModelClassesMod.reports

import typingsJapgolly.mendixmodelsdk.baseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValue
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractElement
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractModel
import typingsJapgolly.mendixmodelsdk.internalMod.ModelUnit
import typingsJapgolly.mendixmodelsdk.nativepagesMod.nativepages.NativeLayout
import typingsJapgolly.mendixmodelsdk.nativepagesMod.nativepages.NativeLayoutCallArgument
import typingsJapgolly.mendixmodelsdk.pagesMod.pages.BuildingBlock
import typingsJapgolly.mendixmodelsdk.pagesMod.pages.DataView
import typingsJapgolly.mendixmodelsdk.pagesMod.pages.DivContainer
import typingsJapgolly.mendixmodelsdk.pagesMod.pages.GroupBox
import typingsJapgolly.mendixmodelsdk.pagesMod.pages.Header
import typingsJapgolly.mendixmodelsdk.pagesMod.pages.Layout
import typingsJapgolly.mendixmodelsdk.pagesMod.pages.LayoutCallArgument
import typingsJapgolly.mendixmodelsdk.pagesMod.pages.LayoutGridColumn
import typingsJapgolly.mendixmodelsdk.pagesMod.pages.ListView
import typingsJapgolly.mendixmodelsdk.pagesMod.pages.ListViewTemplate
import typingsJapgolly.mendixmodelsdk.pagesMod.pages.MasterDetailRegion
import typingsJapgolly.mendixmodelsdk.pagesMod.pages.NativeLayoutContent
import typingsJapgolly.mendixmodelsdk.pagesMod.pages.NavigationListItem
import typingsJapgolly.mendixmodelsdk.pagesMod.pages.ScrollContainerRegion
import typingsJapgolly.mendixmodelsdk.pagesMod.pages.Snippet
import typingsJapgolly.mendixmodelsdk.pagesMod.pages.SplitPane
import typingsJapgolly.mendixmodelsdk.pagesMod.pages.TabPage
import typingsJapgolly.mendixmodelsdk.pagesMod.pages.TableCell
import typingsJapgolly.mendixmodelsdk.pagesMod.pages.TemplateGridContents
import typingsJapgolly.mendixmodelsdk.pagesMod.pages.VerticalFlow
import typingsJapgolly.mendixmodelsdk.pagesMod.pages.WebLayoutContent
import typingsJapgolly.mendixmodelsdk.reportsMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/report-date-parameter relevant section in reference guide}
  */
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportDateRangeSelector")
@js.native
class ReportDateRangeSelector protected ()
  extends typingsJapgolly.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector {
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
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportDateRangeSelector")
@js.native
object ReportDateRangeSelector extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsJapgolly.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = js.native
  /**
    * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
    * The new ReportDateRangeSelector will be automatically stored in the 'widget' property
    * of the parent pages.BuildingBlock element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.7.0 to 7.14.0
    */
  def createInBuildingBlockUnderWidget(container: BuildingBlock): typingsJapgolly.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = js.native
  /**
    * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
    * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
    * of the parent pages.BuildingBlock element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInBuildingBlockUnderWidgets(container: BuildingBlock): typingsJapgolly.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = js.native
  /**
    * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
    * The new ReportDateRangeSelector will be automatically stored in the 'footerWidget' property
    * of the parent pages.DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.7.0 to 7.14.0
    */
  def createInDataViewUnderFooterWidget(container: DataView): typingsJapgolly.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = js.native
  /**
    * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
    * The new ReportDateRangeSelector will be automatically stored in the 'footerWidgets' property
    * of the parent pages.DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInDataViewUnderFooterWidgets(container: DataView): typingsJapgolly.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = js.native
  /**
    * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
    * The new ReportDateRangeSelector will be automatically stored in the 'widget' property
    * of the parent pages.DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInDataViewUnderWidget(container: DataView): typingsJapgolly.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = js.native
  /**
    * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
    * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
    * of the parent pages.DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInDataViewUnderWidgets(container: DataView): typingsJapgolly.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = js.native
  /**
    * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
    * The new ReportDateRangeSelector will be automatically stored in the 'widget' property
    * of the parent pages.DivContainer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInDivContainerUnderWidget(container: DivContainer): typingsJapgolly.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = js.native
  /**
    * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
    * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
    * of the parent pages.DivContainer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInDivContainerUnderWidgets(container: DivContainer): typingsJapgolly.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = js.native
  /**
    * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
    * The new ReportDateRangeSelector will be automatically stored in the 'widget' property
    * of the parent pages.GroupBox element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInGroupBoxUnderWidget(container: GroupBox): typingsJapgolly.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = js.native
  /**
    * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
    * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
    * of the parent pages.GroupBox element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInGroupBoxUnderWidgets(container: GroupBox): typingsJapgolly.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = js.native
  /**
    * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
    * The new ReportDateRangeSelector will be automatically stored in the 'leftWidget' property
    * of the parent pages.Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInHeaderUnderLeftWidget(container: Header): typingsJapgolly.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = js.native
  /**
    * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
    * The new ReportDateRangeSelector will be automatically stored in the 'leftWidgets' property
    * of the parent pages.Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInHeaderUnderLeftWidgets(container: Header): typingsJapgolly.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = js.native
  /**
    * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
    * The new ReportDateRangeSelector will be automatically stored in the 'rightWidget' property
    * of the parent pages.Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInHeaderUnderRightWidget(container: Header): typingsJapgolly.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = js.native
  /**
    * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
    * The new ReportDateRangeSelector will be automatically stored in the 'rightWidgets' property
    * of the parent pages.Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInHeaderUnderRightWidgets(container: Header): typingsJapgolly.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = js.native
  /**
    * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
    * The new ReportDateRangeSelector will be automatically stored in the 'widget' property
    * of the parent pages.LayoutCallArgument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInLayoutCallArgumentUnderWidget(container: LayoutCallArgument): typingsJapgolly.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = js.native
  /**
    * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
    * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
    * of the parent pages.LayoutCallArgument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInLayoutCallArgumentUnderWidgets(container: LayoutCallArgument): typingsJapgolly.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = js.native
  /**
    * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
    * The new ReportDateRangeSelector will be automatically stored in the 'widget' property
    * of the parent pages.LayoutGridColumn element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInLayoutGridColumnUnderWidget(container: LayoutGridColumn): typingsJapgolly.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = js.native
  /**
    * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
    * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
    * of the parent pages.LayoutGridColumn element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInLayoutGridColumnUnderWidgets(container: LayoutGridColumn): typingsJapgolly.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = js.native
  /**
    * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
    * The new ReportDateRangeSelector will be automatically stored in the 'widget' property
    * of the parent pages.Layout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInLayoutUnderWidget(container: Layout): typingsJapgolly.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = js.native
  /**
    * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
    * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
    * of the parent pages.Layout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.23.0
    */
  def createInLayoutUnderWidgets(container: Layout): typingsJapgolly.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = js.native
  /**
    * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
    * The new ReportDateRangeSelector will be automatically stored in the 'widget' property
    * of the parent pages.ListViewTemplate element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInListViewTemplateUnderWidget(container: ListViewTemplate): typingsJapgolly.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = js.native
  /**
    * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
    * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
    * of the parent pages.ListViewTemplate element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInListViewTemplateUnderWidgets(container: ListViewTemplate): typingsJapgolly.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = js.native
  /**
    * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
    * The new ReportDateRangeSelector will be automatically stored in the 'widget' property
    * of the parent pages.ListView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInListViewUnderWidget(container: ListView): typingsJapgolly.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = js.native
  /**
    * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
    * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
    * of the parent pages.ListView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInListViewUnderWidgets(container: ListView): typingsJapgolly.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = js.native
  /**
    * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
    * The new ReportDateRangeSelector will be automatically stored in the 'widget' property
    * of the parent pages.MasterDetailRegion element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.1.0 to 7.14.0
    */
  def createInMasterDetailRegionUnderWidget(container: MasterDetailRegion): typingsJapgolly.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = js.native
  /**
    * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
    * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
    * of the parent nativepages.NativeLayoutCallArgument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.23.0 to 7.23.0
    */
  def createInNativeLayoutCallArgumentUnderWidgets(container: NativeLayoutCallArgument): typingsJapgolly.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = js.native
  /**
    * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
    * The new ReportDateRangeSelector will be automatically stored in the 'sidebarWidgets' property
    * of the parent pages.NativeLayoutContent element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.5.0 and higher
    */
  def createInNativeLayoutContentUnderSidebarWidgets(container: NativeLayoutContent): typingsJapgolly.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = js.native
  /**
    * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
    * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
    * of the parent pages.NativeLayoutContent element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  def createInNativeLayoutContentUnderWidgets(container: NativeLayoutContent): typingsJapgolly.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = js.native
  /**
    * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
    * The new ReportDateRangeSelector will be automatically stored in the 'headerWidget' property
    * of the parent nativepages.NativeLayout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.22.0 to 7.23.0
    */
  def createInNativeLayoutUnderHeaderWidget(container: NativeLayout): typingsJapgolly.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = js.native
  /**
    * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
    * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
    * of the parent nativepages.NativeLayout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.21.0 to 7.23.0
    */
  def createInNativeLayoutUnderWidgets(container: NativeLayout): typingsJapgolly.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = js.native
  /**
    * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
    * The new ReportDateRangeSelector will be automatically stored in the 'widget' property
    * of the parent pages.NavigationListItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInNavigationListItemUnderWidget(container: NavigationListItem): typingsJapgolly.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = js.native
  /**
    * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
    * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
    * of the parent pages.NavigationListItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInNavigationListItemUnderWidgets(container: NavigationListItem): typingsJapgolly.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = js.native
  /**
    * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
    * The new ReportDateRangeSelector will be automatically stored in the 'parameterWidget' property
    * of the parent ReportPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 6.9.0
    */
  def createInReportPaneUnderParameterWidget(container: typingsJapgolly.mendixmodelsdk.reportsMod.reports.ReportPane): typingsJapgolly.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = js.native
  /**
    * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
    * The new ReportDateRangeSelector will be automatically stored in the 'reportWidget' property
    * of the parent ReportPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 6.9.0
    */
  def createInReportPaneUnderReportWidget(container: typingsJapgolly.mendixmodelsdk.reportsMod.reports.ReportPane): typingsJapgolly.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = js.native
  /**
    * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
    * The new ReportDateRangeSelector will be automatically stored in the 'widget' property
    * of the parent pages.ScrollContainerRegion element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInScrollContainerRegionUnderWidget(container: ScrollContainerRegion): typingsJapgolly.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = js.native
  /**
    * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
    * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
    * of the parent pages.ScrollContainerRegion element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInScrollContainerRegionUnderWidgets(container: ScrollContainerRegion): typingsJapgolly.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = js.native
  /**
    * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
    * The new ReportDateRangeSelector will be automatically stored in the 'widget' property
    * of the parent pages.Snippet element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInSnippetUnderWidget(container: Snippet): typingsJapgolly.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = js.native
  /**
    * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
    * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
    * of the parent pages.Snippet element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInSnippetUnderWidgets(container: Snippet): typingsJapgolly.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = js.native
  /**
    * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
    * The new ReportDateRangeSelector will be automatically stored in the 'firstWidget' property
    * of the parent pages.SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInSplitPaneUnderFirstWidget(container: SplitPane): typingsJapgolly.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = js.native
  /**
    * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
    * The new ReportDateRangeSelector will be automatically stored in the 'firstWidgets' property
    * of the parent pages.SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.23.0
    */
  def createInSplitPaneUnderFirstWidgets(container: SplitPane): typingsJapgolly.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = js.native
  /**
    * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
    * The new ReportDateRangeSelector will be automatically stored in the 'secondWidget' property
    * of the parent pages.SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInSplitPaneUnderSecondWidget(container: SplitPane): typingsJapgolly.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = js.native
  /**
    * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
    * The new ReportDateRangeSelector will be automatically stored in the 'secondWidgets' property
    * of the parent pages.SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.23.0
    */
  def createInSplitPaneUnderSecondWidgets(container: SplitPane): typingsJapgolly.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = js.native
  /**
    * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
    * The new ReportDateRangeSelector will be automatically stored in the 'widget' property
    * of the parent pages.TabPage element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInTabPageUnderWidget(container: TabPage): typingsJapgolly.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = js.native
  /**
    * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
    * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
    * of the parent pages.TabPage element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInTabPageUnderWidgets(container: TabPage): typingsJapgolly.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = js.native
  /**
    * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
    * The new ReportDateRangeSelector will be automatically stored in the 'widget' property
    * of the parent pages.TableCell element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInTableCellUnderWidget(container: TableCell): typingsJapgolly.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = js.native
  /**
    * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
    * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
    * of the parent pages.TableCell element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInTableCellUnderWidgets(container: TableCell): typingsJapgolly.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = js.native
  /**
    * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
    * The new ReportDateRangeSelector will be automatically stored in the 'widget' property
    * of the parent pages.TemplateGridContents element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInTemplateGridContentsUnderWidget(container: TemplateGridContents): typingsJapgolly.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = js.native
  /**
    * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
    * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
    * of the parent pages.TemplateGridContents element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInTemplateGridContentsUnderWidgets(container: TemplateGridContents): typingsJapgolly.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = js.native
  /**
    * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
    * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
    * of the parent pages.VerticalFlow element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInVerticalFlowUnderWidgets(container: VerticalFlow): typingsJapgolly.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = js.native
  /**
    * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
    * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
    * of the parent pages.WebLayoutContent element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  def createInWebLayoutContentUnderWidgets(container: WebLayoutContent): typingsJapgolly.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = js.native
  /**
    * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
    * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
    * of the parent customwidgets.WidgetValue element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.2.0 and higher
    */
  def createInWidgetValueUnderWidgets(container: WidgetValue): typingsJapgolly.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = js.native
}

