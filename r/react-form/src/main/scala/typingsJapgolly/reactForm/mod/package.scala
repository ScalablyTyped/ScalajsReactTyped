package typingsJapgolly.reactForm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type FormError = js.UndefOr[java.lang.String]
  type FormErrors = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.reactForm.mod.FormError]
  type FormValue = js.Any
  type FormValues = typingsJapgolly.reactForm.mod.Nested[typingsJapgolly.reactForm.mod.FormValue]
  type NestedErrors = typingsJapgolly.reactForm.mod.Nested[typingsJapgolly.reactForm.mod.FormErrors]
  type RenderReturn = japgolly.scalajs.react.raw.React.Element | typingsJapgolly.reactForm.reactFormBooleans.`false` | scala.Null | js.Array[scala.Nothing]
  type SelectOptions = js.Array[typingsJapgolly.reactForm.AnonLabel]
  type Touched = typingsJapgolly.reactForm.mod.Nested[scala.Boolean]
  type ValidateValuesFunction = js.Function1[
    /* values */ typingsJapgolly.reactForm.mod.FormValues, 
    typingsJapgolly.reactForm.mod.FormErrors
  ]
}
