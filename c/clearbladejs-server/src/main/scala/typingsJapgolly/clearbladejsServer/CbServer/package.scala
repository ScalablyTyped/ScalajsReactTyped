package typingsJapgolly.clearbladejsServer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object CbServer {
  type CbCallback = js.Function2[
    /* error */ scala.Boolean, 
    /* response */ typingsJapgolly.clearbladejsServer.CbServer.Resp_, 
    scala.Unit
  ]
  type ItemOptions = typingsJapgolly.clearbladejsServer.CbServer.CollectionOptionsWithID
  type KeyValuePair = org.scalablytyped.runtime.StringDictionary[js.Any]
  type QueryFilter = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.clearbladejsServer.CbServer.QueryFilterValue]
  type QueryFilterValue = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.clearbladejsServer.CbServer.QueryValue]
  type QueryValue = java.lang.String | scala.Double | scala.Boolean
  type ReqTypes = typingsJapgolly.clearbladejsServer.CbServer.BasicReq
}
