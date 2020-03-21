package typingsJapgolly.googleCloudDatastore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object requestMod {
  type AllocateIdsCallback = js.Function2[
    /* err */ js.Error, 
    /* keys */ js.Array[typingsJapgolly.googleCloudDatastore.entityMod.DatastoreKey], 
    scala.Unit
  ]
  type AllocateIdsResult = js.Array[js.Array[typingsJapgolly.googleCloudDatastore.entityMod.DatastoreKey]]
  type CommitCallback = js.Function2[
    /* err */ js.Error, 
    /* result */ typingsJapgolly.googleCloudDatastore.requestMod.CommitResponse, 
    scala.Unit
  ]
  type CommitResult = js.Array[typingsJapgolly.googleCloudDatastore.requestMod.CommitResponse]
  type GetCallback[T] = js.Function2[/* err */ js.Error, /* entity */ T, scala.Unit]
}
