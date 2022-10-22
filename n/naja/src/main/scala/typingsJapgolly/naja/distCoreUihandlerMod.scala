package typingsJapgolly.naja

import org.scalajs.dom.CustomEvent
import org.scalajs.dom.Element
import org.scalajs.dom.Event
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.HTMLFormElement
import org.scalajs.dom.MouseEvent
import org.scalajs.dom.URL
import typingsJapgolly.naja.distNajaMod.Naja
import typingsJapgolly.naja.distNajaMod.Options
import typingsJapgolly.naja.distNajaMod.Payload
import typingsJapgolly.naja.distUtilsMod.TypedEventListener
import typingsJapgolly.naja.najaStrings.interaction
import typingsJapgolly.std.AddEventListenerOptions
import typingsJapgolly.std.EventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCoreUihandlerMod {
  
  @JSImport("naja/dist/core/UIHandler", "UIHandler")
  @js.native
  open class UIHandler protected ()
    extends StObject
       with EventTarget {
    def this(naja: Naja) = this()
    
    @JSName("addEventListener")
    def addEventListener_interaction(
      `type`: String,
      listener: TypedEventListener[
          UIHandler, 
          /* import warning: importer.ImportType#apply Failed type conversion: string extends 'interaction' ? naja.naja/dist/core/UIHandler.UIHandlerEventMap[string] : std.CustomEvent<any> */ js.Any
        ]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_interaction(
      `type`: String,
      listener: TypedEventListener[
          UIHandler, 
          /* import warning: importer.ImportType#apply Failed type conversion: string extends 'interaction' ? naja.naja/dist/core/UIHandler.UIHandlerEventMap[string] : std.CustomEvent<any> */ js.Any
        ],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_interaction(
      `type`: String,
      listener: TypedEventListener[
          UIHandler, 
          /* import warning: importer.ImportType#apply Failed type conversion: string extends 'interaction' ? naja.naja/dist/core/UIHandler.UIHandlerEventMap[string] : std.CustomEvent<any> */ js.Any
        ],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_interaction(
      `type`: interaction,
      listener: TypedEventListener[
          UIHandler, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'interaction' extends 'interaction' ? naja.naja/dist/core/UIHandler.InteractionEvent : std.CustomEvent<any> */ js.Any
        ]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_interaction(
      `type`: interaction,
      listener: TypedEventListener[
          UIHandler, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'interaction' extends 'interaction' ? naja.naja/dist/core/UIHandler.InteractionEvent : std.CustomEvent<any> */ js.Any
        ],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_interaction(
      `type`: interaction,
      listener: TypedEventListener[
          UIHandler, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'interaction' extends 'interaction' ? naja.naja/dist/core/UIHandler.InteractionEvent : std.CustomEvent<any> */ js.Any
        ],
      options: AddEventListenerOptions
    ): Unit = js.native
    
    var allowedOrigins: js.Array[String | URL] = js.native
    
    def bindUI(element: Element): Unit = js.native
    
    def clickElement(element: HTMLElement): js.Promise[Payload] = js.native
    def clickElement(element: HTMLElement, options: Unit, event: MouseEvent): js.Promise[Payload] = js.native
    def clickElement(element: HTMLElement, options: Options): js.Promise[Payload] = js.native
    def clickElement(element: HTMLElement, options: Options, event: MouseEvent): js.Promise[Payload] = js.native
    
    /* private */ var handleUI: Any = js.native
    
    /* private */ var handler: Any = js.native
    
    /* private */ var initialize: Any = js.native
    
    def isUrlAllowed(url: String): Boolean = js.native
    
    /* private */ val naja: Any = js.native
    
    @JSName("removeEventListener")
    def removeEventListener_interaction(
      `type`: String,
      listener: TypedEventListener[
          UIHandler, 
          /* import warning: importer.ImportType#apply Failed type conversion: string extends 'interaction' ? naja.naja/dist/core/UIHandler.UIHandlerEventMap[string] : std.CustomEvent<any> */ js.Any
        ]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_interaction(
      `type`: String,
      listener: TypedEventListener[
          UIHandler, 
          /* import warning: importer.ImportType#apply Failed type conversion: string extends 'interaction' ? naja.naja/dist/core/UIHandler.UIHandlerEventMap[string] : std.CustomEvent<any> */ js.Any
        ],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_interaction(
      `type`: String,
      listener: TypedEventListener[
          UIHandler, 
          /* import warning: importer.ImportType#apply Failed type conversion: string extends 'interaction' ? naja.naja/dist/core/UIHandler.UIHandlerEventMap[string] : std.CustomEvent<any> */ js.Any
        ],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_interaction(
      `type`: interaction,
      listener: TypedEventListener[
          UIHandler, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'interaction' extends 'interaction' ? naja.naja/dist/core/UIHandler.InteractionEvent : std.CustomEvent<any> */ js.Any
        ]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_interaction(
      `type`: interaction,
      listener: TypedEventListener[
          UIHandler, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'interaction' extends 'interaction' ? naja.naja/dist/core/UIHandler.InteractionEvent : std.CustomEvent<any> */ js.Any
        ],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_interaction(
      `type`: interaction,
      listener: TypedEventListener[
          UIHandler, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'interaction' extends 'interaction' ? naja.naja/dist/core/UIHandler.InteractionEvent : std.CustomEvent<any> */ js.Any
        ],
      options: AddEventListenerOptions
    ): Unit = js.native
    
    var selector: String = js.native
    
    def submitForm(form: HTMLFormElement): js.Promise[Payload] = js.native
    def submitForm(form: HTMLFormElement, options: Unit, event: Event): js.Promise[Payload] = js.native
    def submitForm(form: HTMLFormElement, options: Options): js.Promise[Payload] = js.native
    def submitForm(form: HTMLFormElement, options: Options, event: Event): js.Promise[Payload] = js.native
  }
  
  type InteractionEvent = CustomEvent
  
  trait UIHandlerEventMap extends StObject {
    
    var interaction: CustomEvent
  }
  object UIHandlerEventMap {
    
    inline def apply(interaction: CustomEvent): UIHandlerEventMap = {
      val __obj = js.Dynamic.literal(interaction = interaction.asInstanceOf[js.Any])
      __obj.asInstanceOf[UIHandlerEventMap]
    }
    
    extension [Self <: UIHandlerEventMap](x: Self) {
      
      inline def setInteraction(value: CustomEvent): Self = StObject.set(x, "interaction", value.asInstanceOf[js.Any])
    }
  }
}
