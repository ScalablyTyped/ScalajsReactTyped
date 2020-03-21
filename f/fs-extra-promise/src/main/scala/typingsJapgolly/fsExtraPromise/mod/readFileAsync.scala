package typingsJapgolly.fsExtraPromise.mod

import typingsJapgolly.bluebird.mod.^
import typingsJapgolly.fsExtra.mod.ReadOptions
import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs-extra-promise", "readFileAsync")
@js.native
object readFileAsync extends js.Object {
  def apply(filename: String): ^[Buffer] = js.native
  def apply(filename: String, options: String): ^[String] = js.native
  def apply(filename: String, options: ReadOptions): ^[String] = js.native
}

