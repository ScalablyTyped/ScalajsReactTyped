package typingsJapgolly.popmotion.mod

import typingsJapgolly.popmotion.actionMod.Action
import typingsJapgolly.popmotion.pointerTypesMod.PointerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("popmotion", "mouse")
@js.native
object mouse extends js.Object {
  def apply(): Action = js.native
  def apply(hasPreventDefault: PointerProps): Action = js.native
}

