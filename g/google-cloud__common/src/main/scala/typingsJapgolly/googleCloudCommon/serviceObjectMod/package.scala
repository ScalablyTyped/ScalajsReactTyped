package typingsJapgolly.googleCloudCommon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object serviceObjectMod {
  type CreateCallback[T] = js.Function3[
    /* err */ typingsJapgolly.googleCloudCommon.utilMod.ApiError | scala.Null, 
    /* instance */ js.UndefOr[T | scala.Null], 
    /* repeated */ js.Any, 
    scala.Unit
  ]
  type CreateResponse[T] = js.Array[js.Any]
  type DeleteCallback = js.Function2[
    /* err */ js.Error | scala.Null, 
    /* apiResponse */ js.UndefOr[typingsJapgolly.teenyRequest.mod.Response[js.Any]], 
    scala.Unit
  ]
  type DeleteOptions = js.Object
  type ExistsCallback = js.Function2[/* err */ js.Error | scala.Null, /* exists */ js.UndefOr[scala.Boolean], scala.Unit]
  type ExistsOptions = js.Object
  type GetMetadataOptions = js.Object
  type GetOrCreateOptions = typingsJapgolly.googleCloudCommon.serviceObjectMod.GetConfig with typingsJapgolly.googleCloudCommon.serviceObjectMod.CreateOptions
  type GetResponse[T] = js.Tuple2[T, typingsJapgolly.teenyRequest.mod.Response[js.Any]]
  type InstanceResponseCallback[T] = js.Function3[
    /* err */ typingsJapgolly.googleCloudCommon.utilMod.ApiError | scala.Null, 
    /* instance */ js.UndefOr[T | scala.Null], 
    /* apiResponse */ js.UndefOr[typingsJapgolly.teenyRequest.mod.Response[js.Any]], 
    scala.Unit
  ]
  type Metadata = js.Any
  type MetadataCallback = js.Function3[
    /* err */ js.Error | scala.Null, 
    /* metadata */ js.UndefOr[typingsJapgolly.googleCloudCommon.serviceObjectMod.Metadata], 
    /* apiResponse */ js.UndefOr[typingsJapgolly.teenyRequest.mod.Response[js.Any]], 
    scala.Unit
  ]
  type MetadataResponse = js.Tuple2[
    typingsJapgolly.googleCloudCommon.serviceObjectMod.Metadata, 
    typingsJapgolly.teenyRequest.mod.Response[js.Any]
  ]
  type Methods = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.googleCloudCommon.AnonReqOpts | scala.Boolean]
  type RequestResponse = js.Tuple2[
    typingsJapgolly.googleCloudCommon.serviceObjectMod.Metadata, 
    typingsJapgolly.teenyRequest.mod.Response[js.Any]
  ]
  type ResponseCallback = js.Function2[
    /* err */ js.UndefOr[js.Error | scala.Null], 
    /* apiResponse */ js.UndefOr[typingsJapgolly.teenyRequest.mod.Response[js.Any]], 
    scala.Unit
  ]
  type SetMetadataOptions = js.Object
  type SetMetadataResponse = js.Array[typingsJapgolly.googleCloudCommon.serviceObjectMod.Metadata]
}
