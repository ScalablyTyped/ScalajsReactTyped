package typingsJapgolly.clearbladejsClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object CbClient {
  type CbCallback = js.Function2[
    /* error */ scala.Boolean, 
    /* response */ typingsJapgolly.clearbladejsClient.CbClient.Resp, 
    scala.Unit
  ]
  type ItemOptions = typingsJapgolly.clearbladejsClient.CbClient.CollectionOptionsWithID
  type MessageCallback = js.Function1[/* message */ java.lang.String, scala.Unit]
  type QueryFilter = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.clearbladejsClient.CbClient.QueryFilterValue]
  type QueryFilterValue = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.clearbladejsClient.CbClient.QueryValue]
  type QueryValue = java.lang.String | scala.Double | scala.Boolean
}
