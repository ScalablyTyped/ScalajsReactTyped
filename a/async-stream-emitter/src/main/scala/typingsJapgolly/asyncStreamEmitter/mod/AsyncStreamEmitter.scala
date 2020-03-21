package typingsJapgolly.asyncStreamEmitter.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.writableConsumableStream.consumerMod.ConsumerStats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsyncStreamEmitter[T] extends js.Object {
  def closeAllListeners(): Unit
  def closeListener(eventName: String): Unit
  def emit(eventName: String, data: T): Unit
  def getAllListenersBackpressure(): Double
  def getAllListenersConsumerStatsList(): js.Array[ConsumerStats]
  def getListenerBackpressure(eventName: String): Double
  def getListenerConsumerBackpressure(consumerId: Double): Double
  def getListenerConsumerStats(consumerId: Double): ConsumerStats
  def getListenerConsumerStatsList(eventName: String): js.Array[ConsumerStats]
  def hasAnyListenerConsumer(consumerId: Double): Boolean
  def hasListenerConsumer(eventName: String, consumerId: Double): Boolean
  def killAllListeners(): Unit
  def killListener(eventName: String): Unit
  def killListenerConsumer(consumerId: Double): Unit
  def listener(eventName: String): typingsJapgolly.consumableStream.mod.^[T]
}

object AsyncStreamEmitter {
  @scala.inline
  def apply[T](
    closeAllListeners: Callback,
    closeListener: String => Callback,
    emit: (String, T) => Callback,
    getAllListenersBackpressure: CallbackTo[Double],
    getAllListenersConsumerStatsList: CallbackTo[js.Array[ConsumerStats]],
    getListenerBackpressure: String => CallbackTo[Double],
    getListenerConsumerBackpressure: Double => CallbackTo[Double],
    getListenerConsumerStats: Double => CallbackTo[ConsumerStats],
    getListenerConsumerStatsList: String => CallbackTo[js.Array[ConsumerStats]],
    hasAnyListenerConsumer: Double => CallbackTo[Boolean],
    hasListenerConsumer: (String, Double) => CallbackTo[Boolean],
    killAllListeners: Callback,
    killListener: String => Callback,
    killListenerConsumer: Double => Callback,
    listener: String => CallbackTo[typingsJapgolly.consumableStream.mod.^[T]]
  ): AsyncStreamEmitter[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("closeAllListeners")(closeAllListeners.toJsFn)
    __obj.updateDynamic("closeListener")(js.Any.fromFunction1((t0: java.lang.String) => closeListener(t0).runNow()))
    __obj.updateDynamic("emit")(js.Any.fromFunction2((t0: java.lang.String, t1: T) => emit(t0, t1).runNow()))
    __obj.updateDynamic("getAllListenersBackpressure")(getAllListenersBackpressure.toJsFn)
    __obj.updateDynamic("getAllListenersConsumerStatsList")(getAllListenersConsumerStatsList.toJsFn)
    __obj.updateDynamic("getListenerBackpressure")(js.Any.fromFunction1((t0: java.lang.String) => getListenerBackpressure(t0).runNow()))
    __obj.updateDynamic("getListenerConsumerBackpressure")(js.Any.fromFunction1((t0: scala.Double) => getListenerConsumerBackpressure(t0).runNow()))
    __obj.updateDynamic("getListenerConsumerStats")(js.Any.fromFunction1((t0: scala.Double) => getListenerConsumerStats(t0).runNow()))
    __obj.updateDynamic("getListenerConsumerStatsList")(js.Any.fromFunction1((t0: java.lang.String) => getListenerConsumerStatsList(t0).runNow()))
    __obj.updateDynamic("hasAnyListenerConsumer")(js.Any.fromFunction1((t0: scala.Double) => hasAnyListenerConsumer(t0).runNow()))
    __obj.updateDynamic("hasListenerConsumer")(js.Any.fromFunction2((t0: java.lang.String, t1: scala.Double) => hasListenerConsumer(t0, t1).runNow()))
    __obj.updateDynamic("killAllListeners")(killAllListeners.toJsFn)
    __obj.updateDynamic("killListener")(js.Any.fromFunction1((t0: java.lang.String) => killListener(t0).runNow()))
    __obj.updateDynamic("killListenerConsumer")(js.Any.fromFunction1((t0: scala.Double) => killListenerConsumer(t0).runNow()))
    __obj.updateDynamic("listener")(js.Any.fromFunction1((t0: java.lang.String) => listener(t0).runNow()))
    __obj.asInstanceOf[AsyncStreamEmitter[T]]
  }
}

