package typingsJapgolly.naja

import japgolly.scalajs.react.Callback
import org.scalajs.dom.CustomEvent
import org.scalajs.dom.URL
import typingsJapgolly.naja.distNajaMod.Naja
import typingsJapgolly.naja.distNajaMod.Options
import typingsJapgolly.naja.distUtilsMod.TypedEventListener
import typingsJapgolly.naja.najaStrings.redirect
import typingsJapgolly.std.AddEventListenerOptions
import typingsJapgolly.std.EventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCoreRedirectHandlerMod {
  
  @JSImport("naja/dist/core/RedirectHandler", "RedirectHandler")
  @js.native
  open class RedirectHandler protected ()
    extends StObject
       with EventTarget {
    def this(naja: Naja) = this()
    
    @JSName("addEventListener")
    def addEventListener_redirect(
      `type`: String,
      listener: TypedEventListener[
          RedirectHandler, 
          /* import warning: importer.ImportType#apply Failed type conversion: string extends 'redirect' ? naja.naja/dist/core/RedirectHandler.RedirectHandlerEventMap[string] : std.CustomEvent<any> */ js.Any
        ]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_redirect(
      `type`: String,
      listener: TypedEventListener[
          RedirectHandler, 
          /* import warning: importer.ImportType#apply Failed type conversion: string extends 'redirect' ? naja.naja/dist/core/RedirectHandler.RedirectHandlerEventMap[string] : std.CustomEvent<any> */ js.Any
        ],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_redirect(
      `type`: String,
      listener: TypedEventListener[
          RedirectHandler, 
          /* import warning: importer.ImportType#apply Failed type conversion: string extends 'redirect' ? naja.naja/dist/core/RedirectHandler.RedirectHandlerEventMap[string] : std.CustomEvent<any> */ js.Any
        ],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_redirect(
      `type`: redirect,
      listener: TypedEventListener[
          RedirectHandler, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'redirect' extends 'redirect' ? naja.naja/dist/core/RedirectHandler.RedirectEvent : std.CustomEvent<any> */ js.Any
        ]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_redirect(
      `type`: redirect,
      listener: TypedEventListener[
          RedirectHandler, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'redirect' extends 'redirect' ? naja.naja/dist/core/RedirectHandler.RedirectEvent : std.CustomEvent<any> */ js.Any
        ],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_redirect(
      `type`: redirect,
      listener: TypedEventListener[
          RedirectHandler, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'redirect' extends 'redirect' ? naja.naja/dist/core/RedirectHandler.RedirectEvent : std.CustomEvent<any> */ js.Any
        ],
      options: AddEventListenerOptions
    ): Unit = js.native
    
    var locationAdapter: LocationAdapter = js.native
    
    def makeRedirect(url: String, force: Boolean): Unit = js.native
    def makeRedirect(url: String, force: Boolean, options: Options): Unit = js.native
    def makeRedirect(url: URL, force: Boolean): Unit = js.native
    def makeRedirect(url: URL, force: Boolean, options: Options): Unit = js.native
    
    /* private */ val naja: Any = js.native
    
    @JSName("removeEventListener")
    def removeEventListener_redirect(
      `type`: String,
      listener: TypedEventListener[
          RedirectHandler, 
          /* import warning: importer.ImportType#apply Failed type conversion: string extends 'redirect' ? naja.naja/dist/core/RedirectHandler.RedirectHandlerEventMap[string] : std.CustomEvent<any> */ js.Any
        ]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_redirect(
      `type`: String,
      listener: TypedEventListener[
          RedirectHandler, 
          /* import warning: importer.ImportType#apply Failed type conversion: string extends 'redirect' ? naja.naja/dist/core/RedirectHandler.RedirectHandlerEventMap[string] : std.CustomEvent<any> */ js.Any
        ],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_redirect(
      `type`: String,
      listener: TypedEventListener[
          RedirectHandler, 
          /* import warning: importer.ImportType#apply Failed type conversion: string extends 'redirect' ? naja.naja/dist/core/RedirectHandler.RedirectHandlerEventMap[string] : std.CustomEvent<any> */ js.Any
        ],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_redirect(
      `type`: redirect,
      listener: TypedEventListener[
          RedirectHandler, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'redirect' extends 'redirect' ? naja.naja/dist/core/RedirectHandler.RedirectEvent : std.CustomEvent<any> */ js.Any
        ]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_redirect(
      `type`: redirect,
      listener: TypedEventListener[
          RedirectHandler, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'redirect' extends 'redirect' ? naja.naja/dist/core/RedirectHandler.RedirectEvent : std.CustomEvent<any> */ js.Any
        ],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_redirect(
      `type`: redirect,
      listener: TypedEventListener[
          RedirectHandler, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'redirect' extends 'redirect' ? naja.naja/dist/core/RedirectHandler.RedirectEvent : std.CustomEvent<any> */ js.Any
        ],
      options: AddEventListenerOptions
    ): Unit = js.native
  }
  
  trait LocationAdapter extends StObject {
    
    def assign(url: String): Unit
  }
  object LocationAdapter {
    
    inline def apply(assign: String => Callback): LocationAdapter = {
      val __obj = js.Dynamic.literal(assign = js.Any.fromFunction1((t0: String) => assign(t0).runNow()))
      __obj.asInstanceOf[LocationAdapter]
    }
    
    extension [Self <: LocationAdapter](x: Self) {
      
      inline def setAssign(value: String => Callback): Self = StObject.set(x, "assign", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    }
  }
  
  type RedirectEvent = CustomEvent
  
  trait RedirectHandlerEventMap extends StObject {
    
    var redirect: CustomEvent
  }
  object RedirectHandlerEventMap {
    
    inline def apply(redirect: CustomEvent): RedirectHandlerEventMap = {
      val __obj = js.Dynamic.literal(redirect = redirect.asInstanceOf[js.Any])
      __obj.asInstanceOf[RedirectHandlerEventMap]
    }
    
    extension [Self <: RedirectHandlerEventMap](x: Self) {
      
      inline def setRedirect(value: CustomEvent): Self = StObject.set(x, "redirect", value.asInstanceOf[js.Any])
    }
  }
  
  /* augmented module */
  object najaDistNajaAugmentingMod {
    
    trait Options extends StObject {
      
      var forceRedirect: js.UndefOr[Boolean] = js.undefined
    }
    object Options {
      
      inline def apply(): typingsJapgolly.naja.distCoreRedirectHandlerMod.najaDistNajaAugmentingMod.Options = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typingsJapgolly.naja.distCoreRedirectHandlerMod.najaDistNajaAugmentingMod.Options]
      }
      
      extension [Self <: typingsJapgolly.naja.distCoreRedirectHandlerMod.najaDistNajaAugmentingMod.Options](x: Self) {
        
        inline def setForceRedirect(value: Boolean): Self = StObject.set(x, "forceRedirect", value.asInstanceOf[js.Any])
        
        inline def setForceRedirectUndefined: Self = StObject.set(x, "forceRedirect", js.undefined)
      }
    }
    
    trait Payload extends StObject {
      
      var redirect: js.UndefOr[String] = js.undefined
    }
    object Payload {
      
      inline def apply(): Payload = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Payload]
      }
      
      extension [Self <: Payload](x: Self) {
        
        inline def setRedirect(value: String): Self = StObject.set(x, "redirect", value.asInstanceOf[js.Any])
        
        inline def setRedirectUndefined: Self = StObject.set(x, "redirect", js.undefined)
      }
    }
  }
}
