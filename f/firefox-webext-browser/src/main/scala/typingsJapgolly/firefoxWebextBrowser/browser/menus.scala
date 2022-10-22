package typingsJapgolly.firefoxWebextBrowser.browser

import org.scalablytyped.runtime.NumberDictionary
import typingsJapgolly.firefoxWebextBrowser.browser.`extension`.ViewType
import typingsJapgolly.firefoxWebextBrowser.browser.tabs.Tab
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Use the browser.menus API to add items to the browser's menus. You can choose what types of objects your context menu additions apply to, such as images, hyperlinks, and pages.
  *
  * Permissions: `menus`, `menus`
  */
object menus {
  
  /* menus types */
  /**
    * The different contexts a menu can appear in. Specifying 'all' is equivalent to the combination of all other contexts except for 'tab' and 'tools_menu'.
    */
  type ContextType = _ContextType
  
  trait CreateCreateProperties extends StObject {
    
    /**
      * The initial state of a checkbox or radio item: true for selected and false for unselected. Only one radio item can be selected at a time in a given group of radio items.
      */
    var checked: js.UndefOr[Boolean] = js.undefined
    
    /** Specifies a command to issue for the context click. */
    var command: js.UndefOr[String | CreateCreatePropertiesCommand] = js.undefined
    
    /** List of contexts this menu item will appear in. Defaults to ['page'] if not specified. */
    var contexts: js.UndefOr[js.Array[ContextType]] = js.undefined
    
    /**
      * Lets you restrict the item to apply only to documents whose URL matches one of the given patterns. (This applies to frames as well.) For details on the format of a pattern, see Match Patterns.
      */
    var documentUrlPatterns: js.UndefOr[js.Array[String]] = js.undefined
    
    /** Whether this context menu item is enabled or disabled. Defaults to true. */
    var enabled: js.UndefOr[Boolean] = js.undefined
    
    var icons: js.UndefOr[CreateCreatePropertiesIcons] = js.undefined
    
    /**
      * The unique ID to assign to this item. Mandatory for event pages. Cannot be the same as another ID for this extension.
      */
    var id: js.UndefOr[String] = js.undefined
    
    /**
      * A function that will be called back when the menu item is clicked. Event pages cannot use this; instead, they should register a listener for `contextMenus.onClicked`.
      * @param info Information about the item clicked and the context where the click happened.
      * @param tab The details of the tab where the click took place. Note: this parameter only present for extensions.
      */
    var onclick: js.UndefOr[js.Function2[/* info */ OnClickData, /* tab */ Tab, js.UndefOr[Unit]]] = js.undefined
    
    /** The ID of a parent menu item; this makes the item a child of a previously added item. */
    var parentId: js.UndefOr[Double | String] = js.undefined
    
    /**
      * Similar to documentUrlPatterns, but lets you filter based on the src attribute of img/audio/video tags and the href of anchor tags.
      */
    var targetUrlPatterns: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * The text to be displayed in the item; this is _required_ unless `type` is 'separator'. When the context is 'selection', you can use `%s` within the string to show the selected text. For example, if this parameter's value is "Translate '%s' to Pig Latin" and the user selects the word "cool", the context menu item for the selection is "Translate 'cool' to Pig Latin".
      */
    var title: js.UndefOr[String] = js.undefined
    
    /** The type of menu item. Defaults to 'normal' if not specified. */
    var `type`: js.UndefOr[ItemType] = js.undefined
    
    /**
      * List of view types where the menu item will be shown. Defaults to any view, including those without a viewType.
      */
    var viewTypes: js.UndefOr[js.Array[ViewType]] = js.undefined
    
    /** Whether the item is visible in the menu. */
    var visible: js.UndefOr[Boolean] = js.undefined
  }
  object CreateCreateProperties {
    
    inline def apply(): CreateCreateProperties = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateCreateProperties]
    }
    
    extension [Self <: CreateCreateProperties](x: Self) {
      
      inline def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      inline def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
      
      inline def setCommand(value: String | CreateCreatePropertiesCommand): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
      
      inline def setCommandUndefined: Self = StObject.set(x, "command", js.undefined)
      
      inline def setContexts(value: js.Array[ContextType]): Self = StObject.set(x, "contexts", value.asInstanceOf[js.Any])
      
      inline def setContextsUndefined: Self = StObject.set(x, "contexts", js.undefined)
      
      inline def setContextsVarargs(value: ContextType*): Self = StObject.set(x, "contexts", js.Array(value*))
      
      inline def setDocumentUrlPatterns(value: js.Array[String]): Self = StObject.set(x, "documentUrlPatterns", value.asInstanceOf[js.Any])
      
      inline def setDocumentUrlPatternsUndefined: Self = StObject.set(x, "documentUrlPatterns", js.undefined)
      
      inline def setDocumentUrlPatternsVarargs(value: String*): Self = StObject.set(x, "documentUrlPatterns", js.Array(value*))
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setIcons(value: CreateCreatePropertiesIcons): Self = StObject.set(x, "icons", value.asInstanceOf[js.Any])
      
      inline def setIconsUndefined: Self = StObject.set(x, "icons", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setOnclick(value: (/* info */ OnClickData, /* tab */ Tab) => js.UndefOr[Unit]): Self = StObject.set(x, "onclick", js.Any.fromFunction2(value))
      
      inline def setOnclickUndefined: Self = StObject.set(x, "onclick", js.undefined)
      
      inline def setParentId(value: Double | String): Self = StObject.set(x, "parentId", value.asInstanceOf[js.Any])
      
      inline def setParentIdUndefined: Self = StObject.set(x, "parentId", js.undefined)
      
      inline def setTargetUrlPatterns(value: js.Array[String]): Self = StObject.set(x, "targetUrlPatterns", value.asInstanceOf[js.Any])
      
      inline def setTargetUrlPatternsUndefined: Self = StObject.set(x, "targetUrlPatterns", js.undefined)
      
      inline def setTargetUrlPatternsVarargs(value: String*): Self = StObject.set(x, "targetUrlPatterns", js.Array(value*))
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setType(value: ItemType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setViewTypes(value: js.Array[ViewType]): Self = StObject.set(x, "viewTypes", value.asInstanceOf[js.Any])
      
      inline def setViewTypesUndefined: Self = StObject.set(x, "viewTypes", js.undefined)
      
      inline def setViewTypesVarargs(value: ViewType*): Self = StObject.set(x, "viewTypes", js.Array(value*))
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings._execute_browser_action
    - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings._execute_page_action
    - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings._execute_sidebar_action
    - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings._execute_action
  */
  trait CreateCreatePropertiesCommand extends StObject
  object CreateCreatePropertiesCommand {
    
    inline def _execute_action: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings._execute_action = "_execute_action".asInstanceOf[typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings._execute_action]
    
    inline def _execute_browser_action: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings._execute_browser_action = "_execute_browser_action".asInstanceOf[typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings._execute_browser_action]
    
    inline def _execute_page_action: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings._execute_page_action = "_execute_page_action".asInstanceOf[typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings._execute_page_action]
    
    inline def _execute_sidebar_action: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings._execute_sidebar_action = "_execute_sidebar_action".asInstanceOf[typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings._execute_sidebar_action]
  }
  
  type CreateCreatePropertiesIcons = NumberDictionary[String]
  
  /** The type of menu item. */
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.normal
    - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.checkbox
    - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.radio
    - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.separator
  */
  trait ItemType extends StObject
  object ItemType {
    
    inline def checkbox: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.checkbox = "checkbox".asInstanceOf[typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.checkbox]
    
    inline def normal: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.normal = "normal".asInstanceOf[typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.normal]
    
    inline def radio: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.radio = "radio".asInstanceOf[typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.radio]
    
    inline def separator: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.separator = "separator".asInstanceOf[typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.separator]
  }
  
  /** Information sent when a context menu item is clicked. */
  trait OnClickData extends StObject {
    
    /** The id of the bookmark where the context menu was clicked, if it was on a bookmark. */
    var bookmarkId: String
    
    /** An integer value of button by which menu item was clicked. */
    var button: js.UndefOr[Double] = js.undefined
    
    /** A flag indicating the state of a checkbox or radio item after it is clicked. */
    var checked: js.UndefOr[Boolean] = js.undefined
    
    /** A flag indicating whether the element is editable (text input, textarea, etc.). */
    var editable: Boolean
    
    /** The id of the frame of the element where the context menu was clicked. */
    var frameId: js.UndefOr[Double] = js.undefined
    
    /** The URL of the frame of the element where the context menu was clicked, if it was in a frame. */
    var frameUrl: js.UndefOr[String] = js.undefined
    
    /** If the element is a link, the text of that link. */
    var linkText: js.UndefOr[String] = js.undefined
    
    /** If the element is a link, the URL it points to. */
    var linkUrl: js.UndefOr[String] = js.undefined
    
    /**
      * One of 'image', 'video', or 'audio' if the context menu was activated on one of these types of elements.
      */
    var mediaType: js.UndefOr[String] = js.undefined
    
    /** The ID of the menu item that was clicked. */
    var menuItemId: Double | String
    
    /** An array of keyboard modifiers that were held while the menu item was clicked. */
    var modifiers: js.Array[OnClickDataModifiers]
    
    /**
      * The URL of the page where the menu item was clicked. This property is not set if the click occured in a context where there is no current page, such as in a launcher context menu.
      */
    var pageUrl: js.UndefOr[String] = js.undefined
    
    /** The parent ID, if any, for the item clicked. */
    var parentMenuItemId: js.UndefOr[Double | String] = js.undefined
    
    /** The text for the context selection, if any. */
    var selectionText: js.UndefOr[String] = js.undefined
    
    /** Will be present for elements with a 'src' URL. */
    var srcUrl: js.UndefOr[String] = js.undefined
    
    /**
      * An identifier of the clicked element, if any. Use menus.getTargetElement in the page to find the corresponding element.
      */
    var targetElementId: js.UndefOr[Double] = js.undefined
    
    /** The type of view where the menu is clicked. May be unset if the menu is not associated with a view. */
    var viewType: js.UndefOr[ViewType] = js.undefined
    
    /** A flag indicating the state of a checkbox or radio item before it was clicked. */
    var wasChecked: js.UndefOr[Boolean] = js.undefined
  }
  object OnClickData {
    
    inline def apply(
      bookmarkId: String,
      editable: Boolean,
      menuItemId: Double | String,
      modifiers: js.Array[OnClickDataModifiers]
    ): OnClickData = {
      val __obj = js.Dynamic.literal(bookmarkId = bookmarkId.asInstanceOf[js.Any], editable = editable.asInstanceOf[js.Any], menuItemId = menuItemId.asInstanceOf[js.Any], modifiers = modifiers.asInstanceOf[js.Any])
      __obj.asInstanceOf[OnClickData]
    }
    
    extension [Self <: OnClickData](x: Self) {
      
      inline def setBookmarkId(value: String): Self = StObject.set(x, "bookmarkId", value.asInstanceOf[js.Any])
      
      inline def setButton(value: Double): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
      
      inline def setButtonUndefined: Self = StObject.set(x, "button", js.undefined)
      
      inline def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      inline def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
      
      inline def setEditable(value: Boolean): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
      
      inline def setFrameId(value: Double): Self = StObject.set(x, "frameId", value.asInstanceOf[js.Any])
      
      inline def setFrameIdUndefined: Self = StObject.set(x, "frameId", js.undefined)
      
      inline def setFrameUrl(value: String): Self = StObject.set(x, "frameUrl", value.asInstanceOf[js.Any])
      
      inline def setFrameUrlUndefined: Self = StObject.set(x, "frameUrl", js.undefined)
      
      inline def setLinkText(value: String): Self = StObject.set(x, "linkText", value.asInstanceOf[js.Any])
      
      inline def setLinkTextUndefined: Self = StObject.set(x, "linkText", js.undefined)
      
      inline def setLinkUrl(value: String): Self = StObject.set(x, "linkUrl", value.asInstanceOf[js.Any])
      
      inline def setLinkUrlUndefined: Self = StObject.set(x, "linkUrl", js.undefined)
      
      inline def setMediaType(value: String): Self = StObject.set(x, "mediaType", value.asInstanceOf[js.Any])
      
      inline def setMediaTypeUndefined: Self = StObject.set(x, "mediaType", js.undefined)
      
      inline def setMenuItemId(value: Double | String): Self = StObject.set(x, "menuItemId", value.asInstanceOf[js.Any])
      
      inline def setModifiers(value: js.Array[OnClickDataModifiers]): Self = StObject.set(x, "modifiers", value.asInstanceOf[js.Any])
      
      inline def setModifiersVarargs(value: OnClickDataModifiers*): Self = StObject.set(x, "modifiers", js.Array(value*))
      
      inline def setPageUrl(value: String): Self = StObject.set(x, "pageUrl", value.asInstanceOf[js.Any])
      
      inline def setPageUrlUndefined: Self = StObject.set(x, "pageUrl", js.undefined)
      
      inline def setParentMenuItemId(value: Double | String): Self = StObject.set(x, "parentMenuItemId", value.asInstanceOf[js.Any])
      
      inline def setParentMenuItemIdUndefined: Self = StObject.set(x, "parentMenuItemId", js.undefined)
      
      inline def setSelectionText(value: String): Self = StObject.set(x, "selectionText", value.asInstanceOf[js.Any])
      
      inline def setSelectionTextUndefined: Self = StObject.set(x, "selectionText", js.undefined)
      
      inline def setSrcUrl(value: String): Self = StObject.set(x, "srcUrl", value.asInstanceOf[js.Any])
      
      inline def setSrcUrlUndefined: Self = StObject.set(x, "srcUrl", js.undefined)
      
      inline def setTargetElementId(value: Double): Self = StObject.set(x, "targetElementId", value.asInstanceOf[js.Any])
      
      inline def setTargetElementIdUndefined: Self = StObject.set(x, "targetElementId", js.undefined)
      
      inline def setViewType(value: ViewType): Self = StObject.set(x, "viewType", value.asInstanceOf[js.Any])
      
      inline def setViewTypeUndefined: Self = StObject.set(x, "viewType", js.undefined)
      
      inline def setWasChecked(value: Boolean): Self = StObject.set(x, "wasChecked", value.asInstanceOf[js.Any])
      
      inline def setWasCheckedUndefined: Self = StObject.set(x, "wasChecked", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.Shift
    - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.Alt
    - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.Command
    - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.Ctrl
    - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.MacCtrl
  */
  trait OnClickDataModifiers extends StObject
  object OnClickDataModifiers {
    
    inline def Alt: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.Alt = "Alt".asInstanceOf[typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.Alt]
    
    inline def Command: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.Command = "Command".asInstanceOf[typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.Command]
    
    inline def Ctrl: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.Ctrl = "Ctrl".asInstanceOf[typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.Ctrl]
    
    inline def MacCtrl: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.MacCtrl = "MacCtrl".asInstanceOf[typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.MacCtrl]
    
    inline def Shift: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.Shift = "Shift".asInstanceOf[typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.Shift]
  }
  
  /**
    * Information about the context of the menu action and the created menu items. For more information about each property, see OnClickData. The following properties are only set if the extension has host permissions for the given context: linkUrl, linkText, srcUrl, pageUrl, frameUrl, selectionText.
    */
  trait OnShownInfo extends StObject {
    
    /** A list of all contexts that apply to the menu. */
    var contexts: js.Array[ContextType]
    
    var editable: Boolean
    
    var frameUrl: js.UndefOr[String] = js.undefined
    
    var linkText: js.UndefOr[String] = js.undefined
    
    var linkUrl: js.UndefOr[String] = js.undefined
    
    var mediaType: js.UndefOr[String] = js.undefined
    
    /** A list of IDs of the menu items that were shown. */
    var menuIds: Double | js.Array[String]
    
    var pageUrl: js.UndefOr[String] = js.undefined
    
    var selectionText: js.UndefOr[String] = js.undefined
    
    var srcUrl: js.UndefOr[String] = js.undefined
    
    var targetElementId: js.UndefOr[Double] = js.undefined
    
    var viewType: js.UndefOr[ViewType] = js.undefined
  }
  object OnShownInfo {
    
    inline def apply(contexts: js.Array[ContextType], editable: Boolean, menuIds: Double | js.Array[String]): OnShownInfo = {
      val __obj = js.Dynamic.literal(contexts = contexts.asInstanceOf[js.Any], editable = editable.asInstanceOf[js.Any], menuIds = menuIds.asInstanceOf[js.Any])
      __obj.asInstanceOf[OnShownInfo]
    }
    
    extension [Self <: OnShownInfo](x: Self) {
      
      inline def setContexts(value: js.Array[ContextType]): Self = StObject.set(x, "contexts", value.asInstanceOf[js.Any])
      
      inline def setContextsVarargs(value: ContextType*): Self = StObject.set(x, "contexts", js.Array(value*))
      
      inline def setEditable(value: Boolean): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
      
      inline def setFrameUrl(value: String): Self = StObject.set(x, "frameUrl", value.asInstanceOf[js.Any])
      
      inline def setFrameUrlUndefined: Self = StObject.set(x, "frameUrl", js.undefined)
      
      inline def setLinkText(value: String): Self = StObject.set(x, "linkText", value.asInstanceOf[js.Any])
      
      inline def setLinkTextUndefined: Self = StObject.set(x, "linkText", js.undefined)
      
      inline def setLinkUrl(value: String): Self = StObject.set(x, "linkUrl", value.asInstanceOf[js.Any])
      
      inline def setLinkUrlUndefined: Self = StObject.set(x, "linkUrl", js.undefined)
      
      inline def setMediaType(value: String): Self = StObject.set(x, "mediaType", value.asInstanceOf[js.Any])
      
      inline def setMediaTypeUndefined: Self = StObject.set(x, "mediaType", js.undefined)
      
      inline def setMenuIds(value: Double | js.Array[String]): Self = StObject.set(x, "menuIds", value.asInstanceOf[js.Any])
      
      inline def setMenuIdsVarargs(value: String*): Self = StObject.set(x, "menuIds", js.Array(value*))
      
      inline def setPageUrl(value: String): Self = StObject.set(x, "pageUrl", value.asInstanceOf[js.Any])
      
      inline def setPageUrlUndefined: Self = StObject.set(x, "pageUrl", js.undefined)
      
      inline def setSelectionText(value: String): Self = StObject.set(x, "selectionText", value.asInstanceOf[js.Any])
      
      inline def setSelectionTextUndefined: Self = StObject.set(x, "selectionText", js.undefined)
      
      inline def setSrcUrl(value: String): Self = StObject.set(x, "srcUrl", value.asInstanceOf[js.Any])
      
      inline def setSrcUrlUndefined: Self = StObject.set(x, "srcUrl", js.undefined)
      
      inline def setTargetElementId(value: Double): Self = StObject.set(x, "targetElementId", value.asInstanceOf[js.Any])
      
      inline def setTargetElementIdUndefined: Self = StObject.set(x, "targetElementId", js.undefined)
      
      inline def setViewType(value: ViewType): Self = StObject.set(x, "viewType", value.asInstanceOf[js.Any])
      
      inline def setViewTypeUndefined: Self = StObject.set(x, "viewType", js.undefined)
    }
  }
  
  trait OverrideContextContextOptions extends StObject {
    
    /** Required when context is 'bookmark'. Requires 'bookmark' permission. */
    var bookmarkId: js.UndefOr[String] = js.undefined
    
    /**
      * ContextType to override, to allow menu items from other extensions in the menu. Currently only 'bookmark' and 'tab' are supported. showDefaults cannot be used with this option.
      */
    var context: js.UndefOr[OverrideContextContextOptionsContext] = js.undefined
    
    /** Whether to also include default menu items in the menu. */
    var showDefaults: js.UndefOr[Boolean] = js.undefined
    
    /** Required when context is 'tab'. Requires 'tabs' permission. */
    var tabId: js.UndefOr[Double] = js.undefined
  }
  object OverrideContextContextOptions {
    
    inline def apply(): OverrideContextContextOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OverrideContextContextOptions]
    }
    
    extension [Self <: OverrideContextContextOptions](x: Self) {
      
      inline def setBookmarkId(value: String): Self = StObject.set(x, "bookmarkId", value.asInstanceOf[js.Any])
      
      inline def setBookmarkIdUndefined: Self = StObject.set(x, "bookmarkId", js.undefined)
      
      inline def setContext(value: OverrideContextContextOptionsContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      inline def setShowDefaults(value: Boolean): Self = StObject.set(x, "showDefaults", value.asInstanceOf[js.Any])
      
      inline def setShowDefaultsUndefined: Self = StObject.set(x, "showDefaults", js.undefined)
      
      inline def setTabId(value: Double): Self = StObject.set(x, "tabId", value.asInstanceOf[js.Any])
      
      inline def setTabIdUndefined: Self = StObject.set(x, "tabId", js.undefined)
    }
  }
  
  /**
    * ContextType to override, to allow menu items from other extensions in the menu. Currently only 'bookmark' and 'tab' are supported. showDefaults cannot be used with this option.
    */
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.bookmark
    - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.tab
  */
  trait OverrideContextContextOptionsContext extends StObject
  object OverrideContextContextOptionsContext {
    
    inline def bookmark: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.bookmark = "bookmark".asInstanceOf[typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.bookmark]
    
    inline def tab: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.tab = "tab".asInstanceOf[typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.tab]
  }
  
  /** The properties to update. Accepts the same values as the create function. */
  trait UpdateUpdateProperties extends StObject {
    
    var checked: js.UndefOr[Boolean] = js.undefined
    
    var contexts: js.UndefOr[js.Array[ContextType]] = js.undefined
    
    var documentUrlPatterns: js.UndefOr[js.Array[String]] = js.undefined
    
    var enabled: js.UndefOr[Boolean] = js.undefined
    
    var icons: js.UndefOr[UpdateUpdatePropertiesIcons] = js.undefined
    
    /**
      * @param tab The details of the tab where the click took place. Note: this parameter only present for extensions.
      */
    var onclick: js.UndefOr[js.Function2[/* info */ OnClickData, /* tab */ Tab, js.UndefOr[Unit]]] = js.undefined
    
    /** Note: You cannot change an item to be a child of one of its own descendants. */
    var parentId: js.UndefOr[Double | String] = js.undefined
    
    var targetUrlPatterns: js.UndefOr[js.Array[String]] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
    
    var `type`: js.UndefOr[ItemType] = js.undefined
    
    var viewTypes: js.UndefOr[js.Array[ViewType]] = js.undefined
    
    /** Whether the item is visible in the menu. */
    var visible: js.UndefOr[Boolean] = js.undefined
  }
  object UpdateUpdateProperties {
    
    inline def apply(): UpdateUpdateProperties = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateUpdateProperties]
    }
    
    extension [Self <: UpdateUpdateProperties](x: Self) {
      
      inline def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      inline def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
      
      inline def setContexts(value: js.Array[ContextType]): Self = StObject.set(x, "contexts", value.asInstanceOf[js.Any])
      
      inline def setContextsUndefined: Self = StObject.set(x, "contexts", js.undefined)
      
      inline def setContextsVarargs(value: ContextType*): Self = StObject.set(x, "contexts", js.Array(value*))
      
      inline def setDocumentUrlPatterns(value: js.Array[String]): Self = StObject.set(x, "documentUrlPatterns", value.asInstanceOf[js.Any])
      
      inline def setDocumentUrlPatternsUndefined: Self = StObject.set(x, "documentUrlPatterns", js.undefined)
      
      inline def setDocumentUrlPatternsVarargs(value: String*): Self = StObject.set(x, "documentUrlPatterns", js.Array(value*))
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setIcons(value: UpdateUpdatePropertiesIcons): Self = StObject.set(x, "icons", value.asInstanceOf[js.Any])
      
      inline def setIconsUndefined: Self = StObject.set(x, "icons", js.undefined)
      
      inline def setOnclick(value: (/* info */ OnClickData, /* tab */ Tab) => js.UndefOr[Unit]): Self = StObject.set(x, "onclick", js.Any.fromFunction2(value))
      
      inline def setOnclickUndefined: Self = StObject.set(x, "onclick", js.undefined)
      
      inline def setParentId(value: Double | String): Self = StObject.set(x, "parentId", value.asInstanceOf[js.Any])
      
      inline def setParentIdUndefined: Self = StObject.set(x, "parentId", js.undefined)
      
      inline def setTargetUrlPatterns(value: js.Array[String]): Self = StObject.set(x, "targetUrlPatterns", value.asInstanceOf[js.Any])
      
      inline def setTargetUrlPatternsUndefined: Self = StObject.set(x, "targetUrlPatterns", js.undefined)
      
      inline def setTargetUrlPatternsVarargs(value: String*): Self = StObject.set(x, "targetUrlPatterns", js.Array(value*))
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setType(value: ItemType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setViewTypes(value: js.Array[ViewType]): Self = StObject.set(x, "viewTypes", value.asInstanceOf[js.Any])
      
      inline def setViewTypesUndefined: Self = StObject.set(x, "viewTypes", js.undefined)
      
      inline def setViewTypesVarargs(value: ViewType*): Self = StObject.set(x, "viewTypes", js.Array(value*))
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  type UpdateUpdatePropertiesIcons = NumberDictionary[String]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.all
    - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.page
    - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.frame
    - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.selection
    - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.link
    - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.editable
    - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.password
    - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.image
    - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.video
    - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.audio
    - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.launcher
    - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.bookmark
    - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.tab
    - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.tools_menu
    - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.browser_action
    - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.page_action
    - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.action
  */
  trait _ContextType extends StObject
  object _ContextType {
    
    inline def action: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.action = "action".asInstanceOf[typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.action]
    
    inline def all: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.all = "all".asInstanceOf[typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.all]
    
    inline def audio: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.audio = "audio".asInstanceOf[typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.audio]
    
    inline def bookmark: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.bookmark = "bookmark".asInstanceOf[typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.bookmark]
    
    inline def browser_action: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.browser_action = "browser_action".asInstanceOf[typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.browser_action]
    
    inline def editable: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.editable = "editable".asInstanceOf[typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.editable]
    
    inline def frame: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.frame = "frame".asInstanceOf[typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.frame]
    
    inline def image: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.image = "image".asInstanceOf[typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.image]
    
    inline def launcher: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.launcher = "launcher".asInstanceOf[typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.launcher]
    
    inline def link: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.link = "link".asInstanceOf[typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.link]
    
    inline def page: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.page = "page".asInstanceOf[typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.page]
    
    inline def page_action: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.page_action = "page_action".asInstanceOf[typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.page_action]
    
    inline def password: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.password = "password".asInstanceOf[typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.password]
    
    inline def selection: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.selection = "selection".asInstanceOf[typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.selection]
    
    inline def tab: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.tab = "tab".asInstanceOf[typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.tab]
    
    inline def tools_menu: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.tools_menu = "tools_menu".asInstanceOf[typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.tools_menu]
    
    inline def video: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.video = "video".asInstanceOf[typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.video]
  }
}
