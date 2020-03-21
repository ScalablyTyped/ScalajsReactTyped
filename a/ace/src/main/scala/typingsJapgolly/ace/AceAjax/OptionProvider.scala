package typingsJapgolly.ace.AceAjax

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionProvider extends js.Object {
  /**
    * Get a Configuration Option
    **/
  def getOption(name: String): js.Any
  /**
    * Get Configuration Options
    **/
  def getOptions(): js.Any
  /**
    * Sets a Configuration Option
    **/
  def setOption(optionName: String, optionValue: js.Any): Unit
  /**
    * Sets Configuration Options
    **/
  def setOptions(keyValueTuples: js.Any): Unit
}

object OptionProvider {
  @scala.inline
  def apply(
    getOption: String => CallbackTo[js.Any],
    getOptions: CallbackTo[js.Any],
    setOption: (String, js.Any) => Callback,
    setOptions: js.Any => Callback
  ): OptionProvider = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getOption")(js.Any.fromFunction1((t0: java.lang.String) => getOption(t0).runNow()))
    __obj.updateDynamic("getOptions")(getOptions.toJsFn)
    __obj.updateDynamic("setOption")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Any) => setOption(t0, t1).runNow()))
    __obj.updateDynamic("setOptions")(js.Any.fromFunction1((t0: js.Any) => setOptions(t0).runNow()))
    __obj.asInstanceOf[OptionProvider]
  }
}

