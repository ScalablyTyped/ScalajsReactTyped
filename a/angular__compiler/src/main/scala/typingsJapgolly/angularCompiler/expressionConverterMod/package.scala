package typingsJapgolly.angularCompiler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object expressionConverterMod {
  type BuiltinConverter = js.Function1[
    /* args */ js.Array[typingsJapgolly.angularCompiler.outputAstMod.Expression], 
    typingsJapgolly.angularCompiler.outputAstMod.Expression
  ]
  type InterpolationFunction = js.Function1[
    /* args */ js.Array[typingsJapgolly.angularCompiler.outputAstMod.Expression], 
    typingsJapgolly.angularCompiler.outputAstMod.Expression
  ]
}
