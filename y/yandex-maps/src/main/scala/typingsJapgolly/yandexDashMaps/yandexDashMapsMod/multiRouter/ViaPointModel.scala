package typingsJapgolly.yandexDashMaps.yandexDashMapsMod.multiRouter

import typingsJapgolly.yandexDashMaps.yandexDashMapsMod.IEventEmitter
import typingsJapgolly.yandexDashMaps.yandexDashMapsMod.IEventManager
import typingsJapgolly.yandexDashMaps.yandexDashMapsMod.data.Manager
import typingsJapgolly.yandexDashMaps.yandexDashMapsMod.geometry.base.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yandex-maps", "multiRouter.ViaPointModel")
@js.native
class ViaPointModel () extends IEventEmitter {
  /* CompleteClass */
  override var events: IEventManager = js.native
  var geometry: Point = js.native
  var multiRoute: MultiRouteModel = js.native
  var properties: Manager = js.native
  def destroy(): Unit = js.native
  def getReferencePoint(): js.Object = js.native
  def getReferencePointIndex(): Double = js.native
  def setReferencePoint(referencePoint: js.Object): Unit = js.native
  def update(viaPointJson: js.Object): Unit = js.native
}

