package typingsJapgolly.browserfs.emscriptenFsMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmscriptenNodeOps extends js.Object {
  def getattr(node: EmscriptenFSNode): Stats
  def lookup(parent: EmscriptenFSNode, name: String): EmscriptenFSNode
  def mknod(parent: EmscriptenFSNode, name: String, mode: Double, dev: js.Any): EmscriptenFSNode
  def readdir(node: EmscriptenFSNode): js.Array[String]
  def readlink(node: EmscriptenFSNode): String
  def rename(oldNode: EmscriptenFSNode, newDir: EmscriptenFSNode, newName: String): Unit
  def rmdir(parent: EmscriptenFSNode, name: String): Unit
  def setattr(node: EmscriptenFSNode, attr: Stats): Unit
  def symlink(parent: EmscriptenFSNode, newName: String, oldPath: String): Unit
  def unlink(parent: EmscriptenFSNode, name: String): Unit
}

object EmscriptenNodeOps {
  @scala.inline
  def apply(
    getattr: EmscriptenFSNode => CallbackTo[Stats],
    lookup: (EmscriptenFSNode, String) => CallbackTo[EmscriptenFSNode],
    mknod: (EmscriptenFSNode, String, Double, js.Any) => CallbackTo[EmscriptenFSNode],
    readdir: EmscriptenFSNode => CallbackTo[js.Array[String]],
    readlink: EmscriptenFSNode => CallbackTo[String],
    rename: (EmscriptenFSNode, EmscriptenFSNode, String) => Callback,
    rmdir: (EmscriptenFSNode, String) => Callback,
    setattr: (EmscriptenFSNode, Stats) => Callback,
    symlink: (EmscriptenFSNode, String, String) => Callback,
    unlink: (EmscriptenFSNode, String) => Callback
  ): EmscriptenNodeOps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getattr")(js.Any.fromFunction1((t0: typingsJapgolly.browserfs.emscriptenFsMod.EmscriptenFSNode) => getattr(t0).runNow()))
    __obj.updateDynamic("lookup")(js.Any.fromFunction2((t0: typingsJapgolly.browserfs.emscriptenFsMod.EmscriptenFSNode, t1: java.lang.String) => lookup(t0, t1).runNow()))
    __obj.updateDynamic("mknod")(js.Any.fromFunction4((t0: typingsJapgolly.browserfs.emscriptenFsMod.EmscriptenFSNode, t1: java.lang.String, t2: scala.Double, t3: js.Any) => mknod(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("readdir")(js.Any.fromFunction1((t0: typingsJapgolly.browserfs.emscriptenFsMod.EmscriptenFSNode) => readdir(t0).runNow()))
    __obj.updateDynamic("readlink")(js.Any.fromFunction1((t0: typingsJapgolly.browserfs.emscriptenFsMod.EmscriptenFSNode) => readlink(t0).runNow()))
    __obj.updateDynamic("rename")(js.Any.fromFunction3((t0: typingsJapgolly.browserfs.emscriptenFsMod.EmscriptenFSNode, t1: typingsJapgolly.browserfs.emscriptenFsMod.EmscriptenFSNode, t2: java.lang.String) => rename(t0, t1, t2).runNow()))
    __obj.updateDynamic("rmdir")(js.Any.fromFunction2((t0: typingsJapgolly.browserfs.emscriptenFsMod.EmscriptenFSNode, t1: java.lang.String) => rmdir(t0, t1).runNow()))
    __obj.updateDynamic("setattr")(js.Any.fromFunction2((t0: typingsJapgolly.browserfs.emscriptenFsMod.EmscriptenFSNode, t1: typingsJapgolly.browserfs.emscriptenFsMod.Stats) => setattr(t0, t1).runNow()))
    __obj.updateDynamic("symlink")(js.Any.fromFunction3((t0: typingsJapgolly.browserfs.emscriptenFsMod.EmscriptenFSNode, t1: java.lang.String, t2: java.lang.String) => symlink(t0, t1, t2).runNow()))
    __obj.updateDynamic("unlink")(js.Any.fromFunction2((t0: typingsJapgolly.browserfs.emscriptenFsMod.EmscriptenFSNode, t1: java.lang.String) => unlink(t0, t1).runNow()))
    __obj.asInstanceOf[EmscriptenNodeOps]
  }
}

