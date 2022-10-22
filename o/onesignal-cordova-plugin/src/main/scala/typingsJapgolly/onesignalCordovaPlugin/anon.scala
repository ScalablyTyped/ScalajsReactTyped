package typingsJapgolly.onesignalCordovaPlugin

import typingsJapgolly.onesignalCordovaPlugin.OneSignalCordovaPlugin.OSActionType
import typingsJapgolly.onesignalCordovaPlugin.OneSignalCordovaPlugin.OSDisplayType
import typingsJapgolly.onesignalCordovaPlugin.OneSignalCordovaPlugin.OSEmailSubscriptionState
import typingsJapgolly.onesignalCordovaPlugin.OneSignalCordovaPlugin.OSLogLevel
import typingsJapgolly.onesignalCordovaPlugin.OneSignalCordovaPlugin.OSNotificationPayload
import typingsJapgolly.onesignalCordovaPlugin.OneSignalCordovaPlugin.OSPermissionState
import typingsJapgolly.onesignalCordovaPlugin.OneSignalCordovaPlugin.OSSubscriptionState
import typingsJapgolly.onesignalCordovaPlugin.onesignalCordovaPluginInts.`0`
import typingsJapgolly.onesignalCordovaPlugin.onesignalCordovaPluginInts.`1`
import typingsJapgolly.onesignalCordovaPlugin.onesignalCordovaPluginInts.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait ActionID extends StObject {
    
    var actionID: js.UndefOr[String] = js.undefined
    
    var `type`: OSActionType
  }
  object ActionID {
    
    inline def apply(`type`: OSActionType): ActionID = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ActionID]
    }
    
    extension [Self <: ActionID](x: Self) {
      
      inline def setActionID(value: String): Self = StObject.set(x, "actionID", value.asInstanceOf[js.Any])
      
      inline def setActionIDUndefined: Self = StObject.set(x, "actionID", js.undefined)
      
      inline def setType(value: OSActionType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Authorized extends StObject {
    
    var Authorized: `1`
    
    var Denied: `2`
    
    var NotDetermined: `0`
  }
  object Authorized {
    
    inline def apply(): Authorized = {
      val __obj = js.Dynamic.literal(Authorized = 1, Denied = 2, NotDetermined = 0)
      __obj.asInstanceOf[Authorized]
    }
    
    extension [Self <: Authorized](x: Self) {
      
      inline def setAuthorized(value: `1`): Self = StObject.set(x, "Authorized", value.asInstanceOf[js.Any])
      
      inline def setDenied(value: `2`): Self = StObject.set(x, "Denied", value.asInstanceOf[js.Any])
      
      inline def setNotDetermined(value: `0`): Self = StObject.set(x, "NotDetermined", value.asInstanceOf[js.Any])
    }
  }
  
  trait From extends StObject {
    
    var from: OSEmailSubscriptionState
    
    var to: OSEmailSubscriptionState
  }
  object From {
    
    inline def apply(from: OSEmailSubscriptionState, to: OSEmailSubscriptionState): From = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
      __obj.asInstanceOf[From]
    }
    
    extension [Self <: From](x: Self) {
      
      inline def setFrom(value: OSEmailSubscriptionState): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setTo(value: OSEmailSubscriptionState): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    }
  }
  
  trait FromTo extends StObject {
    
    var from: OSSubscriptionState
    
    var to: OSSubscriptionState
  }
  object FromTo {
    
    inline def apply(from: OSSubscriptionState, to: OSSubscriptionState): FromTo = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
      __obj.asInstanceOf[FromTo]
    }
    
    extension [Self <: FromTo](x: Self) {
      
      inline def setFrom(value: OSSubscriptionState): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setTo(value: OSSubscriptionState): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    }
  }
  
  trait InAppAlert extends StObject {
    
    var InAppAlert: `1`
    
    var None: `0`
    
    var Notification: `2`
  }
  object InAppAlert {
    
    inline def apply(): InAppAlert = {
      val __obj = js.Dynamic.literal(InAppAlert = 1, None = 0, Notification = 2)
      __obj.asInstanceOf[InAppAlert]
    }
    
    extension [Self <: InAppAlert](x: Self) {
      
      inline def setInAppAlert(value: `1`): Self = StObject.set(x, "InAppAlert", value.asInstanceOf[js.Any])
      
      inline def setNone(value: `0`): Self = StObject.set(x, "None", value.asInstanceOf[js.Any])
      
      inline def setNotification(value: `2`): Self = StObject.set(x, "Notification", value.asInstanceOf[js.Any])
    }
  }
  
  trait KOSSettingsKeyAutoPrompt extends StObject {
    
    var kOSSettingsKeyAutoPrompt: Boolean
    
    var kOSSettingsKeyInAppLaunchURL: Boolean
  }
  object KOSSettingsKeyAutoPrompt {
    
    inline def apply(kOSSettingsKeyAutoPrompt: Boolean, kOSSettingsKeyInAppLaunchURL: Boolean): KOSSettingsKeyAutoPrompt = {
      val __obj = js.Dynamic.literal(kOSSettingsKeyAutoPrompt = kOSSettingsKeyAutoPrompt.asInstanceOf[js.Any], kOSSettingsKeyInAppLaunchURL = kOSSettingsKeyInAppLaunchURL.asInstanceOf[js.Any])
      __obj.asInstanceOf[KOSSettingsKeyAutoPrompt]
    }
    
    extension [Self <: KOSSettingsKeyAutoPrompt](x: Self) {
      
      inline def setKOSSettingsKeyAutoPrompt(value: Boolean): Self = StObject.set(x, "kOSSettingsKeyAutoPrompt", value.asInstanceOf[js.Any])
      
      inline def setKOSSettingsKeyInAppLaunchURL(value: Boolean): Self = StObject.set(x, "kOSSettingsKeyInAppLaunchURL", value.asInstanceOf[js.Any])
    }
  }
  
  trait LogLevel extends StObject {
    
    var logLevel: OSLogLevel
    
    var visualLevel: OSLogLevel
  }
  object LogLevel {
    
    inline def apply(logLevel: OSLogLevel, visualLevel: OSLogLevel): LogLevel = {
      val __obj = js.Dynamic.literal(logLevel = logLevel.asInstanceOf[js.Any], visualLevel = visualLevel.asInstanceOf[js.Any])
      __obj.asInstanceOf[LogLevel]
    }
    
    extension [Self <: LogLevel](x: Self) {
      
      inline def setLogLevel(value: OSLogLevel): Self = StObject.set(x, "logLevel", value.asInstanceOf[js.Any])
      
      inline def setVisualLevel(value: OSLogLevel): Self = StObject.set(x, "visualLevel", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<onesignal-cordova-plugin.OneSignalCordovaPlugin.OSNotification> */
  trait PartialOSNotification extends StObject {
    
    var adm_big_picture: js.UndefOr[String] = js.undefined
    
    var adm_group: js.UndefOr[String] = js.undefined
    
    var adm_group_message: js.UndefOr[Any] = js.undefined
    
    var adm_large_icon: js.UndefOr[String] = js.undefined
    
    var adm_small_icon: js.UndefOr[String] = js.undefined
    
    var adm_sound: js.UndefOr[String] = js.undefined
    
    var amazon_background_data: js.UndefOr[Boolean] = js.undefined
    
    var androidNotificationId: js.UndefOr[Double] = js.undefined
    
    var android_accent_color: js.UndefOr[String] = js.undefined
    
    var android_group: js.UndefOr[String] = js.undefined
    
    var android_group_message: js.UndefOr[Any] = js.undefined
    
    var android_led_color: js.UndefOr[String] = js.undefined
    
    var android_sound: js.UndefOr[String] = js.undefined
    
    var android_visibility: js.UndefOr[Double] = js.undefined
    
    var app_id: js.UndefOr[String] = js.undefined
    
    var app_ids: js.UndefOr[js.Array[String]] = js.undefined
    
    var big_picture: js.UndefOr[String] = js.undefined
    
    var buttons: js.UndefOr[Any] = js.undefined
    
    var chrome_big_picture: js.UndefOr[String] = js.undefined
    
    var chrome_icon: js.UndefOr[String] = js.undefined
    
    var chrome_web_icon: js.UndefOr[String] = js.undefined
    
    var content_available: js.UndefOr[Boolean] = js.undefined
    
    var contents: js.UndefOr[Any] = js.undefined
    
    var data: js.UndefOr[Any] = js.undefined
    
    var delayed_option: js.UndefOr[String] = js.undefined
    
    var delivery_time_of_day: js.UndefOr[String] = js.undefined
    
    var displayType: js.UndefOr[OSDisplayType] = js.undefined
    
    var excluded_segments: js.UndefOr[js.Array[String]] = js.undefined
    
    var firefox_icon: js.UndefOr[String] = js.undefined
    
    var groupedNotifications: js.UndefOr[js.Array[OSNotificationPayload]] = js.undefined
    
    var headings: js.UndefOr[Any] = js.undefined
    
    var include_amazon_reg_ids: js.UndefOr[js.Array[String]] = js.undefined
    
    var include_android_reg_ids: js.UndefOr[js.Array[String]] = js.undefined
    
    var include_chrome_reg_ids: js.UndefOr[js.Array[String]] = js.undefined
    
    var include_chrome_web_reg_ids: js.UndefOr[js.Array[String]] = js.undefined
    
    var include_ios_tokens: js.UndefOr[js.Array[String]] = js.undefined
    
    var include_player_ids: js.UndefOr[js.Array[String]] = js.undefined
    
    var include_wp_uris: js.UndefOr[js.Array[String]] = js.undefined
    
    var include_wp_wns_uris: js.UndefOr[js.Array[String]] = js.undefined
    
    var included_segments: js.UndefOr[js.Array[String]] = js.undefined
    
    var ios_badgeCount: js.UndefOr[Double] = js.undefined
    
    var ios_badgeType: js.UndefOr[String] = js.undefined
    
    var ios_category: js.UndefOr[String] = js.undefined
    
    var ios_sound: js.UndefOr[String] = js.undefined
    
    var isAdm: js.UndefOr[Boolean] = js.undefined
    
    var isAndroid: js.UndefOr[Boolean] = js.undefined
    
    var isAnyWeb: js.UndefOr[Boolean] = js.undefined
    
    var isAppInFocus: js.UndefOr[Boolean] = js.undefined
    
    var isChrome: js.UndefOr[Boolean] = js.undefined
    
    var isChromeWeb: js.UndefOr[Boolean] = js.undefined
    
    var isIos: js.UndefOr[Boolean] = js.undefined
    
    var isSafari: js.UndefOr[Boolean] = js.undefined
    
    var isWP: js.UndefOr[Boolean] = js.undefined
    
    var isWP_WNS: js.UndefOr[Boolean] = js.undefined
    
    var large_icon: js.UndefOr[String] = js.undefined
    
    var payload: js.UndefOr[OSNotificationPayload] = js.undefined
    
    var priority: js.UndefOr[Double] = js.undefined
    
    var send_after: js.UndefOr[String] = js.undefined
    
    var shown: js.UndefOr[Boolean] = js.undefined
    
    var small_icon: js.UndefOr[String] = js.undefined
    
    var tags: js.UndefOr[js.Array[Any]] = js.undefined
    
    var template_id: js.UndefOr[String] = js.undefined
    
    var ttl: js.UndefOr[Double] = js.undefined
    
    var url: js.UndefOr[String] = js.undefined
    
    var wp_sound: js.UndefOr[String] = js.undefined
    
    var wp_wns_sound: js.UndefOr[String] = js.undefined
  }
  object PartialOSNotification {
    
    inline def apply(): PartialOSNotification = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialOSNotification]
    }
    
    extension [Self <: PartialOSNotification](x: Self) {
      
      inline def setAdm_big_picture(value: String): Self = StObject.set(x, "adm_big_picture", value.asInstanceOf[js.Any])
      
      inline def setAdm_big_pictureUndefined: Self = StObject.set(x, "adm_big_picture", js.undefined)
      
      inline def setAdm_group(value: String): Self = StObject.set(x, "adm_group", value.asInstanceOf[js.Any])
      
      inline def setAdm_groupUndefined: Self = StObject.set(x, "adm_group", js.undefined)
      
      inline def setAdm_group_message(value: Any): Self = StObject.set(x, "adm_group_message", value.asInstanceOf[js.Any])
      
      inline def setAdm_group_messageUndefined: Self = StObject.set(x, "adm_group_message", js.undefined)
      
      inline def setAdm_large_icon(value: String): Self = StObject.set(x, "adm_large_icon", value.asInstanceOf[js.Any])
      
      inline def setAdm_large_iconUndefined: Self = StObject.set(x, "adm_large_icon", js.undefined)
      
      inline def setAdm_small_icon(value: String): Self = StObject.set(x, "adm_small_icon", value.asInstanceOf[js.Any])
      
      inline def setAdm_small_iconUndefined: Self = StObject.set(x, "adm_small_icon", js.undefined)
      
      inline def setAdm_sound(value: String): Self = StObject.set(x, "adm_sound", value.asInstanceOf[js.Any])
      
      inline def setAdm_soundUndefined: Self = StObject.set(x, "adm_sound", js.undefined)
      
      inline def setAmazon_background_data(value: Boolean): Self = StObject.set(x, "amazon_background_data", value.asInstanceOf[js.Any])
      
      inline def setAmazon_background_dataUndefined: Self = StObject.set(x, "amazon_background_data", js.undefined)
      
      inline def setAndroidNotificationId(value: Double): Self = StObject.set(x, "androidNotificationId", value.asInstanceOf[js.Any])
      
      inline def setAndroidNotificationIdUndefined: Self = StObject.set(x, "androidNotificationId", js.undefined)
      
      inline def setAndroid_accent_color(value: String): Self = StObject.set(x, "android_accent_color", value.asInstanceOf[js.Any])
      
      inline def setAndroid_accent_colorUndefined: Self = StObject.set(x, "android_accent_color", js.undefined)
      
      inline def setAndroid_group(value: String): Self = StObject.set(x, "android_group", value.asInstanceOf[js.Any])
      
      inline def setAndroid_groupUndefined: Self = StObject.set(x, "android_group", js.undefined)
      
      inline def setAndroid_group_message(value: Any): Self = StObject.set(x, "android_group_message", value.asInstanceOf[js.Any])
      
      inline def setAndroid_group_messageUndefined: Self = StObject.set(x, "android_group_message", js.undefined)
      
      inline def setAndroid_led_color(value: String): Self = StObject.set(x, "android_led_color", value.asInstanceOf[js.Any])
      
      inline def setAndroid_led_colorUndefined: Self = StObject.set(x, "android_led_color", js.undefined)
      
      inline def setAndroid_sound(value: String): Self = StObject.set(x, "android_sound", value.asInstanceOf[js.Any])
      
      inline def setAndroid_soundUndefined: Self = StObject.set(x, "android_sound", js.undefined)
      
      inline def setAndroid_visibility(value: Double): Self = StObject.set(x, "android_visibility", value.asInstanceOf[js.Any])
      
      inline def setAndroid_visibilityUndefined: Self = StObject.set(x, "android_visibility", js.undefined)
      
      inline def setApp_id(value: String): Self = StObject.set(x, "app_id", value.asInstanceOf[js.Any])
      
      inline def setApp_idUndefined: Self = StObject.set(x, "app_id", js.undefined)
      
      inline def setApp_ids(value: js.Array[String]): Self = StObject.set(x, "app_ids", value.asInstanceOf[js.Any])
      
      inline def setApp_idsUndefined: Self = StObject.set(x, "app_ids", js.undefined)
      
      inline def setApp_idsVarargs(value: String*): Self = StObject.set(x, "app_ids", js.Array(value*))
      
      inline def setBig_picture(value: String): Self = StObject.set(x, "big_picture", value.asInstanceOf[js.Any])
      
      inline def setBig_pictureUndefined: Self = StObject.set(x, "big_picture", js.undefined)
      
      inline def setButtons(value: Any): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
      
      inline def setButtonsUndefined: Self = StObject.set(x, "buttons", js.undefined)
      
      inline def setChrome_big_picture(value: String): Self = StObject.set(x, "chrome_big_picture", value.asInstanceOf[js.Any])
      
      inline def setChrome_big_pictureUndefined: Self = StObject.set(x, "chrome_big_picture", js.undefined)
      
      inline def setChrome_icon(value: String): Self = StObject.set(x, "chrome_icon", value.asInstanceOf[js.Any])
      
      inline def setChrome_iconUndefined: Self = StObject.set(x, "chrome_icon", js.undefined)
      
      inline def setChrome_web_icon(value: String): Self = StObject.set(x, "chrome_web_icon", value.asInstanceOf[js.Any])
      
      inline def setChrome_web_iconUndefined: Self = StObject.set(x, "chrome_web_icon", js.undefined)
      
      inline def setContent_available(value: Boolean): Self = StObject.set(x, "content_available", value.asInstanceOf[js.Any])
      
      inline def setContent_availableUndefined: Self = StObject.set(x, "content_available", js.undefined)
      
      inline def setContents(value: Any): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
      
      inline def setContentsUndefined: Self = StObject.set(x, "contents", js.undefined)
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setDelayed_option(value: String): Self = StObject.set(x, "delayed_option", value.asInstanceOf[js.Any])
      
      inline def setDelayed_optionUndefined: Self = StObject.set(x, "delayed_option", js.undefined)
      
      inline def setDelivery_time_of_day(value: String): Self = StObject.set(x, "delivery_time_of_day", value.asInstanceOf[js.Any])
      
      inline def setDelivery_time_of_dayUndefined: Self = StObject.set(x, "delivery_time_of_day", js.undefined)
      
      inline def setDisplayType(value: OSDisplayType): Self = StObject.set(x, "displayType", value.asInstanceOf[js.Any])
      
      inline def setDisplayTypeUndefined: Self = StObject.set(x, "displayType", js.undefined)
      
      inline def setExcluded_segments(value: js.Array[String]): Self = StObject.set(x, "excluded_segments", value.asInstanceOf[js.Any])
      
      inline def setExcluded_segmentsUndefined: Self = StObject.set(x, "excluded_segments", js.undefined)
      
      inline def setExcluded_segmentsVarargs(value: String*): Self = StObject.set(x, "excluded_segments", js.Array(value*))
      
      inline def setFirefox_icon(value: String): Self = StObject.set(x, "firefox_icon", value.asInstanceOf[js.Any])
      
      inline def setFirefox_iconUndefined: Self = StObject.set(x, "firefox_icon", js.undefined)
      
      inline def setGroupedNotifications(value: js.Array[OSNotificationPayload]): Self = StObject.set(x, "groupedNotifications", value.asInstanceOf[js.Any])
      
      inline def setGroupedNotificationsUndefined: Self = StObject.set(x, "groupedNotifications", js.undefined)
      
      inline def setGroupedNotificationsVarargs(value: OSNotificationPayload*): Self = StObject.set(x, "groupedNotifications", js.Array(value*))
      
      inline def setHeadings(value: Any): Self = StObject.set(x, "headings", value.asInstanceOf[js.Any])
      
      inline def setHeadingsUndefined: Self = StObject.set(x, "headings", js.undefined)
      
      inline def setInclude_amazon_reg_ids(value: js.Array[String]): Self = StObject.set(x, "include_amazon_reg_ids", value.asInstanceOf[js.Any])
      
      inline def setInclude_amazon_reg_idsUndefined: Self = StObject.set(x, "include_amazon_reg_ids", js.undefined)
      
      inline def setInclude_amazon_reg_idsVarargs(value: String*): Self = StObject.set(x, "include_amazon_reg_ids", js.Array(value*))
      
      inline def setInclude_android_reg_ids(value: js.Array[String]): Self = StObject.set(x, "include_android_reg_ids", value.asInstanceOf[js.Any])
      
      inline def setInclude_android_reg_idsUndefined: Self = StObject.set(x, "include_android_reg_ids", js.undefined)
      
      inline def setInclude_android_reg_idsVarargs(value: String*): Self = StObject.set(x, "include_android_reg_ids", js.Array(value*))
      
      inline def setInclude_chrome_reg_ids(value: js.Array[String]): Self = StObject.set(x, "include_chrome_reg_ids", value.asInstanceOf[js.Any])
      
      inline def setInclude_chrome_reg_idsUndefined: Self = StObject.set(x, "include_chrome_reg_ids", js.undefined)
      
      inline def setInclude_chrome_reg_idsVarargs(value: String*): Self = StObject.set(x, "include_chrome_reg_ids", js.Array(value*))
      
      inline def setInclude_chrome_web_reg_ids(value: js.Array[String]): Self = StObject.set(x, "include_chrome_web_reg_ids", value.asInstanceOf[js.Any])
      
      inline def setInclude_chrome_web_reg_idsUndefined: Self = StObject.set(x, "include_chrome_web_reg_ids", js.undefined)
      
      inline def setInclude_chrome_web_reg_idsVarargs(value: String*): Self = StObject.set(x, "include_chrome_web_reg_ids", js.Array(value*))
      
      inline def setInclude_ios_tokens(value: js.Array[String]): Self = StObject.set(x, "include_ios_tokens", value.asInstanceOf[js.Any])
      
      inline def setInclude_ios_tokensUndefined: Self = StObject.set(x, "include_ios_tokens", js.undefined)
      
      inline def setInclude_ios_tokensVarargs(value: String*): Self = StObject.set(x, "include_ios_tokens", js.Array(value*))
      
      inline def setInclude_player_ids(value: js.Array[String]): Self = StObject.set(x, "include_player_ids", value.asInstanceOf[js.Any])
      
      inline def setInclude_player_idsUndefined: Self = StObject.set(x, "include_player_ids", js.undefined)
      
      inline def setInclude_player_idsVarargs(value: String*): Self = StObject.set(x, "include_player_ids", js.Array(value*))
      
      inline def setInclude_wp_uris(value: js.Array[String]): Self = StObject.set(x, "include_wp_uris", value.asInstanceOf[js.Any])
      
      inline def setInclude_wp_urisUndefined: Self = StObject.set(x, "include_wp_uris", js.undefined)
      
      inline def setInclude_wp_urisVarargs(value: String*): Self = StObject.set(x, "include_wp_uris", js.Array(value*))
      
      inline def setInclude_wp_wns_uris(value: js.Array[String]): Self = StObject.set(x, "include_wp_wns_uris", value.asInstanceOf[js.Any])
      
      inline def setInclude_wp_wns_urisUndefined: Self = StObject.set(x, "include_wp_wns_uris", js.undefined)
      
      inline def setInclude_wp_wns_urisVarargs(value: String*): Self = StObject.set(x, "include_wp_wns_uris", js.Array(value*))
      
      inline def setIncluded_segments(value: js.Array[String]): Self = StObject.set(x, "included_segments", value.asInstanceOf[js.Any])
      
      inline def setIncluded_segmentsUndefined: Self = StObject.set(x, "included_segments", js.undefined)
      
      inline def setIncluded_segmentsVarargs(value: String*): Self = StObject.set(x, "included_segments", js.Array(value*))
      
      inline def setIos_badgeCount(value: Double): Self = StObject.set(x, "ios_badgeCount", value.asInstanceOf[js.Any])
      
      inline def setIos_badgeCountUndefined: Self = StObject.set(x, "ios_badgeCount", js.undefined)
      
      inline def setIos_badgeType(value: String): Self = StObject.set(x, "ios_badgeType", value.asInstanceOf[js.Any])
      
      inline def setIos_badgeTypeUndefined: Self = StObject.set(x, "ios_badgeType", js.undefined)
      
      inline def setIos_category(value: String): Self = StObject.set(x, "ios_category", value.asInstanceOf[js.Any])
      
      inline def setIos_categoryUndefined: Self = StObject.set(x, "ios_category", js.undefined)
      
      inline def setIos_sound(value: String): Self = StObject.set(x, "ios_sound", value.asInstanceOf[js.Any])
      
      inline def setIos_soundUndefined: Self = StObject.set(x, "ios_sound", js.undefined)
      
      inline def setIsAdm(value: Boolean): Self = StObject.set(x, "isAdm", value.asInstanceOf[js.Any])
      
      inline def setIsAdmUndefined: Self = StObject.set(x, "isAdm", js.undefined)
      
      inline def setIsAndroid(value: Boolean): Self = StObject.set(x, "isAndroid", value.asInstanceOf[js.Any])
      
      inline def setIsAndroidUndefined: Self = StObject.set(x, "isAndroid", js.undefined)
      
      inline def setIsAnyWeb(value: Boolean): Self = StObject.set(x, "isAnyWeb", value.asInstanceOf[js.Any])
      
      inline def setIsAnyWebUndefined: Self = StObject.set(x, "isAnyWeb", js.undefined)
      
      inline def setIsAppInFocus(value: Boolean): Self = StObject.set(x, "isAppInFocus", value.asInstanceOf[js.Any])
      
      inline def setIsAppInFocusUndefined: Self = StObject.set(x, "isAppInFocus", js.undefined)
      
      inline def setIsChrome(value: Boolean): Self = StObject.set(x, "isChrome", value.asInstanceOf[js.Any])
      
      inline def setIsChromeUndefined: Self = StObject.set(x, "isChrome", js.undefined)
      
      inline def setIsChromeWeb(value: Boolean): Self = StObject.set(x, "isChromeWeb", value.asInstanceOf[js.Any])
      
      inline def setIsChromeWebUndefined: Self = StObject.set(x, "isChromeWeb", js.undefined)
      
      inline def setIsIos(value: Boolean): Self = StObject.set(x, "isIos", value.asInstanceOf[js.Any])
      
      inline def setIsIosUndefined: Self = StObject.set(x, "isIos", js.undefined)
      
      inline def setIsSafari(value: Boolean): Self = StObject.set(x, "isSafari", value.asInstanceOf[js.Any])
      
      inline def setIsSafariUndefined: Self = StObject.set(x, "isSafari", js.undefined)
      
      inline def setIsWP(value: Boolean): Self = StObject.set(x, "isWP", value.asInstanceOf[js.Any])
      
      inline def setIsWPUndefined: Self = StObject.set(x, "isWP", js.undefined)
      
      inline def setIsWP_WNS(value: Boolean): Self = StObject.set(x, "isWP_WNS", value.asInstanceOf[js.Any])
      
      inline def setIsWP_WNSUndefined: Self = StObject.set(x, "isWP_WNS", js.undefined)
      
      inline def setLarge_icon(value: String): Self = StObject.set(x, "large_icon", value.asInstanceOf[js.Any])
      
      inline def setLarge_iconUndefined: Self = StObject.set(x, "large_icon", js.undefined)
      
      inline def setPayload(value: OSNotificationPayload): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      inline def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
      
      inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
      
      inline def setSend_after(value: String): Self = StObject.set(x, "send_after", value.asInstanceOf[js.Any])
      
      inline def setSend_afterUndefined: Self = StObject.set(x, "send_after", js.undefined)
      
      inline def setShown(value: Boolean): Self = StObject.set(x, "shown", value.asInstanceOf[js.Any])
      
      inline def setShownUndefined: Self = StObject.set(x, "shown", js.undefined)
      
      inline def setSmall_icon(value: String): Self = StObject.set(x, "small_icon", value.asInstanceOf[js.Any])
      
      inline def setSmall_iconUndefined: Self = StObject.set(x, "small_icon", js.undefined)
      
      inline def setTags(value: js.Array[Any]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setTagsVarargs(value: Any*): Self = StObject.set(x, "tags", js.Array(value*))
      
      inline def setTemplate_id(value: String): Self = StObject.set(x, "template_id", value.asInstanceOf[js.Any])
      
      inline def setTemplate_idUndefined: Self = StObject.set(x, "template_id", js.undefined)
      
      inline def setTtl(value: Double): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
      
      inline def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      
      inline def setWp_sound(value: String): Self = StObject.set(x, "wp_sound", value.asInstanceOf[js.Any])
      
      inline def setWp_soundUndefined: Self = StObject.set(x, "wp_sound", js.undefined)
      
      inline def setWp_wns_sound(value: String): Self = StObject.set(x, "wp_wns_sound", value.asInstanceOf[js.Any])
      
      inline def setWp_wns_soundUndefined: Self = StObject.set(x, "wp_wns_sound", js.undefined)
    }
  }
  
  trait PushToken extends StObject {
    
    var pushToken: String
    
    var userId: String
  }
  object PushToken {
    
    inline def apply(pushToken: String, userId: String): PushToken = {
      val __obj = js.Dynamic.literal(pushToken = pushToken.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
      __obj.asInstanceOf[PushToken]
    }
    
    extension [Self <: PushToken](x: Self) {
      
      inline def setPushToken(value: String): Self = StObject.set(x, "pushToken", value.asInstanceOf[js.Any])
      
      inline def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    }
  }
  
  trait To extends StObject {
    
    var from: OSPermissionState
    
    var to: OSPermissionState
  }
  object To {
    
    inline def apply(from: OSPermissionState, to: OSPermissionState): To = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
      __obj.asInstanceOf[To]
    }
    
    extension [Self <: To](x: Self) {
      
      inline def setFrom(value: OSPermissionState): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setTo(value: OSPermissionState): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    }
  }
}
