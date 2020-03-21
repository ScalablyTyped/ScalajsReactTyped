package typingsJapgolly.googleapisCommon

import typingsJapgolly.gaxios.commonMod.GaxiosPromise
import typingsJapgolly.googleapisCommon.apiMod.APIRequestParams
import typingsJapgolly.googleapisCommon.apiMod.BodyResponseCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis-common/build/src/apirequest", JSImport.Namespace)
@js.native
object apirequestMod extends js.Object {
  def createAPIRequest[T](parameters: APIRequestParams[_]): GaxiosPromise[T] = js.native
  def createAPIRequest[T](parameters: APIRequestParams[_], callback: BodyResponseCallback[T]): Unit = js.native
}

