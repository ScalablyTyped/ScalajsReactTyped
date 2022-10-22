package typingsJapgolly.inboxsdk.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.inboxsdk.inboxsdkStrings.destroy
import typingsJapgolly.inboxsdk.mod.Common.DropdownView
import typingsJapgolly.inboxsdk.mod.Conversations.ThreadView
import typingsJapgolly.inboxsdk.mod.Keyboard.KeyboardShortcutHandle
import typingsJapgolly.inboxsdk.mod.Lists.ThreadRowView
import typingsJapgolly.inboxsdk.mod.Router.RouteView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Toolbars {
  
  trait AppToolbarButtonDescriptor extends StObject {
    
    var arrowColor: js.UndefOr[String] = js.undefined
    
    var iconClass: js.UndefOr[String] = js.undefined
    
    var iconUrl: String
    
    def onClick(event: AppToolbarButtonEvent): Unit
    
    var title: String
    
    var titleClass: js.UndefOr[String] = js.undefined
  }
  object AppToolbarButtonDescriptor {
    
    inline def apply(iconUrl: String, onClick: AppToolbarButtonEvent => Callback, title: String): AppToolbarButtonDescriptor = {
      val __obj = js.Dynamic.literal(iconUrl = iconUrl.asInstanceOf[js.Any], onClick = js.Any.fromFunction1((t0: AppToolbarButtonEvent) => onClick(t0).runNow()), title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[AppToolbarButtonDescriptor]
    }
    
    extension [Self <: AppToolbarButtonDescriptor](x: Self) {
      
      inline def setArrowColor(value: String): Self = StObject.set(x, "arrowColor", value.asInstanceOf[js.Any])
      
      inline def setArrowColorUndefined: Self = StObject.set(x, "arrowColor", js.undefined)
      
      inline def setIconClass(value: String): Self = StObject.set(x, "iconClass", value.asInstanceOf[js.Any])
      
      inline def setIconClassUndefined: Self = StObject.set(x, "iconClass", js.undefined)
      
      inline def setIconUrl(value: String): Self = StObject.set(x, "iconUrl", value.asInstanceOf[js.Any])
      
      inline def setOnClick(value: AppToolbarButtonEvent => Callback): Self = StObject.set(x, "onClick", js.Any.fromFunction1((t0: AppToolbarButtonEvent) => value(t0).runNow()))
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleClass(value: String): Self = StObject.set(x, "titleClass", value.asInstanceOf[js.Any])
      
      inline def setTitleClassUndefined: Self = StObject.set(x, "titleClass", js.undefined)
    }
  }
  
  trait AppToolbarButtonEvent extends StObject {
    
    var dropdown: DropdownView
  }
  object AppToolbarButtonEvent {
    
    inline def apply(dropdown: DropdownView): AppToolbarButtonEvent = {
      val __obj = js.Dynamic.literal(dropdown = dropdown.asInstanceOf[js.Any])
      __obj.asInstanceOf[AppToolbarButtonEvent]
    }
    
    extension [Self <: AppToolbarButtonEvent](x: Self) {
      
      inline def setDropdown(value: DropdownView): Self = StObject.set(x, "dropdown", value.asInstanceOf[js.Any])
    }
  }
  
  trait AppToolbarButtonView extends StObject {
    
    def close(): Unit
    
    var destroyed: Boolean
    
    @JSName("on")
    def on_destroy(name: destroy, cb: js.Function0[Unit]): Unit
    
    def open(): Unit
    
    def remove(): Unit
  }
  object AppToolbarButtonView {
    
    inline def apply(
      close: Callback,
      destroyed: Boolean,
      on: (destroy, js.Function0[Unit]) => Callback,
      open: Callback,
      remove: Callback
    ): AppToolbarButtonView = {
      val __obj = js.Dynamic.literal(close = close.toJsFn, destroyed = destroyed.asInstanceOf[js.Any], on = js.Any.fromFunction2((t0: destroy, t1: js.Function0[Unit]) => (on(t0, t1)).runNow()), open = open.toJsFn, remove = remove.toJsFn)
      __obj.asInstanceOf[AppToolbarButtonView]
    }
    
    extension [Self <: AppToolbarButtonView](x: Self) {
      
      inline def setClose(value: Callback): Self = StObject.set(x, "close", value.toJsFn)
      
      inline def setDestroyed(value: Boolean): Self = StObject.set(x, "destroyed", value.asInstanceOf[js.Any])
      
      inline def setOn(value: (destroy, js.Function0[Unit]) => Callback): Self = StObject.set(x, "on", js.Any.fromFunction2((t0: destroy, t1: js.Function0[Unit]) => (value(t0, t1)).runNow()))
      
      inline def setOpen(value: Callback): Self = StObject.set(x, "open", value.toJsFn)
      
      inline def setRemove(value: Callback): Self = StObject.set(x, "remove", value.toJsFn)
    }
  }
  
  trait LegacyToolbarButtonDescriptor extends StObject {
    
    var hasDropdown: js.UndefOr[Boolean] = js.undefined
    
    var hideFor: js.UndefOr[js.Function1[/* routeView */ RouteView, Unit]] = js.undefined
    
    var iconClass: js.UndefOr[String] = js.undefined
    
    var iconUrl: js.UndefOr[String] = js.undefined
    
    var keyboardShortcutHandle: js.UndefOr[KeyboardShortcutHandle] = js.undefined
    
    def onClick(event: LegacyToolbarButtonEvent): Unit
    
    var section: SectionNames
    
    var title: String
  }
  object LegacyToolbarButtonDescriptor {
    
    inline def apply(onClick: LegacyToolbarButtonEvent => Callback, section: SectionNames, title: String): LegacyToolbarButtonDescriptor = {
      val __obj = js.Dynamic.literal(onClick = js.Any.fromFunction1((t0: LegacyToolbarButtonEvent) => onClick(t0).runNow()), section = section.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[LegacyToolbarButtonDescriptor]
    }
    
    extension [Self <: LegacyToolbarButtonDescriptor](x: Self) {
      
      inline def setHasDropdown(value: Boolean): Self = StObject.set(x, "hasDropdown", value.asInstanceOf[js.Any])
      
      inline def setHasDropdownUndefined: Self = StObject.set(x, "hasDropdown", js.undefined)
      
      inline def setHideFor(value: /* routeView */ RouteView => Callback): Self = StObject.set(x, "hideFor", js.Any.fromFunction1((t0: /* routeView */ RouteView) => value(t0).runNow()))
      
      inline def setHideForUndefined: Self = StObject.set(x, "hideFor", js.undefined)
      
      inline def setIconClass(value: String): Self = StObject.set(x, "iconClass", value.asInstanceOf[js.Any])
      
      inline def setIconClassUndefined: Self = StObject.set(x, "iconClass", js.undefined)
      
      inline def setIconUrl(value: String): Self = StObject.set(x, "iconUrl", value.asInstanceOf[js.Any])
      
      inline def setIconUrlUndefined: Self = StObject.set(x, "iconUrl", js.undefined)
      
      inline def setKeyboardShortcutHandle(value: KeyboardShortcutHandle): Self = StObject.set(x, "keyboardShortcutHandle", value.asInstanceOf[js.Any])
      
      inline def setKeyboardShortcutHandleUndefined: Self = StObject.set(x, "keyboardShortcutHandle", js.undefined)
      
      inline def setOnClick(value: LegacyToolbarButtonEvent => Callback): Self = StObject.set(x, "onClick", js.Any.fromFunction1((t0: LegacyToolbarButtonEvent) => value(t0).runNow()))
      
      inline def setSection(value: SectionNames): Self = StObject.set(x, "section", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  trait LegacyToolbarButtonEvent extends StObject {
    
    var dropdown: js.UndefOr[DropdownView] = js.undefined
    
    var selectedThreadRowViews: js.Array[ThreadRowView]
    
    var threadRowViews: js.Array[ThreadRowView]
    
    var threadView: ThreadView
  }
  object LegacyToolbarButtonEvent {
    
    inline def apply(
      selectedThreadRowViews: js.Array[ThreadRowView],
      threadRowViews: js.Array[ThreadRowView],
      threadView: ThreadView
    ): LegacyToolbarButtonEvent = {
      val __obj = js.Dynamic.literal(selectedThreadRowViews = selectedThreadRowViews.asInstanceOf[js.Any], threadRowViews = threadRowViews.asInstanceOf[js.Any], threadView = threadView.asInstanceOf[js.Any])
      __obj.asInstanceOf[LegacyToolbarButtonEvent]
    }
    
    extension [Self <: LegacyToolbarButtonEvent](x: Self) {
      
      inline def setDropdown(value: DropdownView): Self = StObject.set(x, "dropdown", value.asInstanceOf[js.Any])
      
      inline def setDropdownUndefined: Self = StObject.set(x, "dropdown", js.undefined)
      
      inline def setSelectedThreadRowViews(value: js.Array[ThreadRowView]): Self = StObject.set(x, "selectedThreadRowViews", value.asInstanceOf[js.Any])
      
      inline def setSelectedThreadRowViewsVarargs(value: ThreadRowView*): Self = StObject.set(x, "selectedThreadRowViews", js.Array(value*))
      
      inline def setThreadRowViews(value: js.Array[ThreadRowView]): Self = StObject.set(x, "threadRowViews", value.asInstanceOf[js.Any])
      
      inline def setThreadRowViewsVarargs(value: ThreadRowView*): Self = StObject.set(x, "threadRowViews", js.Array(value*))
      
      inline def setThreadView(value: ThreadView): Self = StObject.set(x, "threadView", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.inboxsdk.inboxsdkStrings.INBOX_STATE
    - typingsJapgolly.inboxsdk.inboxsdkStrings.METADATA_STATE
    - typingsJapgolly.inboxsdk.inboxsdkStrings.OTHER
  */
  trait SectionNames extends StObject
  object SectionNames {
    
    inline def INBOX_STATE: typingsJapgolly.inboxsdk.inboxsdkStrings.INBOX_STATE = "INBOX_STATE".asInstanceOf[typingsJapgolly.inboxsdk.inboxsdkStrings.INBOX_STATE]
    
    inline def METADATA_STATE: typingsJapgolly.inboxsdk.inboxsdkStrings.METADATA_STATE = "METADATA_STATE".asInstanceOf[typingsJapgolly.inboxsdk.inboxsdkStrings.METADATA_STATE]
    
    inline def OTHER: typingsJapgolly.inboxsdk.inboxsdkStrings.OTHER = "OTHER".asInstanceOf[typingsJapgolly.inboxsdk.inboxsdkStrings.OTHER]
  }
  
  trait ToolbarButtonDescriptor extends StObject {
    
    var hasDropdown: js.UndefOr[Boolean] = js.undefined
    
    var hideFor: js.UndefOr[js.Function1[/* routeView */ RouteView, Unit]] = js.undefined
    
    var iconClass: js.UndefOr[String] = js.undefined
    
    var iconUrl: js.UndefOr[String] = js.undefined
    
    var keyboardShortcutHandle: js.UndefOr[KeyboardShortcutHandle] = js.undefined
    
    var listSection: js.UndefOr[SectionNames] = js.undefined
    
    def onClick(event: ToolbarButtonEvent): Unit
    
    var orderHint: js.UndefOr[Double] = js.undefined
    
    var positions: js.UndefOr[js.Array[ToolbarButtonPosition]] = js.undefined
    
    var threadSection: js.UndefOr[SectionNames] = js.undefined
    
    var title: String
  }
  object ToolbarButtonDescriptor {
    
    inline def apply(onClick: ToolbarButtonEvent => Callback, title: String): ToolbarButtonDescriptor = {
      val __obj = js.Dynamic.literal(onClick = js.Any.fromFunction1((t0: ToolbarButtonEvent) => onClick(t0).runNow()), title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[ToolbarButtonDescriptor]
    }
    
    extension [Self <: ToolbarButtonDescriptor](x: Self) {
      
      inline def setHasDropdown(value: Boolean): Self = StObject.set(x, "hasDropdown", value.asInstanceOf[js.Any])
      
      inline def setHasDropdownUndefined: Self = StObject.set(x, "hasDropdown", js.undefined)
      
      inline def setHideFor(value: /* routeView */ RouteView => Callback): Self = StObject.set(x, "hideFor", js.Any.fromFunction1((t0: /* routeView */ RouteView) => value(t0).runNow()))
      
      inline def setHideForUndefined: Self = StObject.set(x, "hideFor", js.undefined)
      
      inline def setIconClass(value: String): Self = StObject.set(x, "iconClass", value.asInstanceOf[js.Any])
      
      inline def setIconClassUndefined: Self = StObject.set(x, "iconClass", js.undefined)
      
      inline def setIconUrl(value: String): Self = StObject.set(x, "iconUrl", value.asInstanceOf[js.Any])
      
      inline def setIconUrlUndefined: Self = StObject.set(x, "iconUrl", js.undefined)
      
      inline def setKeyboardShortcutHandle(value: KeyboardShortcutHandle): Self = StObject.set(x, "keyboardShortcutHandle", value.asInstanceOf[js.Any])
      
      inline def setKeyboardShortcutHandleUndefined: Self = StObject.set(x, "keyboardShortcutHandle", js.undefined)
      
      inline def setListSection(value: SectionNames): Self = StObject.set(x, "listSection", value.asInstanceOf[js.Any])
      
      inline def setListSectionUndefined: Self = StObject.set(x, "listSection", js.undefined)
      
      inline def setOnClick(value: ToolbarButtonEvent => Callback): Self = StObject.set(x, "onClick", js.Any.fromFunction1((t0: ToolbarButtonEvent) => value(t0).runNow()))
      
      inline def setOrderHint(value: Double): Self = StObject.set(x, "orderHint", value.asInstanceOf[js.Any])
      
      inline def setOrderHintUndefined: Self = StObject.set(x, "orderHint", js.undefined)
      
      inline def setPositions(value: js.Array[ToolbarButtonPosition]): Self = StObject.set(x, "positions", value.asInstanceOf[js.Any])
      
      inline def setPositionsUndefined: Self = StObject.set(x, "positions", js.undefined)
      
      inline def setPositionsVarargs(value: ToolbarButtonPosition*): Self = StObject.set(x, "positions", js.Array(value*))
      
      inline def setThreadSection(value: SectionNames): Self = StObject.set(x, "threadSection", value.asInstanceOf[js.Any])
      
      inline def setThreadSectionUndefined: Self = StObject.set(x, "threadSection", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  trait ToolbarButtonEvent extends StObject {
    
    var dropdown: js.UndefOr[DropdownView] = js.undefined
    
    var position: ToolbarButtonPosition
    
    var selectedThreadRowViews: js.Array[ThreadRowView]
    
    var selectedThreadViews: js.Array[ThreadView]
  }
  object ToolbarButtonEvent {
    
    inline def apply(
      position: ToolbarButtonPosition,
      selectedThreadRowViews: js.Array[ThreadRowView],
      selectedThreadViews: js.Array[ThreadView]
    ): ToolbarButtonEvent = {
      val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any], selectedThreadRowViews = selectedThreadRowViews.asInstanceOf[js.Any], selectedThreadViews = selectedThreadViews.asInstanceOf[js.Any])
      __obj.asInstanceOf[ToolbarButtonEvent]
    }
    
    extension [Self <: ToolbarButtonEvent](x: Self) {
      
      inline def setDropdown(value: DropdownView): Self = StObject.set(x, "dropdown", value.asInstanceOf[js.Any])
      
      inline def setDropdownUndefined: Self = StObject.set(x, "dropdown", js.undefined)
      
      inline def setPosition(value: ToolbarButtonPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setSelectedThreadRowViews(value: js.Array[ThreadRowView]): Self = StObject.set(x, "selectedThreadRowViews", value.asInstanceOf[js.Any])
      
      inline def setSelectedThreadRowViewsVarargs(value: ThreadRowView*): Self = StObject.set(x, "selectedThreadRowViews", js.Array(value*))
      
      inline def setSelectedThreadViews(value: js.Array[ThreadView]): Self = StObject.set(x, "selectedThreadViews", value.asInstanceOf[js.Any])
      
      inline def setSelectedThreadViewsVarargs(value: ThreadView*): Self = StObject.set(x, "selectedThreadViews", js.Array(value*))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.inboxsdk.inboxsdkStrings.THREAD
    - typingsJapgolly.inboxsdk.inboxsdkStrings.ROW
    - typingsJapgolly.inboxsdk.inboxsdkStrings.LIST
  */
  trait ToolbarButtonPosition extends StObject
  object ToolbarButtonPosition {
    
    inline def LIST: typingsJapgolly.inboxsdk.inboxsdkStrings.LIST = "LIST".asInstanceOf[typingsJapgolly.inboxsdk.inboxsdkStrings.LIST]
    
    inline def ROW: typingsJapgolly.inboxsdk.inboxsdkStrings.ROW = "ROW".asInstanceOf[typingsJapgolly.inboxsdk.inboxsdkStrings.ROW]
    
    inline def THREAD: typingsJapgolly.inboxsdk.inboxsdkStrings.THREAD = "THREAD".asInstanceOf[typingsJapgolly.inboxsdk.inboxsdkStrings.THREAD]
  }
  
  trait ToolbarsInstance extends StObject {
    
    def addToolbarButtonForApp(appToolbarButtonDescriptor: AppToolbarButtonDescriptor): AppToolbarButtonView
    
    def registerThreadButton(toolbarButtonDescriptor: ToolbarButtonDescriptor): js.Function0[Unit]
    
    /**
      * @deprecated. use registerThreadButton
      * @param toolbarButtonDescriptor
      */
    def registerToolbarButtonForList(toolbarButtonDescriptor: LegacyToolbarButtonDescriptor): js.Function0[Unit]
    
    /**
      * @deprecated. use registerThreadButton
      * @param toolbarButtonDescriptor
      */
    def registerToolbarButtonForThreadView(toolbarButtonDescriptor: LegacyToolbarButtonDescriptor): js.Function0[Unit]
  }
  object ToolbarsInstance {
    
    inline def apply(
      addToolbarButtonForApp: AppToolbarButtonDescriptor => AppToolbarButtonView,
      registerThreadButton: ToolbarButtonDescriptor => js.Function0[Unit],
      registerToolbarButtonForList: LegacyToolbarButtonDescriptor => js.Function0[Unit],
      registerToolbarButtonForThreadView: LegacyToolbarButtonDescriptor => js.Function0[Unit]
    ): ToolbarsInstance = {
      val __obj = js.Dynamic.literal(addToolbarButtonForApp = js.Any.fromFunction1(addToolbarButtonForApp), registerThreadButton = js.Any.fromFunction1(registerThreadButton), registerToolbarButtonForList = js.Any.fromFunction1(registerToolbarButtonForList), registerToolbarButtonForThreadView = js.Any.fromFunction1(registerToolbarButtonForThreadView))
      __obj.asInstanceOf[ToolbarsInstance]
    }
    
    extension [Self <: ToolbarsInstance](x: Self) {
      
      inline def setAddToolbarButtonForApp(value: AppToolbarButtonDescriptor => AppToolbarButtonView): Self = StObject.set(x, "addToolbarButtonForApp", js.Any.fromFunction1(value))
      
      inline def setRegisterThreadButton(value: ToolbarButtonDescriptor => js.Function0[Unit]): Self = StObject.set(x, "registerThreadButton", js.Any.fromFunction1(value))
      
      inline def setRegisterToolbarButtonForList(value: LegacyToolbarButtonDescriptor => js.Function0[Unit]): Self = StObject.set(x, "registerToolbarButtonForList", js.Any.fromFunction1(value))
      
      inline def setRegisterToolbarButtonForThreadView(value: LegacyToolbarButtonDescriptor => js.Function0[Unit]): Self = StObject.set(x, "registerToolbarButtonForThreadView", js.Any.fromFunction1(value))
    }
  }
}
