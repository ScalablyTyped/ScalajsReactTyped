package typingsJapgolly.maximMazurokGapiClientSearchconsole.gapi.client.searchconsole

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MobileFriendlyIssue extends StObject {
  
  /** Rule violated. */
  var rule: js.UndefOr[String] = js.undefined
}
object MobileFriendlyIssue {
  
  inline def apply(): MobileFriendlyIssue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MobileFriendlyIssue]
  }
  
  extension [Self <: MobileFriendlyIssue](x: Self) {
    
    inline def setRule(value: String): Self = StObject.set(x, "rule", value.asInstanceOf[js.Any])
    
    inline def setRuleUndefined: Self = StObject.set(x, "rule", js.undefined)
  }
}
