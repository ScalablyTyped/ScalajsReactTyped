package typingsJapgolly.nextReduxWrapper

import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<next-redux-wrapper.next-redux-wrapper.WrappedAppProps> & std.Readonly<{  children ? :react.react.ReactNode}> */
trait ReadonlyWrappedAppPropsRe extends js.Object {
  val children: js.UndefOr[Node] = js.undefined
  val initialProps: js.Any
  val initialState: js.Any
  val isServer: Boolean
}

object ReadonlyWrappedAppPropsRe {
  @scala.inline
  def apply(initialProps: js.Any, initialState: js.Any, isServer: Boolean, children: VdomNode = null): ReadonlyWrappedAppPropsRe = {
    val __obj = js.Dynamic.literal(initialProps = initialProps.asInstanceOf[js.Any], initialState = initialState.asInstanceOf[js.Any], isServer = isServer.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyWrappedAppPropsRe]
  }
}

