package typingsJapgolly.kbar

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.kbar.anon.EnterMs
import typingsJapgolly.kbar.anon.Name
import typingsJapgolly.kbar.anon.OnClose
import typingsJapgolly.kbar.libActionActionImplMod.ActionImpl
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypesMod {
  
  @js.native
  sealed trait VisualState extends StObject
  @JSImport("kbar/lib/types", "VisualState")
  @js.native
  object VisualState extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[VisualState & String] = js.native
    
    @js.native
    sealed trait animatingIn
      extends StObject
         with VisualState
    /* "animating-in" */ val animatingIn: typingsJapgolly.kbar.libTypesMod.VisualState.animatingIn & String = js.native
    
    @js.native
    sealed trait animatingOut
      extends StObject
         with VisualState
    /* "animating-out" */ val animatingOut: typingsJapgolly.kbar.libTypesMod.VisualState.animatingOut & String = js.native
    
    @js.native
    sealed trait hidden
      extends StObject
         with VisualState
    /* "hidden" */ val hidden: typingsJapgolly.kbar.libTypesMod.VisualState.hidden & String = js.native
    
    @js.native
    sealed trait showing
      extends StObject
         with VisualState
    /* "showing" */ val showing: typingsJapgolly.kbar.libTypesMod.VisualState.showing & String = js.native
  }
  
  trait Action extends StObject {
    
    var icon: js.UndefOr[String | Element | Node] = js.undefined
    
    var id: ActionId
    
    var keywords: js.UndefOr[String] = js.undefined
    
    var name: String
    
    var parent: js.UndefOr[ActionId] = js.undefined
    
    var perform: js.UndefOr[js.Function1[/* currentActionImpl */ ActionImpl, Any]] = js.undefined
    
    var priority: js.UndefOr[Priority] = js.undefined
    
    var section: js.UndefOr[ActionSection] = js.undefined
    
    var shortcut: js.UndefOr[js.Array[String]] = js.undefined
    
    var subtitle: js.UndefOr[String] = js.undefined
  }
  object Action {
    
    inline def apply(id: ActionId, name: String): Action = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Action]
    }
    
    extension [Self <: Action](x: Self) {
      
      inline def setIcon(value: String | Element | Node): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconNull: Self = StObject.set(x, "icon", null)
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setIconVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "icon", js.Array(value*))
      
      inline def setIconVdomElement(value: VdomElement): Self = StObject.set(x, "icon", value.rawElement.asInstanceOf[js.Any])
      
      inline def setId(value: ActionId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setKeywords(value: String): Self = StObject.set(x, "keywords", value.asInstanceOf[js.Any])
      
      inline def setKeywordsUndefined: Self = StObject.set(x, "keywords", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setParent(value: ActionId): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
      
      inline def setPerform(value: /* currentActionImpl */ ActionImpl => Any): Self = StObject.set(x, "perform", js.Any.fromFunction1(value))
      
      inline def setPerformUndefined: Self = StObject.set(x, "perform", js.undefined)
      
      inline def setPriority(value: Priority): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
      
      inline def setSection(value: ActionSection): Self = StObject.set(x, "section", value.asInstanceOf[js.Any])
      
      inline def setSectionUndefined: Self = StObject.set(x, "section", js.undefined)
      
      inline def setShortcut(value: js.Array[String]): Self = StObject.set(x, "shortcut", value.asInstanceOf[js.Any])
      
      inline def setShortcutUndefined: Self = StObject.set(x, "shortcut", js.undefined)
      
      inline def setShortcutVarargs(value: String*): Self = StObject.set(x, "shortcut", js.Array(value*))
      
      inline def setSubtitle(value: String): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
      
      inline def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
    }
  }
  
  trait ActionGroup extends StObject {
    
    var actions: js.Array[ActionImpl]
    
    var name: String
  }
  object ActionGroup {
    
    inline def apply(actions: js.Array[ActionImpl], name: String): ActionGroup = {
      val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ActionGroup]
    }
    
    extension [Self <: ActionGroup](x: Self) {
      
      inline def setActions(value: js.Array[ActionImpl]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      inline def setActionsVarargs(value: ActionImpl*): Self = StObject.set(x, "actions", js.Array(value*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  type ActionId = String
  
  type ActionSection = String | Name
  
  type ActionStore = Record[ActionId, ActionImpl]
  
  type ActionTree = Record[String, ActionImpl]
  
  @js.native
  trait History extends StObject {
    
    def add(item: HistoryItem): HistoryItem = js.native
    
    def redo(): Unit = js.native
    def redo(item: HistoryItem): Unit = js.native
    
    var redoStack: js.Array[HistoryItem] = js.native
    
    def remove(item: HistoryItem): Unit = js.native
    
    def reset(): Unit = js.native
    
    def undo(): Unit = js.native
    def undo(item: HistoryItem): Unit = js.native
    
    var undoStack: js.Array[HistoryItem] = js.native
  }
  
  trait HistoryItem extends StObject {
    
    def negate(): Any
    
    def perform(): Any
  }
  object HistoryItem {
    
    inline def apply(negate: CallbackTo[Any], perform: CallbackTo[Any]): HistoryItem = {
      val __obj = js.Dynamic.literal(negate = negate.toJsFn, perform = perform.toJsFn)
      __obj.asInstanceOf[HistoryItem]
    }
    
    extension [Self <: HistoryItem](x: Self) {
      
      inline def setNegate(value: CallbackTo[Any]): Self = StObject.set(x, "negate", value.toJsFn)
      
      inline def setPerform(value: CallbackTo[Any]): Self = StObject.set(x, "perform", value.toJsFn)
    }
  }
  
  trait IKBarContext extends StObject {
    
    def getState(): KBarState
    
    var options: KBarOptions
    
    var query: KBarQuery
    
    def subscribe(collector: js.Function1[/* state */ KBarState, Any], cb: js.Function1[/* collected */ Any, Unit]): Unit
  }
  object IKBarContext {
    
    inline def apply(
      getState: CallbackTo[KBarState],
      options: KBarOptions,
      query: KBarQuery,
      subscribe: (js.Function1[/* state */ KBarState, Any], js.Function1[/* collected */ Any, Unit]) => Callback
    ): IKBarContext = {
      val __obj = js.Dynamic.literal(getState = getState.toJsFn, options = options.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], subscribe = js.Any.fromFunction2((t0: js.Function1[/* state */ KBarState, Any], t1: js.Function1[/* collected */ Any, Unit]) => (subscribe(t0, t1)).runNow()))
      __obj.asInstanceOf[IKBarContext]
    }
    
    extension [Self <: IKBarContext](x: Self) {
      
      inline def setGetState(value: CallbackTo[KBarState]): Self = StObject.set(x, "getState", value.toJsFn)
      
      inline def setOptions(value: KBarOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setQuery(value: KBarQuery): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setSubscribe(
        value: (js.Function1[/* state */ KBarState, Any], js.Function1[/* collected */ Any, Unit]) => Callback
      ): Self = StObject.set(x, "subscribe", js.Any.fromFunction2((t0: js.Function1[/* state */ KBarState, Any], t1: js.Function1[/* collected */ Any, Unit]) => (value(t0, t1)).runNow()))
    }
  }
  
  trait KBarOptions extends StObject {
    
    var animations: js.UndefOr[EnterMs] = js.undefined
    
    var callbacks: js.UndefOr[OnClose] = js.undefined
    
    /**
      * `disableDocumentLock` disables the "document lock" functionality
      * of kbar, where the body element's scrollbar is hidden and pointer
      * events are disabled when kbar is open. This is useful if you're using
      * a custom modal component that has its own implementation of this
      * functionality.
      */
    var disableDocumentLock: js.UndefOr[Boolean] = js.undefined
    
    /**
      * `disableScrollBarManagement` ensures that kbar will not
      * manipulate the document's `margin-right` property when open.
      * By default, kbar will add additional margin to the document
      * body when opened in order to prevent any layout shift with
      * the appearance/disappearance of the scrollbar.
      */
    var disableScrollbarManagement: js.UndefOr[Boolean] = js.undefined
    
    var enableHistory: js.UndefOr[Boolean] = js.undefined
    
    /**
      * `toggleShortcut` enables customizing which keyboard shortcut triggers
      * kbar. Defaults to "$mod+k" (cmd+k / ctrl+k)
      */
    var toggleShortcut: js.UndefOr[String] = js.undefined
  }
  object KBarOptions {
    
    inline def apply(): KBarOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[KBarOptions]
    }
    
    extension [Self <: KBarOptions](x: Self) {
      
      inline def setAnimations(value: EnterMs): Self = StObject.set(x, "animations", value.asInstanceOf[js.Any])
      
      inline def setAnimationsUndefined: Self = StObject.set(x, "animations", js.undefined)
      
      inline def setCallbacks(value: OnClose): Self = StObject.set(x, "callbacks", value.asInstanceOf[js.Any])
      
      inline def setCallbacksUndefined: Self = StObject.set(x, "callbacks", js.undefined)
      
      inline def setDisableDocumentLock(value: Boolean): Self = StObject.set(x, "disableDocumentLock", value.asInstanceOf[js.Any])
      
      inline def setDisableDocumentLockUndefined: Self = StObject.set(x, "disableDocumentLock", js.undefined)
      
      inline def setDisableScrollbarManagement(value: Boolean): Self = StObject.set(x, "disableScrollbarManagement", value.asInstanceOf[js.Any])
      
      inline def setDisableScrollbarManagementUndefined: Self = StObject.set(x, "disableScrollbarManagement", js.undefined)
      
      inline def setEnableHistory(value: Boolean): Self = StObject.set(x, "enableHistory", value.asInstanceOf[js.Any])
      
      inline def setEnableHistoryUndefined: Self = StObject.set(x, "enableHistory", js.undefined)
      
      inline def setToggleShortcut(value: String): Self = StObject.set(x, "toggleShortcut", value.asInstanceOf[js.Any])
      
      inline def setToggleShortcutUndefined: Self = StObject.set(x, "toggleShortcut", js.undefined)
    }
  }
  
  trait KBarProviderProps extends StObject {
    
    var actions: js.UndefOr[js.Array[Action]] = js.undefined
    
    var options: js.UndefOr[KBarOptions] = js.undefined
  }
  object KBarProviderProps {
    
    inline def apply(): KBarProviderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[KBarProviderProps]
    }
    
    extension [Self <: KBarProviderProps](x: Self) {
      
      inline def setActions(value: js.Array[Action]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      inline def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
      
      inline def setActionsVarargs(value: Action*): Self = StObject.set(x, "actions", js.Array(value*))
      
      inline def setOptions(value: KBarOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    }
  }
  
  @js.native
  trait KBarQuery extends StObject {
    
    def registerActions(actions: js.Array[Action]): js.Function0[Unit] = js.native
    
    def setActiveIndex(cb: js.Function1[/* currIndex */ Double, Double]): Unit = js.native
    def setActiveIndex(cb: Double): Unit = js.native
    
    def setCurrentRootAction(): Unit = js.native
    def setCurrentRootAction(actionId: ActionId): Unit = js.native
    
    def setSearch(search: String): Unit = js.native
    
    def setVisualState(cb: js.Function1[/* vs */ VisualState, VisualState]): Unit = js.native
    def setVisualState(cb: VisualState): Unit = js.native
    
    def toggle(): Unit = js.native
  }
  
  trait KBarState extends StObject {
    
    var actions: ActionTree
    
    var activeIndex: Double
    
    var currentRootActionId: js.UndefOr[ActionId | Null] = js.undefined
    
    var searchQuery: String
    
    var visualState: VisualState
  }
  object KBarState {
    
    inline def apply(actions: ActionTree, activeIndex: Double, searchQuery: String, visualState: VisualState): KBarState = {
      val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], activeIndex = activeIndex.asInstanceOf[js.Any], searchQuery = searchQuery.asInstanceOf[js.Any], visualState = visualState.asInstanceOf[js.Any])
      __obj.asInstanceOf[KBarState]
    }
    
    extension [Self <: KBarState](x: Self) {
      
      inline def setActions(value: ActionTree): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      inline def setActiveIndex(value: Double): Self = StObject.set(x, "activeIndex", value.asInstanceOf[js.Any])
      
      inline def setCurrentRootActionId(value: ActionId): Self = StObject.set(x, "currentRootActionId", value.asInstanceOf[js.Any])
      
      inline def setCurrentRootActionIdNull: Self = StObject.set(x, "currentRootActionId", null)
      
      inline def setCurrentRootActionIdUndefined: Self = StObject.set(x, "currentRootActionId", js.undefined)
      
      inline def setSearchQuery(value: String): Self = StObject.set(x, "searchQuery", value.asInstanceOf[js.Any])
      
      inline def setVisualState(value: VisualState): Self = StObject.set(x, "visualState", value.asInstanceOf[js.Any])
    }
  }
  
  type Priority = Double
}
