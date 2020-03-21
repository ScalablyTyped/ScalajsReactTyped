package typingsJapgolly.yandexMaps.mod.behavior

import typingsJapgolly.yandexMaps.mod.IBehavior
import typingsJapgolly.yandexMaps.mod.IControlParent
import typingsJapgolly.yandexMaps.mod.IEventManager
import typingsJapgolly.yandexMaps.mod.router.Route
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yandex-maps", "behavior.RouteEditor")
@js.native
class RouteEditor () extends IBehavior {
  /* CompleteClass */
  override var events: IEventManager = js.native
  def getRoute(): Route = js.native
  def getState(): String = js.native
  def setParent(parent: IControlParent): this.type = js.native
  def setState(): Unit = js.native
  def setState(state: String): Unit = js.native
}

