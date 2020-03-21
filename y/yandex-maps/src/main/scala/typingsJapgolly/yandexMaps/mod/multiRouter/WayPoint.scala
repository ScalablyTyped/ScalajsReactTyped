package typingsJapgolly.yandexMaps.mod.multiRouter

import typingsJapgolly.yandexMaps.mod.IEventManager
import typingsJapgolly.yandexMaps.mod.IGeoObject
import typingsJapgolly.yandexMaps.mod.Map_
import typingsJapgolly.yandexMaps.mod.data.Manager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yandex-maps", "multiRouter.WayPoint")
@js.native
class WayPoint () extends IGeoObject {
  /* CompleteClass */
  override var events: IEventManager = js.native
  var model: WayPointModel = js.native
  @JSName("properties")
  var properties_WayPoint: Manager = js.native
  /* CompleteClass */
  override def getMap(): Map_ = js.native
}

