package typingsJapgolly.yandexMaps.mod

import typingsJapgolly.yandexMaps.anon.Children
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsJapgolly.yandexMaps.mod.IEventEmitter because Already inherited
- typingsJapgolly.yandexMaps.mod.IParentOnMap because Already inherited
- typingsJapgolly.yandexMaps.mod.ICustomizable because Already inherited
- typingsJapgolly.yandexMaps.mod.IGeoObjectCollection because var conflicts: events, options. Inlined add, add, each, each, get, getBounds, getIterator, getLength, getPixelBounds, indexOf, remove, removeAll, set, splice */ @JSImport("yandex-maps", "GeoObjectCollection")
@js.native
open class GeoObjectCollection ()
  extends StObject
     with IGeoObject[IGeometry] {
  def this(feature: Children) = this()
  def this(feature: Unit, options: js.Object) = this()
  def this(feature: Children, options: js.Object) = this()
  
  def add(child: IGeoObject[IGeometry]): this.type = js.native
  def add(child: IGeoObject[IGeometry], index: Double): this.type = js.native
  
  def each(callback: js.Function1[/* object */ IGeoObject[IGeometry], Unit]): Unit = js.native
  def each(callback: js.Function1[/* object */ IGeoObject[IGeometry], Unit], context: js.Object): Unit = js.native
  
  /* CompleteClass */
  var events: IEventManager[js.Object] = js.native
  
  def get(index: Double): IGeoObject[IGeometry] = js.native
  
  def getBounds(): js.Array[js.Array[Double]] | Null = js.native
  
  def getIterator(): IIterator = js.native
  
  def getLength(): Double = js.native
  
  /* CompleteClass */
  override def getMap(): Map_ = js.native
  
  def getPixelBounds(): js.Array[js.Array[Double]] | Null = js.native
  
  def indexOf(`object`: IGeoObject[IGeometry]): Double = js.native
  
  def remove(child: IGeoObject[IGeometry]): this.type = js.native
  
  def removeAll(): this.type = js.native
  
  def set(index: Double, child: IGeoObject[IGeometry]): this.type = js.native
  
  def setParent(parent: IControlParent): this.type = js.native
  
  def splice(index: Double, length: Double): this.type = js.native
  
  def toArray(): js.Array[IGeoObject[IGeometry]] = js.native
}
