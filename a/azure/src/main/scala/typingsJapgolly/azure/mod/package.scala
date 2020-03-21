package typingsJapgolly.azure

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type CreateTableIfNotExistsCallback = js.Function3[
    /* error */ js.Error, 
    /* created */ scala.Boolean, 
    /* response */ typingsJapgolly.azure.mod.WebResponse, 
    scala.Unit
  ]
  type DeleteEntityCallback = js.Function3[
    /* error */ js.Error, 
    /* successful */ scala.Boolean, 
    /* response */ typingsJapgolly.azure.mod.WebResponse, 
    scala.Unit
  ]
  type DeleteTableCallback = js.Function3[
    /* error */ js.Error, 
    /* successful */ scala.Boolean, 
    /* response */ typingsJapgolly.azure.mod.WebResponse, 
    scala.Unit
  ]
  type Dictionary[T] = org.scalablytyped.runtime.StringDictionary[T]
  type ErrorCallback = js.Function1[/* error */ js.Error, scala.Unit]
  type GetBlobToTextCallback = js.Function4[
    /* err */ js.Error, 
    /* text */ java.lang.String, 
    /* result */ typingsJapgolly.azure.mod.BlobResult, 
    /* response */ typingsJapgolly.azure.mod.WebResponse, 
    scala.Unit
  ]
  type ListBlobsCallback = js.Function4[
    /* err */ js.Error, 
    /* blobs */ js.Array[typingsJapgolly.azure.mod.BlobResult], 
    /* continuationToken */ typingsJapgolly.azure.mod.ContinuationToken, 
    /* response */ typingsJapgolly.azure.mod.WebResponse, 
    scala.Unit
  ]
  type ListContainersCallback = js.Function4[
    /* err */ js.Error, 
    /* containers */ js.Array[typingsJapgolly.azure.mod.ContainerResult], 
    /* continuationToken */ typingsJapgolly.azure.mod.ContinuationToken, 
    /* response */ typingsJapgolly.azure.mod.WebResponse, 
    scala.Unit
  ]
  type ListQueuesCallback = js.Function4[
    /* err */ js.Error, 
    /* queues */ js.Array[typingsJapgolly.azure.mod.QueueResult], 
    /* continuationToken */ typingsJapgolly.azure.mod.ContinuationToken, 
    /* response */ typingsJapgolly.azure.mod.WebResponse, 
    scala.Unit
  ]
  type ModifyEntityCallback = js.Function3[
    /* error */ js.Error, 
    /* entity */ typingsJapgolly.azure.mod.Entity, 
    /* response */ typingsJapgolly.azure.mod.WebResponse, 
    scala.Unit
  ]
  type QueryEntitiesCallback = js.Function4[
    /* error */ js.Error, 
    /* entities */ js.Array[typingsJapgolly.azure.mod.Entity], 
    /* resultContinuation */ typingsJapgolly.azure.mod.QueryEntitiesResultContinuation, 
    /* response */ typingsJapgolly.azure.mod.WebResponse, 
    scala.Unit
  ]
  type QueryEntityCallback = js.Function3[
    /* error */ js.Error, 
    /* entity */ typingsJapgolly.azure.mod.Entity, 
    /* response */ typingsJapgolly.azure.mod.WebResponse, 
    scala.Unit
  ]
  type QueryTablesCallback = js.Function4[
    /* error */ js.Error, 
    /* queryTablesResult */ js.Array[typingsJapgolly.azure.mod.TableResult], 
    /* resultsContinuation */ typingsJapgolly.azure.mod.QueryResultContinuation, 
    /* response */ typingsJapgolly.azure.mod.WebResponse, 
    scala.Unit
  ]
  type SimpleCallback[T] = js.Function2[/* error */ js.Error, /* result */ T, scala.Unit]
  type StorageCallback[T] = js.Function3[
    /* err */ js.Error, 
    /* result */ T, 
    /* response */ typingsJapgolly.azure.mod.WebResponse, 
    scala.Unit
  ]
  type StorageCallbackVoid = js.Function2[/* err */ js.Error, /* response */ typingsJapgolly.azure.mod.WebResponse, scala.Unit]
  type StorageMetadata = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  type StorageServicePropertiesCallback = typingsJapgolly.azure.mod.StorageCallback[typingsJapgolly.azure.mod.StorageServiceProperties]
  type StorageServiceStatsCallback = typingsJapgolly.azure.mod.StorageCallback[typingsJapgolly.azure.mod.StorageServiceStats]
  type TableRequestCallback = js.Function3[
    /* error */ js.Error, 
    /* tableResult */ typingsJapgolly.azure.AnonTableName, 
    /* response */ typingsJapgolly.azure.mod.WebResponse, 
    scala.Unit
  ]
  type ValidatorFunction = js.Function1[/* userSettings */ typingsJapgolly.azure.mod.Dictionary[js.Any], js.Any]
}
