package typingsJapgolly.googleCloudDatastore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object queryMod {
  type MoreResultsAfterCursor = typingsJapgolly.googleCloudDatastore.googleCloudDatastoreStrings.MORE_RESULTS_AFTER_CURSOR
  type MoreResultsAfterLimit = typingsJapgolly.googleCloudDatastore.googleCloudDatastoreStrings.MORE_RESULTS_AFTER_LIMIT
  type NoMoreResults = typingsJapgolly.googleCloudDatastore.googleCloudDatastoreStrings.NO_MORE_RESULTS
  type QueryCallback = js.Function3[
    /* err */ js.Error, 
    /* entities */ js.Array[js.Object], 
    /* info */ typingsJapgolly.googleCloudDatastore.queryMod.QueryInfo, 
    scala.Unit
  ]
  type QueryResult = js.Tuple2[js.Array[js.Object], typingsJapgolly.googleCloudDatastore.queryMod.QueryInfo]
}
