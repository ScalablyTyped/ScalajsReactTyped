package typingsJapgolly.maximMazurokGapiClientCalendar.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MinAccessRole extends StObject {
  
  /** Data format for the response. */
  var alt: js.UndefOr[String] = js.undefined
  
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.undefined
  
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.undefined
  
  /** Maximum number of entries returned on one result page. By default the value is 100 entries. The page size can never be larger than 250 entries. Optional. */
  var maxResults: js.UndefOr[Double] = js.undefined
  
  /** The minimum access role for the user in the returned entries. Optional. The default is no restriction. */
  var minAccessRole: js.UndefOr[String] = js.undefined
  
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.undefined
  
  /** Token specifying which result page to return. Optional. */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[Boolean] = js.undefined
  
  /** An opaque string that represents a user for quota purposes. Must not exceed 40 characters. */
  var quotaUser: js.UndefOr[String] = js.undefined
  
  /** Whether to include deleted calendar list entries in the result. Optional. The default is False. */
  var showDeleted: js.UndefOr[Boolean] = js.undefined
  
  /** Whether to show hidden entries. Optional. The default is False. */
  var showHidden: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Token obtained from the nextSyncToken field returned on the last page of results from the previous list request. It makes the result of this list request contain only entries
    * that have changed since then. If only read-only fields such as calendar properties or ACLs have changed, the entry won't be returned. All entries deleted and hidden since the
    * previous list request will always be in the result set and it is not allowed to set showDeleted neither showHidden to False.
    * To ensure client state consistency minAccessRole query parameter cannot be specified together with nextSyncToken.
    * If the syncToken expires, the server will respond with a 410 GONE response code and the client should clear its storage and perform a full synchronization without any syncToken.
    * Learn more about incremental synchronization.
    * Optional. The default is to return all entries.
    */
  var syncToken: js.UndefOr[String] = js.undefined
  
  /** Deprecated. Please use quotaUser instead. */
  var userIp: js.UndefOr[String] = js.undefined
}
object MinAccessRole {
  
  inline def apply(): MinAccessRole = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MinAccessRole]
  }
  
  extension [Self <: MinAccessRole](x: Self) {
    
    inline def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
    
    inline def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
    
    inline def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setMinAccessRole(value: String): Self = StObject.set(x, "minAccessRole", value.asInstanceOf[js.Any])
    
    inline def setMinAccessRoleUndefined: Self = StObject.set(x, "minAccessRole", js.undefined)
    
    inline def setOauth_token(value: String): Self = StObject.set(x, "oauth_token", value.asInstanceOf[js.Any])
    
    inline def setOauth_tokenUndefined: Self = StObject.set(x, "oauth_token", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setPrettyPrint(value: Boolean): Self = StObject.set(x, "prettyPrint", value.asInstanceOf[js.Any])
    
    inline def setPrettyPrintUndefined: Self = StObject.set(x, "prettyPrint", js.undefined)
    
    inline def setQuotaUser(value: String): Self = StObject.set(x, "quotaUser", value.asInstanceOf[js.Any])
    
    inline def setQuotaUserUndefined: Self = StObject.set(x, "quotaUser", js.undefined)
    
    inline def setShowDeleted(value: Boolean): Self = StObject.set(x, "showDeleted", value.asInstanceOf[js.Any])
    
    inline def setShowDeletedUndefined: Self = StObject.set(x, "showDeleted", js.undefined)
    
    inline def setShowHidden(value: Boolean): Self = StObject.set(x, "showHidden", value.asInstanceOf[js.Any])
    
    inline def setShowHiddenUndefined: Self = StObject.set(x, "showHidden", js.undefined)
    
    inline def setSyncToken(value: String): Self = StObject.set(x, "syncToken", value.asInstanceOf[js.Any])
    
    inline def setSyncTokenUndefined: Self = StObject.set(x, "syncToken", js.undefined)
    
    inline def setUserIp(value: String): Self = StObject.set(x, "userIp", value.asInstanceOf[js.Any])
    
    inline def setUserIpUndefined: Self = StObject.set(x, "userIp", js.undefined)
  }
}
