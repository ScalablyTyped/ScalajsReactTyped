package typingsJapgolly.lobibox

import typingsJapgolly.lobibox.LobiboxModule.LobiboxStatic
import typingsJapgolly.lobibox.LobiboxModule.MessageBoxesDefault
import typingsJapgolly.lobibox.LobiboxModule.PromptOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCallDEFAULTS extends js.Object {
  var DEFAULTS: PromptOptions = js.native
  def apply[T /* <: MessageBoxesDefault */](`type`: String): LobiboxStatic = js.native
  def apply[T /* <: MessageBoxesDefault */](`type`: String, options: T): LobiboxStatic = js.native
}

