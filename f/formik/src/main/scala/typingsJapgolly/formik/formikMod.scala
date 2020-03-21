package typingsJapgolly.formik

import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.ReactFocusEventFrom
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLFormElement
import typingsJapgolly.formik.typesMod.FormikActions
import typingsJapgolly.formik.typesMod.FormikConfig
import typingsJapgolly.formik.typesMod.FormikErrors
import typingsJapgolly.formik.typesMod.FormikState
import typingsJapgolly.formik.typesMod.FormikTouched
import typingsJapgolly.formik.typesMod.FormikValues
import typingsJapgolly.react.mod.ChangeEvent
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.FocusEvent
import typingsJapgolly.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("formik/dist/Formik", JSImport.Namespace)
@js.native
object formikMod extends js.Object {
  @js.native
  class Formik[Values] protected ()
    extends Component[FormikConfig[Values], FormikState[Values], js.Any] {
    def this(props: FormikConfig[Values]) = this()
    var didMount: Boolean = js.native
    var fields: StringDictionary[japgolly.scalajs.react.raw.React.Component[js.Object, js.Object]] = js.native
    var hbCache: StringDictionary[js.Function1[/* e */ js.Any, Unit]] = js.native
    var hcCache: StringDictionary[js.Function1[/* e */ js.Any | ReactEventFrom[Element], Unit]] = js.native
    var initialValues: Values = js.native
    var validator: js.Any = js.native
    @JSName("componentDidMount")
    def componentDidMount_MFormik(): Unit = js.native
    @JSName("componentDidUpdate")
    def componentDidUpdate_MFormik(prevProps: FormikConfig[Values]): Unit = js.native
    @JSName("componentWillUnmount")
    def componentWillUnmount_MFormik(): Unit = js.native
    def executeSubmit(): Unit = js.native
    def getFormikActions(): FormikActions[Values] = js.native
    def getFormikBag(): AnonError[Values] = js.native
    def getFormikComputedProps(): AnonDirty[Values] = js.native
    def getFormikContext(): AnonErrors[Values] = js.native
    def handleBlur(eventOrPath: String): Unit | (js.Function1[/* e */ js.UndefOr[ReactFocusEventFrom[Element]], Unit]) = js.native
    def handleBlur(eventOrPath: FocusEvent[_]): Unit | (js.Function1[/* e */ js.UndefOr[ReactFocusEventFrom[Element]], Unit]) = js.native
    def handleChange(eventOrPath: String): Unit | (js.Function1[/* eventOrValue */ js.Any, Unit]) = js.native
    def handleChange(eventOrPath: ChangeEvent[_]): Unit | (js.Function1[/* eventOrValue */ js.Any, Unit]) = js.native
    def handleReset(): Unit = js.native
    def handleSubmit(): Unit = js.native
    def handleSubmit(e: ReactEventFrom[HTMLFormElement]): Unit = js.native
    def registerField(name: String, Comp: japgolly.scalajs.react.raw.React.Component[js.Object, js.Object]): Unit = js.native
    def resetForm(): Unit = js.native
    def resetForm(nextValues: Values): Unit = js.native
    def runFieldLevelValidations(values: FormikValues): js.Promise[FormikErrors[Values]] = js.native
    def runSingleFieldLevelValidation(field: String, value: String): js.Promise[String] = js.native
    def runSingleFieldLevelValidation(field: String, value: Unit): js.Promise[String] = js.native
    def runValidateHandler(values: FormikValues): js.Promise[FormikErrors[Values]] = js.native
    def runValidationSchema(values: FormikValues): js.Promise[js.Object] = js.native
    def runValidations(): js.Promise[FormikErrors[Values]] = js.native
    def runValidations(values: FormikValues): js.Promise[FormikErrors[Values]] = js.native
    def setError(error: js.Any): Unit = js.native
    def setErrors(errors: FormikErrors[Values]): Unit = js.native
    def setFieldError(field: String): Unit = js.native
    def setFieldError(field: String, message: String): Unit = js.native
    def setFieldTouched(field: String): Unit = js.native
    def setFieldTouched(field: String, touched: Boolean): Unit = js.native
    def setFieldTouched(field: String, touched: Boolean, shouldValidate: Boolean): Unit = js.native
    def setFieldValue(field: String, value: js.Any): Unit = js.native
    def setFieldValue(field: String, value: js.Any, shouldValidate: Boolean): Unit = js.native
    def setFormikState(s: js.Any): Unit = js.native
    def setFormikState(s: js.Any, callback: js.Function0[Unit]): Unit = js.native
    def setStatus(): Unit = js.native
    def setStatus(status: js.Any): Unit = js.native
    def setSubmitting(isSubmitting: Boolean): Unit = js.native
    def setTouched(touched: FormikTouched[Values]): Unit = js.native
    def setValues(values: Values): Unit = js.native
    def submitForm(): js.Promise[Unit] = js.native
    def unregisterField(name: String): Unit = js.native
    def validateField(field: String): js.Promise[js.Object] = js.native
    def validateForm(values: Values): js.Promise[FormikErrors[Values]] = js.native
  }
  
  def validateYupSchema[T /* <: FormikValues */](values: T, schema: js.Any): js.Promise[Partial[T]] = js.native
  def validateYupSchema[T /* <: FormikValues */](values: T, schema: js.Any, sync: Boolean): js.Promise[Partial[T]] = js.native
  def validateYupSchema[T /* <: FormikValues */](values: T, schema: js.Any, sync: Boolean, context: js.Any): js.Promise[Partial[T]] = js.native
  def yupToFormErrors[Values](yupError: js.Any): FormikErrors[Values] = js.native
  /* static members */
  @js.native
  object Formik extends js.Object {
    var defaultProps: AnonEnableReinitialize = js.native
  }
  
}

