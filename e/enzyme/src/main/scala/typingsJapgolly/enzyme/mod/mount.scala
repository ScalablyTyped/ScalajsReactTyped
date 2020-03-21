package typingsJapgolly.enzyme.mod

import japgolly.scalajs.react.raw.React.Component
import japgolly.scalajs.react.raw.React.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("enzyme", "mount")
@js.native
object mount extends js.Object {
  def apply[P](node: Element): ReactWrapper[P, _, Component[js.Object, js.Object]] = js.native
  def apply[P](node: Element, options: MountRendererProps): ReactWrapper[P, _, Component[js.Object, js.Object]] = js.native
}

