package typingsJapgolly.nodegit.configMod

import typingsJapgolly.nodegit.bufMod.Buf
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit/config", "Config")
@js.native
class Config_ () extends js.Object {
  def getStringBuf(name: String): js.Promise[Buf] = js.native
  def lock(transaction: js.Any): Double = js.native
  def setInt64(name: String, value: Double): Double = js.native
  def setMultivar(name: String, regexp: String, value: String): Double = js.native
  def setString(name: String, value: String): js.Promise[Double] = js.native
  def snapshot(): js.Promise[Config] = js.native
}

