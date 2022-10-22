package typingsJapgolly.awsSdk.clientsCodeartifactMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PackageVersionDescription extends StObject {
  
  /**
    *  The name of the package that is displayed. The displayName varies depending on the package version's format. For example, if an npm package is named ui, is in the namespace vue, and has the format npm, then the displayName is @vue/ui. 
    */
  var displayName: js.UndefOr[String255] = js.undefined
  
  /**
    *  The format of the package version. 
    */
  var format: js.UndefOr[PackageFormat] = js.undefined
  
  /**
    *  The homepage associated with the package. 
    */
  var homePage: js.UndefOr[String] = js.undefined
  
  /**
    *  Information about licenses associated with the package version. 
    */
  var licenses: js.UndefOr[LicenseInfoList] = js.undefined
  
  /**
    * The namespace of the package version. The package version component that specifies its namespace depends on its type. For example:    The namespace of a Maven package version is its groupId.     The namespace of an npm package version is its scope.     Python and NuGet package versions do not contain a corresponding component, package versions of those formats do not have a namespace.   
    */
  var namespace: js.UndefOr[PackageNamespace] = js.undefined
  
  /**
    * A PackageVersionOrigin object that contains information about how the package version was added to the repository.
    */
  var origin: js.UndefOr[PackageVersionOrigin] = js.undefined
  
  /**
    *  The name of the requested package. 
    */
  var packageName: js.UndefOr[PackageName] = js.undefined
  
  /**
    *  A timestamp that contains the date and time the package version was published. 
    */
  var publishedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    *  The revision of the package version. 
    */
  var revision: js.UndefOr[PackageVersionRevision] = js.undefined
  
  /**
    *  The repository for the source code in the package version, or the source code used to build it. 
    */
  var sourceCodeRepository: js.UndefOr[String] = js.undefined
  
  /**
    *  A string that contains the status of the package version. 
    */
  var status: js.UndefOr[PackageVersionStatus] = js.undefined
  
  /**
    *  A summary of the package version. The summary is extracted from the package. The information in and detail level of the summary depends on the package version's format. 
    */
  var summary: js.UndefOr[String] = js.undefined
  
  /**
    *  The version of the package. 
    */
  var version: js.UndefOr[PackageVersion] = js.undefined
}
object PackageVersionDescription {
  
  inline def apply(): PackageVersionDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PackageVersionDescription]
  }
  
  extension [Self <: PackageVersionDescription](x: Self) {
    
    inline def setDisplayName(value: String255): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setFormat(value: PackageFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setHomePage(value: String): Self = StObject.set(x, "homePage", value.asInstanceOf[js.Any])
    
    inline def setHomePageUndefined: Self = StObject.set(x, "homePage", js.undefined)
    
    inline def setLicenses(value: LicenseInfoList): Self = StObject.set(x, "licenses", value.asInstanceOf[js.Any])
    
    inline def setLicensesUndefined: Self = StObject.set(x, "licenses", js.undefined)
    
    inline def setLicensesVarargs(value: LicenseInfo*): Self = StObject.set(x, "licenses", js.Array(value*))
    
    inline def setNamespace(value: PackageNamespace): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    
    inline def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
    
    inline def setOrigin(value: PackageVersionOrigin): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    inline def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
    
    inline def setPackageName(value: PackageName): Self = StObject.set(x, "packageName", value.asInstanceOf[js.Any])
    
    inline def setPackageNameUndefined: Self = StObject.set(x, "packageName", js.undefined)
    
    inline def setPublishedTime(value: js.Date): Self = StObject.set(x, "publishedTime", value.asInstanceOf[js.Any])
    
    inline def setPublishedTimeUndefined: Self = StObject.set(x, "publishedTime", js.undefined)
    
    inline def setRevision(value: PackageVersionRevision): Self = StObject.set(x, "revision", value.asInstanceOf[js.Any])
    
    inline def setRevisionUndefined: Self = StObject.set(x, "revision", js.undefined)
    
    inline def setSourceCodeRepository(value: String): Self = StObject.set(x, "sourceCodeRepository", value.asInstanceOf[js.Any])
    
    inline def setSourceCodeRepositoryUndefined: Self = StObject.set(x, "sourceCodeRepository", js.undefined)
    
    inline def setStatus(value: PackageVersionStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setSummary(value: String): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
    
    inline def setSummaryUndefined: Self = StObject.set(x, "summary", js.undefined)
    
    inline def setVersion(value: PackageVersion): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
