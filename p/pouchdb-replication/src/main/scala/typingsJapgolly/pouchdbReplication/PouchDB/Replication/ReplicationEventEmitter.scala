package typingsJapgolly.pouchdbReplication.PouchDB.Replication

import typingsJapgolly.pouchdbCore.EventEmitter
import typingsJapgolly.pouchdbReplication.pouchdbReplicationStrings.active
import typingsJapgolly.pouchdbReplication.pouchdbReplicationStrings.change
import typingsJapgolly.pouchdbReplication.pouchdbReplicationStrings.complete
import typingsJapgolly.pouchdbReplication.pouchdbReplicationStrings.denied
import typingsJapgolly.pouchdbReplication.pouchdbReplicationStrings.error
import typingsJapgolly.pouchdbReplication.pouchdbReplicationStrings.paused
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReplicationEventEmitter[Content /* <: js.Object */, C, F] extends EventEmitter {
  def cancel(): Unit = js.native
  @JSName("on")
  def on_active(event: active, listener: js.Function0[_]): this.type = js.native
  @JSName("on")
  def on_change(event: change, listener: js.Function1[/* info */ C, _]): this.type = js.native
  @JSName("on")
  def on_complete(event: complete, listener: js.Function1[/* info */ F, _]): this.type = js.native
  @JSName("on")
  def on_denied(event: denied, listener: js.Function1[/* err */ js.Object, _]): this.type = js.native
  @JSName("on")
  def on_error(event: error, listener: js.Function1[/* err */ js.Object, _]): this.type = js.native
  @JSName("on")
  def on_paused(event: paused, listener: js.Function1[/* err */ js.Object, _]): this.type = js.native
}

