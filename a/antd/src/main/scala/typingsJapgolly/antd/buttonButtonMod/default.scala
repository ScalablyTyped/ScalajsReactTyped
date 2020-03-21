package typingsJapgolly.antd.buttonButtonMod

import typingsJapgolly.antd.AnonBlock
import typingsJapgolly.antd.buttonGroupMod.ButtonGroupProps
import typingsJapgolly.antd.contextMod.ConfigConsumerProps
import typingsJapgolly.react.mod.Context
import typingsJapgolly.react.mod.SFC
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd/lib/button/button", JSImport.Default)
@js.native
class default protected () extends Button {
  def this(props: ButtonProps) = this()
}

/* static members */
@JSImport("antd/lib/button/button", JSImport.Default)
@js.native
object default extends js.Object {
  var Group: SFC[ButtonGroupProps] = js.native
  var __ANT_BUTTON: Boolean = js.native
  var contextType: Context[ConfigConsumerProps] = js.native
  var defaultProps: AnonBlock = js.native
}

