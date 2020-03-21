package typingsJapgolly.hexoFs.mod

import typingsJapgolly.hexoFs.AnonAutoClose
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hexo-fs", "ensureWriteStream")
@js.native
object ensureWriteStream extends js.Object {
  def apply(path: String): typingsJapgolly.bluebird.mod.^[typingsJapgolly.gracefulFs.mod.WriteStream] = js.native
  def apply(
    path: String,
    callback: js.Function2[
      /* err */ js.Any, 
      /* value */ js.UndefOr[typingsJapgolly.gracefulFs.mod.WriteStream], 
      Unit
    ]
  ): typingsJapgolly.bluebird.mod.^[typingsJapgolly.gracefulFs.mod.WriteStream] = js.native
  def apply(path: String, options: String): typingsJapgolly.bluebird.mod.^[typingsJapgolly.gracefulFs.mod.WriteStream] = js.native
  def apply(
    path: String,
    options: String,
    callback: js.Function2[
      /* err */ js.Any, 
      /* value */ js.UndefOr[typingsJapgolly.gracefulFs.mod.WriteStream], 
      Unit
    ]
  ): typingsJapgolly.bluebird.mod.^[typingsJapgolly.gracefulFs.mod.WriteStream] = js.native
  def apply(path: String, options: AnonAutoClose): typingsJapgolly.bluebird.mod.^[typingsJapgolly.gracefulFs.mod.WriteStream] = js.native
  def apply(
    path: String,
    options: AnonAutoClose,
    callback: js.Function2[
      /* err */ js.Any, 
      /* value */ js.UndefOr[typingsJapgolly.gracefulFs.mod.WriteStream], 
      Unit
    ]
  ): typingsJapgolly.bluebird.mod.^[typingsJapgolly.gracefulFs.mod.WriteStream] = js.native
}

