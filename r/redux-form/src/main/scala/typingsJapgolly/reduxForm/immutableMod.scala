package typingsJapgolly.reduxForm

import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.StatelessComponent
import typingsJapgolly.reduxForm.actionsMod.FormAction
import typingsJapgolly.reduxForm.fieldMod.BaseFieldProps
import typingsJapgolly.reduxForm.fieldMod.GenericFieldHTMLAttributes
import typingsJapgolly.reduxForm.formMod.FormProps
import typingsJapgolly.reduxForm.formNameMod.FormNameProps
import typingsJapgolly.reduxForm.formSectionMod.FormSectionProps
import typingsJapgolly.reduxForm.mod.FormErrors
import typingsJapgolly.reduxForm.reducerMod.FormReducer
import typingsJapgolly.reduxForm.reducerMod.FormStateMap
import typingsJapgolly.reduxForm.reduxFormMod.ConfigProps
import typingsJapgolly.reduxForm.reduxFormMod.FormDecorator
import typingsJapgolly.reduxForm.selectorsMod.BooleanSelector
import typingsJapgolly.reduxForm.selectorsMod.DataSelector
import typingsJapgolly.reduxForm.selectorsMod.ErrorSelector
import typingsJapgolly.reduxForm.selectorsMod.FormOrFieldsBooleanSelector
import typingsJapgolly.reduxForm.selectorsMod.NamesSelector
import typingsJapgolly.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-form/immutable", JSImport.Namespace)
@js.native
object immutableMod extends js.Object {
  @js.native
  class Field[P /* <: GenericFieldHTMLAttributes | BaseFieldProps[js.Object] */] ()
    extends typingsJapgolly.reduxForm.fieldMod.Field[P]
  
  @js.native
  class FieldArray[P, FieldValue] ()
    extends typingsJapgolly.reduxForm.fieldArrayMod.FieldArray[P, FieldValue]
  
  @js.native
  class Fields[P] ()
    extends typingsJapgolly.reduxForm.fieldsMod.Fields[P]
  
  @js.native
  class Form[FormData, P, ErrorType] ()
    extends Component[FormProps[FormData, P, ErrorType], js.Object, js.Any]
  
  @js.native
  class FormSection[P] ()
    extends Component[FormSectionProps[P] with P, js.Object, js.Any]
  
  @js.native
  class SubmissionError[FormData, ErrorType] protected ()
    extends typingsJapgolly.reduxForm.mod.SubmissionError[FormData, ErrorType] {
    def this(errors: FormErrors[FormData, ErrorType]) = this()
  }
  
  val FormName: StatelessComponent[FormNameProps] = js.native
  val getFormAsyncErrors: ErrorSelector[js.Object, js.Object, String] = js.native
  val getFormInitialValues: DataSelector[js.Object, js.Object] = js.native
  val getFormMeta: DataSelector[js.Object, js.Object] = js.native
  val getFormNames: NamesSelector[js.Object] = js.native
  val getFormSubmitErrors: ErrorSelector[js.Object, js.Object, String] = js.native
  val getFormSyncErrors: ErrorSelector[js.Object, js.Object, String] = js.native
  val getFormSyncWarnings: ErrorSelector[js.Object, js.Object, String] = js.native
  val getFormValues: DataSelector[js.Object, js.Object] = js.native
  val hasSubmitFailed: BooleanSelector[js.Object] = js.native
  val hasSubmitSucceeded: BooleanSelector[js.Object] = js.native
  val isAsyncValidating: BooleanSelector[js.Object] = js.native
  val isDirty: FormOrFieldsBooleanSelector[js.Object] = js.native
  val isInvalid: BooleanSelector[js.Object] = js.native
  val isPristine: FormOrFieldsBooleanSelector[js.Object] = js.native
  val isSubmitting: BooleanSelector[js.Object] = js.native
  val isValid: BooleanSelector[js.Object] = js.native
  val reducer: FormReducer = js.native
  def formValueSelector[State](form: String): js.Function2[/* state */ State, /* repeated */ String, _] = js.native
  def formValueSelector[State](form: String, getFormState: js.Function1[/* state */ State, FormStateMap]): js.Function2[/* state */ State, /* repeated */ String, _] = js.native
  def reduxForm[FormData, P, ErrorType](config: ConfigProps[FormData, P, ErrorType]): FormDecorator[FormData, P, Partial[ConfigProps[FormData, P, ErrorType]], ErrorType] = js.native
  def reduxForm[FormData, P, ErrorType](config: Partial[ConfigProps[FormData, P, ErrorType]]): FormDecorator[FormData, P, ConfigProps[FormData, P, ErrorType], ErrorType] = js.native
  def startSubmit(form: String): FormAction = js.native
  def stopSubmit(form: String): FormAction = js.native
  def stopSubmit(form: String, errors: FormErrors[_, _]): FormAction = js.native
}

