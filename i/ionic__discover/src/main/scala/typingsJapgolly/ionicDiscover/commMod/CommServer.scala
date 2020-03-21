package typingsJapgolly.ionicDiscover.commMod

import typingsJapgolly.ionicDiscover.ionicDiscoverStrings.connect
import typingsJapgolly.ionicDiscover.ionicDiscoverStrings.error
import typingsJapgolly.node.eventsMod.EventEmitter
import typingsJapgolly.std.Set
import typingsJapgolly.ws.mod.Server
import typingsJapgolly.ws.mod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/discover/dist/comm", "CommServer")
@js.native
class CommServer protected () extends EventEmitter {
  def this(
    namespace: String,
    /**
    * Unique identifier of the publisher.
    */
  id: String,
    /**
    * Port of communication server.
    */
  port: Double
  ) = this()
  /**
    * Unique identifier of the publisher.
    */
  var id: String = js.native
  var namespace: String = js.native
  var parseData: js.Any = js.native
  /**
    * Port of communication server.
    */
  var port: Double = js.native
  var server: js.UndefOr[Server] = js.native
  def clients(): Set[^] = js.native
  @JSName("on")
  def on_connect(event: connect, listener: js.Function1[/* data */ CommServerConnectionPayload, Unit]): this.type = js.native
  @JSName("on")
  def on_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
  def start(): js.Promise[Unit] = js.native
  def stop(): js.Promise[Unit] = js.native
}

