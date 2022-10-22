package typingsJapgolly.firefoxWebextBrowser.browser

import japgolly.scalajs.react.Callback
import typingsJapgolly.firefoxWebextBrowser.browser.extensionTypes.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Monitor extension activity
  *
  * Permissions: `activityLog`
  *
  * Not allowed in: Content scripts, Devtools pages
  */
object activityLog {
  
  trait ActivityLogOnExtensionActivityEvent[TCallback] extends StObject {
    
    def addListener(cb: TCallback, id: String): Unit
    
    def hasListener(cb: TCallback): Boolean
    
    def removeListener(cb: TCallback): Unit
  }
  object ActivityLogOnExtensionActivityEvent {
    
    inline def apply[TCallback](
      addListener: (TCallback, String) => Callback,
      hasListener: TCallback => Boolean,
      removeListener: TCallback => Callback
    ): ActivityLogOnExtensionActivityEvent[TCallback] = {
      val __obj = js.Dynamic.literal(addListener = js.Any.fromFunction2((t0: TCallback, t1: String) => (addListener(t0, t1)).runNow()), hasListener = js.Any.fromFunction1(hasListener), removeListener = js.Any.fromFunction1((t0: TCallback) => removeListener(t0).runNow()))
      __obj.asInstanceOf[ActivityLogOnExtensionActivityEvent[TCallback]]
    }
    
    extension [Self <: ActivityLogOnExtensionActivityEvent[?], TCallback](x: Self & ActivityLogOnExtensionActivityEvent[TCallback]) {
      
      inline def setAddListener(value: (TCallback, String) => Callback): Self = StObject.set(x, "addListener", js.Any.fromFunction2((t0: TCallback, t1: String) => (value(t0, t1)).runNow()))
      
      inline def setHasListener(value: TCallback => Boolean): Self = StObject.set(x, "hasListener", js.Any.fromFunction1(value))
      
      inline def setRemoveListener(value: TCallback => Callback): Self = StObject.set(x, "removeListener", js.Any.fromFunction1((t0: TCallback) => value(t0).runNow()))
    }
  }
  
  trait OnExtensionActivityDetails extends StObject {
    
    var data: OnExtensionActivityDetailsData
    
    /** The name of the api call or event, or the script url if this is a content or user script event. */
    var name: String
    
    /** The date string when this call is triggered. */
    var timeStamp: Date
    
    /**
      * The type of log entry. api_call is a function call made by the extension and api_event is an event callback to the extension. content_script is logged when a content script is injected.
      */
    var `type`: OnExtensionActivityDetailsType
    
    /** The type of view where the activity occurred. Content scripts will not have a viewType. */
    var viewType: js.UndefOr[OnExtensionActivityDetailsViewType] = js.undefined
  }
  object OnExtensionActivityDetails {
    
    inline def apply(
      data: OnExtensionActivityDetailsData,
      name: String,
      timeStamp: Date,
      `type`: OnExtensionActivityDetailsType
    ): OnExtensionActivityDetails = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[OnExtensionActivityDetails]
    }
    
    extension [Self <: OnExtensionActivityDetails](x: Self) {
      
      inline def setData(value: OnExtensionActivityDetailsData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setTimeStamp(value: Date): Self = StObject.set(x, "timeStamp", value.asInstanceOf[js.Any])
      
      inline def setType(value: OnExtensionActivityDetailsType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setViewType(value: OnExtensionActivityDetailsViewType): Self = StObject.set(x, "viewType", value.asInstanceOf[js.Any])
      
      inline def setViewTypeUndefined: Self = StObject.set(x, "viewType", js.undefined)
    }
  }
  
  trait OnExtensionActivityDetailsData extends StObject {
    
    /** A list of arguments passed to the call. */
    var args: js.UndefOr[js.Array[Any]] = js.undefined
    
    /** The result of the call. */
    var result: js.UndefOr[js.Object] = js.undefined
    
    /** The tab associated with this event if it is a tab or content script. */
    var tabId: js.UndefOr[Double] = js.undefined
    
    /** If the type is content_script, this is the url of the script that was injected. */
    var url: js.UndefOr[String] = js.undefined
  }
  object OnExtensionActivityDetailsData {
    
    inline def apply(): OnExtensionActivityDetailsData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OnExtensionActivityDetailsData]
    }
    
    extension [Self <: OnExtensionActivityDetailsData](x: Self) {
      
      inline def setArgs(value: js.Array[Any]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
      
      inline def setArgsVarargs(value: Any*): Self = StObject.set(x, "args", js.Array(value*))
      
      inline def setResult(value: js.Object): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
      
      inline def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
      
      inline def setTabId(value: Double): Self = StObject.set(x, "tabId", value.asInstanceOf[js.Any])
      
      inline def setTabIdUndefined: Self = StObject.set(x, "tabId", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  /**
    * The type of log entry. api_call is a function call made by the extension and api_event is an event callback to the extension. content_script is logged when a content script is injected.
    */
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.api_call
    - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.api_event
    - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.content_script
    - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.user_script
  */
  trait OnExtensionActivityDetailsType extends StObject
  object OnExtensionActivityDetailsType {
    
    inline def api_call: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.api_call = "api_call".asInstanceOf[typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.api_call]
    
    inline def api_event: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.api_event = "api_event".asInstanceOf[typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.api_event]
    
    inline def content_script: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.content_script = "content_script".asInstanceOf[typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.content_script]
    
    inline def user_script: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.user_script = "user_script".asInstanceOf[typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.user_script]
  }
  
  /** The type of view where the activity occurred. Content scripts will not have a viewType. */
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.background
    - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.popup
    - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.sidebar
    - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.tab
    - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.devtools_page
    - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.devtools_panel
  */
  trait OnExtensionActivityDetailsViewType extends StObject
  object OnExtensionActivityDetailsViewType {
    
    inline def background: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.background = "background".asInstanceOf[typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.background]
    
    inline def devtools_page: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.devtools_page = "devtools_page".asInstanceOf[typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.devtools_page]
    
    inline def devtools_panel: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.devtools_panel = "devtools_panel".asInstanceOf[typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.devtools_panel]
    
    inline def popup: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.popup = "popup".asInstanceOf[typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.popup]
    
    inline def sidebar: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.sidebar = "sidebar".asInstanceOf[typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.sidebar]
    
    inline def tab: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.tab = "tab".asInstanceOf[typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.tab]
  }
}
