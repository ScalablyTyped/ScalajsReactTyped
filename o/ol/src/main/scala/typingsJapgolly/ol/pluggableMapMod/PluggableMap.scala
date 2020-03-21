package typingsJapgolly.ol.pluggableMapMod

import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.ol.coordinateMod.Coordinate
import typingsJapgolly.ol.eventsMod.EventsKey
import typingsJapgolly.ol.objectMod.ObjectEvent
import typingsJapgolly.ol.olFeatureMod.FeatureLike
import typingsJapgolly.ol.olStrings.changeColonlayerGroup
import typingsJapgolly.ol.olStrings.changeColonsize
import typingsJapgolly.ol.olStrings.changeColontarget
import typingsJapgolly.ol.olStrings.changeColonview
import typingsJapgolly.ol.olStrings.click
import typingsJapgolly.ol.olStrings.dblclick
import typingsJapgolly.ol.olStrings.moveend
import typingsJapgolly.ol.olStrings.movestart
import typingsJapgolly.ol.olStrings.pointerdrag
import typingsJapgolly.ol.olStrings.pointermove
import typingsJapgolly.ol.olStrings.postcompose
import typingsJapgolly.ol.olStrings.postrender
import typingsJapgolly.ol.olStrings.precompose
import typingsJapgolly.ol.olStrings.rendercomplete
import typingsJapgolly.ol.olStrings.singleclick
import typingsJapgolly.ol.pixelMod.Pixel
import typingsJapgolly.ol.sizeMod.Size
import typingsJapgolly.std.Event_
import typingsJapgolly.std.TouchEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PluggableMap
  extends typingsJapgolly.ol.objectMod.default {
  var controls: typingsJapgolly.ol.collectionMod.default[typingsJapgolly.ol.controlControlMod.default] = js.native
  var interactions: typingsJapgolly.ol.collectionMod.default[typingsJapgolly.ol.interactionInteractionMod.default] = js.native
  def addControl(control: typingsJapgolly.ol.controlControlMod.default): Unit = js.native
  def addInteraction(interaction: typingsJapgolly.ol.interactionInteractionMod.default): Unit = js.native
  def addLayer(layer: typingsJapgolly.ol.baseMod.default): Unit = js.native
  def addOverlay(overlay: typingsJapgolly.ol.overlayMod.default): Unit = js.native
  def createRenderer(): typingsJapgolly.ol.mapMod.default = js.native
  def forEachFeatureAtPixel[S, T](
    pixel: Pixel,
    callback: js.ThisFunction2[
      /* this */ S, 
      /* p0 */ FeatureLike, 
      /* p1 */ typingsJapgolly.ol.layerLayerMod.default[typingsJapgolly.ol.sourceSourceMod.default], 
      T
    ]
  ): T = js.native
  def forEachFeatureAtPixel[S, T](
    pixel: Pixel,
    callback: js.ThisFunction2[
      /* this */ S, 
      /* p0 */ FeatureLike, 
      /* p1 */ typingsJapgolly.ol.layerLayerMod.default[typingsJapgolly.ol.sourceSourceMod.default], 
      T
    ],
    opt_options: AtPixelOptions
  ): T = js.native
  def forEachLayerAtPixel[S, T](
    pixel: Pixel,
    callback: js.ThisFunction2[
      /* this */ S, 
      /* p0 */ typingsJapgolly.ol.layerLayerMod.default[typingsJapgolly.ol.sourceSourceMod.default], 
      /* p1 */ scala.scalajs.js.typedarray.Uint8ClampedArray | scala.scalajs.js.typedarray.Uint8Array, 
      T
    ]
  ): T = js.native
  def forEachLayerAtPixel[S, T](
    pixel: Pixel,
    callback: js.ThisFunction2[
      /* this */ S, 
      /* p0 */ typingsJapgolly.ol.layerLayerMod.default[typingsJapgolly.ol.sourceSourceMod.default], 
      /* p1 */ scala.scalajs.js.typedarray.Uint8ClampedArray | scala.scalajs.js.typedarray.Uint8Array, 
      T
    ],
    opt_options: AtPixelOptions
  ): T = js.native
  def getControls(): typingsJapgolly.ol.collectionMod.default[typingsJapgolly.ol.controlControlMod.default] = js.native
  def getCoordinateFromPixel(pixel: Pixel): Coordinate = js.native
  def getCoordinateFromPixelInternal(pixel: Pixel): Coordinate = js.native
  def getEventCoordinate(event: Event_): Coordinate = js.native
  def getEventCoordinateInternal(event: Event_): Coordinate = js.native
  def getEventPixel(event: Event_): Pixel = js.native
  def getEventPixel(event: TouchEvent): Pixel = js.native
  def getFeaturesAtPixel(pixel: Pixel): js.Array[FeatureLike] = js.native
  def getFeaturesAtPixel(pixel: Pixel, opt_options: AtPixelOptions): js.Array[FeatureLike] = js.native
  def getInteractions(): typingsJapgolly.ol.collectionMod.default[typingsJapgolly.ol.interactionInteractionMod.default] = js.native
  def getLayerGroup(): typingsJapgolly.ol.groupMod.default = js.native
  def getLayers(): typingsJapgolly.ol.collectionMod.default[typingsJapgolly.ol.baseMod.default] = js.native
  def getLoading(): Boolean = js.native
  def getOverlayById(id: String): typingsJapgolly.ol.overlayMod.default = js.native
  def getOverlayById(id: Double): typingsJapgolly.ol.overlayMod.default = js.native
  def getOverlayContainer(): HTMLElement = js.native
  def getOverlayContainerStopEvent(): HTMLElement = js.native
  def getOverlays(): typingsJapgolly.ol.collectionMod.default[typingsJapgolly.ol.overlayMod.default] = js.native
  def getPixelFromCoordinate(coordinate: Coordinate): Pixel = js.native
  def getPixelFromCoordinateInternal(coordinate: Coordinate): Pixel = js.native
  def getRenderer(): typingsJapgolly.ol.mapMod.default = js.native
  def getSize(): Size = js.native
  def getTarget(): HTMLElement | String = js.native
  def getTargetElement(): HTMLElement = js.native
  def getTilePriority(
    tile: typingsJapgolly.ol.olTileMod.default,
    tileSourceKey: String,
    tileCenter: Coordinate,
    tileResolution: Double
  ): Double = js.native
  def getView(): typingsJapgolly.ol.viewMod.default = js.native
  def getViewport(): HTMLElement = js.native
  def handleBrowserEvent(browserEvent: Event_): Unit = js.native
  def handleBrowserEvent(browserEvent: Event_, opt_type: String): Unit = js.native
  def handleMapBrowserEvent(mapBrowserEvent: typingsJapgolly.ol.mapBrowserEventMod.default): Unit = js.native
  /* protected */ def handlePostRender(): Unit = js.native
  def hasFeatureAtPixel(pixel: Pixel): Boolean = js.native
  def hasFeatureAtPixel(pixel: Pixel, opt_options: AtPixelOptions): Boolean = js.native
  def isRendered(): Boolean = js.native
  @JSName("on")
  def on_changelayerGroup(`type`: changeColonlayerGroup, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("on")
  def on_changesize(`type`: changeColonsize, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("on")
  def on_changetarget(`type`: changeColontarget, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("on")
  def on_changeview(`type`: changeColonview, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("on")
  def on_click(
    `type`: click,
    listener: js.Function1[/* evt */ typingsJapgolly.ol.mapBrowserEventMod.default, Unit]
  ): EventsKey = js.native
  @JSName("on")
  def on_dblclick(
    `type`: dblclick,
    listener: js.Function1[/* evt */ typingsJapgolly.ol.mapBrowserEventMod.default, Unit]
  ): EventsKey = js.native
  @JSName("on")
  def on_moveend(`type`: moveend, listener: js.Function1[/* evt */ typingsJapgolly.ol.mapEventMod.default, Unit]): EventsKey = js.native
  @JSName("on")
  def on_movestart(`type`: movestart, listener: js.Function1[/* evt */ typingsJapgolly.ol.mapEventMod.default, Unit]): EventsKey = js.native
  @JSName("on")
  def on_pointerdrag(
    `type`: pointerdrag,
    listener: js.Function1[/* evt */ typingsJapgolly.ol.mapBrowserEventMod.default, Unit]
  ): EventsKey = js.native
  @JSName("on")
  def on_pointermove(
    `type`: pointermove,
    listener: js.Function1[/* evt */ typingsJapgolly.ol.mapBrowserEventMod.default, Unit]
  ): EventsKey = js.native
  @JSName("on")
  def on_postcompose(
    `type`: postcompose,
    listener: js.Function1[/* evt */ typingsJapgolly.ol.renderEventMod.default, Unit]
  ): EventsKey = js.native
  @JSName("on")
  def on_postrender(`type`: postrender, listener: js.Function1[/* evt */ typingsJapgolly.ol.mapEventMod.default, Unit]): EventsKey = js.native
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
  @JSName("on")
  def on_singleclick(
    `type`: singleclick,
    listener: js.Function1[/* evt */ typingsJapgolly.ol.mapBrowserEventMod.default, Unit]
  ): EventsKey = js.native
  @JSName("once")
  def once_changelayerGroup(`type`: changeColonlayerGroup, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("once")
  def once_changesize(`type`: changeColonsize, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("once")
  def once_changetarget(`type`: changeColontarget, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("once")
  def once_changeview(`type`: changeColonview, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("once")
  def once_click(
    `type`: click,
    listener: js.Function1[/* evt */ typingsJapgolly.ol.mapBrowserEventMod.default, Unit]
  ): EventsKey = js.native
  @JSName("once")
  def once_dblclick(
    `type`: dblclick,
    listener: js.Function1[/* evt */ typingsJapgolly.ol.mapBrowserEventMod.default, Unit]
  ): EventsKey = js.native
  @JSName("once")
  def once_moveend(`type`: moveend, listener: js.Function1[/* evt */ typingsJapgolly.ol.mapEventMod.default, Unit]): EventsKey = js.native
  @JSName("once")
  def once_movestart(`type`: movestart, listener: js.Function1[/* evt */ typingsJapgolly.ol.mapEventMod.default, Unit]): EventsKey = js.native
  @JSName("once")
  def once_pointerdrag(
    `type`: pointerdrag,
    listener: js.Function1[/* evt */ typingsJapgolly.ol.mapBrowserEventMod.default, Unit]
  ): EventsKey = js.native
  @JSName("once")
  def once_pointermove(
    `type`: pointermove,
    listener: js.Function1[/* evt */ typingsJapgolly.ol.mapBrowserEventMod.default, Unit]
  ): EventsKey = js.native
  @JSName("once")
  def once_postcompose(
    `type`: postcompose,
    listener: js.Function1[/* evt */ typingsJapgolly.ol.renderEventMod.default, Unit]
  ): EventsKey = js.native
  @JSName("once")
  def once_postrender(`type`: postrender, listener: js.Function1[/* evt */ typingsJapgolly.ol.mapEventMod.default, Unit]): EventsKey = js.native
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
  @JSName("once")
  def once_singleclick(
    `type`: singleclick,
    listener: js.Function1[/* evt */ typingsJapgolly.ol.mapBrowserEventMod.default, Unit]
  ): EventsKey = js.native
  def redrawText(): Unit = js.native
  def removeControl(control: typingsJapgolly.ol.controlControlMod.default): typingsJapgolly.ol.controlControlMod.default = js.native
  def removeInteraction(interaction: typingsJapgolly.ol.interactionInteractionMod.default): typingsJapgolly.ol.interactionInteractionMod.default = js.native
  def removeLayer(layer: typingsJapgolly.ol.baseMod.default): typingsJapgolly.ol.baseMod.default = js.native
  def removeOverlay(overlay: typingsJapgolly.ol.overlayMod.default): typingsJapgolly.ol.overlayMod.default = js.native
  def render(): Unit = js.native
  def renderSync(): Unit = js.native
  def setLayerGroup(layerGroup: typingsJapgolly.ol.groupMod.default): Unit = js.native
  def setSize(): Unit = js.native
  def setSize(size: Size): Unit = js.native
  def setTarget(): Unit = js.native
  def setTarget(target: String): Unit = js.native
  def setTarget(target: typingsJapgolly.std.HTMLElement): Unit = js.native
  def setView(view: typingsJapgolly.ol.viewMod.default): Unit = js.native
  @JSName("un")
  def un_changelayerGroup(`type`: changeColonlayerGroup, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
  @JSName("un")
  def un_changesize(`type`: changeColonsize, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
  @JSName("un")
  def un_changetarget(`type`: changeColontarget, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
  @JSName("un")
  def un_changeview(`type`: changeColonview, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
  @JSName("un")
  def un_click(
    `type`: click,
    listener: js.Function1[/* evt */ typingsJapgolly.ol.mapBrowserEventMod.default, Unit]
  ): Unit = js.native
  @JSName("un")
  def un_dblclick(
    `type`: dblclick,
    listener: js.Function1[/* evt */ typingsJapgolly.ol.mapBrowserEventMod.default, Unit]
  ): Unit = js.native
  @JSName("un")
  def un_moveend(`type`: moveend, listener: js.Function1[/* evt */ typingsJapgolly.ol.mapEventMod.default, Unit]): Unit = js.native
  @JSName("un")
  def un_movestart(`type`: movestart, listener: js.Function1[/* evt */ typingsJapgolly.ol.mapEventMod.default, Unit]): Unit = js.native
  @JSName("un")
  def un_pointerdrag(
    `type`: pointerdrag,
    listener: js.Function1[/* evt */ typingsJapgolly.ol.mapBrowserEventMod.default, Unit]
  ): Unit = js.native
  @JSName("un")
  def un_pointermove(
    `type`: pointermove,
    listener: js.Function1[/* evt */ typingsJapgolly.ol.mapBrowserEventMod.default, Unit]
  ): Unit = js.native
  @JSName("un")
  def un_postcompose(
    `type`: postcompose,
    listener: js.Function1[/* evt */ typingsJapgolly.ol.renderEventMod.default, Unit]
  ): Unit = js.native
  @JSName("un")
  def un_postrender(`type`: postrender, listener: js.Function1[/* evt */ typingsJapgolly.ol.mapEventMod.default, Unit]): Unit = js.native
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
  @JSName("un")
  def un_singleclick(
    `type`: singleclick,
    listener: js.Function1[/* evt */ typingsJapgolly.ol.mapBrowserEventMod.default, Unit]
  ): Unit = js.native
  def updateSize(): Unit = js.native
}

