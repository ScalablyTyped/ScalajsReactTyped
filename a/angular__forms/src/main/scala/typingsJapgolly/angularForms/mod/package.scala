package typingsJapgolly.angularForms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AsyncValidatorFn = js.Function1[
    /* control */ typingsJapgolly.angularForms.mod.AbstractControl, 
    (js.Promise[typingsJapgolly.angularForms.mod.ValidationErrors | scala.Null]) | (typingsJapgolly.rxjs.mod.Observable_[typingsJapgolly.angularForms.mod.ValidationErrors | scala.Null])
  ]
  type ValidationErrors = org.scalablytyped.runtime.StringDictionary[js.Any]
  type ValidatorFn = js.Function1[
    /* control */ typingsJapgolly.angularForms.mod.AbstractControl, 
    typingsJapgolly.angularForms.mod.ValidationErrors | scala.Null
  ]
}
