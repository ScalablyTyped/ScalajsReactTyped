package typingsJapgolly.ibmMobilefirst.WL.Client

import typingsJapgolly.ibmMobilefirst.WL.FailureResponse
import typingsJapgolly.ibmMobilefirst.WL.Response
import typingsJapgolly.ibmMobilefirst.WL.ResponseHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("WL.Client.obtainAccessToken")
@js.native
object obtainAccessToken extends js.Object {
  /**
    * @deprecated since version 7.0
    */
  def apply(scope: String, onSuccess: ResponseHandler[Response], onFailure: ResponseHandler[FailureResponse]): Unit = js.native
}

