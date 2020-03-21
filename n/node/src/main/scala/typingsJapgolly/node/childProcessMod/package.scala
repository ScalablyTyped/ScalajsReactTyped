package typingsJapgolly.node

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object childProcessMod {
  type Serializable = java.lang.String | js.Object | scala.Double | scala.Boolean
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.node.nodeStrings.pipe
    - typingsJapgolly.node.nodeStrings.ignore
    - typingsJapgolly.node.nodeStrings.inherit
    - js.Array[
  js.UndefOr[
    typingsJapgolly.node.nodeStrings.pipe | typingsJapgolly.node.nodeStrings.ipc | typingsJapgolly.node.nodeStrings.ignore | typingsJapgolly.node.nodeStrings.inherit | typingsJapgolly.node.streamMod.Stream | scala.Double | scala.Null
  ]]
  */
  type StdioOptions = typingsJapgolly.node.childProcessMod._StdioOptions | (js.Array[
    js.UndefOr[
      typingsJapgolly.node.nodeStrings.pipe | typingsJapgolly.node.nodeStrings.ipc | typingsJapgolly.node.nodeStrings.ignore | typingsJapgolly.node.nodeStrings.inherit | typingsJapgolly.node.streamMod.Stream | scala.Double | scala.Null
    ]
  ])
  type StdioPipe = js.UndefOr[scala.Null | typingsJapgolly.node.nodeStrings.pipe]
}
