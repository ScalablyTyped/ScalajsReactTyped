package typingsJapgolly.stellarSdk.horizonApiMod.Horizon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseResponse[T /* <: String */] extends js.Object {
  var _links: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in T | 'self' ]: stellar-sdk.stellar-sdk/lib/horizon_api.Horizon.ResponseLink}
    */ typingsJapgolly.stellarSdk.stellarSdkStrings.BaseResponse with js.Any
}

object BaseResponse {
  @scala.inline
  def apply[T /* <: String */](
    _links: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in T | 'self' ]: stellar-sdk.stellar-sdk/lib/horizon_api.Horizon.ResponseLink}
    */ typingsJapgolly.stellarSdk.stellarSdkStrings.BaseResponse with js.Any
  ): BaseResponse[T] = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BaseResponse[T]]
  }
}

