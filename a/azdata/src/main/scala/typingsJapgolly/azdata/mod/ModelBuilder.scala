package typingsJapgolly.azdata.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModelBuilder extends StObject {
  
  def button(): ComponentBuilder[ButtonComponent, ButtonProperties]
  
  /**
    * @deprecated please use radioCardGroup component.
    */
  def card(): ComponentBuilder[CardComponent, CardProperties]
  
  def checkBox(): ComponentBuilder[CheckBoxComponent, CheckBoxProperties]
  
  def dashboardWebview(webviewId: String): ComponentBuilder[DashboardWebviewComponent, ComponentProperties]
  
  def dashboardWidget(widgetId: String): ComponentBuilder[DashboardWidgetComponent, ComponentProperties]
  
  def declarativeTable(): ComponentBuilder[DeclarativeTableComponent, DeclarativeTableProperties]
  
  def diffeditor(): ComponentBuilder[DiffEditorComponent, DiffEditorProperties]
  
  def divContainer(): DivBuilder
  
  def dropDown(): ComponentBuilder[DropDownComponent, DropDownProperties]
  
  def editor(): ComponentBuilder[EditorComponent, EditorProperties]
  
  def fileBrowserTree(): ComponentBuilder[FileBrowserTreeComponent, FileBrowserTreeProperties]
  
  def flexContainer(): FlexBuilder
  
  def formContainer(): FormBuilder
  
  def groupContainer(): GroupBuilder
  
  def hyperlink(): ComponentBuilder[HyperlinkComponent, HyperlinkComponentProperties]
  
  def image(): ComponentBuilder[ImageComponent, ImageComponentProperties]
  
  def infoBox(): ComponentBuilder[InfoBoxComponent, InfoBoxComponentProperties]
  
  def inputBox(): ComponentBuilder[InputBoxComponent, InputBoxProperties]
  
  def listBox(): ComponentBuilder[ListBoxComponent, ListBoxProperties]
  
  def listView(): ComponentBuilder[ListViewComponent, ListViewComponentProperties]
  
  def loadingComponent(): LoadingComponentBuilder
  
  def navContainer(): ContainerBuilder[NavContainer, Any, Any, ContainerProperties]
  
  def propertiesContainer(): ComponentBuilder[PropertiesContainerComponent, PropertiesContainerComponentProperties]
  
  def radioButton(): ComponentBuilder[RadioButtonComponent, RadioButtonProperties]
  
  def radioCardGroup(): ComponentBuilder[RadioCardGroupComponent, RadioCardGroupComponentProperties]
  
  def separator(): ComponentBuilder[SeparatorComponent, SeparatorComponentProperties]
  
  def slider(): ComponentBuilder[SliderComponent, SliderComponentProperties]
  
  def splitViewContainer(): SplitViewBuilder
  
  def tabbedPanel(): TabbedPanelComponentBuilder
  
  def table(): ComponentBuilder[TableComponent, TableComponentProperties]
  
  def text(): ComponentBuilder[TextComponent, TextComponentProperties]
  
  def toolbarContainer(): ToolbarBuilder
  
  def tree[T](): ComponentBuilder[TreeComponent[T], TreeProperties]
  
  def webView(): ComponentBuilder[WebViewComponent, WebViewProperties]
}
object ModelBuilder {
  
  inline def apply(
    button: CallbackTo[ComponentBuilder[ButtonComponent, ButtonProperties]],
    card: CallbackTo[ComponentBuilder[CardComponent, CardProperties]],
    checkBox: CallbackTo[ComponentBuilder[CheckBoxComponent, CheckBoxProperties]],
    dashboardWebview: String => ComponentBuilder[DashboardWebviewComponent, ComponentProperties],
    dashboardWidget: String => ComponentBuilder[DashboardWidgetComponent, ComponentProperties],
    declarativeTable: CallbackTo[ComponentBuilder[DeclarativeTableComponent, DeclarativeTableProperties]],
    diffeditor: CallbackTo[ComponentBuilder[DiffEditorComponent, DiffEditorProperties]],
    divContainer: CallbackTo[DivBuilder],
    dropDown: CallbackTo[ComponentBuilder[DropDownComponent, DropDownProperties]],
    editor: CallbackTo[ComponentBuilder[EditorComponent, EditorProperties]],
    fileBrowserTree: CallbackTo[ComponentBuilder[FileBrowserTreeComponent, FileBrowserTreeProperties]],
    flexContainer: CallbackTo[FlexBuilder],
    formContainer: CallbackTo[FormBuilder],
    groupContainer: CallbackTo[GroupBuilder],
    hyperlink: CallbackTo[ComponentBuilder[HyperlinkComponent, HyperlinkComponentProperties]],
    image: CallbackTo[ComponentBuilder[ImageComponent, ImageComponentProperties]],
    infoBox: CallbackTo[ComponentBuilder[InfoBoxComponent, InfoBoxComponentProperties]],
    inputBox: CallbackTo[ComponentBuilder[InputBoxComponent, InputBoxProperties]],
    listBox: CallbackTo[ComponentBuilder[ListBoxComponent, ListBoxProperties]],
    listView: CallbackTo[ComponentBuilder[ListViewComponent, ListViewComponentProperties]],
    loadingComponent: CallbackTo[LoadingComponentBuilder],
    navContainer: CallbackTo[ContainerBuilder[NavContainer, Any, Any, ContainerProperties]],
    propertiesContainer: CallbackTo[
      ComponentBuilder[PropertiesContainerComponent, PropertiesContainerComponentProperties]
    ],
    radioButton: CallbackTo[ComponentBuilder[RadioButtonComponent, RadioButtonProperties]],
    radioCardGroup: CallbackTo[ComponentBuilder[RadioCardGroupComponent, RadioCardGroupComponentProperties]],
    separator: CallbackTo[ComponentBuilder[SeparatorComponent, SeparatorComponentProperties]],
    slider: CallbackTo[ComponentBuilder[SliderComponent, SliderComponentProperties]],
    splitViewContainer: CallbackTo[SplitViewBuilder],
    tabbedPanel: CallbackTo[TabbedPanelComponentBuilder],
    table: CallbackTo[ComponentBuilder[TableComponent, TableComponentProperties]],
    text: CallbackTo[ComponentBuilder[TextComponent, TextComponentProperties]],
    toolbarContainer: CallbackTo[ToolbarBuilder],
    tree: CallbackTo[ComponentBuilder[TreeComponent[Any], TreeProperties]],
    webView: CallbackTo[ComponentBuilder[WebViewComponent, WebViewProperties]]
  ): ModelBuilder = {
    val __obj = js.Dynamic.literal(button = button.toJsFn, card = card.toJsFn, checkBox = checkBox.toJsFn, dashboardWebview = js.Any.fromFunction1(dashboardWebview), dashboardWidget = js.Any.fromFunction1(dashboardWidget), declarativeTable = declarativeTable.toJsFn, diffeditor = diffeditor.toJsFn, divContainer = divContainer.toJsFn, dropDown = dropDown.toJsFn, editor = editor.toJsFn, fileBrowserTree = fileBrowserTree.toJsFn, flexContainer = flexContainer.toJsFn, formContainer = formContainer.toJsFn, groupContainer = groupContainer.toJsFn, hyperlink = hyperlink.toJsFn, image = image.toJsFn, infoBox = infoBox.toJsFn, inputBox = inputBox.toJsFn, listBox = listBox.toJsFn, listView = listView.toJsFn, loadingComponent = loadingComponent.toJsFn, navContainer = navContainer.toJsFn, propertiesContainer = propertiesContainer.toJsFn, radioButton = radioButton.toJsFn, radioCardGroup = radioCardGroup.toJsFn, separator = separator.toJsFn, slider = slider.toJsFn, splitViewContainer = splitViewContainer.toJsFn, tabbedPanel = tabbedPanel.toJsFn, table = table.toJsFn, text = text.toJsFn, toolbarContainer = toolbarContainer.toJsFn, tree = tree.toJsFn, webView = webView.toJsFn)
    __obj.asInstanceOf[ModelBuilder]
  }
  
  extension [Self <: ModelBuilder](x: Self) {
    
    inline def setButton(value: CallbackTo[ComponentBuilder[ButtonComponent, ButtonProperties]]): Self = StObject.set(x, "button", value.toJsFn)
    
    inline def setCard(value: CallbackTo[ComponentBuilder[CardComponent, CardProperties]]): Self = StObject.set(x, "card", value.toJsFn)
    
    inline def setCheckBox(value: CallbackTo[ComponentBuilder[CheckBoxComponent, CheckBoxProperties]]): Self = StObject.set(x, "checkBox", value.toJsFn)
    
    inline def setDashboardWebview(value: String => ComponentBuilder[DashboardWebviewComponent, ComponentProperties]): Self = StObject.set(x, "dashboardWebview", js.Any.fromFunction1(value))
    
    inline def setDashboardWidget(value: String => ComponentBuilder[DashboardWidgetComponent, ComponentProperties]): Self = StObject.set(x, "dashboardWidget", js.Any.fromFunction1(value))
    
    inline def setDeclarativeTable(value: CallbackTo[ComponentBuilder[DeclarativeTableComponent, DeclarativeTableProperties]]): Self = StObject.set(x, "declarativeTable", value.toJsFn)
    
    inline def setDiffeditor(value: CallbackTo[ComponentBuilder[DiffEditorComponent, DiffEditorProperties]]): Self = StObject.set(x, "diffeditor", value.toJsFn)
    
    inline def setDivContainer(value: CallbackTo[DivBuilder]): Self = StObject.set(x, "divContainer", value.toJsFn)
    
    inline def setDropDown(value: CallbackTo[ComponentBuilder[DropDownComponent, DropDownProperties]]): Self = StObject.set(x, "dropDown", value.toJsFn)
    
    inline def setEditor(value: CallbackTo[ComponentBuilder[EditorComponent, EditorProperties]]): Self = StObject.set(x, "editor", value.toJsFn)
    
    inline def setFileBrowserTree(value: CallbackTo[ComponentBuilder[FileBrowserTreeComponent, FileBrowserTreeProperties]]): Self = StObject.set(x, "fileBrowserTree", value.toJsFn)
    
    inline def setFlexContainer(value: CallbackTo[FlexBuilder]): Self = StObject.set(x, "flexContainer", value.toJsFn)
    
    inline def setFormContainer(value: CallbackTo[FormBuilder]): Self = StObject.set(x, "formContainer", value.toJsFn)
    
    inline def setGroupContainer(value: CallbackTo[GroupBuilder]): Self = StObject.set(x, "groupContainer", value.toJsFn)
    
    inline def setHyperlink(value: CallbackTo[ComponentBuilder[HyperlinkComponent, HyperlinkComponentProperties]]): Self = StObject.set(x, "hyperlink", value.toJsFn)
    
    inline def setImage(value: CallbackTo[ComponentBuilder[ImageComponent, ImageComponentProperties]]): Self = StObject.set(x, "image", value.toJsFn)
    
    inline def setInfoBox(value: CallbackTo[ComponentBuilder[InfoBoxComponent, InfoBoxComponentProperties]]): Self = StObject.set(x, "infoBox", value.toJsFn)
    
    inline def setInputBox(value: CallbackTo[ComponentBuilder[InputBoxComponent, InputBoxProperties]]): Self = StObject.set(x, "inputBox", value.toJsFn)
    
    inline def setListBox(value: CallbackTo[ComponentBuilder[ListBoxComponent, ListBoxProperties]]): Self = StObject.set(x, "listBox", value.toJsFn)
    
    inline def setListView(value: CallbackTo[ComponentBuilder[ListViewComponent, ListViewComponentProperties]]): Self = StObject.set(x, "listView", value.toJsFn)
    
    inline def setLoadingComponent(value: CallbackTo[LoadingComponentBuilder]): Self = StObject.set(x, "loadingComponent", value.toJsFn)
    
    inline def setNavContainer(value: CallbackTo[ContainerBuilder[NavContainer, Any, Any, ContainerProperties]]): Self = StObject.set(x, "navContainer", value.toJsFn)
    
    inline def setPropertiesContainer(
      value: CallbackTo[
          ComponentBuilder[PropertiesContainerComponent, PropertiesContainerComponentProperties]
        ]
    ): Self = StObject.set(x, "propertiesContainer", value.toJsFn)
    
    inline def setRadioButton(value: CallbackTo[ComponentBuilder[RadioButtonComponent, RadioButtonProperties]]): Self = StObject.set(x, "radioButton", value.toJsFn)
    
    inline def setRadioCardGroup(value: CallbackTo[ComponentBuilder[RadioCardGroupComponent, RadioCardGroupComponentProperties]]): Self = StObject.set(x, "radioCardGroup", value.toJsFn)
    
    inline def setSeparator(value: CallbackTo[ComponentBuilder[SeparatorComponent, SeparatorComponentProperties]]): Self = StObject.set(x, "separator", value.toJsFn)
    
    inline def setSlider(value: CallbackTo[ComponentBuilder[SliderComponent, SliderComponentProperties]]): Self = StObject.set(x, "slider", value.toJsFn)
    
    inline def setSplitViewContainer(value: CallbackTo[SplitViewBuilder]): Self = StObject.set(x, "splitViewContainer", value.toJsFn)
    
    inline def setTabbedPanel(value: CallbackTo[TabbedPanelComponentBuilder]): Self = StObject.set(x, "tabbedPanel", value.toJsFn)
    
    inline def setTable(value: CallbackTo[ComponentBuilder[TableComponent, TableComponentProperties]]): Self = StObject.set(x, "table", value.toJsFn)
    
    inline def setText(value: CallbackTo[ComponentBuilder[TextComponent, TextComponentProperties]]): Self = StObject.set(x, "text", value.toJsFn)
    
    inline def setToolbarContainer(value: CallbackTo[ToolbarBuilder]): Self = StObject.set(x, "toolbarContainer", value.toJsFn)
    
    inline def setTree(value: CallbackTo[ComponentBuilder[TreeComponent[Any], TreeProperties]]): Self = StObject.set(x, "tree", value.toJsFn)
    
    inline def setWebView(value: CallbackTo[ComponentBuilder[WebViewComponent, WebViewProperties]]): Self = StObject.set(x, "webView", value.toJsFn)
  }
}
