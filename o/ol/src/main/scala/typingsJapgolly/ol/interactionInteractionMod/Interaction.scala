package typingsJapgolly.ol.interactionInteractionMod

import typingsJapgolly.ol.eventsMod.EventsKey
import typingsJapgolly.ol.objectMod.ObjectEvent
import typingsJapgolly.ol.olStrings.changeColonactive
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Interaction
  extends typingsJapgolly.ol.objectMod.default {
  def getActive(): Boolean = js.native
  def getMap(): typingsJapgolly.ol.pluggableMapMod.default = js.native
  def handleEvent(mapBrowserEvent: typingsJapgolly.ol.mapBrowserEventMod.default): Boolean = js.native
  @JSName("on")
  def on_changeactive(`type`: changeColonactive, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("once")
  def once_changeactive(`type`: changeColonactive, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  def setActive(active: Boolean): Unit = js.native
  def setMap(map: typingsJapgolly.ol.pluggableMapMod.default): Unit = js.native
  @JSName("un")
  def un_changeactive(`type`: changeColonactive, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
}

