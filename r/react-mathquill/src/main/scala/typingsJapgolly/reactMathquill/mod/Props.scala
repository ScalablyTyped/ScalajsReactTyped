package typingsJapgolly.reactMathquill.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.edtrIoMathquill.mod.Config
import typingsJapgolly.edtrIoMathquill.mod.MQ
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Omit<react.react.ComponentProps<'span'>, 'onChange'> */
trait Props extends js.Object {
  var config: js.UndefOr[Config] = js.undefined
  var latex: js.UndefOr[String] = js.undefined
  var mathquillDidMount: js.UndefOr[js.Function1[/* mathField */ MQ, Unit]] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* mathField */ MQ, Unit]] = js.undefined
}

object Props {
  @scala.inline
  def apply(
    config: Config = null,
    latex: String = null,
    mathquillDidMount: /* mathField */ MQ => Callback = null,
    onChange: /* mathField */ MQ => Callback = null
  ): Props = {
    val __obj = js.Dynamic.literal()
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (latex != null) __obj.updateDynamic("latex")(latex.asInstanceOf[js.Any])
    if (mathquillDidMount != null) __obj.updateDynamic("mathquillDidMount")(js.Any.fromFunction1((t0: /* mathField */ typingsJapgolly.edtrIoMathquill.mod.MQ) => mathquillDidMount(t0).runNow()))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* mathField */ typingsJapgolly.edtrIoMathquill.mod.MQ) => onChange(t0).runNow()))
    __obj.asInstanceOf[Props]
  }
}

