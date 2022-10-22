package typingsJapgolly.firefoxWebextBrowser

import typingsJapgolly.firefoxWebextBrowser.browser.`extension`.ViewType
import typingsJapgolly.firefoxWebextBrowser.browser.activityLog.OnExtensionActivityDetailsType
import typingsJapgolly.firefoxWebextBrowser.browser.activityLog.OnExtensionActivityDetailsViewType
import typingsJapgolly.firefoxWebextBrowser.browser.bookmarks.BookmarkTreeNodeType
import typingsJapgolly.firefoxWebextBrowser.browser.browserSettings.ColorManagementMode
import typingsJapgolly.firefoxWebextBrowser.browser.browserSettings.ContextMenuMouseEvent
import typingsJapgolly.firefoxWebextBrowser.browser.browserSettings.ImageAnimationBehavior
import typingsJapgolly.firefoxWebextBrowser.browser.captivePortal.OnConnectivityAvailableStatus
import typingsJapgolly.firefoxWebextBrowser.browser.captivePortal.OnStateChangedDetailsState
import typingsJapgolly.firefoxWebextBrowser.browser.clipboard.SetImageDataImageType
import typingsJapgolly.firefoxWebextBrowser.browser.contextMenus.CreateCreatePropertiesCommand
import typingsJapgolly.firefoxWebextBrowser.browser.contextMenus.ItemType
import typingsJapgolly.firefoxWebextBrowser.browser.contextMenus.OnClickDataModifiers
import typingsJapgolly.firefoxWebextBrowser.browser.contextMenus.OverrideContextContextOptionsContext
import typingsJapgolly.firefoxWebextBrowser.browser.contextMenus._ContextType
import typingsJapgolly.firefoxWebextBrowser.browser.cookies.OnChangedCause
import typingsJapgolly.firefoxWebextBrowser.browser.cookies.SameSiteStatus
import typingsJapgolly.firefoxWebextBrowser.browser.dns._ResolveFlags
import typingsJapgolly.firefoxWebextBrowser.browser.downloads.DangerType
import typingsJapgolly.firefoxWebextBrowser.browser.downloads.DownloadOptionsMethod
import typingsJapgolly.firefoxWebextBrowser.browser.downloads.FilenameConflictAction
import typingsJapgolly.firefoxWebextBrowser.browser.downloads.InterruptReason
import typingsJapgolly.firefoxWebextBrowser.browser.downloads.State
import typingsJapgolly.firefoxWebextBrowser.browser.experiments.APIChildScope
import typingsJapgolly.firefoxWebextBrowser.browser.experiments.APIParentScope
import typingsJapgolly.firefoxWebextBrowser.browser.extensionTypes.CSSOrigin
import typingsJapgolly.firefoxWebextBrowser.browser.extensionTypes.ImageFormat
import typingsJapgolly.firefoxWebextBrowser.browser.extensionTypes.RunAt
import typingsJapgolly.firefoxWebextBrowser.browser.geckoProfiler.ProfilerFeature
import typingsJapgolly.firefoxWebextBrowser.browser.idle.IdleState
import typingsJapgolly.firefoxWebextBrowser.browser.management.ExtensionDisabledReason
import typingsJapgolly.firefoxWebextBrowser.browser.management.ExtensionInstallType
import typingsJapgolly.firefoxWebextBrowser.browser.management.ExtensionType
import typingsJapgolly.firefoxWebextBrowser.browser.manifest.ActionManifestDefaultArea
import typingsJapgolly.firefoxWebextBrowser.browser.manifest.ProtocolHandlerProtocol
import typingsJapgolly.firefoxWebextBrowser.browser.manifest.ThemeTypeAdditionalBackgroundsAlignment
import typingsJapgolly.firefoxWebextBrowser.browser.manifest.ThemeTypeAdditionalBackgroundsTiling
import typingsJapgolly.firefoxWebextBrowser.browser.manifest.WebExtensionManifestChromeSettingsOverridesSearchProviderParamsCondition
import typingsJapgolly.firefoxWebextBrowser.browser.manifest.WebExtensionManifestChromeSettingsOverridesSearchProviderParamsPurpose
import typingsJapgolly.firefoxWebextBrowser.browser.manifest.WebExtensionManifestIncognito
import typingsJapgolly.firefoxWebextBrowser.browser.manifest._OptionalPermission
import typingsJapgolly.firefoxWebextBrowser.browser.manifest._OptionalPermissionNoPrompt
import typingsJapgolly.firefoxWebextBrowser.browser.manifest._PermissionNoPrompt
import typingsJapgolly.firefoxWebextBrowser.browser.networkStatus.NetworkLinkInfoStatus
import typingsJapgolly.firefoxWebextBrowser.browser.networkStatus.NetworkLinkInfoType
import typingsJapgolly.firefoxWebextBrowser.browser.notifications.PermissionLevel
import typingsJapgolly.firefoxWebextBrowser.browser.notifications.TemplateType
import typingsJapgolly.firefoxWebextBrowser.browser.omnibox.DescriptionStyleType
import typingsJapgolly.firefoxWebextBrowser.browser.omnibox.OnInputEnteredDisposition
import typingsJapgolly.firefoxWebextBrowser.browser.privacy.network.HTTPSOnlyModeOption
import typingsJapgolly.firefoxWebextBrowser.browser.privacy.network.IPHandlingPolicy
import typingsJapgolly.firefoxWebextBrowser.browser.privacy.network.TlsVersionRestrictionConfigMaximum
import typingsJapgolly.firefoxWebextBrowser.browser.privacy.network.TlsVersionRestrictionConfigMinimum
import typingsJapgolly.firefoxWebextBrowser.browser.privacy.websites.CookieConfigBehavior
import typingsJapgolly.firefoxWebextBrowser.browser.privacy.websites.TrackingProtectionModeOption
import typingsJapgolly.firefoxWebextBrowser.browser.proxy.ProxyConfigProxyType
import typingsJapgolly.firefoxWebextBrowser.browser.runtime.OnInstalledReason
import typingsJapgolly.firefoxWebextBrowser.browser.runtime.OnRestartRequiredReason
import typingsJapgolly.firefoxWebextBrowser.browser.runtime.PlatformArch
import typingsJapgolly.firefoxWebextBrowser.browser.runtime.PlatformNaclArch
import typingsJapgolly.firefoxWebextBrowser.browser.runtime.PlatformOs
import typingsJapgolly.firefoxWebextBrowser.browser.runtime.RequestUpdateCheckStatus
import typingsJapgolly.firefoxWebextBrowser.browser.tabs.MutedInfoReason
import typingsJapgolly.firefoxWebextBrowser.browser.tabs.QueryQueryInfoScreen
import typingsJapgolly.firefoxWebextBrowser.browser.tabs.TabStatus
import typingsJapgolly.firefoxWebextBrowser.browser.tabs.UpdatePropertyName
import typingsJapgolly.firefoxWebextBrowser.browser.tabs.ZoomSettingsMode
import typingsJapgolly.firefoxWebextBrowser.browser.tabs.ZoomSettingsScope
import typingsJapgolly.firefoxWebextBrowser.browser.telemetry.ScalarType
import typingsJapgolly.firefoxWebextBrowser.browser.topSites.MostVisitedURLType
import typingsJapgolly.firefoxWebextBrowser.browser.types.LevelOfControl
import typingsJapgolly.firefoxWebextBrowser.browser.types.SettingScope
import typingsJapgolly.firefoxWebextBrowser.browser.urlbar.EngagementState
import typingsJapgolly.firefoxWebextBrowser.browser.urlbar.ResultType
import typingsJapgolly.firefoxWebextBrowser.browser.urlbar.SourceType
import typingsJapgolly.firefoxWebextBrowser.browser.webNavigation.TransitionQualifier
import typingsJapgolly.firefoxWebextBrowser.browser.webNavigation.TransitionType
import typingsJapgolly.firefoxWebextBrowser.browser.webRequest.CertificateTransparencyStatus
import typingsJapgolly.firefoxWebextBrowser.browser.webRequest.OnAuthRequiredOptions
import typingsJapgolly.firefoxWebextBrowser.browser.webRequest.OnBeforeRequestOptions
import typingsJapgolly.firefoxWebextBrowser.browser.webRequest.OnBeforeSendHeadersOptions
import typingsJapgolly.firefoxWebextBrowser.browser.webRequest.OnHeadersReceivedOptions
import typingsJapgolly.firefoxWebextBrowser.browser.webRequest.ResourceType
import typingsJapgolly.firefoxWebextBrowser.browser.webRequest.SecurityInfoProtocolVersion
import typingsJapgolly.firefoxWebextBrowser.browser.webRequest.SecurityInfoState
import typingsJapgolly.firefoxWebextBrowser.browser.webRequest.StreamFilterStatus
import typingsJapgolly.firefoxWebextBrowser.browser.webRequest.UrlClassificationFlags
import typingsJapgolly.firefoxWebextBrowser.browser.windows.CreateType
import typingsJapgolly.firefoxWebextBrowser.browser.windows.WindowState
import typingsJapgolly.firefoxWebextBrowser.browser.windows.WindowType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object firefoxWebextBrowserStrings {
  
  @js.native
  sealed trait default
    extends StObject
       with IPHandlingPolicy
  inline def default: default = "default".asInstanceOf[default]
  
  @js.native
  sealed trait Alt
    extends StObject
       with OnClickDataModifiers
       with typingsJapgolly.firefoxWebextBrowser.browser.menus.OnClickDataModifiers
       with typingsJapgolly.firefoxWebextBrowser.browser.pageAction.OnClickDataModifiers
       with typingsJapgolly.firefoxWebextBrowser.browser.action.OnClickDataModifiers
       with typingsJapgolly.firefoxWebextBrowser.browser.browserAction.OnClickDataModifiers
  inline def Alt: Alt = "Alt".asInstanceOf[Alt]
  
  @js.native
  sealed trait Application
    extends StObject
       with QueryQueryInfoScreen
  inline def Application: Application = "Application".asInstanceOf[Application]
  
  @js.native
  sealed trait CRASH
    extends StObject
       with InterruptReason
  inline def CRASH: CRASH = "CRASH".asInstanceOf[CRASH]
  
  @js.native
  sealed trait Command
    extends StObject
       with OnClickDataModifiers
       with typingsJapgolly.firefoxWebextBrowser.browser.menus.OnClickDataModifiers
       with typingsJapgolly.firefoxWebextBrowser.browser.pageAction.OnClickDataModifiers
       with typingsJapgolly.firefoxWebextBrowser.browser.action.OnClickDataModifiers
       with typingsJapgolly.firefoxWebextBrowser.browser.browserAction.OnClickDataModifiers
  inline def Command: Command = "Command".asInstanceOf[Command]
  
  @js.native
  sealed trait Ctrl
    extends StObject
       with OnClickDataModifiers
       with typingsJapgolly.firefoxWebextBrowser.browser.menus.OnClickDataModifiers
       with typingsJapgolly.firefoxWebextBrowser.browser.pageAction.OnClickDataModifiers
       with typingsJapgolly.firefoxWebextBrowser.browser.action.OnClickDataModifiers
       with typingsJapgolly.firefoxWebextBrowser.browser.browserAction.OnClickDataModifiers
  inline def Ctrl: Ctrl = "Ctrl".asInstanceOf[Ctrl]
  
  @js.native
  sealed trait FILE_ACCESS_DENIED
    extends StObject
       with InterruptReason
  inline def FILE_ACCESS_DENIED: FILE_ACCESS_DENIED = "FILE_ACCESS_DENIED".asInstanceOf[FILE_ACCESS_DENIED]
  
  @js.native
  sealed trait FILE_BLOCKED
    extends StObject
       with InterruptReason
  inline def FILE_BLOCKED: FILE_BLOCKED = "FILE_BLOCKED".asInstanceOf[FILE_BLOCKED]
  
  @js.native
  sealed trait FILE_FAILED
    extends StObject
       with InterruptReason
  inline def FILE_FAILED: FILE_FAILED = "FILE_FAILED".asInstanceOf[FILE_FAILED]
  
  @js.native
  sealed trait FILE_NAME_TOO_LONG
    extends StObject
       with InterruptReason
  inline def FILE_NAME_TOO_LONG: FILE_NAME_TOO_LONG = "FILE_NAME_TOO_LONG".asInstanceOf[FILE_NAME_TOO_LONG]
  
  @js.native
  sealed trait FILE_NO_SPACE
    extends StObject
       with InterruptReason
  inline def FILE_NO_SPACE: FILE_NO_SPACE = "FILE_NO_SPACE".asInstanceOf[FILE_NO_SPACE]
  
  @js.native
  sealed trait FILE_SECURITY_CHECK_FAILED
    extends StObject
       with InterruptReason
  inline def FILE_SECURITY_CHECK_FAILED: FILE_SECURITY_CHECK_FAILED = "FILE_SECURITY_CHECK_FAILED".asInstanceOf[FILE_SECURITY_CHECK_FAILED]
  
  @js.native
  sealed trait FILE_TOO_LARGE
    extends StObject
       with InterruptReason
  inline def FILE_TOO_LARGE: FILE_TOO_LARGE = "FILE_TOO_LARGE".asInstanceOf[FILE_TOO_LARGE]
  
  @js.native
  sealed trait FILE_TOO_SHORT
    extends StObject
       with InterruptReason
  inline def FILE_TOO_SHORT: FILE_TOO_SHORT = "FILE_TOO_SHORT".asInstanceOf[FILE_TOO_SHORT]
  
  @js.native
  sealed trait FILE_TRANSIENT_ERROR
    extends StObject
       with InterruptReason
  inline def FILE_TRANSIENT_ERROR: FILE_TRANSIENT_ERROR = "FILE_TRANSIENT_ERROR".asInstanceOf[FILE_TRANSIENT_ERROR]
  
  @js.native
  sealed trait FILE_VIRUS_INFECTED
    extends StObject
       with InterruptReason
  inline def FILE_VIRUS_INFECTED: FILE_VIRUS_INFECTED = "FILE_VIRUS_INFECTED".asInstanceOf[FILE_VIRUS_INFECTED]
  
  @js.native
  sealed trait GET
    extends StObject
       with DownloadOptionsMethod
  inline def GET: GET = "GET".asInstanceOf[GET]
  
  @js.native
  sealed trait Lessthansignall_urlsGreaterthansign extends StObject
  inline def Lessthansignall_urlsGreaterthansign: Lessthansignall_urlsGreaterthansign = "<all_urls>".asInstanceOf[Lessthansignall_urlsGreaterthansign]
  
  @js.native
  sealed trait MacCtrl
    extends StObject
       with OnClickDataModifiers
       with typingsJapgolly.firefoxWebextBrowser.browser.menus.OnClickDataModifiers
       with typingsJapgolly.firefoxWebextBrowser.browser.pageAction.OnClickDataModifiers
       with typingsJapgolly.firefoxWebextBrowser.browser.action.OnClickDataModifiers
       with typingsJapgolly.firefoxWebextBrowser.browser.browserAction.OnClickDataModifiers
  inline def MacCtrl: MacCtrl = "MacCtrl".asInstanceOf[MacCtrl]
  
  @js.native
  sealed trait NETWORK_DISCONNECTED
    extends StObject
       with InterruptReason
  inline def NETWORK_DISCONNECTED: NETWORK_DISCONNECTED = "NETWORK_DISCONNECTED".asInstanceOf[NETWORK_DISCONNECTED]
  
  @js.native
  sealed trait NETWORK_FAILED
    extends StObject
       with InterruptReason
  inline def NETWORK_FAILED: NETWORK_FAILED = "NETWORK_FAILED".asInstanceOf[NETWORK_FAILED]
  
  @js.native
  sealed trait NETWORK_INVALID_REQUEST
    extends StObject
       with InterruptReason
  inline def NETWORK_INVALID_REQUEST: NETWORK_INVALID_REQUEST = "NETWORK_INVALID_REQUEST".asInstanceOf[NETWORK_INVALID_REQUEST]
  
  @js.native
  sealed trait NETWORK_SERVER_DOWN
    extends StObject
       with InterruptReason
  inline def NETWORK_SERVER_DOWN: NETWORK_SERVER_DOWN = "NETWORK_SERVER_DOWN".asInstanceOf[NETWORK_SERVER_DOWN]
  
  @js.native
  sealed trait NETWORK_TIMEOUT
    extends StObject
       with InterruptReason
  inline def NETWORK_TIMEOUT: NETWORK_TIMEOUT = "NETWORK_TIMEOUT".asInstanceOf[NETWORK_TIMEOUT]
  
  @js.native
  sealed trait POST
    extends StObject
       with DownloadOptionsMethod
  inline def POST: POST = "POST".asInstanceOf[POST]
  
  @js.native
  sealed trait SERVER_BAD_CONTENT
    extends StObject
       with InterruptReason
  inline def SERVER_BAD_CONTENT: SERVER_BAD_CONTENT = "SERVER_BAD_CONTENT".asInstanceOf[SERVER_BAD_CONTENT]
  
  @js.native
  sealed trait SERVER_CERT_PROBLEM
    extends StObject
       with InterruptReason
  inline def SERVER_CERT_PROBLEM: SERVER_CERT_PROBLEM = "SERVER_CERT_PROBLEM".asInstanceOf[SERVER_CERT_PROBLEM]
  
  @js.native
  sealed trait SERVER_FAILED
    extends StObject
       with InterruptReason
  inline def SERVER_FAILED: SERVER_FAILED = "SERVER_FAILED".asInstanceOf[SERVER_FAILED]
  
  @js.native
  sealed trait SERVER_FORBIDDEN
    extends StObject
       with InterruptReason
  inline def SERVER_FORBIDDEN: SERVER_FORBIDDEN = "SERVER_FORBIDDEN".asInstanceOf[SERVER_FORBIDDEN]
  
  @js.native
  sealed trait SERVER_NO_RANGE
    extends StObject
       with InterruptReason
  inline def SERVER_NO_RANGE: SERVER_NO_RANGE = "SERVER_NO_RANGE".asInstanceOf[SERVER_NO_RANGE]
  
  @js.native
  sealed trait SERVER_UNAUTHORIZED
    extends StObject
       with InterruptReason
  inline def SERVER_UNAUTHORIZED: SERVER_UNAUTHORIZED = "SERVER_UNAUTHORIZED".asInstanceOf[SERVER_UNAUTHORIZED]
  
  @js.native
  sealed trait Screen
    extends StObject
       with QueryQueryInfoScreen
  inline def Screen: Screen = "Screen".asInstanceOf[Screen]
  
  @js.native
  sealed trait Shift
    extends StObject
       with OnClickDataModifiers
       with typingsJapgolly.firefoxWebextBrowser.browser.menus.OnClickDataModifiers
       with typingsJapgolly.firefoxWebextBrowser.browser.pageAction.OnClickDataModifiers
       with typingsJapgolly.firefoxWebextBrowser.browser.action.OnClickDataModifiers
       with typingsJapgolly.firefoxWebextBrowser.browser.browserAction.OnClickDataModifiers
  inline def Shift: Shift = "Shift".asInstanceOf[Shift]
  
  @js.native
  sealed trait TLSv1
    extends StObject
       with SecurityInfoProtocolVersion
       with TlsVersionRestrictionConfigMaximum
       with TlsVersionRestrictionConfigMinimum
  inline def TLSv1: TLSv1 = "TLSv1".asInstanceOf[TLSv1]
  
  @js.native
  sealed trait TLSv1Dot1
    extends StObject
       with SecurityInfoProtocolVersion
       with TlsVersionRestrictionConfigMaximum
       with TlsVersionRestrictionConfigMinimum
  inline def TLSv1Dot1: TLSv1Dot1 = "TLSv1.1".asInstanceOf[TLSv1Dot1]
  
  @js.native
  sealed trait TLSv1Dot2
    extends StObject
       with SecurityInfoProtocolVersion
       with TlsVersionRestrictionConfigMaximum
       with TlsVersionRestrictionConfigMinimum
  inline def TLSv1Dot2: TLSv1Dot2 = "TLSv1.2".asInstanceOf[TLSv1Dot2]
  
  @js.native
  sealed trait TLSv1Dot3
    extends StObject
       with SecurityInfoProtocolVersion
       with TlsVersionRestrictionConfigMaximum
       with TlsVersionRestrictionConfigMinimum
  inline def TLSv1Dot3: TLSv1Dot3 = "TLSv1.3".asInstanceOf[TLSv1Dot3]
  
  @js.native
  sealed trait USER_CANCELED
    extends StObject
       with InterruptReason
  inline def USER_CANCELED: USER_CANCELED = "USER_CANCELED".asInstanceOf[USER_CANCELED]
  
  @js.native
  sealed trait USER_SHUTDOWN
    extends StObject
       with InterruptReason
  inline def USER_SHUTDOWN: USER_SHUTDOWN = "USER_SHUTDOWN".asInstanceOf[USER_SHUTDOWN]
  
  @js.native
  sealed trait Window
    extends StObject
       with QueryQueryInfoScreen
  inline def Window: Window = "Window".asInstanceOf[Window]
  
  @js.native
  sealed trait _empty extends StObject
  inline def _empty: _empty = "".asInstanceOf[_empty]
  
  @js.native
  sealed trait _execute_action
    extends StObject
       with CreateCreatePropertiesCommand
       with typingsJapgolly.firefoxWebextBrowser.browser.menus.CreateCreatePropertiesCommand
  inline def _execute_action: _execute_action = "_execute_action".asInstanceOf[_execute_action]
  
  @js.native
  sealed trait _execute_browser_action
    extends StObject
       with CreateCreatePropertiesCommand
       with typingsJapgolly.firefoxWebextBrowser.browser.menus.CreateCreatePropertiesCommand
  inline def _execute_browser_action: _execute_browser_action = "_execute_browser_action".asInstanceOf[_execute_browser_action]
  
  @js.native
  sealed trait _execute_page_action
    extends StObject
       with CreateCreatePropertiesCommand
       with typingsJapgolly.firefoxWebextBrowser.browser.menus.CreateCreatePropertiesCommand
  inline def _execute_page_action: _execute_page_action = "_execute_page_action".asInstanceOf[_execute_page_action]
  
  @js.native
  sealed trait _execute_sidebar_action
    extends StObject
       with CreateCreatePropertiesCommand
       with typingsJapgolly.firefoxWebextBrowser.browser.menus.CreateCreatePropertiesCommand
  inline def _execute_sidebar_action: _execute_sidebar_action = "_execute_sidebar_action".asInstanceOf[_execute_sidebar_action]
  
  @js.native
  sealed trait aarch64
    extends StObject
       with PlatformArch
  inline def aarch64: aarch64 = "aarch64".asInstanceOf[aarch64]
  
  @js.native
  sealed trait abandonment
    extends StObject
       with EngagementState
  inline def abandonment: abandonment = "abandonment".asInstanceOf[abandonment]
  
  @js.native
  sealed trait accepted
    extends StObject
       with DangerType
  inline def accepted: accepted = "accepted".asInstanceOf[accepted]
  
  @js.native
  sealed trait action
    extends StObject
       with _ContextType
       with typingsJapgolly.firefoxWebextBrowser.browser.menus._ContextType
  inline def action: action = "action".asInstanceOf[action]
  
  @js.native
  sealed trait active
    extends StObject
       with IdleState
  inline def active: active = "active".asInstanceOf[active]
  
  @js.native
  sealed trait activeTab
    extends StObject
       with _OptionalPermissionNoPrompt
  inline def activeTab: activeTab = "activeTab".asInstanceOf[activeTab]
  
  @js.native
  sealed trait activityLog
    extends StObject
       with _PermissionNoPrompt
  inline def activityLog: activityLog = "activityLog".asInstanceOf[activityLog]
  
  @js.native
  sealed trait addon_child
    extends StObject
       with APIChildScope
  inline def addon_child: addon_child = "addon_child".asInstanceOf[addon_child]
  
  @js.native
  sealed trait addon_parent
    extends StObject
       with APIParentScope
  inline def addon_parent: addon_parent = "addon_parent".asInstanceOf[addon_parent]
  
  @js.native
  sealed trait alarms
    extends StObject
       with _PermissionNoPrompt
  inline def alarms: alarms = "alarms".asInstanceOf[alarms]
  
  @js.native
  sealed trait all
    extends StObject
       with _ContextType
       with typingsJapgolly.firefoxWebextBrowser.browser.menus._ContextType
  inline def all: all = "all".asInstanceOf[all]
  
  @js.native
  sealed trait allow_all
    extends StObject
       with CookieConfigBehavior
  inline def allow_all: allow_all = "allow_all".asInstanceOf[allow_all]
  
  @js.native
  sealed trait allow_name_collisions
    extends StObject
       with _ResolveFlags
  inline def allow_name_collisions: allow_name_collisions = "allow_name_collisions".asInstanceOf[allow_name_collisions]
  
  @js.native
  sealed trait allow_visited
    extends StObject
       with CookieConfigBehavior
  inline def allow_visited: allow_visited = "allow_visited".asInstanceOf[allow_visited]
  
  @js.native
  sealed trait always
    extends StObject
       with HTTPSOnlyModeOption
       with TrackingProtectionModeOption
  inline def always: always = "always".asInstanceOf[always]
  
  @js.native
  sealed trait android
    extends StObject
       with PlatformOs
  inline def android: android = "android".asInstanceOf[android]
  
  @js.native
  sealed trait any_basic_tracking
    extends StObject
       with UrlClassificationFlags
  inline def any_basic_tracking: any_basic_tracking = "any_basic_tracking".asInstanceOf[any_basic_tracking]
  
  @js.native
  sealed trait any_social_tracking
    extends StObject
       with UrlClassificationFlags
  inline def any_social_tracking: any_social_tracking = "any_social_tracking".asInstanceOf[any_social_tracking]
  
  @js.native
  sealed trait any_strict_tracking
    extends StObject
       with UrlClassificationFlags
  inline def any_strict_tracking: any_strict_tracking = "any_strict_tracking".asInstanceOf[any_strict_tracking]
  
  @js.native
  sealed trait api_call
    extends StObject
       with OnExtensionActivityDetailsType
  inline def api_call: api_call = "api_call".asInstanceOf[api_call]
  
  @js.native
  sealed trait api_event
    extends StObject
       with OnExtensionActivityDetailsType
  inline def api_event: api_event = "api_event".asInstanceOf[api_event]
  
  @js.native
  sealed trait app
    extends StObject
       with WindowType
       with typingsJapgolly.firefoxWebextBrowser.browser.tabs.WindowType
  inline def app: app = "app".asInstanceOf[app]
  
  @js.native
  sealed trait app_update
    extends StObject
       with OnRestartRequiredReason
  inline def app_update: app_update = "app_update".asInstanceOf[app_update]
  
  @js.native
  sealed trait arm
    extends StObject
       with PlatformArch
       with PlatformNaclArch
  inline def arm: arm = "arm".asInstanceOf[arm]
  
  @js.native
  sealed trait asyncBlocking
    extends StObject
       with OnAuthRequiredOptions
  inline def asyncBlocking: asyncBlocking = "asyncBlocking".asInstanceOf[asyncBlocking]
  
  @js.native
  sealed trait attention
    extends StObject
       with UpdatePropertyName
  inline def attention: attention = "attention".asInstanceOf[attention]
  
  @js.native
  sealed trait audible
    extends StObject
       with UpdatePropertyName
  inline def audible: audible = "audible".asInstanceOf[audible]
  
  @js.native
  sealed trait audio
    extends StObject
       with _ContextType
       with typingsJapgolly.firefoxWebextBrowser.browser.menus._ContextType
  inline def audio: audio = "audio".asInstanceOf[audio]
  
  @js.native
  sealed trait audiocallbacktracing
    extends StObject
       with ProfilerFeature
  inline def audiocallbacktracing: audiocallbacktracing = "audiocallbacktracing".asInstanceOf[audiocallbacktracing]
  
  @js.native
  sealed trait author
    extends StObject
       with CSSOrigin
  inline def author: author = "author".asInstanceOf[author]
  
  @js.native
  sealed trait autoConfig
    extends StObject
       with ProxyConfigProxyType
  inline def autoConfig: autoConfig = "autoConfig".asInstanceOf[autoConfig]
  
  @js.native
  sealed trait autoDetect
    extends StObject
       with ProxyConfigProxyType
  inline def autoDetect: autoDetect = "autoDetect".asInstanceOf[autoDetect]
  
  @js.native
  sealed trait auto_bookmark
    extends StObject
       with TransitionType
       with typingsJapgolly.firefoxWebextBrowser.browser.history.TransitionType
  inline def auto_bookmark: auto_bookmark = "auto_bookmark".asInstanceOf[auto_bookmark]
  
  @js.native
  sealed trait auto_subframe
    extends StObject
       with TransitionType
       with typingsJapgolly.firefoxWebextBrowser.browser.history.TransitionType
  inline def auto_subframe: auto_subframe = "auto_subframe".asInstanceOf[auto_subframe]
  
  @js.native
  sealed trait auto_toplevel
    extends StObject
       with typingsJapgolly.firefoxWebextBrowser.browser.history.TransitionType
  inline def auto_toplevel: auto_toplevel = "auto_toplevel".asInstanceOf[auto_toplevel]
  
  @js.native
  sealed trait automatic
    extends StObject
       with ZoomSettingsMode
  inline def automatic: automatic = "automatic".asInstanceOf[automatic]
  
  @js.native
  sealed trait background
    extends StObject
       with OnExtensionActivityDetailsViewType
  inline def background: background = "background".asInstanceOf[background]
  
  @js.native
  sealed trait basic
    extends StObject
       with TemplateType
  inline def basic: basic = "basic".asInstanceOf[basic]
  
  @js.native
  sealed trait beacon
    extends StObject
       with ResourceType
  inline def beacon: beacon = "beacon".asInstanceOf[beacon]
  
  @js.native
  sealed trait bitcoin
    extends StObject
       with ProtocolHandlerProtocol
  inline def bitcoin: bitcoin = "bitcoin".asInstanceOf[bitcoin]
  
  @js.native
  sealed trait blocking
    extends StObject
       with OnAuthRequiredOptions
       with OnBeforeRequestOptions
       with OnBeforeSendHeadersOptions
       with OnHeadersReceivedOptions
  inline def blocking: blocking = "blocking".asInstanceOf[blocking]
  
  @js.native
  sealed trait bookmark
    extends StObject
       with BookmarkTreeNodeType
       with OverrideContextContextOptionsContext
       with typingsJapgolly.firefoxWebextBrowser.browser.menus.OverrideContextContextOptionsContext
       with _ContextType
       with typingsJapgolly.firefoxWebextBrowser.browser.menus._ContextType
  inline def bookmark: bookmark = "bookmark".asInstanceOf[bookmark]
  
  @js.native
  sealed trait bookmarks
    extends StObject
       with SourceType
       with _OptionalPermission
  inline def bookmarks: bookmarks = "bookmarks".asInstanceOf[bookmarks]
  
  @js.native
  sealed trait boolean
    extends StObject
       with ScalarType
  inline def boolean: boolean = "boolean".asInstanceOf[boolean]
  
  @js.native
  sealed trait bottom
    extends StObject
       with ThemeTypeAdditionalBackgroundsAlignment
  inline def bottom: bottom = "bottom".asInstanceOf[bottom]
  
  @js.native
  sealed trait broken
    extends StObject
       with SecurityInfoState
  inline def broken: broken = "broken".asInstanceOf[broken]
  
  @js.native
  sealed trait browserSettings
    extends StObject
       with _OptionalPermission
  inline def browserSettings: browserSettings = "browserSettings".asInstanceOf[browserSettings]
  
  @js.native
  sealed trait browser_action
    extends StObject
       with _ContextType
       with typingsJapgolly.firefoxWebextBrowser.browser.menus._ContextType
  inline def browser_action: browser_action = "browser_action".asInstanceOf[browser_action]
  
  @js.native
  sealed trait browser_update
    extends StObject
       with OnInstalledReason
  inline def browser_update: browser_update = "browser_update".asInstanceOf[browser_update]
  
  @js.native
  sealed trait browsingData
    extends StObject
       with _OptionalPermission
  inline def browsingData: browsingData = "browsingData".asInstanceOf[browsingData]
  
  @js.native
  sealed trait bypass_cache
    extends StObject
       with _ResolveFlags
  inline def bypass_cache: bypass_cache = "bypass_cache".asInstanceOf[bypass_cache]
  
  @js.native
  sealed trait canonical_name
    extends StObject
       with _ResolveFlags
  inline def canonical_name: canonical_name = "canonical_name".asInstanceOf[canonical_name]
  
  @js.native
  sealed trait captive
    extends StObject
       with OnConnectivityAvailableStatus
  inline def captive: captive = "captive".asInstanceOf[captive]
  
  @js.native
  sealed trait captivePortal
    extends StObject
       with _PermissionNoPrompt
  inline def captivePortal: captivePortal = "captivePortal".asInstanceOf[captivePortal]
  
  @js.native
  sealed trait capture
    extends StObject
       with MutedInfoReason
  inline def capture: capture = "capture".asInstanceOf[capture]
  
  @js.native
  sealed trait center
    extends StObject
       with ThemeTypeAdditionalBackgroundsAlignment
  inline def center: center = "center".asInstanceOf[center]
  
  @js.native
  sealed trait `center bottom`
    extends StObject
       with ThemeTypeAdditionalBackgroundsAlignment
  inline def `center bottom`: `center bottom` = ("center bottom").asInstanceOf[`center bottom`]
  
  @js.native
  sealed trait `center center`
    extends StObject
       with ThemeTypeAdditionalBackgroundsAlignment
  inline def `center center`: `center center` = ("center center").asInstanceOf[`center center`]
  
  @js.native
  sealed trait `center top`
    extends StObject
       with ThemeTypeAdditionalBackgroundsAlignment
  inline def `center top`: `center top` = ("center top").asInstanceOf[`center top`]
  
  @js.native
  sealed trait checkbox
    extends StObject
       with ItemType
       with typingsJapgolly.firefoxWebextBrowser.browser.menus.ItemType
  inline def checkbox: checkbox = "checkbox".asInstanceOf[checkbox]
  
  @js.native
  sealed trait cipher extends StObject
  inline def cipher: cipher = "cipher".asInstanceOf[cipher]
  
  @js.native
  sealed trait clear
    extends StObject
       with OnConnectivityAvailableStatus
  inline def clear: clear = "clear".asInstanceOf[clear]
  
  @js.native
  sealed trait client_redirect
    extends StObject
       with TransitionQualifier
  inline def client_redirect: client_redirect = "client_redirect".asInstanceOf[client_redirect]
  
  @js.native
  sealed trait clipboardRead
    extends StObject
       with _OptionalPermission
  inline def clipboardRead: clipboardRead = "clipboardRead".asInstanceOf[clipboardRead]
  
  @js.native
  sealed trait clipboardWrite
    extends StObject
       with _OptionalPermission
  inline def clipboardWrite: clipboardWrite = "clipboardWrite".asInstanceOf[clipboardWrite]
  
  @js.native
  sealed trait closed
    extends StObject
       with StreamFilterStatus
  inline def closed: closed = "closed".asInstanceOf[closed]
  
  @js.native
  sealed trait complete
    extends StObject
       with State
       with TabStatus
  inline def complete: complete = "complete".asInstanceOf[complete]
  
  @js.native
  sealed trait content
    extends StObject
       with DangerType
  inline def content: content = "content".asInstanceOf[content]
  
  @js.native
  sealed trait content_child
    extends StObject
       with APIChildScope
  inline def content_child: content_child = "content_child".asInstanceOf[content_child]
  
  @js.native
  sealed trait content_parent
    extends StObject
       with APIParentScope
  inline def content_parent: content_parent = "content_parent".asInstanceOf[content_parent]
  
  @js.native
  sealed trait content_script
    extends StObject
       with OnExtensionActivityDetailsType
  inline def content_script: content_script = "content_script".asInstanceOf[content_script]
  
  @js.native
  sealed trait contextMenus
    extends StObject
       with _PermissionNoPrompt
  inline def contextMenus: contextMenus = "contextMenus".asInstanceOf[contextMenus]
  
  @js.native
  sealed trait contextmenu
    extends StObject
       with WebExtensionManifestChromeSettingsOverridesSearchProviderParamsPurpose
  inline def contextmenu: contextmenu = "contextmenu".asInstanceOf[contextmenu]
  
  @js.native
  sealed trait contextualIdentities
    extends StObject
       with _PermissionNoPrompt
  inline def contextualIdentities: contextualIdentities = "contextualIdentities".asInstanceOf[contextualIdentities]
  
  @js.native
  sealed trait controllable_by_this_extension
    extends StObject
       with LevelOfControl
  inline def controllable_by_this_extension: controllable_by_this_extension = "controllable_by_this_extension".asInstanceOf[controllable_by_this_extension]
  
  @js.native
  sealed trait controlled_by_other_extensions
    extends StObject
       with LevelOfControl
  inline def controlled_by_other_extensions: controlled_by_other_extensions = "controlled_by_other_extensions".asInstanceOf[controlled_by_other_extensions]
  
  @js.native
  sealed trait controlled_by_this_extension
    extends StObject
       with LevelOfControl
  inline def controlled_by_this_extension: controlled_by_this_extension = "controlled_by_this_extension".asInstanceOf[controlled_by_this_extension]
  
  @js.native
  sealed trait cookies
    extends StObject
       with _OptionalPermissionNoPrompt
  inline def cookies: cookies = "cookies".asInstanceOf[cookies]
  
  @js.native
  sealed trait count
    extends StObject
       with ScalarType
  inline def count: count = "count".asInstanceOf[count]
  
  @js.native
  sealed trait cpu
    extends StObject
       with ProfilerFeature
  inline def cpu: cpu = "cpu".asInstanceOf[cpu]
  
  @js.native
  sealed trait cros
    extends StObject
       with PlatformOs
  inline def cros: cros = "cros".asInstanceOf[cros]
  
  @js.native
  sealed trait cryptomining
    extends StObject
       with UrlClassificationFlags
  inline def cryptomining: cryptomining = "cryptomining".asInstanceOf[cryptomining]
  
  @js.native
  sealed trait cryptomining_content
    extends StObject
       with UrlClassificationFlags
  inline def cryptomining_content: cryptomining_content = "cryptomining_content".asInstanceOf[cryptomining_content]
  
  @js.native
  sealed trait csp_report
    extends StObject
       with ResourceType
  inline def csp_report: csp_report = "csp_report".asInstanceOf[csp_report]
  
  @js.native
  sealed trait currentTab
    extends StObject
       with OnInputEnteredDisposition
  inline def currentTab: currentTab = "currentTab".asInstanceOf[currentTab]
  
  @js.native
  sealed trait dat
    extends StObject
       with ProtocolHandlerProtocol
  inline def dat: dat = "dat".asInstanceOf[dat]
  
  @js.native
  sealed trait default_public_and_private_interfaces
    extends StObject
       with IPHandlingPolicy
  inline def default_public_and_private_interfaces: default_public_and_private_interfaces = "default_public_and_private_interfaces".asInstanceOf[default_public_and_private_interfaces]
  
  @js.native
  sealed trait default_public_interface_only
    extends StObject
       with IPHandlingPolicy
  inline def default_public_interface_only: default_public_interface_only = "default_public_interface_only".asInstanceOf[default_public_interface_only]
  
  @js.native
  sealed trait denied
    extends StObject
       with PermissionLevel
  inline def denied: denied = "denied".asInstanceOf[denied]
  
  @js.native
  sealed trait detached_panel
    extends StObject
       with CreateType
  inline def detached_panel: detached_panel = "detached_panel".asInstanceOf[detached_panel]
  
  @js.native
  sealed trait development
    extends StObject
       with ExtensionInstallType
  inline def development: development = "development".asInstanceOf[development]
  
  @js.native
  sealed trait devtools
    extends StObject
       with WindowType
       with typingsJapgolly.firefoxWebextBrowser.browser.tabs.WindowType
       with _OptionalPermission
  inline def devtools: devtools = "devtools".asInstanceOf[devtools]
  
  @js.native
  sealed trait devtools_child
    extends StObject
       with APIChildScope
  inline def devtools_child: devtools_child = "devtools_child".asInstanceOf[devtools_child]
  
  @js.native
  sealed trait devtools_page
    extends StObject
       with OnExtensionActivityDetailsViewType
  inline def devtools_page: devtools_page = "devtools_page".asInstanceOf[devtools_page]
  
  @js.native
  sealed trait devtools_panel
    extends StObject
       with OnExtensionActivityDetailsViewType
  inline def devtools_panel: devtools_panel = "devtools_panel".asInstanceOf[devtools_panel]
  
  @js.native
  sealed trait devtools_parent
    extends StObject
       with APIParentScope
  inline def devtools_parent: devtools_parent = "devtools_parent".asInstanceOf[devtools_parent]
  
  @js.native
  sealed trait dim
    extends StObject
       with DescriptionStyleType
  inline def dim: dim = "dim".asInstanceOf[dim]
  
  @js.native
  sealed trait disable_ipv4
    extends StObject
       with _ResolveFlags
  inline def disable_ipv4: disable_ipv4 = "disable_ipv4".asInstanceOf[disable_ipv4]
  
  @js.native
  sealed trait disable_ipv6
    extends StObject
       with _ResolveFlags
  inline def disable_ipv6: disable_ipv6 = "disable_ipv6".asInstanceOf[disable_ipv6]
  
  @js.native
  sealed trait disable_non_proxied_udp
    extends StObject
       with IPHandlingPolicy
  inline def disable_non_proxied_udp: disable_non_proxied_udp = "disable_non_proxied_udp".asInstanceOf[disable_non_proxied_udp]
  
  @js.native
  sealed trait disable_trr
    extends StObject
       with _ResolveFlags
  inline def disable_trr: disable_trr = "disable_trr".asInstanceOf[disable_trr]
  
  @js.native
  sealed trait disabled
    extends StObject
       with ZoomSettingsMode
  inline def disabled: disabled = "disabled".asInstanceOf[disabled]
  
  @js.native
  sealed trait discard
    extends StObject
       with EngagementState
  inline def discard: discard = "discard".asInstanceOf[discard]
  
  @js.native
  sealed trait discarded
    extends StObject
       with UpdatePropertyName
  inline def discarded: discarded = "discarded".asInstanceOf[discarded]
  
  @js.native
  sealed trait disconnected
    extends StObject
       with StreamFilterStatus
  inline def disconnected: disconnected = "disconnected".asInstanceOf[disconnected]
  
  @js.native
  sealed trait dns
    extends StObject
       with _PermissionNoPrompt
  inline def dns: dns = "dns".asInstanceOf[dns]
  
  @js.native
  sealed trait docked
    extends StObject
       with WindowState
  inline def docked: docked = "docked".asInstanceOf[docked]
  
  @js.native
  sealed trait document_end
    extends StObject
       with RunAt
  inline def document_end: document_end = "document_end".asInstanceOf[document_end]
  
  @js.native
  sealed trait document_idle
    extends StObject
       with RunAt
  inline def document_idle: document_idle = "document_idle".asInstanceOf[document_idle]
  
  @js.native
  sealed trait document_start
    extends StObject
       with RunAt
  inline def document_start: document_start = "document_start".asInstanceOf[document_start]
  
  @js.native
  sealed trait down
    extends StObject
       with NetworkLinkInfoStatus
  inline def down: down = "down".asInstanceOf[down]
  
  @js.native
  sealed trait downloads
    extends StObject
       with _OptionalPermission
  inline def downloads: downloads = "downloads".asInstanceOf[downloads]
  
  @js.native
  sealed trait downloadsDotopen
    extends StObject
       with _OptionalPermission
  inline def downloadsDotopen: downloadsDotopen = "downloads.open".asInstanceOf[downloadsDotopen]
  
  @js.native
  sealed trait dweb
    extends StObject
       with ProtocolHandlerProtocol
  inline def dweb: dweb = "dweb".asInstanceOf[dweb]
  
  @js.native
  sealed trait dynamic
    extends StObject
       with ResultType
  inline def dynamic: dynamic = "dynamic".asInstanceOf[dynamic]
  
  @js.native
  sealed trait editable
    extends StObject
       with _ContextType
       with typingsJapgolly.firefoxWebextBrowser.browser.menus._ContextType
  inline def editable: editable = "editable".asInstanceOf[editable]
  
  @js.native
  sealed trait engagement
    extends StObject
       with EngagementState
  inline def engagement: engagement = "engagement".asInstanceOf[engagement]
  
  @js.native
  sealed trait ethernet
    extends StObject
       with NetworkLinkInfoType
  inline def ethernet: ethernet = "ethernet".asInstanceOf[ethernet]
  
  @js.native
  sealed trait evicted
    extends StObject
       with OnChangedCause
  inline def evicted: evicted = "evicted".asInstanceOf[evicted]
  
  @js.native
  sealed trait expired
    extends StObject
       with OnChangedCause
  inline def expired: expired = "expired".asInstanceOf[expired]
  
  @js.native
  sealed trait expired_overwrite
    extends StObject
       with OnChangedCause
  inline def expired_overwrite: expired_overwrite = "expired_overwrite".asInstanceOf[expired_overwrite]
  
  @js.native
  sealed trait explicit
    extends StObject
       with OnChangedCause
  inline def explicit: explicit = "explicit".asInstanceOf[explicit]
  
  @js.native
  sealed trait `extension`
    extends StObject
       with ExtensionType
       with MutedInfoReason
  inline def `extension`: `extension` = "extension".asInstanceOf[`extension`]
  
  @js.native
  sealed trait failed
    extends StObject
       with StreamFilterStatus
  inline def failed: failed = "failed".asInstanceOf[failed]
  
  @js.native
  sealed trait favIconUrl
    extends StObject
       with UpdatePropertyName
  inline def favIconUrl: favIconUrl = "favIconUrl".asInstanceOf[favIconUrl]
  
  @js.native
  sealed trait file
    extends StObject
       with DangerType
  inline def file: file = "file".asInstanceOf[file]
  
  @js.native
  sealed trait fileio
    extends StObject
       with ProfilerFeature
  inline def fileio: fileio = "fileio".asInstanceOf[fileio]
  
  @js.native
  sealed trait fileioall
    extends StObject
       with ProfilerFeature
  inline def fileioall: fileioall = "fileioall".asInstanceOf[fileioall]
  
  @js.native
  sealed trait find
    extends StObject
       with _OptionalPermission
  inline def find: find = "find".asInstanceOf[find]
  
  @js.native
  sealed trait fingerprinting
    extends StObject
       with UrlClassificationFlags
  inline def fingerprinting: fingerprinting = "fingerprinting".asInstanceOf[fingerprinting]
  
  @js.native
  sealed trait fingerprinting_content
    extends StObject
       with UrlClassificationFlags
  inline def fingerprinting_content: fingerprinting_content = "fingerprinting_content".asInstanceOf[fingerprinting_content]
  
  @js.native
  sealed trait finishedtransferringdata
    extends StObject
       with StreamFilterStatus
  inline def finishedtransferringdata: finishedtransferringdata = "finishedtransferringdata".asInstanceOf[finishedtransferringdata]
  
  @js.native
  sealed trait folder
    extends StObject
       with BookmarkTreeNodeType
  inline def folder: folder = "folder".asInstanceOf[folder]
  
  @js.native
  sealed trait font
    extends StObject
       with ResourceType
  inline def font: font = "font".asInstanceOf[font]
  
  @js.native
  sealed trait form_submit
    extends StObject
       with TransitionType
       with typingsJapgolly.firefoxWebextBrowser.browser.history.TransitionType
  inline def form_submit: form_submit = "form_submit".asInstanceOf[form_submit]
  
  @js.native
  sealed trait forward_back
    extends StObject
       with TransitionQualifier
  inline def forward_back: forward_back = "forward_back".asInstanceOf[forward_back]
  
  @js.native
  sealed trait frame
    extends StObject
       with _ContextType
       with typingsJapgolly.firefoxWebextBrowser.browser.menus._ContextType
  inline def frame: frame = "frame".asInstanceOf[frame]
  
  @js.native
  sealed trait from_address_bar
    extends StObject
       with TransitionQualifier
  inline def from_address_bar: from_address_bar = "from_address_bar".asInstanceOf[from_address_bar]
  
  @js.native
  sealed trait ftp
    extends StObject
       with ProtocolHandlerProtocol
  inline def ftp: ftp = "ftp".asInstanceOf[ftp]
  
  @js.native
  sealed trait full
    extends StObject
       with ColorManagementMode
  inline def full: full = "full".asInstanceOf[full]
  
  @js.native
  sealed trait fullscreen
    extends StObject
       with WindowState
  inline def fullscreen: fullscreen = "fullscreen".asInstanceOf[fullscreen]
  
  @js.native
  sealed trait geckoProfiler
    extends StObject
       with _PermissionNoPrompt
  inline def geckoProfiler: geckoProfiler = "geckoProfiler".asInstanceOf[geckoProfiler]
  
  @js.native
  sealed trait generated
    extends StObject
       with TransitionType
       with typingsJapgolly.firefoxWebextBrowser.browser.history.TransitionType
  inline def generated: generated = "generated".asInstanceOf[generated]
  
  @js.native
  sealed trait geo
    extends StObject
       with ProtocolHandlerProtocol
  inline def geo: geo = "geo".asInstanceOf[geo]
  
  @js.native
  sealed trait geolocation
    extends StObject
       with _OptionalPermission
  inline def geolocation: geolocation = "geolocation".asInstanceOf[geolocation]
  
  @js.native
  sealed trait gopher
    extends StObject
       with ProtocolHandlerProtocol
  inline def gopher: gopher = "gopher".asInstanceOf[gopher]
  
  @js.native
  sealed trait granted
    extends StObject
       with PermissionLevel
  inline def granted: granted = "granted".asInstanceOf[granted]
  
  @js.native
  sealed trait hidden
    extends StObject
       with UpdatePropertyName
  inline def hidden: hidden = "hidden".asInstanceOf[hidden]
  
  @js.native
  sealed trait history
    extends StObject
       with SourceType
       with _OptionalPermission
  inline def history: history = "history".asInstanceOf[history]
  
  @js.native
  sealed trait homepage
    extends StObject
       with WebExtensionManifestChromeSettingsOverridesSearchProviderParamsPurpose
  inline def homepage: homepage = "homepage".asInstanceOf[homepage]
  
  @js.native
  sealed trait host
    extends StObject
       with DangerType
  inline def host: host = "host".asInstanceOf[host]
  
  @js.native
  sealed trait identity
    extends StObject
       with _PermissionNoPrompt
  inline def identity: identity = "identity".asInstanceOf[identity]
  
  @js.native
  sealed trait idle
    extends StObject
       with IdleState
       with _OptionalPermissionNoPrompt
  inline def idle: idle = "idle".asInstanceOf[idle]
  
  @js.native
  sealed trait im
    extends StObject
       with ProtocolHandlerProtocol
  inline def im: im = "im".asInstanceOf[im]
  
  @js.native
  sealed trait image
    extends StObject
       with ResourceType
       with TemplateType
       with _ContextType
       with typingsJapgolly.firefoxWebextBrowser.browser.menus._ContextType
  inline def image: image = "image".asInstanceOf[image]
  
  @js.native
  sealed trait imageset
    extends StObject
       with ResourceType
  inline def imageset: imageset = "imageset".asInstanceOf[imageset]
  
  @js.native
  sealed trait in_progress
    extends StObject
       with State
  inline def in_progress: in_progress = "in_progress".asInstanceOf[in_progress]
  
  @js.native
  sealed trait inactive extends StObject
  inline def inactive: inactive = "inactive".asInstanceOf[inactive]
  
  @js.native
  sealed trait incognito_persistent
    extends StObject
       with SettingScope
  inline def incognito_persistent: incognito_persistent = "incognito_persistent".asInstanceOf[incognito_persistent]
  
  @js.native
  sealed trait incognito_session_only
    extends StObject
       with SettingScope
  inline def incognito_session_only: incognito_session_only = "incognito_session_only".asInstanceOf[incognito_session_only]
  
  @js.native
  sealed trait insecure
    extends StObject
       with SecurityInfoState
  inline def insecure: insecure = "insecure".asInstanceOf[insecure]
  
  @js.native
  sealed trait install
    extends StObject
       with OnInstalledReason
  inline def install: install = "install".asInstanceOf[install]
  
  @js.native
  sealed trait interrupted
    extends StObject
       with State
  inline def interrupted: interrupted = "interrupted".asInstanceOf[interrupted]
  
  @js.native
  sealed trait ipcmessages
    extends StObject
       with ProfilerFeature
  inline def ipcmessages: ipcmessages = "ipcmessages".asInstanceOf[ipcmessages]
  
  @js.native
  sealed trait ipfs
    extends StObject
       with ProtocolHandlerProtocol
  inline def ipfs: ipfs = "ipfs".asInstanceOf[ipfs]
  
  @js.native
  sealed trait ipns
    extends StObject
       with ProtocolHandlerProtocol
  inline def ipns: ipns = "ipns".asInstanceOf[ipns]
  
  @js.native
  sealed trait irc
    extends StObject
       with ProtocolHandlerProtocol
  inline def irc: irc = "irc".asInstanceOf[irc]
  
  @js.native
  sealed trait ircs
    extends StObject
       with ProtocolHandlerProtocol
  inline def ircs: ircs = "ircs".asInstanceOf[ircs]
  
  @js.native
  sealed trait isArticle
    extends StObject
       with UpdatePropertyName
  inline def isArticle: isArticle = "isArticle".asInstanceOf[isArticle]
  
  @js.native
  sealed trait java_
    extends StObject
       with ProfilerFeature
  inline def java_ : java_ = "java".asInstanceOf[java_]
  
  @js.native
  sealed trait jpeg
    extends StObject
       with ImageFormat
       with SetImageDataImageType
  inline def jpeg: jpeg = "jpeg".asInstanceOf[jpeg]
  
  @js.native
  sealed trait js_
    extends StObject
       with ProfilerFeature
  inline def js_ : js_ = "js".asInstanceOf[js_]
  
  @js.native
  sealed trait jsallocations
    extends StObject
       with ProfilerFeature
  inline def jsallocations: jsallocations = "jsallocations".asInstanceOf[jsallocations]
  
  @js.native
  sealed trait jstracer
    extends StObject
       with ProfilerFeature
  inline def jstracer: jstracer = "jstracer".asInstanceOf[jstracer]
  
  @js.native
  sealed trait keyword
    extends StObject
       with TransitionType
       with typingsJapgolly.firefoxWebextBrowser.browser.history.TransitionType
       with WebExtensionManifestChromeSettingsOverridesSearchProviderParamsPurpose
  inline def keyword: keyword = "keyword".asInstanceOf[keyword]
  
  @js.native
  sealed trait keyword_generated
    extends StObject
       with TransitionType
       with typingsJapgolly.firefoxWebextBrowser.browser.history.TransitionType
  inline def keyword_generated: keyword_generated = "keyword_generated".asInstanceOf[keyword_generated]
  
  @js.native
  sealed trait launcher
    extends StObject
       with _ContextType
       with typingsJapgolly.firefoxWebextBrowser.browser.menus._ContextType
  inline def launcher: launcher = "launcher".asInstanceOf[launcher]
  
  @js.native
  sealed trait lax
    extends StObject
       with SameSiteStatus
  inline def lax: lax = "lax".asInstanceOf[lax]
  
  @js.native
  sealed trait leaf
    extends StObject
       with ProfilerFeature
  inline def leaf: leaf = "leaf".asInstanceOf[leaf]
  
  @js.native
  sealed trait left
    extends StObject
       with ThemeTypeAdditionalBackgroundsAlignment
  inline def left: left = "left".asInstanceOf[left]
  
  @js.native
  sealed trait `left bottom`
    extends StObject
       with ThemeTypeAdditionalBackgroundsAlignment
  inline def `left bottom`: `left bottom` = ("left bottom").asInstanceOf[`left bottom`]
  
  @js.native
  sealed trait `left center`
    extends StObject
       with ThemeTypeAdditionalBackgroundsAlignment
  inline def `left center`: `left center` = ("left center").asInstanceOf[`left center`]
  
  @js.native
  sealed trait `left top`
    extends StObject
       with ThemeTypeAdditionalBackgroundsAlignment
  inline def `left top`: `left top` = ("left top").asInstanceOf[`left top`]
  
  @js.native
  sealed trait link
    extends StObject
       with TransitionType
       with typingsJapgolly.firefoxWebextBrowser.browser.history.TransitionType
       with _ContextType
       with typingsJapgolly.firefoxWebextBrowser.browser.menus._ContextType
  inline def link: link = "link".asInstanceOf[link]
  
  @js.native
  sealed trait linux
    extends StObject
       with PlatformOs
  inline def linux: linux = "linux".asInstanceOf[linux]
  
  @js.native
  sealed trait list
    extends StObject
       with TemplateType
  inline def list: list = "list".asInstanceOf[list]
  
  @js.native
  sealed trait loading
    extends StObject
       with TabStatus
  inline def loading: loading = "loading".asInstanceOf[loading]
  
  @js.native
  sealed trait local
    extends StObject
       with SourceType
  inline def local: local = "local".asInstanceOf[local]
  
  @js.native
  sealed trait locked_portal
    extends StObject
       with OnStateChangedDetailsState
  inline def locked_portal: locked_portal = "locked_portal".asInstanceOf[locked_portal]
  
  @js.native
  sealed trait mac
    extends StObject
       with PlatformOs
  inline def mac: mac = "mac".asInstanceOf[mac]
  
  @js.native
  sealed trait magnet
    extends StObject
       with ProtocolHandlerProtocol
  inline def magnet: magnet = "magnet".asInstanceOf[magnet]
  
  @js.native
  sealed trait mailto
    extends StObject
       with ProtocolHandlerProtocol
  inline def mailto: mailto = "mailto".asInstanceOf[mailto]
  
  @js.native
  sealed trait main_frame
    extends StObject
       with ResourceType
  inline def main_frame: main_frame = "main_frame".asInstanceOf[main_frame]
  
  @js.native
  sealed trait mainthreadio
    extends StObject
       with ProfilerFeature
  inline def mainthreadio: mainthreadio = "mainthreadio".asInstanceOf[mainthreadio]
  
  @js.native
  sealed trait managed extends StObject
  inline def managed: managed = "managed".asInstanceOf[managed]
  
  @js.native
  sealed trait management
    extends StObject
       with _OptionalPermission
  inline def management: management = "management".asInstanceOf[management]
  
  @js.native
  sealed trait manual
    extends StObject
       with ProxyConfigProxyType
       with ZoomSettingsMode
  inline def manual: manual = "manual".asInstanceOf[manual]
  
  @js.native
  sealed trait manual_subframe
    extends StObject
       with TransitionType
       with typingsJapgolly.firefoxWebextBrowser.browser.history.TransitionType
  inline def manual_subframe: manual_subframe = "manual_subframe".asInstanceOf[manual_subframe]
  
  @js.native
  sealed trait `match`
    extends StObject
       with DescriptionStyleType
  inline def `match`: `match` = "match".asInstanceOf[`match`]
  
  @js.native
  sealed trait matrix
    extends StObject
       with ProtocolHandlerProtocol
  inline def matrix: matrix = "matrix".asInstanceOf[matrix]
  
  @js.native
  sealed trait maximized
    extends StObject
       with WindowState
  inline def maximized: maximized = "maximized".asInstanceOf[maximized]
  
  @js.native
  sealed trait media
    extends StObject
       with ResourceType
  inline def media: media = "media".asInstanceOf[media]
  
  @js.native
  sealed trait menupanel
    extends StObject
       with ActionManifestDefaultArea
  inline def menupanel: menupanel = "menupanel".asInstanceOf[menupanel]
  
  @js.native
  sealed trait menus
    extends StObject
       with _PermissionNoPrompt
  inline def menus: menus = "menus".asInstanceOf[menus]
  
  @js.native
  sealed trait menusDotoverrideContext
    extends StObject
       with _OptionalPermissionNoPrompt
  inline def menusDotoverrideContext: menusDotoverrideContext = "menus.overrideContext".asInstanceOf[menusDotoverrideContext]
  
  @js.native
  sealed trait minimized
    extends StObject
       with WindowState
  inline def minimized: minimized = "minimized".asInstanceOf[minimized]
  
  @js.native
  sealed trait mms
    extends StObject
       with ProtocolHandlerProtocol
  inline def mms: mms = "mms".asInstanceOf[mms]
  
  @js.native
  sealed trait mobile
    extends StObject
       with NetworkLinkInfoType
  inline def mobile: mobile = "mobile".asInstanceOf[mobile]
  
  @js.native
  sealed trait mousedown
    extends StObject
       with ContextMenuMouseEvent
  inline def mousedown: mousedown = "mousedown".asInstanceOf[mousedown]
  
  @js.native
  sealed trait mouseup
    extends StObject
       with ContextMenuMouseEvent
  inline def mouseup: mouseup = "mouseup".asInstanceOf[mouseup]
  
  @js.native
  sealed trait mozillaAddons
    extends StObject
       with _PermissionNoPrompt
  inline def mozillaAddons: mozillaAddons = "mozillaAddons".asInstanceOf[mozillaAddons]
  
  @js.native
  sealed trait mutedInfo
    extends StObject
       with UpdatePropertyName
  inline def mutedInfo: mutedInfo = "mutedInfo".asInstanceOf[mutedInfo]
  
  @js.native
  sealed trait nativeMessaging
    extends StObject
       with _OptionalPermission
  inline def nativeMessaging: nativeMessaging = "nativeMessaging".asInstanceOf[nativeMessaging]
  
  @js.native
  sealed trait nativeallocations
    extends StObject
       with ProfilerFeature
  inline def nativeallocations: nativeallocations = "nativeallocations".asInstanceOf[nativeallocations]
  
  @js.native
  sealed trait navbar
    extends StObject
       with ActionManifestDefaultArea
  inline def navbar: navbar = "navbar".asInstanceOf[navbar]
  
  @js.native
  sealed trait network
    extends StObject
       with SourceType
  inline def network: network = "network".asInstanceOf[network]
  
  @js.native
  sealed trait networkStatus
    extends StObject
       with _PermissionNoPrompt
  inline def networkStatus: networkStatus = "networkStatus".asInstanceOf[networkStatus]
  
  @js.native
  sealed trait never
    extends StObject
       with HTTPSOnlyModeOption
       with TrackingProtectionModeOption
  inline def never: never = "never".asInstanceOf[never]
  
  @js.native
  sealed trait newBackgroundTab
    extends StObject
       with OnInputEnteredDisposition
  inline def newBackgroundTab: newBackgroundTab = "newBackgroundTab".asInstanceOf[newBackgroundTab]
  
  @js.native
  sealed trait newForegroundTab
    extends StObject
       with OnInputEnteredDisposition
  inline def newForegroundTab: newForegroundTab = "newForegroundTab".asInstanceOf[newForegroundTab]
  
  @js.native
  sealed trait news
    extends StObject
       with ProtocolHandlerProtocol
  inline def news: news = "news".asInstanceOf[news]
  
  @js.native
  sealed trait newtab
    extends StObject
       with WebExtensionManifestChromeSettingsOverridesSearchProviderParamsPurpose
  inline def newtab: newtab = "newtab".asInstanceOf[newtab]
  
  @js.native
  sealed trait nntp
    extends StObject
       with ProtocolHandlerProtocol
  inline def nntp: nntp = "nntp".asInstanceOf[nntp]
  
  @js.native
  sealed trait `no-repeat`
    extends StObject
       with ThemeTypeAdditionalBackgroundsTiling
  inline def `no-repeat`: `no-repeat` = "no-repeat".asInstanceOf[`no-repeat`]
  
  @js.native
  sealed trait no_restriction
    extends StObject
       with SameSiteStatus
  inline def no_restriction: no_restriction = "no_restriction".asInstanceOf[no_restriction]
  
  @js.native
  sealed trait no_update
    extends StObject
       with RequestUpdateCheckStatus
  inline def no_update: no_update = "no_update".asInstanceOf[no_update]
  
  @js.native
  sealed trait noiostacks
    extends StObject
       with ProfilerFeature
  inline def noiostacks: noiostacks = "noiostacks".asInstanceOf[noiostacks]
  
  @js.native
  sealed trait none
    extends StObject
       with ImageAnimationBehavior
       with ProxyConfigProxyType
  inline def none: none = "none".asInstanceOf[none]
  
  @js.native
  sealed trait normal
    extends StObject
       with CreateType
       with ExtensionInstallType
       with ImageAnimationBehavior
       with ItemType
       with typingsJapgolly.firefoxWebextBrowser.browser.menus.ItemType
       with WindowState
       with WindowType
       with typingsJapgolly.firefoxWebextBrowser.browser.tabs.WindowType
  inline def normal: normal = "normal".asInstanceOf[normal]
  
  @js.native
  sealed trait normandyAddonStudy
    extends StObject
       with _PermissionNoPrompt
  inline def normandyAddonStudy: normandyAddonStudy = "normandyAddonStudy".asInstanceOf[normandyAddonStudy]
  
  @js.native
  sealed trait nostacksampling
    extends StObject
       with ProfilerFeature
  inline def nostacksampling: nostacksampling = "nostacksampling".asInstanceOf[nostacksampling]
  
  @js.native
  sealed trait not_allowed
    extends StObject
       with WebExtensionManifestIncognito
  inline def not_allowed: not_allowed = "not_allowed".asInstanceOf[not_allowed]
  
  @js.native
  sealed trait not_applicable
    extends StObject
       with CertificateTransparencyStatus
  inline def not_applicable: not_applicable = "not_applicable".asInstanceOf[not_applicable]
  
  @js.native
  sealed trait not_captive
    extends StObject
       with OnStateChangedDetailsState
  inline def not_captive: not_captive = "not_captive".asInstanceOf[not_captive]
  
  @js.native
  sealed trait not_controllable
    extends StObject
       with LevelOfControl
  inline def not_controllable: not_controllable = "not_controllable".asInstanceOf[not_controllable]
  
  @js.native
  sealed trait notifications
    extends StObject
       with _OptionalPermission
  inline def notifications: notifications = "notifications".asInstanceOf[notifications]
  
  @js.native
  sealed trait notimerresolutionchange
    extends StObject
       with ProfilerFeature
  inline def notimerresolutionchange: notimerresolutionchange = "notimerresolutionchange".asInstanceOf[notimerresolutionchange]
  
  @js.native
  sealed trait `object`
    extends StObject
       with ResourceType
  inline def `object`: `object` = "object".asInstanceOf[`object`]
  
  @js.native
  sealed trait object_subrequest
    extends StObject
       with ResourceType
  inline def object_subrequest: object_subrequest = "object_subrequest".asInstanceOf[object_subrequest]
  
  @js.native
  sealed trait off
    extends StObject
       with ColorManagementMode
  inline def off: off = "off".asInstanceOf[off]
  
  @js.native
  sealed trait offline
    extends StObject
       with _ResolveFlags
  inline def offline: offline = "offline".asInstanceOf[offline]
  
  @js.native
  sealed trait once
    extends StObject
       with ImageAnimationBehavior
  inline def once: once = "once".asInstanceOf[once]
  
  @js.native
  sealed trait openbsd
    extends StObject
       with PlatformOs
  inline def openbsd: openbsd = "openbsd".asInstanceOf[openbsd]
  
  @js.native
  sealed trait os_update
    extends StObject
       with OnRestartRequiredReason
  inline def os_update: os_update = "os_update".asInstanceOf[os_update]
  
  @js.native
  sealed trait other
    extends StObject
       with ExtensionInstallType
       with ResourceType
  inline def other: other = "other".asInstanceOf[other]
  
  @js.native
  sealed trait overwrite
    extends StObject
       with FilenameConflictAction
       with OnChangedCause
  inline def overwrite: overwrite = "overwrite".asInstanceOf[overwrite]
  
  @js.native
  sealed trait page
    extends StObject
       with _ContextType
       with typingsJapgolly.firefoxWebextBrowser.browser.menus._ContextType
  inline def page: page = "page".asInstanceOf[page]
  
  @js.native
  sealed trait page_action
    extends StObject
       with _ContextType
       with typingsJapgolly.firefoxWebextBrowser.browser.menus._ContextType
  inline def page_action: page_action = "page_action".asInstanceOf[page_action]
  
  @js.native
  sealed trait panel
    extends StObject
       with CreateType
       with WindowType
       with typingsJapgolly.firefoxWebextBrowser.browser.tabs.WindowType
  inline def panel: panel = "panel".asInstanceOf[panel]
  
  @js.native
  sealed trait password
    extends StObject
       with _ContextType
       with typingsJapgolly.firefoxWebextBrowser.browser.menus._ContextType
  inline def password: password = "password".asInstanceOf[password]
  
  @js.native
  sealed trait `per-origin`
    extends StObject
       with ZoomSettingsScope
  inline def `per-origin`: `per-origin` = "per-origin".asInstanceOf[`per-origin`]
  
  @js.native
  sealed trait `per-tab`
    extends StObject
       with ZoomSettingsScope
  inline def `per-tab`: `per-tab` = "per-tab".asInstanceOf[`per-tab`]
  
  @js.native
  sealed trait periodic
    extends StObject
       with OnRestartRequiredReason
  inline def periodic: periodic = "periodic".asInstanceOf[periodic]
  
  @js.native
  sealed trait permissions_increase
    extends StObject
       with ExtensionDisabledReason
  inline def permissions_increase: permissions_increase = "permissions_increase".asInstanceOf[permissions_increase]
  
  @js.native
  sealed trait personaltoolbar
    extends StObject
       with ActionManifestDefaultArea
  inline def personaltoolbar: personaltoolbar = "personaltoolbar".asInstanceOf[personaltoolbar]
  
  @js.native
  sealed trait ping
    extends StObject
       with ResourceType
  inline def ping: ping = "ping".asInstanceOf[ping]
  
  @js.native
  sealed trait pinned
    extends StObject
       with UpdatePropertyName
  inline def pinned: pinned = "pinned".asInstanceOf[pinned]
  
  @js.native
  sealed trait pkcs11
    extends StObject
       with _OptionalPermission
  inline def pkcs11: pkcs11 = "pkcs11".asInstanceOf[pkcs11]
  
  @js.native
  sealed trait png
    extends StObject
       with ImageFormat
       with SetImageDataImageType
  inline def png: png = "png".asInstanceOf[png]
  
  @js.native
  sealed trait policy_compliant
    extends StObject
       with CertificateTransparencyStatus
  inline def policy_compliant: policy_compliant = "policy_compliant".asInstanceOf[policy_compliant]
  
  @js.native
  sealed trait policy_not_diverse_scts
    extends StObject
       with CertificateTransparencyStatus
  inline def policy_not_diverse_scts: policy_not_diverse_scts = "policy_not_diverse_scts".asInstanceOf[policy_not_diverse_scts]
  
  @js.native
  sealed trait policy_not_enough_scts
    extends StObject
       with CertificateTransparencyStatus
  inline def policy_not_enough_scts: policy_not_enough_scts = "policy_not_enough_scts".asInstanceOf[policy_not_enough_scts]
  
  @js.native
  sealed trait popup
    extends StObject
       with CreateType
       with OnExtensionActivityDetailsViewType
       with ViewType
       with WindowType
       with typingsJapgolly.firefoxWebextBrowser.browser.tabs.WindowType
  inline def popup: popup = "popup".asInstanceOf[popup]
  
  @js.native
  sealed trait ppc64
    extends StObject
       with PlatformArch
  inline def ppc64: ppc64 = "ppc64".asInstanceOf[ppc64]
  
  @js.native
  sealed trait pref
    extends StObject
       with WebExtensionManifestChromeSettingsOverridesSearchProviderParamsCondition
  inline def pref: pref = "pref".asInstanceOf[pref]
  
  @js.native
  sealed trait preferencereads
    extends StObject
       with ProfilerFeature
  inline def preferencereads: preferencereads = "preferencereads".asInstanceOf[preferencereads]
  
  @js.native
  sealed trait priority_low
    extends StObject
       with _ResolveFlags
  inline def priority_low: priority_low = "priority_low".asInstanceOf[priority_low]
  
  @js.native
  sealed trait priority_medium
    extends StObject
       with _ResolveFlags
  inline def priority_medium: priority_medium = "priority_medium".asInstanceOf[priority_medium]
  
  @js.native
  sealed trait privacy
    extends StObject
       with _OptionalPermission
  inline def privacy: privacy = "privacy".asInstanceOf[privacy]
  
  @js.native
  sealed trait private_browsing
    extends StObject
       with HTTPSOnlyModeOption
       with TrackingProtectionModeOption
  inline def private_browsing: private_browsing = "private_browsing".asInstanceOf[private_browsing]
  
  @js.native
  sealed trait progress
    extends StObject
       with TemplateType
  inline def progress: progress = "progress".asInstanceOf[progress]
  
  @js.native
  sealed trait prompt
    extends StObject
       with FilenameConflictAction
  inline def prompt: prompt = "prompt".asInstanceOf[prompt]
  
  @js.native
  sealed trait proxy
    extends StObject
       with _OptionalPermission
  inline def proxy: proxy = "proxy".asInstanceOf[proxy]
  
  @js.native
  sealed trait proxy_only
    extends StObject
       with IPHandlingPolicy
  inline def proxy_only: proxy_only = "proxy_only".asInstanceOf[proxy_only]
  
  @js.native
  sealed trait purpose
    extends StObject
       with WebExtensionManifestChromeSettingsOverridesSearchProviderParamsCondition
  inline def purpose: purpose = "purpose".asInstanceOf[purpose]
  
  @js.native
  sealed trait radio
    extends StObject
       with ItemType
       with typingsJapgolly.firefoxWebextBrowser.browser.menus.ItemType
  inline def radio: radio = "radio".asInstanceOf[radio]
  
  @js.native
  sealed trait regular
    extends StObject
       with SettingScope
  inline def regular: regular = "regular".asInstanceOf[regular]
  
  @js.native
  sealed trait regular_only
    extends StObject
       with SettingScope
  inline def regular_only: regular_only = "regular_only".asInstanceOf[regular_only]
  
  @js.native
  sealed trait reject_all
    extends StObject
       with CookieConfigBehavior
  inline def reject_all: reject_all = "reject_all".asInstanceOf[reject_all]
  
  @js.native
  sealed trait reject_third_party
    extends StObject
       with CookieConfigBehavior
  inline def reject_third_party: reject_third_party = "reject_third_party".asInstanceOf[reject_third_party]
  
  @js.native
  sealed trait reject_trackers
    extends StObject
       with CookieConfigBehavior
  inline def reject_trackers: reject_trackers = "reject_trackers".asInstanceOf[reject_trackers]
  
  @js.native
  sealed trait reject_trackers_and_partition_foreign
    extends StObject
       with CookieConfigBehavior
  inline def reject_trackers_and_partition_foreign: reject_trackers_and_partition_foreign = "reject_trackers_and_partition_foreign".asInstanceOf[reject_trackers_and_partition_foreign]
  
  @js.native
  sealed trait reload
    extends StObject
       with TransitionType
       with typingsJapgolly.firefoxWebextBrowser.browser.history.TransitionType
  inline def reload: reload = "reload".asInstanceOf[reload]
  
  @js.native
  sealed trait remote_tab
    extends StObject
       with ResultType
  inline def remote_tab: remote_tab = "remote_tab".asInstanceOf[remote_tab]
  
  @js.native
  sealed trait repeat
    extends StObject
       with ThemeTypeAdditionalBackgroundsTiling
  inline def repeat: repeat = "repeat".asInstanceOf[repeat]
  
  @js.native
  sealed trait `repeat-x`
    extends StObject
       with ThemeTypeAdditionalBackgroundsTiling
  inline def `repeat-x`: `repeat-x` = "repeat-x".asInstanceOf[`repeat-x`]
  
  @js.native
  sealed trait `repeat-y`
    extends StObject
       with ThemeTypeAdditionalBackgroundsTiling
  inline def `repeat-y`: `repeat-y` = "repeat-y".asInstanceOf[`repeat-y`]
  
  @js.native
  sealed trait requestBody
    extends StObject
       with OnBeforeRequestOptions
  inline def requestBody: requestBody = "requestBody".asInstanceOf[requestBody]
  
  @js.native
  sealed trait requestHeaders
    extends StObject
       with OnBeforeSendHeadersOptions
  inline def requestHeaders: requestHeaders = "requestHeaders".asInstanceOf[requestHeaders]
  
  @js.native
  sealed trait responseHeaders
    extends StObject
       with OnAuthRequiredOptions
       with OnHeadersReceivedOptions
  inline def responseHeaders: responseHeaders = "responseHeaders".asInstanceOf[responseHeaders]
  
  @js.native
  sealed trait responsiveness
    extends StObject
       with ProfilerFeature
  inline def responsiveness: responsiveness = "responsiveness".asInstanceOf[responsiveness]
  
  @js.native
  sealed trait restricting extends StObject
  inline def restricting: restricting = "restricting".asInstanceOf[restricting]
  
  @js.native
  sealed trait right
    extends StObject
       with ThemeTypeAdditionalBackgroundsAlignment
  inline def right: right = "right".asInstanceOf[right]
  
  @js.native
  sealed trait `right bottom`
    extends StObject
       with ThemeTypeAdditionalBackgroundsAlignment
  inline def `right bottom`: `right bottom` = ("right bottom").asInstanceOf[`right bottom`]
  
  @js.native
  sealed trait `right center`
    extends StObject
       with ThemeTypeAdditionalBackgroundsAlignment
  inline def `right center`: `right center` = ("right center").asInstanceOf[`right center`]
  
  @js.native
  sealed trait `right top`
    extends StObject
       with ThemeTypeAdditionalBackgroundsAlignment
  inline def `right top`: `right top` = ("right top").asInstanceOf[`right top`]
  
  @js.native
  sealed trait s390x
    extends StObject
       with PlatformArch
  inline def s390x: s390x = "s390x".asInstanceOf[s390x]
  
  @js.native
  sealed trait safe
    extends StObject
       with DangerType
  inline def safe: safe = "safe".asInstanceOf[safe]
  
  @js.native
  sealed trait screenshots
    extends StObject
       with ProfilerFeature
  inline def screenshots: screenshots = "screenshots".asInstanceOf[screenshots]
  
  @js.native
  sealed trait script
    extends StObject
       with ResourceType
  inline def script: script = "script".asInstanceOf[script]
  
  @js.native
  sealed trait search
    extends StObject
       with MostVisitedURLType
       with ResultType
       with SourceType
       with _OptionalPermissionNoPrompt
  inline def search: search = "search".asInstanceOf[search]
  
  @js.native
  sealed trait searchbar
    extends StObject
       with WebExtensionManifestChromeSettingsOverridesSearchProviderParamsPurpose
  inline def searchbar: searchbar = "searchbar".asInstanceOf[searchbar]
  
  @js.native
  sealed trait secure
    extends StObject
       with SecurityInfoState
  inline def secure: secure = "secure".asInstanceOf[secure]
  
  @js.native
  sealed trait selection
    extends StObject
       with _ContextType
       with typingsJapgolly.firefoxWebextBrowser.browser.menus._ContextType
  inline def selection: selection = "selection".asInstanceOf[selection]
  
  @js.native
  sealed trait separator
    extends StObject
       with BookmarkTreeNodeType
       with ItemType
       with typingsJapgolly.firefoxWebextBrowser.browser.menus.ItemType
  inline def separator: separator = "separator".asInstanceOf[separator]
  
  @js.native
  sealed trait seqstyle
    extends StObject
       with ProfilerFeature
  inline def seqstyle: seqstyle = "seqstyle".asInstanceOf[seqstyle]
  
  @js.native
  sealed trait server_redirect
    extends StObject
       with TransitionQualifier
  inline def server_redirect: server_redirect = "server_redirect".asInstanceOf[server_redirect]
  
  @js.native
  sealed trait sessions
    extends StObject
       with _OptionalPermission
  inline def sessions: sessions = "sessions".asInstanceOf[sessions]
  
  @js.native
  sealed trait sharingState
    extends StObject
       with UpdatePropertyName
  inline def sharingState: sharingState = "sharingState".asInstanceOf[sharingState]
  
  @js.native
  sealed trait sidebar
    extends StObject
       with OnExtensionActivityDetailsViewType
       with ViewType
  inline def sidebar: sidebar = "sidebar".asInstanceOf[sidebar]
  
  @js.native
  sealed trait sideload
    extends StObject
       with ExtensionInstallType
  inline def sideload: sideload = "sideload".asInstanceOf[sideload]
  
  @js.native
  sealed trait sip
    extends StObject
       with ProtocolHandlerProtocol
  inline def sip: sip = "sip".asInstanceOf[sip]
  
  @js.native
  sealed trait sms
    extends StObject
       with ProtocolHandlerProtocol
  inline def sms: sms = "sms".asInstanceOf[sms]
  
  @js.native
  sealed trait smsto
    extends StObject
       with ProtocolHandlerProtocol
  inline def smsto: smsto = "smsto".asInstanceOf[smsto]
  
  @js.native
  sealed trait spanning
    extends StObject
       with WebExtensionManifestIncognito
  inline def spanning: spanning = "spanning".asInstanceOf[spanning]
  
  @js.native
  sealed trait sparc64
    extends StObject
       with PlatformArch
  inline def sparc64: sparc64 = "sparc64".asInstanceOf[sparc64]
  
  @js.native
  sealed trait speculate
    extends StObject
       with _ResolveFlags
  inline def speculate: speculate = "speculate".asInstanceOf[speculate]
  
  @js.native
  sealed trait speculative
    extends StObject
       with ResourceType
  inline def speculative: speculative = "speculative".asInstanceOf[speculative]
  
  @js.native
  sealed trait ssb
    extends StObject
       with ProtocolHandlerProtocol
  inline def ssb: ssb = "ssb".asInstanceOf[ssb]
  
  @js.native
  sealed trait ssh
    extends StObject
       with ProtocolHandlerProtocol
  inline def ssh: ssh = "ssh".asInstanceOf[ssh]
  
  @js.native
  sealed trait stackwalk
    extends StObject
       with ProfilerFeature
  inline def stackwalk: stackwalk = "stackwalk".asInstanceOf[stackwalk]
  
  @js.native
  sealed trait start
    extends StObject
       with EngagementState
  inline def start: start = "start".asInstanceOf[start]
  
  @js.native
  sealed trait start_page
    extends StObject
       with TransitionType
  inline def start_page: start_page = "start_page".asInstanceOf[start_page]
  
  @js.native
  sealed trait startup extends StObject
  inline def startup: startup = "startup".asInstanceOf[startup]
  
  @js.native
  sealed trait status
    extends StObject
       with UpdatePropertyName
  inline def status: status = "status".asInstanceOf[status]
  
  @js.native
  sealed trait stdio extends StObject
  inline def stdio: stdio = "stdio".asInstanceOf[stdio]
  
  @js.native
  sealed trait storage
    extends StObject
       with _PermissionNoPrompt
  inline def storage: storage = "storage".asInstanceOf[storage]
  
  @js.native
  sealed trait strict
    extends StObject
       with SameSiteStatus
  inline def strict: strict = "strict".asInstanceOf[strict]
  
  @js.native
  sealed trait string
    extends StObject
       with ScalarType
  inline def string: string = "string".asInstanceOf[string]
  
  @js.native
  sealed trait stylesheet
    extends StObject
       with ResourceType
  inline def stylesheet: stylesheet = "stylesheet".asInstanceOf[stylesheet]
  
  @js.native
  sealed trait sub_frame
    extends StObject
       with ResourceType
  inline def sub_frame: sub_frame = "sub_frame".asInstanceOf[sub_frame]
  
  @js.native
  sealed trait suspended
    extends StObject
       with StreamFilterStatus
  inline def suspended: suspended = "suspended".asInstanceOf[suspended]
  
  @js.native
  sealed trait system
    extends StObject
       with ProxyConfigProxyType
  inline def system: system = "system".asInstanceOf[system]
  
  @js.native
  sealed trait tab
    extends StObject
       with OnExtensionActivityDetailsViewType
       with OverrideContextContextOptionsContext
       with typingsJapgolly.firefoxWebextBrowser.browser.menus.OverrideContextContextOptionsContext
       with ResultType
       with ViewType
       with _ContextType
       with typingsJapgolly.firefoxWebextBrowser.browser.menus._ContextType
  inline def tab: tab = "tab".asInstanceOf[tab]
  
  @js.native
  sealed trait tabHide
    extends StObject
       with _OptionalPermission
  inline def tabHide: tabHide = "tabHide".asInstanceOf[tabHide]
  
  @js.native
  sealed trait tabs
    extends StObject
       with SourceType
       with _OptionalPermission
  inline def tabs: tabs = "tabs".asInstanceOf[tabs]
  
  @js.native
  sealed trait tabstrip
    extends StObject
       with ActionManifestDefaultArea
  inline def tabstrip: tabstrip = "tabstrip".asInstanceOf[tabstrip]
  
  @js.native
  sealed trait tagged_only
    extends StObject
       with ColorManagementMode
  inline def tagged_only: tagged_only = "tagged_only".asInstanceOf[tagged_only]
  
  @js.native
  sealed trait tel
    extends StObject
       with ProtocolHandlerProtocol
  inline def tel: tel = "tel".asInstanceOf[tel]
  
  @js.native
  sealed trait telemetry
    extends StObject
       with _PermissionNoPrompt
  inline def telemetry: telemetry = "telemetry".asInstanceOf[telemetry]
  
  @js.native
  sealed trait theme
    extends StObject
       with ExtensionType
       with _PermissionNoPrompt
  inline def theme: theme = "theme".asInstanceOf[theme]
  
  @js.native
  sealed trait threads
    extends StObject
       with ProfilerFeature
  inline def threads: threads = "threads".asInstanceOf[threads]
  
  @js.native
  sealed trait throttled
    extends StObject
       with RequestUpdateCheckStatus
  inline def throttled: throttled = "throttled".asInstanceOf[throttled]
  
  @js.native
  sealed trait tip
    extends StObject
       with ResultType
  inline def tip: tip = "tip".asInstanceOf[tip]
  
  @js.native
  sealed trait title
    extends StObject
       with UpdatePropertyName
  inline def title: title = "title".asInstanceOf[title]
  
  @js.native
  sealed trait tools_menu
    extends StObject
       with _ContextType
       with typingsJapgolly.firefoxWebextBrowser.browser.menus._ContextType
  inline def tools_menu: tools_menu = "tools_menu".asInstanceOf[tools_menu]
  
  @js.native
  sealed trait top
    extends StObject
       with ThemeTypeAdditionalBackgroundsAlignment
  inline def top: top = "top".asInstanceOf[top]
  
  @js.native
  sealed trait topSites
    extends StObject
       with _OptionalPermission
  inline def topSites: topSites = "topSites".asInstanceOf[topSites]
  
  @js.native
  sealed trait tracking
    extends StObject
       with UrlClassificationFlags
  inline def tracking: tracking = "tracking".asInstanceOf[tracking]
  
  @js.native
  sealed trait tracking_ad
    extends StObject
       with UrlClassificationFlags
  inline def tracking_ad: tracking_ad = "tracking_ad".asInstanceOf[tracking_ad]
  
  @js.native
  sealed trait tracking_analytics
    extends StObject
       with UrlClassificationFlags
  inline def tracking_analytics: tracking_analytics = "tracking_analytics".asInstanceOf[tracking_analytics]
  
  @js.native
  sealed trait tracking_content
    extends StObject
       with UrlClassificationFlags
  inline def tracking_content: tracking_content = "tracking_content".asInstanceOf[tracking_content]
  
  @js.native
  sealed trait tracking_social
    extends StObject
       with UrlClassificationFlags
  inline def tracking_social: tracking_social = "tracking_social".asInstanceOf[tracking_social]
  
  @js.native
  sealed trait transferringdata
    extends StObject
       with StreamFilterStatus
  inline def transferringdata: transferringdata = "transferringdata".asInstanceOf[transferringdata]
  
  @js.native
  sealed trait typed
    extends StObject
       with TransitionType
       with typingsJapgolly.firefoxWebextBrowser.browser.history.TransitionType
  inline def typed: typed = "typed".asInstanceOf[typed]
  
  @js.native
  sealed trait uncommon
    extends StObject
       with DangerType
  inline def uncommon: uncommon = "uncommon".asInstanceOf[uncommon]
  
  @js.native
  sealed trait uninitialized
    extends StObject
       with StreamFilterStatus
  inline def uninitialized: uninitialized = "uninitialized".asInstanceOf[uninitialized]
  
  @js.native
  sealed trait uniquify
    extends StObject
       with FilenameConflictAction
  inline def uniquify: uniquify = "uniquify".asInstanceOf[uniquify]
  
  @js.native
  sealed trait unknown
    extends StObject
       with ExtensionDisabledReason
       with NetworkLinkInfoStatus
       with NetworkLinkInfoType
       with OnStateChangedDetailsState
       with SecurityInfoProtocolVersion
       with TlsVersionRestrictionConfigMaximum
       with TlsVersionRestrictionConfigMinimum
  inline def unknown: unknown = "unknown".asInstanceOf[unknown]
  
  @js.native
  sealed trait unlimitedStorage
    extends StObject
       with _PermissionNoPrompt
  inline def unlimitedStorage: unlimitedStorage = "unlimitedStorage".asInstanceOf[unlimitedStorage]
  
  @js.native
  sealed trait unlocked_portal
    extends StObject
       with OnStateChangedDetailsState
  inline def unlocked_portal: unlocked_portal = "unlocked_portal".asInstanceOf[unlocked_portal]
  
  @js.native
  sealed trait unwanted
    extends StObject
       with DangerType
  inline def unwanted: unwanted = "unwanted".asInstanceOf[unwanted]
  
  @js.native
  sealed trait up
    extends StObject
       with NetworkLinkInfoStatus
  inline def up: up = "up".asInstanceOf[up]
  
  @js.native
  sealed trait update
    extends StObject
       with OnInstalledReason
  inline def update: update = "update".asInstanceOf[update]
  
  @js.native
  sealed trait update_available
    extends StObject
       with RequestUpdateCheckStatus
  inline def update_available: update_available = "update_available".asInstanceOf[update_available]
  
  @js.native
  sealed trait url
    extends StObject
       with DangerType
       with DescriptionStyleType
       with MostVisitedURLType
       with ResultType
       with UpdatePropertyName
  inline def url: url = "url".asInstanceOf[url]
  
  @js.native
  sealed trait urlbar
    extends StObject
       with _PermissionNoPrompt
  inline def urlbar: urlbar = "urlbar".asInstanceOf[urlbar]
  
  @js.native
  sealed trait urn
    extends StObject
       with ProtocolHandlerProtocol
  inline def urn: urn = "urn".asInstanceOf[urn]
  
  @js.native
  sealed trait usb
    extends StObject
       with NetworkLinkInfoType
  inline def usb: usb = "usb".asInstanceOf[usb]
  
  @js.native
  sealed trait user
    extends StObject
       with CSSOrigin
       with MutedInfoReason
  inline def user: user = "user".asInstanceOf[user]
  
  @js.native
  sealed trait user_script
    extends StObject
       with OnExtensionActivityDetailsType
  inline def user_script: user_script = "user_script".asInstanceOf[user_script]
  
  @js.native
  sealed trait video
    extends StObject
       with _ContextType
       with typingsJapgolly.firefoxWebextBrowser.browser.menus._ContextType
  inline def video: video = "video".asInstanceOf[video]
  
  @js.native
  sealed trait weak
    extends StObject
       with SecurityInfoState
  inline def weak: weak = "weak".asInstanceOf[weak]
  
  @js.native
  sealed trait webNavigation
    extends StObject
       with _OptionalPermission
  inline def webNavigation: webNavigation = "webNavigation".asInstanceOf[webNavigation]
  
  @js.native
  sealed trait webRequest
    extends StObject
       with _OptionalPermissionNoPrompt
  inline def webRequest: webRequest = "webRequest".asInstanceOf[webRequest]
  
  @js.native
  sealed trait webRequestBlocking
    extends StObject
       with _OptionalPermissionNoPrompt
  inline def webRequestBlocking: webRequestBlocking = "webRequestBlocking".asInstanceOf[webRequestBlocking]
  
  @js.native
  sealed trait web_manifest
    extends StObject
       with ResourceType
  inline def web_manifest: web_manifest = "web_manifest".asInstanceOf[web_manifest]
  
  @js.native
  sealed trait webcal
    extends StObject
       with ProtocolHandlerProtocol
  inline def webcal: webcal = "webcal".asInstanceOf[webcal]
  
  @js.native
  sealed trait websocket
    extends StObject
       with ResourceType
  inline def websocket: websocket = "websocket".asInstanceOf[websocket]
  
  @js.native
  sealed trait wifi
    extends StObject
       with NetworkLinkInfoType
  inline def wifi: wifi = "wifi".asInstanceOf[wifi]
  
  @js.native
  sealed trait wimax
    extends StObject
       with NetworkLinkInfoType
  inline def wimax: wimax = "wimax".asInstanceOf[wimax]
  
  @js.native
  sealed trait win
    extends StObject
       with PlatformOs
  inline def win: win = "win".asInstanceOf[win]
  
  @js.native
  sealed trait windowLength extends StObject
  inline def windowLength: windowLength = "windowLength".asInstanceOf[windowLength]
  
  @js.native
  sealed trait wtai
    extends StObject
       with ProtocolHandlerProtocol
  inline def wtai: wtai = "wtai".asInstanceOf[wtai]
  
  @js.native
  sealed trait `x86-32`
    extends StObject
       with PlatformArch
       with PlatformNaclArch
  inline def `x86-32`: `x86-32` = "x86-32".asInstanceOf[`x86-32`]
  
  @js.native
  sealed trait `x86-64`
    extends StObject
       with PlatformArch
       with PlatformNaclArch
  inline def `x86-64`: `x86-64` = "x86-64".asInstanceOf[`x86-64`]
  
  @js.native
  sealed trait xml_dtd
    extends StObject
       with ResourceType
  inline def xml_dtd: xml_dtd = "xml_dtd".asInstanceOf[xml_dtd]
  
  @js.native
  sealed trait xmlhttprequest
    extends StObject
       with ResourceType
  inline def xmlhttprequest: xmlhttprequest = "xmlhttprequest".asInstanceOf[xmlhttprequest]
  
  @js.native
  sealed trait xmpp
    extends StObject
       with ProtocolHandlerProtocol
  inline def xmpp: xmpp = "xmpp".asInstanceOf[xmpp]
  
  @js.native
  sealed trait xslt
    extends StObject
       with ResourceType
  inline def xslt: xslt = "xslt".asInstanceOf[xslt]
}
