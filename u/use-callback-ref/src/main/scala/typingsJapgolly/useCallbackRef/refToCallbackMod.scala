package typingsJapgolly.useCallbackRef

import typingsJapgolly.useCallbackRef.typesMod.ReactRef
import typingsJapgolly.useCallbackRef.typesMod.RefCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("use-callback-ref/dist/es5/refToCallback", JSImport.Namespace)
@js.native
object refToCallbackMod extends js.Object {
  def refToCallback[T](ref: ReactRef[T]): RefCallback[T] = js.native
  def useRefToCallback[T](ref: ReactRef[T]): RefCallback[T] = js.native
}

