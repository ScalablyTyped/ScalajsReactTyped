package typingsJapgolly.chromeApps.chrome

import japgolly.scalajs.react.Callback
import typingsJapgolly.chromeApps.anon.ALL
import typingsJapgolly.chromeApps.anon.CHECKBOX
import typingsJapgolly.chromeApps.chrome.events.Event
import typingsJapgolly.chromeApps.chromeAppsStrings.AUDIO
import typingsJapgolly.chromeApps.chromeAppsStrings.BROWSER_ACTION
import typingsJapgolly.chromeApps.chromeAppsStrings.EDITABLE
import typingsJapgolly.chromeApps.chromeAppsStrings.FRAME
import typingsJapgolly.chromeApps.chromeAppsStrings.IMAGE
import typingsJapgolly.chromeApps.chromeAppsStrings.LAUNCHER
import typingsJapgolly.chromeApps.chromeAppsStrings.LINK
import typingsJapgolly.chromeApps.chromeAppsStrings.NORMAL
import typingsJapgolly.chromeApps.chromeAppsStrings.PAGE
import typingsJapgolly.chromeApps.chromeAppsStrings.PAGE_ACTION
import typingsJapgolly.chromeApps.chromeAppsStrings.RADIO
import typingsJapgolly.chromeApps.chromeAppsStrings.SELECTION
import typingsJapgolly.chromeApps.chromeAppsStrings.SEPARATOR
import typingsJapgolly.chromeApps.chromeAppsStrings.VIDEO
import typingsJapgolly.chromeApps.chromeAppsStrings.audio_
import typingsJapgolly.chromeApps.chromeAppsStrings.image_
import typingsJapgolly.chromeApps.chromeAppsStrings.video_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// #endregion
// #region chrome.contextMenus
///////////////////
// Context Menus //
///////////////////
/**
  * @since Chrome 24.
  * @requires Permissions: 'contextMenus'
  * @description
  * Use the chrome.contextMenus API to add items to Google Chrome's context menu.
  * You can choose what types of objects your context menu additions apply to,
  * such as images, hyperlinks, and pages.
  *
  * Context menu items can appear in any document (or frame within a document),
  * even those with file:// or chrome:// URLs. To control which documents your
  * items can appear in, specify the documentUrlPatterns field when you call the
  * create() or update() method.
  *
  * You can create as many context menu items as you need,
  * but if more than one from your app is visible at once,
  * Google Chrome automatically collapses them into a single parent menu.
  */
object contextMenus {
  
  trait CreateProperties extends StObject {
    
    /**
      * The initial state of a checkbox or radio item:
      * true for selected and false for unselected.
      * Only one radio item can be selected at a time
      * in a given group of radio items.
      **/
    var checked: js.UndefOr[Boolean] = js.undefined
    
    /**
      * List of contexts this menu item will appear in.
      * @default ['page'] - Defaults to ['page'] if not specified.
      * @see ContextType
      **/
    var contexts: js.UndefOr[
        js.Array[
          ToStringLiteral[
            ALL, 
            /* keyof chrome-apps.anon.ALL */ typingsJapgolly.chromeApps.chromeAppsStrings.ALL | PAGE | FRAME | SELECTION | LINK | EDITABLE | IMAGE | VIDEO | AUDIO | LAUNCHER | BROWSER_ACTION | PAGE_ACTION, 
            /* import warning: importer.ImportType#apply Failed type conversion: keyof {  ALL :'all',   PAGE :'page',   FRAME :'frame',   SELECTION :'selection',   LINK :'link',   EDITABLE :'editable',   IMAGE :'image',   VIDEO :'video',   AUDIO :'audio',   LAUNCHER :'launcher',   BROWSER_ACTION :'browser_action',   PAGE_ACTION :'page_action'} extends keyof {  ALL :'all',   PAGE :'page',   FRAME :'frame',   SELECTION :'selection',   LINK :'link',   EDITABLE :'editable',   IMAGE :'image',   VIDEO :'video',   AUDIO :'audio',   LAUNCHER :'launcher',   BROWSER_ACTION :'browser_action',   PAGE_ACTION :'page_action'} ? std.Exclude<keyof {  ALL :'all',   PAGE :'page',   FRAME :'frame',   SELECTION :'selection',   LINK :'link',   EDITABLE :'editable',   IMAGE :'image',   VIDEO :'video',   AUDIO :'audio',   LAUNCHER :'launcher',   BROWSER_ACTION :'browser_action',   PAGE_ACTION :'page_action'}, 'browser_action' | 'selection' | 'video' | 'launcher' | 'image' | 'editable' | 'page_action' | 'page' | 'audio' | 'frame' | 'all' | 'link'> : never */ js.Any
          ]
        ]
      ] = js.undefined
    
    /**
      * Lets you restrict the item to apply only to documents whose URL
      * matches one of the given patterns. (This applies to frames as well.)
      * For details on the format of a pattern, see Match Patterns.
      **/
    var documentUrlPatterns: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Whether this context menu item is enabled or disabled.
      * @default true
      */
    var enabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The unique ID to assign to this item.
      * Mandatory for event pages.
      * Cannot be the same as another ID for this app.
      */
    var id: js.UndefOr[String] = js.undefined
    
    /**
      * A function that will be called back when the menu item is clicked. Event pages cannot use this; instead, they should register a listener for chrome.contextMenus.onClicked.
      * @param info Information sent when a context menu item is clicked.
      */
    var onclick: js.UndefOr[js.Function1[/* info */ OnClickData, Unit]] = js.undefined
    
    /** The ID of a parent menu item; this makes the item a child of a previously added item.  */
    var parentId: js.UndefOr[integer | String] = js.undefined
    
    /**
      * Similar to documentUrlPatterns,
      * but lets you filter based on the src attribute
      * of img/audio/video tags and the href of anchor tags.
      **/
    var targetUrlPatterns: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * The text to be displayed in the item;
      * this is required unless type is 'separator'.
      * When the context is 'selection', you can use
      * %s within the string to show the selected text.
      * For example, if this parameter's value is
      * 'Translate '%s' to Pig Latin' and the user
      * selects the word 'cool', the context menu
      * item for the selection is 'Translate 'cool'
      * to Pig Latin'.
      **/
    var title: js.UndefOr[String] = js.undefined
    
    /**
      * The type of menu item.
      * @default 'normal' - Defaults to 'normal' if not specified.
      * @see ItemType
      */
    var `type`: js.UndefOr[
        ToStringLiteral[
          CHECKBOX, 
          /* keyof chrome-apps.anon.CHECKBOX */ NORMAL | typingsJapgolly.chromeApps.chromeAppsStrings.CHECKBOX | RADIO | SEPARATOR, 
          /* import warning: importer.ImportType#apply Failed type conversion: keyof {  NORMAL :'normal',   CHECKBOX :'checkbox',   RADIO :'radio',   SEPARATOR :'separator'} extends keyof {  NORMAL :'normal',   CHECKBOX :'checkbox',   RADIO :'radio',   SEPARATOR :'separator'} ? std.Exclude<keyof {  NORMAL :'normal',   CHECKBOX :'checkbox',   RADIO :'radio',   SEPARATOR :'separator'}, 'normal' | 'checkbox' | 'radio' | 'separator'> : never */ js.Any
        ]
      ] = js.undefined
    
    /**
      * Whether the item is visible in the menu.
      * @since Chrome 62.
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
        value: js.Array[
              ToStringLiteral[
                ALL, 
                /* keyof chrome-apps.anon.ALL */ typingsJapgolly.chromeApps.chromeAppsStrings.ALL | PAGE | FRAME | SELECTION | LINK | EDITABLE | IMAGE | VIDEO | AUDIO | LAUNCHER | BROWSER_ACTION | PAGE_ACTION, 
                /* import warning: importer.ImportType#apply Failed type conversion: keyof {  ALL :'all',   PAGE :'page',   FRAME :'frame',   SELECTION :'selection',   LINK :'link',   EDITABLE :'editable',   IMAGE :'image',   VIDEO :'video',   AUDIO :'audio',   LAUNCHER :'launcher',   BROWSER_ACTION :'browser_action',   PAGE_ACTION :'page_action'} extends keyof {  ALL :'all',   PAGE :'page',   FRAME :'frame',   SELECTION :'selection',   LINK :'link',   EDITABLE :'editable',   IMAGE :'image',   VIDEO :'video',   AUDIO :'audio',   LAUNCHER :'launcher',   BROWSER_ACTION :'browser_action',   PAGE_ACTION :'page_action'} ? std.Exclude<keyof {  ALL :'all',   PAGE :'page',   FRAME :'frame',   SELECTION :'selection',   LINK :'link',   EDITABLE :'editable',   IMAGE :'image',   VIDEO :'video',   AUDIO :'audio',   LAUNCHER :'launcher',   BROWSER_ACTION :'browser_action',   PAGE_ACTION :'page_action'}, 'browser_action' | 'selection' | 'video' | 'launcher' | 'image' | 'editable' | 'page_action' | 'page' | 'audio' | 'frame' | 'all' | 'link'> : never */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "contexts", value.asInstanceOf[js.Any])
      
      inline def setContextsUndefined: Self = StObject.set(x, "contexts", js.undefined)
      
      inline def setContextsVarargs(
        value: (ToStringLiteral[
              ALL, 
              /* keyof chrome-apps.anon.ALL */ typingsJapgolly.chromeApps.chromeAppsStrings.ALL | PAGE | FRAME | SELECTION | LINK | EDITABLE | IMAGE | VIDEO | AUDIO | LAUNCHER | BROWSER_ACTION | PAGE_ACTION, 
              /* import warning: importer.ImportType#apply Failed type conversion: keyof {  ALL :'all',   PAGE :'page',   FRAME :'frame',   SELECTION :'selection',   LINK :'link',   EDITABLE :'editable',   IMAGE :'image',   VIDEO :'video',   AUDIO :'audio',   LAUNCHER :'launcher',   BROWSER_ACTION :'browser_action',   PAGE_ACTION :'page_action'} extends keyof {  ALL :'all',   PAGE :'page',   FRAME :'frame',   SELECTION :'selection',   LINK :'link',   EDITABLE :'editable',   IMAGE :'image',   VIDEO :'video',   AUDIO :'audio',   LAUNCHER :'launcher',   BROWSER_ACTION :'browser_action',   PAGE_ACTION :'page_action'} ? std.Exclude<keyof {  ALL :'all',   PAGE :'page',   FRAME :'frame',   SELECTION :'selection',   LINK :'link',   EDITABLE :'editable',   IMAGE :'image',   VIDEO :'video',   AUDIO :'audio',   LAUNCHER :'launcher',   BROWSER_ACTION :'browser_action',   PAGE_ACTION :'page_action'}, 'browser_action' | 'selection' | 'video' | 'launcher' | 'image' | 'editable' | 'page_action' | 'page' | 'audio' | 'frame' | 'all' | 'link'> : never */ js.Any
            ])*
      ): Self = StObject.set(x, "contexts", js.Array(value*))
      
      inline def setDocumentUrlPatterns(value: js.Array[String]): Self = StObject.set(x, "documentUrlPatterns", value.asInstanceOf[js.Any])
      
      inline def setDocumentUrlPatternsUndefined: Self = StObject.set(x, "documentUrlPatterns", js.undefined)
      
      inline def setDocumentUrlPatternsVarargs(value: String*): Self = StObject.set(x, "documentUrlPatterns", js.Array(value*))
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setOnclick(value: /* info */ OnClickData => Callback): Self = StObject.set(x, "onclick", js.Any.fromFunction1((t0: /* info */ OnClickData) => value(t0).runNow()))
      
      inline def setOnclickUndefined: Self = StObject.set(x, "onclick", js.undefined)
      
      inline def setParentId(value: integer | String): Self = StObject.set(x, "parentId", value.asInstanceOf[js.Any])
      
      inline def setParentIdUndefined: Self = StObject.set(x, "parentId", js.undefined)
      
      inline def setTargetUrlPatterns(value: js.Array[String]): Self = StObject.set(x, "targetUrlPatterns", value.asInstanceOf[js.Any])
      
      inline def setTargetUrlPatternsUndefined: Self = StObject.set(x, "targetUrlPatterns", js.undefined)
      
      inline def setTargetUrlPatternsVarargs(value: String*): Self = StObject.set(x, "targetUrlPatterns", js.Array(value*))
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setType(
        value: ToStringLiteral[
              CHECKBOX, 
              /* keyof chrome-apps.anon.CHECKBOX */ NORMAL | typingsJapgolly.chromeApps.chromeAppsStrings.CHECKBOX | RADIO | SEPARATOR, 
              /* import warning: importer.ImportType#apply Failed type conversion: keyof {  NORMAL :'normal',   CHECKBOX :'checkbox',   RADIO :'radio',   SEPARATOR :'separator'} extends keyof {  NORMAL :'normal',   CHECKBOX :'checkbox',   RADIO :'radio',   SEPARATOR :'separator'} ? std.Exclude<keyof {  NORMAL :'normal',   CHECKBOX :'checkbox',   RADIO :'radio',   SEPARATOR :'separator'}, 'normal' | 'checkbox' | 'radio' | 'separator'> : never */ js.Any
            ]
      ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.chromeApps.chromeAppsStrings.image_
    - typingsJapgolly.chromeApps.chromeAppsStrings.video_
    - typingsJapgolly.chromeApps.chromeAppsStrings.audio_
  */
  trait MediaType extends StObject
  object MediaType {
    
    inline def audio: audio_ = "audio".asInstanceOf[audio_]
    
    inline def image: image_ = "image".asInstanceOf[image_]
    
    inline def video: video_ = "video".asInstanceOf[video_]
  }
  
  type MenuClickedEvent = Event[js.Function1[/* info */ OnClickData, Unit]]
  
  trait OnClickData extends StObject {
    
    /**
      * A flag indicating the state of a checkbox or radio item after it is clicked.
      * @since Chrome 35.
      */
    var checked: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A flag indicating whether the element is editable (text input, textarea, etc.).
      * @since Chrome 35.
      */
    var editable: Boolean
    
    /**
      * The ID of the frame of the element where the context menu was clicked,
      * if it was in a frame.
      * @since Chrome 35.
      */
    var frameId: js.UndefOr[integer] = js.undefined
    
    /**
      * The URL of the frame of the element where the context menu was clicked,
      * if it was in a frame.
      * @since Chrome 35.
      */
    var frameUrl: js.UndefOr[String] = js.undefined
    
    /**
      * If the element is a link, the URL it points to.
      * @since Chrome 35.
      */
    var linkUrl: js.UndefOr[String] = js.undefined
    
    /**
      * One of 'image', 'video', or 'audio' if the context menu was
      * activated on one of these types of elements.
      * @since Chrome 35.
      */
    var mediaType: js.UndefOr[MediaType] = js.undefined
    
    /**
      * The ID of the menu item that was clicked.
      * @since Chrome 35.
      */
    var menuItemId: integer | String
    
    /**
      * The URL of the page where the menu item was clicked.
      * This property is not set if the click occured in a
      * context where there is no current page, such as in
      * a launcher context menu.
      * @since Chrome 35.
      */
    var pageUrl: String
    
    /**
      * The parent ID, if any, for the item clicked.
      * @since Chrome 35.
      */
    var parentMenuItemId: js.UndefOr[integer | String] = js.undefined
    
    /**
      * The text for the context selection, if any.
      * @since Chrome 35.
      */
    var selectionText: js.UndefOr[String] = js.undefined
    
    /**
      * Will be present for elements with a 'src' URL.
      * @since Chrome 35.
      */
    var srcUrl: js.UndefOr[String] = js.undefined
    
    /**
      * A flag indicating the state of a checkbox or radio item before it was clicked.
      * @since Chrome 35.
      */
    var wasChecked: js.UndefOr[Boolean] = js.undefined
  }
  object OnClickData {
    
    inline def apply(editable: Boolean, menuItemId: integer | String, pageUrl: String): OnClickData = {
      val __obj = js.Dynamic.literal(editable = editable.asInstanceOf[js.Any], menuItemId = menuItemId.asInstanceOf[js.Any], pageUrl = pageUrl.asInstanceOf[js.Any])
      __obj.asInstanceOf[OnClickData]
    }
    
    extension [Self <: OnClickData](x: Self) {
      
      inline def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      inline def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
      
      inline def setEditable(value: Boolean): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
      
      inline def setFrameId(value: integer): Self = StObject.set(x, "frameId", value.asInstanceOf[js.Any])
      
      inline def setFrameIdUndefined: Self = StObject.set(x, "frameId", js.undefined)
      
      inline def setFrameUrl(value: String): Self = StObject.set(x, "frameUrl", value.asInstanceOf[js.Any])
      
      inline def setFrameUrlUndefined: Self = StObject.set(x, "frameUrl", js.undefined)
      
      inline def setLinkUrl(value: String): Self = StObject.set(x, "linkUrl", value.asInstanceOf[js.Any])
      
      inline def setLinkUrlUndefined: Self = StObject.set(x, "linkUrl", js.undefined)
      
      inline def setMediaType(value: MediaType): Self = StObject.set(x, "mediaType", value.asInstanceOf[js.Any])
      
      inline def setMediaTypeUndefined: Self = StObject.set(x, "mediaType", js.undefined)
      
      inline def setMenuItemId(value: integer | String): Self = StObject.set(x, "menuItemId", value.asInstanceOf[js.Any])
      
      inline def setPageUrl(value: String): Self = StObject.set(x, "pageUrl", value.asInstanceOf[js.Any])
      
      inline def setParentMenuItemId(value: integer | String): Self = StObject.set(x, "parentMenuItemId", value.asInstanceOf[js.Any])
      
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
    
    /** @see ContextType */
    var contexts: js.UndefOr[
        js.Array[
          ToStringLiteral[
            ALL, 
            /* keyof chrome-apps.anon.ALL */ typingsJapgolly.chromeApps.chromeAppsStrings.ALL | PAGE | FRAME | SELECTION | LINK | EDITABLE | IMAGE | VIDEO | AUDIO | LAUNCHER | BROWSER_ACTION | PAGE_ACTION, 
            /* import warning: importer.ImportType#apply Failed type conversion: keyof {  ALL :'all',   PAGE :'page',   FRAME :'frame',   SELECTION :'selection',   LINK :'link',   EDITABLE :'editable',   IMAGE :'image',   VIDEO :'video',   AUDIO :'audio',   LAUNCHER :'launcher',   BROWSER_ACTION :'browser_action',   PAGE_ACTION :'page_action'} extends keyof {  ALL :'all',   PAGE :'page',   FRAME :'frame',   SELECTION :'selection',   LINK :'link',   EDITABLE :'editable',   IMAGE :'image',   VIDEO :'video',   AUDIO :'audio',   LAUNCHER :'launcher',   BROWSER_ACTION :'browser_action',   PAGE_ACTION :'page_action'} ? std.Exclude<keyof {  ALL :'all',   PAGE :'page',   FRAME :'frame',   SELECTION :'selection',   LINK :'link',   EDITABLE :'editable',   IMAGE :'image',   VIDEO :'video',   AUDIO :'audio',   LAUNCHER :'launcher',   BROWSER_ACTION :'browser_action',   PAGE_ACTION :'page_action'}, 'browser_action' | 'selection' | 'video' | 'launcher' | 'image' | 'editable' | 'page_action' | 'page' | 'audio' | 'frame' | 'all' | 'link'> : never */ js.Any
          ]
        ]
      ] = js.undefined
    
    var documentUrlPatterns: js.UndefOr[js.Array[String]] = js.undefined
    
    var enabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Information sent when a context menu item is clicked.
      * @since Chrome 44
      */
    var onclick: js.UndefOr[js.Function1[/* info */ OnClickData, Unit]] = js.undefined
    
    /** Note: You cannot change an item to be a child of one of its own descendants.  */
    var parentId: js.UndefOr[integer | String] = js.undefined
    
    var targetUrlPatterns: js.UndefOr[js.Array[String]] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
    
    /** @see ItemType */
    var `type`: js.UndefOr[
        ToStringLiteral[
          CHECKBOX, 
          /* keyof chrome-apps.anon.CHECKBOX */ NORMAL | typingsJapgolly.chromeApps.chromeAppsStrings.CHECKBOX | RADIO | SEPARATOR, 
          /* import warning: importer.ImportType#apply Failed type conversion: keyof {  NORMAL :'normal',   CHECKBOX :'checkbox',   RADIO :'radio',   SEPARATOR :'separator'} extends keyof {  NORMAL :'normal',   CHECKBOX :'checkbox',   RADIO :'radio',   SEPARATOR :'separator'} ? std.Exclude<keyof {  NORMAL :'normal',   CHECKBOX :'checkbox',   RADIO :'radio',   SEPARATOR :'separator'}, 'normal' | 'checkbox' | 'radio' | 'separator'> : never */ js.Any
        ]
      ] = js.undefined
    
    /**
      * Whether the item is visible in the menu.
      * @since Chrome 62.
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
      
      inline def setContexts(
        value: js.Array[
              ToStringLiteral[
                ALL, 
                /* keyof chrome-apps.anon.ALL */ typingsJapgolly.chromeApps.chromeAppsStrings.ALL | PAGE | FRAME | SELECTION | LINK | EDITABLE | IMAGE | VIDEO | AUDIO | LAUNCHER | BROWSER_ACTION | PAGE_ACTION, 
                /* import warning: importer.ImportType#apply Failed type conversion: keyof {  ALL :'all',   PAGE :'page',   FRAME :'frame',   SELECTION :'selection',   LINK :'link',   EDITABLE :'editable',   IMAGE :'image',   VIDEO :'video',   AUDIO :'audio',   LAUNCHER :'launcher',   BROWSER_ACTION :'browser_action',   PAGE_ACTION :'page_action'} extends keyof {  ALL :'all',   PAGE :'page',   FRAME :'frame',   SELECTION :'selection',   LINK :'link',   EDITABLE :'editable',   IMAGE :'image',   VIDEO :'video',   AUDIO :'audio',   LAUNCHER :'launcher',   BROWSER_ACTION :'browser_action',   PAGE_ACTION :'page_action'} ? std.Exclude<keyof {  ALL :'all',   PAGE :'page',   FRAME :'frame',   SELECTION :'selection',   LINK :'link',   EDITABLE :'editable',   IMAGE :'image',   VIDEO :'video',   AUDIO :'audio',   LAUNCHER :'launcher',   BROWSER_ACTION :'browser_action',   PAGE_ACTION :'page_action'}, 'browser_action' | 'selection' | 'video' | 'launcher' | 'image' | 'editable' | 'page_action' | 'page' | 'audio' | 'frame' | 'all' | 'link'> : never */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "contexts", value.asInstanceOf[js.Any])
      
      inline def setContextsUndefined: Self = StObject.set(x, "contexts", js.undefined)
      
      inline def setContextsVarargs(
        value: (ToStringLiteral[
              ALL, 
              /* keyof chrome-apps.anon.ALL */ typingsJapgolly.chromeApps.chromeAppsStrings.ALL | PAGE | FRAME | SELECTION | LINK | EDITABLE | IMAGE | VIDEO | AUDIO | LAUNCHER | BROWSER_ACTION | PAGE_ACTION, 
              /* import warning: importer.ImportType#apply Failed type conversion: keyof {  ALL :'all',   PAGE :'page',   FRAME :'frame',   SELECTION :'selection',   LINK :'link',   EDITABLE :'editable',   IMAGE :'image',   VIDEO :'video',   AUDIO :'audio',   LAUNCHER :'launcher',   BROWSER_ACTION :'browser_action',   PAGE_ACTION :'page_action'} extends keyof {  ALL :'all',   PAGE :'page',   FRAME :'frame',   SELECTION :'selection',   LINK :'link',   EDITABLE :'editable',   IMAGE :'image',   VIDEO :'video',   AUDIO :'audio',   LAUNCHER :'launcher',   BROWSER_ACTION :'browser_action',   PAGE_ACTION :'page_action'} ? std.Exclude<keyof {  ALL :'all',   PAGE :'page',   FRAME :'frame',   SELECTION :'selection',   LINK :'link',   EDITABLE :'editable',   IMAGE :'image',   VIDEO :'video',   AUDIO :'audio',   LAUNCHER :'launcher',   BROWSER_ACTION :'browser_action',   PAGE_ACTION :'page_action'}, 'browser_action' | 'selection' | 'video' | 'launcher' | 'image' | 'editable' | 'page_action' | 'page' | 'audio' | 'frame' | 'all' | 'link'> : never */ js.Any
            ])*
      ): Self = StObject.set(x, "contexts", js.Array(value*))
      
      inline def setDocumentUrlPatterns(value: js.Array[String]): Self = StObject.set(x, "documentUrlPatterns", value.asInstanceOf[js.Any])
      
      inline def setDocumentUrlPatternsUndefined: Self = StObject.set(x, "documentUrlPatterns", js.undefined)
      
      inline def setDocumentUrlPatternsVarargs(value: String*): Self = StObject.set(x, "documentUrlPatterns", js.Array(value*))
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setOnclick(value: /* info */ OnClickData => Callback): Self = StObject.set(x, "onclick", js.Any.fromFunction1((t0: /* info */ OnClickData) => value(t0).runNow()))
      
      inline def setOnclickUndefined: Self = StObject.set(x, "onclick", js.undefined)
      
      inline def setParentId(value: integer | String): Self = StObject.set(x, "parentId", value.asInstanceOf[js.Any])
      
      inline def setParentIdUndefined: Self = StObject.set(x, "parentId", js.undefined)
      
      inline def setTargetUrlPatterns(value: js.Array[String]): Self = StObject.set(x, "targetUrlPatterns", value.asInstanceOf[js.Any])
      
      inline def setTargetUrlPatternsUndefined: Self = StObject.set(x, "targetUrlPatterns", js.undefined)
      
      inline def setTargetUrlPatternsVarargs(value: String*): Self = StObject.set(x, "targetUrlPatterns", js.Array(value*))
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setType(
        value: ToStringLiteral[
              CHECKBOX, 
              /* keyof chrome-apps.anon.CHECKBOX */ NORMAL | typingsJapgolly.chromeApps.chromeAppsStrings.CHECKBOX | RADIO | SEPARATOR, 
              /* import warning: importer.ImportType#apply Failed type conversion: keyof {  NORMAL :'normal',   CHECKBOX :'checkbox',   RADIO :'radio',   SEPARATOR :'separator'} extends keyof {  NORMAL :'normal',   CHECKBOX :'checkbox',   RADIO :'radio',   SEPARATOR :'separator'} ? std.Exclude<keyof {  NORMAL :'normal',   CHECKBOX :'checkbox',   RADIO :'radio',   SEPARATOR :'separator'}, 'normal' | 'checkbox' | 'radio' | 'separator'> : never */ js.Any
            ]
      ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
}
