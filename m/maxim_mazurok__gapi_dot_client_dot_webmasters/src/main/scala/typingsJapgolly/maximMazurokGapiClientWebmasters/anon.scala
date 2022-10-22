package typingsJapgolly.maximMazurokGapiClientWebmasters

import typingsJapgolly.maximMazurokGapiClientWebmasters.gapi.client.webmasters.SearchAnalyticsQueryRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Alt extends StObject {
    
    /** Data format for the response. */
    var alt: js.UndefOr[String] = js.undefined
    
    /** Selector specifying which fields to include in a partial response. */
    var fields: js.UndefOr[String] = js.undefined
    
    /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
    var key: js.UndefOr[String] = js.undefined
    
    /** OAuth 2.0 token for the current user. */
    var oauth_token: js.UndefOr[String] = js.undefined
    
    /** Returns response with indentations and line breaks. */
    var prettyPrint: js.UndefOr[Boolean] = js.undefined
    
    /** An opaque string that represents a user for quota purposes. Must not exceed 40 characters. */
    var quotaUser: js.UndefOr[String] = js.undefined
    
    /** Request body */
    var resource: SearchAnalyticsQueryRequest
    
    /** The site's URL, including protocol. For example: http://www.example.com/ */
    var siteUrl: String
    
    /** Deprecated. Please use quotaUser instead. */
    var userIp: js.UndefOr[String] = js.undefined
  }
  object Alt {
    
    inline def apply(resource: SearchAnalyticsQueryRequest, siteUrl: String): Alt = {
      val __obj = js.Dynamic.literal(resource = resource.asInstanceOf[js.Any], siteUrl = siteUrl.asInstanceOf[js.Any])
      __obj.asInstanceOf[Alt]
    }
    
    extension [Self <: Alt](x: Self) {
      
      inline def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
      
      inline def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
      
      inline def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setOauth_token(value: String): Self = StObject.set(x, "oauth_token", value.asInstanceOf[js.Any])
      
      inline def setOauth_tokenUndefined: Self = StObject.set(x, "oauth_token", js.undefined)
      
      inline def setPrettyPrint(value: Boolean): Self = StObject.set(x, "prettyPrint", value.asInstanceOf[js.Any])
      
      inline def setPrettyPrintUndefined: Self = StObject.set(x, "prettyPrint", js.undefined)
      
      inline def setQuotaUser(value: String): Self = StObject.set(x, "quotaUser", value.asInstanceOf[js.Any])
      
      inline def setQuotaUserUndefined: Self = StObject.set(x, "quotaUser", js.undefined)
      
      inline def setResource(value: SearchAnalyticsQueryRequest): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
      
      inline def setSiteUrl(value: String): Self = StObject.set(x, "siteUrl", value.asInstanceOf[js.Any])
      
      inline def setUserIp(value: String): Self = StObject.set(x, "userIp", value.asInstanceOf[js.Any])
      
      inline def setUserIpUndefined: Self = StObject.set(x, "userIp", js.undefined)
    }
  }
  
  trait Feedpath extends StObject {
    
    /** Data format for the response. */
    var alt: js.UndefOr[String] = js.undefined
    
    /** The URL of the sitemap to add. For example: http://www.example.com/sitemap.xml */
    var feedpath: String
    
    /** Selector specifying which fields to include in a partial response. */
    var fields: js.UndefOr[String] = js.undefined
    
    /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
    var key: js.UndefOr[String] = js.undefined
    
    /** OAuth 2.0 token for the current user. */
    var oauth_token: js.UndefOr[String] = js.undefined
    
    /** Returns response with indentations and line breaks. */
    var prettyPrint: js.UndefOr[Boolean] = js.undefined
    
    /** An opaque string that represents a user for quota purposes. Must not exceed 40 characters. */
    var quotaUser: js.UndefOr[String] = js.undefined
    
    /** The site's URL, including protocol. For example: http://www.example.com/ */
    var siteUrl: String
    
    /** Deprecated. Please use quotaUser instead. */
    var userIp: js.UndefOr[String] = js.undefined
  }
  object Feedpath {
    
    inline def apply(feedpath: String, siteUrl: String): Feedpath = {
      val __obj = js.Dynamic.literal(feedpath = feedpath.asInstanceOf[js.Any], siteUrl = siteUrl.asInstanceOf[js.Any])
      __obj.asInstanceOf[Feedpath]
    }
    
    extension [Self <: Feedpath](x: Self) {
      
      inline def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
      
      inline def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
      
      inline def setFeedpath(value: String): Self = StObject.set(x, "feedpath", value.asInstanceOf[js.Any])
      
      inline def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setOauth_token(value: String): Self = StObject.set(x, "oauth_token", value.asInstanceOf[js.Any])
      
      inline def setOauth_tokenUndefined: Self = StObject.set(x, "oauth_token", js.undefined)
      
      inline def setPrettyPrint(value: Boolean): Self = StObject.set(x, "prettyPrint", value.asInstanceOf[js.Any])
      
      inline def setPrettyPrintUndefined: Self = StObject.set(x, "prettyPrint", js.undefined)
      
      inline def setQuotaUser(value: String): Self = StObject.set(x, "quotaUser", value.asInstanceOf[js.Any])
      
      inline def setQuotaUserUndefined: Self = StObject.set(x, "quotaUser", js.undefined)
      
      inline def setSiteUrl(value: String): Self = StObject.set(x, "siteUrl", value.asInstanceOf[js.Any])
      
      inline def setUserIp(value: String): Self = StObject.set(x, "userIp", value.asInstanceOf[js.Any])
      
      inline def setUserIpUndefined: Self = StObject.set(x, "userIp", js.undefined)
    }
  }
  
  trait Fields extends StObject {
    
    /** Data format for the response. */
    var alt: js.UndefOr[String] = js.undefined
    
    /** Selector specifying which fields to include in a partial response. */
    var fields: js.UndefOr[String] = js.undefined
    
    /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
    var key: js.UndefOr[String] = js.undefined
    
    /** OAuth 2.0 token for the current user. */
    var oauth_token: js.UndefOr[String] = js.undefined
    
    /** Returns response with indentations and line breaks. */
    var prettyPrint: js.UndefOr[Boolean] = js.undefined
    
    /** An opaque string that represents a user for quota purposes. Must not exceed 40 characters. */
    var quotaUser: js.UndefOr[String] = js.undefined
    
    /**
      * The URI of the property as defined in Search Console. Examples: http://www.example.com/ or android-app://com.example/ Note: for property-sets, use the URI that starts with
      * sc-set: which is used in Search Console URLs.
      */
    var siteUrl: String
    
    /** Deprecated. Please use quotaUser instead. */
    var userIp: js.UndefOr[String] = js.undefined
  }
  object Fields {
    
    inline def apply(siteUrl: String): Fields = {
      val __obj = js.Dynamic.literal(siteUrl = siteUrl.asInstanceOf[js.Any])
      __obj.asInstanceOf[Fields]
    }
    
    extension [Self <: Fields](x: Self) {
      
      inline def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
      
      inline def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
      
      inline def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setOauth_token(value: String): Self = StObject.set(x, "oauth_token", value.asInstanceOf[js.Any])
      
      inline def setOauth_tokenUndefined: Self = StObject.set(x, "oauth_token", js.undefined)
      
      inline def setPrettyPrint(value: Boolean): Self = StObject.set(x, "prettyPrint", value.asInstanceOf[js.Any])
      
      inline def setPrettyPrintUndefined: Self = StObject.set(x, "prettyPrint", js.undefined)
      
      inline def setQuotaUser(value: String): Self = StObject.set(x, "quotaUser", value.asInstanceOf[js.Any])
      
      inline def setQuotaUserUndefined: Self = StObject.set(x, "quotaUser", js.undefined)
      
      inline def setSiteUrl(value: String): Self = StObject.set(x, "siteUrl", value.asInstanceOf[js.Any])
      
      inline def setUserIp(value: String): Self = StObject.set(x, "userIp", value.asInstanceOf[js.Any])
      
      inline def setUserIpUndefined: Self = StObject.set(x, "userIp", js.undefined)
    }
  }
  
  trait Key extends StObject {
    
    /** Data format for the response. */
    var alt: js.UndefOr[String] = js.undefined
    
    /** Selector specifying which fields to include in a partial response. */
    var fields: js.UndefOr[String] = js.undefined
    
    /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
    var key: js.UndefOr[String] = js.undefined
    
    /** OAuth 2.0 token for the current user. */
    var oauth_token: js.UndefOr[String] = js.undefined
    
    /** Returns response with indentations and line breaks. */
    var prettyPrint: js.UndefOr[Boolean] = js.undefined
    
    /** An opaque string that represents a user for quota purposes. Must not exceed 40 characters. */
    var quotaUser: js.UndefOr[String] = js.undefined
    
    /** The site's URL, including protocol. For example: http://www.example.com/ */
    var siteUrl: String
    
    /** A URL of a site's sitemap index. For example: http://www.example.com/sitemapindex.xml */
    var sitemapIndex: js.UndefOr[String] = js.undefined
    
    /** Deprecated. Please use quotaUser instead. */
    var userIp: js.UndefOr[String] = js.undefined
  }
  object Key {
    
    inline def apply(siteUrl: String): Key = {
      val __obj = js.Dynamic.literal(siteUrl = siteUrl.asInstanceOf[js.Any])
      __obj.asInstanceOf[Key]
    }
    
    extension [Self <: Key](x: Self) {
      
      inline def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
      
      inline def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
      
      inline def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setOauth_token(value: String): Self = StObject.set(x, "oauth_token", value.asInstanceOf[js.Any])
      
      inline def setOauth_tokenUndefined: Self = StObject.set(x, "oauth_token", js.undefined)
      
      inline def setPrettyPrint(value: Boolean): Self = StObject.set(x, "prettyPrint", value.asInstanceOf[js.Any])
      
      inline def setPrettyPrintUndefined: Self = StObject.set(x, "prettyPrint", js.undefined)
      
      inline def setQuotaUser(value: String): Self = StObject.set(x, "quotaUser", value.asInstanceOf[js.Any])
      
      inline def setQuotaUserUndefined: Self = StObject.set(x, "quotaUser", js.undefined)
      
      inline def setSiteUrl(value: String): Self = StObject.set(x, "siteUrl", value.asInstanceOf[js.Any])
      
      inline def setSitemapIndex(value: String): Self = StObject.set(x, "sitemapIndex", value.asInstanceOf[js.Any])
      
      inline def setSitemapIndexUndefined: Self = StObject.set(x, "sitemapIndex", js.undefined)
      
      inline def setUserIp(value: String): Self = StObject.set(x, "userIp", value.asInstanceOf[js.Any])
      
      inline def setUserIpUndefined: Self = StObject.set(x, "userIp", js.undefined)
    }
  }
  
  trait Oauthtoken extends StObject {
    
    /** Data format for the response. */
    var alt: js.UndefOr[String] = js.undefined
    
    /** Selector specifying which fields to include in a partial response. */
    var fields: js.UndefOr[String] = js.undefined
    
    /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
    var key: js.UndefOr[String] = js.undefined
    
    /** OAuth 2.0 token for the current user. */
    var oauth_token: js.UndefOr[String] = js.undefined
    
    /** Returns response with indentations and line breaks. */
    var prettyPrint: js.UndefOr[Boolean] = js.undefined
    
    /** An opaque string that represents a user for quota purposes. Must not exceed 40 characters. */
    var quotaUser: js.UndefOr[String] = js.undefined
    
    /** Deprecated. Please use quotaUser instead. */
    var userIp: js.UndefOr[String] = js.undefined
  }
  object Oauthtoken {
    
    inline def apply(): Oauthtoken = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Oauthtoken]
    }
    
    extension [Self <: Oauthtoken](x: Self) {
      
      inline def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
      
      inline def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
      
      inline def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setOauth_token(value: String): Self = StObject.set(x, "oauth_token", value.asInstanceOf[js.Any])
      
      inline def setOauth_tokenUndefined: Self = StObject.set(x, "oauth_token", js.undefined)
      
      inline def setPrettyPrint(value: Boolean): Self = StObject.set(x, "prettyPrint", value.asInstanceOf[js.Any])
      
      inline def setPrettyPrintUndefined: Self = StObject.set(x, "prettyPrint", js.undefined)
      
      inline def setQuotaUser(value: String): Self = StObject.set(x, "quotaUser", value.asInstanceOf[js.Any])
      
      inline def setQuotaUserUndefined: Self = StObject.set(x, "quotaUser", js.undefined)
      
      inline def setUserIp(value: String): Self = StObject.set(x, "userIp", value.asInstanceOf[js.Any])
      
      inline def setUserIpUndefined: Self = StObject.set(x, "userIp", js.undefined)
    }
  }
}
