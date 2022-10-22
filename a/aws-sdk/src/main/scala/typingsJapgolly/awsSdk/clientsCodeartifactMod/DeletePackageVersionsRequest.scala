package typingsJapgolly.awsSdk.clientsCodeartifactMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeletePackageVersionsRequest extends StObject {
  
  /**
    *  The name of the package with the versions to delete. 
    */
  @JSName("package")
  var _package: PackageName
  
  /**
    *  The name of the domain that contains the package to delete. 
    */
  var domain: DomainName
  
  /**
    *  The 12-digit account number of the Amazon Web Services account that owns the domain. It does not include dashes or spaces. 
    */
  var domainOwner: js.UndefOr[AccountId] = js.undefined
  
  /**
    *  The expected status of the package version to delete. 
    */
  var expectedStatus: js.UndefOr[PackageVersionStatus] = js.undefined
  
  /**
    *  The format of the package versions to delete. 
    */
  var format: PackageFormat
  
  /**
    * The namespace of the package versions to be deleted. The package version component that specifies its namespace depends on its type. For example:    The namespace of a Maven package version is its groupId. The namespace is required when deleting Maven package versions.     The namespace of an npm package version is its scope.     Python and NuGet package versions do not contain a corresponding component, package versions of those formats do not have a namespace.   
    */
  var namespace: js.UndefOr[PackageNamespace] = js.undefined
  
  /**
    *  The name of the repository that contains the package versions to delete. 
    */
  var repository: RepositoryName
  
  /**
    *  An array of strings that specify the versions of the package to delete. 
    */
  var versions: PackageVersionList
}
object DeletePackageVersionsRequest {
  
  inline def apply(
    _package: PackageName,
    domain: DomainName,
    format: PackageFormat,
    repository: RepositoryName,
    versions: PackageVersionList
  ): DeletePackageVersionsRequest = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any], versions = versions.asInstanceOf[js.Any])
    __obj.updateDynamic("package")(_package.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeletePackageVersionsRequest]
  }
  
  extension [Self <: DeletePackageVersionsRequest](x: Self) {
    
    inline def setDomain(value: DomainName): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    inline def setDomainOwner(value: AccountId): Self = StObject.set(x, "domainOwner", value.asInstanceOf[js.Any])
    
    inline def setDomainOwnerUndefined: Self = StObject.set(x, "domainOwner", js.undefined)
    
    inline def setExpectedStatus(value: PackageVersionStatus): Self = StObject.set(x, "expectedStatus", value.asInstanceOf[js.Any])
    
    inline def setExpectedStatusUndefined: Self = StObject.set(x, "expectedStatus", js.undefined)
    
    inline def setFormat(value: PackageFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setNamespace(value: PackageNamespace): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    
    inline def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
    
    inline def setRepository(value: RepositoryName): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
    
    inline def setVersions(value: PackageVersionList): Self = StObject.set(x, "versions", value.asInstanceOf[js.Any])
    
    inline def setVersionsVarargs(value: PackageVersion*): Self = StObject.set(x, "versions", js.Array(value*))
    
    inline def set_package(value: PackageName): Self = StObject.set(x, "package", value.asInstanceOf[js.Any])
  }
}
