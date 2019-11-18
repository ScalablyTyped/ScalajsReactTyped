package typingsJapgolly.yandexDashMaps.yandexDashMapsMod.multiRouter

import typingsJapgolly.yandexDashMaps.Anon_ActiveRouteAutoSelection
import typingsJapgolly.yandexDashMaps.yandexDashMapsMod.GeoObjectCollection
import typingsJapgolly.yandexDashMaps.yandexDashMapsMod.IEventManager
import typingsJapgolly.yandexDashMaps.yandexDashMapsMod.IGeoObject
import typingsJapgolly.yandexDashMaps.yandexDashMapsMod.IMultiRouteModelJson
import typingsJapgolly.yandexDashMaps.yandexDashMapsMod.Map
import typingsJapgolly.yandexDashMaps.yandexDashMapsMod.multiRouter.driving.Route
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yandex-maps", "multiRouter.MultiRoute")
@js.native
class MultiRoute protected () extends IGeoObject {
  def this(model: IMultiRouteModelJson) = this()
  def this(model: MultiRouteModel) = this()
  def this(model: IMultiRouteModelJson, options: Anon_ActiveRouteAutoSelection) = this()
  def this(model: MultiRouteModel, options: Anon_ActiveRouteAutoSelection) = this()
  var editor: EditorAddon = js.native
  /* CompleteClass */
  override var events: IEventManager = js.native
  var model: MultiRouteModel = js.native
  def getActiveRoute(): Route | typingsJapgolly.yandexDashMaps.yandexDashMapsMod.multiRouter.masstransit.Route | Null = js.native
  def getBounds(): js.Array[js.Array[Double]] | Null = js.native
  /* CompleteClass */
  override def getMap(): Map = js.native
  def getPixelBounds(): js.Array[js.Array[Double]] | Null = js.native
  def getRoutes(): GeoObjectCollection = js.native
  def getViaPoints(): GeoObjectCollection = js.native
  def getWayPoints(): GeoObjectCollection = js.native
  def setActiveRoute(): Unit = js.native
  def setActiveRoute(route: Route): Unit = js.native
  def setActiveRoute(route: typingsJapgolly.yandexDashMaps.yandexDashMapsMod.multiRouter.masstransit.Route): Unit = js.native
}

