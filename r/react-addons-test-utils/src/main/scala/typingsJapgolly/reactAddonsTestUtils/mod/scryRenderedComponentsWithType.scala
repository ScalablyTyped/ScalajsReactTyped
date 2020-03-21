package typingsJapgolly.reactAddonsTestUtils.mod

import japgolly.scalajs.react.raw.React.Component
import japgolly.scalajs.react.raw.React.ComponentClassP
import typingsJapgolly.react.mod.ClassType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-addons-test-utils", "scryRenderedComponentsWithType")
@js.native
object scryRenderedComponentsWithType extends js.Object {
  def apply[T /* <: Component[js.Object, js.Object] */, C /* <: ComponentClassP[js.Object] */](root: Component[js.Object, js.Object], `type`: ClassType[_, T, C]): js.Array[T] = js.native
}

