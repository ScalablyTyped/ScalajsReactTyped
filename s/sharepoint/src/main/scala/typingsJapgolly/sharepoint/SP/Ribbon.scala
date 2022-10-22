package typingsJapgolly.sharepoint.SP

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLElement
import typingsJapgolly.sharepoint.CUI.CommandType
import typingsJapgolly.sharepoint.CUI.Component
import typingsJapgolly.sharepoint.CUI.Page.CommandDispatcher
import typingsJapgolly.sharepoint.CUI.Page.FocusManager
import typingsJapgolly.sharepoint.CUI.Page.PageComponent
import typingsJapgolly.sharepoint.CUI.Page.UndoManager
import typingsJapgolly.sharepoint.CUI.Root
import typingsJapgolly.sharepoint.SP.Application.UI.DefaultFormsInformation
import typingsJapgolly.sharepoint.SP.Application.UI.DefaultFormsInformationRequestor
import typingsJapgolly.sharepoint.SP.Application.UI.ViewInformationRequestor
import typingsJapgolly.sharepoint.SP.Application.UI.ViewSelectorGroups
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Ribbon {
  
  trait BlogPostWebPartPageComponent extends StObject
  
  trait CLVP extends StObject
  
  type CalendarListPageComponent = GenericListWebPartPageComponent
  
  type CalendarPageComponentData = GenericListWebPartPageComponentData
  
  type CommandUIExtensionPageComponent = PageComponent
  
  type DocLibAspxPageComponent = PageComponent
  
  type DocLibWebPartPageComponent = ListViewWebPartPageComponent
  
  type ECBMenuItem = js.Object
  
  trait EMailLink extends StObject
  
  trait FetchListViewWebPartPageComponentWorker extends StObject
  
  trait FetchedDocLibItemInfo extends StObject
  
  type GenericListWebPartPageComponent = ListViewWebPartPageComponent
  
  type GenericListWebPartPageComponentData = ListViewWebPartPageComponentData
  
  type GroupBoardWebPartPageComponent = GenericListWebPartPageComponent
  
  trait HelpCommandNames extends StObject
  
  type HelpPageComponent = PageComponent
  
  trait IRelatedFieldsInfoRequestor extends StObject
  
  type ListFormWebPartPageComponent = WebPartPageComponent
  
  type ListFormWebPartPageComponentData = WebPartPageComponentData
  
  type ListViewWebPartData = ToolbarRibbonAdapterData
  
  trait ListViewWebPartPageComponent
    extends StObject
       with PageComponent
       with ViewInformationRequestor
       with DefaultFormsInformationRequestor
  object ListViewWebPartPageComponent {
    
    inline def apply(
      canHandleCommand: String => Boolean,
      getFocusedCommands: CallbackTo[js.Array[String]],
      getGlobalCommands: CallbackTo[js.Array[String]],
      getId: CallbackTo[String],
      handleCommand: (String, Any, Double) => Boolean,
      init: Callback,
      isFocusable: CallbackTo[Boolean],
      onDefaultFormsInformationRetrieveFailure: Callback,
      onDefaultFormsInformationRetrieveSuccess: DefaultFormsInformation => Callback,
      onViewInformationReturned: ViewSelectorGroups => Callback,
      receiveFocus: CallbackTo[Boolean],
      yieldFocus: CallbackTo[Boolean]
    ): ListViewWebPartPageComponent = {
      val __obj = js.Dynamic.literal(canHandleCommand = js.Any.fromFunction1(canHandleCommand), getFocusedCommands = getFocusedCommands.toJsFn, getGlobalCommands = getGlobalCommands.toJsFn, getId = getId.toJsFn, handleCommand = js.Any.fromFunction3(handleCommand), init = init.toJsFn, isFocusable = isFocusable.toJsFn, onDefaultFormsInformationRetrieveFailure = onDefaultFormsInformationRetrieveFailure.toJsFn, onDefaultFormsInformationRetrieveSuccess = js.Any.fromFunction1((t0: DefaultFormsInformation) => onDefaultFormsInformationRetrieveSuccess(t0).runNow()), onViewInformationReturned = js.Any.fromFunction1((t0: ViewSelectorGroups) => onViewInformationReturned(t0).runNow()), receiveFocus = receiveFocus.toJsFn, yieldFocus = yieldFocus.toJsFn)
      __obj.asInstanceOf[ListViewWebPartPageComponent]
    }
  }
  
  type ListViewWebPartPageComponentData = WebPartPageComponentData
  
  trait PageManager
    extends StObject
       with typingsJapgolly.sharepoint.CUI.Page.PageManager {
    
    def addPageComponent(component: Component): Unit
    
    def get_ribbon(): typingsJapgolly.sharepoint.SP.Ribbon.Ribbon
    
    def isRootCommandEnabled(commandId: String, root: Root): Boolean
    
    def onRootRefreshed(root: Root): Unit
    
    def removePageComponent(component: Component): Unit
  }
  object PageManager {
    
    inline def apply(
      addPageComponent: Component => Callback,
      add_ribbonInited: js.Function0[Unit] => Any,
      canHandleCommand: String => Boolean,
      get_commandDispatcher: CallbackTo[CommandDispatcher],
      get_focusManager: CallbackTo[FocusManager],
      get_ribbon: CallbackTo[typingsJapgolly.sharepoint.SP.Ribbon.Ribbon],
      get_undoManager: CallbackTo[UndoManager],
      handleCommand: (String, Any, Double) => Boolean,
      isRootCommandEnabled: (String, Root) => Boolean,
      onRootRefreshed: Root => Callback,
      removePageComponent: Component => Callback
    ): PageManager = {
      val __obj = js.Dynamic.literal(addPageComponent = js.Any.fromFunction1((t0: Component) => addPageComponent(t0).runNow()), add_ribbonInited = js.Any.fromFunction1(add_ribbonInited), canHandleCommand = js.Any.fromFunction1(canHandleCommand), get_commandDispatcher = get_commandDispatcher.toJsFn, get_focusManager = get_focusManager.toJsFn, get_ribbon = get_ribbon.toJsFn, get_undoManager = get_undoManager.toJsFn, handleCommand = js.Any.fromFunction3(handleCommand), isRootCommandEnabled = js.Any.fromFunction2(isRootCommandEnabled), onRootRefreshed = js.Any.fromFunction1((t0: Root) => onRootRefreshed(t0).runNow()), removePageComponent = js.Any.fromFunction1((t0: Component) => removePageComponent(t0).runNow()))
      __obj.asInstanceOf[PageManager]
    }
    
    extension [Self <: PageManager](x: Self) {
      
      inline def setAddPageComponent(value: Component => Callback): Self = StObject.set(x, "addPageComponent", js.Any.fromFunction1((t0: Component) => value(t0).runNow()))
      
      inline def setGet_ribbon(value: CallbackTo[typingsJapgolly.sharepoint.SP.Ribbon.Ribbon]): Self = StObject.set(x, "get_ribbon", value.toJsFn)
      
      inline def setIsRootCommandEnabled(value: (String, Root) => Boolean): Self = StObject.set(x, "isRootCommandEnabled", js.Any.fromFunction2(value))
      
      inline def setOnRootRefreshed(value: Root => Callback): Self = StObject.set(x, "onRootRefreshed", js.Any.fromFunction1((t0: Root) => value(t0).runNow()))
      
      inline def setRemovePageComponent(value: Component => Callback): Self = StObject.set(x, "removePageComponent", js.Any.fromFunction1((t0: Component) => value(t0).runNow()))
    }
  }
  
  object PageState {
    
    trait Handlers extends StObject
    
    trait PageStateCommands extends StObject
    
    trait PageStateHandler
      extends StObject
         with PageComponent
    object PageStateHandler {
      
      inline def apply(
        canHandleCommand: String => Boolean,
        getFocusedCommands: CallbackTo[js.Array[String]],
        getGlobalCommands: CallbackTo[js.Array[String]],
        getId: CallbackTo[String],
        handleCommand: (String, Any, Double) => Boolean,
        init: Callback,
        isFocusable: CallbackTo[Boolean],
        receiveFocus: CallbackTo[Boolean],
        yieldFocus: CallbackTo[Boolean]
      ): PageStateHandler = {
        val __obj = js.Dynamic.literal(canHandleCommand = js.Any.fromFunction1(canHandleCommand), getFocusedCommands = getFocusedCommands.toJsFn, getGlobalCommands = getGlobalCommands.toJsFn, getId = getId.toJsFn, handleCommand = js.Any.fromFunction3(handleCommand), init = init.toJsFn, isFocusable = isFocusable.toJsFn, receiveFocus = receiveFocus.toJsFn, yieldFocus = yieldFocus.toJsFn)
        __obj.asInstanceOf[PageStateHandler]
      }
    }
    
    trait PageStateStrings extends StObject
    
    trait StateChangeDialogHandler extends StObject
  }
  
  trait PageStateActionButton extends StObject
  
  trait PagingInformation extends StObject
  
  trait RelatedFieldsFetcher extends StObject
  
  type RelatedFieldsHelper = IRelatedFieldsInfoRequestor
  
  trait Ribbon
    extends StObject
       with typingsJapgolly.sharepoint.CUI.Ribbon
  object Ribbon {
    
    inline def apply(
      _lastHeightUpdate: Double,
      _lastLeftUpdate: Double,
      _lastTopUpdate: Double,
      _lastWidthUpdate: Double,
      addChild: Component => Callback,
      addChildAtIndex: (Any, Double) => Callback,
      addContextualGroup: (String, String, Any, String) => Any,
      appendChildrenToElement: Element => Callback,
      createChildArray: Callback,
      dispose: Callback,
      doDelayedInit: Callback,
      ensureCorrectChildType: Callback,
      ensureDOMElementAndEmpty: Callback,
      getChild: String => Component,
      getChildByTitle: String => Component,
      getTextValue: CallbackTo[String],
      get_contextualGroupIds: CallbackTo[js.Array[String]],
      get_cssClass: CallbackTo[String],
      get_description: CallbackTo[String],
      get_domElementTagName: CallbackTo[String],
      get_enabled: CallbackTo[Boolean],
      get_id: CallbackTo[String],
      get_needsDelayIniting: CallbackTo[Boolean],
      get_parent: CallbackTo[Component],
      get_root: CallbackTo[Component],
      get_title: CallbackTo[String],
      get_visible: CallbackTo[Boolean],
      get_visibleInDOM: CallbackTo[Boolean],
      hideContextualGroup: String => Callback,
      initRootMember: Component => Any,
      onEnabledChanged: Boolean => Any,
      onMenuClosed: Callback,
      raiseCommandEvent: (String, CommandType, Any) => Any,
      receiveFocus: Callback,
      refresh: Callback,
      removeChild: String => Callback,
      removeChildren: Callback,
      removeContextualGroup: String => Callback,
      setFocus: Callback,
      setFocusOnCurrentTab: Callback,
      setFocusOnRibbon: Callback,
      set_description: String => String,
      set_enabled: Boolean => Boolean,
      set_id: String => Callback,
      set_parent: Component => Component,
      set_title: String => String,
      set_visible: Boolean => Boolean,
      showContextualGroup: String => Callback,
      valueIsDirty: Double => Boolean
    ): typingsJapgolly.sharepoint.SP.Ribbon.Ribbon = {
      val __obj = js.Dynamic.literal(_lastHeightUpdate = _lastHeightUpdate.asInstanceOf[js.Any], _lastLeftUpdate = _lastLeftUpdate.asInstanceOf[js.Any], _lastTopUpdate = _lastTopUpdate.asInstanceOf[js.Any], _lastWidthUpdate = _lastWidthUpdate.asInstanceOf[js.Any], addChild = js.Any.fromFunction1((t0: Component) => addChild(t0).runNow()), addChildAtIndex = js.Any.fromFunction2((t0: Any, t1: Double) => (addChildAtIndex(t0, t1)).runNow()), addContextualGroup = js.Any.fromFunction4(addContextualGroup), appendChildrenToElement = js.Any.fromFunction1((t0: Element) => appendChildrenToElement(t0).runNow()), createChildArray = createChildArray.toJsFn, dispose = dispose.toJsFn, doDelayedInit = doDelayedInit.toJsFn, ensureCorrectChildType = ensureCorrectChildType.toJsFn, ensureDOMElementAndEmpty = ensureDOMElementAndEmpty.toJsFn, getChild = js.Any.fromFunction1(getChild), getChildByTitle = js.Any.fromFunction1(getChildByTitle), getTextValue = getTextValue.toJsFn, get_contextualGroupIds = get_contextualGroupIds.toJsFn, get_cssClass = get_cssClass.toJsFn, get_description = get_description.toJsFn, get_domElementTagName = get_domElementTagName.toJsFn, get_enabled = get_enabled.toJsFn, get_id = get_id.toJsFn, get_needsDelayIniting = get_needsDelayIniting.toJsFn, get_parent = get_parent.toJsFn, get_root = get_root.toJsFn, get_title = get_title.toJsFn, get_visible = get_visible.toJsFn, get_visibleInDOM = get_visibleInDOM.toJsFn, hideContextualGroup = js.Any.fromFunction1((t0: String) => hideContextualGroup(t0).runNow()), initRootMember = js.Any.fromFunction1(initRootMember), onEnabledChanged = js.Any.fromFunction1(onEnabledChanged), onMenuClosed = onMenuClosed.toJsFn, raiseCommandEvent = js.Any.fromFunction3(raiseCommandEvent), receiveFocus = receiveFocus.toJsFn, refresh = refresh.toJsFn, removeChild = js.Any.fromFunction1((t0: String) => removeChild(t0).runNow()), removeChildren = removeChildren.toJsFn, removeContextualGroup = js.Any.fromFunction1((t0: String) => removeContextualGroup(t0).runNow()), setFocus = setFocus.toJsFn, setFocusOnCurrentTab = setFocusOnCurrentTab.toJsFn, setFocusOnRibbon = setFocusOnRibbon.toJsFn, set_description = js.Any.fromFunction1(set_description), set_enabled = js.Any.fromFunction1(set_enabled), set_id = js.Any.fromFunction1((t0: String) => set_id(t0).runNow()), set_parent = js.Any.fromFunction1(set_parent), set_title = js.Any.fromFunction1(set_title), set_visible = js.Any.fromFunction1(set_visible), showContextualGroup = js.Any.fromFunction1((t0: String) => showContextualGroup(t0).runNow()), valueIsDirty = js.Any.fromFunction1(valueIsDirty))
      __obj.asInstanceOf[typingsJapgolly.sharepoint.SP.Ribbon.Ribbon]
    }
  }
  
  trait SQMUtility extends StObject
  
  trait SU extends StObject
  
  trait SaveConflictHandler extends StObject
  
  type SolutionsPageComponent = ListViewWebPartPageComponent
  
  object TenantAdmin {
    
    type TenantAdminPageComponent = PageComponent
  }
  
  type ToolbarRibbonAdapter = PageComponent
  
  trait ToolbarRibbonAdapterData extends StObject
  
  type TrackTabPageComponent = PageComponent
  
  type UsageReportPageComponent = PageComponent
  
  type UserInterfacePageComponent = PageComponent
  
  trait Utility extends StObject
  
  trait UtilityInternal extends StObject
  
  trait WebPartComponent
    extends StObject
       with PageComponent {
    
    def selectWebPart(zc: HTMLElement, setNextRibbonTab: Boolean): Unit
  }
  object WebPartComponent {
    
    inline def apply(
      canHandleCommand: String => Boolean,
      getFocusedCommands: CallbackTo[js.Array[String]],
      getGlobalCommands: CallbackTo[js.Array[String]],
      getId: CallbackTo[String],
      handleCommand: (String, Any, Double) => Boolean,
      init: Callback,
      isFocusable: CallbackTo[Boolean],
      receiveFocus: CallbackTo[Boolean],
      selectWebPart: (HTMLElement, Boolean) => Callback,
      yieldFocus: CallbackTo[Boolean]
    ): WebPartComponent = {
      val __obj = js.Dynamic.literal(canHandleCommand = js.Any.fromFunction1(canHandleCommand), getFocusedCommands = getFocusedCommands.toJsFn, getGlobalCommands = getGlobalCommands.toJsFn, getId = getId.toJsFn, handleCommand = js.Any.fromFunction3(handleCommand), init = init.toJsFn, isFocusable = isFocusable.toJsFn, receiveFocus = receiveFocus.toJsFn, selectWebPart = js.Any.fromFunction2((t0: HTMLElement, t1: Boolean) => (selectWebPart(t0, t1)).runNow()), yieldFocus = yieldFocus.toJsFn)
      __obj.asInstanceOf[WebPartComponent]
    }
    
    extension [Self <: WebPartComponent](x: Self) {
      
      inline def setSelectWebPart(value: (HTMLElement, Boolean) => Callback): Self = StObject.set(x, "selectWebPart", js.Any.fromFunction2((t0: HTMLElement, t1: Boolean) => (value(t0, t1)).runNow()))
    }
  }
  
  trait WebPartComponentInitInfo extends StObject {
    
    var allowWebPartAdder: Boolean
    
    var editable: Boolean
    
    var isEditMode: Boolean
  }
  object WebPartComponentInitInfo {
    
    inline def apply(allowWebPartAdder: Boolean, editable: Boolean, isEditMode: Boolean): WebPartComponentInitInfo = {
      val __obj = js.Dynamic.literal(allowWebPartAdder = allowWebPartAdder.asInstanceOf[js.Any], editable = editable.asInstanceOf[js.Any], isEditMode = isEditMode.asInstanceOf[js.Any])
      __obj.asInstanceOf[WebPartComponentInitInfo]
    }
    
    extension [Self <: WebPartComponentInitInfo](x: Self) {
      
      inline def setAllowWebPartAdder(value: Boolean): Self = StObject.set(x, "allowWebPartAdder", value.asInstanceOf[js.Any])
      
      inline def setEditable(value: Boolean): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
      
      inline def setIsEditMode(value: Boolean): Self = StObject.set(x, "isEditMode", value.asInstanceOf[js.Any])
    }
  }
  
  type WebPartPageComponent = ToolbarRibbonAdapter
  
  type WebPartPageComponentData = ToolbarRibbonAdapterData
  
  type WikiPageComponent = PageComponent
}
