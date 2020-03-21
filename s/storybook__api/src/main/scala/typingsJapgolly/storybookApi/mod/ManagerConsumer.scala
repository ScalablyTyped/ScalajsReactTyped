package typingsJapgolly.storybookApi.mod

import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ManagerConsumer
  extends Component[ConsumerProps[SubState, Combo], js.Object, js.Any] {
  var dataMemory: js.UndefOr[js.Function1[/* combo */ Combo, SubState]] = js.native
  var prevChildren: js.UndefOr[Element | Null] = js.native
  var prevData: js.UndefOr[SubState] = js.native
}

