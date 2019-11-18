package typingsJapgolly.node

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object childUnderscoreProcessMod {
  import typingsJapgolly.node.nodeStrings.ignore
  import typingsJapgolly.node.nodeStrings.inherit
  import typingsJapgolly.node.nodeStrings.ipc
  import typingsJapgolly.node.nodeStrings.pipe
  import typingsJapgolly.node.streamMod.Stream

  /* Rewritten from type alias, can be one of: 
    - typings.node.nodeStrings.pipe
    - typings.node.nodeStrings.ignore
    - typings.node.nodeStrings.inherit
    - js.Array[
  js.UndefOr[
    typings.node.nodeStrings.pipe | typings.node.nodeStrings.ipc | typings.node.nodeStrings.ignore | typings.node.nodeStrings.inherit | typings.node.streamMod.Stream | scala.Double | scala.Null
  ]]
  */
  type StdioOptions = _StdioOptions | (js.Array[js.UndefOr[pipe | ipc | ignore | inherit | Stream | Double | Null]])
  type StdioPipe = js.UndefOr[Null | pipe]
}
