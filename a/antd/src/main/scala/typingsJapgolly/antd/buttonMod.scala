package typingsJapgolly.antd

import typingsJapgolly.antd.buttonButtonMod.ButtonProps
import typingsJapgolly.antd.buttonGroupMod.ButtonGroupProps
import typingsJapgolly.antd.contextMod.ConfigConsumerProps
import typingsJapgolly.react.mod.Context
import typingsJapgolly.react.mod.SFC
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd/lib/button", JSImport.Namespace)
@js.native
object buttonMod extends js.Object {
  @js.native
  class default protected ()
    extends typingsJapgolly.antd.buttonButtonMod.default {
    def this(props: ButtonProps) = this()
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    var Group: SFC[ButtonGroupProps] = js.native
    var __ANT_BUTTON: Boolean = js.native
    var contextType: Context[ConfigConsumerProps] = js.native
    var defaultProps: AnonBlock = js.native
  }
  
}

