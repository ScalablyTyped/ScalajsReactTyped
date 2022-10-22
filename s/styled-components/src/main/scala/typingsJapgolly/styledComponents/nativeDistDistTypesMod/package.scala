package typingsJapgolly.styledComponents.nativeDistDistTypesMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.HTMLAttributes
import typingsJapgolly.std.Omit
import typingsJapgolly.std.Record
import typingsJapgolly.std.TemplateStringsArray
import typingsJapgolly.styledComponents.anon.As
import typingsJapgolly.styledComponents.anon.`173`
import typingsJapgolly.styledComponents.styledComponentsStrings.$as
import typingsJapgolly.styledComponents.styledComponentsStrings.as
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AnyComponent[P] = ExoticComponentWithDisplayName[P] | ComponentType[P]

type Attrs[Props] = (ExtensibleObject & Props) | (js.Function1[/* props */ ExecutionContext & Props, ExecutionContext & Props])

type BaseExtensibleObject = StringDictionary[Any]

type CustomComponentProps[ActualComponent /* <: StyledTarget */, PropsToBeInjectedIntoActualComponent /* <: js.Object */, ActualComponentProps] = (As[ActualComponent] & HTMLAttributes[ActualComponent] & (Omit[
PropsToBeInjectedIntoActualComponent, 
(/* keyof ActualComponentProps */ String) | as | $as]) & ActualComponentProps) | (`173`[ActualComponent] & HTMLAttributes[ActualComponent] & (Omit[
PropsToBeInjectedIntoActualComponent, 
(/* keyof ActualComponentProps */ String) | as | $as]) & ActualComponentProps)

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.styledComponents.nativeDistDistTypesMod.RuleSet[Props]
  - scala.Double
  - java.lang.String
  - js.Array[java.lang.String]
  - typingsJapgolly.styledComponents.nativeDistDistTypesMod.IStyledComponent[scala.Any, scala.Any]
  - typingsJapgolly.styledComponents.nativeDistDistTypesMod.Keyframes
*/
type FlattenerResult[Props] = _FlattenerResult[Props] | js.Array[String] | (IStyledComponent[Any, Any]) | Double | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.styledComponents.nativeDistDistTypesMod.StyleFunction[Props]
  - typingsJapgolly.styledComponents.nativeDistDistTypesMod.StyledObject
  - java.lang.String
  - scala.Double
  - typingsJapgolly.styledComponents.nativeDistDistTypesMod.Keyframes
  - typingsJapgolly.styledComponents.nativeDistDistTypesMod.IStyledComponent[scala.Any, scala.Any]
  - js.Array[scala.Any]
*/
type Interpolation[Props] = _Interpolation[Props] | (IStyledComponent[Any, Any]) | js.Array[Any] | StyledObject | String | Double

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.styledComponents.styledComponentsStrings.a
  - typingsJapgolly.styledComponents.styledComponentsStrings.abbr
  - typingsJapgolly.styledComponents.styledComponentsStrings.address
  - typingsJapgolly.styledComponents.styledComponentsStrings.area
  - typingsJapgolly.styledComponents.styledComponentsStrings.article
  - typingsJapgolly.styledComponents.styledComponentsStrings.aside
  - typingsJapgolly.styledComponents.styledComponentsStrings.audio
  - typingsJapgolly.styledComponents.styledComponentsStrings.b
  - typingsJapgolly.styledComponents.styledComponentsStrings.base
  - typingsJapgolly.styledComponents.styledComponentsStrings.bdi
  - typingsJapgolly.styledComponents.styledComponentsStrings.bdo
  - typingsJapgolly.styledComponents.styledComponentsStrings.big
  - typingsJapgolly.styledComponents.styledComponentsStrings.blockquote
  - typingsJapgolly.styledComponents.styledComponentsStrings.body
  - typingsJapgolly.styledComponents.styledComponentsStrings.br
  - typingsJapgolly.styledComponents.styledComponentsStrings.button
  - typingsJapgolly.styledComponents.styledComponentsStrings.canvas
  - typingsJapgolly.styledComponents.styledComponentsStrings.caption
  - typingsJapgolly.styledComponents.styledComponentsStrings.cite
  - typingsJapgolly.styledComponents.styledComponentsStrings.code
  - typingsJapgolly.styledComponents.styledComponentsStrings.col
  - typingsJapgolly.styledComponents.styledComponentsStrings.colgroup
  - typingsJapgolly.styledComponents.styledComponentsStrings.data
  - typingsJapgolly.styledComponents.styledComponentsStrings.datalist
  - typingsJapgolly.styledComponents.styledComponentsStrings.dd
  - typingsJapgolly.styledComponents.styledComponentsStrings.del
  - typingsJapgolly.styledComponents.styledComponentsStrings.details
  - typingsJapgolly.styledComponents.styledComponentsStrings.dfn
  - typingsJapgolly.styledComponents.styledComponentsStrings.dialog
  - typingsJapgolly.styledComponents.styledComponentsStrings.div
  - typingsJapgolly.styledComponents.styledComponentsStrings.dl
  - typingsJapgolly.styledComponents.styledComponentsStrings.dt
  - typingsJapgolly.styledComponents.styledComponentsStrings.em
  - typingsJapgolly.styledComponents.styledComponentsStrings.embed
  - typingsJapgolly.styledComponents.styledComponentsStrings.fieldset
  - typingsJapgolly.styledComponents.styledComponentsStrings.figcaption
  - typingsJapgolly.styledComponents.styledComponentsStrings.figure
  - typingsJapgolly.styledComponents.styledComponentsStrings.footer
  - typingsJapgolly.styledComponents.styledComponentsStrings.form
  - typingsJapgolly.styledComponents.styledComponentsStrings.h1
  - typingsJapgolly.styledComponents.styledComponentsStrings.h2
  - typingsJapgolly.styledComponents.styledComponentsStrings.h3
  - typingsJapgolly.styledComponents.styledComponentsStrings.h4
  - typingsJapgolly.styledComponents.styledComponentsStrings.h5
  - typingsJapgolly.styledComponents.styledComponentsStrings.h6
  - typingsJapgolly.styledComponents.styledComponentsStrings.head
  - typingsJapgolly.styledComponents.styledComponentsStrings.header
  - typingsJapgolly.styledComponents.styledComponentsStrings.hgroup
  - typingsJapgolly.styledComponents.styledComponentsStrings.hr
  - typingsJapgolly.styledComponents.styledComponentsStrings.html
  - typingsJapgolly.styledComponents.styledComponentsStrings.i
  - typingsJapgolly.styledComponents.styledComponentsStrings.iframe
  - typingsJapgolly.styledComponents.styledComponentsStrings.img
  - typingsJapgolly.styledComponents.styledComponentsStrings.input
  - typingsJapgolly.styledComponents.styledComponentsStrings.ins
  - typingsJapgolly.styledComponents.styledComponentsStrings.kbd
  - typingsJapgolly.styledComponents.styledComponentsStrings.keygen
  - typingsJapgolly.styledComponents.styledComponentsStrings.label
  - typingsJapgolly.styledComponents.styledComponentsStrings.legend
  - typingsJapgolly.styledComponents.styledComponentsStrings.li
  - typingsJapgolly.styledComponents.styledComponentsStrings.link
  - typingsJapgolly.styledComponents.styledComponentsStrings.main
  - typingsJapgolly.styledComponents.styledComponentsStrings.map
  - typingsJapgolly.styledComponents.styledComponentsStrings.mark
  - typingsJapgolly.styledComponents.styledComponentsStrings.menu
  - typingsJapgolly.styledComponents.styledComponentsStrings.menuitem
  - typingsJapgolly.styledComponents.styledComponentsStrings.meta
  - typingsJapgolly.styledComponents.styledComponentsStrings.meter
  - typingsJapgolly.styledComponents.styledComponentsStrings.nav
  - typingsJapgolly.styledComponents.styledComponentsStrings.noindex
  - typingsJapgolly.styledComponents.styledComponentsStrings.noscript
  - typingsJapgolly.styledComponents.styledComponentsStrings.`object`
  - typingsJapgolly.styledComponents.styledComponentsStrings.ol
  - typingsJapgolly.styledComponents.styledComponentsStrings.optgroup
  - typingsJapgolly.styledComponents.styledComponentsStrings.option
  - typingsJapgolly.styledComponents.styledComponentsStrings.output
  - typingsJapgolly.styledComponents.styledComponentsStrings.p
  - typingsJapgolly.styledComponents.styledComponentsStrings.param
  - typingsJapgolly.styledComponents.styledComponentsStrings.picture
  - typingsJapgolly.styledComponents.styledComponentsStrings.pre
  - typingsJapgolly.styledComponents.styledComponentsStrings.progress
  - typingsJapgolly.styledComponents.styledComponentsStrings.q
  - typingsJapgolly.styledComponents.styledComponentsStrings.rp
  - typingsJapgolly.styledComponents.styledComponentsStrings.rt
  - typingsJapgolly.styledComponents.styledComponentsStrings.ruby
  - typingsJapgolly.styledComponents.styledComponentsStrings.s
  - typingsJapgolly.styledComponents.styledComponentsStrings.samp
  - typingsJapgolly.styledComponents.styledComponentsStrings.slot
  - typingsJapgolly.styledComponents.styledComponentsStrings.script
  - typingsJapgolly.styledComponents.styledComponentsStrings.section
  - typingsJapgolly.styledComponents.styledComponentsStrings.select
  - typingsJapgolly.styledComponents.styledComponentsStrings.small
  - typingsJapgolly.styledComponents.styledComponentsStrings.source
  - typingsJapgolly.styledComponents.styledComponentsStrings.span
  - typingsJapgolly.styledComponents.styledComponentsStrings.strong
  - typingsJapgolly.styledComponents.styledComponentsStrings.style
  - typingsJapgolly.styledComponents.styledComponentsStrings.sub
  - typingsJapgolly.styledComponents.styledComponentsStrings.summary
  - typingsJapgolly.styledComponents.styledComponentsStrings.sup
  - typingsJapgolly.styledComponents.styledComponentsStrings.table
  - typingsJapgolly.styledComponents.styledComponentsStrings.template
  - typingsJapgolly.styledComponents.styledComponentsStrings.tbody
  - typingsJapgolly.styledComponents.styledComponentsStrings.td
  - typingsJapgolly.styledComponents.styledComponentsStrings.textarea
  - typingsJapgolly.styledComponents.styledComponentsStrings.tfoot
  - typingsJapgolly.styledComponents.styledComponentsStrings.th
  - typingsJapgolly.styledComponents.styledComponentsStrings.thead
  - typingsJapgolly.styledComponents.styledComponentsStrings.time
  - typingsJapgolly.styledComponents.styledComponentsStrings.title
  - typingsJapgolly.styledComponents.styledComponentsStrings.tr
  - typingsJapgolly.styledComponents.styledComponentsStrings.track
  - typingsJapgolly.styledComponents.styledComponentsStrings.u
  - typingsJapgolly.styledComponents.styledComponentsStrings.ul
  - typingsJapgolly.styledComponents.styledComponentsStrings.`var`
  - typingsJapgolly.styledComponents.styledComponentsStrings.video
  - typingsJapgolly.styledComponents.styledComponentsStrings.wbr
  - typingsJapgolly.styledComponents.styledComponentsStrings.webview
  - typingsJapgolly.styledComponents.styledComponentsStrings.svg
  - typingsJapgolly.styledComponents.styledComponentsStrings.animate
  - typingsJapgolly.styledComponents.styledComponentsStrings.animateMotion
  - typingsJapgolly.styledComponents.styledComponentsStrings.animateTransform
  - typingsJapgolly.styledComponents.styledComponentsStrings.circle
  - typingsJapgolly.styledComponents.styledComponentsStrings.clipPath
  - typingsJapgolly.styledComponents.styledComponentsStrings.defs
  - typingsJapgolly.styledComponents.styledComponentsStrings.desc
  - typingsJapgolly.styledComponents.styledComponentsStrings.ellipse
  - typingsJapgolly.styledComponents.styledComponentsStrings.feBlend
  - typingsJapgolly.styledComponents.styledComponentsStrings.feColorMatrix
  - typingsJapgolly.styledComponents.styledComponentsStrings.feComponentTransfer
  - typingsJapgolly.styledComponents.styledComponentsStrings.feComposite
  - typingsJapgolly.styledComponents.styledComponentsStrings.feConvolveMatrix
  - typingsJapgolly.styledComponents.styledComponentsStrings.feDiffuseLighting
  - typingsJapgolly.styledComponents.styledComponentsStrings.feDisplacementMap
  - typingsJapgolly.styledComponents.styledComponentsStrings.feDistantLight
  - typingsJapgolly.styledComponents.styledComponentsStrings.feDropShadow
  - typingsJapgolly.styledComponents.styledComponentsStrings.feFlood
  - typingsJapgolly.styledComponents.styledComponentsStrings.feFuncA
  - typingsJapgolly.styledComponents.styledComponentsStrings.feFuncB
  - typingsJapgolly.styledComponents.styledComponentsStrings.feFuncG
  - typingsJapgolly.styledComponents.styledComponentsStrings.feFuncR
  - typingsJapgolly.styledComponents.styledComponentsStrings.feGaussianBlur
  - typingsJapgolly.styledComponents.styledComponentsStrings.feImage
  - typingsJapgolly.styledComponents.styledComponentsStrings.feMerge
  - typingsJapgolly.styledComponents.styledComponentsStrings.feMergeNode
  - typingsJapgolly.styledComponents.styledComponentsStrings.feMorphology
  - typingsJapgolly.styledComponents.styledComponentsStrings.feOffset
  - typingsJapgolly.styledComponents.styledComponentsStrings.fePointLight
  - typingsJapgolly.styledComponents.styledComponentsStrings.feSpecularLighting
  - typingsJapgolly.styledComponents.styledComponentsStrings.feSpotLight
  - typingsJapgolly.styledComponents.styledComponentsStrings.feTile
  - typingsJapgolly.styledComponents.styledComponentsStrings.feTurbulence
  - typingsJapgolly.styledComponents.styledComponentsStrings.filter
  - typingsJapgolly.styledComponents.styledComponentsStrings.foreignObject
  - typingsJapgolly.styledComponents.styledComponentsStrings.g
  - typingsJapgolly.styledComponents.styledComponentsStrings.image
  - typingsJapgolly.styledComponents.styledComponentsStrings.line
  - typingsJapgolly.styledComponents.styledComponentsStrings.linearGradient
  - typingsJapgolly.styledComponents.styledComponentsStrings.marker
  - typingsJapgolly.styledComponents.styledComponentsStrings.mask
  - typingsJapgolly.styledComponents.styledComponentsStrings.metadata
  - typingsJapgolly.styledComponents.styledComponentsStrings.mpath
  - typingsJapgolly.styledComponents.styledComponentsStrings.path
  - typingsJapgolly.styledComponents.styledComponentsStrings.pattern
  - typingsJapgolly.styledComponents.styledComponentsStrings.polygon
  - typingsJapgolly.styledComponents.styledComponentsStrings.polyline
  - typingsJapgolly.styledComponents.styledComponentsStrings.radialGradient
  - typingsJapgolly.styledComponents.styledComponentsStrings.rect
  - typingsJapgolly.styledComponents.styledComponentsStrings.stop
  - typingsJapgolly.styledComponents.styledComponentsStrings.switch
  - typingsJapgolly.styledComponents.styledComponentsStrings.symbol
  - typingsJapgolly.styledComponents.styledComponentsStrings.text
  - typingsJapgolly.styledComponents.styledComponentsStrings.textPath
  - typingsJapgolly.styledComponents.styledComponentsStrings.tspan
  - typingsJapgolly.styledComponents.styledComponentsStrings.use
  - typingsJapgolly.styledComponents.styledComponentsStrings.view
  - typingsJapgolly.styledComponents.nativeDistDistTypesMod.AnyComponent[scala.Any]
*/
type KnownWebTarget = _KnownWebTarget | AnyComponent[Any]

type NameGenerator = js.Function1[/* hash */ Double, String]

type NativeTarget = AnyComponent[Any]

type ShouldForwardProp = js.Function3[
/* prop */ String, 
/* isValidAttr */ js.Function1[/* prop */ String, Boolean], 
/* elementToBeCreated */ js.UndefOr[WebTarget | NativeTarget], 
Boolean]

type StyledObject = StringDictionary[(Record[String, Any]) | String | Double | StyleFunction[ExecutionContext]]

type StyledTarget = WebTarget | NativeTarget

type Styles[Props] = TemplateStringsArray | StyledObject | StyleFunction[Props]

type WebTarget = String | KnownWebTarget
