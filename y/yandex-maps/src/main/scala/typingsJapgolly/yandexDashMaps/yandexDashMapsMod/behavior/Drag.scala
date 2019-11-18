package typingsJapgolly.yandexDashMaps.yandexDashMapsMod.behavior

import typingsJapgolly.yandexDashMaps.yandexDashMapsMod.IBehavior
import typingsJapgolly.yandexDashMaps.yandexDashMapsMod.IControlParent
import typingsJapgolly.yandexDashMaps.yandexDashMapsMod.IEventManager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yandex-maps", "behavior.Drag")
@js.native
class Drag () extends IBehavior {
  def this(options: IDragOptions) = this()
  /* CompleteClass */
  override var events: IEventManager = js.native
  def setParent(parent: IControlParent): this.type = js.native
}

