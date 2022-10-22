package typingsJapgolly.maximMazurokGapiClientAdsense.gapi.client.adsense

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Account extends StObject {
  
  /** Output only. Creation time of the account. */
  var createTime: js.UndefOr[String] = js.undefined
  
  /** Output only. Display name of this account. */
  var displayName: js.UndefOr[String] = js.undefined
  
  /** Output only. Resource name of the account. Format: accounts/pub-[0-9]+ */
  var name: js.UndefOr[String] = js.undefined
  
  /** Output only. Outstanding tasks that need to be completed as part of the sign-up process for a new account. e.g. "billing-profile-creation", "phone-pin-verification". */
  var pendingTasks: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Output only. Whether this account is premium. */
  var premium: js.UndefOr[Boolean] = js.undefined
  
  /** Output only. State of the account. */
  var state: js.UndefOr[String] = js.undefined
  
  /** The account time zone, as used by reporting. For more information, see [changing the time zone of your reports](https://support.google.com/adsense/answer/9830725). */
  var timeZone: js.UndefOr[TimeZone] = js.undefined
}
object Account {
  
  inline def apply(): Account = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Account]
  }
  
  extension [Self <: Account](x: Self) {
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPendingTasks(value: js.Array[String]): Self = StObject.set(x, "pendingTasks", value.asInstanceOf[js.Any])
    
    inline def setPendingTasksUndefined: Self = StObject.set(x, "pendingTasks", js.undefined)
    
    inline def setPendingTasksVarargs(value: String*): Self = StObject.set(x, "pendingTasks", js.Array(value*))
    
    inline def setPremium(value: Boolean): Self = StObject.set(x, "premium", value.asInstanceOf[js.Any])
    
    inline def setPremiumUndefined: Self = StObject.set(x, "premium", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setTimeZone(value: TimeZone): Self = StObject.set(x, "timeZone", value.asInstanceOf[js.Any])
    
    inline def setTimeZoneUndefined: Self = StObject.set(x, "timeZone", js.undefined)
  }
}
