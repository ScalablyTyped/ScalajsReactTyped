package typingsJapgolly.baseui

import typingsJapgolly.baseui.toastMod.ToastProps
import typingsJapgolly.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baseui/notification", JSImport.Namespace)
@js.native
object notificationMod extends js.Object {
  @js.native
  class Notification ()
    extends Component[ToastProps, js.Object, js.Any]
  
  val KIND: typingsJapgolly.baseui.toastMod.KIND = js.native
}

