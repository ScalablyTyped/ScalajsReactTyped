package typingsJapgolly.openfin

import typingsJapgolly.node.eventsMod.EventEmitter
import typingsJapgolly.openfin.baseMod.Base
import typingsJapgolly.openfin.identityMod.Identity
import typingsJapgolly.openfin.transportMod.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openfin/_v2/api/interappbus/interappbus", JSImport.Namespace)
@js.native
object interappbusMod extends js.Object {
  @js.native
  class InterAppPayload () extends js.Object {
    var destinationUuid: js.UndefOr[String] = js.native
    var message: js.UndefOr[js.Any] = js.native
    var sourceUuid: String = js.native
    var sourceWindowName: String = js.native
    var topic: String = js.native
  }
  
  @js.native
  trait InterApplicationBus extends Base {
    var Channel: typingsJapgolly.openfin.interappbusChannelMod.Channel = js.native
    var emitSubscriverEvent: js.Any = js.native
    var emitter: EventEmitter = js.native
    var events: AnonSubscriberAdded = js.native
    var on: js.Any = js.native
    var processMessage: js.Any = js.native
    var refCounter: js.Any = js.native
    var removeAllListeners: js.Any = js.native
    /* protected */ def createSubscriptionKey(uuid: String, name: String, topic: String): String = js.native
    /* protected */ def onmessage(message: Message[InterAppPayload]): Boolean = js.native
    /**
      * Publishes a message to all applications running on OpenFin Runtime that
      * are subscribed to the specified topic.
      * @param { string } topic The topic on which the message is sent
      * @param { any } message The message to be published. Can be either a primitive
      * data type (string, number, or boolean) or composite data type (object, array)
      * that is composed of other primitive or composite data types
      * @return {Promise.<void>}
      * @tutorial InterApplicationBus.publish
      */
    def publish(topic: String, message: js.Any): js.Promise[Unit] = js.native
    /**
      * Sends a message to a specific application on a specific topic.
      * @param { Identity } destination The identity of the application to which the message is sent
      * @param { string } topic The topic on which the message is sent
      * @param { any } message The message to be sent. Can be either a primitive data
      * type (string, number, or boolean) or composite data type (object, array) that
      * is composed of other primitive or composite data types
      * @return {Promise.<void>}
      * @tutorial InterApplicationBus.send
      */
    def send(destination: Identity, topic: String, message: js.Any): js.Promise[Unit] = js.native
    /**
      * Subscribes to messages from the specified application on the specified topic.
      * If the subscription is for a uuid, [name], topic combination that has already
      * been published to upon subscription you will receive the last 20 missed messages
      * in the order they were published.
      * @param { Identity } source This object is described in the Identity in the typedef
      * @param { string } topic The topic on which the message is sent
      * @param { function } listener A function that is called when a message has
      * been received. It is passed the message, uuid and name of the sending application.
      * The message can be either a primitive data type (string, number, or boolean) or
      * composite data type (object, array) that is composed of other primitive or composite
      * data types
      * @return {Promise.<void>}
      * @tutorial InterApplicationBus.subscribe
      */
    def subscribe(source: Identity, topic: String, listener: js.Any): js.Promise[Unit] = js.native
    /**
      * Unsubscribes to messages from the specified application on the specified topic.
      * @param { Identity } source This object is described in the Identity in the typedef
      * @param { string } topic The topic on which the message is sent
      * @param { function } listener A callback previously registered with subscribe()
      * @return {Promise.<void>}
      * @tutorial InterApplicationBus.unsubscribe
      */
    def unsubscribe(source: Identity, topic: String, listener: js.Any): js.Promise[Unit] = js.native
  }
  
  @js.native
  class default protected () extends InterApplicationBus {
    def this(wire: typingsJapgolly.openfin.transportMod.default) = this()
  }
  
}

