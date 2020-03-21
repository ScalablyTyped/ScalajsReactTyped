package typingsJapgolly.yandexMaps.mod.behavior

import typingsJapgolly.yandexMaps.mod.IBehavior
import typingsJapgolly.yandexMaps.mod.IControlParent
import typingsJapgolly.yandexMaps.mod.IEventManager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yandex-maps", "behavior.RightMouseButtonMagnifier")
@js.native
class RightMouseButtonMagnifier () extends IBehavior {
  def this(options: IRightMouseButtonMagnifierOptions) = this()
  /* CompleteClass */
  override var events: IEventManager = js.native
  def setParent(parent: IControlParent): this.type = js.native
}

