package typingsJapgolly.hapiHapi.mod

import typingsJapgolly.hapiHapi.hapiHapiStrings.finish
import typingsJapgolly.hapiHapi.hapiHapiStrings.peek
import typingsJapgolly.hapiPodium.mod.Podium
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResponseEvents extends Podium {
  @JSName("on")
  def on_finish(criteria: finish, listener: js.Function1[/* data */ js.UndefOr[scala.Nothing], Unit]): Unit = js.native
  /**
    * 'peek' - emitted for each chunk of data written back to the client connection. The event method signature is function(chunk, encoding).
    * 'finish' - emitted when the response finished writing but before the client response connection is ended. The event method signature is function ().
    */
  @JSName("on")
  def on_peek(criteria: peek, listener: PeekListener): Unit = js.native
  @JSName("once")
  def once_finish(criteria: finish, listener: js.Function1[/* data */ js.UndefOr[scala.Nothing], Unit]): Unit = js.native
  /**
    * 'peek' - emitted for each chunk of data written back to the client connection. The event method signature is function(chunk, encoding).
    * 'finish' - emitted when the response finished writing but before the client response connection is ended. The event method signature is function ().
    */
  @JSName("once")
  def once_peek(criteria: peek, listener: PeekListener): Unit = js.native
}

