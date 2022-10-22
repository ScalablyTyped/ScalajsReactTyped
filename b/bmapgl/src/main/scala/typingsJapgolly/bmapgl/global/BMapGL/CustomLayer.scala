package typingsJapgolly.bmapgl.global.BMapGL

import typingsJapgolly.bmapgl.BMapGL.Copyright
import typingsJapgolly.bmapgl.BMapGL.CustomLayerOptions
import typingsJapgolly.bmapgl.anon.Content
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BMapGL.CustomLayer")
@js.native
open class CustomLayer protected ()
  extends StObject
     with typingsJapgolly.bmapgl.BMapGL.CustomLayer {
  def this(opts: CustomLayerOptions) = this()
  
  /* CompleteClass */
  override def getCopyright(): Copyright = js.native
  
  /* CompleteClass */
  override def getTilesUrl(tileCoord: typingsJapgolly.bmapgl.BMapGL.Pixel, zoom: Double): String = js.native
  
  /* CompleteClass */
  override def isTransparentPng(): Boolean = js.native
  
  /* CompleteClass */
  override def onhotspotclick(event: Content): Unit = js.native
}
