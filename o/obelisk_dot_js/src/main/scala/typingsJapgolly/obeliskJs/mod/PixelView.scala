package typingsJapgolly.obeliskJs.mod

import org.scalajs.dom.CanvasRenderingContext2D
import org.scalajs.dom.HTMLCanvasElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("obelisk.js", "PixelView")
@js.native
open class PixelView protected () extends StObject {
  def this(canvas: HTMLCanvasElement) = this()
  def this(canvas: HTMLCanvasElement, point: Point) = this()
  
  var canvas: HTMLCanvasElement = js.native
  
  def clear(): Unit = js.native
  
  var context: CanvasRenderingContext2D = js.native
  
  var point: Point = js.native
  
  def renderObject(primitive: AbstractPrimitive): Unit = js.native
  def renderObject(primitive: AbstractPrimitive, point3D: Point3D): Unit = js.native
}
