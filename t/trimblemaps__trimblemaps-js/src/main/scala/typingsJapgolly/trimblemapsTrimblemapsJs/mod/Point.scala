package typingsJapgolly.trimblemapsTrimblemapsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@trimblemaps/trimblemaps-js", "Point")
@js.native
open class Point protected () extends StObject {
  def this(x: Double, y: Double) = this()
  
  def add(p: Point): Point = js.native
  
  def angle(): Double = js.native
  
  def angleTo(p: Point): Double = js.native
  
  def angleWidth(p: Point): Double = js.native
  
  def angleWithSep(x: Double, y: Double): Double = js.native
  
  def dist(p: Point): Double = js.native
  
  def distSqr(p: Point): Double = js.native
  
  def div(k: Double): Point = js.native
  
  def equals(p: Point): Boolean = js.native
  
  def mag(): Double = js.native
  
  def matMult(m: Double): Point = js.native
  
  def mult(k: Double): Point = js.native
  
  def perp(): Point = js.native
  
  def rotate(a: Double): Point = js.native
  
  def round(): Point = js.native
  
  def sub(p: Point): Point = js.native
  
  def unit(): Point = js.native
  
  var x: Double = js.native
  
  var y: Double = js.native
}
/* static members */
object Point {
  
  @JSImport("@trimblemaps/trimblemaps-js", "Point")
  @js.native
  val ^ : js.Any = js.native
  
  inline def convert(a: PointLike): Point = ^.asInstanceOf[js.Dynamic].applyDynamic("convert")(a.asInstanceOf[js.Any]).asInstanceOf[Point]
}
