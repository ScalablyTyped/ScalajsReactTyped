package typingsJapgolly.reduxForm

import japgolly.scalajs.react.facade.React.ComponentClassP
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.Context
import typingsJapgolly.react.mod.FunctionComponent
import typingsJapgolly.reduxForm.anon.FnCall
import typingsJapgolly.reduxForm.anon.FnCallFormSyncErrorsError
import typingsJapgolly.reduxForm.anon.FnCallFormSyncWarningsWarning
import typingsJapgolly.reduxForm.anon.PartialInitializeOptions
import typingsJapgolly.reduxForm.libActionTypesMod.ActionTypes_
import typingsJapgolly.reduxForm.libActionsMod.FormAction
import typingsJapgolly.reduxForm.libFieldArrayMod.BaseFieldArrayProps
import typingsJapgolly.reduxForm.libFieldMod.BaseFieldProps
import typingsJapgolly.reduxForm.libFieldMod.GenericFieldHTMLAttributes
import typingsJapgolly.reduxForm.libFieldsMod.BaseFieldsProps
import typingsJapgolly.reduxForm.libFormMod.FormProps
import typingsJapgolly.reduxForm.libFormNameMod.FormNameProps
import typingsJapgolly.reduxForm.libFormSectionMod.FormSectionProps
import typingsJapgolly.reduxForm.libReducerMod.FormReducer
import typingsJapgolly.reduxForm.libReducerMod.FormStateMap
import typingsJapgolly.reduxForm.libReduxFormMod.ConfigProps
import typingsJapgolly.reduxForm.libReduxFormMod.FormContext
import typingsJapgolly.reduxForm.libReduxFormMod.FormDecorator
import typingsJapgolly.reduxForm.libSelectorsMod.BooleanSelector
import typingsJapgolly.reduxForm.libSelectorsMod.DataSelector
import typingsJapgolly.reduxForm.libSelectorsMod.ErrorSelector
import typingsJapgolly.reduxForm.libSelectorsMod.FormOrFieldsBooleanSelector
import typingsJapgolly.reduxForm.libSelectorsMod.NamesSelector
import typingsJapgolly.reduxForm.reduxFormStrings.append
import typingsJapgolly.reduxForm.reduxFormStrings.delete
import typingsJapgolly.reduxForm.reduxFormStrings.entries
import typingsJapgolly.reduxForm.reduxFormStrings.forEach
import typingsJapgolly.reduxForm.reduxFormStrings.get
import typingsJapgolly.reduxForm.reduxFormStrings.getAll
import typingsJapgolly.reduxForm.reduxFormStrings.has
import typingsJapgolly.reduxForm.reduxFormStrings.keys
import typingsJapgolly.reduxForm.reduxFormStrings.set
import typingsJapgolly.reduxForm.reduxFormStrings.values
import typingsJapgolly.std.Partial
import typingsJapgolly.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("redux-form", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object default {
    
    @JSImport("redux-form", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("redux-form", "default.arrayInsert")
    @js.native
    def arrayInsert: js.Function4[/* form */ String, /* field */ String, /* index */ Double, /* value */ Any, FormAction] = js.native
    inline def arrayInsert_=(
      x: js.Function4[/* form */ String, /* field */ String, /* index */ Double, /* value */ Any, FormAction]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("arrayInsert")(x.asInstanceOf[js.Any])
    
    @JSImport("redux-form", "default.arrayMove")
    @js.native
    def arrayMove: js.Function4[/* form */ String, /* field */ String, /* from */ Double, /* to */ Double, FormAction] = js.native
    inline def arrayMove_=(
      x: js.Function4[/* form */ String, /* field */ String, /* from */ Double, /* to */ Double, FormAction]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("arrayMove")(x.asInstanceOf[js.Any])
    
    @JSImport("redux-form", "default.arrayPop")
    @js.native
    def arrayPop: js.Function2[/* form */ String, /* field */ String, FormAction] = js.native
    inline def arrayPop_=(x: js.Function2[/* form */ String, /* field */ String, FormAction]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("arrayPop")(x.asInstanceOf[js.Any])
    
    @JSImport("redux-form", "default.arrayPush")
    @js.native
    def arrayPush: js.Function3[/* form */ String, /* field */ String, /* value */ Any, FormAction] = js.native
    inline def arrayPush_=(x: js.Function3[/* form */ String, /* field */ String, /* value */ Any, FormAction]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("arrayPush")(x.asInstanceOf[js.Any])
    
    @JSImport("redux-form", "default.arrayRemove")
    @js.native
    def arrayRemove: js.Function3[/* form */ String, /* field */ String, /* index */ Double, FormAction] = js.native
    
    @JSImport("redux-form", "default.arrayRemoveAll")
    @js.native
    def arrayRemoveAll: js.Function2[/* form */ String, /* field */ String, FormAction] = js.native
    inline def arrayRemoveAll_=(x: js.Function2[/* form */ String, /* field */ String, FormAction]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("arrayRemoveAll")(x.asInstanceOf[js.Any])
    
    inline def arrayRemove_=(x: js.Function3[/* form */ String, /* field */ String, /* index */ Double, FormAction]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("arrayRemove")(x.asInstanceOf[js.Any])
    
    @JSImport("redux-form", "default.arrayShift")
    @js.native
    def arrayShift: js.Function2[/* form */ String, /* field */ String, FormAction] = js.native
    inline def arrayShift_=(x: js.Function2[/* form */ String, /* field */ String, FormAction]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("arrayShift")(x.asInstanceOf[js.Any])
    
    @JSImport("redux-form", "default.arraySplice")
    @js.native
    def arraySplice: js.Function5[
        /* form */ String, 
        /* field */ String, 
        /* index */ Double, 
        /* removeNum */ Double, 
        /* value */ Any, 
        FormAction
      ] = js.native
    inline def arraySplice_=(
      x: js.Function5[
          /* form */ String, 
          /* field */ String, 
          /* index */ Double, 
          /* removeNum */ Double, 
          /* value */ Any, 
          FormAction
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("arraySplice")(x.asInstanceOf[js.Any])
    
    @JSImport("redux-form", "default.arraySwap")
    @js.native
    def arraySwap: js.Function4[
        /* form */ String, 
        /* field */ String, 
        /* indexA */ Double, 
        /* indexB */ Double, 
        FormAction
      ] = js.native
    inline def arraySwap_=(
      x: js.Function4[
          /* form */ String, 
          /* field */ String, 
          /* indexA */ Double, 
          /* indexB */ Double, 
          FormAction
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("arraySwap")(x.asInstanceOf[js.Any])
    
    @JSImport("redux-form", "default.arrayUnshift")
    @js.native
    def arrayUnshift: js.Function3[/* form */ String, /* field */ String, /* value */ Any, FormAction] = js.native
    inline def arrayUnshift_=(x: js.Function3[/* form */ String, /* field */ String, /* value */ Any, FormAction]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("arrayUnshift")(x.asInstanceOf[js.Any])
    
    @JSImport("redux-form", "default.autofill")
    @js.native
    def autofill: js.Function3[/* form */ String, /* field */ String, /* value */ Any, FormAction] = js.native
    inline def autofill_=(x: js.Function3[/* form */ String, /* field */ String, /* value */ Any, FormAction]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("autofill")(x.asInstanceOf[js.Any])
    
    @JSImport("redux-form", "default.blur")
    @js.native
    def blur: js.Function4[
        /* form */ String, 
        /* field */ String, 
        /* value */ Any, 
        /* touch */ js.UndefOr[Boolean], 
        FormAction
      ] = js.native
    inline def blur_=(
      x: js.Function4[
          /* form */ String, 
          /* field */ String, 
          /* value */ Any, 
          /* touch */ js.UndefOr[Boolean], 
          FormAction
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("blur")(x.asInstanceOf[js.Any])
    
    @JSImport("redux-form", "default.change")
    @js.native
    def change: js.Function5[
        /* form */ String, 
        /* field */ String, 
        /* value */ Any, 
        /* touch */ js.UndefOr[Boolean], 
        /* persistentSubmitErrors */ js.UndefOr[Boolean], 
        FormAction
      ] = js.native
    inline def change_=(
      x: js.Function5[
          /* form */ String, 
          /* field */ String, 
          /* value */ Any, 
          /* touch */ js.UndefOr[Boolean], 
          /* persistentSubmitErrors */ js.UndefOr[Boolean], 
          FormAction
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("change")(x.asInstanceOf[js.Any])
    
    @JSImport("redux-form", "default.clearAsyncError")
    @js.native
    def clearAsyncError: js.Function2[/* form */ String, /* field */ String, FormAction] = js.native
    inline def clearAsyncError_=(x: js.Function2[/* form */ String, /* field */ String, FormAction]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("clearAsyncError")(x.asInstanceOf[js.Any])
    
    @JSImport("redux-form", "default.clearFields")
    @js.native
    def clearFields: js.Function4[
        /* form */ String, 
        /* keepTouched */ Boolean, 
        /* persistentSubmitErrors */ Boolean, 
        /* repeated */ String, 
        FormAction
      ] = js.native
    inline def clearFields_=(
      x: js.Function4[
          /* form */ String, 
          /* keepTouched */ Boolean, 
          /* persistentSubmitErrors */ Boolean, 
          /* repeated */ String, 
          FormAction
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("clearFields")(x.asInstanceOf[js.Any])
    
    @JSImport("redux-form", "default.clearSubmit")
    @js.native
    def clearSubmit: js.Function1[/* form */ String, FormAction] = js.native
    
    @JSImport("redux-form", "default.clearSubmitErrors")
    @js.native
    def clearSubmitErrors: js.Function1[/* form */ String, FormAction] = js.native
    inline def clearSubmitErrors_=(x: js.Function1[/* form */ String, FormAction]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("clearSubmitErrors")(x.asInstanceOf[js.Any])
    
    inline def clearSubmit_=(x: js.Function1[/* form */ String, FormAction]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("clearSubmit")(x.asInstanceOf[js.Any])
    
    @JSImport("redux-form", "default.destroy")
    @js.native
    def destroy: js.Function1[/* repeated */ String, FormAction] = js.native
    inline def destroy_=(x: js.Function1[/* repeated */ String, FormAction]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("destroy")(x.asInstanceOf[js.Any])
    
    @JSImport("redux-form", "default.focus")
    @js.native
    def focus: js.Function2[/* form */ String, /* field */ String, FormAction] = js.native
    inline def focus_=(x: js.Function2[/* form */ String, /* field */ String, FormAction]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("focus")(x.asInstanceOf[js.Any])
    
    @JSImport("redux-form", "default.initialize")
    @js.native
    def initialize: FnCall = js.native
    inline def initialize_=(x: FnCall): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("initialize")(x.asInstanceOf[js.Any])
    
    @JSImport("redux-form", "default.registerField")
    @js.native
    def registerField: js.Function3[/* form */ String, /* name */ String, /* type */ FieldType, FormAction] = js.native
    inline def registerField_=(x: js.Function3[/* form */ String, /* name */ String, /* type */ FieldType, FormAction]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("registerField")(x.asInstanceOf[js.Any])
    
    @JSImport("redux-form", "default.reset")
    @js.native
    def reset: js.Function1[/* form */ String, FormAction] = js.native
    
    @JSImport("redux-form", "default.resetSection")
    @js.native
    def resetSection: js.Function2[/* form */ String, /* repeated */ String, FormAction] = js.native
    inline def resetSection_=(x: js.Function2[/* form */ String, /* repeated */ String, FormAction]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("resetSection")(x.asInstanceOf[js.Any])
    
    inline def reset_=(x: js.Function1[/* form */ String, FormAction]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("reset")(x.asInstanceOf[js.Any])
    
    @JSImport("redux-form", "default.setSubmitFailed")
    @js.native
    def setSubmitFailed: js.Function2[/* form */ String, /* repeated */ String, FormAction] = js.native
    inline def setSubmitFailed_=(x: js.Function2[/* form */ String, /* repeated */ String, FormAction]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("setSubmitFailed")(x.asInstanceOf[js.Any])
    
    @JSImport("redux-form", "default.setSubmitSucceeded")
    @js.native
    def setSubmitSucceeded: js.Function2[/* form */ String, /* repeated */ String, FormAction] = js.native
    inline def setSubmitSucceeded_=(x: js.Function2[/* form */ String, /* repeated */ String, FormAction]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("setSubmitSucceeded")(x.asInstanceOf[js.Any])
    
    @JSImport("redux-form", "default.startAsyncValidation")
    @js.native
    def startAsyncValidation: js.Function1[/* form */ String, FormAction] = js.native
    inline def startAsyncValidation_=(x: js.Function1[/* form */ String, FormAction]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("startAsyncValidation")(x.asInstanceOf[js.Any])
    
    @JSImport("redux-form", "default.startSubmit")
    @js.native
    def startSubmit: js.Function1[/* form */ String, FormAction] = js.native
    inline def startSubmit_=(x: js.Function1[/* form */ String, FormAction]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("startSubmit")(x.asInstanceOf[js.Any])
    
    @JSImport("redux-form", "default.stopAsyncValidation")
    @js.native
    def stopAsyncValidation: js.Function2[/* form */ String, /* errors */ js.UndefOr[FormErrors[Any, Any]], FormAction] = js.native
    inline def stopAsyncValidation_=(x: js.Function2[/* form */ String, /* errors */ js.UndefOr[FormErrors[Any, Any]], FormAction]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stopAsyncValidation")(x.asInstanceOf[js.Any])
    
    @JSImport("redux-form", "default.stopSubmit")
    @js.native
    def stopSubmit: js.Function2[/* form */ String, /* errors */ js.UndefOr[FormErrors[Any, Any]], FormAction] = js.native
    inline def stopSubmit_=(x: js.Function2[/* form */ String, /* errors */ js.UndefOr[FormErrors[Any, Any]], FormAction]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stopSubmit")(x.asInstanceOf[js.Any])
    
    @JSImport("redux-form", "default.submit")
    @js.native
    def submit: js.Function1[/* form */ String, FormAction] = js.native
    inline def submit_=(x: js.Function1[/* form */ String, FormAction]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("submit")(x.asInstanceOf[js.Any])
    
    @JSImport("redux-form", "default.touch")
    @js.native
    def touch: js.Function2[/* form */ String, /* repeated */ String, FormAction] = js.native
    inline def touch_=(x: js.Function2[/* form */ String, /* repeated */ String, FormAction]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("touch")(x.asInstanceOf[js.Any])
    
    @JSImport("redux-form", "default.unregisterField")
    @js.native
    def unregisterField: js.Function2[/* form */ String, /* name */ String, FormAction] = js.native
    inline def unregisterField_=(x: js.Function2[/* form */ String, /* name */ String, FormAction]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("unregisterField")(x.asInstanceOf[js.Any])
    
    @JSImport("redux-form", "default.untouch")
    @js.native
    def untouch: js.Function2[/* form */ String, /* repeated */ String, FormAction] = js.native
    inline def untouch_=(x: js.Function2[/* form */ String, /* repeated */ String, FormAction]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("untouch")(x.asInstanceOf[js.Any])
    
    @JSImport("redux-form", "default.updateSyncErrors")
    @js.native
    def updateSyncErrors: FnCallFormSyncErrorsError = js.native
    inline def updateSyncErrors_=(x: FnCallFormSyncErrorsError): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("updateSyncErrors")(x.asInstanceOf[js.Any])
    
    @JSImport("redux-form", "default.updateSyncWarnings")
    @js.native
    def updateSyncWarnings: FnCallFormSyncWarningsWarning = js.native
    inline def updateSyncWarnings_=(x: FnCallFormSyncWarningsWarning): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("updateSyncWarnings")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("redux-form", "Field")
  @js.native
  open class Field[P /* <: GenericFieldHTMLAttributes | BaseFieldProps[js.Object] */] protected ()
    extends typingsJapgolly.reduxForm.libFieldMod.Field[P] {
    def this(props: P) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: P, context: Any) = this()
  }
  
  @JSImport("redux-form", "FieldArray")
  @js.native
  open class FieldArray[P, FieldValue] protected ()
    extends typingsJapgolly.reduxForm.libFieldArrayMod.FieldArray[P, FieldValue] {
    def this(props: BaseFieldArrayProps[P, FieldValue]) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: BaseFieldArrayProps[P, FieldValue], context: Any) = this()
  }
  
  @JSImport("redux-form", "Fields")
  @js.native
  open class Fields[P] protected ()
    extends typingsJapgolly.reduxForm.libFieldsMod.Fields[P] {
    def this(props: BaseFieldsProps[P] & P) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: BaseFieldsProps[P] & P, context: Any) = this()
  }
  
  @JSImport("redux-form", "Form")
  @js.native
  open class Form[FormData, P, ErrorType] protected ()
    extends typingsJapgolly.reduxForm.libFormMod.Form[FormData, P, ErrorType] {
    def this(props: FormProps[FormData, P, ErrorType]) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: FormProps[FormData, P, ErrorType], context: Any) = this()
  }
  
  @JSImport("redux-form", "FormName")
  @js.native
  val FormName: FunctionComponent[FormNameProps] = js.native
  
  @JSImport("redux-form", "FormSection")
  @js.native
  open class FormSection[P] protected ()
    extends typingsJapgolly.reduxForm.libFormSectionMod.FormSection[P] {
    def this(props: FormSectionProps[P] & P) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: FormSectionProps[P] & P, context: Any) = this()
  }
  
  @JSImport("redux-form", "GenericForm")
  @js.native
  open class GenericForm[FormData, P, ErrorType] protected ()
    extends typingsJapgolly.reduxForm.libFormMod.GenericForm[FormData, P, ErrorType] {
    def this(props: FormProps[FormData, P, ErrorType]) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: FormProps[FormData, P, ErrorType], context: Any) = this()
  }
  
  @JSImport("redux-form", "ReduxFormContext")
  @js.native
  val ReduxFormContext: Context[FormContext] = js.native
  
  @JSImport("redux-form", "SubmissionError")
  @js.native
  open class SubmissionError[FormData, ErrorType] protected ()
    extends typingsJapgolly.reduxForm.libSubmissionErrorMod.SubmissionError[FormData, ErrorType] {
    def this(errors: FormErrors[FormData, ErrorType]) = this()
  }
  
  @JSImport("redux-form", "actionTypes")
  @js.native
  val actionTypes: ActionTypes_ = js.native
  
  inline def arrayInsert(form: String, field: String, index: Double, value: Any): FormAction = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayInsert")(form.asInstanceOf[js.Any], field.asInstanceOf[js.Any], index.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[FormAction]
  
  inline def arrayMove(form: String, field: String, from: Double, to: Double): FormAction = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayMove")(form.asInstanceOf[js.Any], field.asInstanceOf[js.Any], from.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[FormAction]
  
  inline def arrayPop(form: String, field: String): FormAction = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayPop")(form.asInstanceOf[js.Any], field.asInstanceOf[js.Any])).asInstanceOf[FormAction]
  
  inline def arrayPush(form: String, field: String, value: Any): FormAction = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayPush")(form.asInstanceOf[js.Any], field.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[FormAction]
  
  inline def arrayRemove(form: String, field: String, index: Double): FormAction = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayRemove")(form.asInstanceOf[js.Any], field.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[FormAction]
  
  inline def arrayRemoveAll(form: String, field: String): FormAction = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayRemoveAll")(form.asInstanceOf[js.Any], field.asInstanceOf[js.Any])).asInstanceOf[FormAction]
  
  inline def arrayShift(form: String, field: String): FormAction = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayShift")(form.asInstanceOf[js.Any], field.asInstanceOf[js.Any])).asInstanceOf[FormAction]
  
  inline def arraySplice(form: String, field: String, index: Double, removeNum: Double, value: Any): FormAction = (^.asInstanceOf[js.Dynamic].applyDynamic("arraySplice")(form.asInstanceOf[js.Any], field.asInstanceOf[js.Any], index.asInstanceOf[js.Any], removeNum.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[FormAction]
  
  inline def arraySwap(form: String, field: String, indexA: Double, indexB: Double): FormAction = (^.asInstanceOf[js.Dynamic].applyDynamic("arraySwap")(form.asInstanceOf[js.Any], field.asInstanceOf[js.Any], indexA.asInstanceOf[js.Any], indexB.asInstanceOf[js.Any])).asInstanceOf[FormAction]
  
  inline def arrayUnshift(form: String, field: String, value: Any): FormAction = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayUnshift")(form.asInstanceOf[js.Any], field.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[FormAction]
  
  inline def autofill(form: String, field: String, value: Any): FormAction = (^.asInstanceOf[js.Dynamic].applyDynamic("autofill")(form.asInstanceOf[js.Any], field.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[FormAction]
  
  inline def blur(form: String, field: String, value: Any): FormAction = (^.asInstanceOf[js.Dynamic].applyDynamic("blur")(form.asInstanceOf[js.Any], field.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[FormAction]
  inline def blur(form: String, field: String, value: Any, touch: Boolean): FormAction = (^.asInstanceOf[js.Dynamic].applyDynamic("blur")(form.asInstanceOf[js.Any], field.asInstanceOf[js.Any], value.asInstanceOf[js.Any], touch.asInstanceOf[js.Any])).asInstanceOf[FormAction]
  
  inline def change(form: String, field: String, value: Any): FormAction = (^.asInstanceOf[js.Dynamic].applyDynamic("change")(form.asInstanceOf[js.Any], field.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[FormAction]
  inline def change(form: String, field: String, value: Any, touch: Boolean): FormAction = (^.asInstanceOf[js.Dynamic].applyDynamic("change")(form.asInstanceOf[js.Any], field.asInstanceOf[js.Any], value.asInstanceOf[js.Any], touch.asInstanceOf[js.Any])).asInstanceOf[FormAction]
  inline def change(form: String, field: String, value: Any, touch: Boolean, persistentSubmitErrors: Boolean): FormAction = (^.asInstanceOf[js.Dynamic].applyDynamic("change")(form.asInstanceOf[js.Any], field.asInstanceOf[js.Any], value.asInstanceOf[js.Any], touch.asInstanceOf[js.Any], persistentSubmitErrors.asInstanceOf[js.Any])).asInstanceOf[FormAction]
  inline def change(form: String, field: String, value: Any, touch: Unit, persistentSubmitErrors: Boolean): FormAction = (^.asInstanceOf[js.Dynamic].applyDynamic("change")(form.asInstanceOf[js.Any], field.asInstanceOf[js.Any], value.asInstanceOf[js.Any], touch.asInstanceOf[js.Any], persistentSubmitErrors.asInstanceOf[js.Any])).asInstanceOf[FormAction]
  
  inline def clearAsyncError(form: String, field: String): FormAction = (^.asInstanceOf[js.Dynamic].applyDynamic("clearAsyncError")(form.asInstanceOf[js.Any], field.asInstanceOf[js.Any])).asInstanceOf[FormAction]
  
  inline def clearFields(form: String, keepTouched: Boolean, persistentSubmitErrors: Boolean, fields: String*): FormAction = (^.asInstanceOf[js.Dynamic].applyDynamic("clearFields")((scala.List(form.asInstanceOf[js.Any], keepTouched.asInstanceOf[js.Any], persistentSubmitErrors.asInstanceOf[js.Any])).`++`(fields.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[FormAction]
  
  inline def clearSubmit(form: String): FormAction = ^.asInstanceOf[js.Dynamic].applyDynamic("clearSubmit")(form.asInstanceOf[js.Any]).asInstanceOf[FormAction]
  
  inline def clearSubmitErrors(form: String): FormAction = ^.asInstanceOf[js.Dynamic].applyDynamic("clearSubmitErrors")(form.asInstanceOf[js.Any]).asInstanceOf[FormAction]
  
  inline def destroy(form: String*): FormAction = ^.asInstanceOf[js.Dynamic].applyDynamic("destroy")(form.asInstanceOf[Seq[js.Any]]*).asInstanceOf[FormAction]
  
  inline def focus(form: String, field: String): FormAction = (^.asInstanceOf[js.Dynamic].applyDynamic("focus")(form.asInstanceOf[js.Any], field.asInstanceOf[js.Any])).asInstanceOf[FormAction]
  
  inline def formValueSelector[State](form: String): js.Function2[/* state */ State, /* repeated */ String, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("formValueSelector")(form.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* state */ State, /* repeated */ String, Any]]
  inline def formValueSelector[State](form: String, getFormState: js.Function1[/* state */ State, FormStateMap]): js.Function2[/* state */ State, /* repeated */ String, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("formValueSelector")(form.asInstanceOf[js.Any], getFormState.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* state */ State, /* repeated */ String, Any]]
  
  inline def formValues[Values, P](obj: Values): js.Function1[
    /* component */ ComponentType[
      P & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof Values ]: any} */ js.Any)
    ], 
    ComponentClassP[
      P & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof Values ]: any} */ js.Any) & js.Object
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("formValues")(obj.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* component */ ComponentType[
      P & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof Values ]: any} */ js.Any)
    ], 
    ComponentClassP[
      P & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof Values ]: any} */ js.Any) & js.Object
    ]
  ]]
  inline def formValues[FormData, K /* <: /* keyof FormData */ append | delete | get | getAll | has | set | forEach | entries | keys | values */, P](names: K*): js.Function1[
    /* component */ ComponentType[P & (Pick[FormData, K])], 
    ComponentClassP[P & (Pick[FormData, K]) & js.Object]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("formValues")(names.asInstanceOf[Seq[js.Any]]*).asInstanceOf[js.Function1[
    /* component */ ComponentType[P & (Pick[FormData, K])], 
    ComponentClassP[P & (Pick[FormData, K]) & js.Object]
  ]]
  
  @JSImport("redux-form", "getFormAsyncErrors")
  @js.native
  val getFormAsyncErrors: ErrorSelector[js.Object, js.Object, String] = js.native
  
  @JSImport("redux-form", "getFormError")
  @js.native
  val getFormError: ErrorSelector[js.Object, js.Object, String] = js.native
  
  @JSImport("redux-form", "getFormInitialValues")
  @js.native
  val getFormInitialValues: DataSelector[js.Object, js.Object] = js.native
  
  @JSImport("redux-form", "getFormMeta")
  @js.native
  val getFormMeta: DataSelector[js.Object, js.Object] = js.native
  
  @JSImport("redux-form", "getFormNames")
  @js.native
  val getFormNames: NamesSelector[js.Object] = js.native
  
  @JSImport("redux-form", "getFormSubmitErrors")
  @js.native
  val getFormSubmitErrors: ErrorSelector[js.Object, js.Object, String] = js.native
  
  @JSImport("redux-form", "getFormSyncErrors")
  @js.native
  val getFormSyncErrors: ErrorSelector[js.Object, js.Object, String] = js.native
  
  @JSImport("redux-form", "getFormSyncWarnings")
  @js.native
  val getFormSyncWarnings: ErrorSelector[js.Object, js.Object, String] = js.native
  
  @JSImport("redux-form", "getFormValues")
  @js.native
  val getFormValues: DataSelector[js.Object, js.Object] = js.native
  
  @JSImport("redux-form", "hasSubmitFailed")
  @js.native
  val hasSubmitFailed: BooleanSelector[js.Object] = js.native
  
  @JSImport("redux-form", "hasSubmitSucceeded")
  @js.native
  val hasSubmitSucceeded: BooleanSelector[js.Object] = js.native
  
  inline def initialize(form: String, data: Any): FormAction = (^.asInstanceOf[js.Dynamic].applyDynamic("initialize")(form.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[FormAction]
  inline def initialize(form: String, data: Any, keepDirty: Boolean): FormAction = (^.asInstanceOf[js.Dynamic].applyDynamic("initialize")(form.asInstanceOf[js.Any], data.asInstanceOf[js.Any], keepDirty.asInstanceOf[js.Any])).asInstanceOf[FormAction]
  inline def initialize(form: String, data: Any, keepDirty: Boolean, options: PartialInitializeOptions): FormAction = (^.asInstanceOf[js.Dynamic].applyDynamic("initialize")(form.asInstanceOf[js.Any], data.asInstanceOf[js.Any], keepDirty.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[FormAction]
  inline def initialize(form: String, data: Any, keepDirty: Unit, options: PartialInitializeOptions): FormAction = (^.asInstanceOf[js.Dynamic].applyDynamic("initialize")(form.asInstanceOf[js.Any], data.asInstanceOf[js.Any], keepDirty.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[FormAction]
  inline def initialize(form: String, data: Any, options: PartialInitializeOptions): FormAction = (^.asInstanceOf[js.Dynamic].applyDynamic("initialize")(form.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[FormAction]
  
  @JSImport("redux-form", "isAsyncValidating")
  @js.native
  val isAsyncValidating: BooleanSelector[js.Object] = js.native
  
  @JSImport("redux-form", "isDirty")
  @js.native
  val isDirty: FormOrFieldsBooleanSelector[js.Object] = js.native
  
  @JSImport("redux-form", "isInvalid")
  @js.native
  val isInvalid: BooleanSelector[js.Object] = js.native
  
  @JSImport("redux-form", "isPristine")
  @js.native
  val isPristine: FormOrFieldsBooleanSelector[js.Object] = js.native
  
  @JSImport("redux-form", "isSubmitting")
  @js.native
  val isSubmitting: BooleanSelector[js.Object] = js.native
  
  @JSImport("redux-form", "isValid")
  @js.native
  val isValid: BooleanSelector[js.Object] = js.native
  
  @JSImport("redux-form", "reducer")
  @js.native
  val reducer: FormReducer = js.native
  
  inline def reduxForm[FormData, P, ErrorType](config: (ConfigProps[FormData, P, ErrorType]) | (Partial[ConfigProps[FormData, P, ErrorType]])): FormDecorator[FormData, P, ErrorType] = ^.asInstanceOf[js.Dynamic].applyDynamic("reduxForm")(config.asInstanceOf[js.Any]).asInstanceOf[FormDecorator[FormData, P, ErrorType]]
  
  inline def registerField(form: String, name: String, `type`: FieldType): FormAction = (^.asInstanceOf[js.Dynamic].applyDynamic("registerField")(form.asInstanceOf[js.Any], name.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[FormAction]
  
  inline def reset(form: String): FormAction = ^.asInstanceOf[js.Dynamic].applyDynamic("reset")(form.asInstanceOf[js.Any]).asInstanceOf[FormAction]
  
  inline def resetSection(form: String, sections: String*): FormAction = ^.asInstanceOf[js.Dynamic].applyDynamic("resetSection")(scala.List(form.asInstanceOf[js.Any]).`++`(sections.asInstanceOf[Seq[js.Any]])*).asInstanceOf[FormAction]
  
  inline def setSubmitFailed(form: String, fields: String*): FormAction = ^.asInstanceOf[js.Dynamic].applyDynamic("setSubmitFailed")(scala.List(form.asInstanceOf[js.Any]).`++`(fields.asInstanceOf[Seq[js.Any]])*).asInstanceOf[FormAction]
  
  inline def setSubmitSucceeded(form: String, fields: String*): FormAction = ^.asInstanceOf[js.Dynamic].applyDynamic("setSubmitSucceeded")(scala.List(form.asInstanceOf[js.Any]).`++`(fields.asInstanceOf[Seq[js.Any]])*).asInstanceOf[FormAction]
  
  inline def startAsyncValidation(form: String): FormAction = ^.asInstanceOf[js.Dynamic].applyDynamic("startAsyncValidation")(form.asInstanceOf[js.Any]).asInstanceOf[FormAction]
  
  inline def startSubmit(form: String): FormAction = ^.asInstanceOf[js.Dynamic].applyDynamic("startSubmit")(form.asInstanceOf[js.Any]).asInstanceOf[FormAction]
  
  inline def stopAsyncValidation(form: String): FormAction = ^.asInstanceOf[js.Dynamic].applyDynamic("stopAsyncValidation")(form.asInstanceOf[js.Any]).asInstanceOf[FormAction]
  inline def stopAsyncValidation(form: String, errors: FormErrors[Any, Any]): FormAction = (^.asInstanceOf[js.Dynamic].applyDynamic("stopAsyncValidation")(form.asInstanceOf[js.Any], errors.asInstanceOf[js.Any])).asInstanceOf[FormAction]
  
  inline def stopSubmit(form: String): FormAction = ^.asInstanceOf[js.Dynamic].applyDynamic("stopSubmit")(form.asInstanceOf[js.Any]).asInstanceOf[FormAction]
  inline def stopSubmit(form: String, errors: FormErrors[Any, Any]): FormAction = (^.asInstanceOf[js.Dynamic].applyDynamic("stopSubmit")(form.asInstanceOf[js.Any], errors.asInstanceOf[js.Any])).asInstanceOf[FormAction]
  
  inline def submit(form: String): FormAction = ^.asInstanceOf[js.Dynamic].applyDynamic("submit")(form.asInstanceOf[js.Any]).asInstanceOf[FormAction]
  
  inline def touch(form: String, fields: String*): FormAction = ^.asInstanceOf[js.Dynamic].applyDynamic("touch")(scala.List(form.asInstanceOf[js.Any]).`++`(fields.asInstanceOf[Seq[js.Any]])*).asInstanceOf[FormAction]
  
  inline def unregisterField(form: String, name: String): FormAction = (^.asInstanceOf[js.Dynamic].applyDynamic("unregisterField")(form.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[FormAction]
  
  inline def untouch(form: String, fields: String*): FormAction = ^.asInstanceOf[js.Dynamic].applyDynamic("untouch")(scala.List(form.asInstanceOf[js.Any]).`++`(fields.asInstanceOf[Seq[js.Any]])*).asInstanceOf[FormAction]
  
  inline def updateSyncErrors[T](form: String, syncErrors: FormErrors[Any, T], error: T): FormAction = (^.asInstanceOf[js.Dynamic].applyDynamic("updateSyncErrors")(form.asInstanceOf[js.Any], syncErrors.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[FormAction]
  
  inline def updateSyncWarnings[T](form: String, syncWarnings: FormWarnings[Any, T], warning: T): FormAction = (^.asInstanceOf[js.Dynamic].applyDynamic("updateSyncWarnings")(form.asInstanceOf[js.Any], syncWarnings.asInstanceOf[js.Any], warning.asInstanceOf[js.Any])).asInstanceOf[FormAction]
  
  trait ErrorOther[T] extends StObject {
    
    var _error: js.UndefOr[T] = js.undefined
  }
  object ErrorOther {
    
    inline def apply[T](): ErrorOther[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ErrorOther[T]]
    }
    
    extension [Self <: ErrorOther[?], T](x: Self & ErrorOther[T]) {
      
      inline def set_error(value: T): Self = StObject.set(x, "_error", value.asInstanceOf[js.Any])
      
      inline def set_errorUndefined: Self = StObject.set(x, "_error", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.reduxForm.reduxFormStrings.Field
    - typingsJapgolly.reduxForm.reduxFormStrings.FieldArray
  */
  trait FieldType extends StObject
  object FieldType {
    
    inline def Field: typingsJapgolly.reduxForm.reduxFormStrings.Field = "Field".asInstanceOf[typingsJapgolly.reduxForm.reduxFormStrings.Field]
    
    inline def FieldArray: typingsJapgolly.reduxForm.reduxFormStrings.FieldArray = "FieldArray".asInstanceOf[typingsJapgolly.reduxForm.reduxFormStrings.FieldArray]
  }
  
  /* Inlined {[ P in keyof FormData ]:? react.react.ReactElement | T} & redux-form.redux-form.ErrorOther<T> */
  trait FormErrors[FormData, T] extends StObject {
    
    var _error: js.UndefOr[T] = js.undefined
    
    var append: js.UndefOr[Element | T] = js.undefined
    
    var delete: js.UndefOr[Element | T] = js.undefined
    
    var entries: js.UndefOr[Element | T] = js.undefined
    
    var forEach: js.UndefOr[Element | T] = js.undefined
    
    var get: js.UndefOr[Element | T] = js.undefined
    
    var getAll: js.UndefOr[Element | T] = js.undefined
    
    var has: js.UndefOr[Element | T] = js.undefined
    
    var keys: js.UndefOr[Element | T] = js.undefined
    
    var set: js.UndefOr[Element | T] = js.undefined
    
    var values: js.UndefOr[Element | T] = js.undefined
  }
  object FormErrors {
    
    inline def apply[FormData, T](): FormErrors[FormData, T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FormErrors[FormData, T]]
    }
    
    extension [Self <: FormErrors[?, ?], FormData, T](x: Self & (FormErrors[FormData, T])) {
      
      inline def setAppend(value: Element | T): Self = StObject.set(x, "append", value.asInstanceOf[js.Any])
      
      inline def setAppendUndefined: Self = StObject.set(x, "append", js.undefined)
      
      inline def setAppendVdomElement(value: VdomElement): Self = StObject.set(x, "append", value.rawElement.asInstanceOf[js.Any])
      
      inline def setDelete(value: Element | T): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
      
      inline def setDeleteUndefined: Self = StObject.set(x, "delete", js.undefined)
      
      inline def setDeleteVdomElement(value: VdomElement): Self = StObject.set(x, "delete", value.rawElement.asInstanceOf[js.Any])
      
      inline def setEntries(value: Element | T): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
      
      inline def setEntriesUndefined: Self = StObject.set(x, "entries", js.undefined)
      
      inline def setEntriesVdomElement(value: VdomElement): Self = StObject.set(x, "entries", value.rawElement.asInstanceOf[js.Any])
      
      inline def setForEach(value: Element | T): Self = StObject.set(x, "forEach", value.asInstanceOf[js.Any])
      
      inline def setForEachUndefined: Self = StObject.set(x, "forEach", js.undefined)
      
      inline def setForEachVdomElement(value: VdomElement): Self = StObject.set(x, "forEach", value.rawElement.asInstanceOf[js.Any])
      
      inline def setGet(value: Element | T): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
      
      inline def setGetAll(value: Element | T): Self = StObject.set(x, "getAll", value.asInstanceOf[js.Any])
      
      inline def setGetAllUndefined: Self = StObject.set(x, "getAll", js.undefined)
      
      inline def setGetAllVdomElement(value: VdomElement): Self = StObject.set(x, "getAll", value.rawElement.asInstanceOf[js.Any])
      
      inline def setGetUndefined: Self = StObject.set(x, "get", js.undefined)
      
      inline def setGetVdomElement(value: VdomElement): Self = StObject.set(x, "get", value.rawElement.asInstanceOf[js.Any])
      
      inline def setHas(value: Element | T): Self = StObject.set(x, "has", value.asInstanceOf[js.Any])
      
      inline def setHasUndefined: Self = StObject.set(x, "has", js.undefined)
      
      inline def setHasVdomElement(value: VdomElement): Self = StObject.set(x, "has", value.rawElement.asInstanceOf[js.Any])
      
      inline def setKeys(value: Element | T): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
      
      inline def setKeysUndefined: Self = StObject.set(x, "keys", js.undefined)
      
      inline def setKeysVdomElement(value: VdomElement): Self = StObject.set(x, "keys", value.rawElement.asInstanceOf[js.Any])
      
      inline def setSet(value: Element | T): Self = StObject.set(x, "set", value.asInstanceOf[js.Any])
      
      inline def setSetUndefined: Self = StObject.set(x, "set", js.undefined)
      
      inline def setSetVdomElement(value: VdomElement): Self = StObject.set(x, "set", value.rawElement.asInstanceOf[js.Any])
      
      inline def setValues(value: Element | T): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
      
      inline def setValuesVdomElement(value: VdomElement): Self = StObject.set(x, "values", value.rawElement.asInstanceOf[js.Any])
      
      inline def set_error(value: T): Self = StObject.set(x, "_error", value.asInstanceOf[js.Any])
      
      inline def set_errorUndefined: Self = StObject.set(x, "_error", js.undefined)
    }
  }
  
  /* Inlined {[ P in keyof FormData ]:? react.react.ReactElement | string | redux-form.redux-form.WarningOther<T>} */
  trait FormWarnings[FormData, T] extends StObject {
    
    var append: js.UndefOr[Element | String | WarningOther[T]] = js.undefined
    
    var delete: js.UndefOr[Element | String | WarningOther[T]] = js.undefined
    
    var entries: js.UndefOr[Element | String | WarningOther[T]] = js.undefined
    
    var forEach: js.UndefOr[Element | String | WarningOther[T]] = js.undefined
    
    var get: js.UndefOr[Element | String | WarningOther[T]] = js.undefined
    
    var getAll: js.UndefOr[Element | String | WarningOther[T]] = js.undefined
    
    var has: js.UndefOr[Element | String | WarningOther[T]] = js.undefined
    
    var keys: js.UndefOr[Element | String | WarningOther[T]] = js.undefined
    
    var set: js.UndefOr[Element | String | WarningOther[T]] = js.undefined
    
    var values: js.UndefOr[Element | String | WarningOther[T]] = js.undefined
  }
  object FormWarnings {
    
    inline def apply[FormData, T](): FormWarnings[FormData, T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FormWarnings[FormData, T]]
    }
    
    extension [Self <: FormWarnings[?, ?], FormData, T](x: Self & (FormWarnings[FormData, T])) {
      
      inline def setAppend(value: Element | String | WarningOther[T]): Self = StObject.set(x, "append", value.asInstanceOf[js.Any])
      
      inline def setAppendUndefined: Self = StObject.set(x, "append", js.undefined)
      
      inline def setAppendVdomElement(value: VdomElement): Self = StObject.set(x, "append", value.rawElement.asInstanceOf[js.Any])
      
      inline def setDelete(value: Element | String | WarningOther[T]): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
      
      inline def setDeleteUndefined: Self = StObject.set(x, "delete", js.undefined)
      
      inline def setDeleteVdomElement(value: VdomElement): Self = StObject.set(x, "delete", value.rawElement.asInstanceOf[js.Any])
      
      inline def setEntries(value: Element | String | WarningOther[T]): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
      
      inline def setEntriesUndefined: Self = StObject.set(x, "entries", js.undefined)
      
      inline def setEntriesVdomElement(value: VdomElement): Self = StObject.set(x, "entries", value.rawElement.asInstanceOf[js.Any])
      
      inline def setForEach(value: Element | String | WarningOther[T]): Self = StObject.set(x, "forEach", value.asInstanceOf[js.Any])
      
      inline def setForEachUndefined: Self = StObject.set(x, "forEach", js.undefined)
      
      inline def setForEachVdomElement(value: VdomElement): Self = StObject.set(x, "forEach", value.rawElement.asInstanceOf[js.Any])
      
      inline def setGet(value: Element | String | WarningOther[T]): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
      
      inline def setGetAll(value: Element | String | WarningOther[T]): Self = StObject.set(x, "getAll", value.asInstanceOf[js.Any])
      
      inline def setGetAllUndefined: Self = StObject.set(x, "getAll", js.undefined)
      
      inline def setGetAllVdomElement(value: VdomElement): Self = StObject.set(x, "getAll", value.rawElement.asInstanceOf[js.Any])
      
      inline def setGetUndefined: Self = StObject.set(x, "get", js.undefined)
      
      inline def setGetVdomElement(value: VdomElement): Self = StObject.set(x, "get", value.rawElement.asInstanceOf[js.Any])
      
      inline def setHas(value: Element | String | WarningOther[T]): Self = StObject.set(x, "has", value.asInstanceOf[js.Any])
      
      inline def setHasUndefined: Self = StObject.set(x, "has", js.undefined)
      
      inline def setHasVdomElement(value: VdomElement): Self = StObject.set(x, "has", value.rawElement.asInstanceOf[js.Any])
      
      inline def setKeys(value: Element | String | WarningOther[T]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
      
      inline def setKeysUndefined: Self = StObject.set(x, "keys", js.undefined)
      
      inline def setKeysVdomElement(value: VdomElement): Self = StObject.set(x, "keys", value.rawElement.asInstanceOf[js.Any])
      
      inline def setSet(value: Element | String | WarningOther[T]): Self = StObject.set(x, "set", value.asInstanceOf[js.Any])
      
      inline def setSetUndefined: Self = StObject.set(x, "set", js.undefined)
      
      inline def setSetVdomElement(value: VdomElement): Self = StObject.set(x, "set", value.rawElement.asInstanceOf[js.Any])
      
      inline def setValues(value: Element | String | WarningOther[T]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
      
      inline def setValuesVdomElement(value: VdomElement): Self = StObject.set(x, "values", value.rawElement.asInstanceOf[js.Any])
    }
  }
  
  type Omit[T, K /* <: /* keyof T */ String */] = Pick[
    T, 
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof T ]: P} & {[ P in K ]: never} & {[x: string] : never, [x: number] : never}[keyof T] */ js.Any
  ]
  
  trait RegisteredFieldState extends StObject {
    
    var name: String
    
    var `type`: FieldType
  }
  object RegisteredFieldState {
    
    inline def apply(name: String, `type`: FieldType): RegisteredFieldState = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[RegisteredFieldState]
    }
    
    extension [Self <: RegisteredFieldState](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setType(value: FieldType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait WarningOther[T] extends StObject {
    
    var _warning: js.UndefOr[T] = js.undefined
  }
  object WarningOther {
    
    inline def apply[T](): WarningOther[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WarningOther[T]]
    }
    
    extension [Self <: WarningOther[?], T](x: Self & WarningOther[T]) {
      
      inline def set_warning(value: T): Self = StObject.set(x, "_warning", value.asInstanceOf[js.Any])
      
      inline def set_warningUndefined: Self = StObject.set(x, "_warning", js.undefined)
    }
  }
}
