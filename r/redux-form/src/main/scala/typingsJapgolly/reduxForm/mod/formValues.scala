package typingsJapgolly.reduxForm.mod

import japgolly.scalajs.react.raw.React.ComponentClassP
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-form", "formValues")
@js.native
object formValues extends js.Object {
  def apply[Values, P](obj: Values): js.Function1[
    /* component */ ComponentType[P with typingsJapgolly.reduxForm.reduxFormStrings.formValues with js.Any], 
    ComponentClassP[
      P with typingsJapgolly.reduxForm.reduxFormStrings.formValues with js.Any with js.Object
    ]
  ] = js.native
  def apply[FormData, K /* <: String */, P](names: K*): js.Function1[
    /* component */ ComponentType[P with (Pick[FormData, K])], 
    ComponentClassP[P with (Pick[FormData, K]) with js.Object]
  ] = js.native
}

