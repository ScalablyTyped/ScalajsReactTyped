package typingsJapgolly.mendixmodelsdk.mod.pages

import typingsJapgolly.mendixmodelsdk.baseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractElement
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractModel
import typingsJapgolly.mendixmodelsdk.internalMod.ModelUnit
import typingsJapgolly.mendixmodelsdk.pagesMod.StructureVersionInfo
import typingsJapgolly.mendixmodelsdk.reportsMod.reports.ReportPane
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/cancel-button relevant section in reference guide}
  *
  * In version 7.0.2: deleted
  */
@JSImport("mendixmodelsdk", "pages.CancelButton")
@js.native
class CancelButton protected ()
  extends typingsJapgolly.mendixmodelsdk.allModelClassesMod.pages.CancelButton {
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
@JSImport("mendixmodelsdk", "pages.CancelButton")
@js.native
object CancelButton extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new CancelButton instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsJapgolly.mendixmodelsdk.pagesMod.pages.CancelButton = js.native
  /**
    * Creates and returns a new CancelButton instance in the SDK and on the server.
    * The new CancelButton will be automatically stored in the 'footerWidget' property
    * of the parent DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.7.0 to 7.0.1
    */
  def createInDataViewUnderFooterWidget(container: typingsJapgolly.mendixmodelsdk.pagesMod.pages.DataView): typingsJapgolly.mendixmodelsdk.pagesMod.pages.CancelButton = js.native
  /**
    * Creates and returns a new CancelButton instance in the SDK and on the server.
    * The new CancelButton will be automatically stored in the 'widget' property
    * of the parent DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.1
    */
  def createInDataViewUnderWidget(container: typingsJapgolly.mendixmodelsdk.pagesMod.pages.DataView): typingsJapgolly.mendixmodelsdk.pagesMod.pages.CancelButton = js.native
  /**
    * Creates and returns a new CancelButton instance in the SDK and on the server.
    * The new CancelButton will be automatically stored in the 'widget' property
    * of the parent DivContainer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.1
    */
  def createInDivContainerUnderWidget(container: typingsJapgolly.mendixmodelsdk.pagesMod.pages.DivContainer): typingsJapgolly.mendixmodelsdk.pagesMod.pages.CancelButton = js.native
  /**
    * Creates and returns a new CancelButton instance in the SDK and on the server.
    * The new CancelButton will be automatically stored in the 'widget' property
    * of the parent GroupBox element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.1
    */
  def createInGroupBoxUnderWidget(container: typingsJapgolly.mendixmodelsdk.pagesMod.pages.GroupBox): typingsJapgolly.mendixmodelsdk.pagesMod.pages.CancelButton = js.native
  /**
    * Creates and returns a new CancelButton instance in the SDK and on the server.
    * The new CancelButton will be automatically stored in the 'leftWidget' property
    * of the parent Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.1
    */
  def createInHeaderUnderLeftWidget(container: typingsJapgolly.mendixmodelsdk.pagesMod.pages.Header): typingsJapgolly.mendixmodelsdk.pagesMod.pages.CancelButton = js.native
  /**
    * Creates and returns a new CancelButton instance in the SDK and on the server.
    * The new CancelButton will be automatically stored in the 'rightWidget' property
    * of the parent Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.1
    */
  def createInHeaderUnderRightWidget(container: typingsJapgolly.mendixmodelsdk.pagesMod.pages.Header): typingsJapgolly.mendixmodelsdk.pagesMod.pages.CancelButton = js.native
  /**
    * Creates and returns a new CancelButton instance in the SDK and on the server.
    * The new CancelButton will be automatically stored in the 'widget' property
    * of the parent LayoutCallArgument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.1
    */
  def createInLayoutCallArgumentUnderWidget(container: typingsJapgolly.mendixmodelsdk.pagesMod.pages.LayoutCallArgument): typingsJapgolly.mendixmodelsdk.pagesMod.pages.CancelButton = js.native
  /**
    * Creates and returns a new CancelButton instance in the SDK and on the server.
    * The new CancelButton will be automatically stored in the 'widget' property
    * of the parent LayoutGridColumn element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.1
    */
  def createInLayoutGridColumnUnderWidget(container: typingsJapgolly.mendixmodelsdk.pagesMod.pages.LayoutGridColumn): typingsJapgolly.mendixmodelsdk.pagesMod.pages.CancelButton = js.native
  /**
    * Creates and returns a new CancelButton instance in the SDK and on the server.
    * The new CancelButton will be automatically stored in the 'widget' property
    * of the parent Layout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.1
    */
  def createInLayoutUnderWidget(container: typingsJapgolly.mendixmodelsdk.pagesMod.pages.Layout): typingsJapgolly.mendixmodelsdk.pagesMod.pages.CancelButton = js.native
  /**
    * Creates and returns a new CancelButton instance in the SDK and on the server.
    * The new CancelButton will be automatically stored in the 'widget' property
    * of the parent ListViewTemplate element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.1
    */
  def createInListViewTemplateUnderWidget(container: typingsJapgolly.mendixmodelsdk.pagesMod.pages.ListViewTemplate): typingsJapgolly.mendixmodelsdk.pagesMod.pages.CancelButton = js.native
  /**
    * Creates and returns a new CancelButton instance in the SDK and on the server.
    * The new CancelButton will be automatically stored in the 'widget' property
    * of the parent ListView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.1
    */
  def createInListViewUnderWidget(container: typingsJapgolly.mendixmodelsdk.pagesMod.pages.ListView): typingsJapgolly.mendixmodelsdk.pagesMod.pages.CancelButton = js.native
  /**
    * Creates and returns a new CancelButton instance in the SDK and on the server.
    * The new CancelButton will be automatically stored in the 'widget' property
    * of the parent NavigationListItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.1
    */
  def createInNavigationListItemUnderWidget(container: typingsJapgolly.mendixmodelsdk.pagesMod.pages.NavigationListItem): typingsJapgolly.mendixmodelsdk.pagesMod.pages.CancelButton = js.native
  /**
    * Creates and returns a new CancelButton instance in the SDK and on the server.
    * The new CancelButton will be automatically stored in the 'parameterWidget' property
    * of the parent reports.ReportPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 6.9.0
    */
  def createInReportPaneUnderParameterWidget(container: ReportPane): typingsJapgolly.mendixmodelsdk.pagesMod.pages.CancelButton = js.native
  /**
    * Creates and returns a new CancelButton instance in the SDK and on the server.
    * The new CancelButton will be automatically stored in the 'reportWidget' property
    * of the parent reports.ReportPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 6.9.0
    */
  def createInReportPaneUnderReportWidget(container: ReportPane): typingsJapgolly.mendixmodelsdk.pagesMod.pages.CancelButton = js.native
  /**
    * Creates and returns a new CancelButton instance in the SDK and on the server.
    * The new CancelButton will be automatically stored in the 'widget' property
    * of the parent ScrollContainerRegion element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.1
    */
  def createInScrollContainerRegionUnderWidget(container: typingsJapgolly.mendixmodelsdk.pagesMod.pages.ScrollContainerRegion): typingsJapgolly.mendixmodelsdk.pagesMod.pages.CancelButton = js.native
  /**
    * Creates and returns a new CancelButton instance in the SDK and on the server.
    * The new CancelButton will be automatically stored in the 'widget' property
    * of the parent Snippet element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.1
    */
  def createInSnippetUnderWidget(container: typingsJapgolly.mendixmodelsdk.pagesMod.pages.Snippet): typingsJapgolly.mendixmodelsdk.pagesMod.pages.CancelButton = js.native
  /**
    * Creates and returns a new CancelButton instance in the SDK and on the server.
    * The new CancelButton will be automatically stored in the 'firstWidget' property
    * of the parent SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.1
    */
  def createInSplitPaneUnderFirstWidget(container: typingsJapgolly.mendixmodelsdk.pagesMod.pages.SplitPane): typingsJapgolly.mendixmodelsdk.pagesMod.pages.CancelButton = js.native
  /**
    * Creates and returns a new CancelButton instance in the SDK and on the server.
    * The new CancelButton will be automatically stored in the 'secondWidget' property
    * of the parent SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.1
    */
  def createInSplitPaneUnderSecondWidget(container: typingsJapgolly.mendixmodelsdk.pagesMod.pages.SplitPane): typingsJapgolly.mendixmodelsdk.pagesMod.pages.CancelButton = js.native
  /**
    * Creates and returns a new CancelButton instance in the SDK and on the server.
    * The new CancelButton will be automatically stored in the 'widget' property
    * of the parent TabPage element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.1
    */
  def createInTabPageUnderWidget(container: typingsJapgolly.mendixmodelsdk.pagesMod.pages.TabPage): typingsJapgolly.mendixmodelsdk.pagesMod.pages.CancelButton = js.native
  /**
    * Creates and returns a new CancelButton instance in the SDK and on the server.
    * The new CancelButton will be automatically stored in the 'widget' property
    * of the parent TableCell element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.1
    */
  def createInTableCellUnderWidget(container: typingsJapgolly.mendixmodelsdk.pagesMod.pages.TableCell): typingsJapgolly.mendixmodelsdk.pagesMod.pages.CancelButton = js.native
  /**
    * Creates and returns a new CancelButton instance in the SDK and on the server.
    * The new CancelButton will be automatically stored in the 'widget' property
    * of the parent TemplateGridContents element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.1
    */
  def createInTemplateGridContentsUnderWidget(container: typingsJapgolly.mendixmodelsdk.pagesMod.pages.TemplateGridContents): typingsJapgolly.mendixmodelsdk.pagesMod.pages.CancelButton = js.native
  /**
    * Creates and returns a new CancelButton instance in the SDK and on the server.
    * The new CancelButton will be automatically stored in the 'widgets' property
    * of the parent VerticalFlow element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.1
    */
  def createInVerticalFlowUnderWidgets(container: typingsJapgolly.mendixmodelsdk.pagesMod.pages.VerticalFlow): typingsJapgolly.mendixmodelsdk.pagesMod.pages.CancelButton = js.native
}

