package typingsJapgolly.yandexMaps.mod.behavior

import typingsJapgolly.yandexMaps.mod.IBehavior
import typingsJapgolly.yandexMaps.mod.IControlParent
import typingsJapgolly.yandexMaps.mod.IEventManager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yandex-maps", "behavior.DblClickZoom")
@js.native
class DblClickZoom () extends IBehavior {
  def this(options: IDblClickZoomOptions) = this()
  /* CompleteClass */
  override var events: IEventManager = js.native
  def setParent(parent: IControlParent): this.type = js.native
}

