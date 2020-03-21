package typingsJapgolly.yandexMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typingsJapgolly.yandexMaps.mod.IEventEmitter because Already inherited
- typingsJapgolly.yandexMaps.mod.ICustomizable because var conflicts: events. Inlined options */ @js.native
trait IGeometry extends IBaseGeometry {
  var options: IOptionManager = js.native
  def getMap(): Map_ | Null = js.native
  def getPixelGeometry(): IPixelGeometry = js.native
  def getPixelGeometry(options: js.Object): IPixelGeometry = js.native
  def setMap(map: Map_): Unit = js.native
}

