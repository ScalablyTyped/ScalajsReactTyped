package typingsJapgolly.hexoFs.mod

import typingsJapgolly.hexoFs.Anon0
import typingsJapgolly.hexoFs.Anon1
import typingsJapgolly.hexoFs.AnonEncoding
import typingsJapgolly.node.Buffer
import typingsJapgolly.node.BufferEncoding
import typingsJapgolly.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hexo-fs", "readdir")
@js.native
object readdir extends js.Object {
  def apply(path: PathLike): typingsJapgolly.bluebird.mod.^[js.Array[String]] = js.native
  def apply(path: PathLike, options: String): typingsJapgolly.bluebird.mod.^[js.Array[String | Buffer]] = js.native
  def apply(path: PathLike, options: Anon0): typingsJapgolly.bluebird.mod.^[js.Array[Buffer]] = js.native
  def apply(path: PathLike, options: Anon1): typingsJapgolly.bluebird.mod.^[js.Array[String | Buffer]] = js.native
  def apply(path: PathLike, options: AnonEncoding): typingsJapgolly.bluebird.mod.^[js.Array[String]] = js.native
  def apply(path: PathLike, options: BufferEncoding): typingsJapgolly.bluebird.mod.^[js.Array[String]] = js.native
}

