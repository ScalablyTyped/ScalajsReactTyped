package typingsJapgolly.naja

import japgolly.scalajs.react.Callback
import org.scalajs.dom.CustomEvent
import org.scalajs.dom.PopStateEvent
import typingsJapgolly.naja.anon.Key
import typingsJapgolly.naja.distNajaMod.Naja
import typingsJapgolly.naja.distUtilsMod.TypedEventListener
import typingsJapgolly.naja.najaStrings.buildState
import typingsJapgolly.naja.najaStrings.replace
import typingsJapgolly.naja.najaStrings.restoreState
import typingsJapgolly.std.AddEventListenerOptions
import typingsJapgolly.std.EventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCoreHistoryHandlerMod {
  
  @JSImport("naja/dist/core/HistoryHandler", "HistoryHandler")
  @js.native
  open class HistoryHandler protected ()
    extends StObject
       with EventTarget {
    def this(naja: Naja) = this()
    
    def addEventListener(
      `type`: buildState,
      listener: TypedEventListener[
          HistoryHandler, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'buildState' extends 'buildState' | 'restoreState' ? naja.naja/dist/core/HistoryHandler.BuildStateEvent : std.CustomEvent<any> */ js.Any
        ]
    ): Unit = js.native
    def addEventListener(
      `type`: buildState,
      listener: TypedEventListener[
          HistoryHandler, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'buildState' extends 'buildState' | 'restoreState' ? naja.naja/dist/core/HistoryHandler.BuildStateEvent : std.CustomEvent<any> */ js.Any
        ],
      options: Boolean
    ): Unit = js.native
    def addEventListener(
      `type`: buildState,
      listener: TypedEventListener[
          HistoryHandler, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'buildState' extends 'buildState' | 'restoreState' ? naja.naja/dist/core/HistoryHandler.BuildStateEvent : std.CustomEvent<any> */ js.Any
        ],
      options: AddEventListenerOptions
    ): Unit = js.native
    def addEventListener(
      `type`: restoreState,
      listener: TypedEventListener[
          HistoryHandler, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'restoreState' extends 'buildState' | 'restoreState' ? naja.naja/dist/core/HistoryHandler.RestoreStateEvent : std.CustomEvent<any> */ js.Any
        ]
    ): Unit = js.native
    def addEventListener(
      `type`: restoreState,
      listener: TypedEventListener[
          HistoryHandler, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'restoreState' extends 'buildState' | 'restoreState' ? naja.naja/dist/core/HistoryHandler.RestoreStateEvent : std.CustomEvent<any> */ js.Any
        ],
      options: Boolean
    ): Unit = js.native
    def addEventListener(
      `type`: restoreState,
      listener: TypedEventListener[
          HistoryHandler, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'restoreState' extends 'buildState' | 'restoreState' ? naja.naja/dist/core/HistoryHandler.RestoreStateEvent : std.CustomEvent<any> */ js.Any
        ],
      options: AddEventListenerOptions
    ): Unit = js.native
    
    /* private */ var buildState: Any = js.native
    
    /* private */ var configureMode: Any = js.native
    
    /* private */ var handlePopState: Any = js.native
    
    var historyAdapter: HistoryAdapter = js.native
    
    /* private */ var initialize: Any = js.native
    
    /* private */ var initialized: Any = js.native
    
    /* private */ val naja: Any = js.native
    
    def popStateHandler(event: PopStateEvent): Unit = js.native
    
    /* private */ var pushNewState: Any = js.native
    
    def removeEventListener(
      `type`: String,
      listener: TypedEventListener[
          HistoryHandler, 
          /* import warning: importer.ImportType#apply Failed type conversion: string extends 'buildState' | 'restoreState' ? naja.naja/dist/core/HistoryHandler.HistoryHandlerEventMap[string] : std.CustomEvent<any> */ js.Any
        ],
      options: AddEventListenerOptions
    ): Unit = js.native
    def removeEventListener(
      `type`: buildState,
      listener: TypedEventListener[
          HistoryHandler, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'buildState' extends 'buildState' | 'restoreState' ? naja.naja/dist/core/HistoryHandler.BuildStateEvent : std.CustomEvent<any> */ js.Any
        ]
    ): Unit = js.native
    def removeEventListener(
      `type`: buildState,
      listener: TypedEventListener[
          HistoryHandler, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'buildState' extends 'buildState' | 'restoreState' ? naja.naja/dist/core/HistoryHandler.BuildStateEvent : std.CustomEvent<any> */ js.Any
        ],
      options: Boolean
    ): Unit = js.native
    def removeEventListener(
      `type`: buildState,
      listener: TypedEventListener[
          HistoryHandler, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'buildState' extends 'buildState' | 'restoreState' ? naja.naja/dist/core/HistoryHandler.BuildStateEvent : std.CustomEvent<any> */ js.Any
        ],
      options: AddEventListenerOptions
    ): Unit = js.native
    def removeEventListener(
      `type`: restoreState,
      listener: TypedEventListener[
          HistoryHandler, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'restoreState' extends 'buildState' | 'restoreState' ? naja.naja/dist/core/HistoryHandler.RestoreStateEvent : std.CustomEvent<any> */ js.Any
        ]
    ): Unit = js.native
    def removeEventListener(
      `type`: restoreState,
      listener: TypedEventListener[
          HistoryHandler, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'restoreState' extends 'buildState' | 'restoreState' ? naja.naja/dist/core/HistoryHandler.RestoreStateEvent : std.CustomEvent<any> */ js.Any
        ],
      options: Boolean
    ): Unit = js.native
    def removeEventListener(
      `type`: restoreState,
      listener: TypedEventListener[
          HistoryHandler, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'restoreState' extends 'buildState' | 'restoreState' ? naja.naja/dist/core/HistoryHandler.RestoreStateEvent : std.CustomEvent<any> */ js.Any
        ],
      options: AddEventListenerOptions
    ): Unit = js.native
    
    /* private */ var replaceInitialState: Any = js.native
    
    /* private */ var saveUrl: Any = js.native
    
    def uiCache_=(value: Boolean): Unit = js.native
  }
  /* static members */
  object HistoryHandler {
    
    @JSImport("naja/dist/core/HistoryHandler", "HistoryHandler")
    @js.native
    val ^ : js.Any = js.native
    
    inline def normalizeMode(): HistoryMode = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeMode")().asInstanceOf[HistoryMode]
    inline def normalizeMode(mode: String): HistoryMode = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeMode")(mode.asInstanceOf[js.Any]).asInstanceOf[HistoryMode]
    inline def normalizeMode(mode: Boolean): HistoryMode = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeMode")(mode.asInstanceOf[js.Any]).asInstanceOf[HistoryMode]
  }
  
  type BuildStateEvent = CustomEvent
  
  trait HistoryAdapter extends StObject {
    
    def pushState(state: HistoryState, title: String, url: String): Unit
    
    def replaceState(state: HistoryState, title: String, url: String): Unit
  }
  object HistoryAdapter {
    
    inline def apply(
      pushState: (HistoryState, String, String) => Callback,
      replaceState: (HistoryState, String, String) => Callback
    ): HistoryAdapter = {
      val __obj = js.Dynamic.literal(pushState = js.Any.fromFunction3((t0: HistoryState, t1: String, t2: String) => (pushState(t0, t1, t2)).runNow()), replaceState = js.Any.fromFunction3((t0: HistoryState, t1: String, t2: String) => (replaceState(t0, t1, t2)).runNow()))
      __obj.asInstanceOf[HistoryAdapter]
    }
    
    extension [Self <: HistoryAdapter](x: Self) {
      
      inline def setPushState(value: (HistoryState, String, String) => Callback): Self = StObject.set(x, "pushState", js.Any.fromFunction3((t0: HistoryState, t1: String, t2: String) => (value(t0, t1, t2)).runNow()))
      
      inline def setReplaceState(value: (HistoryState, String, String) => Callback): Self = StObject.set(x, "replaceState", js.Any.fromFunction3((t0: HistoryState, t1: String, t2: String) => (value(t0, t1, t2)).runNow()))
    }
  }
  
  trait HistoryHandlerEventMap extends StObject {
    
    var buildState: CustomEvent
    
    var restoreState: CustomEvent
  }
  object HistoryHandlerEventMap {
    
    inline def apply(buildState: CustomEvent, restoreState: CustomEvent): HistoryHandlerEventMap = {
      val __obj = js.Dynamic.literal(buildState = buildState.asInstanceOf[js.Any], restoreState = restoreState.asInstanceOf[js.Any])
      __obj.asInstanceOf[HistoryHandlerEventMap]
    }
    
    extension [Self <: HistoryHandlerEventMap](x: Self) {
      
      inline def setBuildState(value: CustomEvent): Self = StObject.set(x, "buildState", value.asInstanceOf[js.Any])
      
      inline def setRestoreState(value: CustomEvent): Self = StObject.set(x, "restoreState", value.asInstanceOf[js.Any])
    }
  }
  
  type HistoryMode = Boolean | replace
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in string ]: any} */ trait HistoryState extends StObject {
    
    var href: String
    
    var snippets: js.UndefOr[Key] = js.undefined
    
    var source: String
  }
  object HistoryState {
    
    inline def apply(href: String, source: String): HistoryState = {
      val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[HistoryState]
    }
    
    extension [Self <: HistoryState](x: Self) {
      
      inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
      
      inline def setSnippets(value: Key): Self = StObject.set(x, "snippets", value.asInstanceOf[js.Any])
      
      inline def setSnippetsUndefined: Self = StObject.set(x, "snippets", js.undefined)
      
      inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    }
  }
  
  type RestoreStateEvent = CustomEvent
  
  /* augmented module */
  object najaDistNajaAugmentingMod {
    
    trait Options extends StObject {
      
      var history: js.UndefOr[HistoryMode] = js.undefined
      
      var href: js.UndefOr[String] = js.undefined
    }
    object Options {
      
      inline def apply(): Options = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Options]
      }
      
      extension [Self <: Options](x: Self) {
        
        inline def setHistory(value: HistoryMode): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
        
        inline def setHistoryUndefined: Self = StObject.set(x, "history", js.undefined)
        
        inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
        
        inline def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
      }
    }
    
    trait Payload extends StObject {
      
      var postGet: js.UndefOr[Boolean] = js.undefined
      
      var url: js.UndefOr[String] = js.undefined
    }
    object Payload {
      
      inline def apply(): Payload = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Payload]
      }
      
      extension [Self <: Payload](x: Self) {
        
        inline def setPostGet(value: Boolean): Self = StObject.set(x, "postGet", value.asInstanceOf[js.Any])
        
        inline def setPostGetUndefined: Self = StObject.set(x, "postGet", js.undefined)
        
        inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
        
        inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      }
    }
  }
}
