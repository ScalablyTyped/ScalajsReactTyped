package typingsJapgolly.restling.mod

import typingsJapgolly.bluebird.mod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("restling", "head")
@js.native
object head extends js.Object {
  def apply(url: String): ^[RestlingResult] = js.native
  def apply(url: String, options: RestlingOptions): ^[RestlingResult] = js.native
}

