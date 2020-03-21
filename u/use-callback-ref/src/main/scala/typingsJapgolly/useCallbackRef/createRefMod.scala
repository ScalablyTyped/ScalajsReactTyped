package typingsJapgolly.useCallbackRef

import japgolly.scalajs.react.raw.React.RefHandle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("use-callback-ref/dist/es5/createRef", JSImport.Namespace)
@js.native
object createRefMod extends js.Object {
  def createCallbackRef[T](callback: js.Function2[/* newValue */ T | Null, /* lastValue */ T | Null, _]): RefHandle[T] = js.native
}

