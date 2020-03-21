package typingsJapgolly.ol.webGLPointsMod

import typingsJapgolly.ol.eventsMod.EventsKey
import typingsJapgolly.ol.olStrings.postcompose
import typingsJapgolly.ol.olStrings.precompose
import typingsJapgolly.ol.olStrings.rendercomplete
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebGLPointsLayer
  extends typingsJapgolly.ol.layerLayerMod.default[typingsJapgolly.ol.sourceSourceMod.default] {
  @JSName("on")
  def on_postcompose(
    `type`: postcompose,
    listener: js.Function1[/* evt */ typingsJapgolly.ol.renderEventMod.default, Unit]
  ): EventsKey = js.native
  @JSName("on")
  def on_precompose(
    `type`: precompose,
    listener: js.Function1[/* evt */ typingsJapgolly.ol.renderEventMod.default, Unit]
  ): EventsKey = js.native
  @JSName("on")
  def on_rendercomplete(
    `type`: rendercomplete,
    listener: js.Function1[/* evt */ typingsJapgolly.ol.renderEventMod.default, Unit]
  ): EventsKey = js.native
  @JSName("once")
  def once_postcompose(
    `type`: postcompose,
    listener: js.Function1[/* evt */ typingsJapgolly.ol.renderEventMod.default, Unit]
  ): EventsKey = js.native
  @JSName("once")
  def once_precompose(
    `type`: precompose,
    listener: js.Function1[/* evt */ typingsJapgolly.ol.renderEventMod.default, Unit]
  ): EventsKey = js.native
  @JSName("once")
  def once_rendercomplete(
    `type`: rendercomplete,
    listener: js.Function1[/* evt */ typingsJapgolly.ol.renderEventMod.default, Unit]
  ): EventsKey = js.native
  @JSName("un")
  def un_postcompose(
    `type`: postcompose,
    listener: js.Function1[/* evt */ typingsJapgolly.ol.renderEventMod.default, Unit]
  ): Unit = js.native
  @JSName("un")
  def un_precompose(
    `type`: precompose,
    listener: js.Function1[/* evt */ typingsJapgolly.ol.renderEventMod.default, Unit]
  ): Unit = js.native
  @JSName("un")
  def un_rendercomplete(
    `type`: rendercomplete,
    listener: js.Function1[/* evt */ typingsJapgolly.ol.renderEventMod.default, Unit]
  ): Unit = js.native
}

