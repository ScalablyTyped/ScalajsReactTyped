package typingsJapgolly.reduxForm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reduxFormMod {
  type FormDecorator[FormData, P, Config, ErrorType] = js.Function1[
    /* component */ typingsJapgolly.react.mod.ComponentType[
      P with (typingsJapgolly.reduxForm.reduxFormMod.InjectedFormProps[FormData, P, ErrorType])
    ], 
    typingsJapgolly.reduxForm.reduxFormMod.DecoratedComponentClass[FormData, P with Config, ErrorType]
  ]
  type FormSubmitHandler[FormData, P, ErrorType] = js.Function3[
    /* values */ FormData, 
    /* dispatch */ typingsJapgolly.redux.mod.Dispatch[js.Any], 
    /* props */ P, 
    scala.Unit | (typingsJapgolly.reduxForm.mod.FormErrors[FormData, ErrorType]) | js.Promise[js.Any]
  ]
  type GetFormState = js.Function1[/* state */ js.Any, typingsJapgolly.reduxForm.reducerMod.FormStateMap]
}
