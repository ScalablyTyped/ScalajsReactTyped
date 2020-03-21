package typingsJapgolly.reduxForm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object fieldArrayMod {
  type BaseFieldArrayProps[P, FieldValue] = (P | typingsJapgolly.reduxForm.AnonProps[P]) with (typingsJapgolly.reduxForm.fieldArrayMod._BaseFieldArrayProps[P, FieldValue])
  type FieldIterate[FieldValue, R] = js.Function3[
    /* name */ java.lang.String, 
    /* index */ scala.Double, 
    /* fields */ typingsJapgolly.reduxForm.fieldArrayMod.FieldArrayFieldsProps[FieldValue], 
    R
  ]
}
