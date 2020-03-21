package typingsJapgolly.reactLifecycleComponent.mod

import japgolly.scalajs.react.raw.React.ComponentClassP
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-lifecycle-component", "applyLifecycle")
@js.native
object applyLifecycle extends js.Object {
  def apply[P, S](component: ComponentClassP[P with js.Object]): ComponentClassP[P with (LifecycleDispatchProps[P, S]) with js.Object] = js.native
}

