package typingsJapgolly.mobx.internalMod

import typingsJapgolly.mobx.listenUtilsMod.IListenable
import typingsJapgolly.mobx.utilsMod.Lambda
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobx/lib/internal", "registerListener")
@js.native
object registerListener extends js.Object {
  def apply(listenable: IListenable, handler: js.Function): Lambda = js.native
}

