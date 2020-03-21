package typingsJapgolly.storybookReactNative

import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<{}> & std.Readonly<{  children ? :react.react.ReactNode}> */
trait ReadonlyReadonlychildrenR extends js.Object {
  val children: js.UndefOr[Node] = js.undefined
}

object ReadonlyReadonlychildrenR {
  @scala.inline
  def apply(children: VdomNode = null): ReadonlyReadonlychildrenR = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyReadonlychildrenR]
  }
}

