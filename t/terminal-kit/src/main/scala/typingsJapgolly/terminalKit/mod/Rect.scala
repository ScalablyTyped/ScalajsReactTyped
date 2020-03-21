package typingsJapgolly.terminalKit.mod

import typingsJapgolly.terminalKit.AnonDstRect
import typingsJapgolly.terminalKit.rectMod.AbsoluteOptions
import typingsJapgolly.terminalKit.rectMod.Region
import typingsJapgolly.terminalKit.rectMod.^
import typingsJapgolly.terminalKit.terminalMod.Terminal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("terminal-kit", "Rect")
@js.native
class Rect protected () extends ^ {
  def this(options: AbsoluteOptions) = this()
  def this(options: typingsJapgolly.terminalKit.rectMod.Rect) = this()
  def this(options: Region) = this()
  def this(options: typingsJapgolly.terminalKit.screenBufferMod.^) = this()
  def this(options: Terminal) = this()
  def this(options: typingsJapgolly.terminalKit.textBufferMod.^) = this()
  def this(xmin: Double, xmax: Double, ymin: Double, ymax: Double) = this()
}

/* static members */
@JSImport("terminal-kit", "Rect")
@js.native
object Rect extends js.Object {
  def wrappingRect(params: AnonDstRect): Unit = js.native
}

