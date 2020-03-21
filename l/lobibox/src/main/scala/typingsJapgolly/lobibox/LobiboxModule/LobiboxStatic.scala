package typingsJapgolly.lobibox.LobiboxModule

import typingsJapgolly.lobibox.AnonCall
import typingsJapgolly.lobibox.AnonCallDEFAULTS
import typingsJapgolly.lobibox.AnonCallOptions
import typingsJapgolly.lobibox.AnonDEFAULTS
import typingsJapgolly.lobibox.AnonDEFAULTSProgressOptions
import typingsJapgolly.lobibox.AnonDEFAULTSWindowOptions
import typingsJapgolly.lobibox.AnonOPTIONS
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LobiboxStatic extends js.Object {
  @JSName("alert")
  var alert_Original: AnonCall = js.native
  var base: AnonDEFAULTS = js.native
  @JSName("confirm")
  var confirm_Original: AnonCallOptions = js.native
  @JSName("notify")
  var notify_Original: AnonOPTIONS = js.native
  @JSName("progress")
  var progress_Original: AnonDEFAULTSProgressOptions = js.native
  @JSName("prompt")
  var prompt_Original: AnonCallDEFAULTS = js.native
  @JSName("window")
  var window_Original: AnonDEFAULTSWindowOptions = js.native
  def alert[T /* <: MessageBoxesDefault */](`type`: String): LobiboxStatic = js.native
  def alert[T /* <: MessageBoxesDefault */](`type`: String, options: T): LobiboxStatic = js.native
  def confirm[T /* <: MessageBoxesDefault */](): T = js.native
  def confirm[T /* <: MessageBoxesDefault */](options: ConfirmOptions): T = js.native
  def notify[T /* <: NotifyDefault */](`type`: String): T = js.native
  def notify[T /* <: NotifyDefault */](`type`: String, options: NotifyOptions): T = js.native
  def progress[T /* <: MessageBoxesDefault */](options: ProgressOptions): T = js.native
  def prompt[T /* <: MessageBoxesDefault */](`type`: String): LobiboxStatic = js.native
  def prompt[T /* <: MessageBoxesDefault */](`type`: String, options: T): LobiboxStatic = js.native
  def window[T /* <: MessageBoxesDefault */](options: WindowOptions): T = js.native
}

