package typingsJapgolly.webextensionPolyfill

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.webextensionPolyfill.namespacesEventsMod.Events.Event
import typingsJapgolly.webextensionPolyfill.namespacesExtensionTypesMod.ExtensionTypes.DateType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object namespacesActivityLogMod {
  
  object ActivityLog {
    
    trait OnExtensionActivityDetailsType extends StObject {
      
      var data: OnExtensionActivityDetailsTypeDataType
      
      /**
        * The name of the api call or event, or the script url if this is a content or user script event.
        */
      var name: String
      
      /**
        * The date string when this call is triggered.
        */
      var timeStamp: DateType
      
      /**
        * The type of log entry.  api_call is a function call made by the extension and api_event is an event callback to the
        * extension.  content_script is logged when a content script is injected.
        */
      var `type`: OnExtensionActivityDetailsTypeTypeEnum
      
      /**
        * The type of view where the activity occurred.  Content scripts will not have a viewType.
        * Optional.
        */
      var viewType: js.UndefOr[OnExtensionActivityDetailsTypeViewTypeEnum] = js.undefined
    }
    object OnExtensionActivityDetailsType {
      
      inline def apply(
        data: OnExtensionActivityDetailsTypeDataType,
        name: String,
        timeStamp: DateType,
        `type`: OnExtensionActivityDetailsTypeTypeEnum
      ): OnExtensionActivityDetailsType = {
        val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any])
        __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
        __obj.asInstanceOf[OnExtensionActivityDetailsType]
      }
      
      extension [Self <: OnExtensionActivityDetailsType](x: Self) {
        
        inline def setData(value: OnExtensionActivityDetailsTypeDataType): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setTimeStamp(value: DateType): Self = StObject.set(x, "timeStamp", value.asInstanceOf[js.Any])
        
        inline def setType(value: OnExtensionActivityDetailsTypeTypeEnum): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        inline def setViewType(value: OnExtensionActivityDetailsTypeViewTypeEnum): Self = StObject.set(x, "viewType", value.asInstanceOf[js.Any])
        
        inline def setViewTypeUndefined: Self = StObject.set(x, "viewType", js.undefined)
      }
    }
    
    /**
      * The result of the call.
      */
    type OnExtensionActivityDetailsTypeDataResultType = StringDictionary[Any]
    
    trait OnExtensionActivityDetailsTypeDataType extends StObject {
      
      /**
        * A list of arguments passed to the call.
        * Optional.
        */
      var args: js.UndefOr[js.Array[Any]] = js.undefined
      
      /**
        * The result of the call.
        * Optional.
        */
      var result: js.UndefOr[OnExtensionActivityDetailsTypeDataResultType] = js.undefined
      
      /**
        * The tab associated with this event if it is a tab or content script.
        * Optional.
        */
      var tabId: js.UndefOr[Double] = js.undefined
      
      /**
        * If the type is content_script, this is the url of the script that was injected.
        * Optional.
        */
      var url: js.UndefOr[String] = js.undefined
    }
    object OnExtensionActivityDetailsTypeDataType {
      
      inline def apply(): OnExtensionActivityDetailsTypeDataType = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[OnExtensionActivityDetailsTypeDataType]
      }
      
      extension [Self <: OnExtensionActivityDetailsTypeDataType](x: Self) {
        
        inline def setArgs(value: js.Array[Any]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
        
        inline def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
        
        inline def setArgsVarargs(value: Any*): Self = StObject.set(x, "args", js.Array(value*))
        
        inline def setResult(value: OnExtensionActivityDetailsTypeDataResultType): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
        
        inline def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
        
        inline def setTabId(value: Double): Self = StObject.set(x, "tabId", value.asInstanceOf[js.Any])
        
        inline def setTabIdUndefined: Self = StObject.set(x, "tabId", js.undefined)
        
        inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
        
        inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      }
    }
    
    /**
      * The type of log entry.  api_call is a function call made by the extension and api_event is an event callback to the
      * extension.  content_script is logged when a content script is injected.
      */
    /* Rewritten from type alias, can be one of: 
      - typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.api_call
      - typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.api_event
      - typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.content_script
      - typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.user_script
    */
    trait OnExtensionActivityDetailsTypeTypeEnum extends StObject
    object OnExtensionActivityDetailsTypeTypeEnum {
      
      inline def api_call: typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.api_call = "api_call".asInstanceOf[typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.api_call]
      
      inline def api_event: typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.api_event = "api_event".asInstanceOf[typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.api_event]
      
      inline def content_script: typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.content_script = "content_script".asInstanceOf[typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.content_script]
      
      inline def user_script: typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.user_script = "user_script".asInstanceOf[typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.user_script]
    }
    
    /**
      * The type of view where the activity occurred.  Content scripts will not have a viewType.
      */
    /* Rewritten from type alias, can be one of: 
      - typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.background
      - typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.popup
      - typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.sidebar
      - typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.tab
      - typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.devtools_page
      - typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.devtools_panel
    */
    trait OnExtensionActivityDetailsTypeViewTypeEnum extends StObject
    object OnExtensionActivityDetailsTypeViewTypeEnum {
      
      inline def background: typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.background = "background".asInstanceOf[typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.background]
      
      inline def devtools_page: typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.devtools_page = "devtools_page".asInstanceOf[typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.devtools_page]
      
      inline def devtools_panel: typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.devtools_panel = "devtools_panel".asInstanceOf[typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.devtools_panel]
      
      inline def popup: typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.popup = "popup".asInstanceOf[typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.popup]
      
      inline def sidebar: typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.sidebar = "sidebar".asInstanceOf[typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.sidebar]
      
      inline def tab: typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.tab = "tab".asInstanceOf[typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.tab]
    }
    
    trait Static extends StObject {
      
      /**
        * Receives an activityItem for each logging event.
        */
      var onExtensionActivity: onExtensionActivityEvent
    }
    object Static {
      
      inline def apply(onExtensionActivity: onExtensionActivityEvent): Static = {
        val __obj = js.Dynamic.literal(onExtensionActivity = onExtensionActivity.asInstanceOf[js.Any])
        __obj.asInstanceOf[Static]
      }
      
      extension [Self <: Static](x: Self) {
        
        inline def setOnExtensionActivity(value: onExtensionActivityEvent): Self = StObject.set(x, "onExtensionActivity", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * Receives an activityItem for each logging event.
      */
    trait onExtensionActivityEvent
      extends StObject
         with Event[js.Function1[/* details */ OnExtensionActivityDetailsType, Unit]] {
      
      /**
        * Registers an event listener <em>callback</em> to an event.
        *
        * @param callback Called when an event occurs. The parameters of this function depend on the type of event.
        * @param id
        */
      def addListener(callback: js.Function1[/* details */ OnExtensionActivityDetailsType, Unit], id: String): Unit
    }
    object onExtensionActivityEvent {
      
      inline def apply(
        addListener: (js.Function1[/* details */ OnExtensionActivityDetailsType, Unit], String) => Callback,
        hasListener: js.Function1[/* details */ OnExtensionActivityDetailsType, Unit] => Boolean,
        hasListeners: CallbackTo[Boolean],
        removeListener: js.Function1[/* details */ OnExtensionActivityDetailsType, Unit] => Callback
      ): onExtensionActivityEvent = {
        val __obj = js.Dynamic.literal(addListener = js.Any.fromFunction2((t0: js.Function1[/* details */ OnExtensionActivityDetailsType, Unit], t1: String) => (addListener(t0, t1)).runNow()), hasListener = js.Any.fromFunction1(hasListener), hasListeners = hasListeners.toJsFn, removeListener = js.Any.fromFunction1((t0: js.Function1[/* details */ OnExtensionActivityDetailsType, Unit]) => removeListener(t0).runNow()))
        __obj.asInstanceOf[onExtensionActivityEvent]
      }
      
      extension [Self <: onExtensionActivityEvent](x: Self) {
        
        inline def setAddListener(value: (js.Function1[/* details */ OnExtensionActivityDetailsType, Unit], String) => Callback): Self = StObject.set(x, "addListener", js.Any.fromFunction2((t0: js.Function1[/* details */ OnExtensionActivityDetailsType, Unit], t1: String) => (value(t0, t1)).runNow()))
      }
    }
  }
}
