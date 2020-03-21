package typingsJapgolly.emberUtils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type FunctionArgs[F] = (js.Tuple5[js.Any, js.Any, js.Any, js.Any, js.Any]) | (js.Tuple4[js.Any, js.Any, js.Any, js.Any]) | (js.Tuple3[js.Any, js.Any, js.Any]) | (js.Tuple2[js.Any, js.Any]) | js.Array[js.Any]
  type KeysOfType[Base, Condition] = java.lang.String
  type TypeOf[Base, Condition] = (typingsJapgolly.emberUtils.typesMod.KeysOfType[Base, Condition]) | typingsJapgolly.emberUtils.emberUtilsStrings.`object`
}
