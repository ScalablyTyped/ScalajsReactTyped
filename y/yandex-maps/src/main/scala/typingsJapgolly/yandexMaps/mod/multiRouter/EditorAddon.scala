package typingsJapgolly.yandexMaps.mod.multiRouter

import typingsJapgolly.yandexMaps.mod.ICustomizable
import typingsJapgolly.yandexMaps.mod.IEventManager
import typingsJapgolly.yandexMaps.mod.IOptionManager
import typingsJapgolly.yandexMaps.mod.data.Manager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yandex-maps", "multiRouter.EditorAddon")
@js.native
class EditorAddon () extends ICustomizable {
  /* CompleteClass */
  override var events: IEventManager = js.native
  /* CompleteClass */
  override var options: IOptionManager = js.native
  var state: Manager = js.native
  def isActive(): Boolean = js.native
  def start(state: js.Object): Unit = js.native
  def stop(): Unit = js.native
}

