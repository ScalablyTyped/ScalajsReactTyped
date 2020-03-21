package typingsJapgolly.antd.mod

import typingsJapgolly.antd.AnonBlock
import typingsJapgolly.antd.buttonButtonMod.ButtonProps
import typingsJapgolly.antd.buttonGroupMod.ButtonGroupProps
import typingsJapgolly.antd.buttonMod.default
import typingsJapgolly.antd.contextMod.ConfigConsumerProps
import typingsJapgolly.react.mod.Context
import typingsJapgolly.react.mod.SFC
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd", "Button")
@js.native
class Button protected () extends default {
  def this(props: ButtonProps) = this()
}

/* static members */
@JSImport("antd", "Button")
@js.native
object Button extends js.Object {
  var Group: SFC[ButtonGroupProps] = js.native
  var __ANT_BUTTON: Boolean = js.native
  var contextType: Context[ConfigConsumerProps] = js.native
  var defaultProps: AnonBlock = js.native
}

