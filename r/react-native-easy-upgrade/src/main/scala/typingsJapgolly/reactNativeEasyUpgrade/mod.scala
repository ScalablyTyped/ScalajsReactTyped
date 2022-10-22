package typingsJapgolly.reactNativeEasyUpgrade

import typingsJapgolly.reactNativeEasyUpgrade.anon.AllowedInMetered
import typingsJapgolly.reactNativeEasyUpgrade.anon.HasNewVersion
import typingsJapgolly.reactNativeEasyUpgrade.anon.PartialOptions
import typingsJapgolly.reactNativeEasyUpgrade.anon.VERSIONCODE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-native-easy-upgrade", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with AppUpgrade {
    def this(options: PartialOptions) = this()
  }
  
  @js.native
  trait AppUpgrade extends StObject {
    
    def checkApkHasDownloaded(): js.Promise[Boolean] = js.native
    def checkApkHasDownloaded(path: String): js.Promise[Boolean] = js.native
    
    /**
      * Check the ios app version info from app store.
      */
    def checkAppVersionIOS(): js.Promise[HasNewVersion] = js.native
    
    val downloadDestDirectory: String = js.native
    
    val downloadDestPath: String = js.native
    
    /**
      * download file
      * @param fileUrl
      * @param downloadConf
      */
    def downloadFile(fileUrl: String): Unit = js.native
    def downloadFile(fileUrl: String, downloadConf: AllowedInMetered): Unit = js.native
    
    val downloading: Boolean = js.native
    
    def getLocalVersionInfo(): VERSIONCODE = js.native
    
    def getNetworkStatus(): js.Promise[String] = js.native
    
    def installApk(): Unit = js.native
    def installApk(apkPath: String): Unit = js.native
    
    /**
      * navigate to app store download page.
      */
    def navigateToAppStore(): Unit = js.native
    def navigateToAppStore(trackViewUrl: String): Unit = js.native
    
    def startAppUpdate(apkUrl: String): Unit = js.native
    def startAppUpdate(apkUrl: String, appStoreUrl: String): Unit = js.native
    
    /**
      * update app and install
      * @param apkUrl
      */
    def updateAndroidApp(apkUrl: String): js.Promise[Unit] = js.native
  }
  
  trait Options extends StObject {
    
    def downloadApkEnd(path: String): Any
    
    var downloadApkName: String
    
    var downloadDescription: String
    
    var downloadDestDirectory: String
    
    var downloadTitle: String
    
    var iOSAppId: String
    
    var iOSAppLookupUrl: String
    
    def onError(err: js.Error): Any
    
    var shouldCheckApkHasDownloaded: Boolean
  }
  object Options {
    
    inline def apply(
      downloadApkEnd: String => Any,
      downloadApkName: String,
      downloadDescription: String,
      downloadDestDirectory: String,
      downloadTitle: String,
      iOSAppId: String,
      iOSAppLookupUrl: String,
      onError: js.Error => Any,
      shouldCheckApkHasDownloaded: Boolean
    ): Options = {
      val __obj = js.Dynamic.literal(downloadApkEnd = js.Any.fromFunction1(downloadApkEnd), downloadApkName = downloadApkName.asInstanceOf[js.Any], downloadDescription = downloadDescription.asInstanceOf[js.Any], downloadDestDirectory = downloadDestDirectory.asInstanceOf[js.Any], downloadTitle = downloadTitle.asInstanceOf[js.Any], iOSAppId = iOSAppId.asInstanceOf[js.Any], iOSAppLookupUrl = iOSAppLookupUrl.asInstanceOf[js.Any], onError = js.Any.fromFunction1(onError), shouldCheckApkHasDownloaded = shouldCheckApkHasDownloaded.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setDownloadApkEnd(value: String => Any): Self = StObject.set(x, "downloadApkEnd", js.Any.fromFunction1(value))
      
      inline def setDownloadApkName(value: String): Self = StObject.set(x, "downloadApkName", value.asInstanceOf[js.Any])
      
      inline def setDownloadDescription(value: String): Self = StObject.set(x, "downloadDescription", value.asInstanceOf[js.Any])
      
      inline def setDownloadDestDirectory(value: String): Self = StObject.set(x, "downloadDestDirectory", value.asInstanceOf[js.Any])
      
      inline def setDownloadTitle(value: String): Self = StObject.set(x, "downloadTitle", value.asInstanceOf[js.Any])
      
      inline def setIOSAppId(value: String): Self = StObject.set(x, "iOSAppId", value.asInstanceOf[js.Any])
      
      inline def setIOSAppLookupUrl(value: String): Self = StObject.set(x, "iOSAppLookupUrl", value.asInstanceOf[js.Any])
      
      inline def setOnError(value: js.Error => Any): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
      
      inline def setShouldCheckApkHasDownloaded(value: Boolean): Self = StObject.set(x, "shouldCheckApkHasDownloaded", value.asInstanceOf[js.Any])
    }
  }
}
