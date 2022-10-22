package typingsJapgolly.yandexMaps.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsJapgolly.yandexMaps.mod.IEventEmitter because var conflicts: events. Inlined 
- typingsJapgolly.yandexMaps.mod.ICustomizable because var conflicts: events. Inlined options
- typingsJapgolly.yandexMaps.mod.IBaseGeometry because var conflicts: events. Inlined getBounds, getType
- typingsJapgolly.yandexMaps.mod.IGeometry because var conflicts: events. Inlined getMap, getPixelGeometry, getPixelGeometry, setMap */ @js.native
trait ICircleGeometry
  extends StObject
     with ICircleGeometryAccess {
  
  def getBounds(): js.Array[js.Array[Double]] | Null = js.native
  
  def getMap(): Map_ | Null = js.native
  
  def getPixelGeometry(): IPixelGeometry = js.native
  def getPixelGeometry(options: js.Object): IPixelGeometry = js.native
  
  def getType(): String = js.native
  
  var options: IOptionManager = js.native
  
  def setMap(map: Map_): Unit = js.native
}
