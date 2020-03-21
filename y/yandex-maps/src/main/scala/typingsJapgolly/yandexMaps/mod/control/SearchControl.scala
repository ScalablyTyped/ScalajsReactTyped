package typingsJapgolly.yandexMaps.mod.control

import typingsJapgolly.yandexMaps.mod.IChild
import typingsJapgolly.yandexMaps.mod.IControlParent
import typingsJapgolly.yandexMaps.mod.IEventManager
import typingsJapgolly.yandexMaps.mod.IOptionManager
import typingsJapgolly.yandexMaps.mod.Map_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typingsJapgolly.yandexMaps.mod.IEventEmitter because Already inherited
- typingsJapgolly.yandexMaps.mod.ICustomizable because var conflicts: events. Inlined options */ @JSImport("yandex-maps", "control.SearchControl")
@js.native
class SearchControl () extends IChild[IControlParent] {
  def this(parameters: ISearchControlParameters) = this()
  /* CompleteClass */
  override var events: IEventManager = js.native
  var options: IOptionManager = js.native
  var state: typingsJapgolly.yandexMaps.mod.data.Manager = js.native
  def clear(): Unit = js.native
  def getMap(): Map_ = js.native
  def getRequestString(): String = js.native
  def getResponseMetaData(): js.Object = js.native
  def getResult(index: Double): js.Promise[js.Object] = js.native
  def getResultsArray(): js.Array[js.Object] = js.native
  def getResultsCount(): Double = js.native
  def getSelectedIndex(): Double = js.native
  def hideResult(): Unit = js.native
  def search(request: String): js.Promise[Unit] = js.native
  def setParent(parent: IControlParent): this.type = js.native
  def showResult(index: Double): this.type = js.native
}

