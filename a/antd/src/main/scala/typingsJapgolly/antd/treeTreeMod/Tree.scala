package typingsJapgolly.antd.treeTreeMod

import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.antd.contextMod.ConfigConsumerProps
import typingsJapgolly.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tree
  extends Component[TreeProps, js.Any, js.Any] {
  var tree: js.Any = js.native
  def renderTree(hasGetPrefixClsDirection: ConfigConsumerProps): Element = js.native
  def setTreeRef(node: js.Any): Unit = js.native
}

