package typingsJapgolly.reactDom.testUtilsMod

import japgolly.scalajs.react.raw.React.Component
import typingsJapgolly.react.mod.ReactInstance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-dom/test-utils", "findAllInRenderedTree")
@js.native
object findAllInRenderedTree extends js.Object {
  def apply(root: Component[js.Object, js.Object], fn: js.Function1[/* i */ ReactInstance, Boolean]): js.Array[ReactInstance] = js.native
}

