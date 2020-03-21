package typingsJapgolly.reduxForm.mod

import typingsJapgolly.reduxForm.reducerMod.FormStateMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-form", "formValueSelector")
@js.native
object formValueSelector extends js.Object {
  def apply[State](form: String): js.Function2[/* state */ State, /* repeated */ String, _] = js.native
  def apply[State](form: String, getFormState: js.Function1[/* state */ State, FormStateMap]): js.Function2[/* state */ State, /* repeated */ String, _] = js.native
}

