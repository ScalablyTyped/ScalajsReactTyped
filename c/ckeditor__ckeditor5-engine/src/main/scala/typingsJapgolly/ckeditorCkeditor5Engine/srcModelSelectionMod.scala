package typingsJapgolly.ckeditorCkeditor5Engine

import typingsJapgolly.ckeditorCkeditor5Engine.anon.Backward
import typingsJapgolly.ckeditorCkeditor5Engine.anon.Priority
import typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.$text
import typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.$textProxy
import typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.after
import typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.before
import typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.documentFragment
import typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.documentSelection
import typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.element
import typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.end
import typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.in
import typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.livePosition
import typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.liveRange
import typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.marker
import typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.modelColon$text
import typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.modelColon$textProxy
import typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.modelColondocumentFragment
import typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.modelColondocumentSelection
import typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.modelColonelement
import typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.modelColonlivePosition
import typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.modelColonliveRange
import typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.modelColonmarker
import typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.modelColonnode
import typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.modelColonposition
import typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.modelColonrange
import typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.modelColonrootElement
import typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.modelColonselection
import typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.modelColontext
import typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.modelColontextProxy
import typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.node
import typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.on
import typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.position
import typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.range
import typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.rootElement
import typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.selection
import typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.text
import typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.textProxy
import typingsJapgolly.ckeditorCkeditor5Engine.srcModelItemMod.Item
import typingsJapgolly.std.Generator
import typingsJapgolly.std.IterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcModelSelectionMod {
  
  @JSImport("@ckeditor/ckeditor5-engine/src/model/selection", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with Selection {
    def this(selectable: Selectable) = this()
    def this(selectable: Null, placeOrOffset: before | end | after | on | in) = this()
    def this(selectable: Null, placeOrOffset: Double) = this()
    def this(selectable: Unit, placeOrOffset: before | end | after | on | in) = this()
    def this(selectable: Unit, placeOrOffset: Double) = this()
    def this(selectable: Selectable, placeOrOffset: before | end | after | on | in) = this()
    def this(selectable: Selectable, placeOrOffset: Double) = this()
    def this(selectable: Null, placeOrOffset: before | end | after | on | in, options: Backward) = this()
    def this(selectable: Null, placeOrOffset: Double, options: Backward) = this()
    def this(selectable: Null, placeOrOffset: Unit, options: Backward) = this()
    def this(selectable: Unit, placeOrOffset: before | end | after | on | in, options: Backward) = this()
    def this(selectable: Unit, placeOrOffset: Double, options: Backward) = this()
    def this(selectable: Unit, placeOrOffset: Unit, options: Backward) = this()
    def this(selectable: Selectable, placeOrOffset: before | end | after | on | in, options: Backward) = this()
    def this(selectable: Selectable, placeOrOffset: Double, options: Backward) = this()
    def this(selectable: Selectable, placeOrOffset: Unit, options: Backward) = this()
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.ckeditorCkeditor5Engine.srcModelSelectionMod.Selection
    - typingsJapgolly.ckeditorCkeditor5Engine.srcModelDocumentselectionMod.default
    - typingsJapgolly.ckeditorCkeditor5Engine.srcModelPositionMod.default
    - typingsJapgolly.ckeditorCkeditor5Engine.srcModelLivepositionMod.default
    - typingsJapgolly.ckeditorCkeditor5Engine.srcModelRangeMod.default
    - typingsJapgolly.ckeditorCkeditor5Engine.srcModelLiverangeMod.default
    - typingsJapgolly.ckeditorCkeditor5Engine.srcModelNodeMod.default
    - typingsJapgolly.ckeditorCkeditor5Engine.srcModelElementMod.default
    - typingsJapgolly.ckeditorCkeditor5Engine.srcModelRootelementMod.default
    - typingsJapgolly.ckeditorCkeditor5Engine.srcModelTextMod.default
    - scala.Null
    - js.Iterable[typingsJapgolly.ckeditorCkeditor5Engine.srcModelRangeMod.default]
  */
  type Selectable = _Selectable | js.Iterable[typingsJapgolly.ckeditorCkeditor5Engine.srcModelRangeMod.default] | Null
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Emitter * / any */ @js.native
  trait Selection
    extends StObject
       with _Selectable {
    
    val anchor: typingsJapgolly.ckeditorCkeditor5Engine.srcModelPositionMod.default | Null = js.native
    
    def containsEntireContent(element: typingsJapgolly.ckeditorCkeditor5Engine.srcModelElementMod.default): Boolean = js.native
    
    def delegate(events: String*): Any = js.native
    
    def fire(eventOrInfo: String, args: Any*): Any = js.native
    def fire(
      eventOrInfo: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventInfo */ Any,
      args: Any*
    ): Any = js.native
    
    val focus: typingsJapgolly.ckeditorCkeditor5Engine.srcModelPositionMod.default | Null = js.native
    
    def getAttribute(key: String): js.UndefOr[String | Boolean | Double] = js.native
    
    def getAttributeKeys(): IterableIterator[String] = js.native
    
    def getAttributes(): IterableIterator[js.Tuple2[String, String | Boolean | Double]] = js.native
    
    def getFirstPosition(): typingsJapgolly.ckeditorCkeditor5Engine.srcModelPositionMod.default | Null = js.native
    
    def getFirstRange(): typingsJapgolly.ckeditorCkeditor5Engine.srcModelRangeMod.default | Null = js.native
    
    def getLastPosition(): typingsJapgolly.ckeditorCkeditor5Engine.srcModelPositionMod.default | Null = js.native
    
    def getLastRange(): typingsJapgolly.ckeditorCkeditor5Engine.srcModelRangeMod.default | Null = js.native
    
    def getRanges(): Generator[typingsJapgolly.ckeditorCkeditor5Engine.srcModelRangeMod.default, Any, Any] = js.native
    
    def getSelectedBlocks(): Generator[typingsJapgolly.ckeditorCkeditor5Engine.srcModelElementMod.default, Any, Any] = js.native
    
    def getSelectedElement(): typingsJapgolly.ckeditorCkeditor5Engine.srcModelElementMod.default | Null = js.native
    
    def hasAttribute(key: String): Boolean = js.native
    
    def is(
      `type`: $text | $textProxy | documentFragment | documentSelection | element | livePosition | liveRange | marker | modelColon$text | modelColon$textProxy | modelColondocumentFragment | modelColondocumentSelection | modelColonelement | modelColonlivePosition | modelColonliveRange | modelColonmarker | modelColonnode | modelColonposition | modelColonrange | modelColonrootElement | modelColonselection | modelColontext | modelColontextProxy | node | position | range | rootElement | selection | text | textProxy
    ): Boolean = js.native
    def is(`type`: String): Boolean = js.native
    def is(`type`: String, name: String): Boolean = js.native
    def is[K /* <: String */](`type`: element | modelColonelement | modelColonrootElement | rootElement, name: K): Boolean = js.native
    
    val isBackward: Boolean = js.native
    
    val isCollapsed: Boolean = js.native
    
    def isEqual(otherSelection: typingsJapgolly.ckeditorCkeditor5Engine.srcModelDocumentselectionMod.default): Boolean = js.native
    def isEqual(otherSelection: Selection): Boolean = js.native
    
    def listenTo[P /* <: String */, E /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Emitter */ Any */](
      emitter: E,
      event: P,
      callback: js.ThisFunction2[
          /* this */ this.type, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventInfo<E, P> */ /* info */ Any, 
          /* repeated */ Any, 
          Unit
        ]
    ): Unit = js.native
    def listenTo[P /* <: String */, E /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Emitter */ Any */](
      emitter: E,
      event: P,
      callback: js.ThisFunction2[
          /* this */ this.type, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventInfo<E, P> */ /* info */ Any, 
          /* repeated */ Any, 
          Unit
        ],
      options: Priority
    ): Unit = js.native
    
    def off[K /* <: String */](event: K): Unit = js.native
    def off[K /* <: String */](
      event: K,
      callback: js.ThisFunction2[
          /* this */ this.type, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventInfo<this, K> */ /* info */ Any, 
          /* repeated */ Any, 
          Unit
        ]
    ): Unit = js.native
    
    def on[K /* <: String */](
      event: K,
      callback: js.ThisFunction2[
          /* this */ this.type, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventInfo<this, K> */ /* info */ Any, 
          /* repeated */ Any, 
          Unit
        ]
    ): Unit = js.native
    def on[K /* <: String */](
      event: K,
      callback: js.ThisFunction2[
          /* this */ this.type, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventInfo<this, K> */ /* info */ Any, 
          /* repeated */ Any, 
          Unit
        ],
      options: Priority
    ): Unit = js.native
    
    def once[K /* <: String */](
      event: K,
      callback: js.ThisFunction2[
          /* this */ this.type, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventInfo<this, K> */ /* info */ Any, 
          /* repeated */ Any, 
          Unit
        ]
    ): Unit = js.native
    def once[K /* <: String */](
      event: K,
      callback: js.ThisFunction2[
          /* this */ this.type, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventInfo<this, K> */ /* info */ Any, 
          /* repeated */ Any, 
          Unit
        ],
      options: Priority
    ): Unit = js.native
    
    val rangeCount: Double = js.native
    
    def removeAttribute(key: String): Unit = js.native
    
    def setAttribute(key: String, value: String): Unit = js.native
    def setAttribute(key: String, value: Boolean): Unit = js.native
    def setAttribute(key: String, value: Double): Unit = js.native
    
    def setFocus(itemOrPosition: Item): Unit = js.native
    def setFocus(itemOrPosition: Item, offset: end | before | after): Unit = js.native
    def setFocus(itemOrPosition: Item, offset: Double): Unit = js.native
    def setFocus(itemOrPosition: typingsJapgolly.ckeditorCkeditor5Engine.srcModelPositionMod.default): Unit = js.native
    
    def setTo(selectable: Selectable): Unit = js.native
    def setTo(selectable: Selectable, placeOrOffset: before | end | after | on | in): Unit = js.native
    def setTo(selectable: Selectable, placeOrOffset: before | end | after | on | in, options: Backward): Unit = js.native
    def setTo(selectable: Selectable, placeOrOffset: Double): Unit = js.native
    def setTo(selectable: Selectable, placeOrOffset: Double, options: Backward): Unit = js.native
    def setTo(selectable: Selectable, placeOrOffset: Unit, options: Backward): Unit = js.native
    
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
      callback: js.ThisFunction2[
          /* this */ this.type, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventInfo<E, P> */ /* info */ Any, 
          /* repeated */ Any, 
          Unit
        ]
    ): Unit = js.native
    def stopListening[E /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Emitter */ Any */, P /* <: String */](
      emitter: E,
      event: Unit,
      callback: js.ThisFunction2[
          /* this */ this.type, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventInfo<E, P> */ /* info */ Any, 
          /* repeated */ Any, 
          Unit
        ]
    ): Unit = js.native
    def stopListening[E /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Emitter */ Any */, P /* <: String */](emitter: Unit, event: P): Unit = js.native
    def stopListening[E /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Emitter */ Any */, P /* <: String */](
      emitter: Unit,
      event: P,
      callback: js.ThisFunction2[
          /* this */ this.type, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventInfo<E, P> */ /* info */ Any, 
          /* repeated */ Any, 
          Unit
        ]
    ): Unit = js.native
    def stopListening[E /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Emitter */ Any */, P /* <: String */](
      emitter: Unit,
      event: Unit,
      callback: js.ThisFunction2[
          /* this */ this.type, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventInfo<E, P> */ /* info */ Any, 
          /* repeated */ Any, 
          Unit
        ]
    ): Unit = js.native
  }
  
  trait _Selectable extends StObject
}
