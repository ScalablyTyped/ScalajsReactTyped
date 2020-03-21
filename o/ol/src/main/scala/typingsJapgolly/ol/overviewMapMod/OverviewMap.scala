package typingsJapgolly.ol.overviewMapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OverviewMap
  extends typingsJapgolly.ol.controlControlMod.default {
  def getCollapsed(): Boolean = js.native
  def getCollapsible(): Boolean = js.native
  def getOverviewMap(): typingsJapgolly.ol.pluggableMapMod.default = js.native
  def getRotateWithView(): Boolean = js.native
  def setCollapsed(collapsed: Boolean): Unit = js.native
  def setCollapsible(collapsible: Boolean): Unit = js.native
  def setRotateWithView(rotateWithView: Boolean): Unit = js.native
}

