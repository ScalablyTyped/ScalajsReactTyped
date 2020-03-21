package typingsJapgolly.mathjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type BigNumber = typingsJapgolly.decimalJs.mod.Decimal
  type FactoryFunction[T] = js.Function1[/* scope */ js.Any, T]
  type ImportObject = org.scalablytyped.runtime.StringDictionary[js.Any]
  type MathArray = js.Array[js.Array[scala.Double] | scala.Double]
  type MathExpression = java.lang.String | js.Array[java.lang.String] | typingsJapgolly.mathjs.mod.MathArray | typingsJapgolly.mathjs.mod.Matrix
  /* Rewritten from type alias, can be one of: 
    - scala.Double
    - typingsJapgolly.mathjs.mod.BigNumber
    - typingsJapgolly.mathjs.mod.Fraction
    - typingsJapgolly.mathjs.mod.Complex
    - typingsJapgolly.mathjs.mod.Unit
    - typingsJapgolly.mathjs.mod.MathArray
    - typingsJapgolly.mathjs.mod.Matrix
  */
  type MathType = typingsJapgolly.mathjs.mod._MathType | scala.Double | typingsJapgolly.mathjs.mod.BigNumber | typingsJapgolly.mathjs.mod.MathArray
  type NoLiteralType[T] = T | scala.Boolean | java.lang.String | scala.Double
}
