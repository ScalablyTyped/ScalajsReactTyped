package typingsJapgolly.naja

import org.scalajs.dom.CustomEvent
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLElement
import typingsJapgolly.naja.anon.Recordreplaceprependappen
import typingsJapgolly.naja.distNajaMod.Naja
import typingsJapgolly.naja.distNajaMod.Options
import typingsJapgolly.naja.distUtilsMod.TypedEventListener
import typingsJapgolly.naja.najaStrings.afterUpdate
import typingsJapgolly.naja.najaStrings.beforeUpdate
import typingsJapgolly.std.AddEventListenerOptions
import typingsJapgolly.std.EventTarget
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCoreSnippetHandlerMod {
  
  @JSImport("naja/dist/core/SnippetHandler", "SnippetHandler")
  @js.native
  open class SnippetHandler protected ()
    extends StObject
       with EventTarget {
    def this(naja: Naja) = this()
    
    def addEventListener(
      `type`: afterUpdate,
      listener: TypedEventListener[
          SnippetHandler, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'afterUpdate' extends 'beforeUpdate' | 'afterUpdate' ? naja.naja/dist/core/SnippetHandler.AfterUpdateEvent : std.CustomEvent<any> */ js.Any
        ]
    ): Unit = js.native
    def addEventListener(
      `type`: afterUpdate,
      listener: TypedEventListener[
          SnippetHandler, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'afterUpdate' extends 'beforeUpdate' | 'afterUpdate' ? naja.naja/dist/core/SnippetHandler.AfterUpdateEvent : std.CustomEvent<any> */ js.Any
        ],
      options: Boolean
    ): Unit = js.native
    def addEventListener(
      `type`: afterUpdate,
      listener: TypedEventListener[
          SnippetHandler, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'afterUpdate' extends 'beforeUpdate' | 'afterUpdate' ? naja.naja/dist/core/SnippetHandler.AfterUpdateEvent : std.CustomEvent<any> */ js.Any
        ],
      options: AddEventListenerOptions
    ): Unit = js.native
    def addEventListener(
      `type`: beforeUpdate,
      listener: TypedEventListener[
          SnippetHandler, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'beforeUpdate' extends 'beforeUpdate' | 'afterUpdate' ? naja.naja/dist/core/SnippetHandler.BeforeUpdateEvent : std.CustomEvent<any> */ js.Any
        ]
    ): Unit = js.native
    def addEventListener(
      `type`: beforeUpdate,
      listener: TypedEventListener[
          SnippetHandler, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'beforeUpdate' extends 'beforeUpdate' | 'afterUpdate' ? naja.naja/dist/core/SnippetHandler.BeforeUpdateEvent : std.CustomEvent<any> */ js.Any
        ],
      options: Boolean
    ): Unit = js.native
    def addEventListener(
      `type`: beforeUpdate,
      listener: TypedEventListener[
          SnippetHandler, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'beforeUpdate' extends 'beforeUpdate' | 'afterUpdate' ? naja.naja/dist/core/SnippetHandler.BeforeUpdateEvent : std.CustomEvent<any> */ js.Any
        ],
      options: AddEventListenerOptions
    ): Unit = js.native
    
    /* private */ val naja: Any = js.native
    
    val op: Recordreplaceprependappen = js.native
    
    def removeEventListener(
      `type`: String,
      listener: TypedEventListener[
          SnippetHandler, 
          /* import warning: importer.ImportType#apply Failed type conversion: string extends 'beforeUpdate' | 'afterUpdate' ? naja.naja/dist/core/SnippetHandler.SnippetHandlerEventMap[string] : std.CustomEvent<any> */ js.Any
        ],
      options: AddEventListenerOptions
    ): Unit = js.native
    def removeEventListener(
      `type`: afterUpdate,
      listener: TypedEventListener[
          SnippetHandler, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'afterUpdate' extends 'beforeUpdate' | 'afterUpdate' ? naja.naja/dist/core/SnippetHandler.AfterUpdateEvent : std.CustomEvent<any> */ js.Any
        ]
    ): Unit = js.native
    def removeEventListener(
      `type`: afterUpdate,
      listener: TypedEventListener[
          SnippetHandler, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'afterUpdate' extends 'beforeUpdate' | 'afterUpdate' ? naja.naja/dist/core/SnippetHandler.AfterUpdateEvent : std.CustomEvent<any> */ js.Any
        ],
      options: Boolean
    ): Unit = js.native
    def removeEventListener(
      `type`: afterUpdate,
      listener: TypedEventListener[
          SnippetHandler, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'afterUpdate' extends 'beforeUpdate' | 'afterUpdate' ? naja.naja/dist/core/SnippetHandler.AfterUpdateEvent : std.CustomEvent<any> */ js.Any
        ],
      options: AddEventListenerOptions
    ): Unit = js.native
    def removeEventListener(
      `type`: beforeUpdate,
      listener: TypedEventListener[
          SnippetHandler, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'beforeUpdate' extends 'beforeUpdate' | 'afterUpdate' ? naja.naja/dist/core/SnippetHandler.BeforeUpdateEvent : std.CustomEvent<any> */ js.Any
        ]
    ): Unit = js.native
    def removeEventListener(
      `type`: beforeUpdate,
      listener: TypedEventListener[
          SnippetHandler, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'beforeUpdate' extends 'beforeUpdate' | 'afterUpdate' ? naja.naja/dist/core/SnippetHandler.BeforeUpdateEvent : std.CustomEvent<any> */ js.Any
        ],
      options: Boolean
    ): Unit = js.native
    def removeEventListener(
      `type`: beforeUpdate,
      listener: TypedEventListener[
          SnippetHandler, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'beforeUpdate' extends 'beforeUpdate' | 'afterUpdate' ? naja.naja/dist/core/SnippetHandler.BeforeUpdateEvent : std.CustomEvent<any> */ js.Any
        ],
      options: AddEventListenerOptions
    ): Unit = js.native
    
    def updateSnippet(snippet: HTMLElement, content: String, fromCache: Boolean, options: Options): Unit = js.native
    
    def updateSnippets(snippets: Record[String, String]): Unit = js.native
    def updateSnippets(snippets: Record[String, String], fromCache: Boolean): Unit = js.native
    def updateSnippets(snippets: Record[String, String], fromCache: Boolean, options: Options): Unit = js.native
    def updateSnippets(snippets: Record[String, String], fromCache: Unit, options: Options): Unit = js.native
  }
  /* static members */
  object SnippetHandler {
    
    @JSImport("naja/dist/core/SnippetHandler", "SnippetHandler")
    @js.native
    val ^ : js.Any = js.native
    
    inline def findSnippets(): Record[String, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("findSnippets")().asInstanceOf[Record[String, String]]
    inline def findSnippets(predicate: js.Function1[/* snippet */ Element, Boolean]): Record[String, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("findSnippets")(predicate.asInstanceOf[js.Any]).asInstanceOf[Record[String, String]]
  }
  
  type AfterUpdateEvent = CustomEvent
  
  type BeforeUpdateEvent = CustomEvent
  
  trait SnippetHandlerEventMap extends StObject {
    
    var afterUpdate: CustomEvent
    
    var beforeUpdate: CustomEvent
  }
  object SnippetHandlerEventMap {
    
    inline def apply(afterUpdate: CustomEvent, beforeUpdate: CustomEvent): SnippetHandlerEventMap = {
      val __obj = js.Dynamic.literal(afterUpdate = afterUpdate.asInstanceOf[js.Any], beforeUpdate = beforeUpdate.asInstanceOf[js.Any])
      __obj.asInstanceOf[SnippetHandlerEventMap]
    }
    
    extension [Self <: SnippetHandlerEventMap](x: Self) {
      
      inline def setAfterUpdate(value: CustomEvent): Self = StObject.set(x, "afterUpdate", value.asInstanceOf[js.Any])
      
      inline def setBeforeUpdate(value: CustomEvent): Self = StObject.set(x, "beforeUpdate", value.asInstanceOf[js.Any])
    }
  }
  
  type SnippetUpdateOperation = js.Function2[/* snippet */ Element, /* content */ String, Unit]
  
  /* augmented module */
  object najaDistNajaAugmentingMod {
    
    trait Payload extends StObject {
      
      var snippets: js.UndefOr[Record[String, String]] = js.undefined
    }
    object Payload {
      
      inline def apply(): Payload = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Payload]
      }
      
      extension [Self <: Payload](x: Self) {
        
        inline def setSnippets(value: Record[String, String]): Self = StObject.set(x, "snippets", value.asInstanceOf[js.Any])
        
        inline def setSnippetsUndefined: Self = StObject.set(x, "snippets", js.undefined)
      }
    }
  }
}
