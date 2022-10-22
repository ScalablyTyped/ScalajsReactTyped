package typingsJapgolly.ckeditorCkeditor5Engine

import typingsJapgolly.ckeditorCkeditor5Engine.anon.Priority
import typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.$text
import typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.$textProxy
import typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.attributeElement
import typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.containerElement
import typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.documentFragment
import typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.documentSelection
import typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.editableElement
import typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.element
import typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.emptyElement
import typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.node
import typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.position
import typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.range
import typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.rawElement
import typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.rootEditableElement
import typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.selection
import typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.text
import typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.textProxy
import typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.uiElement
import typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.viewColon$text
import typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.viewColon$textProxy
import typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.viewColonattributeElement
import typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.viewColoncontainerElement
import typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.viewColondocumentFragment
import typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.viewColondocumentSelection
import typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.viewColoneditableElement
import typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.viewColonelement
import typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.viewColonemptyElement
import typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.viewColonnode
import typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.viewColonposition
import typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.viewColonrange
import typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.viewColonrawElement
import typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.viewColonrootEditableElement
import typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.viewColonselection
import typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.viewColontext
import typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.viewColontextProxy
import typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.viewColonuiElement
import typingsJapgolly.ckeditorCkeditor5Engine.srcConversionUpcastdispatcherMod.ViewItem
import typingsJapgolly.ckeditorCkeditor5Engine.srcViewItemMod.Item
import typingsJapgolly.std.Iterable
import typingsJapgolly.std.IterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcViewDocumentfragmentMod {
  
  @JSImport("@ckeditor/ckeditor5-engine/src/view/documentfragment", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with DocumentFragment
       with ViewItem
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Emitter * / any */ @js.native
  trait DocumentFragment
    extends StObject
       with Iterable[typingsJapgolly.ckeditorCkeditor5Engine.srcViewNodeMod.default] {
    
    def _appendChild(items: js.Iterable[Item]): Double = js.native
    def _appendChild(items: Item): Double = js.native
    
    def _insertChild(index: Double, items: js.Iterable[Item]): Double = js.native
    def _insertChild(index: Double, items: Item): Double = js.native
    
    def _removeChildren(index: Double): js.Array[typingsJapgolly.ckeditorCkeditor5Engine.srcViewNodeMod.default] = js.native
    def _removeChildren(index: Double, howMany: Double): js.Array[typingsJapgolly.ckeditorCkeditor5Engine.srcViewNodeMod.default] = js.native
    
    val childCount: Double = js.native
    
    def delegate(events: String*): Any = js.native
    
    val document: typingsJapgolly.ckeditorCkeditor5Engine.srcViewDocumentMod.default = js.native
    
    def fire(eventOrInfo: String, args: Any*): Any = js.native
    def fire(
      eventOrInfo: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventInfo */ Any,
      args: Any*
    ): Any = js.native
    
    def getChild(index: Double): typingsJapgolly.ckeditorCkeditor5Engine.srcViewNodeMod.default = js.native
    
    def getChildIndex(node: typingsJapgolly.ckeditorCkeditor5Engine.srcViewNodeMod.default): Double = js.native
    
    def getChildren(): IterableIterator[typingsJapgolly.ckeditorCkeditor5Engine.srcViewNodeMod.default] = js.native
    
    def is(
      `type`: $text | $textProxy | attributeElement | containerElement | documentFragment | documentSelection | editableElement | element | emptyElement | node | position | range | rawElement | rootEditableElement | selection | text | textProxy | uiElement | viewColon$text | viewColon$textProxy | viewColonattributeElement | viewColoncontainerElement | viewColondocumentFragment | viewColondocumentSelection | viewColoneditableElement | viewColonelement | viewColonemptyElement | viewColonnode | viewColonposition | viewColonrange | viewColonrawElement | viewColonrootEditableElement | viewColonselection | viewColontext | viewColontextProxy | viewColonuiElement
    ): Boolean = js.native
    def is(`type`: String): Boolean = js.native
    def is(`type`: String, name: String): Boolean = js.native
    def is[K /* <: String */](
      `type`: attributeElement | containerElement | editableElement | element | emptyElement | rawElement | rootEditableElement | uiElement | viewColonattributeElement | viewColoncontainerElement | viewColoneditableElement | viewColonelement | viewColonemptyElement | viewColonrawElement | viewColonrootEditableElement | viewColonuiElement,
      name: K
    ): Boolean = js.native
    
    val isEmpty: Boolean = js.native
    
    def listenTo[P /* <: String */, E /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Emitter */ Any */](
      emitter: E,
      event: P,
      callback: js.Function2[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventInfo<E, P> */ /* info */ Any, 
          /* repeated */ Any, 
          Unit
        ]
    ): Unit = js.native
    def listenTo[P /* <: String */, E /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Emitter */ Any */](
      emitter: E,
      event: P,
      callback: js.Function2[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventInfo<E, P> */ /* info */ Any, 
          /* repeated */ Any, 
          Unit
        ],
      options: Priority
    ): Unit = js.native
    
    def off[K /* <: String */](event: K): Unit = js.native
    def off[K /* <: String */](
      event: K,
      callback: js.Function2[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventInfo<this, K> */ /* info */ Any, 
          /* repeated */ Any, 
          Unit
        ]
    ): Unit = js.native
    
    def on[K /* <: String */](
      event: K,
      callback: js.Function2[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventInfo<this, K> */ /* info */ Any, 
          /* repeated */ Any, 
          Unit
        ]
    ): Unit = js.native
    def on[K /* <: String */](
      event: K,
      callback: js.Function2[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventInfo<this, K> */ /* info */ Any, 
          /* repeated */ Any, 
          Unit
        ],
      options: Priority
    ): Unit = js.native
    
    def once[K /* <: String */](
      event: K,
      callback: js.Function2[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventInfo<this, K> */ /* ev */ Any, 
          /* repeated */ Any, 
          Unit
        ]
    ): Unit = js.native
    def once[K /* <: String */](
      event: K,
      callback: js.Function2[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventInfo<this, K> */ /* ev */ Any, 
          /* repeated */ Any, 
          Unit
        ],
      options: Priority
    ): Unit = js.native
    
    val parent: Null = js.native
    
    val root: this.type = js.native
    
    def stopDelegating(): Unit = js.native
    def stopDelegating(event: String): Unit = js.native
    def stopDelegating(
      event: String,
      emitter: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Emitter */ Any
    ): Unit = js.native
    def stopDelegating(
      event: Unit,
      emitter: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Emitter */ Any
    ): Unit = js.native
    
    def stopListening[E /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Emitter */ Any */, P /* <: String */](): Unit = js.native
    def stopListening[E /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Emitter */ Any */, P /* <: String */](emitter: E): Unit = js.native
    def stopListening[E /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Emitter */ Any */, P /* <: String */](emitter: E, event: P): Unit = js.native
    def stopListening[E /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Emitter */ Any */, P /* <: String */](
      emitter: E,
      event: P,
      callback: js.Function2[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventInfo<E, P> */ /* info */ Any, 
          /* repeated */ Any, 
          Unit
        ]
    ): Unit = js.native
    def stopListening[E /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Emitter */ Any */, P /* <: String */](
      emitter: E,
      event: Unit,
      callback: js.Function2[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventInfo<E, P> */ /* info */ Any, 
          /* repeated */ Any, 
          Unit
        ]
    ): Unit = js.native
    def stopListening[E /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Emitter */ Any */, P /* <: String */](emitter: Unit, event: P): Unit = js.native
    def stopListening[E /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Emitter */ Any */, P /* <: String */](
      emitter: Unit,
      event: P,
      callback: js.Function2[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventInfo<E, P> */ /* info */ Any, 
          /* repeated */ Any, 
          Unit
        ]
    ): Unit = js.native
    def stopListening[E /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Emitter */ Any */, P /* <: String */](
      emitter: Unit,
      event: Unit,
      callback: js.Function2[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventInfo<E, P> */ /* info */ Any, 
          /* repeated */ Any, 
          Unit
        ]
    ): Unit = js.native
  }
}
