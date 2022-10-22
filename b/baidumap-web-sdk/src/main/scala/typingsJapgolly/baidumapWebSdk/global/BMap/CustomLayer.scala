package typingsJapgolly.baidumapWebSdk.global.BMap

import typingsJapgolly.baidumapWebSdk.BMap.Copyright
import typingsJapgolly.baidumapWebSdk.BMap.CustomLayerOptions
import typingsJapgolly.baidumapWebSdk.anon.Content
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BMap.CustomLayer")
@js.native
open class CustomLayer protected ()
  extends StObject
     with typingsJapgolly.baidumapWebSdk.BMap.CustomLayer {
  def this(opts: CustomLayerOptions) = this()
  
  /* CompleteClass */
  override def getCopyright(): Copyright = js.native
  
  /* CompleteClass */
  override def getTilesUrl(tileCoord: typingsJapgolly.baidumapWebSdk.BMap.Pixel, zoom: Double): String = js.native
  
  /* CompleteClass */
  override def isTransparentPng(): Boolean = js.native
  
  /* CompleteClass */
  override def onhotspotclick(event: Content): Unit = js.native
}
