package typingsJapgolly.naja

import japgolly.scalajs.react.Callback
import org.scalajs.dom.CustomEvent
import org.scalajs.dom.RequestInit
import org.scalajs.dom.Response
import org.scalajs.dom.URL
import typingsJapgolly.naja.anon.Instantiable
import typingsJapgolly.naja.anon.InstantiableFormsHandler
import typingsJapgolly.naja.anon.InstantiableHistoryHandler
import typingsJapgolly.naja.anon.InstantiableRedirectHandler
import typingsJapgolly.naja.anon.InstantiableScriptLoader
import typingsJapgolly.naja.anon.InstantiableSnippetCache
import typingsJapgolly.naja.anon.InstantiableSnippetHandler
import typingsJapgolly.naja.distCoreFormsHandlerMod.FormsHandler
import typingsJapgolly.naja.distCoreHistoryHandlerMod.HistoryHandler
import typingsJapgolly.naja.distCoreHistoryHandlerMod.HistoryMode
import typingsJapgolly.naja.distCoreRedirectHandlerMod.RedirectHandler
import typingsJapgolly.naja.distCoreScriptLoaderMod.ScriptLoader
import typingsJapgolly.naja.distCoreSnippetCacheMod.SnippetCache
import typingsJapgolly.naja.distCoreSnippetCacheMod.SnippetCacheStorageType
import typingsJapgolly.naja.distCoreSnippetHandlerMod.SnippetHandler
import typingsJapgolly.naja.distCoreUihandlerMod.UIHandler
import typingsJapgolly.naja.distUtilsMod.TypedEventListener
import typingsJapgolly.naja.najaBooleans.`false`
import typingsJapgolly.naja.najaStrings.abort
import typingsJapgolly.naja.najaStrings.before
import typingsJapgolly.naja.najaStrings.complete
import typingsJapgolly.naja.najaStrings.error
import typingsJapgolly.naja.najaStrings.init
import typingsJapgolly.naja.najaStrings.payload
import typingsJapgolly.naja.najaStrings.start
import typingsJapgolly.naja.najaStrings.success
import typingsJapgolly.std.AddEventListenerOptions
import typingsJapgolly.std.Error
import typingsJapgolly.std.EventTarget
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNajaMod {
  
  @JSImport("naja/dist/Naja", "HttpError")
  @js.native
  open class HttpError protected ()
    extends StObject
       with Error {
    def this(response: Response) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    
    val response: Response = js.native
  }
  
  @JSImport("naja/dist/Naja", "Naja")
  @js.native
  open class Naja protected ()
    extends StObject
       with EventTarget {
    def this(
      uiHandler: js.UndefOr[Instantiable],
      redirectHandler: js.UndefOr[InstantiableRedirectHandler],
      snippetHandler: js.UndefOr[InstantiableSnippetHandler],
      formsHandler: js.UndefOr[InstantiableFormsHandler],
      historyHandler: js.UndefOr[InstantiableHistoryHandler],
      snippetCache: js.UndefOr[InstantiableSnippetCache],
      scriptLoader: js.UndefOr[InstantiableScriptLoader]
    ) = this()
    
    val VERSION: Double = js.native
    
    def addEventListener(
      `type`: abort,
      listener: TypedEventListener[
          Naja, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'abort' extends 'init' | 'before' | 'start' | 'abort' | 'payload' | 'success' | 'error' | 'complete' ? naja.naja/dist/Naja.AbortEvent : std.CustomEvent<any> */ js.Any
        ]
    ): Unit = js.native
    def addEventListener(
      `type`: abort,
      listener: TypedEventListener[
          Naja, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'abort' extends 'init' | 'before' | 'start' | 'abort' | 'payload' | 'success' | 'error' | 'complete' ? naja.naja/dist/Naja.AbortEvent : std.CustomEvent<any> */ js.Any
        ],
      options: Boolean
    ): Unit = js.native
    def addEventListener(
      `type`: abort,
      listener: TypedEventListener[
          Naja, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'abort' extends 'init' | 'before' | 'start' | 'abort' | 'payload' | 'success' | 'error' | 'complete' ? naja.naja/dist/Naja.AbortEvent : std.CustomEvent<any> */ js.Any
        ],
      options: AddEventListenerOptions
    ): Unit = js.native
    def addEventListener(
      `type`: before,
      listener: TypedEventListener[
          Naja, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'before' extends 'init' | 'before' | 'start' | 'abort' | 'payload' | 'success' | 'error' | 'complete' ? naja.naja/dist/Naja.BeforeEvent : std.CustomEvent<any> */ js.Any
        ]
    ): Unit = js.native
    def addEventListener(
      `type`: before,
      listener: TypedEventListener[
          Naja, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'before' extends 'init' | 'before' | 'start' | 'abort' | 'payload' | 'success' | 'error' | 'complete' ? naja.naja/dist/Naja.BeforeEvent : std.CustomEvent<any> */ js.Any
        ],
      options: Boolean
    ): Unit = js.native
    def addEventListener(
      `type`: before,
      listener: TypedEventListener[
          Naja, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'before' extends 'init' | 'before' | 'start' | 'abort' | 'payload' | 'success' | 'error' | 'complete' ? naja.naja/dist/Naja.BeforeEvent : std.CustomEvent<any> */ js.Any
        ],
      options: AddEventListenerOptions
    ): Unit = js.native
    def addEventListener(
      `type`: complete,
      listener: TypedEventListener[
          Naja, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'complete' extends 'init' | 'before' | 'start' | 'abort' | 'payload' | 'success' | 'error' | 'complete' ? naja.naja/dist/Naja.CompleteEvent : std.CustomEvent<any> */ js.Any
        ]
    ): Unit = js.native
    def addEventListener(
      `type`: complete,
      listener: TypedEventListener[
          Naja, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'complete' extends 'init' | 'before' | 'start' | 'abort' | 'payload' | 'success' | 'error' | 'complete' ? naja.naja/dist/Naja.CompleteEvent : std.CustomEvent<any> */ js.Any
        ],
      options: Boolean
    ): Unit = js.native
    def addEventListener(
      `type`: complete,
      listener: TypedEventListener[
          Naja, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'complete' extends 'init' | 'before' | 'start' | 'abort' | 'payload' | 'success' | 'error' | 'complete' ? naja.naja/dist/Naja.CompleteEvent : std.CustomEvent<any> */ js.Any
        ],
      options: AddEventListenerOptions
    ): Unit = js.native
    def addEventListener(
      `type`: error,
      listener: TypedEventListener[
          Naja, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'error' extends 'init' | 'before' | 'start' | 'abort' | 'payload' | 'success' | 'error' | 'complete' ? naja.naja/dist/Naja.ErrorEvent : std.CustomEvent<any> */ js.Any
        ]
    ): Unit = js.native
    def addEventListener(
      `type`: error,
      listener: TypedEventListener[
          Naja, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'error' extends 'init' | 'before' | 'start' | 'abort' | 'payload' | 'success' | 'error' | 'complete' ? naja.naja/dist/Naja.ErrorEvent : std.CustomEvent<any> */ js.Any
        ],
      options: Boolean
    ): Unit = js.native
    def addEventListener(
      `type`: error,
      listener: TypedEventListener[
          Naja, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'error' extends 'init' | 'before' | 'start' | 'abort' | 'payload' | 'success' | 'error' | 'complete' ? naja.naja/dist/Naja.ErrorEvent : std.CustomEvent<any> */ js.Any
        ],
      options: AddEventListenerOptions
    ): Unit = js.native
    def addEventListener(
      `type`: init,
      listener: TypedEventListener[
          Naja, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'init' extends 'init' | 'before' | 'start' | 'abort' | 'payload' | 'success' | 'error' | 'complete' ? naja.naja/dist/Naja.InitEvent : std.CustomEvent<any> */ js.Any
        ]
    ): Unit = js.native
    def addEventListener(
      `type`: init,
      listener: TypedEventListener[
          Naja, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'init' extends 'init' | 'before' | 'start' | 'abort' | 'payload' | 'success' | 'error' | 'complete' ? naja.naja/dist/Naja.InitEvent : std.CustomEvent<any> */ js.Any
        ],
      options: Boolean
    ): Unit = js.native
    def addEventListener(
      `type`: init,
      listener: TypedEventListener[
          Naja, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'init' extends 'init' | 'before' | 'start' | 'abort' | 'payload' | 'success' | 'error' | 'complete' ? naja.naja/dist/Naja.InitEvent : std.CustomEvent<any> */ js.Any
        ],
      options: AddEventListenerOptions
    ): Unit = js.native
    def addEventListener(
      `type`: payload,
      listener: TypedEventListener[
          Naja, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'payload' extends 'init' | 'before' | 'start' | 'abort' | 'payload' | 'success' | 'error' | 'complete' ? naja.naja/dist/Naja.PayloadEvent : std.CustomEvent<any> */ js.Any
        ]
    ): Unit = js.native
    def addEventListener(
      `type`: payload,
      listener: TypedEventListener[
          Naja, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'payload' extends 'init' | 'before' | 'start' | 'abort' | 'payload' | 'success' | 'error' | 'complete' ? naja.naja/dist/Naja.PayloadEvent : std.CustomEvent<any> */ js.Any
        ],
      options: Boolean
    ): Unit = js.native
    def addEventListener(
      `type`: payload,
      listener: TypedEventListener[
          Naja, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'payload' extends 'init' | 'before' | 'start' | 'abort' | 'payload' | 'success' | 'error' | 'complete' ? naja.naja/dist/Naja.PayloadEvent : std.CustomEvent<any> */ js.Any
        ],
      options: AddEventListenerOptions
    ): Unit = js.native
    def addEventListener(
      `type`: start,
      listener: TypedEventListener[
          Naja, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'start' extends 'init' | 'before' | 'start' | 'abort' | 'payload' | 'success' | 'error' | 'complete' ? naja.naja/dist/Naja.StartEvent : std.CustomEvent<any> */ js.Any
        ]
    ): Unit = js.native
    def addEventListener(
      `type`: start,
      listener: TypedEventListener[
          Naja, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'start' extends 'init' | 'before' | 'start' | 'abort' | 'payload' | 'success' | 'error' | 'complete' ? naja.naja/dist/Naja.StartEvent : std.CustomEvent<any> */ js.Any
        ],
      options: Boolean
    ): Unit = js.native
    def addEventListener(
      `type`: start,
      listener: TypedEventListener[
          Naja, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'start' extends 'init' | 'before' | 'start' | 'abort' | 'payload' | 'success' | 'error' | 'complete' ? naja.naja/dist/Naja.StartEvent : std.CustomEvent<any> */ js.Any
        ],
      options: AddEventListenerOptions
    ): Unit = js.native
    def addEventListener(
      `type`: success,
      listener: TypedEventListener[
          Naja, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'success' extends 'init' | 'before' | 'start' | 'abort' | 'payload' | 'success' | 'error' | 'complete' ? naja.naja/dist/Naja.SuccessEvent : std.CustomEvent<any> */ js.Any
        ]
    ): Unit = js.native
    def addEventListener(
      `type`: success,
      listener: TypedEventListener[
          Naja, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'success' extends 'init' | 'before' | 'start' | 'abort' | 'payload' | 'success' | 'error' | 'complete' ? naja.naja/dist/Naja.SuccessEvent : std.CustomEvent<any> */ js.Any
        ],
      options: Boolean
    ): Unit = js.native
    def addEventListener(
      `type`: success,
      listener: TypedEventListener[
          Naja, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'success' extends 'init' | 'before' | 'start' | 'abort' | 'payload' | 'success' | 'error' | 'complete' ? naja.naja/dist/Naja.SuccessEvent : std.CustomEvent<any> */ js.Any
        ],
      options: AddEventListenerOptions
    ): Unit = js.native
    
    /* private */ var appendToQueryString: Any = js.native
    
    var defaultOptions: Options = js.native
    
    /* private */ val extensions: Any = js.native
    
    val formsHandler: FormsHandler = js.native
    
    val historyHandler: HistoryHandler = js.native
    
    def initialize(): Unit = js.native
    def initialize(defaultOptions: Options): Unit = js.native
    
    /* private */ var initialized: Any = js.native
    
    def makeRequest(method: String, url: String): js.Promise[Payload] = js.native
    def makeRequest(method: String, url: String, data: Any): js.Promise[Payload] = js.native
    def makeRequest(method: String, url: String, data: Any, options: Options): js.Promise[Payload] = js.native
    def makeRequest(method: String, url: String, data: Null, options: Options): js.Promise[Payload] = js.native
    def makeRequest(method: String, url: String, data: Unit, options: Options): js.Promise[Payload] = js.native
    def makeRequest(method: String, url: URL): js.Promise[Payload] = js.native
    def makeRequest(method: String, url: URL, data: Any): js.Promise[Payload] = js.native
    def makeRequest(method: String, url: URL, data: Any, options: Options): js.Promise[Payload] = js.native
    def makeRequest(method: String, url: URL, data: Null, options: Options): js.Promise[Payload] = js.native
    def makeRequest(method: String, url: URL, data: Unit, options: Options): js.Promise[Payload] = js.native
    
    def prepareOptions(): Options = js.native
    def prepareOptions(options: Options): Options = js.native
    
    val redirectHandler: RedirectHandler = js.native
    
    def registerExtension(`extension`: Extension): Unit = js.native
    
    def removeEventListener(
      `type`: String,
      listener: TypedEventListener[
          Naja, 
          /* import warning: importer.ImportType#apply Failed type conversion: string extends 'init' | 'before' | 'start' | 'abort' | 'payload' | 'success' | 'error' | 'complete' ? naja.naja/dist/Naja.NajaEventMap[string] : std.CustomEvent<any> */ js.Any
        ],
      options: AddEventListenerOptions
    ): Unit = js.native
    def removeEventListener(
      `type`: abort,
      listener: TypedEventListener[
          Naja, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'abort' extends 'init' | 'before' | 'start' | 'abort' | 'payload' | 'success' | 'error' | 'complete' ? naja.naja/dist/Naja.AbortEvent : std.CustomEvent<any> */ js.Any
        ]
    ): Unit = js.native
    def removeEventListener(
      `type`: abort,
      listener: TypedEventListener[
          Naja, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'abort' extends 'init' | 'before' | 'start' | 'abort' | 'payload' | 'success' | 'error' | 'complete' ? naja.naja/dist/Naja.AbortEvent : std.CustomEvent<any> */ js.Any
        ],
      options: Boolean
    ): Unit = js.native
    def removeEventListener(
      `type`: abort,
      listener: TypedEventListener[
          Naja, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'abort' extends 'init' | 'before' | 'start' | 'abort' | 'payload' | 'success' | 'error' | 'complete' ? naja.naja/dist/Naja.AbortEvent : std.CustomEvent<any> */ js.Any
        ],
      options: AddEventListenerOptions
    ): Unit = js.native
    def removeEventListener(
      `type`: before,
      listener: TypedEventListener[
          Naja, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'before' extends 'init' | 'before' | 'start' | 'abort' | 'payload' | 'success' | 'error' | 'complete' ? naja.naja/dist/Naja.BeforeEvent : std.CustomEvent<any> */ js.Any
        ]
    ): Unit = js.native
    def removeEventListener(
      `type`: before,
      listener: TypedEventListener[
          Naja, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'before' extends 'init' | 'before' | 'start' | 'abort' | 'payload' | 'success' | 'error' | 'complete' ? naja.naja/dist/Naja.BeforeEvent : std.CustomEvent<any> */ js.Any
        ],
      options: Boolean
    ): Unit = js.native
    def removeEventListener(
      `type`: before,
      listener: TypedEventListener[
          Naja, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'before' extends 'init' | 'before' | 'start' | 'abort' | 'payload' | 'success' | 'error' | 'complete' ? naja.naja/dist/Naja.BeforeEvent : std.CustomEvent<any> */ js.Any
        ],
      options: AddEventListenerOptions
    ): Unit = js.native
    def removeEventListener(
      `type`: complete,
      listener: TypedEventListener[
          Naja, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'complete' extends 'init' | 'before' | 'start' | 'abort' | 'payload' | 'success' | 'error' | 'complete' ? naja.naja/dist/Naja.CompleteEvent : std.CustomEvent<any> */ js.Any
        ]
    ): Unit = js.native
    def removeEventListener(
      `type`: complete,
      listener: TypedEventListener[
          Naja, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'complete' extends 'init' | 'before' | 'start' | 'abort' | 'payload' | 'success' | 'error' | 'complete' ? naja.naja/dist/Naja.CompleteEvent : std.CustomEvent<any> */ js.Any
        ],
      options: Boolean
    ): Unit = js.native
    def removeEventListener(
      `type`: complete,
      listener: TypedEventListener[
          Naja, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'complete' extends 'init' | 'before' | 'start' | 'abort' | 'payload' | 'success' | 'error' | 'complete' ? naja.naja/dist/Naja.CompleteEvent : std.CustomEvent<any> */ js.Any
        ],
      options: AddEventListenerOptions
    ): Unit = js.native
    def removeEventListener(
      `type`: error,
      listener: TypedEventListener[
          Naja, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'error' extends 'init' | 'before' | 'start' | 'abort' | 'payload' | 'success' | 'error' | 'complete' ? naja.naja/dist/Naja.ErrorEvent : std.CustomEvent<any> */ js.Any
        ]
    ): Unit = js.native
    def removeEventListener(
      `type`: error,
      listener: TypedEventListener[
          Naja, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'error' extends 'init' | 'before' | 'start' | 'abort' | 'payload' | 'success' | 'error' | 'complete' ? naja.naja/dist/Naja.ErrorEvent : std.CustomEvent<any> */ js.Any
        ],
      options: Boolean
    ): Unit = js.native
    def removeEventListener(
      `type`: error,
      listener: TypedEventListener[
          Naja, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'error' extends 'init' | 'before' | 'start' | 'abort' | 'payload' | 'success' | 'error' | 'complete' ? naja.naja/dist/Naja.ErrorEvent : std.CustomEvent<any> */ js.Any
        ],
      options: AddEventListenerOptions
    ): Unit = js.native
    def removeEventListener(
      `type`: init,
      listener: TypedEventListener[
          Naja, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'init' extends 'init' | 'before' | 'start' | 'abort' | 'payload' | 'success' | 'error' | 'complete' ? naja.naja/dist/Naja.InitEvent : std.CustomEvent<any> */ js.Any
        ]
    ): Unit = js.native
    def removeEventListener(
      `type`: init,
      listener: TypedEventListener[
          Naja, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'init' extends 'init' | 'before' | 'start' | 'abort' | 'payload' | 'success' | 'error' | 'complete' ? naja.naja/dist/Naja.InitEvent : std.CustomEvent<any> */ js.Any
        ],
      options: Boolean
    ): Unit = js.native
    def removeEventListener(
      `type`: init,
      listener: TypedEventListener[
          Naja, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'init' extends 'init' | 'before' | 'start' | 'abort' | 'payload' | 'success' | 'error' | 'complete' ? naja.naja/dist/Naja.InitEvent : std.CustomEvent<any> */ js.Any
        ],
      options: AddEventListenerOptions
    ): Unit = js.native
    def removeEventListener(
      `type`: payload,
      listener: TypedEventListener[
          Naja, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'payload' extends 'init' | 'before' | 'start' | 'abort' | 'payload' | 'success' | 'error' | 'complete' ? naja.naja/dist/Naja.PayloadEvent : std.CustomEvent<any> */ js.Any
        ]
    ): Unit = js.native
    def removeEventListener(
      `type`: payload,
      listener: TypedEventListener[
          Naja, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'payload' extends 'init' | 'before' | 'start' | 'abort' | 'payload' | 'success' | 'error' | 'complete' ? naja.naja/dist/Naja.PayloadEvent : std.CustomEvent<any> */ js.Any
        ],
      options: Boolean
    ): Unit = js.native
    def removeEventListener(
      `type`: payload,
      listener: TypedEventListener[
          Naja, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'payload' extends 'init' | 'before' | 'start' | 'abort' | 'payload' | 'success' | 'error' | 'complete' ? naja.naja/dist/Naja.PayloadEvent : std.CustomEvent<any> */ js.Any
        ],
      options: AddEventListenerOptions
    ): Unit = js.native
    def removeEventListener(
      `type`: start,
      listener: TypedEventListener[
          Naja, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'start' extends 'init' | 'before' | 'start' | 'abort' | 'payload' | 'success' | 'error' | 'complete' ? naja.naja/dist/Naja.StartEvent : std.CustomEvent<any> */ js.Any
        ]
    ): Unit = js.native
    def removeEventListener(
      `type`: start,
      listener: TypedEventListener[
          Naja, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'start' extends 'init' | 'before' | 'start' | 'abort' | 'payload' | 'success' | 'error' | 'complete' ? naja.naja/dist/Naja.StartEvent : std.CustomEvent<any> */ js.Any
        ],
      options: Boolean
    ): Unit = js.native
    def removeEventListener(
      `type`: start,
      listener: TypedEventListener[
          Naja, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'start' extends 'init' | 'before' | 'start' | 'abort' | 'payload' | 'success' | 'error' | 'complete' ? naja.naja/dist/Naja.StartEvent : std.CustomEvent<any> */ js.Any
        ],
      options: AddEventListenerOptions
    ): Unit = js.native
    def removeEventListener(
      `type`: success,
      listener: TypedEventListener[
          Naja, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'success' extends 'init' | 'before' | 'start' | 'abort' | 'payload' | 'success' | 'error' | 'complete' ? naja.naja/dist/Naja.SuccessEvent : std.CustomEvent<any> */ js.Any
        ]
    ): Unit = js.native
    def removeEventListener(
      `type`: success,
      listener: TypedEventListener[
          Naja, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'success' extends 'init' | 'before' | 'start' | 'abort' | 'payload' | 'success' | 'error' | 'complete' ? naja.naja/dist/Naja.SuccessEvent : std.CustomEvent<any> */ js.Any
        ],
      options: Boolean
    ): Unit = js.native
    def removeEventListener(
      `type`: success,
      listener: TypedEventListener[
          Naja, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'success' extends 'init' | 'before' | 'start' | 'abort' | 'payload' | 'success' | 'error' | 'complete' ? naja.naja/dist/Naja.SuccessEvent : std.CustomEvent<any> */ js.Any
        ],
      options: AddEventListenerOptions
    ): Unit = js.native
    
    val scriptLoader: ScriptLoader = js.native
    
    val snippetCache: SnippetCache = js.native
    
    val snippetHandler: SnippetHandler = js.native
    
    /* private */ var transformData: Any = js.native
    
    val uiHandler: UIHandler = js.native
  }
  
  type AbortEvent = CustomEvent
  
  type BeforeEvent = CustomEvent
  
  type CompleteEvent = CustomEvent
  
  type ErrorEvent = CustomEvent
  
  trait Extension extends StObject {
    
    def initialize(naja: Naja): Unit
  }
  object Extension {
    
    inline def apply(initialize: Naja => Callback): Extension = {
      val __obj = js.Dynamic.literal(initialize = js.Any.fromFunction1((t0: Naja) => initialize(t0).runNow()))
      __obj.asInstanceOf[Extension]
    }
    
    extension [Self <: Extension](x: Self) {
      
      inline def setInitialize(value: Naja => Callback): Self = StObject.set(x, "initialize", js.Any.fromFunction1((t0: Naja) => value(t0).runNow()))
    }
  }
  
  type InitEvent = CustomEvent
  
  trait NajaEventMap extends StObject {
    
    var abort: CustomEvent
    
    var before: CustomEvent
    
    var complete: CustomEvent
    
    var error: CustomEvent
    
    var init: CustomEvent
    
    var payload: CustomEvent
    
    var start: CustomEvent
    
    var success: CustomEvent
  }
  object NajaEventMap {
    
    inline def apply(
      abort: CustomEvent,
      before: CustomEvent,
      complete: CustomEvent,
      error: CustomEvent,
      init: CustomEvent,
      payload: CustomEvent,
      start: CustomEvent,
      success: CustomEvent
    ): NajaEventMap = {
      val __obj = js.Dynamic.literal(abort = abort.asInstanceOf[js.Any], before = before.asInstanceOf[js.Any], complete = complete.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], init = init.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
      __obj.asInstanceOf[NajaEventMap]
    }
    
    extension [Self <: NajaEventMap](x: Self) {
      
      inline def setAbort(value: CustomEvent): Self = StObject.set(x, "abort", value.asInstanceOf[js.Any])
      
      inline def setBefore(value: CustomEvent): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
      
      inline def setComplete(value: CustomEvent): Self = StObject.set(x, "complete", value.asInstanceOf[js.Any])
      
      inline def setError(value: CustomEvent): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setInit(value: CustomEvent): Self = StObject.set(x, "init", value.asInstanceOf[js.Any])
      
      inline def setPayload(value: CustomEvent): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      inline def setStart(value: CustomEvent): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setSuccess(value: CustomEvent): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in string ]: any} */ trait Options extends StObject {
    
    var abort: js.UndefOr[Boolean] = js.undefined
    
    var fetch: js.UndefOr[RequestInit] = js.undefined
    
    var forceRedirect: js.UndefOr[Boolean] = js.undefined
    
    var history: js.UndefOr[HistoryMode] = js.undefined
    
    var href: js.UndefOr[String] = js.undefined
    
    var snippetCache: js.UndefOr[Boolean | SnippetCacheStorageType] = js.undefined
    
    var unique: js.UndefOr[String | `false`] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAbort(value: Boolean): Self = StObject.set(x, "abort", value.asInstanceOf[js.Any])
      
      inline def setAbortUndefined: Self = StObject.set(x, "abort", js.undefined)
      
      inline def setFetch(value: RequestInit): Self = StObject.set(x, "fetch", value.asInstanceOf[js.Any])
      
      inline def setFetchUndefined: Self = StObject.set(x, "fetch", js.undefined)
      
      inline def setForceRedirect(value: Boolean): Self = StObject.set(x, "forceRedirect", value.asInstanceOf[js.Any])
      
      inline def setForceRedirectUndefined: Self = StObject.set(x, "forceRedirect", js.undefined)
      
      inline def setHistory(value: HistoryMode): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
      
      inline def setHistoryUndefined: Self = StObject.set(x, "history", js.undefined)
      
      inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
      
      inline def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
      
      inline def setSnippetCache(value: Boolean | SnippetCacheStorageType): Self = StObject.set(x, "snippetCache", value.asInstanceOf[js.Any])
      
      inline def setSnippetCacheUndefined: Self = StObject.set(x, "snippetCache", js.undefined)
      
      inline def setUnique(value: String | `false`): Self = StObject.set(x, "unique", value.asInstanceOf[js.Any])
      
      inline def setUniqueUndefined: Self = StObject.set(x, "unique", js.undefined)
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in string ]: any} */ trait Payload extends StObject {
    
    var postGet: js.UndefOr[Boolean] = js.undefined
    
    var redirect: js.UndefOr[String] = js.undefined
    
    var snippets: js.UndefOr[Record[String, String]] = js.undefined
    
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
      
      inline def setRedirect(value: String): Self = StObject.set(x, "redirect", value.asInstanceOf[js.Any])
      
      inline def setRedirectUndefined: Self = StObject.set(x, "redirect", js.undefined)
      
      inline def setSnippets(value: Record[String, String]): Self = StObject.set(x, "snippets", value.asInstanceOf[js.Any])
      
      inline def setSnippetsUndefined: Self = StObject.set(x, "snippets", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  type PayloadEvent = CustomEvent
  
  type StartEvent = CustomEvent
  
  type SuccessEvent = CustomEvent
}
