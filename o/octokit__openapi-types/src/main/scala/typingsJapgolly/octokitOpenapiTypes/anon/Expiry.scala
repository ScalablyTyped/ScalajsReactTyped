package typingsJapgolly.octokitOpenapiTypes.anon

import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.collaborators_only
import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.contributors_only
import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.existing_users
import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.one_day
import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.one_month
import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.one_week
import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.six_months
import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.three_days
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Expiry extends StObject {
  
  var expiry: js.UndefOr[one_day | three_days | one_week | one_month | six_months] = js.undefined
  
  var limit: existing_users | contributors_only | collaborators_only
}
object Expiry {
  
  inline def apply(limit: existing_users | contributors_only | collaborators_only): Expiry = {
    val __obj = js.Dynamic.literal(limit = limit.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expiry]
  }
  
  extension [Self <: Expiry](x: Self) {
    
    inline def setExpiry(value: one_day | three_days | one_week | one_month | six_months): Self = StObject.set(x, "expiry", value.asInstanceOf[js.Any])
    
    inline def setExpiryUndefined: Self = StObject.set(x, "expiry", js.undefined)
    
    inline def setLimit(value: existing_users | contributors_only | collaborators_only): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
  }
}
