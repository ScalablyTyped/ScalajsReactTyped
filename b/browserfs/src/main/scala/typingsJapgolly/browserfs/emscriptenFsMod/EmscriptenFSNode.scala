package typingsJapgolly.browserfs.emscriptenFsMod

import typingsJapgolly.browserfs.AnonOpts
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmscriptenFSNode extends js.Object {
  var mode: Double
  var mount: AnonOpts
  var name: String
  var node_ops: EmscriptenNodeOps
  var parent: EmscriptenFSNode
  var stream_ops: EmscriptenStreamOps
}

object EmscriptenFSNode {
  @scala.inline
  def apply(
    mode: Double,
    mount: AnonOpts,
    name: String,
    node_ops: EmscriptenNodeOps,
    parent: EmscriptenFSNode,
    stream_ops: EmscriptenStreamOps
  ): EmscriptenFSNode = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any], mount = mount.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], node_ops = node_ops.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], stream_ops = stream_ops.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EmscriptenFSNode]
  }
}

