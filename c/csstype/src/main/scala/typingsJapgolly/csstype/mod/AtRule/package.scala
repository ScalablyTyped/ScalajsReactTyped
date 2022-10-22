package typingsJapgolly.csstype.mod.AtRule

import typingsJapgolly.csstype.csstypeStrings.auto
import typingsJapgolly.csstype.csstypeStrings.normal
import typingsJapgolly.csstype.mod.DataType.FontStretchAbsolute
import typingsJapgolly.csstype.mod.DataType.FontWeightAbsolute
import typingsJapgolly.csstype.mod.DataType.ViewportLength
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AscentOverride = normal | String

type Bleed[TLength] = TLength | auto

type DescentOverride = normal | String

type FontFeatureSettings = normal | String

type FontStretch = FontStretchAbsolute | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.csstype.csstypeStrings.italic
  - typingsJapgolly.csstype.csstypeStrings.normal
  - typingsJapgolly.csstype.csstypeStrings.oblique
  - java.lang.String
*/
type FontStyle = _FontStyle | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.csstype.mod.DataType.EastAsianVariantValues
  - typingsJapgolly.csstype.csstypeStrings.`all-petite-caps`
  - typingsJapgolly.csstype.csstypeStrings.`all-small-caps`
  - typingsJapgolly.csstype.csstypeStrings.`common-ligatures`
  - typingsJapgolly.csstype.csstypeStrings.contextual
  - typingsJapgolly.csstype.csstypeStrings.`diagonal-fractions`
  - typingsJapgolly.csstype.csstypeStrings.`discretionary-ligatures`
  - typingsJapgolly.csstype.csstypeStrings.`full-width`
  - typingsJapgolly.csstype.csstypeStrings.`historical-forms`
  - typingsJapgolly.csstype.csstypeStrings.`historical-ligatures`
  - typingsJapgolly.csstype.csstypeStrings.`lining-nums`
  - typingsJapgolly.csstype.csstypeStrings.`no-common-ligatures`
  - typingsJapgolly.csstype.csstypeStrings.`no-contextual`
  - typingsJapgolly.csstype.csstypeStrings.`no-discretionary-ligatures`
  - typingsJapgolly.csstype.csstypeStrings.`no-historical-ligatures`
  - typingsJapgolly.csstype.csstypeStrings.none
  - typingsJapgolly.csstype.csstypeStrings.normal
  - typingsJapgolly.csstype.csstypeStrings.`oldstyle-nums`
  - typingsJapgolly.csstype.csstypeStrings.ordinal
  - typingsJapgolly.csstype.csstypeStrings.`petite-caps`
  - typingsJapgolly.csstype.csstypeStrings.`proportional-nums`
  - typingsJapgolly.csstype.csstypeStrings.`proportional-width`
  - typingsJapgolly.csstype.csstypeStrings.ruby
  - typingsJapgolly.csstype.csstypeStrings.`slashed-zero`
  - typingsJapgolly.csstype.csstypeStrings.`small-caps`
  - typingsJapgolly.csstype.csstypeStrings.`stacked-fractions`
  - typingsJapgolly.csstype.csstypeStrings.`tabular-nums`
  - typingsJapgolly.csstype.csstypeStrings.`titling-caps`
  - typingsJapgolly.csstype.csstypeStrings.unicase
  - java.lang.String
*/
type FontVariant = _FontVariant | String

type FontVariationSettings = normal | String

type FontWeight = FontWeightAbsolute | String

type Height[TLength] = ViewportLength[TLength] | String

type LineGapOverride = normal | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.csstype.csstypeStrings.crop
  - typingsJapgolly.csstype.csstypeStrings.cross
  - typingsJapgolly.csstype.csstypeStrings.none
  - java.lang.String
*/
type Marks = _Marks | String

type MaxHeight[TLength] = ViewportLength[TLength]

type MaxWidth[TLength] = ViewportLength[TLength]

type MaxZoom = auto | String | (Double & js.Object)

type MinHeight[TLength] = ViewportLength[TLength]

type MinWidth[TLength] = ViewportLength[TLength]

type MinZoom = auto | String | (Double & js.Object)

type Range = auto | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.csstype.mod.DataType.PageSize
  - TLength
  - typingsJapgolly.csstype.csstypeStrings.auto
  - typingsJapgolly.csstype.csstypeStrings.landscape
  - typingsJapgolly.csstype.csstypeStrings.portrait
  - java.lang.String
*/
type Size[TLength] = _Size[TLength] | TLength | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.csstype.csstypeStrings.auto
  - typingsJapgolly.csstype.csstypeStrings.bullets
  - typingsJapgolly.csstype.csstypeStrings.numbers
  - typingsJapgolly.csstype.csstypeStrings.`spell-out`
  - typingsJapgolly.csstype.csstypeStrings.words
  - java.lang.String
*/
type SpeakAs = _SpeakAs | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.csstype.csstypeStrings.additive
  - typingsJapgolly.csstype.csstypeStrings.alphabetic
  - typingsJapgolly.csstype.csstypeStrings.cyclic
  - typingsJapgolly.csstype.csstypeStrings.fixed
  - typingsJapgolly.csstype.csstypeStrings.numeric
  - typingsJapgolly.csstype.csstypeStrings.symbolic
  - java.lang.String
*/
type System = _System | String

type Width[TLength] = ViewportLength[TLength] | String

type Zoom = auto | String | (Double & js.Object)
