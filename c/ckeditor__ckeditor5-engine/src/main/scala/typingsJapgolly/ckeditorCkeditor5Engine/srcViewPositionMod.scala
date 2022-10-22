package typingsJapgolly.ckeditorCkeditor5Engine

import typingsJapgolly.ckeditorCkeditor5Engine.anon.BoundariesIgnoreElementEnd
import typingsJapgolly.ckeditorCkeditor5Engine.anon.SingleCharacters
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
import typingsJapgolly.ckeditorCkeditor5Engine.srcViewSelectionMod._Selectable
import typingsJapgolly.ckeditorCkeditor5Engine.srcViewTreewalkerMod.TreeWalkerValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcViewPositionMod {
  
  @JSImport("@ckeditor/ckeditor5-engine/src/view/position", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Position
       with _Selectable {
    def this(
      parent: typingsJapgolly.ckeditorCkeditor5Engine.srcViewDocumentfragmentMod.default,
      offset: js.Array[Double]
    ) = this()
    def this(parent: typingsJapgolly.ckeditorCkeditor5Engine.srcViewDocumentfragmentMod.default, offset: Double) = this()
    def this(parent: typingsJapgolly.ckeditorCkeditor5Engine.srcViewNodeMod.default, offset: js.Array[Double]) = this()
    def this(parent: typingsJapgolly.ckeditorCkeditor5Engine.srcViewNodeMod.default, offset: Double) = this()
  }
  
  @js.native
  trait Position extends StObject {
    
    def compareWith(otherPosition: Position): PositionRelation = js.native
    
    var editableElement: typingsJapgolly.ckeditorCkeditor5Engine.srcViewEditableelementMod.default | Null = js.native
    
    def getAncestors(): js.Array[
        typingsJapgolly.ckeditorCkeditor5Engine.srcViewNodeMod.default | typingsJapgolly.ckeditorCkeditor5Engine.srcViewDocumentfragmentMod.default
      ] = js.native
    
    def getCommonAncestor(position: Position): typingsJapgolly.ckeditorCkeditor5Engine.srcViewNodeMod.default | typingsJapgolly.ckeditorCkeditor5Engine.srcViewDocumentfragmentMod.default | Null = js.native
    
    def getLastMatchingPosition(skip: js.Function1[/* value */ TreeWalkerValue, Boolean]): Position = js.native
    def getLastMatchingPosition(skip: js.Function1[/* value */ TreeWalkerValue, Boolean], options: SingleCharacters): Position = js.native
    
    def getShiftedBy(shift: Double): Position = js.native
    
    def getWalker(): typingsJapgolly.ckeditorCkeditor5Engine.srcViewTreewalkerMod.default = js.native
    def getWalker(options: BoundariesIgnoreElementEnd): typingsJapgolly.ckeditorCkeditor5Engine.srcViewTreewalkerMod.default = js.native
    
    def is(
      `type`: $text | $textProxy | attributeElement | containerElement | documentFragment | documentSelection | editableElement | element | emptyElement | node | position | range | rawElement | rootEditableElement | selection | text | textProxy | uiElement | viewColon$text | viewColon$textProxy | viewColonattributeElement | viewColoncontainerElement | viewColondocumentFragment | viewColondocumentSelection | viewColoneditableElement | viewColonelement | viewColonemptyElement | viewColonnode | viewColonposition | viewColonrange | viewColonrawElement | viewColonrootEditableElement | viewColonselection | viewColontext | viewColontextProxy | viewColonuiElement
    ): Boolean = js.native
    def is(`type`: String): Boolean = js.native
    def is(`type`: String, name: String): Boolean = js.native
    def is[K /* <: String */](
      `type`: attributeElement | containerElement | editableElement | element | emptyElement | rawElement | rootEditableElement | uiElement | viewColonattributeElement | viewColoncontainerElement | viewColoneditableElement | viewColonelement | viewColonemptyElement | viewColonrawElement | viewColonrootEditableElement | viewColonuiElement,
      name: K
    ): Boolean = js.native
    
    def isAfter(otherPosition: Position): Boolean = js.native
    
    val isAtEnd: Boolean = js.native
    
    val isAtStart: Boolean = js.native
    
    def isBefore(otherPosition: Position): Boolean = js.native
    
    def isEqual(otherPosition: Position): Boolean = js.native
    
    val nodeAfter: typingsJapgolly.ckeditorCkeditor5Engine.srcViewNodeMod.default | Null = js.native
    
    val nodeBefore: typingsJapgolly.ckeditorCkeditor5Engine.srcViewNodeMod.default | Null = js.native
    
    val offset: Double = js.native
    
    val parent: typingsJapgolly.ckeditorCkeditor5Engine.srcViewNodeMod.default | typingsJapgolly.ckeditorCkeditor5Engine.srcViewDocumentfragmentMod.default = js.native
    
    val root: typingsJapgolly.ckeditorCkeditor5Engine.srcViewNodeMod.default | typingsJapgolly.ckeditorCkeditor5Engine.srcViewDocumentfragmentMod.default = js.native
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
}
