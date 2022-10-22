package typingsJapgolly.vsoNodeApi.interfacesGalleryInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ExtensionQueryFlags extends StObject
@JSImport("vso-node-api/interfaces/GalleryInterfaces", "ExtensionQueryFlags")
@js.native
object ExtensionQueryFlags extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ExtensionQueryFlags & Double] = js.native
  
  /**
    * AllAttributes is designed to be a mask that defines all sub-elements of the extension should be returned.  NOTE: This is not actually All flags. This is now locked to the set defined since changing this enum would be a breaking change and would change the behavior of anyone using it. Try not to use this value when making calls to the service, instead be explicit about the options required.
    */
  @js.native
  sealed trait AllAttributes
    extends StObject
       with ExtensionQueryFlags
  /* 479 */ val AllAttributes: typingsJapgolly.vsoNodeApi.interfacesGalleryInterfacesMod.ExtensionQueryFlags.AllAttributes & Double = js.native
  
  /**
    * Excluding non-validated extensions will remove any extension versions that either are in the process of being validated or have failed validation.
    */
  @js.native
  sealed trait ExcludeNonValidated
    extends StObject
       with ExtensionQueryFlags
  /* 32 */ val ExcludeNonValidated: typingsJapgolly.vsoNodeApi.interfacesGalleryInterfacesMod.ExtensionQueryFlags.ExcludeNonValidated & Double = js.native
  
  /**
    * Include the base uri for assets of this extension
    */
  @js.native
  sealed trait IncludeAssetUri
    extends StObject
       with ExtensionQueryFlags
  /* 128 */ val IncludeAssetUri: typingsJapgolly.vsoNodeApi.interfacesGalleryInterfacesMod.ExtensionQueryFlags.IncludeAssetUri & Double = js.native
  
  /**
    * Include the Categories and Tags that were added to the extension definition.
    */
  @js.native
  sealed trait IncludeCategoryAndTags
    extends StObject
       with ExtensionQueryFlags
  /* 4 */ val IncludeCategoryAndTags: typingsJapgolly.vsoNodeApi.interfacesGalleryInterfacesMod.ExtensionQueryFlags.IncludeCategoryAndTags & Double = js.native
  
  /**
    * IncludeFiles will return information about which files were found within the extension that were stored independant of the manifest. When asking for files, versions will be included as well since files are returned as a property of the versions.  These files can be retrieved using the path to the file without requiring the entire manifest be downloaded.
    */
  @js.native
  sealed trait IncludeFiles
    extends StObject
       with ExtensionQueryFlags
  /* 2 */ val IncludeFiles: typingsJapgolly.vsoNodeApi.interfacesGalleryInterfacesMod.ExtensionQueryFlags.IncludeFiles & Double = js.native
  
  /**
    * Include the set of installation targets the extension has requested.
    */
  @js.native
  sealed trait IncludeInstallationTargets
    extends StObject
       with ExtensionQueryFlags
  /* 64 */ val IncludeInstallationTargets: typingsJapgolly.vsoNodeApi.interfacesGalleryInterfacesMod.ExtensionQueryFlags.IncludeInstallationTargets & Double = js.native
  
  /**
    * When retrieving versions from a query, only include the latest version of the extensions that matched. This is useful when the caller doesn't need all the published versions. It will save a significant size in the returned payload.
    */
  @js.native
  sealed trait IncludeLatestVersionOnly
    extends StObject
       with ExtensionQueryFlags
  /* 512 */ val IncludeLatestVersionOnly: typingsJapgolly.vsoNodeApi.interfacesGalleryInterfacesMod.ExtensionQueryFlags.IncludeLatestVersionOnly & Double = js.native
  
  /**
    * This flag is used to get Lcid values associated with the extension. This is not applicable to VSTS or VSCode extensions and usage is only internal
    */
  @js.native
  sealed trait IncludeLcids
    extends StObject
       with ExtensionQueryFlags
  /* 8192 */ val IncludeLcids: typingsJapgolly.vsoNodeApi.interfacesGalleryInterfacesMod.ExtensionQueryFlags.IncludeLcids & Double = js.native
  
  /**
    * This flag is used to get all the metadata values associated with the extension. This is not applicable to VSTS or VSCode extensions and usage is only internal.
    */
  @js.native
  sealed trait IncludeMetadata
    extends StObject
       with ExtensionQueryFlags
  /* 2048 */ val IncludeMetadata: typingsJapgolly.vsoNodeApi.interfacesGalleryInterfacesMod.ExtensionQueryFlags.IncludeMetadata & Double = js.native
  
  /**
    * This flag is used to indicate to return very small data for extension reruired by VS IDE. This flag is only compatible when querying is done by VS IDE
    */
  @js.native
  sealed trait IncludeMinimalPayloadForVsIde
    extends StObject
       with ExtensionQueryFlags
  /* 4096 */ val IncludeMinimalPayloadForVsIde: typingsJapgolly.vsoNodeApi.interfacesGalleryInterfacesMod.ExtensionQueryFlags.IncludeMinimalPayloadForVsIde & Double = js.native
  
  /**
    * Include the details about which accounts the extension has been shared with if the extesion is a private extension.
    */
  @js.native
  sealed trait IncludeSharedAccounts
    extends StObject
       with ExtensionQueryFlags
  /* 8 */ val IncludeSharedAccounts: typingsJapgolly.vsoNodeApi.interfacesGalleryInterfacesMod.ExtensionQueryFlags.IncludeSharedAccounts & Double = js.native
  
  /**
    * Include the statistics associated with this extension
    */
  @js.native
  sealed trait IncludeStatistics
    extends StObject
       with ExtensionQueryFlags
  /* 256 */ val IncludeStatistics: typingsJapgolly.vsoNodeApi.interfacesGalleryInterfacesMod.ExtensionQueryFlags.IncludeStatistics & Double = js.native
  
  /**
    * Include properties associated with versions of the extension
    */
  @js.native
  sealed trait IncludeVersionProperties
    extends StObject
       with ExtensionQueryFlags
  /* 16 */ val IncludeVersionProperties: typingsJapgolly.vsoNodeApi.interfacesGalleryInterfacesMod.ExtensionQueryFlags.IncludeVersionProperties & Double = js.native
  
  /**
    * IncludeVersions will return version information for extensions returned
    */
  @js.native
  sealed trait IncludeVersions
    extends StObject
       with ExtensionQueryFlags
  /* 1 */ val IncludeVersions: typingsJapgolly.vsoNodeApi.interfacesGalleryInterfacesMod.ExtensionQueryFlags.IncludeVersions & Double = js.native
  
  /**
    * None is used to retrieve only the basic extension details.
    */
  @js.native
  sealed trait None
    extends StObject
       with ExtensionQueryFlags
  /* 0 */ val None: typingsJapgolly.vsoNodeApi.interfacesGalleryInterfacesMod.ExtensionQueryFlags.None & Double = js.native
  
  /**
    * This flag switches the asset uri to use GetAssetByName instead of CDN When this is used, values of base asset uri and base asset uri fallback are switched When this is used, source of asset files are pointed to Gallery service always even if CDN is available
    */
  @js.native
  sealed trait UseFallbackAssetUri
    extends StObject
       with ExtensionQueryFlags
  /* 1024 */ val UseFallbackAssetUri: typingsJapgolly.vsoNodeApi.interfacesGalleryInterfacesMod.ExtensionQueryFlags.UseFallbackAssetUri & Double = js.native
}
