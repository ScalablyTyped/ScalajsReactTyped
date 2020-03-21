package typingsJapgolly.vegaTypings

import typingsJapgolly.vegaTypings.colorMod.Color
import typingsJapgolly.vegaTypings.encodeMod.Align
import typingsJapgolly.vegaTypings.encodeMod.AlignValueRef
import typingsJapgolly.vegaTypings.encodeMod.AnchorValueRef
import typingsJapgolly.vegaTypings.encodeMod.ArrayValueRef
import typingsJapgolly.vegaTypings.encodeMod.BooleanValueRef
import typingsJapgolly.vegaTypings.encodeMod.ColorValueRef
import typingsJapgolly.vegaTypings.encodeMod.FontStyle
import typingsJapgolly.vegaTypings.encodeMod.FontStyleValueRef
import typingsJapgolly.vegaTypings.encodeMod.FontWeight
import typingsJapgolly.vegaTypings.encodeMod.FontWeightValueRef
import typingsJapgolly.vegaTypings.encodeMod.NumericValueRef
import typingsJapgolly.vegaTypings.encodeMod.Orient
import typingsJapgolly.vegaTypings.encodeMod.OrientValueRef
import typingsJapgolly.vegaTypings.encodeMod.StringValueRef
import typingsJapgolly.vegaTypings.encodeMod.SymbolShape
import typingsJapgolly.vegaTypings.encodeMod.SymbolShapeValueRef
import typingsJapgolly.vegaTypings.encodeMod.TextBaseline
import typingsJapgolly.vegaTypings.encodeMod.TextBaselineValueRef
import typingsJapgolly.vegaTypings.titleMod.TitleAnchor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vega-typings/types/spec/values", JSImport.Namespace)
@js.native
object valuesMod extends js.Object {
  type AlignValue = Align | AlignValueRef
  type AnchorValue = TitleAnchor | AnchorValueRef
  type BooleanValue = Boolean | BooleanValueRef
  type ColorValue = Null | Color | ColorValueRef
  type DashArrayValue = js.Array[Double] | ArrayValueRef
  type FontStyleValue = FontStyle | FontStyleValueRef
  type FontWeightValue = FontWeight | FontWeightValueRef
  type NumberValue = Double | NumericValueRef
  type OrientValue = Orient | OrientValueRef
  type StringValue = String | StringValueRef
  type SymbolShapeValue = SymbolShape | SymbolShapeValueRef
  type TextBaselineValue = TextBaseline | TextBaselineValueRef
}

