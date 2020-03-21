package typingsJapgolly.fsExtraPromise.mod

import typingsJapgolly.bluebird.mod.^
import typingsJapgolly.node.fsMod.symlink.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs-extra-promise", "symlinkAsync")
@js.native
object symlinkAsync extends js.Object {
  def apply(srcpath: String, dstpath: String): ^[Unit] = js.native
  def apply(srcpath: String, dstpath: String, `type`: Type): ^[Unit] = js.native
}

