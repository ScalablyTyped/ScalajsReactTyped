package typingsJapgolly.uifabricUtilities

import japgolly.scalajs.react.raw.React.RefHandle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uifabric/utilities/lib/createRef", JSImport.Namespace)
@js.native
object createRefMod extends js.Object {
  @js.native
  trait RefObject[T] extends js.Object {
    var current: T | Null = js.native
    def apply(): Unit = js.native
    def apply(component: T): Unit = js.native
  }
  
  type IRefObject[T] = RefHandle[T] | RefObject[T] | (js.Function1[/* ref */ T | Null, Unit])
}

