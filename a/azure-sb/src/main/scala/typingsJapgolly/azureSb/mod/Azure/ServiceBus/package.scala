package typingsJapgolly.azureSb.mod.Azure

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ServiceBus {
  type DateString = java.lang.String
  type Dictionary[T] = org.scalablytyped.runtime.StringDictionary[T]
  type Duration = java.lang.String
  type MessageOrName = typingsJapgolly.azureSb.mod.Azure.ServiceBus.Message | java.lang.String
  type ReceiveSubscriptionMessageOptions = typingsJapgolly.azureSb.mod.Azure.ServiceBus.ReceiveQueueMessageOptions
  type ResponseCallback = js.Function2[
    /* error */ js.Error | scala.Null, 
    /* response */ typingsJapgolly.azureSb.mod.Azure.ServiceBus.Response, 
    scala.Unit
  ]
  type ResultAndResponseCallback = js.Function3[
    /* error */ js.Error | scala.Null, 
    /* result */ scala.Boolean | typingsJapgolly.azureSb.mod.Azure.ServiceBus.Results.Models.Base | js.Array[typingsJapgolly.azureSb.mod.Azure.ServiceBus.Results.Models.Base], 
    /* response */ typingsJapgolly.azureSb.mod.Azure.ServiceBus.Response, 
    scala.Unit
  ]
  type TypedResultAndResponseCallback[T] = js.Function3[
    /* error */ js.Error | scala.Null, 
    /* result */ T, 
    /* response */ typingsJapgolly.azureSb.mod.Azure.ServiceBus.Response, 
    scala.Unit
  ]
}
