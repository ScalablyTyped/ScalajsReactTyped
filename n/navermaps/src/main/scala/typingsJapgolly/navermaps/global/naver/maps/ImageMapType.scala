package typingsJapgolly.navermaps.global.naver.maps

import org.scalajs.dom.HTMLElement
import typingsJapgolly.navermaps.naver.maps.ImageMapTypeOptions
import typingsJapgolly.navermaps.naver.maps.Projection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("naver.maps.ImageMapType")
@js.native
open class ImageMapType protected ()
  extends StObject
     with typingsJapgolly.navermaps.naver.maps.ImageMapType {
  def this(imageMapTypeOptions: ImageMapTypeOptions) = this()
  
  /* CompleteClass */
  override def getMapTypeOptions(): ImageMapTypeOptions = js.native
  
  /* CompleteClass */
  override def getMaxZoom(): Double = js.native
  
  /* CompleteClass */
  override def getMinZoom(): Double = js.native
  
  /* CompleteClass */
  override def getName(): String = js.native
  
  /* CompleteClass */
  override def getTile(x: Double, y: Double, z: Double): HTMLElement | typingsJapgolly.navermaps.naver.maps.Tile = js.native
  
  /* CompleteClass */
  override def getTileUrls(x: Double, y: Double, z: Double): js.Array[String] = js.native
  
  /* CompleteClass */
  var maxZoom: Double = js.native
  
  /* CompleteClass */
  var minZoom: Double = js.native
  
  /* CompleteClass */
  var name: String = js.native
  
  /* CompleteClass */
  var projection: Projection = js.native
  
  /* CompleteClass */
  override def setMapTypeOptions(imageMapTypeOptions: ImageMapTypeOptions): Unit = js.native
  
  /* CompleteClass */
  var tileSize: typingsJapgolly.navermaps.naver.maps.Size = js.native
}
