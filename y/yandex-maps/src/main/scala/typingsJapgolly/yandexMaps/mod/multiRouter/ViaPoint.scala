package typingsJapgolly.yandexMaps.mod.multiRouter

import typingsJapgolly.yandexMaps.mod.IEventManager
import typingsJapgolly.yandexMaps.mod.IGeoObject
import typingsJapgolly.yandexMaps.mod.Map_
import typingsJapgolly.yandexMaps.mod.data.Manager
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
  override def getMap(): Map_ = js.native
}

