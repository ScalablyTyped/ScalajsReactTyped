package typingsJapgolly.bmapgl.global.BMapGL

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BMapGL.Bounds")
@js.native
open class Bounds protected ()
  extends StObject
     with typingsJapgolly.bmapgl.BMapGL.Bounds {
  def this(sw: typingsJapgolly.bmapgl.BMapGL.Point, ne: typingsJapgolly.bmapgl.BMapGL.Point) = this()
  def this(minX: Double, minY: Double, maxX: Double, maxY: Double) = this()
  
  /* CompleteClass */
  override def containsBounds(bounds: typingsJapgolly.bmapgl.BMapGL.Bounds): Boolean = js.native
  
  /* CompleteClass */
  override def containsPoint(point: typingsJapgolly.bmapgl.BMapGL.Point): Boolean = js.native
  
  /* CompleteClass */
  override def equals(other: typingsJapgolly.bmapgl.BMapGL.Bounds): Boolean = js.native
  
  /* CompleteClass */
  override def extend(point: typingsJapgolly.bmapgl.BMapGL.Point): Unit = js.native
  
  /* CompleteClass */
  override def getCenter(): typingsJapgolly.bmapgl.BMapGL.Point = js.native
  
  /* CompleteClass */
  override def getNorthEast(): typingsJapgolly.bmapgl.BMapGL.Point = js.native
  
  /* CompleteClass */
  override def getSouthWest(): typingsJapgolly.bmapgl.BMapGL.Point = js.native
  
  /* CompleteClass */
  override def intersects(other: typingsJapgolly.bmapgl.BMapGL.Bounds): Boolean = js.native
  
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
  override def toSpan(): typingsJapgolly.bmapgl.BMapGL.Point = js.native
}
