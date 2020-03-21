package typingsJapgolly.react.mod

import japgolly.scalajs.react.raw.React.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ForwardRefRenderFunction[T, P] extends js.Object {
  var displayName: js.UndefOr[String] = js.native
  def apply(props: PropsWithChildren[P], ref: japgolly.scalajs.react.raw.React.Ref): Element | Null = js.native
}

