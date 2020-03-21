package typingsJapgolly.antd.errorBoundaryMod

import typingsJapgolly.antd.AnonError
import typingsJapgolly.antd.AnonInfo
import typingsJapgolly.react.mod.Component
import typingsJapgolly.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ErrorBoundary
  extends Component[ErrorBoundaryProps, AnonError, js.Any] {
  @JSName("state")
  var state_ErrorBoundary: AnonInfo = js.native
  @JSName("componentDidCatch")
  def componentDidCatch_MErrorBoundary(error: Null, info: js.Object): Unit = js.native
  @JSName("componentDidCatch")
  def componentDidCatch_MErrorBoundary(error: Error, info: js.Object): Unit = js.native
}

