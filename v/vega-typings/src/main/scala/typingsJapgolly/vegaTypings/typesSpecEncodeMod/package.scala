package typingsJapgolly.vegaTypings.typesSpecEncodeMod

import typingsJapgolly.vegaTypings.anon.Exponent
import typingsJapgolly.vegaTypings.anon.Test
import typingsJapgolly.vegaTypings.anon.exponentnumberNumericValu
import typingsJapgolly.vegaTypings.typesSpecColorMod.Color
import typingsJapgolly.vegaTypings.typesSpecConfigMod.StrokeCap
import typingsJapgolly.vegaTypings.typesSpecTitleMod.TitleAnchor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AlignValueRef = ScaledValueRef[Align]

type AnchorValueRef = ScaledValueRef[TitleAnchor]

type ArbitraryValueRef = NumericValueRef | ColorValueRef | ScaledValueRef[Any]

type ArrayValueRef = ScaledValueRef[js.Array[Any]]

/* Rewritten from type alias, can be one of: 
  - scala.Null
  - typingsJapgolly.vegaTypings.vegaTypingsStrings.multiply
  - typingsJapgolly.vegaTypings.vegaTypingsStrings.screen
  - typingsJapgolly.vegaTypings.vegaTypingsStrings.overlay
  - typingsJapgolly.vegaTypings.vegaTypingsStrings.darken
  - typingsJapgolly.vegaTypings.vegaTypingsStrings.lighten
  - typingsJapgolly.vegaTypings.vegaTypingsStrings.`color-dodge`
  - typingsJapgolly.vegaTypings.vegaTypingsStrings.`color-burn`
  - typingsJapgolly.vegaTypings.vegaTypingsStrings.`hard-light`
  - typingsJapgolly.vegaTypings.vegaTypingsStrings.`soft-light`
  - typingsJapgolly.vegaTypings.vegaTypingsStrings.difference
  - typingsJapgolly.vegaTypings.vegaTypingsStrings.exclusion
  - typingsJapgolly.vegaTypings.vegaTypingsStrings.hue
  - typingsJapgolly.vegaTypings.vegaTypingsStrings.saturation
  - typingsJapgolly.vegaTypings.vegaTypingsStrings.color
  - typingsJapgolly.vegaTypings.vegaTypingsStrings.luminosity
*/
type Blend = _Blend | Null

type BooleanValueRef = ScaledValueRef[Boolean]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.vegaTypings.typesSpecEncodeMod.ScaledValueRef[typingsJapgolly.vegaTypings.typesSpecColorMod.Color]
  - typingsJapgolly.vegaTypings.anon.`0`
  - typingsJapgolly.vegaTypings.anon.Count
  - typingsJapgolly.vegaTypings.anon.Color
*/
type ColorValueRef = _ColorValueRef | ScaledValueRef[Color]

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsJapgolly.vegaTypings.typesSpecSignalMod.SignalRef
  - typingsJapgolly.vegaTypings.typesSpecEncodeMod.DatumFieldRef
  - typingsJapgolly.vegaTypings.typesSpecEncodeMod.GroupFieldRef
  - typingsJapgolly.vegaTypings.typesSpecEncodeMod.ParentFieldRef
*/
type Field = _Field | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.vegaTypings.vegaTypingsStrings.normal
  - typingsJapgolly.vegaTypings.vegaTypingsStrings.italic
  - typingsJapgolly.vegaTypings.vegaTypingsStrings.oblique
  - java.lang.String
*/
type FontStyle = _FontStyle | String

type FontStyleValueRef = ScaledValueRef[FontStyle]

type FontWeightValueRef = ScaledValueRef[FontWeight]

type NumericValueRef = (ScaledValueRef[Double] & Exponent) | exponentnumberNumericValu

type OrientValueRef = ScaledValueRef[Orient]

type ProductionRule[T] = T | (js.Array[Test & T])

type RuleEncodeEntry = EncodeEntry

type StringValueRef = ScaledValueRef[String]

type StrokeCapValueRef = ScaledValueRef[StrokeCap]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.vegaTypings.vegaTypingsStrings.circle
  - typingsJapgolly.vegaTypings.vegaTypingsStrings.square
  - typingsJapgolly.vegaTypings.vegaTypingsStrings.cross
  - typingsJapgolly.vegaTypings.vegaTypingsStrings.diamond
  - typingsJapgolly.vegaTypings.vegaTypingsStrings.`triangle-up`
  - typingsJapgolly.vegaTypings.vegaTypingsStrings.`triangle-down`
  - typingsJapgolly.vegaTypings.vegaTypingsStrings.`triangle-right`
  - typingsJapgolly.vegaTypings.vegaTypingsStrings.`triangle-left`
  - typingsJapgolly.vegaTypings.vegaTypingsStrings.arrow
  - typingsJapgolly.vegaTypings.vegaTypingsStrings.triangle
  - typingsJapgolly.vegaTypings.vegaTypingsStrings.wedge
  - typingsJapgolly.vegaTypings.vegaTypingsStrings.stroke
  - java.lang.String
*/
type SymbolShape = _SymbolShape | String

type SymbolShapeValueRef = ScaledValueRef[SymbolShape]

type Text = String | js.Array[String]

type TextBaselineValueRef = ScaledValueRef[TextBaseline]

type TextValueRef = ScaledValueRef[Text]
