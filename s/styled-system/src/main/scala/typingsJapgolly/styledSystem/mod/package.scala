package typingsJapgolly.styledSystem

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Config = /** Property name exposed for use in components */
  org.scalablytyped.runtime.StringDictionary[typingsJapgolly.styledSystem.mod.ConfigStyle | scala.Boolean]
  type ObjectOrArray[T, K /* <: java.lang.String */] = js.Array[T] | (typingsJapgolly.std.Record[K, T | (typingsJapgolly.std.Record[K, T]) | js.Array[T]])
  type ResponsiveValue[T, ThemeType /* <: typingsJapgolly.styledSystem.mod.Theme[typingsJapgolly.styledSystem.mod.TLengthStyledSystem] */] = T | (js.Array[T | scala.Null]) | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in styled-system.styled-system.ThemeValue<'breakpoints', ThemeType, any> & string | number ]:? T}
    */ typingsJapgolly.styledSystem.styledSystemStrings.ResponsiveValue with js.Any)
  type Scale = typingsJapgolly.styledSystem.mod.ObjectOrArray[scala.Double | java.lang.String, java.lang.String]
  type TLengthStyledSystem = java.lang.String | typingsJapgolly.styledSystem.styledSystemNumbers.`0` | scala.Double
  type ThemeValue[K /* <: java.lang.String */, ThemeType, TVal] = js.Any | scala.Double
}
