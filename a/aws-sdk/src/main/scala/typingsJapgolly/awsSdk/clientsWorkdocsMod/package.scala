package typingsJapgolly.awsSdk.clientsWorkdocsMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE
import typingsJapgolly.awsSdk.awsSdkStrings.ALL
import typingsJapgolly.awsSdk.awsSdkStrings.HTTPS
import typingsJapgolly.awsSdk.awsSdkStrings.SHARED_WITH_ME
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type ActivityNamesFilterType = String

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
type ActivityType = _ActivityType | String

type AuthenticationHeaderType = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.TRUE
  - typingsJapgolly.awsSdk.awsSdkStrings.FALSE
  - java.lang.String
*/
type BooleanEnumType = _BooleanEnumType | String

type BooleanType = Boolean

type CommentIdType = String

type CommentList = js.Array[Comment]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.DRAFT
  - typingsJapgolly.awsSdk.awsSdkStrings.PUBLISHED
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETED
  - java.lang.String
*/
type CommentStatusType = _CommentStatusType | String

type CommentTextType = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.PUBLIC
  - typingsJapgolly.awsSdk.awsSdkStrings.PRIVATE
  - java.lang.String
*/
type CommentVisibilityType = _CommentVisibilityType | String

type CustomMetadataKeyList = js.Array[CustomMetadataKeyType]

type CustomMetadataKeyType = String

type CustomMetadataMap = StringDictionary[CustomMetadataValueType]

type CustomMetadataValueType = String

type DocumentContentType = String

type DocumentMetadataList = js.Array[DocumentMetadata]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ORIGINAL
  - typingsJapgolly.awsSdk.awsSdkStrings.WITH_COMMENTS
  - java.lang.String
*/
type DocumentSourceType = _DocumentSourceType | String

type DocumentSourceUrlMap = StringDictionary[UrlType]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.INITIALIZED
  - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE
  - java.lang.String
*/
type DocumentStatusType = _DocumentStatusType | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.SMALL
  - typingsJapgolly.awsSdk.awsSdkStrings.SMALL_HQ
  - typingsJapgolly.awsSdk.awsSdkStrings.LARGE
  - java.lang.String
*/
type DocumentThumbnailType = _DocumentThumbnailType | String

type DocumentThumbnailUrlMap = StringDictionary[UrlType]

type DocumentVersionIdType = String

type DocumentVersionMetadataList = js.Array[DocumentVersionMetadata]

type DocumentVersionStatus = ACTIVE | String

type EmailAddressType = String

type FieldNamesType = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ALL
  - typingsJapgolly.awsSdk.awsSdkStrings.DOCUMENT
  - typingsJapgolly.awsSdk.awsSdkStrings.FOLDER
  - java.lang.String
*/
type FolderContentType = _FolderContentType | String

type FolderMetadataList = js.Array[FolderMetadata]

type GroupMetadataList = js.Array[GroupMetadata]

type GroupNameType = String

type HashType = String

type HeaderNameType = String

type HeaderValueType = String

type IdType = String

type LimitType = Double

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.en_
  - typingsJapgolly.awsSdk.awsSdkStrings.fr_
  - typingsJapgolly.awsSdk.awsSdkStrings.ko_
  - typingsJapgolly.awsSdk.awsSdkStrings.de_
  - typingsJapgolly.awsSdk.awsSdkStrings.es_
  - typingsJapgolly.awsSdk.awsSdkStrings.ja_
  - typingsJapgolly.awsSdk.awsSdkStrings.ru_
  - typingsJapgolly.awsSdk.awsSdkStrings.zh_CN_
  - typingsJapgolly.awsSdk.awsSdkStrings.zh_TW_
  - typingsJapgolly.awsSdk.awsSdkStrings.pt_BR_
  - typingsJapgolly.awsSdk.awsSdkStrings.default__
  - java.lang.String
*/
type LocaleType = _LocaleType | String

type MarkerType = String

type MessageType = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ASCENDING
  - typingsJapgolly.awsSdk.awsSdkStrings.DESCENDING
  - java.lang.String
*/
type OrderType = _OrderType | String

type OrganizationUserList = js.Array[User]

type PageMarkerType = String

type PasswordType = String

type PermissionInfoList = js.Array[PermissionInfo]

type PositiveIntegerType = Double

type PositiveSizeType = Double

type PrincipalList = js.Array[Principal]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.USER
  - typingsJapgolly.awsSdk.awsSdkStrings.GROUP
  - typingsJapgolly.awsSdk.awsSdkStrings.INVITE
  - typingsJapgolly.awsSdk.awsSdkStrings.ANONYMOUS
  - typingsJapgolly.awsSdk.awsSdkStrings.ORGANIZATION
  - java.lang.String
*/
type PrincipalType = _PrincipalType | String

type ResourceCollectionType = SHARED_WITH_ME | String

type ResourceIdType = String

type ResourceNameType = String

type ResourcePathComponentList = js.Array[ResourcePathComponent]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.DATE
  - typingsJapgolly.awsSdk.awsSdkStrings.NAME
  - java.lang.String
*/
type ResourceSortType = _ResourceSortType | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE
  - typingsJapgolly.awsSdk.awsSdkStrings.RESTORING
  - typingsJapgolly.awsSdk.awsSdkStrings.RECYCLING
  - typingsJapgolly.awsSdk.awsSdkStrings.RECYCLED
  - java.lang.String
*/
type ResourceStateType = _ResourceStateType | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.FOLDER
  - typingsJapgolly.awsSdk.awsSdkStrings.DOCUMENT
  - java.lang.String
*/
type ResourceType = _ResourceType | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.DIRECT
  - typingsJapgolly.awsSdk.awsSdkStrings.INHERITED
  - java.lang.String
*/
type RolePermissionType = _RolePermissionType | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.VIEWER
  - typingsJapgolly.awsSdk.awsSdkStrings.CONTRIBUTOR
  - typingsJapgolly.awsSdk.awsSdkStrings.OWNER
  - typingsJapgolly.awsSdk.awsSdkStrings.COOWNER
  - java.lang.String
*/
type RoleType = _RoleType | String

type SearchQueryType = String

type SharePrincipalList = js.Array[SharePrincipal]

type ShareResultsList = js.Array[ShareResult]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.SUCCESS
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILURE
  - java.lang.String
*/
type ShareStatusType = _ShareStatusType | String

type SharedLabel = String

type SharedLabels = js.Array[SharedLabel]

type SignedHeaderMap = StringDictionary[HeaderValueType]

type SizeType = Double

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.UNLIMITED
  - typingsJapgolly.awsSdk.awsSdkStrings.QUOTA
  - java.lang.String
*/
type StorageType = _StorageType | String

type SubscriptionEndPointType = String

type SubscriptionList = js.Array[Subscription]

type SubscriptionProtocolType = HTTPS | String

type SubscriptionType = ALL | String

type TimeZoneIdType = String

type TimestampType = js.Date

type UrlType = String

type UserActivities = js.Array[Activity]

type UserAttributeValueType = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ALL
  - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE_PENDING
  - java.lang.String
*/
type UserFilterType = _UserFilterType | String

type UserIdsType = String

type UserMetadataList = js.Array[UserMetadata]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.USER_NAME
  - typingsJapgolly.awsSdk.awsSdkStrings.FULL_NAME
  - typingsJapgolly.awsSdk.awsSdkStrings.STORAGE_LIMIT
  - typingsJapgolly.awsSdk.awsSdkStrings.USER_STATUS
  - typingsJapgolly.awsSdk.awsSdkStrings.STORAGE_USED
  - java.lang.String
*/
type UserSortType = _UserSortType | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE
  - typingsJapgolly.awsSdk.awsSdkStrings.INACTIVE
  - typingsJapgolly.awsSdk.awsSdkStrings.PENDING
  - java.lang.String
*/
type UserStatusType = _UserStatusType | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.USER
  - typingsJapgolly.awsSdk.awsSdkStrings.ADMIN
  - typingsJapgolly.awsSdk.awsSdkStrings.POWERUSER
  - typingsJapgolly.awsSdk.awsSdkStrings.MINIMALUSER
  - typingsJapgolly.awsSdk.awsSdkStrings.WORKSPACESUSER
  - java.lang.String
*/
type UserType = _UserType | String

type UsernameType = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.`2016-05-01`
  - typingsJapgolly.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | String
