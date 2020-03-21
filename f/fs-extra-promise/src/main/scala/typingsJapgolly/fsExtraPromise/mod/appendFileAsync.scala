package typingsJapgolly.fsExtraPromise.mod

import typingsJapgolly.bluebird.mod.^
import typingsJapgolly.fsExtra.mod.WriteOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs-extra-promise", "appendFileAsync")
@js.native
object appendFileAsync extends js.Object {
  def apply(filename: String, data: js.Any): ^[Unit] = js.native
  def apply(filename: String, data: js.Any, option: String): ^[Unit] = js.native
  def apply(filename: String, data: js.Any, option: WriteOptions): ^[Unit] = js.native
}

