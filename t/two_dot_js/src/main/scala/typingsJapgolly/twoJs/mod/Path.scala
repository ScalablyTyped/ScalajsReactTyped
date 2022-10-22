package typingsJapgolly.twoJs.mod

import typingsJapgolly.twoJs.mod.Utils.Collection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("two.js", "Path")
@js.native
open class Path protected ()
  extends StObject
     with Object {
  def this(vertices: js.Array[Vector], closed: Boolean, curved: Boolean) = this()
  def this(vertices: js.Array[Vector], closed: Boolean, curved: Boolean, manual: Boolean) = this()
  
  def addTo(group: Group): this.type = js.native
  
  var automatic: Boolean = js.native
  
  var beginning: Double = js.native
  
  var cap: String = js.native
  
  def center(): this.type = js.native
  
  var clip: Boolean = js.native
  
  var closed: Boolean = js.native
  
  var curved: Boolean = js.native
  
  var dashes: js.Array[Double] = js.native
  
  var ending: Double = js.native
  
  var fill: Color = js.native
  
  def getBoundingClientRect(): BoundingClientRect = js.native
  def getBoundingClientRect(shallow: Boolean): BoundingClientRect = js.native
  
  var id: Double = js.native
  
  var join: String = js.native
  
  var linewidth: Double = js.native
  
  var miter: Double = js.native
  
  def noFill(): this.type = js.native
  
  def noStroke(): this.type = js.native
  
  var opacity: Double = js.native
  
  var parent: Group = js.native
  
  def plot(): this.type = js.native
  
  def remove(): this.type = js.native
  
  var rotation: Double = js.native
  
  var scale: Double = js.native
  
  var stroke: Color = js.native
  
  def subdivide(): this.type = js.native
  
  var translation: Vector = js.native
  
  var vertices: Collection[Anchor] = js.native
}
object Path {
  
  @JSImport("two.js", "Path")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def MakeObservable(obj: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("MakeObservable")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
}
