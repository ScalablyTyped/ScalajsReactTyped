package typingsJapgolly.hastUtilRaw

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.Attr
import org.scalajs.dom.DOMRect
import org.scalajs.dom.DOMStringList
import org.scalajs.dom.DOMTokenList
import org.scalajs.dom.Document
import org.scalajs.dom.DocumentFragment
import org.scalajs.dom.Event
import org.scalajs.dom.HTMLAnchorElement
import org.scalajs.dom.HTMLCollection
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.NamedNodeMap
import org.scalajs.dom.NodeList
import typingsJapgolly.hast.mod.DocType
import typingsJapgolly.hastUtilRaw.anon.Location
import typingsJapgolly.hastUtilRaw.complexTypesMod.Raw
import typingsJapgolly.hastUtilRaw.hastUtilRawStrings.a
import typingsJapgolly.hastUtilRaw.hastUtilRawStrings.comment
import typingsJapgolly.hastUtilRaw.hastUtilRawStrings.fullscreenchange
import typingsJapgolly.hastUtilRaw.hastUtilRawStrings.httpColonSlashSlashwwwDotw3DotorgSlash1999Slashxhtml
import typingsJapgolly.parse5.distParserMod.ParserOptions
import typingsJapgolly.parse5.distTreeAdaptersInterfaceMod.TreeAdapterTypeMap
import typingsJapgolly.std.Animation
import typingsJapgolly.std.ChildNode
import typingsJapgolly.std.DOMRectList
import typingsJapgolly.std.HTMLCollectionOf
import typingsJapgolly.std.HTMLSlotElement
import typingsJapgolly.std.InsertPosition
import typingsJapgolly.std.Record
import typingsJapgolly.std.ShadowRoot
import typingsJapgolly.std.ShadowRootInit
import typingsJapgolly.unist.mod.Data
import typingsJapgolly.unist.mod.Position
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMod {
  
  @JSImport("hast-util-raw/lib", "raw")
  @js.native
  val raw: (js.Function3[/* tree */ Node, /* file */ js.UndefOr[VFile], /* options */ js.UndefOr[Options], Node]) & (js.Function2[/* tree */ Node, /* options */ js.UndefOr[Options], Node]) = js.native
  
  type Comment = typingsJapgolly.hast.mod.Comment
  
  type Content = typingsJapgolly.hast.mod.Content
  
  type Doctype = DocType
  
  type Element = typingsJapgolly.hast.mod.Element
  
  trait HiddenLocationTracker extends StObject {
    
    var ctLoc: P5Location
    
    var currentAttrLocation: js.UndefOr[P5Location] = js.undefined
    
    var posTracker: HiddenPosTracker
  }
  object HiddenLocationTracker {
    
    inline def apply(ctLoc: P5Location, posTracker: HiddenPosTracker): HiddenLocationTracker = {
      val __obj = js.Dynamic.literal(ctLoc = ctLoc.asInstanceOf[js.Any], posTracker = posTracker.asInstanceOf[js.Any])
      __obj.asInstanceOf[HiddenLocationTracker]
    }
    
    extension [Self <: HiddenLocationTracker](x: Self) {
      
      inline def setCtLoc(value: P5Location): Self = StObject.set(x, "ctLoc", value.asInstanceOf[js.Any])
      
      inline def setCurrentAttrLocation(value: P5Location): Self = StObject.set(x, "currentAttrLocation", value.asInstanceOf[js.Any])
      
      inline def setCurrentAttrLocationUndefined: Self = StObject.set(x, "currentAttrLocation", js.undefined)
      
      inline def setPosTracker(value: HiddenPosTracker): Self = StObject.set(x, "posTracker", value.asInstanceOf[js.Any])
    }
  }
  
  trait HiddenPosTracker extends StObject {
    
    var col: Double
    
    var droppedBufferSize: Double
    
    var isEol: Boolean
    
    var line: Double
    
    var lineStartPos: Double
    
    var offset: Double
  }
  object HiddenPosTracker {
    
    inline def apply(
      col: Double,
      droppedBufferSize: Double,
      isEol: Boolean,
      line: Double,
      lineStartPos: Double,
      offset: Double
    ): HiddenPosTracker = {
      val __obj = js.Dynamic.literal(col = col.asInstanceOf[js.Any], droppedBufferSize = droppedBufferSize.asInstanceOf[js.Any], isEol = isEol.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], lineStartPos = lineStartPos.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
      __obj.asInstanceOf[HiddenPosTracker]
    }
    
    extension [Self <: HiddenPosTracker](x: Self) {
      
      inline def setCol(value: Double): Self = StObject.set(x, "col", value.asInstanceOf[js.Any])
      
      inline def setDroppedBufferSize(value: Double): Self = StObject.set(x, "droppedBufferSize", value.asInstanceOf[js.Any])
      
      inline def setIsEol(value: Boolean): Self = StObject.set(x, "isEol", value.asInstanceOf[js.Any])
      
      inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      inline def setLineStartPos(value: Double): Self = StObject.set(x, "lineStartPos", value.asInstanceOf[js.Any])
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    }
  }
  
  trait HiddenPreprocessor extends StObject {
    
    var endOfChunkHit: Boolean
    
    var gapStack: js.Array[Double]
    
    var html: js.UndefOr[String] = js.undefined
    
    var lastCharPos: Double
    
    var lastChunkWritten: Boolean
    
    var lastGapPos: Double
    
    var pos: Double
    
    var skipNextNewLine: Boolean
  }
  object HiddenPreprocessor {
    
    inline def apply(
      endOfChunkHit: Boolean,
      gapStack: js.Array[Double],
      lastCharPos: Double,
      lastChunkWritten: Boolean,
      lastGapPos: Double,
      pos: Double,
      skipNextNewLine: Boolean
    ): HiddenPreprocessor = {
      val __obj = js.Dynamic.literal(endOfChunkHit = endOfChunkHit.asInstanceOf[js.Any], gapStack = gapStack.asInstanceOf[js.Any], lastCharPos = lastCharPos.asInstanceOf[js.Any], lastChunkWritten = lastChunkWritten.asInstanceOf[js.Any], lastGapPos = lastGapPos.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any], skipNextNewLine = skipNextNewLine.asInstanceOf[js.Any])
      __obj.asInstanceOf[HiddenPreprocessor]
    }
    
    extension [Self <: HiddenPreprocessor](x: Self) {
      
      inline def setEndOfChunkHit(value: Boolean): Self = StObject.set(x, "endOfChunkHit", value.asInstanceOf[js.Any])
      
      inline def setGapStack(value: js.Array[Double]): Self = StObject.set(x, "gapStack", value.asInstanceOf[js.Any])
      
      inline def setGapStackVarargs(value: Double*): Self = StObject.set(x, "gapStack", js.Array(value*))
      
      inline def setHtml(value: String): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
      
      inline def setHtmlUndefined: Self = StObject.set(x, "html", js.undefined)
      
      inline def setLastCharPos(value: Double): Self = StObject.set(x, "lastCharPos", value.asInstanceOf[js.Any])
      
      inline def setLastChunkWritten(value: Boolean): Self = StObject.set(x, "lastChunkWritten", value.asInstanceOf[js.Any])
      
      inline def setLastGapPos(value: Double): Self = StObject.set(x, "lastGapPos", value.asInstanceOf[js.Any])
      
      inline def setPos(value: Double): Self = StObject.set(x, "pos", value.asInstanceOf[js.Any])
      
      inline def setSkipNextNewLine(value: Boolean): Self = StObject.set(x, "skipNextNewLine", value.asInstanceOf[js.Any])
    }
  }
  
  type HiddenToken = (Record[String, Any]) & Location
  
  trait HiddenTokenizer extends StObject {
    
    var NAMED_CHARACTER_REFERENCE_STATE: js.Function
    
    var NUMERIC_CHARACTER_REFERENCE_END_STATE: js.Function
    
    /**
      * Way too simple, but works for us.
      */
    var __mixins: js.Array[HiddenLocationTracker]
    
    def _consume(): Double
    
    var _flushCodePointsConsumedAsCharacterReference: js.Function
    
    var active: Boolean
    
    var charRefCode: Double
    
    var consumedAfterSnapshot: Double
    
    var currentAttr: Any
    
    var currentCharacterToken: js.UndefOr[HiddenToken] = js.undefined
    
    var currentToken: js.UndefOr[HiddenToken] = js.undefined
    
    var lastStartTagName: String
    
    var preprocessor: HiddenPreprocessor
    
    var returnState: String
    
    var state: String
    
    var tempBuff: js.Array[Double]
    
    var tokenQueue: js.Array[HiddenToken]
    
    def write(value: String): Unit
  }
  object HiddenTokenizer {
    
    inline def apply(
      NAMED_CHARACTER_REFERENCE_STATE: js.Function,
      NUMERIC_CHARACTER_REFERENCE_END_STATE: js.Function,
      __mixins: js.Array[HiddenLocationTracker],
      _consume: CallbackTo[Double],
      _flushCodePointsConsumedAsCharacterReference: js.Function,
      active: Boolean,
      charRefCode: Double,
      consumedAfterSnapshot: Double,
      currentAttr: Any,
      lastStartTagName: String,
      preprocessor: HiddenPreprocessor,
      returnState: String,
      state: String,
      tempBuff: js.Array[Double],
      tokenQueue: js.Array[HiddenToken],
      write: String => Callback
    ): HiddenTokenizer = {
      val __obj = js.Dynamic.literal(NAMED_CHARACTER_REFERENCE_STATE = NAMED_CHARACTER_REFERENCE_STATE.asInstanceOf[js.Any], NUMERIC_CHARACTER_REFERENCE_END_STATE = NUMERIC_CHARACTER_REFERENCE_END_STATE.asInstanceOf[js.Any], __mixins = __mixins.asInstanceOf[js.Any], _consume = _consume.toJsFn, _flushCodePointsConsumedAsCharacterReference = _flushCodePointsConsumedAsCharacterReference.asInstanceOf[js.Any], active = active.asInstanceOf[js.Any], charRefCode = charRefCode.asInstanceOf[js.Any], consumedAfterSnapshot = consumedAfterSnapshot.asInstanceOf[js.Any], currentAttr = currentAttr.asInstanceOf[js.Any], lastStartTagName = lastStartTagName.asInstanceOf[js.Any], preprocessor = preprocessor.asInstanceOf[js.Any], returnState = returnState.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], tempBuff = tempBuff.asInstanceOf[js.Any], tokenQueue = tokenQueue.asInstanceOf[js.Any], write = js.Any.fromFunction1((t0: String) => write(t0).runNow()))
      __obj.asInstanceOf[HiddenTokenizer]
    }
    
    extension [Self <: HiddenTokenizer](x: Self) {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setCharRefCode(value: Double): Self = StObject.set(x, "charRefCode", value.asInstanceOf[js.Any])
      
      inline def setConsumedAfterSnapshot(value: Double): Self = StObject.set(x, "consumedAfterSnapshot", value.asInstanceOf[js.Any])
      
      inline def setCurrentAttr(value: Any): Self = StObject.set(x, "currentAttr", value.asInstanceOf[js.Any])
      
      inline def setCurrentCharacterToken(value: HiddenToken): Self = StObject.set(x, "currentCharacterToken", value.asInstanceOf[js.Any])
      
      inline def setCurrentCharacterTokenUndefined: Self = StObject.set(x, "currentCharacterToken", js.undefined)
      
      inline def setCurrentToken(value: HiddenToken): Self = StObject.set(x, "currentToken", value.asInstanceOf[js.Any])
      
      inline def setCurrentTokenUndefined: Self = StObject.set(x, "currentToken", js.undefined)
      
      inline def setLastStartTagName(value: String): Self = StObject.set(x, "lastStartTagName", value.asInstanceOf[js.Any])
      
      inline def setNAMED_CHARACTER_REFERENCE_STATE(value: js.Function): Self = StObject.set(x, "NAMED_CHARACTER_REFERENCE_STATE", value.asInstanceOf[js.Any])
      
      inline def setNUMERIC_CHARACTER_REFERENCE_END_STATE(value: js.Function): Self = StObject.set(x, "NUMERIC_CHARACTER_REFERENCE_END_STATE", value.asInstanceOf[js.Any])
      
      inline def setPreprocessor(value: HiddenPreprocessor): Self = StObject.set(x, "preprocessor", value.asInstanceOf[js.Any])
      
      inline def setReturnState(value: String): Self = StObject.set(x, "returnState", value.asInstanceOf[js.Any])
      
      inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setTempBuff(value: js.Array[Double]): Self = StObject.set(x, "tempBuff", value.asInstanceOf[js.Any])
      
      inline def setTempBuffVarargs(value: Double*): Self = StObject.set(x, "tempBuff", js.Array(value*))
      
      inline def setTokenQueue(value: js.Array[HiddenToken]): Self = StObject.set(x, "tokenQueue", value.asInstanceOf[js.Any])
      
      inline def setTokenQueueVarargs(value: HiddenToken*): Self = StObject.set(x, "tokenQueue", js.Array(value*))
      
      inline def setWrite(value: String => Callback): Self = StObject.set(x, "write", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def set__mixins(value: js.Array[HiddenLocationTracker]): Self = StObject.set(x, "__mixins", value.asInstanceOf[js.Any])
      
      inline def set__mixinsVarargs(value: HiddenLocationTracker*): Self = StObject.set(x, "__mixins", js.Array(value*))
      
      inline def set_consume(value: CallbackTo[Double]): Self = StObject.set(x, "_consume", value.toJsFn)
      
      inline def set_flushCodePointsConsumedAsCharacterReference(value: js.Function): Self = StObject.set(x, "_flushCodePointsConsumedAsCharacterReference", value.asInstanceOf[js.Any])
    }
  }
  
  type Node = Root | Content
  
  trait Options extends StObject {
    
    /**
      * List of custom hast node types to pass through (keep) in hast.
      * If the passed through nodes have children, those children are expected to
      * be hast and will be handled.
      */
    var passThrough: js.UndefOr[js.Array[String]] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setPassThrough(value: js.Array[String]): Self = StObject.set(x, "passThrough", value.asInstanceOf[js.Any])
      
      inline def setPassThroughUndefined: Self = StObject.set(x, "passThrough", js.undefined)
      
      inline def setPassThroughVarargs(value: String*): Self = StObject.set(x, "passThrough", js.Array(value*))
    }
  }
  
  type P5Attribute = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_parse5.Attribute */ Any
  
  type P5Document = Document
  
  /* Inlined std.Omit<std.Element, 'parentNode'> */
  trait P5Element extends StObject {
    
    var ATTRIBUTE_NODE: Double
    
    var CDATA_SECTION_NODE: Double
    
    var COMMENT_NODE: Double
    
    var DOCUMENT_FRAGMENT_NODE: Double
    
    var DOCUMENT_NODE: Double
    
    var DOCUMENT_POSITION_CONTAINED_BY: Double
    
    var DOCUMENT_POSITION_CONTAINS: Double
    
    var DOCUMENT_POSITION_DISCONNECTED: Double
    
    var DOCUMENT_POSITION_FOLLOWING: Double
    
    var DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Double
    
    var DOCUMENT_POSITION_PRECEDING: Double
    
    var DOCUMENT_TYPE_NODE: Double
    
    var ELEMENT_NODE: Double
    
    var ENTITY_NODE: Double
    
    var ENTITY_REFERENCE_NODE: Double
    
    var NOTATION_NODE: Double
    
    var PROCESSING_INSTRUCTION_NODE: Double
    
    var TEXT_NODE: Double
    
    @JSName("addEventListener")
    var addEventListener_Original: js.Function2[
        fullscreenchange, 
        /* listener */ js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any], 
        Unit
      ]
    @JSName("addEventListener")
    def addEventListener_fullscreenchange(`type`: fullscreenchange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit
    
    def after(nodes: (org.scalajs.dom.Node | String)*): Unit
    @JSName("after")
    var after_Original: js.Function1[/* repeated */ org.scalajs.dom.Node | String, Unit]
    
    def animate(): Animation
    @JSName("animate")
    var animate_Original: js.Function0[Animation]
    
    def append(nodes: (org.scalajs.dom.Node | String)*): Unit
    
    def appendChild[T /* <: org.scalajs.dom.Node */](node: T): T
    @JSName("appendChild")
    var appendChild_Original: js.Function1[/* node */ org.scalajs.dom.Node, org.scalajs.dom.Node]
    
    @JSName("append")
    var append_Original: js.Function1[/* repeated */ org.scalajs.dom.Node | String, Unit]
    
    var ariaAtomic: js.UndefOr[String | Null] = js.undefined
    
    var ariaAutoComplete: js.UndefOr[String | Null] = js.undefined
    
    var ariaBusy: js.UndefOr[String | Null] = js.undefined
    
    var ariaChecked: js.UndefOr[String | Null] = js.undefined
    
    var ariaColCount: js.UndefOr[String | Null] = js.undefined
    
    var ariaColIndex: js.UndefOr[String | Null] = js.undefined
    
    var ariaColSpan: js.UndefOr[String | Null] = js.undefined
    
    var ariaCurrent: js.UndefOr[String | Null] = js.undefined
    
    var ariaDisabled: js.UndefOr[String | Null] = js.undefined
    
    var ariaExpanded: js.UndefOr[String | Null] = js.undefined
    
    var ariaHasPopup: js.UndefOr[String | Null] = js.undefined
    
    var ariaHidden: js.UndefOr[String | Null] = js.undefined
    
    var ariaKeyShortcuts: js.UndefOr[String | Null] = js.undefined
    
    var ariaLabel: js.UndefOr[String | Null] = js.undefined
    
    var ariaLevel: js.UndefOr[String | Null] = js.undefined
    
    var ariaLive: js.UndefOr[String | Null] = js.undefined
    
    var ariaModal: js.UndefOr[String | Null] = js.undefined
    
    var ariaMultiLine: js.UndefOr[String | Null] = js.undefined
    
    var ariaMultiSelectable: js.UndefOr[String | Null] = js.undefined
    
    var ariaOrientation: js.UndefOr[String | Null] = js.undefined
    
    var ariaPlaceholder: js.UndefOr[String | Null] = js.undefined
    
    var ariaPosInSet: js.UndefOr[String | Null] = js.undefined
    
    var ariaPressed: js.UndefOr[String | Null] = js.undefined
    
    var ariaReadOnly: js.UndefOr[String | Null] = js.undefined
    
    var ariaRequired: js.UndefOr[String | Null] = js.undefined
    
    var ariaRoleDescription: js.UndefOr[String | Null] = js.undefined
    
    var ariaRowCount: js.UndefOr[String | Null] = js.undefined
    
    var ariaRowIndex: js.UndefOr[String | Null] = js.undefined
    
    var ariaRowSpan: js.UndefOr[String | Null] = js.undefined
    
    var ariaSelected: js.UndefOr[String | Null] = js.undefined
    
    var ariaSetSize: js.UndefOr[String | Null] = js.undefined
    
    var ariaSort: js.UndefOr[String | Null] = js.undefined
    
    var ariaValueMax: js.UndefOr[String | Null] = js.undefined
    
    var ariaValueMin: js.UndefOr[String | Null] = js.undefined
    
    var ariaValueNow: js.UndefOr[String | Null] = js.undefined
    
    var ariaValueText: js.UndefOr[String | Null] = js.undefined
    
    var assignedSlot: js.UndefOr[HTMLSlotElement | Null] = js.undefined
    
    def attachShadow(init: ShadowRootInit): ShadowRoot
    @JSName("attachShadow")
    var attachShadow_Original: js.Function1[/* init */ ShadowRootInit, ShadowRoot]
    
    var attributes: NamedNodeMap
    
    var baseURI: String
    
    def before(nodes: (org.scalajs.dom.Node | String)*): Unit
    @JSName("before")
    var before_Original: js.Function1[/* repeated */ org.scalajs.dom.Node | String, Unit]
    
    var childElementCount: Double
    
    var childNodes: NodeList[ChildNode & org.scalajs.dom.Node]
    
    var children: HTMLCollection[Any]
    
    var classList: DOMTokenList
    
    var className: String
    
    var clientHeight: Double
    
    var clientLeft: Double
    
    var clientTop: Double
    
    var clientWidth: Double
    
    def cloneNode(): org.scalajs.dom.Node
    @JSName("cloneNode")
    var cloneNode_Original: js.Function0[org.scalajs.dom.Node]
    
    @JSName("closest")
    var closest_Original: js.Function1[a, HTMLAnchorElement | Null]
    @JSName("closest")
    def closest_a(selector: a): HTMLAnchorElement | Null
    
    def compareDocumentPosition(other: org.scalajs.dom.Node): Double
    @JSName("compareDocumentPosition")
    var compareDocumentPosition_Original: js.Function1[/* other */ org.scalajs.dom.Node, Double]
    
    def contains(): Boolean
    @JSName("contains")
    var contains_Original: js.Function0[Boolean]
    
    def dispatchEvent(event: Event): Boolean
    @JSName("dispatchEvent")
    var dispatchEvent_Original: js.Function1[/* event */ Event, Boolean]
    
    var firstChild: js.UndefOr[ChildNode | Null] = js.undefined
    
    var firstElementChild: js.UndefOr[org.scalajs.dom.Element | Null] = js.undefined
    
    def getAnimations(): js.Array[Animation]
    @JSName("getAnimations")
    var getAnimations_Original: js.Function0[js.Array[Animation]]
    
    def getAttribute(qualifiedName: String): String | Null
    
    def getAttributeNS(namespace: String, localName: String): String | Null
    @JSName("getAttributeNS")
    var getAttributeNS_Original: js.Function2[/* namespace */ String, /* localName */ String, String | Null]
    
    def getAttributeNames(): js.Array[String]
    @JSName("getAttributeNames")
    var getAttributeNames_Original: js.Function0[js.Array[String]]
    
    def getAttributeNode(qualifiedName: String): Attr | Null
    
    def getAttributeNodeNS(namespace: String, localName: String): Attr | Null
    @JSName("getAttributeNodeNS")
    var getAttributeNodeNS_Original: js.Function2[/* namespace */ String, /* localName */ String, Attr | Null]
    
    @JSName("getAttributeNode")
    var getAttributeNode_Original: js.Function1[/* qualifiedName */ String, Attr | Null]
    
    @JSName("getAttribute")
    var getAttribute_Original: js.Function1[/* qualifiedName */ String, String | Null]
    
    def getBoundingClientRect(): DOMRect
    @JSName("getBoundingClientRect")
    var getBoundingClientRect_Original: js.Function0[DOMRect]
    
    def getClientRects(): DOMRectList
    @JSName("getClientRects")
    var getClientRects_Original: js.Function0[DOMRectList]
    
    def getElementsByClassName(classNames: String): HTMLCollectionOf[org.scalajs.dom.Element]
    @JSName("getElementsByClassName")
    var getElementsByClassName_Original: js.Function1[/* classNames */ String, HTMLCollectionOf[org.scalajs.dom.Element]]
    
    @JSName("getElementsByTagNameNS")
    var getElementsByTagNameNS_Original: js.Function2[
        httpColonSlashSlashwwwDotw3DotorgSlash1999Slashxhtml, 
        /* localName */ String, 
        HTMLCollectionOf[HTMLElement]
      ]
    @JSName("getElementsByTagNameNS")
    def getElementsByTagNameNS_httpwwww3org1999xhtml(namespaceURI: httpColonSlashSlashwwwDotw3DotorgSlash1999Slashxhtml, localName: String): HTMLCollectionOf[HTMLElement]
    
    @JSName("getElementsByTagName")
    var getElementsByTagName_Original: js.Function1[a, HTMLCollectionOf[HTMLAnchorElement]]
    @JSName("getElementsByTagName")
    def getElementsByTagName_a(qualifiedName: a): HTMLCollectionOf[HTMLAnchorElement]
    
    def getRootNode(): org.scalajs.dom.Node
    @JSName("getRootNode")
    var getRootNode_Original: js.Function0[org.scalajs.dom.Node]
    
    def hasAttribute(qualifiedName: String): Boolean
    
    def hasAttributeNS(namespace: String, localName: String): Boolean
    @JSName("hasAttributeNS")
    var hasAttributeNS_Original: js.Function2[/* namespace */ String, /* localName */ String, Boolean]
    
    @JSName("hasAttribute")
    var hasAttribute_Original: js.Function1[/* qualifiedName */ String, Boolean]
    
    def hasAttributes(): Boolean
    @JSName("hasAttributes")
    var hasAttributes_Original: js.Function0[Boolean]
    
    def hasChildNodes(): Boolean
    @JSName("hasChildNodes")
    var hasChildNodes_Original: js.Function0[Boolean]
    
    def hasPointerCapture(pointerId: Double): Boolean
    @JSName("hasPointerCapture")
    var hasPointerCapture_Original: js.Function1[/* pointerId */ Double, Boolean]
    
    var id: String
    
    var innerHTML: String
    
    def insertAdjacentElement(where: InsertPosition, element: org.scalajs.dom.Element): org.scalajs.dom.Element | Null
    @JSName("insertAdjacentElement")
    var insertAdjacentElement_Original: js.Function2[
        /* where */ InsertPosition, 
        /* element */ org.scalajs.dom.Element, 
        org.scalajs.dom.Element | Null
      ]
    
    def insertAdjacentHTML(position: InsertPosition, text: String): Unit
    @JSName("insertAdjacentHTML")
    var insertAdjacentHTML_Original: js.Function2[/* position */ InsertPosition, /* text */ String, Unit]
    
    def insertAdjacentText(where: InsertPosition, data: String): Unit
    @JSName("insertAdjacentText")
    var insertAdjacentText_Original: js.Function2[/* where */ InsertPosition, /* data */ String, Unit]
    
    def insertBefore[T /* <: org.scalajs.dom.Node */](node: T): T
    @JSName("insertBefore")
    var insertBefore_Original: js.Function1[/* node */ org.scalajs.dom.Node, org.scalajs.dom.Node]
    
    var isConnected: Boolean
    
    def isDefaultNamespace(): Boolean
    @JSName("isDefaultNamespace")
    var isDefaultNamespace_Original: js.Function0[Boolean]
    
    def isEqualNode(): Boolean
    @JSName("isEqualNode")
    var isEqualNode_Original: js.Function0[Boolean]
    
    def isSameNode(): Boolean
    @JSName("isSameNode")
    var isSameNode_Original: js.Function0[Boolean]
    
    var lastChild: js.UndefOr[ChildNode | Null] = js.undefined
    
    var lastElementChild: js.UndefOr[org.scalajs.dom.Element | Null] = js.undefined
    
    var localName: String
    
    def lookupNamespaceURI(): String | Null
    @JSName("lookupNamespaceURI")
    var lookupNamespaceURI_Original: js.Function0[String | Null]
    
    def lookupPrefix(): String | Null
    @JSName("lookupPrefix")
    var lookupPrefix_Original: js.Function0[String | Null]
    
    def matches(selectors: String): Boolean
    @JSName("matches")
    var matches_Original: js.Function1[/* selectors */ String, Boolean]
    
    var namespaceURI: js.UndefOr[String | Null] = js.undefined
    
    var nextElementSibling: js.UndefOr[org.scalajs.dom.Element | Null] = js.undefined
    
    var nextSibling: js.UndefOr[ChildNode | Null] = js.undefined
    
    var nodeName: String
    
    var nodeType: Double
    
    var nodeValue: js.UndefOr[String | Null] = js.undefined
    
    def normalize(): Unit
    @JSName("normalize")
    var normalize_Original: js.Function0[Unit]
    
    var onfullscreenchange: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null] = js.undefined
    
    var onfullscreenerror: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null] = js.undefined
    
    var outerHTML: String
    
    var ownerDocument: Document
    
    var parentElement: js.UndefOr[HTMLElement | Null] = js.undefined
    
    var part: DOMTokenList
    
    var prefix: js.UndefOr[String | Null] = js.undefined
    
    def prepend(nodes: (org.scalajs.dom.Node | String)*): Unit
    @JSName("prepend")
    var prepend_Original: js.Function1[/* repeated */ org.scalajs.dom.Node | String, Unit]
    
    var previousElementSibling: js.UndefOr[org.scalajs.dom.Element | Null] = js.undefined
    
    var previousSibling: js.UndefOr[ChildNode | Null] = js.undefined
    
    @JSName("querySelectorAll")
    var querySelectorAll_Original: js.Function1[a, NodeList[HTMLAnchorElement & org.scalajs.dom.Node]]
    @JSName("querySelectorAll")
    def querySelectorAll_a(selectors: a): NodeList[HTMLAnchorElement & org.scalajs.dom.Node]
    
    @JSName("querySelector")
    var querySelector_Original: js.Function1[a, HTMLAnchorElement | Null]
    @JSName("querySelector")
    def querySelector_a(selectors: a): HTMLAnchorElement | Null
    
    def releasePointerCapture(pointerId: Double): Unit
    @JSName("releasePointerCapture")
    var releasePointerCapture_Original: js.Function1[/* pointerId */ Double, Unit]
    
    def remove(): Unit
    
    def removeAttribute(qualifiedName: String): Unit
    
    def removeAttributeNS(namespace: String, localName: String): Unit
    @JSName("removeAttributeNS")
    var removeAttributeNS_Original: js.Function2[/* namespace */ String, /* localName */ String, Unit]
    
    def removeAttributeNode(attr: Attr): Attr
    @JSName("removeAttributeNode")
    var removeAttributeNode_Original: js.Function1[/* attr */ Attr, Attr]
    
    @JSName("removeAttribute")
    var removeAttribute_Original: js.Function1[/* qualifiedName */ String, Unit]
    
    def removeChild[T /* <: org.scalajs.dom.Node */](child: T): T
    @JSName("removeChild")
    var removeChild_Original: js.Function1[/* child */ org.scalajs.dom.Node, org.scalajs.dom.Node]
    
    @JSName("removeEventListener")
    var removeEventListener_Original: js.Function2[
        fullscreenchange, 
        /* listener */ js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any], 
        Unit
      ]
    @JSName("removeEventListener")
    def removeEventListener_fullscreenchange(`type`: fullscreenchange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit
    
    @JSName("remove")
    var remove_Original: js.Function0[Unit]
    
    def replaceChild[T /* <: org.scalajs.dom.Node */](node: org.scalajs.dom.Node, child: T): T
    @JSName("replaceChild")
    var replaceChild_Original: js.Function2[
        /* node */ org.scalajs.dom.Node, 
        /* child */ org.scalajs.dom.Node, 
        org.scalajs.dom.Node
      ]
    
    def replaceChildren(nodes: (org.scalajs.dom.Node | String)*): Unit
    @JSName("replaceChildren")
    var replaceChildren_Original: js.Function1[/* repeated */ org.scalajs.dom.Node | String, Unit]
    
    def replaceWith(nodes: (org.scalajs.dom.Node | String)*): Unit
    @JSName("replaceWith")
    var replaceWith_Original: js.Function1[/* repeated */ org.scalajs.dom.Node | String, Unit]
    
    def requestFullscreen(): js.Promise[Unit]
    @JSName("requestFullscreen")
    var requestFullscreen_Original: js.Function0[js.Promise[Unit]]
    
    def requestPointerLock(): Unit
    @JSName("requestPointerLock")
    var requestPointerLock_Original: js.Function0[Unit]
    
    def scroll(): Unit
    
    def scrollBy(): Unit
    @JSName("scrollBy")
    var scrollBy_Original: js.Function0[Unit]
    
    var scrollHeight: Double
    
    def scrollIntoView(): Unit
    @JSName("scrollIntoView")
    var scrollIntoView_Original: js.Function0[Unit]
    
    var scrollLeft: Double
    
    def scrollTo(): Unit
    @JSName("scrollTo")
    var scrollTo_Original: js.Function0[Unit]
    
    var scrollTop: Double
    
    var scrollWidth: Double
    
    @JSName("scroll")
    var scroll_Original: js.Function0[Unit]
    
    def setAttribute(qualifiedName: String, value: String): Unit
    
    def setAttributeNS(namespace: String, qualifiedName: String, value: String): Unit
    @JSName("setAttributeNS")
    var setAttributeNS_Original: js.Function3[/* namespace */ String, /* qualifiedName */ String, /* value */ String, Unit]
    
    def setAttributeNode(attr: Attr): Attr | Null
    
    def setAttributeNodeNS(attr: Attr): Attr | Null
    @JSName("setAttributeNodeNS")
    var setAttributeNodeNS_Original: js.Function1[/* attr */ Attr, Attr | Null]
    
    @JSName("setAttributeNode")
    var setAttributeNode_Original: js.Function1[/* attr */ Attr, Attr | Null]
    
    @JSName("setAttribute")
    var setAttribute_Original: js.Function2[/* qualifiedName */ String, /* value */ String, Unit]
    
    def setPointerCapture(pointerId: Double): Unit
    @JSName("setPointerCapture")
    var setPointerCapture_Original: js.Function1[/* pointerId */ Double, Unit]
    
    var shadowRoot: js.UndefOr[ShadowRoot | Null] = js.undefined
    
    var slot: String
    
    var tagName: String
    
    var textContent: js.UndefOr[String | Null] = js.undefined
    
    def toggleAttribute(qualifiedName: String): Boolean
    @JSName("toggleAttribute")
    var toggleAttribute_Original: js.Function1[/* qualifiedName */ String, Boolean]
    
    def webkitMatchesSelector(selectors: String): Boolean
    @JSName("webkitMatchesSelector")
    var webkitMatchesSelector_Original: js.Function1[/* selectors */ String, Boolean]
  }
  object P5Element {
    
    inline def apply(
      ATTRIBUTE_NODE: Double,
      CDATA_SECTION_NODE: Double,
      COMMENT_NODE: Double,
      DOCUMENT_FRAGMENT_NODE: Double,
      DOCUMENT_NODE: Double,
      DOCUMENT_POSITION_CONTAINED_BY: Double,
      DOCUMENT_POSITION_CONTAINS: Double,
      DOCUMENT_POSITION_DISCONNECTED: Double,
      DOCUMENT_POSITION_FOLLOWING: Double,
      DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Double,
      DOCUMENT_POSITION_PRECEDING: Double,
      DOCUMENT_TYPE_NODE: Double,
      ELEMENT_NODE: Double,
      ENTITY_NODE: Double,
      ENTITY_REFERENCE_NODE: Double,
      NOTATION_NODE: Double,
      PROCESSING_INSTRUCTION_NODE: Double,
      TEXT_NODE: Double,
      addEventListener: (fullscreenchange, /* listener */ js.ThisFunction1[P5Element, /* ev */ Event, Any]) => Callback,
      after: /* repeated */ org.scalajs.dom.Node | String => Callback,
      animate: CallbackTo[Animation],
      append: /* repeated */ org.scalajs.dom.Node | String => Callback,
      appendChild: /* node */ org.scalajs.dom.Node => org.scalajs.dom.Node,
      attachShadow: /* init */ ShadowRootInit => ShadowRoot,
      attributes: NamedNodeMap,
      baseURI: String,
      before: /* repeated */ org.scalajs.dom.Node | String => Callback,
      childElementCount: Double,
      childNodes: NodeList[ChildNode & org.scalajs.dom.Node],
      children: HTMLCollection[Any],
      classList: DOMTokenList,
      className: String,
      clientHeight: Double,
      clientLeft: Double,
      clientTop: Double,
      clientWidth: Double,
      cloneNode: CallbackTo[org.scalajs.dom.Node],
      closest: a => HTMLAnchorElement | Null,
      compareDocumentPosition: /* other */ org.scalajs.dom.Node => Double,
      contains: CallbackTo[Boolean],
      dispatchEvent: /* event */ Event => Boolean,
      getAnimations: CallbackTo[js.Array[Animation]],
      getAttribute: /* qualifiedName */ String => String | Null,
      getAttributeNS: (/* namespace */ String, /* localName */ String) => String | Null,
      getAttributeNames: CallbackTo[js.Array[String]],
      getAttributeNode: /* qualifiedName */ String => Attr | Null,
      getAttributeNodeNS: (/* namespace */ String, /* localName */ String) => Attr | Null,
      getBoundingClientRect: CallbackTo[DOMRect],
      getClientRects: CallbackTo[DOMRectList],
      getElementsByClassName: /* classNames */ String => HTMLCollectionOf[org.scalajs.dom.Element],
      getElementsByTagName: a => HTMLCollectionOf[HTMLAnchorElement],
      getElementsByTagNameNS: (httpColonSlashSlashwwwDotw3DotorgSlash1999Slashxhtml, /* localName */ String) => HTMLCollectionOf[HTMLElement],
      getRootNode: CallbackTo[org.scalajs.dom.Node],
      hasAttribute: /* qualifiedName */ String => Boolean,
      hasAttributeNS: (/* namespace */ String, /* localName */ String) => Boolean,
      hasAttributes: CallbackTo[Boolean],
      hasChildNodes: CallbackTo[Boolean],
      hasPointerCapture: /* pointerId */ Double => Boolean,
      id: String,
      innerHTML: String,
      insertAdjacentElement: (/* where */ InsertPosition, /* element */ org.scalajs.dom.Element) => org.scalajs.dom.Element | Null,
      insertAdjacentHTML: (/* position */ InsertPosition, /* text */ String) => Callback,
      insertAdjacentText: (/* where */ InsertPosition, /* data */ String) => Callback,
      insertBefore: /* node */ org.scalajs.dom.Node => org.scalajs.dom.Node,
      isConnected: Boolean,
      isDefaultNamespace: CallbackTo[Boolean],
      isEqualNode: CallbackTo[Boolean],
      isSameNode: CallbackTo[Boolean],
      localName: String,
      lookupNamespaceURI: CallbackTo[String | Null],
      lookupPrefix: CallbackTo[String | Null],
      matches: /* selectors */ String => Boolean,
      nodeName: String,
      nodeType: Double,
      normalize: Callback,
      outerHTML: String,
      ownerDocument: Document,
      part: DOMTokenList,
      prepend: /* repeated */ org.scalajs.dom.Node | String => Callback,
      querySelector: a => HTMLAnchorElement | Null,
      querySelectorAll: a => NodeList[HTMLAnchorElement & org.scalajs.dom.Node],
      releasePointerCapture: /* pointerId */ Double => Callback,
      remove: Callback,
      removeAttribute: /* qualifiedName */ String => Callback,
      removeAttributeNS: (/* namespace */ String, /* localName */ String) => Callback,
      removeAttributeNode: /* attr */ Attr => Attr,
      removeChild: /* child */ org.scalajs.dom.Node => org.scalajs.dom.Node,
      removeEventListener: (fullscreenchange, /* listener */ js.ThisFunction1[P5Element, /* ev */ Event, Any]) => Callback,
      replaceChild: (/* node */ org.scalajs.dom.Node, /* child */ org.scalajs.dom.Node) => org.scalajs.dom.Node,
      replaceChildren: /* repeated */ org.scalajs.dom.Node | String => Callback,
      replaceWith: /* repeated */ org.scalajs.dom.Node | String => Callback,
      requestFullscreen: CallbackTo[js.Promise[Unit]],
      requestPointerLock: Callback,
      scroll: Callback,
      scrollBy: Callback,
      scrollHeight: Double,
      scrollIntoView: Callback,
      scrollLeft: Double,
      scrollTo: Callback,
      scrollTop: Double,
      scrollWidth: Double,
      setAttribute: (/* qualifiedName */ String, /* value */ String) => Callback,
      setAttributeNS: (/* namespace */ String, /* qualifiedName */ String, /* value */ String) => Callback,
      setAttributeNode: /* attr */ Attr => Attr | Null,
      setAttributeNodeNS: /* attr */ Attr => Attr | Null,
      setPointerCapture: /* pointerId */ Double => Callback,
      slot: String,
      tagName: String,
      toggleAttribute: /* qualifiedName */ String => Boolean,
      webkitMatchesSelector: /* selectors */ String => Boolean
    ): P5Element = {
      val __obj = js.Dynamic.literal(ATTRIBUTE_NODE = ATTRIBUTE_NODE.asInstanceOf[js.Any], CDATA_SECTION_NODE = CDATA_SECTION_NODE.asInstanceOf[js.Any], COMMENT_NODE = COMMENT_NODE.asInstanceOf[js.Any], DOCUMENT_FRAGMENT_NODE = DOCUMENT_FRAGMENT_NODE.asInstanceOf[js.Any], DOCUMENT_NODE = DOCUMENT_NODE.asInstanceOf[js.Any], DOCUMENT_POSITION_CONTAINED_BY = DOCUMENT_POSITION_CONTAINED_BY.asInstanceOf[js.Any], DOCUMENT_POSITION_CONTAINS = DOCUMENT_POSITION_CONTAINS.asInstanceOf[js.Any], DOCUMENT_POSITION_DISCONNECTED = DOCUMENT_POSITION_DISCONNECTED.asInstanceOf[js.Any], DOCUMENT_POSITION_FOLLOWING = DOCUMENT_POSITION_FOLLOWING.asInstanceOf[js.Any], DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC = DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC.asInstanceOf[js.Any], DOCUMENT_POSITION_PRECEDING = DOCUMENT_POSITION_PRECEDING.asInstanceOf[js.Any], DOCUMENT_TYPE_NODE = DOCUMENT_TYPE_NODE.asInstanceOf[js.Any], ELEMENT_NODE = ELEMENT_NODE.asInstanceOf[js.Any], ENTITY_NODE = ENTITY_NODE.asInstanceOf[js.Any], ENTITY_REFERENCE_NODE = ENTITY_REFERENCE_NODE.asInstanceOf[js.Any], NOTATION_NODE = NOTATION_NODE.asInstanceOf[js.Any], PROCESSING_INSTRUCTION_NODE = PROCESSING_INSTRUCTION_NODE.asInstanceOf[js.Any], TEXT_NODE = TEXT_NODE.asInstanceOf[js.Any], addEventListener = js.Any.fromFunction2((t0: fullscreenchange, t1: /* listener */ js.ThisFunction1[P5Element, /* ev */ Event, Any]) => (addEventListener(t0, t1)).runNow()), after = js.Any.fromFunction1((t0: /* repeated */ org.scalajs.dom.Node | String) => after(t0).runNow()), animate = animate.toJsFn, append = js.Any.fromFunction1((t0: /* repeated */ org.scalajs.dom.Node | String) => append(t0).runNow()), appendChild = js.Any.fromFunction1(appendChild), attachShadow = js.Any.fromFunction1(attachShadow), attributes = attributes.asInstanceOf[js.Any], baseURI = baseURI.asInstanceOf[js.Any], before = js.Any.fromFunction1((t0: /* repeated */ org.scalajs.dom.Node | String) => before(t0).runNow()), childElementCount = childElementCount.asInstanceOf[js.Any], childNodes = childNodes.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], classList = classList.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], clientHeight = clientHeight.asInstanceOf[js.Any], clientLeft = clientLeft.asInstanceOf[js.Any], clientTop = clientTop.asInstanceOf[js.Any], clientWidth = clientWidth.asInstanceOf[js.Any], cloneNode = cloneNode.toJsFn, closest = js.Any.fromFunction1(closest), compareDocumentPosition = js.Any.fromFunction1(compareDocumentPosition), contains = contains.toJsFn, dispatchEvent = js.Any.fromFunction1(dispatchEvent), getAnimations = getAnimations.toJsFn, getAttribute = js.Any.fromFunction1(getAttribute), getAttributeNS = js.Any.fromFunction2(getAttributeNS), getAttributeNames = getAttributeNames.toJsFn, getAttributeNode = js.Any.fromFunction1(getAttributeNode), getAttributeNodeNS = js.Any.fromFunction2(getAttributeNodeNS), getBoundingClientRect = getBoundingClientRect.toJsFn, getClientRects = getClientRects.toJsFn, getElementsByClassName = js.Any.fromFunction1(getElementsByClassName), getElementsByTagName = js.Any.fromFunction1(getElementsByTagName), getElementsByTagNameNS = js.Any.fromFunction2(getElementsByTagNameNS), getRootNode = getRootNode.toJsFn, hasAttribute = js.Any.fromFunction1(hasAttribute), hasAttributeNS = js.Any.fromFunction2(hasAttributeNS), hasAttributes = hasAttributes.toJsFn, hasChildNodes = hasChildNodes.toJsFn, hasPointerCapture = js.Any.fromFunction1(hasPointerCapture), id = id.asInstanceOf[js.Any], innerHTML = innerHTML.asInstanceOf[js.Any], insertAdjacentElement = js.Any.fromFunction2(insertAdjacentElement), insertAdjacentHTML = js.Any.fromFunction2((t0: /* position */ InsertPosition, t1: /* text */ String) => (insertAdjacentHTML(t0, t1)).runNow()), insertAdjacentText = js.Any.fromFunction2((t0: /* where */ InsertPosition, t1: /* data */ String) => (insertAdjacentText(t0, t1)).runNow()), insertBefore = js.Any.fromFunction1(insertBefore), isConnected = isConnected.asInstanceOf[js.Any], isDefaultNamespace = isDefaultNamespace.toJsFn, isEqualNode = isEqualNode.toJsFn, isSameNode = isSameNode.toJsFn, localName = localName.asInstanceOf[js.Any], lookupNamespaceURI = lookupNamespaceURI.toJsFn, lookupPrefix = lookupPrefix.toJsFn, matches = js.Any.fromFunction1(matches), nodeName = nodeName.asInstanceOf[js.Any], nodeType = nodeType.asInstanceOf[js.Any], normalize = normalize.toJsFn, outerHTML = outerHTML.asInstanceOf[js.Any], ownerDocument = ownerDocument.asInstanceOf[js.Any], part = part.asInstanceOf[js.Any], prepend = js.Any.fromFunction1((t0: /* repeated */ org.scalajs.dom.Node | String) => prepend(t0).runNow()), querySelector = js.Any.fromFunction1(querySelector), querySelectorAll = js.Any.fromFunction1(querySelectorAll), releasePointerCapture = js.Any.fromFunction1((t0: /* pointerId */ Double) => releasePointerCapture(t0).runNow()), remove = remove.toJsFn, removeAttribute = js.Any.fromFunction1((t0: /* qualifiedName */ String) => removeAttribute(t0).runNow()), removeAttributeNS = js.Any.fromFunction2((t0: /* namespace */ String, t1: /* localName */ String) => (removeAttributeNS(t0, t1)).runNow()), removeAttributeNode = js.Any.fromFunction1(removeAttributeNode), removeChild = js.Any.fromFunction1(removeChild), removeEventListener = js.Any.fromFunction2((t0: fullscreenchange, t1: /* listener */ js.ThisFunction1[P5Element, /* ev */ Event, Any]) => (removeEventListener(t0, t1)).runNow()), replaceChild = js.Any.fromFunction2(replaceChild), replaceChildren = js.Any.fromFunction1((t0: /* repeated */ org.scalajs.dom.Node | String) => replaceChildren(t0).runNow()), replaceWith = js.Any.fromFunction1((t0: /* repeated */ org.scalajs.dom.Node | String) => replaceWith(t0).runNow()), requestFullscreen = requestFullscreen.toJsFn, requestPointerLock = requestPointerLock.toJsFn, scroll = scroll.toJsFn, scrollBy = scrollBy.toJsFn, scrollHeight = scrollHeight.asInstanceOf[js.Any], scrollIntoView = scrollIntoView.toJsFn, scrollLeft = scrollLeft.asInstanceOf[js.Any], scrollTo = scrollTo.toJsFn, scrollTop = scrollTop.asInstanceOf[js.Any], scrollWidth = scrollWidth.asInstanceOf[js.Any], setAttribute = js.Any.fromFunction2((t0: /* qualifiedName */ String, t1: /* value */ String) => (setAttribute(t0, t1)).runNow()), setAttributeNS = js.Any.fromFunction3((t0: /* namespace */ String, t1: /* qualifiedName */ String, t2: /* value */ String) => (setAttributeNS(t0, t1, t2)).runNow()), setAttributeNode = js.Any.fromFunction1(setAttributeNode), setAttributeNodeNS = js.Any.fromFunction1(setAttributeNodeNS), setPointerCapture = js.Any.fromFunction1((t0: /* pointerId */ Double) => setPointerCapture(t0).runNow()), slot = slot.asInstanceOf[js.Any], tagName = tagName.asInstanceOf[js.Any], toggleAttribute = js.Any.fromFunction1(toggleAttribute), webkitMatchesSelector = js.Any.fromFunction1(webkitMatchesSelector))
      __obj.asInstanceOf[P5Element]
    }
    
    extension [Self <: P5Element](x: Self) {
      
      inline def setATTRIBUTE_NODE(value: Double): Self = StObject.set(x, "ATTRIBUTE_NODE", value.asInstanceOf[js.Any])
      
      inline def setAddEventListener(
        value: (fullscreenchange, /* listener */ js.ThisFunction1[P5Element, /* ev */ Event, Any]) => Callback
      ): Self = StObject.set(x, "addEventListener", js.Any.fromFunction2((t0: fullscreenchange, t1: /* listener */ js.ThisFunction1[P5Element, /* ev */ Event, Any]) => (value(t0, t1)).runNow()))
      
      inline def setAfter(value: /* repeated */ org.scalajs.dom.Node | String => Callback): Self = StObject.set(x, "after", js.Any.fromFunction1((t0: /* repeated */ org.scalajs.dom.Node | String) => value(t0).runNow()))
      
      inline def setAnimate(value: CallbackTo[Animation]): Self = StObject.set(x, "animate", value.toJsFn)
      
      inline def setAppend(value: /* repeated */ org.scalajs.dom.Node | String => Callback): Self = StObject.set(x, "append", js.Any.fromFunction1((t0: /* repeated */ org.scalajs.dom.Node | String) => value(t0).runNow()))
      
      inline def setAppendChild(value: /* node */ org.scalajs.dom.Node => org.scalajs.dom.Node): Self = StObject.set(x, "appendChild", js.Any.fromFunction1(value))
      
      inline def setAriaAtomic(value: String): Self = StObject.set(x, "ariaAtomic", value.asInstanceOf[js.Any])
      
      inline def setAriaAtomicNull: Self = StObject.set(x, "ariaAtomic", null)
      
      inline def setAriaAtomicUndefined: Self = StObject.set(x, "ariaAtomic", js.undefined)
      
      inline def setAriaAutoComplete(value: String): Self = StObject.set(x, "ariaAutoComplete", value.asInstanceOf[js.Any])
      
      inline def setAriaAutoCompleteNull: Self = StObject.set(x, "ariaAutoComplete", null)
      
      inline def setAriaAutoCompleteUndefined: Self = StObject.set(x, "ariaAutoComplete", js.undefined)
      
      inline def setAriaBusy(value: String): Self = StObject.set(x, "ariaBusy", value.asInstanceOf[js.Any])
      
      inline def setAriaBusyNull: Self = StObject.set(x, "ariaBusy", null)
      
      inline def setAriaBusyUndefined: Self = StObject.set(x, "ariaBusy", js.undefined)
      
      inline def setAriaChecked(value: String): Self = StObject.set(x, "ariaChecked", value.asInstanceOf[js.Any])
      
      inline def setAriaCheckedNull: Self = StObject.set(x, "ariaChecked", null)
      
      inline def setAriaCheckedUndefined: Self = StObject.set(x, "ariaChecked", js.undefined)
      
      inline def setAriaColCount(value: String): Self = StObject.set(x, "ariaColCount", value.asInstanceOf[js.Any])
      
      inline def setAriaColCountNull: Self = StObject.set(x, "ariaColCount", null)
      
      inline def setAriaColCountUndefined: Self = StObject.set(x, "ariaColCount", js.undefined)
      
      inline def setAriaColIndex(value: String): Self = StObject.set(x, "ariaColIndex", value.asInstanceOf[js.Any])
      
      inline def setAriaColIndexNull: Self = StObject.set(x, "ariaColIndex", null)
      
      inline def setAriaColIndexUndefined: Self = StObject.set(x, "ariaColIndex", js.undefined)
      
      inline def setAriaColSpan(value: String): Self = StObject.set(x, "ariaColSpan", value.asInstanceOf[js.Any])
      
      inline def setAriaColSpanNull: Self = StObject.set(x, "ariaColSpan", null)
      
      inline def setAriaColSpanUndefined: Self = StObject.set(x, "ariaColSpan", js.undefined)
      
      inline def setAriaCurrent(value: String): Self = StObject.set(x, "ariaCurrent", value.asInstanceOf[js.Any])
      
      inline def setAriaCurrentNull: Self = StObject.set(x, "ariaCurrent", null)
      
      inline def setAriaCurrentUndefined: Self = StObject.set(x, "ariaCurrent", js.undefined)
      
      inline def setAriaDisabled(value: String): Self = StObject.set(x, "ariaDisabled", value.asInstanceOf[js.Any])
      
      inline def setAriaDisabledNull: Self = StObject.set(x, "ariaDisabled", null)
      
      inline def setAriaDisabledUndefined: Self = StObject.set(x, "ariaDisabled", js.undefined)
      
      inline def setAriaExpanded(value: String): Self = StObject.set(x, "ariaExpanded", value.asInstanceOf[js.Any])
      
      inline def setAriaExpandedNull: Self = StObject.set(x, "ariaExpanded", null)
      
      inline def setAriaExpandedUndefined: Self = StObject.set(x, "ariaExpanded", js.undefined)
      
      inline def setAriaHasPopup(value: String): Self = StObject.set(x, "ariaHasPopup", value.asInstanceOf[js.Any])
      
      inline def setAriaHasPopupNull: Self = StObject.set(x, "ariaHasPopup", null)
      
      inline def setAriaHasPopupUndefined: Self = StObject.set(x, "ariaHasPopup", js.undefined)
      
      inline def setAriaHidden(value: String): Self = StObject.set(x, "ariaHidden", value.asInstanceOf[js.Any])
      
      inline def setAriaHiddenNull: Self = StObject.set(x, "ariaHidden", null)
      
      inline def setAriaHiddenUndefined: Self = StObject.set(x, "ariaHidden", js.undefined)
      
      inline def setAriaKeyShortcuts(value: String): Self = StObject.set(x, "ariaKeyShortcuts", value.asInstanceOf[js.Any])
      
      inline def setAriaKeyShortcutsNull: Self = StObject.set(x, "ariaKeyShortcuts", null)
      
      inline def setAriaKeyShortcutsUndefined: Self = StObject.set(x, "ariaKeyShortcuts", js.undefined)
      
      inline def setAriaLabel(value: String): Self = StObject.set(x, "ariaLabel", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelNull: Self = StObject.set(x, "ariaLabel", null)
      
      inline def setAriaLabelUndefined: Self = StObject.set(x, "ariaLabel", js.undefined)
      
      inline def setAriaLevel(value: String): Self = StObject.set(x, "ariaLevel", value.asInstanceOf[js.Any])
      
      inline def setAriaLevelNull: Self = StObject.set(x, "ariaLevel", null)
      
      inline def setAriaLevelUndefined: Self = StObject.set(x, "ariaLevel", js.undefined)
      
      inline def setAriaLive(value: String): Self = StObject.set(x, "ariaLive", value.asInstanceOf[js.Any])
      
      inline def setAriaLiveNull: Self = StObject.set(x, "ariaLive", null)
      
      inline def setAriaLiveUndefined: Self = StObject.set(x, "ariaLive", js.undefined)
      
      inline def setAriaModal(value: String): Self = StObject.set(x, "ariaModal", value.asInstanceOf[js.Any])
      
      inline def setAriaModalNull: Self = StObject.set(x, "ariaModal", null)
      
      inline def setAriaModalUndefined: Self = StObject.set(x, "ariaModal", js.undefined)
      
      inline def setAriaMultiLine(value: String): Self = StObject.set(x, "ariaMultiLine", value.asInstanceOf[js.Any])
      
      inline def setAriaMultiLineNull: Self = StObject.set(x, "ariaMultiLine", null)
      
      inline def setAriaMultiLineUndefined: Self = StObject.set(x, "ariaMultiLine", js.undefined)
      
      inline def setAriaMultiSelectable(value: String): Self = StObject.set(x, "ariaMultiSelectable", value.asInstanceOf[js.Any])
      
      inline def setAriaMultiSelectableNull: Self = StObject.set(x, "ariaMultiSelectable", null)
      
      inline def setAriaMultiSelectableUndefined: Self = StObject.set(x, "ariaMultiSelectable", js.undefined)
      
      inline def setAriaOrientation(value: String): Self = StObject.set(x, "ariaOrientation", value.asInstanceOf[js.Any])
      
      inline def setAriaOrientationNull: Self = StObject.set(x, "ariaOrientation", null)
      
      inline def setAriaOrientationUndefined: Self = StObject.set(x, "ariaOrientation", js.undefined)
      
      inline def setAriaPlaceholder(value: String): Self = StObject.set(x, "ariaPlaceholder", value.asInstanceOf[js.Any])
      
      inline def setAriaPlaceholderNull: Self = StObject.set(x, "ariaPlaceholder", null)
      
      inline def setAriaPlaceholderUndefined: Self = StObject.set(x, "ariaPlaceholder", js.undefined)
      
      inline def setAriaPosInSet(value: String): Self = StObject.set(x, "ariaPosInSet", value.asInstanceOf[js.Any])
      
      inline def setAriaPosInSetNull: Self = StObject.set(x, "ariaPosInSet", null)
      
      inline def setAriaPosInSetUndefined: Self = StObject.set(x, "ariaPosInSet", js.undefined)
      
      inline def setAriaPressed(value: String): Self = StObject.set(x, "ariaPressed", value.asInstanceOf[js.Any])
      
      inline def setAriaPressedNull: Self = StObject.set(x, "ariaPressed", null)
      
      inline def setAriaPressedUndefined: Self = StObject.set(x, "ariaPressed", js.undefined)
      
      inline def setAriaReadOnly(value: String): Self = StObject.set(x, "ariaReadOnly", value.asInstanceOf[js.Any])
      
      inline def setAriaReadOnlyNull: Self = StObject.set(x, "ariaReadOnly", null)
      
      inline def setAriaReadOnlyUndefined: Self = StObject.set(x, "ariaReadOnly", js.undefined)
      
      inline def setAriaRequired(value: String): Self = StObject.set(x, "ariaRequired", value.asInstanceOf[js.Any])
      
      inline def setAriaRequiredNull: Self = StObject.set(x, "ariaRequired", null)
      
      inline def setAriaRequiredUndefined: Self = StObject.set(x, "ariaRequired", js.undefined)
      
      inline def setAriaRoleDescription(value: String): Self = StObject.set(x, "ariaRoleDescription", value.asInstanceOf[js.Any])
      
      inline def setAriaRoleDescriptionNull: Self = StObject.set(x, "ariaRoleDescription", null)
      
      inline def setAriaRoleDescriptionUndefined: Self = StObject.set(x, "ariaRoleDescription", js.undefined)
      
      inline def setAriaRowCount(value: String): Self = StObject.set(x, "ariaRowCount", value.asInstanceOf[js.Any])
      
      inline def setAriaRowCountNull: Self = StObject.set(x, "ariaRowCount", null)
      
      inline def setAriaRowCountUndefined: Self = StObject.set(x, "ariaRowCount", js.undefined)
      
      inline def setAriaRowIndex(value: String): Self = StObject.set(x, "ariaRowIndex", value.asInstanceOf[js.Any])
      
      inline def setAriaRowIndexNull: Self = StObject.set(x, "ariaRowIndex", null)
      
      inline def setAriaRowIndexUndefined: Self = StObject.set(x, "ariaRowIndex", js.undefined)
      
      inline def setAriaRowSpan(value: String): Self = StObject.set(x, "ariaRowSpan", value.asInstanceOf[js.Any])
      
      inline def setAriaRowSpanNull: Self = StObject.set(x, "ariaRowSpan", null)
      
      inline def setAriaRowSpanUndefined: Self = StObject.set(x, "ariaRowSpan", js.undefined)
      
      inline def setAriaSelected(value: String): Self = StObject.set(x, "ariaSelected", value.asInstanceOf[js.Any])
      
      inline def setAriaSelectedNull: Self = StObject.set(x, "ariaSelected", null)
      
      inline def setAriaSelectedUndefined: Self = StObject.set(x, "ariaSelected", js.undefined)
      
      inline def setAriaSetSize(value: String): Self = StObject.set(x, "ariaSetSize", value.asInstanceOf[js.Any])
      
      inline def setAriaSetSizeNull: Self = StObject.set(x, "ariaSetSize", null)
      
      inline def setAriaSetSizeUndefined: Self = StObject.set(x, "ariaSetSize", js.undefined)
      
      inline def setAriaSort(value: String): Self = StObject.set(x, "ariaSort", value.asInstanceOf[js.Any])
      
      inline def setAriaSortNull: Self = StObject.set(x, "ariaSort", null)
      
      inline def setAriaSortUndefined: Self = StObject.set(x, "ariaSort", js.undefined)
      
      inline def setAriaValueMax(value: String): Self = StObject.set(x, "ariaValueMax", value.asInstanceOf[js.Any])
      
      inline def setAriaValueMaxNull: Self = StObject.set(x, "ariaValueMax", null)
      
      inline def setAriaValueMaxUndefined: Self = StObject.set(x, "ariaValueMax", js.undefined)
      
      inline def setAriaValueMin(value: String): Self = StObject.set(x, "ariaValueMin", value.asInstanceOf[js.Any])
      
      inline def setAriaValueMinNull: Self = StObject.set(x, "ariaValueMin", null)
      
      inline def setAriaValueMinUndefined: Self = StObject.set(x, "ariaValueMin", js.undefined)
      
      inline def setAriaValueNow(value: String): Self = StObject.set(x, "ariaValueNow", value.asInstanceOf[js.Any])
      
      inline def setAriaValueNowNull: Self = StObject.set(x, "ariaValueNow", null)
      
      inline def setAriaValueNowUndefined: Self = StObject.set(x, "ariaValueNow", js.undefined)
      
      inline def setAriaValueText(value: String): Self = StObject.set(x, "ariaValueText", value.asInstanceOf[js.Any])
      
      inline def setAriaValueTextNull: Self = StObject.set(x, "ariaValueText", null)
      
      inline def setAriaValueTextUndefined: Self = StObject.set(x, "ariaValueText", js.undefined)
      
      inline def setAssignedSlot(value: HTMLSlotElement): Self = StObject.set(x, "assignedSlot", value.asInstanceOf[js.Any])
      
      inline def setAssignedSlotNull: Self = StObject.set(x, "assignedSlot", null)
      
      inline def setAssignedSlotUndefined: Self = StObject.set(x, "assignedSlot", js.undefined)
      
      inline def setAttachShadow(value: /* init */ ShadowRootInit => ShadowRoot): Self = StObject.set(x, "attachShadow", js.Any.fromFunction1(value))
      
      inline def setAttributes(value: NamedNodeMap): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setBaseURI(value: String): Self = StObject.set(x, "baseURI", value.asInstanceOf[js.Any])
      
      inline def setBefore(value: /* repeated */ org.scalajs.dom.Node | String => Callback): Self = StObject.set(x, "before", js.Any.fromFunction1((t0: /* repeated */ org.scalajs.dom.Node | String) => value(t0).runNow()))
      
      inline def setCDATA_SECTION_NODE(value: Double): Self = StObject.set(x, "CDATA_SECTION_NODE", value.asInstanceOf[js.Any])
      
      inline def setCOMMENT_NODE(value: Double): Self = StObject.set(x, "COMMENT_NODE", value.asInstanceOf[js.Any])
      
      inline def setChildElementCount(value: Double): Self = StObject.set(x, "childElementCount", value.asInstanceOf[js.Any])
      
      inline def setChildNodes(value: NodeList[ChildNode & org.scalajs.dom.Node]): Self = StObject.set(x, "childNodes", value.asInstanceOf[js.Any])
      
      inline def setChildren(value: HTMLCollection[Any]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setClassList(value: DOMTokenList): Self = StObject.set(x, "classList", value.asInstanceOf[js.Any])
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClientHeight(value: Double): Self = StObject.set(x, "clientHeight", value.asInstanceOf[js.Any])
      
      inline def setClientLeft(value: Double): Self = StObject.set(x, "clientLeft", value.asInstanceOf[js.Any])
      
      inline def setClientTop(value: Double): Self = StObject.set(x, "clientTop", value.asInstanceOf[js.Any])
      
      inline def setClientWidth(value: Double): Self = StObject.set(x, "clientWidth", value.asInstanceOf[js.Any])
      
      inline def setCloneNode(value: CallbackTo[org.scalajs.dom.Node]): Self = StObject.set(x, "cloneNode", value.toJsFn)
      
      inline def setClosest(value: a => HTMLAnchorElement | Null): Self = StObject.set(x, "closest", js.Any.fromFunction1(value))
      
      inline def setCompareDocumentPosition(value: /* other */ org.scalajs.dom.Node => Double): Self = StObject.set(x, "compareDocumentPosition", js.Any.fromFunction1(value))
      
      inline def setContains(value: CallbackTo[Boolean]): Self = StObject.set(x, "contains", value.toJsFn)
      
      inline def setDOCUMENT_FRAGMENT_NODE(value: Double): Self = StObject.set(x, "DOCUMENT_FRAGMENT_NODE", value.asInstanceOf[js.Any])
      
      inline def setDOCUMENT_NODE(value: Double): Self = StObject.set(x, "DOCUMENT_NODE", value.asInstanceOf[js.Any])
      
      inline def setDOCUMENT_POSITION_CONTAINED_BY(value: Double): Self = StObject.set(x, "DOCUMENT_POSITION_CONTAINED_BY", value.asInstanceOf[js.Any])
      
      inline def setDOCUMENT_POSITION_CONTAINS(value: Double): Self = StObject.set(x, "DOCUMENT_POSITION_CONTAINS", value.asInstanceOf[js.Any])
      
      inline def setDOCUMENT_POSITION_DISCONNECTED(value: Double): Self = StObject.set(x, "DOCUMENT_POSITION_DISCONNECTED", value.asInstanceOf[js.Any])
      
      inline def setDOCUMENT_POSITION_FOLLOWING(value: Double): Self = StObject.set(x, "DOCUMENT_POSITION_FOLLOWING", value.asInstanceOf[js.Any])
      
      inline def setDOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC(value: Double): Self = StObject.set(x, "DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC", value.asInstanceOf[js.Any])
      
      inline def setDOCUMENT_POSITION_PRECEDING(value: Double): Self = StObject.set(x, "DOCUMENT_POSITION_PRECEDING", value.asInstanceOf[js.Any])
      
      inline def setDOCUMENT_TYPE_NODE(value: Double): Self = StObject.set(x, "DOCUMENT_TYPE_NODE", value.asInstanceOf[js.Any])
      
      inline def setDispatchEvent(value: /* event */ Event => Boolean): Self = StObject.set(x, "dispatchEvent", js.Any.fromFunction1(value))
      
      inline def setELEMENT_NODE(value: Double): Self = StObject.set(x, "ELEMENT_NODE", value.asInstanceOf[js.Any])
      
      inline def setENTITY_NODE(value: Double): Self = StObject.set(x, "ENTITY_NODE", value.asInstanceOf[js.Any])
      
      inline def setENTITY_REFERENCE_NODE(value: Double): Self = StObject.set(x, "ENTITY_REFERENCE_NODE", value.asInstanceOf[js.Any])
      
      inline def setFirstChild(value: ChildNode): Self = StObject.set(x, "firstChild", value.asInstanceOf[js.Any])
      
      inline def setFirstChildNull: Self = StObject.set(x, "firstChild", null)
      
      inline def setFirstChildUndefined: Self = StObject.set(x, "firstChild", js.undefined)
      
      inline def setFirstElementChild(value: org.scalajs.dom.Element): Self = StObject.set(x, "firstElementChild", value.asInstanceOf[js.Any])
      
      inline def setFirstElementChildNull: Self = StObject.set(x, "firstElementChild", null)
      
      inline def setFirstElementChildUndefined: Self = StObject.set(x, "firstElementChild", js.undefined)
      
      inline def setGetAnimations(value: CallbackTo[js.Array[Animation]]): Self = StObject.set(x, "getAnimations", value.toJsFn)
      
      inline def setGetAttribute(value: /* qualifiedName */ String => String | Null): Self = StObject.set(x, "getAttribute", js.Any.fromFunction1(value))
      
      inline def setGetAttributeNS(value: (/* namespace */ String, /* localName */ String) => String | Null): Self = StObject.set(x, "getAttributeNS", js.Any.fromFunction2(value))
      
      inline def setGetAttributeNames(value: CallbackTo[js.Array[String]]): Self = StObject.set(x, "getAttributeNames", value.toJsFn)
      
      inline def setGetAttributeNode(value: /* qualifiedName */ String => Attr | Null): Self = StObject.set(x, "getAttributeNode", js.Any.fromFunction1(value))
      
      inline def setGetAttributeNodeNS(value: (/* namespace */ String, /* localName */ String) => Attr | Null): Self = StObject.set(x, "getAttributeNodeNS", js.Any.fromFunction2(value))
      
      inline def setGetBoundingClientRect(value: CallbackTo[DOMRect]): Self = StObject.set(x, "getBoundingClientRect", value.toJsFn)
      
      inline def setGetClientRects(value: CallbackTo[DOMRectList]): Self = StObject.set(x, "getClientRects", value.toJsFn)
      
      inline def setGetElementsByClassName(value: /* classNames */ String => HTMLCollectionOf[org.scalajs.dom.Element]): Self = StObject.set(x, "getElementsByClassName", js.Any.fromFunction1(value))
      
      inline def setGetElementsByTagName(value: a => HTMLCollectionOf[HTMLAnchorElement]): Self = StObject.set(x, "getElementsByTagName", js.Any.fromFunction1(value))
      
      inline def setGetElementsByTagNameNS(
        value: (httpColonSlashSlashwwwDotw3DotorgSlash1999Slashxhtml, /* localName */ String) => HTMLCollectionOf[HTMLElement]
      ): Self = StObject.set(x, "getElementsByTagNameNS", js.Any.fromFunction2(value))
      
      inline def setGetRootNode(value: CallbackTo[org.scalajs.dom.Node]): Self = StObject.set(x, "getRootNode", value.toJsFn)
      
      inline def setHasAttribute(value: /* qualifiedName */ String => Boolean): Self = StObject.set(x, "hasAttribute", js.Any.fromFunction1(value))
      
      inline def setHasAttributeNS(value: (/* namespace */ String, /* localName */ String) => Boolean): Self = StObject.set(x, "hasAttributeNS", js.Any.fromFunction2(value))
      
      inline def setHasAttributes(value: CallbackTo[Boolean]): Self = StObject.set(x, "hasAttributes", value.toJsFn)
      
      inline def setHasChildNodes(value: CallbackTo[Boolean]): Self = StObject.set(x, "hasChildNodes", value.toJsFn)
      
      inline def setHasPointerCapture(value: /* pointerId */ Double => Boolean): Self = StObject.set(x, "hasPointerCapture", js.Any.fromFunction1(value))
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setInnerHTML(value: String): Self = StObject.set(x, "innerHTML", value.asInstanceOf[js.Any])
      
      inline def setInsertAdjacentElement(
        value: (/* where */ InsertPosition, /* element */ org.scalajs.dom.Element) => org.scalajs.dom.Element | Null
      ): Self = StObject.set(x, "insertAdjacentElement", js.Any.fromFunction2(value))
      
      inline def setInsertAdjacentHTML(value: (/* position */ InsertPosition, /* text */ String) => Callback): Self = StObject.set(x, "insertAdjacentHTML", js.Any.fromFunction2((t0: /* position */ InsertPosition, t1: /* text */ String) => (value(t0, t1)).runNow()))
      
      inline def setInsertAdjacentText(value: (/* where */ InsertPosition, /* data */ String) => Callback): Self = StObject.set(x, "insertAdjacentText", js.Any.fromFunction2((t0: /* where */ InsertPosition, t1: /* data */ String) => (value(t0, t1)).runNow()))
      
      inline def setInsertBefore(value: /* node */ org.scalajs.dom.Node => org.scalajs.dom.Node): Self = StObject.set(x, "insertBefore", js.Any.fromFunction1(value))
      
      inline def setIsConnected(value: Boolean): Self = StObject.set(x, "isConnected", value.asInstanceOf[js.Any])
      
      inline def setIsDefaultNamespace(value: CallbackTo[Boolean]): Self = StObject.set(x, "isDefaultNamespace", value.toJsFn)
      
      inline def setIsEqualNode(value: CallbackTo[Boolean]): Self = StObject.set(x, "isEqualNode", value.toJsFn)
      
      inline def setIsSameNode(value: CallbackTo[Boolean]): Self = StObject.set(x, "isSameNode", value.toJsFn)
      
      inline def setLastChild(value: ChildNode): Self = StObject.set(x, "lastChild", value.asInstanceOf[js.Any])
      
      inline def setLastChildNull: Self = StObject.set(x, "lastChild", null)
      
      inline def setLastChildUndefined: Self = StObject.set(x, "lastChild", js.undefined)
      
      inline def setLastElementChild(value: org.scalajs.dom.Element): Self = StObject.set(x, "lastElementChild", value.asInstanceOf[js.Any])
      
      inline def setLastElementChildNull: Self = StObject.set(x, "lastElementChild", null)
      
      inline def setLastElementChildUndefined: Self = StObject.set(x, "lastElementChild", js.undefined)
      
      inline def setLocalName(value: String): Self = StObject.set(x, "localName", value.asInstanceOf[js.Any])
      
      inline def setLookupNamespaceURI(value: CallbackTo[String | Null]): Self = StObject.set(x, "lookupNamespaceURI", value.toJsFn)
      
      inline def setLookupPrefix(value: CallbackTo[String | Null]): Self = StObject.set(x, "lookupPrefix", value.toJsFn)
      
      inline def setMatches(value: /* selectors */ String => Boolean): Self = StObject.set(x, "matches", js.Any.fromFunction1(value))
      
      inline def setNOTATION_NODE(value: Double): Self = StObject.set(x, "NOTATION_NODE", value.asInstanceOf[js.Any])
      
      inline def setNamespaceURI(value: String): Self = StObject.set(x, "namespaceURI", value.asInstanceOf[js.Any])
      
      inline def setNamespaceURINull: Self = StObject.set(x, "namespaceURI", null)
      
      inline def setNamespaceURIUndefined: Self = StObject.set(x, "namespaceURI", js.undefined)
      
      inline def setNextElementSibling(value: org.scalajs.dom.Element): Self = StObject.set(x, "nextElementSibling", value.asInstanceOf[js.Any])
      
      inline def setNextElementSiblingNull: Self = StObject.set(x, "nextElementSibling", null)
      
      inline def setNextElementSiblingUndefined: Self = StObject.set(x, "nextElementSibling", js.undefined)
      
      inline def setNextSibling(value: ChildNode): Self = StObject.set(x, "nextSibling", value.asInstanceOf[js.Any])
      
      inline def setNextSiblingNull: Self = StObject.set(x, "nextSibling", null)
      
      inline def setNextSiblingUndefined: Self = StObject.set(x, "nextSibling", js.undefined)
      
      inline def setNodeName(value: String): Self = StObject.set(x, "nodeName", value.asInstanceOf[js.Any])
      
      inline def setNodeType(value: Double): Self = StObject.set(x, "nodeType", value.asInstanceOf[js.Any])
      
      inline def setNodeValue(value: String): Self = StObject.set(x, "nodeValue", value.asInstanceOf[js.Any])
      
      inline def setNodeValueNull: Self = StObject.set(x, "nodeValue", null)
      
      inline def setNodeValueUndefined: Self = StObject.set(x, "nodeValue", js.undefined)
      
      inline def setNormalize(value: Callback): Self = StObject.set(x, "normalize", value.toJsFn)
      
      inline def setOnfullscreenchange(value: js.ThisFunction1[P5Element, /* ev */ Event, Any]): Self = StObject.set(x, "onfullscreenchange", value.asInstanceOf[js.Any])
      
      inline def setOnfullscreenchangeNull: Self = StObject.set(x, "onfullscreenchange", null)
      
      inline def setOnfullscreenchangeUndefined: Self = StObject.set(x, "onfullscreenchange", js.undefined)
      
      inline def setOnfullscreenerror(value: js.ThisFunction1[P5Element, /* ev */ Event, Any]): Self = StObject.set(x, "onfullscreenerror", value.asInstanceOf[js.Any])
      
      inline def setOnfullscreenerrorNull: Self = StObject.set(x, "onfullscreenerror", null)
      
      inline def setOnfullscreenerrorUndefined: Self = StObject.set(x, "onfullscreenerror", js.undefined)
      
      inline def setOuterHTML(value: String): Self = StObject.set(x, "outerHTML", value.asInstanceOf[js.Any])
      
      inline def setOwnerDocument(value: Document): Self = StObject.set(x, "ownerDocument", value.asInstanceOf[js.Any])
      
      inline def setPROCESSING_INSTRUCTION_NODE(value: Double): Self = StObject.set(x, "PROCESSING_INSTRUCTION_NODE", value.asInstanceOf[js.Any])
      
      inline def setParentElement(value: HTMLElement): Self = StObject.set(x, "parentElement", value.asInstanceOf[js.Any])
      
      inline def setParentElementNull: Self = StObject.set(x, "parentElement", null)
      
      inline def setParentElementUndefined: Self = StObject.set(x, "parentElement", js.undefined)
      
      inline def setPart(value: DOMTokenList): Self = StObject.set(x, "part", value.asInstanceOf[js.Any])
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixNull: Self = StObject.set(x, "prefix", null)
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      inline def setPrepend(value: /* repeated */ org.scalajs.dom.Node | String => Callback): Self = StObject.set(x, "prepend", js.Any.fromFunction1((t0: /* repeated */ org.scalajs.dom.Node | String) => value(t0).runNow()))
      
      inline def setPreviousElementSibling(value: org.scalajs.dom.Element): Self = StObject.set(x, "previousElementSibling", value.asInstanceOf[js.Any])
      
      inline def setPreviousElementSiblingNull: Self = StObject.set(x, "previousElementSibling", null)
      
      inline def setPreviousElementSiblingUndefined: Self = StObject.set(x, "previousElementSibling", js.undefined)
      
      inline def setPreviousSibling(value: ChildNode): Self = StObject.set(x, "previousSibling", value.asInstanceOf[js.Any])
      
      inline def setPreviousSiblingNull: Self = StObject.set(x, "previousSibling", null)
      
      inline def setPreviousSiblingUndefined: Self = StObject.set(x, "previousSibling", js.undefined)
      
      inline def setQuerySelector(value: a => HTMLAnchorElement | Null): Self = StObject.set(x, "querySelector", js.Any.fromFunction1(value))
      
      inline def setQuerySelectorAll(value: a => NodeList[HTMLAnchorElement & org.scalajs.dom.Node]): Self = StObject.set(x, "querySelectorAll", js.Any.fromFunction1(value))
      
      inline def setReleasePointerCapture(value: /* pointerId */ Double => Callback): Self = StObject.set(x, "releasePointerCapture", js.Any.fromFunction1((t0: /* pointerId */ Double) => value(t0).runNow()))
      
      inline def setRemove(value: Callback): Self = StObject.set(x, "remove", value.toJsFn)
      
      inline def setRemoveAttribute(value: /* qualifiedName */ String => Callback): Self = StObject.set(x, "removeAttribute", js.Any.fromFunction1((t0: /* qualifiedName */ String) => value(t0).runNow()))
      
      inline def setRemoveAttributeNS(value: (/* namespace */ String, /* localName */ String) => Callback): Self = StObject.set(x, "removeAttributeNS", js.Any.fromFunction2((t0: /* namespace */ String, t1: /* localName */ String) => (value(t0, t1)).runNow()))
      
      inline def setRemoveAttributeNode(value: /* attr */ Attr => Attr): Self = StObject.set(x, "removeAttributeNode", js.Any.fromFunction1(value))
      
      inline def setRemoveChild(value: /* child */ org.scalajs.dom.Node => org.scalajs.dom.Node): Self = StObject.set(x, "removeChild", js.Any.fromFunction1(value))
      
      inline def setRemoveEventListener(
        value: (fullscreenchange, /* listener */ js.ThisFunction1[P5Element, /* ev */ Event, Any]) => Callback
      ): Self = StObject.set(x, "removeEventListener", js.Any.fromFunction2((t0: fullscreenchange, t1: /* listener */ js.ThisFunction1[P5Element, /* ev */ Event, Any]) => (value(t0, t1)).runNow()))
      
      inline def setReplaceChild(value: (/* node */ org.scalajs.dom.Node, /* child */ org.scalajs.dom.Node) => org.scalajs.dom.Node): Self = StObject.set(x, "replaceChild", js.Any.fromFunction2(value))
      
      inline def setReplaceChildren(value: /* repeated */ org.scalajs.dom.Node | String => Callback): Self = StObject.set(x, "replaceChildren", js.Any.fromFunction1((t0: /* repeated */ org.scalajs.dom.Node | String) => value(t0).runNow()))
      
      inline def setReplaceWith(value: /* repeated */ org.scalajs.dom.Node | String => Callback): Self = StObject.set(x, "replaceWith", js.Any.fromFunction1((t0: /* repeated */ org.scalajs.dom.Node | String) => value(t0).runNow()))
      
      inline def setRequestFullscreen(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "requestFullscreen", value.toJsFn)
      
      inline def setRequestPointerLock(value: Callback): Self = StObject.set(x, "requestPointerLock", value.toJsFn)
      
      inline def setScroll(value: Callback): Self = StObject.set(x, "scroll", value.toJsFn)
      
      inline def setScrollBy(value: Callback): Self = StObject.set(x, "scrollBy", value.toJsFn)
      
      inline def setScrollHeight(value: Double): Self = StObject.set(x, "scrollHeight", value.asInstanceOf[js.Any])
      
      inline def setScrollIntoView(value: Callback): Self = StObject.set(x, "scrollIntoView", value.toJsFn)
      
      inline def setScrollLeft(value: Double): Self = StObject.set(x, "scrollLeft", value.asInstanceOf[js.Any])
      
      inline def setScrollTo(value: Callback): Self = StObject.set(x, "scrollTo", value.toJsFn)
      
      inline def setScrollTop(value: Double): Self = StObject.set(x, "scrollTop", value.asInstanceOf[js.Any])
      
      inline def setScrollWidth(value: Double): Self = StObject.set(x, "scrollWidth", value.asInstanceOf[js.Any])
      
      inline def setSetAttribute(value: (/* qualifiedName */ String, /* value */ String) => Callback): Self = StObject.set(x, "setAttribute", js.Any.fromFunction2((t0: /* qualifiedName */ String, t1: /* value */ String) => (value(t0, t1)).runNow()))
      
      inline def setSetAttributeNS(value: (/* namespace */ String, /* qualifiedName */ String, /* value */ String) => Callback): Self = StObject.set(x, "setAttributeNS", js.Any.fromFunction3((t0: /* namespace */ String, t1: /* qualifiedName */ String, t2: /* value */ String) => (value(t0, t1, t2)).runNow()))
      
      inline def setSetAttributeNode(value: /* attr */ Attr => Attr | Null): Self = StObject.set(x, "setAttributeNode", js.Any.fromFunction1(value))
      
      inline def setSetAttributeNodeNS(value: /* attr */ Attr => Attr | Null): Self = StObject.set(x, "setAttributeNodeNS", js.Any.fromFunction1(value))
      
      inline def setSetPointerCapture(value: /* pointerId */ Double => Callback): Self = StObject.set(x, "setPointerCapture", js.Any.fromFunction1((t0: /* pointerId */ Double) => value(t0).runNow()))
      
      inline def setShadowRoot(value: ShadowRoot): Self = StObject.set(x, "shadowRoot", value.asInstanceOf[js.Any])
      
      inline def setShadowRootNull: Self = StObject.set(x, "shadowRoot", null)
      
      inline def setShadowRootUndefined: Self = StObject.set(x, "shadowRoot", js.undefined)
      
      inline def setSlot(value: String): Self = StObject.set(x, "slot", value.asInstanceOf[js.Any])
      
      inline def setTEXT_NODE(value: Double): Self = StObject.set(x, "TEXT_NODE", value.asInstanceOf[js.Any])
      
      inline def setTagName(value: String): Self = StObject.set(x, "tagName", value.asInstanceOf[js.Any])
      
      inline def setTextContent(value: String): Self = StObject.set(x, "textContent", value.asInstanceOf[js.Any])
      
      inline def setTextContentNull: Self = StObject.set(x, "textContent", null)
      
      inline def setTextContentUndefined: Self = StObject.set(x, "textContent", js.undefined)
      
      inline def setToggleAttribute(value: /* qualifiedName */ String => Boolean): Self = StObject.set(x, "toggleAttribute", js.Any.fromFunction1(value))
      
      inline def setWebkitMatchesSelector(value: /* selectors */ String => Boolean): Self = StObject.set(x, "webkitMatchesSelector", js.Any.fromFunction1(value))
    }
  }
  
  type P5Fragment = DocumentFragment
  
  /* Inlined std.Omit<std.Location, 'startOffset' | 'endOffset'> & {  startOffset :number | undefined,   endOffset :number | undefined} */
  trait P5Location extends StObject {
    
    var ancestorOrigins: DOMStringList
    
    def assign(url: String): Unit
    @JSName("assign")
    var assign_Original: js.Function1[/* url */ String, Unit]
    
    var endOffset: js.UndefOr[Double] = js.undefined
    
    var hash: String
    
    var host: String
    
    var hostname: String
    
    var href: String
    
    var origin: String
    
    var pathname: String
    
    var port: String
    
    var protocol: String
    
    def reload(): Unit
    @JSName("reload")
    var reload_Original: js.Function0[Unit]
    
    def replace(url: String): Unit
    @JSName("replace")
    var replace_Original: js.Function1[/* url */ String, Unit]
    
    var search: String
    
    var startOffset: js.UndefOr[Double] = js.undefined
    
    @JSName("toString")
    var toString_Original: js.Function0[String]
  }
  object P5Location {
    
    inline def apply(
      ancestorOrigins: DOMStringList,
      assign: /* url */ String => Callback,
      hash: String,
      host: String,
      hostname: String,
      href: String,
      origin: String,
      pathname: String,
      port: String,
      protocol: String,
      reload: Callback,
      replace: /* url */ String => Callback,
      search: String,
      toString_ : CallbackTo[String]
    ): P5Location = {
      val __obj = js.Dynamic.literal(ancestorOrigins = ancestorOrigins.asInstanceOf[js.Any], assign = js.Any.fromFunction1((t0: /* url */ String) => assign(t0).runNow()), hash = hash.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], hostname = hostname.asInstanceOf[js.Any], href = href.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], pathname = pathname.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], reload = reload.toJsFn, replace = js.Any.fromFunction1((t0: /* url */ String) => replace(t0).runNow()), search = search.asInstanceOf[js.Any])
      __obj.updateDynamic("toString")(toString_.toJsFn)
      __obj.asInstanceOf[P5Location]
    }
    
    extension [Self <: P5Location](x: Self) {
      
      inline def setAncestorOrigins(value: DOMStringList): Self = StObject.set(x, "ancestorOrigins", value.asInstanceOf[js.Any])
      
      inline def setAssign(value: /* url */ String => Callback): Self = StObject.set(x, "assign", js.Any.fromFunction1((t0: /* url */ String) => value(t0).runNow()))
      
      inline def setEndOffset(value: Double): Self = StObject.set(x, "endOffset", value.asInstanceOf[js.Any])
      
      inline def setEndOffsetUndefined: Self = StObject.set(x, "endOffset", js.undefined)
      
      inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
      
      inline def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
      
      inline def setPathname(value: String): Self = StObject.set(x, "pathname", value.asInstanceOf[js.Any])
      
      inline def setPort(value: String): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      inline def setReload(value: Callback): Self = StObject.set(x, "reload", value.toJsFn)
      
      inline def setReplace(value: /* url */ String => Callback): Self = StObject.set(x, "replace", js.Any.fromFunction1((t0: /* url */ String) => value(t0).runNow()))
      
      inline def setSearch(value: String): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
      
      inline def setStartOffset(value: Double): Self = StObject.set(x, "startOffset", value.asInstanceOf[js.Any])
      
      inline def setStartOffsetUndefined: Self = StObject.set(x, "startOffset", js.undefined)
      
      inline def setToString_(value: CallbackTo[String]): Self = StObject.set(x, "toString", value.toJsFn)
    }
  }
  
  type P5ParserOptions = ParserOptions[TreeAdapterTypeMap[Any, Any, Any, Any, Any, Any, Any, Any, Any, Any]]
  
  type Raw_ = Raw
  
  type Root = typingsJapgolly.hast.mod.Root
  
  /* Inlined std.Omit<hast-util-raw.hast-util-raw/lib.Comment, 'value'> & {  value :{  stitch :hast-util-raw.hast-util-raw/lib.Node}} */
  trait Stitch extends StObject {
    
    var data: js.UndefOr[Data] = js.undefined
    
    var position: js.UndefOr[Position] = js.undefined
    
    var `type`: comment
    
    var value: typingsJapgolly.hastUtilRaw.anon.Stitch
  }
  object Stitch {
    
    inline def apply(value: typingsJapgolly.hastUtilRaw.anon.Stitch): Stitch = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("comment")
      __obj.asInstanceOf[Stitch]
    }
    
    extension [Self <: Stitch](x: Self) {
      
      inline def setData(value: Data): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setPosition(value: Position): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setType(value: comment): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: typingsJapgolly.hastUtilRaw.anon.Stitch): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type Text = typingsJapgolly.hast.mod.Text
  
  type VFile = typingsJapgolly.vfile.mod.VFile
}
