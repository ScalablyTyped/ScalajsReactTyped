package typingsJapgolly.terminalKit.screenBufferHDMod

import typingsJapgolly.terminalKit.AnonAttrChar
import typingsJapgolly.terminalKit.AnonBlending
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScreenBufferHD
  extends typingsJapgolly.terminalKit.screenBufferMod.^ {
  @JSName("blending")
  val blending_ScreenBufferHD: IsBlending = js.native
  def draw(options: AnonBlending): Unit = js.native
  def fill(options: AnonAttrChar): Unit = js.native
}

