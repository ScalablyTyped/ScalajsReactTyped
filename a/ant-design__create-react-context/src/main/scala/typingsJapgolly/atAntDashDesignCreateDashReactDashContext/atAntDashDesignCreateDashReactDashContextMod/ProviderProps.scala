package typingsJapgolly.atAntDashDesignCreateDashReactDashContext.atAntDashDesignCreateDashReactDashContextMod

import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProviderProps[T] extends js.Object {
  var children: Node
  var value: T
}

object ProviderProps {
  @scala.inline
  def apply[T](children: VdomNode, value: T): ProviderProps[T] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProviderProps[T]]
  }
}

