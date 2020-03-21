package typingsJapgolly.azdata.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModelBuilder extends js.Object {
  def button(): ComponentBuilder[ButtonComponent]
  /**
  		 * @deprecated please use radioCardGroup component.
  		 */
  def card(): ComponentBuilder[CardComponent]
  def checkBox(): ComponentBuilder[CheckBoxComponent]
  def dashboardWebview(webviewId: String): ComponentBuilder[DashboardWebviewComponent]
  def dashboardWidget(widgetId: String): ComponentBuilder[DashboardWidgetComponent]
  def declarativeTable(): ComponentBuilder[DeclarativeTableComponent]
  def diffeditor(): ComponentBuilder[DiffEditorComponent]
  def divContainer(): DivBuilder
  def dom(): ComponentBuilder[DomComponent]
  def dropDown(): ComponentBuilder[DropDownComponent]
  def editor(): ComponentBuilder[EditorComponent]
  def fileBrowserTree(): ComponentBuilder[FileBrowserTreeComponent]
  def flexContainer(): FlexBuilder
  def formContainer(): FormBuilder
  def groupContainer(): GroupBuilder
  def hyperlink(): ComponentBuilder[HyperlinkComponent]
  def image(): ComponentBuilder[ImageComponent]
  def inputBox(): ComponentBuilder[InputBoxComponent]
  def listBox(): ComponentBuilder[ListBoxComponent]
  def loadingComponent(): LoadingComponentBuilder
  def navContainer(): ContainerBuilder[NavContainer, _, _]
  def radioButton(): ComponentBuilder[RadioButtonComponent]
  def splitViewContainer(): SplitViewBuilder
  def table(): ComponentBuilder[TableComponent]
  def text(): ComponentBuilder[TextComponent]
  def toolbarContainer(): ToolbarBuilder
  def tree[T](): ComponentBuilder[TreeComponent[T]]
  def webView(): ComponentBuilder[WebViewComponent]
}

object ModelBuilder {
  @scala.inline
  def apply(
    button: CallbackTo[ComponentBuilder[ButtonComponent]],
    card: CallbackTo[ComponentBuilder[CardComponent]],
    checkBox: CallbackTo[ComponentBuilder[CheckBoxComponent]],
    dashboardWebview: String => CallbackTo[ComponentBuilder[DashboardWebviewComponent]],
    dashboardWidget: String => CallbackTo[ComponentBuilder[DashboardWidgetComponent]],
    declarativeTable: CallbackTo[ComponentBuilder[DeclarativeTableComponent]],
    diffeditor: CallbackTo[ComponentBuilder[DiffEditorComponent]],
    divContainer: CallbackTo[DivBuilder],
    dom: CallbackTo[ComponentBuilder[DomComponent]],
    dropDown: CallbackTo[ComponentBuilder[DropDownComponent]],
    editor: CallbackTo[ComponentBuilder[EditorComponent]],
    fileBrowserTree: CallbackTo[ComponentBuilder[FileBrowserTreeComponent]],
    flexContainer: CallbackTo[FlexBuilder],
    formContainer: CallbackTo[FormBuilder],
    groupContainer: CallbackTo[GroupBuilder],
    hyperlink: CallbackTo[ComponentBuilder[HyperlinkComponent]],
    image: CallbackTo[ComponentBuilder[ImageComponent]],
    inputBox: CallbackTo[ComponentBuilder[InputBoxComponent]],
    listBox: CallbackTo[ComponentBuilder[ListBoxComponent]],
    loadingComponent: CallbackTo[LoadingComponentBuilder],
    navContainer: CallbackTo[ContainerBuilder[NavContainer, js.Any, js.Any]],
    radioButton: CallbackTo[ComponentBuilder[RadioButtonComponent]],
    splitViewContainer: CallbackTo[SplitViewBuilder],
    table: CallbackTo[ComponentBuilder[TableComponent]],
    text: CallbackTo[ComponentBuilder[TextComponent]],
    toolbarContainer: CallbackTo[ToolbarBuilder],
    tree: CallbackTo[ComponentBuilder[TreeComponent[js.Any]]],
    webView: CallbackTo[ComponentBuilder[WebViewComponent]]
  ): ModelBuilder = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("button")(button.toJsFn)
    __obj.updateDynamic("card")(card.toJsFn)
    __obj.updateDynamic("checkBox")(checkBox.toJsFn)
    __obj.updateDynamic("dashboardWebview")(js.Any.fromFunction1((t0: java.lang.String) => dashboardWebview(t0).runNow()))
    __obj.updateDynamic("dashboardWidget")(js.Any.fromFunction1((t0: java.lang.String) => dashboardWidget(t0).runNow()))
    __obj.updateDynamic("declarativeTable")(declarativeTable.toJsFn)
    __obj.updateDynamic("diffeditor")(diffeditor.toJsFn)
    __obj.updateDynamic("divContainer")(divContainer.toJsFn)
    __obj.updateDynamic("dom")(dom.toJsFn)
    __obj.updateDynamic("dropDown")(dropDown.toJsFn)
    __obj.updateDynamic("editor")(editor.toJsFn)
    __obj.updateDynamic("fileBrowserTree")(fileBrowserTree.toJsFn)
    __obj.updateDynamic("flexContainer")(flexContainer.toJsFn)
    __obj.updateDynamic("formContainer")(formContainer.toJsFn)
    __obj.updateDynamic("groupContainer")(groupContainer.toJsFn)
    __obj.updateDynamic("hyperlink")(hyperlink.toJsFn)
    __obj.updateDynamic("image")(image.toJsFn)
    __obj.updateDynamic("inputBox")(inputBox.toJsFn)
    __obj.updateDynamic("listBox")(listBox.toJsFn)
    __obj.updateDynamic("loadingComponent")(loadingComponent.toJsFn)
    __obj.updateDynamic("navContainer")(navContainer.toJsFn)
    __obj.updateDynamic("radioButton")(radioButton.toJsFn)
    __obj.updateDynamic("splitViewContainer")(splitViewContainer.toJsFn)
    __obj.updateDynamic("table")(table.toJsFn)
    __obj.updateDynamic("text")(text.toJsFn)
    __obj.updateDynamic("toolbarContainer")(toolbarContainer.toJsFn)
    __obj.updateDynamic("tree")(tree.toJsFn)
    __obj.updateDynamic("webView")(webView.toJsFn)
    __obj.asInstanceOf[ModelBuilder]
  }
}

