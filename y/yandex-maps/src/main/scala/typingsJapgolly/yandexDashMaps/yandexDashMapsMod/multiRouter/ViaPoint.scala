package typingsJapgolly.yandexDashMaps.yandexDashMapsMod.multiRouter

import typingsJapgolly.yandexDashMaps.yandexDashMapsMod.IEventManager
import typingsJapgolly.yandexDashMaps.yandexDashMapsMod.IGeoObject
import typingsJapgolly.yandexDashMaps.yandexDashMapsMod.Map
import typingsJapgolly.yandexDashMaps.yandexDashMapsMod.data.Manager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yandex-maps", "multiRouter.ViaPoint")
@js.native
class ViaPoint () extends IGeoObject {
  /* CompleteClass */
  override var events: IEventManager = js.native
  @JSName("properties")
  var properties_ViaPoint: Manager = js.native
  /* CompleteClass */
  override def getMap(): Map = js.native
}

