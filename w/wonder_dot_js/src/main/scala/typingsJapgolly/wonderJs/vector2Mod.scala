package typingsJapgolly.wonderJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/math/Vector2", JSImport.Namespace)
@js.native
object vector2Mod extends js.Object {
  @js.native
  class Vector2 () extends js.Object {
    def this(x: js.Any, y: js.Any) = this()
    var values: scala.scalajs.js.typedarray.Float32Array = js.native
    var x: Double = js.native
    var y: Double = js.native
    def add(v: Vector2): this.type = js.native
    def isEqual(v: Vector2): Boolean = js.native
    def mul(v: Vector2): this.type = js.native
    def set(x: Double, y: Double): Unit = js.native
  }
  
  /* static members */
  @js.native
  object Vector2 extends js.Object {
    def create(): Vector2 = js.native
    def create(x: js.Any, y: js.Any): Vector2 = js.native
  }
  
}

