package typingsJapgolly.octokitOpenapiTypes.anon

import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.repositories
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Excludegitdata extends StObject {
  
  /** @description Exclude related items from being returned in the response in order to improve performance of the request. The array can include any of: `"repositories"`. */
  var exclude: js.UndefOr[js.Array[repositories]] = js.undefined
  
  /**
    * @description Indicates whether attachments should be excluded from the migration (to reduce migration archive file size).
    * @default false
    * @example true
    */
  var exclude_attachments: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @description Indicates whether the repository git data should be excluded from the migration.
    * @default false
    */
  var exclude_git_data: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @description Indicates whether metadata should be excluded and only git source should be included for the migration.
    * @default false
    */
  var exclude_metadata: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @description Indicates whether projects owned by the organization or users should be excluded. from the migration.
    * @default false
    * @example true
    */
  var exclude_owner_projects: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @description Indicates whether releases should be excluded from the migration (to reduce migration archive file size).
    * @default false
    * @example true
    */
  var exclude_releases: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @description Indicates whether repositories should be locked (to prevent manipulation) while migrating data.
    * @default false
    * @example true
    */
  var lock_repositories: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @description Indicates whether this should only include organization metadata (repositories array should be empty and will ignore other flags).
    * @default false
    * @example true
    */
  var org_metadata_only: js.UndefOr[Boolean] = js.undefined
  
  /** @description A list of arrays indicating which repositories should be migrated. */
  var repositories: js.Array[String]
}
object Excludegitdata {
  
  inline def apply(repositories: js.Array[String]): Excludegitdata = {
    val __obj = js.Dynamic.literal(repositories = repositories.asInstanceOf[js.Any])
    __obj.asInstanceOf[Excludegitdata]
  }
  
  extension [Self <: Excludegitdata](x: Self) {
    
    inline def setExclude(value: js.Array[repositories]): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
    
    inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
    
    inline def setExcludeVarargs(value: repositories*): Self = StObject.set(x, "exclude", js.Array(value*))
    
    inline def setExclude_attachments(value: Boolean): Self = StObject.set(x, "exclude_attachments", value.asInstanceOf[js.Any])
    
    inline def setExclude_attachmentsUndefined: Self = StObject.set(x, "exclude_attachments", js.undefined)
    
    inline def setExclude_git_data(value: Boolean): Self = StObject.set(x, "exclude_git_data", value.asInstanceOf[js.Any])
    
    inline def setExclude_git_dataUndefined: Self = StObject.set(x, "exclude_git_data", js.undefined)
    
    inline def setExclude_metadata(value: Boolean): Self = StObject.set(x, "exclude_metadata", value.asInstanceOf[js.Any])
    
    inline def setExclude_metadataUndefined: Self = StObject.set(x, "exclude_metadata", js.undefined)
    
    inline def setExclude_owner_projects(value: Boolean): Self = StObject.set(x, "exclude_owner_projects", value.asInstanceOf[js.Any])
    
    inline def setExclude_owner_projectsUndefined: Self = StObject.set(x, "exclude_owner_projects", js.undefined)
    
    inline def setExclude_releases(value: Boolean): Self = StObject.set(x, "exclude_releases", value.asInstanceOf[js.Any])
    
    inline def setExclude_releasesUndefined: Self = StObject.set(x, "exclude_releases", js.undefined)
    
    inline def setLock_repositories(value: Boolean): Self = StObject.set(x, "lock_repositories", value.asInstanceOf[js.Any])
    
    inline def setLock_repositoriesUndefined: Self = StObject.set(x, "lock_repositories", js.undefined)
    
    inline def setOrg_metadata_only(value: Boolean): Self = StObject.set(x, "org_metadata_only", value.asInstanceOf[js.Any])
    
    inline def setOrg_metadata_onlyUndefined: Self = StObject.set(x, "org_metadata_only", js.undefined)
    
    inline def setRepositories(value: js.Array[String]): Self = StObject.set(x, "repositories", value.asInstanceOf[js.Any])
    
    inline def setRepositoriesVarargs(value: String*): Self = StObject.set(x, "repositories", js.Array(value*))
  }
}
