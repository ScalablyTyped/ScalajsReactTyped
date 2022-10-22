package typingsJapgolly.baidumapWebSdk.global.BMap

import typingsJapgolly.baidumapWebSdk.BMap.PointCollectionOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BMap.PointCollection")
@js.native
open class PointCollection protected ()
  extends StObject
     with typingsJapgolly.baidumapWebSdk.BMap.PointCollection {
  def this(points: js.Array[typingsJapgolly.baidumapWebSdk.BMap.Point]) = this()
  def this(points: js.Array[typingsJapgolly.baidumapWebSdk.BMap.Point], opts: PointCollectionOption) = this()
  
  /* CompleteClass */
  override def clear(): Unit = js.native
  
  /* CompleteClass */
  override def onclick(event: typingsJapgolly.baidumapWebSdk.anon.Point): Unit = js.native
  
  /* CompleteClass */
  override def onmouseout(event: typingsJapgolly.baidumapWebSdk.anon.Point): Unit = js.native
  
  /* CompleteClass */
  override def onmouseover(event: typingsJapgolly.baidumapWebSdk.anon.Point): Unit = js.native
  
  /* CompleteClass */
  override def setPoints(points: js.Array[typingsJapgolly.baidumapWebSdk.BMap.Point]): Unit = js.native
  
  /* CompleteClass */
  override def setStyles(styles: PointCollectionOption): Unit = js.native
}
