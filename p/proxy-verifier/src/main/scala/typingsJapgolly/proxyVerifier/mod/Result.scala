package typingsJapgolly.proxyVerifier.mod

import typingsJapgolly.proxyVerifier.AnonCode
import typingsJapgolly.proxyVerifier.proxyVerifierBooleans.`false`
import typingsJapgolly.proxyVerifier.proxyVerifierBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.proxyVerifier.mod.WorkingResult
  - typingsJapgolly.proxyVerifier.mod.NotWorkingResult
*/
trait Result extends js.Object

object Result {
  @scala.inline
  def WorkingResult(ok: `true`): Result = {
    val __obj = js.Dynamic.literal(ok = ok.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Result]
  }
  @scala.inline
  def NotWorkingResult(error: AnonCode, ok: `false`): Result = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], ok = ok.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Result]
  }
}

