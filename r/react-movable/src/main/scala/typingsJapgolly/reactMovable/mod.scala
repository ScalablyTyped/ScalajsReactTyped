package typingsJapgolly.reactMovable

import typingsJapgolly.reactMovable.listMod.default
import typingsJapgolly.reactMovable.typesMod.IProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-movable", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class List[Value] protected () extends default[Value] {
    def this(props: IProps[Value]) = this()
  }
  
  def arrayMove[T](array: js.Array[T], from: Double, to: Double): js.Array[T] = js.native
  def arrayRemove[T](array: js.Array[T], index: Double): js.Array[T] = js.native
  /* static members */
  @js.native
  object List extends js.Object {
    var defaultProps: AnonLockVertically = js.native
  }
  
}

