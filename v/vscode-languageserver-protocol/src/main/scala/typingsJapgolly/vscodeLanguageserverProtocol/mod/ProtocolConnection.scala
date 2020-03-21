package typingsJapgolly.vscodeLanguageserverProtocol.mod

import typingsJapgolly.vscodeJsonrpc.Thenable
import typingsJapgolly.vscodeJsonrpc.messagesMod.Message
import typingsJapgolly.vscodeJsonrpc.messagesMod.NotificationMessage
import typingsJapgolly.vscodeJsonrpc.mod.GenericNotificationHandler
import typingsJapgolly.vscodeJsonrpc.mod.GenericRequestHandler
import typingsJapgolly.vscodeJsonrpc.mod.NotificationHandler
import typingsJapgolly.vscodeJsonrpc.mod.NotificationHandler0
import typingsJapgolly.vscodeJsonrpc.mod.RequestHandler
import typingsJapgolly.vscodeJsonrpc.mod.RequestHandler0
import typingsJapgolly.vscodeJsonrpc.mod.TraceOptions
import typingsJapgolly.vscodeJsonrpc.mod.Tracer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProtocolConnection extends js.Object {
  /**
    * An event emitter firing when the connection got closed.
    */
  @JSName("onClose")
  var onClose_Original: typingsJapgolly.vscodeJsonrpc.eventsMod.Event[Unit] = js.native
  /**
    * An event emitter firing when the connection got disposed.
    */
  @JSName("onDispose")
  var onDispose_Original: typingsJapgolly.vscodeJsonrpc.eventsMod.Event[Unit] = js.native
  /**
    * An event emitter firing when an error occurs on the connection.
    */
  @JSName("onError")
  var onError_Original: typingsJapgolly.vscodeJsonrpc.eventsMod.Event[js.Tuple3[js.Error, js.UndefOr[Message], js.UndefOr[Double]]] = js.native
  /**
    * An event emiiter firing when the connection receives a notification that is not
    * handled.
    */
  @JSName("onUnhandledNotification")
  var onUnhandledNotification_Original: typingsJapgolly.vscodeJsonrpc.eventsMod.Event[NotificationMessage] = js.native
  /**
    * Actively disposes the connection.
    */
  def dispose(): Unit = js.native
  /**
    * Turns the connection into listening mode
    */
  def listen(): Unit = js.native
  /**
    * An event emitter firing when the connection got closed.
    */
  def onClose(listener: js.Function1[/* e */ Unit, _]): typingsJapgolly.vscodeJsonrpc.eventsMod.Disposable = js.native
  def onClose(listener: js.Function1[/* e */ Unit, _], thisArgs: js.Any): typingsJapgolly.vscodeJsonrpc.eventsMod.Disposable = js.native
  def onClose(
    listener: js.Function1[/* e */ Unit, _],
    thisArgs: js.Any,
    disposables: js.Array[typingsJapgolly.vscodeJsonrpc.eventsMod.Disposable]
  ): typingsJapgolly.vscodeJsonrpc.eventsMod.Disposable = js.native
  /**
    * An event emitter firing when the connection got disposed.
    */
  def onDispose(listener: js.Function1[/* e */ Unit, _]): typingsJapgolly.vscodeJsonrpc.eventsMod.Disposable = js.native
  def onDispose(listener: js.Function1[/* e */ Unit, _], thisArgs: js.Any): typingsJapgolly.vscodeJsonrpc.eventsMod.Disposable = js.native
  def onDispose(
    listener: js.Function1[/* e */ Unit, _],
    thisArgs: js.Any,
    disposables: js.Array[typingsJapgolly.vscodeJsonrpc.eventsMod.Disposable]
  ): typingsJapgolly.vscodeJsonrpc.eventsMod.Disposable = js.native
  /**
    * An event emitter firing when an error occurs on the connection.
    */
  def onError(listener: js.Function1[/* e */ js.Tuple3[js.Error, js.UndefOr[Message], js.UndefOr[Double]], _]): typingsJapgolly.vscodeJsonrpc.eventsMod.Disposable = js.native
  def onError(
    listener: js.Function1[/* e */ js.Tuple3[js.Error, js.UndefOr[Message], js.UndefOr[Double]], _],
    thisArgs: js.Any
  ): typingsJapgolly.vscodeJsonrpc.eventsMod.Disposable = js.native
  def onError(
    listener: js.Function1[/* e */ js.Tuple3[js.Error, js.UndefOr[Message], js.UndefOr[Double]], _],
    thisArgs: js.Any,
    disposables: js.Array[typingsJapgolly.vscodeJsonrpc.eventsMod.Disposable]
  ): typingsJapgolly.vscodeJsonrpc.eventsMod.Disposable = js.native
  /**
    * Installs a notification handler.
    *
    * @param methods The method name to install the handler for.
    * @param handler The actual handler.
    */
  def onNotification(method: String, handler: GenericNotificationHandler): Unit = js.native
  /**
    * Installs a notification handler.
    *
    * @param type The notification type to install the handler for.
    * @param handler The actual handler.
    */
  def onNotification[RO](`type`: typingsJapgolly.vscodeJsonrpc.mod.NotificationType0[RO], handler: NotificationHandler0): Unit = js.native
  /**
    * Installs a notification handler.
    *
    * @param type The notification type to install the handler for.
    * @param handler The actual handler.
    */
  def onNotification[P, RO](`type`: typingsJapgolly.vscodeJsonrpc.mod.NotificationType[P, RO], handler: NotificationHandler[P]): Unit = js.native
  /**
    * Installs a request handler.
    *
    * @param methods The method name to install the handler for.
    * @param handler The actual handler.
    */
  def onRequest[R, E](method: String, handler: GenericRequestHandler[R, E]): Unit = js.native
  /**
    * Installs a request handler.
    *
    * @param type The request type to install the handler for.
    * @param handler The actual handler.
    */
  def onRequest[R, E, RO](`type`: typingsJapgolly.vscodeJsonrpc.mod.RequestType0[R, E, RO], handler: RequestHandler0[R, E]): Unit = js.native
  /**
    * Installs a request handler.
    *
    * @param type The request type to install the handler for.
    * @param handler The actual handler.
    */
  def onRequest[P, R, E, RO](
    `type`: typingsJapgolly.vscodeJsonrpc.mod.RequestType[P, R, E, RO],
    handler: RequestHandler[P, R, E]
  ): Unit = js.native
  /**
    * An event emiiter firing when the connection receives a notification that is not
    * handled.
    */
  def onUnhandledNotification(listener: js.Function1[/* e */ NotificationMessage, _]): typingsJapgolly.vscodeJsonrpc.eventsMod.Disposable = js.native
  def onUnhandledNotification(listener: js.Function1[/* e */ NotificationMessage, _], thisArgs: js.Any): typingsJapgolly.vscodeJsonrpc.eventsMod.Disposable = js.native
  def onUnhandledNotification(
    listener: js.Function1[/* e */ NotificationMessage, _],
    thisArgs: js.Any,
    disposables: js.Array[typingsJapgolly.vscodeJsonrpc.eventsMod.Disposable]
  ): typingsJapgolly.vscodeJsonrpc.eventsMod.Disposable = js.native
  /**
    * Sends a notification.
    *
    * @param method the notification's method name.
    */
  def sendNotification(method: String): Unit = js.native
  /**
    * Sends a notification.
    *
    * @param method the notification's method name.
    * @param params the notification's parameters.
    */
  def sendNotification(method: String, params: js.Any): Unit = js.native
  /**
    * Sends a notification.
    *
    * @param type the notification's type to send.
    */
  def sendNotification[RO](`type`: typingsJapgolly.vscodeJsonrpc.mod.NotificationType0[RO]): Unit = js.native
  /**
    * Sends a notification.
    *
    * @param type the notification's type to send.
    * @param params the notification's parameters.
    */
  def sendNotification[P, RO](`type`: typingsJapgolly.vscodeJsonrpc.mod.NotificationType[P, RO]): Unit = js.native
  def sendNotification[P, RO](`type`: typingsJapgolly.vscodeJsonrpc.mod.NotificationType[P, RO], params: P): Unit = js.native
  /**
    * Sends a request and returns a promise resolving to the result of the request.
    *
    * @param method the request's method name.
    * @param token An optional cancellation token.
    * @returns A promise resolving to the request's result.
    */
  def sendRequest[R](method: String): Thenable[R] = js.native
  /**
    * Sends a request and returns a promise resolving to the result of the request.
    *
    * @param method the request's method name.
    * @param params The request's parameter.
    * @param token An optional cancellation token.
    * @returns A promise resolving to the request's result.
    */
  def sendRequest[R](method: String, param: js.Any): Thenable[R] = js.native
  def sendRequest[R](
    method: String,
    param: js.Any,
    token: typingsJapgolly.vscodeJsonrpc.cancellationMod.CancellationToken
  ): Thenable[R] = js.native
  def sendRequest[R](method: String, token: typingsJapgolly.vscodeJsonrpc.cancellationMod.CancellationToken): Thenable[R] = js.native
  /**
    * Sends a request and returns a promise resolving to the result of the request.
    *
    * @param type The type of request to sent.
    * @param token An optional cancellation token.
    * @returns A promise resolving to the request's result.
    */
  def sendRequest[R, E, RO](`type`: typingsJapgolly.vscodeJsonrpc.mod.RequestType0[R, E, RO]): Thenable[R] = js.native
  def sendRequest[R, E, RO](
    `type`: typingsJapgolly.vscodeJsonrpc.mod.RequestType0[R, E, RO],
    token: typingsJapgolly.vscodeJsonrpc.cancellationMod.CancellationToken
  ): Thenable[R] = js.native
  /**
    * Sends a request and returns a promise resolving to the result of the request.
    *
    * @param type The type of request to sent.
    * @param params The request's parameter.
    * @param token An optional cancellation token.
    * @returns A promise resolving to the request's result.
    */
  def sendRequest[P, R, E, RO](`type`: typingsJapgolly.vscodeJsonrpc.mod.RequestType[P, R, E, RO], params: P): Thenable[R] = js.native
  def sendRequest[P, R, E, RO](
    `type`: typingsJapgolly.vscodeJsonrpc.mod.RequestType[P, R, E, RO],
    params: P,
    token: typingsJapgolly.vscodeJsonrpc.cancellationMod.CancellationToken
  ): Thenable[R] = js.native
  /**
    * Enables tracing mode for the connection.
    */
  def trace(value: typingsJapgolly.vscodeJsonrpc.mod.Trace, tracer: Tracer): Unit = js.native
  def trace(value: typingsJapgolly.vscodeJsonrpc.mod.Trace, tracer: Tracer, sendNotification: Boolean): Unit = js.native
  def trace(value: typingsJapgolly.vscodeJsonrpc.mod.Trace, tracer: Tracer, traceOptions: TraceOptions): Unit = js.native
}

