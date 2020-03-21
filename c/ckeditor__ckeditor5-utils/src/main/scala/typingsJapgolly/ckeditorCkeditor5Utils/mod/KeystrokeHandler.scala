package typingsJapgolly.ckeditorCkeditor5Utils.mod

import typingsJapgolly.ckeditorCkeditor5Utils.AnonPriority
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ckeditor/ckeditor5-utils", "KeystrokeHandler")
@js.native
class KeystrokeHandler () extends js.Object {
  def destroy(): Unit = js.native
  def listenTo(emitter: Emitter): Unit = js.native
  def press(keyEvtData: KeystrokeInfo): Boolean = js.native
  def set(
    keystroke: String,
    callback: js.Function2[/* keyEvtData */ KeystrokeInfo, /* cancel */ js.Function0[Unit], Unit]
  ): Unit = js.native
  def set(
    keystroke: String,
    callback: js.Function2[/* keyEvtData */ KeystrokeInfo, /* cancel */ js.Function0[Unit], Unit],
    options: AnonPriority
  ): Unit = js.native
  def set(
    keystroke: js.Array[String | Double],
    callback: js.Function2[/* keyEvtData */ KeystrokeInfo, /* cancel */ js.Function0[Unit], Unit]
  ): Unit = js.native
  def set(
    keystroke: js.Array[String | Double],
    callback: js.Function2[/* keyEvtData */ KeystrokeInfo, /* cancel */ js.Function0[Unit], Unit],
    options: AnonPriority
  ): Unit = js.native
}

