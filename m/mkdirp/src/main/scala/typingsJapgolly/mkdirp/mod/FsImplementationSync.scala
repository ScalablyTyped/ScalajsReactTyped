package typingsJapgolly.mkdirp.mod

import typingsJapgolly.mkdirp.FnCall
import typingsJapgolly.node.fsMod.MakeDirectoryOptions
import typingsJapgolly.node.fsMod.PathLike
import typingsJapgolly.node.fsMod.Stats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FsImplementationSync extends js.Object {
  @JSName("mkdirSync")
  var mkdirSync_Original: FnCall = js.native
  @JSName("statSync")
  var statSync_Original: js.Function1[/* path */ PathLike, Stats] = js.native
  def mkdirSync(path: PathLike): Unit = js.native
  def mkdirSync(path: PathLike, options: String): Unit = js.native
  def mkdirSync(path: PathLike, options: Double): Unit = js.native
  def mkdirSync(path: PathLike, options: MakeDirectoryOptions): Unit = js.native
  def statSync(path: PathLike): Stats = js.native
}

