package typingsJapgolly.preact.mod

import typingsJapgolly.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FunctionComponent[P]
  extends AnyComponent[P, js.Any] {
  var defaultProps: js.UndefOr[Partial[P]] = js.native
  var displayName: js.UndefOr[String] = js.native
  def apply(props: RenderableProps[P, _]): VNode[_] | Null = js.native
  def apply(props: RenderableProps[P, _], context: js.Any): VNode[_] | Null = js.native
}

