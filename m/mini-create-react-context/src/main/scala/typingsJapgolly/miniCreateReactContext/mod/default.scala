package typingsJapgolly.miniCreateReactContext.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mini-create-react-context", JSImport.Default)
@js.native
object default extends js.Object {
  def apply[T](defaultValue: T): Context[T] = js.native
  def apply[T](defaultValue: T, calculateChangedBits: js.Function2[/* prev */ T, /* next */ T, Double]): Context[T] = js.native
}

