package typingsJapgolly.ckeditorCkeditor5Engine

import org.scalajs.dom.Document
import typingsJapgolly.ckeditorCkeditor5Engine.anon.Boundaries
import typingsJapgolly.ckeditorCkeditor5Engine.anon.Path
import typingsJapgolly.ckeditorCkeditor5Engine.anon.Stickiness
import typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.$text
import typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.$textProxy
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
import typingsJapgolly.ckeditorCkeditor5Engine.srcModelSchemaMod._SchemaContextDefinition
import typingsJapgolly.ckeditorCkeditor5Engine.srcModelSelectionMod._Selectable
import typingsJapgolly.ckeditorCkeditor5Engine.srcModelTreewalkerMod.TreeWalkerValue
import typingsJapgolly.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcModelPositionMod {
  
  @JSImport("@ckeditor/ckeditor5-engine/src/model/position", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@ckeditor/ckeditor5-engine/src/model/position", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Position
       with _SchemaContextDefinition
       with _Selectable {
    def this(
      root: typingsJapgolly.ckeditorCkeditor5Engine.srcModelDocumentfragmentMod.default,
      path: js.Array[Double]
    ) = this()
    def this(root: typingsJapgolly.ckeditorCkeditor5Engine.srcModelElementMod.default, path: js.Array[Double]) = this()
    def this(
      root: typingsJapgolly.ckeditorCkeditor5Engine.srcModelDocumentfragmentMod.default,
      path: js.Array[Double],
      stickiness: PositionStickiness
    ) = this()
    def this(
      root: typingsJapgolly.ckeditorCkeditor5Engine.srcModelElementMod.default,
      path: js.Array[Double],
      stickiness: PositionStickiness
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("@ckeditor/ckeditor5-engine/src/model/position", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromJSON(json: ReturnType[js.Function0[Path]], doc: Document): Position = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any], doc.asInstanceOf[js.Any])).asInstanceOf[Position]
  }
  
  inline def getNodeAfterPosition(
    position: Position,
    positionParent: typingsJapgolly.ckeditorCkeditor5Engine.srcModelDocumentfragmentMod.default
  ): typingsJapgolly.ckeditorCkeditor5Engine.srcModelNodeMod.default | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getNodeAfterPosition")(position.asInstanceOf[js.Any], positionParent.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.ckeditorCkeditor5Engine.srcModelNodeMod.default | Null]
  inline def getNodeAfterPosition(
    position: Position,
    positionParent: typingsJapgolly.ckeditorCkeditor5Engine.srcModelDocumentfragmentMod.default,
    textNode: typingsJapgolly.ckeditorCkeditor5Engine.srcModelTextMod.default
  ): typingsJapgolly.ckeditorCkeditor5Engine.srcModelNodeMod.default | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getNodeAfterPosition")(position.asInstanceOf[js.Any], positionParent.asInstanceOf[js.Any], textNode.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.ckeditorCkeditor5Engine.srcModelNodeMod.default | Null]
  inline def getNodeAfterPosition(
    position: Position,
    positionParent: typingsJapgolly.ckeditorCkeditor5Engine.srcModelElementMod.default
  ): typingsJapgolly.ckeditorCkeditor5Engine.srcModelNodeMod.default | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getNodeAfterPosition")(position.asInstanceOf[js.Any], positionParent.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.ckeditorCkeditor5Engine.srcModelNodeMod.default | Null]
  inline def getNodeAfterPosition(
    position: Position,
    positionParent: typingsJapgolly.ckeditorCkeditor5Engine.srcModelElementMod.default,
    textNode: typingsJapgolly.ckeditorCkeditor5Engine.srcModelTextMod.default
  ): typingsJapgolly.ckeditorCkeditor5Engine.srcModelNodeMod.default | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getNodeAfterPosition")(position.asInstanceOf[js.Any], positionParent.asInstanceOf[js.Any], textNode.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.ckeditorCkeditor5Engine.srcModelNodeMod.default | Null]
  
  @js.native
  trait Position extends StObject {
    
    def compareWith(otherPosition: Position): PositionRelation = js.native
    
    def findAncestor(parentName: String): typingsJapgolly.ckeditorCkeditor5Engine.srcModelElementMod.default | Null = js.native
    
    def getAncestors(): js.Array[Item] = js.native
    
    def getCommonAncestor(position: Position): typingsJapgolly.ckeditorCkeditor5Engine.srcModelElementMod.default | typingsJapgolly.ckeditorCkeditor5Engine.srcModelDocumentfragmentMod.default | Null = js.native
    
    def getCommonPath(position: Position): js.Array[Double] = js.native
    
    def getLastMatchingPosition(skip: js.Function1[/* value */ TreeWalkerValue, Boolean]): Position = js.native
    def getLastMatchingPosition(skip: js.Function1[/* value */ TreeWalkerValue, Boolean], options: Boundaries): Position = js.native
    
    def getParentPath(): js.Array[Double] = js.native
    
    def getShiftedBy(shift: Double): Position = js.native
    
    def getTransformedByOperation(operation: Operation): Position = js.native
    
    def hasSameParentAs(position: Position): Boolean = js.native
    
    val index: Double = js.native
    
    def is(
      `type`: $text | $textProxy | documentFragment | documentSelection | element | livePosition | liveRange | marker | modelColon$text | modelColon$textProxy | modelColondocumentFragment | modelColondocumentSelection | modelColonelement | modelColonlivePosition | modelColonliveRange | modelColonmarker | modelColonnode | modelColonposition | modelColonrange | modelColonrootElement | modelColonselection | modelColontext | modelColontextProxy | node | position | range | rootElement | selection | text | textProxy
    ): Boolean = js.native
    def is(`type`: String): Boolean = js.native
    def is(`type`: String, name: String): Boolean = js.native
    def is[K /* <: String */](`type`: element | modelColonelement | modelColonrootElement | rootElement, name: K): Boolean = js.native
    
    def isAfter(otherPosition: Position): Boolean = js.native
    
    val isAtEnd: Boolean = js.native
    
    val isAtStart: Boolean = js.native
    
    def isBefore(otherPosition: Position): Boolean = js.native
    
    def isEqual(otherPosition: Position): Boolean = js.native
    
    def isTouching(otherPosition: Position): Boolean = js.native
    
    val nodeAfter: typingsJapgolly.ckeditorCkeditor5Engine.srcModelNodeMod.default | Null = js.native
    
    val nodeBefore: typingsJapgolly.ckeditorCkeditor5Engine.srcModelNodeMod.default | Null = js.native
    
    var offset: Double = js.native
    
    val parent: typingsJapgolly.ckeditorCkeditor5Engine.srcModelElementMod.default | typingsJapgolly.ckeditorCkeditor5Engine.srcModelDocumentfragmentMod.default = js.native
    
    val path: js.Array[Double] = js.native
    
    val root: typingsJapgolly.ckeditorCkeditor5Engine.srcModelElementMod.default | typingsJapgolly.ckeditorCkeditor5Engine.srcModelDocumentfragmentMod.default = js.native
    
    var stickiness: PositionStickiness = js.native
    
    val textNode: typingsJapgolly.ckeditorCkeditor5Engine.srcModelTextMod.default | Null = js.native
    
    def toJSON(): Stickiness = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.before
    - typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.after
    - typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.same
    - typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.different
  */
  trait PositionRelation extends StObject
  object PositionRelation {
    
    inline def after: typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.after = "after".asInstanceOf[typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.after]
    
    inline def before: typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.before = "before".asInstanceOf[typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.before]
    
    inline def different: typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.different = "different".asInstanceOf[typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.different]
    
    inline def same: typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.same = "same".asInstanceOf[typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.same]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.toNone
    - typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.toNext
    - typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.toPrevious
  */
  trait PositionStickiness extends StObject
  object PositionStickiness {
    
    inline def toNext: typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.toNext = "toNext".asInstanceOf[typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.toNext]
    
    inline def toNone: typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.toNone = "toNone".asInstanceOf[typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.toNone]
    
    inline def toPrevious: typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.toPrevious = "toPrevious".asInstanceOf[typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.toPrevious]
  }
}
