package typingsJapgolly.naverWhale.whale

import japgolly.scalajs.react.Callback
import typingsJapgolly.chrome.chrome.events.Event
import typingsJapgolly.chrome.chrome.tabs.Tab
import typingsJapgolly.naverWhale.naverWhaleStrings.audio
import typingsJapgolly.naverWhale.naverWhaleStrings.image
import typingsJapgolly.naverWhale.naverWhaleStrings.video
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

////////////////////
// Context Menus
////////////////////
/**
  * Use the chrome.contextMenus API to add items to Google Chrome's context menu. You can choose what types of objects your context menu additions apply to, such as images, hyperlinks, and pages.
  * Availability: Since Chrome 6.
  * Permissions:  "contextMenus"
  */
object contextMenus {
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.naverWhale.naverWhaleStrings.normal
    - typingsJapgolly.naverWhale.naverWhaleStrings.checkbox
    - typingsJapgolly.naverWhale.naverWhaleStrings.radio
    - typingsJapgolly.naverWhale.naverWhaleStrings.separator
  */
  trait ContextItemType extends StObject
  object ContextItemType {
    
    inline def checkbox: typingsJapgolly.naverWhale.naverWhaleStrings.checkbox = "checkbox".asInstanceOf[typingsJapgolly.naverWhale.naverWhaleStrings.checkbox]
    
    inline def normal: typingsJapgolly.naverWhale.naverWhaleStrings.normal = "normal".asInstanceOf[typingsJapgolly.naverWhale.naverWhaleStrings.normal]
    
    inline def radio: typingsJapgolly.naverWhale.naverWhaleStrings.radio = "radio".asInstanceOf[typingsJapgolly.naverWhale.naverWhaleStrings.radio]
    
    inline def separator: typingsJapgolly.naverWhale.naverWhaleStrings.separator = "separator".asInstanceOf[typingsJapgolly.naverWhale.naverWhaleStrings.separator]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.naverWhale.naverWhaleStrings.all
    - typingsJapgolly.naverWhale.naverWhaleStrings.page
    - typingsJapgolly.naverWhale.naverWhaleStrings.frame
    - typingsJapgolly.naverWhale.naverWhaleStrings.selection
    - typingsJapgolly.naverWhale.naverWhaleStrings.link
    - typingsJapgolly.naverWhale.naverWhaleStrings.editable
    - typingsJapgolly.naverWhale.naverWhaleStrings.image
    - typingsJapgolly.naverWhale.naverWhaleStrings.video
    - typingsJapgolly.naverWhale.naverWhaleStrings.audio
    - typingsJapgolly.naverWhale.naverWhaleStrings.launcher
    - typingsJapgolly.naverWhale.naverWhaleStrings.browser_action
    - typingsJapgolly.naverWhale.naverWhaleStrings.page_action
    - typingsJapgolly.naverWhale.naverWhaleStrings.action
  */
  trait ContextType extends StObject
  object ContextType {
    
    inline def action: typingsJapgolly.naverWhale.naverWhaleStrings.action = "action".asInstanceOf[typingsJapgolly.naverWhale.naverWhaleStrings.action]
    
    inline def all: typingsJapgolly.naverWhale.naverWhaleStrings.all = "all".asInstanceOf[typingsJapgolly.naverWhale.naverWhaleStrings.all]
    
    inline def audio: typingsJapgolly.naverWhale.naverWhaleStrings.audio = "audio".asInstanceOf[typingsJapgolly.naverWhale.naverWhaleStrings.audio]
    
    inline def browser_action: typingsJapgolly.naverWhale.naverWhaleStrings.browser_action = "browser_action".asInstanceOf[typingsJapgolly.naverWhale.naverWhaleStrings.browser_action]
    
    inline def editable: typingsJapgolly.naverWhale.naverWhaleStrings.editable = "editable".asInstanceOf[typingsJapgolly.naverWhale.naverWhaleStrings.editable]
    
    inline def frame: typingsJapgolly.naverWhale.naverWhaleStrings.frame = "frame".asInstanceOf[typingsJapgolly.naverWhale.naverWhaleStrings.frame]
    
    inline def image: typingsJapgolly.naverWhale.naverWhaleStrings.image = "image".asInstanceOf[typingsJapgolly.naverWhale.naverWhaleStrings.image]
    
    inline def launcher: typingsJapgolly.naverWhale.naverWhaleStrings.launcher = "launcher".asInstanceOf[typingsJapgolly.naverWhale.naverWhaleStrings.launcher]
    
    inline def link: typingsJapgolly.naverWhale.naverWhaleStrings.link = "link".asInstanceOf[typingsJapgolly.naverWhale.naverWhaleStrings.link]
    
    inline def page: typingsJapgolly.naverWhale.naverWhaleStrings.page = "page".asInstanceOf[typingsJapgolly.naverWhale.naverWhaleStrings.page]
    
    inline def page_action: typingsJapgolly.naverWhale.naverWhaleStrings.page_action = "page_action".asInstanceOf[typingsJapgolly.naverWhale.naverWhaleStrings.page_action]
    
    inline def selection: typingsJapgolly.naverWhale.naverWhaleStrings.selection = "selection".asInstanceOf[typingsJapgolly.naverWhale.naverWhaleStrings.selection]
    
    inline def video: typingsJapgolly.naverWhale.naverWhaleStrings.video = "video".asInstanceOf[typingsJapgolly.naverWhale.naverWhaleStrings.video]
  }
  
  trait CreateProperties extends StObject {
    
    /** Optional. The initial state of a checkbox or radio item: true for selected and false for unselected. Only one radio item can be selected at a time in a given group of radio items.  */
    var checked: js.UndefOr[Boolean] = js.undefined
    
    /** Optional. List of contexts this menu item will appear in. Defaults to ['page'] if not specified.  */
    var contexts: js.UndefOr[
        typingsJapgolly.chrome.chrome.contextMenus.ContextType | js.Array[typingsJapgolly.chrome.chrome.contextMenus.ContextType]
      ] = js.undefined
    
    /** Optional. Lets you restrict the item to apply only to documents whose URL matches one of the given patterns. (This applies to frames as well.) For details on the format of a pattern, see Match Patterns.  */
    var documentUrlPatterns: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Optional.
      * Since Chrome 20.
      * Whether this context menu item is enabled or disabled. Defaults to true.
      */
    var enabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Optional.
      * Since Chrome 21.
      * The unique ID to assign to this item. Mandatory for event pages. Cannot be the same as another ID for this extension.
      */
    var id: js.UndefOr[String] = js.undefined
    
    /**
      * Optional.
      * A function that will be called back when the menu item is clicked. Event pages cannot use this; instead, they should register a listener for chrome.contextMenus.onClicked.
      * @param info Information sent when a context menu item is clicked.
      * @param tab The details of the tab where the click took place. Note: this parameter only present for extensions.
      */
    var onclick: js.UndefOr[
        js.Function2[
          /* info */ typingsJapgolly.chrome.chrome.contextMenus.OnClickData, 
          /* tab */ Tab, 
          Unit
        ]
      ] = js.undefined
    
    /** Optional. The ID of a parent menu item; this makes the item a child of a previously added item.  */
    var parentId: js.UndefOr[Double | String] = js.undefined
    
    /** Optional. Similar to documentUrlPatterns, but lets you filter based on the src attribute of img/audio/video tags and the href of anchor tags.  */
    var targetUrlPatterns: js.UndefOr[js.Array[String]] = js.undefined
    
    /** Optional. The text to be displayed in the item; this is required unless type is 'separator'. When the context is 'selection', you can use %s within the string to show the selected text. For example, if this parameter's value is "Translate '%s' to Pig Latin" and the user selects the word "cool", the context menu item for the selection is "Translate 'cool' to Pig Latin".  */
    var title: js.UndefOr[String] = js.undefined
    
    /** Optional. The type of menu item. Defaults to 'normal' if not specified.  */
    var `type`: js.UndefOr[typingsJapgolly.chrome.chrome.contextMenus.ContextItemType] = js.undefined
    
    /**
      * Optional.
      * Since Chrome 62.
      * Whether the item is visible in the menu.
      */
    var visible: js.UndefOr[Boolean] = js.undefined
  }
  object CreateProperties {
    
    inline def apply(): CreateProperties = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateProperties]
    }
    
    extension [Self <: CreateProperties](x: Self) {
      
      inline def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      inline def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
      
      inline def setContexts(
        value: typingsJapgolly.chrome.chrome.contextMenus.ContextType | js.Array[typingsJapgolly.chrome.chrome.contextMenus.ContextType]
      ): Self = StObject.set(x, "contexts", value.asInstanceOf[js.Any])
      
      inline def setContextsUndefined: Self = StObject.set(x, "contexts", js.undefined)
      
      inline def setContextsVarargs(value: typingsJapgolly.chrome.chrome.contextMenus.ContextType*): Self = StObject.set(x, "contexts", js.Array(value*))
      
      inline def setDocumentUrlPatterns(value: js.Array[String]): Self = StObject.set(x, "documentUrlPatterns", value.asInstanceOf[js.Any])
      
      inline def setDocumentUrlPatternsUndefined: Self = StObject.set(x, "documentUrlPatterns", js.undefined)
      
      inline def setDocumentUrlPatternsVarargs(value: String*): Self = StObject.set(x, "documentUrlPatterns", js.Array(value*))
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setOnclick(
        value: (/* info */ typingsJapgolly.chrome.chrome.contextMenus.OnClickData, /* tab */ Tab) => Callback
      ): Self = StObject.set(x, "onclick", js.Any.fromFunction2((t0: /* info */ typingsJapgolly.chrome.chrome.contextMenus.OnClickData, t1: /* tab */ Tab) => (value(t0, t1)).runNow()))
      
      inline def setOnclickUndefined: Self = StObject.set(x, "onclick", js.undefined)
      
      inline def setParentId(value: Double | String): Self = StObject.set(x, "parentId", value.asInstanceOf[js.Any])
      
      inline def setParentIdUndefined: Self = StObject.set(x, "parentId", js.undefined)
      
      inline def setTargetUrlPatterns(value: js.Array[String]): Self = StObject.set(x, "targetUrlPatterns", value.asInstanceOf[js.Any])
      
      inline def setTargetUrlPatternsUndefined: Self = StObject.set(x, "targetUrlPatterns", js.undefined)
      
      inline def setTargetUrlPatternsVarargs(value: String*): Self = StObject.set(x, "targetUrlPatterns", js.Array(value*))
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setType(value: typingsJapgolly.chrome.chrome.contextMenus.ContextItemType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  type MenuClickedEvent = Event[
    js.Function2[
      /* info */ typingsJapgolly.chrome.chrome.contextMenus.OnClickData, 
      /* tab */ js.UndefOr[Tab], 
      Unit
    ]
  ]
  
  trait OnClickData extends StObject {
    
    /**
      * Optional.
      * Since Chrome 35.
      * A flag indicating the state of a checkbox or radio item after it is clicked.
      */
    var checked: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Since Chrome 35.
      * A flag indicating whether the element is editable (text input, textarea, etc.).
      */
    var editable: Boolean
    
    /**
      * Optional.
      * Since Chrome 35.
      * The ID of the frame of the element where the context menu was
      * clicked, if it was in a frame.
      */
    var frameId: js.UndefOr[Double] = js.undefined
    
    /**
      * Optional.
      * Since Chrome 35.
      * The URL of the frame of the element where the context menu was clicked, if it was in a frame.
      */
    var frameUrl: js.UndefOr[String] = js.undefined
    
    /**
      * Optional.
      * Since Chrome 35.
      * If the element is a link, the URL it points to.
      */
    var linkUrl: js.UndefOr[String] = js.undefined
    
    /**
      * Optional.
      * Since Chrome 35.
      * One of 'image', 'video', or 'audio' if the context menu was activated on one of these types of elements.
      */
    var mediaType: js.UndefOr[image | video | audio] = js.undefined
    
    /**
      * Since Chrome 35.
      * The ID of the menu item that was clicked.
      */
    var menuItemId: Double | String
    
    /**
      * Since Chrome 35.
      * The URL of the page where the menu item was clicked. This property is not set if the click occurred in a context where there is no current page, such as in a launcher context menu.
      */
    var pageUrl: String
    
    /**
      * Optional.
      * Since Chrome 35.
      * The parent ID, if any, for the item clicked.
      */
    var parentMenuItemId: js.UndefOr[Double | String] = js.undefined
    
    /**
      * Optional.
      * Since Chrome 35.
      * The text for the context selection, if any.
      */
    var selectionText: js.UndefOr[String] = js.undefined
    
    /**
      * Optional.
      * Since Chrome 35.
      * Will be present for elements with a 'src' URL.
      */
    var srcUrl: js.UndefOr[String] = js.undefined
    
    /**
      * Optional.
      * Since Chrome 35.
      * A flag indicating the state of a checkbox or radio item before it was clicked.
      */
    var wasChecked: js.UndefOr[Boolean] = js.undefined
  }
  object OnClickData {
    
    inline def apply(editable: Boolean, menuItemId: Double | String, pageUrl: String): OnClickData = {
      val __obj = js.Dynamic.literal(editable = editable.asInstanceOf[js.Any], menuItemId = menuItemId.asInstanceOf[js.Any], pageUrl = pageUrl.asInstanceOf[js.Any])
      __obj.asInstanceOf[OnClickData]
    }
    
    extension [Self <: OnClickData](x: Self) {
      
      inline def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      inline def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
      
      inline def setEditable(value: Boolean): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
      
      inline def setFrameId(value: Double): Self = StObject.set(x, "frameId", value.asInstanceOf[js.Any])
      
      inline def setFrameIdUndefined: Self = StObject.set(x, "frameId", js.undefined)
      
      inline def setFrameUrl(value: String): Self = StObject.set(x, "frameUrl", value.asInstanceOf[js.Any])
      
      inline def setFrameUrlUndefined: Self = StObject.set(x, "frameUrl", js.undefined)
      
      inline def setLinkUrl(value: String): Self = StObject.set(x, "linkUrl", value.asInstanceOf[js.Any])
      
      inline def setLinkUrlUndefined: Self = StObject.set(x, "linkUrl", js.undefined)
      
      inline def setMediaType(value: image | video | audio): Self = StObject.set(x, "mediaType", value.asInstanceOf[js.Any])
      
      inline def setMediaTypeUndefined: Self = StObject.set(x, "mediaType", js.undefined)
      
      inline def setMenuItemId(value: Double | String): Self = StObject.set(x, "menuItemId", value.asInstanceOf[js.Any])
      
      inline def setPageUrl(value: String): Self = StObject.set(x, "pageUrl", value.asInstanceOf[js.Any])
      
      inline def setParentMenuItemId(value: Double | String): Self = StObject.set(x, "parentMenuItemId", value.asInstanceOf[js.Any])
      
      inline def setParentMenuItemIdUndefined: Self = StObject.set(x, "parentMenuItemId", js.undefined)
      
      inline def setSelectionText(value: String): Self = StObject.set(x, "selectionText", value.asInstanceOf[js.Any])
      
      inline def setSelectionTextUndefined: Self = StObject.set(x, "selectionText", js.undefined)
      
      inline def setSrcUrl(value: String): Self = StObject.set(x, "srcUrl", value.asInstanceOf[js.Any])
      
      inline def setSrcUrlUndefined: Self = StObject.set(x, "srcUrl", js.undefined)
      
      inline def setWasChecked(value: Boolean): Self = StObject.set(x, "wasChecked", value.asInstanceOf[js.Any])
      
      inline def setWasCheckedUndefined: Self = StObject.set(x, "wasChecked", js.undefined)
    }
  }
  
  trait UpdateProperties extends StObject {
    
    var checked: js.UndefOr[Boolean] = js.undefined
    
    var contexts: js.UndefOr[js.Array[typingsJapgolly.chrome.chrome.contextMenus.ContextType]] = js.undefined
    
    var documentUrlPatterns: js.UndefOr[js.Array[String]] = js.undefined
    
    /** Optional. Since Chrome 20.  */
    var enabled: js.UndefOr[Boolean] = js.undefined
    
    var onclick: js.UndefOr[js.Function] = js.undefined
    
    /** Optional. Note: You cannot change an item to be a child of one of its own descendants.  */
    var parentId: js.UndefOr[Double | String] = js.undefined
    
    var targetUrlPatterns: js.UndefOr[js.Array[String]] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
    
    var `type`: js.UndefOr[typingsJapgolly.chrome.chrome.contextMenus.ContextItemType] = js.undefined
    
    /**
      * Optional.
      * @since Chrome 62.
      * Whether the item is visible in the menu.
      */
    var visible: js.UndefOr[Boolean] = js.undefined
  }
  object UpdateProperties {
    
    inline def apply(): UpdateProperties = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateProperties]
    }
    
    extension [Self <: UpdateProperties](x: Self) {
      
      inline def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      inline def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
      
      inline def setContexts(value: js.Array[typingsJapgolly.chrome.chrome.contextMenus.ContextType]): Self = StObject.set(x, "contexts", value.asInstanceOf[js.Any])
      
      inline def setContextsUndefined: Self = StObject.set(x, "contexts", js.undefined)
      
      inline def setContextsVarargs(value: typingsJapgolly.chrome.chrome.contextMenus.ContextType*): Self = StObject.set(x, "contexts", js.Array(value*))
      
      inline def setDocumentUrlPatterns(value: js.Array[String]): Self = StObject.set(x, "documentUrlPatterns", value.asInstanceOf[js.Any])
      
      inline def setDocumentUrlPatternsUndefined: Self = StObject.set(x, "documentUrlPatterns", js.undefined)
      
      inline def setDocumentUrlPatternsVarargs(value: String*): Self = StObject.set(x, "documentUrlPatterns", js.Array(value*))
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setOnclick(value: js.Function): Self = StObject.set(x, "onclick", value.asInstanceOf[js.Any])
      
      inline def setOnclickUndefined: Self = StObject.set(x, "onclick", js.undefined)
      
      inline def setParentId(value: Double | String): Self = StObject.set(x, "parentId", value.asInstanceOf[js.Any])
      
      inline def setParentIdUndefined: Self = StObject.set(x, "parentId", js.undefined)
      
      inline def setTargetUrlPatterns(value: js.Array[String]): Self = StObject.set(x, "targetUrlPatterns", value.asInstanceOf[js.Any])
      
      inline def setTargetUrlPatternsUndefined: Self = StObject.set(x, "targetUrlPatterns", js.undefined)
      
      inline def setTargetUrlPatternsVarargs(value: String*): Self = StObject.set(x, "targetUrlPatterns", js.Array(value*))
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setType(value: typingsJapgolly.chrome.chrome.contextMenus.ContextItemType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
}
