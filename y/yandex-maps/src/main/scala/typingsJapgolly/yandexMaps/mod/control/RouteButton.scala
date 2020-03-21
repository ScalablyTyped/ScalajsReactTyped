package typingsJapgolly.yandexMaps.mod.control

import typingsJapgolly.yandexMaps.mod.IChild
import typingsJapgolly.yandexMaps.mod.IControlParent
import typingsJapgolly.yandexMaps.mod.IEventManager
import typingsJapgolly.yandexMaps.mod.IOptionManager
import typingsJapgolly.yandexMaps.mod.IRoutePanel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typingsJapgolly.yandexMaps.mod.IEventEmitter because Already inherited
- typingsJapgolly.yandexMaps.mod.ICustomizable because var conflicts: events. Inlined options */ @JSImport("yandex-maps", "control.RouteButton")
@js.native
class RouteButton () extends IChild[IControlParent] {
  def this(parameters: IRouteButtonParameters) = this()
  /* CompleteClass */
  override var events: IEventManager = js.native
  var options: IOptionManager = js.native
  var routePanel: IRoutePanel = js.native
  def setParent(parent: IControlParent): this.type = js.native
}

