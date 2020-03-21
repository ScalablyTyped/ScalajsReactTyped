package typingsJapgolly.terminalKit.mod

import typingsJapgolly.terminalKit.AnonBlending
import typingsJapgolly.terminalKit.AnonShrinkAnonWidth
import typingsJapgolly.terminalKit.screenBufferHDMod.^
import typingsJapgolly.terminalKit.screenBufferMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("terminal-kit", "ScreenBufferHD")
@js.native
class ScreenBufferHD protected () extends ^ {
  def this(options: AnonBlending) = this()
  def this(options: Options) = this()
}

/* static members */
@JSImport("terminal-kit", "ScreenBufferHD")
@js.native
object ScreenBufferHD extends js.Object {
  def loadImage(
    url: String,
    calback: js.Function2[/* error */ js.UndefOr[js.Any], /* image */ js.UndefOr[this.type], Unit]
  ): Unit = js.native
  def loadImage(
    url: String,
    options: AnonShrinkAnonWidth,
    callback: js.Function2[/* error */ js.Any, /* image */ this.type, Unit]
  ): Unit = js.native
}

