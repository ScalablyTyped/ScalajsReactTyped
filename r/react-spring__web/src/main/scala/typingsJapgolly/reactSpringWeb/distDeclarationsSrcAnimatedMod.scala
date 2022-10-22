package typingsJapgolly.reactSpringWeb

import japgolly.scalajs.react.facade.React.ElementType
import typingsJapgolly.react.mod.ComponentPropsWithRef
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.reactSpringTypes.utilMod.Merge
import typingsJapgolly.reactSpringWeb.anon.Style
import typingsJapgolly.reactSpringWeb.reactSpringWebStrings.`object`
import typingsJapgolly.reactSpringWeb.reactSpringWebStrings.`var`
import typingsJapgolly.reactSpringWeb.reactSpringWebStrings.a
import typingsJapgolly.reactSpringWeb.reactSpringWebStrings.abbr
import typingsJapgolly.reactSpringWeb.reactSpringWebStrings.address
import typingsJapgolly.reactSpringWeb.reactSpringWebStrings.animate
import typingsJapgolly.reactSpringWeb.reactSpringWebStrings.animateMotion
import typingsJapgolly.reactSpringWeb.reactSpringWebStrings.animateTransform
import typingsJapgolly.reactSpringWeb.reactSpringWebStrings.area
import typingsJapgolly.reactSpringWeb.reactSpringWebStrings.article
import typingsJapgolly.reactSpringWeb.reactSpringWebStrings.aside
import typingsJapgolly.reactSpringWeb.reactSpringWebStrings.audio
import typingsJapgolly.reactSpringWeb.reactSpringWebStrings.b
import typingsJapgolly.reactSpringWeb.reactSpringWebStrings.base
import typingsJapgolly.reactSpringWeb.reactSpringWebStrings.bdi
import typingsJapgolly.reactSpringWeb.reactSpringWebStrings.bdo
import typingsJapgolly.reactSpringWeb.reactSpringWebStrings.big
import typingsJapgolly.reactSpringWeb.reactSpringWebStrings.blockquote
import typingsJapgolly.reactSpringWeb.reactSpringWebStrings.body
import typingsJapgolly.reactSpringWeb.reactSpringWebStrings.br
import typingsJapgolly.reactSpringWeb.reactSpringWebStrings.button
import typingsJapgolly.reactSpringWeb.reactSpringWebStrings.canvas
import typingsJapgolly.reactSpringWeb.reactSpringWebStrings.caption
import typingsJapgolly.reactSpringWeb.reactSpringWebStrings.circle
import typingsJapgolly.reactSpringWeb.reactSpringWebStrings.cite
import typingsJapgolly.reactSpringWeb.reactSpringWebStrings.clipPath
import typingsJapgolly.reactSpringWeb.reactSpringWebStrings.code
import typingsJapgolly.reactSpringWeb.reactSpringWebStrings.col
import typingsJapgolly.reactSpringWeb.reactSpringWebStrings.colgroup
import typingsJapgolly.reactSpringWeb.reactSpringWebStrings.data
import typingsJapgolly.reactSpringWeb.reactSpringWebStrings.datalist
import typingsJapgolly.reactSpringWeb.reactSpringWebStrings.dd
import typingsJapgolly.reactSpringWeb.reactSpringWebStrings.defs
import typingsJapgolly.reactSpringWeb.reactSpringWebStrings.del
import typingsJapgolly.reactSpringWeb.reactSpringWebStrings.desc
import typingsJapgolly.reactSpringWeb.reactSpringWebStrings.details
import typingsJapgolly.reactSpringWeb.reactSpringWebStrings.dfn
import typingsJapgolly.reactSpringWeb.reactSpringWebStrings.dialog
import typingsJapgolly.reactSpringWeb.reactSpringWebStrings.div
import typingsJapgolly.reactSpringWeb.reactSpringWebStrings.dl
import typingsJapgolly.reactSpringWeb.reactSpringWebStrings.dt
import typingsJapgolly.reactSpringWeb.reactSpringWebStrings.ellipse
import typingsJapgolly.reactSpringWeb.reactSpringWebStrings.em
import typingsJapgolly.reactSpringWeb.reactSpringWebStrings.embed
import typingsJapgolly.reactSpringWeb.reactSpringWebStrings.feBlend
import typingsJapgolly.reactSpringWeb.reactSpringWebStrings.feColorMatrix
import typingsJapgolly.reactSpringWeb.reactSpringWebStrings.feComponentTransfer
import typingsJapgolly.reactSpringWeb.reactSpringWebStrings.feComposite
import typingsJapgolly.reactSpringWeb.reactSpringWebStrings.feConvolveMatrix
import typingsJapgolly.reactSpringWeb.reactSpringWebStrings.feDiffuseLighting
import typingsJapgolly.reactSpringWeb.reactSpringWebStrings.feDisplacementMap
import typingsJapgolly.reactSpringWeb.reactSpringWebStrings.feDistantLight
import typingsJapgolly.reactSpringWeb.reactSpringWebStrings.feDropShadow
import typingsJapgolly.reactSpringWeb.reactSpringWebStrings.feFlood
import typingsJapgolly.reactSpringWeb.reactSpringWebStrings.feFuncA
import typingsJapgolly.reactSpringWeb.reactSpringWebStrings.feFuncB
import typingsJapgolly.reactSpringWeb.reactSpringWebStrings.feFuncG
import typingsJapgolly.reactSpringWeb.reactSpringWebStrings.feFuncR
import typingsJapgolly.reactSpringWeb.reactSpringWebStrings.feGaussianBlur
import typingsJapgolly.reactSpringWeb.reactSpringWebStrings.feImage
import typingsJapgolly.reactSpringWeb.reactSpringWebStrings.feMerge
import typingsJapgolly.reactSpringWeb.reactSpringWebStrings.feMergeNode
import typingsJapgolly.reactSpringWeb.reactSpringWebStrings.feMorphology
import typingsJapgolly.reactSpringWeb.reactSpringWebStrings.feOffset
import typingsJapgolly.reactSpringWeb.reactSpringWebStrings.fePointLight
import typingsJapgolly.reactSpringWeb.reactSpringWebStrings.feSpecularLighting
import typingsJapgolly.reactSpringWeb.reactSpringWebStrings.feSpotLight
import typingsJapgolly.reactSpringWeb.reactSpringWebStrings.feTile
import typingsJapgolly.reactSpringWeb.reactSpringWebStrings.feTurbulence
import typingsJapgolly.reactSpringWeb.reactSpringWebStrings.fieldset
import typingsJapgolly.reactSpringWeb.reactSpringWebStrings.figcaption
import typingsJapgolly.reactSpringWeb.reactSpringWebStrings.figure
import typingsJapgolly.reactSpringWeb.reactSpringWebStrings.filter
import typingsJapgolly.reactSpringWeb.reactSpringWebStrings.footer
import typingsJapgolly.reactSpringWeb.reactSpringWebStrings.foreignObject
import typingsJapgolly.reactSpringWeb.reactSpringWebStrings.form
import typingsJapgolly.reactSpringWeb.reactSpringWebStrings.g
import typingsJapgolly.reactSpringWeb.reactSpringWebStrings.h1
import typingsJapgolly.reactSpringWeb.reactSpringWebStrings.h2
import typingsJapgolly.reactSpringWeb.reactSpringWebStrings.h3
import typingsJapgolly.reactSpringWeb.reactSpringWebStrings.h4
import typingsJapgolly.reactSpringWeb.reactSpringWebStrings.h5
import typingsJapgolly.reactSpringWeb.reactSpringWebStrings.h6
import typingsJapgolly.reactSpringWeb.reactSpringWebStrings.head
import typingsJapgolly.reactSpringWeb.reactSpringWebStrings.header
import typingsJapgolly.reactSpringWeb.reactSpringWebStrings.hgroup
import typingsJapgolly.reactSpringWeb.reactSpringWebStrings.hr
import typingsJapgolly.reactSpringWeb.reactSpringWebStrings.html
import typingsJapgolly.reactSpringWeb.reactSpringWebStrings.i
import typingsJapgolly.reactSpringWeb.reactSpringWebStrings.iframe
import typingsJapgolly.reactSpringWeb.reactSpringWebStrings.image
import typingsJapgolly.reactSpringWeb.reactSpringWebStrings.img
import typingsJapgolly.reactSpringWeb.reactSpringWebStrings.input
import typingsJapgolly.reactSpringWeb.reactSpringWebStrings.ins
import typingsJapgolly.reactSpringWeb.reactSpringWebStrings.kbd
import typingsJapgolly.reactSpringWeb.reactSpringWebStrings.keygen
import typingsJapgolly.reactSpringWeb.reactSpringWebStrings.label
import typingsJapgolly.reactSpringWeb.reactSpringWebStrings.legend
import typingsJapgolly.reactSpringWeb.reactSpringWebStrings.li
import typingsJapgolly.reactSpringWeb.reactSpringWebStrings.line
import typingsJapgolly.reactSpringWeb.reactSpringWebStrings.linearGradient
import typingsJapgolly.reactSpringWeb.reactSpringWebStrings.link
import typingsJapgolly.reactSpringWeb.reactSpringWebStrings.main
import typingsJapgolly.reactSpringWeb.reactSpringWebStrings.map
import typingsJapgolly.reactSpringWeb.reactSpringWebStrings.mark
import typingsJapgolly.reactSpringWeb.reactSpringWebStrings.marker
import typingsJapgolly.reactSpringWeb.reactSpringWebStrings.mask
import typingsJapgolly.reactSpringWeb.reactSpringWebStrings.menu
import typingsJapgolly.reactSpringWeb.reactSpringWebStrings.menuitem
import typingsJapgolly.reactSpringWeb.reactSpringWebStrings.meta
import typingsJapgolly.reactSpringWeb.reactSpringWebStrings.metadata
import typingsJapgolly.reactSpringWeb.reactSpringWebStrings.meter
import typingsJapgolly.reactSpringWeb.reactSpringWebStrings.mpath
import typingsJapgolly.reactSpringWeb.reactSpringWebStrings.nav
import typingsJapgolly.reactSpringWeb.reactSpringWebStrings.noindex
import typingsJapgolly.reactSpringWeb.reactSpringWebStrings.noscript
import typingsJapgolly.reactSpringWeb.reactSpringWebStrings.ol
import typingsJapgolly.reactSpringWeb.reactSpringWebStrings.optgroup
import typingsJapgolly.reactSpringWeb.reactSpringWebStrings.option
import typingsJapgolly.reactSpringWeb.reactSpringWebStrings.output
import typingsJapgolly.reactSpringWeb.reactSpringWebStrings.p
import typingsJapgolly.reactSpringWeb.reactSpringWebStrings.param
import typingsJapgolly.reactSpringWeb.reactSpringWebStrings.path
import typingsJapgolly.reactSpringWeb.reactSpringWebStrings.pattern
import typingsJapgolly.reactSpringWeb.reactSpringWebStrings.picture
import typingsJapgolly.reactSpringWeb.reactSpringWebStrings.polygon
import typingsJapgolly.reactSpringWeb.reactSpringWebStrings.polyline
import typingsJapgolly.reactSpringWeb.reactSpringWebStrings.pre
import typingsJapgolly.reactSpringWeb.reactSpringWebStrings.progress
import typingsJapgolly.reactSpringWeb.reactSpringWebStrings.q
import typingsJapgolly.reactSpringWeb.reactSpringWebStrings.radialGradient
import typingsJapgolly.reactSpringWeb.reactSpringWebStrings.rect
import typingsJapgolly.reactSpringWeb.reactSpringWebStrings.rp
import typingsJapgolly.reactSpringWeb.reactSpringWebStrings.rt
import typingsJapgolly.reactSpringWeb.reactSpringWebStrings.ruby
import typingsJapgolly.reactSpringWeb.reactSpringWebStrings.s
import typingsJapgolly.reactSpringWeb.reactSpringWebStrings.samp
import typingsJapgolly.reactSpringWeb.reactSpringWebStrings.script
import typingsJapgolly.reactSpringWeb.reactSpringWebStrings.section
import typingsJapgolly.reactSpringWeb.reactSpringWebStrings.select
import typingsJapgolly.reactSpringWeb.reactSpringWebStrings.slot
import typingsJapgolly.reactSpringWeb.reactSpringWebStrings.small
import typingsJapgolly.reactSpringWeb.reactSpringWebStrings.source
import typingsJapgolly.reactSpringWeb.reactSpringWebStrings.span
import typingsJapgolly.reactSpringWeb.reactSpringWebStrings.stop
import typingsJapgolly.reactSpringWeb.reactSpringWebStrings.strong
import typingsJapgolly.reactSpringWeb.reactSpringWebStrings.style
import typingsJapgolly.reactSpringWeb.reactSpringWebStrings.sub
import typingsJapgolly.reactSpringWeb.reactSpringWebStrings.summary
import typingsJapgolly.reactSpringWeb.reactSpringWebStrings.sup
import typingsJapgolly.reactSpringWeb.reactSpringWebStrings.svg
import typingsJapgolly.reactSpringWeb.reactSpringWebStrings.switch
import typingsJapgolly.reactSpringWeb.reactSpringWebStrings.symbol
import typingsJapgolly.reactSpringWeb.reactSpringWebStrings.table
import typingsJapgolly.reactSpringWeb.reactSpringWebStrings.tbody
import typingsJapgolly.reactSpringWeb.reactSpringWebStrings.td
import typingsJapgolly.reactSpringWeb.reactSpringWebStrings.template
import typingsJapgolly.reactSpringWeb.reactSpringWebStrings.text
import typingsJapgolly.reactSpringWeb.reactSpringWebStrings.textPath
import typingsJapgolly.reactSpringWeb.reactSpringWebStrings.textarea
import typingsJapgolly.reactSpringWeb.reactSpringWebStrings.tfoot
import typingsJapgolly.reactSpringWeb.reactSpringWebStrings.th
import typingsJapgolly.reactSpringWeb.reactSpringWebStrings.thead
import typingsJapgolly.reactSpringWeb.reactSpringWebStrings.time
import typingsJapgolly.reactSpringWeb.reactSpringWebStrings.title
import typingsJapgolly.reactSpringWeb.reactSpringWebStrings.tr
import typingsJapgolly.reactSpringWeb.reactSpringWebStrings.track
import typingsJapgolly.reactSpringWeb.reactSpringWebStrings.tspan
import typingsJapgolly.reactSpringWeb.reactSpringWebStrings.u
import typingsJapgolly.reactSpringWeb.reactSpringWebStrings.ul
import typingsJapgolly.reactSpringWeb.reactSpringWebStrings.use
import typingsJapgolly.reactSpringWeb.reactSpringWebStrings.video
import typingsJapgolly.reactSpringWeb.reactSpringWebStrings.view
import typingsJapgolly.reactSpringWeb.reactSpringWebStrings.wbr
import typingsJapgolly.reactSpringWeb.reactSpringWebStrings.webview
import typingsJapgolly.std.Exclude
import typingsJapgolly.std.Extract
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDeclarationsSrcAnimatedMod {
  
  type Angle = Double | String
  
  type AnimatedComponent[T /* <: ElementType */] = ForwardRefExoticComponent[
    (AnimatedProps[Merge[ComponentPropsWithRef[T], Style]]) & (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FluidProps<{  scrollTop :number | undefined,   scrollLeft :number | undefined}> */ Any)
  ]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    @react-spring/web.@react-spring/web/dist/declarations/src/animated.NonObject<T> extends infer U ? [U] extends [never] ? never : / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FluidValue<U> * / any : never
    }}}
    */
  @js.native
  trait AnimatedLeaf[T] extends StObject
  
  type AnimatedObject[T /* <: js.Object */] = /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof T ]: @react-spring/web.@react-spring/web/dist/declarations/src/animated.AnimatedStyle<T[P]>} */ js.Any
  
  /* Inlined {[ Tag in @react-spring/web.@react-spring/web/dist/declarations/src/primitives.Primitives ]: @react-spring/web.@react-spring/web/dist/declarations/src/animated.AnimatedComponent<Tag>} */
  trait AnimatedPrimitives extends StObject {
    
    var a: AnimatedComponent[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.a]
    
    var abbr: AnimatedComponent[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.abbr]
    
    var address: AnimatedComponent[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.address]
    
    var animate: AnimatedComponent[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.animate]
    
    var animateMotion: AnimatedComponent[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.animateMotion]
    
    var animateTransform: AnimatedComponent[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.animateTransform]
    
    var area: AnimatedComponent[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.area]
    
    var article: AnimatedComponent[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.article]
    
    var aside: AnimatedComponent[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.aside]
    
    var audio: AnimatedComponent[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.audio]
    
    var b: AnimatedComponent[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.b]
    
    var base: AnimatedComponent[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.base]
    
    var bdi: AnimatedComponent[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.bdi]
    
    var bdo: AnimatedComponent[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.bdo]
    
    var big: AnimatedComponent[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.big]
    
    var blockquote: AnimatedComponent[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.blockquote]
    
    var body: AnimatedComponent[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.body]
    
    var br: AnimatedComponent[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.br]
    
    var button: AnimatedComponent[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.button]
    
    var canvas: AnimatedComponent[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.canvas]
    
    var caption: AnimatedComponent[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.caption]
    
    var circle: AnimatedComponent[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.circle]
    
    var cite: AnimatedComponent[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.cite]
    
    var clipPath: AnimatedComponent[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.clipPath]
    
    var code: AnimatedComponent[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.code]
    
    var col: AnimatedComponent[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.col]
    
    var colgroup: AnimatedComponent[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.colgroup]
    
    var data: AnimatedComponent[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.data]
    
    var datalist: AnimatedComponent[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.datalist]
    
    var dd: AnimatedComponent[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.dd]
    
    var defs: AnimatedComponent[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.defs]
    
    var del: AnimatedComponent[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.del]
    
    var desc: AnimatedComponent[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.desc]
    
    var details: AnimatedComponent[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.details]
    
    var dfn: AnimatedComponent[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.dfn]
    
    var dialog: AnimatedComponent[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.dialog]
    
    var div: AnimatedComponent[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.div]
    
    var dl: AnimatedComponent[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.dl]
    
    var dt: AnimatedComponent[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.dt]
    
    var ellipse: AnimatedComponent[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.ellipse]
    
    var em: AnimatedComponent[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.em]
    
    var embed: AnimatedComponent[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.embed]
    
    var feBlend: AnimatedComponent[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.feBlend]
    
    var feColorMatrix: AnimatedComponent[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.feColorMatrix]
    
    var feComponentTransfer: AnimatedComponent[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.feComponentTransfer]
    
    var feComposite: AnimatedComponent[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.feComposite]
    
    var feConvolveMatrix: AnimatedComponent[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.feConvolveMatrix]
    
    var feDiffuseLighting: AnimatedComponent[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.feDiffuseLighting]
    
    var feDisplacementMap: AnimatedComponent[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.feDisplacementMap]
    
    var feDistantLight: AnimatedComponent[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.feDistantLight]
    
    var feDropShadow: AnimatedComponent[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.feDropShadow]
    
    var feFlood: AnimatedComponent[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.feFlood]
    
    var feFuncA: AnimatedComponent[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.feFuncA]
    
    var feFuncB: AnimatedComponent[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.feFuncB]
    
    var feFuncG: AnimatedComponent[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.feFuncG]
    
    var feFuncR: AnimatedComponent[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.feFuncR]
    
    var feGaussianBlur: AnimatedComponent[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.feGaussianBlur]
    
    var feImage: AnimatedComponent[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.feImage]
    
    var feMerge: AnimatedComponent[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.feMerge]
    
    var feMergeNode: AnimatedComponent[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.feMergeNode]
    
    var feMorphology: AnimatedComponent[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.feMorphology]
    
    var feOffset: AnimatedComponent[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.feOffset]
    
    var fePointLight: AnimatedComponent[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.fePointLight]
    
    var feSpecularLighting: AnimatedComponent[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.feSpecularLighting]
    
    var feSpotLight: AnimatedComponent[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.feSpotLight]
    
    var feTile: AnimatedComponent[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.feTile]
    
    var feTurbulence: AnimatedComponent[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.feTurbulence]
    
    var fieldset: AnimatedComponent[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.fieldset]
    
    var figcaption: AnimatedComponent[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.figcaption]
    
    var figure: AnimatedComponent[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.figure]
    
    var filter: AnimatedComponent[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.filter]
    
    var footer: AnimatedComponent[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.footer]
    
    var foreignObject: AnimatedComponent[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.foreignObject]
    
    var form: AnimatedComponent[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.form]
    
    var g: AnimatedComponent[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.g]
    
    var h1: AnimatedComponent[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.h1]
    
    var h2: AnimatedComponent[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.h2]
    
    var h3: AnimatedComponent[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.h3]
    
    var h4: AnimatedComponent[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.h4]
    
    var h5: AnimatedComponent[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.h5]
    
    var h6: AnimatedComponent[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.h6]
    
    var head: AnimatedComponent[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.head]
    
    var header: AnimatedComponent[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.header]
    
    var hgroup: AnimatedComponent[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.hgroup]
    
    var hr: AnimatedComponent[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.hr]
    
    var html: AnimatedComponent[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.html]
    
    var i: AnimatedComponent[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.i]
    
    var iframe: AnimatedComponent[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.iframe]
    
    var image: AnimatedComponent[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.image]
    
    var img: AnimatedComponent[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.img]
    
    var input: AnimatedComponent[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.input]
    
    var ins: AnimatedComponent[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.ins]
    
    var kbd: AnimatedComponent[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.kbd]
    
    var keygen: AnimatedComponent[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.keygen]
    
    var label: AnimatedComponent[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.label]
    
    var legend: AnimatedComponent[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.legend]
    
    var li: AnimatedComponent[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.li]
    
    var line: AnimatedComponent[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.line]
    
    var linearGradient: AnimatedComponent[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.linearGradient]
    
    var link: AnimatedComponent[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.link]
    
    var main: AnimatedComponent[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.main]
    
    var map: AnimatedComponent[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.map]
    
    var mark: AnimatedComponent[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.mark]
    
    var marker: AnimatedComponent[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.marker]
    
    var mask: AnimatedComponent[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.mask]
    
    var menu: AnimatedComponent[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.menu]
    
    var menuitem: AnimatedComponent[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.menuitem]
    
    var meta: AnimatedComponent[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.meta]
    
    var metadata: AnimatedComponent[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.metadata]
    
    var meter: AnimatedComponent[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.meter]
    
    var mpath: AnimatedComponent[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.mpath]
    
    var nav: AnimatedComponent[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.nav]
    
    var noindex: AnimatedComponent[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.noindex]
    
    var noscript: AnimatedComponent[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.noscript]
    
    var `object`: AnimatedComponent[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.`object`]
    
    var ol: AnimatedComponent[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.ol]
    
    var optgroup: AnimatedComponent[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.optgroup]
    
    var option: AnimatedComponent[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.option]
    
    var output: AnimatedComponent[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.output]
    
    var p: AnimatedComponent[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.p]
    
    var param: AnimatedComponent[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.param]
    
    var path: AnimatedComponent[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.path]
    
    var pattern: AnimatedComponent[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.pattern]
    
    var picture: AnimatedComponent[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.picture]
    
    var polygon: AnimatedComponent[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.polygon]
    
    var polyline: AnimatedComponent[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.polyline]
    
    var pre: AnimatedComponent[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.pre]
    
    var progress: AnimatedComponent[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.progress]
    
    var q: AnimatedComponent[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.q]
    
    var radialGradient: AnimatedComponent[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.radialGradient]
    
    var rect: AnimatedComponent[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.rect]
    
    var rp: AnimatedComponent[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.rp]
    
    var rt: AnimatedComponent[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.rt]
    
    var ruby: AnimatedComponent[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.ruby]
    
    var s: AnimatedComponent[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.s]
    
    var samp: AnimatedComponent[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.samp]
    
    var script: AnimatedComponent[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.script]
    
    var section: AnimatedComponent[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.section]
    
    var select: AnimatedComponent[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.select]
    
    var slot: AnimatedComponent[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.slot]
    
    var small: AnimatedComponent[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.small]
    
    var source: AnimatedComponent[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.source]
    
    var span: AnimatedComponent[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.span]
    
    var stop: AnimatedComponent[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.stop]
    
    var strong: AnimatedComponent[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.strong]
    
    var style: AnimatedComponent[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.style]
    
    var sub: AnimatedComponent[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.sub]
    
    var summary: AnimatedComponent[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.summary]
    
    var sup: AnimatedComponent[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.sup]
    
    var svg: AnimatedComponent[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.svg]
    
    var switch: AnimatedComponent[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.switch]
    
    var symbol: AnimatedComponent[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.symbol]
    
    var table: AnimatedComponent[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.table]
    
    var tbody: AnimatedComponent[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.tbody]
    
    var td: AnimatedComponent[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.td]
    
    var template: AnimatedComponent[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.template]
    
    var text: AnimatedComponent[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.text]
    
    var textPath: AnimatedComponent[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.textPath]
    
    var textarea: AnimatedComponent[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.textarea]
    
    var tfoot: AnimatedComponent[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.tfoot]
    
    var th: AnimatedComponent[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.th]
    
    var thead: AnimatedComponent[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.thead]
    
    var time: AnimatedComponent[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.time]
    
    var title: AnimatedComponent[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.title]
    
    var tr: AnimatedComponent[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.tr]
    
    var track: AnimatedComponent[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.track]
    
    var tspan: AnimatedComponent[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.tspan]
    
    var u: AnimatedComponent[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.u]
    
    var ul: AnimatedComponent[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.ul]
    
    var use: AnimatedComponent[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.use]
    
    var `var`: AnimatedComponent[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.`var`]
    
    var video: AnimatedComponent[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.video]
    
    var view: AnimatedComponent[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.view]
    
    var wbr: AnimatedComponent[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.wbr]
    
    var webview: AnimatedComponent[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.webview]
  }
  object AnimatedPrimitives {
    
    extension [Self <: AnimatedPrimitives](x: Self) {
      
      inline def setA(value: AnimatedComponent[a]): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
      
      inline def setAbbr(value: AnimatedComponent[abbr]): Self = StObject.set(x, "abbr", value.asInstanceOf[js.Any])
      
      inline def setAddress(value: AnimatedComponent[address]): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      inline def setAnimate(value: AnimatedComponent[animate]): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
      
      inline def setAnimateMotion(value: AnimatedComponent[animateMotion]): Self = StObject.set(x, "animateMotion", value.asInstanceOf[js.Any])
      
      inline def setAnimateTransform(value: AnimatedComponent[animateTransform]): Self = StObject.set(x, "animateTransform", value.asInstanceOf[js.Any])
      
      inline def setArea(value: AnimatedComponent[area]): Self = StObject.set(x, "area", value.asInstanceOf[js.Any])
      
      inline def setArticle(value: AnimatedComponent[article]): Self = StObject.set(x, "article", value.asInstanceOf[js.Any])
      
      inline def setAside(value: AnimatedComponent[aside]): Self = StObject.set(x, "aside", value.asInstanceOf[js.Any])
      
      inline def setAudio(value: AnimatedComponent[audio]): Self = StObject.set(x, "audio", value.asInstanceOf[js.Any])
      
      inline def setB(value: AnimatedComponent[b]): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
      
      inline def setBase(value: AnimatedComponent[base]): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
      
      inline def setBdi(value: AnimatedComponent[bdi]): Self = StObject.set(x, "bdi", value.asInstanceOf[js.Any])
      
      inline def setBdo(value: AnimatedComponent[bdo]): Self = StObject.set(x, "bdo", value.asInstanceOf[js.Any])
      
      inline def setBig(value: AnimatedComponent[big]): Self = StObject.set(x, "big", value.asInstanceOf[js.Any])
      
      inline def setBlockquote(value: AnimatedComponent[blockquote]): Self = StObject.set(x, "blockquote", value.asInstanceOf[js.Any])
      
      inline def setBody(value: AnimatedComponent[body]): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBr(value: AnimatedComponent[br]): Self = StObject.set(x, "br", value.asInstanceOf[js.Any])
      
      inline def setButton(value: AnimatedComponent[button]): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
      
      inline def setCanvas(value: AnimatedComponent[canvas]): Self = StObject.set(x, "canvas", value.asInstanceOf[js.Any])
      
      inline def setCaption(value: AnimatedComponent[caption]): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
      
      inline def setCircle(value: AnimatedComponent[circle]): Self = StObject.set(x, "circle", value.asInstanceOf[js.Any])
      
      inline def setCite(value: AnimatedComponent[cite]): Self = StObject.set(x, "cite", value.asInstanceOf[js.Any])
      
      inline def setClipPath(value: AnimatedComponent[clipPath]): Self = StObject.set(x, "clipPath", value.asInstanceOf[js.Any])
      
      inline def setCode(value: AnimatedComponent[code]): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setCol(value: AnimatedComponent[col]): Self = StObject.set(x, "col", value.asInstanceOf[js.Any])
      
      inline def setColgroup(value: AnimatedComponent[colgroup]): Self = StObject.set(x, "colgroup", value.asInstanceOf[js.Any])
      
      inline def setData(value: AnimatedComponent[data]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDatalist(value: AnimatedComponent[datalist]): Self = StObject.set(x, "datalist", value.asInstanceOf[js.Any])
      
      inline def setDd(value: AnimatedComponent[dd]): Self = StObject.set(x, "dd", value.asInstanceOf[js.Any])
      
      inline def setDefs(value: AnimatedComponent[defs]): Self = StObject.set(x, "defs", value.asInstanceOf[js.Any])
      
      inline def setDel(value: AnimatedComponent[del]): Self = StObject.set(x, "del", value.asInstanceOf[js.Any])
      
      inline def setDesc(value: AnimatedComponent[desc]): Self = StObject.set(x, "desc", value.asInstanceOf[js.Any])
      
      inline def setDetails(value: AnimatedComponent[details]): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
      
      inline def setDfn(value: AnimatedComponent[dfn]): Self = StObject.set(x, "dfn", value.asInstanceOf[js.Any])
      
      inline def setDialog(value: AnimatedComponent[dialog]): Self = StObject.set(x, "dialog", value.asInstanceOf[js.Any])
      
      inline def setDiv(value: AnimatedComponent[div]): Self = StObject.set(x, "div", value.asInstanceOf[js.Any])
      
      inline def setDl(value: AnimatedComponent[dl]): Self = StObject.set(x, "dl", value.asInstanceOf[js.Any])
      
      inline def setDt(value: AnimatedComponent[dt]): Self = StObject.set(x, "dt", value.asInstanceOf[js.Any])
      
      inline def setEllipse(value: AnimatedComponent[ellipse]): Self = StObject.set(x, "ellipse", value.asInstanceOf[js.Any])
      
      inline def setEm(value: AnimatedComponent[em]): Self = StObject.set(x, "em", value.asInstanceOf[js.Any])
      
      inline def setEmbed(value: AnimatedComponent[embed]): Self = StObject.set(x, "embed", value.asInstanceOf[js.Any])
      
      inline def setFeBlend(value: AnimatedComponent[feBlend]): Self = StObject.set(x, "feBlend", value.asInstanceOf[js.Any])
      
      inline def setFeColorMatrix(value: AnimatedComponent[feColorMatrix]): Self = StObject.set(x, "feColorMatrix", value.asInstanceOf[js.Any])
      
      inline def setFeComponentTransfer(value: AnimatedComponent[feComponentTransfer]): Self = StObject.set(x, "feComponentTransfer", value.asInstanceOf[js.Any])
      
      inline def setFeComposite(value: AnimatedComponent[feComposite]): Self = StObject.set(x, "feComposite", value.asInstanceOf[js.Any])
      
      inline def setFeConvolveMatrix(value: AnimatedComponent[feConvolveMatrix]): Self = StObject.set(x, "feConvolveMatrix", value.asInstanceOf[js.Any])
      
      inline def setFeDiffuseLighting(value: AnimatedComponent[feDiffuseLighting]): Self = StObject.set(x, "feDiffuseLighting", value.asInstanceOf[js.Any])
      
      inline def setFeDisplacementMap(value: AnimatedComponent[feDisplacementMap]): Self = StObject.set(x, "feDisplacementMap", value.asInstanceOf[js.Any])
      
      inline def setFeDistantLight(value: AnimatedComponent[feDistantLight]): Self = StObject.set(x, "feDistantLight", value.asInstanceOf[js.Any])
      
      inline def setFeDropShadow(value: AnimatedComponent[feDropShadow]): Self = StObject.set(x, "feDropShadow", value.asInstanceOf[js.Any])
      
      inline def setFeFlood(value: AnimatedComponent[feFlood]): Self = StObject.set(x, "feFlood", value.asInstanceOf[js.Any])
      
      inline def setFeFuncA(value: AnimatedComponent[feFuncA]): Self = StObject.set(x, "feFuncA", value.asInstanceOf[js.Any])
      
      inline def setFeFuncB(value: AnimatedComponent[feFuncB]): Self = StObject.set(x, "feFuncB", value.asInstanceOf[js.Any])
      
      inline def setFeFuncG(value: AnimatedComponent[feFuncG]): Self = StObject.set(x, "feFuncG", value.asInstanceOf[js.Any])
      
      inline def setFeFuncR(value: AnimatedComponent[feFuncR]): Self = StObject.set(x, "feFuncR", value.asInstanceOf[js.Any])
      
      inline def setFeGaussianBlur(value: AnimatedComponent[feGaussianBlur]): Self = StObject.set(x, "feGaussianBlur", value.asInstanceOf[js.Any])
      
      inline def setFeImage(value: AnimatedComponent[feImage]): Self = StObject.set(x, "feImage", value.asInstanceOf[js.Any])
      
      inline def setFeMerge(value: AnimatedComponent[feMerge]): Self = StObject.set(x, "feMerge", value.asInstanceOf[js.Any])
      
      inline def setFeMergeNode(value: AnimatedComponent[feMergeNode]): Self = StObject.set(x, "feMergeNode", value.asInstanceOf[js.Any])
      
      inline def setFeMorphology(value: AnimatedComponent[feMorphology]): Self = StObject.set(x, "feMorphology", value.asInstanceOf[js.Any])
      
      inline def setFeOffset(value: AnimatedComponent[feOffset]): Self = StObject.set(x, "feOffset", value.asInstanceOf[js.Any])
      
      inline def setFePointLight(value: AnimatedComponent[fePointLight]): Self = StObject.set(x, "fePointLight", value.asInstanceOf[js.Any])
      
      inline def setFeSpecularLighting(value: AnimatedComponent[feSpecularLighting]): Self = StObject.set(x, "feSpecularLighting", value.asInstanceOf[js.Any])
      
      inline def setFeSpotLight(value: AnimatedComponent[feSpotLight]): Self = StObject.set(x, "feSpotLight", value.asInstanceOf[js.Any])
      
      inline def setFeTile(value: AnimatedComponent[feTile]): Self = StObject.set(x, "feTile", value.asInstanceOf[js.Any])
      
      inline def setFeTurbulence(value: AnimatedComponent[feTurbulence]): Self = StObject.set(x, "feTurbulence", value.asInstanceOf[js.Any])
      
      inline def setFieldset(value: AnimatedComponent[fieldset]): Self = StObject.set(x, "fieldset", value.asInstanceOf[js.Any])
      
      inline def setFigcaption(value: AnimatedComponent[figcaption]): Self = StObject.set(x, "figcaption", value.asInstanceOf[js.Any])
      
      inline def setFigure(value: AnimatedComponent[figure]): Self = StObject.set(x, "figure", value.asInstanceOf[js.Any])
      
      inline def setFilter(value: AnimatedComponent[filter]): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      inline def setFooter(value: AnimatedComponent[footer]): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
      
      inline def setForeignObject(value: AnimatedComponent[foreignObject]): Self = StObject.set(x, "foreignObject", value.asInstanceOf[js.Any])
      
      inline def setForm(value: AnimatedComponent[form]): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
      
      inline def setG(value: AnimatedComponent[g]): Self = StObject.set(x, "g", value.asInstanceOf[js.Any])
      
      inline def setH1(value: AnimatedComponent[h1]): Self = StObject.set(x, "h1", value.asInstanceOf[js.Any])
      
      inline def setH2(value: AnimatedComponent[h2]): Self = StObject.set(x, "h2", value.asInstanceOf[js.Any])
      
      inline def setH3(value: AnimatedComponent[h3]): Self = StObject.set(x, "h3", value.asInstanceOf[js.Any])
      
      inline def setH4(value: AnimatedComponent[h4]): Self = StObject.set(x, "h4", value.asInstanceOf[js.Any])
      
      inline def setH5(value: AnimatedComponent[h5]): Self = StObject.set(x, "h5", value.asInstanceOf[js.Any])
      
      inline def setH6(value: AnimatedComponent[h6]): Self = StObject.set(x, "h6", value.asInstanceOf[js.Any])
      
      inline def setHead(value: AnimatedComponent[head]): Self = StObject.set(x, "head", value.asInstanceOf[js.Any])
      
      inline def setHeader(value: AnimatedComponent[header]): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setHgroup(value: AnimatedComponent[hgroup]): Self = StObject.set(x, "hgroup", value.asInstanceOf[js.Any])
      
      inline def setHr(value: AnimatedComponent[hr]): Self = StObject.set(x, "hr", value.asInstanceOf[js.Any])
      
      inline def setHtml(value: AnimatedComponent[html]): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
      
      inline def setI(value: AnimatedComponent[i]): Self = StObject.set(x, "i", value.asInstanceOf[js.Any])
      
      inline def setIframe(value: AnimatedComponent[iframe]): Self = StObject.set(x, "iframe", value.asInstanceOf[js.Any])
      
      inline def setImage(value: AnimatedComponent[image]): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      inline def setImg(value: AnimatedComponent[img]): Self = StObject.set(x, "img", value.asInstanceOf[js.Any])
      
      inline def setInput(value: AnimatedComponent[input]): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      inline def setIns(value: AnimatedComponent[ins]): Self = StObject.set(x, "ins", value.asInstanceOf[js.Any])
      
      inline def setKbd(value: AnimatedComponent[kbd]): Self = StObject.set(x, "kbd", value.asInstanceOf[js.Any])
      
      inline def setKeygen(value: AnimatedComponent[keygen]): Self = StObject.set(x, "keygen", value.asInstanceOf[js.Any])
      
      inline def setLabel(value: AnimatedComponent[label]): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLegend(value: AnimatedComponent[legend]): Self = StObject.set(x, "legend", value.asInstanceOf[js.Any])
      
      inline def setLi(value: AnimatedComponent[li]): Self = StObject.set(x, "li", value.asInstanceOf[js.Any])
      
      inline def setLine(value: AnimatedComponent[line]): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      inline def setLinearGradient(value: AnimatedComponent[linearGradient]): Self = StObject.set(x, "linearGradient", value.asInstanceOf[js.Any])
      
      inline def setLink(value: AnimatedComponent[link]): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
      
      inline def setMain(value: AnimatedComponent[main]): Self = StObject.set(x, "main", value.asInstanceOf[js.Any])
      
      inline def setMap(value: AnimatedComponent[map]): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      inline def setMark(value: AnimatedComponent[mark]): Self = StObject.set(x, "mark", value.asInstanceOf[js.Any])
      
      inline def setMarker(value: AnimatedComponent[marker]): Self = StObject.set(x, "marker", value.asInstanceOf[js.Any])
      
      inline def setMask(value: AnimatedComponent[mask]): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
      
      inline def setMenu(value: AnimatedComponent[menu]): Self = StObject.set(x, "menu", value.asInstanceOf[js.Any])
      
      inline def setMenuitem(value: AnimatedComponent[menuitem]): Self = StObject.set(x, "menuitem", value.asInstanceOf[js.Any])
      
      inline def setMeta(value: AnimatedComponent[meta]): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      inline def setMetadata(value: AnimatedComponent[metadata]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setMeter(value: AnimatedComponent[meter]): Self = StObject.set(x, "meter", value.asInstanceOf[js.Any])
      
      inline def setMpath(value: AnimatedComponent[mpath]): Self = StObject.set(x, "mpath", value.asInstanceOf[js.Any])
      
      inline def setNav(value: AnimatedComponent[nav]): Self = StObject.set(x, "nav", value.asInstanceOf[js.Any])
      
      inline def setNoindex(value: AnimatedComponent[noindex]): Self = StObject.set(x, "noindex", value.asInstanceOf[js.Any])
      
      inline def setNoscript(value: AnimatedComponent[noscript]): Self = StObject.set(x, "noscript", value.asInstanceOf[js.Any])
      
      inline def setObject(value: AnimatedComponent[`object`]): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      inline def setOl(value: AnimatedComponent[ol]): Self = StObject.set(x, "ol", value.asInstanceOf[js.Any])
      
      inline def setOptgroup(value: AnimatedComponent[optgroup]): Self = StObject.set(x, "optgroup", value.asInstanceOf[js.Any])
      
      inline def setOption(value: AnimatedComponent[option]): Self = StObject.set(x, "option", value.asInstanceOf[js.Any])
      
      inline def setOutput(value: AnimatedComponent[output]): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
      
      inline def setP(value: AnimatedComponent[p]): Self = StObject.set(x, "p", value.asInstanceOf[js.Any])
      
      inline def setParam(value: AnimatedComponent[param]): Self = StObject.set(x, "param", value.asInstanceOf[js.Any])
      
      inline def setPath(value: AnimatedComponent[path]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPattern(value: AnimatedComponent[pattern]): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
      
      inline def setPicture(value: AnimatedComponent[picture]): Self = StObject.set(x, "picture", value.asInstanceOf[js.Any])
      
      inline def setPolygon(value: AnimatedComponent[polygon]): Self = StObject.set(x, "polygon", value.asInstanceOf[js.Any])
      
      inline def setPolyline(value: AnimatedComponent[polyline]): Self = StObject.set(x, "polyline", value.asInstanceOf[js.Any])
      
      inline def setPre(value: AnimatedComponent[pre]): Self = StObject.set(x, "pre", value.asInstanceOf[js.Any])
      
      inline def setProgress(value: AnimatedComponent[progress]): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
      
      inline def setQ(value: AnimatedComponent[q]): Self = StObject.set(x, "q", value.asInstanceOf[js.Any])
      
      inline def setRadialGradient(value: AnimatedComponent[radialGradient]): Self = StObject.set(x, "radialGradient", value.asInstanceOf[js.Any])
      
      inline def setRect(value: AnimatedComponent[rect]): Self = StObject.set(x, "rect", value.asInstanceOf[js.Any])
      
      inline def setRp(value: AnimatedComponent[rp]): Self = StObject.set(x, "rp", value.asInstanceOf[js.Any])
      
      inline def setRt(value: AnimatedComponent[rt]): Self = StObject.set(x, "rt", value.asInstanceOf[js.Any])
      
      inline def setRuby(value: AnimatedComponent[ruby]): Self = StObject.set(x, "ruby", value.asInstanceOf[js.Any])
      
      inline def setS(value: AnimatedComponent[s]): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
      
      inline def setSamp(value: AnimatedComponent[samp]): Self = StObject.set(x, "samp", value.asInstanceOf[js.Any])
      
      inline def setScript(value: AnimatedComponent[script]): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
      
      inline def setSection(value: AnimatedComponent[section]): Self = StObject.set(x, "section", value.asInstanceOf[js.Any])
      
      inline def setSelect(value: AnimatedComponent[select]): Self = StObject.set(x, "select", value.asInstanceOf[js.Any])
      
      inline def setSlot(value: AnimatedComponent[slot]): Self = StObject.set(x, "slot", value.asInstanceOf[js.Any])
      
      inline def setSmall(value: AnimatedComponent[small]): Self = StObject.set(x, "small", value.asInstanceOf[js.Any])
      
      inline def setSource(value: AnimatedComponent[source]): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setSpan(value: AnimatedComponent[span]): Self = StObject.set(x, "span", value.asInstanceOf[js.Any])
      
      inline def setStop(value: AnimatedComponent[stop]): Self = StObject.set(x, "stop", value.asInstanceOf[js.Any])
      
      inline def setStrong(value: AnimatedComponent[strong]): Self = StObject.set(x, "strong", value.asInstanceOf[js.Any])
      
      inline def setStyle(value: AnimatedComponent[style]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setSub(value: AnimatedComponent[sub]): Self = StObject.set(x, "sub", value.asInstanceOf[js.Any])
      
      inline def setSummary(value: AnimatedComponent[summary]): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
      
      inline def setSup(value: AnimatedComponent[sup]): Self = StObject.set(x, "sup", value.asInstanceOf[js.Any])
      
      inline def setSvg(value: AnimatedComponent[svg]): Self = StObject.set(x, "svg", value.asInstanceOf[js.Any])
      
      inline def setSwitch(value: AnimatedComponent[switch]): Self = StObject.set(x, "switch", value.asInstanceOf[js.Any])
      
      inline def setSymbol(value: AnimatedComponent[symbol]): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
      
      inline def setTable(value: AnimatedComponent[table]): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
      
      inline def setTbody(value: AnimatedComponent[tbody]): Self = StObject.set(x, "tbody", value.asInstanceOf[js.Any])
      
      inline def setTd(value: AnimatedComponent[td]): Self = StObject.set(x, "td", value.asInstanceOf[js.Any])
      
      inline def setTemplate(value: AnimatedComponent[template]): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      inline def setText(value: AnimatedComponent[text]): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextPath(value: AnimatedComponent[textPath]): Self = StObject.set(x, "textPath", value.asInstanceOf[js.Any])
      
      inline def setTextarea(value: AnimatedComponent[textarea]): Self = StObject.set(x, "textarea", value.asInstanceOf[js.Any])
      
      inline def setTfoot(value: AnimatedComponent[tfoot]): Self = StObject.set(x, "tfoot", value.asInstanceOf[js.Any])
      
      inline def setTh(value: AnimatedComponent[th]): Self = StObject.set(x, "th", value.asInstanceOf[js.Any])
      
      inline def setThead(value: AnimatedComponent[thead]): Self = StObject.set(x, "thead", value.asInstanceOf[js.Any])
      
      inline def setTime(value: AnimatedComponent[time]): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: AnimatedComponent[title]): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTr(value: AnimatedComponent[tr]): Self = StObject.set(x, "tr", value.asInstanceOf[js.Any])
      
      inline def setTrack(value: AnimatedComponent[track]): Self = StObject.set(x, "track", value.asInstanceOf[js.Any])
      
      inline def setTspan(value: AnimatedComponent[tspan]): Self = StObject.set(x, "tspan", value.asInstanceOf[js.Any])
      
      inline def setU(value: AnimatedComponent[u]): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
      
      inline def setUl(value: AnimatedComponent[ul]): Self = StObject.set(x, "ul", value.asInstanceOf[js.Any])
      
      inline def setUse(value: AnimatedComponent[use]): Self = StObject.set(x, "use", value.asInstanceOf[js.Any])
      
      inline def setVar(value: AnimatedComponent[`var`]): Self = StObject.set(x, "var", value.asInstanceOf[js.Any])
      
      inline def setVideo(value: AnimatedComponent[video]): Self = StObject.set(x, "video", value.asInstanceOf[js.Any])
      
      inline def setView(value: AnimatedComponent[view]): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
      
      inline def setWbr(value: AnimatedComponent[wbr]): Self = StObject.set(x, "wbr", value.asInstanceOf[js.Any])
      
      inline def setWebview(value: AnimatedComponent[webview]): Self = StObject.set(x, "webview", value.asInstanceOf[js.Any])
    }
  }
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    [T, T] extends [infer T, infer DT] ? [DT] extends [never] ? never : DT extends void ? undefined : DT extends string | number ? DT | @react-spring/web.@react-spring/web/dist/declarations/src/animated.AnimatedLeaf<T> : DT extends object ? [@react-spring/web.@react-spring/web/dist/declarations/src/animated.ValidStyleProps<DT>] extends [never] ? DT extends std.ReadonlyArray<any> ? @react-spring/web.@react-spring/web/dist/declarations/src/animated.AnimatedStyles<DT> : DT : @react-spring/web.@react-spring/web/dist/declarations/src/animated.AnimatedStyle<T> : DT | @react-spring/web.@react-spring/web/dist/declarations/src/animated.AnimatedLeaf<T> : never
    }}}
    */
  @js.native
  trait AnimatedProp[T] extends StObject
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ P in keyof Props ]: P extends 'ref' | 'key'? Props[P] : @react-spring/web.@react-spring/web/dist/declarations/src/animated.AnimatedProp<Props[P]>}
    }}}
    */
  @js.native
  trait AnimatedProps[Props /* <: js.Object */] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    [T, T] extends [infer T, infer DT] ? DT extends void ? undefined : [DT] extends [never] ? never : DT extends string | number ? DT | @react-spring/web.@react-spring/web/dist/declarations/src/animated.AnimatedLeaf<T> : DT extends object ? @react-spring/web.@react-spring/web/dist/declarations/src/animated.AnimatedObject<DT> : DT | @react-spring/web.@react-spring/web/dist/declarations/src/animated.AnimatedLeaf<T> : never
    }}}
    */
  @js.native
  trait AnimatedStyle[T] extends StObject
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ P in keyof T ]: [T[P]] extends [infer DT]? DT extends object? [@react-spring/web.@react-spring/web/dist/declarations/src/animated.ValidStyleProps<DT>] extends [never]? DT extends std.ReadonlyArray<any>? @react-spring/web.@react-spring/web/dist/declarations/src/animated.AnimatedStyles<DT> : DT : {[ P in keyof DT ]: @react-spring/web.@react-spring/web/dist/declarations/src/animated.AnimatedProp<DT[P]>} : DT : never}
    }}}
    */
  @js.native
  trait AnimatedStyles[T /* <: js.Array[Any] */] extends StObject
  
  type Length = Double | String
  
  type NonObject[T] = (Extract[T, String | Double | (js.Array[String | Double])]) | (Exclude[T, js.Object | Unit])
  
  /* Inlined keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.StyleProps */
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitMaskBoxImage
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitTextStroke
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.imageOrientation
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozUserFocus
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.overscrollBehavior
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.translate
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.textSizeAdjust
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.scrollSnapMarginLeft
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.borderInlineEndWidth
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msScrollbarTrackColor
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozMarginEnd
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.columnRuleStyle
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.maxLines
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.borderColor
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msScrollChaining
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.gridTemplate
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozOutlineRadius
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.offsetAnchor
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.backgroundImage
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitBoxSizing
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.flexWrap
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.scrollPaddingRight
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.skew
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.objectPosition
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.rotate3d
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.floodOpacity
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitFlexBasis
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msTextCombineHorizontal
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozTextDecorationLine
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitBoxOrient
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozOutlineRadiusTopleft
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.fillOpacity
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msContentZooming
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.scrollSnapMarginTop
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.borderImageWidth
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozAnimation
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.scale3d
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozBorderEndColor
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.borderInline
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msScrollLimit
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.fontSizeAdjust
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.shapeRendering
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.boxOrient
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozBorderLeftColors
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.width
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.borderInlineEndStyle
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.borderTopWidth
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitBorderBefore
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.fontVariant
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.maskMode
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitBackdropFilter
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.textAlign
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.gridAutoColumns
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.background
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.gridAutoFlow
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.KhtmlUserSelect
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.gridTemplateAreas
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.animationComposition
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.overscrollBehaviorBlock
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.vectorEffect
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.strokeMiterlimit
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.textDecorationColor
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msHighContrastAdjust
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitBackgroundSize
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitTextSizeAdjust
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.verticalAlign
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.fontWeight
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.maskBorderMode
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.KhtmlBoxDirection
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.animation
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msScrollbar3dlightColor
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.lineHeight
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.fontVariantEastAsian
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozBorderTopColors
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.transformOrigin
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msTransformOrigin
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.textEmphasis
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.userSelect
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msAccelerator
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msTransition
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.maxInlineSize
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitScrollSnapType
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.visibility
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.y
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.hack
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.marginInlineEnd
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozOutlineRadiusBottomleft
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.overscrollBehaviorY
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.gridColumnGap
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.blockSize
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitMaskOrigin
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.backgroundSize
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.borderTopRightRadius
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozTransitionDuration
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitFontVariantLigatures
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.borderLeftStyle
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.height
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.rubyMerge
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.boxAlign
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitBackgroundOrigin
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.backgroundPositionX
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.offsetRotation
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitAnimationIterationCount
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.translate3d
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.gridTemplateColumns
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msContentZoomLimitMax
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.wordBreak
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.pageBreakAfter
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozForceBrokenImageIcon
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.paddingRight
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.borderInlineStartWidth
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozColumnRuleWidth
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.rotateY
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.borderBlockStartColor
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msFlexPositive
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitColumns
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.animationDuration
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.shapeMargin
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.textDecorationLine
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.fontFeatureSettings
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitBoxAlign
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozPaddingStart
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitBorderBottomLeftRadius
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.fill
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.counterIncrement
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.paddingInlineStart
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.motionPath
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.boxShadow
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.scrollMargin
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.marginBlockEnd
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.OAnimationDirection
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.textOverflow
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitBorderBeforeColor
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitAnimationFillMode
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozImageRegion
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.backgroundColor
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.borderStartStartRadius
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.color
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitBoxPack
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.tableLayout
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozAnimationDirection
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitFlexGrow
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msFlexDirection
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.textDecorationSkipInk
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.paintOrder
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msHyphenateLimitChars
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.OTransform
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitMaskRepeat
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.boxDirection
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitMarginEnd
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.scrollMarginRight
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.offsetPath
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.border
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitClipPath
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitBackfaceVisibility
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozColumns
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.backfaceVisibility
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.overflowAnchor
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.overscrollBehaviorInline
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.columnSpan
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitLineBreak
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.skewX
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitBorderImageSlice
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitBorderBottomRightRadius
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitMaskPositionY
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.OTextOverflow
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.mathDepth
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.scale
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.animationIterationCount
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozBoxFlex
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.borderBottomWidth
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.backgroundClip
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.pageBreakInside
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.overflowY
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msHyphenateLimitZone
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.counterSet
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.marginRight
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msScrollSnapPointsX
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.clipRule
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozFontFeatureSettings
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msGridColumns
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.matrix3d
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitBackgroundClip
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.boxFlexGroup
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozColumnRuleColor
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitBoxFlex
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitTransformStyle
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.mathShift
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.maxBlockSize
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.offsetBlockEnd
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozBackgroundInlinePolicy
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.OAnimationPlayState
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozBorderStartColor
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.animationTimingFunction
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozAnimationFillMode
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.outlineWidth
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.lightingColor
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitTextDecorationSkip
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msTextAutospace
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.borderRightColor
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.flexFlow
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozAnimationName
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.transitionDuration
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.tabSize
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.scrollSnapDestination
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.paddingBlock
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.translateX
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.OAnimationFillMode
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitColumnRuleColor
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msImeMode
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.scrollPaddingBottom
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.order
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.float
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.backgroundOrigin
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozBoxPack
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.initialLetter
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.touchAction
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.textShadow
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msTransform
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitTextDecorationLine
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitFontKerning
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozWindowDragging
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.writingMode
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitAnimationName
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msScrollSnapType
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.maskType
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.borderStyle
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozPaddingEnd
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.fontLanguageOverride
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitUserSelect
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.borderBottomStyle
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.maskBorderSlice
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.OTransformOrigin
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.scrollSnapStop
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozBoxOrdinalGroup
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.fontVariantCaps
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msFlowInto
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.overflowInline
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.maskRepeat
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.borderLeft
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitMask
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.scrollSnapType
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitFlexShrink
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitBoxLines
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozTransition
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.outlineOffset
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.borderCollapse
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.OTransition
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.baselineShift
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.justifyContent
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.borderBlockStartStyle
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.animationFillMode
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozOutlineRadiusTopright
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.textDecorationThickness
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.animationPlayState
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.appearance
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.flexDirection
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.paddingInline
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.maskPosition
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.cursor
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.transitionDelay
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.perspectiveOrigin
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitMaskSize
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.maskBorderRepeat
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitTapHighlightColor
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitAnimationTimingFunction
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozBoxOrient
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.offsetInline
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.zIndex
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msContentZoomSnapType
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozColumnWidth
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitBorderTopLeftRadius
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozOutlineColor
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.captionSide
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.borderInlineColor
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.animationTimeline
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.offsetBlockStart
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.maskBorderOutset
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozTransitionProperty
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.fontSmooth
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozBackgroundClip
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozAnimationTimingFunction
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.borderBottom
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozAppearance
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitBorderTopRightRadius
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitAnimation
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.scrollSnapCoordinate
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.gridRow
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozColumnRuleStyle
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.backgroundAttachment
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozOutlineWidth
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.boxPack
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.letterSpacing
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.listStyleImage
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.borderBlockStyle
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitMaskPosition
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.minInlineSize
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.marginInlineStart
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozAnimationDelay
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitTextEmphasis
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitAnimationDirection
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.borderImage
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.textDecorationSkip
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozPerspectiveOrigin
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msScrollSnapY
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozMarginStart
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.outlineColor
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.alignContent
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitOrder
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.resize
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.strokeLinecap
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.scrollPaddingLeft
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozOpacity
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.columnWidth
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.mask
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msScrollbarShadowColor
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msTransitionDuration
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitBorderBeforeStyle
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozUserSelect
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitTextDecorationStyle
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozTextBlink
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.borderInlineWidth
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitUserModify
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.motionDistance
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.fontSynthesis
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.columnRule
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.scrollSnapPointsY
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.pointerEvents
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.borderLeftWidth
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.minHeight
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitMarginStart
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.transformBox
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.whiteSpace
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.textAlignLast
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.insetBlock
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitMaskBoxImageOutset
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msTouchAction
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitColumnRuleStyle
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitAlignContent
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.position
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozBorderRadiusTopleft
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msWrapThrough
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.imageResolution
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitTransitionTimingFunction
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozOsxFontSmoothing
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.maxWidth
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.transition
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.KhtmlBoxAlign
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozColumnFill
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitTransitionProperty
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.offsetInlineStart
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msOverflowX
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.isolation
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.alignmentBaseline
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.insetBlockEnd
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.gridTemplateRows
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozWindowShadow
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.scrollSnapMarginBottom
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.z
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.OBackgroundSize
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.maskSize
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.borderBlockStartWidth
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitFontSmoothing
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.printColorAdjust
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.offset
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.KhtmlBoxFlexGroup
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozBoxAlign
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msWrapFlow
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msContentZoomSnap
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitPaddingEnd
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.quotes
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozHyphens
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.columnGap
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozOrient
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.scrollbarColor
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.textUnderlinePosition
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.borderInlineStartColor
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozPerspective
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.wordWrap
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozBackgroundSize
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msUserSelect
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.borderImageOutset
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.fontStyle
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.scrollMarginTop
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitPerspective
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msHyphenateLimitLines
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.scrollPaddingInlineStart
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.fontKerning
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.lineHeightStep
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msScrollbarArrowColor
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitScrollSnapPointsX
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.textAnchor
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.counterReset
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.borderBlock
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitColumnWidth
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.shapeImageThreshold
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.textOrientation
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozBorderRadiusBottomleft
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msContentZoomLimit
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msFlex
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.OAnimationDelay
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozTransitionDelay
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.contentVisibility
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.borderBlockWidth
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitMaskBoxImageSlice
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.margin
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.strokeOpacity
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.perspective
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.right
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitColumnRule
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msScrollSnapX
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.fontOpticalSizing
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.maskBorder
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitBoxReflect
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitBorderImage
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msOrder
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitOverflowScrolling
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.display
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.glyphOrientationVertical
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.borderRightWidth
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.strokeWidth
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.maskComposite
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.borderImageSlice
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.overflowClipMargin
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozBorderEndWidth
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.backgroundPosition
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.rubyPosition
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msFilter
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.imeMode
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitMaxInlineSize
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.scrollMarginInlineStart
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.x
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitFlex
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msTextOverflow
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozTextSizeAdjust
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.font
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozOutline
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitColumnFill
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.listStyle
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.maskImage
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.scrollSnapMargin
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitTransitionDuration
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.padding
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozBorderImage
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.scrollMarginBottom
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitAppearance
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.paddingBlockStart
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.borderTopColor
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.borderInlineEndColor
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitBoxOrdinalGroup
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.animationDelay
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.maxHeight
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.objectFit
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.KhtmlBoxOrient
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.marginTop
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozAnimationIterationCount
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozBorderRadiusTopright
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.flex
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitTextCombine
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.emptyCells
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.boxSizing
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitJustifyContent
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.scaleY
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitAnimationPlayState
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.justifyTracks
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozBoxShadow
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitPaddingStart
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msWrapMargin
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozFontLanguageOverride
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.outlineStyle
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msTransitionTimingFunction
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.strokeLinejoin
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.accentColor
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.strokeDashoffset
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.borderRight
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.flexGrow
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.listStylePosition
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.rowGap
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozTabSize
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.dominantBaseline
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.widows
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.borderBlockEndColor
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msWritingMode
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msContentZoomLimitMin
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozAnimationDuration
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.OTransitionProperty
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitBoxShadow
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozColumnCount
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.direction
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.backdropFilter
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.textEmphasisColor
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitColumnSpan
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msContentZoomChaining
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.flexBasis
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.textCombineUpright
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozFloatEdge
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.unicodeBidi
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.borderSpacing
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.scrollMarginInline
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.overflowWrap
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitTextEmphasisPosition
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.transform
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.maskOrigin
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.scrollbarWidth
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitScrollSnapPointsY
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.borderInlineEnd
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.borderBlockEndWidth
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.willChange
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.fontVariantLigatures
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.borderStartEndRadius
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.justifyItems
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.textEmphasisPosition
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.mixBlendMode
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.offsetRotate
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.scrollPadding
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.marginBlockStart
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.OAnimationName
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.insetInline
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.content
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.paddingInlineEnd
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.hangingPunctuation
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.textTransform
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitAnimationDelay
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozTextDecorationColor
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitPerspectiveOrigin
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.offsetDistance
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.scrollPaddingInlineEnd
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.textRendering
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.shapeOutside
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.wordSpacing
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitTextEmphasisStyle
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.backgroundBlendMode
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.textJustify
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.zoom
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.fontVariantPosition
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.justifySelf
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.minBlockSize
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.columnFill
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozContextProperties
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.placeItems
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozTextDecorationStyle
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.borderLeftColor
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitTextOrientation
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.OObjectFit
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.gridColumn
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.KhtmlOpacity
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.borderInlineStartStyle
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.hyphenateCharacter
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitFilter
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitTouchCallout
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.overflow
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozBorderRadius
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitInitialLetter
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.scrollMarginLeft
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msBlockProgression
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msScrollLimitXMax
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.fontVariantNumeric
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozBorderBottomColors
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.scrollPaddingBlock
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitMaskBoxImageSource
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.gridColumnStart
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.forcedColorAdjust
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.paddingBottom
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozBoxSizing
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msOverflowStyle
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msScrollbarDarkshadowColor
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.borderBlockEndStyle
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.inputSecurity
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.fontSize
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.OAnimationTimingFunction
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.paddingTop
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitMaskPositionX
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.scrollSnapTypeY
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.OTabSize
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.translateZ
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.KhtmlBoxPack
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.caretColor
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitTransformOrigin
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.OAnimationDuration
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.transitionProperty
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.overflowBlock
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.scrollMarginInlineEnd
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.fontVariantAlternates
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.matrix
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozColumnRule
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitRubyPosition
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.alignItems
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.animationName
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.OAnimation
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.borderInlineStart
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.colorInterpolation
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.insetInlineEnd
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.breakAfter
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.borderEndEndRadius
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.filter
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msScrollSnapPointsY
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.KhtmlBoxFlex
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.listStyleType
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.markerEnd
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitBorderBeforeWidth
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.stopOpacity
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.boxFlex
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitWritingMode
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.columns
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitMaskClip
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.KhtmlLineBreak
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msScrollbarHighlightColor
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.scrollMarginBlockEnd
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.gridRowGap
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.borderWidth
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitTextEmphasisColor
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.left
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.animationDirection
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.scrollPaddingBlockEnd
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.marginBottom
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.skewY
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.scrollPaddingTop
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.clipPath
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.columnRuleColor
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.placeContent
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.bottom
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msScrollLimitYMax
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.stroke
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitFontFeatureSettings
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.fillRule
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.textIndent
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msScrollLimitXMin
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.borderRadius
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msScrollTranslation
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.translateY
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.scrollPaddingBlockStart
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.contain
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.insetInlineStart
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.motionRotation
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitBorderRadius
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.overscrollBehaviorX
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.boxLines
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.stopColor
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.backgroundRepeat
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozUserModify
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.textUnderlineOffset
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.alignSelf
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.borderBottomLeftRadius
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitMaskRepeatX
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.OTransitionDuration
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.scrollSnapPointsX
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.scrollBehavior
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitMaskComposite
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.scaleZ
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitBoxDirection
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.colorRendering
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.OObjectPosition
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.KhtmlBoxLines
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.scrollMarginBlock
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.borderEndStartRadius
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.columnRuleWidth
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitColumnCount
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msOverflowY
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.breakInside
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.scrollPaddingInline
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.OTransitionTimingFunction
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.scrollSnapAlign
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.transitionTimingFunction
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozBinding
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.borderInlineStyle
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.marginInline
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.borderTop
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozOutlineRadiusBottomright
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.rotateZ
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitFlexFlow
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.textEmphasisStyle
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.azimuth
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.minWidth
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.imageRendering
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitColumnRuleWidth
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozBorderStartStyle
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.borderBottomRightRadius
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.marginLeft
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.gridArea
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.mathStyle
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.lineClamp
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozTransformOrigin
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msLineBreak
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitHyphens
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.markerMid
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.boxDecorationBreak
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.KhtmlBoxOrdinalGroup
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.all
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.borderBlockColor
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.gridRowStart
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitMaskRepeatY
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.gridColumnEnd
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msWordBreak
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.overflowX
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozBoxDirection
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.lineBreak
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.insetBlockStart
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.maskBorderWidth
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitTransition
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozTextAlignLast
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.scrollSnapTypeX
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitPrintColorAdjust
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozAnimationPlayState
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozTransitionTimingFunction
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msContentZoomSnapPoints
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.placeSelf
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.colorScheme
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.top
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitAlignSelf
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.textDecoration
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.borderRightStyle
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitMaskBoxImageRepeat
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msScrollLimitYMin
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.transformStyle
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.inlineSize
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.colorAdjust
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.grid
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.aspectRatio
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.marginBlock
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitTextStrokeColor
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitMaskAttachment
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitTransform
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.scrollbarGutter
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.floodColor
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitHyphenateCharacter
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.hyphens
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.marker
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitFlexDirection
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozBackgroundOrigin
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.OAnimationIterationCount
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitTextStrokeWidth
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.textDecorationStyle
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.flexShrink
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozBorderEndStyle
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.strokeDasharray
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozBorderRadiusBottomright
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitLineClamp
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.clip
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.motion
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozTransformStyle
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.fontStretch
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.rotate
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitTransitionDelay
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.blockOverflow
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.offsetBlock
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozUserInput
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msImeAlign
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.pageBreakBefore
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozBackfaceVisibility
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.overflowClipBox
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.gridGap
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.borderImageRepeat
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitShapeMargin
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msScrollRails
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitBoxFlexGroup
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.borderBlockStart
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.gap
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msHyphens
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.rotateX
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.rubyAlign
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.maskBorderSource
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozOutlineStyle
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msFlowFrom
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitTextUnderlinePosition
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.fontVariationSettings
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.columnCount
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitTextFillColor
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.borderBottomColor
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msTouchSelect
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitMaskImage
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.borderTopLeftRadius
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msScrollbarFaceColor
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitTextDecorationColor
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.gridAutoRows
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.breakBefore
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msScrollbarBaseColor
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.opacity
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.orphans
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.backgroundPositionY
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.outline
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozBorderRightColors
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitFlexWrap
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitAlignItems
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.offsetInlineEnd
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.borderBlockEnd
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitBoxDecorationBreak
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitAnimationDuration
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.maskClip
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.paddingBlockEnd
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.clear
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.inset
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.boxOrdinalGroup
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.borderImageSource
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.paddingLeft
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msGridRows
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.gridRowEnd
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.scaleX
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.borderTopStyle
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msTransitionProperty
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitMaskBoxImageWidth
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.scrollSnapMarginRight
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.markerStart
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozStackSizing
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.alignTracks
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.scrollMarginBlockStart
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msTransitionDelay
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.OTransitionDelay
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.OBorderImage
    - typingsJapgolly.reactSpringWeb.reactSpringWebStrings.fontFamily
  */
  trait StylePropKeys extends StObject
  object StylePropKeys {
    
    inline def KhtmlBoxAlign: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.KhtmlBoxAlign = "KhtmlBoxAlign".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.KhtmlBoxAlign]
    
    inline def KhtmlBoxDirection: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.KhtmlBoxDirection = "KhtmlBoxDirection".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.KhtmlBoxDirection]
    
    inline def KhtmlBoxFlex: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.KhtmlBoxFlex = "KhtmlBoxFlex".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.KhtmlBoxFlex]
    
    inline def KhtmlBoxFlexGroup: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.KhtmlBoxFlexGroup = "KhtmlBoxFlexGroup".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.KhtmlBoxFlexGroup]
    
    inline def KhtmlBoxLines: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.KhtmlBoxLines = "KhtmlBoxLines".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.KhtmlBoxLines]
    
    inline def KhtmlBoxOrdinalGroup: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.KhtmlBoxOrdinalGroup = "KhtmlBoxOrdinalGroup".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.KhtmlBoxOrdinalGroup]
    
    inline def KhtmlBoxOrient: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.KhtmlBoxOrient = "KhtmlBoxOrient".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.KhtmlBoxOrient]
    
    inline def KhtmlBoxPack: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.KhtmlBoxPack = "KhtmlBoxPack".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.KhtmlBoxPack]
    
    inline def KhtmlLineBreak: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.KhtmlLineBreak = "KhtmlLineBreak".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.KhtmlLineBreak]
    
    inline def KhtmlOpacity: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.KhtmlOpacity = "KhtmlOpacity".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.KhtmlOpacity]
    
    inline def KhtmlUserSelect: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.KhtmlUserSelect = "KhtmlUserSelect".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.KhtmlUserSelect]
    
    inline def MozAnimation: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozAnimation = "MozAnimation".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozAnimation]
    
    inline def MozAnimationDelay: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozAnimationDelay = "MozAnimationDelay".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozAnimationDelay]
    
    inline def MozAnimationDirection: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozAnimationDirection = "MozAnimationDirection".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozAnimationDirection]
    
    inline def MozAnimationDuration: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozAnimationDuration = "MozAnimationDuration".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozAnimationDuration]
    
    inline def MozAnimationFillMode: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozAnimationFillMode = "MozAnimationFillMode".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozAnimationFillMode]
    
    inline def MozAnimationIterationCount: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozAnimationIterationCount = "MozAnimationIterationCount".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozAnimationIterationCount]
    
    inline def MozAnimationName: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozAnimationName = "MozAnimationName".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozAnimationName]
    
    inline def MozAnimationPlayState: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozAnimationPlayState = "MozAnimationPlayState".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozAnimationPlayState]
    
    inline def MozAnimationTimingFunction: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozAnimationTimingFunction = "MozAnimationTimingFunction".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozAnimationTimingFunction]
    
    inline def MozAppearance: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozAppearance = "MozAppearance".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozAppearance]
    
    inline def MozBackfaceVisibility: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozBackfaceVisibility = "MozBackfaceVisibility".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozBackfaceVisibility]
    
    inline def MozBackgroundClip: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozBackgroundClip = "MozBackgroundClip".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozBackgroundClip]
    
    inline def MozBackgroundInlinePolicy: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozBackgroundInlinePolicy = "MozBackgroundInlinePolicy".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozBackgroundInlinePolicy]
    
    inline def MozBackgroundOrigin: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozBackgroundOrigin = "MozBackgroundOrigin".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozBackgroundOrigin]
    
    inline def MozBackgroundSize: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozBackgroundSize = "MozBackgroundSize".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozBackgroundSize]
    
    inline def MozBinding: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozBinding = "MozBinding".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozBinding]
    
    inline def MozBorderBottomColors: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozBorderBottomColors = "MozBorderBottomColors".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozBorderBottomColors]
    
    inline def MozBorderEndColor: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozBorderEndColor = "MozBorderEndColor".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozBorderEndColor]
    
    inline def MozBorderEndStyle: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozBorderEndStyle = "MozBorderEndStyle".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozBorderEndStyle]
    
    inline def MozBorderEndWidth: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozBorderEndWidth = "MozBorderEndWidth".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozBorderEndWidth]
    
    inline def MozBorderImage: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozBorderImage = "MozBorderImage".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozBorderImage]
    
    inline def MozBorderLeftColors: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozBorderLeftColors = "MozBorderLeftColors".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozBorderLeftColors]
    
    inline def MozBorderRadius: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozBorderRadius = "MozBorderRadius".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozBorderRadius]
    
    inline def MozBorderRadiusBottomleft: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozBorderRadiusBottomleft = "MozBorderRadiusBottomleft".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozBorderRadiusBottomleft]
    
    inline def MozBorderRadiusBottomright: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozBorderRadiusBottomright = "MozBorderRadiusBottomright".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozBorderRadiusBottomright]
    
    inline def MozBorderRadiusTopleft: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozBorderRadiusTopleft = "MozBorderRadiusTopleft".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozBorderRadiusTopleft]
    
    inline def MozBorderRadiusTopright: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozBorderRadiusTopright = "MozBorderRadiusTopright".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozBorderRadiusTopright]
    
    inline def MozBorderRightColors: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozBorderRightColors = "MozBorderRightColors".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozBorderRightColors]
    
    inline def MozBorderStartColor: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozBorderStartColor = "MozBorderStartColor".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozBorderStartColor]
    
    inline def MozBorderStartStyle: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozBorderStartStyle = "MozBorderStartStyle".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozBorderStartStyle]
    
    inline def MozBorderTopColors: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozBorderTopColors = "MozBorderTopColors".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozBorderTopColors]
    
    inline def MozBoxAlign: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozBoxAlign = "MozBoxAlign".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozBoxAlign]
    
    inline def MozBoxDirection: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozBoxDirection = "MozBoxDirection".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozBoxDirection]
    
    inline def MozBoxFlex: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozBoxFlex = "MozBoxFlex".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozBoxFlex]
    
    inline def MozBoxOrdinalGroup: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozBoxOrdinalGroup = "MozBoxOrdinalGroup".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozBoxOrdinalGroup]
    
    inline def MozBoxOrient: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozBoxOrient = "MozBoxOrient".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozBoxOrient]
    
    inline def MozBoxPack: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozBoxPack = "MozBoxPack".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozBoxPack]
    
    inline def MozBoxShadow: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozBoxShadow = "MozBoxShadow".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozBoxShadow]
    
    inline def MozBoxSizing: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozBoxSizing = "MozBoxSizing".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozBoxSizing]
    
    inline def MozColumnCount: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozColumnCount = "MozColumnCount".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozColumnCount]
    
    inline def MozColumnFill: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozColumnFill = "MozColumnFill".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozColumnFill]
    
    inline def MozColumnRule: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozColumnRule = "MozColumnRule".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozColumnRule]
    
    inline def MozColumnRuleColor: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozColumnRuleColor = "MozColumnRuleColor".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozColumnRuleColor]
    
    inline def MozColumnRuleStyle: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozColumnRuleStyle = "MozColumnRuleStyle".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozColumnRuleStyle]
    
    inline def MozColumnRuleWidth: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozColumnRuleWidth = "MozColumnRuleWidth".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozColumnRuleWidth]
    
    inline def MozColumnWidth: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozColumnWidth = "MozColumnWidth".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozColumnWidth]
    
    inline def MozColumns: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozColumns = "MozColumns".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozColumns]
    
    inline def MozContextProperties: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozContextProperties = "MozContextProperties".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozContextProperties]
    
    inline def MozFloatEdge: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozFloatEdge = "MozFloatEdge".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozFloatEdge]
    
    inline def MozFontFeatureSettings: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozFontFeatureSettings = "MozFontFeatureSettings".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozFontFeatureSettings]
    
    inline def MozFontLanguageOverride: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozFontLanguageOverride = "MozFontLanguageOverride".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozFontLanguageOverride]
    
    inline def MozForceBrokenImageIcon: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozForceBrokenImageIcon = "MozForceBrokenImageIcon".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozForceBrokenImageIcon]
    
    inline def MozHyphens: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozHyphens = "MozHyphens".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozHyphens]
    
    inline def MozImageRegion: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozImageRegion = "MozImageRegion".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozImageRegion]
    
    inline def MozMarginEnd: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozMarginEnd = "MozMarginEnd".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozMarginEnd]
    
    inline def MozMarginStart: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozMarginStart = "MozMarginStart".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozMarginStart]
    
    inline def MozOpacity: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozOpacity = "MozOpacity".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozOpacity]
    
    inline def MozOrient: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozOrient = "MozOrient".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozOrient]
    
    inline def MozOsxFontSmoothing: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozOsxFontSmoothing = "MozOsxFontSmoothing".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozOsxFontSmoothing]
    
    inline def MozOutline: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozOutline = "MozOutline".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozOutline]
    
    inline def MozOutlineColor: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozOutlineColor = "MozOutlineColor".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozOutlineColor]
    
    inline def MozOutlineRadius: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozOutlineRadius = "MozOutlineRadius".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozOutlineRadius]
    
    inline def MozOutlineRadiusBottomleft: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozOutlineRadiusBottomleft = "MozOutlineRadiusBottomleft".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozOutlineRadiusBottomleft]
    
    inline def MozOutlineRadiusBottomright: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozOutlineRadiusBottomright = "MozOutlineRadiusBottomright".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozOutlineRadiusBottomright]
    
    inline def MozOutlineRadiusTopleft: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozOutlineRadiusTopleft = "MozOutlineRadiusTopleft".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozOutlineRadiusTopleft]
    
    inline def MozOutlineRadiusTopright: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozOutlineRadiusTopright = "MozOutlineRadiusTopright".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozOutlineRadiusTopright]
    
    inline def MozOutlineStyle: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozOutlineStyle = "MozOutlineStyle".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozOutlineStyle]
    
    inline def MozOutlineWidth: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozOutlineWidth = "MozOutlineWidth".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozOutlineWidth]
    
    inline def MozPaddingEnd: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozPaddingEnd = "MozPaddingEnd".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozPaddingEnd]
    
    inline def MozPaddingStart: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozPaddingStart = "MozPaddingStart".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozPaddingStart]
    
    inline def MozPerspective: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozPerspective = "MozPerspective".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozPerspective]
    
    inline def MozPerspectiveOrigin: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozPerspectiveOrigin = "MozPerspectiveOrigin".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozPerspectiveOrigin]
    
    inline def MozStackSizing: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozStackSizing = "MozStackSizing".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozStackSizing]
    
    inline def MozTabSize: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozTabSize = "MozTabSize".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozTabSize]
    
    inline def MozTextAlignLast: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozTextAlignLast = "MozTextAlignLast".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozTextAlignLast]
    
    inline def MozTextBlink: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozTextBlink = "MozTextBlink".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozTextBlink]
    
    inline def MozTextDecorationColor: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozTextDecorationColor = "MozTextDecorationColor".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozTextDecorationColor]
    
    inline def MozTextDecorationLine: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozTextDecorationLine = "MozTextDecorationLine".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozTextDecorationLine]
    
    inline def MozTextDecorationStyle: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozTextDecorationStyle = "MozTextDecorationStyle".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozTextDecorationStyle]
    
    inline def MozTextSizeAdjust: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozTextSizeAdjust = "MozTextSizeAdjust".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozTextSizeAdjust]
    
    inline def MozTransformOrigin: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozTransformOrigin = "MozTransformOrigin".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozTransformOrigin]
    
    inline def MozTransformStyle: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozTransformStyle = "MozTransformStyle".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozTransformStyle]
    
    inline def MozTransition: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozTransition = "MozTransition".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozTransition]
    
    inline def MozTransitionDelay: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozTransitionDelay = "MozTransitionDelay".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozTransitionDelay]
    
    inline def MozTransitionDuration: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozTransitionDuration = "MozTransitionDuration".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozTransitionDuration]
    
    inline def MozTransitionProperty: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozTransitionProperty = "MozTransitionProperty".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozTransitionProperty]
    
    inline def MozTransitionTimingFunction: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozTransitionTimingFunction = "MozTransitionTimingFunction".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozTransitionTimingFunction]
    
    inline def MozUserFocus: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozUserFocus = "MozUserFocus".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozUserFocus]
    
    inline def MozUserInput: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozUserInput = "MozUserInput".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozUserInput]
    
    inline def MozUserModify: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozUserModify = "MozUserModify".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozUserModify]
    
    inline def MozUserSelect: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozUserSelect = "MozUserSelect".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozUserSelect]
    
    inline def MozWindowDragging: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozWindowDragging = "MozWindowDragging".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozWindowDragging]
    
    inline def MozWindowShadow: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozWindowShadow = "MozWindowShadow".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.MozWindowShadow]
    
    inline def OAnimation: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.OAnimation = "OAnimation".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.OAnimation]
    
    inline def OAnimationDelay: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.OAnimationDelay = "OAnimationDelay".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.OAnimationDelay]
    
    inline def OAnimationDirection: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.OAnimationDirection = "OAnimationDirection".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.OAnimationDirection]
    
    inline def OAnimationDuration: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.OAnimationDuration = "OAnimationDuration".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.OAnimationDuration]
    
    inline def OAnimationFillMode: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.OAnimationFillMode = "OAnimationFillMode".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.OAnimationFillMode]
    
    inline def OAnimationIterationCount: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.OAnimationIterationCount = "OAnimationIterationCount".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.OAnimationIterationCount]
    
    inline def OAnimationName: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.OAnimationName = "OAnimationName".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.OAnimationName]
    
    inline def OAnimationPlayState: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.OAnimationPlayState = "OAnimationPlayState".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.OAnimationPlayState]
    
    inline def OAnimationTimingFunction: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.OAnimationTimingFunction = "OAnimationTimingFunction".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.OAnimationTimingFunction]
    
    inline def OBackgroundSize: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.OBackgroundSize = "OBackgroundSize".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.OBackgroundSize]
    
    inline def OBorderImage: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.OBorderImage = "OBorderImage".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.OBorderImage]
    
    inline def OObjectFit: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.OObjectFit = "OObjectFit".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.OObjectFit]
    
    inline def OObjectPosition: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.OObjectPosition = "OObjectPosition".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.OObjectPosition]
    
    inline def OTabSize: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.OTabSize = "OTabSize".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.OTabSize]
    
    inline def OTextOverflow: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.OTextOverflow = "OTextOverflow".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.OTextOverflow]
    
    inline def OTransform: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.OTransform = "OTransform".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.OTransform]
    
    inline def OTransformOrigin: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.OTransformOrigin = "OTransformOrigin".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.OTransformOrigin]
    
    inline def OTransition: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.OTransition = "OTransition".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.OTransition]
    
    inline def OTransitionDelay: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.OTransitionDelay = "OTransitionDelay".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.OTransitionDelay]
    
    inline def OTransitionDuration: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.OTransitionDuration = "OTransitionDuration".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.OTransitionDuration]
    
    inline def OTransitionProperty: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.OTransitionProperty = "OTransitionProperty".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.OTransitionProperty]
    
    inline def OTransitionTimingFunction: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.OTransitionTimingFunction = "OTransitionTimingFunction".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.OTransitionTimingFunction]
    
    inline def WebkitAlignContent: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitAlignContent = "WebkitAlignContent".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitAlignContent]
    
    inline def WebkitAlignItems: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitAlignItems = "WebkitAlignItems".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitAlignItems]
    
    inline def WebkitAlignSelf: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitAlignSelf = "WebkitAlignSelf".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitAlignSelf]
    
    inline def WebkitAnimation: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitAnimation = "WebkitAnimation".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitAnimation]
    
    inline def WebkitAnimationDelay: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitAnimationDelay = "WebkitAnimationDelay".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitAnimationDelay]
    
    inline def WebkitAnimationDirection: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitAnimationDirection = "WebkitAnimationDirection".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitAnimationDirection]
    
    inline def WebkitAnimationDuration: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitAnimationDuration = "WebkitAnimationDuration".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitAnimationDuration]
    
    inline def WebkitAnimationFillMode: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitAnimationFillMode = "WebkitAnimationFillMode".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitAnimationFillMode]
    
    inline def WebkitAnimationIterationCount: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitAnimationIterationCount = "WebkitAnimationIterationCount".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitAnimationIterationCount]
    
    inline def WebkitAnimationName: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitAnimationName = "WebkitAnimationName".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitAnimationName]
    
    inline def WebkitAnimationPlayState: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitAnimationPlayState = "WebkitAnimationPlayState".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitAnimationPlayState]
    
    inline def WebkitAnimationTimingFunction: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitAnimationTimingFunction = "WebkitAnimationTimingFunction".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitAnimationTimingFunction]
    
    inline def WebkitAppearance: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitAppearance = "WebkitAppearance".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitAppearance]
    
    inline def WebkitBackdropFilter: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitBackdropFilter = "WebkitBackdropFilter".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitBackdropFilter]
    
    inline def WebkitBackfaceVisibility: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitBackfaceVisibility = "WebkitBackfaceVisibility".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitBackfaceVisibility]
    
    inline def WebkitBackgroundClip: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitBackgroundClip = "WebkitBackgroundClip".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitBackgroundClip]
    
    inline def WebkitBackgroundOrigin: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitBackgroundOrigin = "WebkitBackgroundOrigin".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitBackgroundOrigin]
    
    inline def WebkitBackgroundSize: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitBackgroundSize = "WebkitBackgroundSize".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitBackgroundSize]
    
    inline def WebkitBorderBefore: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitBorderBefore = "WebkitBorderBefore".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitBorderBefore]
    
    inline def WebkitBorderBeforeColor: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitBorderBeforeColor = "WebkitBorderBeforeColor".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitBorderBeforeColor]
    
    inline def WebkitBorderBeforeStyle: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitBorderBeforeStyle = "WebkitBorderBeforeStyle".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitBorderBeforeStyle]
    
    inline def WebkitBorderBeforeWidth: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitBorderBeforeWidth = "WebkitBorderBeforeWidth".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitBorderBeforeWidth]
    
    inline def WebkitBorderBottomLeftRadius: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitBorderBottomLeftRadius = "WebkitBorderBottomLeftRadius".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitBorderBottomLeftRadius]
    
    inline def WebkitBorderBottomRightRadius: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitBorderBottomRightRadius = "WebkitBorderBottomRightRadius".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitBorderBottomRightRadius]
    
    inline def WebkitBorderImage: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitBorderImage = "WebkitBorderImage".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitBorderImage]
    
    inline def WebkitBorderImageSlice: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitBorderImageSlice = "WebkitBorderImageSlice".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitBorderImageSlice]
    
    inline def WebkitBorderRadius: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitBorderRadius = "WebkitBorderRadius".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitBorderRadius]
    
    inline def WebkitBorderTopLeftRadius: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitBorderTopLeftRadius = "WebkitBorderTopLeftRadius".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitBorderTopLeftRadius]
    
    inline def WebkitBorderTopRightRadius: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitBorderTopRightRadius = "WebkitBorderTopRightRadius".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitBorderTopRightRadius]
    
    inline def WebkitBoxAlign: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitBoxAlign = "WebkitBoxAlign".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitBoxAlign]
    
    inline def WebkitBoxDecorationBreak: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitBoxDecorationBreak = "WebkitBoxDecorationBreak".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitBoxDecorationBreak]
    
    inline def WebkitBoxDirection: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitBoxDirection = "WebkitBoxDirection".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitBoxDirection]
    
    inline def WebkitBoxFlex: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitBoxFlex = "WebkitBoxFlex".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitBoxFlex]
    
    inline def WebkitBoxFlexGroup: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitBoxFlexGroup = "WebkitBoxFlexGroup".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitBoxFlexGroup]
    
    inline def WebkitBoxLines: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitBoxLines = "WebkitBoxLines".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitBoxLines]
    
    inline def WebkitBoxOrdinalGroup: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitBoxOrdinalGroup = "WebkitBoxOrdinalGroup".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitBoxOrdinalGroup]
    
    inline def WebkitBoxOrient: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitBoxOrient = "WebkitBoxOrient".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitBoxOrient]
    
    inline def WebkitBoxPack: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitBoxPack = "WebkitBoxPack".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitBoxPack]
    
    inline def WebkitBoxReflect: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitBoxReflect = "WebkitBoxReflect".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitBoxReflect]
    
    inline def WebkitBoxShadow: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitBoxShadow = "WebkitBoxShadow".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitBoxShadow]
    
    inline def WebkitBoxSizing: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitBoxSizing = "WebkitBoxSizing".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitBoxSizing]
    
    inline def WebkitClipPath: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitClipPath = "WebkitClipPath".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitClipPath]
    
    inline def WebkitColumnCount: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitColumnCount = "WebkitColumnCount".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitColumnCount]
    
    inline def WebkitColumnFill: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitColumnFill = "WebkitColumnFill".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitColumnFill]
    
    inline def WebkitColumnRule: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitColumnRule = "WebkitColumnRule".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitColumnRule]
    
    inline def WebkitColumnRuleColor: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitColumnRuleColor = "WebkitColumnRuleColor".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitColumnRuleColor]
    
    inline def WebkitColumnRuleStyle: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitColumnRuleStyle = "WebkitColumnRuleStyle".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitColumnRuleStyle]
    
    inline def WebkitColumnRuleWidth: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitColumnRuleWidth = "WebkitColumnRuleWidth".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitColumnRuleWidth]
    
    inline def WebkitColumnSpan: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitColumnSpan = "WebkitColumnSpan".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitColumnSpan]
    
    inline def WebkitColumnWidth: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitColumnWidth = "WebkitColumnWidth".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitColumnWidth]
    
    inline def WebkitColumns: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitColumns = "WebkitColumns".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitColumns]
    
    inline def WebkitFilter: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitFilter = "WebkitFilter".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitFilter]
    
    inline def WebkitFlex: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitFlex = "WebkitFlex".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitFlex]
    
    inline def WebkitFlexBasis: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitFlexBasis = "WebkitFlexBasis".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitFlexBasis]
    
    inline def WebkitFlexDirection: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitFlexDirection = "WebkitFlexDirection".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitFlexDirection]
    
    inline def WebkitFlexFlow: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitFlexFlow = "WebkitFlexFlow".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitFlexFlow]
    
    inline def WebkitFlexGrow: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitFlexGrow = "WebkitFlexGrow".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitFlexGrow]
    
    inline def WebkitFlexShrink: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitFlexShrink = "WebkitFlexShrink".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitFlexShrink]
    
    inline def WebkitFlexWrap: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitFlexWrap = "WebkitFlexWrap".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitFlexWrap]
    
    inline def WebkitFontFeatureSettings: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitFontFeatureSettings = "WebkitFontFeatureSettings".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitFontFeatureSettings]
    
    inline def WebkitFontKerning: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitFontKerning = "WebkitFontKerning".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitFontKerning]
    
    inline def WebkitFontSmoothing: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitFontSmoothing = "WebkitFontSmoothing".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitFontSmoothing]
    
    inline def WebkitFontVariantLigatures: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitFontVariantLigatures = "WebkitFontVariantLigatures".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitFontVariantLigatures]
    
    inline def WebkitHyphenateCharacter: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitHyphenateCharacter = "WebkitHyphenateCharacter".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitHyphenateCharacter]
    
    inline def WebkitHyphens: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitHyphens = "WebkitHyphens".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitHyphens]
    
    inline def WebkitInitialLetter: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitInitialLetter = "WebkitInitialLetter".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitInitialLetter]
    
    inline def WebkitJustifyContent: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitJustifyContent = "WebkitJustifyContent".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitJustifyContent]
    
    inline def WebkitLineBreak: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitLineBreak = "WebkitLineBreak".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitLineBreak]
    
    inline def WebkitLineClamp: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitLineClamp = "WebkitLineClamp".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitLineClamp]
    
    inline def WebkitMarginEnd: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitMarginEnd = "WebkitMarginEnd".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitMarginEnd]
    
    inline def WebkitMarginStart: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitMarginStart = "WebkitMarginStart".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitMarginStart]
    
    inline def WebkitMask: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitMask = "WebkitMask".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitMask]
    
    inline def WebkitMaskAttachment: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitMaskAttachment = "WebkitMaskAttachment".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitMaskAttachment]
    
    inline def WebkitMaskBoxImage: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitMaskBoxImage = "WebkitMaskBoxImage".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitMaskBoxImage]
    
    inline def WebkitMaskBoxImageOutset: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitMaskBoxImageOutset = "WebkitMaskBoxImageOutset".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitMaskBoxImageOutset]
    
    inline def WebkitMaskBoxImageRepeat: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitMaskBoxImageRepeat = "WebkitMaskBoxImageRepeat".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitMaskBoxImageRepeat]
    
    inline def WebkitMaskBoxImageSlice: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitMaskBoxImageSlice = "WebkitMaskBoxImageSlice".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitMaskBoxImageSlice]
    
    inline def WebkitMaskBoxImageSource: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitMaskBoxImageSource = "WebkitMaskBoxImageSource".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitMaskBoxImageSource]
    
    inline def WebkitMaskBoxImageWidth: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitMaskBoxImageWidth = "WebkitMaskBoxImageWidth".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitMaskBoxImageWidth]
    
    inline def WebkitMaskClip: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitMaskClip = "WebkitMaskClip".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitMaskClip]
    
    inline def WebkitMaskComposite: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitMaskComposite = "WebkitMaskComposite".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitMaskComposite]
    
    inline def WebkitMaskImage: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitMaskImage = "WebkitMaskImage".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitMaskImage]
    
    inline def WebkitMaskOrigin: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitMaskOrigin = "WebkitMaskOrigin".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitMaskOrigin]
    
    inline def WebkitMaskPosition: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitMaskPosition = "WebkitMaskPosition".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitMaskPosition]
    
    inline def WebkitMaskPositionX: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitMaskPositionX = "WebkitMaskPositionX".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitMaskPositionX]
    
    inline def WebkitMaskPositionY: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitMaskPositionY = "WebkitMaskPositionY".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitMaskPositionY]
    
    inline def WebkitMaskRepeat: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitMaskRepeat = "WebkitMaskRepeat".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitMaskRepeat]
    
    inline def WebkitMaskRepeatX: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitMaskRepeatX = "WebkitMaskRepeatX".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitMaskRepeatX]
    
    inline def WebkitMaskRepeatY: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitMaskRepeatY = "WebkitMaskRepeatY".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitMaskRepeatY]
    
    inline def WebkitMaskSize: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitMaskSize = "WebkitMaskSize".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitMaskSize]
    
    inline def WebkitMaxInlineSize: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitMaxInlineSize = "WebkitMaxInlineSize".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitMaxInlineSize]
    
    inline def WebkitOrder: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitOrder = "WebkitOrder".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitOrder]
    
    inline def WebkitOverflowScrolling: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitOverflowScrolling = "WebkitOverflowScrolling".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitOverflowScrolling]
    
    inline def WebkitPaddingEnd: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitPaddingEnd = "WebkitPaddingEnd".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitPaddingEnd]
    
    inline def WebkitPaddingStart: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitPaddingStart = "WebkitPaddingStart".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitPaddingStart]
    
    inline def WebkitPerspective: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitPerspective = "WebkitPerspective".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitPerspective]
    
    inline def WebkitPerspectiveOrigin: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitPerspectiveOrigin = "WebkitPerspectiveOrigin".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitPerspectiveOrigin]
    
    inline def WebkitPrintColorAdjust: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitPrintColorAdjust = "WebkitPrintColorAdjust".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitPrintColorAdjust]
    
    inline def WebkitRubyPosition: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitRubyPosition = "WebkitRubyPosition".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitRubyPosition]
    
    inline def WebkitScrollSnapPointsX: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitScrollSnapPointsX = "WebkitScrollSnapPointsX".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitScrollSnapPointsX]
    
    inline def WebkitScrollSnapPointsY: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitScrollSnapPointsY = "WebkitScrollSnapPointsY".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitScrollSnapPointsY]
    
    inline def WebkitScrollSnapType: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitScrollSnapType = "WebkitScrollSnapType".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitScrollSnapType]
    
    inline def WebkitShapeMargin: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitShapeMargin = "WebkitShapeMargin".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitShapeMargin]
    
    inline def WebkitTapHighlightColor: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitTapHighlightColor = "WebkitTapHighlightColor".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitTapHighlightColor]
    
    inline def WebkitTextCombine: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitTextCombine = "WebkitTextCombine".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitTextCombine]
    
    inline def WebkitTextDecorationColor: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitTextDecorationColor = "WebkitTextDecorationColor".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitTextDecorationColor]
    
    inline def WebkitTextDecorationLine: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitTextDecorationLine = "WebkitTextDecorationLine".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitTextDecorationLine]
    
    inline def WebkitTextDecorationSkip: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitTextDecorationSkip = "WebkitTextDecorationSkip".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitTextDecorationSkip]
    
    inline def WebkitTextDecorationStyle: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitTextDecorationStyle = "WebkitTextDecorationStyle".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitTextDecorationStyle]
    
    inline def WebkitTextEmphasis: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitTextEmphasis = "WebkitTextEmphasis".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitTextEmphasis]
    
    inline def WebkitTextEmphasisColor: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitTextEmphasisColor = "WebkitTextEmphasisColor".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitTextEmphasisColor]
    
    inline def WebkitTextEmphasisPosition: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitTextEmphasisPosition = "WebkitTextEmphasisPosition".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitTextEmphasisPosition]
    
    inline def WebkitTextEmphasisStyle: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitTextEmphasisStyle = "WebkitTextEmphasisStyle".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitTextEmphasisStyle]
    
    inline def WebkitTextFillColor: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitTextFillColor = "WebkitTextFillColor".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitTextFillColor]
    
    inline def WebkitTextOrientation: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitTextOrientation = "WebkitTextOrientation".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitTextOrientation]
    
    inline def WebkitTextSizeAdjust: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitTextSizeAdjust = "WebkitTextSizeAdjust".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitTextSizeAdjust]
    
    inline def WebkitTextStroke: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitTextStroke = "WebkitTextStroke".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitTextStroke]
    
    inline def WebkitTextStrokeColor: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitTextStrokeColor = "WebkitTextStrokeColor".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitTextStrokeColor]
    
    inline def WebkitTextStrokeWidth: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitTextStrokeWidth = "WebkitTextStrokeWidth".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitTextStrokeWidth]
    
    inline def WebkitTextUnderlinePosition: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitTextUnderlinePosition = "WebkitTextUnderlinePosition".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitTextUnderlinePosition]
    
    inline def WebkitTouchCallout: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitTouchCallout = "WebkitTouchCallout".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitTouchCallout]
    
    inline def WebkitTransform: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitTransform = "WebkitTransform".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitTransform]
    
    inline def WebkitTransformOrigin: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitTransformOrigin = "WebkitTransformOrigin".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitTransformOrigin]
    
    inline def WebkitTransformStyle: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitTransformStyle = "WebkitTransformStyle".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitTransformStyle]
    
    inline def WebkitTransition: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitTransition = "WebkitTransition".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitTransition]
    
    inline def WebkitTransitionDelay: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitTransitionDelay = "WebkitTransitionDelay".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitTransitionDelay]
    
    inline def WebkitTransitionDuration: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitTransitionDuration = "WebkitTransitionDuration".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitTransitionDuration]
    
    inline def WebkitTransitionProperty: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitTransitionProperty = "WebkitTransitionProperty".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitTransitionProperty]
    
    inline def WebkitTransitionTimingFunction: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitTransitionTimingFunction = "WebkitTransitionTimingFunction".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitTransitionTimingFunction]
    
    inline def WebkitUserModify: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitUserModify = "WebkitUserModify".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitUserModify]
    
    inline def WebkitUserSelect: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitUserSelect = "WebkitUserSelect".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitUserSelect]
    
    inline def WebkitWritingMode: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitWritingMode = "WebkitWritingMode".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.WebkitWritingMode]
    
    inline def accentColor: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.accentColor = "accentColor".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.accentColor]
    
    inline def alignContent: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.alignContent = "alignContent".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.alignContent]
    
    inline def alignItems: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.alignItems = "alignItems".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.alignItems]
    
    inline def alignSelf: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.alignSelf = "alignSelf".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.alignSelf]
    
    inline def alignTracks: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.alignTracks = "alignTracks".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.alignTracks]
    
    inline def alignmentBaseline: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.alignmentBaseline = "alignmentBaseline".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.alignmentBaseline]
    
    inline def all: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.all = "all".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.all]
    
    inline def animation: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.animation = "animation".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.animation]
    
    inline def animationComposition: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.animationComposition = "animationComposition".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.animationComposition]
    
    inline def animationDelay: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.animationDelay = "animationDelay".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.animationDelay]
    
    inline def animationDirection: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.animationDirection = "animationDirection".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.animationDirection]
    
    inline def animationDuration: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.animationDuration = "animationDuration".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.animationDuration]
    
    inline def animationFillMode: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.animationFillMode = "animationFillMode".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.animationFillMode]
    
    inline def animationIterationCount: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.animationIterationCount = "animationIterationCount".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.animationIterationCount]
    
    inline def animationName: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.animationName = "animationName".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.animationName]
    
    inline def animationPlayState: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.animationPlayState = "animationPlayState".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.animationPlayState]
    
    inline def animationTimeline: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.animationTimeline = "animationTimeline".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.animationTimeline]
    
    inline def animationTimingFunction: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.animationTimingFunction = "animationTimingFunction".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.animationTimingFunction]
    
    inline def appearance: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.appearance = "appearance".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.appearance]
    
    inline def aspectRatio: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.aspectRatio = "aspectRatio".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.aspectRatio]
    
    inline def azimuth: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.azimuth = "azimuth".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.azimuth]
    
    inline def backdropFilter: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.backdropFilter = "backdropFilter".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.backdropFilter]
    
    inline def backfaceVisibility: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.backfaceVisibility = "backfaceVisibility".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.backfaceVisibility]
    
    inline def background: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.background = "background".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.background]
    
    inline def backgroundAttachment: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.backgroundAttachment = "backgroundAttachment".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.backgroundAttachment]
    
    inline def backgroundBlendMode: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.backgroundBlendMode = "backgroundBlendMode".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.backgroundBlendMode]
    
    inline def backgroundClip: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.backgroundClip = "backgroundClip".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.backgroundClip]
    
    inline def backgroundColor: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.backgroundColor = "backgroundColor".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.backgroundColor]
    
    inline def backgroundImage: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.backgroundImage = "backgroundImage".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.backgroundImage]
    
    inline def backgroundOrigin: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.backgroundOrigin = "backgroundOrigin".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.backgroundOrigin]
    
    inline def backgroundPosition: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.backgroundPosition = "backgroundPosition".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.backgroundPosition]
    
    inline def backgroundPositionX: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.backgroundPositionX = "backgroundPositionX".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.backgroundPositionX]
    
    inline def backgroundPositionY: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.backgroundPositionY = "backgroundPositionY".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.backgroundPositionY]
    
    inline def backgroundRepeat: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.backgroundRepeat = "backgroundRepeat".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.backgroundRepeat]
    
    inline def backgroundSize: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.backgroundSize = "backgroundSize".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.backgroundSize]
    
    inline def baselineShift: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.baselineShift = "baselineShift".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.baselineShift]
    
    inline def blockOverflow: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.blockOverflow = "blockOverflow".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.blockOverflow]
    
    inline def blockSize: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.blockSize = "blockSize".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.blockSize]
    
    inline def border: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.border = "border".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.border]
    
    inline def borderBlock: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.borderBlock = "borderBlock".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.borderBlock]
    
    inline def borderBlockColor: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.borderBlockColor = "borderBlockColor".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.borderBlockColor]
    
    inline def borderBlockEnd: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.borderBlockEnd = "borderBlockEnd".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.borderBlockEnd]
    
    inline def borderBlockEndColor: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.borderBlockEndColor = "borderBlockEndColor".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.borderBlockEndColor]
    
    inline def borderBlockEndStyle: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.borderBlockEndStyle = "borderBlockEndStyle".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.borderBlockEndStyle]
    
    inline def borderBlockEndWidth: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.borderBlockEndWidth = "borderBlockEndWidth".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.borderBlockEndWidth]
    
    inline def borderBlockStart: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.borderBlockStart = "borderBlockStart".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.borderBlockStart]
    
    inline def borderBlockStartColor: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.borderBlockStartColor = "borderBlockStartColor".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.borderBlockStartColor]
    
    inline def borderBlockStartStyle: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.borderBlockStartStyle = "borderBlockStartStyle".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.borderBlockStartStyle]
    
    inline def borderBlockStartWidth: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.borderBlockStartWidth = "borderBlockStartWidth".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.borderBlockStartWidth]
    
    inline def borderBlockStyle: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.borderBlockStyle = "borderBlockStyle".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.borderBlockStyle]
    
    inline def borderBlockWidth: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.borderBlockWidth = "borderBlockWidth".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.borderBlockWidth]
    
    inline def borderBottom: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.borderBottom = "borderBottom".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.borderBottom]
    
    inline def borderBottomColor: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.borderBottomColor = "borderBottomColor".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.borderBottomColor]
    
    inline def borderBottomLeftRadius: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.borderBottomLeftRadius = "borderBottomLeftRadius".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.borderBottomLeftRadius]
    
    inline def borderBottomRightRadius: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.borderBottomRightRadius = "borderBottomRightRadius".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.borderBottomRightRadius]
    
    inline def borderBottomStyle: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.borderBottomStyle = "borderBottomStyle".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.borderBottomStyle]
    
    inline def borderBottomWidth: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.borderBottomWidth = "borderBottomWidth".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.borderBottomWidth]
    
    inline def borderCollapse: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.borderCollapse = "borderCollapse".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.borderCollapse]
    
    inline def borderColor: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.borderColor = "borderColor".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.borderColor]
    
    inline def borderEndEndRadius: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.borderEndEndRadius = "borderEndEndRadius".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.borderEndEndRadius]
    
    inline def borderEndStartRadius: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.borderEndStartRadius = "borderEndStartRadius".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.borderEndStartRadius]
    
    inline def borderImage: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.borderImage = "borderImage".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.borderImage]
    
    inline def borderImageOutset: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.borderImageOutset = "borderImageOutset".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.borderImageOutset]
    
    inline def borderImageRepeat: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.borderImageRepeat = "borderImageRepeat".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.borderImageRepeat]
    
    inline def borderImageSlice: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.borderImageSlice = "borderImageSlice".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.borderImageSlice]
    
    inline def borderImageSource: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.borderImageSource = "borderImageSource".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.borderImageSource]
    
    inline def borderImageWidth: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.borderImageWidth = "borderImageWidth".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.borderImageWidth]
    
    inline def borderInline: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.borderInline = "borderInline".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.borderInline]
    
    inline def borderInlineColor: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.borderInlineColor = "borderInlineColor".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.borderInlineColor]
    
    inline def borderInlineEnd: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.borderInlineEnd = "borderInlineEnd".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.borderInlineEnd]
    
    inline def borderInlineEndColor: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.borderInlineEndColor = "borderInlineEndColor".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.borderInlineEndColor]
    
    inline def borderInlineEndStyle: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.borderInlineEndStyle = "borderInlineEndStyle".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.borderInlineEndStyle]
    
    inline def borderInlineEndWidth: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.borderInlineEndWidth = "borderInlineEndWidth".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.borderInlineEndWidth]
    
    inline def borderInlineStart: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.borderInlineStart = "borderInlineStart".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.borderInlineStart]
    
    inline def borderInlineStartColor: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.borderInlineStartColor = "borderInlineStartColor".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.borderInlineStartColor]
    
    inline def borderInlineStartStyle: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.borderInlineStartStyle = "borderInlineStartStyle".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.borderInlineStartStyle]
    
    inline def borderInlineStartWidth: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.borderInlineStartWidth = "borderInlineStartWidth".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.borderInlineStartWidth]
    
    inline def borderInlineStyle: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.borderInlineStyle = "borderInlineStyle".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.borderInlineStyle]
    
    inline def borderInlineWidth: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.borderInlineWidth = "borderInlineWidth".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.borderInlineWidth]
    
    inline def borderLeft: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.borderLeft = "borderLeft".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.borderLeft]
    
    inline def borderLeftColor: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.borderLeftColor = "borderLeftColor".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.borderLeftColor]
    
    inline def borderLeftStyle: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.borderLeftStyle = "borderLeftStyle".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.borderLeftStyle]
    
    inline def borderLeftWidth: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.borderLeftWidth = "borderLeftWidth".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.borderLeftWidth]
    
    inline def borderRadius: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.borderRadius = "borderRadius".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.borderRadius]
    
    inline def borderRight: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.borderRight = "borderRight".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.borderRight]
    
    inline def borderRightColor: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.borderRightColor = "borderRightColor".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.borderRightColor]
    
    inline def borderRightStyle: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.borderRightStyle = "borderRightStyle".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.borderRightStyle]
    
    inline def borderRightWidth: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.borderRightWidth = "borderRightWidth".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.borderRightWidth]
    
    inline def borderSpacing: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.borderSpacing = "borderSpacing".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.borderSpacing]
    
    inline def borderStartEndRadius: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.borderStartEndRadius = "borderStartEndRadius".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.borderStartEndRadius]
    
    inline def borderStartStartRadius: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.borderStartStartRadius = "borderStartStartRadius".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.borderStartStartRadius]
    
    inline def borderStyle: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.borderStyle = "borderStyle".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.borderStyle]
    
    inline def borderTop: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.borderTop = "borderTop".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.borderTop]
    
    inline def borderTopColor: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.borderTopColor = "borderTopColor".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.borderTopColor]
    
    inline def borderTopLeftRadius: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.borderTopLeftRadius = "borderTopLeftRadius".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.borderTopLeftRadius]
    
    inline def borderTopRightRadius: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.borderTopRightRadius = "borderTopRightRadius".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.borderTopRightRadius]
    
    inline def borderTopStyle: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.borderTopStyle = "borderTopStyle".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.borderTopStyle]
    
    inline def borderTopWidth: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.borderTopWidth = "borderTopWidth".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.borderTopWidth]
    
    inline def borderWidth: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.borderWidth = "borderWidth".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.borderWidth]
    
    inline def bottom: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.bottom = "bottom".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.bottom]
    
    inline def boxAlign: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.boxAlign = "boxAlign".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.boxAlign]
    
    inline def boxDecorationBreak: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.boxDecorationBreak = "boxDecorationBreak".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.boxDecorationBreak]
    
    inline def boxDirection: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.boxDirection = "boxDirection".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.boxDirection]
    
    inline def boxFlex: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.boxFlex = "boxFlex".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.boxFlex]
    
    inline def boxFlexGroup: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.boxFlexGroup = "boxFlexGroup".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.boxFlexGroup]
    
    inline def boxLines: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.boxLines = "boxLines".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.boxLines]
    
    inline def boxOrdinalGroup: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.boxOrdinalGroup = "boxOrdinalGroup".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.boxOrdinalGroup]
    
    inline def boxOrient: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.boxOrient = "boxOrient".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.boxOrient]
    
    inline def boxPack: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.boxPack = "boxPack".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.boxPack]
    
    inline def boxShadow: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.boxShadow = "boxShadow".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.boxShadow]
    
    inline def boxSizing: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.boxSizing = "boxSizing".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.boxSizing]
    
    inline def breakAfter: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.breakAfter = "breakAfter".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.breakAfter]
    
    inline def breakBefore: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.breakBefore = "breakBefore".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.breakBefore]
    
    inline def breakInside: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.breakInside = "breakInside".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.breakInside]
    
    inline def captionSide: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.captionSide = "captionSide".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.captionSide]
    
    inline def caretColor: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.caretColor = "caretColor".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.caretColor]
    
    inline def clear: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.clear = "clear".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.clear]
    
    inline def clip: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.clip = "clip".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.clip]
    
    inline def clipPath: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.clipPath = "clipPath".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.clipPath]
    
    inline def clipRule: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.clipRule = "clipRule".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.clipRule]
    
    inline def color: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.color = "color".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.color]
    
    inline def colorAdjust: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.colorAdjust = "colorAdjust".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.colorAdjust]
    
    inline def colorInterpolation: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.colorInterpolation = "colorInterpolation".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.colorInterpolation]
    
    inline def colorRendering: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.colorRendering = "colorRendering".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.colorRendering]
    
    inline def colorScheme: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.colorScheme = "colorScheme".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.colorScheme]
    
    inline def columnCount: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.columnCount = "columnCount".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.columnCount]
    
    inline def columnFill: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.columnFill = "columnFill".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.columnFill]
    
    inline def columnGap: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.columnGap = "columnGap".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.columnGap]
    
    inline def columnRule: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.columnRule = "columnRule".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.columnRule]
    
    inline def columnRuleColor: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.columnRuleColor = "columnRuleColor".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.columnRuleColor]
    
    inline def columnRuleStyle: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.columnRuleStyle = "columnRuleStyle".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.columnRuleStyle]
    
    inline def columnRuleWidth: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.columnRuleWidth = "columnRuleWidth".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.columnRuleWidth]
    
    inline def columnSpan: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.columnSpan = "columnSpan".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.columnSpan]
    
    inline def columnWidth: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.columnWidth = "columnWidth".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.columnWidth]
    
    inline def columns: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.columns = "columns".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.columns]
    
    inline def contain: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.contain = "contain".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.contain]
    
    inline def content: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.content = "content".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.content]
    
    inline def contentVisibility: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.contentVisibility = "contentVisibility".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.contentVisibility]
    
    inline def counterIncrement: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.counterIncrement = "counterIncrement".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.counterIncrement]
    
    inline def counterReset: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.counterReset = "counterReset".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.counterReset]
    
    inline def counterSet: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.counterSet = "counterSet".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.counterSet]
    
    inline def cursor: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.cursor = "cursor".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.cursor]
    
    inline def direction: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.direction = "direction".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.direction]
    
    inline def display: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.display = "display".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.display]
    
    inline def dominantBaseline: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.dominantBaseline = "dominantBaseline".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.dominantBaseline]
    
    inline def emptyCells: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.emptyCells = "emptyCells".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.emptyCells]
    
    inline def fill: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.fill = "fill".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.fill]
    
    inline def fillOpacity: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.fillOpacity = "fillOpacity".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.fillOpacity]
    
    inline def fillRule: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.fillRule = "fillRule".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.fillRule]
    
    inline def filter: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.filter = "filter".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.filter]
    
    inline def flex: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.flex = "flex".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.flex]
    
    inline def flexBasis: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.flexBasis = "flexBasis".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.flexBasis]
    
    inline def flexDirection: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.flexDirection = "flexDirection".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.flexDirection]
    
    inline def flexFlow: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.flexFlow = "flexFlow".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.flexFlow]
    
    inline def flexGrow: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.flexGrow = "flexGrow".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.flexGrow]
    
    inline def flexShrink: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.flexShrink = "flexShrink".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.flexShrink]
    
    inline def flexWrap: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.flexWrap = "flexWrap".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.flexWrap]
    
    inline def float: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.float = "float".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.float]
    
    inline def floodColor: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.floodColor = "floodColor".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.floodColor]
    
    inline def floodOpacity: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.floodOpacity = "floodOpacity".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.floodOpacity]
    
    inline def font: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.font = "font".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.font]
    
    inline def fontFamily: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.fontFamily = "fontFamily".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.fontFamily]
    
    inline def fontFeatureSettings: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.fontFeatureSettings = "fontFeatureSettings".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.fontFeatureSettings]
    
    inline def fontKerning: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.fontKerning = "fontKerning".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.fontKerning]
    
    inline def fontLanguageOverride: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.fontLanguageOverride = "fontLanguageOverride".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.fontLanguageOverride]
    
    inline def fontOpticalSizing: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.fontOpticalSizing = "fontOpticalSizing".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.fontOpticalSizing]
    
    inline def fontSize: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.fontSize = "fontSize".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.fontSize]
    
    inline def fontSizeAdjust: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.fontSizeAdjust = "fontSizeAdjust".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.fontSizeAdjust]
    
    inline def fontSmooth: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.fontSmooth = "fontSmooth".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.fontSmooth]
    
    inline def fontStretch: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.fontStretch = "fontStretch".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.fontStretch]
    
    inline def fontStyle: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.fontStyle = "fontStyle".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.fontStyle]
    
    inline def fontSynthesis: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.fontSynthesis = "fontSynthesis".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.fontSynthesis]
    
    inline def fontVariant: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.fontVariant = "fontVariant".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.fontVariant]
    
    inline def fontVariantAlternates: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.fontVariantAlternates = "fontVariantAlternates".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.fontVariantAlternates]
    
    inline def fontVariantCaps: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.fontVariantCaps = "fontVariantCaps".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.fontVariantCaps]
    
    inline def fontVariantEastAsian: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.fontVariantEastAsian = "fontVariantEastAsian".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.fontVariantEastAsian]
    
    inline def fontVariantLigatures: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.fontVariantLigatures = "fontVariantLigatures".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.fontVariantLigatures]
    
    inline def fontVariantNumeric: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.fontVariantNumeric = "fontVariantNumeric".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.fontVariantNumeric]
    
    inline def fontVariantPosition: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.fontVariantPosition = "fontVariantPosition".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.fontVariantPosition]
    
    inline def fontVariationSettings: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.fontVariationSettings = "fontVariationSettings".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.fontVariationSettings]
    
    inline def fontWeight: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.fontWeight = "fontWeight".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.fontWeight]
    
    inline def forcedColorAdjust: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.forcedColorAdjust = "forcedColorAdjust".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.forcedColorAdjust]
    
    inline def gap: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.gap = "gap".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.gap]
    
    inline def glyphOrientationVertical: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.glyphOrientationVertical = "glyphOrientationVertical".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.glyphOrientationVertical]
    
    inline def grid: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.grid = "grid".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.grid]
    
    inline def gridArea: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.gridArea = "gridArea".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.gridArea]
    
    inline def gridAutoColumns: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.gridAutoColumns = "gridAutoColumns".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.gridAutoColumns]
    
    inline def gridAutoFlow: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.gridAutoFlow = "gridAutoFlow".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.gridAutoFlow]
    
    inline def gridAutoRows: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.gridAutoRows = "gridAutoRows".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.gridAutoRows]
    
    inline def gridColumn: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.gridColumn = "gridColumn".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.gridColumn]
    
    inline def gridColumnEnd: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.gridColumnEnd = "gridColumnEnd".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.gridColumnEnd]
    
    inline def gridColumnGap: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.gridColumnGap = "gridColumnGap".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.gridColumnGap]
    
    inline def gridColumnStart: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.gridColumnStart = "gridColumnStart".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.gridColumnStart]
    
    inline def gridGap: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.gridGap = "gridGap".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.gridGap]
    
    inline def gridRow: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.gridRow = "gridRow".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.gridRow]
    
    inline def gridRowEnd: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.gridRowEnd = "gridRowEnd".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.gridRowEnd]
    
    inline def gridRowGap: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.gridRowGap = "gridRowGap".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.gridRowGap]
    
    inline def gridRowStart: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.gridRowStart = "gridRowStart".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.gridRowStart]
    
    inline def gridTemplate: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.gridTemplate = "gridTemplate".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.gridTemplate]
    
    inline def gridTemplateAreas: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.gridTemplateAreas = "gridTemplateAreas".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.gridTemplateAreas]
    
    inline def gridTemplateColumns: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.gridTemplateColumns = "gridTemplateColumns".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.gridTemplateColumns]
    
    inline def gridTemplateRows: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.gridTemplateRows = "gridTemplateRows".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.gridTemplateRows]
    
    inline def hack: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.hack = "hack".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.hack]
    
    inline def hangingPunctuation: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.hangingPunctuation = "hangingPunctuation".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.hangingPunctuation]
    
    inline def height: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.height = "height".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.height]
    
    inline def hyphenateCharacter: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.hyphenateCharacter = "hyphenateCharacter".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.hyphenateCharacter]
    
    inline def hyphens: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.hyphens = "hyphens".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.hyphens]
    
    inline def imageOrientation: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.imageOrientation = "imageOrientation".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.imageOrientation]
    
    inline def imageRendering: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.imageRendering = "imageRendering".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.imageRendering]
    
    inline def imageResolution: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.imageResolution = "imageResolution".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.imageResolution]
    
    inline def imeMode: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.imeMode = "imeMode".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.imeMode]
    
    inline def initialLetter: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.initialLetter = "initialLetter".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.initialLetter]
    
    inline def inlineSize: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.inlineSize = "inlineSize".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.inlineSize]
    
    inline def inputSecurity: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.inputSecurity = "inputSecurity".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.inputSecurity]
    
    inline def inset: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.inset = "inset".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.inset]
    
    inline def insetBlock: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.insetBlock = "insetBlock".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.insetBlock]
    
    inline def insetBlockEnd: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.insetBlockEnd = "insetBlockEnd".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.insetBlockEnd]
    
    inline def insetBlockStart: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.insetBlockStart = "insetBlockStart".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.insetBlockStart]
    
    inline def insetInline: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.insetInline = "insetInline".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.insetInline]
    
    inline def insetInlineEnd: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.insetInlineEnd = "insetInlineEnd".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.insetInlineEnd]
    
    inline def insetInlineStart: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.insetInlineStart = "insetInlineStart".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.insetInlineStart]
    
    inline def isolation: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.isolation = "isolation".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.isolation]
    
    inline def justifyContent: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.justifyContent = "justifyContent".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.justifyContent]
    
    inline def justifyItems: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.justifyItems = "justifyItems".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.justifyItems]
    
    inline def justifySelf: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.justifySelf = "justifySelf".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.justifySelf]
    
    inline def justifyTracks: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.justifyTracks = "justifyTracks".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.justifyTracks]
    
    inline def left: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.left = "left".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.left]
    
    inline def letterSpacing: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.letterSpacing = "letterSpacing".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.letterSpacing]
    
    inline def lightingColor: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.lightingColor = "lightingColor".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.lightingColor]
    
    inline def lineBreak: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.lineBreak = "lineBreak".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.lineBreak]
    
    inline def lineClamp: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.lineClamp = "lineClamp".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.lineClamp]
    
    inline def lineHeight: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.lineHeight = "lineHeight".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.lineHeight]
    
    inline def lineHeightStep: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.lineHeightStep = "lineHeightStep".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.lineHeightStep]
    
    inline def listStyle: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.listStyle = "listStyle".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.listStyle]
    
    inline def listStyleImage: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.listStyleImage = "listStyleImage".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.listStyleImage]
    
    inline def listStylePosition: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.listStylePosition = "listStylePosition".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.listStylePosition]
    
    inline def listStyleType: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.listStyleType = "listStyleType".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.listStyleType]
    
    inline def margin: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.margin = "margin".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.margin]
    
    inline def marginBlock: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.marginBlock = "marginBlock".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.marginBlock]
    
    inline def marginBlockEnd: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.marginBlockEnd = "marginBlockEnd".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.marginBlockEnd]
    
    inline def marginBlockStart: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.marginBlockStart = "marginBlockStart".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.marginBlockStart]
    
    inline def marginBottom: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.marginBottom = "marginBottom".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.marginBottom]
    
    inline def marginInline: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.marginInline = "marginInline".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.marginInline]
    
    inline def marginInlineEnd: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.marginInlineEnd = "marginInlineEnd".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.marginInlineEnd]
    
    inline def marginInlineStart: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.marginInlineStart = "marginInlineStart".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.marginInlineStart]
    
    inline def marginLeft: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.marginLeft = "marginLeft".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.marginLeft]
    
    inline def marginRight: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.marginRight = "marginRight".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.marginRight]
    
    inline def marginTop: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.marginTop = "marginTop".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.marginTop]
    
    inline def marker: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.marker = "marker".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.marker]
    
    inline def markerEnd: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.markerEnd = "markerEnd".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.markerEnd]
    
    inline def markerMid: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.markerMid = "markerMid".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.markerMid]
    
    inline def markerStart: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.markerStart = "markerStart".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.markerStart]
    
    inline def mask: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.mask = "mask".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.mask]
    
    inline def maskBorder: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.maskBorder = "maskBorder".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.maskBorder]
    
    inline def maskBorderMode: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.maskBorderMode = "maskBorderMode".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.maskBorderMode]
    
    inline def maskBorderOutset: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.maskBorderOutset = "maskBorderOutset".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.maskBorderOutset]
    
    inline def maskBorderRepeat: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.maskBorderRepeat = "maskBorderRepeat".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.maskBorderRepeat]
    
    inline def maskBorderSlice: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.maskBorderSlice = "maskBorderSlice".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.maskBorderSlice]
    
    inline def maskBorderSource: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.maskBorderSource = "maskBorderSource".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.maskBorderSource]
    
    inline def maskBorderWidth: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.maskBorderWidth = "maskBorderWidth".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.maskBorderWidth]
    
    inline def maskClip: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.maskClip = "maskClip".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.maskClip]
    
    inline def maskComposite: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.maskComposite = "maskComposite".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.maskComposite]
    
    inline def maskImage: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.maskImage = "maskImage".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.maskImage]
    
    inline def maskMode: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.maskMode = "maskMode".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.maskMode]
    
    inline def maskOrigin: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.maskOrigin = "maskOrigin".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.maskOrigin]
    
    inline def maskPosition: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.maskPosition = "maskPosition".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.maskPosition]
    
    inline def maskRepeat: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.maskRepeat = "maskRepeat".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.maskRepeat]
    
    inline def maskSize: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.maskSize = "maskSize".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.maskSize]
    
    inline def maskType: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.maskType = "maskType".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.maskType]
    
    inline def mathDepth: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.mathDepth = "mathDepth".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.mathDepth]
    
    inline def mathShift: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.mathShift = "mathShift".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.mathShift]
    
    inline def mathStyle: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.mathStyle = "mathStyle".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.mathStyle]
    
    inline def matrix: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.matrix = "matrix".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.matrix]
    
    inline def matrix3d: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.matrix3d = "matrix3d".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.matrix3d]
    
    inline def maxBlockSize: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.maxBlockSize = "maxBlockSize".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.maxBlockSize]
    
    inline def maxHeight: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.maxHeight = "maxHeight".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.maxHeight]
    
    inline def maxInlineSize: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.maxInlineSize = "maxInlineSize".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.maxInlineSize]
    
    inline def maxLines: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.maxLines = "maxLines".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.maxLines]
    
    inline def maxWidth: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.maxWidth = "maxWidth".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.maxWidth]
    
    inline def minBlockSize: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.minBlockSize = "minBlockSize".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.minBlockSize]
    
    inline def minHeight: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.minHeight = "minHeight".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.minHeight]
    
    inline def minInlineSize: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.minInlineSize = "minInlineSize".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.minInlineSize]
    
    inline def minWidth: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.minWidth = "minWidth".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.minWidth]
    
    inline def mixBlendMode: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.mixBlendMode = "mixBlendMode".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.mixBlendMode]
    
    inline def motion: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.motion = "motion".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.motion]
    
    inline def motionDistance: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.motionDistance = "motionDistance".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.motionDistance]
    
    inline def motionPath: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.motionPath = "motionPath".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.motionPath]
    
    inline def motionRotation: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.motionRotation = "motionRotation".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.motionRotation]
    
    inline def msAccelerator: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msAccelerator = "msAccelerator".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msAccelerator]
    
    inline def msBlockProgression: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msBlockProgression = "msBlockProgression".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msBlockProgression]
    
    inline def msContentZoomChaining: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msContentZoomChaining = "msContentZoomChaining".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msContentZoomChaining]
    
    inline def msContentZoomLimit: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msContentZoomLimit = "msContentZoomLimit".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msContentZoomLimit]
    
    inline def msContentZoomLimitMax: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msContentZoomLimitMax = "msContentZoomLimitMax".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msContentZoomLimitMax]
    
    inline def msContentZoomLimitMin: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msContentZoomLimitMin = "msContentZoomLimitMin".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msContentZoomLimitMin]
    
    inline def msContentZoomSnap: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msContentZoomSnap = "msContentZoomSnap".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msContentZoomSnap]
    
    inline def msContentZoomSnapPoints: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msContentZoomSnapPoints = "msContentZoomSnapPoints".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msContentZoomSnapPoints]
    
    inline def msContentZoomSnapType: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msContentZoomSnapType = "msContentZoomSnapType".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msContentZoomSnapType]
    
    inline def msContentZooming: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msContentZooming = "msContentZooming".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msContentZooming]
    
    inline def msFilter: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msFilter = "msFilter".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msFilter]
    
    inline def msFlex: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msFlex = "msFlex".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msFlex]
    
    inline def msFlexDirection: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msFlexDirection = "msFlexDirection".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msFlexDirection]
    
    inline def msFlexPositive: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msFlexPositive = "msFlexPositive".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msFlexPositive]
    
    inline def msFlowFrom: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msFlowFrom = "msFlowFrom".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msFlowFrom]
    
    inline def msFlowInto: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msFlowInto = "msFlowInto".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msFlowInto]
    
    inline def msGridColumns: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msGridColumns = "msGridColumns".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msGridColumns]
    
    inline def msGridRows: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msGridRows = "msGridRows".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msGridRows]
    
    inline def msHighContrastAdjust: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msHighContrastAdjust = "msHighContrastAdjust".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msHighContrastAdjust]
    
    inline def msHyphenateLimitChars: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msHyphenateLimitChars = "msHyphenateLimitChars".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msHyphenateLimitChars]
    
    inline def msHyphenateLimitLines: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msHyphenateLimitLines = "msHyphenateLimitLines".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msHyphenateLimitLines]
    
    inline def msHyphenateLimitZone: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msHyphenateLimitZone = "msHyphenateLimitZone".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msHyphenateLimitZone]
    
    inline def msHyphens: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msHyphens = "msHyphens".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msHyphens]
    
    inline def msImeAlign: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msImeAlign = "msImeAlign".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msImeAlign]
    
    inline def msImeMode: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msImeMode = "msImeMode".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msImeMode]
    
    inline def msLineBreak: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msLineBreak = "msLineBreak".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msLineBreak]
    
    inline def msOrder: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msOrder = "msOrder".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msOrder]
    
    inline def msOverflowStyle: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msOverflowStyle = "msOverflowStyle".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msOverflowStyle]
    
    inline def msOverflowX: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msOverflowX = "msOverflowX".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msOverflowX]
    
    inline def msOverflowY: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msOverflowY = "msOverflowY".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msOverflowY]
    
    inline def msScrollChaining: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msScrollChaining = "msScrollChaining".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msScrollChaining]
    
    inline def msScrollLimit: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msScrollLimit = "msScrollLimit".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msScrollLimit]
    
    inline def msScrollLimitXMax: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msScrollLimitXMax = "msScrollLimitXMax".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msScrollLimitXMax]
    
    inline def msScrollLimitXMin: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msScrollLimitXMin = "msScrollLimitXMin".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msScrollLimitXMin]
    
    inline def msScrollLimitYMax: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msScrollLimitYMax = "msScrollLimitYMax".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msScrollLimitYMax]
    
    inline def msScrollLimitYMin: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msScrollLimitYMin = "msScrollLimitYMin".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msScrollLimitYMin]
    
    inline def msScrollRails: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msScrollRails = "msScrollRails".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msScrollRails]
    
    inline def msScrollSnapPointsX: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msScrollSnapPointsX = "msScrollSnapPointsX".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msScrollSnapPointsX]
    
    inline def msScrollSnapPointsY: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msScrollSnapPointsY = "msScrollSnapPointsY".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msScrollSnapPointsY]
    
    inline def msScrollSnapType: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msScrollSnapType = "msScrollSnapType".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msScrollSnapType]
    
    inline def msScrollSnapX: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msScrollSnapX = "msScrollSnapX".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msScrollSnapX]
    
    inline def msScrollSnapY: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msScrollSnapY = "msScrollSnapY".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msScrollSnapY]
    
    inline def msScrollTranslation: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msScrollTranslation = "msScrollTranslation".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msScrollTranslation]
    
    inline def msScrollbar3dlightColor: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msScrollbar3dlightColor = "msScrollbar3dlightColor".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msScrollbar3dlightColor]
    
    inline def msScrollbarArrowColor: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msScrollbarArrowColor = "msScrollbarArrowColor".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msScrollbarArrowColor]
    
    inline def msScrollbarBaseColor: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msScrollbarBaseColor = "msScrollbarBaseColor".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msScrollbarBaseColor]
    
    inline def msScrollbarDarkshadowColor: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msScrollbarDarkshadowColor = "msScrollbarDarkshadowColor".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msScrollbarDarkshadowColor]
    
    inline def msScrollbarFaceColor: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msScrollbarFaceColor = "msScrollbarFaceColor".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msScrollbarFaceColor]
    
    inline def msScrollbarHighlightColor: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msScrollbarHighlightColor = "msScrollbarHighlightColor".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msScrollbarHighlightColor]
    
    inline def msScrollbarShadowColor: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msScrollbarShadowColor = "msScrollbarShadowColor".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msScrollbarShadowColor]
    
    inline def msScrollbarTrackColor: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msScrollbarTrackColor = "msScrollbarTrackColor".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msScrollbarTrackColor]
    
    inline def msTextAutospace: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msTextAutospace = "msTextAutospace".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msTextAutospace]
    
    inline def msTextCombineHorizontal: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msTextCombineHorizontal = "msTextCombineHorizontal".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msTextCombineHorizontal]
    
    inline def msTextOverflow: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msTextOverflow = "msTextOverflow".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msTextOverflow]
    
    inline def msTouchAction: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msTouchAction = "msTouchAction".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msTouchAction]
    
    inline def msTouchSelect: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msTouchSelect = "msTouchSelect".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msTouchSelect]
    
    inline def msTransform: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msTransform = "msTransform".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msTransform]
    
    inline def msTransformOrigin: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msTransformOrigin = "msTransformOrigin".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msTransformOrigin]
    
    inline def msTransition: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msTransition = "msTransition".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msTransition]
    
    inline def msTransitionDelay: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msTransitionDelay = "msTransitionDelay".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msTransitionDelay]
    
    inline def msTransitionDuration: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msTransitionDuration = "msTransitionDuration".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msTransitionDuration]
    
    inline def msTransitionProperty: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msTransitionProperty = "msTransitionProperty".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msTransitionProperty]
    
    inline def msTransitionTimingFunction: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msTransitionTimingFunction = "msTransitionTimingFunction".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msTransitionTimingFunction]
    
    inline def msUserSelect: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msUserSelect = "msUserSelect".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msUserSelect]
    
    inline def msWordBreak: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msWordBreak = "msWordBreak".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msWordBreak]
    
    inline def msWrapFlow: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msWrapFlow = "msWrapFlow".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msWrapFlow]
    
    inline def msWrapMargin: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msWrapMargin = "msWrapMargin".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msWrapMargin]
    
    inline def msWrapThrough: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msWrapThrough = "msWrapThrough".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msWrapThrough]
    
    inline def msWritingMode: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msWritingMode = "msWritingMode".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.msWritingMode]
    
    inline def objectFit: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.objectFit = "objectFit".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.objectFit]
    
    inline def objectPosition: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.objectPosition = "objectPosition".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.objectPosition]
    
    inline def offset: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.offset = "offset".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.offset]
    
    inline def offsetAnchor: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.offsetAnchor = "offsetAnchor".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.offsetAnchor]
    
    inline def offsetBlock: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.offsetBlock = "offsetBlock".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.offsetBlock]
    
    inline def offsetBlockEnd: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.offsetBlockEnd = "offsetBlockEnd".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.offsetBlockEnd]
    
    inline def offsetBlockStart: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.offsetBlockStart = "offsetBlockStart".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.offsetBlockStart]
    
    inline def offsetDistance: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.offsetDistance = "offsetDistance".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.offsetDistance]
    
    inline def offsetInline: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.offsetInline = "offsetInline".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.offsetInline]
    
    inline def offsetInlineEnd: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.offsetInlineEnd = "offsetInlineEnd".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.offsetInlineEnd]
    
    inline def offsetInlineStart: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.offsetInlineStart = "offsetInlineStart".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.offsetInlineStart]
    
    inline def offsetPath: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.offsetPath = "offsetPath".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.offsetPath]
    
    inline def offsetRotate: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.offsetRotate = "offsetRotate".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.offsetRotate]
    
    inline def offsetRotation: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.offsetRotation = "offsetRotation".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.offsetRotation]
    
    inline def opacity: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.opacity = "opacity".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.opacity]
    
    inline def order: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.order = "order".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.order]
    
    inline def orphans: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.orphans = "orphans".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.orphans]
    
    inline def outline: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.outline = "outline".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.outline]
    
    inline def outlineColor: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.outlineColor = "outlineColor".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.outlineColor]
    
    inline def outlineOffset: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.outlineOffset = "outlineOffset".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.outlineOffset]
    
    inline def outlineStyle: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.outlineStyle = "outlineStyle".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.outlineStyle]
    
    inline def outlineWidth: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.outlineWidth = "outlineWidth".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.outlineWidth]
    
    inline def overflow: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.overflow = "overflow".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.overflow]
    
    inline def overflowAnchor: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.overflowAnchor = "overflowAnchor".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.overflowAnchor]
    
    inline def overflowBlock: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.overflowBlock = "overflowBlock".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.overflowBlock]
    
    inline def overflowClipBox: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.overflowClipBox = "overflowClipBox".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.overflowClipBox]
    
    inline def overflowClipMargin: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.overflowClipMargin = "overflowClipMargin".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.overflowClipMargin]
    
    inline def overflowInline: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.overflowInline = "overflowInline".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.overflowInline]
    
    inline def overflowWrap: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.overflowWrap = "overflowWrap".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.overflowWrap]
    
    inline def overflowX: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.overflowX = "overflowX".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.overflowX]
    
    inline def overflowY: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.overflowY = "overflowY".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.overflowY]
    
    inline def overscrollBehavior: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.overscrollBehavior = "overscrollBehavior".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.overscrollBehavior]
    
    inline def overscrollBehaviorBlock: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.overscrollBehaviorBlock = "overscrollBehaviorBlock".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.overscrollBehaviorBlock]
    
    inline def overscrollBehaviorInline: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.overscrollBehaviorInline = "overscrollBehaviorInline".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.overscrollBehaviorInline]
    
    inline def overscrollBehaviorX: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.overscrollBehaviorX = "overscrollBehaviorX".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.overscrollBehaviorX]
    
    inline def overscrollBehaviorY: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.overscrollBehaviorY = "overscrollBehaviorY".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.overscrollBehaviorY]
    
    inline def padding: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.padding = "padding".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.padding]
    
    inline def paddingBlock: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.paddingBlock = "paddingBlock".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.paddingBlock]
    
    inline def paddingBlockEnd: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.paddingBlockEnd = "paddingBlockEnd".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.paddingBlockEnd]
    
    inline def paddingBlockStart: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.paddingBlockStart = "paddingBlockStart".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.paddingBlockStart]
    
    inline def paddingBottom: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.paddingBottom = "paddingBottom".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.paddingBottom]
    
    inline def paddingInline: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.paddingInline = "paddingInline".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.paddingInline]
    
    inline def paddingInlineEnd: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.paddingInlineEnd = "paddingInlineEnd".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.paddingInlineEnd]
    
    inline def paddingInlineStart: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.paddingInlineStart = "paddingInlineStart".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.paddingInlineStart]
    
    inline def paddingLeft: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.paddingLeft = "paddingLeft".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.paddingLeft]
    
    inline def paddingRight: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.paddingRight = "paddingRight".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.paddingRight]
    
    inline def paddingTop: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.paddingTop = "paddingTop".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.paddingTop]
    
    inline def pageBreakAfter: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.pageBreakAfter = "pageBreakAfter".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.pageBreakAfter]
    
    inline def pageBreakBefore: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.pageBreakBefore = "pageBreakBefore".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.pageBreakBefore]
    
    inline def pageBreakInside: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.pageBreakInside = "pageBreakInside".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.pageBreakInside]
    
    inline def paintOrder: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.paintOrder = "paintOrder".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.paintOrder]
    
    inline def perspective: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.perspective = "perspective".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.perspective]
    
    inline def perspectiveOrigin: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.perspectiveOrigin = "perspectiveOrigin".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.perspectiveOrigin]
    
    inline def placeContent: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.placeContent = "placeContent".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.placeContent]
    
    inline def placeItems: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.placeItems = "placeItems".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.placeItems]
    
    inline def placeSelf: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.placeSelf = "placeSelf".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.placeSelf]
    
    inline def pointerEvents: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.pointerEvents = "pointerEvents".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.pointerEvents]
    
    inline def position: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.position = "position".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.position]
    
    inline def printColorAdjust: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.printColorAdjust = "printColorAdjust".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.printColorAdjust]
    
    inline def quotes: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.quotes = "quotes".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.quotes]
    
    inline def resize: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.resize = "resize".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.resize]
    
    inline def right: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.right = "right".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.right]
    
    inline def rotate: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.rotate = "rotate".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.rotate]
    
    inline def rotate3d: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.rotate3d = "rotate3d".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.rotate3d]
    
    inline def rotateX: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.rotateX = "rotateX".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.rotateX]
    
    inline def rotateY: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.rotateY = "rotateY".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.rotateY]
    
    inline def rotateZ: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.rotateZ = "rotateZ".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.rotateZ]
    
    inline def rowGap: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.rowGap = "rowGap".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.rowGap]
    
    inline def rubyAlign: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.rubyAlign = "rubyAlign".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.rubyAlign]
    
    inline def rubyMerge: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.rubyMerge = "rubyMerge".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.rubyMerge]
    
    inline def rubyPosition: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.rubyPosition = "rubyPosition".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.rubyPosition]
    
    inline def scale: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.scale = "scale".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.scale]
    
    inline def scale3d: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.scale3d = "scale3d".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.scale3d]
    
    inline def scaleX: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.scaleX = "scaleX".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.scaleX]
    
    inline def scaleY: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.scaleY = "scaleY".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.scaleY]
    
    inline def scaleZ: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.scaleZ = "scaleZ".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.scaleZ]
    
    inline def scrollBehavior: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.scrollBehavior = "scrollBehavior".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.scrollBehavior]
    
    inline def scrollMargin: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.scrollMargin = "scrollMargin".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.scrollMargin]
    
    inline def scrollMarginBlock: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.scrollMarginBlock = "scrollMarginBlock".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.scrollMarginBlock]
    
    inline def scrollMarginBlockEnd: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.scrollMarginBlockEnd = "scrollMarginBlockEnd".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.scrollMarginBlockEnd]
    
    inline def scrollMarginBlockStart: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.scrollMarginBlockStart = "scrollMarginBlockStart".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.scrollMarginBlockStart]
    
    inline def scrollMarginBottom: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.scrollMarginBottom = "scrollMarginBottom".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.scrollMarginBottom]
    
    inline def scrollMarginInline: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.scrollMarginInline = "scrollMarginInline".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.scrollMarginInline]
    
    inline def scrollMarginInlineEnd: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.scrollMarginInlineEnd = "scrollMarginInlineEnd".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.scrollMarginInlineEnd]
    
    inline def scrollMarginInlineStart: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.scrollMarginInlineStart = "scrollMarginInlineStart".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.scrollMarginInlineStart]
    
    inline def scrollMarginLeft: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.scrollMarginLeft = "scrollMarginLeft".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.scrollMarginLeft]
    
    inline def scrollMarginRight: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.scrollMarginRight = "scrollMarginRight".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.scrollMarginRight]
    
    inline def scrollMarginTop: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.scrollMarginTop = "scrollMarginTop".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.scrollMarginTop]
    
    inline def scrollPadding: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.scrollPadding = "scrollPadding".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.scrollPadding]
    
    inline def scrollPaddingBlock: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.scrollPaddingBlock = "scrollPaddingBlock".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.scrollPaddingBlock]
    
    inline def scrollPaddingBlockEnd: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.scrollPaddingBlockEnd = "scrollPaddingBlockEnd".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.scrollPaddingBlockEnd]
    
    inline def scrollPaddingBlockStart: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.scrollPaddingBlockStart = "scrollPaddingBlockStart".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.scrollPaddingBlockStart]
    
    inline def scrollPaddingBottom: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.scrollPaddingBottom = "scrollPaddingBottom".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.scrollPaddingBottom]
    
    inline def scrollPaddingInline: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.scrollPaddingInline = "scrollPaddingInline".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.scrollPaddingInline]
    
    inline def scrollPaddingInlineEnd: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.scrollPaddingInlineEnd = "scrollPaddingInlineEnd".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.scrollPaddingInlineEnd]
    
    inline def scrollPaddingInlineStart: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.scrollPaddingInlineStart = "scrollPaddingInlineStart".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.scrollPaddingInlineStart]
    
    inline def scrollPaddingLeft: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.scrollPaddingLeft = "scrollPaddingLeft".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.scrollPaddingLeft]
    
    inline def scrollPaddingRight: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.scrollPaddingRight = "scrollPaddingRight".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.scrollPaddingRight]
    
    inline def scrollPaddingTop: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.scrollPaddingTop = "scrollPaddingTop".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.scrollPaddingTop]
    
    inline def scrollSnapAlign: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.scrollSnapAlign = "scrollSnapAlign".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.scrollSnapAlign]
    
    inline def scrollSnapCoordinate: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.scrollSnapCoordinate = "scrollSnapCoordinate".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.scrollSnapCoordinate]
    
    inline def scrollSnapDestination: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.scrollSnapDestination = "scrollSnapDestination".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.scrollSnapDestination]
    
    inline def scrollSnapMargin: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.scrollSnapMargin = "scrollSnapMargin".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.scrollSnapMargin]
    
    inline def scrollSnapMarginBottom: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.scrollSnapMarginBottom = "scrollSnapMarginBottom".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.scrollSnapMarginBottom]
    
    inline def scrollSnapMarginLeft: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.scrollSnapMarginLeft = "scrollSnapMarginLeft".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.scrollSnapMarginLeft]
    
    inline def scrollSnapMarginRight: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.scrollSnapMarginRight = "scrollSnapMarginRight".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.scrollSnapMarginRight]
    
    inline def scrollSnapMarginTop: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.scrollSnapMarginTop = "scrollSnapMarginTop".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.scrollSnapMarginTop]
    
    inline def scrollSnapPointsX: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.scrollSnapPointsX = "scrollSnapPointsX".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.scrollSnapPointsX]
    
    inline def scrollSnapPointsY: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.scrollSnapPointsY = "scrollSnapPointsY".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.scrollSnapPointsY]
    
    inline def scrollSnapStop: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.scrollSnapStop = "scrollSnapStop".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.scrollSnapStop]
    
    inline def scrollSnapType: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.scrollSnapType = "scrollSnapType".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.scrollSnapType]
    
    inline def scrollSnapTypeX: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.scrollSnapTypeX = "scrollSnapTypeX".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.scrollSnapTypeX]
    
    inline def scrollSnapTypeY: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.scrollSnapTypeY = "scrollSnapTypeY".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.scrollSnapTypeY]
    
    inline def scrollbarColor: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.scrollbarColor = "scrollbarColor".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.scrollbarColor]
    
    inline def scrollbarGutter: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.scrollbarGutter = "scrollbarGutter".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.scrollbarGutter]
    
    inline def scrollbarWidth: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.scrollbarWidth = "scrollbarWidth".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.scrollbarWidth]
    
    inline def shapeImageThreshold: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.shapeImageThreshold = "shapeImageThreshold".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.shapeImageThreshold]
    
    inline def shapeMargin: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.shapeMargin = "shapeMargin".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.shapeMargin]
    
    inline def shapeOutside: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.shapeOutside = "shapeOutside".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.shapeOutside]
    
    inline def shapeRendering: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.shapeRendering = "shapeRendering".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.shapeRendering]
    
    inline def skew: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.skew = "skew".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.skew]
    
    inline def skewX: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.skewX = "skewX".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.skewX]
    
    inline def skewY: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.skewY = "skewY".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.skewY]
    
    inline def stopColor: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.stopColor = "stopColor".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.stopColor]
    
    inline def stopOpacity: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.stopOpacity = "stopOpacity".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.stopOpacity]
    
    inline def stroke: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.stroke = "stroke".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.stroke]
    
    inline def strokeDasharray: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.strokeDasharray = "strokeDasharray".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.strokeDasharray]
    
    inline def strokeDashoffset: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.strokeDashoffset = "strokeDashoffset".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.strokeDashoffset]
    
    inline def strokeLinecap: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.strokeLinecap = "strokeLinecap".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.strokeLinecap]
    
    inline def strokeLinejoin: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.strokeLinejoin = "strokeLinejoin".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.strokeLinejoin]
    
    inline def strokeMiterlimit: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.strokeMiterlimit = "strokeMiterlimit".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.strokeMiterlimit]
    
    inline def strokeOpacity: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.strokeOpacity = "strokeOpacity".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.strokeOpacity]
    
    inline def strokeWidth: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.strokeWidth = "strokeWidth".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.strokeWidth]
    
    inline def tabSize: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.tabSize = "tabSize".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.tabSize]
    
    inline def tableLayout: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.tableLayout = "tableLayout".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.tableLayout]
    
    inline def textAlign: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.textAlign = "textAlign".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.textAlign]
    
    inline def textAlignLast: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.textAlignLast = "textAlignLast".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.textAlignLast]
    
    inline def textAnchor: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.textAnchor = "textAnchor".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.textAnchor]
    
    inline def textCombineUpright: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.textCombineUpright = "textCombineUpright".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.textCombineUpright]
    
    inline def textDecoration: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.textDecoration = "textDecoration".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.textDecoration]
    
    inline def textDecorationColor: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.textDecorationColor = "textDecorationColor".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.textDecorationColor]
    
    inline def textDecorationLine: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.textDecorationLine = "textDecorationLine".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.textDecorationLine]
    
    inline def textDecorationSkip: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.textDecorationSkip = "textDecorationSkip".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.textDecorationSkip]
    
    inline def textDecorationSkipInk: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.textDecorationSkipInk = "textDecorationSkipInk".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.textDecorationSkipInk]
    
    inline def textDecorationStyle: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.textDecorationStyle = "textDecorationStyle".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.textDecorationStyle]
    
    inline def textDecorationThickness: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.textDecorationThickness = "textDecorationThickness".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.textDecorationThickness]
    
    inline def textEmphasis: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.textEmphasis = "textEmphasis".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.textEmphasis]
    
    inline def textEmphasisColor: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.textEmphasisColor = "textEmphasisColor".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.textEmphasisColor]
    
    inline def textEmphasisPosition: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.textEmphasisPosition = "textEmphasisPosition".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.textEmphasisPosition]
    
    inline def textEmphasisStyle: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.textEmphasisStyle = "textEmphasisStyle".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.textEmphasisStyle]
    
    inline def textIndent: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.textIndent = "textIndent".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.textIndent]
    
    inline def textJustify: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.textJustify = "textJustify".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.textJustify]
    
    inline def textOrientation: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.textOrientation = "textOrientation".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.textOrientation]
    
    inline def textOverflow: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.textOverflow = "textOverflow".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.textOverflow]
    
    inline def textRendering: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.textRendering = "textRendering".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.textRendering]
    
    inline def textShadow: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.textShadow = "textShadow".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.textShadow]
    
    inline def textSizeAdjust: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.textSizeAdjust = "textSizeAdjust".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.textSizeAdjust]
    
    inline def textTransform: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.textTransform = "textTransform".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.textTransform]
    
    inline def textUnderlineOffset: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.textUnderlineOffset = "textUnderlineOffset".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.textUnderlineOffset]
    
    inline def textUnderlinePosition: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.textUnderlinePosition = "textUnderlinePosition".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.textUnderlinePosition]
    
    inline def top: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.top = "top".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.top]
    
    inline def touchAction: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.touchAction = "touchAction".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.touchAction]
    
    inline def transform: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.transform = "transform".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.transform]
    
    inline def transformBox: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.transformBox = "transformBox".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.transformBox]
    
    inline def transformOrigin: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.transformOrigin = "transformOrigin".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.transformOrigin]
    
    inline def transformStyle: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.transformStyle = "transformStyle".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.transformStyle]
    
    inline def transition: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.transition = "transition".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.transition]
    
    inline def transitionDelay: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.transitionDelay = "transitionDelay".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.transitionDelay]
    
    inline def transitionDuration: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.transitionDuration = "transitionDuration".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.transitionDuration]
    
    inline def transitionProperty: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.transitionProperty = "transitionProperty".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.transitionProperty]
    
    inline def transitionTimingFunction: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.transitionTimingFunction = "transitionTimingFunction".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.transitionTimingFunction]
    
    inline def translate: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.translate = "translate".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.translate]
    
    inline def translate3d: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.translate3d = "translate3d".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.translate3d]
    
    inline def translateX: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.translateX = "translateX".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.translateX]
    
    inline def translateY: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.translateY = "translateY".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.translateY]
    
    inline def translateZ: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.translateZ = "translateZ".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.translateZ]
    
    inline def unicodeBidi: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.unicodeBidi = "unicodeBidi".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.unicodeBidi]
    
    inline def userSelect: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.userSelect = "userSelect".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.userSelect]
    
    inline def vectorEffect: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.vectorEffect = "vectorEffect".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.vectorEffect]
    
    inline def verticalAlign: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.verticalAlign = "verticalAlign".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.verticalAlign]
    
    inline def visibility: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.visibility = "visibility".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.visibility]
    
    inline def whiteSpace: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.whiteSpace = "whiteSpace".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.whiteSpace]
    
    inline def widows: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.widows = "widows".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.widows]
    
    inline def width: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.width = "width".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.width]
    
    inline def willChange: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.willChange = "willChange".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.willChange]
    
    inline def wordBreak: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.wordBreak = "wordBreak".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.wordBreak]
    
    inline def wordSpacing: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.wordSpacing = "wordSpacing".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.wordSpacing]
    
    inline def wordWrap: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.wordWrap = "wordWrap".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.wordWrap]
    
    inline def writingMode: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.writingMode = "writingMode".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.writingMode]
    
    inline def x: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.x = "x".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.x]
    
    inline def y: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.y = "y".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.y]
    
    inline def z: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.z = "z".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.z]
    
    inline def zIndex: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.zIndex = "zIndex".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.zIndex]
    
    inline def zoom: typingsJapgolly.reactSpringWeb.reactSpringWebStrings.zoom = "zoom".asInstanceOf[typingsJapgolly.reactSpringWeb.reactSpringWebStrings.zoom]
  }
  
  /* Inlined @react-spring/types.@react-spring/types.Merge<react.react.CSSProperties, @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps> */
  trait StyleProps extends StObject {
    
    var KhtmlBoxAlign: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'KhtmlBoxAlign' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BoxAlign | undefined */ js.Any
      ] = js.undefined
    
    var KhtmlBoxDirection: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'KhtmlBoxDirection' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BoxDirection | undefined */ js.Any
      ] = js.undefined
    
    var KhtmlBoxFlex: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'KhtmlBoxFlex' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BoxFlex | undefined */ js.Any
      ] = js.undefined
    
    var KhtmlBoxFlexGroup: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'KhtmlBoxFlexGroup' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BoxFlexGroup | undefined */ js.Any
      ] = js.undefined
    
    var KhtmlBoxLines: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'KhtmlBoxLines' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BoxLines | undefined */ js.Any
      ] = js.undefined
    
    var KhtmlBoxOrdinalGroup: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'KhtmlBoxOrdinalGroup' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BoxOrdinalGroup | undefined */ js.Any
      ] = js.undefined
    
    var KhtmlBoxOrient: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'KhtmlBoxOrient' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BoxOrient | undefined */ js.Any
      ] = js.undefined
    
    var KhtmlBoxPack: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'KhtmlBoxPack' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BoxPack | undefined */ js.Any
      ] = js.undefined
    
    var KhtmlLineBreak: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'KhtmlLineBreak' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.LineBreak | undefined */ js.Any
      ] = js.undefined
    
    var KhtmlOpacity: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'KhtmlOpacity' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.Opacity | undefined */ js.Any
      ] = js.undefined
    
    var KhtmlUserSelect: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'KhtmlUserSelect' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.UserSelect | undefined */ js.Any
      ] = js.undefined
    
    var MozAnimation: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'MozAnimation' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.Animation<string & {}> | undefined */ js.Any
      ] = js.undefined
    
    var MozAnimationDelay: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'MozAnimationDelay' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.AnimationDelay<string & {}> | undefined */ js.Any
      ] = js.undefined
    
    var MozAnimationDirection: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'MozAnimationDirection' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.AnimationDirection | undefined */ js.Any
      ] = js.undefined
    
    var MozAnimationDuration: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'MozAnimationDuration' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.AnimationDuration<string & {}> | undefined */ js.Any
      ] = js.undefined
    
    var MozAnimationFillMode: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'MozAnimationFillMode' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.AnimationFillMode | undefined */ js.Any
      ] = js.undefined
    
    var MozAnimationIterationCount: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'MozAnimationIterationCount' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.AnimationIterationCount | undefined */ js.Any
      ] = js.undefined
    
    var MozAnimationName: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'MozAnimationName' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.AnimationName | undefined */ js.Any
      ] = js.undefined
    
    var MozAnimationPlayState: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'MozAnimationPlayState' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.AnimationPlayState | undefined */ js.Any
      ] = js.undefined
    
    var MozAnimationTimingFunction: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'MozAnimationTimingFunction' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.AnimationTimingFunction | undefined */ js.Any
      ] = js.undefined
    
    var MozAppearance: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'MozAppearance' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MozAppearance | undefined */ js.Any
      ] = js.undefined
    
    var MozBackfaceVisibility: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'MozBackfaceVisibility' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BackfaceVisibility | undefined */ js.Any
      ] = js.undefined
    
    var MozBackgroundClip: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'MozBackgroundClip' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BackgroundClip | undefined */ js.Any
      ] = js.undefined
    
    var MozBackgroundInlinePolicy: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'MozBackgroundInlinePolicy' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BoxDecorationBreak | undefined */ js.Any
      ] = js.undefined
    
    var MozBackgroundOrigin: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'MozBackgroundOrigin' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BackgroundOrigin | undefined */ js.Any
      ] = js.undefined
    
    var MozBackgroundSize: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'MozBackgroundSize' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BackgroundSize<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var MozBinding: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'MozBinding' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MozBinding | undefined */ js.Any
      ] = js.undefined
    
    var MozBorderBottomColors: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'MozBorderBottomColors' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MozBorderBottomColors | undefined */ js.Any
      ] = js.undefined
    
    var MozBorderEndColor: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'MozBorderEndColor' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BorderInlineEndColor | undefined */ js.Any
      ] = js.undefined
    
    var MozBorderEndStyle: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'MozBorderEndStyle' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BorderInlineEndStyle | undefined */ js.Any
      ] = js.undefined
    
    var MozBorderEndWidth: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'MozBorderEndWidth' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BorderInlineEndWidth<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var MozBorderImage: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'MozBorderImage' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BorderImage | undefined */ js.Any
      ] = js.undefined
    
    var MozBorderLeftColors: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'MozBorderLeftColors' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MozBorderLeftColors | undefined */ js.Any
      ] = js.undefined
    
    var MozBorderRadius: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'MozBorderRadius' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BorderRadius<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var MozBorderRadiusBottomleft: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'MozBorderRadiusBottomleft' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BorderBottomLeftRadius<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var MozBorderRadiusBottomright: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'MozBorderRadiusBottomright' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BorderBottomRightRadius<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var MozBorderRadiusTopleft: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'MozBorderRadiusTopleft' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BorderTopLeftRadius<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var MozBorderRadiusTopright: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'MozBorderRadiusTopright' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BorderTopRightRadius<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var MozBorderRightColors: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'MozBorderRightColors' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MozBorderRightColors | undefined */ js.Any
      ] = js.undefined
    
    var MozBorderStartColor: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'MozBorderStartColor' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BorderInlineStartColor | undefined */ js.Any
      ] = js.undefined
    
    var MozBorderStartStyle: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'MozBorderStartStyle' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BorderInlineStartStyle | undefined */ js.Any
      ] = js.undefined
    
    var MozBorderTopColors: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'MozBorderTopColors' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MozBorderTopColors | undefined */ js.Any
      ] = js.undefined
    
    var MozBoxAlign: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'MozBoxAlign' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BoxAlign | undefined */ js.Any
      ] = js.undefined
    
    var MozBoxDirection: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'MozBoxDirection' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BoxDirection | undefined */ js.Any
      ] = js.undefined
    
    var MozBoxFlex: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'MozBoxFlex' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BoxFlex | undefined */ js.Any
      ] = js.undefined
    
    var MozBoxOrdinalGroup: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'MozBoxOrdinalGroup' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BoxOrdinalGroup | undefined */ js.Any
      ] = js.undefined
    
    var MozBoxOrient: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'MozBoxOrient' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BoxOrient | undefined */ js.Any
      ] = js.undefined
    
    var MozBoxPack: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'MozBoxPack' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BoxPack | undefined */ js.Any
      ] = js.undefined
    
    var MozBoxShadow: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'MozBoxShadow' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BoxShadow | undefined */ js.Any
      ] = js.undefined
    
    var MozBoxSizing: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'MozBoxSizing' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BoxSizing | undefined */ js.Any
      ] = js.undefined
    
    var MozColumnCount: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'MozColumnCount' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.ColumnCount | undefined */ js.Any
      ] = js.undefined
    
    var MozColumnFill: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'MozColumnFill' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.ColumnFill | undefined */ js.Any
      ] = js.undefined
    
    var MozColumnRule: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'MozColumnRule' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.ColumnRule<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var MozColumnRuleColor: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'MozColumnRuleColor' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.ColumnRuleColor | undefined */ js.Any
      ] = js.undefined
    
    var MozColumnRuleStyle: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'MozColumnRuleStyle' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.ColumnRuleStyle | undefined */ js.Any
      ] = js.undefined
    
    var MozColumnRuleWidth: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'MozColumnRuleWidth' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.ColumnRuleWidth<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var MozColumnWidth: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'MozColumnWidth' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.ColumnWidth<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var MozColumns: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'MozColumns' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.Columns<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var MozContextProperties: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'MozContextProperties' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MozContextProperties | undefined */ js.Any
      ] = js.undefined
    
    var MozFloatEdge: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'MozFloatEdge' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MozFloatEdge | undefined */ js.Any
      ] = js.undefined
    
    var MozFontFeatureSettings: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'MozFontFeatureSettings' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.FontFeatureSettings | undefined */ js.Any
      ] = js.undefined
    
    var MozFontLanguageOverride: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'MozFontLanguageOverride' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.FontLanguageOverride | undefined */ js.Any
      ] = js.undefined
    
    var MozForceBrokenImageIcon: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'MozForceBrokenImageIcon' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MozForceBrokenImageIcon | undefined */ js.Any
      ] = js.undefined
    
    var MozHyphens: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'MozHyphens' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.Hyphens | undefined */ js.Any
      ] = js.undefined
    
    var MozImageRegion: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'MozImageRegion' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MozImageRegion | undefined */ js.Any
      ] = js.undefined
    
    var MozMarginEnd: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'MozMarginEnd' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MarginInlineEnd<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var MozMarginStart: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'MozMarginStart' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MarginInlineStart<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var MozOpacity: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'MozOpacity' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.Opacity | undefined */ js.Any
      ] = js.undefined
    
    var MozOrient: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'MozOrient' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MozOrient | undefined */ js.Any
      ] = js.undefined
    
    var MozOsxFontSmoothing: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'MozOsxFontSmoothing' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.FontSmooth<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var MozOutline: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'MozOutline' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.Outline<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var MozOutlineColor: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'MozOutlineColor' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.OutlineColor | undefined */ js.Any
      ] = js.undefined
    
    var MozOutlineRadius: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'MozOutlineRadius' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MozOutlineRadius<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var MozOutlineRadiusBottomleft: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'MozOutlineRadiusBottomleft' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MozOutlineRadiusBottomleft<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var MozOutlineRadiusBottomright: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'MozOutlineRadiusBottomright' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MozOutlineRadiusBottomright<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var MozOutlineRadiusTopleft: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'MozOutlineRadiusTopleft' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MozOutlineRadiusTopleft<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var MozOutlineRadiusTopright: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'MozOutlineRadiusTopright' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MozOutlineRadiusTopright<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var MozOutlineStyle: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'MozOutlineStyle' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.OutlineStyle | undefined */ js.Any
      ] = js.undefined
    
    var MozOutlineWidth: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'MozOutlineWidth' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.OutlineWidth<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var MozPaddingEnd: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'MozPaddingEnd' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.PaddingInlineEnd<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var MozPaddingStart: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'MozPaddingStart' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.PaddingInlineStart<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var MozPerspective: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'MozPerspective' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.Perspective<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var MozPerspectiveOrigin: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'MozPerspectiveOrigin' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.PerspectiveOrigin<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var MozStackSizing: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'MozStackSizing' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MozStackSizing | undefined */ js.Any
      ] = js.undefined
    
    var MozTabSize: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'MozTabSize' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.TabSize<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var MozTextAlignLast: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'MozTextAlignLast' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.TextAlignLast | undefined */ js.Any
      ] = js.undefined
    
    var MozTextBlink: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'MozTextBlink' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MozTextBlink | undefined */ js.Any
      ] = js.undefined
    
    var MozTextDecorationColor: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'MozTextDecorationColor' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.TextDecorationColor | undefined */ js.Any
      ] = js.undefined
    
    var MozTextDecorationLine: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'MozTextDecorationLine' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.TextDecorationLine | undefined */ js.Any
      ] = js.undefined
    
    var MozTextDecorationStyle: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'MozTextDecorationStyle' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.TextDecorationStyle | undefined */ js.Any
      ] = js.undefined
    
    var MozTextSizeAdjust: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'MozTextSizeAdjust' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.TextSizeAdjust | undefined */ js.Any
      ] = js.undefined
    
    var MozTransformOrigin: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'MozTransformOrigin' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.TransformOrigin<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var MozTransformStyle: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'MozTransformStyle' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.TransformStyle | undefined */ js.Any
      ] = js.undefined
    
    var MozTransition: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'MozTransition' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.Transition<string & {}> | undefined */ js.Any
      ] = js.undefined
    
    var MozTransitionDelay: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'MozTransitionDelay' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.TransitionDelay<string & {}> | undefined */ js.Any
      ] = js.undefined
    
    var MozTransitionDuration: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'MozTransitionDuration' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.TransitionDuration<string & {}> | undefined */ js.Any
      ] = js.undefined
    
    var MozTransitionProperty: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'MozTransitionProperty' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.TransitionProperty | undefined */ js.Any
      ] = js.undefined
    
    var MozTransitionTimingFunction: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'MozTransitionTimingFunction' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.TransitionTimingFunction | undefined */ js.Any
      ] = js.undefined
    
    var MozUserFocus: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'MozUserFocus' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MozUserFocus | undefined */ js.Any
      ] = js.undefined
    
    var MozUserInput: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'MozUserInput' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MozUserInput | undefined */ js.Any
      ] = js.undefined
    
    var MozUserModify: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'MozUserModify' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MozUserModify | undefined */ js.Any
      ] = js.undefined
    
    var MozUserSelect: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'MozUserSelect' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.UserSelect | undefined */ js.Any
      ] = js.undefined
    
    var MozWindowDragging: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'MozWindowDragging' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MozWindowDragging | undefined */ js.Any
      ] = js.undefined
    
    var MozWindowShadow: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'MozWindowShadow' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MozWindowShadow | undefined */ js.Any
      ] = js.undefined
    
    var OAnimation: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'OAnimation' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.Animation<string & {}> | undefined */ js.Any
      ] = js.undefined
    
    var OAnimationDelay: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'OAnimationDelay' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.AnimationDelay<string & {}> | undefined */ js.Any
      ] = js.undefined
    
    var OAnimationDirection: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'OAnimationDirection' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.AnimationDirection | undefined */ js.Any
      ] = js.undefined
    
    var OAnimationDuration: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'OAnimationDuration' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.AnimationDuration<string & {}> | undefined */ js.Any
      ] = js.undefined
    
    var OAnimationFillMode: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'OAnimationFillMode' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.AnimationFillMode | undefined */ js.Any
      ] = js.undefined
    
    var OAnimationIterationCount: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'OAnimationIterationCount' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.AnimationIterationCount | undefined */ js.Any
      ] = js.undefined
    
    var OAnimationName: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'OAnimationName' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.AnimationName | undefined */ js.Any
      ] = js.undefined
    
    var OAnimationPlayState: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'OAnimationPlayState' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.AnimationPlayState | undefined */ js.Any
      ] = js.undefined
    
    var OAnimationTimingFunction: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'OAnimationTimingFunction' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.AnimationTimingFunction | undefined */ js.Any
      ] = js.undefined
    
    var OBackgroundSize: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'OBackgroundSize' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BackgroundSize<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var OBorderImage: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'OBorderImage' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BorderImage | undefined */ js.Any
      ] = js.undefined
    
    var OObjectFit: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'OObjectFit' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.ObjectFit | undefined */ js.Any
      ] = js.undefined
    
    var OObjectPosition: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'OObjectPosition' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.ObjectPosition<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var OTabSize: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'OTabSize' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.TabSize<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var OTextOverflow: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'OTextOverflow' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.TextOverflow | undefined */ js.Any
      ] = js.undefined
    
    var OTransform: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'OTransform' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.Transform | undefined */ js.Any
      ] = js.undefined
    
    var OTransformOrigin: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'OTransformOrigin' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.TransformOrigin<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var OTransition: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'OTransition' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.Transition<string & {}> | undefined */ js.Any
      ] = js.undefined
    
    var OTransitionDelay: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'OTransitionDelay' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.TransitionDelay<string & {}> | undefined */ js.Any
      ] = js.undefined
    
    var OTransitionDuration: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'OTransitionDuration' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.TransitionDuration<string & {}> | undefined */ js.Any
      ] = js.undefined
    
    var OTransitionProperty: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'OTransitionProperty' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.TransitionProperty | undefined */ js.Any
      ] = js.undefined
    
    var OTransitionTimingFunction: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'OTransitionTimingFunction' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.TransitionTimingFunction | undefined */ js.Any
      ] = js.undefined
    
    var WebkitAlignContent: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitAlignContent' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.AlignContent | undefined */ js.Any
      ] = js.undefined
    
    var WebkitAlignItems: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitAlignItems' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.AlignItems | undefined */ js.Any
      ] = js.undefined
    
    var WebkitAlignSelf: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitAlignSelf' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.AlignSelf | undefined */ js.Any
      ] = js.undefined
    
    var WebkitAnimation: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitAnimation' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.Animation<string & {}> | undefined */ js.Any
      ] = js.undefined
    
    var WebkitAnimationDelay: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitAnimationDelay' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.AnimationDelay<string & {}> | undefined */ js.Any
      ] = js.undefined
    
    var WebkitAnimationDirection: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitAnimationDirection' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.AnimationDirection | undefined */ js.Any
      ] = js.undefined
    
    var WebkitAnimationDuration: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitAnimationDuration' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.AnimationDuration<string & {}> | undefined */ js.Any
      ] = js.undefined
    
    var WebkitAnimationFillMode: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitAnimationFillMode' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.AnimationFillMode | undefined */ js.Any
      ] = js.undefined
    
    var WebkitAnimationIterationCount: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitAnimationIterationCount' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.AnimationIterationCount | undefined */ js.Any
      ] = js.undefined
    
    var WebkitAnimationName: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitAnimationName' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.AnimationName | undefined */ js.Any
      ] = js.undefined
    
    var WebkitAnimationPlayState: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitAnimationPlayState' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.AnimationPlayState | undefined */ js.Any
      ] = js.undefined
    
    var WebkitAnimationTimingFunction: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitAnimationTimingFunction' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.AnimationTimingFunction | undefined */ js.Any
      ] = js.undefined
    
    var WebkitAppearance: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitAppearance' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.WebkitAppearance | undefined */ js.Any
      ] = js.undefined
    
    var WebkitBackdropFilter: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitBackdropFilter' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BackdropFilter | undefined */ js.Any
      ] = js.undefined
    
    var WebkitBackfaceVisibility: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitBackfaceVisibility' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BackfaceVisibility | undefined */ js.Any
      ] = js.undefined
    
    var WebkitBackgroundClip: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitBackgroundClip' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BackgroundClip | undefined */ js.Any
      ] = js.undefined
    
    var WebkitBackgroundOrigin: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitBackgroundOrigin' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BackgroundOrigin | undefined */ js.Any
      ] = js.undefined
    
    var WebkitBackgroundSize: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitBackgroundSize' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BackgroundSize<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var WebkitBorderBefore: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitBorderBefore' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.WebkitBorderBefore<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var WebkitBorderBeforeColor: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitBorderBeforeColor' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.WebkitBorderBeforeColor | undefined */ js.Any
      ] = js.undefined
    
    var WebkitBorderBeforeStyle: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitBorderBeforeStyle' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.WebkitBorderBeforeStyle | undefined */ js.Any
      ] = js.undefined
    
    var WebkitBorderBeforeWidth: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitBorderBeforeWidth' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.WebkitBorderBeforeWidth<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var WebkitBorderBottomLeftRadius: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitBorderBottomLeftRadius' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BorderBottomLeftRadius<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var WebkitBorderBottomRightRadius: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitBorderBottomRightRadius' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BorderBottomRightRadius<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var WebkitBorderImage: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitBorderImage' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BorderImage | undefined */ js.Any
      ] = js.undefined
    
    var WebkitBorderImageSlice: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitBorderImageSlice' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BorderImageSlice | undefined */ js.Any
      ] = js.undefined
    
    var WebkitBorderRadius: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitBorderRadius' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BorderRadius<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var WebkitBorderTopLeftRadius: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitBorderTopLeftRadius' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BorderTopLeftRadius<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var WebkitBorderTopRightRadius: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitBorderTopRightRadius' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BorderTopRightRadius<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var WebkitBoxAlign: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitBoxAlign' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BoxAlign | undefined */ js.Any
      ] = js.undefined
    
    var WebkitBoxDecorationBreak: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitBoxDecorationBreak' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BoxDecorationBreak | undefined */ js.Any
      ] = js.undefined
    
    var WebkitBoxDirection: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitBoxDirection' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BoxDirection | undefined */ js.Any
      ] = js.undefined
    
    var WebkitBoxFlex: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitBoxFlex' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BoxFlex | undefined */ js.Any
      ] = js.undefined
    
    var WebkitBoxFlexGroup: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitBoxFlexGroup' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BoxFlexGroup | undefined */ js.Any
      ] = js.undefined
    
    var WebkitBoxLines: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitBoxLines' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BoxLines | undefined */ js.Any
      ] = js.undefined
    
    var WebkitBoxOrdinalGroup: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitBoxOrdinalGroup' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BoxOrdinalGroup | undefined */ js.Any
      ] = js.undefined
    
    var WebkitBoxOrient: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitBoxOrient' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BoxOrient | undefined */ js.Any
      ] = js.undefined
    
    var WebkitBoxPack: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitBoxPack' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BoxPack | undefined */ js.Any
      ] = js.undefined
    
    var WebkitBoxReflect: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitBoxReflect' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.WebkitBoxReflect<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var WebkitBoxShadow: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitBoxShadow' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BoxShadow | undefined */ js.Any
      ] = js.undefined
    
    var WebkitBoxSizing: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitBoxSizing' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BoxSizing | undefined */ js.Any
      ] = js.undefined
    
    var WebkitClipPath: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitClipPath' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.ClipPath | undefined */ js.Any
      ] = js.undefined
    
    var WebkitColumnCount: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitColumnCount' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.ColumnCount | undefined */ js.Any
      ] = js.undefined
    
    var WebkitColumnFill: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitColumnFill' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.ColumnFill | undefined */ js.Any
      ] = js.undefined
    
    var WebkitColumnRule: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitColumnRule' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.ColumnRule<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var WebkitColumnRuleColor: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitColumnRuleColor' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.ColumnRuleColor | undefined */ js.Any
      ] = js.undefined
    
    var WebkitColumnRuleStyle: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitColumnRuleStyle' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.ColumnRuleStyle | undefined */ js.Any
      ] = js.undefined
    
    var WebkitColumnRuleWidth: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitColumnRuleWidth' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.ColumnRuleWidth<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var WebkitColumnSpan: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitColumnSpan' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.ColumnSpan | undefined */ js.Any
      ] = js.undefined
    
    var WebkitColumnWidth: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitColumnWidth' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.ColumnWidth<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var WebkitColumns: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitColumns' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.Columns<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var WebkitFilter: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitFilter' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.Filter | undefined */ js.Any
      ] = js.undefined
    
    var WebkitFlex: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitFlex' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.Flex<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var WebkitFlexBasis: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitFlexBasis' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.FlexBasis<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var WebkitFlexDirection: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitFlexDirection' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.FlexDirection | undefined */ js.Any
      ] = js.undefined
    
    var WebkitFlexFlow: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitFlexFlow' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.FlexFlow | undefined */ js.Any
      ] = js.undefined
    
    var WebkitFlexGrow: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitFlexGrow' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.FlexGrow | undefined */ js.Any
      ] = js.undefined
    
    var WebkitFlexShrink: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitFlexShrink' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.FlexShrink | undefined */ js.Any
      ] = js.undefined
    
    var WebkitFlexWrap: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitFlexWrap' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.FlexWrap | undefined */ js.Any
      ] = js.undefined
    
    var WebkitFontFeatureSettings: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitFontFeatureSettings' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.FontFeatureSettings | undefined */ js.Any
      ] = js.undefined
    
    var WebkitFontKerning: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitFontKerning' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.FontKerning | undefined */ js.Any
      ] = js.undefined
    
    var WebkitFontSmoothing: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitFontSmoothing' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.FontSmooth<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var WebkitFontVariantLigatures: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitFontVariantLigatures' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.FontVariantLigatures | undefined */ js.Any
      ] = js.undefined
    
    var WebkitHyphenateCharacter: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitHyphenateCharacter' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.HyphenateCharacter | undefined */ js.Any
      ] = js.undefined
    
    var WebkitHyphens: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitHyphens' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.Hyphens | undefined */ js.Any
      ] = js.undefined
    
    var WebkitInitialLetter: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitInitialLetter' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.InitialLetter | undefined */ js.Any
      ] = js.undefined
    
    var WebkitJustifyContent: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitJustifyContent' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.JustifyContent | undefined */ js.Any
      ] = js.undefined
    
    var WebkitLineBreak: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitLineBreak' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.LineBreak | undefined */ js.Any
      ] = js.undefined
    
    var WebkitLineClamp: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitLineClamp' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.WebkitLineClamp | undefined */ js.Any
      ] = js.undefined
    
    var WebkitMarginEnd: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitMarginEnd' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MarginInlineEnd<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var WebkitMarginStart: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitMarginStart' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MarginInlineStart<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var WebkitMask: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitMask' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.WebkitMask<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var WebkitMaskAttachment: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitMaskAttachment' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.WebkitMaskAttachment | undefined */ js.Any
      ] = js.undefined
    
    var WebkitMaskBoxImage: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitMaskBoxImage' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MaskBorder | undefined */ js.Any
      ] = js.undefined
    
    var WebkitMaskBoxImageOutset: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitMaskBoxImageOutset' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MaskBorderOutset<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var WebkitMaskBoxImageRepeat: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitMaskBoxImageRepeat' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MaskBorderRepeat | undefined */ js.Any
      ] = js.undefined
    
    var WebkitMaskBoxImageSlice: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitMaskBoxImageSlice' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MaskBorderSlice | undefined */ js.Any
      ] = js.undefined
    
    var WebkitMaskBoxImageSource: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitMaskBoxImageSource' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MaskBorderSource | undefined */ js.Any
      ] = js.undefined
    
    var WebkitMaskBoxImageWidth: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitMaskBoxImageWidth' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MaskBorderWidth<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var WebkitMaskClip: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitMaskClip' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.WebkitMaskClip | undefined */ js.Any
      ] = js.undefined
    
    var WebkitMaskComposite: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitMaskComposite' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.WebkitMaskComposite | undefined */ js.Any
      ] = js.undefined
    
    var WebkitMaskImage: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitMaskImage' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.WebkitMaskImage | undefined */ js.Any
      ] = js.undefined
    
    var WebkitMaskOrigin: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitMaskOrigin' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.WebkitMaskOrigin | undefined */ js.Any
      ] = js.undefined
    
    var WebkitMaskPosition: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitMaskPosition' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.WebkitMaskPosition<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var WebkitMaskPositionX: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitMaskPositionX' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.WebkitMaskPositionX<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var WebkitMaskPositionY: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitMaskPositionY' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.WebkitMaskPositionY<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var WebkitMaskRepeat: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitMaskRepeat' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.WebkitMaskRepeat | undefined */ js.Any
      ] = js.undefined
    
    var WebkitMaskRepeatX: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitMaskRepeatX' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.WebkitMaskRepeatX | undefined */ js.Any
      ] = js.undefined
    
    var WebkitMaskRepeatY: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitMaskRepeatY' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.WebkitMaskRepeatY | undefined */ js.Any
      ] = js.undefined
    
    var WebkitMaskSize: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitMaskSize' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.WebkitMaskSize<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var WebkitMaxInlineSize: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitMaxInlineSize' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MaxInlineSize<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var WebkitOrder: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitOrder' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.Order | undefined */ js.Any
      ] = js.undefined
    
    var WebkitOverflowScrolling: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitOverflowScrolling' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.WebkitOverflowScrolling | undefined */ js.Any
      ] = js.undefined
    
    var WebkitPaddingEnd: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitPaddingEnd' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.PaddingInlineEnd<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var WebkitPaddingStart: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitPaddingStart' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.PaddingInlineStart<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var WebkitPerspective: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitPerspective' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.Perspective<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var WebkitPerspectiveOrigin: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitPerspectiveOrigin' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.PerspectiveOrigin<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var WebkitPrintColorAdjust: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitPrintColorAdjust' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.PrintColorAdjust | undefined */ js.Any
      ] = js.undefined
    
    var WebkitRubyPosition: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitRubyPosition' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.RubyPosition | undefined */ js.Any
      ] = js.undefined
    
    var WebkitScrollSnapPointsX: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitScrollSnapPointsX' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.ScrollSnapPointsX | undefined */ js.Any
      ] = js.undefined
    
    var WebkitScrollSnapPointsY: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitScrollSnapPointsY' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.ScrollSnapPointsY | undefined */ js.Any
      ] = js.undefined
    
    var WebkitScrollSnapType: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitScrollSnapType' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.ScrollSnapType | undefined */ js.Any
      ] = js.undefined
    
    var WebkitShapeMargin: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitShapeMargin' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.ShapeMargin<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var WebkitTapHighlightColor: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitTapHighlightColor' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.WebkitTapHighlightColor | undefined */ js.Any
      ] = js.undefined
    
    var WebkitTextCombine: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitTextCombine' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.TextCombineUpright | undefined */ js.Any
      ] = js.undefined
    
    var WebkitTextDecorationColor: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitTextDecorationColor' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.TextDecorationColor | undefined */ js.Any
      ] = js.undefined
    
    var WebkitTextDecorationLine: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitTextDecorationLine' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.TextDecorationLine | undefined */ js.Any
      ] = js.undefined
    
    var WebkitTextDecorationSkip: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitTextDecorationSkip' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.TextDecorationSkip | undefined */ js.Any
      ] = js.undefined
    
    var WebkitTextDecorationStyle: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitTextDecorationStyle' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.TextDecorationStyle | undefined */ js.Any
      ] = js.undefined
    
    var WebkitTextEmphasis: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitTextEmphasis' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.TextEmphasis | undefined */ js.Any
      ] = js.undefined
    
    var WebkitTextEmphasisColor: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitTextEmphasisColor' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.TextEmphasisColor | undefined */ js.Any
      ] = js.undefined
    
    var WebkitTextEmphasisPosition: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitTextEmphasisPosition' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.TextEmphasisPosition | undefined */ js.Any
      ] = js.undefined
    
    var WebkitTextEmphasisStyle: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitTextEmphasisStyle' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.TextEmphasisStyle | undefined */ js.Any
      ] = js.undefined
    
    var WebkitTextFillColor: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitTextFillColor' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.WebkitTextFillColor | undefined */ js.Any
      ] = js.undefined
    
    var WebkitTextOrientation: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitTextOrientation' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.TextOrientation | undefined */ js.Any
      ] = js.undefined
    
    var WebkitTextSizeAdjust: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitTextSizeAdjust' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.TextSizeAdjust | undefined */ js.Any
      ] = js.undefined
    
    var WebkitTextStroke: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitTextStroke' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.WebkitTextStroke<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var WebkitTextStrokeColor: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitTextStrokeColor' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.WebkitTextStrokeColor | undefined */ js.Any
      ] = js.undefined
    
    var WebkitTextStrokeWidth: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitTextStrokeWidth' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.WebkitTextStrokeWidth<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var WebkitTextUnderlinePosition: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitTextUnderlinePosition' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.TextUnderlinePosition | undefined */ js.Any
      ] = js.undefined
    
    var WebkitTouchCallout: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitTouchCallout' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.WebkitTouchCallout | undefined */ js.Any
      ] = js.undefined
    
    var WebkitTransform: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitTransform' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.Transform | undefined */ js.Any
      ] = js.undefined
    
    var WebkitTransformOrigin: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitTransformOrigin' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.TransformOrigin<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var WebkitTransformStyle: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitTransformStyle' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.TransformStyle | undefined */ js.Any
      ] = js.undefined
    
    var WebkitTransition: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitTransition' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.Transition<string & {}> | undefined */ js.Any
      ] = js.undefined
    
    var WebkitTransitionDelay: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitTransitionDelay' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.TransitionDelay<string & {}> | undefined */ js.Any
      ] = js.undefined
    
    var WebkitTransitionDuration: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitTransitionDuration' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.TransitionDuration<string & {}> | undefined */ js.Any
      ] = js.undefined
    
    var WebkitTransitionProperty: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitTransitionProperty' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.TransitionProperty | undefined */ js.Any
      ] = js.undefined
    
    var WebkitTransitionTimingFunction: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitTransitionTimingFunction' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.TransitionTimingFunction | undefined */ js.Any
      ] = js.undefined
    
    var WebkitUserModify: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitUserModify' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.WebkitUserModify | undefined */ js.Any
      ] = js.undefined
    
    var WebkitUserSelect: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitUserSelect' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.UserSelect | undefined */ js.Any
      ] = js.undefined
    
    var WebkitWritingMode: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitWritingMode' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.WritingMode | undefined */ js.Any
      ] = js.undefined
    
    var accentColor: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'accentColor' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.AccentColor | undefined */ js.Any
      ] = js.undefined
    
    var alignContent: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'alignContent' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.AlignContent | undefined */ js.Any
      ] = js.undefined
    
    var alignItems: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'alignItems' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.AlignItems | undefined */ js.Any
      ] = js.undefined
    
    var alignSelf: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'alignSelf' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.AlignSelf | undefined */ js.Any
      ] = js.undefined
    
    var alignTracks: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'alignTracks' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.AlignTracks | undefined */ js.Any
      ] = js.undefined
    
    var alignmentBaseline: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'alignmentBaseline' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.AlignmentBaseline | undefined */ js.Any
      ] = js.undefined
    
    var all: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'all' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.All | undefined */ js.Any
      ] = js.undefined
    
    var animation: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'animation' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.Animation<string & {}> | undefined */ js.Any
      ] = js.undefined
    
    var animationComposition: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'animationComposition' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.AnimationComposition | undefined */ js.Any
      ] = js.undefined
    
    var animationDelay: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'animationDelay' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.AnimationDelay<string & {}> | undefined */ js.Any
      ] = js.undefined
    
    var animationDirection: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'animationDirection' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.AnimationDirection | undefined */ js.Any
      ] = js.undefined
    
    var animationDuration: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'animationDuration' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.AnimationDuration<string & {}> | undefined */ js.Any
      ] = js.undefined
    
    var animationFillMode: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'animationFillMode' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.AnimationFillMode | undefined */ js.Any
      ] = js.undefined
    
    var animationIterationCount: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'animationIterationCount' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.AnimationIterationCount | undefined */ js.Any
      ] = js.undefined
    
    var animationName: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'animationName' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.AnimationName | undefined */ js.Any
      ] = js.undefined
    
    var animationPlayState: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'animationPlayState' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.AnimationPlayState | undefined */ js.Any
      ] = js.undefined
    
    var animationTimeline: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'animationTimeline' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.AnimationTimeline | undefined */ js.Any
      ] = js.undefined
    
    var animationTimingFunction: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'animationTimingFunction' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.AnimationTimingFunction | undefined */ js.Any
      ] = js.undefined
    
    var appearance: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'appearance' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.Appearance | undefined */ js.Any
      ] = js.undefined
    
    var aspectRatio: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'aspectRatio' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.AspectRatio | undefined */ js.Any
      ] = js.undefined
    
    var azimuth: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'azimuth' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.Azimuth | undefined */ js.Any
      ] = js.undefined
    
    var backdropFilter: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'backdropFilter' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BackdropFilter | undefined */ js.Any
      ] = js.undefined
    
    var backfaceVisibility: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'backfaceVisibility' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BackfaceVisibility | undefined */ js.Any
      ] = js.undefined
    
    var background: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'background' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.Background<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var backgroundAttachment: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'backgroundAttachment' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BackgroundAttachment | undefined */ js.Any
      ] = js.undefined
    
    var backgroundBlendMode: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'backgroundBlendMode' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BackgroundBlendMode | undefined */ js.Any
      ] = js.undefined
    
    var backgroundClip: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'backgroundClip' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BackgroundClip | undefined */ js.Any
      ] = js.undefined
    
    var backgroundColor: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'backgroundColor' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BackgroundColor | undefined */ js.Any
      ] = js.undefined
    
    var backgroundImage: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'backgroundImage' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BackgroundImage | undefined */ js.Any
      ] = js.undefined
    
    var backgroundOrigin: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'backgroundOrigin' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BackgroundOrigin | undefined */ js.Any
      ] = js.undefined
    
    var backgroundPosition: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'backgroundPosition' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BackgroundPosition<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var backgroundPositionX: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'backgroundPositionX' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BackgroundPositionX<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var backgroundPositionY: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'backgroundPositionY' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BackgroundPositionY<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var backgroundRepeat: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'backgroundRepeat' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BackgroundRepeat | undefined */ js.Any
      ] = js.undefined
    
    var backgroundSize: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'backgroundSize' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BackgroundSize<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var baselineShift: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'baselineShift' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BaselineShift<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var blockOverflow: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'blockOverflow' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BlockOverflow | undefined */ js.Any
      ] = js.undefined
    
    var blockSize: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'blockSize' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BlockSize<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var border: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'border' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.Border<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var borderBlock: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'borderBlock' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BorderBlock<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var borderBlockColor: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'borderBlockColor' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BorderBlockColor | undefined */ js.Any
      ] = js.undefined
    
    var borderBlockEnd: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'borderBlockEnd' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BorderBlockEnd<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var borderBlockEndColor: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'borderBlockEndColor' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BorderBlockEndColor | undefined */ js.Any
      ] = js.undefined
    
    var borderBlockEndStyle: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'borderBlockEndStyle' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BorderBlockEndStyle | undefined */ js.Any
      ] = js.undefined
    
    var borderBlockEndWidth: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'borderBlockEndWidth' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BorderBlockEndWidth<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var borderBlockStart: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'borderBlockStart' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BorderBlockStart<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var borderBlockStartColor: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'borderBlockStartColor' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BorderBlockStartColor | undefined */ js.Any
      ] = js.undefined
    
    var borderBlockStartStyle: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'borderBlockStartStyle' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BorderBlockStartStyle | undefined */ js.Any
      ] = js.undefined
    
    var borderBlockStartWidth: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'borderBlockStartWidth' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BorderBlockStartWidth<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var borderBlockStyle: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'borderBlockStyle' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BorderBlockStyle | undefined */ js.Any
      ] = js.undefined
    
    var borderBlockWidth: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'borderBlockWidth' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BorderBlockWidth<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var borderBottom: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'borderBottom' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BorderBottom<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var borderBottomColor: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'borderBottomColor' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BorderBottomColor | undefined */ js.Any
      ] = js.undefined
    
    var borderBottomLeftRadius: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'borderBottomLeftRadius' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BorderBottomLeftRadius<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var borderBottomRightRadius: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'borderBottomRightRadius' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BorderBottomRightRadius<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var borderBottomStyle: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'borderBottomStyle' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BorderBottomStyle | undefined */ js.Any
      ] = js.undefined
    
    var borderBottomWidth: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'borderBottomWidth' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BorderBottomWidth<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var borderCollapse: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'borderCollapse' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BorderCollapse | undefined */ js.Any
      ] = js.undefined
    
    var borderColor: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'borderColor' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BorderColor | undefined */ js.Any
      ] = js.undefined
    
    var borderEndEndRadius: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'borderEndEndRadius' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BorderEndEndRadius<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var borderEndStartRadius: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'borderEndStartRadius' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BorderEndStartRadius<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var borderImage: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'borderImage' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BorderImage | undefined */ js.Any
      ] = js.undefined
    
    var borderImageOutset: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'borderImageOutset' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BorderImageOutset<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var borderImageRepeat: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'borderImageRepeat' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BorderImageRepeat | undefined */ js.Any
      ] = js.undefined
    
    var borderImageSlice: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'borderImageSlice' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BorderImageSlice | undefined */ js.Any
      ] = js.undefined
    
    var borderImageSource: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'borderImageSource' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BorderImageSource | undefined */ js.Any
      ] = js.undefined
    
    var borderImageWidth: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'borderImageWidth' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BorderImageWidth<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var borderInline: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'borderInline' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BorderInline<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var borderInlineColor: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'borderInlineColor' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BorderInlineColor | undefined */ js.Any
      ] = js.undefined
    
    var borderInlineEnd: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'borderInlineEnd' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BorderInlineEnd<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var borderInlineEndColor: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'borderInlineEndColor' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BorderInlineEndColor | undefined */ js.Any
      ] = js.undefined
    
    var borderInlineEndStyle: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'borderInlineEndStyle' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BorderInlineEndStyle | undefined */ js.Any
      ] = js.undefined
    
    var borderInlineEndWidth: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'borderInlineEndWidth' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BorderInlineEndWidth<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var borderInlineStart: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'borderInlineStart' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BorderInlineStart<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var borderInlineStartColor: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'borderInlineStartColor' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BorderInlineStartColor | undefined */ js.Any
      ] = js.undefined
    
    var borderInlineStartStyle: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'borderInlineStartStyle' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BorderInlineStartStyle | undefined */ js.Any
      ] = js.undefined
    
    var borderInlineStartWidth: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'borderInlineStartWidth' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BorderInlineStartWidth<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var borderInlineStyle: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'borderInlineStyle' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BorderInlineStyle | undefined */ js.Any
      ] = js.undefined
    
    var borderInlineWidth: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'borderInlineWidth' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BorderInlineWidth<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var borderLeft: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'borderLeft' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BorderLeft<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var borderLeftColor: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'borderLeftColor' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BorderLeftColor | undefined */ js.Any
      ] = js.undefined
    
    var borderLeftStyle: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'borderLeftStyle' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BorderLeftStyle | undefined */ js.Any
      ] = js.undefined
    
    var borderLeftWidth: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'borderLeftWidth' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BorderLeftWidth<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var borderRadius: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'borderRadius' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BorderRadius<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var borderRight: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'borderRight' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BorderRight<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var borderRightColor: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'borderRightColor' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BorderRightColor | undefined */ js.Any
      ] = js.undefined
    
    var borderRightStyle: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'borderRightStyle' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BorderRightStyle | undefined */ js.Any
      ] = js.undefined
    
    var borderRightWidth: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'borderRightWidth' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BorderRightWidth<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var borderSpacing: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'borderSpacing' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BorderSpacing<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var borderStartEndRadius: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'borderStartEndRadius' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BorderStartEndRadius<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var borderStartStartRadius: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'borderStartStartRadius' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BorderStartStartRadius<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var borderStyle: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'borderStyle' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BorderStyle | undefined */ js.Any
      ] = js.undefined
    
    var borderTop: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'borderTop' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BorderTop<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var borderTopColor: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'borderTopColor' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BorderTopColor | undefined */ js.Any
      ] = js.undefined
    
    var borderTopLeftRadius: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'borderTopLeftRadius' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BorderTopLeftRadius<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var borderTopRightRadius: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'borderTopRightRadius' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BorderTopRightRadius<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var borderTopStyle: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'borderTopStyle' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BorderTopStyle | undefined */ js.Any
      ] = js.undefined
    
    var borderTopWidth: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'borderTopWidth' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BorderTopWidth<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var borderWidth: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'borderWidth' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BorderWidth<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var bottom: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'bottom' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.Bottom<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var boxAlign: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'boxAlign' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BoxAlign | undefined */ js.Any
      ] = js.undefined
    
    var boxDecorationBreak: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'boxDecorationBreak' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BoxDecorationBreak | undefined */ js.Any
      ] = js.undefined
    
    var boxDirection: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'boxDirection' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BoxDirection | undefined */ js.Any
      ] = js.undefined
    
    var boxFlex: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'boxFlex' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BoxFlex | undefined */ js.Any
      ] = js.undefined
    
    var boxFlexGroup: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'boxFlexGroup' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BoxFlexGroup | undefined */ js.Any
      ] = js.undefined
    
    var boxLines: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'boxLines' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BoxLines | undefined */ js.Any
      ] = js.undefined
    
    var boxOrdinalGroup: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'boxOrdinalGroup' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BoxOrdinalGroup | undefined */ js.Any
      ] = js.undefined
    
    var boxOrient: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'boxOrient' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BoxOrient | undefined */ js.Any
      ] = js.undefined
    
    var boxPack: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'boxPack' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BoxPack | undefined */ js.Any
      ] = js.undefined
    
    var boxShadow: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'boxShadow' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BoxShadow | undefined */ js.Any
      ] = js.undefined
    
    var boxSizing: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'boxSizing' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BoxSizing | undefined */ js.Any
      ] = js.undefined
    
    var breakAfter: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'breakAfter' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BreakAfter | undefined */ js.Any
      ] = js.undefined
    
    var breakBefore: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'breakBefore' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BreakBefore | undefined */ js.Any
      ] = js.undefined
    
    var breakInside: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'breakInside' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BreakInside | undefined */ js.Any
      ] = js.undefined
    
    var captionSide: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'captionSide' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.CaptionSide | undefined */ js.Any
      ] = js.undefined
    
    var caretColor: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'caretColor' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.CaretColor | undefined */ js.Any
      ] = js.undefined
    
    var clear: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'clear' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.Clear | undefined */ js.Any
      ] = js.undefined
    
    var clip: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'clip' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.Clip | undefined */ js.Any
      ] = js.undefined
    
    var clipPath: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'clipPath' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.ClipPath | undefined */ js.Any
      ] = js.undefined
    
    var clipRule: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'clipRule' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.ClipRule | undefined */ js.Any
      ] = js.undefined
    
    var color: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'color' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.Color | undefined */ js.Any
      ] = js.undefined
    
    var colorAdjust: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'colorAdjust' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.PrintColorAdjust | undefined */ js.Any
      ] = js.undefined
    
    var colorInterpolation: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'colorInterpolation' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.ColorInterpolation | undefined */ js.Any
      ] = js.undefined
    
    var colorRendering: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'colorRendering' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.ColorRendering | undefined */ js.Any
      ] = js.undefined
    
    var colorScheme: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'colorScheme' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.ColorScheme | undefined */ js.Any
      ] = js.undefined
    
    var columnCount: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'columnCount' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.ColumnCount | undefined */ js.Any
      ] = js.undefined
    
    var columnFill: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'columnFill' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.ColumnFill | undefined */ js.Any
      ] = js.undefined
    
    var columnGap: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'columnGap' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.ColumnGap<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var columnRule: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'columnRule' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.ColumnRule<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var columnRuleColor: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'columnRuleColor' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.ColumnRuleColor | undefined */ js.Any
      ] = js.undefined
    
    var columnRuleStyle: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'columnRuleStyle' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.ColumnRuleStyle | undefined */ js.Any
      ] = js.undefined
    
    var columnRuleWidth: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'columnRuleWidth' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.ColumnRuleWidth<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var columnSpan: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'columnSpan' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.ColumnSpan | undefined */ js.Any
      ] = js.undefined
    
    var columnWidth: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'columnWidth' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.ColumnWidth<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var columns: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'columns' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.Columns<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var contain: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'contain' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.Contain | undefined */ js.Any
      ] = js.undefined
    
    var content: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'content' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.Content | undefined */ js.Any
      ] = js.undefined
    
    var contentVisibility: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'contentVisibility' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.ContentVisibility | undefined */ js.Any
      ] = js.undefined
    
    var counterIncrement: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'counterIncrement' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.CounterIncrement | undefined */ js.Any
      ] = js.undefined
    
    var counterReset: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'counterReset' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.CounterReset | undefined */ js.Any
      ] = js.undefined
    
    var counterSet: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'counterSet' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.CounterSet | undefined */ js.Any
      ] = js.undefined
    
    var cursor: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'cursor' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.Cursor | undefined */ js.Any
      ] = js.undefined
    
    var direction: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'direction' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.Direction | undefined */ js.Any
      ] = js.undefined
    
    var display: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'display' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.Display | undefined */ js.Any
      ] = js.undefined
    
    var dominantBaseline: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'dominantBaseline' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.DominantBaseline | undefined */ js.Any
      ] = js.undefined
    
    var emptyCells: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'emptyCells' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.EmptyCells | undefined */ js.Any
      ] = js.undefined
    
    var fill: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'fill' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.Fill | undefined */ js.Any
      ] = js.undefined
    
    var fillOpacity: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'fillOpacity' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.FillOpacity | undefined */ js.Any
      ] = js.undefined
    
    var fillRule: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'fillRule' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.FillRule | undefined */ js.Any
      ] = js.undefined
    
    var filter: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'filter' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.Filter | undefined */ js.Any
      ] = js.undefined
    
    var flex: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'flex' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.Flex<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var flexBasis: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'flexBasis' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.FlexBasis<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var flexDirection: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'flexDirection' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.FlexDirection | undefined */ js.Any
      ] = js.undefined
    
    var flexFlow: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'flexFlow' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.FlexFlow | undefined */ js.Any
      ] = js.undefined
    
    var flexGrow: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'flexGrow' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.FlexGrow | undefined */ js.Any
      ] = js.undefined
    
    var flexShrink: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'flexShrink' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.FlexShrink | undefined */ js.Any
      ] = js.undefined
    
    var flexWrap: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'flexWrap' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.FlexWrap | undefined */ js.Any
      ] = js.undefined
    
    var float: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'float' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.Float | undefined */ js.Any
      ] = js.undefined
    
    var floodColor: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'floodColor' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.FloodColor | undefined */ js.Any
      ] = js.undefined
    
    var floodOpacity: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'floodOpacity' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.FloodOpacity | undefined */ js.Any
      ] = js.undefined
    
    var font: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'font' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.Font | undefined */ js.Any
      ] = js.undefined
    
    var fontFamily: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'fontFamily' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.FontFamily | undefined */ js.Any
      ] = js.undefined
    
    var fontFeatureSettings: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'fontFeatureSettings' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.FontFeatureSettings | undefined */ js.Any
      ] = js.undefined
    
    var fontKerning: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'fontKerning' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.FontKerning | undefined */ js.Any
      ] = js.undefined
    
    var fontLanguageOverride: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'fontLanguageOverride' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.FontLanguageOverride | undefined */ js.Any
      ] = js.undefined
    
    var fontOpticalSizing: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'fontOpticalSizing' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.FontOpticalSizing | undefined */ js.Any
      ] = js.undefined
    
    var fontSize: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'fontSize' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.FontSize<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var fontSizeAdjust: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'fontSizeAdjust' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.FontSizeAdjust | undefined */ js.Any
      ] = js.undefined
    
    var fontSmooth: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'fontSmooth' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.FontSmooth<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var fontStretch: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'fontStretch' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.FontStretch | undefined */ js.Any
      ] = js.undefined
    
    var fontStyle: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'fontStyle' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.FontStyle | undefined */ js.Any
      ] = js.undefined
    
    var fontSynthesis: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'fontSynthesis' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.FontSynthesis | undefined */ js.Any
      ] = js.undefined
    
    var fontVariant: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'fontVariant' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.FontVariant | undefined */ js.Any
      ] = js.undefined
    
    var fontVariantAlternates: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'fontVariantAlternates' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.FontVariantAlternates | undefined */ js.Any
      ] = js.undefined
    
    var fontVariantCaps: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'fontVariantCaps' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.FontVariantCaps | undefined */ js.Any
      ] = js.undefined
    
    var fontVariantEastAsian: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'fontVariantEastAsian' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.FontVariantEastAsian | undefined */ js.Any
      ] = js.undefined
    
    var fontVariantLigatures: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'fontVariantLigatures' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.FontVariantLigatures | undefined */ js.Any
      ] = js.undefined
    
    var fontVariantNumeric: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'fontVariantNumeric' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.FontVariantNumeric | undefined */ js.Any
      ] = js.undefined
    
    var fontVariantPosition: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'fontVariantPosition' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.FontVariantPosition | undefined */ js.Any
      ] = js.undefined
    
    var fontVariationSettings: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'fontVariationSettings' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.FontVariationSettings | undefined */ js.Any
      ] = js.undefined
    
    var fontWeight: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'fontWeight' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.FontWeight | undefined */ js.Any
      ] = js.undefined
    
    var forcedColorAdjust: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'forcedColorAdjust' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.ForcedColorAdjust | undefined */ js.Any
      ] = js.undefined
    
    var gap: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'gap' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.Gap<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var glyphOrientationVertical: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'glyphOrientationVertical' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.GlyphOrientationVertical | undefined */ js.Any
      ] = js.undefined
    
    var grid: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'grid' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.Grid | undefined */ js.Any
      ] = js.undefined
    
    var gridArea: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'gridArea' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.GridArea | undefined */ js.Any
      ] = js.undefined
    
    var gridAutoColumns: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'gridAutoColumns' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.GridAutoColumns<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var gridAutoFlow: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'gridAutoFlow' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.GridAutoFlow | undefined */ js.Any
      ] = js.undefined
    
    var gridAutoRows: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'gridAutoRows' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.GridAutoRows<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var gridColumn: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'gridColumn' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.GridColumn | undefined */ js.Any
      ] = js.undefined
    
    var gridColumnEnd: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'gridColumnEnd' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.GridColumnEnd | undefined */ js.Any
      ] = js.undefined
    
    var gridColumnGap: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'gridColumnGap' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.GridColumnGap<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var gridColumnStart: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'gridColumnStart' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.GridColumnStart | undefined */ js.Any
      ] = js.undefined
    
    var gridGap: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'gridGap' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.GridGap<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var gridRow: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'gridRow' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.GridRow | undefined */ js.Any
      ] = js.undefined
    
    var gridRowEnd: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'gridRowEnd' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.GridRowEnd | undefined */ js.Any
      ] = js.undefined
    
    var gridRowGap: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'gridRowGap' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.GridRowGap<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var gridRowStart: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'gridRowStart' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.GridRowStart | undefined */ js.Any
      ] = js.undefined
    
    var gridTemplate: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'gridTemplate' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.GridTemplate | undefined */ js.Any
      ] = js.undefined
    
    var gridTemplateAreas: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'gridTemplateAreas' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.GridTemplateAreas | undefined */ js.Any
      ] = js.undefined
    
    var gridTemplateColumns: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'gridTemplateColumns' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.GridTemplateColumns<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var gridTemplateRows: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'gridTemplateRows' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.GridTemplateRows<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var hack: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'hack' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : any | undefined */ js.Any
      ] = js.undefined
    
    var hangingPunctuation: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'hangingPunctuation' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.HangingPunctuation | undefined */ js.Any
      ] = js.undefined
    
    var height: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'height' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.Height<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var hyphenateCharacter: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'hyphenateCharacter' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.HyphenateCharacter | undefined */ js.Any
      ] = js.undefined
    
    var hyphens: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'hyphens' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.Hyphens | undefined */ js.Any
      ] = js.undefined
    
    var imageOrientation: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'imageOrientation' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.ImageOrientation | undefined */ js.Any
      ] = js.undefined
    
    var imageRendering: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'imageRendering' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.ImageRendering | undefined */ js.Any
      ] = js.undefined
    
    var imageResolution: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'imageResolution' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.ImageResolution | undefined */ js.Any
      ] = js.undefined
    
    var imeMode: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'imeMode' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.ImeMode | undefined */ js.Any
      ] = js.undefined
    
    var initialLetter: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'initialLetter' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.InitialLetter | undefined */ js.Any
      ] = js.undefined
    
    var inlineSize: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'inlineSize' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.InlineSize<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var inputSecurity: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'inputSecurity' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.InputSecurity | undefined */ js.Any
      ] = js.undefined
    
    var inset: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'inset' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.Inset<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var insetBlock: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'insetBlock' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.InsetBlock<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var insetBlockEnd: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'insetBlockEnd' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.InsetBlockEnd<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var insetBlockStart: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'insetBlockStart' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.InsetBlockStart<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var insetInline: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'insetInline' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.InsetInline<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var insetInlineEnd: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'insetInlineEnd' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.InsetInlineEnd<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var insetInlineStart: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'insetInlineStart' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.InsetInlineStart<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var isolation: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'isolation' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.Isolation | undefined */ js.Any
      ] = js.undefined
    
    var justifyContent: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'justifyContent' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.JustifyContent | undefined */ js.Any
      ] = js.undefined
    
    var justifyItems: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'justifyItems' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.JustifyItems | undefined */ js.Any
      ] = js.undefined
    
    var justifySelf: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'justifySelf' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.JustifySelf | undefined */ js.Any
      ] = js.undefined
    
    var justifyTracks: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'justifyTracks' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.JustifyTracks | undefined */ js.Any
      ] = js.undefined
    
    var left: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'left' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.Left<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var letterSpacing: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'letterSpacing' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.LetterSpacing<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var lightingColor: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'lightingColor' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.LightingColor | undefined */ js.Any
      ] = js.undefined
    
    var lineBreak: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'lineBreak' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.LineBreak | undefined */ js.Any
      ] = js.undefined
    
    var lineClamp: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'lineClamp' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.LineClamp | undefined */ js.Any
      ] = js.undefined
    
    var lineHeight: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'lineHeight' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.LineHeight<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var lineHeightStep: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'lineHeightStep' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.LineHeightStep<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var listStyle: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'listStyle' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.ListStyle | undefined */ js.Any
      ] = js.undefined
    
    var listStyleImage: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'listStyleImage' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.ListStyleImage | undefined */ js.Any
      ] = js.undefined
    
    var listStylePosition: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'listStylePosition' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.ListStylePosition | undefined */ js.Any
      ] = js.undefined
    
    var listStyleType: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'listStyleType' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.ListStyleType | undefined */ js.Any
      ] = js.undefined
    
    var margin: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'margin' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.Margin<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var marginBlock: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'marginBlock' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MarginBlock<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var marginBlockEnd: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'marginBlockEnd' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MarginBlockEnd<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var marginBlockStart: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'marginBlockStart' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MarginBlockStart<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var marginBottom: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'marginBottom' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MarginBottom<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var marginInline: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'marginInline' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MarginInline<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var marginInlineEnd: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'marginInlineEnd' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MarginInlineEnd<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var marginInlineStart: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'marginInlineStart' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MarginInlineStart<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var marginLeft: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'marginLeft' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MarginLeft<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var marginRight: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'marginRight' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MarginRight<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var marginTop: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'marginTop' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MarginTop<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var marker: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'marker' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.Marker | undefined */ js.Any
      ] = js.undefined
    
    var markerEnd: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'markerEnd' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MarkerEnd | undefined */ js.Any
      ] = js.undefined
    
    var markerMid: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'markerMid' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MarkerMid | undefined */ js.Any
      ] = js.undefined
    
    var markerStart: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'markerStart' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MarkerStart | undefined */ js.Any
      ] = js.undefined
    
    var mask: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'mask' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.Mask<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var maskBorder: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'maskBorder' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MaskBorder | undefined */ js.Any
      ] = js.undefined
    
    var maskBorderMode: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'maskBorderMode' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MaskBorderMode | undefined */ js.Any
      ] = js.undefined
    
    var maskBorderOutset: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'maskBorderOutset' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MaskBorderOutset<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var maskBorderRepeat: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'maskBorderRepeat' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MaskBorderRepeat | undefined */ js.Any
      ] = js.undefined
    
    var maskBorderSlice: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'maskBorderSlice' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MaskBorderSlice | undefined */ js.Any
      ] = js.undefined
    
    var maskBorderSource: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'maskBorderSource' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MaskBorderSource | undefined */ js.Any
      ] = js.undefined
    
    var maskBorderWidth: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'maskBorderWidth' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MaskBorderWidth<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var maskClip: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'maskClip' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MaskClip | undefined */ js.Any
      ] = js.undefined
    
    var maskComposite: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'maskComposite' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MaskComposite | undefined */ js.Any
      ] = js.undefined
    
    var maskImage: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'maskImage' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MaskImage | undefined */ js.Any
      ] = js.undefined
    
    var maskMode: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'maskMode' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MaskMode | undefined */ js.Any
      ] = js.undefined
    
    var maskOrigin: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'maskOrigin' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MaskOrigin | undefined */ js.Any
      ] = js.undefined
    
    var maskPosition: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'maskPosition' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MaskPosition<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var maskRepeat: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'maskRepeat' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MaskRepeat | undefined */ js.Any
      ] = js.undefined
    
    var maskSize: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'maskSize' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MaskSize<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var maskType: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'maskType' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MaskType | undefined */ js.Any
      ] = js.undefined
    
    var mathDepth: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'mathDepth' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MathDepth | undefined */ js.Any
      ] = js.undefined
    
    var mathShift: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'mathShift' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MathShift | undefined */ js.Any
      ] = js.undefined
    
    var mathStyle: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'mathStyle' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MathStyle | undefined */ js.Any
      ] = js.undefined
    
    var matrix: js.UndefOr[js.Tuple6[Double, Double, Double, Double, Double, Double]] = js.undefined
    
    var matrix3d: js.UndefOr[
        js.Tuple16[
          Double, 
          Double, 
          Double, 
          Double, 
          Double, 
          Double, 
          Double, 
          Double, 
          Double, 
          Double, 
          Double, 
          Double, 
          Double, 
          Double, 
          Double, 
          Double
        ]
      ] = js.undefined
    
    var maxBlockSize: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'maxBlockSize' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MaxBlockSize<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var maxHeight: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'maxHeight' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MaxHeight<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var maxInlineSize: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'maxInlineSize' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MaxInlineSize<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var maxLines: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'maxLines' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MaxLines | undefined */ js.Any
      ] = js.undefined
    
    var maxWidth: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'maxWidth' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MaxWidth<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var minBlockSize: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'minBlockSize' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MinBlockSize<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var minHeight: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'minHeight' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MinHeight<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var minInlineSize: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'minInlineSize' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MinInlineSize<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var minWidth: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'minWidth' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MinWidth<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var mixBlendMode: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'mixBlendMode' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MixBlendMode | undefined */ js.Any
      ] = js.undefined
    
    var motion: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'motion' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.Offset<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var motionDistance: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'motionDistance' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.OffsetDistance<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var motionPath: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'motionPath' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.OffsetPath | undefined */ js.Any
      ] = js.undefined
    
    var motionRotation: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'motionRotation' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.OffsetRotate | undefined */ js.Any
      ] = js.undefined
    
    var msAccelerator: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'msAccelerator' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MsAccelerator | undefined */ js.Any
      ] = js.undefined
    
    var msBlockProgression: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'msBlockProgression' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MsBlockProgression | undefined */ js.Any
      ] = js.undefined
    
    var msContentZoomChaining: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'msContentZoomChaining' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MsContentZoomChaining | undefined */ js.Any
      ] = js.undefined
    
    var msContentZoomLimit: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'msContentZoomLimit' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MsContentZoomLimit | undefined */ js.Any
      ] = js.undefined
    
    var msContentZoomLimitMax: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'msContentZoomLimitMax' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MsContentZoomLimitMax | undefined */ js.Any
      ] = js.undefined
    
    var msContentZoomLimitMin: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'msContentZoomLimitMin' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MsContentZoomLimitMin | undefined */ js.Any
      ] = js.undefined
    
    var msContentZoomSnap: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'msContentZoomSnap' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MsContentZoomSnap | undefined */ js.Any
      ] = js.undefined
    
    var msContentZoomSnapPoints: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'msContentZoomSnapPoints' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MsContentZoomSnapPoints | undefined */ js.Any
      ] = js.undefined
    
    var msContentZoomSnapType: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'msContentZoomSnapType' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MsContentZoomSnapType | undefined */ js.Any
      ] = js.undefined
    
    var msContentZooming: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'msContentZooming' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MsContentZooming | undefined */ js.Any
      ] = js.undefined
    
    var msFilter: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'msFilter' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MsFilter | undefined */ js.Any
      ] = js.undefined
    
    var msFlex: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'msFlex' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.Flex<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var msFlexDirection: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'msFlexDirection' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.FlexDirection | undefined */ js.Any
      ] = js.undefined
    
    var msFlexPositive: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'msFlexPositive' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.FlexGrow | undefined */ js.Any
      ] = js.undefined
    
    var msFlowFrom: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'msFlowFrom' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MsFlowFrom | undefined */ js.Any
      ] = js.undefined
    
    var msFlowInto: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'msFlowInto' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MsFlowInto | undefined */ js.Any
      ] = js.undefined
    
    var msGridColumns: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'msGridColumns' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MsGridColumns<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var msGridRows: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'msGridRows' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MsGridRows<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var msHighContrastAdjust: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'msHighContrastAdjust' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MsHighContrastAdjust | undefined */ js.Any
      ] = js.undefined
    
    var msHyphenateLimitChars: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'msHyphenateLimitChars' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MsHyphenateLimitChars | undefined */ js.Any
      ] = js.undefined
    
    var msHyphenateLimitLines: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'msHyphenateLimitLines' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MsHyphenateLimitLines | undefined */ js.Any
      ] = js.undefined
    
    var msHyphenateLimitZone: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'msHyphenateLimitZone' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MsHyphenateLimitZone<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var msHyphens: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'msHyphens' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.Hyphens | undefined */ js.Any
      ] = js.undefined
    
    var msImeAlign: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'msImeAlign' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MsImeAlign | undefined */ js.Any
      ] = js.undefined
    
    var msImeMode: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'msImeMode' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.ImeMode | undefined */ js.Any
      ] = js.undefined
    
    var msLineBreak: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'msLineBreak' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.LineBreak | undefined */ js.Any
      ] = js.undefined
    
    var msOrder: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'msOrder' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.Order | undefined */ js.Any
      ] = js.undefined
    
    var msOverflowStyle: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'msOverflowStyle' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MsOverflowStyle | undefined */ js.Any
      ] = js.undefined
    
    var msOverflowX: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'msOverflowX' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.OverflowX | undefined */ js.Any
      ] = js.undefined
    
    var msOverflowY: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'msOverflowY' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.OverflowY | undefined */ js.Any
      ] = js.undefined
    
    var msScrollChaining: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'msScrollChaining' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MsScrollChaining | undefined */ js.Any
      ] = js.undefined
    
    var msScrollLimit: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'msScrollLimit' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MsScrollLimit | undefined */ js.Any
      ] = js.undefined
    
    var msScrollLimitXMax: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'msScrollLimitXMax' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MsScrollLimitXMax<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var msScrollLimitXMin: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'msScrollLimitXMin' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MsScrollLimitXMin<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var msScrollLimitYMax: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'msScrollLimitYMax' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MsScrollLimitYMax<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var msScrollLimitYMin: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'msScrollLimitYMin' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MsScrollLimitYMin<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var msScrollRails: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'msScrollRails' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MsScrollRails | undefined */ js.Any
      ] = js.undefined
    
    var msScrollSnapPointsX: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'msScrollSnapPointsX' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MsScrollSnapPointsX | undefined */ js.Any
      ] = js.undefined
    
    var msScrollSnapPointsY: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'msScrollSnapPointsY' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MsScrollSnapPointsY | undefined */ js.Any
      ] = js.undefined
    
    var msScrollSnapType: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'msScrollSnapType' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MsScrollSnapType | undefined */ js.Any
      ] = js.undefined
    
    var msScrollSnapX: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'msScrollSnapX' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MsScrollSnapX | undefined */ js.Any
      ] = js.undefined
    
    var msScrollSnapY: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'msScrollSnapY' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MsScrollSnapY | undefined */ js.Any
      ] = js.undefined
    
    var msScrollTranslation: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'msScrollTranslation' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MsScrollTranslation | undefined */ js.Any
      ] = js.undefined
    
    var msScrollbar3dlightColor: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'msScrollbar3dlightColor' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MsScrollbar3dlightColor | undefined */ js.Any
      ] = js.undefined
    
    var msScrollbarArrowColor: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'msScrollbarArrowColor' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MsScrollbarArrowColor | undefined */ js.Any
      ] = js.undefined
    
    var msScrollbarBaseColor: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'msScrollbarBaseColor' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MsScrollbarBaseColor | undefined */ js.Any
      ] = js.undefined
    
    var msScrollbarDarkshadowColor: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'msScrollbarDarkshadowColor' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MsScrollbarDarkshadowColor | undefined */ js.Any
      ] = js.undefined
    
    var msScrollbarFaceColor: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'msScrollbarFaceColor' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MsScrollbarFaceColor | undefined */ js.Any
      ] = js.undefined
    
    var msScrollbarHighlightColor: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'msScrollbarHighlightColor' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MsScrollbarHighlightColor | undefined */ js.Any
      ] = js.undefined
    
    var msScrollbarShadowColor: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'msScrollbarShadowColor' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MsScrollbarShadowColor | undefined */ js.Any
      ] = js.undefined
    
    var msScrollbarTrackColor: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'msScrollbarTrackColor' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MsScrollbarTrackColor | undefined */ js.Any
      ] = js.undefined
    
    var msTextAutospace: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'msTextAutospace' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MsTextAutospace | undefined */ js.Any
      ] = js.undefined
    
    var msTextCombineHorizontal: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'msTextCombineHorizontal' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.TextCombineUpright | undefined */ js.Any
      ] = js.undefined
    
    var msTextOverflow: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'msTextOverflow' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.TextOverflow | undefined */ js.Any
      ] = js.undefined
    
    var msTouchAction: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'msTouchAction' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.TouchAction | undefined */ js.Any
      ] = js.undefined
    
    var msTouchSelect: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'msTouchSelect' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MsTouchSelect | undefined */ js.Any
      ] = js.undefined
    
    var msTransform: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'msTransform' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.Transform | undefined */ js.Any
      ] = js.undefined
    
    var msTransformOrigin: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'msTransformOrigin' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.TransformOrigin<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var msTransition: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'msTransition' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.Transition<string & {}> | undefined */ js.Any
      ] = js.undefined
    
    var msTransitionDelay: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'msTransitionDelay' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.TransitionDelay<string & {}> | undefined */ js.Any
      ] = js.undefined
    
    var msTransitionDuration: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'msTransitionDuration' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.TransitionDuration<string & {}> | undefined */ js.Any
      ] = js.undefined
    
    var msTransitionProperty: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'msTransitionProperty' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.TransitionProperty | undefined */ js.Any
      ] = js.undefined
    
    var msTransitionTimingFunction: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'msTransitionTimingFunction' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.TransitionTimingFunction | undefined */ js.Any
      ] = js.undefined
    
    var msUserSelect: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'msUserSelect' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MsUserSelect | undefined */ js.Any
      ] = js.undefined
    
    var msWordBreak: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'msWordBreak' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.WordBreak | undefined */ js.Any
      ] = js.undefined
    
    var msWrapFlow: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'msWrapFlow' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MsWrapFlow | undefined */ js.Any
      ] = js.undefined
    
    var msWrapMargin: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'msWrapMargin' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MsWrapMargin<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var msWrapThrough: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'msWrapThrough' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MsWrapThrough | undefined */ js.Any
      ] = js.undefined
    
    var msWritingMode: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'msWritingMode' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.WritingMode | undefined */ js.Any
      ] = js.undefined
    
    var objectFit: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'objectFit' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.ObjectFit | undefined */ js.Any
      ] = js.undefined
    
    var objectPosition: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'objectPosition' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.ObjectPosition<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var offset: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'offset' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.Offset<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var offsetAnchor: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'offsetAnchor' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.OffsetAnchor<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var offsetBlock: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'offsetBlock' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.InsetBlock<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var offsetBlockEnd: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'offsetBlockEnd' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.InsetBlockEnd<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var offsetBlockStart: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'offsetBlockStart' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.InsetBlockStart<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var offsetDistance: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'offsetDistance' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.OffsetDistance<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var offsetInline: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'offsetInline' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.InsetInline<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var offsetInlineEnd: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'offsetInlineEnd' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.InsetInlineEnd<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var offsetInlineStart: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'offsetInlineStart' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.InsetInlineStart<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var offsetPath: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'offsetPath' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.OffsetPath | undefined */ js.Any
      ] = js.undefined
    
    var offsetRotate: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'offsetRotate' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.OffsetRotate | undefined */ js.Any
      ] = js.undefined
    
    var offsetRotation: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'offsetRotation' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.OffsetRotate | undefined */ js.Any
      ] = js.undefined
    
    var opacity: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'opacity' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.Opacity | undefined */ js.Any
      ] = js.undefined
    
    var order: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'order' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.Order | undefined */ js.Any
      ] = js.undefined
    
    var orphans: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'orphans' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.Orphans | undefined */ js.Any
      ] = js.undefined
    
    var outline: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'outline' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.Outline<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var outlineColor: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'outlineColor' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.OutlineColor | undefined */ js.Any
      ] = js.undefined
    
    var outlineOffset: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'outlineOffset' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.OutlineOffset<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var outlineStyle: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'outlineStyle' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.OutlineStyle | undefined */ js.Any
      ] = js.undefined
    
    var outlineWidth: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'outlineWidth' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.OutlineWidth<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var overflow: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'overflow' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.Overflow | undefined */ js.Any
      ] = js.undefined
    
    var overflowAnchor: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'overflowAnchor' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.OverflowAnchor | undefined */ js.Any
      ] = js.undefined
    
    var overflowBlock: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'overflowBlock' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.OverflowBlock | undefined */ js.Any
      ] = js.undefined
    
    var overflowClipBox: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'overflowClipBox' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.OverflowClipBox | undefined */ js.Any
      ] = js.undefined
    
    var overflowClipMargin: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'overflowClipMargin' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.OverflowClipMargin<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var overflowInline: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'overflowInline' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.OverflowInline | undefined */ js.Any
      ] = js.undefined
    
    var overflowWrap: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'overflowWrap' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.OverflowWrap | undefined */ js.Any
      ] = js.undefined
    
    var overflowX: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'overflowX' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.OverflowX | undefined */ js.Any
      ] = js.undefined
    
    var overflowY: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'overflowY' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.OverflowY | undefined */ js.Any
      ] = js.undefined
    
    var overscrollBehavior: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'overscrollBehavior' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.OverscrollBehavior | undefined */ js.Any
      ] = js.undefined
    
    var overscrollBehaviorBlock: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'overscrollBehaviorBlock' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.OverscrollBehaviorBlock | undefined */ js.Any
      ] = js.undefined
    
    var overscrollBehaviorInline: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'overscrollBehaviorInline' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.OverscrollBehaviorInline | undefined */ js.Any
      ] = js.undefined
    
    var overscrollBehaviorX: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'overscrollBehaviorX' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.OverscrollBehaviorX | undefined */ js.Any
      ] = js.undefined
    
    var overscrollBehaviorY: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'overscrollBehaviorY' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.OverscrollBehaviorY | undefined */ js.Any
      ] = js.undefined
    
    var padding: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'padding' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.Padding<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var paddingBlock: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'paddingBlock' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.PaddingBlock<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var paddingBlockEnd: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'paddingBlockEnd' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.PaddingBlockEnd<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var paddingBlockStart: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'paddingBlockStart' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.PaddingBlockStart<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var paddingBottom: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'paddingBottom' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.PaddingBottom<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var paddingInline: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'paddingInline' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.PaddingInline<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var paddingInlineEnd: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'paddingInlineEnd' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.PaddingInlineEnd<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var paddingInlineStart: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'paddingInlineStart' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.PaddingInlineStart<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var paddingLeft: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'paddingLeft' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.PaddingLeft<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var paddingRight: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'paddingRight' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.PaddingRight<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var paddingTop: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'paddingTop' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.PaddingTop<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var pageBreakAfter: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'pageBreakAfter' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.PageBreakAfter | undefined */ js.Any
      ] = js.undefined
    
    var pageBreakBefore: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'pageBreakBefore' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.PageBreakBefore | undefined */ js.Any
      ] = js.undefined
    
    var pageBreakInside: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'pageBreakInside' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.PageBreakInside | undefined */ js.Any
      ] = js.undefined
    
    var paintOrder: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'paintOrder' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.PaintOrder | undefined */ js.Any
      ] = js.undefined
    
    var perspective: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'perspective' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.Perspective<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var perspectiveOrigin: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'perspectiveOrigin' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.PerspectiveOrigin<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var placeContent: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'placeContent' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.PlaceContent | undefined */ js.Any
      ] = js.undefined
    
    var placeItems: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'placeItems' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.PlaceItems | undefined */ js.Any
      ] = js.undefined
    
    var placeSelf: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'placeSelf' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.PlaceSelf | undefined */ js.Any
      ] = js.undefined
    
    var pointerEvents: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'pointerEvents' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.PointerEvents | undefined */ js.Any
      ] = js.undefined
    
    var position: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'position' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.Position | undefined */ js.Any
      ] = js.undefined
    
    var printColorAdjust: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'printColorAdjust' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.PrintColorAdjust | undefined */ js.Any
      ] = js.undefined
    
    var quotes: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'quotes' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.Quotes | undefined */ js.Any
      ] = js.undefined
    
    var resize: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'resize' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.Resize | undefined */ js.Any
      ] = js.undefined
    
    var right: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'right' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.Right<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var rotate: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'rotate' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? @react-spring/web.@react-spring/web/dist/declarations/src/animated.Angle | undefined : csstype.csstype.Property.Rotate | undefined */ js.Any
      ] = js.undefined
    
    var rotate3d: js.UndefOr[js.Tuple4[Double, Double, Double, Angle]] = js.undefined
    
    var rotateX: js.UndefOr[Angle] = js.undefined
    
    var rotateY: js.UndefOr[Angle] = js.undefined
    
    var rotateZ: js.UndefOr[Angle] = js.undefined
    
    var rowGap: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'rowGap' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.RowGap<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var rubyAlign: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'rubyAlign' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.RubyAlign | undefined */ js.Any
      ] = js.undefined
    
    var rubyMerge: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'rubyMerge' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.RubyMerge | undefined */ js.Any
      ] = js.undefined
    
    var rubyPosition: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'rubyPosition' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.RubyPosition | undefined */ js.Any
      ] = js.undefined
    
    var scale: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'scale' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? number | [number, number] | string | undefined : csstype.csstype.Property.Scale | undefined */ js.Any
      ] = js.undefined
    
    var scale3d: js.UndefOr[js.Tuple3[Double, Double, Double]] = js.undefined
    
    var scaleX: js.UndefOr[Double] = js.undefined
    
    var scaleY: js.UndefOr[Double] = js.undefined
    
    var scaleZ: js.UndefOr[Double] = js.undefined
    
    var scrollBehavior: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'scrollBehavior' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.ScrollBehavior | undefined */ js.Any
      ] = js.undefined
    
    var scrollMargin: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'scrollMargin' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.ScrollMargin<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var scrollMarginBlock: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'scrollMarginBlock' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.ScrollMarginBlock<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var scrollMarginBlockEnd: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'scrollMarginBlockEnd' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.ScrollMarginBlockEnd<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var scrollMarginBlockStart: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'scrollMarginBlockStart' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.ScrollMarginBlockStart<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var scrollMarginBottom: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'scrollMarginBottom' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.ScrollMarginBottom<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var scrollMarginInline: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'scrollMarginInline' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.ScrollMarginInline<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var scrollMarginInlineEnd: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'scrollMarginInlineEnd' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.ScrollMarginInlineEnd<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var scrollMarginInlineStart: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'scrollMarginInlineStart' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.ScrollMarginInlineStart<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var scrollMarginLeft: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'scrollMarginLeft' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.ScrollMarginLeft<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var scrollMarginRight: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'scrollMarginRight' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.ScrollMarginRight<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var scrollMarginTop: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'scrollMarginTop' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.ScrollMarginTop<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var scrollPadding: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'scrollPadding' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.ScrollPadding<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var scrollPaddingBlock: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'scrollPaddingBlock' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.ScrollPaddingBlock<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var scrollPaddingBlockEnd: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'scrollPaddingBlockEnd' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.ScrollPaddingBlockEnd<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var scrollPaddingBlockStart: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'scrollPaddingBlockStart' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.ScrollPaddingBlockStart<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var scrollPaddingBottom: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'scrollPaddingBottom' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.ScrollPaddingBottom<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var scrollPaddingInline: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'scrollPaddingInline' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.ScrollPaddingInline<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var scrollPaddingInlineEnd: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'scrollPaddingInlineEnd' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.ScrollPaddingInlineEnd<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var scrollPaddingInlineStart: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'scrollPaddingInlineStart' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.ScrollPaddingInlineStart<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var scrollPaddingLeft: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'scrollPaddingLeft' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.ScrollPaddingLeft<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var scrollPaddingRight: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'scrollPaddingRight' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.ScrollPaddingRight<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var scrollPaddingTop: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'scrollPaddingTop' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.ScrollPaddingTop<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var scrollSnapAlign: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'scrollSnapAlign' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.ScrollSnapAlign | undefined */ js.Any
      ] = js.undefined
    
    var scrollSnapCoordinate: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'scrollSnapCoordinate' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.ScrollSnapCoordinate<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var scrollSnapDestination: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'scrollSnapDestination' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.ScrollSnapDestination<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var scrollSnapMargin: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'scrollSnapMargin' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.ScrollMargin<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var scrollSnapMarginBottom: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'scrollSnapMarginBottom' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.ScrollMarginBottom<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var scrollSnapMarginLeft: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'scrollSnapMarginLeft' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.ScrollMarginLeft<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var scrollSnapMarginRight: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'scrollSnapMarginRight' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.ScrollMarginRight<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var scrollSnapMarginTop: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'scrollSnapMarginTop' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.ScrollMarginTop<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var scrollSnapPointsX: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'scrollSnapPointsX' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.ScrollSnapPointsX | undefined */ js.Any
      ] = js.undefined
    
    var scrollSnapPointsY: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'scrollSnapPointsY' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.ScrollSnapPointsY | undefined */ js.Any
      ] = js.undefined
    
    var scrollSnapStop: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'scrollSnapStop' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.ScrollSnapStop | undefined */ js.Any
      ] = js.undefined
    
    var scrollSnapType: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'scrollSnapType' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.ScrollSnapType | undefined */ js.Any
      ] = js.undefined
    
    var scrollSnapTypeX: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'scrollSnapTypeX' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.ScrollSnapTypeX | undefined */ js.Any
      ] = js.undefined
    
    var scrollSnapTypeY: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'scrollSnapTypeY' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.ScrollSnapTypeY | undefined */ js.Any
      ] = js.undefined
    
    var scrollbarColor: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'scrollbarColor' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.ScrollbarColor | undefined */ js.Any
      ] = js.undefined
    
    var scrollbarGutter: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'scrollbarGutter' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.ScrollbarGutter | undefined */ js.Any
      ] = js.undefined
    
    var scrollbarWidth: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'scrollbarWidth' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.ScrollbarWidth | undefined */ js.Any
      ] = js.undefined
    
    var shapeImageThreshold: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'shapeImageThreshold' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.ShapeImageThreshold | undefined */ js.Any
      ] = js.undefined
    
    var shapeMargin: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'shapeMargin' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.ShapeMargin<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var shapeOutside: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'shapeOutside' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.ShapeOutside | undefined */ js.Any
      ] = js.undefined
    
    var shapeRendering: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'shapeRendering' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.ShapeRendering | undefined */ js.Any
      ] = js.undefined
    
    var skew: js.UndefOr[Angle | (js.Tuple2[Angle, Angle])] = js.undefined
    
    var skewX: js.UndefOr[Angle] = js.undefined
    
    var skewY: js.UndefOr[Angle] = js.undefined
    
    var stopColor: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'stopColor' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.StopColor | undefined */ js.Any
      ] = js.undefined
    
    var stopOpacity: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'stopOpacity' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.StopOpacity | undefined */ js.Any
      ] = js.undefined
    
    var stroke: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'stroke' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.Stroke | undefined */ js.Any
      ] = js.undefined
    
    var strokeDasharray: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'strokeDasharray' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.StrokeDasharray<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var strokeDashoffset: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'strokeDashoffset' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.StrokeDashoffset<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var strokeLinecap: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'strokeLinecap' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.StrokeLinecap | undefined */ js.Any
      ] = js.undefined
    
    var strokeLinejoin: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'strokeLinejoin' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.StrokeLinejoin | undefined */ js.Any
      ] = js.undefined
    
    var strokeMiterlimit: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'strokeMiterlimit' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.StrokeMiterlimit | undefined */ js.Any
      ] = js.undefined
    
    var strokeOpacity: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'strokeOpacity' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.StrokeOpacity | undefined */ js.Any
      ] = js.undefined
    
    var strokeWidth: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'strokeWidth' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.StrokeWidth<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var tabSize: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'tabSize' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.TabSize<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var tableLayout: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'tableLayout' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.TableLayout | undefined */ js.Any
      ] = js.undefined
    
    var textAlign: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'textAlign' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.TextAlign | undefined */ js.Any
      ] = js.undefined
    
    var textAlignLast: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'textAlignLast' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.TextAlignLast | undefined */ js.Any
      ] = js.undefined
    
    var textAnchor: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'textAnchor' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.TextAnchor | undefined */ js.Any
      ] = js.undefined
    
    var textCombineUpright: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'textCombineUpright' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.TextCombineUpright | undefined */ js.Any
      ] = js.undefined
    
    var textDecoration: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'textDecoration' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.TextDecoration<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var textDecorationColor: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'textDecorationColor' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.TextDecorationColor | undefined */ js.Any
      ] = js.undefined
    
    var textDecorationLine: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'textDecorationLine' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.TextDecorationLine | undefined */ js.Any
      ] = js.undefined
    
    var textDecorationSkip: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'textDecorationSkip' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.TextDecorationSkip | undefined */ js.Any
      ] = js.undefined
    
    var textDecorationSkipInk: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'textDecorationSkipInk' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.TextDecorationSkipInk | undefined */ js.Any
      ] = js.undefined
    
    var textDecorationStyle: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'textDecorationStyle' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.TextDecorationStyle | undefined */ js.Any
      ] = js.undefined
    
    var textDecorationThickness: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'textDecorationThickness' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.TextDecorationThickness<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var textEmphasis: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'textEmphasis' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.TextEmphasis | undefined */ js.Any
      ] = js.undefined
    
    var textEmphasisColor: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'textEmphasisColor' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.TextEmphasisColor | undefined */ js.Any
      ] = js.undefined
    
    var textEmphasisPosition: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'textEmphasisPosition' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.TextEmphasisPosition | undefined */ js.Any
      ] = js.undefined
    
    var textEmphasisStyle: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'textEmphasisStyle' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.TextEmphasisStyle | undefined */ js.Any
      ] = js.undefined
    
    var textIndent: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'textIndent' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.TextIndent<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var textJustify: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'textJustify' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.TextJustify | undefined */ js.Any
      ] = js.undefined
    
    var textOrientation: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'textOrientation' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.TextOrientation | undefined */ js.Any
      ] = js.undefined
    
    var textOverflow: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'textOverflow' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.TextOverflow | undefined */ js.Any
      ] = js.undefined
    
    var textRendering: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'textRendering' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.TextRendering | undefined */ js.Any
      ] = js.undefined
    
    var textShadow: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'textShadow' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.TextShadow | undefined */ js.Any
      ] = js.undefined
    
    var textSizeAdjust: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'textSizeAdjust' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.TextSizeAdjust | undefined */ js.Any
      ] = js.undefined
    
    var textTransform: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'textTransform' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.TextTransform | undefined */ js.Any
      ] = js.undefined
    
    var textUnderlineOffset: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'textUnderlineOffset' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.TextUnderlineOffset<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var textUnderlinePosition: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'textUnderlinePosition' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.TextUnderlinePosition | undefined */ js.Any
      ] = js.undefined
    
    var top: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'top' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.Top<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var touchAction: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'touchAction' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.TouchAction | undefined */ js.Any
      ] = js.undefined
    
    var transform: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'transform' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? string | undefined : csstype.csstype.Property.Transform | undefined */ js.Any
      ] = js.undefined
    
    var transformBox: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'transformBox' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.TransformBox | undefined */ js.Any
      ] = js.undefined
    
    var transformOrigin: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'transformOrigin' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.TransformOrigin<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var transformStyle: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'transformStyle' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.TransformStyle | undefined */ js.Any
      ] = js.undefined
    
    var transition: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'transition' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.Transition<string & {}> | undefined */ js.Any
      ] = js.undefined
    
    var transitionDelay: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'transitionDelay' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.TransitionDelay<string & {}> | undefined */ js.Any
      ] = js.undefined
    
    var transitionDuration: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'transitionDuration' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.TransitionDuration<string & {}> | undefined */ js.Any
      ] = js.undefined
    
    var transitionProperty: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'transitionProperty' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.TransitionProperty | undefined */ js.Any
      ] = js.undefined
    
    var transitionTimingFunction: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'transitionTimingFunction' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.TransitionTimingFunction | undefined */ js.Any
      ] = js.undefined
    
    var translate: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'translate' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? @react-spring/web.@react-spring/web/dist/declarations/src/animated.Length | [@react-spring/web.@react-spring/web/dist/declarations/src/animated.Length, @react-spring/web.@react-spring/web/dist/declarations/src/animated.Length] | undefined : csstype.csstype.Property.Translate<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var translate3d: js.UndefOr[js.Tuple3[Length, Length, Length]] = js.undefined
    
    var translateX: js.UndefOr[Length] = js.undefined
    
    var translateY: js.UndefOr[Length] = js.undefined
    
    var translateZ: js.UndefOr[Length] = js.undefined
    
    var unicodeBidi: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'unicodeBidi' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.UnicodeBidi | undefined */ js.Any
      ] = js.undefined
    
    var userSelect: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'userSelect' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.UserSelect | undefined */ js.Any
      ] = js.undefined
    
    var vectorEffect: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'vectorEffect' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.VectorEffect | undefined */ js.Any
      ] = js.undefined
    
    var verticalAlign: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'verticalAlign' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.VerticalAlign<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var visibility: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'visibility' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.Visibility | undefined */ js.Any
      ] = js.undefined
    
    var whiteSpace: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'whiteSpace' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.WhiteSpace | undefined */ js.Any
      ] = js.undefined
    
    var widows: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'widows' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.Widows | undefined */ js.Any
      ] = js.undefined
    
    var width: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'width' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.Width<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var willChange: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'willChange' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.WillChange | undefined */ js.Any
      ] = js.undefined
    
    var wordBreak: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'wordBreak' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.WordBreak | undefined */ js.Any
      ] = js.undefined
    
    var wordSpacing: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'wordSpacing' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.WordSpacing<string | number> | undefined */ js.Any
      ] = js.undefined
    
    var wordWrap: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'wordWrap' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.WordWrap | undefined */ js.Any
      ] = js.undefined
    
    var writingMode: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'writingMode' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.WritingMode | undefined */ js.Any
      ] = js.undefined
    
    var x: js.UndefOr[Length] = js.undefined
    
    var y: js.UndefOr[Length] = js.undefined
    
    var z: js.UndefOr[Length] = js.undefined
    
    var zIndex: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'zIndex' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.ZIndex | undefined */ js.Any
      ] = js.undefined
    
    var zoom: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'zoom' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.Zoom | undefined */ js.Any
      ] = js.undefined
  }
  object StyleProps {
    
    inline def apply(): StyleProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StyleProps]
    }
    
    extension [Self <: StyleProps](x: Self) {
      
      inline def setAccentColor(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'accentColor' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.AccentColor | undefined */ js.Any
      ): Self = StObject.set(x, "accentColor", value.asInstanceOf[js.Any])
      
      inline def setAccentColorUndefined: Self = StObject.set(x, "accentColor", js.undefined)
      
      inline def setAlignContent(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'alignContent' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.AlignContent | undefined */ js.Any
      ): Self = StObject.set(x, "alignContent", value.asInstanceOf[js.Any])
      
      inline def setAlignContentUndefined: Self = StObject.set(x, "alignContent", js.undefined)
      
      inline def setAlignItems(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'alignItems' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.AlignItems | undefined */ js.Any
      ): Self = StObject.set(x, "alignItems", value.asInstanceOf[js.Any])
      
      inline def setAlignItemsUndefined: Self = StObject.set(x, "alignItems", js.undefined)
      
      inline def setAlignSelf(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'alignSelf' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.AlignSelf | undefined */ js.Any
      ): Self = StObject.set(x, "alignSelf", value.asInstanceOf[js.Any])
      
      inline def setAlignSelfUndefined: Self = StObject.set(x, "alignSelf", js.undefined)
      
      inline def setAlignTracks(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'alignTracks' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.AlignTracks | undefined */ js.Any
      ): Self = StObject.set(x, "alignTracks", value.asInstanceOf[js.Any])
      
      inline def setAlignTracksUndefined: Self = StObject.set(x, "alignTracks", js.undefined)
      
      inline def setAlignmentBaseline(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'alignmentBaseline' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.AlignmentBaseline | undefined */ js.Any
      ): Self = StObject.set(x, "alignmentBaseline", value.asInstanceOf[js.Any])
      
      inline def setAlignmentBaselineUndefined: Self = StObject.set(x, "alignmentBaseline", js.undefined)
      
      inline def setAll(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'all' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.All | undefined */ js.Any
      ): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
      
      inline def setAllUndefined: Self = StObject.set(x, "all", js.undefined)
      
      inline def setAnimation(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'animation' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.Animation<string & {}> | undefined */ js.Any
      ): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
      
      inline def setAnimationComposition(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'animationComposition' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.AnimationComposition | undefined */ js.Any
      ): Self = StObject.set(x, "animationComposition", value.asInstanceOf[js.Any])
      
      inline def setAnimationCompositionUndefined: Self = StObject.set(x, "animationComposition", js.undefined)
      
      inline def setAnimationDelay(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'animationDelay' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.AnimationDelay<string & {}> | undefined */ js.Any
      ): Self = StObject.set(x, "animationDelay", value.asInstanceOf[js.Any])
      
      inline def setAnimationDelayUndefined: Self = StObject.set(x, "animationDelay", js.undefined)
      
      inline def setAnimationDirection(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'animationDirection' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.AnimationDirection | undefined */ js.Any
      ): Self = StObject.set(x, "animationDirection", value.asInstanceOf[js.Any])
      
      inline def setAnimationDirectionUndefined: Self = StObject.set(x, "animationDirection", js.undefined)
      
      inline def setAnimationDuration(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'animationDuration' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.AnimationDuration<string & {}> | undefined */ js.Any
      ): Self = StObject.set(x, "animationDuration", value.asInstanceOf[js.Any])
      
      inline def setAnimationDurationUndefined: Self = StObject.set(x, "animationDuration", js.undefined)
      
      inline def setAnimationFillMode(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'animationFillMode' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.AnimationFillMode | undefined */ js.Any
      ): Self = StObject.set(x, "animationFillMode", value.asInstanceOf[js.Any])
      
      inline def setAnimationFillModeUndefined: Self = StObject.set(x, "animationFillMode", js.undefined)
      
      inline def setAnimationIterationCount(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'animationIterationCount' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.AnimationIterationCount | undefined */ js.Any
      ): Self = StObject.set(x, "animationIterationCount", value.asInstanceOf[js.Any])
      
      inline def setAnimationIterationCountUndefined: Self = StObject.set(x, "animationIterationCount", js.undefined)
      
      inline def setAnimationName(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'animationName' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.AnimationName | undefined */ js.Any
      ): Self = StObject.set(x, "animationName", value.asInstanceOf[js.Any])
      
      inline def setAnimationNameUndefined: Self = StObject.set(x, "animationName", js.undefined)
      
      inline def setAnimationPlayState(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'animationPlayState' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.AnimationPlayState | undefined */ js.Any
      ): Self = StObject.set(x, "animationPlayState", value.asInstanceOf[js.Any])
      
      inline def setAnimationPlayStateUndefined: Self = StObject.set(x, "animationPlayState", js.undefined)
      
      inline def setAnimationTimeline(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'animationTimeline' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.AnimationTimeline | undefined */ js.Any
      ): Self = StObject.set(x, "animationTimeline", value.asInstanceOf[js.Any])
      
      inline def setAnimationTimelineUndefined: Self = StObject.set(x, "animationTimeline", js.undefined)
      
      inline def setAnimationTimingFunction(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'animationTimingFunction' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.AnimationTimingFunction | undefined */ js.Any
      ): Self = StObject.set(x, "animationTimingFunction", value.asInstanceOf[js.Any])
      
      inline def setAnimationTimingFunctionUndefined: Self = StObject.set(x, "animationTimingFunction", js.undefined)
      
      inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
      
      inline def setAppearance(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'appearance' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.Appearance | undefined */ js.Any
      ): Self = StObject.set(x, "appearance", value.asInstanceOf[js.Any])
      
      inline def setAppearanceUndefined: Self = StObject.set(x, "appearance", js.undefined)
      
      inline def setAspectRatio(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'aspectRatio' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.AspectRatio | undefined */ js.Any
      ): Self = StObject.set(x, "aspectRatio", value.asInstanceOf[js.Any])
      
      inline def setAspectRatioUndefined: Self = StObject.set(x, "aspectRatio", js.undefined)
      
      inline def setAzimuth(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'azimuth' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.Azimuth | undefined */ js.Any
      ): Self = StObject.set(x, "azimuth", value.asInstanceOf[js.Any])
      
      inline def setAzimuthUndefined: Self = StObject.set(x, "azimuth", js.undefined)
      
      inline def setBackdropFilter(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'backdropFilter' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BackdropFilter | undefined */ js.Any
      ): Self = StObject.set(x, "backdropFilter", value.asInstanceOf[js.Any])
      
      inline def setBackdropFilterUndefined: Self = StObject.set(x, "backdropFilter", js.undefined)
      
      inline def setBackfaceVisibility(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'backfaceVisibility' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BackfaceVisibility | undefined */ js.Any
      ): Self = StObject.set(x, "backfaceVisibility", value.asInstanceOf[js.Any])
      
      inline def setBackfaceVisibilityUndefined: Self = StObject.set(x, "backfaceVisibility", js.undefined)
      
      inline def setBackground(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'background' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.Background<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      inline def setBackgroundAttachment(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'backgroundAttachment' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BackgroundAttachment | undefined */ js.Any
      ): Self = StObject.set(x, "backgroundAttachment", value.asInstanceOf[js.Any])
      
      inline def setBackgroundAttachmentUndefined: Self = StObject.set(x, "backgroundAttachment", js.undefined)
      
      inline def setBackgroundBlendMode(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'backgroundBlendMode' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BackgroundBlendMode | undefined */ js.Any
      ): Self = StObject.set(x, "backgroundBlendMode", value.asInstanceOf[js.Any])
      
      inline def setBackgroundBlendModeUndefined: Self = StObject.set(x, "backgroundBlendMode", js.undefined)
      
      inline def setBackgroundClip(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'backgroundClip' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BackgroundClip | undefined */ js.Any
      ): Self = StObject.set(x, "backgroundClip", value.asInstanceOf[js.Any])
      
      inline def setBackgroundClipUndefined: Self = StObject.set(x, "backgroundClip", js.undefined)
      
      inline def setBackgroundColor(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'backgroundColor' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BackgroundColor | undefined */ js.Any
      ): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      inline def setBackgroundImage(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'backgroundImage' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BackgroundImage | undefined */ js.Any
      ): Self = StObject.set(x, "backgroundImage", value.asInstanceOf[js.Any])
      
      inline def setBackgroundImageUndefined: Self = StObject.set(x, "backgroundImage", js.undefined)
      
      inline def setBackgroundOrigin(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'backgroundOrigin' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BackgroundOrigin | undefined */ js.Any
      ): Self = StObject.set(x, "backgroundOrigin", value.asInstanceOf[js.Any])
      
      inline def setBackgroundOriginUndefined: Self = StObject.set(x, "backgroundOrigin", js.undefined)
      
      inline def setBackgroundPosition(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'backgroundPosition' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BackgroundPosition<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "backgroundPosition", value.asInstanceOf[js.Any])
      
      inline def setBackgroundPositionUndefined: Self = StObject.set(x, "backgroundPosition", js.undefined)
      
      inline def setBackgroundPositionX(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'backgroundPositionX' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BackgroundPositionX<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "backgroundPositionX", value.asInstanceOf[js.Any])
      
      inline def setBackgroundPositionXUndefined: Self = StObject.set(x, "backgroundPositionX", js.undefined)
      
      inline def setBackgroundPositionY(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'backgroundPositionY' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BackgroundPositionY<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "backgroundPositionY", value.asInstanceOf[js.Any])
      
      inline def setBackgroundPositionYUndefined: Self = StObject.set(x, "backgroundPositionY", js.undefined)
      
      inline def setBackgroundRepeat(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'backgroundRepeat' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BackgroundRepeat | undefined */ js.Any
      ): Self = StObject.set(x, "backgroundRepeat", value.asInstanceOf[js.Any])
      
      inline def setBackgroundRepeatUndefined: Self = StObject.set(x, "backgroundRepeat", js.undefined)
      
      inline def setBackgroundSize(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'backgroundSize' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BackgroundSize<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "backgroundSize", value.asInstanceOf[js.Any])
      
      inline def setBackgroundSizeUndefined: Self = StObject.set(x, "backgroundSize", js.undefined)
      
      inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      inline def setBaselineShift(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'baselineShift' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BaselineShift<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "baselineShift", value.asInstanceOf[js.Any])
      
      inline def setBaselineShiftUndefined: Self = StObject.set(x, "baselineShift", js.undefined)
      
      inline def setBlockOverflow(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'blockOverflow' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BlockOverflow | undefined */ js.Any
      ): Self = StObject.set(x, "blockOverflow", value.asInstanceOf[js.Any])
      
      inline def setBlockOverflowUndefined: Self = StObject.set(x, "blockOverflow", js.undefined)
      
      inline def setBlockSize(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'blockSize' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BlockSize<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "blockSize", value.asInstanceOf[js.Any])
      
      inline def setBlockSizeUndefined: Self = StObject.set(x, "blockSize", js.undefined)
      
      inline def setBorder(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'border' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.Border<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
      
      inline def setBorderBlock(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'borderBlock' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BorderBlock<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "borderBlock", value.asInstanceOf[js.Any])
      
      inline def setBorderBlockColor(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'borderBlockColor' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BorderBlockColor | undefined */ js.Any
      ): Self = StObject.set(x, "borderBlockColor", value.asInstanceOf[js.Any])
      
      inline def setBorderBlockColorUndefined: Self = StObject.set(x, "borderBlockColor", js.undefined)
      
      inline def setBorderBlockEnd(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'borderBlockEnd' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BorderBlockEnd<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "borderBlockEnd", value.asInstanceOf[js.Any])
      
      inline def setBorderBlockEndColor(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'borderBlockEndColor' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BorderBlockEndColor | undefined */ js.Any
      ): Self = StObject.set(x, "borderBlockEndColor", value.asInstanceOf[js.Any])
      
      inline def setBorderBlockEndColorUndefined: Self = StObject.set(x, "borderBlockEndColor", js.undefined)
      
      inline def setBorderBlockEndStyle(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'borderBlockEndStyle' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BorderBlockEndStyle | undefined */ js.Any
      ): Self = StObject.set(x, "borderBlockEndStyle", value.asInstanceOf[js.Any])
      
      inline def setBorderBlockEndStyleUndefined: Self = StObject.set(x, "borderBlockEndStyle", js.undefined)
      
      inline def setBorderBlockEndUndefined: Self = StObject.set(x, "borderBlockEnd", js.undefined)
      
      inline def setBorderBlockEndWidth(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'borderBlockEndWidth' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BorderBlockEndWidth<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "borderBlockEndWidth", value.asInstanceOf[js.Any])
      
      inline def setBorderBlockEndWidthUndefined: Self = StObject.set(x, "borderBlockEndWidth", js.undefined)
      
      inline def setBorderBlockStart(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'borderBlockStart' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BorderBlockStart<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "borderBlockStart", value.asInstanceOf[js.Any])
      
      inline def setBorderBlockStartColor(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'borderBlockStartColor' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BorderBlockStartColor | undefined */ js.Any
      ): Self = StObject.set(x, "borderBlockStartColor", value.asInstanceOf[js.Any])
      
      inline def setBorderBlockStartColorUndefined: Self = StObject.set(x, "borderBlockStartColor", js.undefined)
      
      inline def setBorderBlockStartStyle(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'borderBlockStartStyle' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BorderBlockStartStyle | undefined */ js.Any
      ): Self = StObject.set(x, "borderBlockStartStyle", value.asInstanceOf[js.Any])
      
      inline def setBorderBlockStartStyleUndefined: Self = StObject.set(x, "borderBlockStartStyle", js.undefined)
      
      inline def setBorderBlockStartUndefined: Self = StObject.set(x, "borderBlockStart", js.undefined)
      
      inline def setBorderBlockStartWidth(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'borderBlockStartWidth' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BorderBlockStartWidth<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "borderBlockStartWidth", value.asInstanceOf[js.Any])
      
      inline def setBorderBlockStartWidthUndefined: Self = StObject.set(x, "borderBlockStartWidth", js.undefined)
      
      inline def setBorderBlockStyle(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'borderBlockStyle' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BorderBlockStyle | undefined */ js.Any
      ): Self = StObject.set(x, "borderBlockStyle", value.asInstanceOf[js.Any])
      
      inline def setBorderBlockStyleUndefined: Self = StObject.set(x, "borderBlockStyle", js.undefined)
      
      inline def setBorderBlockUndefined: Self = StObject.set(x, "borderBlock", js.undefined)
      
      inline def setBorderBlockWidth(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'borderBlockWidth' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BorderBlockWidth<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "borderBlockWidth", value.asInstanceOf[js.Any])
      
      inline def setBorderBlockWidthUndefined: Self = StObject.set(x, "borderBlockWidth", js.undefined)
      
      inline def setBorderBottom(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'borderBottom' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BorderBottom<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "borderBottom", value.asInstanceOf[js.Any])
      
      inline def setBorderBottomColor(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'borderBottomColor' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BorderBottomColor | undefined */ js.Any
      ): Self = StObject.set(x, "borderBottomColor", value.asInstanceOf[js.Any])
      
      inline def setBorderBottomColorUndefined: Self = StObject.set(x, "borderBottomColor", js.undefined)
      
      inline def setBorderBottomLeftRadius(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'borderBottomLeftRadius' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BorderBottomLeftRadius<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "borderBottomLeftRadius", value.asInstanceOf[js.Any])
      
      inline def setBorderBottomLeftRadiusUndefined: Self = StObject.set(x, "borderBottomLeftRadius", js.undefined)
      
      inline def setBorderBottomRightRadius(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'borderBottomRightRadius' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BorderBottomRightRadius<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "borderBottomRightRadius", value.asInstanceOf[js.Any])
      
      inline def setBorderBottomRightRadiusUndefined: Self = StObject.set(x, "borderBottomRightRadius", js.undefined)
      
      inline def setBorderBottomStyle(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'borderBottomStyle' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BorderBottomStyle | undefined */ js.Any
      ): Self = StObject.set(x, "borderBottomStyle", value.asInstanceOf[js.Any])
      
      inline def setBorderBottomStyleUndefined: Self = StObject.set(x, "borderBottomStyle", js.undefined)
      
      inline def setBorderBottomUndefined: Self = StObject.set(x, "borderBottom", js.undefined)
      
      inline def setBorderBottomWidth(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'borderBottomWidth' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BorderBottomWidth<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "borderBottomWidth", value.asInstanceOf[js.Any])
      
      inline def setBorderBottomWidthUndefined: Self = StObject.set(x, "borderBottomWidth", js.undefined)
      
      inline def setBorderCollapse(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'borderCollapse' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BorderCollapse | undefined */ js.Any
      ): Self = StObject.set(x, "borderCollapse", value.asInstanceOf[js.Any])
      
      inline def setBorderCollapseUndefined: Self = StObject.set(x, "borderCollapse", js.undefined)
      
      inline def setBorderColor(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'borderColor' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BorderColor | undefined */ js.Any
      ): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
      
      inline def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
      
      inline def setBorderEndEndRadius(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'borderEndEndRadius' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BorderEndEndRadius<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "borderEndEndRadius", value.asInstanceOf[js.Any])
      
      inline def setBorderEndEndRadiusUndefined: Self = StObject.set(x, "borderEndEndRadius", js.undefined)
      
      inline def setBorderEndStartRadius(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'borderEndStartRadius' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BorderEndStartRadius<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "borderEndStartRadius", value.asInstanceOf[js.Any])
      
      inline def setBorderEndStartRadiusUndefined: Self = StObject.set(x, "borderEndStartRadius", js.undefined)
      
      inline def setBorderImage(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'borderImage' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BorderImage | undefined */ js.Any
      ): Self = StObject.set(x, "borderImage", value.asInstanceOf[js.Any])
      
      inline def setBorderImageOutset(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'borderImageOutset' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BorderImageOutset<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "borderImageOutset", value.asInstanceOf[js.Any])
      
      inline def setBorderImageOutsetUndefined: Self = StObject.set(x, "borderImageOutset", js.undefined)
      
      inline def setBorderImageRepeat(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'borderImageRepeat' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BorderImageRepeat | undefined */ js.Any
      ): Self = StObject.set(x, "borderImageRepeat", value.asInstanceOf[js.Any])
      
      inline def setBorderImageRepeatUndefined: Self = StObject.set(x, "borderImageRepeat", js.undefined)
      
      inline def setBorderImageSlice(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'borderImageSlice' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BorderImageSlice | undefined */ js.Any
      ): Self = StObject.set(x, "borderImageSlice", value.asInstanceOf[js.Any])
      
      inline def setBorderImageSliceUndefined: Self = StObject.set(x, "borderImageSlice", js.undefined)
      
      inline def setBorderImageSource(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'borderImageSource' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BorderImageSource | undefined */ js.Any
      ): Self = StObject.set(x, "borderImageSource", value.asInstanceOf[js.Any])
      
      inline def setBorderImageSourceUndefined: Self = StObject.set(x, "borderImageSource", js.undefined)
      
      inline def setBorderImageUndefined: Self = StObject.set(x, "borderImage", js.undefined)
      
      inline def setBorderImageWidth(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'borderImageWidth' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BorderImageWidth<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "borderImageWidth", value.asInstanceOf[js.Any])
      
      inline def setBorderImageWidthUndefined: Self = StObject.set(x, "borderImageWidth", js.undefined)
      
      inline def setBorderInline(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'borderInline' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BorderInline<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "borderInline", value.asInstanceOf[js.Any])
      
      inline def setBorderInlineColor(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'borderInlineColor' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BorderInlineColor | undefined */ js.Any
      ): Self = StObject.set(x, "borderInlineColor", value.asInstanceOf[js.Any])
      
      inline def setBorderInlineColorUndefined: Self = StObject.set(x, "borderInlineColor", js.undefined)
      
      inline def setBorderInlineEnd(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'borderInlineEnd' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BorderInlineEnd<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "borderInlineEnd", value.asInstanceOf[js.Any])
      
      inline def setBorderInlineEndColor(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'borderInlineEndColor' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BorderInlineEndColor | undefined */ js.Any
      ): Self = StObject.set(x, "borderInlineEndColor", value.asInstanceOf[js.Any])
      
      inline def setBorderInlineEndColorUndefined: Self = StObject.set(x, "borderInlineEndColor", js.undefined)
      
      inline def setBorderInlineEndStyle(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'borderInlineEndStyle' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BorderInlineEndStyle | undefined */ js.Any
      ): Self = StObject.set(x, "borderInlineEndStyle", value.asInstanceOf[js.Any])
      
      inline def setBorderInlineEndStyleUndefined: Self = StObject.set(x, "borderInlineEndStyle", js.undefined)
      
      inline def setBorderInlineEndUndefined: Self = StObject.set(x, "borderInlineEnd", js.undefined)
      
      inline def setBorderInlineEndWidth(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'borderInlineEndWidth' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BorderInlineEndWidth<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "borderInlineEndWidth", value.asInstanceOf[js.Any])
      
      inline def setBorderInlineEndWidthUndefined: Self = StObject.set(x, "borderInlineEndWidth", js.undefined)
      
      inline def setBorderInlineStart(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'borderInlineStart' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BorderInlineStart<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "borderInlineStart", value.asInstanceOf[js.Any])
      
      inline def setBorderInlineStartColor(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'borderInlineStartColor' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BorderInlineStartColor | undefined */ js.Any
      ): Self = StObject.set(x, "borderInlineStartColor", value.asInstanceOf[js.Any])
      
      inline def setBorderInlineStartColorUndefined: Self = StObject.set(x, "borderInlineStartColor", js.undefined)
      
      inline def setBorderInlineStartStyle(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'borderInlineStartStyle' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BorderInlineStartStyle | undefined */ js.Any
      ): Self = StObject.set(x, "borderInlineStartStyle", value.asInstanceOf[js.Any])
      
      inline def setBorderInlineStartStyleUndefined: Self = StObject.set(x, "borderInlineStartStyle", js.undefined)
      
      inline def setBorderInlineStartUndefined: Self = StObject.set(x, "borderInlineStart", js.undefined)
      
      inline def setBorderInlineStartWidth(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'borderInlineStartWidth' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BorderInlineStartWidth<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "borderInlineStartWidth", value.asInstanceOf[js.Any])
      
      inline def setBorderInlineStartWidthUndefined: Self = StObject.set(x, "borderInlineStartWidth", js.undefined)
      
      inline def setBorderInlineStyle(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'borderInlineStyle' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BorderInlineStyle | undefined */ js.Any
      ): Self = StObject.set(x, "borderInlineStyle", value.asInstanceOf[js.Any])
      
      inline def setBorderInlineStyleUndefined: Self = StObject.set(x, "borderInlineStyle", js.undefined)
      
      inline def setBorderInlineUndefined: Self = StObject.set(x, "borderInline", js.undefined)
      
      inline def setBorderInlineWidth(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'borderInlineWidth' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BorderInlineWidth<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "borderInlineWidth", value.asInstanceOf[js.Any])
      
      inline def setBorderInlineWidthUndefined: Self = StObject.set(x, "borderInlineWidth", js.undefined)
      
      inline def setBorderLeft(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'borderLeft' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BorderLeft<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "borderLeft", value.asInstanceOf[js.Any])
      
      inline def setBorderLeftColor(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'borderLeftColor' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BorderLeftColor | undefined */ js.Any
      ): Self = StObject.set(x, "borderLeftColor", value.asInstanceOf[js.Any])
      
      inline def setBorderLeftColorUndefined: Self = StObject.set(x, "borderLeftColor", js.undefined)
      
      inline def setBorderLeftStyle(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'borderLeftStyle' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BorderLeftStyle | undefined */ js.Any
      ): Self = StObject.set(x, "borderLeftStyle", value.asInstanceOf[js.Any])
      
      inline def setBorderLeftStyleUndefined: Self = StObject.set(x, "borderLeftStyle", js.undefined)
      
      inline def setBorderLeftUndefined: Self = StObject.set(x, "borderLeft", js.undefined)
      
      inline def setBorderLeftWidth(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'borderLeftWidth' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BorderLeftWidth<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "borderLeftWidth", value.asInstanceOf[js.Any])
      
      inline def setBorderLeftWidthUndefined: Self = StObject.set(x, "borderLeftWidth", js.undefined)
      
      inline def setBorderRadius(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'borderRadius' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BorderRadius<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "borderRadius", value.asInstanceOf[js.Any])
      
      inline def setBorderRadiusUndefined: Self = StObject.set(x, "borderRadius", js.undefined)
      
      inline def setBorderRight(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'borderRight' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BorderRight<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "borderRight", value.asInstanceOf[js.Any])
      
      inline def setBorderRightColor(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'borderRightColor' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BorderRightColor | undefined */ js.Any
      ): Self = StObject.set(x, "borderRightColor", value.asInstanceOf[js.Any])
      
      inline def setBorderRightColorUndefined: Self = StObject.set(x, "borderRightColor", js.undefined)
      
      inline def setBorderRightStyle(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'borderRightStyle' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BorderRightStyle | undefined */ js.Any
      ): Self = StObject.set(x, "borderRightStyle", value.asInstanceOf[js.Any])
      
      inline def setBorderRightStyleUndefined: Self = StObject.set(x, "borderRightStyle", js.undefined)
      
      inline def setBorderRightUndefined: Self = StObject.set(x, "borderRight", js.undefined)
      
      inline def setBorderRightWidth(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'borderRightWidth' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BorderRightWidth<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "borderRightWidth", value.asInstanceOf[js.Any])
      
      inline def setBorderRightWidthUndefined: Self = StObject.set(x, "borderRightWidth", js.undefined)
      
      inline def setBorderSpacing(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'borderSpacing' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BorderSpacing<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "borderSpacing", value.asInstanceOf[js.Any])
      
      inline def setBorderSpacingUndefined: Self = StObject.set(x, "borderSpacing", js.undefined)
      
      inline def setBorderStartEndRadius(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'borderStartEndRadius' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BorderStartEndRadius<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "borderStartEndRadius", value.asInstanceOf[js.Any])
      
      inline def setBorderStartEndRadiusUndefined: Self = StObject.set(x, "borderStartEndRadius", js.undefined)
      
      inline def setBorderStartStartRadius(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'borderStartStartRadius' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BorderStartStartRadius<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "borderStartStartRadius", value.asInstanceOf[js.Any])
      
      inline def setBorderStartStartRadiusUndefined: Self = StObject.set(x, "borderStartStartRadius", js.undefined)
      
      inline def setBorderStyle(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'borderStyle' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BorderStyle | undefined */ js.Any
      ): Self = StObject.set(x, "borderStyle", value.asInstanceOf[js.Any])
      
      inline def setBorderStyleUndefined: Self = StObject.set(x, "borderStyle", js.undefined)
      
      inline def setBorderTop(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'borderTop' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BorderTop<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "borderTop", value.asInstanceOf[js.Any])
      
      inline def setBorderTopColor(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'borderTopColor' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BorderTopColor | undefined */ js.Any
      ): Self = StObject.set(x, "borderTopColor", value.asInstanceOf[js.Any])
      
      inline def setBorderTopColorUndefined: Self = StObject.set(x, "borderTopColor", js.undefined)
      
      inline def setBorderTopLeftRadius(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'borderTopLeftRadius' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BorderTopLeftRadius<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "borderTopLeftRadius", value.asInstanceOf[js.Any])
      
      inline def setBorderTopLeftRadiusUndefined: Self = StObject.set(x, "borderTopLeftRadius", js.undefined)
      
      inline def setBorderTopRightRadius(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'borderTopRightRadius' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BorderTopRightRadius<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "borderTopRightRadius", value.asInstanceOf[js.Any])
      
      inline def setBorderTopRightRadiusUndefined: Self = StObject.set(x, "borderTopRightRadius", js.undefined)
      
      inline def setBorderTopStyle(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'borderTopStyle' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BorderTopStyle | undefined */ js.Any
      ): Self = StObject.set(x, "borderTopStyle", value.asInstanceOf[js.Any])
      
      inline def setBorderTopStyleUndefined: Self = StObject.set(x, "borderTopStyle", js.undefined)
      
      inline def setBorderTopUndefined: Self = StObject.set(x, "borderTop", js.undefined)
      
      inline def setBorderTopWidth(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'borderTopWidth' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BorderTopWidth<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "borderTopWidth", value.asInstanceOf[js.Any])
      
      inline def setBorderTopWidthUndefined: Self = StObject.set(x, "borderTopWidth", js.undefined)
      
      inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
      
      inline def setBorderWidth(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'borderWidth' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BorderWidth<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
      
      inline def setBorderWidthUndefined: Self = StObject.set(x, "borderWidth", js.undefined)
      
      inline def setBottom(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'bottom' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.Bottom<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      inline def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
      
      inline def setBoxAlign(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'boxAlign' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BoxAlign | undefined */ js.Any
      ): Self = StObject.set(x, "boxAlign", value.asInstanceOf[js.Any])
      
      inline def setBoxAlignUndefined: Self = StObject.set(x, "boxAlign", js.undefined)
      
      inline def setBoxDecorationBreak(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'boxDecorationBreak' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BoxDecorationBreak | undefined */ js.Any
      ): Self = StObject.set(x, "boxDecorationBreak", value.asInstanceOf[js.Any])
      
      inline def setBoxDecorationBreakUndefined: Self = StObject.set(x, "boxDecorationBreak", js.undefined)
      
      inline def setBoxDirection(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'boxDirection' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BoxDirection | undefined */ js.Any
      ): Self = StObject.set(x, "boxDirection", value.asInstanceOf[js.Any])
      
      inline def setBoxDirectionUndefined: Self = StObject.set(x, "boxDirection", js.undefined)
      
      inline def setBoxFlex(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'boxFlex' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BoxFlex | undefined */ js.Any
      ): Self = StObject.set(x, "boxFlex", value.asInstanceOf[js.Any])
      
      inline def setBoxFlexGroup(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'boxFlexGroup' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BoxFlexGroup | undefined */ js.Any
      ): Self = StObject.set(x, "boxFlexGroup", value.asInstanceOf[js.Any])
      
      inline def setBoxFlexGroupUndefined: Self = StObject.set(x, "boxFlexGroup", js.undefined)
      
      inline def setBoxFlexUndefined: Self = StObject.set(x, "boxFlex", js.undefined)
      
      inline def setBoxLines(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'boxLines' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BoxLines | undefined */ js.Any
      ): Self = StObject.set(x, "boxLines", value.asInstanceOf[js.Any])
      
      inline def setBoxLinesUndefined: Self = StObject.set(x, "boxLines", js.undefined)
      
      inline def setBoxOrdinalGroup(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'boxOrdinalGroup' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BoxOrdinalGroup | undefined */ js.Any
      ): Self = StObject.set(x, "boxOrdinalGroup", value.asInstanceOf[js.Any])
      
      inline def setBoxOrdinalGroupUndefined: Self = StObject.set(x, "boxOrdinalGroup", js.undefined)
      
      inline def setBoxOrient(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'boxOrient' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BoxOrient | undefined */ js.Any
      ): Self = StObject.set(x, "boxOrient", value.asInstanceOf[js.Any])
      
      inline def setBoxOrientUndefined: Self = StObject.set(x, "boxOrient", js.undefined)
      
      inline def setBoxPack(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'boxPack' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BoxPack | undefined */ js.Any
      ): Self = StObject.set(x, "boxPack", value.asInstanceOf[js.Any])
      
      inline def setBoxPackUndefined: Self = StObject.set(x, "boxPack", js.undefined)
      
      inline def setBoxShadow(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'boxShadow' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BoxShadow | undefined */ js.Any
      ): Self = StObject.set(x, "boxShadow", value.asInstanceOf[js.Any])
      
      inline def setBoxShadowUndefined: Self = StObject.set(x, "boxShadow", js.undefined)
      
      inline def setBoxSizing(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'boxSizing' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BoxSizing | undefined */ js.Any
      ): Self = StObject.set(x, "boxSizing", value.asInstanceOf[js.Any])
      
      inline def setBoxSizingUndefined: Self = StObject.set(x, "boxSizing", js.undefined)
      
      inline def setBreakAfter(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'breakAfter' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BreakAfter | undefined */ js.Any
      ): Self = StObject.set(x, "breakAfter", value.asInstanceOf[js.Any])
      
      inline def setBreakAfterUndefined: Self = StObject.set(x, "breakAfter", js.undefined)
      
      inline def setBreakBefore(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'breakBefore' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BreakBefore | undefined */ js.Any
      ): Self = StObject.set(x, "breakBefore", value.asInstanceOf[js.Any])
      
      inline def setBreakBeforeUndefined: Self = StObject.set(x, "breakBefore", js.undefined)
      
      inline def setBreakInside(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'breakInside' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BreakInside | undefined */ js.Any
      ): Self = StObject.set(x, "breakInside", value.asInstanceOf[js.Any])
      
      inline def setBreakInsideUndefined: Self = StObject.set(x, "breakInside", js.undefined)
      
      inline def setCaptionSide(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'captionSide' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.CaptionSide | undefined */ js.Any
      ): Self = StObject.set(x, "captionSide", value.asInstanceOf[js.Any])
      
      inline def setCaptionSideUndefined: Self = StObject.set(x, "captionSide", js.undefined)
      
      inline def setCaretColor(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'caretColor' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.CaretColor | undefined */ js.Any
      ): Self = StObject.set(x, "caretColor", value.asInstanceOf[js.Any])
      
      inline def setCaretColorUndefined: Self = StObject.set(x, "caretColor", js.undefined)
      
      inline def setClear(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'clear' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.Clear | undefined */ js.Any
      ): Self = StObject.set(x, "clear", value.asInstanceOf[js.Any])
      
      inline def setClearUndefined: Self = StObject.set(x, "clear", js.undefined)
      
      inline def setClip(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'clip' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.Clip | undefined */ js.Any
      ): Self = StObject.set(x, "clip", value.asInstanceOf[js.Any])
      
      inline def setClipPath(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'clipPath' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.ClipPath | undefined */ js.Any
      ): Self = StObject.set(x, "clipPath", value.asInstanceOf[js.Any])
      
      inline def setClipPathUndefined: Self = StObject.set(x, "clipPath", js.undefined)
      
      inline def setClipRule(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'clipRule' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.ClipRule | undefined */ js.Any
      ): Self = StObject.set(x, "clipRule", value.asInstanceOf[js.Any])
      
      inline def setClipRuleUndefined: Self = StObject.set(x, "clipRule", js.undefined)
      
      inline def setClipUndefined: Self = StObject.set(x, "clip", js.undefined)
      
      inline def setColor(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'color' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.Color | undefined */ js.Any
      ): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorAdjust(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'colorAdjust' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.PrintColorAdjust | undefined */ js.Any
      ): Self = StObject.set(x, "colorAdjust", value.asInstanceOf[js.Any])
      
      inline def setColorAdjustUndefined: Self = StObject.set(x, "colorAdjust", js.undefined)
      
      inline def setColorInterpolation(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'colorInterpolation' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.ColorInterpolation | undefined */ js.Any
      ): Self = StObject.set(x, "colorInterpolation", value.asInstanceOf[js.Any])
      
      inline def setColorInterpolationUndefined: Self = StObject.set(x, "colorInterpolation", js.undefined)
      
      inline def setColorRendering(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'colorRendering' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.ColorRendering | undefined */ js.Any
      ): Self = StObject.set(x, "colorRendering", value.asInstanceOf[js.Any])
      
      inline def setColorRenderingUndefined: Self = StObject.set(x, "colorRendering", js.undefined)
      
      inline def setColorScheme(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'colorScheme' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.ColorScheme | undefined */ js.Any
      ): Self = StObject.set(x, "colorScheme", value.asInstanceOf[js.Any])
      
      inline def setColorSchemeUndefined: Self = StObject.set(x, "colorScheme", js.undefined)
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setColumnCount(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'columnCount' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.ColumnCount | undefined */ js.Any
      ): Self = StObject.set(x, "columnCount", value.asInstanceOf[js.Any])
      
      inline def setColumnCountUndefined: Self = StObject.set(x, "columnCount", js.undefined)
      
      inline def setColumnFill(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'columnFill' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.ColumnFill | undefined */ js.Any
      ): Self = StObject.set(x, "columnFill", value.asInstanceOf[js.Any])
      
      inline def setColumnFillUndefined: Self = StObject.set(x, "columnFill", js.undefined)
      
      inline def setColumnGap(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'columnGap' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.ColumnGap<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "columnGap", value.asInstanceOf[js.Any])
      
      inline def setColumnGapUndefined: Self = StObject.set(x, "columnGap", js.undefined)
      
      inline def setColumnRule(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'columnRule' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.ColumnRule<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "columnRule", value.asInstanceOf[js.Any])
      
      inline def setColumnRuleColor(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'columnRuleColor' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.ColumnRuleColor | undefined */ js.Any
      ): Self = StObject.set(x, "columnRuleColor", value.asInstanceOf[js.Any])
      
      inline def setColumnRuleColorUndefined: Self = StObject.set(x, "columnRuleColor", js.undefined)
      
      inline def setColumnRuleStyle(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'columnRuleStyle' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.ColumnRuleStyle | undefined */ js.Any
      ): Self = StObject.set(x, "columnRuleStyle", value.asInstanceOf[js.Any])
      
      inline def setColumnRuleStyleUndefined: Self = StObject.set(x, "columnRuleStyle", js.undefined)
      
      inline def setColumnRuleUndefined: Self = StObject.set(x, "columnRule", js.undefined)
      
      inline def setColumnRuleWidth(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'columnRuleWidth' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.ColumnRuleWidth<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "columnRuleWidth", value.asInstanceOf[js.Any])
      
      inline def setColumnRuleWidthUndefined: Self = StObject.set(x, "columnRuleWidth", js.undefined)
      
      inline def setColumnSpan(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'columnSpan' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.ColumnSpan | undefined */ js.Any
      ): Self = StObject.set(x, "columnSpan", value.asInstanceOf[js.Any])
      
      inline def setColumnSpanUndefined: Self = StObject.set(x, "columnSpan", js.undefined)
      
      inline def setColumnWidth(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'columnWidth' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.ColumnWidth<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "columnWidth", value.asInstanceOf[js.Any])
      
      inline def setColumnWidthUndefined: Self = StObject.set(x, "columnWidth", js.undefined)
      
      inline def setColumns(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'columns' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.Columns<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
      
      inline def setContain(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'contain' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.Contain | undefined */ js.Any
      ): Self = StObject.set(x, "contain", value.asInstanceOf[js.Any])
      
      inline def setContainUndefined: Self = StObject.set(x, "contain", js.undefined)
      
      inline def setContent(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'content' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.Content | undefined */ js.Any
      ): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setContentVisibility(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'contentVisibility' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.ContentVisibility | undefined */ js.Any
      ): Self = StObject.set(x, "contentVisibility", value.asInstanceOf[js.Any])
      
      inline def setContentVisibilityUndefined: Self = StObject.set(x, "contentVisibility", js.undefined)
      
      inline def setCounterIncrement(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'counterIncrement' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.CounterIncrement | undefined */ js.Any
      ): Self = StObject.set(x, "counterIncrement", value.asInstanceOf[js.Any])
      
      inline def setCounterIncrementUndefined: Self = StObject.set(x, "counterIncrement", js.undefined)
      
      inline def setCounterReset(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'counterReset' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.CounterReset | undefined */ js.Any
      ): Self = StObject.set(x, "counterReset", value.asInstanceOf[js.Any])
      
      inline def setCounterResetUndefined: Self = StObject.set(x, "counterReset", js.undefined)
      
      inline def setCounterSet(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'counterSet' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.CounterSet | undefined */ js.Any
      ): Self = StObject.set(x, "counterSet", value.asInstanceOf[js.Any])
      
      inline def setCounterSetUndefined: Self = StObject.set(x, "counterSet", js.undefined)
      
      inline def setCursor(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'cursor' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.Cursor | undefined */ js.Any
      ): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
      
      inline def setCursorUndefined: Self = StObject.set(x, "cursor", js.undefined)
      
      inline def setDirection(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'direction' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.Direction | undefined */ js.Any
      ): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setDisplay(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'display' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.Display | undefined */ js.Any
      ): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
      
      inline def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
      
      inline def setDominantBaseline(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'dominantBaseline' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.DominantBaseline | undefined */ js.Any
      ): Self = StObject.set(x, "dominantBaseline", value.asInstanceOf[js.Any])
      
      inline def setDominantBaselineUndefined: Self = StObject.set(x, "dominantBaseline", js.undefined)
      
      inline def setEmptyCells(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'emptyCells' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.EmptyCells | undefined */ js.Any
      ): Self = StObject.set(x, "emptyCells", value.asInstanceOf[js.Any])
      
      inline def setEmptyCellsUndefined: Self = StObject.set(x, "emptyCells", js.undefined)
      
      inline def setFill(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'fill' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.Fill | undefined */ js.Any
      ): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def setFillOpacity(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'fillOpacity' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.FillOpacity | undefined */ js.Any
      ): Self = StObject.set(x, "fillOpacity", value.asInstanceOf[js.Any])
      
      inline def setFillOpacityUndefined: Self = StObject.set(x, "fillOpacity", js.undefined)
      
      inline def setFillRule(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'fillRule' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.FillRule | undefined */ js.Any
      ): Self = StObject.set(x, "fillRule", value.asInstanceOf[js.Any])
      
      inline def setFillRuleUndefined: Self = StObject.set(x, "fillRule", js.undefined)
      
      inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      inline def setFilter(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'filter' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.Filter | undefined */ js.Any
      ): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setFlex(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'flex' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.Flex<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "flex", value.asInstanceOf[js.Any])
      
      inline def setFlexBasis(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'flexBasis' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.FlexBasis<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "flexBasis", value.asInstanceOf[js.Any])
      
      inline def setFlexBasisUndefined: Self = StObject.set(x, "flexBasis", js.undefined)
      
      inline def setFlexDirection(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'flexDirection' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.FlexDirection | undefined */ js.Any
      ): Self = StObject.set(x, "flexDirection", value.asInstanceOf[js.Any])
      
      inline def setFlexDirectionUndefined: Self = StObject.set(x, "flexDirection", js.undefined)
      
      inline def setFlexFlow(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'flexFlow' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.FlexFlow | undefined */ js.Any
      ): Self = StObject.set(x, "flexFlow", value.asInstanceOf[js.Any])
      
      inline def setFlexFlowUndefined: Self = StObject.set(x, "flexFlow", js.undefined)
      
      inline def setFlexGrow(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'flexGrow' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.FlexGrow | undefined */ js.Any
      ): Self = StObject.set(x, "flexGrow", value.asInstanceOf[js.Any])
      
      inline def setFlexGrowUndefined: Self = StObject.set(x, "flexGrow", js.undefined)
      
      inline def setFlexShrink(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'flexShrink' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.FlexShrink | undefined */ js.Any
      ): Self = StObject.set(x, "flexShrink", value.asInstanceOf[js.Any])
      
      inline def setFlexShrinkUndefined: Self = StObject.set(x, "flexShrink", js.undefined)
      
      inline def setFlexUndefined: Self = StObject.set(x, "flex", js.undefined)
      
      inline def setFlexWrap(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'flexWrap' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.FlexWrap | undefined */ js.Any
      ): Self = StObject.set(x, "flexWrap", value.asInstanceOf[js.Any])
      
      inline def setFlexWrapUndefined: Self = StObject.set(x, "flexWrap", js.undefined)
      
      inline def setFloat(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'float' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.Float | undefined */ js.Any
      ): Self = StObject.set(x, "float", value.asInstanceOf[js.Any])
      
      inline def setFloatUndefined: Self = StObject.set(x, "float", js.undefined)
      
      inline def setFloodColor(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'floodColor' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.FloodColor | undefined */ js.Any
      ): Self = StObject.set(x, "floodColor", value.asInstanceOf[js.Any])
      
      inline def setFloodColorUndefined: Self = StObject.set(x, "floodColor", js.undefined)
      
      inline def setFloodOpacity(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'floodOpacity' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.FloodOpacity | undefined */ js.Any
      ): Self = StObject.set(x, "floodOpacity", value.asInstanceOf[js.Any])
      
      inline def setFloodOpacityUndefined: Self = StObject.set(x, "floodOpacity", js.undefined)
      
      inline def setFont(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'font' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.Font | undefined */ js.Any
      ): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      inline def setFontFamily(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'fontFamily' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.FontFamily | undefined */ js.Any
      ): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      inline def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
      
      inline def setFontFeatureSettings(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'fontFeatureSettings' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.FontFeatureSettings | undefined */ js.Any
      ): Self = StObject.set(x, "fontFeatureSettings", value.asInstanceOf[js.Any])
      
      inline def setFontFeatureSettingsUndefined: Self = StObject.set(x, "fontFeatureSettings", js.undefined)
      
      inline def setFontKerning(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'fontKerning' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.FontKerning | undefined */ js.Any
      ): Self = StObject.set(x, "fontKerning", value.asInstanceOf[js.Any])
      
      inline def setFontKerningUndefined: Self = StObject.set(x, "fontKerning", js.undefined)
      
      inline def setFontLanguageOverride(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'fontLanguageOverride' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.FontLanguageOverride | undefined */ js.Any
      ): Self = StObject.set(x, "fontLanguageOverride", value.asInstanceOf[js.Any])
      
      inline def setFontLanguageOverrideUndefined: Self = StObject.set(x, "fontLanguageOverride", js.undefined)
      
      inline def setFontOpticalSizing(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'fontOpticalSizing' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.FontOpticalSizing | undefined */ js.Any
      ): Self = StObject.set(x, "fontOpticalSizing", value.asInstanceOf[js.Any])
      
      inline def setFontOpticalSizingUndefined: Self = StObject.set(x, "fontOpticalSizing", js.undefined)
      
      inline def setFontSize(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'fontSize' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.FontSize<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      inline def setFontSizeAdjust(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'fontSizeAdjust' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.FontSizeAdjust | undefined */ js.Any
      ): Self = StObject.set(x, "fontSizeAdjust", value.asInstanceOf[js.Any])
      
      inline def setFontSizeAdjustUndefined: Self = StObject.set(x, "fontSizeAdjust", js.undefined)
      
      inline def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
      
      inline def setFontSmooth(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'fontSmooth' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.FontSmooth<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "fontSmooth", value.asInstanceOf[js.Any])
      
      inline def setFontSmoothUndefined: Self = StObject.set(x, "fontSmooth", js.undefined)
      
      inline def setFontStretch(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'fontStretch' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.FontStretch | undefined */ js.Any
      ): Self = StObject.set(x, "fontStretch", value.asInstanceOf[js.Any])
      
      inline def setFontStretchUndefined: Self = StObject.set(x, "fontStretch", js.undefined)
      
      inline def setFontStyle(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'fontStyle' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.FontStyle | undefined */ js.Any
      ): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
      
      inline def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
      
      inline def setFontSynthesis(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'fontSynthesis' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.FontSynthesis | undefined */ js.Any
      ): Self = StObject.set(x, "fontSynthesis", value.asInstanceOf[js.Any])
      
      inline def setFontSynthesisUndefined: Self = StObject.set(x, "fontSynthesis", js.undefined)
      
      inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
      
      inline def setFontVariant(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'fontVariant' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.FontVariant | undefined */ js.Any
      ): Self = StObject.set(x, "fontVariant", value.asInstanceOf[js.Any])
      
      inline def setFontVariantAlternates(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'fontVariantAlternates' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.FontVariantAlternates | undefined */ js.Any
      ): Self = StObject.set(x, "fontVariantAlternates", value.asInstanceOf[js.Any])
      
      inline def setFontVariantAlternatesUndefined: Self = StObject.set(x, "fontVariantAlternates", js.undefined)
      
      inline def setFontVariantCaps(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'fontVariantCaps' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.FontVariantCaps | undefined */ js.Any
      ): Self = StObject.set(x, "fontVariantCaps", value.asInstanceOf[js.Any])
      
      inline def setFontVariantCapsUndefined: Self = StObject.set(x, "fontVariantCaps", js.undefined)
      
      inline def setFontVariantEastAsian(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'fontVariantEastAsian' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.FontVariantEastAsian | undefined */ js.Any
      ): Self = StObject.set(x, "fontVariantEastAsian", value.asInstanceOf[js.Any])
      
      inline def setFontVariantEastAsianUndefined: Self = StObject.set(x, "fontVariantEastAsian", js.undefined)
      
      inline def setFontVariantLigatures(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'fontVariantLigatures' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.FontVariantLigatures | undefined */ js.Any
      ): Self = StObject.set(x, "fontVariantLigatures", value.asInstanceOf[js.Any])
      
      inline def setFontVariantLigaturesUndefined: Self = StObject.set(x, "fontVariantLigatures", js.undefined)
      
      inline def setFontVariantNumeric(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'fontVariantNumeric' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.FontVariantNumeric | undefined */ js.Any
      ): Self = StObject.set(x, "fontVariantNumeric", value.asInstanceOf[js.Any])
      
      inline def setFontVariantNumericUndefined: Self = StObject.set(x, "fontVariantNumeric", js.undefined)
      
      inline def setFontVariantPosition(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'fontVariantPosition' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.FontVariantPosition | undefined */ js.Any
      ): Self = StObject.set(x, "fontVariantPosition", value.asInstanceOf[js.Any])
      
      inline def setFontVariantPositionUndefined: Self = StObject.set(x, "fontVariantPosition", js.undefined)
      
      inline def setFontVariantUndefined: Self = StObject.set(x, "fontVariant", js.undefined)
      
      inline def setFontVariationSettings(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'fontVariationSettings' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.FontVariationSettings | undefined */ js.Any
      ): Self = StObject.set(x, "fontVariationSettings", value.asInstanceOf[js.Any])
      
      inline def setFontVariationSettingsUndefined: Self = StObject.set(x, "fontVariationSettings", js.undefined)
      
      inline def setFontWeight(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'fontWeight' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.FontWeight | undefined */ js.Any
      ): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
      
      inline def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
      
      inline def setForcedColorAdjust(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'forcedColorAdjust' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.ForcedColorAdjust | undefined */ js.Any
      ): Self = StObject.set(x, "forcedColorAdjust", value.asInstanceOf[js.Any])
      
      inline def setForcedColorAdjustUndefined: Self = StObject.set(x, "forcedColorAdjust", js.undefined)
      
      inline def setGap(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'gap' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.Gap<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "gap", value.asInstanceOf[js.Any])
      
      inline def setGapUndefined: Self = StObject.set(x, "gap", js.undefined)
      
      inline def setGlyphOrientationVertical(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'glyphOrientationVertical' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.GlyphOrientationVertical | undefined */ js.Any
      ): Self = StObject.set(x, "glyphOrientationVertical", value.asInstanceOf[js.Any])
      
      inline def setGlyphOrientationVerticalUndefined: Self = StObject.set(x, "glyphOrientationVertical", js.undefined)
      
      inline def setGrid(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'grid' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.Grid | undefined */ js.Any
      ): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
      
      inline def setGridArea(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'gridArea' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.GridArea | undefined */ js.Any
      ): Self = StObject.set(x, "gridArea", value.asInstanceOf[js.Any])
      
      inline def setGridAreaUndefined: Self = StObject.set(x, "gridArea", js.undefined)
      
      inline def setGridAutoColumns(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'gridAutoColumns' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.GridAutoColumns<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "gridAutoColumns", value.asInstanceOf[js.Any])
      
      inline def setGridAutoColumnsUndefined: Self = StObject.set(x, "gridAutoColumns", js.undefined)
      
      inline def setGridAutoFlow(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'gridAutoFlow' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.GridAutoFlow | undefined */ js.Any
      ): Self = StObject.set(x, "gridAutoFlow", value.asInstanceOf[js.Any])
      
      inline def setGridAutoFlowUndefined: Self = StObject.set(x, "gridAutoFlow", js.undefined)
      
      inline def setGridAutoRows(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'gridAutoRows' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.GridAutoRows<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "gridAutoRows", value.asInstanceOf[js.Any])
      
      inline def setGridAutoRowsUndefined: Self = StObject.set(x, "gridAutoRows", js.undefined)
      
      inline def setGridColumn(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'gridColumn' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.GridColumn | undefined */ js.Any
      ): Self = StObject.set(x, "gridColumn", value.asInstanceOf[js.Any])
      
      inline def setGridColumnEnd(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'gridColumnEnd' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.GridColumnEnd | undefined */ js.Any
      ): Self = StObject.set(x, "gridColumnEnd", value.asInstanceOf[js.Any])
      
      inline def setGridColumnEndUndefined: Self = StObject.set(x, "gridColumnEnd", js.undefined)
      
      inline def setGridColumnGap(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'gridColumnGap' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.GridColumnGap<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "gridColumnGap", value.asInstanceOf[js.Any])
      
      inline def setGridColumnGapUndefined: Self = StObject.set(x, "gridColumnGap", js.undefined)
      
      inline def setGridColumnStart(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'gridColumnStart' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.GridColumnStart | undefined */ js.Any
      ): Self = StObject.set(x, "gridColumnStart", value.asInstanceOf[js.Any])
      
      inline def setGridColumnStartUndefined: Self = StObject.set(x, "gridColumnStart", js.undefined)
      
      inline def setGridColumnUndefined: Self = StObject.set(x, "gridColumn", js.undefined)
      
      inline def setGridGap(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'gridGap' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.GridGap<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "gridGap", value.asInstanceOf[js.Any])
      
      inline def setGridGapUndefined: Self = StObject.set(x, "gridGap", js.undefined)
      
      inline def setGridRow(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'gridRow' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.GridRow | undefined */ js.Any
      ): Self = StObject.set(x, "gridRow", value.asInstanceOf[js.Any])
      
      inline def setGridRowEnd(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'gridRowEnd' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.GridRowEnd | undefined */ js.Any
      ): Self = StObject.set(x, "gridRowEnd", value.asInstanceOf[js.Any])
      
      inline def setGridRowEndUndefined: Self = StObject.set(x, "gridRowEnd", js.undefined)
      
      inline def setGridRowGap(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'gridRowGap' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.GridRowGap<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "gridRowGap", value.asInstanceOf[js.Any])
      
      inline def setGridRowGapUndefined: Self = StObject.set(x, "gridRowGap", js.undefined)
      
      inline def setGridRowStart(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'gridRowStart' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.GridRowStart | undefined */ js.Any
      ): Self = StObject.set(x, "gridRowStart", value.asInstanceOf[js.Any])
      
      inline def setGridRowStartUndefined: Self = StObject.set(x, "gridRowStart", js.undefined)
      
      inline def setGridRowUndefined: Self = StObject.set(x, "gridRow", js.undefined)
      
      inline def setGridTemplate(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'gridTemplate' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.GridTemplate | undefined */ js.Any
      ): Self = StObject.set(x, "gridTemplate", value.asInstanceOf[js.Any])
      
      inline def setGridTemplateAreas(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'gridTemplateAreas' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.GridTemplateAreas | undefined */ js.Any
      ): Self = StObject.set(x, "gridTemplateAreas", value.asInstanceOf[js.Any])
      
      inline def setGridTemplateAreasUndefined: Self = StObject.set(x, "gridTemplateAreas", js.undefined)
      
      inline def setGridTemplateColumns(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'gridTemplateColumns' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.GridTemplateColumns<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "gridTemplateColumns", value.asInstanceOf[js.Any])
      
      inline def setGridTemplateColumnsUndefined: Self = StObject.set(x, "gridTemplateColumns", js.undefined)
      
      inline def setGridTemplateRows(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'gridTemplateRows' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.GridTemplateRows<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "gridTemplateRows", value.asInstanceOf[js.Any])
      
      inline def setGridTemplateRowsUndefined: Self = StObject.set(x, "gridTemplateRows", js.undefined)
      
      inline def setGridTemplateUndefined: Self = StObject.set(x, "gridTemplate", js.undefined)
      
      inline def setGridUndefined: Self = StObject.set(x, "grid", js.undefined)
      
      inline def setHack(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'hack' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : any | undefined */ js.Any
      ): Self = StObject.set(x, "hack", value.asInstanceOf[js.Any])
      
      inline def setHackUndefined: Self = StObject.set(x, "hack", js.undefined)
      
      inline def setHangingPunctuation(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'hangingPunctuation' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.HangingPunctuation | undefined */ js.Any
      ): Self = StObject.set(x, "hangingPunctuation", value.asInstanceOf[js.Any])
      
      inline def setHangingPunctuationUndefined: Self = StObject.set(x, "hangingPunctuation", js.undefined)
      
      inline def setHeight(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'height' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.Height<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setHyphenateCharacter(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'hyphenateCharacter' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.HyphenateCharacter | undefined */ js.Any
      ): Self = StObject.set(x, "hyphenateCharacter", value.asInstanceOf[js.Any])
      
      inline def setHyphenateCharacterUndefined: Self = StObject.set(x, "hyphenateCharacter", js.undefined)
      
      inline def setHyphens(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'hyphens' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.Hyphens | undefined */ js.Any
      ): Self = StObject.set(x, "hyphens", value.asInstanceOf[js.Any])
      
      inline def setHyphensUndefined: Self = StObject.set(x, "hyphens", js.undefined)
      
      inline def setImageOrientation(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'imageOrientation' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.ImageOrientation | undefined */ js.Any
      ): Self = StObject.set(x, "imageOrientation", value.asInstanceOf[js.Any])
      
      inline def setImageOrientationUndefined: Self = StObject.set(x, "imageOrientation", js.undefined)
      
      inline def setImageRendering(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'imageRendering' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.ImageRendering | undefined */ js.Any
      ): Self = StObject.set(x, "imageRendering", value.asInstanceOf[js.Any])
      
      inline def setImageRenderingUndefined: Self = StObject.set(x, "imageRendering", js.undefined)
      
      inline def setImageResolution(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'imageResolution' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.ImageResolution | undefined */ js.Any
      ): Self = StObject.set(x, "imageResolution", value.asInstanceOf[js.Any])
      
      inline def setImageResolutionUndefined: Self = StObject.set(x, "imageResolution", js.undefined)
      
      inline def setImeMode(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'imeMode' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.ImeMode | undefined */ js.Any
      ): Self = StObject.set(x, "imeMode", value.asInstanceOf[js.Any])
      
      inline def setImeModeUndefined: Self = StObject.set(x, "imeMode", js.undefined)
      
      inline def setInitialLetter(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'initialLetter' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.InitialLetter | undefined */ js.Any
      ): Self = StObject.set(x, "initialLetter", value.asInstanceOf[js.Any])
      
      inline def setInitialLetterUndefined: Self = StObject.set(x, "initialLetter", js.undefined)
      
      inline def setInlineSize(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'inlineSize' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.InlineSize<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "inlineSize", value.asInstanceOf[js.Any])
      
      inline def setInlineSizeUndefined: Self = StObject.set(x, "inlineSize", js.undefined)
      
      inline def setInputSecurity(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'inputSecurity' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.InputSecurity | undefined */ js.Any
      ): Self = StObject.set(x, "inputSecurity", value.asInstanceOf[js.Any])
      
      inline def setInputSecurityUndefined: Self = StObject.set(x, "inputSecurity", js.undefined)
      
      inline def setInset(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'inset' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.Inset<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "inset", value.asInstanceOf[js.Any])
      
      inline def setInsetBlock(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'insetBlock' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.InsetBlock<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "insetBlock", value.asInstanceOf[js.Any])
      
      inline def setInsetBlockEnd(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'insetBlockEnd' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.InsetBlockEnd<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "insetBlockEnd", value.asInstanceOf[js.Any])
      
      inline def setInsetBlockEndUndefined: Self = StObject.set(x, "insetBlockEnd", js.undefined)
      
      inline def setInsetBlockStart(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'insetBlockStart' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.InsetBlockStart<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "insetBlockStart", value.asInstanceOf[js.Any])
      
      inline def setInsetBlockStartUndefined: Self = StObject.set(x, "insetBlockStart", js.undefined)
      
      inline def setInsetBlockUndefined: Self = StObject.set(x, "insetBlock", js.undefined)
      
      inline def setInsetInline(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'insetInline' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.InsetInline<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "insetInline", value.asInstanceOf[js.Any])
      
      inline def setInsetInlineEnd(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'insetInlineEnd' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.InsetInlineEnd<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "insetInlineEnd", value.asInstanceOf[js.Any])
      
      inline def setInsetInlineEndUndefined: Self = StObject.set(x, "insetInlineEnd", js.undefined)
      
      inline def setInsetInlineStart(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'insetInlineStart' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.InsetInlineStart<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "insetInlineStart", value.asInstanceOf[js.Any])
      
      inline def setInsetInlineStartUndefined: Self = StObject.set(x, "insetInlineStart", js.undefined)
      
      inline def setInsetInlineUndefined: Self = StObject.set(x, "insetInline", js.undefined)
      
      inline def setInsetUndefined: Self = StObject.set(x, "inset", js.undefined)
      
      inline def setIsolation(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'isolation' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.Isolation | undefined */ js.Any
      ): Self = StObject.set(x, "isolation", value.asInstanceOf[js.Any])
      
      inline def setIsolationUndefined: Self = StObject.set(x, "isolation", js.undefined)
      
      inline def setJustifyContent(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'justifyContent' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.JustifyContent | undefined */ js.Any
      ): Self = StObject.set(x, "justifyContent", value.asInstanceOf[js.Any])
      
      inline def setJustifyContentUndefined: Self = StObject.set(x, "justifyContent", js.undefined)
      
      inline def setJustifyItems(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'justifyItems' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.JustifyItems | undefined */ js.Any
      ): Self = StObject.set(x, "justifyItems", value.asInstanceOf[js.Any])
      
      inline def setJustifyItemsUndefined: Self = StObject.set(x, "justifyItems", js.undefined)
      
      inline def setJustifySelf(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'justifySelf' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.JustifySelf | undefined */ js.Any
      ): Self = StObject.set(x, "justifySelf", value.asInstanceOf[js.Any])
      
      inline def setJustifySelfUndefined: Self = StObject.set(x, "justifySelf", js.undefined)
      
      inline def setJustifyTracks(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'justifyTracks' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.JustifyTracks | undefined */ js.Any
      ): Self = StObject.set(x, "justifyTracks", value.asInstanceOf[js.Any])
      
      inline def setJustifyTracksUndefined: Self = StObject.set(x, "justifyTracks", js.undefined)
      
      inline def setKhtmlBoxAlign(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'KhtmlBoxAlign' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BoxAlign | undefined */ js.Any
      ): Self = StObject.set(x, "KhtmlBoxAlign", value.asInstanceOf[js.Any])
      
      inline def setKhtmlBoxAlignUndefined: Self = StObject.set(x, "KhtmlBoxAlign", js.undefined)
      
      inline def setKhtmlBoxDirection(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'KhtmlBoxDirection' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BoxDirection | undefined */ js.Any
      ): Self = StObject.set(x, "KhtmlBoxDirection", value.asInstanceOf[js.Any])
      
      inline def setKhtmlBoxDirectionUndefined: Self = StObject.set(x, "KhtmlBoxDirection", js.undefined)
      
      inline def setKhtmlBoxFlex(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'KhtmlBoxFlex' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BoxFlex | undefined */ js.Any
      ): Self = StObject.set(x, "KhtmlBoxFlex", value.asInstanceOf[js.Any])
      
      inline def setKhtmlBoxFlexGroup(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'KhtmlBoxFlexGroup' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BoxFlexGroup | undefined */ js.Any
      ): Self = StObject.set(x, "KhtmlBoxFlexGroup", value.asInstanceOf[js.Any])
      
      inline def setKhtmlBoxFlexGroupUndefined: Self = StObject.set(x, "KhtmlBoxFlexGroup", js.undefined)
      
      inline def setKhtmlBoxFlexUndefined: Self = StObject.set(x, "KhtmlBoxFlex", js.undefined)
      
      inline def setKhtmlBoxLines(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'KhtmlBoxLines' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BoxLines | undefined */ js.Any
      ): Self = StObject.set(x, "KhtmlBoxLines", value.asInstanceOf[js.Any])
      
      inline def setKhtmlBoxLinesUndefined: Self = StObject.set(x, "KhtmlBoxLines", js.undefined)
      
      inline def setKhtmlBoxOrdinalGroup(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'KhtmlBoxOrdinalGroup' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BoxOrdinalGroup | undefined */ js.Any
      ): Self = StObject.set(x, "KhtmlBoxOrdinalGroup", value.asInstanceOf[js.Any])
      
      inline def setKhtmlBoxOrdinalGroupUndefined: Self = StObject.set(x, "KhtmlBoxOrdinalGroup", js.undefined)
      
      inline def setKhtmlBoxOrient(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'KhtmlBoxOrient' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BoxOrient | undefined */ js.Any
      ): Self = StObject.set(x, "KhtmlBoxOrient", value.asInstanceOf[js.Any])
      
      inline def setKhtmlBoxOrientUndefined: Self = StObject.set(x, "KhtmlBoxOrient", js.undefined)
      
      inline def setKhtmlBoxPack(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'KhtmlBoxPack' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BoxPack | undefined */ js.Any
      ): Self = StObject.set(x, "KhtmlBoxPack", value.asInstanceOf[js.Any])
      
      inline def setKhtmlBoxPackUndefined: Self = StObject.set(x, "KhtmlBoxPack", js.undefined)
      
      inline def setKhtmlLineBreak(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'KhtmlLineBreak' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.LineBreak | undefined */ js.Any
      ): Self = StObject.set(x, "KhtmlLineBreak", value.asInstanceOf[js.Any])
      
      inline def setKhtmlLineBreakUndefined: Self = StObject.set(x, "KhtmlLineBreak", js.undefined)
      
      inline def setKhtmlOpacity(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'KhtmlOpacity' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.Opacity | undefined */ js.Any
      ): Self = StObject.set(x, "KhtmlOpacity", value.asInstanceOf[js.Any])
      
      inline def setKhtmlOpacityUndefined: Self = StObject.set(x, "KhtmlOpacity", js.undefined)
      
      inline def setKhtmlUserSelect(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'KhtmlUserSelect' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.UserSelect | undefined */ js.Any
      ): Self = StObject.set(x, "KhtmlUserSelect", value.asInstanceOf[js.Any])
      
      inline def setKhtmlUserSelectUndefined: Self = StObject.set(x, "KhtmlUserSelect", js.undefined)
      
      inline def setLeft(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'left' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.Left<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      inline def setLetterSpacing(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'letterSpacing' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.LetterSpacing<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "letterSpacing", value.asInstanceOf[js.Any])
      
      inline def setLetterSpacingUndefined: Self = StObject.set(x, "letterSpacing", js.undefined)
      
      inline def setLightingColor(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'lightingColor' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.LightingColor | undefined */ js.Any
      ): Self = StObject.set(x, "lightingColor", value.asInstanceOf[js.Any])
      
      inline def setLightingColorUndefined: Self = StObject.set(x, "lightingColor", js.undefined)
      
      inline def setLineBreak(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'lineBreak' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.LineBreak | undefined */ js.Any
      ): Self = StObject.set(x, "lineBreak", value.asInstanceOf[js.Any])
      
      inline def setLineBreakUndefined: Self = StObject.set(x, "lineBreak", js.undefined)
      
      inline def setLineClamp(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'lineClamp' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.LineClamp | undefined */ js.Any
      ): Self = StObject.set(x, "lineClamp", value.asInstanceOf[js.Any])
      
      inline def setLineClampUndefined: Self = StObject.set(x, "lineClamp", js.undefined)
      
      inline def setLineHeight(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'lineHeight' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.LineHeight<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
      
      inline def setLineHeightStep(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'lineHeightStep' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.LineHeightStep<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "lineHeightStep", value.asInstanceOf[js.Any])
      
      inline def setLineHeightStepUndefined: Self = StObject.set(x, "lineHeightStep", js.undefined)
      
      inline def setLineHeightUndefined: Self = StObject.set(x, "lineHeight", js.undefined)
      
      inline def setListStyle(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'listStyle' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.ListStyle | undefined */ js.Any
      ): Self = StObject.set(x, "listStyle", value.asInstanceOf[js.Any])
      
      inline def setListStyleImage(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'listStyleImage' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.ListStyleImage | undefined */ js.Any
      ): Self = StObject.set(x, "listStyleImage", value.asInstanceOf[js.Any])
      
      inline def setListStyleImageUndefined: Self = StObject.set(x, "listStyleImage", js.undefined)
      
      inline def setListStylePosition(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'listStylePosition' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.ListStylePosition | undefined */ js.Any
      ): Self = StObject.set(x, "listStylePosition", value.asInstanceOf[js.Any])
      
      inline def setListStylePositionUndefined: Self = StObject.set(x, "listStylePosition", js.undefined)
      
      inline def setListStyleType(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'listStyleType' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.ListStyleType | undefined */ js.Any
      ): Self = StObject.set(x, "listStyleType", value.asInstanceOf[js.Any])
      
      inline def setListStyleTypeUndefined: Self = StObject.set(x, "listStyleType", js.undefined)
      
      inline def setListStyleUndefined: Self = StObject.set(x, "listStyle", js.undefined)
      
      inline def setMargin(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'margin' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.Margin<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      inline def setMarginBlock(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'marginBlock' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MarginBlock<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "marginBlock", value.asInstanceOf[js.Any])
      
      inline def setMarginBlockEnd(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'marginBlockEnd' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MarginBlockEnd<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "marginBlockEnd", value.asInstanceOf[js.Any])
      
      inline def setMarginBlockEndUndefined: Self = StObject.set(x, "marginBlockEnd", js.undefined)
      
      inline def setMarginBlockStart(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'marginBlockStart' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MarginBlockStart<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "marginBlockStart", value.asInstanceOf[js.Any])
      
      inline def setMarginBlockStartUndefined: Self = StObject.set(x, "marginBlockStart", js.undefined)
      
      inline def setMarginBlockUndefined: Self = StObject.set(x, "marginBlock", js.undefined)
      
      inline def setMarginBottom(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'marginBottom' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MarginBottom<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "marginBottom", value.asInstanceOf[js.Any])
      
      inline def setMarginBottomUndefined: Self = StObject.set(x, "marginBottom", js.undefined)
      
      inline def setMarginInline(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'marginInline' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MarginInline<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "marginInline", value.asInstanceOf[js.Any])
      
      inline def setMarginInlineEnd(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'marginInlineEnd' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MarginInlineEnd<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "marginInlineEnd", value.asInstanceOf[js.Any])
      
      inline def setMarginInlineEndUndefined: Self = StObject.set(x, "marginInlineEnd", js.undefined)
      
      inline def setMarginInlineStart(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'marginInlineStart' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MarginInlineStart<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "marginInlineStart", value.asInstanceOf[js.Any])
      
      inline def setMarginInlineStartUndefined: Self = StObject.set(x, "marginInlineStart", js.undefined)
      
      inline def setMarginInlineUndefined: Self = StObject.set(x, "marginInline", js.undefined)
      
      inline def setMarginLeft(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'marginLeft' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MarginLeft<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "marginLeft", value.asInstanceOf[js.Any])
      
      inline def setMarginLeftUndefined: Self = StObject.set(x, "marginLeft", js.undefined)
      
      inline def setMarginRight(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'marginRight' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MarginRight<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "marginRight", value.asInstanceOf[js.Any])
      
      inline def setMarginRightUndefined: Self = StObject.set(x, "marginRight", js.undefined)
      
      inline def setMarginTop(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'marginTop' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MarginTop<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "marginTop", value.asInstanceOf[js.Any])
      
      inline def setMarginTopUndefined: Self = StObject.set(x, "marginTop", js.undefined)
      
      inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      inline def setMarker(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'marker' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.Marker | undefined */ js.Any
      ): Self = StObject.set(x, "marker", value.asInstanceOf[js.Any])
      
      inline def setMarkerEnd(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'markerEnd' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MarkerEnd | undefined */ js.Any
      ): Self = StObject.set(x, "markerEnd", value.asInstanceOf[js.Any])
      
      inline def setMarkerEndUndefined: Self = StObject.set(x, "markerEnd", js.undefined)
      
      inline def setMarkerMid(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'markerMid' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MarkerMid | undefined */ js.Any
      ): Self = StObject.set(x, "markerMid", value.asInstanceOf[js.Any])
      
      inline def setMarkerMidUndefined: Self = StObject.set(x, "markerMid", js.undefined)
      
      inline def setMarkerStart(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'markerStart' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MarkerStart | undefined */ js.Any
      ): Self = StObject.set(x, "markerStart", value.asInstanceOf[js.Any])
      
      inline def setMarkerStartUndefined: Self = StObject.set(x, "markerStart", js.undefined)
      
      inline def setMarkerUndefined: Self = StObject.set(x, "marker", js.undefined)
      
      inline def setMask(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'mask' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.Mask<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
      
      inline def setMaskBorder(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'maskBorder' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MaskBorder | undefined */ js.Any
      ): Self = StObject.set(x, "maskBorder", value.asInstanceOf[js.Any])
      
      inline def setMaskBorderMode(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'maskBorderMode' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MaskBorderMode | undefined */ js.Any
      ): Self = StObject.set(x, "maskBorderMode", value.asInstanceOf[js.Any])
      
      inline def setMaskBorderModeUndefined: Self = StObject.set(x, "maskBorderMode", js.undefined)
      
      inline def setMaskBorderOutset(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'maskBorderOutset' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MaskBorderOutset<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "maskBorderOutset", value.asInstanceOf[js.Any])
      
      inline def setMaskBorderOutsetUndefined: Self = StObject.set(x, "maskBorderOutset", js.undefined)
      
      inline def setMaskBorderRepeat(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'maskBorderRepeat' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MaskBorderRepeat | undefined */ js.Any
      ): Self = StObject.set(x, "maskBorderRepeat", value.asInstanceOf[js.Any])
      
      inline def setMaskBorderRepeatUndefined: Self = StObject.set(x, "maskBorderRepeat", js.undefined)
      
      inline def setMaskBorderSlice(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'maskBorderSlice' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MaskBorderSlice | undefined */ js.Any
      ): Self = StObject.set(x, "maskBorderSlice", value.asInstanceOf[js.Any])
      
      inline def setMaskBorderSliceUndefined: Self = StObject.set(x, "maskBorderSlice", js.undefined)
      
      inline def setMaskBorderSource(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'maskBorderSource' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MaskBorderSource | undefined */ js.Any
      ): Self = StObject.set(x, "maskBorderSource", value.asInstanceOf[js.Any])
      
      inline def setMaskBorderSourceUndefined: Self = StObject.set(x, "maskBorderSource", js.undefined)
      
      inline def setMaskBorderUndefined: Self = StObject.set(x, "maskBorder", js.undefined)
      
      inline def setMaskBorderWidth(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'maskBorderWidth' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MaskBorderWidth<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "maskBorderWidth", value.asInstanceOf[js.Any])
      
      inline def setMaskBorderWidthUndefined: Self = StObject.set(x, "maskBorderWidth", js.undefined)
      
      inline def setMaskClip(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'maskClip' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MaskClip | undefined */ js.Any
      ): Self = StObject.set(x, "maskClip", value.asInstanceOf[js.Any])
      
      inline def setMaskClipUndefined: Self = StObject.set(x, "maskClip", js.undefined)
      
      inline def setMaskComposite(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'maskComposite' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MaskComposite | undefined */ js.Any
      ): Self = StObject.set(x, "maskComposite", value.asInstanceOf[js.Any])
      
      inline def setMaskCompositeUndefined: Self = StObject.set(x, "maskComposite", js.undefined)
      
      inline def setMaskImage(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'maskImage' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MaskImage | undefined */ js.Any
      ): Self = StObject.set(x, "maskImage", value.asInstanceOf[js.Any])
      
      inline def setMaskImageUndefined: Self = StObject.set(x, "maskImage", js.undefined)
      
      inline def setMaskMode(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'maskMode' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MaskMode | undefined */ js.Any
      ): Self = StObject.set(x, "maskMode", value.asInstanceOf[js.Any])
      
      inline def setMaskModeUndefined: Self = StObject.set(x, "maskMode", js.undefined)
      
      inline def setMaskOrigin(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'maskOrigin' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MaskOrigin | undefined */ js.Any
      ): Self = StObject.set(x, "maskOrigin", value.asInstanceOf[js.Any])
      
      inline def setMaskOriginUndefined: Self = StObject.set(x, "maskOrigin", js.undefined)
      
      inline def setMaskPosition(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'maskPosition' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MaskPosition<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "maskPosition", value.asInstanceOf[js.Any])
      
      inline def setMaskPositionUndefined: Self = StObject.set(x, "maskPosition", js.undefined)
      
      inline def setMaskRepeat(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'maskRepeat' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MaskRepeat | undefined */ js.Any
      ): Self = StObject.set(x, "maskRepeat", value.asInstanceOf[js.Any])
      
      inline def setMaskRepeatUndefined: Self = StObject.set(x, "maskRepeat", js.undefined)
      
      inline def setMaskSize(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'maskSize' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MaskSize<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "maskSize", value.asInstanceOf[js.Any])
      
      inline def setMaskSizeUndefined: Self = StObject.set(x, "maskSize", js.undefined)
      
      inline def setMaskType(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'maskType' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MaskType | undefined */ js.Any
      ): Self = StObject.set(x, "maskType", value.asInstanceOf[js.Any])
      
      inline def setMaskTypeUndefined: Self = StObject.set(x, "maskType", js.undefined)
      
      inline def setMaskUndefined: Self = StObject.set(x, "mask", js.undefined)
      
      inline def setMathDepth(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'mathDepth' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MathDepth | undefined */ js.Any
      ): Self = StObject.set(x, "mathDepth", value.asInstanceOf[js.Any])
      
      inline def setMathDepthUndefined: Self = StObject.set(x, "mathDepth", js.undefined)
      
      inline def setMathShift(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'mathShift' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MathShift | undefined */ js.Any
      ): Self = StObject.set(x, "mathShift", value.asInstanceOf[js.Any])
      
      inline def setMathShiftUndefined: Self = StObject.set(x, "mathShift", js.undefined)
      
      inline def setMathStyle(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'mathStyle' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MathStyle | undefined */ js.Any
      ): Self = StObject.set(x, "mathStyle", value.asInstanceOf[js.Any])
      
      inline def setMathStyleUndefined: Self = StObject.set(x, "mathStyle", js.undefined)
      
      inline def setMatrix(value: js.Tuple6[Double, Double, Double, Double, Double, Double]): Self = StObject.set(x, "matrix", value.asInstanceOf[js.Any])
      
      inline def setMatrix3d(
        value: js.Tuple16[
              Double, 
              Double, 
              Double, 
              Double, 
              Double, 
              Double, 
              Double, 
              Double, 
              Double, 
              Double, 
              Double, 
              Double, 
              Double, 
              Double, 
              Double, 
              Double
            ]
      ): Self = StObject.set(x, "matrix3d", value.asInstanceOf[js.Any])
      
      inline def setMatrix3dUndefined: Self = StObject.set(x, "matrix3d", js.undefined)
      
      inline def setMatrixUndefined: Self = StObject.set(x, "matrix", js.undefined)
      
      inline def setMaxBlockSize(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'maxBlockSize' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MaxBlockSize<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "maxBlockSize", value.asInstanceOf[js.Any])
      
      inline def setMaxBlockSizeUndefined: Self = StObject.set(x, "maxBlockSize", js.undefined)
      
      inline def setMaxHeight(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'maxHeight' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MaxHeight<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
      
      inline def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
      
      inline def setMaxInlineSize(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'maxInlineSize' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MaxInlineSize<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "maxInlineSize", value.asInstanceOf[js.Any])
      
      inline def setMaxInlineSizeUndefined: Self = StObject.set(x, "maxInlineSize", js.undefined)
      
      inline def setMaxLines(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'maxLines' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MaxLines | undefined */ js.Any
      ): Self = StObject.set(x, "maxLines", value.asInstanceOf[js.Any])
      
      inline def setMaxLinesUndefined: Self = StObject.set(x, "maxLines", js.undefined)
      
      inline def setMaxWidth(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'maxWidth' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MaxWidth<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
      
      inline def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
      
      inline def setMinBlockSize(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'minBlockSize' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MinBlockSize<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "minBlockSize", value.asInstanceOf[js.Any])
      
      inline def setMinBlockSizeUndefined: Self = StObject.set(x, "minBlockSize", js.undefined)
      
      inline def setMinHeight(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'minHeight' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MinHeight<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
      
      inline def setMinHeightUndefined: Self = StObject.set(x, "minHeight", js.undefined)
      
      inline def setMinInlineSize(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'minInlineSize' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MinInlineSize<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "minInlineSize", value.asInstanceOf[js.Any])
      
      inline def setMinInlineSizeUndefined: Self = StObject.set(x, "minInlineSize", js.undefined)
      
      inline def setMinWidth(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'minWidth' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MinWidth<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
      
      inline def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
      
      inline def setMixBlendMode(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'mixBlendMode' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MixBlendMode | undefined */ js.Any
      ): Self = StObject.set(x, "mixBlendMode", value.asInstanceOf[js.Any])
      
      inline def setMixBlendModeUndefined: Self = StObject.set(x, "mixBlendMode", js.undefined)
      
      inline def setMotion(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'motion' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.Offset<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "motion", value.asInstanceOf[js.Any])
      
      inline def setMotionDistance(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'motionDistance' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.OffsetDistance<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "motionDistance", value.asInstanceOf[js.Any])
      
      inline def setMotionDistanceUndefined: Self = StObject.set(x, "motionDistance", js.undefined)
      
      inline def setMotionPath(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'motionPath' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.OffsetPath | undefined */ js.Any
      ): Self = StObject.set(x, "motionPath", value.asInstanceOf[js.Any])
      
      inline def setMotionPathUndefined: Self = StObject.set(x, "motionPath", js.undefined)
      
      inline def setMotionRotation(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'motionRotation' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.OffsetRotate | undefined */ js.Any
      ): Self = StObject.set(x, "motionRotation", value.asInstanceOf[js.Any])
      
      inline def setMotionRotationUndefined: Self = StObject.set(x, "motionRotation", js.undefined)
      
      inline def setMotionUndefined: Self = StObject.set(x, "motion", js.undefined)
      
      inline def setMozAnimation(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'MozAnimation' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.Animation<string & {}> | undefined */ js.Any
      ): Self = StObject.set(x, "MozAnimation", value.asInstanceOf[js.Any])
      
      inline def setMozAnimationDelay(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'MozAnimationDelay' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.AnimationDelay<string & {}> | undefined */ js.Any
      ): Self = StObject.set(x, "MozAnimationDelay", value.asInstanceOf[js.Any])
      
      inline def setMozAnimationDelayUndefined: Self = StObject.set(x, "MozAnimationDelay", js.undefined)
      
      inline def setMozAnimationDirection(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'MozAnimationDirection' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.AnimationDirection | undefined */ js.Any
      ): Self = StObject.set(x, "MozAnimationDirection", value.asInstanceOf[js.Any])
      
      inline def setMozAnimationDirectionUndefined: Self = StObject.set(x, "MozAnimationDirection", js.undefined)
      
      inline def setMozAnimationDuration(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'MozAnimationDuration' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.AnimationDuration<string & {}> | undefined */ js.Any
      ): Self = StObject.set(x, "MozAnimationDuration", value.asInstanceOf[js.Any])
      
      inline def setMozAnimationDurationUndefined: Self = StObject.set(x, "MozAnimationDuration", js.undefined)
      
      inline def setMozAnimationFillMode(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'MozAnimationFillMode' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.AnimationFillMode | undefined */ js.Any
      ): Self = StObject.set(x, "MozAnimationFillMode", value.asInstanceOf[js.Any])
      
      inline def setMozAnimationFillModeUndefined: Self = StObject.set(x, "MozAnimationFillMode", js.undefined)
      
      inline def setMozAnimationIterationCount(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'MozAnimationIterationCount' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.AnimationIterationCount | undefined */ js.Any
      ): Self = StObject.set(x, "MozAnimationIterationCount", value.asInstanceOf[js.Any])
      
      inline def setMozAnimationIterationCountUndefined: Self = StObject.set(x, "MozAnimationIterationCount", js.undefined)
      
      inline def setMozAnimationName(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'MozAnimationName' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.AnimationName | undefined */ js.Any
      ): Self = StObject.set(x, "MozAnimationName", value.asInstanceOf[js.Any])
      
      inline def setMozAnimationNameUndefined: Self = StObject.set(x, "MozAnimationName", js.undefined)
      
      inline def setMozAnimationPlayState(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'MozAnimationPlayState' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.AnimationPlayState | undefined */ js.Any
      ): Self = StObject.set(x, "MozAnimationPlayState", value.asInstanceOf[js.Any])
      
      inline def setMozAnimationPlayStateUndefined: Self = StObject.set(x, "MozAnimationPlayState", js.undefined)
      
      inline def setMozAnimationTimingFunction(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'MozAnimationTimingFunction' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.AnimationTimingFunction | undefined */ js.Any
      ): Self = StObject.set(x, "MozAnimationTimingFunction", value.asInstanceOf[js.Any])
      
      inline def setMozAnimationTimingFunctionUndefined: Self = StObject.set(x, "MozAnimationTimingFunction", js.undefined)
      
      inline def setMozAnimationUndefined: Self = StObject.set(x, "MozAnimation", js.undefined)
      
      inline def setMozAppearance(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'MozAppearance' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MozAppearance | undefined */ js.Any
      ): Self = StObject.set(x, "MozAppearance", value.asInstanceOf[js.Any])
      
      inline def setMozAppearanceUndefined: Self = StObject.set(x, "MozAppearance", js.undefined)
      
      inline def setMozBackfaceVisibility(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'MozBackfaceVisibility' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BackfaceVisibility | undefined */ js.Any
      ): Self = StObject.set(x, "MozBackfaceVisibility", value.asInstanceOf[js.Any])
      
      inline def setMozBackfaceVisibilityUndefined: Self = StObject.set(x, "MozBackfaceVisibility", js.undefined)
      
      inline def setMozBackgroundClip(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'MozBackgroundClip' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BackgroundClip | undefined */ js.Any
      ): Self = StObject.set(x, "MozBackgroundClip", value.asInstanceOf[js.Any])
      
      inline def setMozBackgroundClipUndefined: Self = StObject.set(x, "MozBackgroundClip", js.undefined)
      
      inline def setMozBackgroundInlinePolicy(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'MozBackgroundInlinePolicy' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BoxDecorationBreak | undefined */ js.Any
      ): Self = StObject.set(x, "MozBackgroundInlinePolicy", value.asInstanceOf[js.Any])
      
      inline def setMozBackgroundInlinePolicyUndefined: Self = StObject.set(x, "MozBackgroundInlinePolicy", js.undefined)
      
      inline def setMozBackgroundOrigin(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'MozBackgroundOrigin' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BackgroundOrigin | undefined */ js.Any
      ): Self = StObject.set(x, "MozBackgroundOrigin", value.asInstanceOf[js.Any])
      
      inline def setMozBackgroundOriginUndefined: Self = StObject.set(x, "MozBackgroundOrigin", js.undefined)
      
      inline def setMozBackgroundSize(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'MozBackgroundSize' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BackgroundSize<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "MozBackgroundSize", value.asInstanceOf[js.Any])
      
      inline def setMozBackgroundSizeUndefined: Self = StObject.set(x, "MozBackgroundSize", js.undefined)
      
      inline def setMozBinding(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'MozBinding' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MozBinding | undefined */ js.Any
      ): Self = StObject.set(x, "MozBinding", value.asInstanceOf[js.Any])
      
      inline def setMozBindingUndefined: Self = StObject.set(x, "MozBinding", js.undefined)
      
      inline def setMozBorderBottomColors(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'MozBorderBottomColors' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MozBorderBottomColors | undefined */ js.Any
      ): Self = StObject.set(x, "MozBorderBottomColors", value.asInstanceOf[js.Any])
      
      inline def setMozBorderBottomColorsUndefined: Self = StObject.set(x, "MozBorderBottomColors", js.undefined)
      
      inline def setMozBorderEndColor(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'MozBorderEndColor' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BorderInlineEndColor | undefined */ js.Any
      ): Self = StObject.set(x, "MozBorderEndColor", value.asInstanceOf[js.Any])
      
      inline def setMozBorderEndColorUndefined: Self = StObject.set(x, "MozBorderEndColor", js.undefined)
      
      inline def setMozBorderEndStyle(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'MozBorderEndStyle' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BorderInlineEndStyle | undefined */ js.Any
      ): Self = StObject.set(x, "MozBorderEndStyle", value.asInstanceOf[js.Any])
      
      inline def setMozBorderEndStyleUndefined: Self = StObject.set(x, "MozBorderEndStyle", js.undefined)
      
      inline def setMozBorderEndWidth(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'MozBorderEndWidth' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BorderInlineEndWidth<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "MozBorderEndWidth", value.asInstanceOf[js.Any])
      
      inline def setMozBorderEndWidthUndefined: Self = StObject.set(x, "MozBorderEndWidth", js.undefined)
      
      inline def setMozBorderImage(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'MozBorderImage' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BorderImage | undefined */ js.Any
      ): Self = StObject.set(x, "MozBorderImage", value.asInstanceOf[js.Any])
      
      inline def setMozBorderImageUndefined: Self = StObject.set(x, "MozBorderImage", js.undefined)
      
      inline def setMozBorderLeftColors(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'MozBorderLeftColors' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MozBorderLeftColors | undefined */ js.Any
      ): Self = StObject.set(x, "MozBorderLeftColors", value.asInstanceOf[js.Any])
      
      inline def setMozBorderLeftColorsUndefined: Self = StObject.set(x, "MozBorderLeftColors", js.undefined)
      
      inline def setMozBorderRadius(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'MozBorderRadius' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BorderRadius<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "MozBorderRadius", value.asInstanceOf[js.Any])
      
      inline def setMozBorderRadiusBottomleft(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'MozBorderRadiusBottomleft' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BorderBottomLeftRadius<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "MozBorderRadiusBottomleft", value.asInstanceOf[js.Any])
      
      inline def setMozBorderRadiusBottomleftUndefined: Self = StObject.set(x, "MozBorderRadiusBottomleft", js.undefined)
      
      inline def setMozBorderRadiusBottomright(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'MozBorderRadiusBottomright' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BorderBottomRightRadius<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "MozBorderRadiusBottomright", value.asInstanceOf[js.Any])
      
      inline def setMozBorderRadiusBottomrightUndefined: Self = StObject.set(x, "MozBorderRadiusBottomright", js.undefined)
      
      inline def setMozBorderRadiusTopleft(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'MozBorderRadiusTopleft' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BorderTopLeftRadius<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "MozBorderRadiusTopleft", value.asInstanceOf[js.Any])
      
      inline def setMozBorderRadiusTopleftUndefined: Self = StObject.set(x, "MozBorderRadiusTopleft", js.undefined)
      
      inline def setMozBorderRadiusTopright(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'MozBorderRadiusTopright' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BorderTopRightRadius<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "MozBorderRadiusTopright", value.asInstanceOf[js.Any])
      
      inline def setMozBorderRadiusToprightUndefined: Self = StObject.set(x, "MozBorderRadiusTopright", js.undefined)
      
      inline def setMozBorderRadiusUndefined: Self = StObject.set(x, "MozBorderRadius", js.undefined)
      
      inline def setMozBorderRightColors(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'MozBorderRightColors' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MozBorderRightColors | undefined */ js.Any
      ): Self = StObject.set(x, "MozBorderRightColors", value.asInstanceOf[js.Any])
      
      inline def setMozBorderRightColorsUndefined: Self = StObject.set(x, "MozBorderRightColors", js.undefined)
      
      inline def setMozBorderStartColor(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'MozBorderStartColor' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BorderInlineStartColor | undefined */ js.Any
      ): Self = StObject.set(x, "MozBorderStartColor", value.asInstanceOf[js.Any])
      
      inline def setMozBorderStartColorUndefined: Self = StObject.set(x, "MozBorderStartColor", js.undefined)
      
      inline def setMozBorderStartStyle(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'MozBorderStartStyle' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BorderInlineStartStyle | undefined */ js.Any
      ): Self = StObject.set(x, "MozBorderStartStyle", value.asInstanceOf[js.Any])
      
      inline def setMozBorderStartStyleUndefined: Self = StObject.set(x, "MozBorderStartStyle", js.undefined)
      
      inline def setMozBorderTopColors(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'MozBorderTopColors' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MozBorderTopColors | undefined */ js.Any
      ): Self = StObject.set(x, "MozBorderTopColors", value.asInstanceOf[js.Any])
      
      inline def setMozBorderTopColorsUndefined: Self = StObject.set(x, "MozBorderTopColors", js.undefined)
      
      inline def setMozBoxAlign(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'MozBoxAlign' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BoxAlign | undefined */ js.Any
      ): Self = StObject.set(x, "MozBoxAlign", value.asInstanceOf[js.Any])
      
      inline def setMozBoxAlignUndefined: Self = StObject.set(x, "MozBoxAlign", js.undefined)
      
      inline def setMozBoxDirection(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'MozBoxDirection' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BoxDirection | undefined */ js.Any
      ): Self = StObject.set(x, "MozBoxDirection", value.asInstanceOf[js.Any])
      
      inline def setMozBoxDirectionUndefined: Self = StObject.set(x, "MozBoxDirection", js.undefined)
      
      inline def setMozBoxFlex(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'MozBoxFlex' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BoxFlex | undefined */ js.Any
      ): Self = StObject.set(x, "MozBoxFlex", value.asInstanceOf[js.Any])
      
      inline def setMozBoxFlexUndefined: Self = StObject.set(x, "MozBoxFlex", js.undefined)
      
      inline def setMozBoxOrdinalGroup(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'MozBoxOrdinalGroup' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BoxOrdinalGroup | undefined */ js.Any
      ): Self = StObject.set(x, "MozBoxOrdinalGroup", value.asInstanceOf[js.Any])
      
      inline def setMozBoxOrdinalGroupUndefined: Self = StObject.set(x, "MozBoxOrdinalGroup", js.undefined)
      
      inline def setMozBoxOrient(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'MozBoxOrient' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BoxOrient | undefined */ js.Any
      ): Self = StObject.set(x, "MozBoxOrient", value.asInstanceOf[js.Any])
      
      inline def setMozBoxOrientUndefined: Self = StObject.set(x, "MozBoxOrient", js.undefined)
      
      inline def setMozBoxPack(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'MozBoxPack' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BoxPack | undefined */ js.Any
      ): Self = StObject.set(x, "MozBoxPack", value.asInstanceOf[js.Any])
      
      inline def setMozBoxPackUndefined: Self = StObject.set(x, "MozBoxPack", js.undefined)
      
      inline def setMozBoxShadow(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'MozBoxShadow' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BoxShadow | undefined */ js.Any
      ): Self = StObject.set(x, "MozBoxShadow", value.asInstanceOf[js.Any])
      
      inline def setMozBoxShadowUndefined: Self = StObject.set(x, "MozBoxShadow", js.undefined)
      
      inline def setMozBoxSizing(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'MozBoxSizing' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BoxSizing | undefined */ js.Any
      ): Self = StObject.set(x, "MozBoxSizing", value.asInstanceOf[js.Any])
      
      inline def setMozBoxSizingUndefined: Self = StObject.set(x, "MozBoxSizing", js.undefined)
      
      inline def setMozColumnCount(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'MozColumnCount' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.ColumnCount | undefined */ js.Any
      ): Self = StObject.set(x, "MozColumnCount", value.asInstanceOf[js.Any])
      
      inline def setMozColumnCountUndefined: Self = StObject.set(x, "MozColumnCount", js.undefined)
      
      inline def setMozColumnFill(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'MozColumnFill' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.ColumnFill | undefined */ js.Any
      ): Self = StObject.set(x, "MozColumnFill", value.asInstanceOf[js.Any])
      
      inline def setMozColumnFillUndefined: Self = StObject.set(x, "MozColumnFill", js.undefined)
      
      inline def setMozColumnRule(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'MozColumnRule' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.ColumnRule<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "MozColumnRule", value.asInstanceOf[js.Any])
      
      inline def setMozColumnRuleColor(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'MozColumnRuleColor' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.ColumnRuleColor | undefined */ js.Any
      ): Self = StObject.set(x, "MozColumnRuleColor", value.asInstanceOf[js.Any])
      
      inline def setMozColumnRuleColorUndefined: Self = StObject.set(x, "MozColumnRuleColor", js.undefined)
      
      inline def setMozColumnRuleStyle(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'MozColumnRuleStyle' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.ColumnRuleStyle | undefined */ js.Any
      ): Self = StObject.set(x, "MozColumnRuleStyle", value.asInstanceOf[js.Any])
      
      inline def setMozColumnRuleStyleUndefined: Self = StObject.set(x, "MozColumnRuleStyle", js.undefined)
      
      inline def setMozColumnRuleUndefined: Self = StObject.set(x, "MozColumnRule", js.undefined)
      
      inline def setMozColumnRuleWidth(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'MozColumnRuleWidth' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.ColumnRuleWidth<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "MozColumnRuleWidth", value.asInstanceOf[js.Any])
      
      inline def setMozColumnRuleWidthUndefined: Self = StObject.set(x, "MozColumnRuleWidth", js.undefined)
      
      inline def setMozColumnWidth(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'MozColumnWidth' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.ColumnWidth<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "MozColumnWidth", value.asInstanceOf[js.Any])
      
      inline def setMozColumnWidthUndefined: Self = StObject.set(x, "MozColumnWidth", js.undefined)
      
      inline def setMozColumns(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'MozColumns' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.Columns<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "MozColumns", value.asInstanceOf[js.Any])
      
      inline def setMozColumnsUndefined: Self = StObject.set(x, "MozColumns", js.undefined)
      
      inline def setMozContextProperties(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'MozContextProperties' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MozContextProperties | undefined */ js.Any
      ): Self = StObject.set(x, "MozContextProperties", value.asInstanceOf[js.Any])
      
      inline def setMozContextPropertiesUndefined: Self = StObject.set(x, "MozContextProperties", js.undefined)
      
      inline def setMozFloatEdge(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'MozFloatEdge' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MozFloatEdge | undefined */ js.Any
      ): Self = StObject.set(x, "MozFloatEdge", value.asInstanceOf[js.Any])
      
      inline def setMozFloatEdgeUndefined: Self = StObject.set(x, "MozFloatEdge", js.undefined)
      
      inline def setMozFontFeatureSettings(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'MozFontFeatureSettings' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.FontFeatureSettings | undefined */ js.Any
      ): Self = StObject.set(x, "MozFontFeatureSettings", value.asInstanceOf[js.Any])
      
      inline def setMozFontFeatureSettingsUndefined: Self = StObject.set(x, "MozFontFeatureSettings", js.undefined)
      
      inline def setMozFontLanguageOverride(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'MozFontLanguageOverride' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.FontLanguageOverride | undefined */ js.Any
      ): Self = StObject.set(x, "MozFontLanguageOverride", value.asInstanceOf[js.Any])
      
      inline def setMozFontLanguageOverrideUndefined: Self = StObject.set(x, "MozFontLanguageOverride", js.undefined)
      
      inline def setMozForceBrokenImageIcon(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'MozForceBrokenImageIcon' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MozForceBrokenImageIcon | undefined */ js.Any
      ): Self = StObject.set(x, "MozForceBrokenImageIcon", value.asInstanceOf[js.Any])
      
      inline def setMozForceBrokenImageIconUndefined: Self = StObject.set(x, "MozForceBrokenImageIcon", js.undefined)
      
      inline def setMozHyphens(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'MozHyphens' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.Hyphens | undefined */ js.Any
      ): Self = StObject.set(x, "MozHyphens", value.asInstanceOf[js.Any])
      
      inline def setMozHyphensUndefined: Self = StObject.set(x, "MozHyphens", js.undefined)
      
      inline def setMozImageRegion(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'MozImageRegion' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MozImageRegion | undefined */ js.Any
      ): Self = StObject.set(x, "MozImageRegion", value.asInstanceOf[js.Any])
      
      inline def setMozImageRegionUndefined: Self = StObject.set(x, "MozImageRegion", js.undefined)
      
      inline def setMozMarginEnd(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'MozMarginEnd' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MarginInlineEnd<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "MozMarginEnd", value.asInstanceOf[js.Any])
      
      inline def setMozMarginEndUndefined: Self = StObject.set(x, "MozMarginEnd", js.undefined)
      
      inline def setMozMarginStart(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'MozMarginStart' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MarginInlineStart<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "MozMarginStart", value.asInstanceOf[js.Any])
      
      inline def setMozMarginStartUndefined: Self = StObject.set(x, "MozMarginStart", js.undefined)
      
      inline def setMozOpacity(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'MozOpacity' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.Opacity | undefined */ js.Any
      ): Self = StObject.set(x, "MozOpacity", value.asInstanceOf[js.Any])
      
      inline def setMozOpacityUndefined: Self = StObject.set(x, "MozOpacity", js.undefined)
      
      inline def setMozOrient(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'MozOrient' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MozOrient | undefined */ js.Any
      ): Self = StObject.set(x, "MozOrient", value.asInstanceOf[js.Any])
      
      inline def setMozOrientUndefined: Self = StObject.set(x, "MozOrient", js.undefined)
      
      inline def setMozOsxFontSmoothing(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'MozOsxFontSmoothing' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.FontSmooth<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "MozOsxFontSmoothing", value.asInstanceOf[js.Any])
      
      inline def setMozOsxFontSmoothingUndefined: Self = StObject.set(x, "MozOsxFontSmoothing", js.undefined)
      
      inline def setMozOutline(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'MozOutline' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.Outline<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "MozOutline", value.asInstanceOf[js.Any])
      
      inline def setMozOutlineColor(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'MozOutlineColor' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.OutlineColor | undefined */ js.Any
      ): Self = StObject.set(x, "MozOutlineColor", value.asInstanceOf[js.Any])
      
      inline def setMozOutlineColorUndefined: Self = StObject.set(x, "MozOutlineColor", js.undefined)
      
      inline def setMozOutlineRadius(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'MozOutlineRadius' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MozOutlineRadius<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "MozOutlineRadius", value.asInstanceOf[js.Any])
      
      inline def setMozOutlineRadiusBottomleft(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'MozOutlineRadiusBottomleft' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MozOutlineRadiusBottomleft<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "MozOutlineRadiusBottomleft", value.asInstanceOf[js.Any])
      
      inline def setMozOutlineRadiusBottomleftUndefined: Self = StObject.set(x, "MozOutlineRadiusBottomleft", js.undefined)
      
      inline def setMozOutlineRadiusBottomright(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'MozOutlineRadiusBottomright' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MozOutlineRadiusBottomright<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "MozOutlineRadiusBottomright", value.asInstanceOf[js.Any])
      
      inline def setMozOutlineRadiusBottomrightUndefined: Self = StObject.set(x, "MozOutlineRadiusBottomright", js.undefined)
      
      inline def setMozOutlineRadiusTopleft(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'MozOutlineRadiusTopleft' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MozOutlineRadiusTopleft<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "MozOutlineRadiusTopleft", value.asInstanceOf[js.Any])
      
      inline def setMozOutlineRadiusTopleftUndefined: Self = StObject.set(x, "MozOutlineRadiusTopleft", js.undefined)
      
      inline def setMozOutlineRadiusTopright(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'MozOutlineRadiusTopright' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MozOutlineRadiusTopright<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "MozOutlineRadiusTopright", value.asInstanceOf[js.Any])
      
      inline def setMozOutlineRadiusToprightUndefined: Self = StObject.set(x, "MozOutlineRadiusTopright", js.undefined)
      
      inline def setMozOutlineRadiusUndefined: Self = StObject.set(x, "MozOutlineRadius", js.undefined)
      
      inline def setMozOutlineStyle(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'MozOutlineStyle' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.OutlineStyle | undefined */ js.Any
      ): Self = StObject.set(x, "MozOutlineStyle", value.asInstanceOf[js.Any])
      
      inline def setMozOutlineStyleUndefined: Self = StObject.set(x, "MozOutlineStyle", js.undefined)
      
      inline def setMozOutlineUndefined: Self = StObject.set(x, "MozOutline", js.undefined)
      
      inline def setMozOutlineWidth(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'MozOutlineWidth' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.OutlineWidth<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "MozOutlineWidth", value.asInstanceOf[js.Any])
      
      inline def setMozOutlineWidthUndefined: Self = StObject.set(x, "MozOutlineWidth", js.undefined)
      
      inline def setMozPaddingEnd(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'MozPaddingEnd' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.PaddingInlineEnd<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "MozPaddingEnd", value.asInstanceOf[js.Any])
      
      inline def setMozPaddingEndUndefined: Self = StObject.set(x, "MozPaddingEnd", js.undefined)
      
      inline def setMozPaddingStart(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'MozPaddingStart' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.PaddingInlineStart<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "MozPaddingStart", value.asInstanceOf[js.Any])
      
      inline def setMozPaddingStartUndefined: Self = StObject.set(x, "MozPaddingStart", js.undefined)
      
      inline def setMozPerspective(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'MozPerspective' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.Perspective<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "MozPerspective", value.asInstanceOf[js.Any])
      
      inline def setMozPerspectiveOrigin(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'MozPerspectiveOrigin' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.PerspectiveOrigin<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "MozPerspectiveOrigin", value.asInstanceOf[js.Any])
      
      inline def setMozPerspectiveOriginUndefined: Self = StObject.set(x, "MozPerspectiveOrigin", js.undefined)
      
      inline def setMozPerspectiveUndefined: Self = StObject.set(x, "MozPerspective", js.undefined)
      
      inline def setMozStackSizing(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'MozStackSizing' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MozStackSizing | undefined */ js.Any
      ): Self = StObject.set(x, "MozStackSizing", value.asInstanceOf[js.Any])
      
      inline def setMozStackSizingUndefined: Self = StObject.set(x, "MozStackSizing", js.undefined)
      
      inline def setMozTabSize(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'MozTabSize' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.TabSize<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "MozTabSize", value.asInstanceOf[js.Any])
      
      inline def setMozTabSizeUndefined: Self = StObject.set(x, "MozTabSize", js.undefined)
      
      inline def setMozTextAlignLast(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'MozTextAlignLast' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.TextAlignLast | undefined */ js.Any
      ): Self = StObject.set(x, "MozTextAlignLast", value.asInstanceOf[js.Any])
      
      inline def setMozTextAlignLastUndefined: Self = StObject.set(x, "MozTextAlignLast", js.undefined)
      
      inline def setMozTextBlink(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'MozTextBlink' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MozTextBlink | undefined */ js.Any
      ): Self = StObject.set(x, "MozTextBlink", value.asInstanceOf[js.Any])
      
      inline def setMozTextBlinkUndefined: Self = StObject.set(x, "MozTextBlink", js.undefined)
      
      inline def setMozTextDecorationColor(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'MozTextDecorationColor' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.TextDecorationColor | undefined */ js.Any
      ): Self = StObject.set(x, "MozTextDecorationColor", value.asInstanceOf[js.Any])
      
      inline def setMozTextDecorationColorUndefined: Self = StObject.set(x, "MozTextDecorationColor", js.undefined)
      
      inline def setMozTextDecorationLine(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'MozTextDecorationLine' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.TextDecorationLine | undefined */ js.Any
      ): Self = StObject.set(x, "MozTextDecorationLine", value.asInstanceOf[js.Any])
      
      inline def setMozTextDecorationLineUndefined: Self = StObject.set(x, "MozTextDecorationLine", js.undefined)
      
      inline def setMozTextDecorationStyle(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'MozTextDecorationStyle' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.TextDecorationStyle | undefined */ js.Any
      ): Self = StObject.set(x, "MozTextDecorationStyle", value.asInstanceOf[js.Any])
      
      inline def setMozTextDecorationStyleUndefined: Self = StObject.set(x, "MozTextDecorationStyle", js.undefined)
      
      inline def setMozTextSizeAdjust(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'MozTextSizeAdjust' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.TextSizeAdjust | undefined */ js.Any
      ): Self = StObject.set(x, "MozTextSizeAdjust", value.asInstanceOf[js.Any])
      
      inline def setMozTextSizeAdjustUndefined: Self = StObject.set(x, "MozTextSizeAdjust", js.undefined)
      
      inline def setMozTransformOrigin(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'MozTransformOrigin' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.TransformOrigin<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "MozTransformOrigin", value.asInstanceOf[js.Any])
      
      inline def setMozTransformOriginUndefined: Self = StObject.set(x, "MozTransformOrigin", js.undefined)
      
      inline def setMozTransformStyle(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'MozTransformStyle' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.TransformStyle | undefined */ js.Any
      ): Self = StObject.set(x, "MozTransformStyle", value.asInstanceOf[js.Any])
      
      inline def setMozTransformStyleUndefined: Self = StObject.set(x, "MozTransformStyle", js.undefined)
      
      inline def setMozTransition(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'MozTransition' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.Transition<string & {}> | undefined */ js.Any
      ): Self = StObject.set(x, "MozTransition", value.asInstanceOf[js.Any])
      
      inline def setMozTransitionDelay(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'MozTransitionDelay' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.TransitionDelay<string & {}> | undefined */ js.Any
      ): Self = StObject.set(x, "MozTransitionDelay", value.asInstanceOf[js.Any])
      
      inline def setMozTransitionDelayUndefined: Self = StObject.set(x, "MozTransitionDelay", js.undefined)
      
      inline def setMozTransitionDuration(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'MozTransitionDuration' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.TransitionDuration<string & {}> | undefined */ js.Any
      ): Self = StObject.set(x, "MozTransitionDuration", value.asInstanceOf[js.Any])
      
      inline def setMozTransitionDurationUndefined: Self = StObject.set(x, "MozTransitionDuration", js.undefined)
      
      inline def setMozTransitionProperty(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'MozTransitionProperty' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.TransitionProperty | undefined */ js.Any
      ): Self = StObject.set(x, "MozTransitionProperty", value.asInstanceOf[js.Any])
      
      inline def setMozTransitionPropertyUndefined: Self = StObject.set(x, "MozTransitionProperty", js.undefined)
      
      inline def setMozTransitionTimingFunction(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'MozTransitionTimingFunction' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.TransitionTimingFunction | undefined */ js.Any
      ): Self = StObject.set(x, "MozTransitionTimingFunction", value.asInstanceOf[js.Any])
      
      inline def setMozTransitionTimingFunctionUndefined: Self = StObject.set(x, "MozTransitionTimingFunction", js.undefined)
      
      inline def setMozTransitionUndefined: Self = StObject.set(x, "MozTransition", js.undefined)
      
      inline def setMozUserFocus(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'MozUserFocus' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MozUserFocus | undefined */ js.Any
      ): Self = StObject.set(x, "MozUserFocus", value.asInstanceOf[js.Any])
      
      inline def setMozUserFocusUndefined: Self = StObject.set(x, "MozUserFocus", js.undefined)
      
      inline def setMozUserInput(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'MozUserInput' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MozUserInput | undefined */ js.Any
      ): Self = StObject.set(x, "MozUserInput", value.asInstanceOf[js.Any])
      
      inline def setMozUserInputUndefined: Self = StObject.set(x, "MozUserInput", js.undefined)
      
      inline def setMozUserModify(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'MozUserModify' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MozUserModify | undefined */ js.Any
      ): Self = StObject.set(x, "MozUserModify", value.asInstanceOf[js.Any])
      
      inline def setMozUserModifyUndefined: Self = StObject.set(x, "MozUserModify", js.undefined)
      
      inline def setMozUserSelect(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'MozUserSelect' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.UserSelect | undefined */ js.Any
      ): Self = StObject.set(x, "MozUserSelect", value.asInstanceOf[js.Any])
      
      inline def setMozUserSelectUndefined: Self = StObject.set(x, "MozUserSelect", js.undefined)
      
      inline def setMozWindowDragging(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'MozWindowDragging' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MozWindowDragging | undefined */ js.Any
      ): Self = StObject.set(x, "MozWindowDragging", value.asInstanceOf[js.Any])
      
      inline def setMozWindowDraggingUndefined: Self = StObject.set(x, "MozWindowDragging", js.undefined)
      
      inline def setMozWindowShadow(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'MozWindowShadow' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MozWindowShadow | undefined */ js.Any
      ): Self = StObject.set(x, "MozWindowShadow", value.asInstanceOf[js.Any])
      
      inline def setMozWindowShadowUndefined: Self = StObject.set(x, "MozWindowShadow", js.undefined)
      
      inline def setMsAccelerator(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'msAccelerator' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MsAccelerator | undefined */ js.Any
      ): Self = StObject.set(x, "msAccelerator", value.asInstanceOf[js.Any])
      
      inline def setMsAcceleratorUndefined: Self = StObject.set(x, "msAccelerator", js.undefined)
      
      inline def setMsBlockProgression(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'msBlockProgression' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MsBlockProgression | undefined */ js.Any
      ): Self = StObject.set(x, "msBlockProgression", value.asInstanceOf[js.Any])
      
      inline def setMsBlockProgressionUndefined: Self = StObject.set(x, "msBlockProgression", js.undefined)
      
      inline def setMsContentZoomChaining(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'msContentZoomChaining' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MsContentZoomChaining | undefined */ js.Any
      ): Self = StObject.set(x, "msContentZoomChaining", value.asInstanceOf[js.Any])
      
      inline def setMsContentZoomChainingUndefined: Self = StObject.set(x, "msContentZoomChaining", js.undefined)
      
      inline def setMsContentZoomLimit(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'msContentZoomLimit' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MsContentZoomLimit | undefined */ js.Any
      ): Self = StObject.set(x, "msContentZoomLimit", value.asInstanceOf[js.Any])
      
      inline def setMsContentZoomLimitMax(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'msContentZoomLimitMax' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MsContentZoomLimitMax | undefined */ js.Any
      ): Self = StObject.set(x, "msContentZoomLimitMax", value.asInstanceOf[js.Any])
      
      inline def setMsContentZoomLimitMaxUndefined: Self = StObject.set(x, "msContentZoomLimitMax", js.undefined)
      
      inline def setMsContentZoomLimitMin(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'msContentZoomLimitMin' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MsContentZoomLimitMin | undefined */ js.Any
      ): Self = StObject.set(x, "msContentZoomLimitMin", value.asInstanceOf[js.Any])
      
      inline def setMsContentZoomLimitMinUndefined: Self = StObject.set(x, "msContentZoomLimitMin", js.undefined)
      
      inline def setMsContentZoomLimitUndefined: Self = StObject.set(x, "msContentZoomLimit", js.undefined)
      
      inline def setMsContentZoomSnap(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'msContentZoomSnap' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MsContentZoomSnap | undefined */ js.Any
      ): Self = StObject.set(x, "msContentZoomSnap", value.asInstanceOf[js.Any])
      
      inline def setMsContentZoomSnapPoints(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'msContentZoomSnapPoints' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MsContentZoomSnapPoints | undefined */ js.Any
      ): Self = StObject.set(x, "msContentZoomSnapPoints", value.asInstanceOf[js.Any])
      
      inline def setMsContentZoomSnapPointsUndefined: Self = StObject.set(x, "msContentZoomSnapPoints", js.undefined)
      
      inline def setMsContentZoomSnapType(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'msContentZoomSnapType' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MsContentZoomSnapType | undefined */ js.Any
      ): Self = StObject.set(x, "msContentZoomSnapType", value.asInstanceOf[js.Any])
      
      inline def setMsContentZoomSnapTypeUndefined: Self = StObject.set(x, "msContentZoomSnapType", js.undefined)
      
      inline def setMsContentZoomSnapUndefined: Self = StObject.set(x, "msContentZoomSnap", js.undefined)
      
      inline def setMsContentZooming(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'msContentZooming' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MsContentZooming | undefined */ js.Any
      ): Self = StObject.set(x, "msContentZooming", value.asInstanceOf[js.Any])
      
      inline def setMsContentZoomingUndefined: Self = StObject.set(x, "msContentZooming", js.undefined)
      
      inline def setMsFilter(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'msFilter' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MsFilter | undefined */ js.Any
      ): Self = StObject.set(x, "msFilter", value.asInstanceOf[js.Any])
      
      inline def setMsFilterUndefined: Self = StObject.set(x, "msFilter", js.undefined)
      
      inline def setMsFlex(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'msFlex' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.Flex<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "msFlex", value.asInstanceOf[js.Any])
      
      inline def setMsFlexDirection(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'msFlexDirection' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.FlexDirection | undefined */ js.Any
      ): Self = StObject.set(x, "msFlexDirection", value.asInstanceOf[js.Any])
      
      inline def setMsFlexDirectionUndefined: Self = StObject.set(x, "msFlexDirection", js.undefined)
      
      inline def setMsFlexPositive(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'msFlexPositive' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.FlexGrow | undefined */ js.Any
      ): Self = StObject.set(x, "msFlexPositive", value.asInstanceOf[js.Any])
      
      inline def setMsFlexPositiveUndefined: Self = StObject.set(x, "msFlexPositive", js.undefined)
      
      inline def setMsFlexUndefined: Self = StObject.set(x, "msFlex", js.undefined)
      
      inline def setMsFlowFrom(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'msFlowFrom' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MsFlowFrom | undefined */ js.Any
      ): Self = StObject.set(x, "msFlowFrom", value.asInstanceOf[js.Any])
      
      inline def setMsFlowFromUndefined: Self = StObject.set(x, "msFlowFrom", js.undefined)
      
      inline def setMsFlowInto(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'msFlowInto' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MsFlowInto | undefined */ js.Any
      ): Self = StObject.set(x, "msFlowInto", value.asInstanceOf[js.Any])
      
      inline def setMsFlowIntoUndefined: Self = StObject.set(x, "msFlowInto", js.undefined)
      
      inline def setMsGridColumns(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'msGridColumns' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MsGridColumns<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "msGridColumns", value.asInstanceOf[js.Any])
      
      inline def setMsGridColumnsUndefined: Self = StObject.set(x, "msGridColumns", js.undefined)
      
      inline def setMsGridRows(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'msGridRows' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MsGridRows<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "msGridRows", value.asInstanceOf[js.Any])
      
      inline def setMsGridRowsUndefined: Self = StObject.set(x, "msGridRows", js.undefined)
      
      inline def setMsHighContrastAdjust(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'msHighContrastAdjust' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MsHighContrastAdjust | undefined */ js.Any
      ): Self = StObject.set(x, "msHighContrastAdjust", value.asInstanceOf[js.Any])
      
      inline def setMsHighContrastAdjustUndefined: Self = StObject.set(x, "msHighContrastAdjust", js.undefined)
      
      inline def setMsHyphenateLimitChars(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'msHyphenateLimitChars' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MsHyphenateLimitChars | undefined */ js.Any
      ): Self = StObject.set(x, "msHyphenateLimitChars", value.asInstanceOf[js.Any])
      
      inline def setMsHyphenateLimitCharsUndefined: Self = StObject.set(x, "msHyphenateLimitChars", js.undefined)
      
      inline def setMsHyphenateLimitLines(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'msHyphenateLimitLines' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MsHyphenateLimitLines | undefined */ js.Any
      ): Self = StObject.set(x, "msHyphenateLimitLines", value.asInstanceOf[js.Any])
      
      inline def setMsHyphenateLimitLinesUndefined: Self = StObject.set(x, "msHyphenateLimitLines", js.undefined)
      
      inline def setMsHyphenateLimitZone(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'msHyphenateLimitZone' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MsHyphenateLimitZone<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "msHyphenateLimitZone", value.asInstanceOf[js.Any])
      
      inline def setMsHyphenateLimitZoneUndefined: Self = StObject.set(x, "msHyphenateLimitZone", js.undefined)
      
      inline def setMsHyphens(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'msHyphens' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.Hyphens | undefined */ js.Any
      ): Self = StObject.set(x, "msHyphens", value.asInstanceOf[js.Any])
      
      inline def setMsHyphensUndefined: Self = StObject.set(x, "msHyphens", js.undefined)
      
      inline def setMsImeAlign(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'msImeAlign' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MsImeAlign | undefined */ js.Any
      ): Self = StObject.set(x, "msImeAlign", value.asInstanceOf[js.Any])
      
      inline def setMsImeAlignUndefined: Self = StObject.set(x, "msImeAlign", js.undefined)
      
      inline def setMsImeMode(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'msImeMode' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.ImeMode | undefined */ js.Any
      ): Self = StObject.set(x, "msImeMode", value.asInstanceOf[js.Any])
      
      inline def setMsImeModeUndefined: Self = StObject.set(x, "msImeMode", js.undefined)
      
      inline def setMsLineBreak(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'msLineBreak' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.LineBreak | undefined */ js.Any
      ): Self = StObject.set(x, "msLineBreak", value.asInstanceOf[js.Any])
      
      inline def setMsLineBreakUndefined: Self = StObject.set(x, "msLineBreak", js.undefined)
      
      inline def setMsOrder(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'msOrder' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.Order | undefined */ js.Any
      ): Self = StObject.set(x, "msOrder", value.asInstanceOf[js.Any])
      
      inline def setMsOrderUndefined: Self = StObject.set(x, "msOrder", js.undefined)
      
      inline def setMsOverflowStyle(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'msOverflowStyle' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MsOverflowStyle | undefined */ js.Any
      ): Self = StObject.set(x, "msOverflowStyle", value.asInstanceOf[js.Any])
      
      inline def setMsOverflowStyleUndefined: Self = StObject.set(x, "msOverflowStyle", js.undefined)
      
      inline def setMsOverflowX(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'msOverflowX' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.OverflowX | undefined */ js.Any
      ): Self = StObject.set(x, "msOverflowX", value.asInstanceOf[js.Any])
      
      inline def setMsOverflowXUndefined: Self = StObject.set(x, "msOverflowX", js.undefined)
      
      inline def setMsOverflowY(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'msOverflowY' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.OverflowY | undefined */ js.Any
      ): Self = StObject.set(x, "msOverflowY", value.asInstanceOf[js.Any])
      
      inline def setMsOverflowYUndefined: Self = StObject.set(x, "msOverflowY", js.undefined)
      
      inline def setMsScrollChaining(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'msScrollChaining' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MsScrollChaining | undefined */ js.Any
      ): Self = StObject.set(x, "msScrollChaining", value.asInstanceOf[js.Any])
      
      inline def setMsScrollChainingUndefined: Self = StObject.set(x, "msScrollChaining", js.undefined)
      
      inline def setMsScrollLimit(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'msScrollLimit' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MsScrollLimit | undefined */ js.Any
      ): Self = StObject.set(x, "msScrollLimit", value.asInstanceOf[js.Any])
      
      inline def setMsScrollLimitUndefined: Self = StObject.set(x, "msScrollLimit", js.undefined)
      
      inline def setMsScrollLimitXMax(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'msScrollLimitXMax' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MsScrollLimitXMax<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "msScrollLimitXMax", value.asInstanceOf[js.Any])
      
      inline def setMsScrollLimitXMaxUndefined: Self = StObject.set(x, "msScrollLimitXMax", js.undefined)
      
      inline def setMsScrollLimitXMin(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'msScrollLimitXMin' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MsScrollLimitXMin<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "msScrollLimitXMin", value.asInstanceOf[js.Any])
      
      inline def setMsScrollLimitXMinUndefined: Self = StObject.set(x, "msScrollLimitXMin", js.undefined)
      
      inline def setMsScrollLimitYMax(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'msScrollLimitYMax' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MsScrollLimitYMax<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "msScrollLimitYMax", value.asInstanceOf[js.Any])
      
      inline def setMsScrollLimitYMaxUndefined: Self = StObject.set(x, "msScrollLimitYMax", js.undefined)
      
      inline def setMsScrollLimitYMin(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'msScrollLimitYMin' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MsScrollLimitYMin<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "msScrollLimitYMin", value.asInstanceOf[js.Any])
      
      inline def setMsScrollLimitYMinUndefined: Self = StObject.set(x, "msScrollLimitYMin", js.undefined)
      
      inline def setMsScrollRails(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'msScrollRails' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MsScrollRails | undefined */ js.Any
      ): Self = StObject.set(x, "msScrollRails", value.asInstanceOf[js.Any])
      
      inline def setMsScrollRailsUndefined: Self = StObject.set(x, "msScrollRails", js.undefined)
      
      inline def setMsScrollSnapPointsX(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'msScrollSnapPointsX' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MsScrollSnapPointsX | undefined */ js.Any
      ): Self = StObject.set(x, "msScrollSnapPointsX", value.asInstanceOf[js.Any])
      
      inline def setMsScrollSnapPointsXUndefined: Self = StObject.set(x, "msScrollSnapPointsX", js.undefined)
      
      inline def setMsScrollSnapPointsY(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'msScrollSnapPointsY' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MsScrollSnapPointsY | undefined */ js.Any
      ): Self = StObject.set(x, "msScrollSnapPointsY", value.asInstanceOf[js.Any])
      
      inline def setMsScrollSnapPointsYUndefined: Self = StObject.set(x, "msScrollSnapPointsY", js.undefined)
      
      inline def setMsScrollSnapType(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'msScrollSnapType' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MsScrollSnapType | undefined */ js.Any
      ): Self = StObject.set(x, "msScrollSnapType", value.asInstanceOf[js.Any])
      
      inline def setMsScrollSnapTypeUndefined: Self = StObject.set(x, "msScrollSnapType", js.undefined)
      
      inline def setMsScrollSnapX(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'msScrollSnapX' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MsScrollSnapX | undefined */ js.Any
      ): Self = StObject.set(x, "msScrollSnapX", value.asInstanceOf[js.Any])
      
      inline def setMsScrollSnapXUndefined: Self = StObject.set(x, "msScrollSnapX", js.undefined)
      
      inline def setMsScrollSnapY(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'msScrollSnapY' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MsScrollSnapY | undefined */ js.Any
      ): Self = StObject.set(x, "msScrollSnapY", value.asInstanceOf[js.Any])
      
      inline def setMsScrollSnapYUndefined: Self = StObject.set(x, "msScrollSnapY", js.undefined)
      
      inline def setMsScrollTranslation(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'msScrollTranslation' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MsScrollTranslation | undefined */ js.Any
      ): Self = StObject.set(x, "msScrollTranslation", value.asInstanceOf[js.Any])
      
      inline def setMsScrollTranslationUndefined: Self = StObject.set(x, "msScrollTranslation", js.undefined)
      
      inline def setMsScrollbar3dlightColor(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'msScrollbar3dlightColor' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MsScrollbar3dlightColor | undefined */ js.Any
      ): Self = StObject.set(x, "msScrollbar3dlightColor", value.asInstanceOf[js.Any])
      
      inline def setMsScrollbar3dlightColorUndefined: Self = StObject.set(x, "msScrollbar3dlightColor", js.undefined)
      
      inline def setMsScrollbarArrowColor(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'msScrollbarArrowColor' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MsScrollbarArrowColor | undefined */ js.Any
      ): Self = StObject.set(x, "msScrollbarArrowColor", value.asInstanceOf[js.Any])
      
      inline def setMsScrollbarArrowColorUndefined: Self = StObject.set(x, "msScrollbarArrowColor", js.undefined)
      
      inline def setMsScrollbarBaseColor(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'msScrollbarBaseColor' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MsScrollbarBaseColor | undefined */ js.Any
      ): Self = StObject.set(x, "msScrollbarBaseColor", value.asInstanceOf[js.Any])
      
      inline def setMsScrollbarBaseColorUndefined: Self = StObject.set(x, "msScrollbarBaseColor", js.undefined)
      
      inline def setMsScrollbarDarkshadowColor(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'msScrollbarDarkshadowColor' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MsScrollbarDarkshadowColor | undefined */ js.Any
      ): Self = StObject.set(x, "msScrollbarDarkshadowColor", value.asInstanceOf[js.Any])
      
      inline def setMsScrollbarDarkshadowColorUndefined: Self = StObject.set(x, "msScrollbarDarkshadowColor", js.undefined)
      
      inline def setMsScrollbarFaceColor(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'msScrollbarFaceColor' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MsScrollbarFaceColor | undefined */ js.Any
      ): Self = StObject.set(x, "msScrollbarFaceColor", value.asInstanceOf[js.Any])
      
      inline def setMsScrollbarFaceColorUndefined: Self = StObject.set(x, "msScrollbarFaceColor", js.undefined)
      
      inline def setMsScrollbarHighlightColor(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'msScrollbarHighlightColor' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MsScrollbarHighlightColor | undefined */ js.Any
      ): Self = StObject.set(x, "msScrollbarHighlightColor", value.asInstanceOf[js.Any])
      
      inline def setMsScrollbarHighlightColorUndefined: Self = StObject.set(x, "msScrollbarHighlightColor", js.undefined)
      
      inline def setMsScrollbarShadowColor(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'msScrollbarShadowColor' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MsScrollbarShadowColor | undefined */ js.Any
      ): Self = StObject.set(x, "msScrollbarShadowColor", value.asInstanceOf[js.Any])
      
      inline def setMsScrollbarShadowColorUndefined: Self = StObject.set(x, "msScrollbarShadowColor", js.undefined)
      
      inline def setMsScrollbarTrackColor(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'msScrollbarTrackColor' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MsScrollbarTrackColor | undefined */ js.Any
      ): Self = StObject.set(x, "msScrollbarTrackColor", value.asInstanceOf[js.Any])
      
      inline def setMsScrollbarTrackColorUndefined: Self = StObject.set(x, "msScrollbarTrackColor", js.undefined)
      
      inline def setMsTextAutospace(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'msTextAutospace' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MsTextAutospace | undefined */ js.Any
      ): Self = StObject.set(x, "msTextAutospace", value.asInstanceOf[js.Any])
      
      inline def setMsTextAutospaceUndefined: Self = StObject.set(x, "msTextAutospace", js.undefined)
      
      inline def setMsTextCombineHorizontal(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'msTextCombineHorizontal' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.TextCombineUpright | undefined */ js.Any
      ): Self = StObject.set(x, "msTextCombineHorizontal", value.asInstanceOf[js.Any])
      
      inline def setMsTextCombineHorizontalUndefined: Self = StObject.set(x, "msTextCombineHorizontal", js.undefined)
      
      inline def setMsTextOverflow(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'msTextOverflow' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.TextOverflow | undefined */ js.Any
      ): Self = StObject.set(x, "msTextOverflow", value.asInstanceOf[js.Any])
      
      inline def setMsTextOverflowUndefined: Self = StObject.set(x, "msTextOverflow", js.undefined)
      
      inline def setMsTouchAction(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'msTouchAction' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.TouchAction | undefined */ js.Any
      ): Self = StObject.set(x, "msTouchAction", value.asInstanceOf[js.Any])
      
      inline def setMsTouchActionUndefined: Self = StObject.set(x, "msTouchAction", js.undefined)
      
      inline def setMsTouchSelect(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'msTouchSelect' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MsTouchSelect | undefined */ js.Any
      ): Self = StObject.set(x, "msTouchSelect", value.asInstanceOf[js.Any])
      
      inline def setMsTouchSelectUndefined: Self = StObject.set(x, "msTouchSelect", js.undefined)
      
      inline def setMsTransform(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'msTransform' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.Transform | undefined */ js.Any
      ): Self = StObject.set(x, "msTransform", value.asInstanceOf[js.Any])
      
      inline def setMsTransformOrigin(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'msTransformOrigin' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.TransformOrigin<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "msTransformOrigin", value.asInstanceOf[js.Any])
      
      inline def setMsTransformOriginUndefined: Self = StObject.set(x, "msTransformOrigin", js.undefined)
      
      inline def setMsTransformUndefined: Self = StObject.set(x, "msTransform", js.undefined)
      
      inline def setMsTransition(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'msTransition' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.Transition<string & {}> | undefined */ js.Any
      ): Self = StObject.set(x, "msTransition", value.asInstanceOf[js.Any])
      
      inline def setMsTransitionDelay(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'msTransitionDelay' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.TransitionDelay<string & {}> | undefined */ js.Any
      ): Self = StObject.set(x, "msTransitionDelay", value.asInstanceOf[js.Any])
      
      inline def setMsTransitionDelayUndefined: Self = StObject.set(x, "msTransitionDelay", js.undefined)
      
      inline def setMsTransitionDuration(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'msTransitionDuration' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.TransitionDuration<string & {}> | undefined */ js.Any
      ): Self = StObject.set(x, "msTransitionDuration", value.asInstanceOf[js.Any])
      
      inline def setMsTransitionDurationUndefined: Self = StObject.set(x, "msTransitionDuration", js.undefined)
      
      inline def setMsTransitionProperty(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'msTransitionProperty' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.TransitionProperty | undefined */ js.Any
      ): Self = StObject.set(x, "msTransitionProperty", value.asInstanceOf[js.Any])
      
      inline def setMsTransitionPropertyUndefined: Self = StObject.set(x, "msTransitionProperty", js.undefined)
      
      inline def setMsTransitionTimingFunction(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'msTransitionTimingFunction' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.TransitionTimingFunction | undefined */ js.Any
      ): Self = StObject.set(x, "msTransitionTimingFunction", value.asInstanceOf[js.Any])
      
      inline def setMsTransitionTimingFunctionUndefined: Self = StObject.set(x, "msTransitionTimingFunction", js.undefined)
      
      inline def setMsTransitionUndefined: Self = StObject.set(x, "msTransition", js.undefined)
      
      inline def setMsUserSelect(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'msUserSelect' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MsUserSelect | undefined */ js.Any
      ): Self = StObject.set(x, "msUserSelect", value.asInstanceOf[js.Any])
      
      inline def setMsUserSelectUndefined: Self = StObject.set(x, "msUserSelect", js.undefined)
      
      inline def setMsWordBreak(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'msWordBreak' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.WordBreak | undefined */ js.Any
      ): Self = StObject.set(x, "msWordBreak", value.asInstanceOf[js.Any])
      
      inline def setMsWordBreakUndefined: Self = StObject.set(x, "msWordBreak", js.undefined)
      
      inline def setMsWrapFlow(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'msWrapFlow' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MsWrapFlow | undefined */ js.Any
      ): Self = StObject.set(x, "msWrapFlow", value.asInstanceOf[js.Any])
      
      inline def setMsWrapFlowUndefined: Self = StObject.set(x, "msWrapFlow", js.undefined)
      
      inline def setMsWrapMargin(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'msWrapMargin' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MsWrapMargin<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "msWrapMargin", value.asInstanceOf[js.Any])
      
      inline def setMsWrapMarginUndefined: Self = StObject.set(x, "msWrapMargin", js.undefined)
      
      inline def setMsWrapThrough(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'msWrapThrough' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MsWrapThrough | undefined */ js.Any
      ): Self = StObject.set(x, "msWrapThrough", value.asInstanceOf[js.Any])
      
      inline def setMsWrapThroughUndefined: Self = StObject.set(x, "msWrapThrough", js.undefined)
      
      inline def setMsWritingMode(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'msWritingMode' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.WritingMode | undefined */ js.Any
      ): Self = StObject.set(x, "msWritingMode", value.asInstanceOf[js.Any])
      
      inline def setMsWritingModeUndefined: Self = StObject.set(x, "msWritingMode", js.undefined)
      
      inline def setOAnimation(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'OAnimation' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.Animation<string & {}> | undefined */ js.Any
      ): Self = StObject.set(x, "OAnimation", value.asInstanceOf[js.Any])
      
      inline def setOAnimationDelay(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'OAnimationDelay' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.AnimationDelay<string & {}> | undefined */ js.Any
      ): Self = StObject.set(x, "OAnimationDelay", value.asInstanceOf[js.Any])
      
      inline def setOAnimationDelayUndefined: Self = StObject.set(x, "OAnimationDelay", js.undefined)
      
      inline def setOAnimationDirection(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'OAnimationDirection' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.AnimationDirection | undefined */ js.Any
      ): Self = StObject.set(x, "OAnimationDirection", value.asInstanceOf[js.Any])
      
      inline def setOAnimationDirectionUndefined: Self = StObject.set(x, "OAnimationDirection", js.undefined)
      
      inline def setOAnimationDuration(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'OAnimationDuration' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.AnimationDuration<string & {}> | undefined */ js.Any
      ): Self = StObject.set(x, "OAnimationDuration", value.asInstanceOf[js.Any])
      
      inline def setOAnimationDurationUndefined: Self = StObject.set(x, "OAnimationDuration", js.undefined)
      
      inline def setOAnimationFillMode(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'OAnimationFillMode' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.AnimationFillMode | undefined */ js.Any
      ): Self = StObject.set(x, "OAnimationFillMode", value.asInstanceOf[js.Any])
      
      inline def setOAnimationFillModeUndefined: Self = StObject.set(x, "OAnimationFillMode", js.undefined)
      
      inline def setOAnimationIterationCount(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'OAnimationIterationCount' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.AnimationIterationCount | undefined */ js.Any
      ): Self = StObject.set(x, "OAnimationIterationCount", value.asInstanceOf[js.Any])
      
      inline def setOAnimationIterationCountUndefined: Self = StObject.set(x, "OAnimationIterationCount", js.undefined)
      
      inline def setOAnimationName(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'OAnimationName' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.AnimationName | undefined */ js.Any
      ): Self = StObject.set(x, "OAnimationName", value.asInstanceOf[js.Any])
      
      inline def setOAnimationNameUndefined: Self = StObject.set(x, "OAnimationName", js.undefined)
      
      inline def setOAnimationPlayState(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'OAnimationPlayState' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.AnimationPlayState | undefined */ js.Any
      ): Self = StObject.set(x, "OAnimationPlayState", value.asInstanceOf[js.Any])
      
      inline def setOAnimationPlayStateUndefined: Self = StObject.set(x, "OAnimationPlayState", js.undefined)
      
      inline def setOAnimationTimingFunction(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'OAnimationTimingFunction' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.AnimationTimingFunction | undefined */ js.Any
      ): Self = StObject.set(x, "OAnimationTimingFunction", value.asInstanceOf[js.Any])
      
      inline def setOAnimationTimingFunctionUndefined: Self = StObject.set(x, "OAnimationTimingFunction", js.undefined)
      
      inline def setOAnimationUndefined: Self = StObject.set(x, "OAnimation", js.undefined)
      
      inline def setOBackgroundSize(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'OBackgroundSize' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BackgroundSize<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "OBackgroundSize", value.asInstanceOf[js.Any])
      
      inline def setOBackgroundSizeUndefined: Self = StObject.set(x, "OBackgroundSize", js.undefined)
      
      inline def setOBorderImage(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'OBorderImage' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BorderImage | undefined */ js.Any
      ): Self = StObject.set(x, "OBorderImage", value.asInstanceOf[js.Any])
      
      inline def setOBorderImageUndefined: Self = StObject.set(x, "OBorderImage", js.undefined)
      
      inline def setOObjectFit(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'OObjectFit' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.ObjectFit | undefined */ js.Any
      ): Self = StObject.set(x, "OObjectFit", value.asInstanceOf[js.Any])
      
      inline def setOObjectFitUndefined: Self = StObject.set(x, "OObjectFit", js.undefined)
      
      inline def setOObjectPosition(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'OObjectPosition' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.ObjectPosition<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "OObjectPosition", value.asInstanceOf[js.Any])
      
      inline def setOObjectPositionUndefined: Self = StObject.set(x, "OObjectPosition", js.undefined)
      
      inline def setOTabSize(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'OTabSize' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.TabSize<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "OTabSize", value.asInstanceOf[js.Any])
      
      inline def setOTabSizeUndefined: Self = StObject.set(x, "OTabSize", js.undefined)
      
      inline def setOTextOverflow(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'OTextOverflow' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.TextOverflow | undefined */ js.Any
      ): Self = StObject.set(x, "OTextOverflow", value.asInstanceOf[js.Any])
      
      inline def setOTextOverflowUndefined: Self = StObject.set(x, "OTextOverflow", js.undefined)
      
      inline def setOTransform(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'OTransform' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.Transform | undefined */ js.Any
      ): Self = StObject.set(x, "OTransform", value.asInstanceOf[js.Any])
      
      inline def setOTransformOrigin(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'OTransformOrigin' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.TransformOrigin<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "OTransformOrigin", value.asInstanceOf[js.Any])
      
      inline def setOTransformOriginUndefined: Self = StObject.set(x, "OTransformOrigin", js.undefined)
      
      inline def setOTransformUndefined: Self = StObject.set(x, "OTransform", js.undefined)
      
      inline def setOTransition(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'OTransition' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.Transition<string & {}> | undefined */ js.Any
      ): Self = StObject.set(x, "OTransition", value.asInstanceOf[js.Any])
      
      inline def setOTransitionDelay(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'OTransitionDelay' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.TransitionDelay<string & {}> | undefined */ js.Any
      ): Self = StObject.set(x, "OTransitionDelay", value.asInstanceOf[js.Any])
      
      inline def setOTransitionDelayUndefined: Self = StObject.set(x, "OTransitionDelay", js.undefined)
      
      inline def setOTransitionDuration(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'OTransitionDuration' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.TransitionDuration<string & {}> | undefined */ js.Any
      ): Self = StObject.set(x, "OTransitionDuration", value.asInstanceOf[js.Any])
      
      inline def setOTransitionDurationUndefined: Self = StObject.set(x, "OTransitionDuration", js.undefined)
      
      inline def setOTransitionProperty(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'OTransitionProperty' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.TransitionProperty | undefined */ js.Any
      ): Self = StObject.set(x, "OTransitionProperty", value.asInstanceOf[js.Any])
      
      inline def setOTransitionPropertyUndefined: Self = StObject.set(x, "OTransitionProperty", js.undefined)
      
      inline def setOTransitionTimingFunction(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'OTransitionTimingFunction' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.TransitionTimingFunction | undefined */ js.Any
      ): Self = StObject.set(x, "OTransitionTimingFunction", value.asInstanceOf[js.Any])
      
      inline def setOTransitionTimingFunctionUndefined: Self = StObject.set(x, "OTransitionTimingFunction", js.undefined)
      
      inline def setOTransitionUndefined: Self = StObject.set(x, "OTransition", js.undefined)
      
      inline def setObjectFit(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'objectFit' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.ObjectFit | undefined */ js.Any
      ): Self = StObject.set(x, "objectFit", value.asInstanceOf[js.Any])
      
      inline def setObjectFitUndefined: Self = StObject.set(x, "objectFit", js.undefined)
      
      inline def setObjectPosition(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'objectPosition' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.ObjectPosition<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "objectPosition", value.asInstanceOf[js.Any])
      
      inline def setObjectPositionUndefined: Self = StObject.set(x, "objectPosition", js.undefined)
      
      inline def setOffset(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'offset' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.Offset<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetAnchor(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'offsetAnchor' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.OffsetAnchor<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "offsetAnchor", value.asInstanceOf[js.Any])
      
      inline def setOffsetAnchorUndefined: Self = StObject.set(x, "offsetAnchor", js.undefined)
      
      inline def setOffsetBlock(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'offsetBlock' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.InsetBlock<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "offsetBlock", value.asInstanceOf[js.Any])
      
      inline def setOffsetBlockEnd(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'offsetBlockEnd' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.InsetBlockEnd<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "offsetBlockEnd", value.asInstanceOf[js.Any])
      
      inline def setOffsetBlockEndUndefined: Self = StObject.set(x, "offsetBlockEnd", js.undefined)
      
      inline def setOffsetBlockStart(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'offsetBlockStart' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.InsetBlockStart<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "offsetBlockStart", value.asInstanceOf[js.Any])
      
      inline def setOffsetBlockStartUndefined: Self = StObject.set(x, "offsetBlockStart", js.undefined)
      
      inline def setOffsetBlockUndefined: Self = StObject.set(x, "offsetBlock", js.undefined)
      
      inline def setOffsetDistance(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'offsetDistance' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.OffsetDistance<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "offsetDistance", value.asInstanceOf[js.Any])
      
      inline def setOffsetDistanceUndefined: Self = StObject.set(x, "offsetDistance", js.undefined)
      
      inline def setOffsetInline(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'offsetInline' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.InsetInline<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "offsetInline", value.asInstanceOf[js.Any])
      
      inline def setOffsetInlineEnd(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'offsetInlineEnd' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.InsetInlineEnd<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "offsetInlineEnd", value.asInstanceOf[js.Any])
      
      inline def setOffsetInlineEndUndefined: Self = StObject.set(x, "offsetInlineEnd", js.undefined)
      
      inline def setOffsetInlineStart(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'offsetInlineStart' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.InsetInlineStart<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "offsetInlineStart", value.asInstanceOf[js.Any])
      
      inline def setOffsetInlineStartUndefined: Self = StObject.set(x, "offsetInlineStart", js.undefined)
      
      inline def setOffsetInlineUndefined: Self = StObject.set(x, "offsetInline", js.undefined)
      
      inline def setOffsetPath(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'offsetPath' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.OffsetPath | undefined */ js.Any
      ): Self = StObject.set(x, "offsetPath", value.asInstanceOf[js.Any])
      
      inline def setOffsetPathUndefined: Self = StObject.set(x, "offsetPath", js.undefined)
      
      inline def setOffsetRotate(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'offsetRotate' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.OffsetRotate | undefined */ js.Any
      ): Self = StObject.set(x, "offsetRotate", value.asInstanceOf[js.Any])
      
      inline def setOffsetRotateUndefined: Self = StObject.set(x, "offsetRotate", js.undefined)
      
      inline def setOffsetRotation(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'offsetRotation' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.OffsetRotate | undefined */ js.Any
      ): Self = StObject.set(x, "offsetRotation", value.asInstanceOf[js.Any])
      
      inline def setOffsetRotationUndefined: Self = StObject.set(x, "offsetRotation", js.undefined)
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      inline def setOpacity(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'opacity' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.Opacity | undefined */ js.Any
      ): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setOrder(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'order' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.Order | undefined */ js.Any
      ): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
      
      inline def setOrphans(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'orphans' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.Orphans | undefined */ js.Any
      ): Self = StObject.set(x, "orphans", value.asInstanceOf[js.Any])
      
      inline def setOrphansUndefined: Self = StObject.set(x, "orphans", js.undefined)
      
      inline def setOutline(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'outline' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.Outline<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "outline", value.asInstanceOf[js.Any])
      
      inline def setOutlineColor(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'outlineColor' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.OutlineColor | undefined */ js.Any
      ): Self = StObject.set(x, "outlineColor", value.asInstanceOf[js.Any])
      
      inline def setOutlineColorUndefined: Self = StObject.set(x, "outlineColor", js.undefined)
      
      inline def setOutlineOffset(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'outlineOffset' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.OutlineOffset<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "outlineOffset", value.asInstanceOf[js.Any])
      
      inline def setOutlineOffsetUndefined: Self = StObject.set(x, "outlineOffset", js.undefined)
      
      inline def setOutlineStyle(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'outlineStyle' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.OutlineStyle | undefined */ js.Any
      ): Self = StObject.set(x, "outlineStyle", value.asInstanceOf[js.Any])
      
      inline def setOutlineStyleUndefined: Self = StObject.set(x, "outlineStyle", js.undefined)
      
      inline def setOutlineUndefined: Self = StObject.set(x, "outline", js.undefined)
      
      inline def setOutlineWidth(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'outlineWidth' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.OutlineWidth<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "outlineWidth", value.asInstanceOf[js.Any])
      
      inline def setOutlineWidthUndefined: Self = StObject.set(x, "outlineWidth", js.undefined)
      
      inline def setOverflow(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'overflow' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.Overflow | undefined */ js.Any
      ): Self = StObject.set(x, "overflow", value.asInstanceOf[js.Any])
      
      inline def setOverflowAnchor(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'overflowAnchor' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.OverflowAnchor | undefined */ js.Any
      ): Self = StObject.set(x, "overflowAnchor", value.asInstanceOf[js.Any])
      
      inline def setOverflowAnchorUndefined: Self = StObject.set(x, "overflowAnchor", js.undefined)
      
      inline def setOverflowBlock(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'overflowBlock' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.OverflowBlock | undefined */ js.Any
      ): Self = StObject.set(x, "overflowBlock", value.asInstanceOf[js.Any])
      
      inline def setOverflowBlockUndefined: Self = StObject.set(x, "overflowBlock", js.undefined)
      
      inline def setOverflowClipBox(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'overflowClipBox' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.OverflowClipBox | undefined */ js.Any
      ): Self = StObject.set(x, "overflowClipBox", value.asInstanceOf[js.Any])
      
      inline def setOverflowClipBoxUndefined: Self = StObject.set(x, "overflowClipBox", js.undefined)
      
      inline def setOverflowClipMargin(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'overflowClipMargin' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.OverflowClipMargin<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "overflowClipMargin", value.asInstanceOf[js.Any])
      
      inline def setOverflowClipMarginUndefined: Self = StObject.set(x, "overflowClipMargin", js.undefined)
      
      inline def setOverflowInline(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'overflowInline' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.OverflowInline | undefined */ js.Any
      ): Self = StObject.set(x, "overflowInline", value.asInstanceOf[js.Any])
      
      inline def setOverflowInlineUndefined: Self = StObject.set(x, "overflowInline", js.undefined)
      
      inline def setOverflowUndefined: Self = StObject.set(x, "overflow", js.undefined)
      
      inline def setOverflowWrap(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'overflowWrap' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.OverflowWrap | undefined */ js.Any
      ): Self = StObject.set(x, "overflowWrap", value.asInstanceOf[js.Any])
      
      inline def setOverflowWrapUndefined: Self = StObject.set(x, "overflowWrap", js.undefined)
      
      inline def setOverflowX(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'overflowX' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.OverflowX | undefined */ js.Any
      ): Self = StObject.set(x, "overflowX", value.asInstanceOf[js.Any])
      
      inline def setOverflowXUndefined: Self = StObject.set(x, "overflowX", js.undefined)
      
      inline def setOverflowY(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'overflowY' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.OverflowY | undefined */ js.Any
      ): Self = StObject.set(x, "overflowY", value.asInstanceOf[js.Any])
      
      inline def setOverflowYUndefined: Self = StObject.set(x, "overflowY", js.undefined)
      
      inline def setOverscrollBehavior(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'overscrollBehavior' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.OverscrollBehavior | undefined */ js.Any
      ): Self = StObject.set(x, "overscrollBehavior", value.asInstanceOf[js.Any])
      
      inline def setOverscrollBehaviorBlock(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'overscrollBehaviorBlock' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.OverscrollBehaviorBlock | undefined */ js.Any
      ): Self = StObject.set(x, "overscrollBehaviorBlock", value.asInstanceOf[js.Any])
      
      inline def setOverscrollBehaviorBlockUndefined: Self = StObject.set(x, "overscrollBehaviorBlock", js.undefined)
      
      inline def setOverscrollBehaviorInline(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'overscrollBehaviorInline' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.OverscrollBehaviorInline | undefined */ js.Any
      ): Self = StObject.set(x, "overscrollBehaviorInline", value.asInstanceOf[js.Any])
      
      inline def setOverscrollBehaviorInlineUndefined: Self = StObject.set(x, "overscrollBehaviorInline", js.undefined)
      
      inline def setOverscrollBehaviorUndefined: Self = StObject.set(x, "overscrollBehavior", js.undefined)
      
      inline def setOverscrollBehaviorX(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'overscrollBehaviorX' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.OverscrollBehaviorX | undefined */ js.Any
      ): Self = StObject.set(x, "overscrollBehaviorX", value.asInstanceOf[js.Any])
      
      inline def setOverscrollBehaviorXUndefined: Self = StObject.set(x, "overscrollBehaviorX", js.undefined)
      
      inline def setOverscrollBehaviorY(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'overscrollBehaviorY' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.OverscrollBehaviorY | undefined */ js.Any
      ): Self = StObject.set(x, "overscrollBehaviorY", value.asInstanceOf[js.Any])
      
      inline def setOverscrollBehaviorYUndefined: Self = StObject.set(x, "overscrollBehaviorY", js.undefined)
      
      inline def setPadding(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'padding' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.Padding<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      inline def setPaddingBlock(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'paddingBlock' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.PaddingBlock<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "paddingBlock", value.asInstanceOf[js.Any])
      
      inline def setPaddingBlockEnd(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'paddingBlockEnd' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.PaddingBlockEnd<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "paddingBlockEnd", value.asInstanceOf[js.Any])
      
      inline def setPaddingBlockEndUndefined: Self = StObject.set(x, "paddingBlockEnd", js.undefined)
      
      inline def setPaddingBlockStart(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'paddingBlockStart' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.PaddingBlockStart<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "paddingBlockStart", value.asInstanceOf[js.Any])
      
      inline def setPaddingBlockStartUndefined: Self = StObject.set(x, "paddingBlockStart", js.undefined)
      
      inline def setPaddingBlockUndefined: Self = StObject.set(x, "paddingBlock", js.undefined)
      
      inline def setPaddingBottom(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'paddingBottom' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.PaddingBottom<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "paddingBottom", value.asInstanceOf[js.Any])
      
      inline def setPaddingBottomUndefined: Self = StObject.set(x, "paddingBottom", js.undefined)
      
      inline def setPaddingInline(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'paddingInline' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.PaddingInline<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "paddingInline", value.asInstanceOf[js.Any])
      
      inline def setPaddingInlineEnd(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'paddingInlineEnd' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.PaddingInlineEnd<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "paddingInlineEnd", value.asInstanceOf[js.Any])
      
      inline def setPaddingInlineEndUndefined: Self = StObject.set(x, "paddingInlineEnd", js.undefined)
      
      inline def setPaddingInlineStart(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'paddingInlineStart' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.PaddingInlineStart<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "paddingInlineStart", value.asInstanceOf[js.Any])
      
      inline def setPaddingInlineStartUndefined: Self = StObject.set(x, "paddingInlineStart", js.undefined)
      
      inline def setPaddingInlineUndefined: Self = StObject.set(x, "paddingInline", js.undefined)
      
      inline def setPaddingLeft(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'paddingLeft' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.PaddingLeft<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "paddingLeft", value.asInstanceOf[js.Any])
      
      inline def setPaddingLeftUndefined: Self = StObject.set(x, "paddingLeft", js.undefined)
      
      inline def setPaddingRight(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'paddingRight' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.PaddingRight<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "paddingRight", value.asInstanceOf[js.Any])
      
      inline def setPaddingRightUndefined: Self = StObject.set(x, "paddingRight", js.undefined)
      
      inline def setPaddingTop(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'paddingTop' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.PaddingTop<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "paddingTop", value.asInstanceOf[js.Any])
      
      inline def setPaddingTopUndefined: Self = StObject.set(x, "paddingTop", js.undefined)
      
      inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      inline def setPageBreakAfter(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'pageBreakAfter' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.PageBreakAfter | undefined */ js.Any
      ): Self = StObject.set(x, "pageBreakAfter", value.asInstanceOf[js.Any])
      
      inline def setPageBreakAfterUndefined: Self = StObject.set(x, "pageBreakAfter", js.undefined)
      
      inline def setPageBreakBefore(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'pageBreakBefore' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.PageBreakBefore | undefined */ js.Any
      ): Self = StObject.set(x, "pageBreakBefore", value.asInstanceOf[js.Any])
      
      inline def setPageBreakBeforeUndefined: Self = StObject.set(x, "pageBreakBefore", js.undefined)
      
      inline def setPageBreakInside(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'pageBreakInside' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.PageBreakInside | undefined */ js.Any
      ): Self = StObject.set(x, "pageBreakInside", value.asInstanceOf[js.Any])
      
      inline def setPageBreakInsideUndefined: Self = StObject.set(x, "pageBreakInside", js.undefined)
      
      inline def setPaintOrder(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'paintOrder' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.PaintOrder | undefined */ js.Any
      ): Self = StObject.set(x, "paintOrder", value.asInstanceOf[js.Any])
      
      inline def setPaintOrderUndefined: Self = StObject.set(x, "paintOrder", js.undefined)
      
      inline def setPerspective(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'perspective' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.Perspective<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "perspective", value.asInstanceOf[js.Any])
      
      inline def setPerspectiveOrigin(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'perspectiveOrigin' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.PerspectiveOrigin<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "perspectiveOrigin", value.asInstanceOf[js.Any])
      
      inline def setPerspectiveOriginUndefined: Self = StObject.set(x, "perspectiveOrigin", js.undefined)
      
      inline def setPerspectiveUndefined: Self = StObject.set(x, "perspective", js.undefined)
      
      inline def setPlaceContent(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'placeContent' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.PlaceContent | undefined */ js.Any
      ): Self = StObject.set(x, "placeContent", value.asInstanceOf[js.Any])
      
      inline def setPlaceContentUndefined: Self = StObject.set(x, "placeContent", js.undefined)
      
      inline def setPlaceItems(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'placeItems' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.PlaceItems | undefined */ js.Any
      ): Self = StObject.set(x, "placeItems", value.asInstanceOf[js.Any])
      
      inline def setPlaceItemsUndefined: Self = StObject.set(x, "placeItems", js.undefined)
      
      inline def setPlaceSelf(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'placeSelf' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.PlaceSelf | undefined */ js.Any
      ): Self = StObject.set(x, "placeSelf", value.asInstanceOf[js.Any])
      
      inline def setPlaceSelfUndefined: Self = StObject.set(x, "placeSelf", js.undefined)
      
      inline def setPointerEvents(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'pointerEvents' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.PointerEvents | undefined */ js.Any
      ): Self = StObject.set(x, "pointerEvents", value.asInstanceOf[js.Any])
      
      inline def setPointerEventsUndefined: Self = StObject.set(x, "pointerEvents", js.undefined)
      
      inline def setPosition(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'position' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.Position | undefined */ js.Any
      ): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setPrintColorAdjust(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'printColorAdjust' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.PrintColorAdjust | undefined */ js.Any
      ): Self = StObject.set(x, "printColorAdjust", value.asInstanceOf[js.Any])
      
      inline def setPrintColorAdjustUndefined: Self = StObject.set(x, "printColorAdjust", js.undefined)
      
      inline def setQuotes(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'quotes' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.Quotes | undefined */ js.Any
      ): Self = StObject.set(x, "quotes", value.asInstanceOf[js.Any])
      
      inline def setQuotesUndefined: Self = StObject.set(x, "quotes", js.undefined)
      
      inline def setResize(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'resize' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.Resize | undefined */ js.Any
      ): Self = StObject.set(x, "resize", value.asInstanceOf[js.Any])
      
      inline def setResizeUndefined: Self = StObject.set(x, "resize", js.undefined)
      
      inline def setRight(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'right' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.Right<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
      
      inline def setRotate(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'rotate' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? @react-spring/web.@react-spring/web/dist/declarations/src/animated.Angle | undefined : csstype.csstype.Property.Rotate | undefined */ js.Any
      ): Self = StObject.set(x, "rotate", value.asInstanceOf[js.Any])
      
      inline def setRotate3d(value: js.Tuple4[Double, Double, Double, Angle]): Self = StObject.set(x, "rotate3d", value.asInstanceOf[js.Any])
      
      inline def setRotate3dUndefined: Self = StObject.set(x, "rotate3d", js.undefined)
      
      inline def setRotateUndefined: Self = StObject.set(x, "rotate", js.undefined)
      
      inline def setRotateX(value: Angle): Self = StObject.set(x, "rotateX", value.asInstanceOf[js.Any])
      
      inline def setRotateXUndefined: Self = StObject.set(x, "rotateX", js.undefined)
      
      inline def setRotateY(value: Angle): Self = StObject.set(x, "rotateY", value.asInstanceOf[js.Any])
      
      inline def setRotateYUndefined: Self = StObject.set(x, "rotateY", js.undefined)
      
      inline def setRotateZ(value: Angle): Self = StObject.set(x, "rotateZ", value.asInstanceOf[js.Any])
      
      inline def setRotateZUndefined: Self = StObject.set(x, "rotateZ", js.undefined)
      
      inline def setRowGap(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'rowGap' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.RowGap<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "rowGap", value.asInstanceOf[js.Any])
      
      inline def setRowGapUndefined: Self = StObject.set(x, "rowGap", js.undefined)
      
      inline def setRubyAlign(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'rubyAlign' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.RubyAlign | undefined */ js.Any
      ): Self = StObject.set(x, "rubyAlign", value.asInstanceOf[js.Any])
      
      inline def setRubyAlignUndefined: Self = StObject.set(x, "rubyAlign", js.undefined)
      
      inline def setRubyMerge(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'rubyMerge' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.RubyMerge | undefined */ js.Any
      ): Self = StObject.set(x, "rubyMerge", value.asInstanceOf[js.Any])
      
      inline def setRubyMergeUndefined: Self = StObject.set(x, "rubyMerge", js.undefined)
      
      inline def setRubyPosition(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'rubyPosition' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.RubyPosition | undefined */ js.Any
      ): Self = StObject.set(x, "rubyPosition", value.asInstanceOf[js.Any])
      
      inline def setRubyPositionUndefined: Self = StObject.set(x, "rubyPosition", js.undefined)
      
      inline def setScale(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'scale' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? number | [number, number] | string | undefined : csstype.csstype.Property.Scale | undefined */ js.Any
      ): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      inline def setScale3d(value: js.Tuple3[Double, Double, Double]): Self = StObject.set(x, "scale3d", value.asInstanceOf[js.Any])
      
      inline def setScale3dUndefined: Self = StObject.set(x, "scale3d", js.undefined)
      
      inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
      
      inline def setScaleX(value: Double): Self = StObject.set(x, "scaleX", value.asInstanceOf[js.Any])
      
      inline def setScaleXUndefined: Self = StObject.set(x, "scaleX", js.undefined)
      
      inline def setScaleY(value: Double): Self = StObject.set(x, "scaleY", value.asInstanceOf[js.Any])
      
      inline def setScaleYUndefined: Self = StObject.set(x, "scaleY", js.undefined)
      
      inline def setScaleZ(value: Double): Self = StObject.set(x, "scaleZ", value.asInstanceOf[js.Any])
      
      inline def setScaleZUndefined: Self = StObject.set(x, "scaleZ", js.undefined)
      
      inline def setScrollBehavior(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'scrollBehavior' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.ScrollBehavior | undefined */ js.Any
      ): Self = StObject.set(x, "scrollBehavior", value.asInstanceOf[js.Any])
      
      inline def setScrollBehaviorUndefined: Self = StObject.set(x, "scrollBehavior", js.undefined)
      
      inline def setScrollMargin(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'scrollMargin' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.ScrollMargin<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "scrollMargin", value.asInstanceOf[js.Any])
      
      inline def setScrollMarginBlock(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'scrollMarginBlock' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.ScrollMarginBlock<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "scrollMarginBlock", value.asInstanceOf[js.Any])
      
      inline def setScrollMarginBlockEnd(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'scrollMarginBlockEnd' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.ScrollMarginBlockEnd<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "scrollMarginBlockEnd", value.asInstanceOf[js.Any])
      
      inline def setScrollMarginBlockEndUndefined: Self = StObject.set(x, "scrollMarginBlockEnd", js.undefined)
      
      inline def setScrollMarginBlockStart(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'scrollMarginBlockStart' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.ScrollMarginBlockStart<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "scrollMarginBlockStart", value.asInstanceOf[js.Any])
      
      inline def setScrollMarginBlockStartUndefined: Self = StObject.set(x, "scrollMarginBlockStart", js.undefined)
      
      inline def setScrollMarginBlockUndefined: Self = StObject.set(x, "scrollMarginBlock", js.undefined)
      
      inline def setScrollMarginBottom(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'scrollMarginBottom' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.ScrollMarginBottom<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "scrollMarginBottom", value.asInstanceOf[js.Any])
      
      inline def setScrollMarginBottomUndefined: Self = StObject.set(x, "scrollMarginBottom", js.undefined)
      
      inline def setScrollMarginInline(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'scrollMarginInline' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.ScrollMarginInline<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "scrollMarginInline", value.asInstanceOf[js.Any])
      
      inline def setScrollMarginInlineEnd(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'scrollMarginInlineEnd' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.ScrollMarginInlineEnd<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "scrollMarginInlineEnd", value.asInstanceOf[js.Any])
      
      inline def setScrollMarginInlineEndUndefined: Self = StObject.set(x, "scrollMarginInlineEnd", js.undefined)
      
      inline def setScrollMarginInlineStart(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'scrollMarginInlineStart' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.ScrollMarginInlineStart<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "scrollMarginInlineStart", value.asInstanceOf[js.Any])
      
      inline def setScrollMarginInlineStartUndefined: Self = StObject.set(x, "scrollMarginInlineStart", js.undefined)
      
      inline def setScrollMarginInlineUndefined: Self = StObject.set(x, "scrollMarginInline", js.undefined)
      
      inline def setScrollMarginLeft(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'scrollMarginLeft' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.ScrollMarginLeft<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "scrollMarginLeft", value.asInstanceOf[js.Any])
      
      inline def setScrollMarginLeftUndefined: Self = StObject.set(x, "scrollMarginLeft", js.undefined)
      
      inline def setScrollMarginRight(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'scrollMarginRight' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.ScrollMarginRight<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "scrollMarginRight", value.asInstanceOf[js.Any])
      
      inline def setScrollMarginRightUndefined: Self = StObject.set(x, "scrollMarginRight", js.undefined)
      
      inline def setScrollMarginTop(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'scrollMarginTop' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.ScrollMarginTop<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "scrollMarginTop", value.asInstanceOf[js.Any])
      
      inline def setScrollMarginTopUndefined: Self = StObject.set(x, "scrollMarginTop", js.undefined)
      
      inline def setScrollMarginUndefined: Self = StObject.set(x, "scrollMargin", js.undefined)
      
      inline def setScrollPadding(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'scrollPadding' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.ScrollPadding<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "scrollPadding", value.asInstanceOf[js.Any])
      
      inline def setScrollPaddingBlock(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'scrollPaddingBlock' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.ScrollPaddingBlock<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "scrollPaddingBlock", value.asInstanceOf[js.Any])
      
      inline def setScrollPaddingBlockEnd(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'scrollPaddingBlockEnd' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.ScrollPaddingBlockEnd<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "scrollPaddingBlockEnd", value.asInstanceOf[js.Any])
      
      inline def setScrollPaddingBlockEndUndefined: Self = StObject.set(x, "scrollPaddingBlockEnd", js.undefined)
      
      inline def setScrollPaddingBlockStart(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'scrollPaddingBlockStart' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.ScrollPaddingBlockStart<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "scrollPaddingBlockStart", value.asInstanceOf[js.Any])
      
      inline def setScrollPaddingBlockStartUndefined: Self = StObject.set(x, "scrollPaddingBlockStart", js.undefined)
      
      inline def setScrollPaddingBlockUndefined: Self = StObject.set(x, "scrollPaddingBlock", js.undefined)
      
      inline def setScrollPaddingBottom(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'scrollPaddingBottom' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.ScrollPaddingBottom<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "scrollPaddingBottom", value.asInstanceOf[js.Any])
      
      inline def setScrollPaddingBottomUndefined: Self = StObject.set(x, "scrollPaddingBottom", js.undefined)
      
      inline def setScrollPaddingInline(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'scrollPaddingInline' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.ScrollPaddingInline<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "scrollPaddingInline", value.asInstanceOf[js.Any])
      
      inline def setScrollPaddingInlineEnd(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'scrollPaddingInlineEnd' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.ScrollPaddingInlineEnd<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "scrollPaddingInlineEnd", value.asInstanceOf[js.Any])
      
      inline def setScrollPaddingInlineEndUndefined: Self = StObject.set(x, "scrollPaddingInlineEnd", js.undefined)
      
      inline def setScrollPaddingInlineStart(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'scrollPaddingInlineStart' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.ScrollPaddingInlineStart<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "scrollPaddingInlineStart", value.asInstanceOf[js.Any])
      
      inline def setScrollPaddingInlineStartUndefined: Self = StObject.set(x, "scrollPaddingInlineStart", js.undefined)
      
      inline def setScrollPaddingInlineUndefined: Self = StObject.set(x, "scrollPaddingInline", js.undefined)
      
      inline def setScrollPaddingLeft(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'scrollPaddingLeft' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.ScrollPaddingLeft<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "scrollPaddingLeft", value.asInstanceOf[js.Any])
      
      inline def setScrollPaddingLeftUndefined: Self = StObject.set(x, "scrollPaddingLeft", js.undefined)
      
      inline def setScrollPaddingRight(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'scrollPaddingRight' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.ScrollPaddingRight<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "scrollPaddingRight", value.asInstanceOf[js.Any])
      
      inline def setScrollPaddingRightUndefined: Self = StObject.set(x, "scrollPaddingRight", js.undefined)
      
      inline def setScrollPaddingTop(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'scrollPaddingTop' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.ScrollPaddingTop<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "scrollPaddingTop", value.asInstanceOf[js.Any])
      
      inline def setScrollPaddingTopUndefined: Self = StObject.set(x, "scrollPaddingTop", js.undefined)
      
      inline def setScrollPaddingUndefined: Self = StObject.set(x, "scrollPadding", js.undefined)
      
      inline def setScrollSnapAlign(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'scrollSnapAlign' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.ScrollSnapAlign | undefined */ js.Any
      ): Self = StObject.set(x, "scrollSnapAlign", value.asInstanceOf[js.Any])
      
      inline def setScrollSnapAlignUndefined: Self = StObject.set(x, "scrollSnapAlign", js.undefined)
      
      inline def setScrollSnapCoordinate(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'scrollSnapCoordinate' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.ScrollSnapCoordinate<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "scrollSnapCoordinate", value.asInstanceOf[js.Any])
      
      inline def setScrollSnapCoordinateUndefined: Self = StObject.set(x, "scrollSnapCoordinate", js.undefined)
      
      inline def setScrollSnapDestination(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'scrollSnapDestination' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.ScrollSnapDestination<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "scrollSnapDestination", value.asInstanceOf[js.Any])
      
      inline def setScrollSnapDestinationUndefined: Self = StObject.set(x, "scrollSnapDestination", js.undefined)
      
      inline def setScrollSnapMargin(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'scrollSnapMargin' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.ScrollMargin<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "scrollSnapMargin", value.asInstanceOf[js.Any])
      
      inline def setScrollSnapMarginBottom(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'scrollSnapMarginBottom' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.ScrollMarginBottom<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "scrollSnapMarginBottom", value.asInstanceOf[js.Any])
      
      inline def setScrollSnapMarginBottomUndefined: Self = StObject.set(x, "scrollSnapMarginBottom", js.undefined)
      
      inline def setScrollSnapMarginLeft(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'scrollSnapMarginLeft' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.ScrollMarginLeft<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "scrollSnapMarginLeft", value.asInstanceOf[js.Any])
      
      inline def setScrollSnapMarginLeftUndefined: Self = StObject.set(x, "scrollSnapMarginLeft", js.undefined)
      
      inline def setScrollSnapMarginRight(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'scrollSnapMarginRight' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.ScrollMarginRight<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "scrollSnapMarginRight", value.asInstanceOf[js.Any])
      
      inline def setScrollSnapMarginRightUndefined: Self = StObject.set(x, "scrollSnapMarginRight", js.undefined)
      
      inline def setScrollSnapMarginTop(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'scrollSnapMarginTop' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.ScrollMarginTop<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "scrollSnapMarginTop", value.asInstanceOf[js.Any])
      
      inline def setScrollSnapMarginTopUndefined: Self = StObject.set(x, "scrollSnapMarginTop", js.undefined)
      
      inline def setScrollSnapMarginUndefined: Self = StObject.set(x, "scrollSnapMargin", js.undefined)
      
      inline def setScrollSnapPointsX(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'scrollSnapPointsX' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.ScrollSnapPointsX | undefined */ js.Any
      ): Self = StObject.set(x, "scrollSnapPointsX", value.asInstanceOf[js.Any])
      
      inline def setScrollSnapPointsXUndefined: Self = StObject.set(x, "scrollSnapPointsX", js.undefined)
      
      inline def setScrollSnapPointsY(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'scrollSnapPointsY' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.ScrollSnapPointsY | undefined */ js.Any
      ): Self = StObject.set(x, "scrollSnapPointsY", value.asInstanceOf[js.Any])
      
      inline def setScrollSnapPointsYUndefined: Self = StObject.set(x, "scrollSnapPointsY", js.undefined)
      
      inline def setScrollSnapStop(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'scrollSnapStop' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.ScrollSnapStop | undefined */ js.Any
      ): Self = StObject.set(x, "scrollSnapStop", value.asInstanceOf[js.Any])
      
      inline def setScrollSnapStopUndefined: Self = StObject.set(x, "scrollSnapStop", js.undefined)
      
      inline def setScrollSnapType(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'scrollSnapType' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.ScrollSnapType | undefined */ js.Any
      ): Self = StObject.set(x, "scrollSnapType", value.asInstanceOf[js.Any])
      
      inline def setScrollSnapTypeUndefined: Self = StObject.set(x, "scrollSnapType", js.undefined)
      
      inline def setScrollSnapTypeX(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'scrollSnapTypeX' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.ScrollSnapTypeX | undefined */ js.Any
      ): Self = StObject.set(x, "scrollSnapTypeX", value.asInstanceOf[js.Any])
      
      inline def setScrollSnapTypeXUndefined: Self = StObject.set(x, "scrollSnapTypeX", js.undefined)
      
      inline def setScrollSnapTypeY(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'scrollSnapTypeY' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.ScrollSnapTypeY | undefined */ js.Any
      ): Self = StObject.set(x, "scrollSnapTypeY", value.asInstanceOf[js.Any])
      
      inline def setScrollSnapTypeYUndefined: Self = StObject.set(x, "scrollSnapTypeY", js.undefined)
      
      inline def setScrollbarColor(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'scrollbarColor' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.ScrollbarColor | undefined */ js.Any
      ): Self = StObject.set(x, "scrollbarColor", value.asInstanceOf[js.Any])
      
      inline def setScrollbarColorUndefined: Self = StObject.set(x, "scrollbarColor", js.undefined)
      
      inline def setScrollbarGutter(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'scrollbarGutter' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.ScrollbarGutter | undefined */ js.Any
      ): Self = StObject.set(x, "scrollbarGutter", value.asInstanceOf[js.Any])
      
      inline def setScrollbarGutterUndefined: Self = StObject.set(x, "scrollbarGutter", js.undefined)
      
      inline def setScrollbarWidth(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'scrollbarWidth' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.ScrollbarWidth | undefined */ js.Any
      ): Self = StObject.set(x, "scrollbarWidth", value.asInstanceOf[js.Any])
      
      inline def setScrollbarWidthUndefined: Self = StObject.set(x, "scrollbarWidth", js.undefined)
      
      inline def setShapeImageThreshold(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'shapeImageThreshold' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.ShapeImageThreshold | undefined */ js.Any
      ): Self = StObject.set(x, "shapeImageThreshold", value.asInstanceOf[js.Any])
      
      inline def setShapeImageThresholdUndefined: Self = StObject.set(x, "shapeImageThreshold", js.undefined)
      
      inline def setShapeMargin(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'shapeMargin' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.ShapeMargin<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "shapeMargin", value.asInstanceOf[js.Any])
      
      inline def setShapeMarginUndefined: Self = StObject.set(x, "shapeMargin", js.undefined)
      
      inline def setShapeOutside(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'shapeOutside' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.ShapeOutside | undefined */ js.Any
      ): Self = StObject.set(x, "shapeOutside", value.asInstanceOf[js.Any])
      
      inline def setShapeOutsideUndefined: Self = StObject.set(x, "shapeOutside", js.undefined)
      
      inline def setShapeRendering(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'shapeRendering' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.ShapeRendering | undefined */ js.Any
      ): Self = StObject.set(x, "shapeRendering", value.asInstanceOf[js.Any])
      
      inline def setShapeRenderingUndefined: Self = StObject.set(x, "shapeRendering", js.undefined)
      
      inline def setSkew(value: Angle | (js.Tuple2[Angle, Angle])): Self = StObject.set(x, "skew", value.asInstanceOf[js.Any])
      
      inline def setSkewUndefined: Self = StObject.set(x, "skew", js.undefined)
      
      inline def setSkewX(value: Angle): Self = StObject.set(x, "skewX", value.asInstanceOf[js.Any])
      
      inline def setSkewXUndefined: Self = StObject.set(x, "skewX", js.undefined)
      
      inline def setSkewY(value: Angle): Self = StObject.set(x, "skewY", value.asInstanceOf[js.Any])
      
      inline def setSkewYUndefined: Self = StObject.set(x, "skewY", js.undefined)
      
      inline def setStopColor(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'stopColor' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.StopColor | undefined */ js.Any
      ): Self = StObject.set(x, "stopColor", value.asInstanceOf[js.Any])
      
      inline def setStopColorUndefined: Self = StObject.set(x, "stopColor", js.undefined)
      
      inline def setStopOpacity(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'stopOpacity' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.StopOpacity | undefined */ js.Any
      ): Self = StObject.set(x, "stopOpacity", value.asInstanceOf[js.Any])
      
      inline def setStopOpacityUndefined: Self = StObject.set(x, "stopOpacity", js.undefined)
      
      inline def setStroke(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'stroke' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.Stroke | undefined */ js.Any
      ): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
      
      inline def setStrokeDasharray(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'strokeDasharray' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.StrokeDasharray<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "strokeDasharray", value.asInstanceOf[js.Any])
      
      inline def setStrokeDasharrayUndefined: Self = StObject.set(x, "strokeDasharray", js.undefined)
      
      inline def setStrokeDashoffset(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'strokeDashoffset' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.StrokeDashoffset<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "strokeDashoffset", value.asInstanceOf[js.Any])
      
      inline def setStrokeDashoffsetUndefined: Self = StObject.set(x, "strokeDashoffset", js.undefined)
      
      inline def setStrokeLinecap(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'strokeLinecap' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.StrokeLinecap | undefined */ js.Any
      ): Self = StObject.set(x, "strokeLinecap", value.asInstanceOf[js.Any])
      
      inline def setStrokeLinecapUndefined: Self = StObject.set(x, "strokeLinecap", js.undefined)
      
      inline def setStrokeLinejoin(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'strokeLinejoin' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.StrokeLinejoin | undefined */ js.Any
      ): Self = StObject.set(x, "strokeLinejoin", value.asInstanceOf[js.Any])
      
      inline def setStrokeLinejoinUndefined: Self = StObject.set(x, "strokeLinejoin", js.undefined)
      
      inline def setStrokeMiterlimit(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'strokeMiterlimit' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.StrokeMiterlimit | undefined */ js.Any
      ): Self = StObject.set(x, "strokeMiterlimit", value.asInstanceOf[js.Any])
      
      inline def setStrokeMiterlimitUndefined: Self = StObject.set(x, "strokeMiterlimit", js.undefined)
      
      inline def setStrokeOpacity(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'strokeOpacity' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.StrokeOpacity | undefined */ js.Any
      ): Self = StObject.set(x, "strokeOpacity", value.asInstanceOf[js.Any])
      
      inline def setStrokeOpacityUndefined: Self = StObject.set(x, "strokeOpacity", js.undefined)
      
      inline def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
      
      inline def setStrokeWidth(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'strokeWidth' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.StrokeWidth<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "strokeWidth", value.asInstanceOf[js.Any])
      
      inline def setStrokeWidthUndefined: Self = StObject.set(x, "strokeWidth", js.undefined)
      
      inline def setTabSize(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'tabSize' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.TabSize<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "tabSize", value.asInstanceOf[js.Any])
      
      inline def setTabSizeUndefined: Self = StObject.set(x, "tabSize", js.undefined)
      
      inline def setTableLayout(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'tableLayout' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.TableLayout | undefined */ js.Any
      ): Self = StObject.set(x, "tableLayout", value.asInstanceOf[js.Any])
      
      inline def setTableLayoutUndefined: Self = StObject.set(x, "tableLayout", js.undefined)
      
      inline def setTextAlign(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'textAlign' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.TextAlign | undefined */ js.Any
      ): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
      
      inline def setTextAlignLast(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'textAlignLast' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.TextAlignLast | undefined */ js.Any
      ): Self = StObject.set(x, "textAlignLast", value.asInstanceOf[js.Any])
      
      inline def setTextAlignLastUndefined: Self = StObject.set(x, "textAlignLast", js.undefined)
      
      inline def setTextAlignUndefined: Self = StObject.set(x, "textAlign", js.undefined)
      
      inline def setTextAnchor(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'textAnchor' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.TextAnchor | undefined */ js.Any
      ): Self = StObject.set(x, "textAnchor", value.asInstanceOf[js.Any])
      
      inline def setTextAnchorUndefined: Self = StObject.set(x, "textAnchor", js.undefined)
      
      inline def setTextCombineUpright(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'textCombineUpright' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.TextCombineUpright | undefined */ js.Any
      ): Self = StObject.set(x, "textCombineUpright", value.asInstanceOf[js.Any])
      
      inline def setTextCombineUprightUndefined: Self = StObject.set(x, "textCombineUpright", js.undefined)
      
      inline def setTextDecoration(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'textDecoration' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.TextDecoration<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "textDecoration", value.asInstanceOf[js.Any])
      
      inline def setTextDecorationColor(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'textDecorationColor' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.TextDecorationColor | undefined */ js.Any
      ): Self = StObject.set(x, "textDecorationColor", value.asInstanceOf[js.Any])
      
      inline def setTextDecorationColorUndefined: Self = StObject.set(x, "textDecorationColor", js.undefined)
      
      inline def setTextDecorationLine(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'textDecorationLine' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.TextDecorationLine | undefined */ js.Any
      ): Self = StObject.set(x, "textDecorationLine", value.asInstanceOf[js.Any])
      
      inline def setTextDecorationLineUndefined: Self = StObject.set(x, "textDecorationLine", js.undefined)
      
      inline def setTextDecorationSkip(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'textDecorationSkip' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.TextDecorationSkip | undefined */ js.Any
      ): Self = StObject.set(x, "textDecorationSkip", value.asInstanceOf[js.Any])
      
      inline def setTextDecorationSkipInk(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'textDecorationSkipInk' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.TextDecorationSkipInk | undefined */ js.Any
      ): Self = StObject.set(x, "textDecorationSkipInk", value.asInstanceOf[js.Any])
      
      inline def setTextDecorationSkipInkUndefined: Self = StObject.set(x, "textDecorationSkipInk", js.undefined)
      
      inline def setTextDecorationSkipUndefined: Self = StObject.set(x, "textDecorationSkip", js.undefined)
      
      inline def setTextDecorationStyle(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'textDecorationStyle' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.TextDecorationStyle | undefined */ js.Any
      ): Self = StObject.set(x, "textDecorationStyle", value.asInstanceOf[js.Any])
      
      inline def setTextDecorationStyleUndefined: Self = StObject.set(x, "textDecorationStyle", js.undefined)
      
      inline def setTextDecorationThickness(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'textDecorationThickness' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.TextDecorationThickness<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "textDecorationThickness", value.asInstanceOf[js.Any])
      
      inline def setTextDecorationThicknessUndefined: Self = StObject.set(x, "textDecorationThickness", js.undefined)
      
      inline def setTextDecorationUndefined: Self = StObject.set(x, "textDecoration", js.undefined)
      
      inline def setTextEmphasis(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'textEmphasis' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.TextEmphasis | undefined */ js.Any
      ): Self = StObject.set(x, "textEmphasis", value.asInstanceOf[js.Any])
      
      inline def setTextEmphasisColor(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'textEmphasisColor' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.TextEmphasisColor | undefined */ js.Any
      ): Self = StObject.set(x, "textEmphasisColor", value.asInstanceOf[js.Any])
      
      inline def setTextEmphasisColorUndefined: Self = StObject.set(x, "textEmphasisColor", js.undefined)
      
      inline def setTextEmphasisPosition(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'textEmphasisPosition' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.TextEmphasisPosition | undefined */ js.Any
      ): Self = StObject.set(x, "textEmphasisPosition", value.asInstanceOf[js.Any])
      
      inline def setTextEmphasisPositionUndefined: Self = StObject.set(x, "textEmphasisPosition", js.undefined)
      
      inline def setTextEmphasisStyle(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'textEmphasisStyle' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.TextEmphasisStyle | undefined */ js.Any
      ): Self = StObject.set(x, "textEmphasisStyle", value.asInstanceOf[js.Any])
      
      inline def setTextEmphasisStyleUndefined: Self = StObject.set(x, "textEmphasisStyle", js.undefined)
      
      inline def setTextEmphasisUndefined: Self = StObject.set(x, "textEmphasis", js.undefined)
      
      inline def setTextIndent(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'textIndent' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.TextIndent<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "textIndent", value.asInstanceOf[js.Any])
      
      inline def setTextIndentUndefined: Self = StObject.set(x, "textIndent", js.undefined)
      
      inline def setTextJustify(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'textJustify' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.TextJustify | undefined */ js.Any
      ): Self = StObject.set(x, "textJustify", value.asInstanceOf[js.Any])
      
      inline def setTextJustifyUndefined: Self = StObject.set(x, "textJustify", js.undefined)
      
      inline def setTextOrientation(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'textOrientation' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.TextOrientation | undefined */ js.Any
      ): Self = StObject.set(x, "textOrientation", value.asInstanceOf[js.Any])
      
      inline def setTextOrientationUndefined: Self = StObject.set(x, "textOrientation", js.undefined)
      
      inline def setTextOverflow(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'textOverflow' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.TextOverflow | undefined */ js.Any
      ): Self = StObject.set(x, "textOverflow", value.asInstanceOf[js.Any])
      
      inline def setTextOverflowUndefined: Self = StObject.set(x, "textOverflow", js.undefined)
      
      inline def setTextRendering(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'textRendering' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.TextRendering | undefined */ js.Any
      ): Self = StObject.set(x, "textRendering", value.asInstanceOf[js.Any])
      
      inline def setTextRenderingUndefined: Self = StObject.set(x, "textRendering", js.undefined)
      
      inline def setTextShadow(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'textShadow' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.TextShadow | undefined */ js.Any
      ): Self = StObject.set(x, "textShadow", value.asInstanceOf[js.Any])
      
      inline def setTextShadowUndefined: Self = StObject.set(x, "textShadow", js.undefined)
      
      inline def setTextSizeAdjust(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'textSizeAdjust' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.TextSizeAdjust | undefined */ js.Any
      ): Self = StObject.set(x, "textSizeAdjust", value.asInstanceOf[js.Any])
      
      inline def setTextSizeAdjustUndefined: Self = StObject.set(x, "textSizeAdjust", js.undefined)
      
      inline def setTextTransform(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'textTransform' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.TextTransform | undefined */ js.Any
      ): Self = StObject.set(x, "textTransform", value.asInstanceOf[js.Any])
      
      inline def setTextTransformUndefined: Self = StObject.set(x, "textTransform", js.undefined)
      
      inline def setTextUnderlineOffset(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'textUnderlineOffset' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.TextUnderlineOffset<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "textUnderlineOffset", value.asInstanceOf[js.Any])
      
      inline def setTextUnderlineOffsetUndefined: Self = StObject.set(x, "textUnderlineOffset", js.undefined)
      
      inline def setTextUnderlinePosition(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'textUnderlinePosition' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.TextUnderlinePosition | undefined */ js.Any
      ): Self = StObject.set(x, "textUnderlinePosition", value.asInstanceOf[js.Any])
      
      inline def setTextUnderlinePositionUndefined: Self = StObject.set(x, "textUnderlinePosition", js.undefined)
      
      inline def setTop(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'top' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.Top<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
      
      inline def setTouchAction(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'touchAction' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.TouchAction | undefined */ js.Any
      ): Self = StObject.set(x, "touchAction", value.asInstanceOf[js.Any])
      
      inline def setTouchActionUndefined: Self = StObject.set(x, "touchAction", js.undefined)
      
      inline def setTransform(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'transform' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? string | undefined : csstype.csstype.Property.Transform | undefined */ js.Any
      ): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
      
      inline def setTransformBox(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'transformBox' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.TransformBox | undefined */ js.Any
      ): Self = StObject.set(x, "transformBox", value.asInstanceOf[js.Any])
      
      inline def setTransformBoxUndefined: Self = StObject.set(x, "transformBox", js.undefined)
      
      inline def setTransformOrigin(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'transformOrigin' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.TransformOrigin<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "transformOrigin", value.asInstanceOf[js.Any])
      
      inline def setTransformOriginUndefined: Self = StObject.set(x, "transformOrigin", js.undefined)
      
      inline def setTransformStyle(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'transformStyle' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.TransformStyle | undefined */ js.Any
      ): Self = StObject.set(x, "transformStyle", value.asInstanceOf[js.Any])
      
      inline def setTransformStyleUndefined: Self = StObject.set(x, "transformStyle", js.undefined)
      
      inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
      
      inline def setTransition(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'transition' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.Transition<string & {}> | undefined */ js.Any
      ): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
      
      inline def setTransitionDelay(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'transitionDelay' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.TransitionDelay<string & {}> | undefined */ js.Any
      ): Self = StObject.set(x, "transitionDelay", value.asInstanceOf[js.Any])
      
      inline def setTransitionDelayUndefined: Self = StObject.set(x, "transitionDelay", js.undefined)
      
      inline def setTransitionDuration(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'transitionDuration' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.TransitionDuration<string & {}> | undefined */ js.Any
      ): Self = StObject.set(x, "transitionDuration", value.asInstanceOf[js.Any])
      
      inline def setTransitionDurationUndefined: Self = StObject.set(x, "transitionDuration", js.undefined)
      
      inline def setTransitionProperty(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'transitionProperty' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.TransitionProperty | undefined */ js.Any
      ): Self = StObject.set(x, "transitionProperty", value.asInstanceOf[js.Any])
      
      inline def setTransitionPropertyUndefined: Self = StObject.set(x, "transitionProperty", js.undefined)
      
      inline def setTransitionTimingFunction(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'transitionTimingFunction' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.TransitionTimingFunction | undefined */ js.Any
      ): Self = StObject.set(x, "transitionTimingFunction", value.asInstanceOf[js.Any])
      
      inline def setTransitionTimingFunctionUndefined: Self = StObject.set(x, "transitionTimingFunction", js.undefined)
      
      inline def setTransitionUndefined: Self = StObject.set(x, "transition", js.undefined)
      
      inline def setTranslate(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'translate' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? @react-spring/web.@react-spring/web/dist/declarations/src/animated.Length | [@react-spring/web.@react-spring/web/dist/declarations/src/animated.Length, @react-spring/web.@react-spring/web/dist/declarations/src/animated.Length] | undefined : csstype.csstype.Property.Translate<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "translate", value.asInstanceOf[js.Any])
      
      inline def setTranslate3d(value: js.Tuple3[Length, Length, Length]): Self = StObject.set(x, "translate3d", value.asInstanceOf[js.Any])
      
      inline def setTranslate3dUndefined: Self = StObject.set(x, "translate3d", js.undefined)
      
      inline def setTranslateUndefined: Self = StObject.set(x, "translate", js.undefined)
      
      inline def setTranslateX(value: Length): Self = StObject.set(x, "translateX", value.asInstanceOf[js.Any])
      
      inline def setTranslateXUndefined: Self = StObject.set(x, "translateX", js.undefined)
      
      inline def setTranslateY(value: Length): Self = StObject.set(x, "translateY", value.asInstanceOf[js.Any])
      
      inline def setTranslateYUndefined: Self = StObject.set(x, "translateY", js.undefined)
      
      inline def setTranslateZ(value: Length): Self = StObject.set(x, "translateZ", value.asInstanceOf[js.Any])
      
      inline def setTranslateZUndefined: Self = StObject.set(x, "translateZ", js.undefined)
      
      inline def setUnicodeBidi(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'unicodeBidi' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.UnicodeBidi | undefined */ js.Any
      ): Self = StObject.set(x, "unicodeBidi", value.asInstanceOf[js.Any])
      
      inline def setUnicodeBidiUndefined: Self = StObject.set(x, "unicodeBidi", js.undefined)
      
      inline def setUserSelect(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'userSelect' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.UserSelect | undefined */ js.Any
      ): Self = StObject.set(x, "userSelect", value.asInstanceOf[js.Any])
      
      inline def setUserSelectUndefined: Self = StObject.set(x, "userSelect", js.undefined)
      
      inline def setVectorEffect(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'vectorEffect' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.VectorEffect | undefined */ js.Any
      ): Self = StObject.set(x, "vectorEffect", value.asInstanceOf[js.Any])
      
      inline def setVectorEffectUndefined: Self = StObject.set(x, "vectorEffect", js.undefined)
      
      inline def setVerticalAlign(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'verticalAlign' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.VerticalAlign<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "verticalAlign", value.asInstanceOf[js.Any])
      
      inline def setVerticalAlignUndefined: Self = StObject.set(x, "verticalAlign", js.undefined)
      
      inline def setVisibility(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'visibility' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.Visibility | undefined */ js.Any
      ): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
      
      inline def setVisibilityUndefined: Self = StObject.set(x, "visibility", js.undefined)
      
      inline def setWebkitAlignContent(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitAlignContent' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.AlignContent | undefined */ js.Any
      ): Self = StObject.set(x, "WebkitAlignContent", value.asInstanceOf[js.Any])
      
      inline def setWebkitAlignContentUndefined: Self = StObject.set(x, "WebkitAlignContent", js.undefined)
      
      inline def setWebkitAlignItems(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitAlignItems' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.AlignItems | undefined */ js.Any
      ): Self = StObject.set(x, "WebkitAlignItems", value.asInstanceOf[js.Any])
      
      inline def setWebkitAlignItemsUndefined: Self = StObject.set(x, "WebkitAlignItems", js.undefined)
      
      inline def setWebkitAlignSelf(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitAlignSelf' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.AlignSelf | undefined */ js.Any
      ): Self = StObject.set(x, "WebkitAlignSelf", value.asInstanceOf[js.Any])
      
      inline def setWebkitAlignSelfUndefined: Self = StObject.set(x, "WebkitAlignSelf", js.undefined)
      
      inline def setWebkitAnimation(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitAnimation' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.Animation<string & {}> | undefined */ js.Any
      ): Self = StObject.set(x, "WebkitAnimation", value.asInstanceOf[js.Any])
      
      inline def setWebkitAnimationDelay(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitAnimationDelay' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.AnimationDelay<string & {}> | undefined */ js.Any
      ): Self = StObject.set(x, "WebkitAnimationDelay", value.asInstanceOf[js.Any])
      
      inline def setWebkitAnimationDelayUndefined: Self = StObject.set(x, "WebkitAnimationDelay", js.undefined)
      
      inline def setWebkitAnimationDirection(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitAnimationDirection' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.AnimationDirection | undefined */ js.Any
      ): Self = StObject.set(x, "WebkitAnimationDirection", value.asInstanceOf[js.Any])
      
      inline def setWebkitAnimationDirectionUndefined: Self = StObject.set(x, "WebkitAnimationDirection", js.undefined)
      
      inline def setWebkitAnimationDuration(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitAnimationDuration' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.AnimationDuration<string & {}> | undefined */ js.Any
      ): Self = StObject.set(x, "WebkitAnimationDuration", value.asInstanceOf[js.Any])
      
      inline def setWebkitAnimationDurationUndefined: Self = StObject.set(x, "WebkitAnimationDuration", js.undefined)
      
      inline def setWebkitAnimationFillMode(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitAnimationFillMode' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.AnimationFillMode | undefined */ js.Any
      ): Self = StObject.set(x, "WebkitAnimationFillMode", value.asInstanceOf[js.Any])
      
      inline def setWebkitAnimationFillModeUndefined: Self = StObject.set(x, "WebkitAnimationFillMode", js.undefined)
      
      inline def setWebkitAnimationIterationCount(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitAnimationIterationCount' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.AnimationIterationCount | undefined */ js.Any
      ): Self = StObject.set(x, "WebkitAnimationIterationCount", value.asInstanceOf[js.Any])
      
      inline def setWebkitAnimationIterationCountUndefined: Self = StObject.set(x, "WebkitAnimationIterationCount", js.undefined)
      
      inline def setWebkitAnimationName(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitAnimationName' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.AnimationName | undefined */ js.Any
      ): Self = StObject.set(x, "WebkitAnimationName", value.asInstanceOf[js.Any])
      
      inline def setWebkitAnimationNameUndefined: Self = StObject.set(x, "WebkitAnimationName", js.undefined)
      
      inline def setWebkitAnimationPlayState(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitAnimationPlayState' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.AnimationPlayState | undefined */ js.Any
      ): Self = StObject.set(x, "WebkitAnimationPlayState", value.asInstanceOf[js.Any])
      
      inline def setWebkitAnimationPlayStateUndefined: Self = StObject.set(x, "WebkitAnimationPlayState", js.undefined)
      
      inline def setWebkitAnimationTimingFunction(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitAnimationTimingFunction' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.AnimationTimingFunction | undefined */ js.Any
      ): Self = StObject.set(x, "WebkitAnimationTimingFunction", value.asInstanceOf[js.Any])
      
      inline def setWebkitAnimationTimingFunctionUndefined: Self = StObject.set(x, "WebkitAnimationTimingFunction", js.undefined)
      
      inline def setWebkitAnimationUndefined: Self = StObject.set(x, "WebkitAnimation", js.undefined)
      
      inline def setWebkitAppearance(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitAppearance' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.WebkitAppearance | undefined */ js.Any
      ): Self = StObject.set(x, "WebkitAppearance", value.asInstanceOf[js.Any])
      
      inline def setWebkitAppearanceUndefined: Self = StObject.set(x, "WebkitAppearance", js.undefined)
      
      inline def setWebkitBackdropFilter(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitBackdropFilter' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BackdropFilter | undefined */ js.Any
      ): Self = StObject.set(x, "WebkitBackdropFilter", value.asInstanceOf[js.Any])
      
      inline def setWebkitBackdropFilterUndefined: Self = StObject.set(x, "WebkitBackdropFilter", js.undefined)
      
      inline def setWebkitBackfaceVisibility(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitBackfaceVisibility' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BackfaceVisibility | undefined */ js.Any
      ): Self = StObject.set(x, "WebkitBackfaceVisibility", value.asInstanceOf[js.Any])
      
      inline def setWebkitBackfaceVisibilityUndefined: Self = StObject.set(x, "WebkitBackfaceVisibility", js.undefined)
      
      inline def setWebkitBackgroundClip(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitBackgroundClip' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BackgroundClip | undefined */ js.Any
      ): Self = StObject.set(x, "WebkitBackgroundClip", value.asInstanceOf[js.Any])
      
      inline def setWebkitBackgroundClipUndefined: Self = StObject.set(x, "WebkitBackgroundClip", js.undefined)
      
      inline def setWebkitBackgroundOrigin(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitBackgroundOrigin' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BackgroundOrigin | undefined */ js.Any
      ): Self = StObject.set(x, "WebkitBackgroundOrigin", value.asInstanceOf[js.Any])
      
      inline def setWebkitBackgroundOriginUndefined: Self = StObject.set(x, "WebkitBackgroundOrigin", js.undefined)
      
      inline def setWebkitBackgroundSize(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitBackgroundSize' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BackgroundSize<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "WebkitBackgroundSize", value.asInstanceOf[js.Any])
      
      inline def setWebkitBackgroundSizeUndefined: Self = StObject.set(x, "WebkitBackgroundSize", js.undefined)
      
      inline def setWebkitBorderBefore(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitBorderBefore' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.WebkitBorderBefore<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "WebkitBorderBefore", value.asInstanceOf[js.Any])
      
      inline def setWebkitBorderBeforeColor(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitBorderBeforeColor' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.WebkitBorderBeforeColor | undefined */ js.Any
      ): Self = StObject.set(x, "WebkitBorderBeforeColor", value.asInstanceOf[js.Any])
      
      inline def setWebkitBorderBeforeColorUndefined: Self = StObject.set(x, "WebkitBorderBeforeColor", js.undefined)
      
      inline def setWebkitBorderBeforeStyle(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitBorderBeforeStyle' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.WebkitBorderBeforeStyle | undefined */ js.Any
      ): Self = StObject.set(x, "WebkitBorderBeforeStyle", value.asInstanceOf[js.Any])
      
      inline def setWebkitBorderBeforeStyleUndefined: Self = StObject.set(x, "WebkitBorderBeforeStyle", js.undefined)
      
      inline def setWebkitBorderBeforeUndefined: Self = StObject.set(x, "WebkitBorderBefore", js.undefined)
      
      inline def setWebkitBorderBeforeWidth(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitBorderBeforeWidth' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.WebkitBorderBeforeWidth<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "WebkitBorderBeforeWidth", value.asInstanceOf[js.Any])
      
      inline def setWebkitBorderBeforeWidthUndefined: Self = StObject.set(x, "WebkitBorderBeforeWidth", js.undefined)
      
      inline def setWebkitBorderBottomLeftRadius(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitBorderBottomLeftRadius' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BorderBottomLeftRadius<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "WebkitBorderBottomLeftRadius", value.asInstanceOf[js.Any])
      
      inline def setWebkitBorderBottomLeftRadiusUndefined: Self = StObject.set(x, "WebkitBorderBottomLeftRadius", js.undefined)
      
      inline def setWebkitBorderBottomRightRadius(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitBorderBottomRightRadius' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BorderBottomRightRadius<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "WebkitBorderBottomRightRadius", value.asInstanceOf[js.Any])
      
      inline def setWebkitBorderBottomRightRadiusUndefined: Self = StObject.set(x, "WebkitBorderBottomRightRadius", js.undefined)
      
      inline def setWebkitBorderImage(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitBorderImage' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BorderImage | undefined */ js.Any
      ): Self = StObject.set(x, "WebkitBorderImage", value.asInstanceOf[js.Any])
      
      inline def setWebkitBorderImageSlice(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitBorderImageSlice' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BorderImageSlice | undefined */ js.Any
      ): Self = StObject.set(x, "WebkitBorderImageSlice", value.asInstanceOf[js.Any])
      
      inline def setWebkitBorderImageSliceUndefined: Self = StObject.set(x, "WebkitBorderImageSlice", js.undefined)
      
      inline def setWebkitBorderImageUndefined: Self = StObject.set(x, "WebkitBorderImage", js.undefined)
      
      inline def setWebkitBorderRadius(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitBorderRadius' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BorderRadius<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "WebkitBorderRadius", value.asInstanceOf[js.Any])
      
      inline def setWebkitBorderRadiusUndefined: Self = StObject.set(x, "WebkitBorderRadius", js.undefined)
      
      inline def setWebkitBorderTopLeftRadius(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitBorderTopLeftRadius' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BorderTopLeftRadius<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "WebkitBorderTopLeftRadius", value.asInstanceOf[js.Any])
      
      inline def setWebkitBorderTopLeftRadiusUndefined: Self = StObject.set(x, "WebkitBorderTopLeftRadius", js.undefined)
      
      inline def setWebkitBorderTopRightRadius(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitBorderTopRightRadius' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BorderTopRightRadius<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "WebkitBorderTopRightRadius", value.asInstanceOf[js.Any])
      
      inline def setWebkitBorderTopRightRadiusUndefined: Self = StObject.set(x, "WebkitBorderTopRightRadius", js.undefined)
      
      inline def setWebkitBoxAlign(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitBoxAlign' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BoxAlign | undefined */ js.Any
      ): Self = StObject.set(x, "WebkitBoxAlign", value.asInstanceOf[js.Any])
      
      inline def setWebkitBoxAlignUndefined: Self = StObject.set(x, "WebkitBoxAlign", js.undefined)
      
      inline def setWebkitBoxDecorationBreak(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitBoxDecorationBreak' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BoxDecorationBreak | undefined */ js.Any
      ): Self = StObject.set(x, "WebkitBoxDecorationBreak", value.asInstanceOf[js.Any])
      
      inline def setWebkitBoxDecorationBreakUndefined: Self = StObject.set(x, "WebkitBoxDecorationBreak", js.undefined)
      
      inline def setWebkitBoxDirection(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitBoxDirection' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BoxDirection | undefined */ js.Any
      ): Self = StObject.set(x, "WebkitBoxDirection", value.asInstanceOf[js.Any])
      
      inline def setWebkitBoxDirectionUndefined: Self = StObject.set(x, "WebkitBoxDirection", js.undefined)
      
      inline def setWebkitBoxFlex(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitBoxFlex' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BoxFlex | undefined */ js.Any
      ): Self = StObject.set(x, "WebkitBoxFlex", value.asInstanceOf[js.Any])
      
      inline def setWebkitBoxFlexGroup(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitBoxFlexGroup' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BoxFlexGroup | undefined */ js.Any
      ): Self = StObject.set(x, "WebkitBoxFlexGroup", value.asInstanceOf[js.Any])
      
      inline def setWebkitBoxFlexGroupUndefined: Self = StObject.set(x, "WebkitBoxFlexGroup", js.undefined)
      
      inline def setWebkitBoxFlexUndefined: Self = StObject.set(x, "WebkitBoxFlex", js.undefined)
      
      inline def setWebkitBoxLines(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitBoxLines' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BoxLines | undefined */ js.Any
      ): Self = StObject.set(x, "WebkitBoxLines", value.asInstanceOf[js.Any])
      
      inline def setWebkitBoxLinesUndefined: Self = StObject.set(x, "WebkitBoxLines", js.undefined)
      
      inline def setWebkitBoxOrdinalGroup(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitBoxOrdinalGroup' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BoxOrdinalGroup | undefined */ js.Any
      ): Self = StObject.set(x, "WebkitBoxOrdinalGroup", value.asInstanceOf[js.Any])
      
      inline def setWebkitBoxOrdinalGroupUndefined: Self = StObject.set(x, "WebkitBoxOrdinalGroup", js.undefined)
      
      inline def setWebkitBoxOrient(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitBoxOrient' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BoxOrient | undefined */ js.Any
      ): Self = StObject.set(x, "WebkitBoxOrient", value.asInstanceOf[js.Any])
      
      inline def setWebkitBoxOrientUndefined: Self = StObject.set(x, "WebkitBoxOrient", js.undefined)
      
      inline def setWebkitBoxPack(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitBoxPack' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BoxPack | undefined */ js.Any
      ): Self = StObject.set(x, "WebkitBoxPack", value.asInstanceOf[js.Any])
      
      inline def setWebkitBoxPackUndefined: Self = StObject.set(x, "WebkitBoxPack", js.undefined)
      
      inline def setWebkitBoxReflect(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitBoxReflect' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.WebkitBoxReflect<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "WebkitBoxReflect", value.asInstanceOf[js.Any])
      
      inline def setWebkitBoxReflectUndefined: Self = StObject.set(x, "WebkitBoxReflect", js.undefined)
      
      inline def setWebkitBoxShadow(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitBoxShadow' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BoxShadow | undefined */ js.Any
      ): Self = StObject.set(x, "WebkitBoxShadow", value.asInstanceOf[js.Any])
      
      inline def setWebkitBoxShadowUndefined: Self = StObject.set(x, "WebkitBoxShadow", js.undefined)
      
      inline def setWebkitBoxSizing(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitBoxSizing' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.BoxSizing | undefined */ js.Any
      ): Self = StObject.set(x, "WebkitBoxSizing", value.asInstanceOf[js.Any])
      
      inline def setWebkitBoxSizingUndefined: Self = StObject.set(x, "WebkitBoxSizing", js.undefined)
      
      inline def setWebkitClipPath(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitClipPath' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.ClipPath | undefined */ js.Any
      ): Self = StObject.set(x, "WebkitClipPath", value.asInstanceOf[js.Any])
      
      inline def setWebkitClipPathUndefined: Self = StObject.set(x, "WebkitClipPath", js.undefined)
      
      inline def setWebkitColumnCount(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitColumnCount' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.ColumnCount | undefined */ js.Any
      ): Self = StObject.set(x, "WebkitColumnCount", value.asInstanceOf[js.Any])
      
      inline def setWebkitColumnCountUndefined: Self = StObject.set(x, "WebkitColumnCount", js.undefined)
      
      inline def setWebkitColumnFill(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitColumnFill' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.ColumnFill | undefined */ js.Any
      ): Self = StObject.set(x, "WebkitColumnFill", value.asInstanceOf[js.Any])
      
      inline def setWebkitColumnFillUndefined: Self = StObject.set(x, "WebkitColumnFill", js.undefined)
      
      inline def setWebkitColumnRule(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitColumnRule' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.ColumnRule<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "WebkitColumnRule", value.asInstanceOf[js.Any])
      
      inline def setWebkitColumnRuleColor(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitColumnRuleColor' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.ColumnRuleColor | undefined */ js.Any
      ): Self = StObject.set(x, "WebkitColumnRuleColor", value.asInstanceOf[js.Any])
      
      inline def setWebkitColumnRuleColorUndefined: Self = StObject.set(x, "WebkitColumnRuleColor", js.undefined)
      
      inline def setWebkitColumnRuleStyle(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitColumnRuleStyle' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.ColumnRuleStyle | undefined */ js.Any
      ): Self = StObject.set(x, "WebkitColumnRuleStyle", value.asInstanceOf[js.Any])
      
      inline def setWebkitColumnRuleStyleUndefined: Self = StObject.set(x, "WebkitColumnRuleStyle", js.undefined)
      
      inline def setWebkitColumnRuleUndefined: Self = StObject.set(x, "WebkitColumnRule", js.undefined)
      
      inline def setWebkitColumnRuleWidth(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitColumnRuleWidth' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.ColumnRuleWidth<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "WebkitColumnRuleWidth", value.asInstanceOf[js.Any])
      
      inline def setWebkitColumnRuleWidthUndefined: Self = StObject.set(x, "WebkitColumnRuleWidth", js.undefined)
      
      inline def setWebkitColumnSpan(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitColumnSpan' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.ColumnSpan | undefined */ js.Any
      ): Self = StObject.set(x, "WebkitColumnSpan", value.asInstanceOf[js.Any])
      
      inline def setWebkitColumnSpanUndefined: Self = StObject.set(x, "WebkitColumnSpan", js.undefined)
      
      inline def setWebkitColumnWidth(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitColumnWidth' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.ColumnWidth<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "WebkitColumnWidth", value.asInstanceOf[js.Any])
      
      inline def setWebkitColumnWidthUndefined: Self = StObject.set(x, "WebkitColumnWidth", js.undefined)
      
      inline def setWebkitColumns(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitColumns' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.Columns<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "WebkitColumns", value.asInstanceOf[js.Any])
      
      inline def setWebkitColumnsUndefined: Self = StObject.set(x, "WebkitColumns", js.undefined)
      
      inline def setWebkitFilter(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitFilter' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.Filter | undefined */ js.Any
      ): Self = StObject.set(x, "WebkitFilter", value.asInstanceOf[js.Any])
      
      inline def setWebkitFilterUndefined: Self = StObject.set(x, "WebkitFilter", js.undefined)
      
      inline def setWebkitFlex(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitFlex' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.Flex<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "WebkitFlex", value.asInstanceOf[js.Any])
      
      inline def setWebkitFlexBasis(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitFlexBasis' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.FlexBasis<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "WebkitFlexBasis", value.asInstanceOf[js.Any])
      
      inline def setWebkitFlexBasisUndefined: Self = StObject.set(x, "WebkitFlexBasis", js.undefined)
      
      inline def setWebkitFlexDirection(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitFlexDirection' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.FlexDirection | undefined */ js.Any
      ): Self = StObject.set(x, "WebkitFlexDirection", value.asInstanceOf[js.Any])
      
      inline def setWebkitFlexDirectionUndefined: Self = StObject.set(x, "WebkitFlexDirection", js.undefined)
      
      inline def setWebkitFlexFlow(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitFlexFlow' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.FlexFlow | undefined */ js.Any
      ): Self = StObject.set(x, "WebkitFlexFlow", value.asInstanceOf[js.Any])
      
      inline def setWebkitFlexFlowUndefined: Self = StObject.set(x, "WebkitFlexFlow", js.undefined)
      
      inline def setWebkitFlexGrow(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitFlexGrow' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.FlexGrow | undefined */ js.Any
      ): Self = StObject.set(x, "WebkitFlexGrow", value.asInstanceOf[js.Any])
      
      inline def setWebkitFlexGrowUndefined: Self = StObject.set(x, "WebkitFlexGrow", js.undefined)
      
      inline def setWebkitFlexShrink(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitFlexShrink' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.FlexShrink | undefined */ js.Any
      ): Self = StObject.set(x, "WebkitFlexShrink", value.asInstanceOf[js.Any])
      
      inline def setWebkitFlexShrinkUndefined: Self = StObject.set(x, "WebkitFlexShrink", js.undefined)
      
      inline def setWebkitFlexUndefined: Self = StObject.set(x, "WebkitFlex", js.undefined)
      
      inline def setWebkitFlexWrap(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitFlexWrap' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.FlexWrap | undefined */ js.Any
      ): Self = StObject.set(x, "WebkitFlexWrap", value.asInstanceOf[js.Any])
      
      inline def setWebkitFlexWrapUndefined: Self = StObject.set(x, "WebkitFlexWrap", js.undefined)
      
      inline def setWebkitFontFeatureSettings(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitFontFeatureSettings' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.FontFeatureSettings | undefined */ js.Any
      ): Self = StObject.set(x, "WebkitFontFeatureSettings", value.asInstanceOf[js.Any])
      
      inline def setWebkitFontFeatureSettingsUndefined: Self = StObject.set(x, "WebkitFontFeatureSettings", js.undefined)
      
      inline def setWebkitFontKerning(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitFontKerning' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.FontKerning | undefined */ js.Any
      ): Self = StObject.set(x, "WebkitFontKerning", value.asInstanceOf[js.Any])
      
      inline def setWebkitFontKerningUndefined: Self = StObject.set(x, "WebkitFontKerning", js.undefined)
      
      inline def setWebkitFontSmoothing(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitFontSmoothing' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.FontSmooth<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "WebkitFontSmoothing", value.asInstanceOf[js.Any])
      
      inline def setWebkitFontSmoothingUndefined: Self = StObject.set(x, "WebkitFontSmoothing", js.undefined)
      
      inline def setWebkitFontVariantLigatures(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitFontVariantLigatures' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.FontVariantLigatures | undefined */ js.Any
      ): Self = StObject.set(x, "WebkitFontVariantLigatures", value.asInstanceOf[js.Any])
      
      inline def setWebkitFontVariantLigaturesUndefined: Self = StObject.set(x, "WebkitFontVariantLigatures", js.undefined)
      
      inline def setWebkitHyphenateCharacter(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitHyphenateCharacter' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.HyphenateCharacter | undefined */ js.Any
      ): Self = StObject.set(x, "WebkitHyphenateCharacter", value.asInstanceOf[js.Any])
      
      inline def setWebkitHyphenateCharacterUndefined: Self = StObject.set(x, "WebkitHyphenateCharacter", js.undefined)
      
      inline def setWebkitHyphens(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitHyphens' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.Hyphens | undefined */ js.Any
      ): Self = StObject.set(x, "WebkitHyphens", value.asInstanceOf[js.Any])
      
      inline def setWebkitHyphensUndefined: Self = StObject.set(x, "WebkitHyphens", js.undefined)
      
      inline def setWebkitInitialLetter(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitInitialLetter' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.InitialLetter | undefined */ js.Any
      ): Self = StObject.set(x, "WebkitInitialLetter", value.asInstanceOf[js.Any])
      
      inline def setWebkitInitialLetterUndefined: Self = StObject.set(x, "WebkitInitialLetter", js.undefined)
      
      inline def setWebkitJustifyContent(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitJustifyContent' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.JustifyContent | undefined */ js.Any
      ): Self = StObject.set(x, "WebkitJustifyContent", value.asInstanceOf[js.Any])
      
      inline def setWebkitJustifyContentUndefined: Self = StObject.set(x, "WebkitJustifyContent", js.undefined)
      
      inline def setWebkitLineBreak(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitLineBreak' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.LineBreak | undefined */ js.Any
      ): Self = StObject.set(x, "WebkitLineBreak", value.asInstanceOf[js.Any])
      
      inline def setWebkitLineBreakUndefined: Self = StObject.set(x, "WebkitLineBreak", js.undefined)
      
      inline def setWebkitLineClamp(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitLineClamp' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.WebkitLineClamp | undefined */ js.Any
      ): Self = StObject.set(x, "WebkitLineClamp", value.asInstanceOf[js.Any])
      
      inline def setWebkitLineClampUndefined: Self = StObject.set(x, "WebkitLineClamp", js.undefined)
      
      inline def setWebkitMarginEnd(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitMarginEnd' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MarginInlineEnd<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "WebkitMarginEnd", value.asInstanceOf[js.Any])
      
      inline def setWebkitMarginEndUndefined: Self = StObject.set(x, "WebkitMarginEnd", js.undefined)
      
      inline def setWebkitMarginStart(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitMarginStart' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MarginInlineStart<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "WebkitMarginStart", value.asInstanceOf[js.Any])
      
      inline def setWebkitMarginStartUndefined: Self = StObject.set(x, "WebkitMarginStart", js.undefined)
      
      inline def setWebkitMask(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitMask' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.WebkitMask<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "WebkitMask", value.asInstanceOf[js.Any])
      
      inline def setWebkitMaskAttachment(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitMaskAttachment' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.WebkitMaskAttachment | undefined */ js.Any
      ): Self = StObject.set(x, "WebkitMaskAttachment", value.asInstanceOf[js.Any])
      
      inline def setWebkitMaskAttachmentUndefined: Self = StObject.set(x, "WebkitMaskAttachment", js.undefined)
      
      inline def setWebkitMaskBoxImage(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitMaskBoxImage' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MaskBorder | undefined */ js.Any
      ): Self = StObject.set(x, "WebkitMaskBoxImage", value.asInstanceOf[js.Any])
      
      inline def setWebkitMaskBoxImageOutset(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitMaskBoxImageOutset' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MaskBorderOutset<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "WebkitMaskBoxImageOutset", value.asInstanceOf[js.Any])
      
      inline def setWebkitMaskBoxImageOutsetUndefined: Self = StObject.set(x, "WebkitMaskBoxImageOutset", js.undefined)
      
      inline def setWebkitMaskBoxImageRepeat(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitMaskBoxImageRepeat' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MaskBorderRepeat | undefined */ js.Any
      ): Self = StObject.set(x, "WebkitMaskBoxImageRepeat", value.asInstanceOf[js.Any])
      
      inline def setWebkitMaskBoxImageRepeatUndefined: Self = StObject.set(x, "WebkitMaskBoxImageRepeat", js.undefined)
      
      inline def setWebkitMaskBoxImageSlice(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitMaskBoxImageSlice' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MaskBorderSlice | undefined */ js.Any
      ): Self = StObject.set(x, "WebkitMaskBoxImageSlice", value.asInstanceOf[js.Any])
      
      inline def setWebkitMaskBoxImageSliceUndefined: Self = StObject.set(x, "WebkitMaskBoxImageSlice", js.undefined)
      
      inline def setWebkitMaskBoxImageSource(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitMaskBoxImageSource' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MaskBorderSource | undefined */ js.Any
      ): Self = StObject.set(x, "WebkitMaskBoxImageSource", value.asInstanceOf[js.Any])
      
      inline def setWebkitMaskBoxImageSourceUndefined: Self = StObject.set(x, "WebkitMaskBoxImageSource", js.undefined)
      
      inline def setWebkitMaskBoxImageUndefined: Self = StObject.set(x, "WebkitMaskBoxImage", js.undefined)
      
      inline def setWebkitMaskBoxImageWidth(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitMaskBoxImageWidth' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MaskBorderWidth<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "WebkitMaskBoxImageWidth", value.asInstanceOf[js.Any])
      
      inline def setWebkitMaskBoxImageWidthUndefined: Self = StObject.set(x, "WebkitMaskBoxImageWidth", js.undefined)
      
      inline def setWebkitMaskClip(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitMaskClip' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.WebkitMaskClip | undefined */ js.Any
      ): Self = StObject.set(x, "WebkitMaskClip", value.asInstanceOf[js.Any])
      
      inline def setWebkitMaskClipUndefined: Self = StObject.set(x, "WebkitMaskClip", js.undefined)
      
      inline def setWebkitMaskComposite(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitMaskComposite' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.WebkitMaskComposite | undefined */ js.Any
      ): Self = StObject.set(x, "WebkitMaskComposite", value.asInstanceOf[js.Any])
      
      inline def setWebkitMaskCompositeUndefined: Self = StObject.set(x, "WebkitMaskComposite", js.undefined)
      
      inline def setWebkitMaskImage(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitMaskImage' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.WebkitMaskImage | undefined */ js.Any
      ): Self = StObject.set(x, "WebkitMaskImage", value.asInstanceOf[js.Any])
      
      inline def setWebkitMaskImageUndefined: Self = StObject.set(x, "WebkitMaskImage", js.undefined)
      
      inline def setWebkitMaskOrigin(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitMaskOrigin' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.WebkitMaskOrigin | undefined */ js.Any
      ): Self = StObject.set(x, "WebkitMaskOrigin", value.asInstanceOf[js.Any])
      
      inline def setWebkitMaskOriginUndefined: Self = StObject.set(x, "WebkitMaskOrigin", js.undefined)
      
      inline def setWebkitMaskPosition(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitMaskPosition' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.WebkitMaskPosition<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "WebkitMaskPosition", value.asInstanceOf[js.Any])
      
      inline def setWebkitMaskPositionUndefined: Self = StObject.set(x, "WebkitMaskPosition", js.undefined)
      
      inline def setWebkitMaskPositionX(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitMaskPositionX' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.WebkitMaskPositionX<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "WebkitMaskPositionX", value.asInstanceOf[js.Any])
      
      inline def setWebkitMaskPositionXUndefined: Self = StObject.set(x, "WebkitMaskPositionX", js.undefined)
      
      inline def setWebkitMaskPositionY(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitMaskPositionY' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.WebkitMaskPositionY<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "WebkitMaskPositionY", value.asInstanceOf[js.Any])
      
      inline def setWebkitMaskPositionYUndefined: Self = StObject.set(x, "WebkitMaskPositionY", js.undefined)
      
      inline def setWebkitMaskRepeat(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitMaskRepeat' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.WebkitMaskRepeat | undefined */ js.Any
      ): Self = StObject.set(x, "WebkitMaskRepeat", value.asInstanceOf[js.Any])
      
      inline def setWebkitMaskRepeatUndefined: Self = StObject.set(x, "WebkitMaskRepeat", js.undefined)
      
      inline def setWebkitMaskRepeatX(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitMaskRepeatX' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.WebkitMaskRepeatX | undefined */ js.Any
      ): Self = StObject.set(x, "WebkitMaskRepeatX", value.asInstanceOf[js.Any])
      
      inline def setWebkitMaskRepeatXUndefined: Self = StObject.set(x, "WebkitMaskRepeatX", js.undefined)
      
      inline def setWebkitMaskRepeatY(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitMaskRepeatY' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.WebkitMaskRepeatY | undefined */ js.Any
      ): Self = StObject.set(x, "WebkitMaskRepeatY", value.asInstanceOf[js.Any])
      
      inline def setWebkitMaskRepeatYUndefined: Self = StObject.set(x, "WebkitMaskRepeatY", js.undefined)
      
      inline def setWebkitMaskSize(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitMaskSize' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.WebkitMaskSize<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "WebkitMaskSize", value.asInstanceOf[js.Any])
      
      inline def setWebkitMaskSizeUndefined: Self = StObject.set(x, "WebkitMaskSize", js.undefined)
      
      inline def setWebkitMaskUndefined: Self = StObject.set(x, "WebkitMask", js.undefined)
      
      inline def setWebkitMaxInlineSize(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitMaxInlineSize' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.MaxInlineSize<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "WebkitMaxInlineSize", value.asInstanceOf[js.Any])
      
      inline def setWebkitMaxInlineSizeUndefined: Self = StObject.set(x, "WebkitMaxInlineSize", js.undefined)
      
      inline def setWebkitOrder(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitOrder' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.Order | undefined */ js.Any
      ): Self = StObject.set(x, "WebkitOrder", value.asInstanceOf[js.Any])
      
      inline def setWebkitOrderUndefined: Self = StObject.set(x, "WebkitOrder", js.undefined)
      
      inline def setWebkitOverflowScrolling(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitOverflowScrolling' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.WebkitOverflowScrolling | undefined */ js.Any
      ): Self = StObject.set(x, "WebkitOverflowScrolling", value.asInstanceOf[js.Any])
      
      inline def setWebkitOverflowScrollingUndefined: Self = StObject.set(x, "WebkitOverflowScrolling", js.undefined)
      
      inline def setWebkitPaddingEnd(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitPaddingEnd' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.PaddingInlineEnd<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "WebkitPaddingEnd", value.asInstanceOf[js.Any])
      
      inline def setWebkitPaddingEndUndefined: Self = StObject.set(x, "WebkitPaddingEnd", js.undefined)
      
      inline def setWebkitPaddingStart(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitPaddingStart' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.PaddingInlineStart<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "WebkitPaddingStart", value.asInstanceOf[js.Any])
      
      inline def setWebkitPaddingStartUndefined: Self = StObject.set(x, "WebkitPaddingStart", js.undefined)
      
      inline def setWebkitPerspective(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitPerspective' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.Perspective<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "WebkitPerspective", value.asInstanceOf[js.Any])
      
      inline def setWebkitPerspectiveOrigin(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitPerspectiveOrigin' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.PerspectiveOrigin<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "WebkitPerspectiveOrigin", value.asInstanceOf[js.Any])
      
      inline def setWebkitPerspectiveOriginUndefined: Self = StObject.set(x, "WebkitPerspectiveOrigin", js.undefined)
      
      inline def setWebkitPerspectiveUndefined: Self = StObject.set(x, "WebkitPerspective", js.undefined)
      
      inline def setWebkitPrintColorAdjust(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitPrintColorAdjust' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.PrintColorAdjust | undefined */ js.Any
      ): Self = StObject.set(x, "WebkitPrintColorAdjust", value.asInstanceOf[js.Any])
      
      inline def setWebkitPrintColorAdjustUndefined: Self = StObject.set(x, "WebkitPrintColorAdjust", js.undefined)
      
      inline def setWebkitRubyPosition(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitRubyPosition' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.RubyPosition | undefined */ js.Any
      ): Self = StObject.set(x, "WebkitRubyPosition", value.asInstanceOf[js.Any])
      
      inline def setWebkitRubyPositionUndefined: Self = StObject.set(x, "WebkitRubyPosition", js.undefined)
      
      inline def setWebkitScrollSnapPointsX(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitScrollSnapPointsX' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.ScrollSnapPointsX | undefined */ js.Any
      ): Self = StObject.set(x, "WebkitScrollSnapPointsX", value.asInstanceOf[js.Any])
      
      inline def setWebkitScrollSnapPointsXUndefined: Self = StObject.set(x, "WebkitScrollSnapPointsX", js.undefined)
      
      inline def setWebkitScrollSnapPointsY(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitScrollSnapPointsY' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.ScrollSnapPointsY | undefined */ js.Any
      ): Self = StObject.set(x, "WebkitScrollSnapPointsY", value.asInstanceOf[js.Any])
      
      inline def setWebkitScrollSnapPointsYUndefined: Self = StObject.set(x, "WebkitScrollSnapPointsY", js.undefined)
      
      inline def setWebkitScrollSnapType(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitScrollSnapType' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.ScrollSnapType | undefined */ js.Any
      ): Self = StObject.set(x, "WebkitScrollSnapType", value.asInstanceOf[js.Any])
      
      inline def setWebkitScrollSnapTypeUndefined: Self = StObject.set(x, "WebkitScrollSnapType", js.undefined)
      
      inline def setWebkitShapeMargin(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitShapeMargin' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.ShapeMargin<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "WebkitShapeMargin", value.asInstanceOf[js.Any])
      
      inline def setWebkitShapeMarginUndefined: Self = StObject.set(x, "WebkitShapeMargin", js.undefined)
      
      inline def setWebkitTapHighlightColor(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitTapHighlightColor' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.WebkitTapHighlightColor | undefined */ js.Any
      ): Self = StObject.set(x, "WebkitTapHighlightColor", value.asInstanceOf[js.Any])
      
      inline def setWebkitTapHighlightColorUndefined: Self = StObject.set(x, "WebkitTapHighlightColor", js.undefined)
      
      inline def setWebkitTextCombine(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitTextCombine' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.TextCombineUpright | undefined */ js.Any
      ): Self = StObject.set(x, "WebkitTextCombine", value.asInstanceOf[js.Any])
      
      inline def setWebkitTextCombineUndefined: Self = StObject.set(x, "WebkitTextCombine", js.undefined)
      
      inline def setWebkitTextDecorationColor(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitTextDecorationColor' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.TextDecorationColor | undefined */ js.Any
      ): Self = StObject.set(x, "WebkitTextDecorationColor", value.asInstanceOf[js.Any])
      
      inline def setWebkitTextDecorationColorUndefined: Self = StObject.set(x, "WebkitTextDecorationColor", js.undefined)
      
      inline def setWebkitTextDecorationLine(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitTextDecorationLine' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.TextDecorationLine | undefined */ js.Any
      ): Self = StObject.set(x, "WebkitTextDecorationLine", value.asInstanceOf[js.Any])
      
      inline def setWebkitTextDecorationLineUndefined: Self = StObject.set(x, "WebkitTextDecorationLine", js.undefined)
      
      inline def setWebkitTextDecorationSkip(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitTextDecorationSkip' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.TextDecorationSkip | undefined */ js.Any
      ): Self = StObject.set(x, "WebkitTextDecorationSkip", value.asInstanceOf[js.Any])
      
      inline def setWebkitTextDecorationSkipUndefined: Self = StObject.set(x, "WebkitTextDecorationSkip", js.undefined)
      
      inline def setWebkitTextDecorationStyle(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitTextDecorationStyle' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.TextDecorationStyle | undefined */ js.Any
      ): Self = StObject.set(x, "WebkitTextDecorationStyle", value.asInstanceOf[js.Any])
      
      inline def setWebkitTextDecorationStyleUndefined: Self = StObject.set(x, "WebkitTextDecorationStyle", js.undefined)
      
      inline def setWebkitTextEmphasis(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitTextEmphasis' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.TextEmphasis | undefined */ js.Any
      ): Self = StObject.set(x, "WebkitTextEmphasis", value.asInstanceOf[js.Any])
      
      inline def setWebkitTextEmphasisColor(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitTextEmphasisColor' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.TextEmphasisColor | undefined */ js.Any
      ): Self = StObject.set(x, "WebkitTextEmphasisColor", value.asInstanceOf[js.Any])
      
      inline def setWebkitTextEmphasisColorUndefined: Self = StObject.set(x, "WebkitTextEmphasisColor", js.undefined)
      
      inline def setWebkitTextEmphasisPosition(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitTextEmphasisPosition' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.TextEmphasisPosition | undefined */ js.Any
      ): Self = StObject.set(x, "WebkitTextEmphasisPosition", value.asInstanceOf[js.Any])
      
      inline def setWebkitTextEmphasisPositionUndefined: Self = StObject.set(x, "WebkitTextEmphasisPosition", js.undefined)
      
      inline def setWebkitTextEmphasisStyle(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitTextEmphasisStyle' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.TextEmphasisStyle | undefined */ js.Any
      ): Self = StObject.set(x, "WebkitTextEmphasisStyle", value.asInstanceOf[js.Any])
      
      inline def setWebkitTextEmphasisStyleUndefined: Self = StObject.set(x, "WebkitTextEmphasisStyle", js.undefined)
      
      inline def setWebkitTextEmphasisUndefined: Self = StObject.set(x, "WebkitTextEmphasis", js.undefined)
      
      inline def setWebkitTextFillColor(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitTextFillColor' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.WebkitTextFillColor | undefined */ js.Any
      ): Self = StObject.set(x, "WebkitTextFillColor", value.asInstanceOf[js.Any])
      
      inline def setWebkitTextFillColorUndefined: Self = StObject.set(x, "WebkitTextFillColor", js.undefined)
      
      inline def setWebkitTextOrientation(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitTextOrientation' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.TextOrientation | undefined */ js.Any
      ): Self = StObject.set(x, "WebkitTextOrientation", value.asInstanceOf[js.Any])
      
      inline def setWebkitTextOrientationUndefined: Self = StObject.set(x, "WebkitTextOrientation", js.undefined)
      
      inline def setWebkitTextSizeAdjust(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitTextSizeAdjust' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.TextSizeAdjust | undefined */ js.Any
      ): Self = StObject.set(x, "WebkitTextSizeAdjust", value.asInstanceOf[js.Any])
      
      inline def setWebkitTextSizeAdjustUndefined: Self = StObject.set(x, "WebkitTextSizeAdjust", js.undefined)
      
      inline def setWebkitTextStroke(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitTextStroke' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.WebkitTextStroke<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "WebkitTextStroke", value.asInstanceOf[js.Any])
      
      inline def setWebkitTextStrokeColor(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitTextStrokeColor' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.WebkitTextStrokeColor | undefined */ js.Any
      ): Self = StObject.set(x, "WebkitTextStrokeColor", value.asInstanceOf[js.Any])
      
      inline def setWebkitTextStrokeColorUndefined: Self = StObject.set(x, "WebkitTextStrokeColor", js.undefined)
      
      inline def setWebkitTextStrokeUndefined: Self = StObject.set(x, "WebkitTextStroke", js.undefined)
      
      inline def setWebkitTextStrokeWidth(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitTextStrokeWidth' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.WebkitTextStrokeWidth<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "WebkitTextStrokeWidth", value.asInstanceOf[js.Any])
      
      inline def setWebkitTextStrokeWidthUndefined: Self = StObject.set(x, "WebkitTextStrokeWidth", js.undefined)
      
      inline def setWebkitTextUnderlinePosition(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitTextUnderlinePosition' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.TextUnderlinePosition | undefined */ js.Any
      ): Self = StObject.set(x, "WebkitTextUnderlinePosition", value.asInstanceOf[js.Any])
      
      inline def setWebkitTextUnderlinePositionUndefined: Self = StObject.set(x, "WebkitTextUnderlinePosition", js.undefined)
      
      inline def setWebkitTouchCallout(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitTouchCallout' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.WebkitTouchCallout | undefined */ js.Any
      ): Self = StObject.set(x, "WebkitTouchCallout", value.asInstanceOf[js.Any])
      
      inline def setWebkitTouchCalloutUndefined: Self = StObject.set(x, "WebkitTouchCallout", js.undefined)
      
      inline def setWebkitTransform(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitTransform' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.Transform | undefined */ js.Any
      ): Self = StObject.set(x, "WebkitTransform", value.asInstanceOf[js.Any])
      
      inline def setWebkitTransformOrigin(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitTransformOrigin' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.TransformOrigin<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "WebkitTransformOrigin", value.asInstanceOf[js.Any])
      
      inline def setWebkitTransformOriginUndefined: Self = StObject.set(x, "WebkitTransformOrigin", js.undefined)
      
      inline def setWebkitTransformStyle(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitTransformStyle' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.TransformStyle | undefined */ js.Any
      ): Self = StObject.set(x, "WebkitTransformStyle", value.asInstanceOf[js.Any])
      
      inline def setWebkitTransformStyleUndefined: Self = StObject.set(x, "WebkitTransformStyle", js.undefined)
      
      inline def setWebkitTransformUndefined: Self = StObject.set(x, "WebkitTransform", js.undefined)
      
      inline def setWebkitTransition(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitTransition' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.Transition<string & {}> | undefined */ js.Any
      ): Self = StObject.set(x, "WebkitTransition", value.asInstanceOf[js.Any])
      
      inline def setWebkitTransitionDelay(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitTransitionDelay' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.TransitionDelay<string & {}> | undefined */ js.Any
      ): Self = StObject.set(x, "WebkitTransitionDelay", value.asInstanceOf[js.Any])
      
      inline def setWebkitTransitionDelayUndefined: Self = StObject.set(x, "WebkitTransitionDelay", js.undefined)
      
      inline def setWebkitTransitionDuration(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitTransitionDuration' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.TransitionDuration<string & {}> | undefined */ js.Any
      ): Self = StObject.set(x, "WebkitTransitionDuration", value.asInstanceOf[js.Any])
      
      inline def setWebkitTransitionDurationUndefined: Self = StObject.set(x, "WebkitTransitionDuration", js.undefined)
      
      inline def setWebkitTransitionProperty(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitTransitionProperty' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.TransitionProperty | undefined */ js.Any
      ): Self = StObject.set(x, "WebkitTransitionProperty", value.asInstanceOf[js.Any])
      
      inline def setWebkitTransitionPropertyUndefined: Self = StObject.set(x, "WebkitTransitionProperty", js.undefined)
      
      inline def setWebkitTransitionTimingFunction(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitTransitionTimingFunction' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.TransitionTimingFunction | undefined */ js.Any
      ): Self = StObject.set(x, "WebkitTransitionTimingFunction", value.asInstanceOf[js.Any])
      
      inline def setWebkitTransitionTimingFunctionUndefined: Self = StObject.set(x, "WebkitTransitionTimingFunction", js.undefined)
      
      inline def setWebkitTransitionUndefined: Self = StObject.set(x, "WebkitTransition", js.undefined)
      
      inline def setWebkitUserModify(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitUserModify' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.WebkitUserModify | undefined */ js.Any
      ): Self = StObject.set(x, "WebkitUserModify", value.asInstanceOf[js.Any])
      
      inline def setWebkitUserModifyUndefined: Self = StObject.set(x, "WebkitUserModify", js.undefined)
      
      inline def setWebkitUserSelect(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitUserSelect' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.UserSelect | undefined */ js.Any
      ): Self = StObject.set(x, "WebkitUserSelect", value.asInstanceOf[js.Any])
      
      inline def setWebkitUserSelectUndefined: Self = StObject.set(x, "WebkitUserSelect", js.undefined)
      
      inline def setWebkitWritingMode(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'WebkitWritingMode' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.WritingMode | undefined */ js.Any
      ): Self = StObject.set(x, "WebkitWritingMode", value.asInstanceOf[js.Any])
      
      inline def setWebkitWritingModeUndefined: Self = StObject.set(x, "WebkitWritingMode", js.undefined)
      
      inline def setWhiteSpace(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'whiteSpace' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.WhiteSpace | undefined */ js.Any
      ): Self = StObject.set(x, "whiteSpace", value.asInstanceOf[js.Any])
      
      inline def setWhiteSpaceUndefined: Self = StObject.set(x, "whiteSpace", js.undefined)
      
      inline def setWidows(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'widows' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.Widows | undefined */ js.Any
      ): Self = StObject.set(x, "widows", value.asInstanceOf[js.Any])
      
      inline def setWidowsUndefined: Self = StObject.set(x, "widows", js.undefined)
      
      inline def setWidth(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'width' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.Width<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      inline def setWillChange(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'willChange' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.WillChange | undefined */ js.Any
      ): Self = StObject.set(x, "willChange", value.asInstanceOf[js.Any])
      
      inline def setWillChangeUndefined: Self = StObject.set(x, "willChange", js.undefined)
      
      inline def setWordBreak(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'wordBreak' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.WordBreak | undefined */ js.Any
      ): Self = StObject.set(x, "wordBreak", value.asInstanceOf[js.Any])
      
      inline def setWordBreakUndefined: Self = StObject.set(x, "wordBreak", js.undefined)
      
      inline def setWordSpacing(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'wordSpacing' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.WordSpacing<string | number> | undefined */ js.Any
      ): Self = StObject.set(x, "wordSpacing", value.asInstanceOf[js.Any])
      
      inline def setWordSpacingUndefined: Self = StObject.set(x, "wordSpacing", js.undefined)
      
      inline def setWordWrap(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'wordWrap' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.WordWrap | undefined */ js.Any
      ): Self = StObject.set(x, "wordWrap", value.asInstanceOf[js.Any])
      
      inline def setWordWrapUndefined: Self = StObject.set(x, "wordWrap", js.undefined)
      
      inline def setWritingMode(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'writingMode' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.WritingMode | undefined */ js.Any
      ): Self = StObject.set(x, "writingMode", value.asInstanceOf[js.Any])
      
      inline def setWritingModeUndefined: Self = StObject.set(x, "writingMode", js.undefined)
      
      inline def setX(value: Length): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      inline def setY(value: Length): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
      
      inline def setZ(value: Length): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
      
      inline def setZIndex(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'zIndex' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.ZIndex | undefined */ js.Any
      ): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
      
      inline def setZUndefined: Self = StObject.set(x, "z", js.undefined)
      
      inline def setZoom(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'zoom' extends keyof @react-spring/web.@react-spring/web/dist/declarations/src/animated.TransformProps ? any | undefined : csstype.csstype.Property.Zoom | undefined */ js.Any
      ): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
      
      inline def setZoomUndefined: Self = StObject.set(x, "zoom", js.undefined)
    }
  }
  
  trait TransformProps extends StObject {
    
    var matrix: js.UndefOr[js.Tuple6[Double, Double, Double, Double, Double, Double]] = js.undefined
    
    var matrix3d: js.UndefOr[
        js.Tuple16[
          Double, 
          Double, 
          Double, 
          Double, 
          Double, 
          Double, 
          Double, 
          Double, 
          Double, 
          Double, 
          Double, 
          Double, 
          Double, 
          Double, 
          Double, 
          Double
        ]
      ] = js.undefined
    
    var rotate: js.UndefOr[Angle] = js.undefined
    
    var rotate3d: js.UndefOr[js.Tuple4[Double, Double, Double, Angle]] = js.undefined
    
    var rotateX: js.UndefOr[Angle] = js.undefined
    
    var rotateY: js.UndefOr[Angle] = js.undefined
    
    var rotateZ: js.UndefOr[Angle] = js.undefined
    
    var scale: js.UndefOr[Double | (js.Tuple2[Double, Double]) | String] = js.undefined
    
    var scale3d: js.UndefOr[js.Tuple3[Double, Double, Double]] = js.undefined
    
    var scaleX: js.UndefOr[Double] = js.undefined
    
    var scaleY: js.UndefOr[Double] = js.undefined
    
    var scaleZ: js.UndefOr[Double] = js.undefined
    
    var skew: js.UndefOr[Angle | (js.Tuple2[Angle, Angle])] = js.undefined
    
    var skewX: js.UndefOr[Angle] = js.undefined
    
    var skewY: js.UndefOr[Angle] = js.undefined
    
    var transform: js.UndefOr[String] = js.undefined
    
    var translate: js.UndefOr[Length | (js.Tuple2[Length, Length])] = js.undefined
    
    var translate3d: js.UndefOr[js.Tuple3[Length, Length, Length]] = js.undefined
    
    var translateX: js.UndefOr[Length] = js.undefined
    
    var translateY: js.UndefOr[Length] = js.undefined
    
    var translateZ: js.UndefOr[Length] = js.undefined
    
    var x: js.UndefOr[Length] = js.undefined
    
    var y: js.UndefOr[Length] = js.undefined
    
    var z: js.UndefOr[Length] = js.undefined
  }
  object TransformProps {
    
    inline def apply(): TransformProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TransformProps]
    }
    
    extension [Self <: TransformProps](x: Self) {
      
      inline def setMatrix(value: js.Tuple6[Double, Double, Double, Double, Double, Double]): Self = StObject.set(x, "matrix", value.asInstanceOf[js.Any])
      
      inline def setMatrix3d(
        value: js.Tuple16[
              Double, 
              Double, 
              Double, 
              Double, 
              Double, 
              Double, 
              Double, 
              Double, 
              Double, 
              Double, 
              Double, 
              Double, 
              Double, 
              Double, 
              Double, 
              Double
            ]
      ): Self = StObject.set(x, "matrix3d", value.asInstanceOf[js.Any])
      
      inline def setMatrix3dUndefined: Self = StObject.set(x, "matrix3d", js.undefined)
      
      inline def setMatrixUndefined: Self = StObject.set(x, "matrix", js.undefined)
      
      inline def setRotate(value: Angle): Self = StObject.set(x, "rotate", value.asInstanceOf[js.Any])
      
      inline def setRotate3d(value: js.Tuple4[Double, Double, Double, Angle]): Self = StObject.set(x, "rotate3d", value.asInstanceOf[js.Any])
      
      inline def setRotate3dUndefined: Self = StObject.set(x, "rotate3d", js.undefined)
      
      inline def setRotateUndefined: Self = StObject.set(x, "rotate", js.undefined)
      
      inline def setRotateX(value: Angle): Self = StObject.set(x, "rotateX", value.asInstanceOf[js.Any])
      
      inline def setRotateXUndefined: Self = StObject.set(x, "rotateX", js.undefined)
      
      inline def setRotateY(value: Angle): Self = StObject.set(x, "rotateY", value.asInstanceOf[js.Any])
      
      inline def setRotateYUndefined: Self = StObject.set(x, "rotateY", js.undefined)
      
      inline def setRotateZ(value: Angle): Self = StObject.set(x, "rotateZ", value.asInstanceOf[js.Any])
      
      inline def setRotateZUndefined: Self = StObject.set(x, "rotateZ", js.undefined)
      
      inline def setScale(value: Double | (js.Tuple2[Double, Double]) | String): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      inline def setScale3d(value: js.Tuple3[Double, Double, Double]): Self = StObject.set(x, "scale3d", value.asInstanceOf[js.Any])
      
      inline def setScale3dUndefined: Self = StObject.set(x, "scale3d", js.undefined)
      
      inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
      
      inline def setScaleX(value: Double): Self = StObject.set(x, "scaleX", value.asInstanceOf[js.Any])
      
      inline def setScaleXUndefined: Self = StObject.set(x, "scaleX", js.undefined)
      
      inline def setScaleY(value: Double): Self = StObject.set(x, "scaleY", value.asInstanceOf[js.Any])
      
      inline def setScaleYUndefined: Self = StObject.set(x, "scaleY", js.undefined)
      
      inline def setScaleZ(value: Double): Self = StObject.set(x, "scaleZ", value.asInstanceOf[js.Any])
      
      inline def setScaleZUndefined: Self = StObject.set(x, "scaleZ", js.undefined)
      
      inline def setSkew(value: Angle | (js.Tuple2[Angle, Angle])): Self = StObject.set(x, "skew", value.asInstanceOf[js.Any])
      
      inline def setSkewUndefined: Self = StObject.set(x, "skew", js.undefined)
      
      inline def setSkewX(value: Angle): Self = StObject.set(x, "skewX", value.asInstanceOf[js.Any])
      
      inline def setSkewXUndefined: Self = StObject.set(x, "skewX", js.undefined)
      
      inline def setSkewY(value: Angle): Self = StObject.set(x, "skewY", value.asInstanceOf[js.Any])
      
      inline def setSkewYUndefined: Self = StObject.set(x, "skewY", js.undefined)
      
      inline def setTransform(value: String): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
      
      inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
      
      inline def setTranslate(value: Length | (js.Tuple2[Length, Length])): Self = StObject.set(x, "translate", value.asInstanceOf[js.Any])
      
      inline def setTranslate3d(value: js.Tuple3[Length, Length, Length]): Self = StObject.set(x, "translate3d", value.asInstanceOf[js.Any])
      
      inline def setTranslate3dUndefined: Self = StObject.set(x, "translate3d", js.undefined)
      
      inline def setTranslateUndefined: Self = StObject.set(x, "translate", js.undefined)
      
      inline def setTranslateX(value: Length): Self = StObject.set(x, "translateX", value.asInstanceOf[js.Any])
      
      inline def setTranslateXUndefined: Self = StObject.set(x, "translateX", js.undefined)
      
      inline def setTranslateY(value: Length): Self = StObject.set(x, "translateY", value.asInstanceOf[js.Any])
      
      inline def setTranslateYUndefined: Self = StObject.set(x, "translateY", js.undefined)
      
      inline def setTranslateZ(value: Length): Self = StObject.set(x, "translateZ", value.asInstanceOf[js.Any])
      
      inline def setTranslateZUndefined: Self = StObject.set(x, "translateZ", js.undefined)
      
      inline def setX(value: Length): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      inline def setY(value: Length): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
      
      inline def setZ(value: Length): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
      
      inline def setZUndefined: Self = StObject.set(x, "z", js.undefined)
    }
  }
  
  type ValidStyleProps[T /* <: js.Object */] = /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof T & @react-spring/web.@react-spring/web/dist/declarations/src/animated.StylePropKeys ]: T[P] extends @react-spring/web.@react-spring/web/dist/declarations/src/animated.StyleProps[P]? P : never}[keyof T & @react-spring/web.@react-spring/web/dist/declarations/src/animated.StylePropKeys] */ js.Any
  
  type WithAnimated = (js.Function1[/* wrappedComponent */ ElementType, AnimatedComponent[ElementType]]) & AnimatedPrimitives
}
