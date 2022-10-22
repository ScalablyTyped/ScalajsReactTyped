package typingsJapgolly.activexOutlook.Outlook

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Explorer extends StObject {
  
  val AccountSelector: typingsJapgolly.activexOutlook.Outlook.AccountSelector
  
  def Activate(): Unit
  
  def AddToSelection(Item: Any): Unit
  
  val Application: typingsJapgolly.activexOutlook.Outlook.Application
  
  val AttachmentSelection: typingsJapgolly.activexOutlook.Outlook.AttachmentSelection
  
  val Caption: String
  
  val Class: OlObjectClass
  
  def ClearSearch(): Unit
  
  def ClearSelection(): Unit
  
  def Close(): Unit
  
  val CommandBars: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Office.CommandBars */ Any
  
  var CurrentFolder: Folder
  
  var CurrentView: Any
  
  def DeselectFolder(Folder: Folder): Unit
  
  def Display(): Unit
  
  val HTMLDocument: Any
  
  var Height: Double
  
  def IsFolderSelected(Folder: Folder): Boolean
  
  def IsItemSelectableInView(Item: Any): Boolean
  
  def IsPaneVisible(Pane: OlPane): Boolean
  
  var Left: Double
  
  val NavigationPane: typingsJapgolly.activexOutlook.Outlook.NavigationPane
  
  /* private */ @JSName("Outlook.Explorer_typekey")
  var OutlookDotExplorer_typekey: Explorer
  
  val Panes: typingsJapgolly.activexOutlook.Outlook.Panes
  
  val Parent: Any
  
  def RemoveFromSelection(Item: Any): Unit
  
  def Search(Query: String, SearchScope: OlSearchScope): Unit
  
  def SelectAllItems(): Unit
  
  def SelectFolder(Folder: Folder): Unit
  
  val Selection: typingsJapgolly.activexOutlook.Outlook.Selection
  
  val Session: NameSpace
  
  def ShowPane(Pane: OlPane, Visible: Boolean): Unit
  
  var Top: Double
  
  val Views: Any
  
  var Width: Double
  
  var WindowState: OlWindowState
}
object Explorer {
  
  inline def apply(
    AccountSelector: AccountSelector,
    Activate: Callback,
    AddToSelection: Any => Callback,
    Application: Application,
    AttachmentSelection: AttachmentSelection,
    Caption: String,
    Class: OlObjectClass,
    ClearSearch: Callback,
    ClearSelection: Callback,
    Close: Callback,
    CommandBars: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Office.CommandBars */ Any,
    CurrentFolder: Folder,
    CurrentView: Any,
    DeselectFolder: Folder => Callback,
    Display: Callback,
    HTMLDocument: Any,
    Height: Double,
    IsFolderSelected: Folder => Boolean,
    IsItemSelectableInView: Any => Boolean,
    IsPaneVisible: OlPane => Boolean,
    Left: Double,
    NavigationPane: NavigationPane,
    OutlookDotExplorer_typekey: Explorer,
    Panes: Panes,
    Parent: Any,
    RemoveFromSelection: Any => Callback,
    Search: (String, OlSearchScope) => Callback,
    SelectAllItems: Callback,
    SelectFolder: Folder => Callback,
    Selection: Selection,
    Session: NameSpace,
    ShowPane: (OlPane, Boolean) => Callback,
    Top: Double,
    Views: Any,
    Width: Double,
    WindowState: OlWindowState
  ): Explorer = {
    val __obj = js.Dynamic.literal(AccountSelector = AccountSelector.asInstanceOf[js.Any], Activate = Activate.toJsFn, AddToSelection = js.Any.fromFunction1((t0: Any) => AddToSelection(t0).runNow()), Application = Application.asInstanceOf[js.Any], AttachmentSelection = AttachmentSelection.asInstanceOf[js.Any], Caption = Caption.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], ClearSearch = ClearSearch.toJsFn, ClearSelection = ClearSelection.toJsFn, Close = Close.toJsFn, CommandBars = CommandBars.asInstanceOf[js.Any], CurrentFolder = CurrentFolder.asInstanceOf[js.Any], CurrentView = CurrentView.asInstanceOf[js.Any], DeselectFolder = js.Any.fromFunction1((t0: Folder) => DeselectFolder(t0).runNow()), Display = Display.toJsFn, HTMLDocument = HTMLDocument.asInstanceOf[js.Any], Height = Height.asInstanceOf[js.Any], IsFolderSelected = js.Any.fromFunction1(IsFolderSelected), IsItemSelectableInView = js.Any.fromFunction1(IsItemSelectableInView), IsPaneVisible = js.Any.fromFunction1(IsPaneVisible), Left = Left.asInstanceOf[js.Any], NavigationPane = NavigationPane.asInstanceOf[js.Any], Panes = Panes.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], RemoveFromSelection = js.Any.fromFunction1((t0: Any) => RemoveFromSelection(t0).runNow()), Search = js.Any.fromFunction2((t0: String, t1: OlSearchScope) => (Search(t0, t1)).runNow()), SelectAllItems = SelectAllItems.toJsFn, SelectFolder = js.Any.fromFunction1((t0: Folder) => SelectFolder(t0).runNow()), Selection = Selection.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any], ShowPane = js.Any.fromFunction2((t0: OlPane, t1: Boolean) => (ShowPane(t0, t1)).runNow()), Top = Top.asInstanceOf[js.Any], Views = Views.asInstanceOf[js.Any], Width = Width.asInstanceOf[js.Any], WindowState = WindowState.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.Explorer_typekey")(OutlookDotExplorer_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Explorer]
  }
  
  extension [Self <: Explorer](x: Self) {
    
    inline def setAccountSelector(value: AccountSelector): Self = StObject.set(x, "AccountSelector", value.asInstanceOf[js.Any])
    
    inline def setActivate(value: Callback): Self = StObject.set(x, "Activate", value.toJsFn)
    
    inline def setAddToSelection(value: Any => Callback): Self = StObject.set(x, "AddToSelection", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setAttachmentSelection(value: AttachmentSelection): Self = StObject.set(x, "AttachmentSelection", value.asInstanceOf[js.Any])
    
    inline def setCaption(value: String): Self = StObject.set(x, "Caption", value.asInstanceOf[js.Any])
    
    inline def setClass(value: OlObjectClass): Self = StObject.set(x, "Class", value.asInstanceOf[js.Any])
    
    inline def setClearSearch(value: Callback): Self = StObject.set(x, "ClearSearch", value.toJsFn)
    
    inline def setClearSelection(value: Callback): Self = StObject.set(x, "ClearSelection", value.toJsFn)
    
    inline def setClose(value: Callback): Self = StObject.set(x, "Close", value.toJsFn)
    
    inline def setCommandBars(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Office.CommandBars */ Any
    ): Self = StObject.set(x, "CommandBars", value.asInstanceOf[js.Any])
    
    inline def setCurrentFolder(value: Folder): Self = StObject.set(x, "CurrentFolder", value.asInstanceOf[js.Any])
    
    inline def setCurrentView(value: Any): Self = StObject.set(x, "CurrentView", value.asInstanceOf[js.Any])
    
    inline def setDeselectFolder(value: Folder => Callback): Self = StObject.set(x, "DeselectFolder", js.Any.fromFunction1((t0: Folder) => value(t0).runNow()))
    
    inline def setDisplay(value: Callback): Self = StObject.set(x, "Display", value.toJsFn)
    
    inline def setHTMLDocument(value: Any): Self = StObject.set(x, "HTMLDocument", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "Height", value.asInstanceOf[js.Any])
    
    inline def setIsFolderSelected(value: Folder => Boolean): Self = StObject.set(x, "IsFolderSelected", js.Any.fromFunction1(value))
    
    inline def setIsItemSelectableInView(value: Any => Boolean): Self = StObject.set(x, "IsItemSelectableInView", js.Any.fromFunction1(value))
    
    inline def setIsPaneVisible(value: OlPane => Boolean): Self = StObject.set(x, "IsPaneVisible", js.Any.fromFunction1(value))
    
    inline def setLeft(value: Double): Self = StObject.set(x, "Left", value.asInstanceOf[js.Any])
    
    inline def setNavigationPane(value: NavigationPane): Self = StObject.set(x, "NavigationPane", value.asInstanceOf[js.Any])
    
    inline def setOutlookDotExplorer_typekey(value: Explorer): Self = StObject.set(x, "Outlook.Explorer_typekey", value.asInstanceOf[js.Any])
    
    inline def setPanes(value: Panes): Self = StObject.set(x, "Panes", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setRemoveFromSelection(value: Any => Callback): Self = StObject.set(x, "RemoveFromSelection", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setSearch(value: (String, OlSearchScope) => Callback): Self = StObject.set(x, "Search", js.Any.fromFunction2((t0: String, t1: OlSearchScope) => (value(t0, t1)).runNow()))
    
    inline def setSelectAllItems(value: Callback): Self = StObject.set(x, "SelectAllItems", value.toJsFn)
    
    inline def setSelectFolder(value: Folder => Callback): Self = StObject.set(x, "SelectFolder", js.Any.fromFunction1((t0: Folder) => value(t0).runNow()))
    
    inline def setSelection(value: Selection): Self = StObject.set(x, "Selection", value.asInstanceOf[js.Any])
    
    inline def setSession(value: NameSpace): Self = StObject.set(x, "Session", value.asInstanceOf[js.Any])
    
    inline def setShowPane(value: (OlPane, Boolean) => Callback): Self = StObject.set(x, "ShowPane", js.Any.fromFunction2((t0: OlPane, t1: Boolean) => (value(t0, t1)).runNow()))
    
    inline def setTop(value: Double): Self = StObject.set(x, "Top", value.asInstanceOf[js.Any])
    
    inline def setViews(value: Any): Self = StObject.set(x, "Views", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "Width", value.asInstanceOf[js.Any])
    
    inline def setWindowState(value: OlWindowState): Self = StObject.set(x, "WindowState", value.asInstanceOf[js.Any])
  }
}
