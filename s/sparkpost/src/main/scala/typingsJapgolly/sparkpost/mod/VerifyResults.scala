package typingsJapgolly.sparkpost.mod

import typingsJapgolly.sparkpost.anon.Dkimrecord
import typingsJapgolly.sparkpost.sparkpostStrings.blocked
import typingsJapgolly.sparkpost.sparkpostStrings.invalid
import typingsJapgolly.sparkpost.sparkpostStrings.pending
import typingsJapgolly.sparkpost.sparkpostStrings.unverified
import typingsJapgolly.sparkpost.sparkpostStrings.valid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VerifyResults
  extends StObject
     with Status {
  
  var dns: js.UndefOr[Dkimrecord] = js.undefined
}
object VerifyResults {
  
  inline def apply(
    abuse_at_status: valid | invalid | unverified | pending,
    cname_status: valid | invalid | unverified | pending,
    compliance_status: valid | pending | blocked,
    dkim_status: valid | invalid | unverified | pending,
    mx_status: valid | invalid | unverified | pending,
    ownership_verified: Boolean,
    postmaster_at_status: valid | invalid | unverified | pending,
    spf_status: valid | invalid | unverified | pending
  ): VerifyResults = {
    val __obj = js.Dynamic.literal(abuse_at_status = abuse_at_status.asInstanceOf[js.Any], cname_status = cname_status.asInstanceOf[js.Any], compliance_status = compliance_status.asInstanceOf[js.Any], dkim_status = dkim_status.asInstanceOf[js.Any], mx_status = mx_status.asInstanceOf[js.Any], ownership_verified = ownership_verified.asInstanceOf[js.Any], postmaster_at_status = postmaster_at_status.asInstanceOf[js.Any], spf_status = spf_status.asInstanceOf[js.Any])
    __obj.asInstanceOf[VerifyResults]
  }
  
  extension [Self <: VerifyResults](x: Self) {
    
    inline def setDns(value: Dkimrecord): Self = StObject.set(x, "dns", value.asInstanceOf[js.Any])
    
    inline def setDnsUndefined: Self = StObject.set(x, "dns", js.undefined)
  }
}
