package typingsJapgolly.fsExtraPromise.mod

import typingsJapgolly.bluebird.mod.^
import typingsJapgolly.fsExtra.mod.WriteOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs-extra-promise", "writeFileAsync")
@js.native
object writeFileAsync extends js.Object {
  def apply(filename: String, data: js.Any): ^[Unit] = js.native
  def apply(filename: String, data: js.Any, options: String): ^[Unit] = js.native
  def apply(filename: String, data: js.Any, options: WriteOptions): ^[Unit] = js.native
}

