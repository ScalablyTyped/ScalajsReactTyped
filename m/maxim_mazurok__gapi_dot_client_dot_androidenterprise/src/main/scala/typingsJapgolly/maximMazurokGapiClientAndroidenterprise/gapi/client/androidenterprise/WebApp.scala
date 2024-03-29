package typingsJapgolly.maximMazurokGapiClientAndroidenterprise.gapi.client.androidenterprise

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebApp extends StObject {
  
  /**
    * The display mode of the web app. Possible values include: - "minimalUi", the device's status bar, navigation bar, the app's URL, and a refresh button are visible when the app is
    * open. For HTTP URLs, you can only select this option. - "standalone", the device's status bar and navigation bar are visible when the app is open. - "fullScreen", the app opens in
    * full screen mode, hiding the device's status and navigation bars. All browser UI elements, page URL, system status bar and back button are not visible, and the web app takes up the
    * entirety of the available display area.
    */
  var displayMode: js.UndefOr[String] = js.undefined
  
  /** A list of icons representing this website. If absent, a default icon (for create) or the current icon (for update) will be used. */
  var icons: js.UndefOr[js.Array[WebAppIcon]] = js.undefined
  
  /** A flag whether the app has been published to the Play store yet. */
  var isPublished: js.UndefOr[Boolean] = js.undefined
  
  /** The start URL, i.e. the URL that should load when the user opens the application. */
  var startUrl: js.UndefOr[String] = js.undefined
  
  /** The title of the web app as displayed to the user (e.g., amongst a list of other applications, or as a label for an icon). */
  var title: js.UndefOr[String] = js.undefined
  
  /**
    * The current version of the app. Note that the version can automatically increase during the lifetime of the web app, while Google does internal housekeeping to keep the web app
    * up-to-date.
    */
  var versionCode: js.UndefOr[String] = js.undefined
  
  /** The ID of the application. A string of the form "app:<package name>" where the package name always starts with the prefix "com.google.enterprise.webapp." followed by a random id. */
  var webAppId: js.UndefOr[String] = js.undefined
}
object WebApp {
  
  inline def apply(): WebApp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebApp]
  }
  
  extension [Self <: WebApp](x: Self) {
    
    inline def setDisplayMode(value: String): Self = StObject.set(x, "displayMode", value.asInstanceOf[js.Any])
    
    inline def setDisplayModeUndefined: Self = StObject.set(x, "displayMode", js.undefined)
    
    inline def setIcons(value: js.Array[WebAppIcon]): Self = StObject.set(x, "icons", value.asInstanceOf[js.Any])
    
    inline def setIconsUndefined: Self = StObject.set(x, "icons", js.undefined)
    
    inline def setIconsVarargs(value: WebAppIcon*): Self = StObject.set(x, "icons", js.Array(value*))
    
    inline def setIsPublished(value: Boolean): Self = StObject.set(x, "isPublished", value.asInstanceOf[js.Any])
    
    inline def setIsPublishedUndefined: Self = StObject.set(x, "isPublished", js.undefined)
    
    inline def setStartUrl(value: String): Self = StObject.set(x, "startUrl", value.asInstanceOf[js.Any])
    
    inline def setStartUrlUndefined: Self = StObject.set(x, "startUrl", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setVersionCode(value: String): Self = StObject.set(x, "versionCode", value.asInstanceOf[js.Any])
    
    inline def setVersionCodeUndefined: Self = StObject.set(x, "versionCode", js.undefined)
    
    inline def setWebAppId(value: String): Self = StObject.set(x, "webAppId", value.asInstanceOf[js.Any])
    
    inline def setWebAppIdUndefined: Self = StObject.set(x, "webAppId", js.undefined)
  }
}
