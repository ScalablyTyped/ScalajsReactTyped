package typingsJapgolly.ckeditorCkeditor5Engine

import org.scalajs.dom.Document
import org.scalajs.dom.DocumentFragment
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.Node
import org.scalajs.dom.Range
import org.scalajs.dom.Selection
import org.scalajs.dom.Text
import typingsJapgolly.ckeditorCkeditor5Engine.anon.Bind
import typingsJapgolly.ckeditorCkeditor5Engine.anon.KeepOriginalCase
import typingsJapgolly.ckeditorCkeditor5Engine.anon.Offset
import typingsJapgolly.ckeditorCkeditor5Engine.anon.WithChildren
import typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.`object`
import typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.audio
import typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.button
import typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.canvas
import typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.data
import typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.editing
import typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.embed
import typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.iframe
import typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.img
import typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.input
import typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.option
import typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.pre
import typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.select
import typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.textarea
import typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.video
import typingsJapgolly.ckeditorCkeditor5Engine.srcViewMatcherMod.MatcherPattern
import typingsJapgolly.std.Generator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcViewDomconverterMod {
  
  @JSImport("@ckeditor/ckeditor5-engine/src/view/domconverter", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with DomConverter {
    def this(document: typingsJapgolly.ckeditorCkeditor5Engine.srcViewDocumentMod.default) = this()
    def this(
      document: typingsJapgolly.ckeditorCkeditor5Engine.srcViewDocumentMod.default,
      options: typingsJapgolly.ckeditorCkeditor5Engine.anon.BlockFillerMode
    ) = this()
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.br
    - typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.nbsp
    - typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.markedNbsp
  */
  trait BlockFillerMode extends StObject
  object BlockFillerMode {
    
    inline def br: typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.br = "br".asInstanceOf[typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.br]
    
    inline def markedNbsp: typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.markedNbsp = "markedNbsp".asInstanceOf[typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.markedNbsp]
    
    inline def nbsp: typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.nbsp = "nbsp".asInstanceOf[typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.nbsp]
  }
  
  @js.native
  trait DomConverter extends StObject {
    
    def bindDocumentFragments(
      domFragment: DocumentFragment,
      viewFragment: typingsJapgolly.ckeditorCkeditor5Engine.srcViewDocumentfragmentMod.default
    ): Unit = js.native
    
    def bindElements(
      domElement: HTMLElement,
      viewElement: typingsJapgolly.ckeditorCkeditor5Engine.srcViewElementMod.default
    ): Unit = js.native
    
    def bindFakeSelection(
      domElement: HTMLElement,
      viewDocumentSelection: typingsJapgolly.ckeditorCkeditor5Engine.srcViewDocumentselectionMod.default
    ): Unit = js.native
    
    val blockElements: js.Array[Any] = js.native
    
    var blockFillerMode: BlockFillerMode = js.native
    
    val document: typingsJapgolly.ckeditorCkeditor5Engine.srcViewDocumentMod.default = js.native
    
    def domChildrenToView(domElement: HTMLElement): Generator[Node, Any, Any] = js.native
    def domChildrenToView(domElement: HTMLElement, options: Bind): Generator[Node, Any, Any] = js.native
    
    def domPositionToView(domParent: Node): typingsJapgolly.ckeditorCkeditor5Engine.srcViewPositionMod.default = js.native
    def domPositionToView(domParent: Node, domOffset: Double): typingsJapgolly.ckeditorCkeditor5Engine.srcViewPositionMod.default = js.native
    
    def domRangeToView(domRange: Range): typingsJapgolly.ckeditorCkeditor5Engine.srcViewRangeMod.default | Null = js.native
    
    def domSelectionToView(domSelection: Selection): typingsJapgolly.ckeditorCkeditor5Engine.srcViewSelectionMod.default = js.native
    
    def domToView(domNode: DocumentFragment): typingsJapgolly.ckeditorCkeditor5Engine.srcViewDocumentfragmentMod.default = js.native
    def domToView(domNode: DocumentFragment, options: KeepOriginalCase): typingsJapgolly.ckeditorCkeditor5Engine.srcViewDocumentfragmentMod.default = js.native
    def domToView(domNode: Node): typingsJapgolly.ckeditorCkeditor5Engine.srcViewNodeMod.default | Null = js.native
    def domToView(domNode: Node, options: KeepOriginalCase): typingsJapgolly.ckeditorCkeditor5Engine.srcViewNodeMod.default | Null = js.native
    
    def fakeSelectionToView(domElement: HTMLElement): js.UndefOr[typingsJapgolly.ckeditorCkeditor5Engine.srcViewSelectionMod.default] = js.native
    
    def findCorrespondingDomText(viewText: typingsJapgolly.ckeditorCkeditor5Engine.srcViewTextMod.default): Text | Null = js.native
    
    def findCorrespondingViewText(domText: Text): typingsJapgolly.ckeditorCkeditor5Engine.srcViewTextMod.default | Null = js.native
    
    def focus(viewEditable: typingsJapgolly.ckeditorCkeditor5Engine.srcViewEditableelementMod.default): Unit = js.native
    
    def getHostViewElement(domNode: Node): typingsJapgolly.ckeditorCkeditor5Engine.srcViewUielementMod.default | typingsJapgolly.ckeditorCkeditor5Engine.srcViewRawelementMod.default | Null = js.native
    
    val inlineObjectElements: js.Tuple12[`object`, iframe, input, button, textarea, select, option, video, embed, audio, img, canvas] = js.native
    
    def isBlockFiller(domNode: Node): Boolean = js.native
    
    def isDocumentFragment(node: Node): Boolean = js.native
    
    def isDomSelectionBackward(DOM: Selection): Boolean = js.native
    
    def isDomSelectionCorrect(domSelection: Selection): Boolean = js.native
    
    def isElement(node: Node): Boolean = js.native
    
    def mapDomToView(domElementOrDocumentFragment: DocumentFragment): js.UndefOr[
        typingsJapgolly.ckeditorCkeditor5Engine.srcViewElementMod.default | typingsJapgolly.ckeditorCkeditor5Engine.srcViewDocumentfragmentMod.default
      ] = js.native
    def mapDomToView(domElementOrDocumentFragment: typingsJapgolly.ckeditorCkeditor5Engine.srcModelElementMod.default): js.UndefOr[
        typingsJapgolly.ckeditorCkeditor5Engine.srcViewElementMod.default | typingsJapgolly.ckeditorCkeditor5Engine.srcViewDocumentfragmentMod.default
      ] = js.native
    
    def mapViewToDom(viewNode: typingsJapgolly.ckeditorCkeditor5Engine.srcViewDocumentfragmentMod.default): js.UndefOr[Node | DocumentFragment] = js.native
    def mapViewToDom(viewNode: typingsJapgolly.ckeditorCkeditor5Engine.srcViewElementMod.default): js.UndefOr[Node | DocumentFragment] = js.native
    
    val preElements: js.Array[pre] = js.native
    
    def registerRawContentMatcher(pattern: MatcherPattern): Unit = js.native
    
    /**
      * Removes an attribute from a DOM element.
      *
      * **Note**: To set the attribute, use {@link #setDomElementAttribute}.
      */
    def removeDomElementAttribute(domElement: HTMLElement, key: String): Unit = js.native
    
    val renderingMode: data | editing = js.native
    
    /**
      * Set `domElement`'s content using provided `html` argument. Apply necessary filtering for the editing pipeline.
      */
    def setContentOf(domElement: HTMLElement, html: String): Unit = js.native
    
    /**
      * Sets the attribute on a DOM element.
      *
      * **Note**: To remove the attribute, use {@link #removeDomElementAttribute}.
      */
    def setDomElementAttribute(domElement: HTMLElement, key: String, value: String): Unit = js.native
    def setDomElementAttribute(
      domElement: HTMLElement,
      key: String,
      value: String,
      relatedViewElement: typingsJapgolly.ckeditorCkeditor5Engine.srcViewElementMod.default
    ): Unit = js.native
    
    /**
      * Decides whether given pair of attribute key and value should be passed further down the pipeline.
      */
    def shouldRenderAttribute(attributeKey: String, attributeValue: String, elementName: String): Boolean = js.native
    
    def unbindDomElement(domElement: HTMLElement): Unit = js.native
    
    def viewChildrenToDom(
      viewElement: typingsJapgolly.ckeditorCkeditor5Engine.srcViewDocumentfragmentMod.default,
      domDocument: Document
    ): Generator[Node, Any, Any] = js.native
    def viewChildrenToDom(
      viewElement: typingsJapgolly.ckeditorCkeditor5Engine.srcViewDocumentfragmentMod.default,
      domDocument: Document,
      options: WithChildren
    ): Generator[Node, Any, Any] = js.native
    def viewChildrenToDom(
      viewElement: typingsJapgolly.ckeditorCkeditor5Engine.srcViewElementMod.default,
      domDocument: Document
    ): Generator[Node, Any, Any] = js.native
    def viewChildrenToDom(
      viewElement: typingsJapgolly.ckeditorCkeditor5Engine.srcViewElementMod.default,
      domDocument: Document,
      options: WithChildren
    ): Generator[Node, Any, Any] = js.native
    
    def viewPositionToDom(viewPosition: typingsJapgolly.ckeditorCkeditor5Engine.srcViewPositionMod.default): Offset | Null = js.native
    
    def viewRangeToDom(viewRange: typingsJapgolly.ckeditorCkeditor5Engine.srcViewRangeMod.default): Range = js.native
    
    /**
      * Converts the view to the DOM. For all text nodes, not bound elements and document fragments new items will
      * be created. For bound elements and document fragments the method will return corresponding items.
      */
    def viewToDom(
      viewNode: typingsJapgolly.ckeditorCkeditor5Engine.srcViewDocumentfragmentMod.default,
      domDocument: Document
    ): DocumentFragment = js.native
    def viewToDom(
      viewNode: typingsJapgolly.ckeditorCkeditor5Engine.srcViewDocumentfragmentMod.default,
      domDocument: Document,
      options: WithChildren
    ): DocumentFragment = js.native
    /**
      * Converts the view to the DOM. For all text nodes, not bound elements and document fragments new items will
      * be created. For bound elements and document fragments the method will return corresponding items.
      */
    def viewToDom(viewNode: typingsJapgolly.ckeditorCkeditor5Engine.srcViewNodeMod.default, domDocument: Document): Node = js.native
    def viewToDom(
      viewNode: typingsJapgolly.ckeditorCkeditor5Engine.srcViewNodeMod.default,
      domDocument: Document,
      options: WithChildren
    ): Node = js.native
  }
}
