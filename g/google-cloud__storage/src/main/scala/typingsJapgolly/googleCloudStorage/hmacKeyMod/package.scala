package typingsJapgolly.googleCloudStorage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object hmacKeyMod {
  type HmacKeyMetadataCallback = js.Function3[
    /* err */ js.Error | scala.Null, 
    /* metadata */ js.UndefOr[typingsJapgolly.googleCloudStorage.hmacKeyMod.HmacKeyMetadata], 
    /* apiResponse */ js.UndefOr[typingsJapgolly.googleCloudCommon.serviceObjectMod.Metadata], 
    scala.Unit
  ]
  type HmacKeyMetadataResponse = js.Tuple2[
    typingsJapgolly.googleCloudStorage.hmacKeyMod.HmacKeyMetadata, 
    typingsJapgolly.googleCloudCommon.serviceObjectMod.Metadata
  ]
}
