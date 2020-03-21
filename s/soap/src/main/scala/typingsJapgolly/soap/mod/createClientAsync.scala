package typingsJapgolly.soap.mod

import typingsJapgolly.bluebird.mod.^
import typingsJapgolly.soap.typesMod.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("soap", "createClientAsync")
@js.native
object createClientAsync extends js.Object {
  def apply(url: String): ^[typingsJapgolly.soap.clientMod.Client] = js.native
  def apply(url: String, options: IOptions): ^[typingsJapgolly.soap.clientMod.Client] = js.native
  def apply(url: String, options: IOptions, endpoint: String): ^[typingsJapgolly.soap.clientMod.Client] = js.native
}

