package typingsJapgolly.nodelibFsStat

import typingsJapgolly.node.fsMod.PathLike
import typingsJapgolly.node.fsMod.Stats
import typingsJapgolly.nodelibFsStat.statMod.AsyncCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@nodelib/fs.stat", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def stat(path: PathLike): js.Promise[Stats] = js.native
  def stat(path: PathLike, opts: Options): js.Promise[Stats] = js.native
  def statCallback(path: PathLike, callback: AsyncCallback): Unit = js.native
  def statCallback(path: PathLike, opts: Options, callback: AsyncCallback): Unit = js.native
  def statSync(path: PathLike): Stats = js.native
  def statSync(path: PathLike, opts: Options): Stats = js.native
  type FileSystemAdapter = typingsJapgolly.nodelibFsStat.fsMod.FileSystemAdapter
  type Options = typingsJapgolly.nodelibFsStat.optionsMod.Options
  type StatAsyncCallback = AsyncCallback
}

