package typingsJapgolly.msRestAzure.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AzureEnvironmentParameters extends StObject {
  
  /**
    * The Active Directory login endpoint.
    */
  var activeDirectoryEndpointUrl: String
  
  /**
    * The Active Directory api version.
    */
  var activeDirectoryGraphApiVersion: String
  
  /**
    * The Active Directory Graph resource ID.
    */
  var activeDirectoryGraphResourceId: String
  
  /**
    * The resource ID to obtain AD tokens for (token audience).
    */
  var activeDirectoryResourceId: String
  
  /**
    * The data lake analytics job and catalog service dns suffix.
    */
  var azureDataLakeAnalyticsCatalogAndJobEndpointSuffix: String
  
  /**
    * The data lake store filesystem service dns suffix.
    */
  var azureDataLakeStoreFileSystemEndpointSuffix: String
  
  /**
    * The Azure Batch resource ID.
    */
  var batchResourceId: String
  
  /**
    * The template gallery endpoint.
    */
  var galleryEndpointUrl: String
  
  /**
    * The keyvault service dns suffix.
    */
  var keyVaultDnsSuffix: String
  
  /**
    * The management service endpoint.
    */
  var managementEndpointUrl: String
  
  /**
    * The Environment name.
    */
  var name: String
  
  /**
    * The management portal URL.
    */
  var portalUrl: String
  
  /**
    * The publish settings file URL.
    */
  var publishingProfileUrl: String
  
  /**
    * The resource management endpoint.
    */
  var resourceManagerEndpointUrl: String
  
  /**
    * The sql server management endpoint for mobile commands.
    */
  var sqlManagementEndpointUrl: String
  
  /**
    * The dns suffix for sql servers.
    */
  var sqlServerHostnameSuffix: String
  
  /**
    * The endpoint suffix for storage accounts.
    */
  var storageEndpointSuffix: String
  
  /**
    * Determines whether the authentication endpoint should be validated with Azure AD. Default value is true.
    */
  var validateAuthority: Boolean
}
object AzureEnvironmentParameters {
  
  inline def apply(
    activeDirectoryEndpointUrl: String,
    activeDirectoryGraphApiVersion: String,
    activeDirectoryGraphResourceId: String,
    activeDirectoryResourceId: String,
    azureDataLakeAnalyticsCatalogAndJobEndpointSuffix: String,
    azureDataLakeStoreFileSystemEndpointSuffix: String,
    batchResourceId: String,
    galleryEndpointUrl: String,
    keyVaultDnsSuffix: String,
    managementEndpointUrl: String,
    name: String,
    portalUrl: String,
    publishingProfileUrl: String,
    resourceManagerEndpointUrl: String,
    sqlManagementEndpointUrl: String,
    sqlServerHostnameSuffix: String,
    storageEndpointSuffix: String,
    validateAuthority: Boolean
  ): AzureEnvironmentParameters = {
    val __obj = js.Dynamic.literal(activeDirectoryEndpointUrl = activeDirectoryEndpointUrl.asInstanceOf[js.Any], activeDirectoryGraphApiVersion = activeDirectoryGraphApiVersion.asInstanceOf[js.Any], activeDirectoryGraphResourceId = activeDirectoryGraphResourceId.asInstanceOf[js.Any], activeDirectoryResourceId = activeDirectoryResourceId.asInstanceOf[js.Any], azureDataLakeAnalyticsCatalogAndJobEndpointSuffix = azureDataLakeAnalyticsCatalogAndJobEndpointSuffix.asInstanceOf[js.Any], azureDataLakeStoreFileSystemEndpointSuffix = azureDataLakeStoreFileSystemEndpointSuffix.asInstanceOf[js.Any], batchResourceId = batchResourceId.asInstanceOf[js.Any], galleryEndpointUrl = galleryEndpointUrl.asInstanceOf[js.Any], keyVaultDnsSuffix = keyVaultDnsSuffix.asInstanceOf[js.Any], managementEndpointUrl = managementEndpointUrl.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], portalUrl = portalUrl.asInstanceOf[js.Any], publishingProfileUrl = publishingProfileUrl.asInstanceOf[js.Any], resourceManagerEndpointUrl = resourceManagerEndpointUrl.asInstanceOf[js.Any], sqlManagementEndpointUrl = sqlManagementEndpointUrl.asInstanceOf[js.Any], sqlServerHostnameSuffix = sqlServerHostnameSuffix.asInstanceOf[js.Any], storageEndpointSuffix = storageEndpointSuffix.asInstanceOf[js.Any], validateAuthority = validateAuthority.asInstanceOf[js.Any])
    __obj.asInstanceOf[AzureEnvironmentParameters]
  }
  
  extension [Self <: AzureEnvironmentParameters](x: Self) {
    
    inline def setActiveDirectoryEndpointUrl(value: String): Self = StObject.set(x, "activeDirectoryEndpointUrl", value.asInstanceOf[js.Any])
    
    inline def setActiveDirectoryGraphApiVersion(value: String): Self = StObject.set(x, "activeDirectoryGraphApiVersion", value.asInstanceOf[js.Any])
    
    inline def setActiveDirectoryGraphResourceId(value: String): Self = StObject.set(x, "activeDirectoryGraphResourceId", value.asInstanceOf[js.Any])
    
    inline def setActiveDirectoryResourceId(value: String): Self = StObject.set(x, "activeDirectoryResourceId", value.asInstanceOf[js.Any])
    
    inline def setAzureDataLakeAnalyticsCatalogAndJobEndpointSuffix(value: String): Self = StObject.set(x, "azureDataLakeAnalyticsCatalogAndJobEndpointSuffix", value.asInstanceOf[js.Any])
    
    inline def setAzureDataLakeStoreFileSystemEndpointSuffix(value: String): Self = StObject.set(x, "azureDataLakeStoreFileSystemEndpointSuffix", value.asInstanceOf[js.Any])
    
    inline def setBatchResourceId(value: String): Self = StObject.set(x, "batchResourceId", value.asInstanceOf[js.Any])
    
    inline def setGalleryEndpointUrl(value: String): Self = StObject.set(x, "galleryEndpointUrl", value.asInstanceOf[js.Any])
    
    inline def setKeyVaultDnsSuffix(value: String): Self = StObject.set(x, "keyVaultDnsSuffix", value.asInstanceOf[js.Any])
    
    inline def setManagementEndpointUrl(value: String): Self = StObject.set(x, "managementEndpointUrl", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPortalUrl(value: String): Self = StObject.set(x, "portalUrl", value.asInstanceOf[js.Any])
    
    inline def setPublishingProfileUrl(value: String): Self = StObject.set(x, "publishingProfileUrl", value.asInstanceOf[js.Any])
    
    inline def setResourceManagerEndpointUrl(value: String): Self = StObject.set(x, "resourceManagerEndpointUrl", value.asInstanceOf[js.Any])
    
    inline def setSqlManagementEndpointUrl(value: String): Self = StObject.set(x, "sqlManagementEndpointUrl", value.asInstanceOf[js.Any])
    
    inline def setSqlServerHostnameSuffix(value: String): Self = StObject.set(x, "sqlServerHostnameSuffix", value.asInstanceOf[js.Any])
    
    inline def setStorageEndpointSuffix(value: String): Self = StObject.set(x, "storageEndpointSuffix", value.asInstanceOf[js.Any])
    
    inline def setValidateAuthority(value: Boolean): Self = StObject.set(x, "validateAuthority", value.asInstanceOf[js.Any])
  }
}
