package typingsJapgolly.ionicUtilsFs.mod

import typingsJapgolly.ionicUtilsFs.ionicUtilsFsStrings.data
import typingsJapgolly.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/utils-fs", "Walker")
@js.native
class Walker protected () extends Readable {
  def this(p: String) = this()
  def this(p: String, options: WalkerOptions) = this()
  val options: WalkerOptions = js.native
  val p: String = js.native
  val paths: js.Array[String] = js.native
  def _read(): Unit = js.native
  @JSName("on")
  def on_data(event: data, callback: js.Function1[/* item */ WalkerItem, Unit]): this.type = js.native
}

