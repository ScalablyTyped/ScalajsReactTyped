package typingsJapgolly.naja

import org.scalajs.dom.CustomEvent
import typingsJapgolly.naja.anon.Key
import typingsJapgolly.naja.distCoreSnippetHandlerMod.SnippetHandler
import typingsJapgolly.naja.distNajaMod.Naja
import typingsJapgolly.naja.distUtilsMod.TypedEventListener
import typingsJapgolly.naja.najaStrings.fetch
import typingsJapgolly.naja.najaStrings.restore
import typingsJapgolly.naja.najaStrings.store
import typingsJapgolly.std.AddEventListenerOptions
import typingsJapgolly.std.EventTarget
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCoreSnippetCacheMod {
  
  @JSImport("naja/dist/core/SnippetCache", "SnippetCache")
  @js.native
  open class SnippetCache protected ()
    extends StObject
       with EventTarget {
    def this(naja: Naja) = this()
    
    def addEventListener(
      `type`: fetch,
      listener: TypedEventListener[
          SnippetHandler, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'fetch' extends 'store' | 'fetch' | 'restore' ? naja.naja/dist/core/SnippetCache.FetchEvent : std.CustomEvent<any> */ js.Any
        ]
    ): Unit = js.native
    def addEventListener(
      `type`: fetch,
      listener: TypedEventListener[
          SnippetHandler, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'fetch' extends 'store' | 'fetch' | 'restore' ? naja.naja/dist/core/SnippetCache.FetchEvent : std.CustomEvent<any> */ js.Any
        ],
      options: Boolean
    ): Unit = js.native
    def addEventListener(
      `type`: fetch,
      listener: TypedEventListener[
          SnippetHandler, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'fetch' extends 'store' | 'fetch' | 'restore' ? naja.naja/dist/core/SnippetCache.FetchEvent : std.CustomEvent<any> */ js.Any
        ],
      options: AddEventListenerOptions
    ): Unit = js.native
    def addEventListener(
      `type`: restore,
      listener: TypedEventListener[
          SnippetHandler, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'restore' extends 'store' | 'fetch' | 'restore' ? naja.naja/dist/core/SnippetCache.RestoreEvent : std.CustomEvent<any> */ js.Any
        ]
    ): Unit = js.native
    def addEventListener(
      `type`: restore,
      listener: TypedEventListener[
          SnippetHandler, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'restore' extends 'store' | 'fetch' | 'restore' ? naja.naja/dist/core/SnippetCache.RestoreEvent : std.CustomEvent<any> */ js.Any
        ],
      options: Boolean
    ): Unit = js.native
    def addEventListener(
      `type`: restore,
      listener: TypedEventListener[
          SnippetHandler, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'restore' extends 'store' | 'fetch' | 'restore' ? naja.naja/dist/core/SnippetCache.RestoreEvent : std.CustomEvent<any> */ js.Any
        ],
      options: AddEventListenerOptions
    ): Unit = js.native
    def addEventListener(
      `type`: store,
      listener: TypedEventListener[
          SnippetHandler, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'store' extends 'store' | 'fetch' | 'restore' ? naja.naja/dist/core/SnippetCache.StoreEvent : std.CustomEvent<any> */ js.Any
        ]
    ): Unit = js.native
    def addEventListener(
      `type`: store,
      listener: TypedEventListener[
          SnippetHandler, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'store' extends 'store' | 'fetch' | 'restore' ? naja.naja/dist/core/SnippetCache.StoreEvent : std.CustomEvent<any> */ js.Any
        ],
      options: Boolean
    ): Unit = js.native
    def addEventListener(
      `type`: store,
      listener: TypedEventListener[
          SnippetHandler, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'store' extends 'store' | 'fetch' | 'restore' ? naja.naja/dist/core/SnippetCache.StoreEvent : std.CustomEvent<any> */ js.Any
        ],
      options: AddEventListenerOptions
    ): Unit = js.native
    
    /* private */ var buildHistoryState: Any = js.native
    
    /* private */ var configureCache: Any = js.native
    
    /* private */ val naja: Any = js.native
    
    def removeEventListener(
      `type`: String,
      listener: TypedEventListener[
          SnippetHandler, 
          /* import warning: importer.ImportType#apply Failed type conversion: string extends 'store' | 'fetch' | 'restore' ? naja.naja/dist/core/SnippetCache.SnippetCacheEventMap[string] : std.CustomEvent<any> */ js.Any
        ],
      options: AddEventListenerOptions
    ): Unit = js.native
    def removeEventListener(
      `type`: fetch,
      listener: TypedEventListener[
          SnippetHandler, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'fetch' extends 'store' | 'fetch' | 'restore' ? naja.naja/dist/core/SnippetCache.FetchEvent : std.CustomEvent<any> */ js.Any
        ]
    ): Unit = js.native
    def removeEventListener(
      `type`: fetch,
      listener: TypedEventListener[
          SnippetHandler, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'fetch' extends 'store' | 'fetch' | 'restore' ? naja.naja/dist/core/SnippetCache.FetchEvent : std.CustomEvent<any> */ js.Any
        ],
      options: Boolean
    ): Unit = js.native
    def removeEventListener(
      `type`: fetch,
      listener: TypedEventListener[
          SnippetHandler, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'fetch' extends 'store' | 'fetch' | 'restore' ? naja.naja/dist/core/SnippetCache.FetchEvent : std.CustomEvent<any> */ js.Any
        ],
      options: AddEventListenerOptions
    ): Unit = js.native
    def removeEventListener(
      `type`: restore,
      listener: TypedEventListener[
          SnippetHandler, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'restore' extends 'store' | 'fetch' | 'restore' ? naja.naja/dist/core/SnippetCache.RestoreEvent : std.CustomEvent<any> */ js.Any
        ]
    ): Unit = js.native
    def removeEventListener(
      `type`: restore,
      listener: TypedEventListener[
          SnippetHandler, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'restore' extends 'store' | 'fetch' | 'restore' ? naja.naja/dist/core/SnippetCache.RestoreEvent : std.CustomEvent<any> */ js.Any
        ],
      options: Boolean
    ): Unit = js.native
    def removeEventListener(
      `type`: restore,
      listener: TypedEventListener[
          SnippetHandler, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'restore' extends 'store' | 'fetch' | 'restore' ? naja.naja/dist/core/SnippetCache.RestoreEvent : std.CustomEvent<any> */ js.Any
        ],
      options: AddEventListenerOptions
    ): Unit = js.native
    def removeEventListener(
      `type`: store,
      listener: TypedEventListener[
          SnippetHandler, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'store' extends 'store' | 'fetch' | 'restore' ? naja.naja/dist/core/SnippetCache.StoreEvent : std.CustomEvent<any> */ js.Any
        ]
    ): Unit = js.native
    def removeEventListener(
      `type`: store,
      listener: TypedEventListener[
          SnippetHandler, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'store' extends 'store' | 'fetch' | 'restore' ? naja.naja/dist/core/SnippetCache.StoreEvent : std.CustomEvent<any> */ js.Any
        ],
      options: Boolean
    ): Unit = js.native
    def removeEventListener(
      `type`: store,
      listener: TypedEventListener[
          SnippetHandler, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'store' extends 'store' | 'fetch' | 'restore' ? naja.naja/dist/core/SnippetCache.StoreEvent : std.CustomEvent<any> */ js.Any
        ],
      options: AddEventListenerOptions
    ): Unit = js.native
    
    /* private */ var resolveStorage: Any = js.native
    
    /* private */ var restoreHistoryState: Any = js.native
    
    /* private */ val storages: Any = js.native
  }
  
  type CachedSnippets = Record[String, String]
  
  type FetchEvent = CustomEvent
  
  type RestoreEvent = CustomEvent
  
  trait SnippetCacheEventMap extends StObject {
    
    var fetch: CustomEvent
    
    var restore: CustomEvent
    
    var store: CustomEvent
  }
  object SnippetCacheEventMap {
    
    inline def apply(fetch: CustomEvent, restore: CustomEvent, store: CustomEvent): SnippetCacheEventMap = {
      val __obj = js.Dynamic.literal(fetch = fetch.asInstanceOf[js.Any], restore = restore.asInstanceOf[js.Any], store = store.asInstanceOf[js.Any])
      __obj.asInstanceOf[SnippetCacheEventMap]
    }
    
    extension [Self <: SnippetCacheEventMap](x: Self) {
      
      inline def setFetch(value: CustomEvent): Self = StObject.set(x, "fetch", value.asInstanceOf[js.Any])
      
      inline def setRestore(value: CustomEvent): Self = StObject.set(x, "restore", value.asInstanceOf[js.Any])
      
      inline def setStore(value: CustomEvent): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
    }
  }
  
  type SnippetCacheKey = CachedSnippets | String | Null
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.naja.najaStrings.off
    - typingsJapgolly.naja.najaStrings.history
    - typingsJapgolly.naja.najaStrings.session
  */
  trait SnippetCacheStorageType extends StObject
  object SnippetCacheStorageType {
    
    inline def history: typingsJapgolly.naja.najaStrings.history = "history".asInstanceOf[typingsJapgolly.naja.najaStrings.history]
    
    inline def off: typingsJapgolly.naja.najaStrings.off = "off".asInstanceOf[typingsJapgolly.naja.najaStrings.off]
    
    inline def session: typingsJapgolly.naja.najaStrings.session = "session".asInstanceOf[typingsJapgolly.naja.najaStrings.session]
  }
  
  type StoreEvent = CustomEvent
  
  /* augmented module */
  object najaDistCoreHistoryHandlerAugmentingMod {
    
    trait HistoryState extends StObject {
      
      var snippets: js.UndefOr[Key] = js.undefined
    }
    object HistoryState {
      
      inline def apply(): HistoryState = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[HistoryState]
      }
      
      extension [Self <: HistoryState](x: Self) {
        
        inline def setSnippets(value: Key): Self = StObject.set(x, "snippets", value.asInstanceOf[js.Any])
        
        inline def setSnippetsUndefined: Self = StObject.set(x, "snippets", js.undefined)
      }
    }
  }
  
  /* augmented module */
  object najaDistNajaAugmentingMod {
    
    trait Options extends StObject {
      
      var snippetCache: js.UndefOr[Boolean | SnippetCacheStorageType] = js.undefined
    }
    object Options {
      
      inline def apply(): Options = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Options]
      }
      
      extension [Self <: Options](x: Self) {
        
        inline def setSnippetCache(value: Boolean | SnippetCacheStorageType): Self = StObject.set(x, "snippetCache", value.asInstanceOf[js.Any])
        
        inline def setSnippetCacheUndefined: Self = StObject.set(x, "snippetCache", js.undefined)
      }
    }
  }
}
