package typingsJapgolly.mendixmodelsdk.reportsMod.reports

import typingsJapgolly.mendixmodelsdk.baseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractElement
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractModel
import typingsJapgolly.mendixmodelsdk.internalMod.ModelUnit
import typingsJapgolly.mendixmodelsdk.pagesMod.pages.DataView
import typingsJapgolly.mendixmodelsdk.pagesMod.pages.DivContainer
import typingsJapgolly.mendixmodelsdk.pagesMod.pages.GroupBox
import typingsJapgolly.mendixmodelsdk.pagesMod.pages.Header
import typingsJapgolly.mendixmodelsdk.pagesMod.pages.Layout
import typingsJapgolly.mendixmodelsdk.pagesMod.pages.LayoutCallArgument
import typingsJapgolly.mendixmodelsdk.pagesMod.pages.LayoutGridColumn
import typingsJapgolly.mendixmodelsdk.pagesMod.pages.ListView
import typingsJapgolly.mendixmodelsdk.pagesMod.pages.ListViewTemplate
import typingsJapgolly.mendixmodelsdk.pagesMod.pages.NavigationListItem
import typingsJapgolly.mendixmodelsdk.pagesMod.pages.ScrollContainerRegion
import typingsJapgolly.mendixmodelsdk.pagesMod.pages.Snippet
import typingsJapgolly.mendixmodelsdk.pagesMod.pages.SplitPane
import typingsJapgolly.mendixmodelsdk.pagesMod.pages.TabPage
import typingsJapgolly.mendixmodelsdk.pagesMod.pages.TableCell
import typingsJapgolly.mendixmodelsdk.pagesMod.pages.TemplateGridContents
import typingsJapgolly.mendixmodelsdk.pagesMod.pages.VerticalFlow
import typingsJapgolly.mendixmodelsdk.pagesMod.pages.Widget
import typingsJapgolly.mendixmodelsdk.reportsMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/report-pane relevant section in reference guide}
  *
  * In version 6.10.0: deleted
  */
@JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportPane")
@js.native
class ReportPane protected () extends Widget {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FReportPane: IModel = js.native
  def generateOnLoad(): Boolean = js.native
  def generateOnLoad(newValue: Boolean): js.Any = js.native
  def parameterWidget(): js.Any = js.native
  def parameterWidget(newValue: Widget): js.Any = js.native
  @JSName("parameterWidget")
  def parameterWidget_Union(): Widget | Null = js.native
  def reportWidget(): js.Any = js.native
  def reportWidget(newValue: Widget): js.Any = js.native
  @JSName("reportWidget")
  def reportWidget_Union(): Widget | Null = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportPane")
@js.native
object ReportPane extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new ReportPane instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): ReportPane = js.native
  /**
    * Creates and returns a new ReportPane instance in the SDK and on the server.
    * The new ReportPane will be automatically stored in the 'footerWidget' property
    * of the parent pages.DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.7.0 to 6.9.0
    */
  def createInDataViewUnderFooterWidget(container: DataView): ReportPane = js.native
  /**
    * Creates and returns a new ReportPane instance in the SDK and on the server.
    * The new ReportPane will be automatically stored in the 'widget' property
    * of the parent pages.DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 6.9.0
    */
  def createInDataViewUnderWidget(container: DataView): ReportPane = js.native
  /**
    * Creates and returns a new ReportPane instance in the SDK and on the server.
    * The new ReportPane will be automatically stored in the 'widget' property
    * of the parent pages.DivContainer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 6.9.0
    */
  def createInDivContainerUnderWidget(container: DivContainer): ReportPane = js.native
  /**
    * Creates and returns a new ReportPane instance in the SDK and on the server.
    * The new ReportPane will be automatically stored in the 'widget' property
    * of the parent pages.GroupBox element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 6.9.0
    */
  def createInGroupBoxUnderWidget(container: GroupBox): ReportPane = js.native
  /**
    * Creates and returns a new ReportPane instance in the SDK and on the server.
    * The new ReportPane will be automatically stored in the 'leftWidget' property
    * of the parent pages.Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 6.9.0
    */
  def createInHeaderUnderLeftWidget(container: Header): ReportPane = js.native
  /**
    * Creates and returns a new ReportPane instance in the SDK and on the server.
    * The new ReportPane will be automatically stored in the 'rightWidget' property
    * of the parent pages.Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 6.9.0
    */
  def createInHeaderUnderRightWidget(container: Header): ReportPane = js.native
  /**
    * Creates and returns a new ReportPane instance in the SDK and on the server.
    * The new ReportPane will be automatically stored in the 'widget' property
    * of the parent pages.LayoutCallArgument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 6.9.0
    */
  def createInLayoutCallArgumentUnderWidget(container: LayoutCallArgument): ReportPane = js.native
  /**
    * Creates and returns a new ReportPane instance in the SDK and on the server.
    * The new ReportPane will be automatically stored in the 'widget' property
    * of the parent pages.LayoutGridColumn element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 6.9.0
    */
  def createInLayoutGridColumnUnderWidget(container: LayoutGridColumn): ReportPane = js.native
  /**
    * Creates and returns a new ReportPane instance in the SDK and on the server.
    * The new ReportPane will be automatically stored in the 'widget' property
    * of the parent pages.Layout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 6.9.0
    */
  def createInLayoutUnderWidget(container: Layout): ReportPane = js.native
  /**
    * Creates and returns a new ReportPane instance in the SDK and on the server.
    * The new ReportPane will be automatically stored in the 'widget' property
    * of the parent pages.ListViewTemplate element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 6.9.0
    */
  def createInListViewTemplateUnderWidget(container: ListViewTemplate): ReportPane = js.native
  /**
    * Creates and returns a new ReportPane instance in the SDK and on the server.
    * The new ReportPane will be automatically stored in the 'widget' property
    * of the parent pages.ListView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 6.9.0
    */
  def createInListViewUnderWidget(container: ListView): ReportPane = js.native
  /**
    * Creates and returns a new ReportPane instance in the SDK and on the server.
    * The new ReportPane will be automatically stored in the 'widget' property
    * of the parent pages.NavigationListItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 6.9.0
    */
  def createInNavigationListItemUnderWidget(container: NavigationListItem): ReportPane = js.native
  /**
    * Creates and returns a new ReportPane instance in the SDK and on the server.
    * The new ReportPane will be automatically stored in the 'parameterWidget' property
    * of the parent ReportPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 6.9.0
    */
  def createInReportPaneUnderParameterWidget(container: ReportPane): ReportPane = js.native
  /**
    * Creates and returns a new ReportPane instance in the SDK and on the server.
    * The new ReportPane will be automatically stored in the 'reportWidget' property
    * of the parent ReportPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 6.9.0
    */
  def createInReportPaneUnderReportWidget(container: ReportPane): ReportPane = js.native
  /**
    * Creates and returns a new ReportPane instance in the SDK and on the server.
    * The new ReportPane will be automatically stored in the 'widget' property
    * of the parent pages.ScrollContainerRegion element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 6.9.0
    */
  def createInScrollContainerRegionUnderWidget(container: ScrollContainerRegion): ReportPane = js.native
  /**
    * Creates and returns a new ReportPane instance in the SDK and on the server.
    * The new ReportPane will be automatically stored in the 'widget' property
    * of the parent pages.Snippet element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 6.9.0
    */
  def createInSnippetUnderWidget(container: Snippet): ReportPane = js.native
  /**
    * Creates and returns a new ReportPane instance in the SDK and on the server.
    * The new ReportPane will be automatically stored in the 'firstWidget' property
    * of the parent pages.SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 6.9.0
    */
  def createInSplitPaneUnderFirstWidget(container: SplitPane): ReportPane = js.native
  /**
    * Creates and returns a new ReportPane instance in the SDK and on the server.
    * The new ReportPane will be automatically stored in the 'secondWidget' property
    * of the parent pages.SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 6.9.0
    */
  def createInSplitPaneUnderSecondWidget(container: SplitPane): ReportPane = js.native
  /**
    * Creates and returns a new ReportPane instance in the SDK and on the server.
    * The new ReportPane will be automatically stored in the 'widget' property
    * of the parent pages.TabPage element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 6.9.0
    */
  def createInTabPageUnderWidget(container: TabPage): ReportPane = js.native
  /**
    * Creates and returns a new ReportPane instance in the SDK and on the server.
    * The new ReportPane will be automatically stored in the 'widget' property
    * of the parent pages.TableCell element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 6.9.0
    */
  def createInTableCellUnderWidget(container: TableCell): ReportPane = js.native
  /**
    * Creates and returns a new ReportPane instance in the SDK and on the server.
    * The new ReportPane will be automatically stored in the 'widget' property
    * of the parent pages.TemplateGridContents element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 6.9.0
    */
  def createInTemplateGridContentsUnderWidget(container: TemplateGridContents): ReportPane = js.native
  /**
    * Creates and returns a new ReportPane instance in the SDK and on the server.
    * The new ReportPane will be automatically stored in the 'widgets' property
    * of the parent pages.VerticalFlow element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 6.9.0
    */
  def createInVerticalFlowUnderWidgets(container: VerticalFlow): ReportPane = js.native
}

