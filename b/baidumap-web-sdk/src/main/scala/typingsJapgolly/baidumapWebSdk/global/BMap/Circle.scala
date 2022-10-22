package typingsJapgolly.baidumapWebSdk.global.BMap

import typingsJapgolly.baidumapWebSdk.BMap.Callback
import typingsJapgolly.baidumapWebSdk.BMap.CircleOptions
import typingsJapgolly.baidumapWebSdk.anon.Target
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BMap.Circle")
@js.native
open class Circle protected ()
  extends StObject
     with typingsJapgolly.baidumapWebSdk.BMap.Circle {
  def this(center: typingsJapgolly.baidumapWebSdk.BMap.Point, radius: Double) = this()
  def this(center: typingsJapgolly.baidumapWebSdk.BMap.Point, radius: Double, opts: CircleOptions) = this()
  
  /* CompleteClass */
  override def addEventListener(event: String, handler: Callback): Unit = js.native
  
  /* CompleteClass */
  override def disableEditing(): Unit = js.native
  
  /* CompleteClass */
  override def disableMassClear(): Unit = js.native
  
  /* CompleteClass */
  override def enableEditing(): Unit = js.native
  
  /* CompleteClass */
  override def enableMassClear(): Unit = js.native
  
  /* CompleteClass */
  override def getBounds(): typingsJapgolly.baidumapWebSdk.BMap.Bounds = js.native
  
  /* CompleteClass */
  override def getCenter(): typingsJapgolly.baidumapWebSdk.BMap.Point = js.native
  
  /* CompleteClass */
  override def getFillColor(): String = js.native
  
  /* CompleteClass */
  override def getFillOpacity(): Double = js.native
  
  /* CompleteClass */
  override def getMap(): typingsJapgolly.baidumapWebSdk.BMap.Map = js.native
  
  /* CompleteClass */
  override def getRadius(): Double = js.native
  
  /* CompleteClass */
  override def getStrokeColor(): String = js.native
  
  /* CompleteClass */
  override def getStrokeOpacity(): Double = js.native
  
  /* CompleteClass */
  override def getStrokeStyle(): String = js.native
  
  /* CompleteClass */
  override def getStrokeWeight(): Double = js.native
  
  /* CompleteClass */
  override def onclick(event: Target): Unit = js.native
  
  /* CompleteClass */
  override def ondblclick(event: typingsJapgolly.baidumapWebSdk.anon.Pixel): Unit = js.native
  
  /* CompleteClass */
  override def onlineupdate(event: Target): Unit = js.native
  
  /* CompleteClass */
  override def onmousedown(event: typingsJapgolly.baidumapWebSdk.anon.Pixel): Unit = js.native
  
  /* CompleteClass */
  override def onmouseout(event: typingsJapgolly.baidumapWebSdk.anon.Pixel): Unit = js.native
  
  /* CompleteClass */
  override def onmouseover(event: typingsJapgolly.baidumapWebSdk.anon.Pixel): Unit = js.native
  
  /* CompleteClass */
  override def onmouseup(event: typingsJapgolly.baidumapWebSdk.anon.Pixel): Unit = js.native
  
  /* CompleteClass */
  override def onremove(event: Target): Unit = js.native
  
  /* CompleteClass */
  override def removeEventListener(event: String, handler: Callback): Unit = js.native
  
  /* CompleteClass */
  override def setCenter(center: typingsJapgolly.baidumapWebSdk.BMap.Point): Unit = js.native
  
  /* CompleteClass */
  override def setFillColor(color: String): Unit = js.native
  
  /* CompleteClass */
  override def setFillOpacity(opacity: Double): Unit = js.native
  
  /* CompleteClass */
  override def setRadius(radius: Double): Unit = js.native
  
  /* CompleteClass */
  override def setStrokeColor(color: String): Unit = js.native
  
  /* CompleteClass */
  override def setStrokeOpacity(opacity: Double): Unit = js.native
  
  /* CompleteClass */
  override def setStrokeStyle(style: String): Unit = js.native
  
  /* CompleteClass */
  override def setStrokeWeight(weight: Double): Unit = js.native
}
