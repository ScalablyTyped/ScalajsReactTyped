package typingsJapgolly.ol.groupMod

import typingsJapgolly.ol.eventsMod.EventsKey
import typingsJapgolly.ol.objectMod.ObjectEvent
import typingsJapgolly.ol.olStrings.changeColonlayers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LayerGroup
  extends typingsJapgolly.ol.baseMod.default {
  def getLayers(): typingsJapgolly.ol.collectionMod.default[typingsJapgolly.ol.baseMod.default] = js.native
  @JSName("on")
  def on_changelayers(`type`: changeColonlayers, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("once")
  def once_changelayers(`type`: changeColonlayers, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  def setLayers(layers: typingsJapgolly.ol.collectionMod.default[typingsJapgolly.ol.baseMod.default]): Unit = js.native
  @JSName("un")
  def un_changelayers(`type`: changeColonlayers, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
}

