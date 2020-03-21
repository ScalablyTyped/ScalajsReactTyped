package typingsJapgolly.mobx.internalMod

import typingsJapgolly.mobx.interceptUtilsMod.IInterceptable
import typingsJapgolly.mobx.interceptUtilsMod.IInterceptor
import typingsJapgolly.mobx.utilsMod.Lambda
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobx/lib/internal", "registerInterceptor")
@js.native
object registerInterceptor extends js.Object {
  def apply[T](interceptable: IInterceptable[T], handler: IInterceptor[T]): Lambda = js.native
}

