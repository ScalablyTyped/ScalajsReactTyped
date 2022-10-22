package typingsJapgolly.expoConstants.buildConstantsDottypesMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.expoConfigTypes.anon.AndroidCollapsedTitle
import typingsJapgolly.expoConfigTypes.anon.BarStyle
import typingsJapgolly.expoConfigTypes.anon.CheckAutomatically
import typingsJapgolly.expoConfigTypes.anon.PluginHistory
import typingsJapgolly.expoConfigTypes.anon.Policy
import typingsJapgolly.expoConfigTypes.anon.PostExport
import typingsJapgolly.expoConfigTypes.anon.SilentLaunch
import typingsJapgolly.expoConfigTypes.anon.TurboModules
import typingsJapgolly.expoConfigTypes.anon.Visible
import typingsJapgolly.expoConfigTypes.mod.Android
import typingsJapgolly.expoConfigTypes.mod.IOS
import typingsJapgolly.expoConfigTypes.mod.Splash
import typingsJapgolly.expoConfigTypes.mod.Web
import typingsJapgolly.expoConstants.anon.Dictkey
import typingsJapgolly.expoConstants.expoConstantsStrings.android
import typingsJapgolly.expoConstants.expoConstantsStrings.automatic
import typingsJapgolly.expoConstants.expoConstantsStrings.dark
import typingsJapgolly.expoConstants.expoConstantsStrings.default
import typingsJapgolly.expoConstants.expoConstantsStrings.hermes
import typingsJapgolly.expoConstants.expoConstantsStrings.hidden
import typingsJapgolly.expoConstants.expoConstantsStrings.ios
import typingsJapgolly.expoConstants.expoConstantsStrings.jsc
import typingsJapgolly.expoConstants.expoConstantsStrings.landscape
import typingsJapgolly.expoConstants.expoConstantsStrings.light
import typingsJapgolly.expoConstants.expoConstantsStrings.portrait
import typingsJapgolly.expoConstants.expoConstantsStrings.public
import typingsJapgolly.expoConstants.expoConstantsStrings.unlisted
import typingsJapgolly.expoConstants.expoConstantsStrings.web
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined expo-constants.expo-constants/build/Constants.types.ExpoClientConfig & expo-constants.expo-constants/build/Constants.types.ExpoGoConfig & expo-constants.expo-constants/build/Constants.types.EASConfig & expo-constants.expo-constants/build/Constants.types.ClientScopingConfig & {[key: string] : any} */
trait AppManifest
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  /**
    * Internal properties for developer tools
    */
  var _internal: js.UndefOr[PluginHistory] = js.undefined
  
  var android: js.UndefOr[Android] = js.undefined
  
  /**
    * Configuration for the bottom navigation bar on Android. Can be used to configure the `expo-navigation-bar` module in EAS Build.
    */
  var androidNavigationBar: js.UndefOr[Visible] = js.undefined
  
  /**
    * Configuration for the status bar on Android. For more details please navigate to [Configuring StatusBar](https://docs.expo.dev/guides/configuring-statusbar/).
    */
  var androidStatusBar: js.UndefOr[BarStyle] = js.undefined
  
  /**
    * @deprecated By default, Expo looks for the application registered with the AppRegistry as `main`. If you would like to change this, you can specify the name in this property.
    */
  var appKey: js.UndefOr[String] = js.undefined
  
  /**
    * An array of file glob strings which point to assets that will be bundled within your standalone app binary. Read more in the [Offline Support guide](https://docs.expo.dev/guides/offline-support/)
    */
  var assetBundlePatterns: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The background color for your app, behind any of your React views. This is also known as the root view background color. Requires `expo-system-ui` be installed in your project to work on iOS.
    */
  var backgroundColor: js.UndefOr[String] = js.undefined
  
  var bundleUrl: String
  
  /**
    * The Expo account name and slug used for display purposes. Formatted like `@username/slug`.
    * When unauthenticated, the username is `@anonymous`. For published projects, this value
    * may change when a project is transferred between accounts or renamed.
    */
  var currentFullName: js.UndefOr[String] = js.undefined
  
  var debuggerHost: js.UndefOr[String] = js.undefined
  
  /**
    * A short description of what your app is and why it is great.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Extra fields needed by detached apps
    */
  var detach: js.UndefOr[StringDictionary[Any]] = js.undefined
  
  var developer: js.UndefOr[Dictkey] = js.undefined
  
  /**
    * Settings that apply specifically to running this app in a development client
    */
  var developmentClient: js.UndefOr[SilentLaunch] = js.undefined
  
  /**
    * The relative path to your main JavaScript file.
    */
  var entryPoint: js.UndefOr[String] = js.undefined
  
  /**
    * Enable experimental features that may be unstable, unsupported, or removed without deprecation notices.
    */
  var experiments: js.UndefOr[TurboModules] = js.undefined
  
  /**
    * Any extra fields you want to pass to your experience. Values are accessible via `Expo.Constants.manifest.extra` ([Learn more](https://docs.expo.dev/versions/latest/sdk/constants/#constantsmanifest))
    */
  var extra: js.UndefOr[StringDictionary[Any]] = js.undefined
  
  /**
    * Whether the Facebook SDK should collect advertiser ID properties, like the Apple IDFA and Android Advertising ID, automatically. If you don't set this property, Facebook's default policy will be used. (Applicable only to standalone apps.)
    */
  var facebookAdvertiserIDCollectionEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Used for all Facebook libraries. Set up your Facebook App ID at https://developers.facebook.com.
    */
  var facebookAppId: js.UndefOr[String] = js.undefined
  
  /**
    * Whether the Facebook SDK should be initialized automatically. The default in Expo (Client and in standalone apps) is `false`.
    */
  var facebookAutoInitEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether the Facebook SDK log app events automatically. If you don't set this property, Facebook's default will be used. (Applicable only to standalone apps.) Note: The Facebook SDK must be initialized for app events to work. You may autoinitialize Facebook SDK by setting `facebookAutoInitEnabled` to `true`
    */
  var facebookAutoLogAppEventsEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Used for native Facebook login.
    */
  var facebookDisplayName: js.UndefOr[String] = js.undefined
  
  /**
    * Used for Facebook native login. Starts with 'fb' and followed by a string of digits, like 'fb1234567890'. You can find your scheme [here](https://developers.facebook.com/docs/facebook-login/ios)in the 'Configuring Your info.plist' section (only applicable to standalone apps and custom Expo Go apps).
    */
  var facebookScheme: js.UndefOr[String] = js.undefined
  
  /**
    * If you would like to share the source code of your app on Github, enter the URL for the repository here and it will be linked to from your Expo project page.
    */
  var githubUrl: js.UndefOr[String] = js.undefined
  
  /**
    * Configuration for scripts to run to hook into the publish process
    */
  var hooks: js.UndefOr[PostExport] = js.undefined
  
  var hostUri: js.UndefOr[String] = js.undefined
  
  /**
    * Local path or remote URL to an image to use for your app's icon. We recommend that you use a 1024x1024 png file. This icon will appear on the home screen and within the Expo app.
    */
  var icon: js.UndefOr[String] = js.undefined
  
  /**
    * The Expo account name and slug for this project.
    * @deprecated Prefer `projectId` or `originalFullName` instead for identification and
    * `scopeKey` for scoping due to immutability.
    */
  var id: js.UndefOr[String] = js.undefined
  
  var ios: js.UndefOr[IOS] = js.undefined
  
  /**
    * Is app detached
    */
  var isDetached: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the JavaScript engine for apps. Supported only on EAS Build. Defaults to `jsc`. Valid values: `hermes`, `jsc`.
    */
  var jsEngine: js.UndefOr[hermes | jsc] = js.undefined
  
  /**
    * Provide overrides by locale for System Dialog prompts like Permissions Boxes
    */
  var locales: js.UndefOr[StringDictionary[String | StringDictionary[Any]]] = js.undefined
  
  var logUrl: js.UndefOr[String] = js.undefined
  
  var mainModuleName: js.UndefOr[String] = js.undefined
  
  /**
    * The name of your app as it appears both within Expo Go and on your home screen as a standalone app.
    */
  var name: String
  
  /**
    * Configuration for remote (push) notifications.
    */
  var notification: js.UndefOr[AndroidCollapsedTitle] = js.undefined
  
  /**
    * Locks your app to a specific orientation with portrait or landscape. Defaults to no lock. Valid values: `default`, `portrait`, `landscape`
    */
  var orientation: js.UndefOr[default | portrait | landscape] = js.undefined
  
  /**
    * The original Expo account name and slug for this project. Formatted like `@username/slug`.
    * When unauthenticated, the username is `@anonymous`. For published projects, this value
    * will not change when a project is transferred between accounts or renamed.
    */
  var originalFullName: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the Expo account that owns the project. This is useful for teams collaborating on a project. If not provided, the owner defaults to the username of the current user.
    */
  var owner: js.UndefOr[String] = js.undefined
  
  /**
    * @deprecated Use a `metro.config.js` file instead. [Learn more](https://docs.expo.dev/guides/customizing-metro/)
    */
  var packagerOpts: js.UndefOr[StringDictionary[Any]] & js.UndefOr[ExpoGoPackagerOpts]
  
  /**
    * Platforms that your project explicitly supports. If not specified, it defaults to `["ios", "android"]`.
    */
  var platforms: js.UndefOr[js.Array[android | ios | web]] = js.undefined
  
  /**
    * Config plugins for adding extra functionality to your project. [Learn more](https://docs.expo.dev/guides/config-plugins/).
    */
  var plugins: js.UndefOr[js.Array[String | (js.Array[Any | String]) | (js.Tuple2[String, Any])]] = js.undefined
  
  /**
    * On Android, this will determine the color of your app in the multitasker. Currently this is not used on iOS, but it may be used for other purposes in the future.
    */
  var primaryColor: js.UndefOr[String] = js.undefined
  
  /**
    * Defaults to `unlisted`. `unlisted` hides the project from search results. `hidden` restricts access to the project page to only the owner and other users that have been granted access. Valid values: `public`, `unlisted`, `hidden`.
    */
  var privacy: js.UndefOr[public | unlisted | hidden] = js.undefined
  
  /**
    * The ID for this project if it's using EAS. UUID. This value will not change when a project is
    * transferred between accounts or renamed.
    */
  var projectId: js.UndefOr[String] = js.undefined
  
  var publishedTime: js.UndefOr[String] = js.undefined
  
  var releaseChannel: js.UndefOr[String] = js.undefined
  
  /**
    * Published apps only.
    */
  var releaseId: js.UndefOr[String] = js.undefined
  
  var revisionId: js.UndefOr[String] = js.undefined
  
  /**
    * **Note: Don't use this property unless you are sure what you're doing**
    *
    * The runtime version associated with this manifest.
    * Set this to `{"policy": "nativeVersion"}` to generate it automatically based on the 'version' and
    * 'android.versionCode'/'ios.buildNumber' or to `{"policy": "appVersion"}` to use just 'version' field.
    */
  var runtimeVersion: js.UndefOr[String | Policy] = js.undefined
  
  /**
    * **Standalone Apps Only**. URL scheme to link into your app. For example, if we set this to `'demo'`, then demo:// URLs would open your app when tapped.
    */
  var scheme: js.UndefOr[String] = js.undefined
  
  /**
    * An opaque unique string for scoping client-side data to this project. This value
    * will not change when a project is transferred between accounts or renamed.
    */
  var scopeKey: js.UndefOr[String] = js.undefined
  
  /**
    * The Expo sdkVersion to run the project on. This should line up with the version specified in your package.json.
    */
  var sdkVersion: js.UndefOr[String] = js.undefined
  
  /**
    * The friendly URL name for publishing. For example, `myAppName` will refer to the `expo.dev/@project-owner/myAppName` project.
    */
  var slug: String
  
  var splash: js.UndefOr[Splash] = js.undefined
  
  /**
    * Configuration for how and when the app should request OTA JavaScript updates
    */
  var updates: js.UndefOr[CheckAutomatically] = js.undefined
  
  /**
    * Configuration to force the app to always use the light or dark user-interface appearance, such as "dark mode", or make it automatically adapt to the system preferences. If not provided, defaults to `light`. Requires `expo-system-ui` be installed in your project to work on Android.
    */
  var userInterfaceStyle: js.UndefOr[light | dark | automatic] = js.undefined
  
  /**
    * Your app version. In addition to this field, you'll also use `ios.buildNumber` and `android.versionCode` — read more about how to version your app [here](https://docs.expo.dev/distribution/app-stores/#versioning-your-app). On iOS this corresponds to `CFBundleShortVersionString`, and on Android, this corresponds to `versionName`. The required format can be found [here](https://developer.apple.com/documentation/bundleresources/information_property_list/cfbundleshortversionstring).
    */
  var version: js.UndefOr[String] = js.undefined
  
  var web: js.UndefOr[Web] = js.undefined
}
object AppManifest {
  
  inline def apply(
    bundleUrl: String,
    name: String,
    packagerOpts: js.UndefOr[StringDictionary[Any]] & js.UndefOr[ExpoGoPackagerOpts],
    slug: String
  ): AppManifest = {
    val __obj = js.Dynamic.literal(bundleUrl = bundleUrl.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], packagerOpts = packagerOpts.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppManifest]
  }
  
  extension [Self <: AppManifest](x: Self) {
    
    inline def setAndroid(value: Android): Self = StObject.set(x, "android", value.asInstanceOf[js.Any])
    
    inline def setAndroidNavigationBar(value: Visible): Self = StObject.set(x, "androidNavigationBar", value.asInstanceOf[js.Any])
    
    inline def setAndroidNavigationBarUndefined: Self = StObject.set(x, "androidNavigationBar", js.undefined)
    
    inline def setAndroidStatusBar(value: BarStyle): Self = StObject.set(x, "androidStatusBar", value.asInstanceOf[js.Any])
    
    inline def setAndroidStatusBarUndefined: Self = StObject.set(x, "androidStatusBar", js.undefined)
    
    inline def setAndroidUndefined: Self = StObject.set(x, "android", js.undefined)
    
    inline def setAppKey(value: String): Self = StObject.set(x, "appKey", value.asInstanceOf[js.Any])
    
    inline def setAppKeyUndefined: Self = StObject.set(x, "appKey", js.undefined)
    
    inline def setAssetBundlePatterns(value: js.Array[String]): Self = StObject.set(x, "assetBundlePatterns", value.asInstanceOf[js.Any])
    
    inline def setAssetBundlePatternsUndefined: Self = StObject.set(x, "assetBundlePatterns", js.undefined)
    
    inline def setAssetBundlePatternsVarargs(value: String*): Self = StObject.set(x, "assetBundlePatterns", js.Array(value*))
    
    inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    inline def setBundleUrl(value: String): Self = StObject.set(x, "bundleUrl", value.asInstanceOf[js.Any])
    
    inline def setCurrentFullName(value: String): Self = StObject.set(x, "currentFullName", value.asInstanceOf[js.Any])
    
    inline def setCurrentFullNameUndefined: Self = StObject.set(x, "currentFullName", js.undefined)
    
    inline def setDebuggerHost(value: String): Self = StObject.set(x, "debuggerHost", value.asInstanceOf[js.Any])
    
    inline def setDebuggerHostUndefined: Self = StObject.set(x, "debuggerHost", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDetach(value: StringDictionary[Any]): Self = StObject.set(x, "detach", value.asInstanceOf[js.Any])
    
    inline def setDetachUndefined: Self = StObject.set(x, "detach", js.undefined)
    
    inline def setDeveloper(value: Dictkey): Self = StObject.set(x, "developer", value.asInstanceOf[js.Any])
    
    inline def setDeveloperUndefined: Self = StObject.set(x, "developer", js.undefined)
    
    inline def setDevelopmentClient(value: SilentLaunch): Self = StObject.set(x, "developmentClient", value.asInstanceOf[js.Any])
    
    inline def setDevelopmentClientUndefined: Self = StObject.set(x, "developmentClient", js.undefined)
    
    inline def setEntryPoint(value: String): Self = StObject.set(x, "entryPoint", value.asInstanceOf[js.Any])
    
    inline def setEntryPointUndefined: Self = StObject.set(x, "entryPoint", js.undefined)
    
    inline def setExperiments(value: TurboModules): Self = StObject.set(x, "experiments", value.asInstanceOf[js.Any])
    
    inline def setExperimentsUndefined: Self = StObject.set(x, "experiments", js.undefined)
    
    inline def setExtra(value: StringDictionary[Any]): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
    
    inline def setExtraUndefined: Self = StObject.set(x, "extra", js.undefined)
    
    inline def setFacebookAdvertiserIDCollectionEnabled(value: Boolean): Self = StObject.set(x, "facebookAdvertiserIDCollectionEnabled", value.asInstanceOf[js.Any])
    
    inline def setFacebookAdvertiserIDCollectionEnabledUndefined: Self = StObject.set(x, "facebookAdvertiserIDCollectionEnabled", js.undefined)
    
    inline def setFacebookAppId(value: String): Self = StObject.set(x, "facebookAppId", value.asInstanceOf[js.Any])
    
    inline def setFacebookAppIdUndefined: Self = StObject.set(x, "facebookAppId", js.undefined)
    
    inline def setFacebookAutoInitEnabled(value: Boolean): Self = StObject.set(x, "facebookAutoInitEnabled", value.asInstanceOf[js.Any])
    
    inline def setFacebookAutoInitEnabledUndefined: Self = StObject.set(x, "facebookAutoInitEnabled", js.undefined)
    
    inline def setFacebookAutoLogAppEventsEnabled(value: Boolean): Self = StObject.set(x, "facebookAutoLogAppEventsEnabled", value.asInstanceOf[js.Any])
    
    inline def setFacebookAutoLogAppEventsEnabledUndefined: Self = StObject.set(x, "facebookAutoLogAppEventsEnabled", js.undefined)
    
    inline def setFacebookDisplayName(value: String): Self = StObject.set(x, "facebookDisplayName", value.asInstanceOf[js.Any])
    
    inline def setFacebookDisplayNameUndefined: Self = StObject.set(x, "facebookDisplayName", js.undefined)
    
    inline def setFacebookScheme(value: String): Self = StObject.set(x, "facebookScheme", value.asInstanceOf[js.Any])
    
    inline def setFacebookSchemeUndefined: Self = StObject.set(x, "facebookScheme", js.undefined)
    
    inline def setGithubUrl(value: String): Self = StObject.set(x, "githubUrl", value.asInstanceOf[js.Any])
    
    inline def setGithubUrlUndefined: Self = StObject.set(x, "githubUrl", js.undefined)
    
    inline def setHooks(value: PostExport): Self = StObject.set(x, "hooks", value.asInstanceOf[js.Any])
    
    inline def setHooksUndefined: Self = StObject.set(x, "hooks", js.undefined)
    
    inline def setHostUri(value: String): Self = StObject.set(x, "hostUri", value.asInstanceOf[js.Any])
    
    inline def setHostUriUndefined: Self = StObject.set(x, "hostUri", js.undefined)
    
    inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setIos(value: IOS): Self = StObject.set(x, "ios", value.asInstanceOf[js.Any])
    
    inline def setIosUndefined: Self = StObject.set(x, "ios", js.undefined)
    
    inline def setIsDetached(value: Boolean): Self = StObject.set(x, "isDetached", value.asInstanceOf[js.Any])
    
    inline def setIsDetachedUndefined: Self = StObject.set(x, "isDetached", js.undefined)
    
    inline def setJsEngine(value: hermes | jsc): Self = StObject.set(x, "jsEngine", value.asInstanceOf[js.Any])
    
    inline def setJsEngineUndefined: Self = StObject.set(x, "jsEngine", js.undefined)
    
    inline def setLocales(value: StringDictionary[String | StringDictionary[Any]]): Self = StObject.set(x, "locales", value.asInstanceOf[js.Any])
    
    inline def setLocalesUndefined: Self = StObject.set(x, "locales", js.undefined)
    
    inline def setLogUrl(value: String): Self = StObject.set(x, "logUrl", value.asInstanceOf[js.Any])
    
    inline def setLogUrlUndefined: Self = StObject.set(x, "logUrl", js.undefined)
    
    inline def setMainModuleName(value: String): Self = StObject.set(x, "mainModuleName", value.asInstanceOf[js.Any])
    
    inline def setMainModuleNameUndefined: Self = StObject.set(x, "mainModuleName", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNotification(value: AndroidCollapsedTitle): Self = StObject.set(x, "notification", value.asInstanceOf[js.Any])
    
    inline def setNotificationUndefined: Self = StObject.set(x, "notification", js.undefined)
    
    inline def setOrientation(value: default | portrait | landscape): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    
    inline def setOriginalFullName(value: String): Self = StObject.set(x, "originalFullName", value.asInstanceOf[js.Any])
    
    inline def setOriginalFullNameUndefined: Self = StObject.set(x, "originalFullName", js.undefined)
    
    inline def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    inline def setPackagerOpts(value: js.UndefOr[StringDictionary[Any]] & js.UndefOr[ExpoGoPackagerOpts]): Self = StObject.set(x, "packagerOpts", value.asInstanceOf[js.Any])
    
    inline def setPlatforms(value: js.Array[android | ios | web]): Self = StObject.set(x, "platforms", value.asInstanceOf[js.Any])
    
    inline def setPlatformsUndefined: Self = StObject.set(x, "platforms", js.undefined)
    
    inline def setPlatformsVarargs(value: (android | ios | web)*): Self = StObject.set(x, "platforms", js.Array(value*))
    
    inline def setPlugins(value: js.Array[String | (js.Array[Any | String]) | (js.Tuple2[String, Any])]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
    
    inline def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
    
    inline def setPluginsVarargs(value: (String | (js.Array[Any | String]) | (js.Tuple2[String, Any]))*): Self = StObject.set(x, "plugins", js.Array(value*))
    
    inline def setPrimaryColor(value: String): Self = StObject.set(x, "primaryColor", value.asInstanceOf[js.Any])
    
    inline def setPrimaryColorUndefined: Self = StObject.set(x, "primaryColor", js.undefined)
    
    inline def setPrivacy(value: public | unlisted | hidden): Self = StObject.set(x, "privacy", value.asInstanceOf[js.Any])
    
    inline def setPrivacyUndefined: Self = StObject.set(x, "privacy", js.undefined)
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    inline def setPublishedTime(value: String): Self = StObject.set(x, "publishedTime", value.asInstanceOf[js.Any])
    
    inline def setPublishedTimeUndefined: Self = StObject.set(x, "publishedTime", js.undefined)
    
    inline def setReleaseChannel(value: String): Self = StObject.set(x, "releaseChannel", value.asInstanceOf[js.Any])
    
    inline def setReleaseChannelUndefined: Self = StObject.set(x, "releaseChannel", js.undefined)
    
    inline def setReleaseId(value: String): Self = StObject.set(x, "releaseId", value.asInstanceOf[js.Any])
    
    inline def setReleaseIdUndefined: Self = StObject.set(x, "releaseId", js.undefined)
    
    inline def setRevisionId(value: String): Self = StObject.set(x, "revisionId", value.asInstanceOf[js.Any])
    
    inline def setRevisionIdUndefined: Self = StObject.set(x, "revisionId", js.undefined)
    
    inline def setRuntimeVersion(value: String | Policy): Self = StObject.set(x, "runtimeVersion", value.asInstanceOf[js.Any])
    
    inline def setRuntimeVersionUndefined: Self = StObject.set(x, "runtimeVersion", js.undefined)
    
    inline def setScheme(value: String): Self = StObject.set(x, "scheme", value.asInstanceOf[js.Any])
    
    inline def setSchemeUndefined: Self = StObject.set(x, "scheme", js.undefined)
    
    inline def setScopeKey(value: String): Self = StObject.set(x, "scopeKey", value.asInstanceOf[js.Any])
    
    inline def setScopeKeyUndefined: Self = StObject.set(x, "scopeKey", js.undefined)
    
    inline def setSdkVersion(value: String): Self = StObject.set(x, "sdkVersion", value.asInstanceOf[js.Any])
    
    inline def setSdkVersionUndefined: Self = StObject.set(x, "sdkVersion", js.undefined)
    
    inline def setSlug(value: String): Self = StObject.set(x, "slug", value.asInstanceOf[js.Any])
    
    inline def setSplash(value: Splash): Self = StObject.set(x, "splash", value.asInstanceOf[js.Any])
    
    inline def setSplashUndefined: Self = StObject.set(x, "splash", js.undefined)
    
    inline def setUpdates(value: CheckAutomatically): Self = StObject.set(x, "updates", value.asInstanceOf[js.Any])
    
    inline def setUpdatesUndefined: Self = StObject.set(x, "updates", js.undefined)
    
    inline def setUserInterfaceStyle(value: light | dark | automatic): Self = StObject.set(x, "userInterfaceStyle", value.asInstanceOf[js.Any])
    
    inline def setUserInterfaceStyleUndefined: Self = StObject.set(x, "userInterfaceStyle", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    inline def setWeb(value: Web): Self = StObject.set(x, "web", value.asInstanceOf[js.Any])
    
    inline def setWebUndefined: Self = StObject.set(x, "web", js.undefined)
    
    inline def set_internal(value: PluginHistory): Self = StObject.set(x, "_internal", value.asInstanceOf[js.Any])
    
    inline def set_internalUndefined: Self = StObject.set(x, "_internal", js.undefined)
  }
}
