package typingsJapgolly.oracleOraclejet.ojdiagramMod

import typingsJapgolly.oracleOraclejet.AnonH
import typingsJapgolly.oracleOraclejet.AnonY
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.baseline
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.bottom
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.center
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.left
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.middle
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.right
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DvtDiagramLayoutContextNode extends js.Object {
  def getBounds(): AnonH = js.native
  def getChildNodes(): js.Array[_] = js.native
  def getContentBounds(): AnonH = js.native
  def getData(): js.Object = js.native
  def getId(): js.Any = js.native
  def getLabelBounds(): AnonH = js.native
  def getLabelHalign(): left | center | right = js.native
  def getLabelPosition(): AnonY = js.native
  def getLabelRotationAngle(): Double = js.native
  def getLabelRotationPoint(): AnonY = js.native
  def getLabelValign(): top | middle | bottom | baseline = js.native
  def getPosition(): AnonY = js.native
  def getRelativePosition(containerId: js.Any): AnonY = js.native
  def getSelected(): Boolean = js.native
  def isDisclosed(): Boolean = js.native
  @JSName("setLabelHalign")
  def setLabelHalign_center(halign: center): Unit = js.native
  @JSName("setLabelHalign")
  def setLabelHalign_left(halign: left): Unit = js.native
  @JSName("setLabelHalign")
  def setLabelHalign_right(halign: right): Unit = js.native
  def setLabelPosition(pos: AnonY): Unit = js.native
  def setLabelRotationAngle(angle: Double): Unit = js.native
  def setLabelRotationPoint(point: AnonY): Unit = js.native
  @JSName("setLabelValign")
  def setLabelValign_baseline(valign: baseline): Unit = js.native
  @JSName("setLabelValign")
  def setLabelValign_bottom(valign: bottom): Unit = js.native
  @JSName("setLabelValign")
  def setLabelValign_middle(valign: middle): Unit = js.native
  @JSName("setLabelValign")
  def setLabelValign_top(valign: top): Unit = js.native
  def setPosition(pos: AnonY): Unit = js.native
}

