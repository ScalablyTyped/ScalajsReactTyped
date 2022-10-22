package typingsJapgolly.wordpressComponents

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.HTMLInputElement
import org.scalajs.dom.SVGCircleElement
import org.scalajs.dom.SVGGElement
import org.scalajs.dom.SVGPathElement
import org.scalajs.dom.SVGPolygonElement
import org.scalajs.dom.SVGRectElement
import org.scalajs.dom.SVGSVGElement
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.Consumer
import typingsJapgolly.react.mod.HTMLProps
import typingsJapgolly.react.mod.ReactPortal
import typingsJapgolly.react.mod.SVGProps
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.wordpressComponents.anglePickerControlMod.AnglePickerControl.Props
import typingsJapgolly.wordpressComponents.anon.ChildrenReactNode
import typingsJapgolly.wordpressComponents.anon.Fill
import typingsJapgolly.wordpressComponents.anon.`1`
import typingsJapgolly.wordpressComponents.baseControlMod.BaseControl.VisualLabelProps
import typingsJapgolly.wordpressComponents.guideMod.GuideProps
import typingsJapgolly.wordpressComponents.higherOrderWithFocusOutsideMod.HFOComponent
import typingsJapgolly.wordpressComponents.higherOrderWithFocusReturnMod.WFROptions
import typingsJapgolly.wordpressComponents.toolbarGroupMod.ToolbarGroupProps
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`object`
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`var`
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.a
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.abbr
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.address
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.animate
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.animateMotion
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.animateTransform
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.area
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.article
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.aside
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.audio
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.b
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.base
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.bdi
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.bdo
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.big
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.blockquote
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.body
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.br
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.button
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.canvas
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.caption
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.circle
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.cite
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.clipPath
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.code
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.col
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.colgroup
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.data
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.datalist
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.dd
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.defs
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.del
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.desc
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.details
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.dfn
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.dialog
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.div
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.dl
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.dt
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.ellipse
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.em
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.embed
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.feBlend
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.feColorMatrix
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.feComponentTransfer
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.feComposite
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.feConvolveMatrix
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.feDiffuseLighting
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.feDisplacementMap
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.feDistantLight
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.feDropShadow
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.feFlood
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.feFuncA
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.feFuncB
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.feFuncG
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.feFuncR
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.feGaussianBlur
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.feImage
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.feMerge
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.feMergeNode
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.feMorphology
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.feOffset
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.fePointLight
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.feSpecularLighting
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.feSpotLight
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.feTile
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.feTurbulence
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.fieldset
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.figcaption
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.figure
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.filter
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.footer
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.foreignObject
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.form
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.g
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.h1
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.h2
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.h3
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.h4
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.h5
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.h6
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.head
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.header
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.hgroup
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.hr
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.html
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.i
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.iframe
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.image
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.img
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.input
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.ins
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.kbd
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.keygen
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.label
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.legend
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.li
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.line
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.linearGradient
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.link
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.main
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.map
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.mark
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.marker
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.mask
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.menu
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.menuitem
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.meta
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.metadata
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.meter
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.mpath
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.nav
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.noindex
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.noscript
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.ol
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.optgroup
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.option
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.output
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.p
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.param
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.path
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.pattern
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.picture
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.polygon
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.polyline
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.pre
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.progress
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.q
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.radialGradient
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.rect
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.rp
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.rt
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.ruby
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.s
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.samp
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.script
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.section
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.select
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.slot
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.small
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.source
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.span
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.stop
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.strong
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.style
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.sub
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.summary
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.sup
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.svg
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.switch
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.symbol
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.table
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.tbody
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.td
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.template
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.text
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.textPath
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.textarea
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.tfoot
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.th
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.thead
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.time
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.title
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.tr
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.track
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.tspan
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.u
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.ul
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.use
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.video
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.view
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.wbr
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.webview
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@wordpress/components", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@wordpress/components", "AnglePickerControl")
  @js.native
  val AnglePickerControl: ComponentType[Props] = js.native
  
  @JSImport("@wordpress/components", "Animate")
  @js.native
  val Animate: ComponentType[typingsJapgolly.wordpressComponents.animateMod.Animate.Props] = js.native
  
  // tslint:disable-next-line:no-unnecessary-generics
  inline def Autocomplete[T](props: typingsJapgolly.wordpressComponents.autocompleteMod.Autocomplete.Props[T]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Autocomplete")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  object BaseControl {
    
    inline def apply(props: typingsJapgolly.wordpressComponents.baseControlMod.BaseControl.Props): Element = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("@wordpress/components", "BaseControl")
    @js.native
    val ^ : js.Any = js.native
    
    inline def VisualLabel(props: VisualLabelProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("VisualLabel")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  }
  
  @JSImport("@wordpress/components", "BlockQuotation")
  @js.native
  val BlockQuotation: blockquote = js.native
  
  @JSImport("@wordpress/components", "Button")
  @js.native
  val Button: ComponentType[typingsJapgolly.wordpressComponents.buttonMod.Button.Props] = js.native
  
  @JSImport("@wordpress/components", "ButtonGroup")
  @js.native
  val ButtonGroup: ComponentType[typingsJapgolly.wordpressComponents.buttonGroupMod.ButtonGroup.Props] = js.native
  
  // tslint:disable-next-line no-unnecessary-generics
  inline def Card(
    props: typingsJapgolly.wordpressComponents.cardMod.Card.Props[
      a | abbr | address | animate | animateMotion | animateTransform | area | article | aside | audio | b | base | bdi | bdo | big | blockquote | body | br | button | canvas | caption | circle | cite | clipPath | code | col | colgroup | data | datalist | dd | defs | del | desc | details | dfn | dialog | div | dl | dt | ellipse | em | embed | feBlend | feColorMatrix | feComponentTransfer | feComposite | feConvolveMatrix | feDiffuseLighting | feDisplacementMap | feDistantLight | feDropShadow | feFlood | feFuncA | feFuncB | feFuncG | feFuncR | feGaussianBlur | feImage | feMerge | feMergeNode | feMorphology | feOffset | fePointLight | feSpecularLighting | feSpotLight | feTile | feTurbulence | fieldset | figcaption | figure | filter | footer | foreignObject | form | g | h1 | h2 | h3 | h4 | h5 | h6 | head | header | hgroup | hr | html | i | iframe | image | img | input | ins | kbd | keygen | label | legend | li | line | linearGradient | link | main | map | mark | marker | mask | menu | menuitem | meta | metadata | meter | mpath | nav | noindex | noscript | `object` | ol | optgroup | option | output | p | param | path | pattern | picture | polygon | polyline | pre | progress | q | radialGradient | rect | rp | rt | ruby | s | samp | script | section | select | slot | small | source | span | stop | strong | style | sub | summary | sup | svg | switch | symbol | table | tbody | td | template | text | textPath | textarea | tfoot | th | thead | time | title | tr | track | tspan | u | ul | use | `var` | video | view | wbr | webview
    ]
  ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Card")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  // tslint:disable-next-line no-unnecessary-generics
  inline def CardBody(
    props: typingsJapgolly.wordpressComponents.cardBodyMod.CardBody.Props[
      a | abbr | address | animate | animateMotion | animateTransform | area | article | aside | audio | b | base | bdi | bdo | big | blockquote | body | br | button | canvas | caption | circle | cite | clipPath | code | col | colgroup | data | datalist | dd | defs | del | desc | details | dfn | dialog | div | dl | dt | ellipse | em | embed | feBlend | feColorMatrix | feComponentTransfer | feComposite | feConvolveMatrix | feDiffuseLighting | feDisplacementMap | feDistantLight | feDropShadow | feFlood | feFuncA | feFuncB | feFuncG | feFuncR | feGaussianBlur | feImage | feMerge | feMergeNode | feMorphology | feOffset | fePointLight | feSpecularLighting | feSpotLight | feTile | feTurbulence | fieldset | figcaption | figure | filter | footer | foreignObject | form | g | h1 | h2 | h3 | h4 | h5 | h6 | head | header | hgroup | hr | html | i | iframe | image | img | input | ins | kbd | keygen | label | legend | li | line | linearGradient | link | main | map | mark | marker | mask | menu | menuitem | meta | metadata | meter | mpath | nav | noindex | noscript | `object` | ol | optgroup | option | output | p | param | path | pattern | picture | polygon | polyline | pre | progress | q | radialGradient | rect | rp | rt | ruby | s | samp | script | section | select | slot | small | source | span | stop | strong | style | sub | summary | sup | svg | switch | symbol | table | tbody | td | template | text | textPath | textarea | tfoot | th | thead | time | title | tr | track | tspan | u | ul | use | `var` | video | view | wbr | webview
    ]
  ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("CardBody")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  // tslint:disable:no-unnecessary-generics
  inline def CardDivider(
    props: typingsJapgolly.wordpressComponents.cardDividerMod.CardDivider.Props[
      a | abbr | address | animate | animateMotion | animateTransform | area | article | aside | audio | b | base | bdi | bdo | big | blockquote | body | br | button | canvas | caption | circle | cite | clipPath | code | col | colgroup | data | datalist | dd | defs | del | desc | details | dfn | dialog | div | dl | dt | ellipse | em | embed | feBlend | feColorMatrix | feComponentTransfer | feComposite | feConvolveMatrix | feDiffuseLighting | feDisplacementMap | feDistantLight | feDropShadow | feFlood | feFuncA | feFuncB | feFuncG | feFuncR | feGaussianBlur | feImage | feMerge | feMergeNode | feMorphology | feOffset | fePointLight | feSpecularLighting | feSpotLight | feTile | feTurbulence | fieldset | figcaption | figure | filter | footer | foreignObject | form | g | h1 | h2 | h3 | h4 | h5 | h6 | head | header | hgroup | hr | html | i | iframe | image | img | input | ins | kbd | keygen | label | legend | li | line | linearGradient | link | main | map | mark | marker | mask | menu | menuitem | meta | metadata | meter | mpath | nav | noindex | noscript | `object` | ol | optgroup | option | output | p | param | path | pattern | picture | polygon | polyline | pre | progress | q | radialGradient | rect | rp | rt | ruby | s | samp | script | section | select | slot | small | source | span | stop | strong | style | sub | summary | sup | svg | switch | symbol | table | tbody | td | template | text | textPath | textarea | tfoot | th | thead | time | title | tr | track | tspan | u | ul | use | `var` | video | view | wbr | webview
    ]
  ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("CardDivider")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  // tslint:disable-next-line no-unnecessary-generics
  inline def CardFooter(
    props: typingsJapgolly.wordpressComponents.cardFooterMod.CardFooter.Props[
      a | abbr | address | animate | animateMotion | animateTransform | area | article | aside | audio | b | base | bdi | bdo | big | blockquote | body | br | button | canvas | caption | circle | cite | clipPath | code | col | colgroup | data | datalist | dd | defs | del | desc | details | dfn | dialog | div | dl | dt | ellipse | em | embed | feBlend | feColorMatrix | feComponentTransfer | feComposite | feConvolveMatrix | feDiffuseLighting | feDisplacementMap | feDistantLight | feDropShadow | feFlood | feFuncA | feFuncB | feFuncG | feFuncR | feGaussianBlur | feImage | feMerge | feMergeNode | feMorphology | feOffset | fePointLight | feSpecularLighting | feSpotLight | feTile | feTurbulence | fieldset | figcaption | figure | filter | footer | foreignObject | form | g | h1 | h2 | h3 | h4 | h5 | h6 | head | header | hgroup | hr | html | i | iframe | image | img | input | ins | kbd | keygen | label | legend | li | line | linearGradient | link | main | map | mark | marker | mask | menu | menuitem | meta | metadata | meter | mpath | nav | noindex | noscript | `object` | ol | optgroup | option | output | p | param | path | pattern | picture | polygon | polyline | pre | progress | q | radialGradient | rect | rp | rt | ruby | s | samp | script | section | select | slot | small | source | span | stop | strong | style | sub | summary | sup | svg | switch | symbol | table | tbody | td | template | text | textPath | textarea | tfoot | th | thead | time | title | tr | track | tspan | u | ul | use | `var` | video | view | wbr | webview
    ]
  ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("CardFooter")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  // tslint:disable-next-line no-unnecessary-generics
  inline def CardHeader(
    props: typingsJapgolly.wordpressComponents.cardHeaderMod.CardHeader.Props[
      a | abbr | address | animate | animateMotion | animateTransform | area | article | aside | audio | b | base | bdi | bdo | big | blockquote | body | br | button | canvas | caption | circle | cite | clipPath | code | col | colgroup | data | datalist | dd | defs | del | desc | details | dfn | dialog | div | dl | dt | ellipse | em | embed | feBlend | feColorMatrix | feComponentTransfer | feComposite | feConvolveMatrix | feDiffuseLighting | feDisplacementMap | feDistantLight | feDropShadow | feFlood | feFuncA | feFuncB | feFuncG | feFuncR | feGaussianBlur | feImage | feMerge | feMergeNode | feMorphology | feOffset | fePointLight | feSpecularLighting | feSpotLight | feTile | feTurbulence | fieldset | figcaption | figure | filter | footer | foreignObject | form | g | h1 | h2 | h3 | h4 | h5 | h6 | head | header | hgroup | hr | html | i | iframe | image | img | input | ins | kbd | keygen | label | legend | li | line | linearGradient | link | main | map | mark | marker | mask | menu | menuitem | meta | metadata | meter | mpath | nav | noindex | noscript | `object` | ol | optgroup | option | output | p | param | path | pattern | picture | polygon | polyline | pre | progress | q | radialGradient | rect | rp | rt | ruby | s | samp | script | section | select | slot | small | source | span | stop | strong | style | sub | summary | sup | svg | switch | symbol | table | tbody | td | template | text | textPath | textarea | tfoot | th | thead | time | title | tr | track | tspan | u | ul | use | `var` | video | view | wbr | webview
    ]
  ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("CardHeader")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  // tslint:disable-next-line no-unnecessary-generics
  inline def CardMedia(
    props: typingsJapgolly.wordpressComponents.cardMediaMod.CardMedia.Props[
      a | abbr | address | animate | animateMotion | animateTransform | area | article | aside | audio | b | base | bdi | bdo | big | blockquote | body | br | button | canvas | caption | circle | cite | clipPath | code | col | colgroup | data | datalist | dd | defs | del | desc | details | dfn | dialog | div | dl | dt | ellipse | em | embed | feBlend | feColorMatrix | feComponentTransfer | feComposite | feConvolveMatrix | feDiffuseLighting | feDisplacementMap | feDistantLight | feDropShadow | feFlood | feFuncA | feFuncB | feFuncG | feFuncR | feGaussianBlur | feImage | feMerge | feMergeNode | feMorphology | feOffset | fePointLight | feSpecularLighting | feSpotLight | feTile | feTurbulence | fieldset | figcaption | figure | filter | footer | foreignObject | form | g | h1 | h2 | h3 | h4 | h5 | h6 | head | header | hgroup | hr | html | i | iframe | image | img | input | ins | kbd | keygen | label | legend | li | line | linearGradient | link | main | map | mark | marker | mask | menu | menuitem | meta | metadata | meter | mpath | nav | noindex | noscript | `object` | ol | optgroup | option | output | p | param | path | pattern | picture | polygon | polyline | pre | progress | q | radialGradient | rect | rp | rt | ruby | s | samp | script | section | select | slot | small | source | span | stop | strong | style | sub | summary | sup | svg | switch | symbol | table | tbody | td | template | text | textPath | textarea | tfoot | th | thead | time | title | tr | track | tspan | u | ul | use | `var` | video | view | wbr | webview
    ]
  ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("CardMedia")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@wordpress/components", "CheckboxControl")
  @js.native
  val CheckboxControl: ComponentType[typingsJapgolly.wordpressComponents.checkboxControlMod.CheckboxControl.Props] = js.native
  
  @JSImport("@wordpress/components", "Circle")
  @js.native
  val Circle: ComponentType[SVGProps[SVGCircleElement]] = js.native
  
  @JSImport("@wordpress/components", "ClipboardButton")
  @js.native
  val ClipboardButton: ComponentType[typingsJapgolly.wordpressComponents.clipboardButtonMod.ClipboardButton.Props] = js.native
  
  @JSImport("@wordpress/components", "ColorIndicator")
  @js.native
  val ColorIndicator: ComponentType[typingsJapgolly.wordpressComponents.colorIndicatorMod.ColorIndicator.Props] = js.native
  
  @JSImport("@wordpress/components", "ColorPalette")
  @js.native
  val ColorPalette: ComponentType[typingsJapgolly.wordpressComponents.colorPaletteMod.ColorPalette.Props] = js.native
  
  @JSImport("@wordpress/components", "ColorPicker")
  @js.native
  val ColorPicker: ComponentType[typingsJapgolly.wordpressComponents.colorPickerMod.ColorPicker.Props] = js.native
  
  @JSImport("@wordpress/components", "ComboboxControl")
  @js.native
  val ComboboxControl: ComponentType[typingsJapgolly.wordpressComponents.comboboxControlMod.ComboboxControl.Props] = js.native
  
  @JSImport("@wordpress/components", "CustomSelectControl")
  @js.native
  val CustomSelectControl: ComponentType[
    typingsJapgolly.wordpressComponents.customSelectControlMod.CustomSelectControl.Props
  ] = js.native
  
  @JSImport("@wordpress/components", "Dashicon")
  @js.native
  val Dashicon: ComponentType[typingsJapgolly.wordpressComponents.dashiconMod.Dashicon.Props] = js.native
  
  @JSImport("@wordpress/components", "DatePicker")
  @js.native
  val DatePicker: ComponentType[typingsJapgolly.wordpressComponents.dateTimeDateMod.DatePicker.Props] = js.native
  
  @JSImport("@wordpress/components", "DateTimePicker")
  @js.native
  val DateTimePicker: ComponentType[typingsJapgolly.wordpressComponents.dateTimeMod.DateTimePicker.Props] = js.native
  
  object Disabled {
    
    inline def apply(props: typingsJapgolly.wordpressComponents.disabledMod.Disabled.Props): Element = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("@wordpress/components", "Disabled")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@wordpress/components", "Disabled.Consumer")
    @js.native
    def Consumer: typingsJapgolly.react.mod.Consumer[Boolean] = js.native
    inline def Consumer_=(x: Consumer[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Consumer")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@wordpress/components", "Draggable")
  @js.native
  val Draggable: ComponentType[typingsJapgolly.wordpressComponents.draggableMod.Draggable.Props] = js.native
  
  @JSImport("@wordpress/components", "DropZone")
  @js.native
  val DropZone: ComponentType[typingsJapgolly.wordpressComponents.dropZoneMod.DropZone.Props] = js.native
  
  @JSImport("@wordpress/components", "DropZoneProvider")
  @js.native
  val DropZoneProvider: ComponentType[ChildrenReactNode] = js.native
  
  @JSImport("@wordpress/components", "Dropdown")
  @js.native
  val Dropdown: ComponentType[typingsJapgolly.wordpressComponents.dropdownMod.Dropdown.Props] = js.native
  
  @JSImport("@wordpress/components", "DropdownMenu")
  @js.native
  val DropdownMenu: ComponentType[typingsJapgolly.wordpressComponents.dropdownMenuMod.DropdownMenu.Props] = js.native
  
  @JSImport("@wordpress/components", "ExternalLink")
  @js.native
  val ExternalLink: ComponentType[typingsJapgolly.wordpressComponents.externalLinkMod.ExternalLink.Props] = js.native
  
  inline def Fill(props: typingsJapgolly.wordpressComponents.slotFillFillMod.Fill.Props): ReactPortal = ^.asInstanceOf[js.Dynamic].applyDynamic("Fill")(props.asInstanceOf[js.Any]).asInstanceOf[ReactPortal]
  
  @JSImport("@wordpress/components", "Flex")
  @js.native
  val Flex: ComponentType[typingsJapgolly.wordpressComponents.flexMod.Flex.Props] = js.native
  
  @JSImport("@wordpress/components", "FlexBlock")
  @js.native
  val FlexBlock: ComponentType[typingsJapgolly.wordpressComponents.flexBlockMod.FlexBlock.Props] = js.native
  
  @JSImport("@wordpress/components", "FlexItem")
  @js.native
  val FlexItem: ComponentType[typingsJapgolly.wordpressComponents.flexItemMod.FlexItem.Props] = js.native
  
  @JSImport("@wordpress/components", "FocalPointPicker")
  @js.native
  val FocalPointPicker: ComponentType[typingsJapgolly.wordpressComponents.focalPointPickerMod.FocalPointPicker.Props] = js.native
  
  @JSImport("@wordpress/components", "FocusReturnProvider")
  @js.native
  val FocusReturnProvider: ComponentType[js.Object] = js.native
  
  @JSImport("@wordpress/components", "FocusableIframe")
  @js.native
  val FocusableIframe: ComponentType[typingsJapgolly.wordpressComponents.focusableIframeMod.FocusableIframe.Props] = js.native
  
  @JSImport("@wordpress/components", "FontSizePicker")
  @js.native
  val FontSizePicker: ComponentType[typingsJapgolly.wordpressComponents.fontSizePickerMod.FontSizePicker.Props] = js.native
  
  @JSImport("@wordpress/components", "FormFileUpload")
  @js.native
  val FormFileUpload: ComponentType[typingsJapgolly.wordpressComponents.formFileUploadMod.FormFileUpload.Props] = js.native
  
  @JSImport("@wordpress/components", "FormToggle")
  @js.native
  val FormToggle: ComponentType[HTMLProps[HTMLInputElement]] = js.native
  
  @JSImport("@wordpress/components", "FormTokenField")
  @js.native
  val FormTokenField: ComponentType[typingsJapgolly.wordpressComponents.formTokenFieldMod.FormTokenField.Props] = js.native
  
  @JSImport("@wordpress/components", "G")
  @js.native
  val G: ComponentType[SVGProps[SVGGElement]] = js.native
  
  @JSImport("@wordpress/components", "Guide")
  @js.native
  val Guide: ComponentType[GuideProps] = js.native
  
  @JSImport("@wordpress/components", "HorizontalRule")
  @js.native
  val HorizontalRule: hr = js.native
  
  // tslint:disable-next-line:no-unnecessary-generics
  inline def Icon[P](props: typingsJapgolly.wordpressComponents.iconMod.Icon.Props[P]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Icon")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@wordpress/components", "IconButton")
  @js.native
  val IconButton: ComponentType[typingsJapgolly.wordpressComponents.iconButtonMod.IconButton.Props] = js.native
  
  @JSImport("@wordpress/components", "IsolatedEventContainer")
  @js.native
  val IsolatedEventContainer: ComponentType[
    typingsJapgolly.wordpressComponents.isolatedEventContainerMod.IsolatedEventContainer.Props
  ] = js.native
  
  @JSImport("@wordpress/components", "KeyboardShortcuts")
  @js.native
  val KeyboardShortcuts: ComponentType[typingsJapgolly.wordpressComponents.keyboardShortcutsMod.KeyboardShortcuts.Props] = js.native
  
  @JSImport("@wordpress/components", "MenuGroup")
  @js.native
  val MenuGroup: ComponentType[typingsJapgolly.wordpressComponents.menuGroupMod.MenuGroup.Props] = js.native
  
  @JSImport("@wordpress/components", "MenuItem")
  @js.native
  val MenuItem: ComponentType[typingsJapgolly.wordpressComponents.menuItemMod.MenuItem.Props] = js.native
  
  @JSImport("@wordpress/components", "MenuItemsChoice")
  @js.native
  val MenuItemsChoice: ComponentType[typingsJapgolly.wordpressComponents.menuItemsChoiceMod.MenuItemsChoice.Props] = js.native
  
  @JSImport("@wordpress/components", "Modal")
  @js.native
  val Modal: ComponentType[typingsJapgolly.wordpressComponents.modalMod.Modal.Props] = js.native
  
  @JSImport("@wordpress/components", "Notice")
  @js.native
  val Notice: ComponentType[typingsJapgolly.wordpressComponents.noticeMod.Notice.Props] = js.native
  
  @JSImport("@wordpress/components", "NoticeList")
  @js.native
  val NoticeList: ComponentType[typingsJapgolly.wordpressComponents.noticeListMod.NoticeList.Props] = js.native
  
  @JSImport("@wordpress/components", "Panel")
  @js.native
  val Panel: ComponentType[typingsJapgolly.wordpressComponents.panelMod.Panel.Props] = js.native
  
  @JSImport("@wordpress/components", "PanelBody")
  @js.native
  val PanelBody: ComponentType[typingsJapgolly.wordpressComponents.panelBodyMod.PanelBody.Props] = js.native
  
  @JSImport("@wordpress/components", "PanelHeader")
  @js.native
  val PanelHeader: ComponentType[typingsJapgolly.wordpressComponents.panelHeaderMod.PanelHeader.Props] = js.native
  
  @JSImport("@wordpress/components", "PanelRow")
  @js.native
  val PanelRow: ComponentType[typingsJapgolly.wordpressComponents.panelRowMod.PanelRow.Props] = js.native
  
  @JSImport("@wordpress/components", "Path")
  @js.native
  val Path: ComponentType[SVGProps[SVGPathElement]] = js.native
  
  @JSImport("@wordpress/components", "Placeholder")
  @js.native
  val Placeholder: ComponentType[typingsJapgolly.wordpressComponents.placeholderMod.Placeholder.Props] = js.native
  
  @JSImport("@wordpress/components", "Polygon")
  @js.native
  val Polygon: ComponentType[SVGProps[SVGPolygonElement]] = js.native
  
  @JSImport("@wordpress/components", "Popover")
  @js.native
  val Popover: ComponentType[typingsJapgolly.wordpressComponents.popoverMod.Popover.Props] & typingsJapgolly.wordpressComponents.anon.Slot = js.native
  
  @JSImport("@wordpress/components", "QueryControls")
  @js.native
  val QueryControls: ComponentType[typingsJapgolly.wordpressComponents.queryControlsMod.QueryControls.Props] = js.native
  
  // tslint:disable-next-line:no-unnecessary-generics
  inline def RadioControl[T](props: typingsJapgolly.wordpressComponents.radioControlMod.RadioControl.Props[T]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("RadioControl")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@wordpress/components", "RangeControl")
  @js.native
  val RangeControl: ComponentType[typingsJapgolly.wordpressComponents.rangeControlMod.RangeControl.Props] = js.native
  
  @JSImport("@wordpress/components", "Rect")
  @js.native
  val Rect: ComponentType[SVGProps[SVGRectElement]] = js.native
  
  @JSImport("@wordpress/components", "ResizableBox")
  @js.native
  val ResizableBox: ComponentType[typingsJapgolly.wordpressComponents.resizableBoxMod.ResizableBox.Props] = js.native
  
  @JSImport("@wordpress/components", "ResponsiveWrapper")
  @js.native
  val ResponsiveWrapper: ComponentType[typingsJapgolly.wordpressComponents.responsiveWrapperMod.ResponsiveWrapper.Props] = js.native
  
  @JSImport("@wordpress/components", "SVG")
  @js.native
  val SVG: ComponentType[SVGProps[SVGSVGElement]] = js.native
  
  @JSImport("@wordpress/components", "SandBox")
  @js.native
  val SandBox: ComponentType[typingsJapgolly.wordpressComponents.sandboxMod.SandBox.Props] = js.native
  
  @JSImport("@wordpress/components", "ScrollLock")
  @js.native
  val ScrollLock: ComponentType[typingsJapgolly.wordpressComponents.scrollLockMod.ScrollLock.Props] = js.native
  
  inline def SelectControl[T /* <: String | js.Array[String] */](
    // tslint:disable-next-line:no-unnecessary-generics
  props: typingsJapgolly.wordpressComponents.selectControlMod.SelectControl.Props[T]
  ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("SelectControl")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@wordpress/components", "Slot")
  @js.native
  val Slot: ComponentType[typingsJapgolly.wordpressComponents.slotFillSlotMod.Slot.Props] = js.native
  
  @JSImport("@wordpress/components", "SlotFillProvider")
  @js.native
  val SlotFillProvider: ComponentType[`1`] = js.native
  
  @JSImport("@wordpress/components", "Snackbar")
  @js.native
  val Snackbar: ComponentType[typingsJapgolly.wordpressComponents.snackbarMod.Snackbar.Props] = js.native
  
  @JSImport("@wordpress/components", "SnackbarList")
  @js.native
  val SnackbarList: ComponentType[typingsJapgolly.wordpressComponents.snackbarListMod.SnackbarList.Props] = js.native
  
  @JSImport("@wordpress/components", "Spinner")
  @js.native
  val Spinner: ComponentType[typingsJapgolly.wordpressComponents.spinnerMod.Spinner.Props] = js.native
  
  @JSImport("@wordpress/components", "TabPanel")
  @js.native
  val TabPanel: ComponentType[typingsJapgolly.wordpressComponents.tabPanelMod.TabPanel.Props] = js.native
  
  @JSImport("@wordpress/components", "TextControl")
  @js.native
  val TextControl: ComponentType[typingsJapgolly.wordpressComponents.textControlMod.TextControl.Props] = js.native
  
  @JSImport("@wordpress/components", "TextareaControl")
  @js.native
  val TextareaControl: ComponentType[typingsJapgolly.wordpressComponents.textareaControlMod.TextareaControl.Props] = js.native
  
  @JSImport("@wordpress/components", "Tip")
  @js.native
  val Tip: ComponentType[typingsJapgolly.wordpressComponents.tipMod.Tip.Props] = js.native
  
  @JSImport("@wordpress/components", "ToggleControl")
  @js.native
  val ToggleControl: ComponentType[typingsJapgolly.wordpressComponents.toggleControlMod.ToggleControl.Props] = js.native
  
  @JSImport("@wordpress/components", "Toolbar")
  @js.native
  val Toolbar: ComponentType[typingsJapgolly.wordpressComponents.toolbarMod.Toolbar.Props] = js.native
  
  @JSImport("@wordpress/components", "ToolbarButton")
  @js.native
  val ToolbarButton: ComponentType[
    typingsJapgolly.wordpressComponents.toolbarButtonMod.ToolbarButton.Props | typingsJapgolly.wordpressComponents.buttonMod.Button.Props
  ] = js.native
  
  @JSImport("@wordpress/components", "ToolbarGroup")
  @js.native
  val ToolbarGroup: ComponentType[ToolbarGroupProps] = js.native
  
  @JSImport("@wordpress/components", "Tooltip")
  @js.native
  val Tooltip: ComponentType[typingsJapgolly.wordpressComponents.tooltipMod.Tooltip.Props] = js.native
  
  @JSImport("@wordpress/components", "TreeSelect")
  @js.native
  val TreeSelect: ComponentType[typingsJapgolly.wordpressComponents.treeSelectMod.TreeSelect.Props] = js.native
  
  @JSImport("@wordpress/components", "VisuallyHidden")
  @js.native
  val VisuallyHidden: ComponentType[typingsJapgolly.wordpressComponents.visuallyHiddenMod.VisuallyHidden.Props] = js.native
  
  inline def createSlotFill(name: String): Fill = ^.asInstanceOf[js.Dynamic].applyDynamic("createSlotFill")(name.asInstanceOf[js.Any]).asInstanceOf[Fill]
  
  inline def navigateRegions[T /* <: ComponentType[Any] */](wrapped: T): /* import warning: importer.ImportType#apply Failed type conversion: T extends react.react.ComponentType<infer U> ? react.react.ComponentType<U> : never */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("navigateRegions")(wrapped.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: T extends react.react.ComponentType<infer U> ? react.react.ComponentType<U> : never */ js.Any]
  
  inline def withConstrainedTabbing[T](wrapped: T): /* import warning: importer.ImportType#apply Failed type conversion: T extends react.react.ComponentType<infer U> ? react.react.ComponentType<U> : never */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("withConstrainedTabbing")(wrapped.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: T extends react.react.ComponentType<infer U> ? react.react.ComponentType<U> : never */ js.Any]
  
  inline def withFallbackStyles[FSP](
    mapNodeToProps: js.Function2[/* parentNode */ HTMLDivElement, /* ownProps */ StringDictionary[Any], FSP]
  ): js.Function1[
    /* wrappedComponent */ ComponentType[Any], 
    /* import warning: importer.ImportType#apply Failed type conversion: react.react.ComponentType<any> extends react.react.ComponentType<infer V> ? react.react.ComponentType<std.Omit<V, keyof FSP>> : never */ js.Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withFallbackStyles")(mapNodeToProps.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* wrappedComponent */ ComponentType[Any], 
    /* import warning: importer.ImportType#apply Failed type conversion: react.react.ComponentType<any> extends react.react.ComponentType<infer V> ? react.react.ComponentType<std.Omit<V, keyof FSP>> : never */ js.Any
  ]]
  
  // prettier-ignore
  inline def withFilters(hookName: String): js.Function1[
    /* wrapped */ Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: any extends react.react.ComponentType<infer U> ? react.react.ComponentType<U> : never */ js.Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withFilters")(hookName.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* wrapped */ Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: any extends react.react.ComponentType<infer U> ? react.react.ComponentType<U> : never */ js.Any
  ]]
  
  inline def withFilters_P[P](hookName: String): js.Function1[/* wrapped */ ComponentType[Any], ComponentType[P]] = ^.asInstanceOf[js.Dynamic].applyDynamic("withFilters")(hookName.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* wrapped */ ComponentType[Any], ComponentType[P]]]
  
  inline def withFocusOutside[T /* <: HFOComponent[Any, Any] */](wrapped: T): /* import warning: importer.ImportType#apply Failed type conversion: T extends @wordpress/components.@wordpress/components/higher-order/with-focus-outside.HFOComponent<infer U, any> ? react.react.ComponentType<U> : never */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("withFocusOutside")(wrapped.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: T extends @wordpress/components.@wordpress/components/higher-order/with-focus-outside.HFOComponent<infer U, any> ? react.react.ComponentType<U> : never */ js.Any]
  
  // prettier-ignore
  inline def withFocusReturn(options: WFROptions): js.Function1[
    /* wrapped */ ComponentType[Any], 
    /* import warning: importer.ImportType#apply Failed type conversion: react.react.ComponentType<any> extends react.react.ComponentType<infer U> ? react.react.ComponentType<U> : never */ js.Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withFocusReturn")(options.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* wrapped */ ComponentType[Any], 
    /* import warning: importer.ImportType#apply Failed type conversion: react.react.ComponentType<any> extends react.react.ComponentType<infer U> ? react.react.ComponentType<U> : never */ js.Any
  ]]
  // prettier-ignore
  inline def withFocusReturn[T /* <: ComponentType[Any] */](wrapped: T): /* import warning: importer.ImportType#apply Failed type conversion: T extends react.react.ComponentType<infer U> ? react.react.ComponentType<U> : never */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("withFocusReturn")(wrapped.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: T extends react.react.ComponentType<infer U> ? react.react.ComponentType<U> : never */ js.Any]
  
  // prettier-ignore
  inline def withNotices[T /* <: ComponentType[Any] */](wrapped: T): /* import warning: importer.ImportType#apply Failed type conversion: T extends react.react.ComponentType<infer U> ? react.react.ComponentType<std.Omit<U, 'noticeList' | 'noticeOperations' | 'noticeUI'>> : never */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("withNotices")(wrapped.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: T extends react.react.ComponentType<infer U> ? react.react.ComponentType<std.Omit<U, 'noticeList' | 'noticeOperations' | 'noticeUI'>> : never */ js.Any]
  
  inline def withSpokenMessages[T /* <: ComponentType[Any] */](wrapped: T): /* import warning: importer.ImportType#apply Failed type conversion: T extends react.react.ComponentType<infer U> ? react.react.ComponentType<std.Omit<U, 'speak' | 'debouncedSpeak'>> : never */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("withSpokenMessages")(wrapped.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: T extends react.react.ComponentType<infer U> ? react.react.ComponentType<std.Omit<U, 'speak' | 'debouncedSpeak'>> : never */ js.Any]
}
