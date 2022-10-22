package typingsJapgolly.styledComponents

import japgolly.scalajs.react.facade.React.ComponentClassP
import typingsJapgolly.react.mod.FunctionComponent
import typingsJapgolly.std.ReturnType
import typingsJapgolly.styledComponents.nativeDistDistTypesMod.ExoticComponentWithDisplayName
import typingsJapgolly.styledComponents.nativeDistDistTypesMod.IStyledComponentFactory
import typingsJapgolly.styledComponents.nativeDistDistTypesMod.RuleSet
import typingsJapgolly.styledComponents.nativeDistDistTypesMod.StyledOptions
import typingsJapgolly.styledComponents.styledComponentsStrings.`object`
import typingsJapgolly.styledComponents.styledComponentsStrings.`var`
import typingsJapgolly.styledComponents.styledComponentsStrings.a
import typingsJapgolly.styledComponents.styledComponentsStrings.abbr
import typingsJapgolly.styledComponents.styledComponentsStrings.address
import typingsJapgolly.styledComponents.styledComponentsStrings.animate
import typingsJapgolly.styledComponents.styledComponentsStrings.animateMotion
import typingsJapgolly.styledComponents.styledComponentsStrings.animateTransform
import typingsJapgolly.styledComponents.styledComponentsStrings.area
import typingsJapgolly.styledComponents.styledComponentsStrings.article
import typingsJapgolly.styledComponents.styledComponentsStrings.aside
import typingsJapgolly.styledComponents.styledComponentsStrings.audio
import typingsJapgolly.styledComponents.styledComponentsStrings.b
import typingsJapgolly.styledComponents.styledComponentsStrings.base
import typingsJapgolly.styledComponents.styledComponentsStrings.bdi
import typingsJapgolly.styledComponents.styledComponentsStrings.bdo
import typingsJapgolly.styledComponents.styledComponentsStrings.big
import typingsJapgolly.styledComponents.styledComponentsStrings.blockquote
import typingsJapgolly.styledComponents.styledComponentsStrings.body
import typingsJapgolly.styledComponents.styledComponentsStrings.br
import typingsJapgolly.styledComponents.styledComponentsStrings.button
import typingsJapgolly.styledComponents.styledComponentsStrings.canvas
import typingsJapgolly.styledComponents.styledComponentsStrings.caption
import typingsJapgolly.styledComponents.styledComponentsStrings.circle
import typingsJapgolly.styledComponents.styledComponentsStrings.cite
import typingsJapgolly.styledComponents.styledComponentsStrings.clipPath
import typingsJapgolly.styledComponents.styledComponentsStrings.code
import typingsJapgolly.styledComponents.styledComponentsStrings.col
import typingsJapgolly.styledComponents.styledComponentsStrings.colgroup
import typingsJapgolly.styledComponents.styledComponentsStrings.data
import typingsJapgolly.styledComponents.styledComponentsStrings.datalist
import typingsJapgolly.styledComponents.styledComponentsStrings.dd
import typingsJapgolly.styledComponents.styledComponentsStrings.defs
import typingsJapgolly.styledComponents.styledComponentsStrings.del
import typingsJapgolly.styledComponents.styledComponentsStrings.desc
import typingsJapgolly.styledComponents.styledComponentsStrings.details
import typingsJapgolly.styledComponents.styledComponentsStrings.dfn
import typingsJapgolly.styledComponents.styledComponentsStrings.dialog
import typingsJapgolly.styledComponents.styledComponentsStrings.div
import typingsJapgolly.styledComponents.styledComponentsStrings.dl
import typingsJapgolly.styledComponents.styledComponentsStrings.dt
import typingsJapgolly.styledComponents.styledComponentsStrings.ellipse
import typingsJapgolly.styledComponents.styledComponentsStrings.em
import typingsJapgolly.styledComponents.styledComponentsStrings.embed
import typingsJapgolly.styledComponents.styledComponentsStrings.feBlend
import typingsJapgolly.styledComponents.styledComponentsStrings.feColorMatrix
import typingsJapgolly.styledComponents.styledComponentsStrings.feComponentTransfer
import typingsJapgolly.styledComponents.styledComponentsStrings.feComposite
import typingsJapgolly.styledComponents.styledComponentsStrings.feConvolveMatrix
import typingsJapgolly.styledComponents.styledComponentsStrings.feDiffuseLighting
import typingsJapgolly.styledComponents.styledComponentsStrings.feDisplacementMap
import typingsJapgolly.styledComponents.styledComponentsStrings.feDistantLight
import typingsJapgolly.styledComponents.styledComponentsStrings.feDropShadow
import typingsJapgolly.styledComponents.styledComponentsStrings.feFlood
import typingsJapgolly.styledComponents.styledComponentsStrings.feFuncA
import typingsJapgolly.styledComponents.styledComponentsStrings.feFuncB
import typingsJapgolly.styledComponents.styledComponentsStrings.feFuncG
import typingsJapgolly.styledComponents.styledComponentsStrings.feFuncR
import typingsJapgolly.styledComponents.styledComponentsStrings.feGaussianBlur
import typingsJapgolly.styledComponents.styledComponentsStrings.feImage
import typingsJapgolly.styledComponents.styledComponentsStrings.feMerge
import typingsJapgolly.styledComponents.styledComponentsStrings.feMergeNode
import typingsJapgolly.styledComponents.styledComponentsStrings.feMorphology
import typingsJapgolly.styledComponents.styledComponentsStrings.feOffset
import typingsJapgolly.styledComponents.styledComponentsStrings.fePointLight
import typingsJapgolly.styledComponents.styledComponentsStrings.feSpecularLighting
import typingsJapgolly.styledComponents.styledComponentsStrings.feSpotLight
import typingsJapgolly.styledComponents.styledComponentsStrings.feTile
import typingsJapgolly.styledComponents.styledComponentsStrings.feTurbulence
import typingsJapgolly.styledComponents.styledComponentsStrings.fieldset
import typingsJapgolly.styledComponents.styledComponentsStrings.figcaption
import typingsJapgolly.styledComponents.styledComponentsStrings.figure
import typingsJapgolly.styledComponents.styledComponentsStrings.filter
import typingsJapgolly.styledComponents.styledComponentsStrings.footer
import typingsJapgolly.styledComponents.styledComponentsStrings.foreignObject
import typingsJapgolly.styledComponents.styledComponentsStrings.form
import typingsJapgolly.styledComponents.styledComponentsStrings.g
import typingsJapgolly.styledComponents.styledComponentsStrings.h1
import typingsJapgolly.styledComponents.styledComponentsStrings.h2
import typingsJapgolly.styledComponents.styledComponentsStrings.h3
import typingsJapgolly.styledComponents.styledComponentsStrings.h4
import typingsJapgolly.styledComponents.styledComponentsStrings.h5
import typingsJapgolly.styledComponents.styledComponentsStrings.h6
import typingsJapgolly.styledComponents.styledComponentsStrings.head
import typingsJapgolly.styledComponents.styledComponentsStrings.header
import typingsJapgolly.styledComponents.styledComponentsStrings.hgroup
import typingsJapgolly.styledComponents.styledComponentsStrings.hr
import typingsJapgolly.styledComponents.styledComponentsStrings.html
import typingsJapgolly.styledComponents.styledComponentsStrings.i
import typingsJapgolly.styledComponents.styledComponentsStrings.iframe
import typingsJapgolly.styledComponents.styledComponentsStrings.image
import typingsJapgolly.styledComponents.styledComponentsStrings.img
import typingsJapgolly.styledComponents.styledComponentsStrings.input
import typingsJapgolly.styledComponents.styledComponentsStrings.ins
import typingsJapgolly.styledComponents.styledComponentsStrings.kbd
import typingsJapgolly.styledComponents.styledComponentsStrings.keygen
import typingsJapgolly.styledComponents.styledComponentsStrings.label
import typingsJapgolly.styledComponents.styledComponentsStrings.legend
import typingsJapgolly.styledComponents.styledComponentsStrings.li
import typingsJapgolly.styledComponents.styledComponentsStrings.line
import typingsJapgolly.styledComponents.styledComponentsStrings.linearGradient
import typingsJapgolly.styledComponents.styledComponentsStrings.link
import typingsJapgolly.styledComponents.styledComponentsStrings.main
import typingsJapgolly.styledComponents.styledComponentsStrings.map
import typingsJapgolly.styledComponents.styledComponentsStrings.mark
import typingsJapgolly.styledComponents.styledComponentsStrings.marker
import typingsJapgolly.styledComponents.styledComponentsStrings.mask
import typingsJapgolly.styledComponents.styledComponentsStrings.menu
import typingsJapgolly.styledComponents.styledComponentsStrings.menuitem
import typingsJapgolly.styledComponents.styledComponentsStrings.meta
import typingsJapgolly.styledComponents.styledComponentsStrings.metadata
import typingsJapgolly.styledComponents.styledComponentsStrings.meter
import typingsJapgolly.styledComponents.styledComponentsStrings.mpath
import typingsJapgolly.styledComponents.styledComponentsStrings.nav
import typingsJapgolly.styledComponents.styledComponentsStrings.noindex
import typingsJapgolly.styledComponents.styledComponentsStrings.noscript
import typingsJapgolly.styledComponents.styledComponentsStrings.ol
import typingsJapgolly.styledComponents.styledComponentsStrings.optgroup
import typingsJapgolly.styledComponents.styledComponentsStrings.option
import typingsJapgolly.styledComponents.styledComponentsStrings.output
import typingsJapgolly.styledComponents.styledComponentsStrings.p
import typingsJapgolly.styledComponents.styledComponentsStrings.param
import typingsJapgolly.styledComponents.styledComponentsStrings.path
import typingsJapgolly.styledComponents.styledComponentsStrings.pattern
import typingsJapgolly.styledComponents.styledComponentsStrings.picture
import typingsJapgolly.styledComponents.styledComponentsStrings.polygon
import typingsJapgolly.styledComponents.styledComponentsStrings.polyline
import typingsJapgolly.styledComponents.styledComponentsStrings.pre
import typingsJapgolly.styledComponents.styledComponentsStrings.progress
import typingsJapgolly.styledComponents.styledComponentsStrings.q
import typingsJapgolly.styledComponents.styledComponentsStrings.radialGradient
import typingsJapgolly.styledComponents.styledComponentsStrings.rect
import typingsJapgolly.styledComponents.styledComponentsStrings.rp
import typingsJapgolly.styledComponents.styledComponentsStrings.rt
import typingsJapgolly.styledComponents.styledComponentsStrings.ruby
import typingsJapgolly.styledComponents.styledComponentsStrings.s
import typingsJapgolly.styledComponents.styledComponentsStrings.samp
import typingsJapgolly.styledComponents.styledComponentsStrings.script
import typingsJapgolly.styledComponents.styledComponentsStrings.section
import typingsJapgolly.styledComponents.styledComponentsStrings.select
import typingsJapgolly.styledComponents.styledComponentsStrings.slot
import typingsJapgolly.styledComponents.styledComponentsStrings.small
import typingsJapgolly.styledComponents.styledComponentsStrings.source
import typingsJapgolly.styledComponents.styledComponentsStrings.span
import typingsJapgolly.styledComponents.styledComponentsStrings.stop
import typingsJapgolly.styledComponents.styledComponentsStrings.strong
import typingsJapgolly.styledComponents.styledComponentsStrings.style
import typingsJapgolly.styledComponents.styledComponentsStrings.sub
import typingsJapgolly.styledComponents.styledComponentsStrings.summary
import typingsJapgolly.styledComponents.styledComponentsStrings.sup
import typingsJapgolly.styledComponents.styledComponentsStrings.svg
import typingsJapgolly.styledComponents.styledComponentsStrings.switch
import typingsJapgolly.styledComponents.styledComponentsStrings.symbol
import typingsJapgolly.styledComponents.styledComponentsStrings.table
import typingsJapgolly.styledComponents.styledComponentsStrings.tbody
import typingsJapgolly.styledComponents.styledComponentsStrings.td
import typingsJapgolly.styledComponents.styledComponentsStrings.template
import typingsJapgolly.styledComponents.styledComponentsStrings.text
import typingsJapgolly.styledComponents.styledComponentsStrings.textPath
import typingsJapgolly.styledComponents.styledComponentsStrings.textarea
import typingsJapgolly.styledComponents.styledComponentsStrings.tfoot
import typingsJapgolly.styledComponents.styledComponentsStrings.th
import typingsJapgolly.styledComponents.styledComponentsStrings.thead
import typingsJapgolly.styledComponents.styledComponentsStrings.time
import typingsJapgolly.styledComponents.styledComponentsStrings.title
import typingsJapgolly.styledComponents.styledComponentsStrings.tr
import typingsJapgolly.styledComponents.styledComponentsStrings.track
import typingsJapgolly.styledComponents.styledComponentsStrings.tspan
import typingsJapgolly.styledComponents.styledComponentsStrings.u
import typingsJapgolly.styledComponents.styledComponentsStrings.ul
import typingsJapgolly.styledComponents.styledComponentsStrings.use
import typingsJapgolly.styledComponents.styledComponentsStrings.video
import typingsJapgolly.styledComponents.styledComponentsStrings.view
import typingsJapgolly.styledComponents.styledComponentsStrings.wbr
import typingsJapgolly.styledComponents.styledComponentsStrings.webview
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nativeDistDistModelsStyledComponentMod {
  
  @JSImport("styled-components/native/dist/dist/models/StyledComponent", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[OuterProps, Statics](target: String, options: StyledOptions[OuterProps], rules: RuleSet[OuterProps]): ReturnType[IStyledComponentFactory[String, OuterProps, Statics]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[ReturnType[IStyledComponentFactory[String, OuterProps, Statics]]]
  inline def default[Target /* <: ExoticComponentWithDisplayName[Any] | (ComponentClassP[Any & js.Object]) | FunctionComponent[Any] */, OuterProps, Statics](target: Target, options: StyledOptions[OuterProps], rules: RuleSet[OuterProps]): ReturnType[IStyledComponentFactory[Target, OuterProps, Statics]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[ReturnType[IStyledComponentFactory[Target, OuterProps, Statics]]]
  
  inline def default_a[OuterProps, Statics](target: a, options: StyledOptions[OuterProps], rules: RuleSet[OuterProps]): ReturnType[IStyledComponentFactory[a, OuterProps, Statics]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[ReturnType[IStyledComponentFactory[a, OuterProps, Statics]]]
  
  inline def default_abbr[OuterProps, Statics](target: abbr, options: StyledOptions[OuterProps], rules: RuleSet[OuterProps]): ReturnType[IStyledComponentFactory[abbr, OuterProps, Statics]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[ReturnType[IStyledComponentFactory[abbr, OuterProps, Statics]]]
  
  inline def default_address[OuterProps, Statics](target: address, options: StyledOptions[OuterProps], rules: RuleSet[OuterProps]): ReturnType[IStyledComponentFactory[address, OuterProps, Statics]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[ReturnType[IStyledComponentFactory[address, OuterProps, Statics]]]
  
  inline def default_animate[OuterProps, Statics](target: animate, options: StyledOptions[OuterProps], rules: RuleSet[OuterProps]): ReturnType[IStyledComponentFactory[animate, OuterProps, Statics]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[ReturnType[IStyledComponentFactory[animate, OuterProps, Statics]]]
  
  inline def default_animateMotion[OuterProps, Statics](target: animateMotion, options: StyledOptions[OuterProps], rules: RuleSet[OuterProps]): ReturnType[IStyledComponentFactory[animateMotion, OuterProps, Statics]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[ReturnType[IStyledComponentFactory[animateMotion, OuterProps, Statics]]]
  
  inline def default_animateTransform[OuterProps, Statics](target: animateTransform, options: StyledOptions[OuterProps], rules: RuleSet[OuterProps]): ReturnType[IStyledComponentFactory[animateTransform, OuterProps, Statics]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[ReturnType[IStyledComponentFactory[animateTransform, OuterProps, Statics]]]
  
  inline def default_area[OuterProps, Statics](target: area, options: StyledOptions[OuterProps], rules: RuleSet[OuterProps]): ReturnType[IStyledComponentFactory[area, OuterProps, Statics]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[ReturnType[IStyledComponentFactory[area, OuterProps, Statics]]]
  
  inline def default_article[OuterProps, Statics](target: article, options: StyledOptions[OuterProps], rules: RuleSet[OuterProps]): ReturnType[IStyledComponentFactory[article, OuterProps, Statics]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[ReturnType[IStyledComponentFactory[article, OuterProps, Statics]]]
  
  inline def default_aside[OuterProps, Statics](target: aside, options: StyledOptions[OuterProps], rules: RuleSet[OuterProps]): ReturnType[IStyledComponentFactory[aside, OuterProps, Statics]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[ReturnType[IStyledComponentFactory[aside, OuterProps, Statics]]]
  
  inline def default_audio[OuterProps, Statics](target: audio, options: StyledOptions[OuterProps], rules: RuleSet[OuterProps]): ReturnType[IStyledComponentFactory[audio, OuterProps, Statics]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[ReturnType[IStyledComponentFactory[audio, OuterProps, Statics]]]
  
  inline def default_b[OuterProps, Statics](target: b, options: StyledOptions[OuterProps], rules: RuleSet[OuterProps]): ReturnType[IStyledComponentFactory[b, OuterProps, Statics]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[ReturnType[IStyledComponentFactory[b, OuterProps, Statics]]]
  
  inline def default_base[OuterProps, Statics](target: base, options: StyledOptions[OuterProps], rules: RuleSet[OuterProps]): ReturnType[IStyledComponentFactory[base, OuterProps, Statics]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[ReturnType[IStyledComponentFactory[base, OuterProps, Statics]]]
  
  inline def default_bdi[OuterProps, Statics](target: bdi, options: StyledOptions[OuterProps], rules: RuleSet[OuterProps]): ReturnType[IStyledComponentFactory[bdi, OuterProps, Statics]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[ReturnType[IStyledComponentFactory[bdi, OuterProps, Statics]]]
  
  inline def default_bdo[OuterProps, Statics](target: bdo, options: StyledOptions[OuterProps], rules: RuleSet[OuterProps]): ReturnType[IStyledComponentFactory[bdo, OuterProps, Statics]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[ReturnType[IStyledComponentFactory[bdo, OuterProps, Statics]]]
  
  inline def default_big[OuterProps, Statics](target: big, options: StyledOptions[OuterProps], rules: RuleSet[OuterProps]): ReturnType[IStyledComponentFactory[big, OuterProps, Statics]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[ReturnType[IStyledComponentFactory[big, OuterProps, Statics]]]
  
  inline def default_blockquote[OuterProps, Statics](target: blockquote, options: StyledOptions[OuterProps], rules: RuleSet[OuterProps]): ReturnType[IStyledComponentFactory[blockquote, OuterProps, Statics]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[ReturnType[IStyledComponentFactory[blockquote, OuterProps, Statics]]]
  
  inline def default_body[OuterProps, Statics](target: body, options: StyledOptions[OuterProps], rules: RuleSet[OuterProps]): ReturnType[IStyledComponentFactory[body, OuterProps, Statics]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[ReturnType[IStyledComponentFactory[body, OuterProps, Statics]]]
  
  inline def default_br[OuterProps, Statics](target: br, options: StyledOptions[OuterProps], rules: RuleSet[OuterProps]): ReturnType[IStyledComponentFactory[br, OuterProps, Statics]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[ReturnType[IStyledComponentFactory[br, OuterProps, Statics]]]
  
  inline def default_button[OuterProps, Statics](target: button, options: StyledOptions[OuterProps], rules: RuleSet[OuterProps]): ReturnType[IStyledComponentFactory[button, OuterProps, Statics]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[ReturnType[IStyledComponentFactory[button, OuterProps, Statics]]]
  
  inline def default_canvas[OuterProps, Statics](target: canvas, options: StyledOptions[OuterProps], rules: RuleSet[OuterProps]): ReturnType[IStyledComponentFactory[canvas, OuterProps, Statics]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[ReturnType[IStyledComponentFactory[canvas, OuterProps, Statics]]]
  
  inline def default_caption[OuterProps, Statics](target: caption, options: StyledOptions[OuterProps], rules: RuleSet[OuterProps]): ReturnType[IStyledComponentFactory[caption, OuterProps, Statics]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[ReturnType[IStyledComponentFactory[caption, OuterProps, Statics]]]
  
  inline def default_circle[OuterProps, Statics](target: circle, options: StyledOptions[OuterProps], rules: RuleSet[OuterProps]): ReturnType[IStyledComponentFactory[circle, OuterProps, Statics]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[ReturnType[IStyledComponentFactory[circle, OuterProps, Statics]]]
  
  inline def default_cite[OuterProps, Statics](target: cite, options: StyledOptions[OuterProps], rules: RuleSet[OuterProps]): ReturnType[IStyledComponentFactory[cite, OuterProps, Statics]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[ReturnType[IStyledComponentFactory[cite, OuterProps, Statics]]]
  
  inline def default_clipPath[OuterProps, Statics](target: clipPath, options: StyledOptions[OuterProps], rules: RuleSet[OuterProps]): ReturnType[IStyledComponentFactory[clipPath, OuterProps, Statics]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[ReturnType[IStyledComponentFactory[clipPath, OuterProps, Statics]]]
  
  inline def default_code[OuterProps, Statics](target: code, options: StyledOptions[OuterProps], rules: RuleSet[OuterProps]): ReturnType[IStyledComponentFactory[code, OuterProps, Statics]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[ReturnType[IStyledComponentFactory[code, OuterProps, Statics]]]
  
  inline def default_col[OuterProps, Statics](target: col, options: StyledOptions[OuterProps], rules: RuleSet[OuterProps]): ReturnType[IStyledComponentFactory[col, OuterProps, Statics]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[ReturnType[IStyledComponentFactory[col, OuterProps, Statics]]]
  
  inline def default_colgroup[OuterProps, Statics](target: colgroup, options: StyledOptions[OuterProps], rules: RuleSet[OuterProps]): ReturnType[IStyledComponentFactory[colgroup, OuterProps, Statics]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[ReturnType[IStyledComponentFactory[colgroup, OuterProps, Statics]]]
  
  inline def default_data[OuterProps, Statics](target: data, options: StyledOptions[OuterProps], rules: RuleSet[OuterProps]): ReturnType[IStyledComponentFactory[data, OuterProps, Statics]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[ReturnType[IStyledComponentFactory[data, OuterProps, Statics]]]
  
  inline def default_datalist[OuterProps, Statics](target: datalist, options: StyledOptions[OuterProps], rules: RuleSet[OuterProps]): ReturnType[IStyledComponentFactory[datalist, OuterProps, Statics]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[ReturnType[IStyledComponentFactory[datalist, OuterProps, Statics]]]
  
  inline def default_dd[OuterProps, Statics](target: dd, options: StyledOptions[OuterProps], rules: RuleSet[OuterProps]): ReturnType[IStyledComponentFactory[dd, OuterProps, Statics]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[ReturnType[IStyledComponentFactory[dd, OuterProps, Statics]]]
  
  inline def default_defs[OuterProps, Statics](target: defs, options: StyledOptions[OuterProps], rules: RuleSet[OuterProps]): ReturnType[IStyledComponentFactory[defs, OuterProps, Statics]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[ReturnType[IStyledComponentFactory[defs, OuterProps, Statics]]]
  
  inline def default_del[OuterProps, Statics](target: del, options: StyledOptions[OuterProps], rules: RuleSet[OuterProps]): ReturnType[IStyledComponentFactory[del, OuterProps, Statics]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[ReturnType[IStyledComponentFactory[del, OuterProps, Statics]]]
  
  inline def default_desc[OuterProps, Statics](target: desc, options: StyledOptions[OuterProps], rules: RuleSet[OuterProps]): ReturnType[IStyledComponentFactory[desc, OuterProps, Statics]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[ReturnType[IStyledComponentFactory[desc, OuterProps, Statics]]]
  
  inline def default_details[OuterProps, Statics](target: details, options: StyledOptions[OuterProps], rules: RuleSet[OuterProps]): ReturnType[IStyledComponentFactory[details, OuterProps, Statics]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[ReturnType[IStyledComponentFactory[details, OuterProps, Statics]]]
  
  inline def default_dfn[OuterProps, Statics](target: dfn, options: StyledOptions[OuterProps], rules: RuleSet[OuterProps]): ReturnType[IStyledComponentFactory[dfn, OuterProps, Statics]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[ReturnType[IStyledComponentFactory[dfn, OuterProps, Statics]]]
  
  inline def default_dialog[OuterProps, Statics](target: dialog, options: StyledOptions[OuterProps], rules: RuleSet[OuterProps]): ReturnType[IStyledComponentFactory[dialog, OuterProps, Statics]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[ReturnType[IStyledComponentFactory[dialog, OuterProps, Statics]]]
  
  inline def default_div[OuterProps, Statics](target: div, options: StyledOptions[OuterProps], rules: RuleSet[OuterProps]): ReturnType[IStyledComponentFactory[div, OuterProps, Statics]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[ReturnType[IStyledComponentFactory[div, OuterProps, Statics]]]
  
  inline def default_dl[OuterProps, Statics](target: dl, options: StyledOptions[OuterProps], rules: RuleSet[OuterProps]): ReturnType[IStyledComponentFactory[dl, OuterProps, Statics]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[ReturnType[IStyledComponentFactory[dl, OuterProps, Statics]]]
  
  inline def default_dt[OuterProps, Statics](target: dt, options: StyledOptions[OuterProps], rules: RuleSet[OuterProps]): ReturnType[IStyledComponentFactory[dt, OuterProps, Statics]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[ReturnType[IStyledComponentFactory[dt, OuterProps, Statics]]]
  
  inline def default_ellipse[OuterProps, Statics](target: ellipse, options: StyledOptions[OuterProps], rules: RuleSet[OuterProps]): ReturnType[IStyledComponentFactory[ellipse, OuterProps, Statics]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[ReturnType[IStyledComponentFactory[ellipse, OuterProps, Statics]]]
  
  inline def default_em[OuterProps, Statics](target: em, options: StyledOptions[OuterProps], rules: RuleSet[OuterProps]): ReturnType[IStyledComponentFactory[em, OuterProps, Statics]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[ReturnType[IStyledComponentFactory[em, OuterProps, Statics]]]
  
  inline def default_embed[OuterProps, Statics](target: embed, options: StyledOptions[OuterProps], rules: RuleSet[OuterProps]): ReturnType[IStyledComponentFactory[embed, OuterProps, Statics]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[ReturnType[IStyledComponentFactory[embed, OuterProps, Statics]]]
  
  inline def default_feBlend[OuterProps, Statics](target: feBlend, options: StyledOptions[OuterProps], rules: RuleSet[OuterProps]): ReturnType[IStyledComponentFactory[feBlend, OuterProps, Statics]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[ReturnType[IStyledComponentFactory[feBlend, OuterProps, Statics]]]
  
  inline def default_feColorMatrix[OuterProps, Statics](target: feColorMatrix, options: StyledOptions[OuterProps], rules: RuleSet[OuterProps]): ReturnType[IStyledComponentFactory[feColorMatrix, OuterProps, Statics]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[ReturnType[IStyledComponentFactory[feColorMatrix, OuterProps, Statics]]]
  
  inline def default_feComponentTransfer[OuterProps, Statics](target: feComponentTransfer, options: StyledOptions[OuterProps], rules: RuleSet[OuterProps]): ReturnType[IStyledComponentFactory[feComponentTransfer, OuterProps, Statics]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[ReturnType[IStyledComponentFactory[feComponentTransfer, OuterProps, Statics]]]
  
  inline def default_feComposite[OuterProps, Statics](target: feComposite, options: StyledOptions[OuterProps], rules: RuleSet[OuterProps]): ReturnType[IStyledComponentFactory[feComposite, OuterProps, Statics]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[ReturnType[IStyledComponentFactory[feComposite, OuterProps, Statics]]]
  
  inline def default_feConvolveMatrix[OuterProps, Statics](target: feConvolveMatrix, options: StyledOptions[OuterProps], rules: RuleSet[OuterProps]): ReturnType[IStyledComponentFactory[feConvolveMatrix, OuterProps, Statics]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[ReturnType[IStyledComponentFactory[feConvolveMatrix, OuterProps, Statics]]]
  
  inline def default_feDiffuseLighting[OuterProps, Statics](target: feDiffuseLighting, options: StyledOptions[OuterProps], rules: RuleSet[OuterProps]): ReturnType[IStyledComponentFactory[feDiffuseLighting, OuterProps, Statics]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[ReturnType[IStyledComponentFactory[feDiffuseLighting, OuterProps, Statics]]]
  
  inline def default_feDisplacementMap[OuterProps, Statics](target: feDisplacementMap, options: StyledOptions[OuterProps], rules: RuleSet[OuterProps]): ReturnType[IStyledComponentFactory[feDisplacementMap, OuterProps, Statics]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[ReturnType[IStyledComponentFactory[feDisplacementMap, OuterProps, Statics]]]
  
  inline def default_feDistantLight[OuterProps, Statics](target: feDistantLight, options: StyledOptions[OuterProps], rules: RuleSet[OuterProps]): ReturnType[IStyledComponentFactory[feDistantLight, OuterProps, Statics]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[ReturnType[IStyledComponentFactory[feDistantLight, OuterProps, Statics]]]
  
  inline def default_feDropShadow[OuterProps, Statics](target: feDropShadow, options: StyledOptions[OuterProps], rules: RuleSet[OuterProps]): ReturnType[IStyledComponentFactory[feDropShadow, OuterProps, Statics]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[ReturnType[IStyledComponentFactory[feDropShadow, OuterProps, Statics]]]
  
  inline def default_feFlood[OuterProps, Statics](target: feFlood, options: StyledOptions[OuterProps], rules: RuleSet[OuterProps]): ReturnType[IStyledComponentFactory[feFlood, OuterProps, Statics]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[ReturnType[IStyledComponentFactory[feFlood, OuterProps, Statics]]]
  
  inline def default_feFuncA[OuterProps, Statics](target: feFuncA, options: StyledOptions[OuterProps], rules: RuleSet[OuterProps]): ReturnType[IStyledComponentFactory[feFuncA, OuterProps, Statics]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[ReturnType[IStyledComponentFactory[feFuncA, OuterProps, Statics]]]
  
  inline def default_feFuncB[OuterProps, Statics](target: feFuncB, options: StyledOptions[OuterProps], rules: RuleSet[OuterProps]): ReturnType[IStyledComponentFactory[feFuncB, OuterProps, Statics]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[ReturnType[IStyledComponentFactory[feFuncB, OuterProps, Statics]]]
  
  inline def default_feFuncG[OuterProps, Statics](target: feFuncG, options: StyledOptions[OuterProps], rules: RuleSet[OuterProps]): ReturnType[IStyledComponentFactory[feFuncG, OuterProps, Statics]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[ReturnType[IStyledComponentFactory[feFuncG, OuterProps, Statics]]]
  
  inline def default_feFuncR[OuterProps, Statics](target: feFuncR, options: StyledOptions[OuterProps], rules: RuleSet[OuterProps]): ReturnType[IStyledComponentFactory[feFuncR, OuterProps, Statics]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[ReturnType[IStyledComponentFactory[feFuncR, OuterProps, Statics]]]
  
  inline def default_feGaussianBlur[OuterProps, Statics](target: feGaussianBlur, options: StyledOptions[OuterProps], rules: RuleSet[OuterProps]): ReturnType[IStyledComponentFactory[feGaussianBlur, OuterProps, Statics]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[ReturnType[IStyledComponentFactory[feGaussianBlur, OuterProps, Statics]]]
  
  inline def default_feImage[OuterProps, Statics](target: feImage, options: StyledOptions[OuterProps], rules: RuleSet[OuterProps]): ReturnType[IStyledComponentFactory[feImage, OuterProps, Statics]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[ReturnType[IStyledComponentFactory[feImage, OuterProps, Statics]]]
  
  inline def default_feMerge[OuterProps, Statics](target: feMerge, options: StyledOptions[OuterProps], rules: RuleSet[OuterProps]): ReturnType[IStyledComponentFactory[feMerge, OuterProps, Statics]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[ReturnType[IStyledComponentFactory[feMerge, OuterProps, Statics]]]
  
  inline def default_feMergeNode[OuterProps, Statics](target: feMergeNode, options: StyledOptions[OuterProps], rules: RuleSet[OuterProps]): ReturnType[IStyledComponentFactory[feMergeNode, OuterProps, Statics]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[ReturnType[IStyledComponentFactory[feMergeNode, OuterProps, Statics]]]
  
  inline def default_feMorphology[OuterProps, Statics](target: feMorphology, options: StyledOptions[OuterProps], rules: RuleSet[OuterProps]): ReturnType[IStyledComponentFactory[feMorphology, OuterProps, Statics]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[ReturnType[IStyledComponentFactory[feMorphology, OuterProps, Statics]]]
  
  inline def default_feOffset[OuterProps, Statics](target: feOffset, options: StyledOptions[OuterProps], rules: RuleSet[OuterProps]): ReturnType[IStyledComponentFactory[feOffset, OuterProps, Statics]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[ReturnType[IStyledComponentFactory[feOffset, OuterProps, Statics]]]
  
  inline def default_fePointLight[OuterProps, Statics](target: fePointLight, options: StyledOptions[OuterProps], rules: RuleSet[OuterProps]): ReturnType[IStyledComponentFactory[fePointLight, OuterProps, Statics]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[ReturnType[IStyledComponentFactory[fePointLight, OuterProps, Statics]]]
  
  inline def default_feSpecularLighting[OuterProps, Statics](target: feSpecularLighting, options: StyledOptions[OuterProps], rules: RuleSet[OuterProps]): ReturnType[IStyledComponentFactory[feSpecularLighting, OuterProps, Statics]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[ReturnType[IStyledComponentFactory[feSpecularLighting, OuterProps, Statics]]]
  
  inline def default_feSpotLight[OuterProps, Statics](target: feSpotLight, options: StyledOptions[OuterProps], rules: RuleSet[OuterProps]): ReturnType[IStyledComponentFactory[feSpotLight, OuterProps, Statics]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[ReturnType[IStyledComponentFactory[feSpotLight, OuterProps, Statics]]]
  
  inline def default_feTile[OuterProps, Statics](target: feTile, options: StyledOptions[OuterProps], rules: RuleSet[OuterProps]): ReturnType[IStyledComponentFactory[feTile, OuterProps, Statics]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[ReturnType[IStyledComponentFactory[feTile, OuterProps, Statics]]]
  
  inline def default_feTurbulence[OuterProps, Statics](target: feTurbulence, options: StyledOptions[OuterProps], rules: RuleSet[OuterProps]): ReturnType[IStyledComponentFactory[feTurbulence, OuterProps, Statics]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[ReturnType[IStyledComponentFactory[feTurbulence, OuterProps, Statics]]]
  
  inline def default_fieldset[OuterProps, Statics](target: fieldset, options: StyledOptions[OuterProps], rules: RuleSet[OuterProps]): ReturnType[IStyledComponentFactory[fieldset, OuterProps, Statics]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[ReturnType[IStyledComponentFactory[fieldset, OuterProps, Statics]]]
  
  inline def default_figcaption[OuterProps, Statics](target: figcaption, options: StyledOptions[OuterProps], rules: RuleSet[OuterProps]): ReturnType[IStyledComponentFactory[figcaption, OuterProps, Statics]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[ReturnType[IStyledComponentFactory[figcaption, OuterProps, Statics]]]
  
  inline def default_figure[OuterProps, Statics](target: figure, options: StyledOptions[OuterProps], rules: RuleSet[OuterProps]): ReturnType[IStyledComponentFactory[figure, OuterProps, Statics]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[ReturnType[IStyledComponentFactory[figure, OuterProps, Statics]]]
  
  inline def default_filter[OuterProps, Statics](target: filter, options: StyledOptions[OuterProps], rules: RuleSet[OuterProps]): ReturnType[IStyledComponentFactory[filter, OuterProps, Statics]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[ReturnType[IStyledComponentFactory[filter, OuterProps, Statics]]]
  
  inline def default_footer[OuterProps, Statics](target: footer, options: StyledOptions[OuterProps], rules: RuleSet[OuterProps]): ReturnType[IStyledComponentFactory[footer, OuterProps, Statics]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[ReturnType[IStyledComponentFactory[footer, OuterProps, Statics]]]
  
  inline def default_foreignObject[OuterProps, Statics](target: foreignObject, options: StyledOptions[OuterProps], rules: RuleSet[OuterProps]): ReturnType[IStyledComponentFactory[foreignObject, OuterProps, Statics]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[ReturnType[IStyledComponentFactory[foreignObject, OuterProps, Statics]]]
  
  inline def default_form[OuterProps, Statics](target: form, options: StyledOptions[OuterProps], rules: RuleSet[OuterProps]): ReturnType[IStyledComponentFactory[form, OuterProps, Statics]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[ReturnType[IStyledComponentFactory[form, OuterProps, Statics]]]
  
  inline def default_g[OuterProps, Statics](target: g, options: StyledOptions[OuterProps], rules: RuleSet[OuterProps]): ReturnType[IStyledComponentFactory[g, OuterProps, Statics]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[ReturnType[IStyledComponentFactory[g, OuterProps, Statics]]]
  
  inline def default_h1[OuterProps, Statics](target: h1, options: StyledOptions[OuterProps], rules: RuleSet[OuterProps]): ReturnType[IStyledComponentFactory[h1, OuterProps, Statics]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[ReturnType[IStyledComponentFactory[h1, OuterProps, Statics]]]
  
  inline def default_h2[OuterProps, Statics](target: h2, options: StyledOptions[OuterProps], rules: RuleSet[OuterProps]): ReturnType[IStyledComponentFactory[h2, OuterProps, Statics]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[ReturnType[IStyledComponentFactory[h2, OuterProps, Statics]]]
  
  inline def default_h3[OuterProps, Statics](target: h3, options: StyledOptions[OuterProps], rules: RuleSet[OuterProps]): ReturnType[IStyledComponentFactory[h3, OuterProps, Statics]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[ReturnType[IStyledComponentFactory[h3, OuterProps, Statics]]]
  
  inline def default_h4[OuterProps, Statics](target: h4, options: StyledOptions[OuterProps], rules: RuleSet[OuterProps]): ReturnType[IStyledComponentFactory[h4, OuterProps, Statics]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[ReturnType[IStyledComponentFactory[h4, OuterProps, Statics]]]
  
  inline def default_h5[OuterProps, Statics](target: h5, options: StyledOptions[OuterProps], rules: RuleSet[OuterProps]): ReturnType[IStyledComponentFactory[h5, OuterProps, Statics]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[ReturnType[IStyledComponentFactory[h5, OuterProps, Statics]]]
  
  inline def default_h6[OuterProps, Statics](target: h6, options: StyledOptions[OuterProps], rules: RuleSet[OuterProps]): ReturnType[IStyledComponentFactory[h6, OuterProps, Statics]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[ReturnType[IStyledComponentFactory[h6, OuterProps, Statics]]]
  
  inline def default_head[OuterProps, Statics](target: head, options: StyledOptions[OuterProps], rules: RuleSet[OuterProps]): ReturnType[IStyledComponentFactory[head, OuterProps, Statics]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[ReturnType[IStyledComponentFactory[head, OuterProps, Statics]]]
  
  inline def default_header[OuterProps, Statics](target: header, options: StyledOptions[OuterProps], rules: RuleSet[OuterProps]): ReturnType[IStyledComponentFactory[header, OuterProps, Statics]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[ReturnType[IStyledComponentFactory[header, OuterProps, Statics]]]
  
  inline def default_hgroup[OuterProps, Statics](target: hgroup, options: StyledOptions[OuterProps], rules: RuleSet[OuterProps]): ReturnType[IStyledComponentFactory[hgroup, OuterProps, Statics]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[ReturnType[IStyledComponentFactory[hgroup, OuterProps, Statics]]]
  
  inline def default_hr[OuterProps, Statics](target: hr, options: StyledOptions[OuterProps], rules: RuleSet[OuterProps]): ReturnType[IStyledComponentFactory[hr, OuterProps, Statics]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[ReturnType[IStyledComponentFactory[hr, OuterProps, Statics]]]
  
  inline def default_html[OuterProps, Statics](target: html, options: StyledOptions[OuterProps], rules: RuleSet[OuterProps]): ReturnType[IStyledComponentFactory[html, OuterProps, Statics]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[ReturnType[IStyledComponentFactory[html, OuterProps, Statics]]]
  
  inline def default_i[OuterProps, Statics](target: i, options: StyledOptions[OuterProps], rules: RuleSet[OuterProps]): ReturnType[IStyledComponentFactory[i, OuterProps, Statics]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[ReturnType[IStyledComponentFactory[i, OuterProps, Statics]]]
  
  inline def default_iframe[OuterProps, Statics](target: iframe, options: StyledOptions[OuterProps], rules: RuleSet[OuterProps]): ReturnType[IStyledComponentFactory[iframe, OuterProps, Statics]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[ReturnType[IStyledComponentFactory[iframe, OuterProps, Statics]]]
  
  inline def default_image[OuterProps, Statics](target: image, options: StyledOptions[OuterProps], rules: RuleSet[OuterProps]): ReturnType[IStyledComponentFactory[image, OuterProps, Statics]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[ReturnType[IStyledComponentFactory[image, OuterProps, Statics]]]
  
  inline def default_img[OuterProps, Statics](target: img, options: StyledOptions[OuterProps], rules: RuleSet[OuterProps]): ReturnType[IStyledComponentFactory[img, OuterProps, Statics]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[ReturnType[IStyledComponentFactory[img, OuterProps, Statics]]]
  
  inline def default_input[OuterProps, Statics](target: input, options: StyledOptions[OuterProps], rules: RuleSet[OuterProps]): ReturnType[IStyledComponentFactory[input, OuterProps, Statics]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[ReturnType[IStyledComponentFactory[input, OuterProps, Statics]]]
  
  inline def default_ins[OuterProps, Statics](target: ins, options: StyledOptions[OuterProps], rules: RuleSet[OuterProps]): ReturnType[IStyledComponentFactory[ins, OuterProps, Statics]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[ReturnType[IStyledComponentFactory[ins, OuterProps, Statics]]]
  
  inline def default_kbd[OuterProps, Statics](target: kbd, options: StyledOptions[OuterProps], rules: RuleSet[OuterProps]): ReturnType[IStyledComponentFactory[kbd, OuterProps, Statics]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[ReturnType[IStyledComponentFactory[kbd, OuterProps, Statics]]]
  
  inline def default_keygen[OuterProps, Statics](target: keygen, options: StyledOptions[OuterProps], rules: RuleSet[OuterProps]): ReturnType[IStyledComponentFactory[keygen, OuterProps, Statics]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[ReturnType[IStyledComponentFactory[keygen, OuterProps, Statics]]]
  
  inline def default_label[OuterProps, Statics](target: label, options: StyledOptions[OuterProps], rules: RuleSet[OuterProps]): ReturnType[IStyledComponentFactory[label, OuterProps, Statics]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[ReturnType[IStyledComponentFactory[label, OuterProps, Statics]]]
  
  inline def default_legend[OuterProps, Statics](target: legend, options: StyledOptions[OuterProps], rules: RuleSet[OuterProps]): ReturnType[IStyledComponentFactory[legend, OuterProps, Statics]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[ReturnType[IStyledComponentFactory[legend, OuterProps, Statics]]]
  
  inline def default_li[OuterProps, Statics](target: li, options: StyledOptions[OuterProps], rules: RuleSet[OuterProps]): ReturnType[IStyledComponentFactory[li, OuterProps, Statics]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[ReturnType[IStyledComponentFactory[li, OuterProps, Statics]]]
  
  inline def default_line[OuterProps, Statics](target: line, options: StyledOptions[OuterProps], rules: RuleSet[OuterProps]): ReturnType[IStyledComponentFactory[line, OuterProps, Statics]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[ReturnType[IStyledComponentFactory[line, OuterProps, Statics]]]
  
  inline def default_linearGradient[OuterProps, Statics](target: linearGradient, options: StyledOptions[OuterProps], rules: RuleSet[OuterProps]): ReturnType[IStyledComponentFactory[linearGradient, OuterProps, Statics]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[ReturnType[IStyledComponentFactory[linearGradient, OuterProps, Statics]]]
  
  inline def default_link[OuterProps, Statics](target: link, options: StyledOptions[OuterProps], rules: RuleSet[OuterProps]): ReturnType[IStyledComponentFactory[link, OuterProps, Statics]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[ReturnType[IStyledComponentFactory[link, OuterProps, Statics]]]
  
  inline def default_main[OuterProps, Statics](target: main, options: StyledOptions[OuterProps], rules: RuleSet[OuterProps]): ReturnType[IStyledComponentFactory[main, OuterProps, Statics]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[ReturnType[IStyledComponentFactory[main, OuterProps, Statics]]]
  
  inline def default_map[OuterProps, Statics](target: map, options: StyledOptions[OuterProps], rules: RuleSet[OuterProps]): ReturnType[IStyledComponentFactory[map, OuterProps, Statics]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[ReturnType[IStyledComponentFactory[map, OuterProps, Statics]]]
  
  inline def default_mark[OuterProps, Statics](target: mark, options: StyledOptions[OuterProps], rules: RuleSet[OuterProps]): ReturnType[IStyledComponentFactory[mark, OuterProps, Statics]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[ReturnType[IStyledComponentFactory[mark, OuterProps, Statics]]]
  
  inline def default_marker[OuterProps, Statics](target: marker, options: StyledOptions[OuterProps], rules: RuleSet[OuterProps]): ReturnType[IStyledComponentFactory[marker, OuterProps, Statics]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[ReturnType[IStyledComponentFactory[marker, OuterProps, Statics]]]
  
  inline def default_mask[OuterProps, Statics](target: mask, options: StyledOptions[OuterProps], rules: RuleSet[OuterProps]): ReturnType[IStyledComponentFactory[mask, OuterProps, Statics]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[ReturnType[IStyledComponentFactory[mask, OuterProps, Statics]]]
  
  inline def default_menu[OuterProps, Statics](target: menu, options: StyledOptions[OuterProps], rules: RuleSet[OuterProps]): ReturnType[IStyledComponentFactory[menu, OuterProps, Statics]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[ReturnType[IStyledComponentFactory[menu, OuterProps, Statics]]]
  
  inline def default_menuitem[OuterProps, Statics](target: menuitem, options: StyledOptions[OuterProps], rules: RuleSet[OuterProps]): ReturnType[IStyledComponentFactory[menuitem, OuterProps, Statics]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[ReturnType[IStyledComponentFactory[menuitem, OuterProps, Statics]]]
  
  inline def default_meta[OuterProps, Statics](target: meta, options: StyledOptions[OuterProps], rules: RuleSet[OuterProps]): ReturnType[IStyledComponentFactory[meta, OuterProps, Statics]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[ReturnType[IStyledComponentFactory[meta, OuterProps, Statics]]]
  
  inline def default_metadata[OuterProps, Statics](target: metadata, options: StyledOptions[OuterProps], rules: RuleSet[OuterProps]): ReturnType[IStyledComponentFactory[metadata, OuterProps, Statics]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[ReturnType[IStyledComponentFactory[metadata, OuterProps, Statics]]]
  
  inline def default_meter[OuterProps, Statics](target: meter, options: StyledOptions[OuterProps], rules: RuleSet[OuterProps]): ReturnType[IStyledComponentFactory[meter, OuterProps, Statics]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[ReturnType[IStyledComponentFactory[meter, OuterProps, Statics]]]
  
  inline def default_mpath[OuterProps, Statics](target: mpath, options: StyledOptions[OuterProps], rules: RuleSet[OuterProps]): ReturnType[IStyledComponentFactory[mpath, OuterProps, Statics]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[ReturnType[IStyledComponentFactory[mpath, OuterProps, Statics]]]
  
  inline def default_nav[OuterProps, Statics](target: nav, options: StyledOptions[OuterProps], rules: RuleSet[OuterProps]): ReturnType[IStyledComponentFactory[nav, OuterProps, Statics]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[ReturnType[IStyledComponentFactory[nav, OuterProps, Statics]]]
  
  inline def default_noindex[OuterProps, Statics](target: noindex, options: StyledOptions[OuterProps], rules: RuleSet[OuterProps]): ReturnType[IStyledComponentFactory[noindex, OuterProps, Statics]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[ReturnType[IStyledComponentFactory[noindex, OuterProps, Statics]]]
  
  inline def default_noscript[OuterProps, Statics](target: noscript, options: StyledOptions[OuterProps], rules: RuleSet[OuterProps]): ReturnType[IStyledComponentFactory[noscript, OuterProps, Statics]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[ReturnType[IStyledComponentFactory[noscript, OuterProps, Statics]]]
  
  inline def default_object[OuterProps, Statics](target: `object`, options: StyledOptions[OuterProps], rules: RuleSet[OuterProps]): ReturnType[IStyledComponentFactory[`object`, OuterProps, Statics]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[ReturnType[IStyledComponentFactory[`object`, OuterProps, Statics]]]
  
  inline def default_ol[OuterProps, Statics](target: ol, options: StyledOptions[OuterProps], rules: RuleSet[OuterProps]): ReturnType[IStyledComponentFactory[ol, OuterProps, Statics]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[ReturnType[IStyledComponentFactory[ol, OuterProps, Statics]]]
  
  inline def default_optgroup[OuterProps, Statics](target: optgroup, options: StyledOptions[OuterProps], rules: RuleSet[OuterProps]): ReturnType[IStyledComponentFactory[optgroup, OuterProps, Statics]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[ReturnType[IStyledComponentFactory[optgroup, OuterProps, Statics]]]
  
  inline def default_option[OuterProps, Statics](target: option, options: StyledOptions[OuterProps], rules: RuleSet[OuterProps]): ReturnType[IStyledComponentFactory[option, OuterProps, Statics]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[ReturnType[IStyledComponentFactory[option, OuterProps, Statics]]]
  
  inline def default_output[OuterProps, Statics](target: output, options: StyledOptions[OuterProps], rules: RuleSet[OuterProps]): ReturnType[IStyledComponentFactory[output, OuterProps, Statics]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[ReturnType[IStyledComponentFactory[output, OuterProps, Statics]]]
  
  inline def default_p[OuterProps, Statics](target: p, options: StyledOptions[OuterProps], rules: RuleSet[OuterProps]): ReturnType[IStyledComponentFactory[p, OuterProps, Statics]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[ReturnType[IStyledComponentFactory[p, OuterProps, Statics]]]
  
  inline def default_param[OuterProps, Statics](target: param, options: StyledOptions[OuterProps], rules: RuleSet[OuterProps]): ReturnType[IStyledComponentFactory[param, OuterProps, Statics]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[ReturnType[IStyledComponentFactory[param, OuterProps, Statics]]]
  
  inline def default_path[OuterProps, Statics](target: path, options: StyledOptions[OuterProps], rules: RuleSet[OuterProps]): ReturnType[IStyledComponentFactory[path, OuterProps, Statics]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[ReturnType[IStyledComponentFactory[path, OuterProps, Statics]]]
  
  inline def default_pattern[OuterProps, Statics](target: pattern, options: StyledOptions[OuterProps], rules: RuleSet[OuterProps]): ReturnType[IStyledComponentFactory[pattern, OuterProps, Statics]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[ReturnType[IStyledComponentFactory[pattern, OuterProps, Statics]]]
  
  inline def default_picture[OuterProps, Statics](target: picture, options: StyledOptions[OuterProps], rules: RuleSet[OuterProps]): ReturnType[IStyledComponentFactory[picture, OuterProps, Statics]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[ReturnType[IStyledComponentFactory[picture, OuterProps, Statics]]]
  
  inline def default_polygon[OuterProps, Statics](target: polygon, options: StyledOptions[OuterProps], rules: RuleSet[OuterProps]): ReturnType[IStyledComponentFactory[polygon, OuterProps, Statics]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[ReturnType[IStyledComponentFactory[polygon, OuterProps, Statics]]]
  
  inline def default_polyline[OuterProps, Statics](target: polyline, options: StyledOptions[OuterProps], rules: RuleSet[OuterProps]): ReturnType[IStyledComponentFactory[polyline, OuterProps, Statics]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[ReturnType[IStyledComponentFactory[polyline, OuterProps, Statics]]]
  
  inline def default_pre[OuterProps, Statics](target: pre, options: StyledOptions[OuterProps], rules: RuleSet[OuterProps]): ReturnType[IStyledComponentFactory[pre, OuterProps, Statics]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[ReturnType[IStyledComponentFactory[pre, OuterProps, Statics]]]
  
  inline def default_progress[OuterProps, Statics](target: progress, options: StyledOptions[OuterProps], rules: RuleSet[OuterProps]): ReturnType[IStyledComponentFactory[progress, OuterProps, Statics]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[ReturnType[IStyledComponentFactory[progress, OuterProps, Statics]]]
  
  inline def default_q[OuterProps, Statics](target: q, options: StyledOptions[OuterProps], rules: RuleSet[OuterProps]): ReturnType[IStyledComponentFactory[q, OuterProps, Statics]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[ReturnType[IStyledComponentFactory[q, OuterProps, Statics]]]
  
  inline def default_radialGradient[OuterProps, Statics](target: radialGradient, options: StyledOptions[OuterProps], rules: RuleSet[OuterProps]): ReturnType[IStyledComponentFactory[radialGradient, OuterProps, Statics]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[ReturnType[IStyledComponentFactory[radialGradient, OuterProps, Statics]]]
  
  inline def default_rect[OuterProps, Statics](target: rect, options: StyledOptions[OuterProps], rules: RuleSet[OuterProps]): ReturnType[IStyledComponentFactory[rect, OuterProps, Statics]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[ReturnType[IStyledComponentFactory[rect, OuterProps, Statics]]]
  
  inline def default_rp[OuterProps, Statics](target: rp, options: StyledOptions[OuterProps], rules: RuleSet[OuterProps]): ReturnType[IStyledComponentFactory[rp, OuterProps, Statics]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[ReturnType[IStyledComponentFactory[rp, OuterProps, Statics]]]
  
  inline def default_rt[OuterProps, Statics](target: rt, options: StyledOptions[OuterProps], rules: RuleSet[OuterProps]): ReturnType[IStyledComponentFactory[rt, OuterProps, Statics]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[ReturnType[IStyledComponentFactory[rt, OuterProps, Statics]]]
  
  inline def default_ruby[OuterProps, Statics](target: ruby, options: StyledOptions[OuterProps], rules: RuleSet[OuterProps]): ReturnType[IStyledComponentFactory[ruby, OuterProps, Statics]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[ReturnType[IStyledComponentFactory[ruby, OuterProps, Statics]]]
  
  inline def default_s[OuterProps, Statics](target: s, options: StyledOptions[OuterProps], rules: RuleSet[OuterProps]): ReturnType[IStyledComponentFactory[s, OuterProps, Statics]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[ReturnType[IStyledComponentFactory[s, OuterProps, Statics]]]
  
  inline def default_samp[OuterProps, Statics](target: samp, options: StyledOptions[OuterProps], rules: RuleSet[OuterProps]): ReturnType[IStyledComponentFactory[samp, OuterProps, Statics]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[ReturnType[IStyledComponentFactory[samp, OuterProps, Statics]]]
  
  inline def default_script[OuterProps, Statics](target: script, options: StyledOptions[OuterProps], rules: RuleSet[OuterProps]): ReturnType[IStyledComponentFactory[script, OuterProps, Statics]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[ReturnType[IStyledComponentFactory[script, OuterProps, Statics]]]
  
  inline def default_section[OuterProps, Statics](target: section, options: StyledOptions[OuterProps], rules: RuleSet[OuterProps]): ReturnType[IStyledComponentFactory[section, OuterProps, Statics]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[ReturnType[IStyledComponentFactory[section, OuterProps, Statics]]]
  
  inline def default_select[OuterProps, Statics](target: select, options: StyledOptions[OuterProps], rules: RuleSet[OuterProps]): ReturnType[IStyledComponentFactory[select, OuterProps, Statics]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[ReturnType[IStyledComponentFactory[select, OuterProps, Statics]]]
  
  inline def default_slot[OuterProps, Statics](target: slot, options: StyledOptions[OuterProps], rules: RuleSet[OuterProps]): ReturnType[IStyledComponentFactory[slot, OuterProps, Statics]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[ReturnType[IStyledComponentFactory[slot, OuterProps, Statics]]]
  
  inline def default_small[OuterProps, Statics](target: small, options: StyledOptions[OuterProps], rules: RuleSet[OuterProps]): ReturnType[IStyledComponentFactory[small, OuterProps, Statics]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[ReturnType[IStyledComponentFactory[small, OuterProps, Statics]]]
  
  inline def default_source[OuterProps, Statics](target: source, options: StyledOptions[OuterProps], rules: RuleSet[OuterProps]): ReturnType[IStyledComponentFactory[source, OuterProps, Statics]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[ReturnType[IStyledComponentFactory[source, OuterProps, Statics]]]
  
  inline def default_span[OuterProps, Statics](target: span, options: StyledOptions[OuterProps], rules: RuleSet[OuterProps]): ReturnType[IStyledComponentFactory[span, OuterProps, Statics]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[ReturnType[IStyledComponentFactory[span, OuterProps, Statics]]]
  
  inline def default_stop[OuterProps, Statics](target: stop, options: StyledOptions[OuterProps], rules: RuleSet[OuterProps]): ReturnType[IStyledComponentFactory[stop, OuterProps, Statics]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[ReturnType[IStyledComponentFactory[stop, OuterProps, Statics]]]
  
  inline def default_strong[OuterProps, Statics](target: strong, options: StyledOptions[OuterProps], rules: RuleSet[OuterProps]): ReturnType[IStyledComponentFactory[strong, OuterProps, Statics]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[ReturnType[IStyledComponentFactory[strong, OuterProps, Statics]]]
  
  inline def default_style[OuterProps, Statics](target: style, options: StyledOptions[OuterProps], rules: RuleSet[OuterProps]): ReturnType[IStyledComponentFactory[style, OuterProps, Statics]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[ReturnType[IStyledComponentFactory[style, OuterProps, Statics]]]
  
  inline def default_sub[OuterProps, Statics](target: sub, options: StyledOptions[OuterProps], rules: RuleSet[OuterProps]): ReturnType[IStyledComponentFactory[sub, OuterProps, Statics]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[ReturnType[IStyledComponentFactory[sub, OuterProps, Statics]]]
  
  inline def default_summary[OuterProps, Statics](target: summary, options: StyledOptions[OuterProps], rules: RuleSet[OuterProps]): ReturnType[IStyledComponentFactory[summary, OuterProps, Statics]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[ReturnType[IStyledComponentFactory[summary, OuterProps, Statics]]]
  
  inline def default_sup[OuterProps, Statics](target: sup, options: StyledOptions[OuterProps], rules: RuleSet[OuterProps]): ReturnType[IStyledComponentFactory[sup, OuterProps, Statics]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[ReturnType[IStyledComponentFactory[sup, OuterProps, Statics]]]
  
  inline def default_svg[OuterProps, Statics](target: svg, options: StyledOptions[OuterProps], rules: RuleSet[OuterProps]): ReturnType[IStyledComponentFactory[svg, OuterProps, Statics]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[ReturnType[IStyledComponentFactory[svg, OuterProps, Statics]]]
  
  inline def default_switch[OuterProps, Statics](target: switch, options: StyledOptions[OuterProps], rules: RuleSet[OuterProps]): ReturnType[IStyledComponentFactory[switch, OuterProps, Statics]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[ReturnType[IStyledComponentFactory[switch, OuterProps, Statics]]]
  
  inline def default_symbol[OuterProps, Statics](target: symbol, options: StyledOptions[OuterProps], rules: RuleSet[OuterProps]): ReturnType[IStyledComponentFactory[symbol, OuterProps, Statics]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[ReturnType[IStyledComponentFactory[symbol, OuterProps, Statics]]]
  
  inline def default_table[OuterProps, Statics](target: table, options: StyledOptions[OuterProps], rules: RuleSet[OuterProps]): ReturnType[IStyledComponentFactory[table, OuterProps, Statics]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[ReturnType[IStyledComponentFactory[table, OuterProps, Statics]]]
  
  inline def default_tbody[OuterProps, Statics](target: tbody, options: StyledOptions[OuterProps], rules: RuleSet[OuterProps]): ReturnType[IStyledComponentFactory[tbody, OuterProps, Statics]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[ReturnType[IStyledComponentFactory[tbody, OuterProps, Statics]]]
  
  inline def default_td[OuterProps, Statics](target: td, options: StyledOptions[OuterProps], rules: RuleSet[OuterProps]): ReturnType[IStyledComponentFactory[td, OuterProps, Statics]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[ReturnType[IStyledComponentFactory[td, OuterProps, Statics]]]
  
  inline def default_template[OuterProps, Statics](target: template, options: StyledOptions[OuterProps], rules: RuleSet[OuterProps]): ReturnType[IStyledComponentFactory[template, OuterProps, Statics]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[ReturnType[IStyledComponentFactory[template, OuterProps, Statics]]]
  
  inline def default_text[OuterProps, Statics](target: text, options: StyledOptions[OuterProps], rules: RuleSet[OuterProps]): ReturnType[IStyledComponentFactory[text, OuterProps, Statics]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[ReturnType[IStyledComponentFactory[text, OuterProps, Statics]]]
  
  inline def default_textPath[OuterProps, Statics](target: textPath, options: StyledOptions[OuterProps], rules: RuleSet[OuterProps]): ReturnType[IStyledComponentFactory[textPath, OuterProps, Statics]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[ReturnType[IStyledComponentFactory[textPath, OuterProps, Statics]]]
  
  inline def default_textarea[OuterProps, Statics](target: textarea, options: StyledOptions[OuterProps], rules: RuleSet[OuterProps]): ReturnType[IStyledComponentFactory[textarea, OuterProps, Statics]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[ReturnType[IStyledComponentFactory[textarea, OuterProps, Statics]]]
  
  inline def default_tfoot[OuterProps, Statics](target: tfoot, options: StyledOptions[OuterProps], rules: RuleSet[OuterProps]): ReturnType[IStyledComponentFactory[tfoot, OuterProps, Statics]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[ReturnType[IStyledComponentFactory[tfoot, OuterProps, Statics]]]
  
  inline def default_th[OuterProps, Statics](target: th, options: StyledOptions[OuterProps], rules: RuleSet[OuterProps]): ReturnType[IStyledComponentFactory[th, OuterProps, Statics]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[ReturnType[IStyledComponentFactory[th, OuterProps, Statics]]]
  
  inline def default_thead[OuterProps, Statics](target: thead, options: StyledOptions[OuterProps], rules: RuleSet[OuterProps]): ReturnType[IStyledComponentFactory[thead, OuterProps, Statics]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[ReturnType[IStyledComponentFactory[thead, OuterProps, Statics]]]
  
  inline def default_time[OuterProps, Statics](target: time, options: StyledOptions[OuterProps], rules: RuleSet[OuterProps]): ReturnType[IStyledComponentFactory[time, OuterProps, Statics]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[ReturnType[IStyledComponentFactory[time, OuterProps, Statics]]]
  
  inline def default_title[OuterProps, Statics](target: title, options: StyledOptions[OuterProps], rules: RuleSet[OuterProps]): ReturnType[IStyledComponentFactory[title, OuterProps, Statics]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[ReturnType[IStyledComponentFactory[title, OuterProps, Statics]]]
  
  inline def default_tr[OuterProps, Statics](target: tr, options: StyledOptions[OuterProps], rules: RuleSet[OuterProps]): ReturnType[IStyledComponentFactory[tr, OuterProps, Statics]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[ReturnType[IStyledComponentFactory[tr, OuterProps, Statics]]]
  
  inline def default_track[OuterProps, Statics](target: track, options: StyledOptions[OuterProps], rules: RuleSet[OuterProps]): ReturnType[IStyledComponentFactory[track, OuterProps, Statics]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[ReturnType[IStyledComponentFactory[track, OuterProps, Statics]]]
  
  inline def default_tspan[OuterProps, Statics](target: tspan, options: StyledOptions[OuterProps], rules: RuleSet[OuterProps]): ReturnType[IStyledComponentFactory[tspan, OuterProps, Statics]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[ReturnType[IStyledComponentFactory[tspan, OuterProps, Statics]]]
  
  inline def default_u[OuterProps, Statics](target: u, options: StyledOptions[OuterProps], rules: RuleSet[OuterProps]): ReturnType[IStyledComponentFactory[u, OuterProps, Statics]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[ReturnType[IStyledComponentFactory[u, OuterProps, Statics]]]
  
  inline def default_ul[OuterProps, Statics](target: ul, options: StyledOptions[OuterProps], rules: RuleSet[OuterProps]): ReturnType[IStyledComponentFactory[ul, OuterProps, Statics]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[ReturnType[IStyledComponentFactory[ul, OuterProps, Statics]]]
  
  inline def default_use[OuterProps, Statics](target: use, options: StyledOptions[OuterProps], rules: RuleSet[OuterProps]): ReturnType[IStyledComponentFactory[use, OuterProps, Statics]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[ReturnType[IStyledComponentFactory[use, OuterProps, Statics]]]
  
  inline def default_var[OuterProps, Statics](target: `var`, options: StyledOptions[OuterProps], rules: RuleSet[OuterProps]): ReturnType[IStyledComponentFactory[`var`, OuterProps, Statics]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[ReturnType[IStyledComponentFactory[`var`, OuterProps, Statics]]]
  
  inline def default_video[OuterProps, Statics](target: video, options: StyledOptions[OuterProps], rules: RuleSet[OuterProps]): ReturnType[IStyledComponentFactory[video, OuterProps, Statics]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[ReturnType[IStyledComponentFactory[video, OuterProps, Statics]]]
  
  inline def default_view[OuterProps, Statics](target: view, options: StyledOptions[OuterProps], rules: RuleSet[OuterProps]): ReturnType[IStyledComponentFactory[view, OuterProps, Statics]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[ReturnType[IStyledComponentFactory[view, OuterProps, Statics]]]
  
  inline def default_wbr[OuterProps, Statics](target: wbr, options: StyledOptions[OuterProps], rules: RuleSet[OuterProps]): ReturnType[IStyledComponentFactory[wbr, OuterProps, Statics]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[ReturnType[IStyledComponentFactory[wbr, OuterProps, Statics]]]
  
  inline def default_webview[OuterProps, Statics](target: webview, options: StyledOptions[OuterProps], rules: RuleSet[OuterProps]): ReturnType[IStyledComponentFactory[webview, OuterProps, Statics]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[ReturnType[IStyledComponentFactory[webview, OuterProps, Statics]]]
}
