package typingsJapgolly.antd

import typingsJapgolly.antd.libDateDashPickerInterfaceMod.DatePickerDecorator
import typingsJapgolly.antd.libDateDashPickerInterfaceMod.DatePickerProps
import typingsJapgolly.react.reactMod.ClassicComponent
import typingsJapgolly.react.reactMod.ComponentState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd/lib/date-picker", JSImport.Namespace)
@js.native
object libDateDashPickerMod extends js.Object {
  @js.native
  class default protected () extends ClassicComponent[DatePickerProps, ComponentState] {
    def this(props: DatePickerProps) = this()
    def this(props: DatePickerProps, context: js.Any) = this()
  }
  
  val default: DatePickerDecorator = js.native
}

