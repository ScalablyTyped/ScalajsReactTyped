package typingsJapgolly.ckeditorCkeditor5Engine

import org.scalajs.dom.TreeWalker
import typingsJapgolly.ckeditorCkeditor5Engine.anon.IgnoreElementEndShallow
import typingsJapgolly.ckeditorCkeditor5Engine.anon.StartPosition
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
import typingsJapgolly.ckeditorCkeditor5Engine.srcViewItemMod.Item
import typingsJapgolly.ckeditorCkeditor5Engine.srcViewSelectionMod._Selectable
import typingsJapgolly.ckeditorCkeditor5Engine.srcViewTreewalkerMod.TreeWalkerValue
import typingsJapgolly.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcViewRangeMod {
  
  @JSImport("@ckeditor/ckeditor5-engine/src/view/range", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Range
       with _Selectable {
    def this(start: typingsJapgolly.ckeditorCkeditor5Engine.srcViewPositionMod.default) = this()
    def this(
      start: typingsJapgolly.ckeditorCkeditor5Engine.srcViewPositionMod.default,
      end: typingsJapgolly.ckeditorCkeditor5Engine.srcViewPositionMod.default
    ) = this()
  }
  
  @js.native
  trait Range
    extends StObject
       with Iterable[TreeWalkerValue] {
    
    def containsPosition(position: typingsJapgolly.ckeditorCkeditor5Engine.srcViewPositionMod.default): Boolean = js.native
    
    def containsRange(otherRange: Range): Boolean = js.native
    def containsRange(otherRange: Range, loose: Boolean): Boolean = js.native
    
    val end: typingsJapgolly.ckeditorCkeditor5Engine.srcViewPositionMod.default = js.native
    
    def getCommonAncestor(): typingsJapgolly.ckeditorCkeditor5Engine.srcViewNodeMod.default | typingsJapgolly.ckeditorCkeditor5Engine.srcViewDocumentfragmentMod.default | Null = js.native
    
    def getContainedElement(): typingsJapgolly.ckeditorCkeditor5Engine.srcViewElementMod.default | Null = js.native
    
    def getDifference(otherRange: Range): (js.Array[Any | Range]) | (js.Tuple2[Range, Range]) = js.native
    
    def getEnlarged(): Range = js.native
    
    def getIntersection(otherRange: Range): Range | Null = js.native
    
    def getItems(): js.Iterable[Item] = js.native
    def getItems(options: StartPosition): js.Iterable[Item] = js.native
    
    def getPositions(): js.Iterable[typingsJapgolly.ckeditorCkeditor5Engine.srcViewPositionMod.default] = js.native
    def getPositions(options: StartPosition): js.Iterable[typingsJapgolly.ckeditorCkeditor5Engine.srcViewPositionMod.default] = js.native
    
    def getTrimmed(): Range = js.native
    
    def getWalker(): TreeWalker = js.native
    def getWalker(options: IgnoreElementEndShallow): TreeWalker = js.native
    
    def is(
      `type`: $text | $textProxy | attributeElement | containerElement | documentFragment | documentSelection | editableElement | element | emptyElement | node | position | range | rawElement | rootEditableElement | selection | text | textProxy | uiElement | viewColon$text | viewColon$textProxy | viewColonattributeElement | viewColoncontainerElement | viewColondocumentFragment | viewColondocumentSelection | viewColoneditableElement | viewColonelement | viewColonemptyElement | viewColonnode | viewColonposition | viewColonrange | viewColonrawElement | viewColonrootEditableElement | viewColonselection | viewColontext | viewColontextProxy | viewColonuiElement
    ): Boolean = js.native
    def is(`type`: String): Boolean = js.native
    def is(`type`: String, name: String): Boolean = js.native
    def is[K /* <: String */](
      `type`: attributeElement | containerElement | editableElement | element | emptyElement | rawElement | rootEditableElement | uiElement | viewColonattributeElement | viewColoncontainerElement | viewColoneditableElement | viewColonelement | viewColonemptyElement | viewColonrawElement | viewColonrootEditableElement | viewColonuiElement,
      name: K
    ): Boolean = js.native
    
    var isCollapsed: Boolean = js.native
    
    def isEqual(otherRange: Range): Boolean = js.native
    
    var isFlat: Boolean = js.native
    
    def isIntersecting(otherRange: Range): Boolean = js.native
    
    var root: typingsJapgolly.ckeditorCkeditor5Engine.srcViewElementMod.default | typingsJapgolly.ckeditorCkeditor5Engine.srcViewDocumentfragmentMod.default = js.native
    
    val start: typingsJapgolly.ckeditorCkeditor5Engine.srcViewPositionMod.default = js.native
  }
}
