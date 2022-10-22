package typingsJapgolly.yandexMaps.mod

import org.scalajs.dom.HTMLElement
import typingsJapgolly.yandexMaps.mod.map.Container
import typingsJapgolly.yandexMaps.mod.map.Converter
import typingsJapgolly.yandexMaps.mod.map.Copyrights
import typingsJapgolly.yandexMaps.mod.map.GeoObjects
import typingsJapgolly.yandexMaps.mod.map.Hint
import typingsJapgolly.yandexMaps.mod.map.ZoomRange
import typingsJapgolly.yandexMaps.mod.map.action.Manager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("yandex-maps", "Map")
@js.native
open class Map_ protected ()
  extends StObject
     with IEventEmitter {
  def this(parentElement: String, state: IMapState) = this()
  def this(parentElement: HTMLElement, state: IMapState) = this()
  def this(parentElement: String, state: IMapState, options: IMapOptions) = this()
  def this(parentElement: HTMLElement, state: IMapState, options: IMapOptions) = this()
  
  var action: Manager = js.native
  
  var balloon: typingsJapgolly.yandexMaps.mod.map.Balloon = js.native
  
  var behaviors: typingsJapgolly.yandexMaps.mod.map.behavior.Manager = js.native
  
  var container: Container = js.native
  
  var controls: typingsJapgolly.yandexMaps.mod.control.Manager = js.native
  
  var converter: Converter = js.native
  
  var copyrights: Copyrights = js.native
  
  var cursors: typingsJapgolly.yandexMaps.mod.util.cursor.Manager = js.native
  
  def destroy(): Unit = js.native
  
  /* CompleteClass */
  var events: IEventManager[js.Object] = js.native
  @JSName("events")
  var events_Map_ : typingsJapgolly.yandexMaps.mod.event.Manager[js.Object] = js.native
  
  var geoObjects: GeoObjects = js.native
  
  def getBounds(): js.Array[js.Array[Double]] = js.native
  def getBounds(options: IMapMarginOptions): js.Array[js.Array[Double]] = js.native
  
  def getCenter(): js.Array[Double] = js.native
  def getCenter(options: IMapMarginOptions): js.Array[Double] = js.native
  
  def getGlobalPixelCenter(): js.Array[Double] = js.native
  def getGlobalPixelCenter(options: IMapMarginOptions): js.Array[Double] = js.native
  
  def getPanoramaManager(): js.Promise[typingsJapgolly.yandexMaps.mod.panorama.Manager] = js.native
  
  def getType(): String | MapType = js.native
  
  def getZoom(): Double = js.native
  
  var hint: Hint = js.native
  
  var layers: typingsJapgolly.yandexMaps.mod.map.layer.Manager = js.native
  
  var margin: typingsJapgolly.yandexMaps.mod.map.margin.Manager = js.native
  
  var options: typingsJapgolly.yandexMaps.mod.option.Manager = js.native
  
  def panTo(center: js.Array[Double | js.Object]): js.Promise[Unit] = js.native
  def panTo(center: js.Array[Double | js.Object], options: IMapPanOptions): js.Promise[Unit] = js.native
  
  var panes: typingsJapgolly.yandexMaps.mod.map.pane.Manager = js.native
  
  def setBounds(bounds: js.Array[js.Array[Double]]): js.Promise[Unit] = js.native
  def setBounds(bounds: js.Array[js.Array[Double]], options: IMapBoundsOptions): js.Promise[Unit] = js.native
  
  def setCenter(center: js.Array[Double]): js.Promise[Unit] = js.native
  def setCenter(center: js.Array[Double], zoom: Double): js.Promise[Unit] = js.native
  def setCenter(center: js.Array[Double], zoom: Double, options: IMapPositionOptions): js.Promise[Unit] = js.native
  def setCenter(center: js.Array[Double], zoom: Unit, options: IMapPositionOptions): js.Promise[Unit] = js.native
  
  def setGlobalPixelCenter(globalPixelCenter: js.Array[Double]): js.Promise[Unit] = js.native
  def setGlobalPixelCenter(globalPixelCenter: js.Array[Double], zoom: Double): js.Promise[Unit] = js.native
  def setGlobalPixelCenter(globalPixelCenter: js.Array[Double], zoom: Double, options: IMapPositionOptions): js.Promise[Unit] = js.native
  def setGlobalPixelCenter(globalPixelCenter: js.Array[Double], zoom: Unit, options: IMapPositionOptions): js.Promise[Unit] = js.native
  
  def setType(`type`: String): js.Promise[Unit] = js.native
  def setType(`type`: String, options: IMapCheckZoomRangeOptions): js.Promise[Unit] = js.native
  def setType(`type`: MapType): js.Promise[Unit] = js.native
  def setType(`type`: MapType, options: IMapCheckZoomRangeOptions): js.Promise[Unit] = js.native
  
  def setZoom(zoom: Double): js.Promise[Unit] = js.native
  def setZoom(zoom: Double, options: IMapZoomOptions): js.Promise[Unit] = js.native
  
  var zoomRange: ZoomRange = js.native
}
