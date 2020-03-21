package typingsJapgolly.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object workdocsMod {
  type ActivityNamesFilterType = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.DOCUMENT_CHECKED_IN
    - typingsJapgolly.awsSdk.awsSdkStrings.DOCUMENT_CHECKED_OUT
    - typingsJapgolly.awsSdk.awsSdkStrings.DOCUMENT_RENAMED
    - typingsJapgolly.awsSdk.awsSdkStrings.DOCUMENT_VERSION_UPLOADED
    - typingsJapgolly.awsSdk.awsSdkStrings.DOCUMENT_VERSION_DELETED
    - typingsJapgolly.awsSdk.awsSdkStrings.DOCUMENT_VERSION_VIEWED
    - typingsJapgolly.awsSdk.awsSdkStrings.DOCUMENT_VERSION_DOWNLOADED
    - typingsJapgolly.awsSdk.awsSdkStrings.DOCUMENT_RECYCLED
    - typingsJapgolly.awsSdk.awsSdkStrings.DOCUMENT_RESTORED
    - typingsJapgolly.awsSdk.awsSdkStrings.DOCUMENT_REVERTED
    - typingsJapgolly.awsSdk.awsSdkStrings.DOCUMENT_SHARED
    - typingsJapgolly.awsSdk.awsSdkStrings.DOCUMENT_UNSHARED
    - typingsJapgolly.awsSdk.awsSdkStrings.DOCUMENT_SHARE_PERMISSION_CHANGED
    - typingsJapgolly.awsSdk.awsSdkStrings.DOCUMENT_SHAREABLE_LINK_CREATED
    - typingsJapgolly.awsSdk.awsSdkStrings.DOCUMENT_SHAREABLE_LINK_REMOVED
    - typingsJapgolly.awsSdk.awsSdkStrings.DOCUMENT_SHAREABLE_LINK_PERMISSION_CHANGED
    - typingsJapgolly.awsSdk.awsSdkStrings.DOCUMENT_MOVED
    - typingsJapgolly.awsSdk.awsSdkStrings.DOCUMENT_COMMENT_ADDED
    - typingsJapgolly.awsSdk.awsSdkStrings.DOCUMENT_COMMENT_DELETED
    - typingsJapgolly.awsSdk.awsSdkStrings.DOCUMENT_ANNOTATION_ADDED
    - typingsJapgolly.awsSdk.awsSdkStrings.DOCUMENT_ANNOTATION_DELETED
    - typingsJapgolly.awsSdk.awsSdkStrings.FOLDER_CREATED
    - typingsJapgolly.awsSdk.awsSdkStrings.FOLDER_DELETED
    - typingsJapgolly.awsSdk.awsSdkStrings.FOLDER_RENAMED
    - typingsJapgolly.awsSdk.awsSdkStrings.FOLDER_RECYCLED
    - typingsJapgolly.awsSdk.awsSdkStrings.FOLDER_RESTORED
    - typingsJapgolly.awsSdk.awsSdkStrings.FOLDER_SHARED
    - typingsJapgolly.awsSdk.awsSdkStrings.FOLDER_UNSHARED
    - typingsJapgolly.awsSdk.awsSdkStrings.FOLDER_SHARE_PERMISSION_CHANGED
    - typingsJapgolly.awsSdk.awsSdkStrings.FOLDER_SHAREABLE_LINK_CREATED
    - typingsJapgolly.awsSdk.awsSdkStrings.FOLDER_SHAREABLE_LINK_REMOVED
    - typingsJapgolly.awsSdk.awsSdkStrings.FOLDER_SHAREABLE_LINK_PERMISSION_CHANGED
    - typingsJapgolly.awsSdk.awsSdkStrings.FOLDER_MOVED
    - java.lang.String
  */
  type ActivityType = typingsJapgolly.awsSdk.workdocsMod._ActivityType | java.lang.String
  type AuthenticationHeaderType = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.TRUE
    - typingsJapgolly.awsSdk.awsSdkStrings.FALSE
    - java.lang.String
  */
  type BooleanEnumType = typingsJapgolly.awsSdk.workdocsMod._BooleanEnumType | java.lang.String
  type BooleanType = scala.Boolean
  type ClientConfiguration = typingsJapgolly.awsSdk.serviceMod.ServiceConfigurationOptions with typingsJapgolly.awsSdk.workdocsMod.ClientApiVersions
  type CommentIdType = java.lang.String
  type CommentList = js.Array[typingsJapgolly.awsSdk.workdocsMod.Comment]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.DRAFT
    - typingsJapgolly.awsSdk.awsSdkStrings.PUBLISHED
    - typingsJapgolly.awsSdk.awsSdkStrings.DELETED
    - java.lang.String
  */
  type CommentStatusType = typingsJapgolly.awsSdk.workdocsMod._CommentStatusType | java.lang.String
  type CommentTextType = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.PUBLIC
    - typingsJapgolly.awsSdk.awsSdkStrings.PRIVATE
    - java.lang.String
  */
  type CommentVisibilityType = typingsJapgolly.awsSdk.workdocsMod._CommentVisibilityType | java.lang.String
  type CustomMetadataKeyList = js.Array[typingsJapgolly.awsSdk.workdocsMod.CustomMetadataKeyType]
  type CustomMetadataKeyType = java.lang.String
  type CustomMetadataMap = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.workdocsMod.CustomMetadataValueType]
  type CustomMetadataValueType = java.lang.String
  type DocumentContentType = java.lang.String
  type DocumentMetadataList = js.Array[typingsJapgolly.awsSdk.workdocsMod.DocumentMetadata]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ORIGINAL
    - typingsJapgolly.awsSdk.awsSdkStrings.WITH_COMMENTS
    - java.lang.String
  */
  type DocumentSourceType = typingsJapgolly.awsSdk.workdocsMod._DocumentSourceType | java.lang.String
  type DocumentSourceUrlMap = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.workdocsMod.UrlType]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.INITIALIZED
    - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE
    - java.lang.String
  */
  type DocumentStatusType = typingsJapgolly.awsSdk.workdocsMod._DocumentStatusType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.SMALL
    - typingsJapgolly.awsSdk.awsSdkStrings.SMALL_HQ
    - typingsJapgolly.awsSdk.awsSdkStrings.LARGE
    - java.lang.String
  */
  type DocumentThumbnailType = typingsJapgolly.awsSdk.workdocsMod._DocumentThumbnailType | java.lang.String
  type DocumentThumbnailUrlMap = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.workdocsMod.UrlType]
  type DocumentVersionIdType = java.lang.String
  type DocumentVersionMetadataList = js.Array[typingsJapgolly.awsSdk.workdocsMod.DocumentVersionMetadata]
  type DocumentVersionStatus = typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE | java.lang.String
  type EmailAddressType = java.lang.String
  type FieldNamesType = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ALL
    - typingsJapgolly.awsSdk.awsSdkStrings.DOCUMENT
    - typingsJapgolly.awsSdk.awsSdkStrings.FOLDER
    - java.lang.String
  */
  type FolderContentType = typingsJapgolly.awsSdk.workdocsMod._FolderContentType | java.lang.String
  type FolderMetadataList = js.Array[typingsJapgolly.awsSdk.workdocsMod.FolderMetadata]
  type GroupMetadataList = js.Array[typingsJapgolly.awsSdk.workdocsMod.GroupMetadata]
  type GroupNameType = java.lang.String
  type HashType = java.lang.String
  type HeaderNameType = java.lang.String
  type HeaderValueType = java.lang.String
  type IdType = java.lang.String
  type LimitType = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.en
    - typingsJapgolly.awsSdk.awsSdkStrings.fr_
    - typingsJapgolly.awsSdk.awsSdkStrings.ko
    - typingsJapgolly.awsSdk.awsSdkStrings.de_
    - typingsJapgolly.awsSdk.awsSdkStrings.es_
    - typingsJapgolly.awsSdk.awsSdkStrings.ja
    - typingsJapgolly.awsSdk.awsSdkStrings.ru_
    - typingsJapgolly.awsSdk.awsSdkStrings.zh_CN
    - typingsJapgolly.awsSdk.awsSdkStrings.zh_TW
    - typingsJapgolly.awsSdk.awsSdkStrings.pt_BR
    - typingsJapgolly.awsSdk.awsSdkStrings.default_
    - java.lang.String
  */
  type LocaleType = typingsJapgolly.awsSdk.workdocsMod._LocaleType | java.lang.String
  type MarkerType = java.lang.String
  type MessageType = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ASCENDING
    - typingsJapgolly.awsSdk.awsSdkStrings.DESCENDING
    - java.lang.String
  */
  type OrderType = typingsJapgolly.awsSdk.workdocsMod._OrderType | java.lang.String
  type OrganizationUserList = js.Array[typingsJapgolly.awsSdk.workdocsMod.User]
  type PageMarkerType = java.lang.String
  type PasswordType = java.lang.String
  type PermissionInfoList = js.Array[typingsJapgolly.awsSdk.workdocsMod.PermissionInfo]
  type PositiveIntegerType = scala.Double
  type PositiveSizeType = scala.Double
  type PrincipalList = js.Array[typingsJapgolly.awsSdk.workdocsMod.Principal]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.USER
    - typingsJapgolly.awsSdk.awsSdkStrings.GROUP
    - typingsJapgolly.awsSdk.awsSdkStrings.INVITE
    - typingsJapgolly.awsSdk.awsSdkStrings.ANONYMOUS
    - typingsJapgolly.awsSdk.awsSdkStrings.ORGANIZATION
    - java.lang.String
  */
  type PrincipalType = typingsJapgolly.awsSdk.workdocsMod._PrincipalType | java.lang.String
  type ResourceCollectionType = typingsJapgolly.awsSdk.awsSdkStrings.SHARED_WITH_ME | java.lang.String
  type ResourceIdType = java.lang.String
  type ResourceNameType = java.lang.String
  type ResourcePathComponentList = js.Array[typingsJapgolly.awsSdk.workdocsMod.ResourcePathComponent]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.DATE
    - typingsJapgolly.awsSdk.awsSdkStrings.NAME
    - java.lang.String
  */
  type ResourceSortType = typingsJapgolly.awsSdk.workdocsMod._ResourceSortType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE
    - typingsJapgolly.awsSdk.awsSdkStrings.RESTORING
    - typingsJapgolly.awsSdk.awsSdkStrings.RECYCLING
    - typingsJapgolly.awsSdk.awsSdkStrings.RECYCLED
    - java.lang.String
  */
  type ResourceStateType = typingsJapgolly.awsSdk.workdocsMod._ResourceStateType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.FOLDER
    - typingsJapgolly.awsSdk.awsSdkStrings.DOCUMENT
    - java.lang.String
  */
  type ResourceType = typingsJapgolly.awsSdk.workdocsMod._ResourceType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.DIRECT
    - typingsJapgolly.awsSdk.awsSdkStrings.INHERITED
    - java.lang.String
  */
  type RolePermissionType = typingsJapgolly.awsSdk.workdocsMod._RolePermissionType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.VIEWER
    - typingsJapgolly.awsSdk.awsSdkStrings.CONTRIBUTOR
    - typingsJapgolly.awsSdk.awsSdkStrings.OWNER
    - typingsJapgolly.awsSdk.awsSdkStrings.COOWNER
    - java.lang.String
  */
  type RoleType = typingsJapgolly.awsSdk.workdocsMod._RoleType | java.lang.String
  type SearchQueryType = java.lang.String
  type SharePrincipalList = js.Array[typingsJapgolly.awsSdk.workdocsMod.SharePrincipal]
  type ShareResultsList = js.Array[typingsJapgolly.awsSdk.workdocsMod.ShareResult]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.SUCCESS
    - typingsJapgolly.awsSdk.awsSdkStrings.FAILURE
    - java.lang.String
  */
  type ShareStatusType = typingsJapgolly.awsSdk.workdocsMod._ShareStatusType | java.lang.String
  type SharedLabel = java.lang.String
  type SharedLabels = js.Array[typingsJapgolly.awsSdk.workdocsMod.SharedLabel]
  type SignedHeaderMap = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.workdocsMod.HeaderValueType]
  type SizeType = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.UNLIMITED
    - typingsJapgolly.awsSdk.awsSdkStrings.QUOTA
    - java.lang.String
  */
  type StorageType = typingsJapgolly.awsSdk.workdocsMod._StorageType | java.lang.String
  type SubscriptionEndPointType = java.lang.String
  type SubscriptionList = js.Array[typingsJapgolly.awsSdk.workdocsMod.Subscription]
  type SubscriptionProtocolType = typingsJapgolly.awsSdk.awsSdkStrings.HTTPS | java.lang.String
  type SubscriptionType = typingsJapgolly.awsSdk.awsSdkStrings.ALL | java.lang.String
  type TimeZoneIdType = java.lang.String
  type TimestampType = js.Date
  type UrlType = java.lang.String
  type UserActivities = js.Array[typingsJapgolly.awsSdk.workdocsMod.Activity]
  type UserAttributeValueType = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ALL
    - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE_PENDING
    - java.lang.String
  */
  type UserFilterType = typingsJapgolly.awsSdk.workdocsMod._UserFilterType | java.lang.String
  type UserIdsType = java.lang.String
  type UserMetadataList = js.Array[typingsJapgolly.awsSdk.workdocsMod.UserMetadata]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.USER_NAME
    - typingsJapgolly.awsSdk.awsSdkStrings.FULL_NAME
    - typingsJapgolly.awsSdk.awsSdkStrings.STORAGE_LIMIT
    - typingsJapgolly.awsSdk.awsSdkStrings.USER_STATUS
    - typingsJapgolly.awsSdk.awsSdkStrings.STORAGE_USED
    - java.lang.String
  */
  type UserSortType = typingsJapgolly.awsSdk.workdocsMod._UserSortType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE
    - typingsJapgolly.awsSdk.awsSdkStrings.INACTIVE
    - typingsJapgolly.awsSdk.awsSdkStrings.PENDING
    - java.lang.String
  */
  type UserStatusType = typingsJapgolly.awsSdk.workdocsMod._UserStatusType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.USER
    - typingsJapgolly.awsSdk.awsSdkStrings.ADMIN
    - typingsJapgolly.awsSdk.awsSdkStrings.POWERUSER
    - typingsJapgolly.awsSdk.awsSdkStrings.MINIMALUSER
    - typingsJapgolly.awsSdk.awsSdkStrings.WORKSPACESUSER
    - java.lang.String
  */
  type UserType = typingsJapgolly.awsSdk.workdocsMod._UserType | java.lang.String
  type UsernameType = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`2016-05-01`
    - typingsJapgolly.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsJapgolly.awsSdk.workdocsMod._apiVersion | java.lang.String
}
