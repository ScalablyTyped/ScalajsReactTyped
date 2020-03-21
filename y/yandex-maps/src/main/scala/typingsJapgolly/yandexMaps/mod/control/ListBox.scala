package typingsJapgolly.yandexMaps.mod.control

import typingsJapgolly.yandexMaps.mod.ICollection
import typingsJapgolly.yandexMaps.mod.IControlParent
import typingsJapgolly.yandexMaps.mod.IEventManager
import typingsJapgolly.yandexMaps.mod.IIterator
import typingsJapgolly.yandexMaps.mod.IOptionManager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typingsJapgolly.yandexMaps.mod.IEventEmitter because Already inherited
- typingsJapgolly.yandexMaps.mod.ICustomizable because var conflicts: events. Inlined options
- typingsJapgolly.yandexMaps.mod.IChild because var conflicts: events. Inlined getParent, setParent, setParent */ @JSImport("yandex-maps", "control.ListBox")
@js.native
class ListBox () extends ICollection {
  def this(parameters: IListBoxParameters) = this()
  var data: typingsJapgolly.yandexMaps.mod.data.Manager = js.native
  /* CompleteClass */
  override var events: IEventManager = js.native
  var options: IOptionManager = js.native
  var state: typingsJapgolly.yandexMaps.mod.data.Manager = js.native
  /* CompleteClass */
  override def add(`object`: js.Object): this.type = js.native
  /* CompleteClass */
  override def getIterator(): IIterator = js.native
  def getParent(): Null | IControlParent = js.native
  /* CompleteClass */
  override def remove(`object`: js.Object): this.type = js.native
  def setParent(): this.type = js.native
  def setParent(parent: js.Object): this.type = js.native
  def setParent(parent: IControlParent): this.type = js.native
}

