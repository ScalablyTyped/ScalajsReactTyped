package typingsJapgolly.rsmq.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.rsmq.rsmqNumbers.`0`
import typingsJapgolly.rsmq.rsmqNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*~ Write your module's methods and properties in this class */
trait RedisSMQ extends js.Object {
  def changeMessageVisibility(opts: ChangeMessageVisibilityOptions, cb: Callback[`0` | `1`]): Unit
  def changeMessageVisibilityAsync(opts: ChangeMessageVisibilityOptions): js.Promise[`0` | `1`]
  def createQueueAsync(opts: CreateQueueOptions): js.Promise[`1`]
  @JSName("createQueue")
  def createQueue_1(opts: CreateQueueOptions, cb: Callback[`1`]): Unit
  def deleteMessage(opts: DeleteMessageOptions, cb: Callback[`0` | `1`]): Unit
  def deleteMessageAsync(opts: DeleteMessageOptions): js.Promise[`0` | `1`]
  def deleteQueueAsync(opts: DeleteQueueOptions): js.Promise[`1`]
  @JSName("deleteQueue")
  def deleteQueue_1(opts: DeleteQueueOptions, cb: Callback[`1`]): Unit
  def getQueueAttributes(opts: GetQueueAttributesOptions, cb: Callback[QueueAttributes]): Unit
  def getQueueAttributesAsync(opts: GetQueueAttributesOptions): js.Promise[QueueAttributes]
  def listQueues(cb: Callback[js.Array[String]]): Unit
  def listQueuesAsync(): js.Promise[js.Array[String]]
  def popMessage(opts: PopMessageOptions, cb: Callback[QueueMessage | js.Object]): Unit
  def popMessageAsync(opts: PopMessageOptions): js.Promise[QueueMessage | js.Object]
  def quit(): Unit
  def receiveMessage(opts: ReceiveMessageOptions, cb: Callback[QueueMessage | js.Object]): Unit
  def receiveMessageAsync(opts: ReceiveMessageOptions): js.Promise[QueueMessage | js.Object]
  def sendMessage(opts: SendMessageOptions, cb: Callback[Double]): Unit
  def sendMessageAsync(opts: SendMessageOptions): js.Promise[Double]
  def setQueueAttributes(opts: SetQueueAttributesOptions, cb: Callback[QueueAttributes]): Unit
  def setQueueAttributesAsync(opts: SetQueueAttributesOptions): js.Promise[QueueAttributes]
}

object RedisSMQ {
  @scala.inline
  def apply(
    changeMessageVisibility: (ChangeMessageVisibilityOptions, Callback[`0` | `1`]) => japgolly.scalajs.react.Callback,
    changeMessageVisibilityAsync: ChangeMessageVisibilityOptions => CallbackTo[js.Promise[`0` | `1`]],
    createQueue: (CreateQueueOptions, Callback[`1`]) => japgolly.scalajs.react.Callback,
    createQueueAsync: CreateQueueOptions => CallbackTo[js.Promise[`1`]],
    deleteMessage: (DeleteMessageOptions, Callback[`0` | `1`]) => japgolly.scalajs.react.Callback,
    deleteMessageAsync: DeleteMessageOptions => CallbackTo[js.Promise[`0` | `1`]],
    deleteQueue: (DeleteQueueOptions, Callback[`1`]) => japgolly.scalajs.react.Callback,
    deleteQueueAsync: DeleteQueueOptions => CallbackTo[js.Promise[`1`]],
    getQueueAttributes: (GetQueueAttributesOptions, Callback[QueueAttributes]) => japgolly.scalajs.react.Callback,
    getQueueAttributesAsync: GetQueueAttributesOptions => CallbackTo[js.Promise[QueueAttributes]],
    listQueues: Callback[js.Array[String]] => japgolly.scalajs.react.Callback,
    listQueuesAsync: CallbackTo[js.Promise[js.Array[String]]],
    popMessage: (PopMessageOptions, Callback[QueueMessage | js.Object]) => japgolly.scalajs.react.Callback,
    popMessageAsync: PopMessageOptions => CallbackTo[js.Promise[QueueMessage | js.Object]],
    quit: japgolly.scalajs.react.Callback,
    receiveMessage: (ReceiveMessageOptions, Callback[QueueMessage | js.Object]) => japgolly.scalajs.react.Callback,
    receiveMessageAsync: ReceiveMessageOptions => CallbackTo[js.Promise[QueueMessage | js.Object]],
    sendMessage: (SendMessageOptions, Callback[Double]) => japgolly.scalajs.react.Callback,
    sendMessageAsync: SendMessageOptions => CallbackTo[js.Promise[Double]],
    setQueueAttributes: (SetQueueAttributesOptions, Callback[QueueAttributes]) => japgolly.scalajs.react.Callback,
    setQueueAttributesAsync: SetQueueAttributesOptions => CallbackTo[js.Promise[QueueAttributes]]
  ): RedisSMQ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("changeMessageVisibility")(js.Any.fromFunction2((t0: typingsJapgolly.rsmq.mod.ChangeMessageVisibilityOptions, t1: typingsJapgolly.rsmq.mod.Callback[typingsJapgolly.rsmq.rsmqNumbers.`0` | typingsJapgolly.rsmq.rsmqNumbers.`1`]) => changeMessageVisibility(t0, t1).runNow()))
    __obj.updateDynamic("changeMessageVisibilityAsync")(js.Any.fromFunction1((t0: typingsJapgolly.rsmq.mod.ChangeMessageVisibilityOptions) => changeMessageVisibilityAsync(t0).runNow()))
    __obj.updateDynamic("createQueue")(js.Any.fromFunction2((t0: typingsJapgolly.rsmq.mod.CreateQueueOptions, t1: typingsJapgolly.rsmq.mod.Callback[typingsJapgolly.rsmq.rsmqNumbers.`1`]) => createQueue(t0, t1).runNow()))
    __obj.updateDynamic("createQueueAsync")(js.Any.fromFunction1((t0: typingsJapgolly.rsmq.mod.CreateQueueOptions) => createQueueAsync(t0).runNow()))
    __obj.updateDynamic("deleteMessage")(js.Any.fromFunction2((t0: typingsJapgolly.rsmq.mod.DeleteMessageOptions, t1: typingsJapgolly.rsmq.mod.Callback[typingsJapgolly.rsmq.rsmqNumbers.`0` | typingsJapgolly.rsmq.rsmqNumbers.`1`]) => deleteMessage(t0, t1).runNow()))
    __obj.updateDynamic("deleteMessageAsync")(js.Any.fromFunction1((t0: typingsJapgolly.rsmq.mod.DeleteMessageOptions) => deleteMessageAsync(t0).runNow()))
    __obj.updateDynamic("deleteQueue")(js.Any.fromFunction2((t0: typingsJapgolly.rsmq.mod.DeleteQueueOptions, t1: typingsJapgolly.rsmq.mod.Callback[typingsJapgolly.rsmq.rsmqNumbers.`1`]) => deleteQueue(t0, t1).runNow()))
    __obj.updateDynamic("deleteQueueAsync")(js.Any.fromFunction1((t0: typingsJapgolly.rsmq.mod.DeleteQueueOptions) => deleteQueueAsync(t0).runNow()))
    __obj.updateDynamic("getQueueAttributes")(js.Any.fromFunction2((t0: typingsJapgolly.rsmq.mod.GetQueueAttributesOptions, t1: typingsJapgolly.rsmq.mod.Callback[typingsJapgolly.rsmq.mod.QueueAttributes]) => getQueueAttributes(t0, t1).runNow()))
    __obj.updateDynamic("getQueueAttributesAsync")(js.Any.fromFunction1((t0: typingsJapgolly.rsmq.mod.GetQueueAttributesOptions) => getQueueAttributesAsync(t0).runNow()))
    __obj.updateDynamic("listQueues")(js.Any.fromFunction1((t0: typingsJapgolly.rsmq.mod.Callback[js.Array[java.lang.String]]) => listQueues(t0).runNow()))
    __obj.updateDynamic("listQueuesAsync")(listQueuesAsync.toJsFn)
    __obj.updateDynamic("popMessage")(js.Any.fromFunction2((t0: typingsJapgolly.rsmq.mod.PopMessageOptions, t1: typingsJapgolly.rsmq.mod.Callback[typingsJapgolly.rsmq.mod.QueueMessage | js.Object]) => popMessage(t0, t1).runNow()))
    __obj.updateDynamic("popMessageAsync")(js.Any.fromFunction1((t0: typingsJapgolly.rsmq.mod.PopMessageOptions) => popMessageAsync(t0).runNow()))
    __obj.updateDynamic("quit")(quit.toJsFn)
    __obj.updateDynamic("receiveMessage")(js.Any.fromFunction2((t0: typingsJapgolly.rsmq.mod.ReceiveMessageOptions, t1: typingsJapgolly.rsmq.mod.Callback[typingsJapgolly.rsmq.mod.QueueMessage | js.Object]) => receiveMessage(t0, t1).runNow()))
    __obj.updateDynamic("receiveMessageAsync")(js.Any.fromFunction1((t0: typingsJapgolly.rsmq.mod.ReceiveMessageOptions) => receiveMessageAsync(t0).runNow()))
    __obj.updateDynamic("sendMessage")(js.Any.fromFunction2((t0: typingsJapgolly.rsmq.mod.SendMessageOptions, t1: typingsJapgolly.rsmq.mod.Callback[scala.Double]) => sendMessage(t0, t1).runNow()))
    __obj.updateDynamic("sendMessageAsync")(js.Any.fromFunction1((t0: typingsJapgolly.rsmq.mod.SendMessageOptions) => sendMessageAsync(t0).runNow()))
    __obj.updateDynamic("setQueueAttributes")(js.Any.fromFunction2((t0: typingsJapgolly.rsmq.mod.SetQueueAttributesOptions, t1: typingsJapgolly.rsmq.mod.Callback[typingsJapgolly.rsmq.mod.QueueAttributes]) => setQueueAttributes(t0, t1).runNow()))
    __obj.updateDynamic("setQueueAttributesAsync")(js.Any.fromFunction1((t0: typingsJapgolly.rsmq.mod.SetQueueAttributesOptions) => setQueueAttributesAsync(t0).runNow()))
    __obj.asInstanceOf[RedisSMQ]
  }
}

