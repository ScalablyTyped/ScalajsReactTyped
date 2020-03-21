package typingsJapgolly.vegaTypings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object encodeMod {
  type AlignValueRef = typingsJapgolly.vegaTypings.encodeMod.ScaledValueRef[typingsJapgolly.vegaTypings.encodeMod.Align]
  type AnchorValueRef = typingsJapgolly.vegaTypings.encodeMod.ScaledValueRef[typingsJapgolly.vegaTypings.titleMod.TitleAnchor]
  type ArbitraryValueRef = typingsJapgolly.vegaTypings.encodeMod.NumericValueRef | typingsJapgolly.vegaTypings.encodeMod.ColorValueRef | typingsJapgolly.vegaTypings.encodeMod.ScaledValueRef[js.Any]
  type ArrayValueRef = typingsJapgolly.vegaTypings.encodeMod.ScaledValueRef[js.Array[js.Any]]
  type BooleanValueRef = typingsJapgolly.vegaTypings.encodeMod.ScaledValueRef[scala.Boolean]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.vegaTypings.encodeMod.ScaledValueRef[typingsJapgolly.vegaTypings.colorMod.Color]
    - typingsJapgolly.vegaTypings.Anon0
    - typingsJapgolly.vegaTypings.AnonCount
    - typingsJapgolly.vegaTypings.AnonColor
  */
  type ColorValueRef = typingsJapgolly.vegaTypings.encodeMod._ColorValueRef | typingsJapgolly.vegaTypings.encodeMod.ScaledValueRef[typingsJapgolly.vegaTypings.colorMod.Color]
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typingsJapgolly.vegaTypings.signalMod.SignalRef
    - typingsJapgolly.vegaTypings.encodeMod.DatumFieldRef
    - typingsJapgolly.vegaTypings.encodeMod.GroupFieldRef
    - typingsJapgolly.vegaTypings.encodeMod.ParentFieldRef
  */
  type Field = typingsJapgolly.vegaTypings.encodeMod._Field | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.vegaTypings.vegaTypingsStrings.normal
    - typingsJapgolly.vegaTypings.vegaTypingsStrings.italic
    - typingsJapgolly.vegaTypings.vegaTypingsStrings.oblique
    - java.lang.String
  */
  type FontStyle = typingsJapgolly.vegaTypings.encodeMod._FontStyle | java.lang.String
  type FontStyleValueRef = typingsJapgolly.vegaTypings.encodeMod.ScaledValueRef[typingsJapgolly.vegaTypings.encodeMod.FontStyle]
  type FontWeightValueRef = typingsJapgolly.vegaTypings.encodeMod.ScaledValueRef[typingsJapgolly.vegaTypings.encodeMod.FontWeight]
  type NumericValueRef = (typingsJapgolly.vegaTypings.encodeMod.ScaledValueRef[scala.Double] | js.Object) with typingsJapgolly.vegaTypings.AnonExponent
  type OrientValueRef = typingsJapgolly.vegaTypings.encodeMod.ScaledValueRef[typingsJapgolly.vegaTypings.encodeMod.Orient]
  type ProductionRule[T] = T | (js.Array[typingsJapgolly.vegaTypings.AnonTest with T])
  type RuleEncodeEntry = typingsJapgolly.vegaTypings.encodeMod.EncodeEntry
  type StringValueRef = typingsJapgolly.vegaTypings.encodeMod.ScaledValueRef[java.lang.String]
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
  type SymbolShape = typingsJapgolly.vegaTypings.encodeMod._SymbolShape | java.lang.String
  type SymbolShapeValueRef = typingsJapgolly.vegaTypings.encodeMod.ScaledValueRef[typingsJapgolly.vegaTypings.encodeMod.SymbolShape]
  type Text = java.lang.String | js.Array[java.lang.String]
  type TextBaselineValueRef = typingsJapgolly.vegaTypings.encodeMod.ScaledValueRef[typingsJapgolly.vegaTypings.encodeMod.TextBaseline]
  type TextValueRef = typingsJapgolly.vegaTypings.encodeMod.ScaledValueRef[typingsJapgolly.vegaTypings.encodeMod.Text]
}
