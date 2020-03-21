package typingsJapgolly.vscodeJsonrpc.mod

import typingsJapgolly.vscodeJsonrpc.Thenable
import typingsJapgolly.vscodeJsonrpc.messagesMod.Message
import typingsJapgolly.vscodeJsonrpc.messagesMod.NotificationMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MessageConnection extends js.Object {
  @JSName("onClose")
  var onClose_Original: typingsJapgolly.vscodeJsonrpc.eventsMod.Event[Unit] = js.native
  @JSName("onDispose")
  var onDispose_Original: typingsJapgolly.vscodeJsonrpc.eventsMod.Event[Unit] = js.native
  @JSName("onError")
  var onError_Original: typingsJapgolly.vscodeJsonrpc.eventsMod.Event[js.Tuple3[js.Error, js.UndefOr[Message], js.UndefOr[Double]]] = js.native
  @JSName("onUnhandledNotification")
  var onUnhandledNotification_Original: typingsJapgolly.vscodeJsonrpc.eventsMod.Event[NotificationMessage] = js.native
  def dispose(): Unit = js.native
  def inspect(): Unit = js.native
  def listen(): Unit = js.native
  def onClose(listener: js.Function1[/* e */ Unit, _]): typingsJapgolly.vscodeJsonrpc.eventsMod.Disposable = js.native
  def onClose(listener: js.Function1[/* e */ Unit, _], thisArgs: js.Any): typingsJapgolly.vscodeJsonrpc.eventsMod.Disposable = js.native
  def onClose(
    listener: js.Function1[/* e */ Unit, _],
    thisArgs: js.Any,
    disposables: js.Array[typingsJapgolly.vscodeJsonrpc.eventsMod.Disposable]
  ): typingsJapgolly.vscodeJsonrpc.eventsMod.Disposable = js.native
  def onDispose(listener: js.Function1[/* e */ Unit, _]): typingsJapgolly.vscodeJsonrpc.eventsMod.Disposable = js.native
  def onDispose(listener: js.Function1[/* e */ Unit, _], thisArgs: js.Any): typingsJapgolly.vscodeJsonrpc.eventsMod.Disposable = js.native
  def onDispose(
    listener: js.Function1[/* e */ Unit, _],
    thisArgs: js.Any,
    disposables: js.Array[typingsJapgolly.vscodeJsonrpc.eventsMod.Disposable]
  ): typingsJapgolly.vscodeJsonrpc.eventsMod.Disposable = js.native
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
  def onNotification(handler: StarNotificationHandler): Unit = js.native
  def onNotification(method: String, handler: GenericNotificationHandler): Unit = js.native
  def onNotification[RO](
    `type`: typingsJapgolly.vscodeJsonrpc.messagesMod.NotificationType0[RO],
    handler: NotificationHandler0
  ): Unit = js.native
  def onNotification[P1, RO](
    `type`: typingsJapgolly.vscodeJsonrpc.messagesMod.NotificationType1[P1, RO],
    handler: NotificationHandler1[P1]
  ): Unit = js.native
  def onNotification[P, RO](
    `type`: typingsJapgolly.vscodeJsonrpc.messagesMod.NotificationType[P, RO],
    handler: NotificationHandler[P]
  ): Unit = js.native
  def onNotification[P1, P2, RO](
    `type`: typingsJapgolly.vscodeJsonrpc.messagesMod.NotificationType2[P1, P2, RO],
    handler: NotificationHandler2[P1, P2]
  ): Unit = js.native
  def onNotification[P1, P2, P3, RO](
    `type`: typingsJapgolly.vscodeJsonrpc.messagesMod.NotificationType3[P1, P2, P3, RO],
    handler: NotificationHandler3[P1, P2, P3]
  ): Unit = js.native
  def onNotification[P1, P2, P3, P4, RO](
    `type`: typingsJapgolly.vscodeJsonrpc.messagesMod.NotificationType4[P1, P2, P3, P4, RO],
    handler: NotificationHandler4[P1, P2, P3, P4]
  ): Unit = js.native
  def onNotification[P1, P2, P3, P4, P5, RO](
    `type`: typingsJapgolly.vscodeJsonrpc.messagesMod.NotificationType5[P1, P2, P3, P4, P5, RO],
    handler: NotificationHandler5[P1, P2, P3, P4, P5]
  ): Unit = js.native
  def onNotification[P1, P2, P3, P4, P5, P6, RO](
    `type`: typingsJapgolly.vscodeJsonrpc.messagesMod.NotificationType6[P1, P2, P3, P4, P5, P6, RO],
    handler: NotificationHandler6[P1, P2, P3, P4, P5, P6]
  ): Unit = js.native
  def onNotification[P1, P2, P3, P4, P5, P6, P7, RO](
    `type`: typingsJapgolly.vscodeJsonrpc.messagesMod.NotificationType7[P1, P2, P3, P4, P5, P6, P7, RO],
    handler: NotificationHandler7[P1, P2, P3, P4, P5, P6, P7]
  ): Unit = js.native
  def onNotification[P1, P2, P3, P4, P5, P6, P7, P8, RO](
    `type`: typingsJapgolly.vscodeJsonrpc.messagesMod.NotificationType8[P1, P2, P3, P4, P5, P6, P7, P8, RO],
    handler: NotificationHandler8[P1, P2, P3, P4, P5, P6, P7, P8]
  ): Unit = js.native
  def onNotification[P1, P2, P3, P4, P5, P6, P7, P8, P9, RO](
    `type`: typingsJapgolly.vscodeJsonrpc.messagesMod.NotificationType9[P1, P2, P3, P4, P5, P6, P7, P8, P9, RO],
    handler: NotificationHandler9[P1, P2, P3, P4, P5, P6, P7, P8, P9]
  ): Unit = js.native
  def onRequest(handler: StarRequestHandler): Unit = js.native
  def onRequest[R, E](method: String, handler: GenericRequestHandler[R, E]): Unit = js.native
  def onRequest[R, E, RO](
    `type`: typingsJapgolly.vscodeJsonrpc.messagesMod.RequestType0[R, E, RO],
    handler: RequestHandler0[R, E]
  ): Unit = js.native
  def onRequest[P1, R, E, RO](
    `type`: typingsJapgolly.vscodeJsonrpc.messagesMod.RequestType1[P1, R, E, RO],
    handler: RequestHandler1[P1, R, E]
  ): Unit = js.native
  def onRequest[P, R, E, RO](
    `type`: typingsJapgolly.vscodeJsonrpc.messagesMod.RequestType[P, R, E, RO],
    handler: RequestHandler[P, R, E]
  ): Unit = js.native
  def onRequest[P1, P2, R, E, RO](
    `type`: typingsJapgolly.vscodeJsonrpc.messagesMod.RequestType2[P1, P2, R, E, RO],
    handler: RequestHandler2[P1, P2, R, E]
  ): Unit = js.native
  def onRequest[P1, P2, P3, R, E, RO](
    `type`: typingsJapgolly.vscodeJsonrpc.messagesMod.RequestType3[P1, P2, P3, R, E, RO],
    handler: RequestHandler3[P1, P2, P3, R, E]
  ): Unit = js.native
  def onRequest[P1, P2, P3, P4, R, E, RO](
    `type`: typingsJapgolly.vscodeJsonrpc.messagesMod.RequestType4[P1, P2, P3, P4, R, E, RO],
    handler: RequestHandler4[P1, P2, P3, P4, R, E]
  ): Unit = js.native
  def onRequest[P1, P2, P3, P4, P5, R, E, RO](
    `type`: typingsJapgolly.vscodeJsonrpc.messagesMod.RequestType5[P1, P2, P3, P4, P5, R, E, RO],
    handler: RequestHandler5[P1, P2, P3, P4, P5, R, E]
  ): Unit = js.native
  def onRequest[P1, P2, P3, P4, P5, P6, R, E, RO](
    `type`: typingsJapgolly.vscodeJsonrpc.messagesMod.RequestType6[P1, P2, P3, P4, P5, P6, R, E, RO],
    handler: RequestHandler6[P1, P2, P3, P4, P5, P6, R, E]
  ): Unit = js.native
  def onRequest[P1, P2, P3, P4, P5, P6, P7, R, E, RO](
    `type`: typingsJapgolly.vscodeJsonrpc.messagesMod.RequestType7[P1, P2, P3, P4, P5, P6, P7, R, E, RO],
    handler: RequestHandler7[P1, P2, P3, P4, P5, P6, P7, R, E]
  ): Unit = js.native
  def onRequest[P1, P2, P3, P4, P5, P6, P7, P8, R, E, RO](
    `type`: typingsJapgolly.vscodeJsonrpc.messagesMod.RequestType8[P1, P2, P3, P4, P5, P6, P7, P8, R, E, RO],
    handler: RequestHandler8[P1, P2, P3, P4, P5, P6, P7, P8, R, E]
  ): Unit = js.native
  def onRequest[P1, P2, P3, P4, P5, P6, P7, P8, P9, R, E, RO](
    `type`: typingsJapgolly.vscodeJsonrpc.messagesMod.RequestType9[P1, P2, P3, P4, P5, P6, P7, P8, P9, R, E, RO],
    handler: RequestHandler9[P1, P2, P3, P4, P5, P6, P7, P8, P9, R, E]
  ): Unit = js.native
  def onUnhandledNotification(listener: js.Function1[/* e */ NotificationMessage, _]): typingsJapgolly.vscodeJsonrpc.eventsMod.Disposable = js.native
  def onUnhandledNotification(listener: js.Function1[/* e */ NotificationMessage, _], thisArgs: js.Any): typingsJapgolly.vscodeJsonrpc.eventsMod.Disposable = js.native
  def onUnhandledNotification(
    listener: js.Function1[/* e */ NotificationMessage, _],
    thisArgs: js.Any,
    disposables: js.Array[typingsJapgolly.vscodeJsonrpc.eventsMod.Disposable]
  ): typingsJapgolly.vscodeJsonrpc.eventsMod.Disposable = js.native
  def sendNotification(method: String, params: js.Any*): Unit = js.native
  def sendNotification[RO](`type`: typingsJapgolly.vscodeJsonrpc.messagesMod.NotificationType0[RO]): Unit = js.native
  def sendNotification[P, RO](`type`: typingsJapgolly.vscodeJsonrpc.messagesMod.NotificationType[P, RO]): Unit = js.native
  def sendNotification[P1, RO](`type`: typingsJapgolly.vscodeJsonrpc.messagesMod.NotificationType1[P1, RO], p1: P1): Unit = js.native
  def sendNotification[P, RO](`type`: typingsJapgolly.vscodeJsonrpc.messagesMod.NotificationType[P, RO], params: P): Unit = js.native
  def sendNotification[P1, P2, RO](`type`: typingsJapgolly.vscodeJsonrpc.messagesMod.NotificationType2[P1, P2, RO], p1: P1, p2: P2): Unit = js.native
  def sendNotification[P1, P2, P3, RO](
    `type`: typingsJapgolly.vscodeJsonrpc.messagesMod.NotificationType3[P1, P2, P3, RO],
    p1: P1,
    p2: P2,
    p3: P3
  ): Unit = js.native
  def sendNotification[P1, P2, P3, P4, RO](
    `type`: typingsJapgolly.vscodeJsonrpc.messagesMod.NotificationType4[P1, P2, P3, P4, RO],
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4
  ): Unit = js.native
  def sendNotification[P1, P2, P3, P4, P5, RO](
    `type`: typingsJapgolly.vscodeJsonrpc.messagesMod.NotificationType5[P1, P2, P3, P4, P5, RO],
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5
  ): Unit = js.native
  def sendNotification[P1, P2, P3, P4, P5, P6, RO](
    `type`: typingsJapgolly.vscodeJsonrpc.messagesMod.NotificationType6[P1, P2, P3, P4, P5, P6, RO],
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6
  ): Unit = js.native
  def sendNotification[P1, P2, P3, P4, P5, P6, P7, RO](
    `type`: typingsJapgolly.vscodeJsonrpc.messagesMod.NotificationType7[P1, P2, P3, P4, P5, P6, P7, RO],
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7
  ): Unit = js.native
  def sendNotification[P1, P2, P3, P4, P5, P6, P7, P8, RO](
    `type`: typingsJapgolly.vscodeJsonrpc.messagesMod.NotificationType8[P1, P2, P3, P4, P5, P6, P7, P8, RO],
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8
  ): Unit = js.native
  def sendNotification[P1, P2, P3, P4, P5, P6, P7, P8, P9, RO](
    `type`: typingsJapgolly.vscodeJsonrpc.messagesMod.NotificationType9[P1, P2, P3, P4, P5, P6, P7, P8, P9, RO],
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9
  ): Unit = js.native
  def sendRequest[R](method: String, params: js.Any*): Thenable[R] = js.native
  def sendRequest[R, E, RO](`type`: typingsJapgolly.vscodeJsonrpc.messagesMod.RequestType0[R, E, RO]): Thenable[R] = js.native
  def sendRequest[R, E, RO](
    `type`: typingsJapgolly.vscodeJsonrpc.messagesMod.RequestType0[R, E, RO],
    token: typingsJapgolly.vscodeJsonrpc.cancellationMod.CancellationToken
  ): Thenable[R] = js.native
  def sendRequest[P1, R, E, RO](`type`: typingsJapgolly.vscodeJsonrpc.messagesMod.RequestType1[P1, R, E, RO], p1: P1): Thenable[R] = js.native
  def sendRequest[P1, R, E, RO](
    `type`: typingsJapgolly.vscodeJsonrpc.messagesMod.RequestType1[P1, R, E, RO],
    p1: P1,
    token: typingsJapgolly.vscodeJsonrpc.cancellationMod.CancellationToken
  ): Thenable[R] = js.native
  def sendRequest[P, R, E, RO](`type`: typingsJapgolly.vscodeJsonrpc.messagesMod.RequestType[P, R, E, RO], params: P): Thenable[R] = js.native
  def sendRequest[P, R, E, RO](
    `type`: typingsJapgolly.vscodeJsonrpc.messagesMod.RequestType[P, R, E, RO],
    params: P,
    token: typingsJapgolly.vscodeJsonrpc.cancellationMod.CancellationToken
  ): Thenable[R] = js.native
  def sendRequest[P1, P2, R, E, RO](`type`: typingsJapgolly.vscodeJsonrpc.messagesMod.RequestType2[P1, P2, R, E, RO], p1: P1, p2: P2): Thenable[R] = js.native
  def sendRequest[P1, P2, R, E, RO](
    `type`: typingsJapgolly.vscodeJsonrpc.messagesMod.RequestType2[P1, P2, R, E, RO],
    p1: P1,
    p2: P2,
    token: typingsJapgolly.vscodeJsonrpc.cancellationMod.CancellationToken
  ): Thenable[R] = js.native
  def sendRequest[P1, P2, P3, R, E, RO](
    `type`: typingsJapgolly.vscodeJsonrpc.messagesMod.RequestType3[P1, P2, P3, R, E, RO],
    p1: P1,
    p2: P2,
    p3: P3
  ): Thenable[R] = js.native
  def sendRequest[P1, P2, P3, R, E, RO](
    `type`: typingsJapgolly.vscodeJsonrpc.messagesMod.RequestType3[P1, P2, P3, R, E, RO],
    p1: P1,
    p2: P2,
    p3: P3,
    token: typingsJapgolly.vscodeJsonrpc.cancellationMod.CancellationToken
  ): Thenable[R] = js.native
  def sendRequest[P1, P2, P3, P4, R, E, RO](
    `type`: typingsJapgolly.vscodeJsonrpc.messagesMod.RequestType4[P1, P2, P3, P4, R, E, RO],
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4
  ): Thenable[R] = js.native
  def sendRequest[P1, P2, P3, P4, R, E, RO](
    `type`: typingsJapgolly.vscodeJsonrpc.messagesMod.RequestType4[P1, P2, P3, P4, R, E, RO],
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    token: typingsJapgolly.vscodeJsonrpc.cancellationMod.CancellationToken
  ): Thenable[R] = js.native
  def sendRequest[P1, P2, P3, P4, P5, R, E, RO](
    `type`: typingsJapgolly.vscodeJsonrpc.messagesMod.RequestType5[P1, P2, P3, P4, P5, R, E, RO],
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5
  ): Thenable[R] = js.native
  def sendRequest[P1, P2, P3, P4, P5, R, E, RO](
    `type`: typingsJapgolly.vscodeJsonrpc.messagesMod.RequestType5[P1, P2, P3, P4, P5, R, E, RO],
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    token: typingsJapgolly.vscodeJsonrpc.cancellationMod.CancellationToken
  ): Thenable[R] = js.native
  def sendRequest[P1, P2, P3, P4, P5, P6, R, E, RO](
    `type`: typingsJapgolly.vscodeJsonrpc.messagesMod.RequestType6[P1, P2, P3, P4, P5, P6, R, E, RO],
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6
  ): Thenable[R] = js.native
  def sendRequest[P1, P2, P3, P4, P5, P6, R, E, RO](
    `type`: typingsJapgolly.vscodeJsonrpc.messagesMod.RequestType6[P1, P2, P3, P4, P5, P6, R, E, RO],
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    token: typingsJapgolly.vscodeJsonrpc.cancellationMod.CancellationToken
  ): Thenable[R] = js.native
  def sendRequest[P1, P2, P3, P4, P5, P6, P7, R, E, RO](
    `type`: typingsJapgolly.vscodeJsonrpc.messagesMod.RequestType7[P1, P2, P3, P4, P5, P6, P7, R, E, RO],
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7
  ): Thenable[R] = js.native
  def sendRequest[P1, P2, P3, P4, P5, P6, P7, R, E, RO](
    `type`: typingsJapgolly.vscodeJsonrpc.messagesMod.RequestType7[P1, P2, P3, P4, P5, P6, P7, R, E, RO],
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    token: typingsJapgolly.vscodeJsonrpc.cancellationMod.CancellationToken
  ): Thenable[R] = js.native
  def sendRequest[P1, P2, P3, P4, P5, P6, P7, P8, R, E, RO](
    `type`: typingsJapgolly.vscodeJsonrpc.messagesMod.RequestType8[P1, P2, P3, P4, P5, P6, P7, P8, R, E, RO],
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8
  ): Thenable[R] = js.native
  def sendRequest[P1, P2, P3, P4, P5, P6, P7, P8, R, E, RO](
    `type`: typingsJapgolly.vscodeJsonrpc.messagesMod.RequestType8[P1, P2, P3, P4, P5, P6, P7, P8, R, E, RO],
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
    token: typingsJapgolly.vscodeJsonrpc.cancellationMod.CancellationToken
  ): Thenable[R] = js.native
  def sendRequest[P1, P2, P3, P4, P5, P6, P7, P8, P9, R, E, RO](
    `type`: typingsJapgolly.vscodeJsonrpc.messagesMod.RequestType9[P1, P2, P3, P4, P5, P6, P7, P8, P9, R, E, RO],
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9
  ): Thenable[R] = js.native
  def sendRequest[P1, P2, P3, P4, P5, P6, P7, P8, P9, R, E, RO](
    `type`: typingsJapgolly.vscodeJsonrpc.messagesMod.RequestType9[P1, P2, P3, P4, P5, P6, P7, P8, P9, R, E, RO],
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
    token: typingsJapgolly.vscodeJsonrpc.cancellationMod.CancellationToken
  ): Thenable[R] = js.native
  def trace(value: Trace, tracer: Tracer): Unit = js.native
  def trace(value: Trace, tracer: Tracer, sendNotification: Boolean): Unit = js.native
  def trace(value: Trace, tracer: Tracer, traceOptions: TraceOptions): Unit = js.native
}

