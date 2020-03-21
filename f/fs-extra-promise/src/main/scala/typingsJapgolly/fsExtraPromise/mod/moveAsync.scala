package typingsJapgolly.fsExtraPromise.mod

import typingsJapgolly.bluebird.mod.^
import typingsJapgolly.fsExtra.mod.MoveOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs-extra-promise", "moveAsync")
@js.native
object moveAsync extends js.Object {
  def apply(src: String, dest: String): ^[Unit] = js.native
  def apply(src: String, dest: String, options: MoveOptions): ^[Unit] = js.native
}

