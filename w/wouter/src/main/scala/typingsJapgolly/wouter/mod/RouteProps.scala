package typingsJapgolly.wouter.mod

import japgolly.scalajs.react.raw.React.Node
import typingsJapgolly.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouteProps[T /* <: DefaultParams */] extends js.Object {
  var children: js.UndefOr[(js.Function1[/* params */ Params[T], Node]) | Node] = js.undefined
  var component: js.UndefOr[ComponentType[RouteComponentProps[T]]] = js.undefined
  var path: Path
}

object RouteProps {
  @scala.inline
  def apply[T /* <: DefaultParams */](
    path: Path,
    children: (js.Function1[/* params */ Params[T], Node]) | Node = null,
    component: ComponentType[RouteComponentProps[T]] = null
  ): RouteProps[T] = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteProps[T]]
  }
}

