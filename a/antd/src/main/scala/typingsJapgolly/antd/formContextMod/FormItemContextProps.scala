package typingsJapgolly.antd.formContextMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormItemContextProps extends js.Object {
  def updateItemErrors(name: String, errors: js.Array[String]): Unit
}

object FormItemContextProps {
  @scala.inline
  def apply(updateItemErrors: (String, js.Array[String]) => Callback): FormItemContextProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("updateItemErrors")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Array[java.lang.String]) => updateItemErrors(t0, t1).runNow()))
    __obj.asInstanceOf[FormItemContextProps]
  }
}

