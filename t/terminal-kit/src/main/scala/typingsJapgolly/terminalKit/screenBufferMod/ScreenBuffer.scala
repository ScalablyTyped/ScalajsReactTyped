package typingsJapgolly.terminalKit.screenBufferMod

import typingsJapgolly.terminalKit.AnonAttr
import typingsJapgolly.terminalKit.AnonChar
import typingsJapgolly.terminalKit.AnonDst
import typingsJapgolly.terminalKit.AnonX
import typingsJapgolly.terminalKit.screenBufferHDMod.IsBlending
import typingsJapgolly.terminalKit.terminalMod.Terminal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScreenBuffer
  extends typingsJapgolly.nextgenEvents.mod.^ {
  val blending: Boolean | IsBlending = js.native
  val dst: Terminal | ScreenBuffer = js.native
  val x: Double = js.native
  val y: Double = js.native
  def attr2object(attrFlags: Double): Unit = js.native
  def clear(): Unit = js.native
  def draw(): Unit = js.native
  def draw(options: DrawOptions): Unit = js.native
  def drawCursor(): Unit = js.native
  def drawCursor(options: AnonDst): Unit = js.native
  def dumpChars(): String = js.native
  def fill(): Unit = js.native
  def fill(options: AnonAttr): Unit = js.native
  def get(): AnonChar = js.native
  def get(options: AnonX): AnonChar = js.native
  def moveTo(x: Double, y: Double): Unit = js.native
  def object2attr(attrObject: Attributes): Unit = js.native
  def put(options: PutOptions, format: String, formatArgumets: js.Any*): Unit = js.native
  def resize(fromRect: typingsJapgolly.terminalKit.rectMod.Options): Unit = js.native
  def resize(fromRect: typingsJapgolly.terminalKit.rectMod.^): Unit = js.native
  def saveSync(filepath: String): Unit = js.native
  def vScroll(offset: Double, drawToTerminal: Boolean): Unit = js.native
}

