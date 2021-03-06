package typingsJapgolly.multiparty.mod

import typingsJapgolly.multiparty.multipartyStrings.close
import typingsJapgolly.multiparty.multipartyStrings.error
import typingsJapgolly.multiparty.multipartyStrings.field
import typingsJapgolly.multiparty.multipartyStrings.part
import typingsJapgolly.multiparty.multipartyStrings.progress
import typingsJapgolly.node.eventsMod.EventEmitter
import typingsJapgolly.node.httpMod.IncomingMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("multiparty", "Form")
@js.native
class Form () extends EventEmitter {
  def this(options: FormOptions) = this()
  @JSName("on")
  def on_close(event: close, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
  @JSName("on")
  def on_field(event: field, listener: js.Function2[/* name */ String, /* value */ String, Unit]): this.type = js.native
  @JSName("on")
  def on_part(event: part, listener: js.Function1[/* part */ Part, Unit]): this.type = js.native
  @JSName("on")
  def on_progress(
    event: progress,
    listener: js.Function2[/* bytesReceived */ Double, /* bytesExpected */ Double, Unit]
  ): this.type = js.native
  /**
    * Parses an incoming node.js request containing form data.
    * This will cause form to emit events based off the incoming request
    * @param request
    * @param callback
    */
  def parse(request: IncomingMessage): Unit = js.native
  def parse(
    request: IncomingMessage,
    callback: js.Function3[/* error */ js.Error, /* fields */ js.Any, /* files */ js.Any, _]
  ): Unit = js.native
}

