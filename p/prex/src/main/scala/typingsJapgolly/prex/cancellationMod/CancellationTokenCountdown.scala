package typingsJapgolly.prex.cancellationMod

import typingsJapgolly.esfxCancelable.distMod.Cancelable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prex/out/lib/cancellation", "CancellationTokenCountdown")
@js.native
class CancellationTokenCountdown () extends js.Object {
  def this(iterable: js.Iterable[CancellationToken | Cancelable]) = this()
  var _addedCount: js.Any = js.native
  var _canBeSignaled: js.Any = js.native
  var _checkSignalState: js.Any = js.native
  var _registrations: js.Any = js.native
  var _signaledCount: js.Any = js.native
  var _source: js.Any = js.native
  /**
    * Gets the number of tokens added to the countdown.
    */
  val addedCount: Double = js.native
  /**
    * Gets the number of tokens that have not yet been canceled.
    */
  val remainingCount: Double = js.native
  /**
    * Gets the CancellationToken for the countdown.
    */
  val token: CancellationToken = js.native
  def add(token: Cancelable): this.type = js.native
  /**
    * Adds a CancellationToken to the countdown.
    */
  def add(token: CancellationToken): this.type = js.native
}

