package typingsJapgolly.cookieclicker

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.AnimationEvent
import org.scalajs.dom.Attr
import org.scalajs.dom.AudioContext
import org.scalajs.dom.BiquadFilterNode
import org.scalajs.dom.CSSStyleDeclaration
import org.scalajs.dom.ClipboardEvent
import org.scalajs.dom.CompositionEvent
import org.scalajs.dom.DOMRect
import org.scalajs.dom.DOMTokenList
import org.scalajs.dom.Document
import org.scalajs.dom.DragEvent
import org.scalajs.dom.ErrorEvent
import org.scalajs.dom.Event
import org.scalajs.dom.EventListenerOptions
import org.scalajs.dom.FocusEvent
import org.scalajs.dom.GainNode
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
import org.scalajs.dom.KeyboardEvent
import org.scalajs.dom.MediaStream
import org.scalajs.dom.MouseEvent
import org.scalajs.dom.NamedNodeMap
import org.scalajs.dom.Node
import org.scalajs.dom.NodeList
import org.scalajs.dom.ParentNode
import org.scalajs.dom.PointerEvent
import org.scalajs.dom.ProgressEvent
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
import org.scalajs.dom.TouchEvent
import org.scalajs.dom.TransitionEvent
import org.scalajs.dom.UIEvent
import org.scalajs.dom.WebGLContextAttributes
import org.scalajs.dom.WebGLRenderingContext
import org.scalajs.dom.WheelEvent
import typingsJapgolly.cookieclicker.Game.GardenMinigame
import typingsJapgolly.cookieclicker.Game.GrimoireMinigame
import typingsJapgolly.cookieclicker.Game.MinigameObject
import typingsJapgolly.cookieclicker.Game.PantheonMinigame
import typingsJapgolly.cookieclicker.Game.StocksMinigame
import typingsJapgolly.cookieclicker.________COOKIECLICKER_TYPES_HACK_DOESNT_EXIST.Music.Track
import typingsJapgolly.cookieclicker.________COOKIECLICKER_TYPES_HACK_DOESNT_EXIST.Steam.Mod
import typingsJapgolly.cookieclicker.________COOKIECLICKER_TYPES_HACK_DOESNT_EXIST.Steam.SendCallback
import typingsJapgolly.cookieclicker.cookieclickerInts.`8`
import typingsJapgolly.cookieclicker.cookieclickerStrings.`2d`
import typingsJapgolly.cookieclicker.cookieclickerStrings.`object`
import typingsJapgolly.cookieclicker.cookieclickerStrings.`var`
import typingsJapgolly.cookieclicker.cookieclickerStrings.a
import typingsJapgolly.cookieclicker.cookieclickerStrings.abbr
import typingsJapgolly.cookieclicker.cookieclickerStrings.abort
import typingsJapgolly.cookieclicker.cookieclickerStrings.address
import typingsJapgolly.cookieclicker.cookieclickerStrings.animate
import typingsJapgolly.cookieclicker.cookieclickerStrings.animateMotion
import typingsJapgolly.cookieclicker.cookieclickerStrings.animateTransform
import typingsJapgolly.cookieclicker.cookieclickerStrings.animationcancel
import typingsJapgolly.cookieclicker.cookieclickerStrings.animationend
import typingsJapgolly.cookieclicker.cookieclickerStrings.animationiteration
import typingsJapgolly.cookieclicker.cookieclickerStrings.animationstart
import typingsJapgolly.cookieclicker.cookieclickerStrings.area
import typingsJapgolly.cookieclicker.cookieclickerStrings.article
import typingsJapgolly.cookieclicker.cookieclickerStrings.aside
import typingsJapgolly.cookieclicker.cookieclickerStrings.audio
import typingsJapgolly.cookieclicker.cookieclickerStrings.auxclick
import typingsJapgolly.cookieclicker.cookieclickerStrings.b
import typingsJapgolly.cookieclicker.cookieclickerStrings.base
import typingsJapgolly.cookieclicker.cookieclickerStrings.bdi
import typingsJapgolly.cookieclicker.cookieclickerStrings.bdo
import typingsJapgolly.cookieclicker.cookieclickerStrings.beforeinput
import typingsJapgolly.cookieclicker.cookieclickerStrings.bitmaprenderer
import typingsJapgolly.cookieclicker.cookieclickerStrings.blank
import typingsJapgolly.cookieclicker.cookieclickerStrings.blockquote
import typingsJapgolly.cookieclicker.cookieclickerStrings.blur
import typingsJapgolly.cookieclicker.cookieclickerStrings.body
import typingsJapgolly.cookieclicker.cookieclickerStrings.br
import typingsJapgolly.cookieclicker.cookieclickerStrings.button
import typingsJapgolly.cookieclicker.cookieclickerStrings.canplay
import typingsJapgolly.cookieclicker.cookieclickerStrings.canplaythrough
import typingsJapgolly.cookieclicker.cookieclickerStrings.canvas
import typingsJapgolly.cookieclicker.cookieclickerStrings.caption
import typingsJapgolly.cookieclicker.cookieclickerStrings.change
import typingsJapgolly.cookieclicker.cookieclickerStrings.circle
import typingsJapgolly.cookieclicker.cookieclickerStrings.cite
import typingsJapgolly.cookieclicker.cookieclickerStrings.click
import typingsJapgolly.cookieclicker.cookieclickerStrings.clipPath
import typingsJapgolly.cookieclicker.cookieclickerStrings.close
import typingsJapgolly.cookieclicker.cookieclickerStrings.code
import typingsJapgolly.cookieclicker.cookieclickerStrings.col
import typingsJapgolly.cookieclicker.cookieclickerStrings.colgroup
import typingsJapgolly.cookieclicker.cookieclickerStrings.compositionend
import typingsJapgolly.cookieclicker.cookieclickerStrings.compositionstart
import typingsJapgolly.cookieclicker.cookieclickerStrings.compositionupdate
import typingsJapgolly.cookieclicker.cookieclickerStrings.contextmenu
import typingsJapgolly.cookieclicker.cookieclickerStrings.copy
import typingsJapgolly.cookieclicker.cookieclickerStrings.cuechange
import typingsJapgolly.cookieclicker.cookieclickerStrings.cut
import typingsJapgolly.cookieclicker.cookieclickerStrings.data
import typingsJapgolly.cookieclicker.cookieclickerStrings.datalist
import typingsJapgolly.cookieclicker.cookieclickerStrings.dblclick
import typingsJapgolly.cookieclicker.cookieclickerStrings.dd
import typingsJapgolly.cookieclicker.cookieclickerStrings.defs
import typingsJapgolly.cookieclicker.cookieclickerStrings.del
import typingsJapgolly.cookieclicker.cookieclickerStrings.desc
import typingsJapgolly.cookieclicker.cookieclickerStrings.details
import typingsJapgolly.cookieclicker.cookieclickerStrings.dfn
import typingsJapgolly.cookieclicker.cookieclickerStrings.dialog
import typingsJapgolly.cookieclicker.cookieclickerStrings.div
import typingsJapgolly.cookieclicker.cookieclickerStrings.dl
import typingsJapgolly.cookieclicker.cookieclickerStrings.drag
import typingsJapgolly.cookieclicker.cookieclickerStrings.dragend
import typingsJapgolly.cookieclicker.cookieclickerStrings.dragenter
import typingsJapgolly.cookieclicker.cookieclickerStrings.dragleave
import typingsJapgolly.cookieclicker.cookieclickerStrings.dragover
import typingsJapgolly.cookieclicker.cookieclickerStrings.dragstart
import typingsJapgolly.cookieclicker.cookieclickerStrings.drop
import typingsJapgolly.cookieclicker.cookieclickerStrings.dt
import typingsJapgolly.cookieclicker.cookieclickerStrings.durationchange
import typingsJapgolly.cookieclicker.cookieclickerStrings.ellipse
import typingsJapgolly.cookieclicker.cookieclickerStrings.em
import typingsJapgolly.cookieclicker.cookieclickerStrings.embed
import typingsJapgolly.cookieclicker.cookieclickerStrings.emptied
import typingsJapgolly.cookieclicker.cookieclickerStrings.ended
import typingsJapgolly.cookieclicker.cookieclickerStrings.error
import typingsJapgolly.cookieclicker.cookieclickerStrings.feBlend
import typingsJapgolly.cookieclicker.cookieclickerStrings.feColorMatrix
import typingsJapgolly.cookieclicker.cookieclickerStrings.feComponentTransfer
import typingsJapgolly.cookieclicker.cookieclickerStrings.feComposite
import typingsJapgolly.cookieclicker.cookieclickerStrings.feConvolveMatrix
import typingsJapgolly.cookieclicker.cookieclickerStrings.feDiffuseLighting
import typingsJapgolly.cookieclicker.cookieclickerStrings.feDisplacementMap
import typingsJapgolly.cookieclicker.cookieclickerStrings.feDistantLight
import typingsJapgolly.cookieclicker.cookieclickerStrings.feDropShadow
import typingsJapgolly.cookieclicker.cookieclickerStrings.feFlood
import typingsJapgolly.cookieclicker.cookieclickerStrings.feFuncA
import typingsJapgolly.cookieclicker.cookieclickerStrings.feFuncB
import typingsJapgolly.cookieclicker.cookieclickerStrings.feFuncG
import typingsJapgolly.cookieclicker.cookieclickerStrings.feFuncR
import typingsJapgolly.cookieclicker.cookieclickerStrings.feGaussianBlur
import typingsJapgolly.cookieclicker.cookieclickerStrings.feImage
import typingsJapgolly.cookieclicker.cookieclickerStrings.feMerge
import typingsJapgolly.cookieclicker.cookieclickerStrings.feMergeNode
import typingsJapgolly.cookieclicker.cookieclickerStrings.feMorphology
import typingsJapgolly.cookieclicker.cookieclickerStrings.feOffset
import typingsJapgolly.cookieclicker.cookieclickerStrings.fePointLight
import typingsJapgolly.cookieclicker.cookieclickerStrings.feSpecularLighting
import typingsJapgolly.cookieclicker.cookieclickerStrings.feSpotLight
import typingsJapgolly.cookieclicker.cookieclickerStrings.feTile
import typingsJapgolly.cookieclicker.cookieclickerStrings.feTurbulence
import typingsJapgolly.cookieclicker.cookieclickerStrings.fieldset
import typingsJapgolly.cookieclicker.cookieclickerStrings.figcaption
import typingsJapgolly.cookieclicker.cookieclickerStrings.figure
import typingsJapgolly.cookieclicker.cookieclickerStrings.filter
import typingsJapgolly.cookieclicker.cookieclickerStrings.focus
import typingsJapgolly.cookieclicker.cookieclickerStrings.focusin
import typingsJapgolly.cookieclicker.cookieclickerStrings.focusout
import typingsJapgolly.cookieclicker.cookieclickerStrings.footer
import typingsJapgolly.cookieclicker.cookieclickerStrings.foreignObject
import typingsJapgolly.cookieclicker.cookieclickerStrings.form
import typingsJapgolly.cookieclicker.cookieclickerStrings.formdata
import typingsJapgolly.cookieclicker.cookieclickerStrings.fullscreenchange
import typingsJapgolly.cookieclicker.cookieclickerStrings.fullscreenerror
import typingsJapgolly.cookieclicker.cookieclickerStrings.g
import typingsJapgolly.cookieclicker.cookieclickerStrings.gotpointercapture
import typingsJapgolly.cookieclicker.cookieclickerStrings.h1
import typingsJapgolly.cookieclicker.cookieclickerStrings.h2
import typingsJapgolly.cookieclicker.cookieclickerStrings.h3
import typingsJapgolly.cookieclicker.cookieclickerStrings.h4
import typingsJapgolly.cookieclicker.cookieclickerStrings.h5
import typingsJapgolly.cookieclicker.cookieclickerStrings.h6
import typingsJapgolly.cookieclicker.cookieclickerStrings.head
import typingsJapgolly.cookieclicker.cookieclickerStrings.header
import typingsJapgolly.cookieclicker.cookieclickerStrings.hgroup
import typingsJapgolly.cookieclicker.cookieclickerStrings.hr
import typingsJapgolly.cookieclicker.cookieclickerStrings.html
import typingsJapgolly.cookieclicker.cookieclickerStrings.httpColonSlashSlashwwwDotw3DotorgSlash1999Slashxhtml
import typingsJapgolly.cookieclicker.cookieclickerStrings.httpColonSlashSlashwwwDotw3DotorgSlash2000Slashsvg
import typingsJapgolly.cookieclicker.cookieclickerStrings.i
import typingsJapgolly.cookieclicker.cookieclickerStrings.iframe
import typingsJapgolly.cookieclicker.cookieclickerStrings.image
import typingsJapgolly.cookieclicker.cookieclickerStrings.img
import typingsJapgolly.cookieclicker.cookieclickerStrings.input
import typingsJapgolly.cookieclicker.cookieclickerStrings.ins
import typingsJapgolly.cookieclicker.cookieclickerStrings.invalid
import typingsJapgolly.cookieclicker.cookieclickerStrings.kbd
import typingsJapgolly.cookieclicker.cookieclickerStrings.keydown
import typingsJapgolly.cookieclicker.cookieclickerStrings.keypress
import typingsJapgolly.cookieclicker.cookieclickerStrings.keyup
import typingsJapgolly.cookieclicker.cookieclickerStrings.label
import typingsJapgolly.cookieclicker.cookieclickerStrings.legend
import typingsJapgolly.cookieclicker.cookieclickerStrings.li
import typingsJapgolly.cookieclicker.cookieclickerStrings.line
import typingsJapgolly.cookieclicker.cookieclickerStrings.linearGradient
import typingsJapgolly.cookieclicker.cookieclickerStrings.link
import typingsJapgolly.cookieclicker.cookieclickerStrings.load
import typingsJapgolly.cookieclicker.cookieclickerStrings.loadeddata
import typingsJapgolly.cookieclicker.cookieclickerStrings.loadedmetadata
import typingsJapgolly.cookieclicker.cookieclickerStrings.loadstart
import typingsJapgolly.cookieclicker.cookieclickerStrings.lostpointercapture
import typingsJapgolly.cookieclicker.cookieclickerStrings.main
import typingsJapgolly.cookieclicker.cookieclickerStrings.map
import typingsJapgolly.cookieclicker.cookieclickerStrings.mark
import typingsJapgolly.cookieclicker.cookieclickerStrings.marker
import typingsJapgolly.cookieclicker.cookieclickerStrings.mask
import typingsJapgolly.cookieclicker.cookieclickerStrings.menu
import typingsJapgolly.cookieclicker.cookieclickerStrings.meta
import typingsJapgolly.cookieclicker.cookieclickerStrings.metadata
import typingsJapgolly.cookieclicker.cookieclickerStrings.meter
import typingsJapgolly.cookieclicker.cookieclickerStrings.mousedown
import typingsJapgolly.cookieclicker.cookieclickerStrings.mouseenter
import typingsJapgolly.cookieclicker.cookieclickerStrings.mouseleave
import typingsJapgolly.cookieclicker.cookieclickerStrings.mousemove
import typingsJapgolly.cookieclicker.cookieclickerStrings.mouseout
import typingsJapgolly.cookieclicker.cookieclickerStrings.mouseover
import typingsJapgolly.cookieclicker.cookieclickerStrings.mouseup
import typingsJapgolly.cookieclicker.cookieclickerStrings.mpath
import typingsJapgolly.cookieclicker.cookieclickerStrings.nav
import typingsJapgolly.cookieclicker.cookieclickerStrings.noscript
import typingsJapgolly.cookieclicker.cookieclickerStrings.ol
import typingsJapgolly.cookieclicker.cookieclickerStrings.optgroup
import typingsJapgolly.cookieclicker.cookieclickerStrings.option
import typingsJapgolly.cookieclicker.cookieclickerStrings.output
import typingsJapgolly.cookieclicker.cookieclickerStrings.p
import typingsJapgolly.cookieclicker.cookieclickerStrings.paste
import typingsJapgolly.cookieclicker.cookieclickerStrings.path
import typingsJapgolly.cookieclicker.cookieclickerStrings.pattern
import typingsJapgolly.cookieclicker.cookieclickerStrings.pause
import typingsJapgolly.cookieclicker.cookieclickerStrings.picture
import typingsJapgolly.cookieclicker.cookieclickerStrings.play
import typingsJapgolly.cookieclicker.cookieclickerStrings.playing
import typingsJapgolly.cookieclicker.cookieclickerStrings.pointercancel
import typingsJapgolly.cookieclicker.cookieclickerStrings.pointerdown
import typingsJapgolly.cookieclicker.cookieclickerStrings.pointerenter
import typingsJapgolly.cookieclicker.cookieclickerStrings.pointerleave
import typingsJapgolly.cookieclicker.cookieclickerStrings.pointermove
import typingsJapgolly.cookieclicker.cookieclickerStrings.pointerout
import typingsJapgolly.cookieclicker.cookieclickerStrings.pointerover
import typingsJapgolly.cookieclicker.cookieclickerStrings.pointerup
import typingsJapgolly.cookieclicker.cookieclickerStrings.polygon
import typingsJapgolly.cookieclicker.cookieclickerStrings.polyline
import typingsJapgolly.cookieclicker.cookieclickerStrings.pre
import typingsJapgolly.cookieclicker.cookieclickerStrings.progress
import typingsJapgolly.cookieclicker.cookieclickerStrings.q
import typingsJapgolly.cookieclicker.cookieclickerStrings.radialGradient
import typingsJapgolly.cookieclicker.cookieclickerStrings.ratechange
import typingsJapgolly.cookieclicker.cookieclickerStrings.rect
import typingsJapgolly.cookieclicker.cookieclickerStrings.reset
import typingsJapgolly.cookieclicker.cookieclickerStrings.resize
import typingsJapgolly.cookieclicker.cookieclickerStrings.rp
import typingsJapgolly.cookieclicker.cookieclickerStrings.rt
import typingsJapgolly.cookieclicker.cookieclickerStrings.ruby
import typingsJapgolly.cookieclicker.cookieclickerStrings.s
import typingsJapgolly.cookieclicker.cookieclickerStrings.samp
import typingsJapgolly.cookieclicker.cookieclickerStrings.script
import typingsJapgolly.cookieclicker.cookieclickerStrings.scroll
import typingsJapgolly.cookieclicker.cookieclickerStrings.section
import typingsJapgolly.cookieclicker.cookieclickerStrings.securitypolicyviolation
import typingsJapgolly.cookieclicker.cookieclickerStrings.seeked
import typingsJapgolly.cookieclicker.cookieclickerStrings.seeking
import typingsJapgolly.cookieclicker.cookieclickerStrings.select
import typingsJapgolly.cookieclicker.cookieclickerStrings.selectionchange
import typingsJapgolly.cookieclicker.cookieclickerStrings.selectstart
import typingsJapgolly.cookieclicker.cookieclickerStrings.set
import typingsJapgolly.cookieclicker.cookieclickerStrings.slot
import typingsJapgolly.cookieclicker.cookieclickerStrings.slotchange
import typingsJapgolly.cookieclicker.cookieclickerStrings.small
import typingsJapgolly.cookieclicker.cookieclickerStrings.source
import typingsJapgolly.cookieclicker.cookieclickerStrings.span
import typingsJapgolly.cookieclicker.cookieclickerStrings.stalled
import typingsJapgolly.cookieclicker.cookieclickerStrings.stop
import typingsJapgolly.cookieclicker.cookieclickerStrings.strong
import typingsJapgolly.cookieclicker.cookieclickerStrings.sub
import typingsJapgolly.cookieclicker.cookieclickerStrings.submit
import typingsJapgolly.cookieclicker.cookieclickerStrings.summary
import typingsJapgolly.cookieclicker.cookieclickerStrings.sup
import typingsJapgolly.cookieclicker.cookieclickerStrings.suspend
import typingsJapgolly.cookieclicker.cookieclickerStrings.svg
import typingsJapgolly.cookieclicker.cookieclickerStrings.switch
import typingsJapgolly.cookieclicker.cookieclickerStrings.symbol
import typingsJapgolly.cookieclicker.cookieclickerStrings.table
import typingsJapgolly.cookieclicker.cookieclickerStrings.tbody
import typingsJapgolly.cookieclicker.cookieclickerStrings.td
import typingsJapgolly.cookieclicker.cookieclickerStrings.template
import typingsJapgolly.cookieclicker.cookieclickerStrings.text
import typingsJapgolly.cookieclicker.cookieclickerStrings.textPath
import typingsJapgolly.cookieclicker.cookieclickerStrings.textarea
import typingsJapgolly.cookieclicker.cookieclickerStrings.tfoot
import typingsJapgolly.cookieclicker.cookieclickerStrings.th
import typingsJapgolly.cookieclicker.cookieclickerStrings.thead
import typingsJapgolly.cookieclicker.cookieclickerStrings.time
import typingsJapgolly.cookieclicker.cookieclickerStrings.timeupdate
import typingsJapgolly.cookieclicker.cookieclickerStrings.title
import typingsJapgolly.cookieclicker.cookieclickerStrings.toggle
import typingsJapgolly.cookieclicker.cookieclickerStrings.touchcancel
import typingsJapgolly.cookieclicker.cookieclickerStrings.touchend
import typingsJapgolly.cookieclicker.cookieclickerStrings.touchmove
import typingsJapgolly.cookieclicker.cookieclickerStrings.touchstart
import typingsJapgolly.cookieclicker.cookieclickerStrings.tr
import typingsJapgolly.cookieclicker.cookieclickerStrings.track
import typingsJapgolly.cookieclicker.cookieclickerStrings.transitioncancel
import typingsJapgolly.cookieclicker.cookieclickerStrings.transitionend
import typingsJapgolly.cookieclicker.cookieclickerStrings.transitionrun
import typingsJapgolly.cookieclicker.cookieclickerStrings.transitionstart
import typingsJapgolly.cookieclicker.cookieclickerStrings.tspan
import typingsJapgolly.cookieclicker.cookieclickerStrings.u
import typingsJapgolly.cookieclicker.cookieclickerStrings.ul
import typingsJapgolly.cookieclicker.cookieclickerStrings.use
import typingsJapgolly.cookieclicker.cookieclickerStrings.video
import typingsJapgolly.cookieclicker.cookieclickerStrings.view
import typingsJapgolly.cookieclicker.cookieclickerStrings.volumechange
import typingsJapgolly.cookieclicker.cookieclickerStrings.waiting
import typingsJapgolly.cookieclicker.cookieclickerStrings.wbr
import typingsJapgolly.cookieclicker.cookieclickerStrings.webgl
import typingsJapgolly.cookieclicker.cookieclickerStrings.webgl2
import typingsJapgolly.cookieclicker.cookieclickerStrings.webkitanimationend
import typingsJapgolly.cookieclicker.cookieclickerStrings.webkitanimationiteration
import typingsJapgolly.cookieclicker.cookieclickerStrings.webkitanimationstart
import typingsJapgolly.cookieclicker.cookieclickerStrings.webkittransitionend
import typingsJapgolly.cookieclicker.cookieclickerStrings.wheel
import typingsJapgolly.std.AddEventListenerOptions
import typingsJapgolly.std.Animation
import typingsJapgolly.std.BlobCallback
import typingsJapgolly.std.CanvasRenderingContext2DSettings
import typingsJapgolly.std.ChildNode
import typingsJapgolly.std.DOMRectList
import typingsJapgolly.std.DOMStringMap
import typingsJapgolly.std.ElementInternals
import typingsJapgolly.std.EventListenerOrEventListenerObject
import typingsJapgolly.std.FocusOptions
import typingsJapgolly.std.FormDataEvent
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
import typingsJapgolly.std.ImageBitmapRenderingContext
import typingsJapgolly.std.ImageBitmapRenderingContextSettings
import typingsJapgolly.std.InputEvent
import typingsJapgolly.std.InsertPosition
import typingsJapgolly.std.Keyframe
import typingsJapgolly.std.KeyframeAnimationOptions
import typingsJapgolly.std.OnErrorEventHandler
import typingsJapgolly.std.PropertyIndexedKeyframes
import typingsJapgolly.std.Record
import typingsJapgolly.std.RenderingContext
import typingsJapgolly.std.SVGAnimateElement
import typingsJapgolly.std.SVGAnimateMotionElement
import typingsJapgolly.std.SVGAnimateTransformElement
import typingsJapgolly.std.SVGFEDropShadowElement
import typingsJapgolly.std.SVGForeignObjectElement
import typingsJapgolly.std.SVGMPathElement
import typingsJapgolly.std.SVGSetElement
import typingsJapgolly.std.ScrollIntoViewOptions
import typingsJapgolly.std.ScrollToOptions
import typingsJapgolly.std.SecurityPolicyViolationEvent
import typingsJapgolly.std.ShadowRoot
import typingsJapgolly.std.ShadowRootInit
import typingsJapgolly.std.SubmitEvent
import typingsJapgolly.std.WebGL2RenderingContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Bank extends StObject {
    
    var Bank: MinigameObject[StocksMinigame]
    
    var Farm: MinigameObject[GardenMinigame]
    
    var Temple: MinigameObject[PantheonMinigame]
    
    var `Wizard tower`: MinigameObject[GrimoireMinigame]
  }
  object Bank {
    
    inline def apply(
      Bank: MinigameObject[StocksMinigame],
      Farm: MinigameObject[GardenMinigame],
      Temple: MinigameObject[PantheonMinigame],
      `Wizard tower`: MinigameObject[GrimoireMinigame]
    ): Bank = {
      val __obj = js.Dynamic.literal(Bank = Bank.asInstanceOf[js.Any], Farm = Farm.asInstanceOf[js.Any], Temple = Temple.asInstanceOf[js.Any])
      __obj.updateDynamic("Wizard tower")((`Wizard tower`).asInstanceOf[js.Any])
      __obj.asInstanceOf[Bank]
    }
    
    extension [Self <: Bank](x: Self) {
      
      inline def setBank(value: MinigameObject[StocksMinigame]): Self = StObject.set(x, "Bank", value.asInstanceOf[js.Any])
      
      inline def setFarm(value: MinigameObject[GardenMinigame]): Self = StObject.set(x, "Farm", value.asInstanceOf[js.Any])
      
      inline def setTemple(value: MinigameObject[PantheonMinigame]): Self = StObject.set(x, "Temple", value.asInstanceOf[js.Any])
      
      inline def `setWizard tower`(value: MinigameObject[GrimoireMinigame]): Self = StObject.set(x, "Wizard tower", value.asInstanceOf[js.Any])
    }
  }
  
  trait Cost extends StObject {
    
    /**
      * The overridden cost of the spell
      */
    var cost: js.UndefOr[Double] = js.undefined
    
    /**
      * The additional fail chance of the spell
      */
    var failChanceAdd: js.UndefOr[Double] = js.undefined
    
    /**
      * The minimum the fail chance of the spell
      */
    var failChanceMax: js.UndefOr[Double] = js.undefined
    
    /**
      * The multiplier of the fail chance of the spell
      */
    var failChanceMult: js.UndefOr[Double] = js.undefined
    
    /**
      * The overridden fail chance of the spell
      */
    var failChanceSet: js.UndefOr[Double] = js.undefined
    
    /**
      * If true, the spell isn't counted towards the spell count
      */
    var passthrough: js.UndefOr[Boolean] = js.undefined
  }
  object Cost {
    
    inline def apply(): Cost = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Cost]
    }
    
    extension [Self <: Cost](x: Self) {
      
      inline def setCost(value: Double): Self = StObject.set(x, "cost", value.asInstanceOf[js.Any])
      
      inline def setCostUndefined: Self = StObject.set(x, "cost", js.undefined)
      
      inline def setFailChanceAdd(value: Double): Self = StObject.set(x, "failChanceAdd", value.asInstanceOf[js.Any])
      
      inline def setFailChanceAddUndefined: Self = StObject.set(x, "failChanceAdd", js.undefined)
      
      inline def setFailChanceMax(value: Double): Self = StObject.set(x, "failChanceMax", value.asInstanceOf[js.Any])
      
      inline def setFailChanceMaxUndefined: Self = StObject.set(x, "failChanceMax", js.undefined)
      
      inline def setFailChanceMult(value: Double): Self = StObject.set(x, "failChanceMult", value.asInstanceOf[js.Any])
      
      inline def setFailChanceMultUndefined: Self = StObject.set(x, "failChanceMult", js.undefined)
      
      inline def setFailChanceSet(value: Double): Self = StObject.set(x, "failChanceSet", value.asInstanceOf[js.Any])
      
      inline def setFailChanceSetUndefined: Self = StObject.set(x, "failChanceSet", js.undefined)
      
      inline def setPassthrough(value: Boolean): Self = StObject.set(x, "passthrough", value.asInstanceOf[js.Any])
      
      inline def setPassthroughUndefined: Self = StObject.set(x, "passthrough", js.undefined)
    }
  }
  
  /* Inlined std.HTMLCanvasElement & {  width :8,   height :8,   alt :'blank'} */
  @js.native
  trait HTMLCanvasElementwidth8he extends StObject {
    
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
    
    /* standard dom */
    var accessKey: String = js.native
    
    /* standard dom */
    val accessKeyLabel: String = js.native
    
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
    @JSName("addEventListener")
    def addEventListener_abort(`type`: abort, listener: js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_abort(
      `type`: abort,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_abort(
      `type`: abort,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_animationcancel(
      `type`: animationcancel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, Any]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_animationcancel(
      `type`: animationcancel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_animationcancel(
      `type`: animationcancel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_animationend(
      `type`: animationend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, Any]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_animationend(
      `type`: animationend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_animationend(
      `type`: animationend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_animationiteration(
      `type`: animationiteration,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, Any]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_animationiteration(
      `type`: animationiteration,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_animationiteration(
      `type`: animationiteration,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_animationstart(
      `type`: animationstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, Any]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_animationstart(
      `type`: animationstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_animationstart(
      `type`: animationstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_auxclick(`type`: auxclick, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_auxclick(
      `type`: auxclick,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_auxclick(
      `type`: auxclick,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_beforeinput(`type`: beforeinput, listener: js.ThisFunction1[/* this */ this.type, /* ev */ InputEvent, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_beforeinput(
      `type`: beforeinput,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ InputEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_beforeinput(
      `type`: beforeinput,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ InputEvent, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_blur(`type`: blur, listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_blur(
      `type`: blur,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_blur(
      `type`: blur,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_canplay(`type`: canplay, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_canplay(
      `type`: canplay,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_canplay(
      `type`: canplay,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_canplaythrough(`type`: canplaythrough, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_canplaythrough(
      `type`: canplaythrough,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_canplaythrough(
      `type`: canplaythrough,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_change(`type`: change, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_change(
      `type`: change,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_change(
      `type`: change,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_click(`type`: click, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_click(
      `type`: click,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_click(
      `type`: click,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_close(`type`: close, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_close(
      `type`: close,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_close(
      `type`: close,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_compositionend(
      `type`: compositionend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CompositionEvent, Any]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_compositionend(
      `type`: compositionend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CompositionEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_compositionend(
      `type`: compositionend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CompositionEvent, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_compositionstart(
      `type`: compositionstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CompositionEvent, Any]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_compositionstart(
      `type`: compositionstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CompositionEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_compositionstart(
      `type`: compositionstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CompositionEvent, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_compositionupdate(
      `type`: compositionupdate,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CompositionEvent, Any]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_compositionupdate(
      `type`: compositionupdate,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CompositionEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_compositionupdate(
      `type`: compositionupdate,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CompositionEvent, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_contextmenu(`type`: contextmenu, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_contextmenu(
      `type`: contextmenu,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_contextmenu(
      `type`: contextmenu,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_copy(`type`: copy, listener: js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_copy(
      `type`: copy,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_copy(
      `type`: copy,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_cuechange(`type`: cuechange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_cuechange(
      `type`: cuechange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_cuechange(
      `type`: cuechange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_cut(`type`: cut, listener: js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_cut(
      `type`: cut,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_cut(
      `type`: cut,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_dblclick(`type`: dblclick, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_dblclick(
      `type`: dblclick,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_dblclick(
      `type`: dblclick,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_drag(`type`: drag, listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_drag(
      `type`: drag,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_drag(
      `type`: drag,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_dragend(`type`: dragend, listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_dragend(
      `type`: dragend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_dragend(
      `type`: dragend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_dragenter(`type`: dragenter, listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_dragenter(
      `type`: dragenter,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_dragenter(
      `type`: dragenter,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_dragleave(`type`: dragleave, listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_dragleave(
      `type`: dragleave,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_dragleave(
      `type`: dragleave,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_dragover(`type`: dragover, listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_dragover(
      `type`: dragover,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_dragover(
      `type`: dragover,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_dragstart(`type`: dragstart, listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_dragstart(
      `type`: dragstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_dragstart(
      `type`: dragstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_drop(`type`: drop, listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_drop(
      `type`: drop,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_drop(
      `type`: drop,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_durationchange(`type`: durationchange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_durationchange(
      `type`: durationchange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_durationchange(
      `type`: durationchange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_emptied(`type`: emptied, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_emptied(
      `type`: emptied,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_emptied(
      `type`: emptied,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ended(`type`: ended, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ended(
      `type`: ended,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ended(
      `type`: ended,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_error(`type`: error, listener: js.ThisFunction1[/* this */ this.type, /* ev */ ErrorEvent, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_error(
      `type`: error,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ ErrorEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_error(
      `type`: error,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ ErrorEvent, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_focus(`type`: focus, listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_focus(
      `type`: focus,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_focus(
      `type`: focus,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_focusin(`type`: focusin, listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_focusin(
      `type`: focusin,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_focusin(
      `type`: focusin,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_focusout(`type`: focusout, listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_focusout(
      `type`: focusout,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_focusout(
      `type`: focusout,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_formdata(`type`: formdata, listener: js.ThisFunction1[/* this */ this.type, /* ev */ FormDataEvent, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_formdata(
      `type`: formdata,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ FormDataEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_formdata(
      `type`: formdata,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ FormDataEvent, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
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
    @JSName("addEventListener")
    def addEventListener_gotpointercapture(
      `type`: gotpointercapture,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_gotpointercapture(
      `type`: gotpointercapture,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_gotpointercapture(
      `type`: gotpointercapture,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_input(`type`: input, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_input(
      `type`: input,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_input(
      `type`: input,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_invalid(`type`: invalid, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_invalid(
      `type`: invalid,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_invalid(
      `type`: invalid,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_keydown(`type`: keydown, listener: js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_keydown(
      `type`: keydown,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_keydown(
      `type`: keydown,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_keypress(`type`: keypress, listener: js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_keypress(
      `type`: keypress,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_keypress(
      `type`: keypress,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_keyup(`type`: keyup, listener: js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_keyup(
      `type`: keyup,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_keyup(
      `type`: keyup,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_load(`type`: load, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_load(
      `type`: load,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_load(
      `type`: load,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_loadeddata(`type`: loadeddata, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_loadeddata(
      `type`: loadeddata,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_loadeddata(
      `type`: loadeddata,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_loadedmetadata(`type`: loadedmetadata, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_loadedmetadata(
      `type`: loadedmetadata,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_loadedmetadata(
      `type`: loadedmetadata,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_loadstart(`type`: loadstart, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_loadstart(
      `type`: loadstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_loadstart(
      `type`: loadstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_lostpointercapture(
      `type`: lostpointercapture,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_lostpointercapture(
      `type`: lostpointercapture,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_lostpointercapture(
      `type`: lostpointercapture,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_mousedown(`type`: mousedown, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_mousedown(
      `type`: mousedown,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_mousedown(
      `type`: mousedown,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_mouseenter(`type`: mouseenter, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_mouseenter(
      `type`: mouseenter,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_mouseenter(
      `type`: mouseenter,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_mouseleave(`type`: mouseleave, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_mouseleave(
      `type`: mouseleave,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_mouseleave(
      `type`: mouseleave,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_mousemove(`type`: mousemove, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_mousemove(
      `type`: mousemove,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_mousemove(
      `type`: mousemove,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_mouseout(`type`: mouseout, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_mouseout(
      `type`: mouseout,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_mouseout(
      `type`: mouseout,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_mouseover(`type`: mouseover, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_mouseover(
      `type`: mouseover,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_mouseover(
      `type`: mouseover,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_mouseup(`type`: mouseup, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_mouseup(
      `type`: mouseup,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_mouseup(
      `type`: mouseup,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_paste(`type`: paste, listener: js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_paste(
      `type`: paste,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_paste(
      `type`: paste,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pause(`type`: pause, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pause(
      `type`: pause,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pause(
      `type`: pause,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_play(`type`: play, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_play(
      `type`: play,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_play(
      `type`: play,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_playing(`type`: playing, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_playing(
      `type`: playing,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_playing(
      `type`: playing,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pointercancel(
      `type`: pointercancel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pointercancel(
      `type`: pointercancel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pointercancel(
      `type`: pointercancel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pointerdown(`type`: pointerdown, listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pointerdown(
      `type`: pointerdown,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pointerdown(
      `type`: pointerdown,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pointerenter(`type`: pointerenter, listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pointerenter(
      `type`: pointerenter,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pointerenter(
      `type`: pointerenter,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pointerleave(`type`: pointerleave, listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pointerleave(
      `type`: pointerleave,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pointerleave(
      `type`: pointerleave,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pointermove(`type`: pointermove, listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pointermove(
      `type`: pointermove,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pointermove(
      `type`: pointermove,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pointerout(`type`: pointerout, listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pointerout(
      `type`: pointerout,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pointerout(
      `type`: pointerout,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pointerover(`type`: pointerover, listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pointerover(
      `type`: pointerover,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pointerover(
      `type`: pointerover,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pointerup(`type`: pointerup, listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pointerup(
      `type`: pointerup,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pointerup(
      `type`: pointerup,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_progress(`type`: progress, listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_progress(
      `type`: progress,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_progress(
      `type`: progress,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ratechange(`type`: ratechange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ratechange(
      `type`: ratechange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ratechange(
      `type`: ratechange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_reset(`type`: reset, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_reset(
      `type`: reset,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_reset(
      `type`: reset,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_resize(`type`: resize, listener: js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_resize(
      `type`: resize,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_resize(
      `type`: resize,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_scroll(`type`: scroll, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_scroll(
      `type`: scroll,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_scroll(
      `type`: scroll,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_securitypolicyviolation(
      `type`: securitypolicyviolation,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ SecurityPolicyViolationEvent, Any]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_securitypolicyviolation(
      `type`: securitypolicyviolation,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ SecurityPolicyViolationEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_securitypolicyviolation(
      `type`: securitypolicyviolation,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ SecurityPolicyViolationEvent, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_seeked(`type`: seeked, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_seeked(
      `type`: seeked,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_seeked(
      `type`: seeked,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_seeking(`type`: seeking, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_seeking(
      `type`: seeking,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_seeking(
      `type`: seeking,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_select(`type`: select, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_select(
      `type`: select,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_select(
      `type`: select,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_selectionchange(`type`: selectionchange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_selectionchange(
      `type`: selectionchange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_selectionchange(
      `type`: selectionchange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_selectstart(`type`: selectstart, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_selectstart(
      `type`: selectstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_selectstart(
      `type`: selectstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_slotchange(`type`: slotchange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_slotchange(
      `type`: slotchange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_slotchange(
      `type`: slotchange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_stalled(`type`: stalled, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_stalled(
      `type`: stalled,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_stalled(
      `type`: stalled,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_submit(`type`: submit, listener: js.ThisFunction1[/* this */ this.type, /* ev */ SubmitEvent, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_submit(
      `type`: submit,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ SubmitEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_submit(
      `type`: submit,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ SubmitEvent, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_suspend(`type`: suspend, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_suspend(
      `type`: suspend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_suspend(
      `type`: suspend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_timeupdate(`type`: timeupdate, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_timeupdate(
      `type`: timeupdate,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_timeupdate(
      `type`: timeupdate,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_toggle(`type`: toggle, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_toggle(
      `type`: toggle,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_toggle(
      `type`: toggle,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_touchcancel(`type`: touchcancel, listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_touchcancel(
      `type`: touchcancel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_touchcancel(
      `type`: touchcancel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_touchend(`type`: touchend, listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_touchend(
      `type`: touchend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_touchend(
      `type`: touchend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_touchmove(`type`: touchmove, listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_touchmove(
      `type`: touchmove,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_touchmove(
      `type`: touchmove,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_touchstart(`type`: touchstart, listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_touchstart(
      `type`: touchstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_touchstart(
      `type`: touchstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_transitioncancel(
      `type`: transitioncancel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, Any]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_transitioncancel(
      `type`: transitioncancel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_transitioncancel(
      `type`: transitioncancel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_transitionend(
      `type`: transitionend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, Any]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_transitionend(
      `type`: transitionend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_transitionend(
      `type`: transitionend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_transitionrun(
      `type`: transitionrun,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, Any]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_transitionrun(
      `type`: transitionrun,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_transitionrun(
      `type`: transitionrun,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_transitionstart(
      `type`: transitionstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, Any]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_transitionstart(
      `type`: transitionstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_transitionstart(
      `type`: transitionstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_volumechange(`type`: volumechange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_volumechange(
      `type`: volumechange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_volumechange(
      `type`: volumechange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_waiting(`type`: waiting, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_waiting(
      `type`: waiting,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_waiting(
      `type`: waiting,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_webkitanimationend(`type`: webkitanimationend, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_webkitanimationend(
      `type`: webkitanimationend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_webkitanimationend(
      `type`: webkitanimationend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_webkitanimationiteration(
      `type`: webkitanimationiteration,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_webkitanimationiteration(
      `type`: webkitanimationiteration,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_webkitanimationiteration(
      `type`: webkitanimationiteration,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_webkitanimationstart(
      `type`: webkitanimationstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_webkitanimationstart(
      `type`: webkitanimationstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_webkitanimationstart(
      `type`: webkitanimationstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_webkittransitionend(`type`: webkittransitionend, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_webkittransitionend(
      `type`: webkittransitionend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_webkittransitionend(
      `type`: webkittransitionend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_wheel(`type`: wheel, listener: js.ThisFunction1[/* this */ this.type, /* ev */ WheelEvent, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_wheel(
      `type`: wheel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ WheelEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_wheel(
      `type`: wheel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ WheelEvent, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    
    /**
      * Inserts nodes just after node, while replacing strings in nodes with equivalent Text nodes.
      *
      * Throws a "HierarchyRequestError" DOMException if the constraints of the node tree are violated.
      */
    /* standard dom */
    def after(nodes: (Node | String)*): Unit = js.native
    
    var alt: blank = js.native
    
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
    
    /* standard dom */
    def attachInternals(): ElementInternals = js.native
    
    /** Creates a shadow root for element and returns it. */
    /* standard dom */
    def attachShadow(init: ShadowRootInit): ShadowRoot = js.native
    
    /* standard dom */
    val attributes: NamedNodeMap = js.native
    
    /* standard dom */
    var autocapitalize: String = js.native
    
    /* standard dom */
    var autofocus: Boolean = js.native
    
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
    def blur(): Unit = js.native
    
    /* standard dom */
    def captureStream(): MediaStream = js.native
    def captureStream(frameRequestRate: Double): MediaStream = js.native
    
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
    def click(): Unit = js.native
    
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
    def closest[E /* <: org.scalajs.dom.Element */](selectors: String): E | Null = js.native
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
    def closest_b(selector: b): HTMLElement | Null = js.native
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
    def closest_p(selector: p): HTMLParagraphElement | Null = js.native
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
    def closest_style(selector: typingsJapgolly.cookieclicker.cookieclickerStrings.style): HTMLStyleElement | Null = js.native
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
    
    /* standard dom */
    var contentEditable: String = js.native
    
    /* standard dom */
    val dataset: DOMStringMap = js.native
    
    /* standard dom */
    var dir: String = js.native
    
    /** Dispatches a synthetic event event to target and returns true if either event's cancelable attribute value is false or its preventDefault() method was not invoked, and false otherwise. */
    /* standard dom */
    def dispatchEvent(event: Event): Boolean = js.native
    
    /* standard dom */
    var draggable: Boolean = js.native
    
    /* standard dom */
    var enterKeyHint: String = js.native
    
    /** Returns the first child. */
    /* standard dom */
    val firstChild: ChildNode | Null = js.native
    
    /** Returns the first child that is an element, and null otherwise. */
    /* standard dom */
    val firstElementChild: org.scalajs.dom.Element | Null = js.native
    
    /* standard dom */
    def focus(): Unit = js.native
    def focus(options: FocusOptions): Unit = js.native
    
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
    
    /* standard dom */
    def getContext(contextId: String): RenderingContext | Null = js.native
    def getContext(contextId: String, options: Any): RenderingContext | Null = js.native
    /**
      * Returns an object that provides methods and properties for drawing and manipulating images and graphics on a canvas element in a document. A context object includes information about colors, line widths, fonts, and other graphic parameters that can be drawn on a canvas.
      * @param contextId The identifier (ID) of the type of canvas to create. Internet Explorer 9 and Internet Explorer 10 support only a 2-D context using canvas.getContext("2d"); IE11 Preview also supports 3-D or WebGL context using canvas.getContext("experimental-webgl");
      */
    /* standard dom */
    @JSName("getContext")
    def getContext_2d(contextId: `2d`): org.scalajs.dom.CanvasRenderingContext2D | Null = js.native
    @JSName("getContext")
    def getContext_2d(contextId: `2d`, options: CanvasRenderingContext2DSettings): org.scalajs.dom.CanvasRenderingContext2D | Null = js.native
    /* standard dom */
    @JSName("getContext")
    def getContext_bitmaprenderer(contextId: bitmaprenderer): ImageBitmapRenderingContext | Null = js.native
    @JSName("getContext")
    def getContext_bitmaprenderer(contextId: bitmaprenderer, options: ImageBitmapRenderingContextSettings): ImageBitmapRenderingContext | Null = js.native
    /* standard dom */
    @JSName("getContext")
    def getContext_webgl(contextId: webgl): WebGLRenderingContext | Null = js.native
    @JSName("getContext")
    def getContext_webgl(contextId: webgl, options: WebGLContextAttributes): WebGLRenderingContext | Null = js.native
    /* standard dom */
    @JSName("getContext")
    def getContext_webgl2(contextId: webgl2): WebGL2RenderingContext | Null = js.native
    @JSName("getContext")
    def getContext_webgl2(contextId: webgl2, options: WebGLContextAttributes): WebGL2RenderingContext | Null = js.native
    
    /** Returns a HTMLCollection of the elements in the object on which the method was invoked (a document or an element) that have all the classes given by classNames. The classNames argument is interpreted as a space-separated list of classes. */
    /* standard dom */
    def getElementsByClassName(classNames: String): HTMLCollectionOf[org.scalajs.dom.Element] = js.native
    
    /* standard dom */
    def getElementsByTagName(qualifiedName: String): HTMLCollectionOf[org.scalajs.dom.Element] = js.native
    
    /* standard dom */
    def getElementsByTagNameNS(namespace: String, localName: String): HTMLCollectionOf[org.scalajs.dom.Element] = js.native
    def getElementsByTagNameNS(namespace: Null, localName: String): HTMLCollectionOf[org.scalajs.dom.Element] = js.native
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
    def getElementsByTagName_b(qualifiedName: b): HTMLCollectionOf[HTMLElement] = js.native
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
    def getElementsByTagName_p(qualifiedName: p): HTMLCollectionOf[HTMLParagraphElement] = js.native
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
    def getElementsByTagName_style(qualifiedName: typingsJapgolly.cookieclicker.cookieclickerStrings.style): HTMLCollectionOf[HTMLStyleElement] = js.native
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
    
    /** Gets or sets the height of a canvas element on a document. */
    /* standard dom */
    var height: Double & `8` = js.native
    
    /* standard dom */
    var hidden: Boolean = js.native
    
    /** Returns the value of element's id content attribute. Can be set to change it. */
    /* standard dom */
    var id: String = js.native
    
    /* standard dom */
    var inert: Boolean = js.native
    
    /* standard dom */
    var innerHTML: String = js.native
    
    /* standard dom */
    var innerText: String = js.native
    
    /* standard dom */
    var inputMode: String = js.native
    
    /* standard dom */
    def insertAdjacentElement(where: InsertPosition, element: org.scalajs.dom.Element): org.scalajs.dom.Element | Null = js.native
    
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
    val isContentEditable: Boolean = js.native
    
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
    
    /* standard dom */
    var lang: String = js.native
    
    /** Returns the last child. */
    /* standard dom */
    val lastChild: ChildNode | Null = js.native
    
    /** Returns the last child that is an element, and null otherwise. */
    /* standard dom */
    val lastElementChild: org.scalajs.dom.Element | Null = js.native
    
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
    val nextElementSibling: org.scalajs.dom.Element | Null = js.native
    
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
    
    /* standard dom */
    var nonce: js.UndefOr[String] = js.native
    
    /** Removes empty exclusive Text nodes and concatenates the data of remaining contiguous exclusive Text nodes into the first of their nodes. */
    /* standard dom */
    def normalize(): Unit = js.native
    
    /* standard dom */
    val offsetHeight: Double = js.native
    
    /* standard dom */
    val offsetLeft: Double = js.native
    
    /* standard dom */
    val offsetParent: org.scalajs.dom.Element | Null = js.native
    
    /* standard dom */
    val offsetTop: Double = js.native
    
    /* standard dom */
    val offsetWidth: Double = js.native
    
    /**
      * Fires when the user aborts the download.
      * @param ev The event.
      */
    /* standard dom */
    var onabort: (js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, Any]) | Null = js.native
    
    /* standard dom */
    var onanimationcancel: (js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, Any]) | Null = js.native
    
    /* standard dom */
    var onanimationend: (js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, Any]) | Null = js.native
    
    /* standard dom */
    var onanimationiteration: (js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, Any]) | Null = js.native
    
    /* standard dom */
    var onanimationstart: (js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, Any]) | Null = js.native
    
    /* standard dom */
    var onauxclick: (js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any]) | Null = js.native
    
    /**
      * Fires when the object loses the input focus.
      * @param ev The focus event.
      */
    /* standard dom */
    var onblur: (js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, Any]) | Null = js.native
    
    /**
      * Occurs when playback is possible, but would require further buffering.
      * @param ev The event.
      */
    /* standard dom */
    var oncanplay: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null = js.native
    
    /* standard dom */
    var oncanplaythrough: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null = js.native
    
    /**
      * Fires when the contents of the object or selection have changed.
      * @param ev The event.
      */
    /* standard dom */
    var onchange: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null = js.native
    
    /**
      * Fires when the user clicks the left mouse button on the object
      * @param ev The mouse event.
      */
    /* standard dom */
    var onclick: (js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any]) | Null = js.native
    
    /* standard dom */
    var onclose: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null = js.native
    
    /**
      * Fires when the user clicks the right mouse button in the client area, opening the context menu.
      * @param ev The mouse event.
      */
    /* standard dom */
    var oncontextmenu: (js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any]) | Null = js.native
    
    /* standard dom */
    var oncopy: (js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, Any]) | Null = js.native
    
    /* standard dom */
    var oncuechange: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null = js.native
    
    /* standard dom */
    var oncut: (js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, Any]) | Null = js.native
    
    /**
      * Fires when the user double-clicks the object.
      * @param ev The mouse event.
      */
    /* standard dom */
    var ondblclick: (js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any]) | Null = js.native
    
    /**
      * Fires on the source object continuously during a drag operation.
      * @param ev The event.
      */
    /* standard dom */
    var ondrag: (js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, Any]) | Null = js.native
    
    /**
      * Fires on the source object when the user releases the mouse at the close of a drag operation.
      * @param ev The event.
      */
    /* standard dom */
    var ondragend: (js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, Any]) | Null = js.native
    
    /**
      * Fires on the target element when the user drags the object to a valid drop target.
      * @param ev The drag event.
      */
    /* standard dom */
    var ondragenter: (js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, Any]) | Null = js.native
    
    /**
      * Fires on the target object when the user moves the mouse out of a valid drop target during a drag operation.
      * @param ev The drag event.
      */
    /* standard dom */
    var ondragleave: (js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, Any]) | Null = js.native
    
    /**
      * Fires on the target element continuously while the user drags the object over a valid drop target.
      * @param ev The event.
      */
    /* standard dom */
    var ondragover: (js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, Any]) | Null = js.native
    
    /**
      * Fires on the source object when the user starts to drag a text selection or selected object.
      * @param ev The event.
      */
    /* standard dom */
    var ondragstart: (js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, Any]) | Null = js.native
    
    /* standard dom */
    var ondrop: (js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, Any]) | Null = js.native
    
    /**
      * Occurs when the duration attribute is updated.
      * @param ev The event.
      */
    /* standard dom */
    var ondurationchange: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null = js.native
    
    /**
      * Occurs when the media element is reset to its initial state.
      * @param ev The event.
      */
    /* standard dom */
    var onemptied: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null = js.native
    
    /**
      * Occurs when the end of playback is reached.
      * @param ev The event
      */
    /* standard dom */
    var onended: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null = js.native
    
    /**
      * Fires when an error occurs during object loading.
      * @param ev The event.
      */
    /* standard dom */
    var onerror: OnErrorEventHandler = js.native
    
    /**
      * Fires when the object receives focus.
      * @param ev The event.
      */
    /* standard dom */
    var onfocus: (js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, Any]) | Null = js.native
    
    /* standard dom */
    var onformdata: (js.ThisFunction1[/* this */ this.type, /* ev */ FormDataEvent, Any]) | Null = js.native
    
    /* standard dom */
    var onfullscreenchange: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null = js.native
    
    /* standard dom */
    var onfullscreenerror: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null = js.native
    
    /* standard dom */
    var ongotpointercapture: (js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any]) | Null = js.native
    
    /* standard dom */
    var oninput: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null = js.native
    
    /* standard dom */
    var oninvalid: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null = js.native
    
    /**
      * Fires when the user presses a key.
      * @param ev The keyboard event
      */
    /* standard dom */
    var onkeydown: (js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, Any]) | Null = js.native
    
    /**
      * Fires when the user presses an alphanumeric key.
      * @param ev The event.
      * @deprecated
      */
    /* standard dom */
    var onkeypress: (js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, Any]) | Null = js.native
    
    /**
      * Fires when the user releases a key.
      * @param ev The keyboard event
      */
    /* standard dom */
    var onkeyup: (js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, Any]) | Null = js.native
    
    /**
      * Fires immediately after the browser loads the object.
      * @param ev The event.
      */
    /* standard dom */
    var onload: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null = js.native
    
    /**
      * Occurs when media data is loaded at the current playback position.
      * @param ev The event.
      */
    /* standard dom */
    var onloadeddata: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null = js.native
    
    /**
      * Occurs when the duration and dimensions of the media have been determined.
      * @param ev The event.
      */
    /* standard dom */
    var onloadedmetadata: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null = js.native
    
    /**
      * Occurs when Internet Explorer begins looking for media data.
      * @param ev The event.
      */
    /* standard dom */
    var onloadstart: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null = js.native
    
    /* standard dom */
    var onlostpointercapture: (js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any]) | Null = js.native
    
    /**
      * Fires when the user clicks the object with either mouse button.
      * @param ev The mouse event.
      */
    /* standard dom */
    var onmousedown: (js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any]) | Null = js.native
    
    /* standard dom */
    var onmouseenter: (js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any]) | Null = js.native
    
    /* standard dom */
    var onmouseleave: (js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any]) | Null = js.native
    
    /**
      * Fires when the user moves the mouse over the object.
      * @param ev The mouse event.
      */
    /* standard dom */
    var onmousemove: (js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any]) | Null = js.native
    
    /**
      * Fires when the user moves the mouse pointer outside the boundaries of the object.
      * @param ev The mouse event.
      */
    /* standard dom */
    var onmouseout: (js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any]) | Null = js.native
    
    /**
      * Fires when the user moves the mouse pointer into the object.
      * @param ev The mouse event.
      */
    /* standard dom */
    var onmouseover: (js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any]) | Null = js.native
    
    /**
      * Fires when the user releases a mouse button while the mouse is over the object.
      * @param ev The mouse event.
      */
    /* standard dom */
    var onmouseup: (js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any]) | Null = js.native
    
    /* standard dom */
    var onpaste: (js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, Any]) | Null = js.native
    
    /**
      * Occurs when playback is paused.
      * @param ev The event.
      */
    /* standard dom */
    var onpause: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null = js.native
    
    /**
      * Occurs when the play method is requested.
      * @param ev The event.
      */
    /* standard dom */
    var onplay: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null = js.native
    
    /**
      * Occurs when the audio or video has started playing.
      * @param ev The event.
      */
    /* standard dom */
    var onplaying: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null = js.native
    
    /* standard dom */
    var onpointercancel: (js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any]) | Null = js.native
    
    /* standard dom */
    var onpointerdown: (js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any]) | Null = js.native
    
    /* standard dom */
    var onpointerenter: (js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any]) | Null = js.native
    
    /* standard dom */
    var onpointerleave: (js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any]) | Null = js.native
    
    /* standard dom */
    var onpointermove: (js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any]) | Null = js.native
    
    /* standard dom */
    var onpointerout: (js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any]) | Null = js.native
    
    /* standard dom */
    var onpointerover: (js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any]) | Null = js.native
    
    /* standard dom */
    var onpointerup: (js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any]) | Null = js.native
    
    /**
      * Occurs to indicate progress while downloading media data.
      * @param ev The event.
      */
    /* standard dom */
    var onprogress: (js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent, Any]) | Null = js.native
    
    /**
      * Occurs when the playback rate is increased or decreased.
      * @param ev The event.
      */
    /* standard dom */
    var onratechange: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null = js.native
    
    /**
      * Fires when the user resets a form.
      * @param ev The event.
      */
    /* standard dom */
    var onreset: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null = js.native
    
    /* standard dom */
    var onresize: (js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, Any]) | Null = js.native
    
    /**
      * Fires when the user repositions the scroll box in the scroll bar on the object.
      * @param ev The event.
      */
    /* standard dom */
    var onscroll: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null = js.native
    
    /* standard dom */
    var onsecuritypolicyviolation: (js.ThisFunction1[/* this */ this.type, /* ev */ SecurityPolicyViolationEvent, Any]) | Null = js.native
    
    /**
      * Occurs when the seek operation ends.
      * @param ev The event.
      */
    /* standard dom */
    var onseeked: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null = js.native
    
    /**
      * Occurs when the current playback position is moved.
      * @param ev The event.
      */
    /* standard dom */
    var onseeking: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null = js.native
    
    /**
      * Fires when the current selection changes.
      * @param ev The event.
      */
    /* standard dom */
    var onselect: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null = js.native
    
    /* standard dom */
    var onselectionchange: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null = js.native
    
    /* standard dom */
    var onselectstart: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null = js.native
    
    /* standard dom */
    var onslotchange: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null = js.native
    
    /**
      * Occurs when the download has stopped.
      * @param ev The event.
      */
    /* standard dom */
    var onstalled: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null = js.native
    
    /* standard dom */
    var onsubmit: (js.ThisFunction1[/* this */ this.type, /* ev */ SubmitEvent, Any]) | Null = js.native
    
    /**
      * Occurs if the load operation has been intentionally halted.
      * @param ev The event.
      */
    /* standard dom */
    var onsuspend: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null = js.native
    
    /**
      * Occurs to indicate the current playback position.
      * @param ev The event.
      */
    /* standard dom */
    var ontimeupdate: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null = js.native
    
    /* standard dom */
    var ontoggle: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null = js.native
    
    /* standard dom */
    var ontouchcancel: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, Any]) | Null] = js.native
    
    /* standard dom */
    var ontouchend: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, Any]) | Null] = js.native
    
    /* standard dom */
    var ontouchmove: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, Any]) | Null] = js.native
    
    /* standard dom */
    var ontouchstart: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, Any]) | Null] = js.native
    
    /* standard dom */
    var ontransitioncancel: (js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, Any]) | Null = js.native
    
    /* standard dom */
    var ontransitionend: (js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, Any]) | Null = js.native
    
    /* standard dom */
    var ontransitionrun: (js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, Any]) | Null = js.native
    
    /* standard dom */
    var ontransitionstart: (js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, Any]) | Null = js.native
    
    /**
      * Occurs when the volume is changed, or playback is muted or unmuted.
      * @param ev The event.
      */
    /* standard dom */
    var onvolumechange: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null = js.native
    
    /**
      * Occurs when playback stops because the next frame of a video resource is not available.
      * @param ev The event.
      */
    /* standard dom */
    var onwaiting: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null = js.native
    
    /** @deprecated This is a legacy alias of `onanimationend`. */
    /* standard dom */
    var onwebkitanimationend: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null = js.native
    
    /** @deprecated This is a legacy alias of `onanimationiteration`. */
    /* standard dom */
    var onwebkitanimationiteration: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null = js.native
    
    /** @deprecated This is a legacy alias of `onanimationstart`. */
    /* standard dom */
    var onwebkitanimationstart: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null = js.native
    
    /** @deprecated This is a legacy alias of `ontransitionend`. */
    /* standard dom */
    var onwebkittransitionend: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null = js.native
    
    /* standard dom */
    var onwheel: (js.ThisFunction1[/* this */ this.type, /* ev */ WheelEvent, Any]) | Null = js.native
    
    /* standard dom */
    var outerHTML: String = js.native
    
    /* standard dom */
    var outerText: String = js.native
    
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
    val previousElementSibling: org.scalajs.dom.Element | Null = js.native
    
    /** Returns the previous sibling. */
    /* standard dom */
    val previousSibling: ChildNode | Null = js.native
    
    /* standard dom */
    def querySelector[E /* <: org.scalajs.dom.Element */](selectors: String): E | Null = js.native
    
    /* standard dom */
    def querySelectorAll[E /* <: org.scalajs.dom.Element */](selectors: String): NodeList[E & Node] = js.native
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
    def querySelectorAll_b(selectors: b): NodeList[HTMLElement & Node] = js.native
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
    def querySelectorAll_p(selectors: p): NodeList[HTMLParagraphElement & Node] = js.native
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
    def querySelectorAll_style(selectors: typingsJapgolly.cookieclicker.cookieclickerStrings.style): NodeList[HTMLStyleElement & Node] = js.native
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
    def querySelector_b(selectors: b): HTMLElement | Null = js.native
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
    def querySelector_p(selectors: p): HTMLParagraphElement | Null = js.native
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
    def querySelector_style(selectors: typingsJapgolly.cookieclicker.cookieclickerStrings.style): HTMLStyleElement | Null = js.native
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
    @JSName("removeEventListener")
    def removeEventListener_abort(`type`: abort, listener: js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_abort(
      `type`: abort,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_abort(
      `type`: abort,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_animationcancel(
      `type`: animationcancel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, Any]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_animationcancel(
      `type`: animationcancel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_animationcancel(
      `type`: animationcancel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_animationend(
      `type`: animationend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, Any]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_animationend(
      `type`: animationend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_animationend(
      `type`: animationend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_animationiteration(
      `type`: animationiteration,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, Any]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_animationiteration(
      `type`: animationiteration,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_animationiteration(
      `type`: animationiteration,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_animationstart(
      `type`: animationstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, Any]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_animationstart(
      `type`: animationstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_animationstart(
      `type`: animationstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_auxclick(`type`: auxclick, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_auxclick(
      `type`: auxclick,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_auxclick(
      `type`: auxclick,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_beforeinput(`type`: beforeinput, listener: js.ThisFunction1[/* this */ this.type, /* ev */ InputEvent, Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_beforeinput(
      `type`: beforeinput,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ InputEvent, Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_beforeinput(
      `type`: beforeinput,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ InputEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_blur(`type`: blur, listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_blur(
      `type`: blur,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_blur(
      `type`: blur,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_canplay(`type`: canplay, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_canplay(
      `type`: canplay,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_canplay(
      `type`: canplay,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_canplaythrough(`type`: canplaythrough, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_canplaythrough(
      `type`: canplaythrough,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_canplaythrough(
      `type`: canplaythrough,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_change(`type`: change, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_change(
      `type`: change,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_change(
      `type`: change,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_click(`type`: click, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_click(
      `type`: click,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_click(
      `type`: click,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_close(`type`: close, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_close(
      `type`: close,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_close(
      `type`: close,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_compositionend(
      `type`: compositionend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CompositionEvent, Any]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_compositionend(
      `type`: compositionend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CompositionEvent, Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_compositionend(
      `type`: compositionend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CompositionEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_compositionstart(
      `type`: compositionstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CompositionEvent, Any]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_compositionstart(
      `type`: compositionstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CompositionEvent, Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_compositionstart(
      `type`: compositionstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CompositionEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_compositionupdate(
      `type`: compositionupdate,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CompositionEvent, Any]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_compositionupdate(
      `type`: compositionupdate,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CompositionEvent, Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_compositionupdate(
      `type`: compositionupdate,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CompositionEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_contextmenu(`type`: contextmenu, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_contextmenu(
      `type`: contextmenu,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_contextmenu(
      `type`: contextmenu,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_copy(`type`: copy, listener: js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_copy(
      `type`: copy,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_copy(
      `type`: copy,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_cuechange(`type`: cuechange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_cuechange(
      `type`: cuechange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_cuechange(
      `type`: cuechange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_cut(`type`: cut, listener: js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_cut(
      `type`: cut,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_cut(
      `type`: cut,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_dblclick(`type`: dblclick, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_dblclick(
      `type`: dblclick,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_dblclick(
      `type`: dblclick,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_drag(`type`: drag, listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_drag(
      `type`: drag,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_drag(
      `type`: drag,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_dragend(`type`: dragend, listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_dragend(
      `type`: dragend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_dragend(
      `type`: dragend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_dragenter(`type`: dragenter, listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_dragenter(
      `type`: dragenter,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_dragenter(
      `type`: dragenter,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_dragleave(`type`: dragleave, listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_dragleave(
      `type`: dragleave,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_dragleave(
      `type`: dragleave,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_dragover(`type`: dragover, listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_dragover(
      `type`: dragover,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_dragover(
      `type`: dragover,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_dragstart(`type`: dragstart, listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_dragstart(
      `type`: dragstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_dragstart(
      `type`: dragstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_drop(`type`: drop, listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_drop(
      `type`: drop,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_drop(
      `type`: drop,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_durationchange(`type`: durationchange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_durationchange(
      `type`: durationchange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_durationchange(
      `type`: durationchange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_emptied(`type`: emptied, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_emptied(
      `type`: emptied,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_emptied(
      `type`: emptied,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_ended(`type`: ended, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_ended(
      `type`: ended,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_ended(
      `type`: ended,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_error(`type`: error, listener: js.ThisFunction1[/* this */ this.type, /* ev */ ErrorEvent, Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_error(
      `type`: error,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ ErrorEvent, Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_error(
      `type`: error,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ ErrorEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_focus(`type`: focus, listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_focus(
      `type`: focus,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_focus(
      `type`: focus,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_focusin(`type`: focusin, listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_focusin(
      `type`: focusin,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_focusin(
      `type`: focusin,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_focusout(`type`: focusout, listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_focusout(
      `type`: focusout,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_focusout(
      `type`: focusout,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_formdata(`type`: formdata, listener: js.ThisFunction1[/* this */ this.type, /* ev */ FormDataEvent, Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_formdata(
      `type`: formdata,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ FormDataEvent, Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_formdata(
      `type`: formdata,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ FormDataEvent, Any],
      options: Boolean
    ): Unit = js.native
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
    @JSName("removeEventListener")
    def removeEventListener_gotpointercapture(
      `type`: gotpointercapture,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_gotpointercapture(
      `type`: gotpointercapture,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_gotpointercapture(
      `type`: gotpointercapture,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_input(`type`: input, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_input(
      `type`: input,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_input(
      `type`: input,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_invalid(`type`: invalid, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_invalid(
      `type`: invalid,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_invalid(
      `type`: invalid,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_keydown(`type`: keydown, listener: js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_keydown(
      `type`: keydown,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_keydown(
      `type`: keydown,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_keypress(`type`: keypress, listener: js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_keypress(
      `type`: keypress,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_keypress(
      `type`: keypress,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_keyup(`type`: keyup, listener: js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_keyup(
      `type`: keyup,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_keyup(
      `type`: keyup,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_load(`type`: load, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_load(
      `type`: load,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_load(
      `type`: load,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_loadeddata(`type`: loadeddata, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_loadeddata(
      `type`: loadeddata,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_loadeddata(
      `type`: loadeddata,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_loadedmetadata(`type`: loadedmetadata, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_loadedmetadata(
      `type`: loadedmetadata,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_loadedmetadata(
      `type`: loadedmetadata,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_loadstart(`type`: loadstart, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_loadstart(
      `type`: loadstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_loadstart(
      `type`: loadstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_lostpointercapture(
      `type`: lostpointercapture,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_lostpointercapture(
      `type`: lostpointercapture,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_lostpointercapture(
      `type`: lostpointercapture,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_mousedown(`type`: mousedown, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_mousedown(
      `type`: mousedown,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_mousedown(
      `type`: mousedown,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_mouseenter(`type`: mouseenter, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_mouseenter(
      `type`: mouseenter,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_mouseenter(
      `type`: mouseenter,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_mouseleave(`type`: mouseleave, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_mouseleave(
      `type`: mouseleave,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_mouseleave(
      `type`: mouseleave,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_mousemove(`type`: mousemove, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_mousemove(
      `type`: mousemove,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_mousemove(
      `type`: mousemove,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_mouseout(`type`: mouseout, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_mouseout(
      `type`: mouseout,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_mouseout(
      `type`: mouseout,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_mouseover(`type`: mouseover, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_mouseover(
      `type`: mouseover,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_mouseover(
      `type`: mouseover,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_mouseup(`type`: mouseup, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_mouseup(
      `type`: mouseup,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_mouseup(
      `type`: mouseup,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_paste(`type`: paste, listener: js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_paste(
      `type`: paste,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_paste(
      `type`: paste,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pause(`type`: pause, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pause(
      `type`: pause,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pause(
      `type`: pause,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_play(`type`: play, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_play(
      `type`: play,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_play(
      `type`: play,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_playing(`type`: playing, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_playing(
      `type`: playing,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_playing(
      `type`: playing,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pointercancel(
      `type`: pointercancel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pointercancel(
      `type`: pointercancel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pointercancel(
      `type`: pointercancel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pointerdown(`type`: pointerdown, listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pointerdown(
      `type`: pointerdown,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pointerdown(
      `type`: pointerdown,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pointerenter(`type`: pointerenter, listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pointerenter(
      `type`: pointerenter,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pointerenter(
      `type`: pointerenter,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pointerleave(`type`: pointerleave, listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pointerleave(
      `type`: pointerleave,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pointerleave(
      `type`: pointerleave,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pointermove(`type`: pointermove, listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pointermove(
      `type`: pointermove,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pointermove(
      `type`: pointermove,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pointerout(`type`: pointerout, listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pointerout(
      `type`: pointerout,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pointerout(
      `type`: pointerout,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pointerover(`type`: pointerover, listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pointerover(
      `type`: pointerover,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pointerover(
      `type`: pointerover,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pointerup(`type`: pointerup, listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pointerup(
      `type`: pointerup,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pointerup(
      `type`: pointerup,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_progress(`type`: progress, listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent, Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_progress(
      `type`: progress,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent, Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_progress(
      `type`: progress,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_ratechange(`type`: ratechange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_ratechange(
      `type`: ratechange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_ratechange(
      `type`: ratechange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_reset(`type`: reset, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_reset(
      `type`: reset,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_reset(
      `type`: reset,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_resize(`type`: resize, listener: js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_resize(
      `type`: resize,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_resize(
      `type`: resize,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_scroll(`type`: scroll, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_scroll(
      `type`: scroll,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_scroll(
      `type`: scroll,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_securitypolicyviolation(
      `type`: securitypolicyviolation,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ SecurityPolicyViolationEvent, Any]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_securitypolicyviolation(
      `type`: securitypolicyviolation,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ SecurityPolicyViolationEvent, Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_securitypolicyviolation(
      `type`: securitypolicyviolation,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ SecurityPolicyViolationEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_seeked(`type`: seeked, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_seeked(
      `type`: seeked,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_seeked(
      `type`: seeked,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_seeking(`type`: seeking, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_seeking(
      `type`: seeking,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_seeking(
      `type`: seeking,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_select(`type`: select, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_select(
      `type`: select,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_select(
      `type`: select,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_selectionchange(`type`: selectionchange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_selectionchange(
      `type`: selectionchange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_selectionchange(
      `type`: selectionchange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_selectstart(`type`: selectstart, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_selectstart(
      `type`: selectstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_selectstart(
      `type`: selectstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_slotchange(`type`: slotchange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_slotchange(
      `type`: slotchange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_slotchange(
      `type`: slotchange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_stalled(`type`: stalled, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_stalled(
      `type`: stalled,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_stalled(
      `type`: stalled,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_submit(`type`: submit, listener: js.ThisFunction1[/* this */ this.type, /* ev */ SubmitEvent, Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_submit(
      `type`: submit,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ SubmitEvent, Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_submit(
      `type`: submit,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ SubmitEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_suspend(`type`: suspend, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_suspend(
      `type`: suspend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_suspend(
      `type`: suspend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_timeupdate(`type`: timeupdate, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_timeupdate(
      `type`: timeupdate,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_timeupdate(
      `type`: timeupdate,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_toggle(`type`: toggle, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_toggle(
      `type`: toggle,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_toggle(
      `type`: toggle,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_touchcancel(`type`: touchcancel, listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_touchcancel(
      `type`: touchcancel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_touchcancel(
      `type`: touchcancel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_touchend(`type`: touchend, listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_touchend(
      `type`: touchend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_touchend(
      `type`: touchend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_touchmove(`type`: touchmove, listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_touchmove(
      `type`: touchmove,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_touchmove(
      `type`: touchmove,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_touchstart(`type`: touchstart, listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_touchstart(
      `type`: touchstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_touchstart(
      `type`: touchstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_transitioncancel(
      `type`: transitioncancel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, Any]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_transitioncancel(
      `type`: transitioncancel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_transitioncancel(
      `type`: transitioncancel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_transitionend(
      `type`: transitionend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, Any]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_transitionend(
      `type`: transitionend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_transitionend(
      `type`: transitionend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_transitionrun(
      `type`: transitionrun,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, Any]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_transitionrun(
      `type`: transitionrun,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_transitionrun(
      `type`: transitionrun,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_transitionstart(
      `type`: transitionstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, Any]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_transitionstart(
      `type`: transitionstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_transitionstart(
      `type`: transitionstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_volumechange(`type`: volumechange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_volumechange(
      `type`: volumechange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_volumechange(
      `type`: volumechange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_waiting(`type`: waiting, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_waiting(
      `type`: waiting,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_waiting(
      `type`: waiting,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_webkitanimationend(`type`: webkitanimationend, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_webkitanimationend(
      `type`: webkitanimationend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_webkitanimationend(
      `type`: webkitanimationend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_webkitanimationiteration(
      `type`: webkitanimationiteration,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_webkitanimationiteration(
      `type`: webkitanimationiteration,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_webkitanimationiteration(
      `type`: webkitanimationiteration,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_webkitanimationstart(
      `type`: webkitanimationstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_webkitanimationstart(
      `type`: webkitanimationstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_webkitanimationstart(
      `type`: webkitanimationstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_webkittransitionend(`type`: webkittransitionend, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_webkittransitionend(
      `type`: webkittransitionend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_webkittransitionend(
      `type`: webkittransitionend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_wheel(`type`: wheel, listener: js.ThisFunction1[/* this */ this.type, /* ev */ WheelEvent, Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_wheel(
      `type`: wheel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ WheelEvent, Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_wheel(
      `type`: wheel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ WheelEvent, Any],
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
    
    /* standard dom */
    var spellcheck: Boolean = js.native
    
    /* standard dom */
    val style: CSSStyleDeclaration = js.native
    
    /* standard dom */
    var tabIndex: Double = js.native
    
    /** Returns the HTML-uppercased qualified name. */
    /* standard dom */
    val tagName: String = js.native
    
    /* standard dom */
    var textContent: String | Null = js.native
    
    /* standard dom */
    var title: String = js.native
    
    /* standard dom */
    def toBlob(callback: BlobCallback): Unit = js.native
    def toBlob(callback: BlobCallback, `type`: String): Unit = js.native
    def toBlob(callback: BlobCallback, `type`: String, quality: Any): Unit = js.native
    def toBlob(callback: BlobCallback, `type`: Unit, quality: Any): Unit = js.native
    
    /**
      * Returns the content of the current canvas as an image that you can use as a source for another canvas or an HTML element.
      * @param type The standard MIME type for the image format to return. If you do not specify this parameter, the default value is a PNG format image.
      */
    /* standard dom */
    def toDataURL(): String = js.native
    def toDataURL(`type`: String): String = js.native
    def toDataURL(`type`: String, quality: Any): String = js.native
    def toDataURL(`type`: Unit, quality: Any): String = js.native
    
    /**
      * If force is not given, "toggles" qualifiedName, removing it if it is present and adding it if it is not present. If force is true, adds qualifiedName. If force is false, removes qualifiedName.
      *
      * Returns true if qualifiedName is now present, and false otherwise.
      */
    /* standard dom */
    def toggleAttribute(qualifiedName: String): Boolean = js.native
    def toggleAttribute(qualifiedName: String, force: Boolean): Boolean = js.native
    
    /* standard dom */
    var translate: Boolean = js.native
    
    /** @deprecated This is a legacy alias of `matches`. */
    /* standard dom */
    def webkitMatchesSelector(selectors: String): Boolean = js.native
    
    /** Gets or sets the width of a canvas element on a document. */
    /* standard dom */
    var width: Double & `8` = js.native
  }
  
  trait Language extends StObject {
    
    /**
      * Unused
      */
    var language: String
    
    /**
      * A string to evaluate when figuring out what form of plurality to use
      */
    var `plural-forms`: String
  }
  object Language {
    
    inline def apply(language: String, `plural-forms`: String): typingsJapgolly.cookieclicker.anon.Language = {
      val __obj = js.Dynamic.literal(language = language.asInstanceOf[js.Any])
      __obj.updateDynamic("plural-forms")(`plural-forms`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.cookieclicker.anon.Language]
    }
    
    extension [Self <: typingsJapgolly.cookieclicker.anon.Language](x: Self) {
      
      inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      inline def `setPlural-forms`(value: String): Self = StObject.set(x, "plural-forms", value.asInstanceOf[js.Any])
    }
  }
  
  trait PlayersN extends StObject {
    
    var playersN: Double
  }
  object PlayersN {
    
    inline def apply(playersN: Double): PlayersN = {
      val __obj = js.Dynamic.literal(playersN = playersN.asInstanceOf[js.Any])
      __obj.asInstanceOf[PlayersN]
    }
    
    extension [Self <: PlayersN](x: Self) {
      
      inline def setPlayersN(value: Double): Self = StObject.set(x, "playersN", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TypeofMusic extends StObject {
    
    def addTrack(name: String, author: String, url: String): Unit = js.native
    
    var context: AudioContext = js.native
    
    def cue(cue: String): Unit = js.native
    def cue(cue: String, arg: Any): Unit = js.native
    
    var cues: Record[String, js.Function1[/* arg */ Any, Unit]] = js.native
    
    var filter: BiquadFilterNode = js.native
    
    var gain: GainNode = js.native
    
    def loop(loop: Boolean): Unit = js.native
    
    def loopTrack(name: String): Unit = js.native
    
    var out: BiquadFilterNode = js.native
    
    def pause(): Unit = js.native
    
    def playTrack(name: String, callback: js.Function1[/* track */ Track, Unit]): Unit = js.native
    
    var playing: Boolean = js.native
    
    def setFilter(`val`: Double): Unit = js.native
    def setFilter(`val`: Double, secs: Double): Unit = js.native
    
    def setTime(time: Double): Unit = js.native
    
    def setVolume(`val`: Double): Unit = js.native
    def setVolume(`val`: Double, secs: Double): Unit = js.native
    
    var tracks: Record[String, Track] = js.native
    
    def unpause(): Unit = js.native
  }
  
  trait TypeofSteam extends StObject {
    
    var allowSteamAchievs: Boolean
    
    var cloud: Boolean
    
    var cloudQuota: String
    
    def getMostRecentSave(callback: js.Function1[/* data */ String, Unit]): Unit
    
    def gotAchiev(id: Double): Unit
    
    def grabData(cb: js.Function1[/* data */ PlayersN, Unit]): Unit
    
    def hardReset(): Unit
    
    def hardSave(save: String): Unit
    
    def justLoadedSave(): Unit
    
    def load(callback: SendCallback): Unit
    
    def loadMods(callback: js.Function0[Unit]): js.Promise[Unit]
    
    def logic(T: Double): Unit
    
    var modList: js.Array[Mod]
    
    var mods: Record[String, Mod]
    
    def modsPopup(): Unit
    
    def onImportSave(out: Boolean, save: String): Unit
    
    def onResize(): Unit
    
    def openLink(url: String): Unit
    
    def ping(mes: String): Unit
    
    def purgeCloud(): Unit
    
    def quit(): Unit
    
    def registerMod(mod: typingsJapgolly.cookieclicker.Game.Mod): Unit
    
    def reload(): Unit
    
    def resetAchievs(): Unit
    
    def restoreBackup(): js.Promise[Unit]
    
    def save(str: String): Unit
    
    def saveMods(): Unit
    
    def setFullscreen(`val`: Boolean): Unit
    
    def workshopPopup(): Unit
    
    def writeCloudUI(): String
    
    def writeModUI(): String
  }
  object TypeofSteam {
    
    inline def apply(
      allowSteamAchievs: Boolean,
      cloud: Boolean,
      cloudQuota: String,
      getMostRecentSave: js.Function1[/* data */ String, Unit] => Callback,
      gotAchiev: Double => Callback,
      grabData: js.Function1[/* data */ PlayersN, Unit] => Callback,
      hardReset: Callback,
      hardSave: String => Callback,
      justLoadedSave: Callback,
      load: SendCallback => Callback,
      loadMods: js.Function0[Unit] => js.Promise[Unit],
      logic: Double => Callback,
      modList: js.Array[Mod],
      mods: Record[String, Mod],
      modsPopup: Callback,
      onImportSave: (Boolean, String) => Callback,
      onResize: Callback,
      openLink: String => Callback,
      ping: String => Callback,
      purgeCloud: Callback,
      quit: Callback,
      registerMod: typingsJapgolly.cookieclicker.Game.Mod => Callback,
      reload: Callback,
      resetAchievs: Callback,
      restoreBackup: CallbackTo[js.Promise[Unit]],
      save: String => Callback,
      saveMods: Callback,
      setFullscreen: Boolean => Callback,
      workshopPopup: Callback,
      writeCloudUI: CallbackTo[String],
      writeModUI: CallbackTo[String]
    ): TypeofSteam = {
      val __obj = js.Dynamic.literal(allowSteamAchievs = allowSteamAchievs.asInstanceOf[js.Any], cloud = cloud.asInstanceOf[js.Any], cloudQuota = cloudQuota.asInstanceOf[js.Any], getMostRecentSave = js.Any.fromFunction1((t0: js.Function1[/* data */ String, Unit]) => getMostRecentSave(t0).runNow()), gotAchiev = js.Any.fromFunction1((t0: Double) => gotAchiev(t0).runNow()), grabData = js.Any.fromFunction1((t0: js.Function1[/* data */ PlayersN, Unit]) => grabData(t0).runNow()), hardReset = hardReset.toJsFn, hardSave = js.Any.fromFunction1((t0: String) => hardSave(t0).runNow()), justLoadedSave = justLoadedSave.toJsFn, load = js.Any.fromFunction1((t0: SendCallback) => load(t0).runNow()), loadMods = js.Any.fromFunction1(loadMods), logic = js.Any.fromFunction1((t0: Double) => logic(t0).runNow()), modList = modList.asInstanceOf[js.Any], mods = mods.asInstanceOf[js.Any], modsPopup = modsPopup.toJsFn, onImportSave = js.Any.fromFunction2((t0: Boolean, t1: String) => (onImportSave(t0, t1)).runNow()), onResize = onResize.toJsFn, openLink = js.Any.fromFunction1((t0: String) => openLink(t0).runNow()), ping = js.Any.fromFunction1((t0: String) => ping(t0).runNow()), purgeCloud = purgeCloud.toJsFn, quit = quit.toJsFn, registerMod = js.Any.fromFunction1((t0: typingsJapgolly.cookieclicker.Game.Mod) => registerMod(t0).runNow()), reload = reload.toJsFn, resetAchievs = resetAchievs.toJsFn, restoreBackup = restoreBackup.toJsFn, save = js.Any.fromFunction1((t0: String) => save(t0).runNow()), saveMods = saveMods.toJsFn, setFullscreen = js.Any.fromFunction1((t0: Boolean) => setFullscreen(t0).runNow()), workshopPopup = workshopPopup.toJsFn, writeCloudUI = writeCloudUI.toJsFn, writeModUI = writeModUI.toJsFn)
      __obj.asInstanceOf[TypeofSteam]
    }
    
    extension [Self <: TypeofSteam](x: Self) {
      
      inline def setAllowSteamAchievs(value: Boolean): Self = StObject.set(x, "allowSteamAchievs", value.asInstanceOf[js.Any])
      
      inline def setCloud(value: Boolean): Self = StObject.set(x, "cloud", value.asInstanceOf[js.Any])
      
      inline def setCloudQuota(value: String): Self = StObject.set(x, "cloudQuota", value.asInstanceOf[js.Any])
      
      inline def setGetMostRecentSave(value: js.Function1[/* data */ String, Unit] => Callback): Self = StObject.set(x, "getMostRecentSave", js.Any.fromFunction1((t0: js.Function1[/* data */ String, Unit]) => value(t0).runNow()))
      
      inline def setGotAchiev(value: Double => Callback): Self = StObject.set(x, "gotAchiev", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
      
      inline def setGrabData(value: js.Function1[/* data */ PlayersN, Unit] => Callback): Self = StObject.set(x, "grabData", js.Any.fromFunction1((t0: js.Function1[/* data */ PlayersN, Unit]) => value(t0).runNow()))
      
      inline def setHardReset(value: Callback): Self = StObject.set(x, "hardReset", value.toJsFn)
      
      inline def setHardSave(value: String => Callback): Self = StObject.set(x, "hardSave", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setJustLoadedSave(value: Callback): Self = StObject.set(x, "justLoadedSave", value.toJsFn)
      
      inline def setLoad(value: SendCallback => Callback): Self = StObject.set(x, "load", js.Any.fromFunction1((t0: SendCallback) => value(t0).runNow()))
      
      inline def setLoadMods(value: js.Function0[Unit] => js.Promise[Unit]): Self = StObject.set(x, "loadMods", js.Any.fromFunction1(value))
      
      inline def setLogic(value: Double => Callback): Self = StObject.set(x, "logic", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
      
      inline def setModList(value: js.Array[Mod]): Self = StObject.set(x, "modList", value.asInstanceOf[js.Any])
      
      inline def setModListVarargs(value: Mod*): Self = StObject.set(x, "modList", js.Array(value*))
      
      inline def setMods(value: Record[String, Mod]): Self = StObject.set(x, "mods", value.asInstanceOf[js.Any])
      
      inline def setModsPopup(value: Callback): Self = StObject.set(x, "modsPopup", value.toJsFn)
      
      inline def setOnImportSave(value: (Boolean, String) => Callback): Self = StObject.set(x, "onImportSave", js.Any.fromFunction2((t0: Boolean, t1: String) => (value(t0, t1)).runNow()))
      
      inline def setOnResize(value: Callback): Self = StObject.set(x, "onResize", value.toJsFn)
      
      inline def setOpenLink(value: String => Callback): Self = StObject.set(x, "openLink", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setPing(value: String => Callback): Self = StObject.set(x, "ping", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setPurgeCloud(value: Callback): Self = StObject.set(x, "purgeCloud", value.toJsFn)
      
      inline def setQuit(value: Callback): Self = StObject.set(x, "quit", value.toJsFn)
      
      inline def setRegisterMod(value: typingsJapgolly.cookieclicker.Game.Mod => Callback): Self = StObject.set(x, "registerMod", js.Any.fromFunction1((t0: typingsJapgolly.cookieclicker.Game.Mod) => value(t0).runNow()))
      
      inline def setReload(value: Callback): Self = StObject.set(x, "reload", value.toJsFn)
      
      inline def setResetAchievs(value: Callback): Self = StObject.set(x, "resetAchievs", value.toJsFn)
      
      inline def setRestoreBackup(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "restoreBackup", value.toJsFn)
      
      inline def setSave(value: String => Callback): Self = StObject.set(x, "save", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setSaveMods(value: Callback): Self = StObject.set(x, "saveMods", value.toJsFn)
      
      inline def setSetFullscreen(value: Boolean => Callback): Self = StObject.set(x, "setFullscreen", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
      
      inline def setWorkshopPopup(value: Callback): Self = StObject.set(x, "workshopPopup", value.toJsFn)
      
      inline def setWriteCloudUI(value: CallbackTo[String]): Self = StObject.set(x, "writeCloudUI", value.toJsFn)
      
      inline def setWriteModUI(value: CallbackTo[String]): Self = StObject.set(x, "writeModUI", value.toJsFn)
    }
  }
  
  trait _empty extends StObject {
    
    var `REPLACE ALL`: js.UndefOr[Record[String, String]] = js.undefined
    
    @JSName("")
    var _empty: typingsJapgolly.cookieclicker.anon.Language
  }
  object _empty {
    
    inline def apply(_empty: typingsJapgolly.cookieclicker.anon.Language): _empty = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("")(_empty.asInstanceOf[js.Any])
      __obj.asInstanceOf[_empty]
    }
    
    extension [Self <: _empty](x: Self) {
      
      inline def `setREPLACE ALL`(value: Record[String, String]): Self = StObject.set(x, "REPLACE ALL", value.asInstanceOf[js.Any])
      
      inline def `setREPLACE ALLUndefined`: Self = StObject.set(x, "REPLACE ALL", js.undefined)
      
      inline def set_empty(value: typingsJapgolly.cookieclicker.anon.Language): Self = StObject.set(x, "", value.asInstanceOf[js.Any])
    }
  }
}
