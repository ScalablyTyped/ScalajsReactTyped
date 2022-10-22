package typingsJapgolly.paypalPayoutsSdk.mod

import typingsJapgolly.paypalPayoutsSdk.paypalPayoutsSdkStrings.CONNECT
import typingsJapgolly.paypalPayoutsSdk.paypalPayoutsSdkStrings.DELETE
import typingsJapgolly.paypalPayoutsSdk.paypalPayoutsSdkStrings.GET
import typingsJapgolly.paypalPayoutsSdk.paypalPayoutsSdkStrings.HEAD
import typingsJapgolly.paypalPayoutsSdk.paypalPayoutsSdkStrings.OPTIONS
import typingsJapgolly.paypalPayoutsSdk.paypalPayoutsSdkStrings.PATCH
import typingsJapgolly.paypalPayoutsSdk.paypalPayoutsSdkStrings.POST
import typingsJapgolly.paypalPayoutsSdk.paypalPayoutsSdkStrings.PUT
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LinkDescription extends StObject {
  
  var href: String
  
  var method: js.UndefOr[CONNECT | DELETE | GET | HEAD | OPTIONS | PATCH | POST | PUT] = js.undefined
  
  var rel: String
}
object LinkDescription {
  
  inline def apply(href: String, rel: String): LinkDescription = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any], rel = rel.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinkDescription]
  }
  
  extension [Self <: LinkDescription](x: Self) {
    
    inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    inline def setMethod(value: CONNECT | DELETE | GET | HEAD | OPTIONS | PATCH | POST | PUT): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setRel(value: String): Self = StObject.set(x, "rel", value.asInstanceOf[js.Any])
  }
}
