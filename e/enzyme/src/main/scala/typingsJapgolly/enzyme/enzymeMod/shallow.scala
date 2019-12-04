package typingsJapgolly.enzyme.enzymeMod

import japgolly.scalajs.react.raw.React.Component
import japgolly.scalajs.react.raw.React.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("enzyme", "shallow")
@js.native
object shallow extends js.Object {
  def apply[P](node: Element): ShallowWrapper[P, _, Component[js.Object, js.Object]] = js.native
  def apply[P](node: Element, options: ShallowRendererProps): ShallowWrapper[P, _, Component[js.Object, js.Object]] = js.native
}

