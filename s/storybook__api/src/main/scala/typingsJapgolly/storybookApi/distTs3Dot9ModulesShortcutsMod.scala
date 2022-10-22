package typingsJapgolly.storybookApi

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.KeyboardEvent
import typingsJapgolly.std.Record
import typingsJapgolly.storybookApi.anon.AddEventListener
import typingsJapgolly.storybookApi.mod.ModuleFn
import typingsJapgolly.storybookApi.storybookApiStrings.control
import typingsJapgolly.storybookApi.storybookApiStrings.meta
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTs3Dot9ModulesShortcutsMod {
  
  @JSImport("@storybook/api/dist/ts3.9/modules/shortcuts", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def controlOrMetaKey(): meta | control = ^.asInstanceOf[js.Dynamic].applyDynamic("controlOrMetaKey")().asInstanceOf[meta | control]
  
  @JSImport("@storybook/api/dist/ts3.9/modules/shortcuts", "defaultShortcuts")
  @js.native
  val defaultShortcuts: Shortcuts = js.native
  
  @JSImport("@storybook/api/dist/ts3.9/modules/shortcuts", "init")
  @js.native
  val init: ModuleFn = js.native
  
  inline def isMacLike(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMacLike")().asInstanceOf[Boolean]
  
  inline def keys[O](o: O): js.Array[/* keyof O */ String] = ^.asInstanceOf[js.Dynamic].applyDynamic("keys")(o.asInstanceOf[js.Any]).asInstanceOf[js.Array[/* keyof O */ String]]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.storybookApi.storybookApiStrings.fullScreen
    - typingsJapgolly.storybookApi.storybookApiStrings.togglePanel
    - typingsJapgolly.storybookApi.storybookApiStrings.panelPosition
    - typingsJapgolly.storybookApi.storybookApiStrings.toggleNav
    - typingsJapgolly.storybookApi.storybookApiStrings.toolbar
    - typingsJapgolly.storybookApi.storybookApiStrings.search
    - typingsJapgolly.storybookApi.storybookApiStrings.focusNav
    - typingsJapgolly.storybookApi.storybookApiStrings.focusIframe
    - typingsJapgolly.storybookApi.storybookApiStrings.focusPanel
    - typingsJapgolly.storybookApi.storybookApiStrings.prevComponent
    - typingsJapgolly.storybookApi.storybookApiStrings.nextComponent
    - typingsJapgolly.storybookApi.storybookApiStrings.prevStory
    - typingsJapgolly.storybookApi.storybookApiStrings.nextStory
    - typingsJapgolly.storybookApi.storybookApiStrings.shortcutsPage
    - typingsJapgolly.storybookApi.storybookApiStrings.aboutPage
    - typingsJapgolly.storybookApi.storybookApiStrings.escape
    - typingsJapgolly.storybookApi.storybookApiStrings.collapseAll
    - typingsJapgolly.storybookApi.storybookApiStrings.expandAll
  */
  trait Action extends StObject
  
  trait AddonShortcut extends StObject {
    
    def action(args: Any*): Any
    
    var actionName: String
    
    var defaultShortcut: KeyCollection
    
    var label: String
    
    var showInMenu: js.UndefOr[Boolean] = js.undefined
  }
  object AddonShortcut {
    
    inline def apply(
      action: /* repeated */ Any => Any,
      actionName: String,
      defaultShortcut: KeyCollection,
      label: String
    ): AddonShortcut = {
      val __obj = js.Dynamic.literal(action = js.Any.fromFunction1(action), actionName = actionName.asInstanceOf[js.Any], defaultShortcut = defaultShortcut.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
      __obj.asInstanceOf[AddonShortcut]
    }
    
    extension [Self <: AddonShortcut](x: Self) {
      
      inline def setAction(value: /* repeated */ Any => Any): Self = StObject.set(x, "action", js.Any.fromFunction1(value))
      
      inline def setActionName(value: String): Self = StObject.set(x, "actionName", value.asInstanceOf[js.Any])
      
      inline def setDefaultShortcut(value: KeyCollection): Self = StObject.set(x, "defaultShortcut", value.asInstanceOf[js.Any])
      
      inline def setDefaultShortcutVarargs(value: String*): Self = StObject.set(x, "defaultShortcut", js.Array(value*))
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setShowInMenu(value: Boolean): Self = StObject.set(x, "showInMenu", value.asInstanceOf[js.Any])
      
      inline def setShowInMenuUndefined: Self = StObject.set(x, "showInMenu", js.undefined)
    }
  }
  
  type AddonShortcutDefaults = Record[String, KeyCollection]
  
  type AddonShortcutLabels = Record[String, String]
  
  type AddonShortcuts = Record[String, AddonShortcut]
  
  @js.native
  trait Event
    extends StObject
       with KeyboardEvent {
    
    @JSName("target")
    var target_Event: AddEventListener = js.native
  }
  
  type KeyCollection = js.Array[String]
  
  trait Shortcuts extends StObject {
    
    var aboutPage: KeyCollection
    
    var collapseAll: KeyCollection
    
    var escape: KeyCollection
    
    var expandAll: KeyCollection
    
    var focusIframe: KeyCollection
    
    var focusNav: KeyCollection
    
    var focusPanel: KeyCollection
    
    var fullScreen: KeyCollection
    
    var nextComponent: KeyCollection
    
    var nextStory: KeyCollection
    
    var panelPosition: KeyCollection
    
    var prevComponent: KeyCollection
    
    var prevStory: KeyCollection
    
    var search: KeyCollection
    
    var shortcutsPage: KeyCollection
    
    var toggleNav: KeyCollection
    
    var togglePanel: KeyCollection
    
    var toolbar: KeyCollection
  }
  object Shortcuts {
    
    inline def apply(
      aboutPage: KeyCollection,
      collapseAll: KeyCollection,
      escape: KeyCollection,
      expandAll: KeyCollection,
      focusIframe: KeyCollection,
      focusNav: KeyCollection,
      focusPanel: KeyCollection,
      fullScreen: KeyCollection,
      nextComponent: KeyCollection,
      nextStory: KeyCollection,
      panelPosition: KeyCollection,
      prevComponent: KeyCollection,
      prevStory: KeyCollection,
      search: KeyCollection,
      shortcutsPage: KeyCollection,
      toggleNav: KeyCollection,
      togglePanel: KeyCollection,
      toolbar: KeyCollection
    ): Shortcuts = {
      val __obj = js.Dynamic.literal(aboutPage = aboutPage.asInstanceOf[js.Any], collapseAll = collapseAll.asInstanceOf[js.Any], escape = escape.asInstanceOf[js.Any], expandAll = expandAll.asInstanceOf[js.Any], focusIframe = focusIframe.asInstanceOf[js.Any], focusNav = focusNav.asInstanceOf[js.Any], focusPanel = focusPanel.asInstanceOf[js.Any], fullScreen = fullScreen.asInstanceOf[js.Any], nextComponent = nextComponent.asInstanceOf[js.Any], nextStory = nextStory.asInstanceOf[js.Any], panelPosition = panelPosition.asInstanceOf[js.Any], prevComponent = prevComponent.asInstanceOf[js.Any], prevStory = prevStory.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any], shortcutsPage = shortcutsPage.asInstanceOf[js.Any], toggleNav = toggleNav.asInstanceOf[js.Any], togglePanel = togglePanel.asInstanceOf[js.Any], toolbar = toolbar.asInstanceOf[js.Any])
      __obj.asInstanceOf[Shortcuts]
    }
    
    extension [Self <: Shortcuts](x: Self) {
      
      inline def setAboutPage(value: KeyCollection): Self = StObject.set(x, "aboutPage", value.asInstanceOf[js.Any])
      
      inline def setAboutPageVarargs(value: String*): Self = StObject.set(x, "aboutPage", js.Array(value*))
      
      inline def setCollapseAll(value: KeyCollection): Self = StObject.set(x, "collapseAll", value.asInstanceOf[js.Any])
      
      inline def setCollapseAllVarargs(value: String*): Self = StObject.set(x, "collapseAll", js.Array(value*))
      
      inline def setEscape(value: KeyCollection): Self = StObject.set(x, "escape", value.asInstanceOf[js.Any])
      
      inline def setEscapeVarargs(value: String*): Self = StObject.set(x, "escape", js.Array(value*))
      
      inline def setExpandAll(value: KeyCollection): Self = StObject.set(x, "expandAll", value.asInstanceOf[js.Any])
      
      inline def setExpandAllVarargs(value: String*): Self = StObject.set(x, "expandAll", js.Array(value*))
      
      inline def setFocusIframe(value: KeyCollection): Self = StObject.set(x, "focusIframe", value.asInstanceOf[js.Any])
      
      inline def setFocusIframeVarargs(value: String*): Self = StObject.set(x, "focusIframe", js.Array(value*))
      
      inline def setFocusNav(value: KeyCollection): Self = StObject.set(x, "focusNav", value.asInstanceOf[js.Any])
      
      inline def setFocusNavVarargs(value: String*): Self = StObject.set(x, "focusNav", js.Array(value*))
      
      inline def setFocusPanel(value: KeyCollection): Self = StObject.set(x, "focusPanel", value.asInstanceOf[js.Any])
      
      inline def setFocusPanelVarargs(value: String*): Self = StObject.set(x, "focusPanel", js.Array(value*))
      
      inline def setFullScreen(value: KeyCollection): Self = StObject.set(x, "fullScreen", value.asInstanceOf[js.Any])
      
      inline def setFullScreenVarargs(value: String*): Self = StObject.set(x, "fullScreen", js.Array(value*))
      
      inline def setNextComponent(value: KeyCollection): Self = StObject.set(x, "nextComponent", value.asInstanceOf[js.Any])
      
      inline def setNextComponentVarargs(value: String*): Self = StObject.set(x, "nextComponent", js.Array(value*))
      
      inline def setNextStory(value: KeyCollection): Self = StObject.set(x, "nextStory", value.asInstanceOf[js.Any])
      
      inline def setNextStoryVarargs(value: String*): Self = StObject.set(x, "nextStory", js.Array(value*))
      
      inline def setPanelPosition(value: KeyCollection): Self = StObject.set(x, "panelPosition", value.asInstanceOf[js.Any])
      
      inline def setPanelPositionVarargs(value: String*): Self = StObject.set(x, "panelPosition", js.Array(value*))
      
      inline def setPrevComponent(value: KeyCollection): Self = StObject.set(x, "prevComponent", value.asInstanceOf[js.Any])
      
      inline def setPrevComponentVarargs(value: String*): Self = StObject.set(x, "prevComponent", js.Array(value*))
      
      inline def setPrevStory(value: KeyCollection): Self = StObject.set(x, "prevStory", value.asInstanceOf[js.Any])
      
      inline def setPrevStoryVarargs(value: String*): Self = StObject.set(x, "prevStory", js.Array(value*))
      
      inline def setSearch(value: KeyCollection): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
      
      inline def setSearchVarargs(value: String*): Self = StObject.set(x, "search", js.Array(value*))
      
      inline def setShortcutsPage(value: KeyCollection): Self = StObject.set(x, "shortcutsPage", value.asInstanceOf[js.Any])
      
      inline def setShortcutsPageVarargs(value: String*): Self = StObject.set(x, "shortcutsPage", js.Array(value*))
      
      inline def setToggleNav(value: KeyCollection): Self = StObject.set(x, "toggleNav", value.asInstanceOf[js.Any])
      
      inline def setToggleNavVarargs(value: String*): Self = StObject.set(x, "toggleNav", js.Array(value*))
      
      inline def setTogglePanel(value: KeyCollection): Self = StObject.set(x, "togglePanel", value.asInstanceOf[js.Any])
      
      inline def setTogglePanelVarargs(value: String*): Self = StObject.set(x, "togglePanel", js.Array(value*))
      
      inline def setToolbar(value: KeyCollection): Self = StObject.set(x, "toolbar", value.asInstanceOf[js.Any])
      
      inline def setToolbarVarargs(value: String*): Self = StObject.set(x, "toolbar", js.Array(value*))
    }
  }
  
  trait SubAPI extends StObject {
    
    def getAddonsShortcutDefaults(): AddonShortcutDefaults
    
    def getAddonsShortcutLabels(): AddonShortcutLabels
    
    def getAddonsShortcuts(): AddonShortcuts
    
    def getDefaultShortcuts(): Shortcuts | AddonShortcutDefaults
    
    def getShortcutKeys(): Shortcuts
    
    def handleKeydownEvent(event: Event): Unit
    
    def handleShortcutFeature(feature: Action): Unit
    
    def restoreAllDefaultShortcuts(): js.Promise[Shortcuts]
    
    def restoreDefaultShortcut(action: Action): js.Promise[KeyCollection]
    
    def setAddonShortcut(addon: String, shortcut: AddonShortcut): js.Promise[AddonShortcut]
    
    def setShortcut(action: Action, value: KeyCollection): js.Promise[KeyCollection]
    
    def setShortcuts(shortcuts: Shortcuts): js.Promise[Shortcuts]
  }
  object SubAPI {
    
    inline def apply(
      getAddonsShortcutDefaults: CallbackTo[AddonShortcutDefaults],
      getAddonsShortcutLabels: CallbackTo[AddonShortcutLabels],
      getAddonsShortcuts: CallbackTo[AddonShortcuts],
      getDefaultShortcuts: CallbackTo[Shortcuts | AddonShortcutDefaults],
      getShortcutKeys: CallbackTo[Shortcuts],
      handleKeydownEvent: Event => Callback,
      handleShortcutFeature: Action => Callback,
      restoreAllDefaultShortcuts: CallbackTo[js.Promise[Shortcuts]],
      restoreDefaultShortcut: Action => js.Promise[KeyCollection],
      setAddonShortcut: (String, AddonShortcut) => js.Promise[AddonShortcut],
      setShortcut: (Action, KeyCollection) => js.Promise[KeyCollection],
      setShortcuts: Shortcuts => js.Promise[Shortcuts]
    ): SubAPI = {
      val __obj = js.Dynamic.literal(getAddonsShortcutDefaults = getAddonsShortcutDefaults.toJsFn, getAddonsShortcutLabels = getAddonsShortcutLabels.toJsFn, getAddonsShortcuts = getAddonsShortcuts.toJsFn, getDefaultShortcuts = getDefaultShortcuts.toJsFn, getShortcutKeys = getShortcutKeys.toJsFn, handleKeydownEvent = js.Any.fromFunction1((t0: Event) => handleKeydownEvent(t0).runNow()), handleShortcutFeature = js.Any.fromFunction1((t0: Action) => handleShortcutFeature(t0).runNow()), restoreAllDefaultShortcuts = restoreAllDefaultShortcuts.toJsFn, restoreDefaultShortcut = js.Any.fromFunction1(restoreDefaultShortcut), setAddonShortcut = js.Any.fromFunction2(setAddonShortcut), setShortcut = js.Any.fromFunction2(setShortcut), setShortcuts = js.Any.fromFunction1(setShortcuts))
      __obj.asInstanceOf[SubAPI]
    }
    
    extension [Self <: SubAPI](x: Self) {
      
      inline def setGetAddonsShortcutDefaults(value: CallbackTo[AddonShortcutDefaults]): Self = StObject.set(x, "getAddonsShortcutDefaults", value.toJsFn)
      
      inline def setGetAddonsShortcutLabels(value: CallbackTo[AddonShortcutLabels]): Self = StObject.set(x, "getAddonsShortcutLabels", value.toJsFn)
      
      inline def setGetAddonsShortcuts(value: CallbackTo[AddonShortcuts]): Self = StObject.set(x, "getAddonsShortcuts", value.toJsFn)
      
      inline def setGetDefaultShortcuts(value: CallbackTo[Shortcuts | AddonShortcutDefaults]): Self = StObject.set(x, "getDefaultShortcuts", value.toJsFn)
      
      inline def setGetShortcutKeys(value: CallbackTo[Shortcuts]): Self = StObject.set(x, "getShortcutKeys", value.toJsFn)
      
      inline def setHandleKeydownEvent(value: Event => Callback): Self = StObject.set(x, "handleKeydownEvent", js.Any.fromFunction1((t0: Event) => value(t0).runNow()))
      
      inline def setHandleShortcutFeature(value: Action => Callback): Self = StObject.set(x, "handleShortcutFeature", js.Any.fromFunction1((t0: Action) => value(t0).runNow()))
      
      inline def setRestoreAllDefaultShortcuts(value: CallbackTo[js.Promise[Shortcuts]]): Self = StObject.set(x, "restoreAllDefaultShortcuts", value.toJsFn)
      
      inline def setRestoreDefaultShortcut(value: Action => js.Promise[KeyCollection]): Self = StObject.set(x, "restoreDefaultShortcut", js.Any.fromFunction1(value))
      
      inline def setSetAddonShortcut(value: (String, AddonShortcut) => js.Promise[AddonShortcut]): Self = StObject.set(x, "setAddonShortcut", js.Any.fromFunction2(value))
      
      inline def setSetShortcut(value: (Action, KeyCollection) => js.Promise[KeyCollection]): Self = StObject.set(x, "setShortcut", js.Any.fromFunction2(value))
      
      inline def setSetShortcuts(value: Shortcuts => js.Promise[Shortcuts]): Self = StObject.set(x, "setShortcuts", js.Any.fromFunction1(value))
    }
  }
  
  trait SubState extends StObject {
    
    var shortcuts: Shortcuts
  }
  object SubState {
    
    inline def apply(shortcuts: Shortcuts): SubState = {
      val __obj = js.Dynamic.literal(shortcuts = shortcuts.asInstanceOf[js.Any])
      __obj.asInstanceOf[SubState]
    }
    
    extension [Self <: SubState](x: Self) {
      
      inline def setShortcuts(value: Shortcuts): Self = StObject.set(x, "shortcuts", value.asInstanceOf[js.Any])
    }
  }
}
