package typingsJapgolly.popmotion

import typingsJapgolly.popmotion.actionMod.Action
import typingsJapgolly.popmotion.pointerTypesMod.PointerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("popmotion/lib/input/pointer", JSImport.Namespace)
@js.native
object pointerMod extends js.Object {
  def default(): Action = js.native
  def default(hasXYProps: PointerProps): Action = js.native
}

