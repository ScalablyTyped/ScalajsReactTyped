package typingsJapgolly.browserfs.emscriptenFsMod

import typingsJapgolly.browserfs.AnonOpts
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EmscriptenFS extends js.Object {
  var node_ops: EmscriptenNodeOps = js.native
  var stream_ops: EmscriptenStreamOps = js.native
  def createNode(parent: EmscriptenFSNode, name: String, mode: Double): EmscriptenFSNode = js.native
  def createNode(parent: EmscriptenFSNode, name: String, mode: Double, dev: js.Any): EmscriptenFSNode = js.native
  def getMode(path: String): Double = js.native
  def mount(mount: AnonOpts): EmscriptenFSNode = js.native
  def realPath(node: EmscriptenFSNode): String = js.native
}

