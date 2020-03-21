package typingsJapgolly.yandexMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typingsJapgolly.yandexMaps.mod.IFreezable because var conflicts: events. Inlined freeze, isFrozen, unfreeze
- typingsJapgolly.yandexMaps.mod.ICircleGeometryAccess because var conflicts: events. Inlined contains, getClosest, getCoordinates, getRadius, setCoordinates, setCoordinates, setRadius */ @js.native
trait ICircleGeometry extends IGeometry {
  def contains(position: js.Array[Double]): Boolean = js.native
  def freeze(): IFreezable = js.native
  def getClosest(anchorPosition: js.Array[Double]): js.Object = js.native
  def getCoordinates(): js.Array[Double] | Null = js.native
  def getRadius(): Double = js.native
  def isFrozen(): Boolean = js.native
  def setCoordinates(): this.type = js.native
  def setCoordinates(coordinates: js.Array[Double]): this.type = js.native
  def setRadius(radius: Double): this.type = js.native
  def unfreeze(): IFreezable = js.native
}

