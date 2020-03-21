package typingsJapgolly.ol.selectMod

import typingsJapgolly.ol.eventsMod.EventsKey
import typingsJapgolly.ol.olFeatureMod.FeatureLike
import typingsJapgolly.ol.olStrings.select
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Select
  extends typingsJapgolly.ol.interactionInteractionMod.default {
  def getFeatures(): typingsJapgolly.ol.collectionMod.default[typingsJapgolly.ol.olFeatureMod.default[typingsJapgolly.ol.geometryMod.default]] = js.native
  def getHitTolerance(): Double = js.native
  def getLayer(feature: FeatureLike): typingsJapgolly.ol.vectorMod.default = js.native
  @JSName("on")
  def on_select(`type`: select, listener: js.Function1[/* evt */ SelectEvent, Unit]): EventsKey = js.native
  @JSName("once")
  def once_select(`type`: select, listener: js.Function1[/* evt */ SelectEvent, Unit]): EventsKey = js.native
  def setHitTolerance(hitTolerance: Double): Unit = js.native
  @JSName("un")
  def un_select(`type`: select, listener: js.Function1[/* evt */ SelectEvent, Unit]): Unit = js.native
}

