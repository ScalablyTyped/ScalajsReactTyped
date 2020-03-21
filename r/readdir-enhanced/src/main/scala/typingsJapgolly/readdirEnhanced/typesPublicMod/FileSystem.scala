package typingsJapgolly.readdirEnhanced.typesPublicMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileSystem extends js.Object {
  /**
    * Returns filesystem information about a symlink.
    */
  def lstat(path: String, callback: Callback[typingsJapgolly.node.fsMod.Stats]): Unit
  /**
    * Returns the names of files in a directory.
    */
  def readdir(path: String, callback: Callback[js.Array[String]]): Unit
  /**
    * Returns filesystem information about a directory entry.
    */
  def stat(path: String, callback: Callback[typingsJapgolly.node.fsMod.Stats]): Unit
}

object FileSystem {
  @scala.inline
  def apply(
    lstat: (String, Callback[typingsJapgolly.node.fsMod.Stats]) => japgolly.scalajs.react.Callback,
    readdir: (String, Callback[js.Array[String]]) => japgolly.scalajs.react.Callback,
    stat: (String, Callback[typingsJapgolly.node.fsMod.Stats]) => japgolly.scalajs.react.Callback
  ): FileSystem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("lstat")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.readdirEnhanced.typesPublicMod.Callback[typingsJapgolly.node.fsMod.Stats]) => lstat(t0, t1).runNow()))
    __obj.updateDynamic("readdir")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.readdirEnhanced.typesPublicMod.Callback[js.Array[java.lang.String]]) => readdir(t0, t1).runNow()))
    __obj.updateDynamic("stat")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.readdirEnhanced.typesPublicMod.Callback[typingsJapgolly.node.fsMod.Stats]) => stat(t0, t1).runNow()))
    __obj.asInstanceOf[FileSystem]
  }
}

