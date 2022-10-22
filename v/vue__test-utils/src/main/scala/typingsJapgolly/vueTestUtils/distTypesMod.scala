package typingsJapgolly.vueTestUtils

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.Attr
import org.scalajs.dom.DOMRect
import org.scalajs.dom.DOMTokenList
import org.scalajs.dom.Document
import org.scalajs.dom.Element
import org.scalajs.dom.Event
import org.scalajs.dom.EventListenerOptions
import org.scalajs.dom.HTMLAnchorElement
import org.scalajs.dom.HTMLAreaElement
import org.scalajs.dom.HTMLAudioElement
import org.scalajs.dom.HTMLBRElement
import org.scalajs.dom.HTMLBaseElement
import org.scalajs.dom.HTMLBodyElement
import org.scalajs.dom.HTMLButtonElement
import org.scalajs.dom.HTMLCanvasElement
import org.scalajs.dom.HTMLCollection
import org.scalajs.dom.HTMLDListElement
import org.scalajs.dom.HTMLDataListElement
import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.HTMLEmbedElement
import org.scalajs.dom.HTMLFieldSetElement
import org.scalajs.dom.HTMLFormElement
import org.scalajs.dom.HTMLHRElement
import org.scalajs.dom.HTMLHeadElement
import org.scalajs.dom.HTMLHeadingElement
import org.scalajs.dom.HTMLHtmlElement
import org.scalajs.dom.HTMLIFrameElement
import org.scalajs.dom.HTMLImageElement
import org.scalajs.dom.HTMLInputElement
import org.scalajs.dom.HTMLLIElement
import org.scalajs.dom.HTMLLabelElement
import org.scalajs.dom.HTMLLegendElement
import org.scalajs.dom.HTMLLinkElement
import org.scalajs.dom.HTMLMapElement
import org.scalajs.dom.HTMLMenuElement
import org.scalajs.dom.HTMLMetaElement
import org.scalajs.dom.HTMLModElement
import org.scalajs.dom.HTMLOListElement
import org.scalajs.dom.HTMLObjectElement
import org.scalajs.dom.HTMLOptGroupElement
import org.scalajs.dom.HTMLOptionElement
import org.scalajs.dom.HTMLParagraphElement
import org.scalajs.dom.HTMLPreElement
import org.scalajs.dom.HTMLProgressElement
import org.scalajs.dom.HTMLQuoteElement
import org.scalajs.dom.HTMLScriptElement
import org.scalajs.dom.HTMLSelectElement
import org.scalajs.dom.HTMLSourceElement
import org.scalajs.dom.HTMLSpanElement
import org.scalajs.dom.HTMLStyleElement
import org.scalajs.dom.HTMLTableCaptionElement
import org.scalajs.dom.HTMLTableCellElement
import org.scalajs.dom.HTMLTableColElement
import org.scalajs.dom.HTMLTableElement
import org.scalajs.dom.HTMLTableRowElement
import org.scalajs.dom.HTMLTableSectionElement
import org.scalajs.dom.HTMLTextAreaElement
import org.scalajs.dom.HTMLTitleElement
import org.scalajs.dom.HTMLTrackElement
import org.scalajs.dom.HTMLUListElement
import org.scalajs.dom.HTMLVideoElement
import org.scalajs.dom.NamedNodeMap
import org.scalajs.dom.Node
import org.scalajs.dom.NodeList
import org.scalajs.dom.ParentNode
import org.scalajs.dom.SVGCircleElement
import org.scalajs.dom.SVGClipPathElement
import org.scalajs.dom.SVGDefsElement
import org.scalajs.dom.SVGDescElement
import org.scalajs.dom.SVGElement
import org.scalajs.dom.SVGEllipseElement
import org.scalajs.dom.SVGFEBlendElement
import org.scalajs.dom.SVGFEColorMatrixElement
import org.scalajs.dom.SVGFEComponentTransferElement
import org.scalajs.dom.SVGFECompositeElement
import org.scalajs.dom.SVGFEConvolveMatrixElement
import org.scalajs.dom.SVGFEDiffuseLightingElement
import org.scalajs.dom.SVGFEDisplacementMapElement
import org.scalajs.dom.SVGFEDistantLightElement
import org.scalajs.dom.SVGFEFloodElement
import org.scalajs.dom.SVGFEFuncAElement
import org.scalajs.dom.SVGFEFuncBElement
import org.scalajs.dom.SVGFEFuncGElement
import org.scalajs.dom.SVGFEFuncRElement
import org.scalajs.dom.SVGFEGaussianBlurElement
import org.scalajs.dom.SVGFEImageElement
import org.scalajs.dom.SVGFEMergeElement
import org.scalajs.dom.SVGFEMergeNodeElement
import org.scalajs.dom.SVGFEMorphologyElement
import org.scalajs.dom.SVGFEOffsetElement
import org.scalajs.dom.SVGFEPointLightElement
import org.scalajs.dom.SVGFESpecularLightingElement
import org.scalajs.dom.SVGFESpotLightElement
import org.scalajs.dom.SVGFETileElement
import org.scalajs.dom.SVGFETurbulenceElement
import org.scalajs.dom.SVGFilterElement
import org.scalajs.dom.SVGGElement
import org.scalajs.dom.SVGImageElement
import org.scalajs.dom.SVGLineElement
import org.scalajs.dom.SVGLinearGradientElement
import org.scalajs.dom.SVGMarkerElement
import org.scalajs.dom.SVGMaskElement
import org.scalajs.dom.SVGMetadataElement
import org.scalajs.dom.SVGPathElement
import org.scalajs.dom.SVGPatternElement
import org.scalajs.dom.SVGPolygonElement
import org.scalajs.dom.SVGPolylineElement
import org.scalajs.dom.SVGRadialGradientElement
import org.scalajs.dom.SVGRectElement
import org.scalajs.dom.SVGSVGElement
import org.scalajs.dom.SVGStopElement
import org.scalajs.dom.SVGSwitchElement
import org.scalajs.dom.SVGSymbolElement
import org.scalajs.dom.SVGTSpanElement
import org.scalajs.dom.SVGTextElement
import org.scalajs.dom.SVGTextPathElement
import org.scalajs.dom.SVGUseElement
import org.scalajs.dom.SVGViewElement
import typingsJapgolly.std.AddEventListenerOptions
import typingsJapgolly.std.Animation
import typingsJapgolly.std.ChildNode
import typingsJapgolly.std.DOMRectList
import typingsJapgolly.std.EventListenerOrEventListenerObject
import typingsJapgolly.std.FullscreenOptions
import typingsJapgolly.std.GetAnimationsOptions
import typingsJapgolly.std.GetRootNodeOptions
import typingsJapgolly.std.HTMLCollectionOf
import typingsJapgolly.std.HTMLDataElement
import typingsJapgolly.std.HTMLDetailsElement
import typingsJapgolly.std.HTMLDialogElement
import typingsJapgolly.std.HTMLMeterElement
import typingsJapgolly.std.HTMLOutputElement
import typingsJapgolly.std.HTMLPictureElement
import typingsJapgolly.std.HTMLSlotElement
import typingsJapgolly.std.HTMLTemplateElement
import typingsJapgolly.std.HTMLTimeElement
import typingsJapgolly.std.InsertPosition
import typingsJapgolly.std.Keyframe
import typingsJapgolly.std.KeyframeAnimationOptions
import typingsJapgolly.std.PropertyIndexedKeyframes
import typingsJapgolly.std.Record
import typingsJapgolly.std.SVGAnimateElement
import typingsJapgolly.std.SVGAnimateMotionElement
import typingsJapgolly.std.SVGAnimateTransformElement
import typingsJapgolly.std.SVGFEDropShadowElement
import typingsJapgolly.std.SVGForeignObjectElement
import typingsJapgolly.std.SVGMPathElement
import typingsJapgolly.std.SVGSetElement
import typingsJapgolly.std.ScrollIntoViewOptions
import typingsJapgolly.std.ScrollToOptions
import typingsJapgolly.std.ShadowRoot
import typingsJapgolly.std.ShadowRootInit
import typingsJapgolly.vueRuntimeCore.mod.Component
import typingsJapgolly.vueRuntimeCore.mod.ComponentInternalInstance
import typingsJapgolly.vueRuntimeCore.mod.ComponentOptions
import typingsJapgolly.vueRuntimeCore.mod.ComputedOptions
import typingsJapgolly.vueRuntimeCore.mod.Directive
import typingsJapgolly.vueRuntimeCore.mod.FunctionalComponent
import typingsJapgolly.vueRuntimeCore.mod.MethodOptions
import typingsJapgolly.vueRuntimeCore.mod.Plugin2
import typingsJapgolly.vueRuntimeCore.mod.RendererElement
import typingsJapgolly.vueRuntimeCore.mod.RendererNode
import typingsJapgolly.vueRuntimeCore.mod.VNode
import typingsJapgolly.vueRuntimeCore.mod.VNodeProps
import typingsJapgolly.vueTestUtils.anon.Iterator
import typingsJapgolly.vueTestUtils.anon.PartialOmitAppConfigisNat
import typingsJapgolly.vueTestUtils.anon.Render
import typingsJapgolly.vueTestUtils.anon.SlotDictionarydefaultSlot
import typingsJapgolly.vueTestUtils.anon.VueParentComponent
import typingsJapgolly.vueTestUtils.vueTestUtilsStrings.`object`
import typingsJapgolly.vueTestUtils.vueTestUtilsStrings.`var`
import typingsJapgolly.vueTestUtils.vueTestUtilsStrings.a
import typingsJapgolly.vueTestUtils.vueTestUtilsStrings.abbr
import typingsJapgolly.vueTestUtils.vueTestUtilsStrings.address
import typingsJapgolly.vueTestUtils.vueTestUtilsStrings.animate
import typingsJapgolly.vueTestUtils.vueTestUtilsStrings.animateMotion
import typingsJapgolly.vueTestUtils.vueTestUtilsStrings.animateTransform
import typingsJapgolly.vueTestUtils.vueTestUtilsStrings.area
import typingsJapgolly.vueTestUtils.vueTestUtilsStrings.article
import typingsJapgolly.vueTestUtils.vueTestUtilsStrings.aside
import typingsJapgolly.vueTestUtils.vueTestUtilsStrings.audio
import typingsJapgolly.vueTestUtils.vueTestUtilsStrings.b_
import typingsJapgolly.vueTestUtils.vueTestUtilsStrings.base
import typingsJapgolly.vueTestUtils.vueTestUtilsStrings.bdi
import typingsJapgolly.vueTestUtils.vueTestUtilsStrings.bdo
import typingsJapgolly.vueTestUtils.vueTestUtilsStrings.blockquote
import typingsJapgolly.vueTestUtils.vueTestUtilsStrings.body
import typingsJapgolly.vueTestUtils.vueTestUtilsStrings.br
import typingsJapgolly.vueTestUtils.vueTestUtilsStrings.button
import typingsJapgolly.vueTestUtils.vueTestUtilsStrings.canvas
import typingsJapgolly.vueTestUtils.vueTestUtilsStrings.caption
import typingsJapgolly.vueTestUtils.vueTestUtilsStrings.circle
import typingsJapgolly.vueTestUtils.vueTestUtilsStrings.cite
import typingsJapgolly.vueTestUtils.vueTestUtilsStrings.clipPath
import typingsJapgolly.vueTestUtils.vueTestUtilsStrings.code
import typingsJapgolly.vueTestUtils.vueTestUtilsStrings.col
import typingsJapgolly.vueTestUtils.vueTestUtilsStrings.colgroup
import typingsJapgolly.vueTestUtils.vueTestUtilsStrings.data
import typingsJapgolly.vueTestUtils.vueTestUtilsStrings.datalist
import typingsJapgolly.vueTestUtils.vueTestUtilsStrings.dd
import typingsJapgolly.vueTestUtils.vueTestUtilsStrings.defs
import typingsJapgolly.vueTestUtils.vueTestUtilsStrings.del
import typingsJapgolly.vueTestUtils.vueTestUtilsStrings.desc
import typingsJapgolly.vueTestUtils.vueTestUtilsStrings.details
import typingsJapgolly.vueTestUtils.vueTestUtilsStrings.dfn
import typingsJapgolly.vueTestUtils.vueTestUtilsStrings.dialog
import typingsJapgolly.vueTestUtils.vueTestUtilsStrings.div
import typingsJapgolly.vueTestUtils.vueTestUtilsStrings.dl
import typingsJapgolly.vueTestUtils.vueTestUtilsStrings.dt
import typingsJapgolly.vueTestUtils.vueTestUtilsStrings.ellipse
import typingsJapgolly.vueTestUtils.vueTestUtilsStrings.em
import typingsJapgolly.vueTestUtils.vueTestUtilsStrings.embed
import typingsJapgolly.vueTestUtils.vueTestUtilsStrings.feBlend
import typingsJapgolly.vueTestUtils.vueTestUtilsStrings.feColorMatrix
import typingsJapgolly.vueTestUtils.vueTestUtilsStrings.feComponentTransfer
import typingsJapgolly.vueTestUtils.vueTestUtilsStrings.feComposite
import typingsJapgolly.vueTestUtils.vueTestUtilsStrings.feConvolveMatrix
import typingsJapgolly.vueTestUtils.vueTestUtilsStrings.feDiffuseLighting
import typingsJapgolly.vueTestUtils.vueTestUtilsStrings.feDisplacementMap
import typingsJapgolly.vueTestUtils.vueTestUtilsStrings.feDistantLight
import typingsJapgolly.vueTestUtils.vueTestUtilsStrings.feDropShadow
import typingsJapgolly.vueTestUtils.vueTestUtilsStrings.feFlood
import typingsJapgolly.vueTestUtils.vueTestUtilsStrings.feFuncA
import typingsJapgolly.vueTestUtils.vueTestUtilsStrings.feFuncB
import typingsJapgolly.vueTestUtils.vueTestUtilsStrings.feFuncG
import typingsJapgolly.vueTestUtils.vueTestUtilsStrings.feFuncR
import typingsJapgolly.vueTestUtils.vueTestUtilsStrings.feGaussianBlur
import typingsJapgolly.vueTestUtils.vueTestUtilsStrings.feImage
import typingsJapgolly.vueTestUtils.vueTestUtilsStrings.feMerge
import typingsJapgolly.vueTestUtils.vueTestUtilsStrings.feMergeNode
import typingsJapgolly.vueTestUtils.vueTestUtilsStrings.feMorphology
import typingsJapgolly.vueTestUtils.vueTestUtilsStrings.feOffset
import typingsJapgolly.vueTestUtils.vueTestUtilsStrings.fePointLight
import typingsJapgolly.vueTestUtils.vueTestUtilsStrings.feSpecularLighting
import typingsJapgolly.vueTestUtils.vueTestUtilsStrings.feSpotLight
import typingsJapgolly.vueTestUtils.vueTestUtilsStrings.feTile
import typingsJapgolly.vueTestUtils.vueTestUtilsStrings.feTurbulence
import typingsJapgolly.vueTestUtils.vueTestUtilsStrings.fieldset
import typingsJapgolly.vueTestUtils.vueTestUtilsStrings.figcaption
import typingsJapgolly.vueTestUtils.vueTestUtilsStrings.figure
import typingsJapgolly.vueTestUtils.vueTestUtilsStrings.filter
import typingsJapgolly.vueTestUtils.vueTestUtilsStrings.footer
import typingsJapgolly.vueTestUtils.vueTestUtilsStrings.foreignObject
import typingsJapgolly.vueTestUtils.vueTestUtilsStrings.form
import typingsJapgolly.vueTestUtils.vueTestUtilsStrings.fullscreenchange
import typingsJapgolly.vueTestUtils.vueTestUtilsStrings.fullscreenerror
import typingsJapgolly.vueTestUtils.vueTestUtilsStrings.g
import typingsJapgolly.vueTestUtils.vueTestUtilsStrings.h1
import typingsJapgolly.vueTestUtils.vueTestUtilsStrings.h2
import typingsJapgolly.vueTestUtils.vueTestUtilsStrings.h3
import typingsJapgolly.vueTestUtils.vueTestUtilsStrings.h4
import typingsJapgolly.vueTestUtils.vueTestUtilsStrings.h5
import typingsJapgolly.vueTestUtils.vueTestUtilsStrings.h6
import typingsJapgolly.vueTestUtils.vueTestUtilsStrings.head
import typingsJapgolly.vueTestUtils.vueTestUtilsStrings.header
import typingsJapgolly.vueTestUtils.vueTestUtilsStrings.hgroup
import typingsJapgolly.vueTestUtils.vueTestUtilsStrings.hr
import typingsJapgolly.vueTestUtils.vueTestUtilsStrings.html
import typingsJapgolly.vueTestUtils.vueTestUtilsStrings.httpColonSlashSlashwwwDotw3DotorgSlash1999Slashxhtml
import typingsJapgolly.vueTestUtils.vueTestUtilsStrings.httpColonSlashSlashwwwDotw3DotorgSlash2000Slashsvg
import typingsJapgolly.vueTestUtils.vueTestUtilsStrings.i
import typingsJapgolly.vueTestUtils.vueTestUtilsStrings.iframe
import typingsJapgolly.vueTestUtils.vueTestUtilsStrings.image
import typingsJapgolly.vueTestUtils.vueTestUtilsStrings.img
import typingsJapgolly.vueTestUtils.vueTestUtilsStrings.input
import typingsJapgolly.vueTestUtils.vueTestUtilsStrings.ins
import typingsJapgolly.vueTestUtils.vueTestUtilsStrings.kbd
import typingsJapgolly.vueTestUtils.vueTestUtilsStrings.label
import typingsJapgolly.vueTestUtils.vueTestUtilsStrings.legend
import typingsJapgolly.vueTestUtils.vueTestUtilsStrings.li
import typingsJapgolly.vueTestUtils.vueTestUtilsStrings.line
import typingsJapgolly.vueTestUtils.vueTestUtilsStrings.linearGradient
import typingsJapgolly.vueTestUtils.vueTestUtilsStrings.link
import typingsJapgolly.vueTestUtils.vueTestUtilsStrings.main
import typingsJapgolly.vueTestUtils.vueTestUtilsStrings.map
import typingsJapgolly.vueTestUtils.vueTestUtilsStrings.mark
import typingsJapgolly.vueTestUtils.vueTestUtilsStrings.marker
import typingsJapgolly.vueTestUtils.vueTestUtilsStrings.mask
import typingsJapgolly.vueTestUtils.vueTestUtilsStrings.menu
import typingsJapgolly.vueTestUtils.vueTestUtilsStrings.meta
import typingsJapgolly.vueTestUtils.vueTestUtilsStrings.metadata
import typingsJapgolly.vueTestUtils.vueTestUtilsStrings.meter
import typingsJapgolly.vueTestUtils.vueTestUtilsStrings.mpath
import typingsJapgolly.vueTestUtils.vueTestUtilsStrings.nav
import typingsJapgolly.vueTestUtils.vueTestUtilsStrings.noscript
import typingsJapgolly.vueTestUtils.vueTestUtilsStrings.ol
import typingsJapgolly.vueTestUtils.vueTestUtilsStrings.optgroup
import typingsJapgolly.vueTestUtils.vueTestUtilsStrings.option
import typingsJapgolly.vueTestUtils.vueTestUtilsStrings.output
import typingsJapgolly.vueTestUtils.vueTestUtilsStrings.p_
import typingsJapgolly.vueTestUtils.vueTestUtilsStrings.path
import typingsJapgolly.vueTestUtils.vueTestUtilsStrings.pattern
import typingsJapgolly.vueTestUtils.vueTestUtilsStrings.picture
import typingsJapgolly.vueTestUtils.vueTestUtilsStrings.polygon
import typingsJapgolly.vueTestUtils.vueTestUtilsStrings.polyline
import typingsJapgolly.vueTestUtils.vueTestUtilsStrings.pre
import typingsJapgolly.vueTestUtils.vueTestUtilsStrings.progress
import typingsJapgolly.vueTestUtils.vueTestUtilsStrings.q
import typingsJapgolly.vueTestUtils.vueTestUtilsStrings.radialGradient
import typingsJapgolly.vueTestUtils.vueTestUtilsStrings.rect
import typingsJapgolly.vueTestUtils.vueTestUtilsStrings.rp
import typingsJapgolly.vueTestUtils.vueTestUtilsStrings.rt
import typingsJapgolly.vueTestUtils.vueTestUtilsStrings.ruby
import typingsJapgolly.vueTestUtils.vueTestUtilsStrings.s
import typingsJapgolly.vueTestUtils.vueTestUtilsStrings.samp
import typingsJapgolly.vueTestUtils.vueTestUtilsStrings.script
import typingsJapgolly.vueTestUtils.vueTestUtilsStrings.section
import typingsJapgolly.vueTestUtils.vueTestUtilsStrings.select
import typingsJapgolly.vueTestUtils.vueTestUtilsStrings.set
import typingsJapgolly.vueTestUtils.vueTestUtilsStrings.slot
import typingsJapgolly.vueTestUtils.vueTestUtilsStrings.small
import typingsJapgolly.vueTestUtils.vueTestUtilsStrings.source
import typingsJapgolly.vueTestUtils.vueTestUtilsStrings.span
import typingsJapgolly.vueTestUtils.vueTestUtilsStrings.stop
import typingsJapgolly.vueTestUtils.vueTestUtilsStrings.strong
import typingsJapgolly.vueTestUtils.vueTestUtilsStrings.style
import typingsJapgolly.vueTestUtils.vueTestUtilsStrings.sub
import typingsJapgolly.vueTestUtils.vueTestUtilsStrings.summary
import typingsJapgolly.vueTestUtils.vueTestUtilsStrings.sup
import typingsJapgolly.vueTestUtils.vueTestUtilsStrings.svg
import typingsJapgolly.vueTestUtils.vueTestUtilsStrings.switch
import typingsJapgolly.vueTestUtils.vueTestUtilsStrings.symbol
import typingsJapgolly.vueTestUtils.vueTestUtilsStrings.table
import typingsJapgolly.vueTestUtils.vueTestUtilsStrings.tbody
import typingsJapgolly.vueTestUtils.vueTestUtilsStrings.td
import typingsJapgolly.vueTestUtils.vueTestUtilsStrings.template
import typingsJapgolly.vueTestUtils.vueTestUtilsStrings.text
import typingsJapgolly.vueTestUtils.vueTestUtilsStrings.textPath
import typingsJapgolly.vueTestUtils.vueTestUtilsStrings.textarea
import typingsJapgolly.vueTestUtils.vueTestUtilsStrings.tfoot
import typingsJapgolly.vueTestUtils.vueTestUtilsStrings.th
import typingsJapgolly.vueTestUtils.vueTestUtilsStrings.thead
import typingsJapgolly.vueTestUtils.vueTestUtilsStrings.time
import typingsJapgolly.vueTestUtils.vueTestUtilsStrings.title
import typingsJapgolly.vueTestUtils.vueTestUtilsStrings.tr
import typingsJapgolly.vueTestUtils.vueTestUtilsStrings.track
import typingsJapgolly.vueTestUtils.vueTestUtilsStrings.tspan
import typingsJapgolly.vueTestUtils.vueTestUtilsStrings.u
import typingsJapgolly.vueTestUtils.vueTestUtilsStrings.ul
import typingsJapgolly.vueTestUtils.vueTestUtilsStrings.use
import typingsJapgolly.vueTestUtils.vueTestUtilsStrings.video
import typingsJapgolly.vueTestUtils.vueTestUtilsStrings.view
import typingsJapgolly.vueTestUtils.vueTestUtilsStrings.wbr
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesMod {
  
  type DefinedComponent = Instantiable1[/* args (repeated) */ Any, Any]
  
  type FindAllComponentsSelector = DefinedComponent | (FunctionalComponent[js.Object, js.Object]) | (ComponentOptions[js.Object, Any, Any, Any, Any, Any, Any, Any]) | NameSelector | String
  
  type FindComponentSelector = RefSelector | FindAllComponentsSelector
  
  trait GlobalMountOptions extends StObject {
    
    /**
      * Registers components globally for components under testing.
      * @see https://next.vue-test-utils.vuejs.org/api/#global-components
      */
    var components: js.UndefOr[
        Record[String, (Component[Any, Any, Any, ComputedOptions, MethodOptions]) | js.Object]
      ] = js.undefined
    
    /**
      * Customizes Vue application global configuration
      * @see https://v3.vuejs.org/api/application-config.html#application-config
      */
    var config: js.UndefOr[PartialOmitAppConfigisNat] = js.undefined
    
    /**
      * Registers a directive globally for components under testing
      * @see https://next.vue-test-utils.vuejs.org/api/#global-directives
      */
    var directives: js.UndefOr[Record[String, Directive[Any, Any]]] = js.undefined
    
    /**
      * Applies a mixin for components under testing.
      * @see https://next.vue-test-utils.vuejs.org/api/#global-mixins
      */
    var mixins: js.UndefOr[js.Array[ComponentOptions[js.Object, Any, Any, Any, Any, Any, Any, Any]]] = js.undefined
    
    /**
      * Mocks a global instance property.
      * This is designed to mock variables injected by third party plugins, not
      * Vue's native properties such as $root, $children, etc.
      * @see https://next.vue-test-utils.vuejs.org/api/#global-mocks
      */
    var mocks: js.UndefOr[Record[String, Any]] = js.undefined
    
    /**
      * Installs plugins on the component.
      * @see https://next.vue-test-utils.vuejs.org/api/#global-plugins
      */
    var plugins: js.UndefOr[js.Array[Plugin2 | (Array[Plugin2 | Any])]] = js.undefined
    
    /**
      * Provides data to be received in a setup function via `inject`.
      * @see https://next.vue-test-utils.vuejs.org/api/#global-provide
      */
    var provide: js.UndefOr[Record[Any, Any]] = js.undefined
    
    /**
      * Allows rendering the default slot content, even when using
      * `shallow` or `shallowMount`.
      * @default false
      * @see https://next.vue-test-utils.vuejs.org/api/#global-renderstubdefaultslot
      */
    var renderStubDefaultSlot: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Stubs a component for components under testing.
      * @default "{ transition: true, 'transition-group': true }"
      * @see https://next.vue-test-utils.vuejs.org/api/#global-stubs
      */
    var stubs: js.UndefOr[Stubs] = js.undefined
  }
  object GlobalMountOptions {
    
    inline def apply(): GlobalMountOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GlobalMountOptions]
    }
    
    extension [Self <: GlobalMountOptions](x: Self) {
      
      inline def setComponents(value: Record[String, (Component[Any, Any, Any, ComputedOptions, MethodOptions]) | js.Object]): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
      
      inline def setComponentsUndefined: Self = StObject.set(x, "components", js.undefined)
      
      inline def setConfig(value: PartialOmitAppConfigisNat): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
      
      inline def setDirectives(value: Record[String, Directive[Any, Any]]): Self = StObject.set(x, "directives", value.asInstanceOf[js.Any])
      
      inline def setDirectivesUndefined: Self = StObject.set(x, "directives", js.undefined)
      
      inline def setMixins(value: js.Array[ComponentOptions[js.Object, Any, Any, Any, Any, Any, Any, Any]]): Self = StObject.set(x, "mixins", value.asInstanceOf[js.Any])
      
      inline def setMixinsUndefined: Self = StObject.set(x, "mixins", js.undefined)
      
      inline def setMixinsVarargs(value: (ComponentOptions[js.Object, Any, Any, Any, Any, Any, Any, Any])*): Self = StObject.set(x, "mixins", js.Array(value*))
      
      inline def setMocks(value: Record[String, Any]): Self = StObject.set(x, "mocks", value.asInstanceOf[js.Any])
      
      inline def setMocksUndefined: Self = StObject.set(x, "mocks", js.undefined)
      
      inline def setPlugins(value: js.Array[Plugin2 | (Array[Plugin2 | Any])]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      inline def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
      
      inline def setPluginsVarargs(value: (Plugin2 | (Array[Plugin2 | Any]))*): Self = StObject.set(x, "plugins", js.Array(value*))
      
      inline def setProvide(value: Record[Any, Any]): Self = StObject.set(x, "provide", value.asInstanceOf[js.Any])
      
      inline def setProvideUndefined: Self = StObject.set(x, "provide", js.undefined)
      
      inline def setRenderStubDefaultSlot(value: Boolean): Self = StObject.set(x, "renderStubDefaultSlot", value.asInstanceOf[js.Any])
      
      inline def setRenderStubDefaultSlotUndefined: Self = StObject.set(x, "renderStubDefaultSlot", js.undefined)
      
      inline def setStubs(value: Stubs): Self = StObject.set(x, "stubs", value.asInstanceOf[js.Any])
      
      inline def setStubsUndefined: Self = StObject.set(x, "stubs", js.undefined)
      
      inline def setStubsVarargs(value: String*): Self = StObject.set(x, "stubs", js.Array(value*))
    }
  }
  
  trait MountingOptions[Props, Data] extends StObject {
    
    /**
      * Specify where to mount the component.
      * Can be a valid CSS selector, or an Element connected to the document.
      * @see https://next.vue-test-utils.vuejs.org/api/#attachto
      */
    var attachTo: js.UndefOr[HTMLElement | String] = js.undefined
    
    /**
      * Sets component attributes when mounted.
      * @see https://next.vue-test-utils.vuejs.org/api/#attrs
      */
    var attrs: js.UndefOr[Record[String, Any]] = js.undefined
    
    /**
      * Overrides component's default data. Must be a function.
      * @see https://next.vue-test-utils.vuejs.org/api/#data
      */
    var data: js.UndefOr[
        js.Function0[
          /* import warning: importer.ImportType#apply Failed type conversion: {} extends Data ? any : Data extends object ? std.Partial<Data> : any */ js.Any
        ]
      ] = js.undefined
    
    /**
      * Provides global mounting options to the component.
      */
    var global: js.UndefOr[GlobalMountOptions] = js.undefined
    
    /**
      * Sets component props when mounted.
      * @see https://next.vue-test-utils.vuejs.org/api/#props
      */
    var props: js.UndefOr[
        (RawProps & Props) | (/* import warning: importer.ImportType#apply Failed type conversion: {} extends Props ? null : never */ js.Any)
      ] = js.undefined
    
    /**
      * @deprecated use `data` instead.
      */
    var propsData: js.UndefOr[Props] = js.undefined
    
    /**
      * Automatically stub out all the child components.
      * @default false
      * @see https://next.vue-test-utils.vuejs.org/api/#slots
      */
    var shallow: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Provide values for slots on a component.
      * @see https://next.vue-test-utils.vuejs.org/api/#slots
      */
    var slots: js.UndefOr[SlotDictionarydefaultSlot] = js.undefined
  }
  object MountingOptions {
    
    inline def apply[Props, Data](): MountingOptions[Props, Data] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MountingOptions[Props, Data]]
    }
    
    extension [Self <: MountingOptions[?, ?], Props, Data](x: Self & (MountingOptions[Props, Data])) {
      
      inline def setAttachTo(value: HTMLElement | String): Self = StObject.set(x, "attachTo", value.asInstanceOf[js.Any])
      
      inline def setAttachToUndefined: Self = StObject.set(x, "attachTo", js.undefined)
      
      inline def setAttrs(value: Record[String, Any]): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
      
      inline def setAttrsUndefined: Self = StObject.set(x, "attrs", js.undefined)
      
      inline def setData(
        value: CallbackTo[
              /* import warning: importer.ImportType#apply Failed type conversion: {} extends Data ? any : Data extends object ? std.Partial<Data> : any */ js.Any
            ]
      ): Self = StObject.set(x, "data", value.toJsFn)
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setGlobal(value: GlobalMountOptions): Self = StObject.set(x, "global", value.asInstanceOf[js.Any])
      
      inline def setGlobalUndefined: Self = StObject.set(x, "global", js.undefined)
      
      inline def setProps(
        value: (RawProps & Props) | (/* import warning: importer.ImportType#apply Failed type conversion: {} extends Props ? null : never */ js.Any)
      ): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      inline def setPropsData(value: Props): Self = StObject.set(x, "propsData", value.asInstanceOf[js.Any])
      
      inline def setPropsDataUndefined: Self = StObject.set(x, "propsData", js.undefined)
      
      inline def setPropsUndefined: Self = StObject.set(x, "props", js.undefined)
      
      inline def setShallow(value: Boolean): Self = StObject.set(x, "shallow", value.asInstanceOf[js.Any])
      
      inline def setShallowUndefined: Self = StObject.set(x, "shallow", js.undefined)
      
      inline def setSlots(value: SlotDictionarydefaultSlot): Self = StObject.set(x, "slots", value.asInstanceOf[js.Any])
      
      inline def setSlotsUndefined: Self = StObject.set(x, "slots", js.undefined)
    }
  }
  
  trait NameSelector extends StObject {
    
    var length: js.UndefOr[scala.Nothing] = js.undefined
    
    var name: String
  }
  object NameSelector {
    
    inline def apply(name: String): NameSelector = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[NameSelector]
    }
    
    extension [Self <: NameSelector](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  type RawProps = VNodeProps & Iterator & (Record[String, Any])
  
  trait RefSelector extends StObject {
    
    var ref: String
  }
  object RefSelector {
    
    inline def apply(ref: String): RefSelector = {
      val __obj = js.Dynamic.literal(ref = ref.asInstanceOf[js.Any])
      __obj.asInstanceOf[RefSelector]
    }
    
    extension [Self <: RefSelector](x: Self) {
      
      inline def setRef(value: String): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    }
  }
  
  type Slot = (VNode[RendererNode, RendererElement, StringDictionary[Any]]) | String | Render | js.Function | (Component[Any, Any, Any, ComputedOptions, MethodOptions])
  
  type SlotDictionary = StringDictionary[Slot]
  
  type Stub = Boolean | (Component[Any, Any, Any, ComputedOptions, MethodOptions])
  
  type Stubs = (Record[String, Stub]) | js.Array[String]
  
  /* Inlined @vue/test-utils.@vue/test-utils/dist/types.VueNode<std.Element> */
  @js.native
  trait VueElement extends StObject {
    
    /* standard dom */
    val ATTRIBUTE_NODE: Double = js.native
    
    /** node is a CDATASection node. */
    /* standard dom */
    val CDATA_SECTION_NODE: Double = js.native
    
    /** node is a Comment node. */
    /* standard dom */
    val COMMENT_NODE: Double = js.native
    
    /** node is a DocumentFragment node. */
    /* standard dom */
    val DOCUMENT_FRAGMENT_NODE: Double = js.native
    
    /** node is a document. */
    /* standard dom */
    val DOCUMENT_NODE: Double = js.native
    
    /** Set when other is a descendant of node. */
    /* standard dom */
    val DOCUMENT_POSITION_CONTAINED_BY: Double = js.native
    
    /** Set when other is an ancestor of node. */
    /* standard dom */
    val DOCUMENT_POSITION_CONTAINS: Double = js.native
    
    /** Set when node and other are not in the same tree. */
    /* standard dom */
    val DOCUMENT_POSITION_DISCONNECTED: Double = js.native
    
    /** Set when other is following node. */
    /* standard dom */
    val DOCUMENT_POSITION_FOLLOWING: Double = js.native
    
    /* standard dom */
    val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Double = js.native
    
    /** Set when other is preceding node. */
    /* standard dom */
    val DOCUMENT_POSITION_PRECEDING: Double = js.native
    
    /** node is a doctype. */
    /* standard dom */
    val DOCUMENT_TYPE_NODE: Double = js.native
    
    /** node is an element. */
    /* standard dom */
    val ELEMENT_NODE: Double = js.native
    
    /* standard dom */
    val ENTITY_NODE: Double = js.native
    
    /* standard dom */
    val ENTITY_REFERENCE_NODE: Double = js.native
    
    /* standard dom */
    val NOTATION_NODE: Double = js.native
    
    /** node is a ProcessingInstruction node. */
    /* standard dom */
    val PROCESSING_INSTRUCTION_NODE: Double = js.native
    
    /** node is a Text node. */
    /* standard dom */
    val TEXT_NODE: Double = js.native
    
    var __vueParentComponent: js.UndefOr[ComponentInternalInstance] = js.native
    
    var __vue_app__ : js.UndefOr[Any] = js.native
    
    /**
      * Appends an event listener for events whose type attribute value is type. The callback argument sets the callback that will be invoked when the event is dispatched.
      *
      * The options argument sets listener-specific options. For compatibility this can be a boolean, in which case the method behaves exactly as if the value was specified as options's capture.
      *
      * When set to true, options's capture prevents callback from being invoked when the event's eventPhase attribute value is BUBBLING_PHASE. When false (or not present), callback will not be invoked when event's eventPhase attribute value is CAPTURING_PHASE. Either way, callback will be invoked if event's eventPhase attribute value is AT_TARGET.
      *
      * When set to true, options's passive indicates that the callback will not cancel the event by invoking preventDefault(). This is used to enable performance optimizations described in § 2.8 Observing event listeners.
      *
      * When set to true, options's once indicates that the callback will only be invoked once after which the event listener will be removed.
      *
      * If an AbortSignal is passed for options's signal, then the event listener will be removed when signal is aborted.
      *
      * The event listener is appended to target's event listener list and is not appended if it has the same type, callback, and capture.
      */
    /* standard dom */
    def addEventListener(`type`: String): Unit = js.native
    def addEventListener(`type`: String, callback: Null, options: Boolean): Unit = js.native
    def addEventListener(`type`: String, callback: Null, options: AddEventListenerOptions): Unit = js.native
    /* standard dom */
    def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject): Unit = js.native
    def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
    def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: AddEventListenerOptions): Unit = js.native
    /* standard dom */
    @JSName("addEventListener")
    def addEventListener_fullscreenchange(`type`: fullscreenchange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_fullscreenchange(
      `type`: fullscreenchange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_fullscreenchange(
      `type`: fullscreenchange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_fullscreenerror(`type`: fullscreenerror, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_fullscreenerror(
      `type`: fullscreenerror,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_fullscreenerror(
      `type`: fullscreenerror,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    
    /**
      * Inserts nodes just after node, while replacing strings in nodes with equivalent Text nodes.
      *
      * Throws a "HierarchyRequestError" DOMException if the constraints of the node tree are violated.
      */
    /* standard dom */
    def after(nodes: (Node | String)*): Unit = js.native
    
    /* standard dom */
    def animate(): Animation = js.native
    def animate(keyframes: js.Array[Keyframe]): Animation = js.native
    def animate(keyframes: js.Array[Keyframe], options: Double): Animation = js.native
    def animate(keyframes: js.Array[Keyframe], options: KeyframeAnimationOptions): Animation = js.native
    def animate(keyframes: Null, options: Double): Animation = js.native
    def animate(keyframes: Null, options: KeyframeAnimationOptions): Animation = js.native
    def animate(keyframes: PropertyIndexedKeyframes): Animation = js.native
    def animate(keyframes: PropertyIndexedKeyframes, options: Double): Animation = js.native
    def animate(keyframes: PropertyIndexedKeyframes, options: KeyframeAnimationOptions): Animation = js.native
    
    /**
      * Inserts nodes after the last child of node, while replacing strings in nodes with equivalent Text nodes.
      *
      * Throws a "HierarchyRequestError" DOMException if the constraints of the node tree are violated.
      */
    /* standard dom */
    def append(nodes: (Node | String)*): Unit = js.native
    
    /* standard dom */
    def appendChild[T /* <: Node */](node: T): T = js.native
    
    /* standard dom */
    var ariaAtomic: String | Null = js.native
    
    /* standard dom */
    var ariaAutoComplete: String | Null = js.native
    
    /* standard dom */
    var ariaBusy: String | Null = js.native
    
    /* standard dom */
    var ariaChecked: String | Null = js.native
    
    /* standard dom */
    var ariaColCount: String | Null = js.native
    
    /* standard dom */
    var ariaColIndex: String | Null = js.native
    
    /* standard dom */
    var ariaColSpan: String | Null = js.native
    
    /* standard dom */
    var ariaCurrent: String | Null = js.native
    
    /* standard dom */
    var ariaDisabled: String | Null = js.native
    
    /* standard dom */
    var ariaExpanded: String | Null = js.native
    
    /* standard dom */
    var ariaHasPopup: String | Null = js.native
    
    /* standard dom */
    var ariaHidden: String | Null = js.native
    
    /* standard dom */
    var ariaKeyShortcuts: String | Null = js.native
    
    /* standard dom */
    var ariaLabel: String | Null = js.native
    
    /* standard dom */
    var ariaLevel: String | Null = js.native
    
    /* standard dom */
    var ariaLive: String | Null = js.native
    
    /* standard dom */
    var ariaModal: String | Null = js.native
    
    /* standard dom */
    var ariaMultiLine: String | Null = js.native
    
    /* standard dom */
    var ariaMultiSelectable: String | Null = js.native
    
    /* standard dom */
    var ariaOrientation: String | Null = js.native
    
    /* standard dom */
    var ariaPlaceholder: String | Null = js.native
    
    /* standard dom */
    var ariaPosInSet: String | Null = js.native
    
    /* standard dom */
    var ariaPressed: String | Null = js.native
    
    /* standard dom */
    var ariaReadOnly: String | Null = js.native
    
    /* standard dom */
    var ariaRequired: String | Null = js.native
    
    /* standard dom */
    var ariaRoleDescription: String | Null = js.native
    
    /* standard dom */
    var ariaRowCount: String | Null = js.native
    
    /* standard dom */
    var ariaRowIndex: String | Null = js.native
    
    /* standard dom */
    var ariaRowSpan: String | Null = js.native
    
    /* standard dom */
    var ariaSelected: String | Null = js.native
    
    /* standard dom */
    var ariaSetSize: String | Null = js.native
    
    /* standard dom */
    var ariaSort: String | Null = js.native
    
    /* standard dom */
    var ariaValueMax: String | Null = js.native
    
    /* standard dom */
    var ariaValueMin: String | Null = js.native
    
    /* standard dom */
    var ariaValueNow: String | Null = js.native
    
    /* standard dom */
    var ariaValueText: String | Null = js.native
    
    /* standard dom */
    val assignedSlot: HTMLSlotElement | Null = js.native
    
    /** Creates a shadow root for element and returns it. */
    /* standard dom */
    def attachShadow(init: ShadowRootInit): ShadowRoot = js.native
    
    /* standard dom */
    val attributes: NamedNodeMap = js.native
    
    /** Returns node's node document's document base URL. */
    /* standard dom */
    val baseURI: String = js.native
    
    /**
      * Inserts nodes just before node, while replacing strings in nodes with equivalent Text nodes.
      *
      * Throws a "HierarchyRequestError" DOMException if the constraints of the node tree are violated.
      */
    /* standard dom */
    def before(nodes: (Node | String)*): Unit = js.native
    
    /* standard dom */
    val childElementCount: Double = js.native
    
    /** Returns the children. */
    /* standard dom */
    val childNodes: NodeList[ChildNode & Node] = js.native
    
    /** Returns the child elements. */
    /* standard dom */
    val children: HTMLCollection[Any] = js.native
    
    /** Allows for manipulation of element's class content attribute as a set of whitespace-separated tokens through a DOMTokenList object. */
    /* standard dom */
    val classList: DOMTokenList = js.native
    
    /** Returns the value of element's class content attribute. Can be set to change it. */
    /* standard dom */
    var className: String = js.native
    
    /* standard dom */
    val clientHeight: Double = js.native
    
    /* standard dom */
    val clientLeft: Double = js.native
    
    /* standard dom */
    val clientTop: Double = js.native
    
    /* standard dom */
    val clientWidth: Double = js.native
    
    /** Returns a copy of node. If deep is true, the copy also includes the node's descendants. */
    /* standard dom */
    def cloneNode(): Node = js.native
    def cloneNode(deep: Boolean): Node = js.native
    
    /* standard dom */
    def closest[E /* <: Element */](selectors: String): E | Null = js.native
    /** Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise. */
    /* standard dom */
    @JSName("closest")
    def closest_a(selector: a): HTMLAnchorElement | Null = js.native
    @JSName("closest")
    def closest_abbr(selector: abbr): HTMLElement | Null = js.native
    @JSName("closest")
    def closest_address(selector: address): HTMLElement | Null = js.native
    @JSName("closest")
    def closest_animate(selector: animate): SVGAnimateElement | Null = js.native
    @JSName("closest")
    def closest_animateMotion(selector: animateMotion): SVGAnimateMotionElement | Null = js.native
    @JSName("closest")
    def closest_animateTransform(selector: animateTransform): SVGAnimateTransformElement | Null = js.native
    @JSName("closest")
    def closest_area(selector: area): HTMLAreaElement | Null = js.native
    @JSName("closest")
    def closest_article(selector: article): HTMLElement | Null = js.native
    @JSName("closest")
    def closest_aside(selector: aside): HTMLElement | Null = js.native
    @JSName("closest")
    def closest_audio(selector: audio): HTMLAudioElement | Null = js.native
    @JSName("closest")
    def closest_b(selector: b_): HTMLElement | Null = js.native
    @JSName("closest")
    def closest_base(selector: base): HTMLBaseElement | Null = js.native
    @JSName("closest")
    def closest_bdi(selector: bdi): HTMLElement | Null = js.native
    @JSName("closest")
    def closest_bdo(selector: bdo): HTMLElement | Null = js.native
    @JSName("closest")
    def closest_blockquote(selector: blockquote): HTMLQuoteElement | Null = js.native
    @JSName("closest")
    def closest_body(selector: body): HTMLBodyElement | Null = js.native
    @JSName("closest")
    def closest_br(selector: br): HTMLBRElement | Null = js.native
    @JSName("closest")
    def closest_button(selector: button): HTMLButtonElement | Null = js.native
    @JSName("closest")
    def closest_canvas(selector: canvas): HTMLCanvasElement | Null = js.native
    @JSName("closest")
    def closest_caption(selector: caption): HTMLTableCaptionElement | Null = js.native
    @JSName("closest")
    def closest_circle(selector: circle): SVGCircleElement | Null = js.native
    @JSName("closest")
    def closest_cite(selector: cite): HTMLElement | Null = js.native
    @JSName("closest")
    def closest_clipPath(selector: clipPath): SVGClipPathElement | Null = js.native
    @JSName("closest")
    def closest_code(selector: code): HTMLElement | Null = js.native
    @JSName("closest")
    def closest_col(selector: col): HTMLTableColElement | Null = js.native
    @JSName("closest")
    def closest_colgroup(selector: colgroup): HTMLTableColElement | Null = js.native
    @JSName("closest")
    def closest_data(selector: data): HTMLDataElement | Null = js.native
    @JSName("closest")
    def closest_datalist(selector: datalist): HTMLDataListElement | Null = js.native
    @JSName("closest")
    def closest_dd(selector: dd): HTMLElement | Null = js.native
    @JSName("closest")
    def closest_defs(selector: defs): SVGDefsElement | Null = js.native
    @JSName("closest")
    def closest_del(selector: del): HTMLModElement | Null = js.native
    @JSName("closest")
    def closest_desc(selector: desc): SVGDescElement | Null = js.native
    @JSName("closest")
    def closest_details(selector: details): HTMLDetailsElement | Null = js.native
    @JSName("closest")
    def closest_dfn(selector: dfn): HTMLElement | Null = js.native
    @JSName("closest")
    def closest_dialog(selector: dialog): HTMLDialogElement | Null = js.native
    @JSName("closest")
    def closest_div(selector: div): HTMLDivElement | Null = js.native
    @JSName("closest")
    def closest_dl(selector: dl): HTMLDListElement | Null = js.native
    @JSName("closest")
    def closest_dt(selector: dt): HTMLElement | Null = js.native
    @JSName("closest")
    def closest_ellipse(selector: ellipse): SVGEllipseElement | Null = js.native
    @JSName("closest")
    def closest_em(selector: em): HTMLElement | Null = js.native
    @JSName("closest")
    def closest_embed(selector: embed): HTMLEmbedElement | Null = js.native
    @JSName("closest")
    def closest_feBlend(selector: feBlend): SVGFEBlendElement | Null = js.native
    @JSName("closest")
    def closest_feColorMatrix(selector: feColorMatrix): SVGFEColorMatrixElement | Null = js.native
    @JSName("closest")
    def closest_feComponentTransfer(selector: feComponentTransfer): SVGFEComponentTransferElement | Null = js.native
    @JSName("closest")
    def closest_feComposite(selector: feComposite): SVGFECompositeElement | Null = js.native
    @JSName("closest")
    def closest_feConvolveMatrix(selector: feConvolveMatrix): SVGFEConvolveMatrixElement | Null = js.native
    @JSName("closest")
    def closest_feDiffuseLighting(selector: feDiffuseLighting): SVGFEDiffuseLightingElement | Null = js.native
    @JSName("closest")
    def closest_feDisplacementMap(selector: feDisplacementMap): SVGFEDisplacementMapElement | Null = js.native
    @JSName("closest")
    def closest_feDistantLight(selector: feDistantLight): SVGFEDistantLightElement | Null = js.native
    @JSName("closest")
    def closest_feDropShadow(selector: feDropShadow): SVGFEDropShadowElement | Null = js.native
    @JSName("closest")
    def closest_feFlood(selector: feFlood): SVGFEFloodElement | Null = js.native
    @JSName("closest")
    def closest_feFuncA(selector: feFuncA): SVGFEFuncAElement | Null = js.native
    @JSName("closest")
    def closest_feFuncB(selector: feFuncB): SVGFEFuncBElement | Null = js.native
    @JSName("closest")
    def closest_feFuncG(selector: feFuncG): SVGFEFuncGElement | Null = js.native
    @JSName("closest")
    def closest_feFuncR(selector: feFuncR): SVGFEFuncRElement | Null = js.native
    @JSName("closest")
    def closest_feGaussianBlur(selector: feGaussianBlur): SVGFEGaussianBlurElement | Null = js.native
    @JSName("closest")
    def closest_feImage(selector: feImage): SVGFEImageElement | Null = js.native
    @JSName("closest")
    def closest_feMerge(selector: feMerge): SVGFEMergeElement | Null = js.native
    @JSName("closest")
    def closest_feMergeNode(selector: feMergeNode): SVGFEMergeNodeElement | Null = js.native
    @JSName("closest")
    def closest_feMorphology(selector: feMorphology): SVGFEMorphologyElement | Null = js.native
    @JSName("closest")
    def closest_feOffset(selector: feOffset): SVGFEOffsetElement | Null = js.native
    @JSName("closest")
    def closest_fePointLight(selector: fePointLight): SVGFEPointLightElement | Null = js.native
    @JSName("closest")
    def closest_feSpecularLighting(selector: feSpecularLighting): SVGFESpecularLightingElement | Null = js.native
    @JSName("closest")
    def closest_feSpotLight(selector: feSpotLight): SVGFESpotLightElement | Null = js.native
    @JSName("closest")
    def closest_feTile(selector: feTile): SVGFETileElement | Null = js.native
    @JSName("closest")
    def closest_feTurbulence(selector: feTurbulence): SVGFETurbulenceElement | Null = js.native
    @JSName("closest")
    def closest_fieldset(selector: fieldset): HTMLFieldSetElement | Null = js.native
    @JSName("closest")
    def closest_figcaption(selector: figcaption): HTMLElement | Null = js.native
    @JSName("closest")
    def closest_figure(selector: figure): HTMLElement | Null = js.native
    @JSName("closest")
    def closest_filter(selector: filter): SVGFilterElement | Null = js.native
    @JSName("closest")
    def closest_footer(selector: footer): HTMLElement | Null = js.native
    @JSName("closest")
    def closest_foreignObject(selector: foreignObject): SVGForeignObjectElement | Null = js.native
    @JSName("closest")
    def closest_form(selector: form): HTMLFormElement | Null = js.native
    @JSName("closest")
    def closest_g(selector: g): SVGGElement | Null = js.native
    @JSName("closest")
    def closest_h1(selector: h1): HTMLHeadingElement | Null = js.native
    @JSName("closest")
    def closest_h2(selector: h2): HTMLHeadingElement | Null = js.native
    @JSName("closest")
    def closest_h3(selector: h3): HTMLHeadingElement | Null = js.native
    @JSName("closest")
    def closest_h4(selector: h4): HTMLHeadingElement | Null = js.native
    @JSName("closest")
    def closest_h5(selector: h5): HTMLHeadingElement | Null = js.native
    @JSName("closest")
    def closest_h6(selector: h6): HTMLHeadingElement | Null = js.native
    @JSName("closest")
    def closest_head(selector: head): HTMLHeadElement | Null = js.native
    @JSName("closest")
    def closest_header(selector: header): HTMLElement | Null = js.native
    @JSName("closest")
    def closest_hgroup(selector: hgroup): HTMLElement | Null = js.native
    @JSName("closest")
    def closest_hr(selector: hr): HTMLHRElement | Null = js.native
    @JSName("closest")
    def closest_html(selector: html): HTMLHtmlElement | Null = js.native
    @JSName("closest")
    def closest_i(selector: i): HTMLElement | Null = js.native
    @JSName("closest")
    def closest_iframe(selector: iframe): HTMLIFrameElement | Null = js.native
    @JSName("closest")
    def closest_image(selector: image): SVGImageElement | Null = js.native
    @JSName("closest")
    def closest_img(selector: img): HTMLImageElement | Null = js.native
    @JSName("closest")
    def closest_input(selector: input): HTMLInputElement | Null = js.native
    @JSName("closest")
    def closest_ins(selector: ins): HTMLModElement | Null = js.native
    @JSName("closest")
    def closest_kbd(selector: kbd): HTMLElement | Null = js.native
    @JSName("closest")
    def closest_label(selector: label): HTMLLabelElement | Null = js.native
    @JSName("closest")
    def closest_legend(selector: legend): HTMLLegendElement | Null = js.native
    @JSName("closest")
    def closest_li(selector: li): HTMLLIElement | Null = js.native
    @JSName("closest")
    def closest_line(selector: line): SVGLineElement | Null = js.native
    @JSName("closest")
    def closest_linearGradient(selector: linearGradient): SVGLinearGradientElement | Null = js.native
    @JSName("closest")
    def closest_link(selector: link): HTMLLinkElement | Null = js.native
    @JSName("closest")
    def closest_main(selector: main): HTMLElement | Null = js.native
    @JSName("closest")
    def closest_map(selector: map): HTMLMapElement | Null = js.native
    @JSName("closest")
    def closest_mark(selector: mark): HTMLElement | Null = js.native
    @JSName("closest")
    def closest_marker(selector: marker): SVGMarkerElement | Null = js.native
    @JSName("closest")
    def closest_mask(selector: mask): SVGMaskElement | Null = js.native
    @JSName("closest")
    def closest_menu(selector: menu): HTMLMenuElement | Null = js.native
    @JSName("closest")
    def closest_meta(selector: meta): HTMLMetaElement | Null = js.native
    @JSName("closest")
    def closest_metadata(selector: metadata): SVGMetadataElement | Null = js.native
    @JSName("closest")
    def closest_meter(selector: meter): HTMLMeterElement | Null = js.native
    @JSName("closest")
    def closest_mpath(selector: mpath): SVGMPathElement | Null = js.native
    @JSName("closest")
    def closest_nav(selector: nav): HTMLElement | Null = js.native
    @JSName("closest")
    def closest_noscript(selector: noscript): HTMLElement | Null = js.native
    @JSName("closest")
    def closest_object(selector: `object`): HTMLObjectElement | Null = js.native
    @JSName("closest")
    def closest_ol(selector: ol): HTMLOListElement | Null = js.native
    @JSName("closest")
    def closest_optgroup(selector: optgroup): HTMLOptGroupElement | Null = js.native
    @JSName("closest")
    def closest_option(selector: option): HTMLOptionElement | Null = js.native
    @JSName("closest")
    def closest_output(selector: output): HTMLOutputElement | Null = js.native
    @JSName("closest")
    def closest_p(selector: p_): HTMLParagraphElement | Null = js.native
    @JSName("closest")
    def closest_path(selector: path): SVGPathElement | Null = js.native
    @JSName("closest")
    def closest_pattern(selector: pattern): SVGPatternElement | Null = js.native
    @JSName("closest")
    def closest_picture(selector: picture): HTMLPictureElement | Null = js.native
    @JSName("closest")
    def closest_polygon(selector: polygon): SVGPolygonElement | Null = js.native
    @JSName("closest")
    def closest_polyline(selector: polyline): SVGPolylineElement | Null = js.native
    @JSName("closest")
    def closest_pre(selector: pre): HTMLPreElement | Null = js.native
    @JSName("closest")
    def closest_progress(selector: progress): HTMLProgressElement | Null = js.native
    @JSName("closest")
    def closest_q(selector: q): HTMLQuoteElement | Null = js.native
    @JSName("closest")
    def closest_radialGradient(selector: radialGradient): SVGRadialGradientElement | Null = js.native
    @JSName("closest")
    def closest_rect(selector: rect): SVGRectElement | Null = js.native
    @JSName("closest")
    def closest_rp(selector: rp): HTMLElement | Null = js.native
    @JSName("closest")
    def closest_rt(selector: rt): HTMLElement | Null = js.native
    @JSName("closest")
    def closest_ruby(selector: ruby): HTMLElement | Null = js.native
    @JSName("closest")
    def closest_s(selector: s): HTMLElement | Null = js.native
    @JSName("closest")
    def closest_samp(selector: samp): HTMLElement | Null = js.native
    @JSName("closest")
    def closest_script(selector: script): HTMLScriptElement | Null = js.native
    @JSName("closest")
    def closest_section(selector: section): HTMLElement | Null = js.native
    @JSName("closest")
    def closest_select(selector: select): HTMLSelectElement | Null = js.native
    @JSName("closest")
    def closest_set(selector: set): SVGSetElement | Null = js.native
    @JSName("closest")
    def closest_slot(selector: slot): HTMLSlotElement | Null = js.native
    @JSName("closest")
    def closest_small(selector: small): HTMLElement | Null = js.native
    @JSName("closest")
    def closest_source(selector: source): HTMLSourceElement | Null = js.native
    @JSName("closest")
    def closest_span(selector: span): HTMLSpanElement | Null = js.native
    @JSName("closest")
    def closest_stop(selector: stop): SVGStopElement | Null = js.native
    @JSName("closest")
    def closest_strong(selector: strong): HTMLElement | Null = js.native
    @JSName("closest")
    def closest_style(selector: style): HTMLStyleElement | Null = js.native
    @JSName("closest")
    def closest_sub(selector: sub): HTMLElement | Null = js.native
    @JSName("closest")
    def closest_summary(selector: summary): HTMLElement | Null = js.native
    @JSName("closest")
    def closest_sup(selector: sup): HTMLElement | Null = js.native
    @JSName("closest")
    def closest_svg(selector: svg): SVGSVGElement | Null = js.native
    @JSName("closest")
    def closest_switch(selector: switch): SVGSwitchElement | Null = js.native
    @JSName("closest")
    def closest_symbol(selector: symbol): SVGSymbolElement | Null = js.native
    @JSName("closest")
    def closest_table(selector: table): HTMLTableElement | Null = js.native
    @JSName("closest")
    def closest_tbody(selector: tbody): HTMLTableSectionElement | Null = js.native
    @JSName("closest")
    def closest_td(selector: td): HTMLTableCellElement | Null = js.native
    @JSName("closest")
    def closest_template(selector: template): HTMLTemplateElement | Null = js.native
    @JSName("closest")
    def closest_text(selector: text): SVGTextElement | Null = js.native
    @JSName("closest")
    def closest_textPath(selector: textPath): SVGTextPathElement | Null = js.native
    @JSName("closest")
    def closest_textarea(selector: textarea): HTMLTextAreaElement | Null = js.native
    @JSName("closest")
    def closest_tfoot(selector: tfoot): HTMLTableSectionElement | Null = js.native
    @JSName("closest")
    def closest_th(selector: th): HTMLTableCellElement | Null = js.native
    @JSName("closest")
    def closest_thead(selector: thead): HTMLTableSectionElement | Null = js.native
    @JSName("closest")
    def closest_time(selector: time): HTMLTimeElement | Null = js.native
    @JSName("closest")
    def closest_title(selector: title): HTMLTitleElement | Null = js.native
    @JSName("closest")
    def closest_tr(selector: tr): HTMLTableRowElement | Null = js.native
    @JSName("closest")
    def closest_track(selector: track): HTMLTrackElement | Null = js.native
    @JSName("closest")
    def closest_tspan(selector: tspan): SVGTSpanElement | Null = js.native
    @JSName("closest")
    def closest_u(selector: u): HTMLElement | Null = js.native
    @JSName("closest")
    def closest_ul(selector: ul): HTMLUListElement | Null = js.native
    @JSName("closest")
    def closest_use(selector: use): SVGUseElement | Null = js.native
    @JSName("closest")
    def closest_var(selector: `var`): HTMLElement | Null = js.native
    @JSName("closest")
    def closest_video(selector: video): HTMLVideoElement | Null = js.native
    @JSName("closest")
    def closest_view(selector: view): SVGViewElement | Null = js.native
    @JSName("closest")
    def closest_wbr(selector: wbr): HTMLElement | Null = js.native
    
    /** Returns a bitmask indicating the position of other relative to node. */
    /* standard dom */
    def compareDocumentPosition(other: Node): Double = js.native
    
    /** Returns true if other is an inclusive descendant of node, and false otherwise. */
    /* standard dom */
    def contains(): Boolean = js.native
    def contains(other: Node): Boolean = js.native
    
    /** Dispatches a synthetic event event to target and returns true if either event's cancelable attribute value is false or its preventDefault() method was not invoked, and false otherwise. */
    /* standard dom */
    def dispatchEvent(event: Event): Boolean = js.native
    
    /** Returns the first child. */
    /* standard dom */
    val firstChild: ChildNode | Null = js.native
    
    /** Returns the first child that is an element, and null otherwise. */
    /* standard dom */
    val firstElementChild: Element | Null = js.native
    
    /* standard dom */
    def getAnimations(): js.Array[Animation] = js.native
    def getAnimations(options: GetAnimationsOptions): js.Array[Animation] = js.native
    
    /** Returns element's first attribute whose qualified name is qualifiedName, and null if there is no such attribute otherwise. */
    /* standard dom */
    def getAttribute(qualifiedName: String): String | Null = js.native
    
    /** Returns element's attribute whose namespace is namespace and local name is localName, and null if there is no such attribute otherwise. */
    /* standard dom */
    def getAttributeNS(namespace: String, localName: String): String | Null = js.native
    def getAttributeNS(namespace: Null, localName: String): String | Null = js.native
    
    /** Returns the qualified names of all element's attributes. Can contain duplicates. */
    /* standard dom */
    def getAttributeNames(): js.Array[String] = js.native
    
    /* standard dom */
    def getAttributeNode(qualifiedName: String): Attr | Null = js.native
    
    /* standard dom */
    def getAttributeNodeNS(namespace: String, localName: String): Attr | Null = js.native
    def getAttributeNodeNS(namespace: Null, localName: String): Attr | Null = js.native
    
    /* standard dom */
    def getBoundingClientRect(): DOMRect = js.native
    
    /* standard dom */
    def getClientRects(): DOMRectList = js.native
    
    /** Returns a HTMLCollection of the elements in the object on which the method was invoked (a document or an element) that have all the classes given by classNames. The classNames argument is interpreted as a space-separated list of classes. */
    /* standard dom */
    def getElementsByClassName(classNames: String): HTMLCollectionOf[Element] = js.native
    
    /* standard dom */
    def getElementsByTagName(qualifiedName: String): HTMLCollectionOf[Element] = js.native
    
    /* standard dom */
    def getElementsByTagNameNS(namespace: String, localName: String): HTMLCollectionOf[Element] = js.native
    def getElementsByTagNameNS(namespace: Null, localName: String): HTMLCollectionOf[Element] = js.native
    /* standard dom */
    @JSName("getElementsByTagNameNS")
    def getElementsByTagNameNS_httpwwww3org1999xhtml(namespaceURI: httpColonSlashSlashwwwDotw3DotorgSlash1999Slashxhtml, localName: String): HTMLCollectionOf[HTMLElement] = js.native
    /* standard dom */
    @JSName("getElementsByTagNameNS")
    def getElementsByTagNameNS_httpwwww3org2000svg(namespaceURI: httpColonSlashSlashwwwDotw3DotorgSlash2000Slashsvg, localName: String): HTMLCollectionOf[SVGElement] = js.native
    
    /* standard dom */
    @JSName("getElementsByTagName")
    def getElementsByTagName_a(qualifiedName: a): HTMLCollectionOf[HTMLAnchorElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_abbr(qualifiedName: abbr): HTMLCollectionOf[HTMLElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_address(qualifiedName: address): HTMLCollectionOf[HTMLElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_animate(qualifiedName: animate): HTMLCollectionOf[SVGAnimateElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_animateMotion(qualifiedName: animateMotion): HTMLCollectionOf[SVGAnimateMotionElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_animateTransform(qualifiedName: animateTransform): HTMLCollectionOf[SVGAnimateTransformElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_area(qualifiedName: area): HTMLCollectionOf[HTMLAreaElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_article(qualifiedName: article): HTMLCollectionOf[HTMLElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_aside(qualifiedName: aside): HTMLCollectionOf[HTMLElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_audio(qualifiedName: audio): HTMLCollectionOf[HTMLAudioElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_b(qualifiedName: b_): HTMLCollectionOf[HTMLElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_base(qualifiedName: base): HTMLCollectionOf[HTMLBaseElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_bdi(qualifiedName: bdi): HTMLCollectionOf[HTMLElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_bdo(qualifiedName: bdo): HTMLCollectionOf[HTMLElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_blockquote(qualifiedName: blockquote): HTMLCollectionOf[HTMLQuoteElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_body(qualifiedName: body): HTMLCollectionOf[HTMLBodyElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_br(qualifiedName: br): HTMLCollectionOf[HTMLBRElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_button(qualifiedName: button): HTMLCollectionOf[HTMLButtonElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_canvas(qualifiedName: canvas): HTMLCollectionOf[HTMLCanvasElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_caption(qualifiedName: caption): HTMLCollectionOf[HTMLTableCaptionElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_circle(qualifiedName: circle): HTMLCollectionOf[SVGCircleElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_cite(qualifiedName: cite): HTMLCollectionOf[HTMLElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_clipPath(qualifiedName: clipPath): HTMLCollectionOf[SVGClipPathElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_code(qualifiedName: code): HTMLCollectionOf[HTMLElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_col(qualifiedName: col): HTMLCollectionOf[HTMLTableColElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_colgroup(qualifiedName: colgroup): HTMLCollectionOf[HTMLTableColElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_data(qualifiedName: data): HTMLCollectionOf[HTMLDataElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_datalist(qualifiedName: datalist): HTMLCollectionOf[HTMLDataListElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_dd(qualifiedName: dd): HTMLCollectionOf[HTMLElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_defs(qualifiedName: defs): HTMLCollectionOf[SVGDefsElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_del(qualifiedName: del): HTMLCollectionOf[HTMLModElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_desc(qualifiedName: desc): HTMLCollectionOf[SVGDescElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_details(qualifiedName: details): HTMLCollectionOf[HTMLDetailsElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_dfn(qualifiedName: dfn): HTMLCollectionOf[HTMLElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_dialog(qualifiedName: dialog): HTMLCollectionOf[HTMLDialogElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_div(qualifiedName: div): HTMLCollectionOf[HTMLDivElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_dl(qualifiedName: dl): HTMLCollectionOf[HTMLDListElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_dt(qualifiedName: dt): HTMLCollectionOf[HTMLElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_ellipse(qualifiedName: ellipse): HTMLCollectionOf[SVGEllipseElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_em(qualifiedName: em): HTMLCollectionOf[HTMLElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_embed(qualifiedName: embed): HTMLCollectionOf[HTMLEmbedElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_feBlend(qualifiedName: feBlend): HTMLCollectionOf[SVGFEBlendElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_feColorMatrix(qualifiedName: feColorMatrix): HTMLCollectionOf[SVGFEColorMatrixElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_feComponentTransfer(qualifiedName: feComponentTransfer): HTMLCollectionOf[SVGFEComponentTransferElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_feComposite(qualifiedName: feComposite): HTMLCollectionOf[SVGFECompositeElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_feConvolveMatrix(qualifiedName: feConvolveMatrix): HTMLCollectionOf[SVGFEConvolveMatrixElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_feDiffuseLighting(qualifiedName: feDiffuseLighting): HTMLCollectionOf[SVGFEDiffuseLightingElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_feDisplacementMap(qualifiedName: feDisplacementMap): HTMLCollectionOf[SVGFEDisplacementMapElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_feDistantLight(qualifiedName: feDistantLight): HTMLCollectionOf[SVGFEDistantLightElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_feDropShadow(qualifiedName: feDropShadow): HTMLCollectionOf[SVGFEDropShadowElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_feFlood(qualifiedName: feFlood): HTMLCollectionOf[SVGFEFloodElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_feFuncA(qualifiedName: feFuncA): HTMLCollectionOf[SVGFEFuncAElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_feFuncB(qualifiedName: feFuncB): HTMLCollectionOf[SVGFEFuncBElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_feFuncG(qualifiedName: feFuncG): HTMLCollectionOf[SVGFEFuncGElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_feFuncR(qualifiedName: feFuncR): HTMLCollectionOf[SVGFEFuncRElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_feGaussianBlur(qualifiedName: feGaussianBlur): HTMLCollectionOf[SVGFEGaussianBlurElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_feImage(qualifiedName: feImage): HTMLCollectionOf[SVGFEImageElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_feMerge(qualifiedName: feMerge): HTMLCollectionOf[SVGFEMergeElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_feMergeNode(qualifiedName: feMergeNode): HTMLCollectionOf[SVGFEMergeNodeElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_feMorphology(qualifiedName: feMorphology): HTMLCollectionOf[SVGFEMorphologyElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_feOffset(qualifiedName: feOffset): HTMLCollectionOf[SVGFEOffsetElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_fePointLight(qualifiedName: fePointLight): HTMLCollectionOf[SVGFEPointLightElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_feSpecularLighting(qualifiedName: feSpecularLighting): HTMLCollectionOf[SVGFESpecularLightingElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_feSpotLight(qualifiedName: feSpotLight): HTMLCollectionOf[SVGFESpotLightElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_feTile(qualifiedName: feTile): HTMLCollectionOf[SVGFETileElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_feTurbulence(qualifiedName: feTurbulence): HTMLCollectionOf[SVGFETurbulenceElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_fieldset(qualifiedName: fieldset): HTMLCollectionOf[HTMLFieldSetElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_figcaption(qualifiedName: figcaption): HTMLCollectionOf[HTMLElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_figure(qualifiedName: figure): HTMLCollectionOf[HTMLElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_filter(qualifiedName: filter): HTMLCollectionOf[SVGFilterElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_footer(qualifiedName: footer): HTMLCollectionOf[HTMLElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_foreignObject(qualifiedName: foreignObject): HTMLCollectionOf[SVGForeignObjectElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_form(qualifiedName: form): HTMLCollectionOf[HTMLFormElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_g(qualifiedName: g): HTMLCollectionOf[SVGGElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_h1(qualifiedName: h1): HTMLCollectionOf[HTMLHeadingElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_h2(qualifiedName: h2): HTMLCollectionOf[HTMLHeadingElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_h3(qualifiedName: h3): HTMLCollectionOf[HTMLHeadingElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_h4(qualifiedName: h4): HTMLCollectionOf[HTMLHeadingElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_h5(qualifiedName: h5): HTMLCollectionOf[HTMLHeadingElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_h6(qualifiedName: h6): HTMLCollectionOf[HTMLHeadingElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_head(qualifiedName: head): HTMLCollectionOf[HTMLHeadElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_header(qualifiedName: header): HTMLCollectionOf[HTMLElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_hgroup(qualifiedName: hgroup): HTMLCollectionOf[HTMLElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_hr(qualifiedName: hr): HTMLCollectionOf[HTMLHRElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_html(qualifiedName: html): HTMLCollectionOf[HTMLHtmlElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_i(qualifiedName: i): HTMLCollectionOf[HTMLElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_iframe(qualifiedName: iframe): HTMLCollectionOf[HTMLIFrameElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_image(qualifiedName: image): HTMLCollectionOf[SVGImageElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_img(qualifiedName: img): HTMLCollectionOf[HTMLImageElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_input(qualifiedName: input): HTMLCollectionOf[HTMLInputElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_ins(qualifiedName: ins): HTMLCollectionOf[HTMLModElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_kbd(qualifiedName: kbd): HTMLCollectionOf[HTMLElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_label(qualifiedName: label): HTMLCollectionOf[HTMLLabelElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_legend(qualifiedName: legend): HTMLCollectionOf[HTMLLegendElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_li(qualifiedName: li): HTMLCollectionOf[HTMLLIElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_line(qualifiedName: line): HTMLCollectionOf[SVGLineElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_linearGradient(qualifiedName: linearGradient): HTMLCollectionOf[SVGLinearGradientElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_link(qualifiedName: link): HTMLCollectionOf[HTMLLinkElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_main(qualifiedName: main): HTMLCollectionOf[HTMLElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_map(qualifiedName: map): HTMLCollectionOf[HTMLMapElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_mark(qualifiedName: mark): HTMLCollectionOf[HTMLElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_marker(qualifiedName: marker): HTMLCollectionOf[SVGMarkerElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_mask(qualifiedName: mask): HTMLCollectionOf[SVGMaskElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_menu(qualifiedName: menu): HTMLCollectionOf[HTMLMenuElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_meta(qualifiedName: meta): HTMLCollectionOf[HTMLMetaElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_metadata(qualifiedName: metadata): HTMLCollectionOf[SVGMetadataElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_meter(qualifiedName: meter): HTMLCollectionOf[HTMLMeterElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_mpath(qualifiedName: mpath): HTMLCollectionOf[SVGMPathElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_nav(qualifiedName: nav): HTMLCollectionOf[HTMLElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_noscript(qualifiedName: noscript): HTMLCollectionOf[HTMLElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_object(qualifiedName: `object`): HTMLCollectionOf[HTMLObjectElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_ol(qualifiedName: ol): HTMLCollectionOf[HTMLOListElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_optgroup(qualifiedName: optgroup): HTMLCollectionOf[HTMLOptGroupElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_option(qualifiedName: option): HTMLCollectionOf[HTMLOptionElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_output(qualifiedName: output): HTMLCollectionOf[HTMLOutputElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_p(qualifiedName: p_): HTMLCollectionOf[HTMLParagraphElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_path(qualifiedName: path): HTMLCollectionOf[SVGPathElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_pattern(qualifiedName: pattern): HTMLCollectionOf[SVGPatternElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_picture(qualifiedName: picture): HTMLCollectionOf[HTMLPictureElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_polygon(qualifiedName: polygon): HTMLCollectionOf[SVGPolygonElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_polyline(qualifiedName: polyline): HTMLCollectionOf[SVGPolylineElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_pre(qualifiedName: pre): HTMLCollectionOf[HTMLPreElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_progress(qualifiedName: progress): HTMLCollectionOf[HTMLProgressElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_q(qualifiedName: q): HTMLCollectionOf[HTMLQuoteElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_radialGradient(qualifiedName: radialGradient): HTMLCollectionOf[SVGRadialGradientElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_rect(qualifiedName: rect): HTMLCollectionOf[SVGRectElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_rp(qualifiedName: rp): HTMLCollectionOf[HTMLElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_rt(qualifiedName: rt): HTMLCollectionOf[HTMLElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_ruby(qualifiedName: ruby): HTMLCollectionOf[HTMLElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_s(qualifiedName: s): HTMLCollectionOf[HTMLElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_samp(qualifiedName: samp): HTMLCollectionOf[HTMLElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_script(qualifiedName: script): HTMLCollectionOf[HTMLScriptElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_section(qualifiedName: section): HTMLCollectionOf[HTMLElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_select(qualifiedName: select): HTMLCollectionOf[HTMLSelectElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_set(qualifiedName: set): HTMLCollectionOf[SVGSetElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_slot(qualifiedName: slot): HTMLCollectionOf[HTMLSlotElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_small(qualifiedName: small): HTMLCollectionOf[HTMLElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_source(qualifiedName: source): HTMLCollectionOf[HTMLSourceElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_span(qualifiedName: span): HTMLCollectionOf[HTMLSpanElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_stop(qualifiedName: stop): HTMLCollectionOf[SVGStopElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_strong(qualifiedName: strong): HTMLCollectionOf[HTMLElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_style(qualifiedName: style): HTMLCollectionOf[HTMLStyleElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_sub(qualifiedName: sub): HTMLCollectionOf[HTMLElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_summary(qualifiedName: summary): HTMLCollectionOf[HTMLElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_sup(qualifiedName: sup): HTMLCollectionOf[HTMLElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_svg(qualifiedName: svg): HTMLCollectionOf[SVGSVGElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_switch(qualifiedName: switch): HTMLCollectionOf[SVGSwitchElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_symbol(qualifiedName: symbol): HTMLCollectionOf[SVGSymbolElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_table(qualifiedName: table): HTMLCollectionOf[HTMLTableElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_tbody(qualifiedName: tbody): HTMLCollectionOf[HTMLTableSectionElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_td(qualifiedName: td): HTMLCollectionOf[HTMLTableCellElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_template(qualifiedName: template): HTMLCollectionOf[HTMLTemplateElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_text(qualifiedName: text): HTMLCollectionOf[SVGTextElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_textPath(qualifiedName: textPath): HTMLCollectionOf[SVGTextPathElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_textarea(qualifiedName: textarea): HTMLCollectionOf[HTMLTextAreaElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_tfoot(qualifiedName: tfoot): HTMLCollectionOf[HTMLTableSectionElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_th(qualifiedName: th): HTMLCollectionOf[HTMLTableCellElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_thead(qualifiedName: thead): HTMLCollectionOf[HTMLTableSectionElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_time(qualifiedName: time): HTMLCollectionOf[HTMLTimeElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_title(qualifiedName: title): HTMLCollectionOf[HTMLTitleElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_tr(qualifiedName: tr): HTMLCollectionOf[HTMLTableRowElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_track(qualifiedName: track): HTMLCollectionOf[HTMLTrackElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_tspan(qualifiedName: tspan): HTMLCollectionOf[SVGTSpanElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_u(qualifiedName: u): HTMLCollectionOf[HTMLElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_ul(qualifiedName: ul): HTMLCollectionOf[HTMLUListElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_use(qualifiedName: use): HTMLCollectionOf[SVGUseElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_var(qualifiedName: `var`): HTMLCollectionOf[HTMLElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_video(qualifiedName: video): HTMLCollectionOf[HTMLVideoElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_view(qualifiedName: view): HTMLCollectionOf[SVGViewElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_wbr(qualifiedName: wbr): HTMLCollectionOf[HTMLElement] = js.native
    
    /** Returns node's root. */
    /* standard dom */
    def getRootNode(): Node = js.native
    def getRootNode(options: GetRootNodeOptions): Node = js.native
    
    /** Returns true if element has an attribute whose qualified name is qualifiedName, and false otherwise. */
    /* standard dom */
    def hasAttribute(qualifiedName: String): Boolean = js.native
    
    /** Returns true if element has an attribute whose namespace is namespace and local name is localName. */
    /* standard dom */
    def hasAttributeNS(namespace: String, localName: String): Boolean = js.native
    def hasAttributeNS(namespace: Null, localName: String): Boolean = js.native
    
    /** Returns true if element has attributes, and false otherwise. */
    /* standard dom */
    def hasAttributes(): Boolean = js.native
    
    /** Returns whether node has children. */
    /* standard dom */
    def hasChildNodes(): Boolean = js.native
    
    /* standard dom */
    def hasPointerCapture(pointerId: Double): Boolean = js.native
    
    /** Returns the value of element's id content attribute. Can be set to change it. */
    /* standard dom */
    var id: String = js.native
    
    /* standard dom */
    var innerHTML: String = js.native
    
    /* standard dom */
    def insertAdjacentElement(where: InsertPosition, element: Element): Element | Null = js.native
    
    /* standard dom */
    def insertAdjacentHTML(position: InsertPosition, text: String): Unit = js.native
    
    /* standard dom */
    def insertAdjacentText(where: InsertPosition, data: String): Unit = js.native
    
    /* standard dom */
    def insertBefore[T /* <: Node */](node: T): T = js.native
    def insertBefore[T /* <: Node */](node: T, child: Node): T = js.native
    
    /** Returns true if node is connected and false otherwise. */
    /* standard dom */
    val isConnected: Boolean = js.native
    
    /* standard dom */
    def isDefaultNamespace(): Boolean = js.native
    def isDefaultNamespace(namespace: String): Boolean = js.native
    
    /** Returns whether node and otherNode have the same properties. */
    /* standard dom */
    def isEqualNode(): Boolean = js.native
    def isEqualNode(otherNode: Node): Boolean = js.native
    
    /* standard dom */
    def isSameNode(): Boolean = js.native
    def isSameNode(otherNode: Node): Boolean = js.native
    
    /** Returns the last child. */
    /* standard dom */
    val lastChild: ChildNode | Null = js.native
    
    /** Returns the last child that is an element, and null otherwise. */
    /* standard dom */
    val lastElementChild: Element | Null = js.native
    
    /** Returns the local name. */
    /* standard dom */
    val localName: String = js.native
    
    /* standard dom */
    def lookupNamespaceURI(): String | Null = js.native
    def lookupNamespaceURI(prefix: String): String | Null = js.native
    
    /* standard dom */
    def lookupPrefix(): String | Null = js.native
    def lookupPrefix(namespace: String): String | Null = js.native
    
    /** Returns true if matching selectors against element's root yields element, and false otherwise. */
    /* standard dom */
    def matches(selectors: String): Boolean = js.native
    
    /** Returns the namespace. */
    /* standard dom */
    val namespaceURI: String | Null = js.native
    
    /** Returns the first following sibling that is an element, and null otherwise. */
    /* standard dom */
    val nextElementSibling: Element | Null = js.native
    
    /** Returns the next sibling. */
    /* standard dom */
    val nextSibling: ChildNode | Null = js.native
    
    /** Returns a string appropriate for the type of node. */
    /* standard dom */
    val nodeName: String = js.native
    
    /** Returns the type of node. */
    /* standard dom */
    val nodeType: Double = js.native
    
    /* standard dom */
    var nodeValue: String | Null = js.native
    
    /** Removes empty exclusive Text nodes and concatenates the data of remaining contiguous exclusive Text nodes into the first of their nodes. */
    /* standard dom */
    def normalize(): Unit = js.native
    
    /* standard dom */
    var onfullscreenchange: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null = js.native
    
    /* standard dom */
    var onfullscreenerror: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null = js.native
    
    /* standard dom */
    var outerHTML: String = js.native
    
    /* standard dom */
    val ownerDocument: Document = js.native
    
    /** Returns the parent element. */
    /* standard dom */
    val parentElement: HTMLElement | Null = js.native
    
    /** Returns the parent. */
    /* standard dom */
    val parentNode: ParentNode | Null = js.native
    
    /* standard dom */
    val part: DOMTokenList = js.native
    
    /** Returns the namespace prefix. */
    /* standard dom */
    val prefix: String | Null = js.native
    
    /**
      * Inserts nodes before the first child of node, while replacing strings in nodes with equivalent Text nodes.
      *
      * Throws a "HierarchyRequestError" DOMException if the constraints of the node tree are violated.
      */
    /* standard dom */
    def prepend(nodes: (Node | String)*): Unit = js.native
    
    /** Returns the first preceding sibling that is an element, and null otherwise. */
    /* standard dom */
    val previousElementSibling: Element | Null = js.native
    
    /** Returns the previous sibling. */
    /* standard dom */
    val previousSibling: ChildNode | Null = js.native
    
    /* standard dom */
    def querySelector[E /* <: Element */](selectors: String): E | Null = js.native
    
    /* standard dom */
    def querySelectorAll[E /* <: Element */](selectors: String): NodeList[E & Node] = js.native
    /** Returns all element descendants of node that match selectors. */
    /* standard dom */
    @JSName("querySelectorAll")
    def querySelectorAll_a(selectors: a): NodeList[HTMLAnchorElement & Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_abbr(selectors: abbr): NodeList[HTMLElement & Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_address(selectors: address): NodeList[HTMLElement & Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_animate(selectors: animate): NodeList[SVGAnimateElement & Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_animateMotion(selectors: animateMotion): NodeList[SVGAnimateMotionElement & Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_animateTransform(selectors: animateTransform): NodeList[SVGAnimateTransformElement & Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_area(selectors: area): NodeList[HTMLAreaElement & Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_article(selectors: article): NodeList[HTMLElement & Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_aside(selectors: aside): NodeList[HTMLElement & Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_audio(selectors: audio): NodeList[HTMLAudioElement & Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_b(selectors: b_): NodeList[HTMLElement & Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_base(selectors: base): NodeList[HTMLBaseElement & Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_bdi(selectors: bdi): NodeList[HTMLElement & Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_bdo(selectors: bdo): NodeList[HTMLElement & Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_blockquote(selectors: blockquote): NodeList[HTMLQuoteElement & Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_body(selectors: body): NodeList[HTMLBodyElement & Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_br(selectors: br): NodeList[HTMLBRElement & Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_button(selectors: button): NodeList[HTMLButtonElement & Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_canvas(selectors: canvas): NodeList[HTMLCanvasElement & Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_caption(selectors: caption): NodeList[HTMLTableCaptionElement & Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_circle(selectors: circle): NodeList[SVGCircleElement & Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_cite(selectors: cite): NodeList[HTMLElement & Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_clipPath(selectors: clipPath): NodeList[SVGClipPathElement & Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_code(selectors: code): NodeList[HTMLElement & Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_col(selectors: col): NodeList[HTMLTableColElement & Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_colgroup(selectors: colgroup): NodeList[HTMLTableColElement & Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_data(selectors: data): NodeList[HTMLDataElement & Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_datalist(selectors: datalist): NodeList[HTMLDataListElement & Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_dd(selectors: dd): NodeList[HTMLElement & Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_defs(selectors: defs): NodeList[SVGDefsElement & Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_del(selectors: del): NodeList[HTMLModElement & Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_desc(selectors: desc): NodeList[SVGDescElement & Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_details(selectors: details): NodeList[HTMLDetailsElement & Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_dfn(selectors: dfn): NodeList[HTMLElement & Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_dialog(selectors: dialog): NodeList[HTMLDialogElement & Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_div(selectors: div): NodeList[HTMLDivElement & Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_dl(selectors: dl): NodeList[HTMLDListElement & Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_dt(selectors: dt): NodeList[HTMLElement & Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_ellipse(selectors: ellipse): NodeList[SVGEllipseElement & Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_em(selectors: em): NodeList[HTMLElement & Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_embed(selectors: embed): NodeList[HTMLEmbedElement & Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_feBlend(selectors: feBlend): NodeList[SVGFEBlendElement & Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_feColorMatrix(selectors: feColorMatrix): NodeList[SVGFEColorMatrixElement & Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_feComponentTransfer(selectors: feComponentTransfer): NodeList[SVGFEComponentTransferElement & Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_feComposite(selectors: feComposite): NodeList[SVGFECompositeElement & Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_feConvolveMatrix(selectors: feConvolveMatrix): NodeList[SVGFEConvolveMatrixElement & Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_feDiffuseLighting(selectors: feDiffuseLighting): NodeList[SVGFEDiffuseLightingElement & Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_feDisplacementMap(selectors: feDisplacementMap): NodeList[SVGFEDisplacementMapElement & Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_feDistantLight(selectors: feDistantLight): NodeList[SVGFEDistantLightElement & Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_feDropShadow(selectors: feDropShadow): NodeList[SVGFEDropShadowElement & Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_feFlood(selectors: feFlood): NodeList[SVGFEFloodElement & Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_feFuncA(selectors: feFuncA): NodeList[SVGFEFuncAElement & Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_feFuncB(selectors: feFuncB): NodeList[SVGFEFuncBElement & Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_feFuncG(selectors: feFuncG): NodeList[SVGFEFuncGElement & Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_feFuncR(selectors: feFuncR): NodeList[SVGFEFuncRElement & Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_feGaussianBlur(selectors: feGaussianBlur): NodeList[SVGFEGaussianBlurElement & Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_feImage(selectors: feImage): NodeList[SVGFEImageElement & Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_feMerge(selectors: feMerge): NodeList[SVGFEMergeElement & Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_feMergeNode(selectors: feMergeNode): NodeList[SVGFEMergeNodeElement & Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_feMorphology(selectors: feMorphology): NodeList[SVGFEMorphologyElement & Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_feOffset(selectors: feOffset): NodeList[SVGFEOffsetElement & Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_fePointLight(selectors: fePointLight): NodeList[SVGFEPointLightElement & Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_feSpecularLighting(selectors: feSpecularLighting): NodeList[SVGFESpecularLightingElement & Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_feSpotLight(selectors: feSpotLight): NodeList[SVGFESpotLightElement & Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_feTile(selectors: feTile): NodeList[SVGFETileElement & Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_feTurbulence(selectors: feTurbulence): NodeList[SVGFETurbulenceElement & Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_fieldset(selectors: fieldset): NodeList[HTMLFieldSetElement & Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_figcaption(selectors: figcaption): NodeList[HTMLElement & Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_figure(selectors: figure): NodeList[HTMLElement & Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_filter(selectors: filter): NodeList[SVGFilterElement & Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_footer(selectors: footer): NodeList[HTMLElement & Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_foreignObject(selectors: foreignObject): NodeList[SVGForeignObjectElement & Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_form(selectors: form): NodeList[HTMLFormElement & Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_g(selectors: g): NodeList[SVGGElement & Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_h1(selectors: h1): NodeList[HTMLHeadingElement & Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_h2(selectors: h2): NodeList[HTMLHeadingElement & Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_h3(selectors: h3): NodeList[HTMLHeadingElement & Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_h4(selectors: h4): NodeList[HTMLHeadingElement & Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_h5(selectors: h5): NodeList[HTMLHeadingElement & Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_h6(selectors: h6): NodeList[HTMLHeadingElement & Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_head(selectors: head): NodeList[HTMLHeadElement & Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_header(selectors: header): NodeList[HTMLElement & Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_hgroup(selectors: hgroup): NodeList[HTMLElement & Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_hr(selectors: hr): NodeList[HTMLHRElement & Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_html(selectors: html): NodeList[HTMLHtmlElement & Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_i(selectors: i): NodeList[HTMLElement & Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_iframe(selectors: iframe): NodeList[HTMLIFrameElement & Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_image(selectors: image): NodeList[SVGImageElement & Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_img(selectors: img): NodeList[HTMLImageElement & Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_input(selectors: input): NodeList[HTMLInputElement & Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_ins(selectors: ins): NodeList[HTMLModElement & Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_kbd(selectors: kbd): NodeList[HTMLElement & Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_label(selectors: label): NodeList[HTMLLabelElement & Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_legend(selectors: legend): NodeList[HTMLLegendElement & Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_li(selectors: li): NodeList[HTMLLIElement & Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_line(selectors: line): NodeList[SVGLineElement & Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_linearGradient(selectors: linearGradient): NodeList[SVGLinearGradientElement & Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_link(selectors: link): NodeList[HTMLLinkElement & Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_main(selectors: main): NodeList[HTMLElement & Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_map(selectors: map): NodeList[HTMLMapElement & Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_mark(selectors: mark): NodeList[HTMLElement & Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_marker(selectors: marker): NodeList[SVGMarkerElement & Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_mask(selectors: mask): NodeList[SVGMaskElement & Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_menu(selectors: menu): NodeList[HTMLMenuElement & Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_meta(selectors: meta): NodeList[HTMLMetaElement & Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_metadata(selectors: metadata): NodeList[SVGMetadataElement & Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_meter(selectors: meter): NodeList[HTMLMeterElement & Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_mpath(selectors: mpath): NodeList[SVGMPathElement & Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_nav(selectors: nav): NodeList[HTMLElement & Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_noscript(selectors: noscript): NodeList[HTMLElement & Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_object(selectors: `object`): NodeList[HTMLObjectElement & Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_ol(selectors: ol): NodeList[HTMLOListElement & Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_optgroup(selectors: optgroup): NodeList[HTMLOptGroupElement & Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_option(selectors: option): NodeList[HTMLOptionElement & Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_output(selectors: output): NodeList[HTMLOutputElement & Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_p(selectors: p_): NodeList[HTMLParagraphElement & Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_path(selectors: path): NodeList[SVGPathElement & Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_pattern(selectors: pattern): NodeList[SVGPatternElement & Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_picture(selectors: picture): NodeList[HTMLPictureElement & Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_polygon(selectors: polygon): NodeList[SVGPolygonElement & Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_polyline(selectors: polyline): NodeList[SVGPolylineElement & Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_pre(selectors: pre): NodeList[HTMLPreElement & Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_progress(selectors: progress): NodeList[HTMLProgressElement & Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_q(selectors: q): NodeList[HTMLQuoteElement & Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_radialGradient(selectors: radialGradient): NodeList[SVGRadialGradientElement & Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_rect(selectors: rect): NodeList[SVGRectElement & Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_rp(selectors: rp): NodeList[HTMLElement & Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_rt(selectors: rt): NodeList[HTMLElement & Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_ruby(selectors: ruby): NodeList[HTMLElement & Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_s(selectors: s): NodeList[HTMLElement & Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_samp(selectors: samp): NodeList[HTMLElement & Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_script(selectors: script): NodeList[HTMLScriptElement & Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_section(selectors: section): NodeList[HTMLElement & Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_select(selectors: select): NodeList[HTMLSelectElement & Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_set(selectors: set): NodeList[SVGSetElement & Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_slot(selectors: slot): NodeList[HTMLSlotElement & Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_small(selectors: small): NodeList[HTMLElement & Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_source(selectors: source): NodeList[HTMLSourceElement & Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_span(selectors: span): NodeList[HTMLSpanElement & Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_stop(selectors: stop): NodeList[SVGStopElement & Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_strong(selectors: strong): NodeList[HTMLElement & Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_style(selectors: style): NodeList[HTMLStyleElement & Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_sub(selectors: sub): NodeList[HTMLElement & Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_summary(selectors: summary): NodeList[HTMLElement & Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_sup(selectors: sup): NodeList[HTMLElement & Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_svg(selectors: svg): NodeList[SVGSVGElement & Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_switch(selectors: switch): NodeList[SVGSwitchElement & Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_symbol(selectors: symbol): NodeList[SVGSymbolElement & Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_table(selectors: table): NodeList[HTMLTableElement & Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_tbody(selectors: tbody): NodeList[HTMLTableSectionElement & Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_td(selectors: td): NodeList[HTMLTableCellElement & Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_template(selectors: template): NodeList[HTMLTemplateElement & Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_text(selectors: text): NodeList[SVGTextElement & Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_textPath(selectors: textPath): NodeList[SVGTextPathElement & Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_textarea(selectors: textarea): NodeList[HTMLTextAreaElement & Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_tfoot(selectors: tfoot): NodeList[HTMLTableSectionElement & Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_th(selectors: th): NodeList[HTMLTableCellElement & Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_thead(selectors: thead): NodeList[HTMLTableSectionElement & Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_time(selectors: time): NodeList[HTMLTimeElement & Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_title(selectors: title): NodeList[HTMLTitleElement & Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_tr(selectors: tr): NodeList[HTMLTableRowElement & Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_track(selectors: track): NodeList[HTMLTrackElement & Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_tspan(selectors: tspan): NodeList[SVGTSpanElement & Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_u(selectors: u): NodeList[HTMLElement & Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_ul(selectors: ul): NodeList[HTMLUListElement & Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_use(selectors: use): NodeList[SVGUseElement & Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_var(selectors: `var`): NodeList[HTMLElement & Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_video(selectors: video): NodeList[HTMLVideoElement & Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_view(selectors: view): NodeList[SVGViewElement & Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_wbr(selectors: wbr): NodeList[HTMLElement & Node] = js.native
    
    /** Returns the first element that is a descendant of node that matches selectors. */
    /* standard dom */
    @JSName("querySelector")
    def querySelector_a(selectors: a): HTMLAnchorElement | Null = js.native
    @JSName("querySelector")
    def querySelector_abbr(selectors: abbr): HTMLElement | Null = js.native
    @JSName("querySelector")
    def querySelector_address(selectors: address): HTMLElement | Null = js.native
    @JSName("querySelector")
    def querySelector_animate(selectors: animate): SVGAnimateElement | Null = js.native
    @JSName("querySelector")
    def querySelector_animateMotion(selectors: animateMotion): SVGAnimateMotionElement | Null = js.native
    @JSName("querySelector")
    def querySelector_animateTransform(selectors: animateTransform): SVGAnimateTransformElement | Null = js.native
    @JSName("querySelector")
    def querySelector_area(selectors: area): HTMLAreaElement | Null = js.native
    @JSName("querySelector")
    def querySelector_article(selectors: article): HTMLElement | Null = js.native
    @JSName("querySelector")
    def querySelector_aside(selectors: aside): HTMLElement | Null = js.native
    @JSName("querySelector")
    def querySelector_audio(selectors: audio): HTMLAudioElement | Null = js.native
    @JSName("querySelector")
    def querySelector_b(selectors: b_): HTMLElement | Null = js.native
    @JSName("querySelector")
    def querySelector_base(selectors: base): HTMLBaseElement | Null = js.native
    @JSName("querySelector")
    def querySelector_bdi(selectors: bdi): HTMLElement | Null = js.native
    @JSName("querySelector")
    def querySelector_bdo(selectors: bdo): HTMLElement | Null = js.native
    @JSName("querySelector")
    def querySelector_blockquote(selectors: blockquote): HTMLQuoteElement | Null = js.native
    @JSName("querySelector")
    def querySelector_body(selectors: body): HTMLBodyElement | Null = js.native
    @JSName("querySelector")
    def querySelector_br(selectors: br): HTMLBRElement | Null = js.native
    @JSName("querySelector")
    def querySelector_button(selectors: button): HTMLButtonElement | Null = js.native
    @JSName("querySelector")
    def querySelector_canvas(selectors: canvas): HTMLCanvasElement | Null = js.native
    @JSName("querySelector")
    def querySelector_caption(selectors: caption): HTMLTableCaptionElement | Null = js.native
    @JSName("querySelector")
    def querySelector_circle(selectors: circle): SVGCircleElement | Null = js.native
    @JSName("querySelector")
    def querySelector_cite(selectors: cite): HTMLElement | Null = js.native
    @JSName("querySelector")
    def querySelector_clipPath(selectors: clipPath): SVGClipPathElement | Null = js.native
    @JSName("querySelector")
    def querySelector_code(selectors: code): HTMLElement | Null = js.native
    @JSName("querySelector")
    def querySelector_col(selectors: col): HTMLTableColElement | Null = js.native
    @JSName("querySelector")
    def querySelector_colgroup(selectors: colgroup): HTMLTableColElement | Null = js.native
    @JSName("querySelector")
    def querySelector_data(selectors: data): HTMLDataElement | Null = js.native
    @JSName("querySelector")
    def querySelector_datalist(selectors: datalist): HTMLDataListElement | Null = js.native
    @JSName("querySelector")
    def querySelector_dd(selectors: dd): HTMLElement | Null = js.native
    @JSName("querySelector")
    def querySelector_defs(selectors: defs): SVGDefsElement | Null = js.native
    @JSName("querySelector")
    def querySelector_del(selectors: del): HTMLModElement | Null = js.native
    @JSName("querySelector")
    def querySelector_desc(selectors: desc): SVGDescElement | Null = js.native
    @JSName("querySelector")
    def querySelector_details(selectors: details): HTMLDetailsElement | Null = js.native
    @JSName("querySelector")
    def querySelector_dfn(selectors: dfn): HTMLElement | Null = js.native
    @JSName("querySelector")
    def querySelector_dialog(selectors: dialog): HTMLDialogElement | Null = js.native
    @JSName("querySelector")
    def querySelector_div(selectors: div): HTMLDivElement | Null = js.native
    @JSName("querySelector")
    def querySelector_dl(selectors: dl): HTMLDListElement | Null = js.native
    @JSName("querySelector")
    def querySelector_dt(selectors: dt): HTMLElement | Null = js.native
    @JSName("querySelector")
    def querySelector_ellipse(selectors: ellipse): SVGEllipseElement | Null = js.native
    @JSName("querySelector")
    def querySelector_em(selectors: em): HTMLElement | Null = js.native
    @JSName("querySelector")
    def querySelector_embed(selectors: embed): HTMLEmbedElement | Null = js.native
    @JSName("querySelector")
    def querySelector_feBlend(selectors: feBlend): SVGFEBlendElement | Null = js.native
    @JSName("querySelector")
    def querySelector_feColorMatrix(selectors: feColorMatrix): SVGFEColorMatrixElement | Null = js.native
    @JSName("querySelector")
    def querySelector_feComponentTransfer(selectors: feComponentTransfer): SVGFEComponentTransferElement | Null = js.native
    @JSName("querySelector")
    def querySelector_feComposite(selectors: feComposite): SVGFECompositeElement | Null = js.native
    @JSName("querySelector")
    def querySelector_feConvolveMatrix(selectors: feConvolveMatrix): SVGFEConvolveMatrixElement | Null = js.native
    @JSName("querySelector")
    def querySelector_feDiffuseLighting(selectors: feDiffuseLighting): SVGFEDiffuseLightingElement | Null = js.native
    @JSName("querySelector")
    def querySelector_feDisplacementMap(selectors: feDisplacementMap): SVGFEDisplacementMapElement | Null = js.native
    @JSName("querySelector")
    def querySelector_feDistantLight(selectors: feDistantLight): SVGFEDistantLightElement | Null = js.native
    @JSName("querySelector")
    def querySelector_feDropShadow(selectors: feDropShadow): SVGFEDropShadowElement | Null = js.native
    @JSName("querySelector")
    def querySelector_feFlood(selectors: feFlood): SVGFEFloodElement | Null = js.native
    @JSName("querySelector")
    def querySelector_feFuncA(selectors: feFuncA): SVGFEFuncAElement | Null = js.native
    @JSName("querySelector")
    def querySelector_feFuncB(selectors: feFuncB): SVGFEFuncBElement | Null = js.native
    @JSName("querySelector")
    def querySelector_feFuncG(selectors: feFuncG): SVGFEFuncGElement | Null = js.native
    @JSName("querySelector")
    def querySelector_feFuncR(selectors: feFuncR): SVGFEFuncRElement | Null = js.native
    @JSName("querySelector")
    def querySelector_feGaussianBlur(selectors: feGaussianBlur): SVGFEGaussianBlurElement | Null = js.native
    @JSName("querySelector")
    def querySelector_feImage(selectors: feImage): SVGFEImageElement | Null = js.native
    @JSName("querySelector")
    def querySelector_feMerge(selectors: feMerge): SVGFEMergeElement | Null = js.native
    @JSName("querySelector")
    def querySelector_feMergeNode(selectors: feMergeNode): SVGFEMergeNodeElement | Null = js.native
    @JSName("querySelector")
    def querySelector_feMorphology(selectors: feMorphology): SVGFEMorphologyElement | Null = js.native
    @JSName("querySelector")
    def querySelector_feOffset(selectors: feOffset): SVGFEOffsetElement | Null = js.native
    @JSName("querySelector")
    def querySelector_fePointLight(selectors: fePointLight): SVGFEPointLightElement | Null = js.native
    @JSName("querySelector")
    def querySelector_feSpecularLighting(selectors: feSpecularLighting): SVGFESpecularLightingElement | Null = js.native
    @JSName("querySelector")
    def querySelector_feSpotLight(selectors: feSpotLight): SVGFESpotLightElement | Null = js.native
    @JSName("querySelector")
    def querySelector_feTile(selectors: feTile): SVGFETileElement | Null = js.native
    @JSName("querySelector")
    def querySelector_feTurbulence(selectors: feTurbulence): SVGFETurbulenceElement | Null = js.native
    @JSName("querySelector")
    def querySelector_fieldset(selectors: fieldset): HTMLFieldSetElement | Null = js.native
    @JSName("querySelector")
    def querySelector_figcaption(selectors: figcaption): HTMLElement | Null = js.native
    @JSName("querySelector")
    def querySelector_figure(selectors: figure): HTMLElement | Null = js.native
    @JSName("querySelector")
    def querySelector_filter(selectors: filter): SVGFilterElement | Null = js.native
    @JSName("querySelector")
    def querySelector_footer(selectors: footer): HTMLElement | Null = js.native
    @JSName("querySelector")
    def querySelector_foreignObject(selectors: foreignObject): SVGForeignObjectElement | Null = js.native
    @JSName("querySelector")
    def querySelector_form(selectors: form): HTMLFormElement | Null = js.native
    @JSName("querySelector")
    def querySelector_g(selectors: g): SVGGElement | Null = js.native
    @JSName("querySelector")
    def querySelector_h1(selectors: h1): HTMLHeadingElement | Null = js.native
    @JSName("querySelector")
    def querySelector_h2(selectors: h2): HTMLHeadingElement | Null = js.native
    @JSName("querySelector")
    def querySelector_h3(selectors: h3): HTMLHeadingElement | Null = js.native
    @JSName("querySelector")
    def querySelector_h4(selectors: h4): HTMLHeadingElement | Null = js.native
    @JSName("querySelector")
    def querySelector_h5(selectors: h5): HTMLHeadingElement | Null = js.native
    @JSName("querySelector")
    def querySelector_h6(selectors: h6): HTMLHeadingElement | Null = js.native
    @JSName("querySelector")
    def querySelector_head(selectors: head): HTMLHeadElement | Null = js.native
    @JSName("querySelector")
    def querySelector_header(selectors: header): HTMLElement | Null = js.native
    @JSName("querySelector")
    def querySelector_hgroup(selectors: hgroup): HTMLElement | Null = js.native
    @JSName("querySelector")
    def querySelector_hr(selectors: hr): HTMLHRElement | Null = js.native
    @JSName("querySelector")
    def querySelector_html(selectors: html): HTMLHtmlElement | Null = js.native
    @JSName("querySelector")
    def querySelector_i(selectors: i): HTMLElement | Null = js.native
    @JSName("querySelector")
    def querySelector_iframe(selectors: iframe): HTMLIFrameElement | Null = js.native
    @JSName("querySelector")
    def querySelector_image(selectors: image): SVGImageElement | Null = js.native
    @JSName("querySelector")
    def querySelector_img(selectors: img): HTMLImageElement | Null = js.native
    @JSName("querySelector")
    def querySelector_input(selectors: input): HTMLInputElement | Null = js.native
    @JSName("querySelector")
    def querySelector_ins(selectors: ins): HTMLModElement | Null = js.native
    @JSName("querySelector")
    def querySelector_kbd(selectors: kbd): HTMLElement | Null = js.native
    @JSName("querySelector")
    def querySelector_label(selectors: label): HTMLLabelElement | Null = js.native
    @JSName("querySelector")
    def querySelector_legend(selectors: legend): HTMLLegendElement | Null = js.native
    @JSName("querySelector")
    def querySelector_li(selectors: li): HTMLLIElement | Null = js.native
    @JSName("querySelector")
    def querySelector_line(selectors: line): SVGLineElement | Null = js.native
    @JSName("querySelector")
    def querySelector_linearGradient(selectors: linearGradient): SVGLinearGradientElement | Null = js.native
    @JSName("querySelector")
    def querySelector_link(selectors: link): HTMLLinkElement | Null = js.native
    @JSName("querySelector")
    def querySelector_main(selectors: main): HTMLElement | Null = js.native
    @JSName("querySelector")
    def querySelector_map(selectors: map): HTMLMapElement | Null = js.native
    @JSName("querySelector")
    def querySelector_mark(selectors: mark): HTMLElement | Null = js.native
    @JSName("querySelector")
    def querySelector_marker(selectors: marker): SVGMarkerElement | Null = js.native
    @JSName("querySelector")
    def querySelector_mask(selectors: mask): SVGMaskElement | Null = js.native
    @JSName("querySelector")
    def querySelector_menu(selectors: menu): HTMLMenuElement | Null = js.native
    @JSName("querySelector")
    def querySelector_meta(selectors: meta): HTMLMetaElement | Null = js.native
    @JSName("querySelector")
    def querySelector_metadata(selectors: metadata): SVGMetadataElement | Null = js.native
    @JSName("querySelector")
    def querySelector_meter(selectors: meter): HTMLMeterElement | Null = js.native
    @JSName("querySelector")
    def querySelector_mpath(selectors: mpath): SVGMPathElement | Null = js.native
    @JSName("querySelector")
    def querySelector_nav(selectors: nav): HTMLElement | Null = js.native
    @JSName("querySelector")
    def querySelector_noscript(selectors: noscript): HTMLElement | Null = js.native
    @JSName("querySelector")
    def querySelector_object(selectors: `object`): HTMLObjectElement | Null = js.native
    @JSName("querySelector")
    def querySelector_ol(selectors: ol): HTMLOListElement | Null = js.native
    @JSName("querySelector")
    def querySelector_optgroup(selectors: optgroup): HTMLOptGroupElement | Null = js.native
    @JSName("querySelector")
    def querySelector_option(selectors: option): HTMLOptionElement | Null = js.native
    @JSName("querySelector")
    def querySelector_output(selectors: output): HTMLOutputElement | Null = js.native
    @JSName("querySelector")
    def querySelector_p(selectors: p_): HTMLParagraphElement | Null = js.native
    @JSName("querySelector")
    def querySelector_path(selectors: path): SVGPathElement | Null = js.native
    @JSName("querySelector")
    def querySelector_pattern(selectors: pattern): SVGPatternElement | Null = js.native
    @JSName("querySelector")
    def querySelector_picture(selectors: picture): HTMLPictureElement | Null = js.native
    @JSName("querySelector")
    def querySelector_polygon(selectors: polygon): SVGPolygonElement | Null = js.native
    @JSName("querySelector")
    def querySelector_polyline(selectors: polyline): SVGPolylineElement | Null = js.native
    @JSName("querySelector")
    def querySelector_pre(selectors: pre): HTMLPreElement | Null = js.native
    @JSName("querySelector")
    def querySelector_progress(selectors: progress): HTMLProgressElement | Null = js.native
    @JSName("querySelector")
    def querySelector_q(selectors: q): HTMLQuoteElement | Null = js.native
    @JSName("querySelector")
    def querySelector_radialGradient(selectors: radialGradient): SVGRadialGradientElement | Null = js.native
    @JSName("querySelector")
    def querySelector_rect(selectors: rect): SVGRectElement | Null = js.native
    @JSName("querySelector")
    def querySelector_rp(selectors: rp): HTMLElement | Null = js.native
    @JSName("querySelector")
    def querySelector_rt(selectors: rt): HTMLElement | Null = js.native
    @JSName("querySelector")
    def querySelector_ruby(selectors: ruby): HTMLElement | Null = js.native
    @JSName("querySelector")
    def querySelector_s(selectors: s): HTMLElement | Null = js.native
    @JSName("querySelector")
    def querySelector_samp(selectors: samp): HTMLElement | Null = js.native
    @JSName("querySelector")
    def querySelector_script(selectors: script): HTMLScriptElement | Null = js.native
    @JSName("querySelector")
    def querySelector_section(selectors: section): HTMLElement | Null = js.native
    @JSName("querySelector")
    def querySelector_select(selectors: select): HTMLSelectElement | Null = js.native
    @JSName("querySelector")
    def querySelector_set(selectors: set): SVGSetElement | Null = js.native
    @JSName("querySelector")
    def querySelector_slot(selectors: slot): HTMLSlotElement | Null = js.native
    @JSName("querySelector")
    def querySelector_small(selectors: small): HTMLElement | Null = js.native
    @JSName("querySelector")
    def querySelector_source(selectors: source): HTMLSourceElement | Null = js.native
    @JSName("querySelector")
    def querySelector_span(selectors: span): HTMLSpanElement | Null = js.native
    @JSName("querySelector")
    def querySelector_stop(selectors: stop): SVGStopElement | Null = js.native
    @JSName("querySelector")
    def querySelector_strong(selectors: strong): HTMLElement | Null = js.native
    @JSName("querySelector")
    def querySelector_style(selectors: style): HTMLStyleElement | Null = js.native
    @JSName("querySelector")
    def querySelector_sub(selectors: sub): HTMLElement | Null = js.native
    @JSName("querySelector")
    def querySelector_summary(selectors: summary): HTMLElement | Null = js.native
    @JSName("querySelector")
    def querySelector_sup(selectors: sup): HTMLElement | Null = js.native
    @JSName("querySelector")
    def querySelector_svg(selectors: svg): SVGSVGElement | Null = js.native
    @JSName("querySelector")
    def querySelector_switch(selectors: switch): SVGSwitchElement | Null = js.native
    @JSName("querySelector")
    def querySelector_symbol(selectors: symbol): SVGSymbolElement | Null = js.native
    @JSName("querySelector")
    def querySelector_table(selectors: table): HTMLTableElement | Null = js.native
    @JSName("querySelector")
    def querySelector_tbody(selectors: tbody): HTMLTableSectionElement | Null = js.native
    @JSName("querySelector")
    def querySelector_td(selectors: td): HTMLTableCellElement | Null = js.native
    @JSName("querySelector")
    def querySelector_template(selectors: template): HTMLTemplateElement | Null = js.native
    @JSName("querySelector")
    def querySelector_text(selectors: text): SVGTextElement | Null = js.native
    @JSName("querySelector")
    def querySelector_textPath(selectors: textPath): SVGTextPathElement | Null = js.native
    @JSName("querySelector")
    def querySelector_textarea(selectors: textarea): HTMLTextAreaElement | Null = js.native
    @JSName("querySelector")
    def querySelector_tfoot(selectors: tfoot): HTMLTableSectionElement | Null = js.native
    @JSName("querySelector")
    def querySelector_th(selectors: th): HTMLTableCellElement | Null = js.native
    @JSName("querySelector")
    def querySelector_thead(selectors: thead): HTMLTableSectionElement | Null = js.native
    @JSName("querySelector")
    def querySelector_time(selectors: time): HTMLTimeElement | Null = js.native
    @JSName("querySelector")
    def querySelector_title(selectors: title): HTMLTitleElement | Null = js.native
    @JSName("querySelector")
    def querySelector_tr(selectors: tr): HTMLTableRowElement | Null = js.native
    @JSName("querySelector")
    def querySelector_track(selectors: track): HTMLTrackElement | Null = js.native
    @JSName("querySelector")
    def querySelector_tspan(selectors: tspan): SVGTSpanElement | Null = js.native
    @JSName("querySelector")
    def querySelector_u(selectors: u): HTMLElement | Null = js.native
    @JSName("querySelector")
    def querySelector_ul(selectors: ul): HTMLUListElement | Null = js.native
    @JSName("querySelector")
    def querySelector_use(selectors: use): SVGUseElement | Null = js.native
    @JSName("querySelector")
    def querySelector_var(selectors: `var`): HTMLElement | Null = js.native
    @JSName("querySelector")
    def querySelector_video(selectors: video): HTMLVideoElement | Null = js.native
    @JSName("querySelector")
    def querySelector_view(selectors: view): SVGViewElement | Null = js.native
    @JSName("querySelector")
    def querySelector_wbr(selectors: wbr): HTMLElement | Null = js.native
    
    /* standard dom */
    def releasePointerCapture(pointerId: Double): Unit = js.native
    
    /** Removes node. */
    /* standard dom */
    def remove(): Unit = js.native
    
    /** Removes element's first attribute whose qualified name is qualifiedName. */
    /* standard dom */
    def removeAttribute(qualifiedName: String): Unit = js.native
    
    /** Removes element's attribute whose namespace is namespace and local name is localName. */
    /* standard dom */
    def removeAttributeNS(namespace: String, localName: String): Unit = js.native
    def removeAttributeNS(namespace: Null, localName: String): Unit = js.native
    
    /* standard dom */
    def removeAttributeNode(attr: Attr): Attr = js.native
    
    /* standard dom */
    def removeChild[T /* <: Node */](child: T): T = js.native
    
    /** Removes the event listener in target's event listener list with the same type, callback, and options. */
    /* standard dom */
    def removeEventListener(`type`: String): Unit = js.native
    def removeEventListener(`type`: String, callback: Null, options: EventListenerOptions): Unit = js.native
    def removeEventListener(`type`: String, callback: Null, options: Boolean): Unit = js.native
    /* standard dom */
    def removeEventListener(`type`: String, listener: EventListenerOrEventListenerObject): Unit = js.native
    def removeEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: EventListenerOptions): Unit = js.native
    def removeEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
    /* standard dom */
    @JSName("removeEventListener")
    def removeEventListener_fullscreenchange(`type`: fullscreenchange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_fullscreenchange(
      `type`: fullscreenchange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_fullscreenchange(
      `type`: fullscreenchange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_fullscreenerror(`type`: fullscreenerror, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_fullscreenerror(
      `type`: fullscreenerror,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_fullscreenerror(
      `type`: fullscreenerror,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    
    /* standard dom */
    def replaceChild[T /* <: Node */](node: Node, child: T): T = js.native
    
    /**
      * Replace all children of node with nodes, while replacing strings in nodes with equivalent Text nodes.
      *
      * Throws a "HierarchyRequestError" DOMException if the constraints of the node tree are violated.
      */
    /* standard dom */
    def replaceChildren(nodes: (Node | String)*): Unit = js.native
    
    /**
      * Replaces node with nodes, while replacing strings in nodes with equivalent Text nodes.
      *
      * Throws a "HierarchyRequestError" DOMException if the constraints of the node tree are violated.
      */
    /* standard dom */
    def replaceWith(nodes: (Node | String)*): Unit = js.native
    
    /**
      * Displays element fullscreen and resolves promise when done.
      *
      * When supplied, options's navigationUI member indicates whether showing navigation UI while in fullscreen is preferred or not. If set to "show", navigation simplicity is preferred over screen space, and if set to "hide", more screen space is preferred. User agents are always free to honor user preference over the application's. The default value "auto" indicates no application preference.
      */
    /* standard dom */
    def requestFullscreen(): js.Promise[Unit] = js.native
    def requestFullscreen(options: FullscreenOptions): js.Promise[Unit] = js.native
    
    /* standard dom */
    def requestPointerLock(): Unit = js.native
    
    /* standard dom */
    def scroll(): Unit = js.native
    def scroll(options: ScrollToOptions): Unit = js.native
    /* standard dom */
    def scroll(x: Double, y: Double): Unit = js.native
    
    /* standard dom */
    def scrollBy(): Unit = js.native
    def scrollBy(options: ScrollToOptions): Unit = js.native
    /* standard dom */
    def scrollBy(x: Double, y: Double): Unit = js.native
    
    /* standard dom */
    val scrollHeight: Double = js.native
    
    /* standard dom */
    def scrollIntoView(): Unit = js.native
    def scrollIntoView(arg: Boolean): Unit = js.native
    def scrollIntoView(arg: ScrollIntoViewOptions): Unit = js.native
    
    /* standard dom */
    var scrollLeft: Double = js.native
    
    /* standard dom */
    def scrollTo(): Unit = js.native
    def scrollTo(options: ScrollToOptions): Unit = js.native
    /* standard dom */
    def scrollTo(x: Double, y: Double): Unit = js.native
    
    /* standard dom */
    var scrollTop: Double = js.native
    
    /* standard dom */
    val scrollWidth: Double = js.native
    
    /** Sets the value of element's first attribute whose qualified name is qualifiedName to value. */
    /* standard dom */
    def setAttribute(qualifiedName: String, value: String): Unit = js.native
    
    /** Sets the value of element's attribute whose namespace is namespace and local name is localName to value. */
    /* standard dom */
    def setAttributeNS(namespace: String, qualifiedName: String, value: String): Unit = js.native
    def setAttributeNS(namespace: Null, qualifiedName: String, value: String): Unit = js.native
    
    /* standard dom */
    def setAttributeNode(attr: Attr): Attr | Null = js.native
    
    /* standard dom */
    def setAttributeNodeNS(attr: Attr): Attr | Null = js.native
    
    /* standard dom */
    def setPointerCapture(pointerId: Double): Unit = js.native
    
    /** Returns element's shadow root, if any, and if shadow root's mode is "open", and null otherwise. */
    /* standard dom */
    val shadowRoot: ShadowRoot | Null = js.native
    
    /** Returns the value of element's slot content attribute. Can be set to change it. */
    /* standard dom */
    var slot: String = js.native
    
    /** Returns the HTML-uppercased qualified name. */
    /* standard dom */
    val tagName: String = js.native
    
    /* standard dom */
    var textContent: String | Null = js.native
    
    /**
      * If force is not given, "toggles" qualifiedName, removing it if it is present and adding it if it is not present. If force is true, adds qualifiedName. If force is false, removes qualifiedName.
      *
      * Returns true if qualifiedName is now present, and false otherwise.
      */
    /* standard dom */
    def toggleAttribute(qualifiedName: String): Boolean = js.native
    def toggleAttribute(qualifiedName: String, force: Boolean): Boolean = js.native
    
    /** @deprecated This is a legacy alias of `matches`. */
    /* standard dom */
    def webkitMatchesSelector(selectors: String): Boolean = js.native
  }
  
  type VueNode[T /* <: Node */] = T & VueParentComponent
}
