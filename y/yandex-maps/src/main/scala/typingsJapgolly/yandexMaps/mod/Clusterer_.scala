package typingsJapgolly.yandexMaps.mod

import typingsJapgolly.yandexMaps.mod.clusterer.Hint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typingsJapgolly.yandexMaps.mod.IEventEmitter because Already inherited
- typingsJapgolly.yandexMaps.mod.ICustomizable because var conflicts: events. Inlined options */ @JSImport("yandex-maps", "Clusterer")
@js.native
class Clusterer_ ()
  extends IChild[IControlParent]
     with IParentOnMap {
  def this(options: IClustererOptions) = this()
  var balloon: typingsJapgolly.yandexMaps.mod.clusterer.Balloon = js.native
  /* CompleteClass */
  override var events: IEventManager = js.native
  // 	balloonopen:
  var hint: Hint = js.native
  var options: IOptionManager = js.native
  /* CompleteClass */
  override def getMap(): Map_ = js.native
  def setParent(parent: IControlParent): this.type = js.native
}

