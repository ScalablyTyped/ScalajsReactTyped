package typingsJapgolly.proxyVerifier.mod

import typingsJapgolly.proxyVerifier.AnonCode
import typingsJapgolly.proxyVerifier.proxyVerifierBooleans.`false`
import typingsJapgolly.proxyVerifier.proxyVerifierBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.proxyVerifier.mod.CustomTestWorkingResult
  - typingsJapgolly.proxyVerifier.mod.CustomTestNotWorkingResult
*/
trait CustomTestResult extends js.Object

object CustomTestResult {
  @scala.inline
  def CustomTestWorkingResult(data: String, headers: Headers, ok: `true`, status: Double): CustomTestResult = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], ok = ok.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CustomTestResult]
  }
  @scala.inline
  def CustomTestNotWorkingResult(data: String, error: AnonCode, headers: Headers, ok: `false`, status: Double): CustomTestResult = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], ok = ok.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CustomTestResult]
  }
}

