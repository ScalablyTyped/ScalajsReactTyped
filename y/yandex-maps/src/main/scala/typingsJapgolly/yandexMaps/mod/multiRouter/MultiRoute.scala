package typingsJapgolly.yandexMaps.mod.multiRouter

import typingsJapgolly.yandexMaps.AnonDictindex
import typingsJapgolly.yandexMaps.mod.GeoObjectCollection
import typingsJapgolly.yandexMaps.mod.IEventManager
import typingsJapgolly.yandexMaps.mod.IGeoObject
import typingsJapgolly.yandexMaps.mod.IMultiRouteModelJson
import typingsJapgolly.yandexMaps.mod.Map_
import typingsJapgolly.yandexMaps.mod.multiRouter.driving.Route
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yandex-maps", "multiRouter.MultiRoute")
@js.native
class MultiRoute protected () extends IGeoObject {
  def this(model: IMultiRouteModelJson) = this()
  def this(model: MultiRouteModel) = this()
  def this(model: IMultiRouteModelJson, options: AnonDictindex) = this()
  def this(model: MultiRouteModel, options: AnonDictindex) = this()
  var editor: EditorAddon = js.native
  /* CompleteClass */
  override var events: IEventManager = js.native
  var model: MultiRouteModel = js.native
  def getActiveRoute(): Route | typingsJapgolly.yandexMaps.mod.multiRouter.masstransit.Route | Null = js.native
  def getBounds(): js.Array[js.Array[Double]] | Null = js.native
  /* CompleteClass */
  override def getMap(): Map_ = js.native
  def getPixelBounds(): js.Array[js.Array[Double]] | Null = js.native
  def getRoutes(): GeoObjectCollection = js.native
  def getViaPoints(): GeoObjectCollection = js.native
  def getWayPoints(): GeoObjectCollection = js.native
  def setActiveRoute(): Unit = js.native
  def setActiveRoute(route: Route): Unit = js.native
  def setActiveRoute(route: typingsJapgolly.yandexMaps.mod.multiRouter.masstransit.Route): Unit = js.native
}

