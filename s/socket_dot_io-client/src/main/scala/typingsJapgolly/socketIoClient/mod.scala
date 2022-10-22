package typingsJapgolly.socketIoClient

import typingsJapgolly.socketIoClient.anon.PartialManagerOptions
import typingsJapgolly.socketIoClient.anon.PartialManagerOptionsSock
import typingsJapgolly.socketIoClient.anon.PartialSocketOptions
import typingsJapgolly.socketIoComponentEmitter.mod.DefaultEventsMap
import typingsJapgolly.socketIoComponentEmitter.mod.EventsMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("socket.io-client", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Looks up an existing `Manager` for multiplexing.
    * If the user summons:
    *
    *   `io('http://localhost/a');`
    *   `io('http://localhost/b');`
    *
    * We reuse the existing instance based on same scheme/port/host,
    * and we initialize sockets for each namespace.
    *
    * @public
    */
  inline def default(): typingsJapgolly.socketIoClient.buildEsmSocketMod.Socket[DefaultEventsMap, DefaultEventsMap] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[typingsJapgolly.socketIoClient.buildEsmSocketMod.Socket[DefaultEventsMap, DefaultEventsMap]]
  inline def default(uri: String): typingsJapgolly.socketIoClient.buildEsmSocketMod.Socket[DefaultEventsMap, DefaultEventsMap] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(uri.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.socketIoClient.buildEsmSocketMod.Socket[DefaultEventsMap, DefaultEventsMap]]
  inline def default(uri: String, opts: PartialManagerOptionsSock): typingsJapgolly.socketIoClient.buildEsmSocketMod.Socket[DefaultEventsMap, DefaultEventsMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(uri.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.socketIoClient.buildEsmSocketMod.Socket[DefaultEventsMap, DefaultEventsMap]]
  inline def default(uri: PartialManagerOptionsSock): typingsJapgolly.socketIoClient.buildEsmSocketMod.Socket[DefaultEventsMap, DefaultEventsMap] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(uri.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.socketIoClient.buildEsmSocketMod.Socket[DefaultEventsMap, DefaultEventsMap]]
  inline def default(uri: PartialManagerOptionsSock, opts: PartialManagerOptionsSock): typingsJapgolly.socketIoClient.buildEsmSocketMod.Socket[DefaultEventsMap, DefaultEventsMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(uri.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.socketIoClient.buildEsmSocketMod.Socket[DefaultEventsMap, DefaultEventsMap]]
  
  @JSImport("socket.io-client", "Manager")
  @js.native
  open class Manager[ListenEvents /* <: EventsMap */, EmitEvents /* <: EventsMap */] ()
    extends typingsJapgolly.socketIoClient.buildEsmManagerMod.Manager[ListenEvents, EmitEvents] {
    /**
      * `Manager` constructor.
      *
      * @param uri - engine instance or engine uri/opts
      * @param opts - options
      * @public
      */
    def this(opts: PartialManagerOptions) = this()
    def this(uri: String) = this()
    def this(uri: String, opts: PartialManagerOptions) = this()
    def this(uri: Unit, opts: PartialManagerOptions) = this()
    def this(uri: PartialManagerOptions, opts: PartialManagerOptions) = this()
  }
  
  @JSImport("socket.io-client", "Socket")
  @js.native
  open class Socket[ListenEvents /* <: EventsMap */, EmitEvents /* <: EventsMap */] protected ()
    extends typingsJapgolly.socketIoClient.buildEsmSocketMod.Socket[ListenEvents, EmitEvents] {
    /**
      * `Socket` constructor.
      */
    def this(
      io: typingsJapgolly.socketIoClient.buildEsmManagerMod.Manager[DefaultEventsMap, DefaultEventsMap],
      nsp: String
    ) = this()
    def this(
      io: typingsJapgolly.socketIoClient.buildEsmManagerMod.Manager[DefaultEventsMap, DefaultEventsMap],
      nsp: String,
      opts: PartialSocketOptions
    ) = this()
  }
  
  /**
    * Looks up an existing `Manager` for multiplexing.
    * If the user summons:
    *
    *   `io('http://localhost/a');`
    *   `io('http://localhost/b');`
    *
    * We reuse the existing instance based on same scheme/port/host,
    * and we initialize sockets for each namespace.
    *
    * @public
    */
  inline def connect(): typingsJapgolly.socketIoClient.buildEsmSocketMod.Socket[DefaultEventsMap, DefaultEventsMap] = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")().asInstanceOf[typingsJapgolly.socketIoClient.buildEsmSocketMod.Socket[DefaultEventsMap, DefaultEventsMap]]
  inline def connect(uri: String): typingsJapgolly.socketIoClient.buildEsmSocketMod.Socket[DefaultEventsMap, DefaultEventsMap] = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")(uri.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.socketIoClient.buildEsmSocketMod.Socket[DefaultEventsMap, DefaultEventsMap]]
  inline def connect(uri: String, opts: PartialManagerOptionsSock): typingsJapgolly.socketIoClient.buildEsmSocketMod.Socket[DefaultEventsMap, DefaultEventsMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(uri.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.socketIoClient.buildEsmSocketMod.Socket[DefaultEventsMap, DefaultEventsMap]]
  inline def connect(uri: PartialManagerOptionsSock): typingsJapgolly.socketIoClient.buildEsmSocketMod.Socket[DefaultEventsMap, DefaultEventsMap] = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")(uri.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.socketIoClient.buildEsmSocketMod.Socket[DefaultEventsMap, DefaultEventsMap]]
  inline def connect(uri: PartialManagerOptionsSock, opts: PartialManagerOptionsSock): typingsJapgolly.socketIoClient.buildEsmSocketMod.Socket[DefaultEventsMap, DefaultEventsMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(uri.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.socketIoClient.buildEsmSocketMod.Socket[DefaultEventsMap, DefaultEventsMap]]
  
  /**
    * Looks up an existing `Manager` for multiplexing.
    * If the user summons:
    *
    *   `io('http://localhost/a');`
    *   `io('http://localhost/b');`
    *
    * We reuse the existing instance based on same scheme/port/host,
    * and we initialize sockets for each namespace.
    *
    * @public
    */
  inline def io(): typingsJapgolly.socketIoClient.buildEsmSocketMod.Socket[DefaultEventsMap, DefaultEventsMap] = ^.asInstanceOf[js.Dynamic].applyDynamic("io")().asInstanceOf[typingsJapgolly.socketIoClient.buildEsmSocketMod.Socket[DefaultEventsMap, DefaultEventsMap]]
  inline def io(uri: String): typingsJapgolly.socketIoClient.buildEsmSocketMod.Socket[DefaultEventsMap, DefaultEventsMap] = ^.asInstanceOf[js.Dynamic].applyDynamic("io")(uri.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.socketIoClient.buildEsmSocketMod.Socket[DefaultEventsMap, DefaultEventsMap]]
  inline def io(uri: String, opts: PartialManagerOptionsSock): typingsJapgolly.socketIoClient.buildEsmSocketMod.Socket[DefaultEventsMap, DefaultEventsMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("io")(uri.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.socketIoClient.buildEsmSocketMod.Socket[DefaultEventsMap, DefaultEventsMap]]
  inline def io(uri: PartialManagerOptionsSock): typingsJapgolly.socketIoClient.buildEsmSocketMod.Socket[DefaultEventsMap, DefaultEventsMap] = ^.asInstanceOf[js.Dynamic].applyDynamic("io")(uri.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.socketIoClient.buildEsmSocketMod.Socket[DefaultEventsMap, DefaultEventsMap]]
  inline def io(uri: PartialManagerOptionsSock, opts: PartialManagerOptionsSock): typingsJapgolly.socketIoClient.buildEsmSocketMod.Socket[DefaultEventsMap, DefaultEventsMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("io")(uri.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.socketIoClient.buildEsmSocketMod.Socket[DefaultEventsMap, DefaultEventsMap]]
  
  @JSImport("socket.io-client", "protocol")
  @js.native
  val protocol: Double = js.native
}
