package typingsJapgolly.vexflow.Vex.Flow

import typingsJapgolly.vexflow.AnonGetContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Vex.Flow.StaveModifier")
@js.native
class StaveModifier_ () extends js.Object {
  def addEndModifier(): Unit = js.native
  def addModifier(): Unit = js.native
  def addToStave(stave: Stave, firstGlyph: Boolean): StaveModifier = js.native
  def addToStaveEnd(stave: Stave, firstGlyph: Boolean): StaveModifier = js.native
  def getCategory(): String = js.native
  def getPadding(index: Double): Double = js.native
  def getPosition(): Double = js.native
  def getWidth(): Double = js.native
  def makeSpacer(padding: Double): AnonGetContext = js.native
  def placeGlyphOnLine(glyph: Glyph, stave: Stave, line: Double): Unit = js.native
  def setPadding(padding: Double): Unit = js.native
}

