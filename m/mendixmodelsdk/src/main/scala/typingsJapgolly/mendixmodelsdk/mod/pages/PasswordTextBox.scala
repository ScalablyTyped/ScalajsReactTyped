package typingsJapgolly.mendixmodelsdk.mod.pages

import typingsJapgolly.mendixmodelsdk.baseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValue
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractElement
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractModel
import typingsJapgolly.mendixmodelsdk.internalMod.ModelUnit
import typingsJapgolly.mendixmodelsdk.nativepagesMod.nativepages.NativeLayout
import typingsJapgolly.mendixmodelsdk.nativepagesMod.nativepages.NativeLayoutCallArgument
import typingsJapgolly.mendixmodelsdk.pagesMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/password-text-box relevant section in reference guide}
  *
  * In version 7.0.2: introduced
  */
@JSImport("mendixmodelsdk", "pages.PasswordTextBox")
@js.native
class PasswordTextBox protected ()
  extends typingsJapgolly.mendixmodelsdk.allModelClassesMod.pages.PasswordTextBox {
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
@JSImport("mendixmodelsdk", "pages.PasswordTextBox")
@js.native
object PasswordTextBox extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new PasswordTextBox instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsJapgolly.mendixmodelsdk.pagesMod.pages.PasswordTextBox = js.native
  /**
    * Creates and returns a new PasswordTextBox instance in the SDK and on the server.
    * The new PasswordTextBox will be automatically stored in the 'widget' property
    * of the parent BuildingBlock element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.7.0 to 7.14.0
    */
  def createInBuildingBlockUnderWidget(container: typingsJapgolly.mendixmodelsdk.pagesMod.pages.BuildingBlock): typingsJapgolly.mendixmodelsdk.pagesMod.pages.PasswordTextBox = js.native
  /**
    * Creates and returns a new PasswordTextBox instance in the SDK and on the server.
    * The new PasswordTextBox will be automatically stored in the 'widgets' property
    * of the parent BuildingBlock element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInBuildingBlockUnderWidgets(container: typingsJapgolly.mendixmodelsdk.pagesMod.pages.BuildingBlock): typingsJapgolly.mendixmodelsdk.pagesMod.pages.PasswordTextBox = js.native
  /**
    * Creates and returns a new PasswordTextBox instance in the SDK and on the server.
    * The new PasswordTextBox will be automatically stored in the 'footerWidget' property
    * of the parent DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.0.2 to 7.14.0
    */
  def createInDataViewUnderFooterWidget(container: typingsJapgolly.mendixmodelsdk.pagesMod.pages.DataView): typingsJapgolly.mendixmodelsdk.pagesMod.pages.PasswordTextBox = js.native
  /**
    * Creates and returns a new PasswordTextBox instance in the SDK and on the server.
    * The new PasswordTextBox will be automatically stored in the 'footerWidgets' property
    * of the parent DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInDataViewUnderFooterWidgets(container: typingsJapgolly.mendixmodelsdk.pagesMod.pages.DataView): typingsJapgolly.mendixmodelsdk.pagesMod.pages.PasswordTextBox = js.native
  /**
    * Creates and returns a new PasswordTextBox instance in the SDK and on the server.
    * The new PasswordTextBox will be automatically stored in the 'widget' property
    * of the parent DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.0.2 to 7.14.0
    */
  def createInDataViewUnderWidget(container: typingsJapgolly.mendixmodelsdk.pagesMod.pages.DataView): typingsJapgolly.mendixmodelsdk.pagesMod.pages.PasswordTextBox = js.native
  /**
    * Creates and returns a new PasswordTextBox instance in the SDK and on the server.
    * The new PasswordTextBox will be automatically stored in the 'widgets' property
    * of the parent DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInDataViewUnderWidgets(container: typingsJapgolly.mendixmodelsdk.pagesMod.pages.DataView): typingsJapgolly.mendixmodelsdk.pagesMod.pages.PasswordTextBox = js.native
  /**
    * Creates and returns a new PasswordTextBox instance in the SDK and on the server.
    * The new PasswordTextBox will be automatically stored in the 'widget' property
    * of the parent DivContainer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.0.2 to 7.14.0
    */
  def createInDivContainerUnderWidget(container: typingsJapgolly.mendixmodelsdk.pagesMod.pages.DivContainer): typingsJapgolly.mendixmodelsdk.pagesMod.pages.PasswordTextBox = js.native
  /**
    * Creates and returns a new PasswordTextBox instance in the SDK and on the server.
    * The new PasswordTextBox will be automatically stored in the 'widgets' property
    * of the parent DivContainer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInDivContainerUnderWidgets(container: typingsJapgolly.mendixmodelsdk.pagesMod.pages.DivContainer): typingsJapgolly.mendixmodelsdk.pagesMod.pages.PasswordTextBox = js.native
  /**
    * Creates and returns a new PasswordTextBox instance in the SDK and on the server.
    * The new PasswordTextBox will be automatically stored in the 'widget' property
    * of the parent GroupBox element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.0.2 to 7.14.0
    */
  def createInGroupBoxUnderWidget(container: typingsJapgolly.mendixmodelsdk.pagesMod.pages.GroupBox): typingsJapgolly.mendixmodelsdk.pagesMod.pages.PasswordTextBox = js.native
  /**
    * Creates and returns a new PasswordTextBox instance in the SDK and on the server.
    * The new PasswordTextBox will be automatically stored in the 'widgets' property
    * of the parent GroupBox element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInGroupBoxUnderWidgets(container: typingsJapgolly.mendixmodelsdk.pagesMod.pages.GroupBox): typingsJapgolly.mendixmodelsdk.pagesMod.pages.PasswordTextBox = js.native
  /**
    * Creates and returns a new PasswordTextBox instance in the SDK and on the server.
    * The new PasswordTextBox will be automatically stored in the 'leftWidget' property
    * of the parent Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.0.2 to 7.14.0
    */
  def createInHeaderUnderLeftWidget(container: typingsJapgolly.mendixmodelsdk.pagesMod.pages.Header): typingsJapgolly.mendixmodelsdk.pagesMod.pages.PasswordTextBox = js.native
  /**
    * Creates and returns a new PasswordTextBox instance in the SDK and on the server.
    * The new PasswordTextBox will be automatically stored in the 'leftWidgets' property
    * of the parent Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInHeaderUnderLeftWidgets(container: typingsJapgolly.mendixmodelsdk.pagesMod.pages.Header): typingsJapgolly.mendixmodelsdk.pagesMod.pages.PasswordTextBox = js.native
  /**
    * Creates and returns a new PasswordTextBox instance in the SDK and on the server.
    * The new PasswordTextBox will be automatically stored in the 'rightWidget' property
    * of the parent Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.0.2 to 7.14.0
    */
  def createInHeaderUnderRightWidget(container: typingsJapgolly.mendixmodelsdk.pagesMod.pages.Header): typingsJapgolly.mendixmodelsdk.pagesMod.pages.PasswordTextBox = js.native
  /**
    * Creates and returns a new PasswordTextBox instance in the SDK and on the server.
    * The new PasswordTextBox will be automatically stored in the 'rightWidgets' property
    * of the parent Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInHeaderUnderRightWidgets(container: typingsJapgolly.mendixmodelsdk.pagesMod.pages.Header): typingsJapgolly.mendixmodelsdk.pagesMod.pages.PasswordTextBox = js.native
  /**
    * Creates and returns a new PasswordTextBox instance in the SDK and on the server.
    * The new PasswordTextBox will be automatically stored in the 'widget' property
    * of the parent LayoutCallArgument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.0.2 to 7.14.0
    */
  def createInLayoutCallArgumentUnderWidget(container: typingsJapgolly.mendixmodelsdk.pagesMod.pages.LayoutCallArgument): typingsJapgolly.mendixmodelsdk.pagesMod.pages.PasswordTextBox = js.native
  /**
    * Creates and returns a new PasswordTextBox instance in the SDK and on the server.
    * The new PasswordTextBox will be automatically stored in the 'widgets' property
    * of the parent LayoutCallArgument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInLayoutCallArgumentUnderWidgets(container: typingsJapgolly.mendixmodelsdk.pagesMod.pages.LayoutCallArgument): typingsJapgolly.mendixmodelsdk.pagesMod.pages.PasswordTextBox = js.native
  /**
    * Creates and returns a new PasswordTextBox instance in the SDK and on the server.
    * The new PasswordTextBox will be automatically stored in the 'widget' property
    * of the parent LayoutGridColumn element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.0.2 to 7.14.0
    */
  def createInLayoutGridColumnUnderWidget(container: typingsJapgolly.mendixmodelsdk.pagesMod.pages.LayoutGridColumn): typingsJapgolly.mendixmodelsdk.pagesMod.pages.PasswordTextBox = js.native
  /**
    * Creates and returns a new PasswordTextBox instance in the SDK and on the server.
    * The new PasswordTextBox will be automatically stored in the 'widgets' property
    * of the parent LayoutGridColumn element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInLayoutGridColumnUnderWidgets(container: typingsJapgolly.mendixmodelsdk.pagesMod.pages.LayoutGridColumn): typingsJapgolly.mendixmodelsdk.pagesMod.pages.PasswordTextBox = js.native
  /**
    * Creates and returns a new PasswordTextBox instance in the SDK and on the server.
    * The new PasswordTextBox will be automatically stored in the 'widget' property
    * of the parent Layout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.0.2 to 7.14.0
    */
  def createInLayoutUnderWidget(container: typingsJapgolly.mendixmodelsdk.pagesMod.pages.Layout): typingsJapgolly.mendixmodelsdk.pagesMod.pages.PasswordTextBox = js.native
  /**
    * Creates and returns a new PasswordTextBox instance in the SDK and on the server.
    * The new PasswordTextBox will be automatically stored in the 'widgets' property
    * of the parent Layout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.23.0
    */
  def createInLayoutUnderWidgets(container: typingsJapgolly.mendixmodelsdk.pagesMod.pages.Layout): typingsJapgolly.mendixmodelsdk.pagesMod.pages.PasswordTextBox = js.native
  /**
    * Creates and returns a new PasswordTextBox instance in the SDK and on the server.
    * The new PasswordTextBox will be automatically stored in the 'widget' property
    * of the parent ListViewTemplate element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.0.2 to 7.14.0
    */
  def createInListViewTemplateUnderWidget(container: typingsJapgolly.mendixmodelsdk.pagesMod.pages.ListViewTemplate): typingsJapgolly.mendixmodelsdk.pagesMod.pages.PasswordTextBox = js.native
  /**
    * Creates and returns a new PasswordTextBox instance in the SDK and on the server.
    * The new PasswordTextBox will be automatically stored in the 'widgets' property
    * of the parent ListViewTemplate element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInListViewTemplateUnderWidgets(container: typingsJapgolly.mendixmodelsdk.pagesMod.pages.ListViewTemplate): typingsJapgolly.mendixmodelsdk.pagesMod.pages.PasswordTextBox = js.native
  /**
    * Creates and returns a new PasswordTextBox instance in the SDK and on the server.
    * The new PasswordTextBox will be automatically stored in the 'widget' property
    * of the parent ListView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.0.2 to 7.14.0
    */
  def createInListViewUnderWidget(container: typingsJapgolly.mendixmodelsdk.pagesMod.pages.ListView): typingsJapgolly.mendixmodelsdk.pagesMod.pages.PasswordTextBox = js.native
  /**
    * Creates and returns a new PasswordTextBox instance in the SDK and on the server.
    * The new PasswordTextBox will be automatically stored in the 'widgets' property
    * of the parent ListView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInListViewUnderWidgets(container: typingsJapgolly.mendixmodelsdk.pagesMod.pages.ListView): typingsJapgolly.mendixmodelsdk.pagesMod.pages.PasswordTextBox = js.native
  /**
    * Creates and returns a new PasswordTextBox instance in the SDK and on the server.
    * The new PasswordTextBox will be automatically stored in the 'widget' property
    * of the parent MasterDetailRegion element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.1.0 to 7.14.0
    */
  def createInMasterDetailRegionUnderWidget(container: typingsJapgolly.mendixmodelsdk.pagesMod.pages.MasterDetailRegion): typingsJapgolly.mendixmodelsdk.pagesMod.pages.PasswordTextBox = js.native
  /**
    * Creates and returns a new PasswordTextBox instance in the SDK and on the server.
    * The new PasswordTextBox will be automatically stored in the 'widgets' property
    * of the parent nativepages.NativeLayoutCallArgument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.23.0 to 7.23.0
    */
  def createInNativeLayoutCallArgumentUnderWidgets(container: NativeLayoutCallArgument): typingsJapgolly.mendixmodelsdk.pagesMod.pages.PasswordTextBox = js.native
  /**
    * Creates and returns a new PasswordTextBox instance in the SDK and on the server.
    * The new PasswordTextBox will be automatically stored in the 'sidebarWidgets' property
    * of the parent NativeLayoutContent element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.5.0 and higher
    */
  def createInNativeLayoutContentUnderSidebarWidgets(container: typingsJapgolly.mendixmodelsdk.pagesMod.pages.NativeLayoutContent): typingsJapgolly.mendixmodelsdk.pagesMod.pages.PasswordTextBox = js.native
  /**
    * Creates and returns a new PasswordTextBox instance in the SDK and on the server.
    * The new PasswordTextBox will be automatically stored in the 'widgets' property
    * of the parent NativeLayoutContent element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  def createInNativeLayoutContentUnderWidgets(container: typingsJapgolly.mendixmodelsdk.pagesMod.pages.NativeLayoutContent): typingsJapgolly.mendixmodelsdk.pagesMod.pages.PasswordTextBox = js.native
  /**
    * Creates and returns a new PasswordTextBox instance in the SDK and on the server.
    * The new PasswordTextBox will be automatically stored in the 'headerWidget' property
    * of the parent nativepages.NativeLayout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.22.0 to 7.23.0
    */
  def createInNativeLayoutUnderHeaderWidget(container: NativeLayout): typingsJapgolly.mendixmodelsdk.pagesMod.pages.PasswordTextBox = js.native
  /**
    * Creates and returns a new PasswordTextBox instance in the SDK and on the server.
    * The new PasswordTextBox will be automatically stored in the 'widgets' property
    * of the parent nativepages.NativeLayout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.21.0 to 7.23.0
    */
  def createInNativeLayoutUnderWidgets(container: NativeLayout): typingsJapgolly.mendixmodelsdk.pagesMod.pages.PasswordTextBox = js.native
  /**
    * Creates and returns a new PasswordTextBox instance in the SDK and on the server.
    * The new PasswordTextBox will be automatically stored in the 'widget' property
    * of the parent NavigationListItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.0.2 to 7.14.0
    */
  def createInNavigationListItemUnderWidget(container: typingsJapgolly.mendixmodelsdk.pagesMod.pages.NavigationListItem): typingsJapgolly.mendixmodelsdk.pagesMod.pages.PasswordTextBox = js.native
  /**
    * Creates and returns a new PasswordTextBox instance in the SDK and on the server.
    * The new PasswordTextBox will be automatically stored in the 'widgets' property
    * of the parent NavigationListItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInNavigationListItemUnderWidgets(container: typingsJapgolly.mendixmodelsdk.pagesMod.pages.NavigationListItem): typingsJapgolly.mendixmodelsdk.pagesMod.pages.PasswordTextBox = js.native
  /**
    * Creates and returns a new PasswordTextBox instance in the SDK and on the server.
    * The new PasswordTextBox will be automatically stored in the 'widget' property
    * of the parent ScrollContainerRegion element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.0.2 to 7.14.0
    */
  def createInScrollContainerRegionUnderWidget(container: typingsJapgolly.mendixmodelsdk.pagesMod.pages.ScrollContainerRegion): typingsJapgolly.mendixmodelsdk.pagesMod.pages.PasswordTextBox = js.native
  /**
    * Creates and returns a new PasswordTextBox instance in the SDK and on the server.
    * The new PasswordTextBox will be automatically stored in the 'widgets' property
    * of the parent ScrollContainerRegion element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInScrollContainerRegionUnderWidgets(container: typingsJapgolly.mendixmodelsdk.pagesMod.pages.ScrollContainerRegion): typingsJapgolly.mendixmodelsdk.pagesMod.pages.PasswordTextBox = js.native
  /**
    * Creates and returns a new PasswordTextBox instance in the SDK and on the server.
    * The new PasswordTextBox will be automatically stored in the 'widget' property
    * of the parent Snippet element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.0.2 to 7.14.0
    */
  def createInSnippetUnderWidget(container: typingsJapgolly.mendixmodelsdk.pagesMod.pages.Snippet): typingsJapgolly.mendixmodelsdk.pagesMod.pages.PasswordTextBox = js.native
  /**
    * Creates and returns a new PasswordTextBox instance in the SDK and on the server.
    * The new PasswordTextBox will be automatically stored in the 'widgets' property
    * of the parent Snippet element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInSnippetUnderWidgets(container: typingsJapgolly.mendixmodelsdk.pagesMod.pages.Snippet): typingsJapgolly.mendixmodelsdk.pagesMod.pages.PasswordTextBox = js.native
  /**
    * Creates and returns a new PasswordTextBox instance in the SDK and on the server.
    * The new PasswordTextBox will be automatically stored in the 'firstWidget' property
    * of the parent SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.0.2 to 7.14.0
    */
  def createInSplitPaneUnderFirstWidget(container: typingsJapgolly.mendixmodelsdk.pagesMod.pages.SplitPane): typingsJapgolly.mendixmodelsdk.pagesMod.pages.PasswordTextBox = js.native
  /**
    * Creates and returns a new PasswordTextBox instance in the SDK and on the server.
    * The new PasswordTextBox will be automatically stored in the 'firstWidgets' property
    * of the parent SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.23.0
    */
  def createInSplitPaneUnderFirstWidgets(container: typingsJapgolly.mendixmodelsdk.pagesMod.pages.SplitPane): typingsJapgolly.mendixmodelsdk.pagesMod.pages.PasswordTextBox = js.native
  /**
    * Creates and returns a new PasswordTextBox instance in the SDK and on the server.
    * The new PasswordTextBox will be automatically stored in the 'secondWidget' property
    * of the parent SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.0.2 to 7.14.0
    */
  def createInSplitPaneUnderSecondWidget(container: typingsJapgolly.mendixmodelsdk.pagesMod.pages.SplitPane): typingsJapgolly.mendixmodelsdk.pagesMod.pages.PasswordTextBox = js.native
  /**
    * Creates and returns a new PasswordTextBox instance in the SDK and on the server.
    * The new PasswordTextBox will be automatically stored in the 'secondWidgets' property
    * of the parent SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.23.0
    */
  def createInSplitPaneUnderSecondWidgets(container: typingsJapgolly.mendixmodelsdk.pagesMod.pages.SplitPane): typingsJapgolly.mendixmodelsdk.pagesMod.pages.PasswordTextBox = js.native
  /**
    * Creates and returns a new PasswordTextBox instance in the SDK and on the server.
    * The new PasswordTextBox will be automatically stored in the 'widget' property
    * of the parent TabPage element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.0.2 to 7.14.0
    */
  def createInTabPageUnderWidget(container: typingsJapgolly.mendixmodelsdk.pagesMod.pages.TabPage): typingsJapgolly.mendixmodelsdk.pagesMod.pages.PasswordTextBox = js.native
  /**
    * Creates and returns a new PasswordTextBox instance in the SDK and on the server.
    * The new PasswordTextBox will be automatically stored in the 'widgets' property
    * of the parent TabPage element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInTabPageUnderWidgets(container: typingsJapgolly.mendixmodelsdk.pagesMod.pages.TabPage): typingsJapgolly.mendixmodelsdk.pagesMod.pages.PasswordTextBox = js.native
  /**
    * Creates and returns a new PasswordTextBox instance in the SDK and on the server.
    * The new PasswordTextBox will be automatically stored in the 'widget' property
    * of the parent TableCell element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.0.2 to 7.14.0
    */
  def createInTableCellUnderWidget(container: typingsJapgolly.mendixmodelsdk.pagesMod.pages.TableCell): typingsJapgolly.mendixmodelsdk.pagesMod.pages.PasswordTextBox = js.native
  /**
    * Creates and returns a new PasswordTextBox instance in the SDK and on the server.
    * The new PasswordTextBox will be automatically stored in the 'widgets' property
    * of the parent TableCell element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInTableCellUnderWidgets(container: typingsJapgolly.mendixmodelsdk.pagesMod.pages.TableCell): typingsJapgolly.mendixmodelsdk.pagesMod.pages.PasswordTextBox = js.native
  /**
    * Creates and returns a new PasswordTextBox instance in the SDK and on the server.
    * The new PasswordTextBox will be automatically stored in the 'widget' property
    * of the parent TemplateGridContents element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.0.2 to 7.14.0
    */
  def createInTemplateGridContentsUnderWidget(container: typingsJapgolly.mendixmodelsdk.pagesMod.pages.TemplateGridContents): typingsJapgolly.mendixmodelsdk.pagesMod.pages.PasswordTextBox = js.native
  /**
    * Creates and returns a new PasswordTextBox instance in the SDK and on the server.
    * The new PasswordTextBox will be automatically stored in the 'widgets' property
    * of the parent TemplateGridContents element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInTemplateGridContentsUnderWidgets(container: typingsJapgolly.mendixmodelsdk.pagesMod.pages.TemplateGridContents): typingsJapgolly.mendixmodelsdk.pagesMod.pages.PasswordTextBox = js.native
  /**
    * Creates and returns a new PasswordTextBox instance in the SDK and on the server.
    * The new PasswordTextBox will be automatically stored in the 'widgets' property
    * of the parent VerticalFlow element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.0.2 to 7.14.0
    */
  def createInVerticalFlowUnderWidgets(container: typingsJapgolly.mendixmodelsdk.pagesMod.pages.VerticalFlow): typingsJapgolly.mendixmodelsdk.pagesMod.pages.PasswordTextBox = js.native
  /**
    * Creates and returns a new PasswordTextBox instance in the SDK and on the server.
    * The new PasswordTextBox will be automatically stored in the 'widgets' property
    * of the parent WebLayoutContent element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  def createInWebLayoutContentUnderWidgets(container: typingsJapgolly.mendixmodelsdk.pagesMod.pages.WebLayoutContent): typingsJapgolly.mendixmodelsdk.pagesMod.pages.PasswordTextBox = js.native
  /**
    * Creates and returns a new PasswordTextBox instance in the SDK and on the server.
    * The new PasswordTextBox will be automatically stored in the 'widgets' property
    * of the parent customwidgets.WidgetValue element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.2.0 and higher
    */
  def createInWidgetValueUnderWidgets(container: WidgetValue): typingsJapgolly.mendixmodelsdk.pagesMod.pages.PasswordTextBox = js.native
}

