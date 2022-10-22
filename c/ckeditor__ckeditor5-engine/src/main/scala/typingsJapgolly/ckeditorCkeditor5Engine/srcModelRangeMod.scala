package typingsJapgolly.ckeditorCkeditor5Engine

import org.scalajs.dom.Document
import typingsJapgolly.ckeditorCkeditor5Engine.anon.End
import typingsJapgolly.ckeditorCkeditor5Engine.anon.Start
import typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.$text
import typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.$textProxy
import typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.boundaries
import typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.documentFragment
import typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.documentSelection
import typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.element
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
import typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.position
import typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.range
import typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.rootElement
import typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.selection
import typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.text
import typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.textProxy
import typingsJapgolly.ckeditorCkeditor5Engine.srcModelItemMod.Item
import typingsJapgolly.ckeditorCkeditor5Engine.srcModelOperationOperationMod.Operation
import typingsJapgolly.ckeditorCkeditor5Engine.srcModelSelectionMod._Selectable
import typingsJapgolly.ckeditorCkeditor5Engine.srcModelTreewalkerMod.TreeWalkerOptions
import typingsJapgolly.ckeditorCkeditor5Engine.srcModelTreewalkerMod.TreeWalkerValue
import typingsJapgolly.std.Generator
import typingsJapgolly.std.Iterable
import typingsJapgolly.std.Omit
import typingsJapgolly.std.Partial
import typingsJapgolly.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcModelRangeMod {
  
  @JSImport("@ckeditor/ckeditor5-engine/src/model/range", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Range
       with _Selectable {
    def this(start: typingsJapgolly.ckeditorCkeditor5Engine.srcModelPositionMod.default) = this()
    def this(
      start: typingsJapgolly.ckeditorCkeditor5Engine.srcModelPositionMod.default,
      end: typingsJapgolly.ckeditorCkeditor5Engine.srcModelPositionMod.default
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("@ckeditor/ckeditor5-engine/src/model/range", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromJSON(json: ReturnType[js.Function0[End]], doc: Document): Range = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any], doc.asInstanceOf[js.Any])).asInstanceOf[Range]
  }
  
  @js.native
  trait Range
    extends StObject
       with Iterable[TreeWalkerValue] {
    
    def containsItem(item: Item): Boolean = js.native
    
    def containsPosition(position: typingsJapgolly.ckeditorCkeditor5Engine.srcModelPositionMod.default): Boolean = js.native
    
    def containsRange(otherRange: Range): Boolean = js.native
    def containsRange(otherRange: Range, loose: Boolean): Boolean = js.native
    
    val end: typingsJapgolly.ckeditorCkeditor5Engine.srcModelPositionMod.default = js.native
    
    def getCommonAncestor(): typingsJapgolly.ckeditorCkeditor5Engine.srcModelElementMod.default | typingsJapgolly.ckeditorCkeditor5Engine.srcModelDocumentfragmentMod.default | Null = js.native
    
    def getContainedElement(): typingsJapgolly.ckeditorCkeditor5Engine.srcModelElementMod.default | Null = js.native
    
    def getDifference(otherRange: Range): js.Array[Range] = js.native
    
    def getIntersection(otherRange: Range): Range | Null = js.native
    
    def getItems(): Generator[Item, Any, Any] = js.native
    def getItems(options: RangeTreeWalkerOptions): Generator[Item, Any, Any] = js.native
    
    def getJoined(otherRange: Range): Range | Null = js.native
    def getJoined(otherRange: Range, loose: Boolean): Range | Null = js.native
    
    def getMinimalFlatRanges(): js.Array[Range] = js.native
    
    def getPositions(): Generator[typingsJapgolly.ckeditorCkeditor5Engine.srcModelPositionMod.default, Any, Any] = js.native
    def getPositions(options: RangeTreeWalkerOptions): Generator[typingsJapgolly.ckeditorCkeditor5Engine.srcModelPositionMod.default, Any, Any] = js.native
    
    def getTransformedByOperation(operation: Operation): js.Array[Range] = js.native
    
    def getTransformedByOperations(operations: js.Iterable[Operation]): js.Array[Range] = js.native
    
    def getWalker(): typingsJapgolly.ckeditorCkeditor5Engine.srcModelTreewalkerMod.default = js.native
    def getWalker(options: RangeTreeWalkerOptions): typingsJapgolly.ckeditorCkeditor5Engine.srcModelTreewalkerMod.default = js.native
    
    def is(
      `type`: $text | $textProxy | documentFragment | documentSelection | element | livePosition | liveRange | marker | modelColon$text | modelColon$textProxy | modelColondocumentFragment | modelColondocumentSelection | modelColonelement | modelColonlivePosition | modelColonliveRange | modelColonmarker | modelColonnode | modelColonposition | modelColonrange | modelColonrootElement | modelColonselection | modelColontext | modelColontextProxy | node | position | range | rootElement | selection | text | textProxy
    ): Boolean = js.native
    def is(`type`: String): Boolean = js.native
    def is(`type`: String, name: String): Boolean = js.native
    def is[K /* <: String */](`type`: element | modelColonelement | modelColonrootElement | rootElement, name: K): Boolean = js.native
    
    var isCollapsed: Boolean = js.native
    
    def isEqual(otherRange: Range): Boolean = js.native
    
    var isFlat: Boolean = js.native
    
    def isIntersecting(otherRange: Range): Boolean = js.native
    
    var root: typingsJapgolly.ckeditorCkeditor5Engine.srcModelElementMod.default | typingsJapgolly.ckeditorCkeditor5Engine.srcModelDocumentfragmentMod.default = js.native
    
    val start: typingsJapgolly.ckeditorCkeditor5Engine.srcModelPositionMod.default = js.native
    
    def toJSON(): Start = js.native
  }
  
  type RangeTreeWalkerOptions = Partial[Omit[TreeWalkerOptions, boundaries]]
}
