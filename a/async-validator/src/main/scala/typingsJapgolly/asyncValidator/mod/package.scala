package typingsJapgolly.asyncValidator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ErrorList = js.Array[typingsJapgolly.asyncValidator.mod.ValidateError]
  type FieldErrorList = org.scalablytyped.runtime.StringDictionary[js.Array[typingsJapgolly.asyncValidator.mod.ValidateError]]
  type Rules = org.scalablytyped.runtime.StringDictionary[
    typingsJapgolly.asyncValidator.mod.RuleItem | js.Array[typingsJapgolly.asyncValidator.mod.RuleItem]
  ]
  type ValidateSource = org.scalablytyped.runtime.StringDictionary[js.Any]
}
