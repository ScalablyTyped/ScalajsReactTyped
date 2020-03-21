package typingsJapgolly.scBroker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object scbrokerMod {
  type PublishMiddleware = js.Function1[/* req */ typingsJapgolly.scBroker.scbrokerMod.PublishMiddlewareData, scala.Unit]
  type QueryFunction = js.Function3[
    /* dataMap */ typingsJapgolly.fleximap.mod.FlexiMap, 
    /* dataExpirer */ typingsJapgolly.expirymanager.mod.ExpiryManager, 
    /* subscriptions */ typingsJapgolly.scBroker.scbrokerMod.Subscriptions, 
    js.Any
  ]
  type SubscribeMiddleware = js.Function1[/* req */ typingsJapgolly.scBroker.scbrokerMod.SubscribeMiddlewareData, scala.Unit]
  type Subscriptions = org.scalablytyped.runtime.NumberDictionary[org.scalablytyped.runtime.StringDictionary[typingsJapgolly.ncom.mod.ComSocket]]
}
