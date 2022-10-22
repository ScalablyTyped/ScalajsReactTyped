package typingsJapgolly.yandexMaps.global.ymaps

import typingsJapgolly.yandexMaps.mod.IClusterPlacemarkOptions
import typingsJapgolly.yandexMaps.mod.IClusterPlacemarkProperties
import typingsJapgolly.yandexMaps.mod.IPointGeometry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("ymaps.ClusterPlacemark")
@js.native
open class ClusterPlacemark protected ()
  extends typingsJapgolly.yandexMaps.mod.ClusterPlacemark {
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
}
