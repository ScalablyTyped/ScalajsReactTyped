package typingsJapgolly.forgeViewer.global.THREE

import typingsJapgolly.forgeViewer.THREE.Vector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("THREE.Vector2")
@js.native
open class Vector2 ()
  extends StObject
     with typingsJapgolly.forgeViewer.THREE.Vector2 {
  def this(x: Double) = this()
  def this(x: Double, y: Double) = this()
  def this(x: Unit, y: Double) = this()
  
  /* CompleteClass */
  override def add(v: Vector): Vector = js.native
  
  /* CompleteClass */
  override def addVectors(a: Vector, b: Vector): Vector = js.native
  
  /* CompleteClass */
  override def copy(v: Vector): Vector = js.native
  
  /* CompleteClass */
  override def divideScalar(s: Double): Vector = js.native
  
  /* CompleteClass */
  override def dot(v: Vector): Double = js.native
  
  /* CompleteClass */
  override def equals(v: Vector): Boolean = js.native
  
  /* CompleteClass */
  override def getComponent(index: Double): Double = js.native
  
  /* CompleteClass */
  override def length(): Double = js.native
  
  /* CompleteClass */
  override def lengthSq(): Double = js.native
  
  /* CompleteClass */
  override def lerp(v: Vector, alpha: Double): Vector = js.native
  
  /* CompleteClass */
  override def multiplyScalar(s: Double): Vector = js.native
  
  /* CompleteClass */
  override def negate(): Vector = js.native
  
  /* CompleteClass */
  override def normalize(): Vector = js.native
  
  /* CompleteClass */
  override def setComponent(index: Double, value: Double): Unit = js.native
  
  /* CompleteClass */
  override def setLength(l: Double): Vector = js.native
  
  /* CompleteClass */
  override def sub(v: Vector): Vector = js.native
  
  /* CompleteClass */
  override def subVectors(a: Vector, b: Vector): Vector = js.native
}
