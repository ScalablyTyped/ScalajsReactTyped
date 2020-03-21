package typingsJapgolly.reactDom.testUtilsMod

import japgolly.scalajs.react.raw.React.Component
import japgolly.scalajs.react.raw.React.ComponentClassP
import typingsJapgolly.react.mod.ClassType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-dom/test-utils", "findRenderedComponentWithType")
@js.native
object findRenderedComponentWithType extends js.Object {
  def apply[T /* <: Component[js.Object, js.Object] */, C /* <: ComponentClassP[js.Object] */](root: Component[js.Object, js.Object], `type`: ClassType[_, T, C]): T = js.native
}

