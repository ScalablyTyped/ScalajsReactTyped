package typingsJapgolly.hexoFs.mod

import typingsJapgolly.hexoFs.Anon0
import typingsJapgolly.hexoFs.Anon1
import typingsJapgolly.hexoFs.Anon2
import typingsJapgolly.node.Buffer
import typingsJapgolly.node.BufferEncoding
import typingsJapgolly.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hexo-fs", "realpath")
@js.native
object realpath extends js.Object {
  def apply(path: PathLike): typingsJapgolly.bluebird.mod.^[String] = js.native
  def apply(path: PathLike, options: String): typingsJapgolly.bluebird.mod.^[String | Buffer] = js.native
  def apply(path: PathLike, options: Anon0): typingsJapgolly.bluebird.mod.^[Buffer] = js.native
  def apply(path: PathLike, options: Anon1): typingsJapgolly.bluebird.mod.^[String | Buffer] = js.native
  def apply(path: PathLike, options: Anon2): typingsJapgolly.bluebird.mod.^[String] = js.native
  def apply(path: PathLike, options: BufferEncoding): typingsJapgolly.bluebird.mod.^[String] = js.native
}

