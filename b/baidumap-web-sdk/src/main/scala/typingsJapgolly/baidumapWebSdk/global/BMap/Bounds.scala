package typingsJapgolly.baidumapWebSdk.global.BMap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BMap.Bounds")
@js.native
open class Bounds protected ()
  extends StObject
     with typingsJapgolly.baidumapWebSdk.BMap.Bounds {
  def this(sw: typingsJapgolly.baidumapWebSdk.BMap.Point, ne: typingsJapgolly.baidumapWebSdk.BMap.Point) = this()
  def this(minX: Double, minY: Double, maxX: Double, maxY: Double) = this()
  
  /* CompleteClass */
  override def containsBounds(bounds: typingsJapgolly.baidumapWebSdk.BMap.Bounds): Boolean = js.native
  
  /* CompleteClass */
  override def containsPoint(point: typingsJapgolly.baidumapWebSdk.BMap.Point): Boolean = js.native
  
  /* CompleteClass */
  override def equals(other: typingsJapgolly.baidumapWebSdk.BMap.Bounds): Boolean = js.native
  
  /* CompleteClass */
  override def extend(point: typingsJapgolly.baidumapWebSdk.BMap.Point): Unit = js.native
  
  /* CompleteClass */
  override def getCenter(): typingsJapgolly.baidumapWebSdk.BMap.Point = js.native
  
  /* CompleteClass */
  override def getNorthEast(): typingsJapgolly.baidumapWebSdk.BMap.Point = js.native
  
  /* CompleteClass */
  override def getSouthWest(): typingsJapgolly.baidumapWebSdk.BMap.Point = js.native
  
  /* CompleteClass */
  override def intersects(other: typingsJapgolly.baidumapWebSdk.BMap.Bounds): Boolean = js.native
  
  /* CompleteClass */
  override def isEmpty(): Boolean = js.native
  
  /* CompleteClass */
  var maxX: Double = js.native
  
  /* CompleteClass */
  var maxY: Double = js.native
  
  /* CompleteClass */
  var minX: Double = js.native
  
  /* CompleteClass */
  var minY: Double = js.native
  
  /* CompleteClass */
  override def toSpan(): typingsJapgolly.baidumapWebSdk.BMap.Point = js.native
}
