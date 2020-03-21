package typingsJapgolly.googleCloudStorage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object storageMod {
  type BucketCallback = js.Function3[
    /* err */ js.Error | scala.Null, 
    /* bucket */ js.UndefOr[typingsJapgolly.googleCloudStorage.bucketMod.Bucket | scala.Null], 
    /* apiResponse */ js.UndefOr[typingsJapgolly.googleCloudCommon.serviceObjectMod.Metadata], 
    scala.Unit
  ]
  type CreateBucketResponse = js.Tuple2[
    typingsJapgolly.googleCloudStorage.bucketMod.Bucket, 
    typingsJapgolly.googleCloudCommon.serviceObjectMod.Metadata
  ]
  type CreateHmacKeyCallback = js.Function4[
    /* err */ js.Error | scala.Null, 
    /* hmacKey */ js.UndefOr[typingsJapgolly.googleCloudStorage.hmacKeyMod.HmacKey | scala.Null], 
    /* secret */ js.UndefOr[java.lang.String | scala.Null], 
    /* apiResponse */ js.UndefOr[typingsJapgolly.googleCloudStorage.storageMod.HmacKeyResourceResponse], 
    scala.Unit
  ]
  type CreateHmacKeyResponse = js.Tuple3[
    typingsJapgolly.googleCloudStorage.hmacKeyMod.HmacKey, 
    java.lang.String, 
    typingsJapgolly.googleCloudStorage.storageMod.HmacKeyResourceResponse
  ]
  type GetBucketsCallback = js.Function4[
    /* err */ js.Error | scala.Null, 
    /* buckets */ js.Array[typingsJapgolly.googleCloudStorage.bucketMod.Bucket], 
    /* nextQuery */ js.UndefOr[js.Object], 
    /* apiResponse */ js.UndefOr[typingsJapgolly.googleCloudCommon.serviceObjectMod.Metadata], 
    scala.Unit
  ]
  type GetBucketsResponse = js.Tuple3[
    js.Array[typingsJapgolly.googleCloudStorage.bucketMod.Bucket], 
    js.Object, 
    typingsJapgolly.googleCloudCommon.serviceObjectMod.Metadata
  ]
  type GetHmacKeysCallback = js.Function4[
    /* err */ js.Error | scala.Null, 
    /* hmacKeys */ js.Array[typingsJapgolly.googleCloudStorage.hmacKeyMod.HmacKey] | scala.Null, 
    /* nextQuery */ js.UndefOr[js.Object], 
    /* apiResponse */ js.UndefOr[typingsJapgolly.googleCloudCommon.serviceObjectMod.Metadata], 
    scala.Unit
  ]
  type GetHmacKeysResponse = js.Array[js.Array[typingsJapgolly.googleCloudStorage.hmacKeyMod.HmacKey]]
  type GetServiceAccountCallback = js.Function3[
    /* err */ js.Error | scala.Null, 
    /* serviceAccount */ js.UndefOr[typingsJapgolly.googleCloudStorage.storageMod.ServiceAccount], 
    /* apiResponse */ js.UndefOr[typingsJapgolly.googleCloudCommon.serviceObjectMod.Metadata], 
    scala.Unit
  ]
  type GetServiceAccountResponse = js.Tuple2[
    typingsJapgolly.googleCloudStorage.storageMod.ServiceAccount, 
    typingsJapgolly.googleCloudCommon.serviceObjectMod.Metadata
  ]
}
