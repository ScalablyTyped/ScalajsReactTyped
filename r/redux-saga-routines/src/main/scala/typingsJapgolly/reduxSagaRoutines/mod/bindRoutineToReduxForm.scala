package typingsJapgolly.reduxSagaRoutines.mod

import typingsJapgolly.reduxActions.mod.Action
import typingsJapgolly.reduxActions.mod.ActionFunction1
import typingsJapgolly.reduxActions.mod.ActionMeta
import typingsJapgolly.reduxForm.reduxFormMod.FormSubmitHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-saga-routines", "bindRoutineToReduxForm")
@js.native
object bindRoutineToReduxForm extends js.Object {
  def apply[TFormData, TProps](
    routine: Routine[
      ActionFunction1[
        ReduxFormPayload[TFormData, TProps], 
        (Action[ReduxFormPayload[TFormData, TProps]]) | (ActionMeta[ReduxFormPayload[TFormData, TProps], _])
      ], 
      ActionCreatorFunction[_, _], 
      ActionCreatorFunction[_, _], 
      ActionCreatorFunction[_, _], 
      ActionCreatorFunction[_, _]
    ]
  ): FormSubmitHandler[TFormData, TProps, String] = js.native
  def apply[TFormData, TProps](
    routine: Routine[
      ActionFunction1[
        ReduxFormPayload[TFormData, TProps], 
        (Action[ReduxFormPayload[TFormData, TProps]]) | (ActionMeta[ReduxFormPayload[TFormData, TProps], _])
      ], 
      ActionCreatorFunction[_, _], 
      ActionCreatorFunction[_, _], 
      ActionCreatorFunction[_, _], 
      ActionCreatorFunction[_, _]
    ],
    noSuccessPayload: Boolean
  ): FormSubmitHandler[TFormData, TProps, String] = js.native
}

