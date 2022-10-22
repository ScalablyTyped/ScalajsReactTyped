package typingsJapgolly.bmapgl.global.BMapGL

import typingsJapgolly.bmapgl.BMapGL.Copyright
import typingsJapgolly.bmapgl.BMapGL.TrafficLayerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BMapGL.TrafficLayer")
@js.native
open class TrafficLayer ()
  extends StObject
     with typingsJapgolly.bmapgl.BMapGL.TileLayer {
  def this(opts: TrafficLayerOptions) = this()
  
  /* CompleteClass */
  override def getCopyright(): Copyright = js.native
  
  /* CompleteClass */
  override def getTilesUrl(tileCoord: typingsJapgolly.bmapgl.BMapGL.Pixel, zoom: Double): String = js.native
  
  /* CompleteClass */
  override def isTransparentPng(): Boolean = js.native
}
