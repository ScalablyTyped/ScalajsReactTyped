package typingsJapgolly.dndCore

import typingsJapgolly.dndCore.interfacesMod.Action
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dnd-core/lib/reducers/refCount", JSImport.Namespace)
@js.native
object refCountMod extends js.Object {
  def default(state: js.UndefOr[scala.Nothing], action: Action[_]): Double = js.native
  def default(state: Double, action: Action[_]): Double = js.native
  type State = Double
}

