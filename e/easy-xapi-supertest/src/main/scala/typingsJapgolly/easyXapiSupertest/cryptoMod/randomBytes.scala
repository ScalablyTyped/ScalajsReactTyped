package typingsJapgolly.easyXapiSupertest.cryptoMod

import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("crypto", "randomBytes")
@js.native
object randomBytes extends js.Object {
  def apply(size: Double): Buffer = js.native
  def apply(size: Double, callback: js.Function2[/* err */ js.Error, /* buf */ Buffer, Unit]): Unit = js.native
}

