package typingsJapgolly.yandexMaps.mod.control

import typingsJapgolly.yandexMaps.mod.IControlParent
import typingsJapgolly.yandexMaps.mod.IEventManager
import typingsJapgolly.yandexMaps.mod.IOptionManager
import typingsJapgolly.yandexMaps.mod.ISelectableControl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typingsJapgolly.yandexMaps.mod.IEventEmitter because Already inherited
- typingsJapgolly.yandexMaps.mod.ICustomizable because var conflicts: events. Inlined options */ @JSImport("yandex-maps", "control.Button")
@js.native
class Button () extends ISelectableControl {
  def this(parameters: String) = this()
  def this(parameters: IButtonParameters) = this()
  var data: typingsJapgolly.yandexMaps.mod.data.Manager = js.native
  /* CompleteClass */
  override var events: IEventManager = js.native
  var options: IOptionManager = js.native
  var state: typingsJapgolly.yandexMaps.mod.data.Manager = js.native
  def setParent(parent: IControlParent): this.type = js.native
}

