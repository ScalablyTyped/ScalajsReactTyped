package typingsJapgolly.mailchimpMailchimpTransactional.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.mailchimpMailchimpTransactional.mod.IpsCheckCustomDnsValidResponse
  - typingsJapgolly.mailchimpMailchimpTransactional.mod.IpsCheckCustomDnsInvalidResponse
*/
trait IpsCheckCustomDnsResponse extends StObject
object IpsCheckCustomDnsResponse {
  
  inline def IpsCheckCustomDnsInvalidResponse(error: String): typingsJapgolly.mailchimpMailchimpTransactional.mod.IpsCheckCustomDnsInvalidResponse = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], valid = false)
    __obj.asInstanceOf[typingsJapgolly.mailchimpMailchimpTransactional.mod.IpsCheckCustomDnsInvalidResponse]
  }
  
  inline def IpsCheckCustomDnsValidResponse(): typingsJapgolly.mailchimpMailchimpTransactional.mod.IpsCheckCustomDnsValidResponse = {
    val __obj = js.Dynamic.literal(valid = true)
    __obj.asInstanceOf[typingsJapgolly.mailchimpMailchimpTransactional.mod.IpsCheckCustomDnsValidResponse]
  }
}
