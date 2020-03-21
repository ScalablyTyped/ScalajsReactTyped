package typingsJapgolly.ol.layerLayerMod

import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.ol.eventsMod.EventsKey
import typingsJapgolly.ol.objectMod.ObjectEvent
import typingsJapgolly.ol.olStrings.changeColonsource
import typingsJapgolly.ol.olStrings.postrender
import typingsJapgolly.ol.olStrings.prerender
import typingsJapgolly.ol.pixelMod.Pixel
import typingsJapgolly.ol.pluggableMapMod.FrameState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Layer[SourceType /* <: typingsJapgolly.ol.sourceSourceMod.default */]
  extends typingsJapgolly.ol.baseMod.default {
  /* protected */ def createRenderer(): typingsJapgolly.ol.rendererLayerMod.default[Layer[typingsJapgolly.ol.sourceSourceMod.default]] = js.native
  def getFeatures(pixel: Pixel): js.Promise[
    js.Array[typingsJapgolly.ol.olFeatureMod.default[typingsJapgolly.ol.geometryMod.default]]
  ] = js.native
  def getRenderer(): typingsJapgolly.ol.rendererLayerMod.default[Layer[typingsJapgolly.ol.sourceSourceMod.default]] = js.native
  def getSource(): SourceType = js.native
  def hasRenderer(): Boolean = js.native
  @JSName("on")
  def on_changesource(`type`: changeColonsource, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("on")
  def on_postrender(
    `type`: postrender,
    listener: js.Function1[/* evt */ typingsJapgolly.ol.renderEventMod.default, Unit]
  ): EventsKey = js.native
  @JSName("on")
  def on_prerender(
    `type`: prerender,
    listener: js.Function1[/* evt */ typingsJapgolly.ol.renderEventMod.default, Unit]
  ): EventsKey = js.native
  @JSName("once")
  def once_changesource(`type`: changeColonsource, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("once")
  def once_postrender(
    `type`: postrender,
    listener: js.Function1[/* evt */ typingsJapgolly.ol.renderEventMod.default, Unit]
  ): EventsKey = js.native
  @JSName("once")
  def once_prerender(
    `type`: prerender,
    listener: js.Function1[/* evt */ typingsJapgolly.ol.renderEventMod.default, Unit]
  ): EventsKey = js.native
  def render(frameState: FrameState, target: HTMLElement): HTMLElement = js.native
  def setMap(map: typingsJapgolly.ol.pluggableMapMod.default): Unit = js.native
  def setSource(source: SourceType): Unit = js.native
  @JSName("un")
  def un_changesource(`type`: changeColonsource, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
  @JSName("un")
  def un_postrender(
    `type`: postrender,
    listener: js.Function1[/* evt */ typingsJapgolly.ol.renderEventMod.default, Unit]
  ): Unit = js.native
  @JSName("un")
  def un_prerender(
    `type`: prerender,
    listener: js.Function1[/* evt */ typingsJapgolly.ol.renderEventMod.default, Unit]
  ): Unit = js.native
}

