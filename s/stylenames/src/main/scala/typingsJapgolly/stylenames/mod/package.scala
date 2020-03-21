package typingsJapgolly.stylenames

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type StyleValue = js.UndefOr[scala.Null | java.lang.String | typingsJapgolly.stylenames.mod.StyleValueObject]
  type StyleValueConditionFunction = js.Function0[js.UndefOr[scala.Boolean | scala.Null]]
  type StyleValueObject = typingsJapgolly.std.Record[
    java.lang.String | scala.Double, 
    scala.Boolean | typingsJapgolly.stylenames.mod.StyleValueConditionFunction
  ]
}
