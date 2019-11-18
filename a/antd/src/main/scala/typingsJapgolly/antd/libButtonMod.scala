package typingsJapgolly.antd

import typingsJapgolly.antd.libButtonButtonDashGroupMod.ButtonGroupProps
import typingsJapgolly.antd.libButtonButtonMod.ButtonProps
import typingsJapgolly.react.reactMod.SFC
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd/lib/button", JSImport.Namespace)
@js.native
object libButtonMod extends js.Object {
  @js.native
  class default protected ()
    extends typingsJapgolly.antd.libButtonButtonMod.default {
    def this(props: ButtonProps) = this()
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    var Group: SFC[ButtonGroupProps] = js.native
    var __ANT_BUTTON: Boolean = js.native
    var defaultProps: Anon_Block = js.native
    var propTypes: Anon_Args = js.native
  }
  
}

