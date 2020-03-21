package typingsJapgolly.storybookAddonKnobs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object optionsMod {
  type OptionsTypeKnobSingleValue = js.UndefOr[
    java.lang.String | scala.Double | scala.Null | (js.Array[scala.Double | java.lang.String])
  ]
  type OptionsTypeKnobValue[T /* <: typingsJapgolly.storybookAddonKnobs.optionsMod.OptionsTypeKnobSingleValue */] = T | js.Array[typingsJapgolly.std.NonNullable[T]]
  type OptionsTypeOptionsProp[T] = org.scalablytyped.runtime.StringDictionary[T]
}
