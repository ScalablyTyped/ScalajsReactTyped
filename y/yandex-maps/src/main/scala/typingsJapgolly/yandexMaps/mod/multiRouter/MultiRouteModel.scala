package typingsJapgolly.yandexMaps.mod.multiRouter

import typingsJapgolly.yandexMaps.mod.IEventEmitter
import typingsJapgolly.yandexMaps.mod.IEventManager
import typingsJapgolly.yandexMaps.mod.IMultiRouteParams
import typingsJapgolly.yandexMaps.mod.IMultiRouteReferencePoint
import typingsJapgolly.yandexMaps.mod.data.Manager
import typingsJapgolly.yandexMaps.mod.multiRouter.driving.RouteModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yandex-maps", "multiRouter.MultiRouteModel")
@js.native
class MultiRouteModel protected () extends IEventEmitter {
  def this(referencePoints: js.Array[IMultiRouteReferencePoint]) = this()
  def this(referencePoints: js.Array[IMultiRouteReferencePoint], params: IMultiRouteParams) = this()
  /* CompleteClass */
  override var events: IEventManager = js.native
  var properties: Manager = js.native
  def destroy(): Unit = js.native
  def getAllPoints(): js.Array[WayPointModel | ViaPointModel] = js.native
  def getJson(): js.Object = js.native
  def getParams(): IMultiRouteParams = js.native
  def getPoints(): js.Array[WayPointModel | ViaPointModel] = js.native
  def getReferencePointIndexes(): js.Object = js.native
  def getReferencePoints(): js.Array[IMultiRouteReferencePoint] = js.native
  def getRoutes(): js.Array[RouteModel | typingsJapgolly.yandexMaps.mod.multiRouter.masstransit.RouteModel] = js.native
  def getViaPoints(): js.Array[ViaPointModel] = js.native
  def getWayPoints(): js.Array[WayPointModel] = js.native
  def setParams(params: IMultiRouteParams): Unit = js.native
  def setParams(params: IMultiRouteParams, extend: Boolean): Unit = js.native
  def setParams(params: IMultiRouteParams, extend: Boolean, clearRequests: Boolean): Unit = js.native
  def setReferencePoints(referencePoints: js.Array[IMultiRouteReferencePoint]): Unit = js.native
  def setReferencePoints(referencePoints: js.Array[IMultiRouteReferencePoint], viaIndexes: js.Array[Double]): Unit = js.native
  def setReferencePoints(
    referencePoints: js.Array[IMultiRouteReferencePoint],
    viaIndexes: js.Array[Double],
    clearRequests: Boolean
  ): Unit = js.native
}

