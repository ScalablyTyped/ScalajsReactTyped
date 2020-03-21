package typingsJapgolly.formik.typesMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.raw.React.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormikRegistration extends js.Object {
  def registerField(name: String, Comp: Component[js.Object, js.Object]): Unit
  def unregisterField(name: String): Unit
}

object FormikRegistration {
  @scala.inline
  def apply(
    registerField: (String, Component[js.Object, js.Object]) => Callback,
    unregisterField: String => Callback
  ): FormikRegistration = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("registerField")(js.Any.fromFunction2((t0: java.lang.String, t1: japgolly.scalajs.react.raw.React.Component[js.Object, js.Object]) => registerField(t0, t1).runNow()))
    __obj.updateDynamic("unregisterField")(js.Any.fromFunction1((t0: java.lang.String) => unregisterField(t0).runNow()))
    __obj.asInstanceOf[FormikRegistration]
  }
}

