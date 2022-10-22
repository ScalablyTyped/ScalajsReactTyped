package typingsJapgolly.baidumapWebSdk.global.BMap

import typingsJapgolly.baidumapWebSdk.BMap.GroundOverlayOptions
import typingsJapgolly.baidumapWebSdk.anon.Target
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BMap.GroundOverlay")
@js.native
open class GroundOverlay protected ()
  extends StObject
     with typingsJapgolly.baidumapWebSdk.BMap.GroundOverlay {
  def this(bounds: typingsJapgolly.baidumapWebSdk.BMap.Bounds) = this()
  def this(bounds: typingsJapgolly.baidumapWebSdk.BMap.Bounds, opts: GroundOverlayOptions) = this()
  
  /* CompleteClass */
  override def getBounds(): typingsJapgolly.baidumapWebSdk.BMap.Bounds = js.native
  
  /* CompleteClass */
  override def getDispalyOnMaxLevel(): Double = js.native
  
  /* CompleteClass */
  override def getDisplayOnMinLevel(): Double = js.native
  
  /* CompleteClass */
  override def getImageURL(): String = js.native
  
  /* CompleteClass */
  override def getOpacity(): Double = js.native
  
  /* CompleteClass */
  override def onclick(event: Target): Unit = js.native
  
  /* CompleteClass */
  override def ondblclick(event: Target): Unit = js.native
  
  /* CompleteClass */
  override def setBounds(bounds: typingsJapgolly.baidumapWebSdk.BMap.Bounds): Unit = js.native
  
  /* CompleteClass */
  override def setDispalyOnMaxLevel(level: Double): Unit = js.native
  
  /* CompleteClass */
  override def setDisplayOnMinLevel(level: Double): Unit = js.native
  
  /* CompleteClass */
  override def setImageURL(url: String): Unit = js.native
  
  /* CompleteClass */
  override def setOpacity(opcity: Double): Unit = js.native
}
