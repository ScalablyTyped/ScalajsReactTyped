package typingsJapgolly.yandexMaps.mod

import typingsJapgolly.yandexMaps.mod.collection.Item
import typingsJapgolly.yandexMaps.mod.data.Manager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsJapgolly.yandexMaps.mod.IEventEmitter because Already inherited
- typingsJapgolly.yandexMaps.mod.IParentOnMap because Already inherited
- typingsJapgolly.yandexMaps.mod.ICustomizable because Already inherited
- typingsJapgolly.yandexMaps.mod.IChild because Already inherited
- typingsJapgolly.yandexMaps.mod.IGeoObject because var conflicts: events, options. Inlined geometry, properties, state, getOverlay, getOverlaySync */ @JSImport("yandex-maps", "ClusterPlacemark")
@js.native
open class ClusterPlacemark protected () extends Item {
  def this(geometry: js.Array[Double], properties: IClusterPlacemarkProperties) = this()
  def this(geometry: js.Object, properties: IClusterPlacemarkProperties) = this()
  def this(geometry: IPointGeometry, properties: IClusterPlacemarkProperties) = this()
  def this(
    geometry: js.Array[Double],
    properties: IClusterPlacemarkProperties,
    options: IClusterPlacemarkOptions
  ) = this()
  def this(geometry: js.Object, properties: IClusterPlacemarkProperties, options: IClusterPlacemarkOptions) = this()
  def this(
    geometry: IPointGeometry,
    properties: IClusterPlacemarkProperties,
    options: IClusterPlacemarkOptions
  ) = this()
  
  var geometry: IGeometry | Null = js.native
  
  def getBounds(): js.Array[js.Array[Double]] | Null = js.native
  
  def getGeoObjects(): js.Array[IGeoObject[IGeometry]] = js.native
  
  def getOverlay(): js.Promise[IOverlay | Null] = js.native
  
  def getOverlaySync(): IOverlay | Null = js.native
  
  var properties: IDataManager = js.native
  
  var state: IDataManager | Manager = js.native
}
