package typingsJapgolly.petitDom.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.Attr
import org.scalajs.dom.DOMRect
import org.scalajs.dom.DOMTokenList
import org.scalajs.dom.Document
import org.scalajs.dom.Event
import org.scalajs.dom.HTMLAnchorElement
import org.scalajs.dom.HTMLCollection
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.NamedNodeMap
import org.scalajs.dom.Node
import org.scalajs.dom.NodeList
import org.scalajs.dom.ParentNode
import typingsJapgolly.petitDom.anon.PropsElement
import typingsJapgolly.petitDom.anon.PropsHTMLAnchorElementcon
import typingsJapgolly.petitDom.anon.PropsHTMLAreaElementconte
import typingsJapgolly.petitDom.anon.PropsHTMLAudioElementcont
import typingsJapgolly.petitDom.anon.PropsHTMLBRElementcontent
import typingsJapgolly.petitDom.anon.PropsHTMLBaseElementconte
import typingsJapgolly.petitDom.anon.PropsHTMLBodyElementconte
import typingsJapgolly.petitDom.anon.PropsHTMLButtonElementcon
import typingsJapgolly.petitDom.anon.PropsHTMLCanvasElementcon
import typingsJapgolly.petitDom.anon.PropsHTMLDListElementcont
import typingsJapgolly.petitDom.anon.PropsHTMLDataElementconte
import typingsJapgolly.petitDom.anon.PropsHTMLDataListElementc
import typingsJapgolly.petitDom.anon.PropsHTMLDetailsElementco
import typingsJapgolly.petitDom.anon.PropsHTMLDialogElementcon
import typingsJapgolly.petitDom.anon.PropsHTMLDivElementconten
import typingsJapgolly.petitDom.anon.PropsHTMLElementcontentCo
import typingsJapgolly.petitDom.anon.PropsHTMLEmbedElementcont
import typingsJapgolly.petitDom.anon.PropsHTMLFieldSetElementc
import typingsJapgolly.petitDom.anon.PropsHTMLFormElementconte
import typingsJapgolly.petitDom.anon.PropsHTMLHRElementcontent
import typingsJapgolly.petitDom.anon.PropsHTMLHeadElementconte
import typingsJapgolly.petitDom.anon.PropsHTMLHeadingElementco
import typingsJapgolly.petitDom.anon.PropsHTMLHtmlElementconte
import typingsJapgolly.petitDom.anon.PropsHTMLIFrameElementcon
import typingsJapgolly.petitDom.anon.PropsHTMLImageElementcont
import typingsJapgolly.petitDom.anon.PropsHTMLInputElementcont
import typingsJapgolly.petitDom.anon.PropsHTMLLIElementcontent
import typingsJapgolly.petitDom.anon.PropsHTMLLabelElementcont
import typingsJapgolly.petitDom.anon.PropsHTMLLegendElementcon
import typingsJapgolly.petitDom.anon.PropsHTMLLinkElementconte
import typingsJapgolly.petitDom.anon.PropsHTMLMapElementconten
import typingsJapgolly.petitDom.anon.PropsHTMLMenuElementconte
import typingsJapgolly.petitDom.anon.PropsHTMLMetaElementconte
import typingsJapgolly.petitDom.anon.PropsHTMLMeterElementcont
import typingsJapgolly.petitDom.anon.PropsHTMLModElementconten
import typingsJapgolly.petitDom.anon.PropsHTMLOListElementcont
import typingsJapgolly.petitDom.anon.PropsHTMLObjectElementcon
import typingsJapgolly.petitDom.anon.PropsHTMLOptGroupElementc
import typingsJapgolly.petitDom.anon.PropsHTMLOptionElementcon
import typingsJapgolly.petitDom.anon.PropsHTMLOutputElementcon
import typingsJapgolly.petitDom.anon.PropsHTMLParagraphElement
import typingsJapgolly.petitDom.anon.PropsHTMLPictureElementco
import typingsJapgolly.petitDom.anon.PropsHTMLPreElementconten
import typingsJapgolly.petitDom.anon.PropsHTMLProgressElementc
import typingsJapgolly.petitDom.anon.PropsHTMLQuoteElementcont
import typingsJapgolly.petitDom.anon.PropsHTMLScriptElementcon
import typingsJapgolly.petitDom.anon.PropsHTMLSelectElementcon
import typingsJapgolly.petitDom.anon.PropsHTMLSlotElementconte
import typingsJapgolly.petitDom.anon.PropsHTMLSourceElementcon
import typingsJapgolly.petitDom.anon.PropsHTMLSpanElementconte
import typingsJapgolly.petitDom.anon.PropsHTMLStyleElementcont
import typingsJapgolly.petitDom.anon.PropsHTMLTableCaptionElem
import typingsJapgolly.petitDom.anon.PropsHTMLTableCellElement
import typingsJapgolly.petitDom.anon.PropsHTMLTableColElementc
import typingsJapgolly.petitDom.anon.PropsHTMLTableElementcont
import typingsJapgolly.petitDom.anon.PropsHTMLTableRowElementc
import typingsJapgolly.petitDom.anon.PropsHTMLTableSectionElem
import typingsJapgolly.petitDom.anon.PropsHTMLTemplateElementc
import typingsJapgolly.petitDom.anon.PropsHTMLTextAreaElementc
import typingsJapgolly.petitDom.anon.PropsHTMLTimeElementconte
import typingsJapgolly.petitDom.anon.PropsHTMLTitleElementcont
import typingsJapgolly.petitDom.anon.PropsHTMLTrackElementcont
import typingsJapgolly.petitDom.anon.PropsHTMLUListElementcont
import typingsJapgolly.petitDom.anon.PropsHTMLVideoElementcont
import typingsJapgolly.petitDom.anon.PropsSVGAnimateElementcon
import typingsJapgolly.petitDom.anon.PropsSVGAnimateMotionElem
import typingsJapgolly.petitDom.anon.PropsSVGAnimateTransformE
import typingsJapgolly.petitDom.anon.PropsSVGCircleElementcont
import typingsJapgolly.petitDom.anon.PropsSVGClipPathElementco
import typingsJapgolly.petitDom.anon.PropsSVGDefsElementconten
import typingsJapgolly.petitDom.anon.PropsSVGDescElementconten
import typingsJapgolly.petitDom.anon.PropsSVGEllipseElementcon
import typingsJapgolly.petitDom.anon.PropsSVGFEBlendElementcon
import typingsJapgolly.petitDom.anon.PropsSVGFEColorMatrixElem
import typingsJapgolly.petitDom.anon.PropsSVGFEComponentTransf
import typingsJapgolly.petitDom.anon.PropsSVGFECompositeElemen
import typingsJapgolly.petitDom.anon.PropsSVGFEConvolveMatrixE
import typingsJapgolly.petitDom.anon.PropsSVGFEDiffuseLighting
import typingsJapgolly.petitDom.anon.PropsSVGFEDisplacementMap
import typingsJapgolly.petitDom.anon.PropsSVGFEDistantLightEle
import typingsJapgolly.petitDom.anon.PropsSVGFEDropShadowEleme
import typingsJapgolly.petitDom.anon.PropsSVGFEFloodElementcon
import typingsJapgolly.petitDom.anon.PropsSVGFEFuncAElementcon
import typingsJapgolly.petitDom.anon.PropsSVGFEFuncBElementcon
import typingsJapgolly.petitDom.anon.PropsSVGFEFuncGElementcon
import typingsJapgolly.petitDom.anon.PropsSVGFEFuncRElementcon
import typingsJapgolly.petitDom.anon.PropsSVGFEGaussianBlurEle
import typingsJapgolly.petitDom.anon.PropsSVGFEImageElementcon
import typingsJapgolly.petitDom.anon.PropsSVGFEMergeElementcon
import typingsJapgolly.petitDom.anon.PropsSVGFEMergeNodeElemen
import typingsJapgolly.petitDom.anon.PropsSVGFEMorphologyEleme
import typingsJapgolly.petitDom.anon.PropsSVGFEOffsetElementco
import typingsJapgolly.petitDom.anon.PropsSVGFEPointLightEleme
import typingsJapgolly.petitDom.anon.PropsSVGFESpecularLightin
import typingsJapgolly.petitDom.anon.PropsSVGFESpotLightElemen
import typingsJapgolly.petitDom.anon.PropsSVGFETileElementcont
import typingsJapgolly.petitDom.anon.PropsSVGFETurbulenceEleme
import typingsJapgolly.petitDom.anon.PropsSVGFilterElementcont
import typingsJapgolly.petitDom.anon.PropsSVGForeignObjectElem
import typingsJapgolly.petitDom.anon.PropsSVGGElementcontentCo
import typingsJapgolly.petitDom.anon.PropsSVGImageElementconte
import typingsJapgolly.petitDom.anon.PropsSVGLineElementconten
import typingsJapgolly.petitDom.anon.PropsSVGLinearGradientEle
import typingsJapgolly.petitDom.anon.PropsSVGMPathElementconte
import typingsJapgolly.petitDom.anon.PropsSVGMarkerElementcont
import typingsJapgolly.petitDom.anon.PropsSVGMaskElementconten
import typingsJapgolly.petitDom.anon.PropsSVGMetadataElementco
import typingsJapgolly.petitDom.anon.PropsSVGPathElementconten
import typingsJapgolly.petitDom.anon.PropsSVGPatternElementcon
import typingsJapgolly.petitDom.anon.PropsSVGPolygonElementcon
import typingsJapgolly.petitDom.anon.PropsSVGPolylineElementco
import typingsJapgolly.petitDom.anon.PropsSVGRadialGradientEle
import typingsJapgolly.petitDom.anon.PropsSVGRectElementconten
import typingsJapgolly.petitDom.anon.PropsSVGSVGElementcontent
import typingsJapgolly.petitDom.anon.PropsSVGSetElementcontent
import typingsJapgolly.petitDom.anon.PropsSVGStopElementconten
import typingsJapgolly.petitDom.anon.PropsSVGSwitchElementcont
import typingsJapgolly.petitDom.anon.PropsSVGSymbolElementcont
import typingsJapgolly.petitDom.anon.PropsSVGTSpanElementconte
import typingsJapgolly.petitDom.anon.PropsSVGTextElementconten
import typingsJapgolly.petitDom.anon.PropsSVGTextPathElementco
import typingsJapgolly.petitDom.anon.PropsSVGUseElementcontent
import typingsJapgolly.petitDom.anon.PropsSVGViewElementconten
import typingsJapgolly.petitDom.mod.PetitDom.Component
import typingsJapgolly.petitDom.mod.PetitDom.ComponentProps
import typingsJapgolly.petitDom.mod.PetitDom.Content
import typingsJapgolly.petitDom.mod.PetitDom.IntrinsicProps
import typingsJapgolly.petitDom.mod.PetitDom.Key
import typingsJapgolly.petitDom.mod.PetitDom.VNode
import typingsJapgolly.petitDom.petitDomStrings.a
import typingsJapgolly.petitDom.petitDomStrings.fullscreenchange
import typingsJapgolly.petitDom.petitDomStrings.httpColonSlashSlashwwwDotw3DotorgSlash1999Slashxhtml
import typingsJapgolly.std.Animation
import typingsJapgolly.std.ChildNode
import typingsJapgolly.std.DOMRectList
import typingsJapgolly.std.HTMLCollectionOf
import typingsJapgolly.std.HTMLSlotElement
import typingsJapgolly.std.InsertPosition
import typingsJapgolly.std.ShadowRoot
import typingsJapgolly.std.ShadowRootInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object JSX {
    
    // tslint:disable-next-line:no-empty-interface
    type Element = VNode
    
    trait ElementAttributesProperty extends StObject {
      
      var props: PropsElement
    }
    object ElementAttributesProperty {
      
      inline def apply(props: PropsElement): ElementAttributesProperty = {
        val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any])
        __obj.asInstanceOf[ElementAttributesProperty]
      }
      
      extension [Self <: ElementAttributesProperty](x: Self) {
        
        inline def setProps(value: PropsElement): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      }
    }
    
    trait ElementChildrenAttribute extends StObject {
      
      var content: js.Array[VNode]
    }
    object ElementChildrenAttribute {
      
      inline def apply(content: js.Array[VNode]): ElementChildrenAttribute = {
        val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
        __obj.asInstanceOf[ElementChildrenAttribute]
      }
      
      extension [Self <: ElementChildrenAttribute](x: Self) {
        
        inline def setContent(value: js.Array[VNode]): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
        
        inline def setContentVarargs(value: VNode*): Self = StObject.set(x, "content", js.Array(value*))
      }
    }
    
    type ElementClass = Component[ComponentProps]
    
    // tslint:disable-next-line:no-empty-interface
    type IntrinsicAttributes = IntrinsicProps
    
    // tslint:disable-next-line:no-empty-interface
    /* Inlined parent petit-dom.petit-dom.PetitDom.Props<std.Element> */
    trait IntrinsicClassAttributes[T] extends StObject {
      
      var ATTRIBUTE_NODE: js.UndefOr[Double] = js.undefined
      
      var CDATA_SECTION_NODE: js.UndefOr[Double] = js.undefined
      
      var COMMENT_NODE: js.UndefOr[Double] = js.undefined
      
      var DOCUMENT_FRAGMENT_NODE: js.UndefOr[Double] = js.undefined
      
      var DOCUMENT_NODE: js.UndefOr[Double] = js.undefined
      
      var DOCUMENT_POSITION_CONTAINED_BY: js.UndefOr[Double] = js.undefined
      
      var DOCUMENT_POSITION_CONTAINS: js.UndefOr[Double] = js.undefined
      
      var DOCUMENT_POSITION_DISCONNECTED: js.UndefOr[Double] = js.undefined
      
      var DOCUMENT_POSITION_FOLLOWING: js.UndefOr[Double] = js.undefined
      
      var DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: js.UndefOr[Double] = js.undefined
      
      var DOCUMENT_POSITION_PRECEDING: js.UndefOr[Double] = js.undefined
      
      var DOCUMENT_TYPE_NODE: js.UndefOr[Double] = js.undefined
      
      var ELEMENT_NODE: js.UndefOr[Double] = js.undefined
      
      var ENTITY_NODE: js.UndefOr[Double] = js.undefined
      
      var ENTITY_REFERENCE_NODE: js.UndefOr[Double] = js.undefined
      
      var NOTATION_NODE: js.UndefOr[Double] = js.undefined
      
      var PROCESSING_INSTRUCTION_NODE: js.UndefOr[Double] = js.undefined
      
      var TEXT_NODE: js.UndefOr[Double] = js.undefined
      
      var addEventListener: js.UndefOr[
            js.Function2[
              fullscreenchange, 
              /* listener */ js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any], 
              Unit
            ]
          ] = js.undefined
      
      var after: js.UndefOr[js.Function1[/* repeated */ Node | String, Unit]] = js.undefined
      
      var animate: js.UndefOr[js.Function0[Animation]] = js.undefined
      
      var append: js.UndefOr[js.Function1[/* repeated */ Node | String, Unit]] = js.undefined
      
      var appendChild: js.UndefOr[js.Function1[/* node */ Node, Node]] = js.undefined
      
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
      
      var attachShadow: js.UndefOr[js.Function1[/* init */ ShadowRootInit, ShadowRoot]] = js.undefined
      
      var attributes: js.UndefOr[NamedNodeMap] = js.undefined
      
      var baseURI: js.UndefOr[String] = js.undefined
      
      var before: js.UndefOr[js.Function1[/* repeated */ Node | String, Unit]] = js.undefined
      
      var childElementCount: js.UndefOr[Double] = js.undefined
      
      var childNodes: js.UndefOr[NodeList[ChildNode & Node]] = js.undefined
      
      var children: js.UndefOr[HTMLCollection[Any]] = js.undefined
      
      var classList: js.UndefOr[DOMTokenList] = js.undefined
      
      var className: js.UndefOr[String] = js.undefined
      
      var clientHeight: js.UndefOr[Double] = js.undefined
      
      var clientLeft: js.UndefOr[Double] = js.undefined
      
      var clientTop: js.UndefOr[Double] = js.undefined
      
      var clientWidth: js.UndefOr[Double] = js.undefined
      
      var cloneNode: js.UndefOr[js.Function0[Node]] = js.undefined
      
      var closest: js.UndefOr[js.Function1[a, HTMLAnchorElement | Null]] = js.undefined
      
      var compareDocumentPosition: js.UndefOr[js.Function1[/* other */ Node, Double]] = js.undefined
      
      var contains: js.UndefOr[js.Function0[Boolean]] = js.undefined
      
      var content: js.UndefOr[Content | js.Array[Content]] = js.undefined
      
      var dispatchEvent: js.UndefOr[js.Function1[/* event */ Event, Boolean]] = js.undefined
      
      var firstChild: js.UndefOr[ChildNode | Null] = js.undefined
      
      var firstElementChild: js.UndefOr[org.scalajs.dom.Element | Null] = js.undefined
      
      var getAnimations: js.UndefOr[js.Function0[js.Array[Animation]]] = js.undefined
      
      var getAttribute: js.UndefOr[js.Function1[/* qualifiedName */ String, String | Null]] = js.undefined
      
      var getAttributeNS: js.UndefOr[js.Function2[/* namespace */ String, /* localName */ String, String | Null]] = js.undefined
      
      var getAttributeNames: js.UndefOr[js.Function0[js.Array[String]]] = js.undefined
      
      var getAttributeNode: js.UndefOr[js.Function1[/* qualifiedName */ String, Attr | Null]] = js.undefined
      
      var getAttributeNodeNS: js.UndefOr[js.Function2[/* namespace */ String, /* localName */ String, Attr | Null]] = js.undefined
      
      var getBoundingClientRect: js.UndefOr[js.Function0[DOMRect]] = js.undefined
      
      var getClientRects: js.UndefOr[js.Function0[DOMRectList]] = js.undefined
      
      var getElementsByClassName: js.UndefOr[js.Function1[/* classNames */ String, HTMLCollectionOf[org.scalajs.dom.Element]]] = js.undefined
      
      var getElementsByTagName: js.UndefOr[js.Function1[a, HTMLCollectionOf[HTMLAnchorElement]]] = js.undefined
      
      var getElementsByTagNameNS: js.UndefOr[
            js.Function2[
              httpColonSlashSlashwwwDotw3DotorgSlash1999Slashxhtml, 
              /* localName */ String, 
              HTMLCollectionOf[HTMLElement]
            ]
          ] = js.undefined
      
      var getRootNode: js.UndefOr[js.Function0[Node]] = js.undefined
      
      var hasAttribute: js.UndefOr[js.Function1[/* qualifiedName */ String, Boolean]] = js.undefined
      
      var hasAttributeNS: js.UndefOr[js.Function2[/* namespace */ String, /* localName */ String, Boolean]] = js.undefined
      
      var hasAttributes: js.UndefOr[js.Function0[Boolean]] = js.undefined
      
      var hasChildNodes: js.UndefOr[js.Function0[Boolean]] = js.undefined
      
      var hasPointerCapture: js.UndefOr[js.Function1[/* pointerId */ Double, Boolean]] = js.undefined
      
      var id: js.UndefOr[String] = js.undefined
      
      var innerHTML: js.UndefOr[String] = js.undefined
      
      var insertAdjacentElement: js.UndefOr[
            js.Function2[
              /* where */ InsertPosition, 
              /* element */ org.scalajs.dom.Element, 
              org.scalajs.dom.Element | Null
            ]
          ] = js.undefined
      
      var insertAdjacentHTML: js.UndefOr[js.Function2[/* position */ InsertPosition, /* text */ String, Unit]] = js.undefined
      
      var insertAdjacentText: js.UndefOr[js.Function2[/* where */ InsertPosition, /* data */ String, Unit]] = js.undefined
      
      var insertBefore: js.UndefOr[js.Function1[/* node */ Node, Node]] = js.undefined
      
      var isConnected: js.UndefOr[Boolean] = js.undefined
      
      var isDefaultNamespace: js.UndefOr[js.Function0[Boolean]] = js.undefined
      
      var isEqualNode: js.UndefOr[js.Function0[Boolean]] = js.undefined
      
      var isSameNode: js.UndefOr[js.Function0[Boolean]] = js.undefined
      
      var key: js.UndefOr[Key] = js.undefined
      
      var lastChild: js.UndefOr[ChildNode | Null] = js.undefined
      
      var lastElementChild: js.UndefOr[org.scalajs.dom.Element | Null] = js.undefined
      
      var localName: js.UndefOr[String] = js.undefined
      
      var lookupNamespaceURI: js.UndefOr[js.Function0[String | Null]] = js.undefined
      
      var lookupPrefix: js.UndefOr[js.Function0[String | Null]] = js.undefined
      
      var matches: js.UndefOr[js.Function1[/* selectors */ String, Boolean]] = js.undefined
      
      var namespaceURI: js.UndefOr[String | Null] = js.undefined
      
      var nextElementSibling: js.UndefOr[org.scalajs.dom.Element | Null] = js.undefined
      
      var nextSibling: js.UndefOr[ChildNode | Null] = js.undefined
      
      var nodeName: js.UndefOr[String] = js.undefined
      
      var nodeType: js.UndefOr[Double] = js.undefined
      
      var nodeValue: js.UndefOr[String | Null] = js.undefined
      
      var normalize: js.UndefOr[js.Function0[Unit]] = js.undefined
      
      var onfullscreenchange: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null] = js.undefined
      
      var onfullscreenerror: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null] = js.undefined
      
      var outerHTML: js.UndefOr[String] = js.undefined
      
      var ownerDocument: js.UndefOr[Document] = js.undefined
      
      var parentElement: js.UndefOr[HTMLElement | Null] = js.undefined
      
      var parentNode: js.UndefOr[ParentNode | Null] = js.undefined
      
      var part: js.UndefOr[DOMTokenList] = js.undefined
      
      var prefix: js.UndefOr[String | Null] = js.undefined
      
      var prepend: js.UndefOr[js.Function1[/* repeated */ Node | String, Unit]] = js.undefined
      
      var previousElementSibling: js.UndefOr[org.scalajs.dom.Element | Null] = js.undefined
      
      var previousSibling: js.UndefOr[ChildNode | Null] = js.undefined
      
      var querySelector: js.UndefOr[js.Function1[a, HTMLAnchorElement | Null]] = js.undefined
      
      var querySelectorAll: js.UndefOr[js.Function1[a, NodeList[HTMLAnchorElement & Node]]] = js.undefined
      
      var releasePointerCapture: js.UndefOr[js.Function1[/* pointerId */ Double, Unit]] = js.undefined
      
      var remove: js.UndefOr[js.Function0[Unit]] = js.undefined
      
      var removeAttribute: js.UndefOr[js.Function1[/* qualifiedName */ String, Unit]] = js.undefined
      
      var removeAttributeNS: js.UndefOr[js.Function2[/* namespace */ String, /* localName */ String, Unit]] = js.undefined
      
      var removeAttributeNode: js.UndefOr[js.Function1[/* attr */ Attr, Attr]] = js.undefined
      
      var removeChild: js.UndefOr[js.Function1[/* child */ Node, Node]] = js.undefined
      
      var removeEventListener: js.UndefOr[
            js.Function2[
              fullscreenchange, 
              /* listener */ js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any], 
              Unit
            ]
          ] = js.undefined
      
      var replaceChild: js.UndefOr[js.Function2[/* node */ Node, /* child */ Node, Node]] = js.undefined
      
      var replaceChildren: js.UndefOr[js.Function1[/* repeated */ Node | String, Unit]] = js.undefined
      
      var replaceWith: js.UndefOr[js.Function1[/* repeated */ Node | String, Unit]] = js.undefined
      
      var requestFullscreen: js.UndefOr[js.Function0[js.Promise[Unit]]] = js.undefined
      
      var requestPointerLock: js.UndefOr[js.Function0[Unit]] = js.undefined
      
      var scroll: js.UndefOr[js.Function0[Unit]] = js.undefined
      
      var scrollBy: js.UndefOr[js.Function0[Unit]] = js.undefined
      
      var scrollHeight: js.UndefOr[Double] = js.undefined
      
      var scrollIntoView: js.UndefOr[js.Function0[Unit]] = js.undefined
      
      var scrollLeft: js.UndefOr[Double] = js.undefined
      
      var scrollTo: js.UndefOr[js.Function0[Unit]] = js.undefined
      
      var scrollTop: js.UndefOr[Double] = js.undefined
      
      var scrollWidth: js.UndefOr[Double] = js.undefined
      
      var setAttribute: js.UndefOr[js.Function2[/* qualifiedName */ String, /* value */ String, Unit]] = js.undefined
      
      var setAttributeNS: js.UndefOr[
            js.Function3[/* namespace */ String, /* qualifiedName */ String, /* value */ String, Unit]
          ] = js.undefined
      
      var setAttributeNode: js.UndefOr[js.Function1[/* attr */ Attr, Attr | Null]] = js.undefined
      
      var setAttributeNodeNS: js.UndefOr[js.Function1[/* attr */ Attr, Attr | Null]] = js.undefined
      
      var setPointerCapture: js.UndefOr[js.Function1[/* pointerId */ Double, Unit]] = js.undefined
      
      var shadowRoot: js.UndefOr[ShadowRoot | Null] = js.undefined
      
      var slot: js.UndefOr[String] = js.undefined
      
      var tagName: js.UndefOr[String] = js.undefined
      
      var textContent: js.UndefOr[String | Null] = js.undefined
      
      var toggleAttribute: js.UndefOr[js.Function1[/* qualifiedName */ String, Boolean]] = js.undefined
      
      var webkitMatchesSelector: js.UndefOr[js.Function1[/* selectors */ String, Boolean]] = js.undefined
    }
    object IntrinsicClassAttributes {
      
      inline def apply[T](): IntrinsicClassAttributes[T] = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IntrinsicClassAttributes[T]]
      }
      
      extension [Self <: IntrinsicClassAttributes[?], T](x: Self & IntrinsicClassAttributes[T]) {
        
        inline def setATTRIBUTE_NODE(value: Double): Self = StObject.set(x, "ATTRIBUTE_NODE", value.asInstanceOf[js.Any])
        
        inline def setATTRIBUTE_NODEUndefined: Self = StObject.set(x, "ATTRIBUTE_NODE", js.undefined)
        
        inline def setAddEventListener(
          value: (fullscreenchange, /* listener */ js.ThisFunction1[IntrinsicClassAttributes[T], /* ev */ Event, Any]) => Callback
        ): Self = StObject.set(x, "addEventListener", js.Any.fromFunction2((t0: fullscreenchange, t1: /* listener */ js.ThisFunction1[IntrinsicClassAttributes[T], /* ev */ Event, Any]) => (value(t0, t1)).runNow()))
        
        inline def setAddEventListenerUndefined: Self = StObject.set(x, "addEventListener", js.undefined)
        
        inline def setAfter(value: /* repeated */ Node | String => Callback): Self = StObject.set(x, "after", js.Any.fromFunction1((t0: /* repeated */ Node | String) => value(t0).runNow()))
        
        inline def setAfterUndefined: Self = StObject.set(x, "after", js.undefined)
        
        inline def setAnimate(value: CallbackTo[Animation]): Self = StObject.set(x, "animate", value.toJsFn)
        
        inline def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
        
        inline def setAppend(value: /* repeated */ Node | String => Callback): Self = StObject.set(x, "append", js.Any.fromFunction1((t0: /* repeated */ Node | String) => value(t0).runNow()))
        
        inline def setAppendChild(value: /* node */ Node => Node): Self = StObject.set(x, "appendChild", js.Any.fromFunction1(value))
        
        inline def setAppendChildUndefined: Self = StObject.set(x, "appendChild", js.undefined)
        
        inline def setAppendUndefined: Self = StObject.set(x, "append", js.undefined)
        
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
        
        inline def setAttachShadowUndefined: Self = StObject.set(x, "attachShadow", js.undefined)
        
        inline def setAttributes(value: NamedNodeMap): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
        
        inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
        
        inline def setBaseURI(value: String): Self = StObject.set(x, "baseURI", value.asInstanceOf[js.Any])
        
        inline def setBaseURIUndefined: Self = StObject.set(x, "baseURI", js.undefined)
        
        inline def setBefore(value: /* repeated */ Node | String => Callback): Self = StObject.set(x, "before", js.Any.fromFunction1((t0: /* repeated */ Node | String) => value(t0).runNow()))
        
        inline def setBeforeUndefined: Self = StObject.set(x, "before", js.undefined)
        
        inline def setCDATA_SECTION_NODE(value: Double): Self = StObject.set(x, "CDATA_SECTION_NODE", value.asInstanceOf[js.Any])
        
        inline def setCDATA_SECTION_NODEUndefined: Self = StObject.set(x, "CDATA_SECTION_NODE", js.undefined)
        
        inline def setCOMMENT_NODE(value: Double): Self = StObject.set(x, "COMMENT_NODE", value.asInstanceOf[js.Any])
        
        inline def setCOMMENT_NODEUndefined: Self = StObject.set(x, "COMMENT_NODE", js.undefined)
        
        inline def setChildElementCount(value: Double): Self = StObject.set(x, "childElementCount", value.asInstanceOf[js.Any])
        
        inline def setChildElementCountUndefined: Self = StObject.set(x, "childElementCount", js.undefined)
        
        inline def setChildNodes(value: NodeList[ChildNode & Node]): Self = StObject.set(x, "childNodes", value.asInstanceOf[js.Any])
        
        inline def setChildNodesUndefined: Self = StObject.set(x, "childNodes", js.undefined)
        
        inline def setChildren(value: HTMLCollection[Any]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
        
        inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
        
        inline def setClassList(value: DOMTokenList): Self = StObject.set(x, "classList", value.asInstanceOf[js.Any])
        
        inline def setClassListUndefined: Self = StObject.set(x, "classList", js.undefined)
        
        inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
        
        inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
        
        inline def setClientHeight(value: Double): Self = StObject.set(x, "clientHeight", value.asInstanceOf[js.Any])
        
        inline def setClientHeightUndefined: Self = StObject.set(x, "clientHeight", js.undefined)
        
        inline def setClientLeft(value: Double): Self = StObject.set(x, "clientLeft", value.asInstanceOf[js.Any])
        
        inline def setClientLeftUndefined: Self = StObject.set(x, "clientLeft", js.undefined)
        
        inline def setClientTop(value: Double): Self = StObject.set(x, "clientTop", value.asInstanceOf[js.Any])
        
        inline def setClientTopUndefined: Self = StObject.set(x, "clientTop", js.undefined)
        
        inline def setClientWidth(value: Double): Self = StObject.set(x, "clientWidth", value.asInstanceOf[js.Any])
        
        inline def setClientWidthUndefined: Self = StObject.set(x, "clientWidth", js.undefined)
        
        inline def setCloneNode(value: CallbackTo[Node]): Self = StObject.set(x, "cloneNode", value.toJsFn)
        
        inline def setCloneNodeUndefined: Self = StObject.set(x, "cloneNode", js.undefined)
        
        inline def setClosest(value: a => HTMLAnchorElement | Null): Self = StObject.set(x, "closest", js.Any.fromFunction1(value))
        
        inline def setClosestUndefined: Self = StObject.set(x, "closest", js.undefined)
        
        inline def setCompareDocumentPosition(value: /* other */ Node => Double): Self = StObject.set(x, "compareDocumentPosition", js.Any.fromFunction1(value))
        
        inline def setCompareDocumentPositionUndefined: Self = StObject.set(x, "compareDocumentPosition", js.undefined)
        
        inline def setContains(value: CallbackTo[Boolean]): Self = StObject.set(x, "contains", value.toJsFn)
        
        inline def setContainsUndefined: Self = StObject.set(x, "contains", js.undefined)
        
        inline def setContent(value: Content | js.Array[Content]): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
        
        inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
        
        inline def setContentVarargs(value: Content*): Self = StObject.set(x, "content", js.Array(value*))
        
        inline def setDOCUMENT_FRAGMENT_NODE(value: Double): Self = StObject.set(x, "DOCUMENT_FRAGMENT_NODE", value.asInstanceOf[js.Any])
        
        inline def setDOCUMENT_FRAGMENT_NODEUndefined: Self = StObject.set(x, "DOCUMENT_FRAGMENT_NODE", js.undefined)
        
        inline def setDOCUMENT_NODE(value: Double): Self = StObject.set(x, "DOCUMENT_NODE", value.asInstanceOf[js.Any])
        
        inline def setDOCUMENT_NODEUndefined: Self = StObject.set(x, "DOCUMENT_NODE", js.undefined)
        
        inline def setDOCUMENT_POSITION_CONTAINED_BY(value: Double): Self = StObject.set(x, "DOCUMENT_POSITION_CONTAINED_BY", value.asInstanceOf[js.Any])
        
        inline def setDOCUMENT_POSITION_CONTAINED_BYUndefined: Self = StObject.set(x, "DOCUMENT_POSITION_CONTAINED_BY", js.undefined)
        
        inline def setDOCUMENT_POSITION_CONTAINS(value: Double): Self = StObject.set(x, "DOCUMENT_POSITION_CONTAINS", value.asInstanceOf[js.Any])
        
        inline def setDOCUMENT_POSITION_CONTAINSUndefined: Self = StObject.set(x, "DOCUMENT_POSITION_CONTAINS", js.undefined)
        
        inline def setDOCUMENT_POSITION_DISCONNECTED(value: Double): Self = StObject.set(x, "DOCUMENT_POSITION_DISCONNECTED", value.asInstanceOf[js.Any])
        
        inline def setDOCUMENT_POSITION_DISCONNECTEDUndefined: Self = StObject.set(x, "DOCUMENT_POSITION_DISCONNECTED", js.undefined)
        
        inline def setDOCUMENT_POSITION_FOLLOWING(value: Double): Self = StObject.set(x, "DOCUMENT_POSITION_FOLLOWING", value.asInstanceOf[js.Any])
        
        inline def setDOCUMENT_POSITION_FOLLOWINGUndefined: Self = StObject.set(x, "DOCUMENT_POSITION_FOLLOWING", js.undefined)
        
        inline def setDOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC(value: Double): Self = StObject.set(x, "DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC", value.asInstanceOf[js.Any])
        
        inline def setDOCUMENT_POSITION_IMPLEMENTATION_SPECIFICUndefined: Self = StObject.set(x, "DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC", js.undefined)
        
        inline def setDOCUMENT_POSITION_PRECEDING(value: Double): Self = StObject.set(x, "DOCUMENT_POSITION_PRECEDING", value.asInstanceOf[js.Any])
        
        inline def setDOCUMENT_POSITION_PRECEDINGUndefined: Self = StObject.set(x, "DOCUMENT_POSITION_PRECEDING", js.undefined)
        
        inline def setDOCUMENT_TYPE_NODE(value: Double): Self = StObject.set(x, "DOCUMENT_TYPE_NODE", value.asInstanceOf[js.Any])
        
        inline def setDOCUMENT_TYPE_NODEUndefined: Self = StObject.set(x, "DOCUMENT_TYPE_NODE", js.undefined)
        
        inline def setDispatchEvent(value: /* event */ Event => Boolean): Self = StObject.set(x, "dispatchEvent", js.Any.fromFunction1(value))
        
        inline def setDispatchEventUndefined: Self = StObject.set(x, "dispatchEvent", js.undefined)
        
        inline def setELEMENT_NODE(value: Double): Self = StObject.set(x, "ELEMENT_NODE", value.asInstanceOf[js.Any])
        
        inline def setELEMENT_NODEUndefined: Self = StObject.set(x, "ELEMENT_NODE", js.undefined)
        
        inline def setENTITY_NODE(value: Double): Self = StObject.set(x, "ENTITY_NODE", value.asInstanceOf[js.Any])
        
        inline def setENTITY_NODEUndefined: Self = StObject.set(x, "ENTITY_NODE", js.undefined)
        
        inline def setENTITY_REFERENCE_NODE(value: Double): Self = StObject.set(x, "ENTITY_REFERENCE_NODE", value.asInstanceOf[js.Any])
        
        inline def setENTITY_REFERENCE_NODEUndefined: Self = StObject.set(x, "ENTITY_REFERENCE_NODE", js.undefined)
        
        inline def setFirstChild(value: ChildNode): Self = StObject.set(x, "firstChild", value.asInstanceOf[js.Any])
        
        inline def setFirstChildNull: Self = StObject.set(x, "firstChild", null)
        
        inline def setFirstChildUndefined: Self = StObject.set(x, "firstChild", js.undefined)
        
        inline def setFirstElementChild(value: org.scalajs.dom.Element): Self = StObject.set(x, "firstElementChild", value.asInstanceOf[js.Any])
        
        inline def setFirstElementChildNull: Self = StObject.set(x, "firstElementChild", null)
        
        inline def setFirstElementChildUndefined: Self = StObject.set(x, "firstElementChild", js.undefined)
        
        inline def setGetAnimations(value: CallbackTo[js.Array[Animation]]): Self = StObject.set(x, "getAnimations", value.toJsFn)
        
        inline def setGetAnimationsUndefined: Self = StObject.set(x, "getAnimations", js.undefined)
        
        inline def setGetAttribute(value: /* qualifiedName */ String => String | Null): Self = StObject.set(x, "getAttribute", js.Any.fromFunction1(value))
        
        inline def setGetAttributeNS(value: (/* namespace */ String, /* localName */ String) => String | Null): Self = StObject.set(x, "getAttributeNS", js.Any.fromFunction2(value))
        
        inline def setGetAttributeNSUndefined: Self = StObject.set(x, "getAttributeNS", js.undefined)
        
        inline def setGetAttributeNames(value: CallbackTo[js.Array[String]]): Self = StObject.set(x, "getAttributeNames", value.toJsFn)
        
        inline def setGetAttributeNamesUndefined: Self = StObject.set(x, "getAttributeNames", js.undefined)
        
        inline def setGetAttributeNode(value: /* qualifiedName */ String => Attr | Null): Self = StObject.set(x, "getAttributeNode", js.Any.fromFunction1(value))
        
        inline def setGetAttributeNodeNS(value: (/* namespace */ String, /* localName */ String) => Attr | Null): Self = StObject.set(x, "getAttributeNodeNS", js.Any.fromFunction2(value))
        
        inline def setGetAttributeNodeNSUndefined: Self = StObject.set(x, "getAttributeNodeNS", js.undefined)
        
        inline def setGetAttributeNodeUndefined: Self = StObject.set(x, "getAttributeNode", js.undefined)
        
        inline def setGetAttributeUndefined: Self = StObject.set(x, "getAttribute", js.undefined)
        
        inline def setGetBoundingClientRect(value: CallbackTo[DOMRect]): Self = StObject.set(x, "getBoundingClientRect", value.toJsFn)
        
        inline def setGetBoundingClientRectUndefined: Self = StObject.set(x, "getBoundingClientRect", js.undefined)
        
        inline def setGetClientRects(value: CallbackTo[DOMRectList]): Self = StObject.set(x, "getClientRects", value.toJsFn)
        
        inline def setGetClientRectsUndefined: Self = StObject.set(x, "getClientRects", js.undefined)
        
        inline def setGetElementsByClassName(value: /* classNames */ String => HTMLCollectionOf[org.scalajs.dom.Element]): Self = StObject.set(x, "getElementsByClassName", js.Any.fromFunction1(value))
        
        inline def setGetElementsByClassNameUndefined: Self = StObject.set(x, "getElementsByClassName", js.undefined)
        
        inline def setGetElementsByTagName(value: a => HTMLCollectionOf[HTMLAnchorElement]): Self = StObject.set(x, "getElementsByTagName", js.Any.fromFunction1(value))
        
        inline def setGetElementsByTagNameNS(
          value: (httpColonSlashSlashwwwDotw3DotorgSlash1999Slashxhtml, /* localName */ String) => HTMLCollectionOf[HTMLElement]
        ): Self = StObject.set(x, "getElementsByTagNameNS", js.Any.fromFunction2(value))
        
        inline def setGetElementsByTagNameNSUndefined: Self = StObject.set(x, "getElementsByTagNameNS", js.undefined)
        
        inline def setGetElementsByTagNameUndefined: Self = StObject.set(x, "getElementsByTagName", js.undefined)
        
        inline def setGetRootNode(value: CallbackTo[Node]): Self = StObject.set(x, "getRootNode", value.toJsFn)
        
        inline def setGetRootNodeUndefined: Self = StObject.set(x, "getRootNode", js.undefined)
        
        inline def setHasAttribute(value: /* qualifiedName */ String => Boolean): Self = StObject.set(x, "hasAttribute", js.Any.fromFunction1(value))
        
        inline def setHasAttributeNS(value: (/* namespace */ String, /* localName */ String) => Boolean): Self = StObject.set(x, "hasAttributeNS", js.Any.fromFunction2(value))
        
        inline def setHasAttributeNSUndefined: Self = StObject.set(x, "hasAttributeNS", js.undefined)
        
        inline def setHasAttributeUndefined: Self = StObject.set(x, "hasAttribute", js.undefined)
        
        inline def setHasAttributes(value: CallbackTo[Boolean]): Self = StObject.set(x, "hasAttributes", value.toJsFn)
        
        inline def setHasAttributesUndefined: Self = StObject.set(x, "hasAttributes", js.undefined)
        
        inline def setHasChildNodes(value: CallbackTo[Boolean]): Self = StObject.set(x, "hasChildNodes", value.toJsFn)
        
        inline def setHasChildNodesUndefined: Self = StObject.set(x, "hasChildNodes", js.undefined)
        
        inline def setHasPointerCapture(value: /* pointerId */ Double => Boolean): Self = StObject.set(x, "hasPointerCapture", js.Any.fromFunction1(value))
        
        inline def setHasPointerCaptureUndefined: Self = StObject.set(x, "hasPointerCapture", js.undefined)
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        inline def setInnerHTML(value: String): Self = StObject.set(x, "innerHTML", value.asInstanceOf[js.Any])
        
        inline def setInnerHTMLUndefined: Self = StObject.set(x, "innerHTML", js.undefined)
        
        inline def setInsertAdjacentElement(
          value: (/* where */ InsertPosition, /* element */ org.scalajs.dom.Element) => org.scalajs.dom.Element | Null
        ): Self = StObject.set(x, "insertAdjacentElement", js.Any.fromFunction2(value))
        
        inline def setInsertAdjacentElementUndefined: Self = StObject.set(x, "insertAdjacentElement", js.undefined)
        
        inline def setInsertAdjacentHTML(value: (/* position */ InsertPosition, /* text */ String) => Callback): Self = StObject.set(x, "insertAdjacentHTML", js.Any.fromFunction2((t0: /* position */ InsertPosition, t1: /* text */ String) => (value(t0, t1)).runNow()))
        
        inline def setInsertAdjacentHTMLUndefined: Self = StObject.set(x, "insertAdjacentHTML", js.undefined)
        
        inline def setInsertAdjacentText(value: (/* where */ InsertPosition, /* data */ String) => Callback): Self = StObject.set(x, "insertAdjacentText", js.Any.fromFunction2((t0: /* where */ InsertPosition, t1: /* data */ String) => (value(t0, t1)).runNow()))
        
        inline def setInsertAdjacentTextUndefined: Self = StObject.set(x, "insertAdjacentText", js.undefined)
        
        inline def setInsertBefore(value: /* node */ Node => Node): Self = StObject.set(x, "insertBefore", js.Any.fromFunction1(value))
        
        inline def setInsertBeforeUndefined: Self = StObject.set(x, "insertBefore", js.undefined)
        
        inline def setIsConnected(value: Boolean): Self = StObject.set(x, "isConnected", value.asInstanceOf[js.Any])
        
        inline def setIsConnectedUndefined: Self = StObject.set(x, "isConnected", js.undefined)
        
        inline def setIsDefaultNamespace(value: CallbackTo[Boolean]): Self = StObject.set(x, "isDefaultNamespace", value.toJsFn)
        
        inline def setIsDefaultNamespaceUndefined: Self = StObject.set(x, "isDefaultNamespace", js.undefined)
        
        inline def setIsEqualNode(value: CallbackTo[Boolean]): Self = StObject.set(x, "isEqualNode", value.toJsFn)
        
        inline def setIsEqualNodeUndefined: Self = StObject.set(x, "isEqualNode", js.undefined)
        
        inline def setIsSameNode(value: CallbackTo[Boolean]): Self = StObject.set(x, "isSameNode", value.toJsFn)
        
        inline def setIsSameNodeUndefined: Self = StObject.set(x, "isSameNode", js.undefined)
        
        inline def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
        
        inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
        
        inline def setLastChild(value: ChildNode): Self = StObject.set(x, "lastChild", value.asInstanceOf[js.Any])
        
        inline def setLastChildNull: Self = StObject.set(x, "lastChild", null)
        
        inline def setLastChildUndefined: Self = StObject.set(x, "lastChild", js.undefined)
        
        inline def setLastElementChild(value: org.scalajs.dom.Element): Self = StObject.set(x, "lastElementChild", value.asInstanceOf[js.Any])
        
        inline def setLastElementChildNull: Self = StObject.set(x, "lastElementChild", null)
        
        inline def setLastElementChildUndefined: Self = StObject.set(x, "lastElementChild", js.undefined)
        
        inline def setLocalName(value: String): Self = StObject.set(x, "localName", value.asInstanceOf[js.Any])
        
        inline def setLocalNameUndefined: Self = StObject.set(x, "localName", js.undefined)
        
        inline def setLookupNamespaceURI(value: CallbackTo[String | Null]): Self = StObject.set(x, "lookupNamespaceURI", value.toJsFn)
        
        inline def setLookupNamespaceURIUndefined: Self = StObject.set(x, "lookupNamespaceURI", js.undefined)
        
        inline def setLookupPrefix(value: CallbackTo[String | Null]): Self = StObject.set(x, "lookupPrefix", value.toJsFn)
        
        inline def setLookupPrefixUndefined: Self = StObject.set(x, "lookupPrefix", js.undefined)
        
        inline def setMatches(value: /* selectors */ String => Boolean): Self = StObject.set(x, "matches", js.Any.fromFunction1(value))
        
        inline def setMatchesUndefined: Self = StObject.set(x, "matches", js.undefined)
        
        inline def setNOTATION_NODE(value: Double): Self = StObject.set(x, "NOTATION_NODE", value.asInstanceOf[js.Any])
        
        inline def setNOTATION_NODEUndefined: Self = StObject.set(x, "NOTATION_NODE", js.undefined)
        
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
        
        inline def setNodeNameUndefined: Self = StObject.set(x, "nodeName", js.undefined)
        
        inline def setNodeType(value: Double): Self = StObject.set(x, "nodeType", value.asInstanceOf[js.Any])
        
        inline def setNodeTypeUndefined: Self = StObject.set(x, "nodeType", js.undefined)
        
        inline def setNodeValue(value: String): Self = StObject.set(x, "nodeValue", value.asInstanceOf[js.Any])
        
        inline def setNodeValueNull: Self = StObject.set(x, "nodeValue", null)
        
        inline def setNodeValueUndefined: Self = StObject.set(x, "nodeValue", js.undefined)
        
        inline def setNormalize(value: Callback): Self = StObject.set(x, "normalize", value.toJsFn)
        
        inline def setNormalizeUndefined: Self = StObject.set(x, "normalize", js.undefined)
        
        inline def setOnfullscreenchange(value: js.ThisFunction1[IntrinsicClassAttributes[T], /* ev */ Event, Any]): Self = StObject.set(x, "onfullscreenchange", value.asInstanceOf[js.Any])
        
        inline def setOnfullscreenchangeNull: Self = StObject.set(x, "onfullscreenchange", null)
        
        inline def setOnfullscreenchangeUndefined: Self = StObject.set(x, "onfullscreenchange", js.undefined)
        
        inline def setOnfullscreenerror(value: js.ThisFunction1[IntrinsicClassAttributes[T], /* ev */ Event, Any]): Self = StObject.set(x, "onfullscreenerror", value.asInstanceOf[js.Any])
        
        inline def setOnfullscreenerrorNull: Self = StObject.set(x, "onfullscreenerror", null)
        
        inline def setOnfullscreenerrorUndefined: Self = StObject.set(x, "onfullscreenerror", js.undefined)
        
        inline def setOuterHTML(value: String): Self = StObject.set(x, "outerHTML", value.asInstanceOf[js.Any])
        
        inline def setOuterHTMLUndefined: Self = StObject.set(x, "outerHTML", js.undefined)
        
        inline def setOwnerDocument(value: Document): Self = StObject.set(x, "ownerDocument", value.asInstanceOf[js.Any])
        
        inline def setOwnerDocumentUndefined: Self = StObject.set(x, "ownerDocument", js.undefined)
        
        inline def setPROCESSING_INSTRUCTION_NODE(value: Double): Self = StObject.set(x, "PROCESSING_INSTRUCTION_NODE", value.asInstanceOf[js.Any])
        
        inline def setPROCESSING_INSTRUCTION_NODEUndefined: Self = StObject.set(x, "PROCESSING_INSTRUCTION_NODE", js.undefined)
        
        inline def setParentElement(value: HTMLElement): Self = StObject.set(x, "parentElement", value.asInstanceOf[js.Any])
        
        inline def setParentElementNull: Self = StObject.set(x, "parentElement", null)
        
        inline def setParentElementUndefined: Self = StObject.set(x, "parentElement", js.undefined)
        
        inline def setParentNode(value: ParentNode): Self = StObject.set(x, "parentNode", value.asInstanceOf[js.Any])
        
        inline def setParentNodeNull: Self = StObject.set(x, "parentNode", null)
        
        inline def setParentNodeUndefined: Self = StObject.set(x, "parentNode", js.undefined)
        
        inline def setPart(value: DOMTokenList): Self = StObject.set(x, "part", value.asInstanceOf[js.Any])
        
        inline def setPartUndefined: Self = StObject.set(x, "part", js.undefined)
        
        inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
        
        inline def setPrefixNull: Self = StObject.set(x, "prefix", null)
        
        inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
        
        inline def setPrepend(value: /* repeated */ Node | String => Callback): Self = StObject.set(x, "prepend", js.Any.fromFunction1((t0: /* repeated */ Node | String) => value(t0).runNow()))
        
        inline def setPrependUndefined: Self = StObject.set(x, "prepend", js.undefined)
        
        inline def setPreviousElementSibling(value: org.scalajs.dom.Element): Self = StObject.set(x, "previousElementSibling", value.asInstanceOf[js.Any])
        
        inline def setPreviousElementSiblingNull: Self = StObject.set(x, "previousElementSibling", null)
        
        inline def setPreviousElementSiblingUndefined: Self = StObject.set(x, "previousElementSibling", js.undefined)
        
        inline def setPreviousSibling(value: ChildNode): Self = StObject.set(x, "previousSibling", value.asInstanceOf[js.Any])
        
        inline def setPreviousSiblingNull: Self = StObject.set(x, "previousSibling", null)
        
        inline def setPreviousSiblingUndefined: Self = StObject.set(x, "previousSibling", js.undefined)
        
        inline def setQuerySelector(value: a => HTMLAnchorElement | Null): Self = StObject.set(x, "querySelector", js.Any.fromFunction1(value))
        
        inline def setQuerySelectorAll(value: a => NodeList[HTMLAnchorElement & Node]): Self = StObject.set(x, "querySelectorAll", js.Any.fromFunction1(value))
        
        inline def setQuerySelectorAllUndefined: Self = StObject.set(x, "querySelectorAll", js.undefined)
        
        inline def setQuerySelectorUndefined: Self = StObject.set(x, "querySelector", js.undefined)
        
        inline def setReleasePointerCapture(value: /* pointerId */ Double => Callback): Self = StObject.set(x, "releasePointerCapture", js.Any.fromFunction1((t0: /* pointerId */ Double) => value(t0).runNow()))
        
        inline def setReleasePointerCaptureUndefined: Self = StObject.set(x, "releasePointerCapture", js.undefined)
        
        inline def setRemove(value: Callback): Self = StObject.set(x, "remove", value.toJsFn)
        
        inline def setRemoveAttribute(value: /* qualifiedName */ String => Callback): Self = StObject.set(x, "removeAttribute", js.Any.fromFunction1((t0: /* qualifiedName */ String) => value(t0).runNow()))
        
        inline def setRemoveAttributeNS(value: (/* namespace */ String, /* localName */ String) => Callback): Self = StObject.set(x, "removeAttributeNS", js.Any.fromFunction2((t0: /* namespace */ String, t1: /* localName */ String) => (value(t0, t1)).runNow()))
        
        inline def setRemoveAttributeNSUndefined: Self = StObject.set(x, "removeAttributeNS", js.undefined)
        
        inline def setRemoveAttributeNode(value: /* attr */ Attr => Attr): Self = StObject.set(x, "removeAttributeNode", js.Any.fromFunction1(value))
        
        inline def setRemoveAttributeNodeUndefined: Self = StObject.set(x, "removeAttributeNode", js.undefined)
        
        inline def setRemoveAttributeUndefined: Self = StObject.set(x, "removeAttribute", js.undefined)
        
        inline def setRemoveChild(value: /* child */ Node => Node): Self = StObject.set(x, "removeChild", js.Any.fromFunction1(value))
        
        inline def setRemoveChildUndefined: Self = StObject.set(x, "removeChild", js.undefined)
        
        inline def setRemoveEventListener(
          value: (fullscreenchange, /* listener */ js.ThisFunction1[IntrinsicClassAttributes[T], /* ev */ Event, Any]) => Callback
        ): Self = StObject.set(x, "removeEventListener", js.Any.fromFunction2((t0: fullscreenchange, t1: /* listener */ js.ThisFunction1[IntrinsicClassAttributes[T], /* ev */ Event, Any]) => (value(t0, t1)).runNow()))
        
        inline def setRemoveEventListenerUndefined: Self = StObject.set(x, "removeEventListener", js.undefined)
        
        inline def setRemoveUndefined: Self = StObject.set(x, "remove", js.undefined)
        
        inline def setReplaceChild(value: (/* node */ Node, /* child */ Node) => Node): Self = StObject.set(x, "replaceChild", js.Any.fromFunction2(value))
        
        inline def setReplaceChildUndefined: Self = StObject.set(x, "replaceChild", js.undefined)
        
        inline def setReplaceChildren(value: /* repeated */ Node | String => Callback): Self = StObject.set(x, "replaceChildren", js.Any.fromFunction1((t0: /* repeated */ Node | String) => value(t0).runNow()))
        
        inline def setReplaceChildrenUndefined: Self = StObject.set(x, "replaceChildren", js.undefined)
        
        inline def setReplaceWith(value: /* repeated */ Node | String => Callback): Self = StObject.set(x, "replaceWith", js.Any.fromFunction1((t0: /* repeated */ Node | String) => value(t0).runNow()))
        
        inline def setReplaceWithUndefined: Self = StObject.set(x, "replaceWith", js.undefined)
        
        inline def setRequestFullscreen(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "requestFullscreen", value.toJsFn)
        
        inline def setRequestFullscreenUndefined: Self = StObject.set(x, "requestFullscreen", js.undefined)
        
        inline def setRequestPointerLock(value: Callback): Self = StObject.set(x, "requestPointerLock", value.toJsFn)
        
        inline def setRequestPointerLockUndefined: Self = StObject.set(x, "requestPointerLock", js.undefined)
        
        inline def setScroll(value: Callback): Self = StObject.set(x, "scroll", value.toJsFn)
        
        inline def setScrollBy(value: Callback): Self = StObject.set(x, "scrollBy", value.toJsFn)
        
        inline def setScrollByUndefined: Self = StObject.set(x, "scrollBy", js.undefined)
        
        inline def setScrollHeight(value: Double): Self = StObject.set(x, "scrollHeight", value.asInstanceOf[js.Any])
        
        inline def setScrollHeightUndefined: Self = StObject.set(x, "scrollHeight", js.undefined)
        
        inline def setScrollIntoView(value: Callback): Self = StObject.set(x, "scrollIntoView", value.toJsFn)
        
        inline def setScrollIntoViewUndefined: Self = StObject.set(x, "scrollIntoView", js.undefined)
        
        inline def setScrollLeft(value: Double): Self = StObject.set(x, "scrollLeft", value.asInstanceOf[js.Any])
        
        inline def setScrollLeftUndefined: Self = StObject.set(x, "scrollLeft", js.undefined)
        
        inline def setScrollTo(value: Callback): Self = StObject.set(x, "scrollTo", value.toJsFn)
        
        inline def setScrollToUndefined: Self = StObject.set(x, "scrollTo", js.undefined)
        
        inline def setScrollTop(value: Double): Self = StObject.set(x, "scrollTop", value.asInstanceOf[js.Any])
        
        inline def setScrollTopUndefined: Self = StObject.set(x, "scrollTop", js.undefined)
        
        inline def setScrollUndefined: Self = StObject.set(x, "scroll", js.undefined)
        
        inline def setScrollWidth(value: Double): Self = StObject.set(x, "scrollWidth", value.asInstanceOf[js.Any])
        
        inline def setScrollWidthUndefined: Self = StObject.set(x, "scrollWidth", js.undefined)
        
        inline def setSetAttribute(value: (/* qualifiedName */ String, /* value */ String) => Callback): Self = StObject.set(x, "setAttribute", js.Any.fromFunction2((t0: /* qualifiedName */ String, t1: /* value */ String) => (value(t0, t1)).runNow()))
        
        inline def setSetAttributeNS(value: (/* namespace */ String, /* qualifiedName */ String, /* value */ String) => Callback): Self = StObject.set(x, "setAttributeNS", js.Any.fromFunction3((t0: /* namespace */ String, t1: /* qualifiedName */ String, t2: /* value */ String) => (value(t0, t1, t2)).runNow()))
        
        inline def setSetAttributeNSUndefined: Self = StObject.set(x, "setAttributeNS", js.undefined)
        
        inline def setSetAttributeNode(value: /* attr */ Attr => Attr | Null): Self = StObject.set(x, "setAttributeNode", js.Any.fromFunction1(value))
        
        inline def setSetAttributeNodeNS(value: /* attr */ Attr => Attr | Null): Self = StObject.set(x, "setAttributeNodeNS", js.Any.fromFunction1(value))
        
        inline def setSetAttributeNodeNSUndefined: Self = StObject.set(x, "setAttributeNodeNS", js.undefined)
        
        inline def setSetAttributeNodeUndefined: Self = StObject.set(x, "setAttributeNode", js.undefined)
        
        inline def setSetAttributeUndefined: Self = StObject.set(x, "setAttribute", js.undefined)
        
        inline def setSetPointerCapture(value: /* pointerId */ Double => Callback): Self = StObject.set(x, "setPointerCapture", js.Any.fromFunction1((t0: /* pointerId */ Double) => value(t0).runNow()))
        
        inline def setSetPointerCaptureUndefined: Self = StObject.set(x, "setPointerCapture", js.undefined)
        
        inline def setShadowRoot(value: ShadowRoot): Self = StObject.set(x, "shadowRoot", value.asInstanceOf[js.Any])
        
        inline def setShadowRootNull: Self = StObject.set(x, "shadowRoot", null)
        
        inline def setShadowRootUndefined: Self = StObject.set(x, "shadowRoot", js.undefined)
        
        inline def setSlot(value: String): Self = StObject.set(x, "slot", value.asInstanceOf[js.Any])
        
        inline def setSlotUndefined: Self = StObject.set(x, "slot", js.undefined)
        
        inline def setTEXT_NODE(value: Double): Self = StObject.set(x, "TEXT_NODE", value.asInstanceOf[js.Any])
        
        inline def setTEXT_NODEUndefined: Self = StObject.set(x, "TEXT_NODE", js.undefined)
        
        inline def setTagName(value: String): Self = StObject.set(x, "tagName", value.asInstanceOf[js.Any])
        
        inline def setTagNameUndefined: Self = StObject.set(x, "tagName", js.undefined)
        
        inline def setTextContent(value: String): Self = StObject.set(x, "textContent", value.asInstanceOf[js.Any])
        
        inline def setTextContentNull: Self = StObject.set(x, "textContent", null)
        
        inline def setTextContentUndefined: Self = StObject.set(x, "textContent", js.undefined)
        
        inline def setToggleAttribute(value: /* qualifiedName */ String => Boolean): Self = StObject.set(x, "toggleAttribute", js.Any.fromFunction1(value))
        
        inline def setToggleAttributeUndefined: Self = StObject.set(x, "toggleAttribute", js.undefined)
        
        inline def setWebkitMatchesSelector(value: /* selectors */ String => Boolean): Self = StObject.set(x, "webkitMatchesSelector", js.Any.fromFunction1(value))
        
        inline def setWebkitMatchesSelectorUndefined: Self = StObject.set(x, "webkitMatchesSelector", js.undefined)
      }
    }
    
    /* Inlined {[ P in keyof petit-dom.petit-dom.PetitDom.DomElements ]: petit-dom.petit-dom.PetitDom.Props<petit-dom.petit-dom.PetitDom.DomElements[P]> & {  content :petit-dom.petit-dom.PetitDom.Content | std.ReadonlyArray<petit-dom.petit-dom.PetitDom.Content> | undefined}} */
    trait IntrinsicElements extends StObject {
      
      var a: PropsHTMLAnchorElementcon
      
      var abbr: PropsHTMLElementcontentCo
      
      var address: PropsHTMLElementcontentCo
      
      var animate: PropsSVGAnimateElementcon
      
      var animateMotion: PropsSVGAnimateMotionElem
      
      var animateTransform: PropsSVGAnimateTransformE
      
      var area: PropsHTMLAreaElementconte
      
      var article: PropsHTMLElementcontentCo
      
      var aside: PropsHTMLElementcontentCo
      
      var audio: PropsHTMLAudioElementcont
      
      var b: PropsHTMLElementcontentCo
      
      var base: PropsHTMLBaseElementconte
      
      var bdi: PropsHTMLElementcontentCo
      
      var bdo: PropsHTMLElementcontentCo
      
      var blockquote: PropsHTMLQuoteElementcont
      
      var body: PropsHTMLBodyElementconte
      
      var br: PropsHTMLBRElementcontent
      
      var button: PropsHTMLButtonElementcon
      
      var canvas: PropsHTMLCanvasElementcon
      
      var caption: PropsHTMLTableCaptionElem
      
      var circle: PropsSVGCircleElementcont
      
      var cite: PropsHTMLElementcontentCo
      
      var clipPath: PropsSVGClipPathElementco
      
      var code: PropsHTMLElementcontentCo
      
      var col: PropsHTMLTableColElementc
      
      var colgroup: PropsHTMLTableColElementc
      
      var data: PropsHTMLDataElementconte
      
      var datalist: PropsHTMLDataListElementc
      
      var dd: PropsHTMLElementcontentCo
      
      var defs: PropsSVGDefsElementconten
      
      var del: PropsHTMLModElementconten
      
      var desc: PropsSVGDescElementconten
      
      var details: PropsHTMLDetailsElementco
      
      var dfn: PropsHTMLElementcontentCo
      
      var dialog: PropsHTMLDialogElementcon
      
      var div: PropsHTMLDivElementconten
      
      var dl: PropsHTMLDListElementcont
      
      var dt: PropsHTMLElementcontentCo
      
      var ellipse: PropsSVGEllipseElementcon
      
      var em: PropsHTMLElementcontentCo
      
      var embed: PropsHTMLEmbedElementcont
      
      var feBlend: PropsSVGFEBlendElementcon
      
      var feColorMatrix: PropsSVGFEColorMatrixElem
      
      var feComponentTransfer: PropsSVGFEComponentTransf
      
      var feComposite: PropsSVGFECompositeElemen
      
      var feConvolveMatrix: PropsSVGFEConvolveMatrixE
      
      var feDiffuseLighting: PropsSVGFEDiffuseLighting
      
      var feDisplacementMap: PropsSVGFEDisplacementMap
      
      var feDistantLight: PropsSVGFEDistantLightEle
      
      var feDropShadow: PropsSVGFEDropShadowEleme
      
      var feFlood: PropsSVGFEFloodElementcon
      
      var feFuncA: PropsSVGFEFuncAElementcon
      
      var feFuncB: PropsSVGFEFuncBElementcon
      
      var feFuncG: PropsSVGFEFuncGElementcon
      
      var feFuncR: PropsSVGFEFuncRElementcon
      
      var feGaussianBlur: PropsSVGFEGaussianBlurEle
      
      var feImage: PropsSVGFEImageElementcon
      
      var feMerge: PropsSVGFEMergeElementcon
      
      var feMergeNode: PropsSVGFEMergeNodeElemen
      
      var feMorphology: PropsSVGFEMorphologyEleme
      
      var feOffset: PropsSVGFEOffsetElementco
      
      var fePointLight: PropsSVGFEPointLightEleme
      
      var feSpecularLighting: PropsSVGFESpecularLightin
      
      var feSpotLight: PropsSVGFESpotLightElemen
      
      var feTile: PropsSVGFETileElementcont
      
      var feTurbulence: PropsSVGFETurbulenceEleme
      
      var fieldset: PropsHTMLFieldSetElementc
      
      var figcaption: PropsHTMLElementcontentCo
      
      var figure: PropsHTMLElementcontentCo
      
      var filter: PropsSVGFilterElementcont
      
      var footer: PropsHTMLElementcontentCo
      
      var foreignObject: PropsSVGForeignObjectElem
      
      var form: PropsHTMLFormElementconte
      
      var g: PropsSVGGElementcontentCo
      
      var h1: PropsHTMLHeadingElementco
      
      var h2: PropsHTMLHeadingElementco
      
      var h3: PropsHTMLHeadingElementco
      
      var h4: PropsHTMLHeadingElementco
      
      var h5: PropsHTMLHeadingElementco
      
      var h6: PropsHTMLHeadingElementco
      
      var head: PropsHTMLHeadElementconte
      
      var header: PropsHTMLElementcontentCo
      
      var hgroup: PropsHTMLElementcontentCo
      
      var hr: PropsHTMLHRElementcontent
      
      var html: PropsHTMLHtmlElementconte
      
      var i: PropsHTMLElementcontentCo
      
      var iframe: PropsHTMLIFrameElementcon
      
      var image: PropsSVGImageElementconte
      
      var img: PropsHTMLImageElementcont
      
      var input: PropsHTMLInputElementcont
      
      var ins: PropsHTMLModElementconten
      
      var kbd: PropsHTMLElementcontentCo
      
      var label: PropsHTMLLabelElementcont
      
      var legend: PropsHTMLLegendElementcon
      
      var li: PropsHTMLLIElementcontent
      
      var line: PropsSVGLineElementconten
      
      var linearGradient: PropsSVGLinearGradientEle
      
      var link: PropsHTMLLinkElementconte
      
      var main: PropsHTMLElementcontentCo
      
      var map: PropsHTMLMapElementconten
      
      var mark: PropsHTMLElementcontentCo
      
      var marker: PropsSVGMarkerElementcont
      
      var mask: PropsSVGMaskElementconten
      
      var menu: PropsHTMLMenuElementconte
      
      var meta: PropsHTMLMetaElementconte
      
      var metadata: PropsSVGMetadataElementco
      
      var meter: PropsHTMLMeterElementcont
      
      var mpath: PropsSVGMPathElementconte
      
      var nav: PropsHTMLElementcontentCo
      
      var noscript: PropsHTMLElementcontentCo
      
      var `object`: PropsHTMLObjectElementcon
      
      var ol: PropsHTMLOListElementcont
      
      var optgroup: PropsHTMLOptGroupElementc
      
      var option: PropsHTMLOptionElementcon
      
      var output: PropsHTMLOutputElementcon
      
      var p: PropsHTMLParagraphElement
      
      var path: PropsSVGPathElementconten
      
      var pattern: PropsSVGPatternElementcon
      
      var picture: PropsHTMLPictureElementco
      
      var polygon: PropsSVGPolygonElementcon
      
      var polyline: PropsSVGPolylineElementco
      
      var pre: PropsHTMLPreElementconten
      
      var progress: PropsHTMLProgressElementc
      
      var q: PropsHTMLQuoteElementcont
      
      var radialGradient: PropsSVGRadialGradientEle
      
      var rect: PropsSVGRectElementconten
      
      var rp: PropsHTMLElementcontentCo
      
      var rt: PropsHTMLElementcontentCo
      
      var ruby: PropsHTMLElementcontentCo
      
      var s: PropsHTMLElementcontentCo
      
      var samp: PropsHTMLElementcontentCo
      
      var script: PropsHTMLScriptElementcon
      
      var section: PropsHTMLElementcontentCo
      
      var select: PropsHTMLSelectElementcon
      
      var set: PropsSVGSetElementcontent
      
      var slot: PropsHTMLSlotElementconte
      
      var small: PropsHTMLElementcontentCo
      
      var source: PropsHTMLSourceElementcon
      
      var span: PropsHTMLSpanElementconte
      
      var stop: PropsSVGStopElementconten
      
      var strong: PropsHTMLElementcontentCo
      
      var style: PropsHTMLStyleElementcont
      
      var sub: PropsHTMLElementcontentCo
      
      var summary: PropsHTMLElementcontentCo
      
      var sup: PropsHTMLElementcontentCo
      
      var svg: PropsSVGSVGElementcontent
      
      var switch: PropsSVGSwitchElementcont
      
      var symbol: PropsSVGSymbolElementcont
      
      var table: PropsHTMLTableElementcont
      
      var tbody: PropsHTMLTableSectionElem
      
      var td: PropsHTMLTableCellElement
      
      var template: PropsHTMLTemplateElementc
      
      var text: PropsSVGTextElementconten
      
      var textPath: PropsSVGTextPathElementco
      
      var textarea: PropsHTMLTextAreaElementc
      
      var tfoot: PropsHTMLTableSectionElem
      
      var th: PropsHTMLTableCellElement
      
      var thead: PropsHTMLTableSectionElem
      
      var time: PropsHTMLTimeElementconte
      
      var title: PropsHTMLTitleElementcont
      
      var tr: PropsHTMLTableRowElementc
      
      var track: PropsHTMLTrackElementcont
      
      var tspan: PropsSVGTSpanElementconte
      
      var u: PropsHTMLElementcontentCo
      
      var ul: PropsHTMLUListElementcont
      
      var use: PropsSVGUseElementcontent
      
      var `var`: PropsHTMLElementcontentCo
      
      var video: PropsHTMLVideoElementcont
      
      var view: PropsSVGViewElementconten
      
      var wbr: PropsHTMLElementcontentCo
    }
    object IntrinsicElements {
      
      inline def apply(
        a: PropsHTMLAnchorElementcon,
        abbr: PropsHTMLElementcontentCo,
        address: PropsHTMLElementcontentCo,
        animate: PropsSVGAnimateElementcon,
        animateMotion: PropsSVGAnimateMotionElem,
        animateTransform: PropsSVGAnimateTransformE,
        area: PropsHTMLAreaElementconte,
        article: PropsHTMLElementcontentCo,
        aside: PropsHTMLElementcontentCo,
        audio: PropsHTMLAudioElementcont,
        b: PropsHTMLElementcontentCo,
        base: PropsHTMLBaseElementconte,
        bdi: PropsHTMLElementcontentCo,
        bdo: PropsHTMLElementcontentCo,
        blockquote: PropsHTMLQuoteElementcont,
        body: PropsHTMLBodyElementconte,
        br: PropsHTMLBRElementcontent,
        button: PropsHTMLButtonElementcon,
        canvas: PropsHTMLCanvasElementcon,
        caption: PropsHTMLTableCaptionElem,
        circle: PropsSVGCircleElementcont,
        cite: PropsHTMLElementcontentCo,
        clipPath: PropsSVGClipPathElementco,
        code: PropsHTMLElementcontentCo,
        col: PropsHTMLTableColElementc,
        colgroup: PropsHTMLTableColElementc,
        data: PropsHTMLDataElementconte,
        datalist: PropsHTMLDataListElementc,
        dd: PropsHTMLElementcontentCo,
        defs: PropsSVGDefsElementconten,
        del: PropsHTMLModElementconten,
        desc: PropsSVGDescElementconten,
        details: PropsHTMLDetailsElementco,
        dfn: PropsHTMLElementcontentCo,
        dialog: PropsHTMLDialogElementcon,
        div: PropsHTMLDivElementconten,
        dl: PropsHTMLDListElementcont,
        dt: PropsHTMLElementcontentCo,
        ellipse: PropsSVGEllipseElementcon,
        em: PropsHTMLElementcontentCo,
        embed: PropsHTMLEmbedElementcont,
        feBlend: PropsSVGFEBlendElementcon,
        feColorMatrix: PropsSVGFEColorMatrixElem,
        feComponentTransfer: PropsSVGFEComponentTransf,
        feComposite: PropsSVGFECompositeElemen,
        feConvolveMatrix: PropsSVGFEConvolveMatrixE,
        feDiffuseLighting: PropsSVGFEDiffuseLighting,
        feDisplacementMap: PropsSVGFEDisplacementMap,
        feDistantLight: PropsSVGFEDistantLightEle,
        feDropShadow: PropsSVGFEDropShadowEleme,
        feFlood: PropsSVGFEFloodElementcon,
        feFuncA: PropsSVGFEFuncAElementcon,
        feFuncB: PropsSVGFEFuncBElementcon,
        feFuncG: PropsSVGFEFuncGElementcon,
        feFuncR: PropsSVGFEFuncRElementcon,
        feGaussianBlur: PropsSVGFEGaussianBlurEle,
        feImage: PropsSVGFEImageElementcon,
        feMerge: PropsSVGFEMergeElementcon,
        feMergeNode: PropsSVGFEMergeNodeElemen,
        feMorphology: PropsSVGFEMorphologyEleme,
        feOffset: PropsSVGFEOffsetElementco,
        fePointLight: PropsSVGFEPointLightEleme,
        feSpecularLighting: PropsSVGFESpecularLightin,
        feSpotLight: PropsSVGFESpotLightElemen,
        feTile: PropsSVGFETileElementcont,
        feTurbulence: PropsSVGFETurbulenceEleme,
        fieldset: PropsHTMLFieldSetElementc,
        figcaption: PropsHTMLElementcontentCo,
        figure: PropsHTMLElementcontentCo,
        filter: PropsSVGFilterElementcont,
        footer: PropsHTMLElementcontentCo,
        foreignObject: PropsSVGForeignObjectElem,
        form: PropsHTMLFormElementconte,
        g: PropsSVGGElementcontentCo,
        h1: PropsHTMLHeadingElementco,
        h2: PropsHTMLHeadingElementco,
        h3: PropsHTMLHeadingElementco,
        h4: PropsHTMLHeadingElementco,
        h5: PropsHTMLHeadingElementco,
        h6: PropsHTMLHeadingElementco,
        head: PropsHTMLHeadElementconte,
        header: PropsHTMLElementcontentCo,
        hgroup: PropsHTMLElementcontentCo,
        hr: PropsHTMLHRElementcontent,
        html: PropsHTMLHtmlElementconte,
        i: PropsHTMLElementcontentCo,
        iframe: PropsHTMLIFrameElementcon,
        image: PropsSVGImageElementconte,
        img: PropsHTMLImageElementcont,
        input: PropsHTMLInputElementcont,
        ins: PropsHTMLModElementconten,
        kbd: PropsHTMLElementcontentCo,
        label: PropsHTMLLabelElementcont,
        legend: PropsHTMLLegendElementcon,
        li: PropsHTMLLIElementcontent,
        line: PropsSVGLineElementconten,
        linearGradient: PropsSVGLinearGradientEle,
        link: PropsHTMLLinkElementconte,
        main: PropsHTMLElementcontentCo,
        map: PropsHTMLMapElementconten,
        mark: PropsHTMLElementcontentCo,
        marker: PropsSVGMarkerElementcont,
        mask: PropsSVGMaskElementconten,
        menu: PropsHTMLMenuElementconte,
        meta: PropsHTMLMetaElementconte,
        metadata: PropsSVGMetadataElementco,
        meter: PropsHTMLMeterElementcont,
        mpath: PropsSVGMPathElementconte,
        nav: PropsHTMLElementcontentCo,
        noscript: PropsHTMLElementcontentCo,
        `object`: PropsHTMLObjectElementcon,
        ol: PropsHTMLOListElementcont,
        optgroup: PropsHTMLOptGroupElementc,
        option: PropsHTMLOptionElementcon,
        output: PropsHTMLOutputElementcon,
        p: PropsHTMLParagraphElement,
        path: PropsSVGPathElementconten,
        pattern: PropsSVGPatternElementcon,
        picture: PropsHTMLPictureElementco,
        polygon: PropsSVGPolygonElementcon,
        polyline: PropsSVGPolylineElementco,
        pre: PropsHTMLPreElementconten,
        progress: PropsHTMLProgressElementc,
        q: PropsHTMLQuoteElementcont,
        radialGradient: PropsSVGRadialGradientEle,
        rect: PropsSVGRectElementconten,
        rp: PropsHTMLElementcontentCo,
        rt: PropsHTMLElementcontentCo,
        ruby: PropsHTMLElementcontentCo,
        s: PropsHTMLElementcontentCo,
        samp: PropsHTMLElementcontentCo,
        script: PropsHTMLScriptElementcon,
        section: PropsHTMLElementcontentCo,
        select: PropsHTMLSelectElementcon,
        set: PropsSVGSetElementcontent,
        slot: PropsHTMLSlotElementconte,
        small: PropsHTMLElementcontentCo,
        source: PropsHTMLSourceElementcon,
        span: PropsHTMLSpanElementconte,
        stop: PropsSVGStopElementconten,
        strong: PropsHTMLElementcontentCo,
        style: PropsHTMLStyleElementcont,
        sub: PropsHTMLElementcontentCo,
        summary: PropsHTMLElementcontentCo,
        sup: PropsHTMLElementcontentCo,
        svg: PropsSVGSVGElementcontent,
        switch: PropsSVGSwitchElementcont,
        symbol: PropsSVGSymbolElementcont,
        table: PropsHTMLTableElementcont,
        tbody: PropsHTMLTableSectionElem,
        td: PropsHTMLTableCellElement,
        template: PropsHTMLTemplateElementc,
        text: PropsSVGTextElementconten,
        textPath: PropsSVGTextPathElementco,
        textarea: PropsHTMLTextAreaElementc,
        tfoot: PropsHTMLTableSectionElem,
        th: PropsHTMLTableCellElement,
        thead: PropsHTMLTableSectionElem,
        time: PropsHTMLTimeElementconte,
        title: PropsHTMLTitleElementcont,
        tr: PropsHTMLTableRowElementc,
        track: PropsHTMLTrackElementcont,
        tspan: PropsSVGTSpanElementconte,
        u: PropsHTMLElementcontentCo,
        ul: PropsHTMLUListElementcont,
        use: PropsSVGUseElementcontent,
        `var`: PropsHTMLElementcontentCo,
        video: PropsHTMLVideoElementcont,
        view: PropsSVGViewElementconten,
        wbr: PropsHTMLElementcontentCo
      ): IntrinsicElements = {
        val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], abbr = abbr.asInstanceOf[js.Any], address = address.asInstanceOf[js.Any], animate = animate.asInstanceOf[js.Any], animateMotion = animateMotion.asInstanceOf[js.Any], animateTransform = animateTransform.asInstanceOf[js.Any], area = area.asInstanceOf[js.Any], article = article.asInstanceOf[js.Any], aside = aside.asInstanceOf[js.Any], audio = audio.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any], base = base.asInstanceOf[js.Any], bdi = bdi.asInstanceOf[js.Any], bdo = bdo.asInstanceOf[js.Any], blockquote = blockquote.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], br = br.asInstanceOf[js.Any], button = button.asInstanceOf[js.Any], canvas = canvas.asInstanceOf[js.Any], caption = caption.asInstanceOf[js.Any], circle = circle.asInstanceOf[js.Any], cite = cite.asInstanceOf[js.Any], clipPath = clipPath.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], col = col.asInstanceOf[js.Any], colgroup = colgroup.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], datalist = datalist.asInstanceOf[js.Any], dd = dd.asInstanceOf[js.Any], defs = defs.asInstanceOf[js.Any], del = del.asInstanceOf[js.Any], desc = desc.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], dfn = dfn.asInstanceOf[js.Any], dialog = dialog.asInstanceOf[js.Any], div = div.asInstanceOf[js.Any], dl = dl.asInstanceOf[js.Any], dt = dt.asInstanceOf[js.Any], ellipse = ellipse.asInstanceOf[js.Any], em = em.asInstanceOf[js.Any], embed = embed.asInstanceOf[js.Any], feBlend = feBlend.asInstanceOf[js.Any], feColorMatrix = feColorMatrix.asInstanceOf[js.Any], feComponentTransfer = feComponentTransfer.asInstanceOf[js.Any], feComposite = feComposite.asInstanceOf[js.Any], feConvolveMatrix = feConvolveMatrix.asInstanceOf[js.Any], feDiffuseLighting = feDiffuseLighting.asInstanceOf[js.Any], feDisplacementMap = feDisplacementMap.asInstanceOf[js.Any], feDistantLight = feDistantLight.asInstanceOf[js.Any], feDropShadow = feDropShadow.asInstanceOf[js.Any], feFlood = feFlood.asInstanceOf[js.Any], feFuncA = feFuncA.asInstanceOf[js.Any], feFuncB = feFuncB.asInstanceOf[js.Any], feFuncG = feFuncG.asInstanceOf[js.Any], feFuncR = feFuncR.asInstanceOf[js.Any], feGaussianBlur = feGaussianBlur.asInstanceOf[js.Any], feImage = feImage.asInstanceOf[js.Any], feMerge = feMerge.asInstanceOf[js.Any], feMergeNode = feMergeNode.asInstanceOf[js.Any], feMorphology = feMorphology.asInstanceOf[js.Any], feOffset = feOffset.asInstanceOf[js.Any], fePointLight = fePointLight.asInstanceOf[js.Any], feSpecularLighting = feSpecularLighting.asInstanceOf[js.Any], feSpotLight = feSpotLight.asInstanceOf[js.Any], feTile = feTile.asInstanceOf[js.Any], feTurbulence = feTurbulence.asInstanceOf[js.Any], fieldset = fieldset.asInstanceOf[js.Any], figcaption = figcaption.asInstanceOf[js.Any], figure = figure.asInstanceOf[js.Any], filter = filter.asInstanceOf[js.Any], footer = footer.asInstanceOf[js.Any], foreignObject = foreignObject.asInstanceOf[js.Any], form = form.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], h1 = h1.asInstanceOf[js.Any], h2 = h2.asInstanceOf[js.Any], h3 = h3.asInstanceOf[js.Any], h4 = h4.asInstanceOf[js.Any], h5 = h5.asInstanceOf[js.Any], h6 = h6.asInstanceOf[js.Any], head = head.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], hgroup = hgroup.asInstanceOf[js.Any], hr = hr.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], i = i.asInstanceOf[js.Any], iframe = iframe.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], img = img.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], ins = ins.asInstanceOf[js.Any], kbd = kbd.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], legend = legend.asInstanceOf[js.Any], li = li.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], linearGradient = linearGradient.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], main = main.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any], mark = mark.asInstanceOf[js.Any], marker = marker.asInstanceOf[js.Any], mask = mask.asInstanceOf[js.Any], menu = menu.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], meter = meter.asInstanceOf[js.Any], mpath = mpath.asInstanceOf[js.Any], nav = nav.asInstanceOf[js.Any], noscript = noscript.asInstanceOf[js.Any], ol = ol.asInstanceOf[js.Any], optgroup = optgroup.asInstanceOf[js.Any], option = option.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any], p = p.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any], picture = picture.asInstanceOf[js.Any], polygon = polygon.asInstanceOf[js.Any], polyline = polyline.asInstanceOf[js.Any], pre = pre.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], q = q.asInstanceOf[js.Any], radialGradient = radialGradient.asInstanceOf[js.Any], rect = rect.asInstanceOf[js.Any], rp = rp.asInstanceOf[js.Any], rt = rt.asInstanceOf[js.Any], ruby = ruby.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any], samp = samp.asInstanceOf[js.Any], script = script.asInstanceOf[js.Any], section = section.asInstanceOf[js.Any], select = select.asInstanceOf[js.Any], set = set.asInstanceOf[js.Any], slot = slot.asInstanceOf[js.Any], small = small.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any], stop = stop.asInstanceOf[js.Any], strong = strong.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], sub = sub.asInstanceOf[js.Any], summary = summary.asInstanceOf[js.Any], sup = sup.asInstanceOf[js.Any], svg = svg.asInstanceOf[js.Any], switch = switch.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any], table = table.asInstanceOf[js.Any], tbody = tbody.asInstanceOf[js.Any], td = td.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], textPath = textPath.asInstanceOf[js.Any], textarea = textarea.asInstanceOf[js.Any], tfoot = tfoot.asInstanceOf[js.Any], th = th.asInstanceOf[js.Any], thead = thead.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], tr = tr.asInstanceOf[js.Any], track = track.asInstanceOf[js.Any], tspan = tspan.asInstanceOf[js.Any], u = u.asInstanceOf[js.Any], ul = ul.asInstanceOf[js.Any], use = use.asInstanceOf[js.Any], video = video.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any], wbr = wbr.asInstanceOf[js.Any])
        __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
        __obj.updateDynamic("var")(`var`.asInstanceOf[js.Any])
        __obj.asInstanceOf[IntrinsicElements]
      }
      
      extension [Self <: IntrinsicElements](x: Self) {
        
        inline def setA(value: PropsHTMLAnchorElementcon): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
        
        inline def setAbbr(value: PropsHTMLElementcontentCo): Self = StObject.set(x, "abbr", value.asInstanceOf[js.Any])
        
        inline def setAddress(value: PropsHTMLElementcontentCo): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
        
        inline def setAnimate(value: PropsSVGAnimateElementcon): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
        
        inline def setAnimateMotion(value: PropsSVGAnimateMotionElem): Self = StObject.set(x, "animateMotion", value.asInstanceOf[js.Any])
        
        inline def setAnimateTransform(value: PropsSVGAnimateTransformE): Self = StObject.set(x, "animateTransform", value.asInstanceOf[js.Any])
        
        inline def setArea(value: PropsHTMLAreaElementconte): Self = StObject.set(x, "area", value.asInstanceOf[js.Any])
        
        inline def setArticle(value: PropsHTMLElementcontentCo): Self = StObject.set(x, "article", value.asInstanceOf[js.Any])
        
        inline def setAside(value: PropsHTMLElementcontentCo): Self = StObject.set(x, "aside", value.asInstanceOf[js.Any])
        
        inline def setAudio(value: PropsHTMLAudioElementcont): Self = StObject.set(x, "audio", value.asInstanceOf[js.Any])
        
        inline def setB(value: PropsHTMLElementcontentCo): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
        
        inline def setBase(value: PropsHTMLBaseElementconte): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
        
        inline def setBdi(value: PropsHTMLElementcontentCo): Self = StObject.set(x, "bdi", value.asInstanceOf[js.Any])
        
        inline def setBdo(value: PropsHTMLElementcontentCo): Self = StObject.set(x, "bdo", value.asInstanceOf[js.Any])
        
        inline def setBlockquote(value: PropsHTMLQuoteElementcont): Self = StObject.set(x, "blockquote", value.asInstanceOf[js.Any])
        
        inline def setBody(value: PropsHTMLBodyElementconte): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
        
        inline def setBr(value: PropsHTMLBRElementcontent): Self = StObject.set(x, "br", value.asInstanceOf[js.Any])
        
        inline def setButton(value: PropsHTMLButtonElementcon): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
        
        inline def setCanvas(value: PropsHTMLCanvasElementcon): Self = StObject.set(x, "canvas", value.asInstanceOf[js.Any])
        
        inline def setCaption(value: PropsHTMLTableCaptionElem): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
        
        inline def setCircle(value: PropsSVGCircleElementcont): Self = StObject.set(x, "circle", value.asInstanceOf[js.Any])
        
        inline def setCite(value: PropsHTMLElementcontentCo): Self = StObject.set(x, "cite", value.asInstanceOf[js.Any])
        
        inline def setClipPath(value: PropsSVGClipPathElementco): Self = StObject.set(x, "clipPath", value.asInstanceOf[js.Any])
        
        inline def setCode(value: PropsHTMLElementcontentCo): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
        
        inline def setCol(value: PropsHTMLTableColElementc): Self = StObject.set(x, "col", value.asInstanceOf[js.Any])
        
        inline def setColgroup(value: PropsHTMLTableColElementc): Self = StObject.set(x, "colgroup", value.asInstanceOf[js.Any])
        
        inline def setData(value: PropsHTMLDataElementconte): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
        
        inline def setDatalist(value: PropsHTMLDataListElementc): Self = StObject.set(x, "datalist", value.asInstanceOf[js.Any])
        
        inline def setDd(value: PropsHTMLElementcontentCo): Self = StObject.set(x, "dd", value.asInstanceOf[js.Any])
        
        inline def setDefs(value: PropsSVGDefsElementconten): Self = StObject.set(x, "defs", value.asInstanceOf[js.Any])
        
        inline def setDel(value: PropsHTMLModElementconten): Self = StObject.set(x, "del", value.asInstanceOf[js.Any])
        
        inline def setDesc(value: PropsSVGDescElementconten): Self = StObject.set(x, "desc", value.asInstanceOf[js.Any])
        
        inline def setDetails(value: PropsHTMLDetailsElementco): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
        
        inline def setDfn(value: PropsHTMLElementcontentCo): Self = StObject.set(x, "dfn", value.asInstanceOf[js.Any])
        
        inline def setDialog(value: PropsHTMLDialogElementcon): Self = StObject.set(x, "dialog", value.asInstanceOf[js.Any])
        
        inline def setDiv(value: PropsHTMLDivElementconten): Self = StObject.set(x, "div", value.asInstanceOf[js.Any])
        
        inline def setDl(value: PropsHTMLDListElementcont): Self = StObject.set(x, "dl", value.asInstanceOf[js.Any])
        
        inline def setDt(value: PropsHTMLElementcontentCo): Self = StObject.set(x, "dt", value.asInstanceOf[js.Any])
        
        inline def setEllipse(value: PropsSVGEllipseElementcon): Self = StObject.set(x, "ellipse", value.asInstanceOf[js.Any])
        
        inline def setEm(value: PropsHTMLElementcontentCo): Self = StObject.set(x, "em", value.asInstanceOf[js.Any])
        
        inline def setEmbed(value: PropsHTMLEmbedElementcont): Self = StObject.set(x, "embed", value.asInstanceOf[js.Any])
        
        inline def setFeBlend(value: PropsSVGFEBlendElementcon): Self = StObject.set(x, "feBlend", value.asInstanceOf[js.Any])
        
        inline def setFeColorMatrix(value: PropsSVGFEColorMatrixElem): Self = StObject.set(x, "feColorMatrix", value.asInstanceOf[js.Any])
        
        inline def setFeComponentTransfer(value: PropsSVGFEComponentTransf): Self = StObject.set(x, "feComponentTransfer", value.asInstanceOf[js.Any])
        
        inline def setFeComposite(value: PropsSVGFECompositeElemen): Self = StObject.set(x, "feComposite", value.asInstanceOf[js.Any])
        
        inline def setFeConvolveMatrix(value: PropsSVGFEConvolveMatrixE): Self = StObject.set(x, "feConvolveMatrix", value.asInstanceOf[js.Any])
        
        inline def setFeDiffuseLighting(value: PropsSVGFEDiffuseLighting): Self = StObject.set(x, "feDiffuseLighting", value.asInstanceOf[js.Any])
        
        inline def setFeDisplacementMap(value: PropsSVGFEDisplacementMap): Self = StObject.set(x, "feDisplacementMap", value.asInstanceOf[js.Any])
        
        inline def setFeDistantLight(value: PropsSVGFEDistantLightEle): Self = StObject.set(x, "feDistantLight", value.asInstanceOf[js.Any])
        
        inline def setFeDropShadow(value: PropsSVGFEDropShadowEleme): Self = StObject.set(x, "feDropShadow", value.asInstanceOf[js.Any])
        
        inline def setFeFlood(value: PropsSVGFEFloodElementcon): Self = StObject.set(x, "feFlood", value.asInstanceOf[js.Any])
        
        inline def setFeFuncA(value: PropsSVGFEFuncAElementcon): Self = StObject.set(x, "feFuncA", value.asInstanceOf[js.Any])
        
        inline def setFeFuncB(value: PropsSVGFEFuncBElementcon): Self = StObject.set(x, "feFuncB", value.asInstanceOf[js.Any])
        
        inline def setFeFuncG(value: PropsSVGFEFuncGElementcon): Self = StObject.set(x, "feFuncG", value.asInstanceOf[js.Any])
        
        inline def setFeFuncR(value: PropsSVGFEFuncRElementcon): Self = StObject.set(x, "feFuncR", value.asInstanceOf[js.Any])
        
        inline def setFeGaussianBlur(value: PropsSVGFEGaussianBlurEle): Self = StObject.set(x, "feGaussianBlur", value.asInstanceOf[js.Any])
        
        inline def setFeImage(value: PropsSVGFEImageElementcon): Self = StObject.set(x, "feImage", value.asInstanceOf[js.Any])
        
        inline def setFeMerge(value: PropsSVGFEMergeElementcon): Self = StObject.set(x, "feMerge", value.asInstanceOf[js.Any])
        
        inline def setFeMergeNode(value: PropsSVGFEMergeNodeElemen): Self = StObject.set(x, "feMergeNode", value.asInstanceOf[js.Any])
        
        inline def setFeMorphology(value: PropsSVGFEMorphologyEleme): Self = StObject.set(x, "feMorphology", value.asInstanceOf[js.Any])
        
        inline def setFeOffset(value: PropsSVGFEOffsetElementco): Self = StObject.set(x, "feOffset", value.asInstanceOf[js.Any])
        
        inline def setFePointLight(value: PropsSVGFEPointLightEleme): Self = StObject.set(x, "fePointLight", value.asInstanceOf[js.Any])
        
        inline def setFeSpecularLighting(value: PropsSVGFESpecularLightin): Self = StObject.set(x, "feSpecularLighting", value.asInstanceOf[js.Any])
        
        inline def setFeSpotLight(value: PropsSVGFESpotLightElemen): Self = StObject.set(x, "feSpotLight", value.asInstanceOf[js.Any])
        
        inline def setFeTile(value: PropsSVGFETileElementcont): Self = StObject.set(x, "feTile", value.asInstanceOf[js.Any])
        
        inline def setFeTurbulence(value: PropsSVGFETurbulenceEleme): Self = StObject.set(x, "feTurbulence", value.asInstanceOf[js.Any])
        
        inline def setFieldset(value: PropsHTMLFieldSetElementc): Self = StObject.set(x, "fieldset", value.asInstanceOf[js.Any])
        
        inline def setFigcaption(value: PropsHTMLElementcontentCo): Self = StObject.set(x, "figcaption", value.asInstanceOf[js.Any])
        
        inline def setFigure(value: PropsHTMLElementcontentCo): Self = StObject.set(x, "figure", value.asInstanceOf[js.Any])
        
        inline def setFilter(value: PropsSVGFilterElementcont): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
        
        inline def setFooter(value: PropsHTMLElementcontentCo): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
        
        inline def setForeignObject(value: PropsSVGForeignObjectElem): Self = StObject.set(x, "foreignObject", value.asInstanceOf[js.Any])
        
        inline def setForm(value: PropsHTMLFormElementconte): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
        
        inline def setG(value: PropsSVGGElementcontentCo): Self = StObject.set(x, "g", value.asInstanceOf[js.Any])
        
        inline def setH1(value: PropsHTMLHeadingElementco): Self = StObject.set(x, "h1", value.asInstanceOf[js.Any])
        
        inline def setH2(value: PropsHTMLHeadingElementco): Self = StObject.set(x, "h2", value.asInstanceOf[js.Any])
        
        inline def setH3(value: PropsHTMLHeadingElementco): Self = StObject.set(x, "h3", value.asInstanceOf[js.Any])
        
        inline def setH4(value: PropsHTMLHeadingElementco): Self = StObject.set(x, "h4", value.asInstanceOf[js.Any])
        
        inline def setH5(value: PropsHTMLHeadingElementco): Self = StObject.set(x, "h5", value.asInstanceOf[js.Any])
        
        inline def setH6(value: PropsHTMLHeadingElementco): Self = StObject.set(x, "h6", value.asInstanceOf[js.Any])
        
        inline def setHead(value: PropsHTMLHeadElementconte): Self = StObject.set(x, "head", value.asInstanceOf[js.Any])
        
        inline def setHeader(value: PropsHTMLElementcontentCo): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
        
        inline def setHgroup(value: PropsHTMLElementcontentCo): Self = StObject.set(x, "hgroup", value.asInstanceOf[js.Any])
        
        inline def setHr(value: PropsHTMLHRElementcontent): Self = StObject.set(x, "hr", value.asInstanceOf[js.Any])
        
        inline def setHtml(value: PropsHTMLHtmlElementconte): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
        
        inline def setI(value: PropsHTMLElementcontentCo): Self = StObject.set(x, "i", value.asInstanceOf[js.Any])
        
        inline def setIframe(value: PropsHTMLIFrameElementcon): Self = StObject.set(x, "iframe", value.asInstanceOf[js.Any])
        
        inline def setImage(value: PropsSVGImageElementconte): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
        
        inline def setImg(value: PropsHTMLImageElementcont): Self = StObject.set(x, "img", value.asInstanceOf[js.Any])
        
        inline def setInput(value: PropsHTMLInputElementcont): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
        
        inline def setIns(value: PropsHTMLModElementconten): Self = StObject.set(x, "ins", value.asInstanceOf[js.Any])
        
        inline def setKbd(value: PropsHTMLElementcontentCo): Self = StObject.set(x, "kbd", value.asInstanceOf[js.Any])
        
        inline def setLabel(value: PropsHTMLLabelElementcont): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
        
        inline def setLegend(value: PropsHTMLLegendElementcon): Self = StObject.set(x, "legend", value.asInstanceOf[js.Any])
        
        inline def setLi(value: PropsHTMLLIElementcontent): Self = StObject.set(x, "li", value.asInstanceOf[js.Any])
        
        inline def setLine(value: PropsSVGLineElementconten): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
        
        inline def setLinearGradient(value: PropsSVGLinearGradientEle): Self = StObject.set(x, "linearGradient", value.asInstanceOf[js.Any])
        
        inline def setLink(value: PropsHTMLLinkElementconte): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
        
        inline def setMain(value: PropsHTMLElementcontentCo): Self = StObject.set(x, "main", value.asInstanceOf[js.Any])
        
        inline def setMap(value: PropsHTMLMapElementconten): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
        
        inline def setMark(value: PropsHTMLElementcontentCo): Self = StObject.set(x, "mark", value.asInstanceOf[js.Any])
        
        inline def setMarker(value: PropsSVGMarkerElementcont): Self = StObject.set(x, "marker", value.asInstanceOf[js.Any])
        
        inline def setMask(value: PropsSVGMaskElementconten): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
        
        inline def setMenu(value: PropsHTMLMenuElementconte): Self = StObject.set(x, "menu", value.asInstanceOf[js.Any])
        
        inline def setMeta(value: PropsHTMLMetaElementconte): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
        
        inline def setMetadata(value: PropsSVGMetadataElementco): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
        
        inline def setMeter(value: PropsHTMLMeterElementcont): Self = StObject.set(x, "meter", value.asInstanceOf[js.Any])
        
        inline def setMpath(value: PropsSVGMPathElementconte): Self = StObject.set(x, "mpath", value.asInstanceOf[js.Any])
        
        inline def setNav(value: PropsHTMLElementcontentCo): Self = StObject.set(x, "nav", value.asInstanceOf[js.Any])
        
        inline def setNoscript(value: PropsHTMLElementcontentCo): Self = StObject.set(x, "noscript", value.asInstanceOf[js.Any])
        
        inline def setObject(value: PropsHTMLObjectElementcon): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
        
        inline def setOl(value: PropsHTMLOListElementcont): Self = StObject.set(x, "ol", value.asInstanceOf[js.Any])
        
        inline def setOptgroup(value: PropsHTMLOptGroupElementc): Self = StObject.set(x, "optgroup", value.asInstanceOf[js.Any])
        
        inline def setOption(value: PropsHTMLOptionElementcon): Self = StObject.set(x, "option", value.asInstanceOf[js.Any])
        
        inline def setOutput(value: PropsHTMLOutputElementcon): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
        
        inline def setP(value: PropsHTMLParagraphElement): Self = StObject.set(x, "p", value.asInstanceOf[js.Any])
        
        inline def setPath(value: PropsSVGPathElementconten): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
        
        inline def setPattern(value: PropsSVGPatternElementcon): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
        
        inline def setPicture(value: PropsHTMLPictureElementco): Self = StObject.set(x, "picture", value.asInstanceOf[js.Any])
        
        inline def setPolygon(value: PropsSVGPolygonElementcon): Self = StObject.set(x, "polygon", value.asInstanceOf[js.Any])
        
        inline def setPolyline(value: PropsSVGPolylineElementco): Self = StObject.set(x, "polyline", value.asInstanceOf[js.Any])
        
        inline def setPre(value: PropsHTMLPreElementconten): Self = StObject.set(x, "pre", value.asInstanceOf[js.Any])
        
        inline def setProgress(value: PropsHTMLProgressElementc): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
        
        inline def setQ(value: PropsHTMLQuoteElementcont): Self = StObject.set(x, "q", value.asInstanceOf[js.Any])
        
        inline def setRadialGradient(value: PropsSVGRadialGradientEle): Self = StObject.set(x, "radialGradient", value.asInstanceOf[js.Any])
        
        inline def setRect(value: PropsSVGRectElementconten): Self = StObject.set(x, "rect", value.asInstanceOf[js.Any])
        
        inline def setRp(value: PropsHTMLElementcontentCo): Self = StObject.set(x, "rp", value.asInstanceOf[js.Any])
        
        inline def setRt(value: PropsHTMLElementcontentCo): Self = StObject.set(x, "rt", value.asInstanceOf[js.Any])
        
        inline def setRuby(value: PropsHTMLElementcontentCo): Self = StObject.set(x, "ruby", value.asInstanceOf[js.Any])
        
        inline def setS(value: PropsHTMLElementcontentCo): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
        
        inline def setSamp(value: PropsHTMLElementcontentCo): Self = StObject.set(x, "samp", value.asInstanceOf[js.Any])
        
        inline def setScript(value: PropsHTMLScriptElementcon): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
        
        inline def setSection(value: PropsHTMLElementcontentCo): Self = StObject.set(x, "section", value.asInstanceOf[js.Any])
        
        inline def setSelect(value: PropsHTMLSelectElementcon): Self = StObject.set(x, "select", value.asInstanceOf[js.Any])
        
        inline def setSet(value: PropsSVGSetElementcontent): Self = StObject.set(x, "set", value.asInstanceOf[js.Any])
        
        inline def setSlot(value: PropsHTMLSlotElementconte): Self = StObject.set(x, "slot", value.asInstanceOf[js.Any])
        
        inline def setSmall(value: PropsHTMLElementcontentCo): Self = StObject.set(x, "small", value.asInstanceOf[js.Any])
        
        inline def setSource(value: PropsHTMLSourceElementcon): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
        
        inline def setSpan(value: PropsHTMLSpanElementconte): Self = StObject.set(x, "span", value.asInstanceOf[js.Any])
        
        inline def setStop(value: PropsSVGStopElementconten): Self = StObject.set(x, "stop", value.asInstanceOf[js.Any])
        
        inline def setStrong(value: PropsHTMLElementcontentCo): Self = StObject.set(x, "strong", value.asInstanceOf[js.Any])
        
        inline def setStyle(value: PropsHTMLStyleElementcont): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
        
        inline def setSub(value: PropsHTMLElementcontentCo): Self = StObject.set(x, "sub", value.asInstanceOf[js.Any])
        
        inline def setSummary(value: PropsHTMLElementcontentCo): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
        
        inline def setSup(value: PropsHTMLElementcontentCo): Self = StObject.set(x, "sup", value.asInstanceOf[js.Any])
        
        inline def setSvg(value: PropsSVGSVGElementcontent): Self = StObject.set(x, "svg", value.asInstanceOf[js.Any])
        
        inline def setSwitch(value: PropsSVGSwitchElementcont): Self = StObject.set(x, "switch", value.asInstanceOf[js.Any])
        
        inline def setSymbol(value: PropsSVGSymbolElementcont): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
        
        inline def setTable(value: PropsHTMLTableElementcont): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
        
        inline def setTbody(value: PropsHTMLTableSectionElem): Self = StObject.set(x, "tbody", value.asInstanceOf[js.Any])
        
        inline def setTd(value: PropsHTMLTableCellElement): Self = StObject.set(x, "td", value.asInstanceOf[js.Any])
        
        inline def setTemplate(value: PropsHTMLTemplateElementc): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
        
        inline def setText(value: PropsSVGTextElementconten): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
        
        inline def setTextPath(value: PropsSVGTextPathElementco): Self = StObject.set(x, "textPath", value.asInstanceOf[js.Any])
        
        inline def setTextarea(value: PropsHTMLTextAreaElementc): Self = StObject.set(x, "textarea", value.asInstanceOf[js.Any])
        
        inline def setTfoot(value: PropsHTMLTableSectionElem): Self = StObject.set(x, "tfoot", value.asInstanceOf[js.Any])
        
        inline def setTh(value: PropsHTMLTableCellElement): Self = StObject.set(x, "th", value.asInstanceOf[js.Any])
        
        inline def setThead(value: PropsHTMLTableSectionElem): Self = StObject.set(x, "thead", value.asInstanceOf[js.Any])
        
        inline def setTime(value: PropsHTMLTimeElementconte): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
        
        inline def setTitle(value: PropsHTMLTitleElementcont): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        inline def setTr(value: PropsHTMLTableRowElementc): Self = StObject.set(x, "tr", value.asInstanceOf[js.Any])
        
        inline def setTrack(value: PropsHTMLTrackElementcont): Self = StObject.set(x, "track", value.asInstanceOf[js.Any])
        
        inline def setTspan(value: PropsSVGTSpanElementconte): Self = StObject.set(x, "tspan", value.asInstanceOf[js.Any])
        
        inline def setU(value: PropsHTMLElementcontentCo): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
        
        inline def setUl(value: PropsHTMLUListElementcont): Self = StObject.set(x, "ul", value.asInstanceOf[js.Any])
        
        inline def setUse(value: PropsSVGUseElementcontent): Self = StObject.set(x, "use", value.asInstanceOf[js.Any])
        
        inline def setVar(value: PropsHTMLElementcontentCo): Self = StObject.set(x, "var", value.asInstanceOf[js.Any])
        
        inline def setVideo(value: PropsHTMLVideoElementcont): Self = StObject.set(x, "video", value.asInstanceOf[js.Any])
        
        inline def setView(value: PropsSVGViewElementconten): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
        
        inline def setWbr(value: PropsHTMLElementcontentCo): Self = StObject.set(x, "wbr", value.asInstanceOf[js.Any])
      }
    }
  }
}
