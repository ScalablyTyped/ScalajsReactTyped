package typingsJapgolly.antDesignProLayout.blockCheckboxMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.antDesignProLayout.AnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BlockCheckboxProps extends js.Object {
  var list: js.UndefOr[js.Array[AnonKey]] = js.undefined
  var value: String
  def onChange(key: String): Unit
}

object BlockCheckboxProps {
  @scala.inline
  def apply(onChange: String => Callback, value: String, list: js.Array[AnonKey] = null): BlockCheckboxProps = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: java.lang.String) => onChange(t0).runNow()))
    if (list != null) __obj.updateDynamic("list")(list.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockCheckboxProps]
  }
}

