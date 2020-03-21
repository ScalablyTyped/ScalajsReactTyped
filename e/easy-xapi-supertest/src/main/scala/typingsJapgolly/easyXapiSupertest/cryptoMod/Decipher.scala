package typingsJapgolly.easyXapiSupertest.cryptoMod

import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Decipher extends js.Object {
  def `final`(): Buffer = js.native
  def `final`(output_encoding: String): String = js.native
  def setAutoPadding(auto_padding: Boolean): Unit = js.native
  def update(data: String): String = js.native
  def update(data: String, input_encoding: String): String = js.native
  def update(data: String, input_encoding: String, output_encoding: String): String = js.native
  def update(data: Buffer): Buffer = js.native
}

