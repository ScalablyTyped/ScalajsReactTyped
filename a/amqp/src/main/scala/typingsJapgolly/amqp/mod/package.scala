package typingsJapgolly.amqp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Callback[T] = js.Function1[/* value */ T, scala.Unit]
  type SubscribeCallback = js.Function4[
    /* message */ js.Any, 
    /* headers */ org.scalablytyped.runtime.StringDictionary[js.Any], 
    /* deliveryInfo */ typingsJapgolly.amqp.mod.DeliveryInfo, 
    /* ack */ typingsJapgolly.amqp.mod.Ack, 
    scala.Unit
  ]
}
