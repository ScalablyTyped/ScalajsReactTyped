package typingsJapgolly.winrtUwp.Windows.ApplicationModel

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IVectorView
import typingsJapgolly.winrtUwp.Windows.Foundation.Uri
import typingsJapgolly.winrtUwp.Windows.Storage.StorageFolder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides information about a package. */
trait Package extends StObject {
  
  /** Gets the packages on which the current package depends. */
  var dependencies: IVectorView[Package]
  
  /** Gets the description of the package. */
  var description: String
  
  /** Gets the display name of the package. */
  var displayName: String
  
  var getAppListEntriesAsync: Any
  
  /* unmapped type */
  /**
    * Windows Phone only. Returns a token that can be used to retrieve the thumbnail image associated with this application package.
    * @return A token that can be used to retrieve the thumbnail image associated with this application package.
    */
  def getThumbnailToken(): String
  
  /** Gets the package identity of the current package. */
  var id: PackageId
  
  /** Windows Phone only. Gets the date the application package was installed on the user's phone. */
  var installDate: js.Date
  
  /** Gets the date on which the application package was installed or last updated. */
  var installedDate: js.Date
  
  /** Gets the location of the installed package. */
  var installedLocation: StorageFolder
  
  /** Indicates whether the package is a bundle package. */
  var isBundle: Boolean
  
  /** Indicates whether the package is installed in development mode. */
  var isDevelopmentMode: Boolean
  
  /** Indicates whether other packages can declare a dependency on this package. */
  var isFramework: Boolean
  
  /** Indicates whether the package is a resource package. */
  var isResourcePackage: Boolean
  
  /**
    * Windows Phone only. Launches the specified application.
    * @param parameters The navigation URI that specifies the page to launch and optional parameters. Use an empty string to specify the default page for the app.
    */
  def launch(parameters: String): Unit
  
  /** Gets the logo of the package. */
  var logo: Uri
  
  /** Gets the publisher display name of the package. */
  var publisherDisplayName: String
  
  var status: Any
}
object Package {
  
  inline def apply(
    dependencies: IVectorView[Package],
    description: String,
    displayName: String,
    getAppListEntriesAsync: Any,
    getThumbnailToken: CallbackTo[String],
    id: PackageId,
    installDate: js.Date,
    installedDate: js.Date,
    installedLocation: StorageFolder,
    isBundle: Boolean,
    isDevelopmentMode: Boolean,
    isFramework: Boolean,
    isResourcePackage: Boolean,
    launch: String => Callback,
    logo: Uri,
    publisherDisplayName: String,
    status: Any
  ): Package = {
    val __obj = js.Dynamic.literal(dependencies = dependencies.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], getAppListEntriesAsync = getAppListEntriesAsync.asInstanceOf[js.Any], getThumbnailToken = getThumbnailToken.toJsFn, id = id.asInstanceOf[js.Any], installDate = installDate.asInstanceOf[js.Any], installedDate = installedDate.asInstanceOf[js.Any], installedLocation = installedLocation.asInstanceOf[js.Any], isBundle = isBundle.asInstanceOf[js.Any], isDevelopmentMode = isDevelopmentMode.asInstanceOf[js.Any], isFramework = isFramework.asInstanceOf[js.Any], isResourcePackage = isResourcePackage.asInstanceOf[js.Any], launch = js.Any.fromFunction1((t0: String) => launch(t0).runNow()), logo = logo.asInstanceOf[js.Any], publisherDisplayName = publisherDisplayName.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Package]
  }
  
  extension [Self <: Package](x: Self) {
    
    inline def setDependencies(value: IVectorView[Package]): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setGetAppListEntriesAsync(value: Any): Self = StObject.set(x, "getAppListEntriesAsync", value.asInstanceOf[js.Any])
    
    inline def setGetThumbnailToken(value: CallbackTo[String]): Self = StObject.set(x, "getThumbnailToken", value.toJsFn)
    
    inline def setId(value: PackageId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setInstallDate(value: js.Date): Self = StObject.set(x, "installDate", value.asInstanceOf[js.Any])
    
    inline def setInstalledDate(value: js.Date): Self = StObject.set(x, "installedDate", value.asInstanceOf[js.Any])
    
    inline def setInstalledLocation(value: StorageFolder): Self = StObject.set(x, "installedLocation", value.asInstanceOf[js.Any])
    
    inline def setIsBundle(value: Boolean): Self = StObject.set(x, "isBundle", value.asInstanceOf[js.Any])
    
    inline def setIsDevelopmentMode(value: Boolean): Self = StObject.set(x, "isDevelopmentMode", value.asInstanceOf[js.Any])
    
    inline def setIsFramework(value: Boolean): Self = StObject.set(x, "isFramework", value.asInstanceOf[js.Any])
    
    inline def setIsResourcePackage(value: Boolean): Self = StObject.set(x, "isResourcePackage", value.asInstanceOf[js.Any])
    
    inline def setLaunch(value: String => Callback): Self = StObject.set(x, "launch", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setLogo(value: Uri): Self = StObject.set(x, "logo", value.asInstanceOf[js.Any])
    
    inline def setPublisherDisplayName(value: String): Self = StObject.set(x, "publisherDisplayName", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: Any): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
