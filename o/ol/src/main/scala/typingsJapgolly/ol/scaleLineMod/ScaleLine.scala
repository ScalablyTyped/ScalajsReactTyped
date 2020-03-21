package typingsJapgolly.ol.scaleLineMod

import typingsJapgolly.ol.eventsMod.EventsKey
import typingsJapgolly.ol.objectMod.ObjectEvent
import typingsJapgolly.ol.olStrings.changeColonunits
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScaleLine
  extends typingsJapgolly.ol.controlControlMod.default {
  def createMarker(position: String, i: Double): String = js.native
  def createStepText(i: Double, width: Double, isLast: Boolean, scale: Double, suffix: String): String = js.native
  def getScaleForResolution(): Double = js.native
  def getUnits(): Units = js.native
  @JSName("on")
  def on_changeunits(`type`: changeColonunits, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("once")
  def once_changeunits(`type`: changeColonunits, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  def setUnits(units: Units): Unit = js.native
  @JSName("un")
  def un_changeunits(`type`: changeColonunits, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
}

