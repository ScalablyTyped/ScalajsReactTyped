package typingsJapgolly.tsMockito

import typingsJapgolly.tsMockito.methodStubSetterMod.MethodStubSetter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn0 extends js.Object {
  def apply[T](method: T): MethodStubSetter[T, Unit, js.Error] = js.native
  def apply[T](method: js.Promise[T]): MethodStubSetter[js.Promise[T], T, js.Error] = js.native
}

