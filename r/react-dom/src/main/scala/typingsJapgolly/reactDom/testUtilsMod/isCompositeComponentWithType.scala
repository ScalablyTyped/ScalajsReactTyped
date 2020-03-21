package typingsJapgolly.reactDom.testUtilsMod

import japgolly.scalajs.react.raw.React.Component
import japgolly.scalajs.react.raw.React.ComponentClassP
import typingsJapgolly.react.mod.ClassType
import typingsJapgolly.react.mod.ReactInstance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-dom/test-utils", "isCompositeComponentWithType")
@js.native
object isCompositeComponentWithType extends js.Object {
  def apply[T /* <: Component[js.Object, js.Object] */, C /* <: ComponentClassP[js.Object] */](instance: ReactInstance, `type`: ClassType[_, T, C]): Boolean = js.native
}

