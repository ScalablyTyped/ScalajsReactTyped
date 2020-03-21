package typingsJapgolly.googleCloudCommon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object utilMod {
  type AbortableDuplex = typingsJapgolly.googleCloudCommon.utilMod.Duplexify with typingsJapgolly.googleCloudCommon.utilMod.Abortable
  type BodyResponseCallback = js.Function3[
    /* err */ js.Error | typingsJapgolly.googleCloudCommon.utilMod.ApiError | scala.Null, 
    /* body */ js.UndefOr[typingsJapgolly.googleCloudCommon.utilMod.ResponseBody], 
    /* res */ js.UndefOr[typingsJapgolly.teenyRequest.mod.Response[js.Any]], 
    scala.Unit
  ]
  type OnAuthenticatedCallback = js.Function2[
    /* err */ js.Error | scala.Null, 
    /* reqOpts */ js.UndefOr[typingsJapgolly.googleCloudCommon.utilMod.DecorateRequestOptions], 
    scala.Unit
  ]
  type ResponseBody = js.Any
}
