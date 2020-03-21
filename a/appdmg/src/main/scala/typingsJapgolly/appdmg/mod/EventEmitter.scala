package typingsJapgolly.appdmg.mod

import typingsJapgolly.appdmg.appdmgStrings.error
import typingsJapgolly.appdmg.appdmgStrings.finish
import typingsJapgolly.appdmg.appdmgStrings.progress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventEmitter
  extends typingsJapgolly.node.NodeJS.EventEmitter {
  @JSName("on")
  def on_error(event: error, listener: js.Function1[/* err */ js.Any, Unit]): this.type = js.native
  @JSName("on")
  def on_finish(event: finish, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_progress(event: progress, listener: js.Function1[/* info */ Progress, Unit]): this.type = js.native
}

