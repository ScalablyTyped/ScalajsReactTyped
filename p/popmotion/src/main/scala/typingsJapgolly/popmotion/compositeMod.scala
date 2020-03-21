package typingsJapgolly.popmotion

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.popmotion.actionMod.Action
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("popmotion/lib/compositors/composite", JSImport.Namespace)
@js.native
object compositeMod extends js.Object {
  def default(actions: ActionMap): Action = js.native
  type ActionMap = StringDictionary[Action]
}

