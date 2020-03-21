package typingsJapgolly.mobx.internalMod

import typingsJapgolly.mobx.interceptUtilsMod.IInterceptable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobx/lib/internal", "interceptChange")
@js.native
object interceptChange extends js.Object {
  def apply[T](interceptable: IInterceptable[T | Null]): T | Null = js.native
  def apply[T](interceptable: IInterceptable[T | Null], change: T): T | Null = js.native
}

