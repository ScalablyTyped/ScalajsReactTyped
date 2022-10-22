package typingsJapgolly.grommet.es6UtilsMod

import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.facade.React.Node
import org.scalajs.dom.HTMLElement
import typingsJapgolly.grommet.anon.ColorError
import typingsJapgolly.grommet.anon.Dark
import typingsJapgolly.grommet.anon.`38`
import typingsJapgolly.grommet.es6UtilsMod.^
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.std.Exclude
import typingsJapgolly.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def deepFreeze: DeepFreeze_ = ^.asInstanceOf[js.Dynamic].selectDynamic("deepFreeze").asInstanceOf[DeepFreeze_]

inline def deepMerge: DeepMerge_ = ^.asInstanceOf[js.Dynamic].selectDynamic("deepMerge").asInstanceOf[DeepMerge_]

inline def isObject(item: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObject")(item.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def normalizeColor(color: String, theme: js.Object): String = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeColor")(color.asInstanceOf[js.Any], theme.asInstanceOf[js.Any])).asInstanceOf[String]
inline def normalizeColor(color: String, theme: js.Object, required: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeColor")(color.asInstanceOf[js.Any], theme.asInstanceOf[js.Any], required.asInstanceOf[js.Any])).asInstanceOf[String]
inline def normalizeColor(color: Dark, theme: js.Object): String = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeColor")(color.asInstanceOf[js.Any], theme.asInstanceOf[js.Any])).asInstanceOf[String]
inline def normalizeColor(color: Dark, theme: js.Object, required: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeColor")(color.asInstanceOf[js.Any], theme.asInstanceOf[js.Any], required.asInstanceOf[js.Any])).asInstanceOf[String]

inline def removeUndefined[T /* <: js.Object */](obj: T): NonUndefinedProps[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("removeUndefined")(obj.asInstanceOf[js.Any]).asInstanceOf[NonUndefinedProps[T]]

type A11yTitleType = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.grommet.grommetStrings.around
  - typingsJapgolly.grommet.grommetStrings.baseline
  - typingsJapgolly.grommet.grommetStrings.between
  - typingsJapgolly.grommet.grommetStrings.center
  - typingsJapgolly.grommet.grommetStrings.evenly
  - typingsJapgolly.grommet.grommetStrings.end
  - typingsJapgolly.grommet.grommetStrings.start
  - typingsJapgolly.grommet.grommetStrings.stretch
  - java.lang.String
*/
type AlignContentType = _AlignContentType | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.grommet.grommetStrings.baseline
  - typingsJapgolly.grommet.grommetStrings.center
  - typingsJapgolly.grommet.grommetStrings.end
  - typingsJapgolly.grommet.grommetStrings.start
  - typingsJapgolly.grommet.grommetStrings.stretch
  - java.lang.String
*/
type AlignType = _AlignType | String

type AnimateType = Boolean

type BackgroundType = String | BackgroundObject

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.grommet.grommetStrings.xxsmall
  - typingsJapgolly.grommet.grommetStrings.xsmall
  - typingsJapgolly.grommet.grommetStrings.small
  - typingsJapgolly.grommet.grommetStrings.medium
  - typingsJapgolly.grommet.grommetStrings.large
  - typingsJapgolly.grommet.grommetStrings.xlarge
  - typingsJapgolly.grommet.grommetStrings.xxlarge
  - typingsJapgolly.grommet.grommetStrings.full
  - typingsJapgolly.grommet.grommetStrings.`1Slash2`
  - typingsJapgolly.grommet.grommetStrings.`1Slash3`
  - typingsJapgolly.grommet.grommetStrings.`2Slash3`
  - typingsJapgolly.grommet.grommetStrings.`1Slash4`
  - typingsJapgolly.grommet.grommetStrings.`2Slash4`
  - typingsJapgolly.grommet.grommetStrings.`3Slash4`
  - typingsJapgolly.grommet.grommetStrings.auto
  - java.lang.String
*/
type BasisType = _BasisType | String

/* Rewritten from type alias, can be one of: 
  - scala.Boolean
  - typingsJapgolly.grommet.es6UtilsMod.BoxSideType
  - typingsJapgolly.grommet.anon.ColorError
  - js.Array[typingsJapgolly.grommet.anon.ColorError]
*/
type BorderType = _BorderType | js.Array[ColorError] | Boolean

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.grommet.grommetStrings.xsmall
  - typingsJapgolly.grommet.grommetStrings.small
  - typingsJapgolly.grommet.grommetStrings.medium
  - typingsJapgolly.grommet.grommetStrings.large
  - typingsJapgolly.grommet.grommetStrings.xlarge
  - java.lang.String
*/
type BoxSizeType = _BoxSizeType | String

type ColorType = js.UndefOr[String | Dark]

type DeepFreeze_ = js.Function1[/* obj */ js.Object, DeepReadonly[js.Object]]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.grommet.grommetStrings.none
  - typingsJapgolly.grommet.es6UtilsMod.EdgeSizeType
  - typingsJapgolly.grommet.anon.Top
  - java.lang.String
*/
type EdgeType = _EdgeType | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.grommet.grommetStrings.none
  - typingsJapgolly.grommet.grommetStrings.xsmall
  - typingsJapgolly.grommet.grommetStrings.small
  - typingsJapgolly.grommet.grommetStrings.medium
  - typingsJapgolly.grommet.grommetStrings.large
  - typingsJapgolly.grommet.grommetStrings.xlarge
  - java.lang.String
*/
type ElevationType = _ElevationType | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.grommet.grommetStrings.horizontal
  - typingsJapgolly.grommet.grommetStrings.vertical
  - scala.Boolean
*/
type FillType = _FillType | Boolean

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.grommet.grommetStrings.none
  - typingsJapgolly.grommet.es6UtilsMod.EdgeSizeType
  - java.lang.String
*/
type GapType = _GapType | String

type GraphColorsType = js.Array[String] | `38`

type GridAreaType = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.grommet.grommetStrings.xxsmall
  - typingsJapgolly.grommet.grommetStrings.xxlarge
  - typingsJapgolly.grommet.es6UtilsMod.TShirtSizeType
  - typingsJapgolly.grommet.grommetStrings.`100Percentsign`
  - typingsJapgolly.grommet.anon.HeightMax
*/
type HeightType = _HeightType | String

/* Rewritten from type alias, can be one of: 
  - scala.Boolean
  - java.lang.String
  - typingsJapgolly.grommet.grommetStrings.background
  - typingsJapgolly.grommet.es6UtilsMod.BackgroundType
  - typingsJapgolly.grommet.anon.BackgroundElevation
*/
type HoverIndicatorType = _HoverIndicatorType | Boolean | String | BackgroundType

type KeyboardType = js.Function1[/* event */ ReactKeyboardEventFrom[HTMLElement], Unit]

type MarginType = EdgeType

type Omit[T, K] = Pick[T, Exclude[/* keyof T */ String, K]]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.grommet.grommetStrings.weak
  - typingsJapgolly.grommet.grommetStrings.medium
  - typingsJapgolly.grommet.grommetStrings.strong
  - java.lang.String
  - typingsJapgolly.grommet.grommetBooleans.`true`
  - typingsJapgolly.grommet.grommetBooleans.`false`
  - scala.Double
*/
type OpacityType = _OpacityType | String | Double

type PadType = EdgeType

type PlaceHolderType = String | Element | Node

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.grommet.grommetStrings.a
  - typingsJapgolly.grommet.grommetStrings.abbr
  - typingsJapgolly.grommet.grommetStrings.address
  - typingsJapgolly.grommet.grommetStrings.area
  - typingsJapgolly.grommet.grommetStrings.article
  - typingsJapgolly.grommet.grommetStrings.aside
  - typingsJapgolly.grommet.grommetStrings.audio
  - typingsJapgolly.grommet.grommetStrings.b
  - typingsJapgolly.grommet.grommetStrings.base
  - typingsJapgolly.grommet.grommetStrings.bdi
  - typingsJapgolly.grommet.grommetStrings.bdo
  - typingsJapgolly.grommet.grommetStrings.big
  - typingsJapgolly.grommet.grommetStrings.blockquote
  - typingsJapgolly.grommet.grommetStrings.body
  - typingsJapgolly.grommet.grommetStrings.br
  - typingsJapgolly.grommet.grommetStrings.button
  - typingsJapgolly.grommet.grommetStrings.canvas
  - typingsJapgolly.grommet.grommetStrings.caption
  - typingsJapgolly.grommet.grommetStrings.cite
  - typingsJapgolly.grommet.grommetStrings.code
  - typingsJapgolly.grommet.grommetStrings.col
  - typingsJapgolly.grommet.grommetStrings.colgroup
  - typingsJapgolly.grommet.grommetStrings.data
  - typingsJapgolly.grommet.grommetStrings.datalist
  - typingsJapgolly.grommet.grommetStrings.dd
  - typingsJapgolly.grommet.grommetStrings.del
  - typingsJapgolly.grommet.grommetStrings.details
  - typingsJapgolly.grommet.grommetStrings.dfn
  - typingsJapgolly.grommet.grommetStrings.dialog
  - typingsJapgolly.grommet.grommetStrings.div
  - typingsJapgolly.grommet.grommetStrings.dl
  - typingsJapgolly.grommet.grommetStrings.dt
  - typingsJapgolly.grommet.grommetStrings.em
  - typingsJapgolly.grommet.grommetStrings.embed
  - typingsJapgolly.grommet.grommetStrings.fieldset
  - typingsJapgolly.grommet.grommetStrings.figcaption
  - typingsJapgolly.grommet.grommetStrings.figure
  - typingsJapgolly.grommet.grommetStrings.footer
  - typingsJapgolly.grommet.grommetStrings.form
  - typingsJapgolly.grommet.grommetStrings.h1
  - typingsJapgolly.grommet.grommetStrings.h2
  - typingsJapgolly.grommet.grommetStrings.h3
  - typingsJapgolly.grommet.grommetStrings.h4
  - typingsJapgolly.grommet.grommetStrings.h5
  - typingsJapgolly.grommet.grommetStrings.h6
  - typingsJapgolly.grommet.grommetStrings.head
  - typingsJapgolly.grommet.grommetStrings.header
  - typingsJapgolly.grommet.grommetStrings.hgroup
  - typingsJapgolly.grommet.grommetStrings.hr
  - typingsJapgolly.grommet.grommetStrings.html
  - typingsJapgolly.grommet.grommetStrings.i
  - typingsJapgolly.grommet.grommetStrings.iframe
  - typingsJapgolly.grommet.grommetStrings.img
  - typingsJapgolly.grommet.grommetStrings.input
  - typingsJapgolly.grommet.grommetStrings.ins
  - typingsJapgolly.grommet.grommetStrings.kbd
  - typingsJapgolly.grommet.grommetStrings.keygen
  - typingsJapgolly.grommet.grommetStrings.label
  - typingsJapgolly.grommet.grommetStrings.legend
  - typingsJapgolly.grommet.grommetStrings.li
  - typingsJapgolly.grommet.grommetStrings.link
  - typingsJapgolly.grommet.grommetStrings.main
  - typingsJapgolly.grommet.grommetStrings.map
  - typingsJapgolly.grommet.grommetStrings.mark
  - typingsJapgolly.grommet.grommetStrings.menu
  - typingsJapgolly.grommet.grommetStrings.menuitem
  - typingsJapgolly.grommet.grommetStrings.meta
  - typingsJapgolly.grommet.grommetStrings.meter
  - typingsJapgolly.grommet.grommetStrings.nav
  - typingsJapgolly.grommet.grommetStrings.noindex
  - typingsJapgolly.grommet.grommetStrings.noscript
  - typingsJapgolly.grommet.grommetStrings.`object`
  - typingsJapgolly.grommet.grommetStrings.ol
  - typingsJapgolly.grommet.grommetStrings.optgroup
  - typingsJapgolly.grommet.grommetStrings.option
  - typingsJapgolly.grommet.grommetStrings.output
  - typingsJapgolly.grommet.grommetStrings.p
  - typingsJapgolly.grommet.grommetStrings.param
  - typingsJapgolly.grommet.grommetStrings.picture
  - typingsJapgolly.grommet.grommetStrings.pre
  - typingsJapgolly.grommet.grommetStrings.progress
  - typingsJapgolly.grommet.grommetStrings.q
  - typingsJapgolly.grommet.grommetStrings.rp
  - typingsJapgolly.grommet.grommetStrings.rt
  - typingsJapgolly.grommet.grommetStrings.ruby
  - typingsJapgolly.grommet.grommetStrings.s
  - typingsJapgolly.grommet.grommetStrings.samp
  - typingsJapgolly.grommet.grommetStrings.slot
  - typingsJapgolly.grommet.grommetStrings.script
  - typingsJapgolly.grommet.grommetStrings.section
  - typingsJapgolly.grommet.grommetStrings.select
  - typingsJapgolly.grommet.grommetStrings.small
  - typingsJapgolly.grommet.grommetStrings.source
  - typingsJapgolly.grommet.grommetStrings.span
  - typingsJapgolly.grommet.grommetStrings.strong
  - typingsJapgolly.grommet.grommetStrings.style
  - typingsJapgolly.grommet.grommetStrings.sub
  - typingsJapgolly.grommet.grommetStrings.summary
  - typingsJapgolly.grommet.grommetStrings.sup
  - typingsJapgolly.grommet.grommetStrings.table
  - typingsJapgolly.grommet.grommetStrings.template
  - typingsJapgolly.grommet.grommetStrings.tbody
  - typingsJapgolly.grommet.grommetStrings.td
  - typingsJapgolly.grommet.grommetStrings.textarea
  - typingsJapgolly.grommet.grommetStrings.tfoot
  - typingsJapgolly.grommet.grommetStrings.th
  - typingsJapgolly.grommet.grommetStrings.thead
  - typingsJapgolly.grommet.grommetStrings.time
  - typingsJapgolly.grommet.grommetStrings.title
  - typingsJapgolly.grommet.grommetStrings.tr
  - typingsJapgolly.grommet.grommetStrings.track
  - typingsJapgolly.grommet.grommetStrings.u
  - typingsJapgolly.grommet.grommetStrings.ul
  - typingsJapgolly.grommet.grommetStrings.`var`
  - typingsJapgolly.grommet.grommetStrings.video
  - typingsJapgolly.grommet.grommetStrings.wbr
  - typingsJapgolly.grommet.grommetStrings.webview
  - typingsJapgolly.grommet.grommetStrings.svg
  - typingsJapgolly.grommet.grommetStrings.animate
  - typingsJapgolly.grommet.grommetStrings.animateMotion
  - typingsJapgolly.grommet.grommetStrings.animateTransform
  - typingsJapgolly.grommet.grommetStrings.circle
  - typingsJapgolly.grommet.grommetStrings.clipPath
  - typingsJapgolly.grommet.grommetStrings.defs
  - typingsJapgolly.grommet.grommetStrings.desc
  - typingsJapgolly.grommet.grommetStrings.ellipse
  - typingsJapgolly.grommet.grommetStrings.feBlend
  - typingsJapgolly.grommet.grommetStrings.feColorMatrix
  - typingsJapgolly.grommet.grommetStrings.feComponentTransfer
  - typingsJapgolly.grommet.grommetStrings.feComposite
  - typingsJapgolly.grommet.grommetStrings.feConvolveMatrix
  - typingsJapgolly.grommet.grommetStrings.feDiffuseLighting
  - typingsJapgolly.grommet.grommetStrings.feDisplacementMap
  - typingsJapgolly.grommet.grommetStrings.feDistantLight
  - typingsJapgolly.grommet.grommetStrings.feDropShadow
  - typingsJapgolly.grommet.grommetStrings.feFlood
  - typingsJapgolly.grommet.grommetStrings.feFuncA
  - typingsJapgolly.grommet.grommetStrings.feFuncB
  - typingsJapgolly.grommet.grommetStrings.feFuncG
  - typingsJapgolly.grommet.grommetStrings.feFuncR
  - typingsJapgolly.grommet.grommetStrings.feGaussianBlur
  - typingsJapgolly.grommet.grommetStrings.feImage
  - typingsJapgolly.grommet.grommetStrings.feMerge
  - typingsJapgolly.grommet.grommetStrings.feMergeNode
  - typingsJapgolly.grommet.grommetStrings.feMorphology
  - typingsJapgolly.grommet.grommetStrings.feOffset
  - typingsJapgolly.grommet.grommetStrings.fePointLight
  - typingsJapgolly.grommet.grommetStrings.feSpecularLighting
  - typingsJapgolly.grommet.grommetStrings.feSpotLight
  - typingsJapgolly.grommet.grommetStrings.feTile
  - typingsJapgolly.grommet.grommetStrings.feTurbulence
  - typingsJapgolly.grommet.grommetStrings.filter
  - typingsJapgolly.grommet.grommetStrings.foreignObject
  - typingsJapgolly.grommet.grommetStrings.g
  - typingsJapgolly.grommet.grommetStrings.image
  - typingsJapgolly.grommet.grommetStrings.line
  - typingsJapgolly.grommet.grommetStrings.linearGradient
  - typingsJapgolly.grommet.grommetStrings.marker
  - typingsJapgolly.grommet.grommetStrings.mask
  - typingsJapgolly.grommet.grommetStrings.metadata
  - typingsJapgolly.grommet.grommetStrings.mpath
  - typingsJapgolly.grommet.grommetStrings.path
  - typingsJapgolly.grommet.grommetStrings.pattern
  - typingsJapgolly.grommet.grommetStrings.polygon
  - typingsJapgolly.grommet.grommetStrings.polyline
  - typingsJapgolly.grommet.grommetStrings.radialGradient
  - typingsJapgolly.grommet.grommetStrings.rect
  - typingsJapgolly.grommet.grommetStrings.stop
  - typingsJapgolly.grommet.grommetStrings.switch
  - typingsJapgolly.grommet.grommetStrings.symbol
  - typingsJapgolly.grommet.grommetStrings.text
  - typingsJapgolly.grommet.grommetStrings.textPath
  - typingsJapgolly.grommet.grommetStrings.tspan
  - typingsJapgolly.grommet.grommetStrings.use
  - typingsJapgolly.grommet.grommetStrings.view
  - typingsJapgolly.react.mod.ComponentType[scala.Any]
*/
type PolymorphicType = _PolymorphicType | ComponentType[Any]

/* Rewritten from type alias, can be one of: 
  - scala.Boolean
  - typingsJapgolly.grommet.grommetStrings.xsmall
  - typingsJapgolly.grommet.grommetStrings.small
  - typingsJapgolly.grommet.grommetStrings.medium
  - typingsJapgolly.grommet.grommetStrings.large
  - typingsJapgolly.grommet.grommetStrings.xlarge
  - typingsJapgolly.grommet.grommetStrings.full
  - java.lang.String
  - typingsJapgolly.grommet.anon.Corner
*/
type RoundType = _RoundType | Boolean | String

// the basic T-Shirt sizes xsmall through xlarge. Some places add on.
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.grommet.grommetStrings.xsmall
  - typingsJapgolly.grommet.grommetStrings.small
  - typingsJapgolly.grommet.grommetStrings.medium
  - typingsJapgolly.grommet.grommetStrings.large
  - typingsJapgolly.grommet.grommetStrings.xlarge
  - java.lang.String
*/
type TShirtSizeType = _TShirtSizeType | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.grommet.grommetStrings.hair
  - typingsJapgolly.grommet.grommetStrings.xsmall
  - typingsJapgolly.grommet.grommetStrings.small
  - typingsJapgolly.grommet.grommetStrings.medium
  - typingsJapgolly.grommet.grommetStrings.large
  - typingsJapgolly.grommet.grommetStrings.xlarge
  - typingsJapgolly.grommet.grommetStrings.none
  - java.lang.String
  - scala.Double
*/
type ThicknessType = _ThicknessType | String | Double

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.grommet.grommetStrings.xxsmall
  - typingsJapgolly.grommet.grommetStrings.xxlarge
  - typingsJapgolly.grommet.es6UtilsMod.TShirtSizeType
  - typingsJapgolly.grommet.grommetStrings.`100Percentsign`
  - typingsJapgolly.grommet.anon.MaxMin
*/
type WidthType = _WidthType | String
