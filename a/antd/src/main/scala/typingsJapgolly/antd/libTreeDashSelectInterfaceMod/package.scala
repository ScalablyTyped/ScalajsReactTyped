package typingsJapgolly.antd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libTreeDashSelectInterfaceMod {
  import japgolly.scalajs.react.raw.React.Node
  import org.scalablytyped.runtime.StringDictionary

  type TreeNode = TreeNodeNormal | TreeNodeSimpleMode
  type TreeNodeSimpleMode = StringDictionary[String | Boolean | Node]
  type TreeNodeValue = String | Double | (js.Array[Double | String])
}
