package typingsJapgolly.nivoColors

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ColorIdentityFunction[D] = js.Function1[/* datum */ D, java.lang.String | scala.Double]
  type ColorModifier = js.Tuple2[typingsJapgolly.nivoColors.mod.ColorModifierType, scala.Double]
  type CustomColorFunction[D] = js.Function1[/* datum */ D, java.lang.String]
  type DatumIdentity[D] = java.lang.String | typingsJapgolly.nivoColors.mod.DatumIdentityFunction[D]
  type DatumIdentityFunction[D] = js.Function1[/* datum */ D, java.lang.String | scala.Double]
  type InheritedColorFunction[D] = js.Function1[/* datum */ D, java.lang.String]
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typingsJapgolly.nivoColors.AnonTheme
    - typingsJapgolly.nivoColors.AnonFrom
    - typingsJapgolly.nivoColors.mod.InheritedColorFunction[D]
  */
  type InheritedColorProp[D] = typingsJapgolly.nivoColors.mod._InheritedColorProp[D] | java.lang.String | typingsJapgolly.nivoColors.mod.InheritedColorFunction[D]
  type OrdinalColorScale[D] = js.Function1[/* datum */ D, java.lang.String]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.nivoColors.mod.DatumColorInstruction
    - typingsJapgolly.nivoColors.mod.SchemeColorInstruction
    - typingsJapgolly.nivoColors.mod.CustomColorFunction[D]
    - js.Array[java.lang.String]
    - java.lang.String
  */
  type OrdinalColorsInstruction[D] = typingsJapgolly.nivoColors.mod._OrdinalColorsInstruction[D] | js.Array[java.lang.String] | typingsJapgolly.nivoColors.mod.CustomColorFunction[D] | java.lang.String
}
