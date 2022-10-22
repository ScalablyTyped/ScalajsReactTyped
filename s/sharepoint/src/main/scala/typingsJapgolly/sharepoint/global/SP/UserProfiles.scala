package typingsJapgolly.sharepoint.global.SP

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.sharepoint.SP.UserProfiles.FollowResultType
import typingsJapgolly.sharepoint.SP.UserProfiles.FollowedItemType
import typingsJapgolly.sharepoint.SP.UserProfiles.HashTagCollection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object UserProfiles {
  
  /** Specifies types of changes made in the user profile store. */
  @JSGlobal("SP.UserProfiles.ChangeTypes")
  @js.native
  object ChangeTypes extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.sharepoint.SP.UserProfiles.ChangeTypes & Double] = js.native
    
    /* 1 */ val add: typingsJapgolly.sharepoint.SP.UserProfiles.ChangeTypes.add & Double = js.native
    
    /* 5 */ val all: typingsJapgolly.sharepoint.SP.UserProfiles.ChangeTypes.all & Double = js.native
    
    /* 4 */ val metadata: typingsJapgolly.sharepoint.SP.UserProfiles.ChangeTypes.metadata & Double = js.native
    
    /* 2 */ val modify: typingsJapgolly.sharepoint.SP.UserProfiles.ChangeTypes.modify & Double = js.native
    
    /* 0 */ val none: typingsJapgolly.sharepoint.SP.UserProfiles.ChangeTypes.none & Double = js.native
    
    /* 3 */ val remove: typingsJapgolly.sharepoint.SP.UserProfiles.ChangeTypes.remove & Double = js.native
  }
  
  /** Returns information about a request to follow an item. */
  @JSGlobal("SP.UserProfiles.FollowResult")
  @js.native
  open class FollowResult ()
    extends StObject
       with typingsJapgolly.sharepoint.SP.UserProfiles.FollowResult {
    
    /* CompleteClass */
    override def customFromJson(obj: Any): Boolean = js.native
    
    /* CompleteClass */
    override def customWriteToXml(
      writer: typingsJapgolly.sharepoint.SP.XmlWriter,
      serializationContext: typingsJapgolly.sharepoint.SP.SerializationContext
    ): Boolean = js.native
    
    /* CompleteClass */
    override def fromJson(obj: Any): Unit = js.native
    
    /** Contains the item being followed. */
    /* CompleteClass */
    override def get_item(): typingsJapgolly.sharepoint.SP.UserProfiles.FollowedItem = js.native
    
    /** Provides information about the attempt to follow an item. */
    /* CompleteClass */
    override def get_resultType(): FollowResultType = js.native
    
    /* CompleteClass */
    override def get_typeId(): String = js.native
    
    /* CompleteClass */
    override def writeToXml(
      writer: typingsJapgolly.sharepoint.SP.XmlWriter,
      serializationContext: typingsJapgolly.sharepoint.SP.SerializationContext
    ): Unit = js.native
  }
  
  @JSGlobal("SP.UserProfiles.FollowResultType")
  @js.native
  object FollowResultType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.sharepoint.SP.UserProfiles.FollowResultType & Double] = js.native
    
    /* 4 */ val failed: typingsJapgolly.sharepoint.SP.UserProfiles.FollowResultType.failed & Double = js.native
    
    /* 1 */ val followed: typingsJapgolly.sharepoint.SP.UserProfiles.FollowResultType.followed & Double = js.native
    
    /* 3 */ val hitFollowLimit: typingsJapgolly.sharepoint.SP.UserProfiles.FollowResultType.hitFollowLimit & Double = js.native
    
    /* 2 */ val refollowed: typingsJapgolly.sharepoint.SP.UserProfiles.FollowResultType.refollowed & Double = js.native
    
    /* 0 */ val unknown: typingsJapgolly.sharepoint.SP.UserProfiles.FollowResultType.unknown & Double = js.native
  }
  
  /** Provides access to followed content items. */
  @JSGlobal("SP.UserProfiles.FollowedContent")
  @js.native
  open class FollowedContent protected ()
    extends StObject
       with typingsJapgolly.sharepoint.SP.UserProfiles.FollowedContent {
    def this(context: typingsJapgolly.sharepoint.SP.ClientRuntimeContext) = this()
  }
  object FollowedContent {
    
    @JSGlobal("SP.UserProfiles.FollowedContent")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def newObject(context: typingsJapgolly.sharepoint.SP.ClientRuntimeContext): typingsJapgolly.sharepoint.SP.UserProfiles.FollowedContent = ^.asInstanceOf[js.Dynamic].applyDynamic("newObject")(context.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.sharepoint.SP.UserProfiles.FollowedContent]
  }
  
  @JSGlobal("SP.UserProfiles.FollowedContentExceptionType")
  @js.native
  object FollowedContentExceptionType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.sharepoint.SP.UserProfiles.FollowedContentExceptionType & Double] = js.native
    
    /* 5 */ val followLimitReached: typingsJapgolly.sharepoint.SP.UserProfiles.FollowedContentExceptionType.followLimitReached & Double = js.native
    
    /* 8 */ val internalError: typingsJapgolly.sharepoint.SP.UserProfiles.FollowedContentExceptionType.internalError & Double = js.native
    
    /* 2 */ val invalidQueryString: typingsJapgolly.sharepoint.SP.UserProfiles.FollowedContentExceptionType.invalidQueryString & Double = js.native
    
    /* 3 */ val invalidSubtypeValue: typingsJapgolly.sharepoint.SP.UserProfiles.FollowedContentExceptionType.invalidSubtypeValue & Double = js.native
    
    /* 0 */ val itemAlreadyExists: typingsJapgolly.sharepoint.SP.UserProfiles.FollowedContentExceptionType.itemAlreadyExists & Double = js.native
    
    /* 1 */ val itemDoesNotExist: typingsJapgolly.sharepoint.SP.UserProfiles.FollowedContentExceptionType.itemDoesNotExist & Double = js.native
    
    /* 4 */ val unsupportedItemType: typingsJapgolly.sharepoint.SP.UserProfiles.FollowedContentExceptionType.unsupportedItemType & Double = js.native
    
    /* 7 */ val unsupportedSite: typingsJapgolly.sharepoint.SP.UserProfiles.FollowedContentExceptionType.unsupportedSite & Double = js.native
    
    /* 6 */ val untrustedSource: typingsJapgolly.sharepoint.SP.UserProfiles.FollowedContentExceptionType.untrustedSource & Double = js.native
  }
  
  @JSGlobal("SP.UserProfiles.FollowedContentQueryOptions")
  @js.native
  object FollowedContentQueryOptions extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.sharepoint.SP.UserProfiles.FollowedContentQueryOptions & Double] = js.native
    
    /* 6 */ val all: typingsJapgolly.sharepoint.SP.UserProfiles.FollowedContentQueryOptions.all & Double = js.native
    
    /* 5 */ val defaultOptions: typingsJapgolly.sharepoint.SP.UserProfiles.FollowedContentQueryOptions.defaultOptions & Double = js.native
    
    /* 2 */ val documents: typingsJapgolly.sharepoint.SP.UserProfiles.FollowedContentQueryOptions.documents & Double = js.native
    
    /* 3 */ val hidden: typingsJapgolly.sharepoint.SP.UserProfiles.FollowedContentQueryOptions.hidden & Double = js.native
    
    /* 4 */ val nonFeed: typingsJapgolly.sharepoint.SP.UserProfiles.FollowedContentQueryOptions.nonFeed & Double = js.native
    
    /* 1 */ val sites: typingsJapgolly.sharepoint.SP.UserProfiles.FollowedContentQueryOptions.sites & Double = js.native
    
    /* 0 */ val unset: typingsJapgolly.sharepoint.SP.UserProfiles.FollowedContentQueryOptions.unset & Double = js.native
  }
  
  /** Represents a followed content resource. */
  @JSGlobal("SP.UserProfiles.FollowedItem")
  @js.native
  open class FollowedItem ()
    extends StObject
       with typingsJapgolly.sharepoint.SP.UserProfiles.FollowedItem {
    
    /* CompleteClass */
    override def customFromJson(obj: Any): Boolean = js.native
    
    /* CompleteClass */
    override def customWriteToXml(
      writer: typingsJapgolly.sharepoint.SP.XmlWriter,
      serializationContext: typingsJapgolly.sharepoint.SP.SerializationContext
    ): Boolean = js.native
    
    /* CompleteClass */
    override def fromJson(obj: Any): Unit = js.native
    
    /** Additional metadata associated with this item */
    /* CompleteClass */
    override def get_data(): StringDictionary[Any] = js.native
    
    /** Specifies the type of the file if this item is a file. Otherwise, this property is the empty string. */
    /* CompleteClass */
    override def get_fileType(): String = js.native
    
    /** Provides information about the application that opens a followed document. */
    /* CompleteClass */
    override def get_fileTypeProgid(): String = js.native
    
    /** Specifies additional information about the followed item.
      The server stores the data so that it can return it to the client. */
    /* CompleteClass */
    override def get_flags(): String = js.native
    
    /** Indicates whether the followed site has a feed. */
    /* CompleteClass */
    override def get_hasFeed(): Boolean = js.native
    
    /** Specifies if the item is hidden from the user. If true this item will not generate activity in the user's feed. */
    /* CompleteClass */
    override def get_hidden(): Boolean = js.native
    
    /** Specifies the URL of an icon to represent this item. */
    /* CompleteClass */
    override def get_iconUrl(): String = js.native
    
    /** Specifies the identification for this item in the Content database. */
    /* CompleteClass */
    override def get_itemId(): Double = js.native
    
    /** Specifies the type of this item. */
    /* CompleteClass */
    override def get_itemType(): FollowedItemType = js.native
    
    /** The ListId property specifies the list identification (GUID) for this item in the Content database if this item is a list or the list identification for its parent list.
      If the ItemType is Document, this property is specified, but if the ItemType is Site, then this property is not specified. */
    /* CompleteClass */
    override def get_listId(): String = js.native
    
    /** Specifies the URL of this item's parent list or web. */
    /* CompleteClass */
    override def get_parentUrl(): String = js.native
    
    /** Provides information about the followed document to the application that opens it. */
    /* CompleteClass */
    override def get_serverUrlProgid(): String = js.native
    
    /** Specifies the site identification (GUID) in the Content database for this item if this item is a site, or for its parent site if this item is not a site. */
    /* CompleteClass */
    override def get_siteId(): String = js.native
    
    /** Specifies the subtype of this item.
      If the ItemType is Site, the Subtype specifies the web template identification.
      If the ItemType is Document, the Subtype has a value of 1. */
    /* CompleteClass */
    override def get_subtype(): Double = js.native
    
    /** Specifies the item of this item */
    /* CompleteClass */
    override def get_title(): String = js.native
    
    /* CompleteClass */
    override def get_typeId(): String = js.native
    
    /** Specifies the GUID for this item in the Content database. */
    /* CompleteClass */
    override def get_uniqueId(): typingsJapgolly.sharepoint.SP.Guid = js.native
    
    /** Specifies the URL of this item. */
    /* CompleteClass */
    override def get_url(): String = js.native
    
    /** Specifies the site identification (GUID) in the Content database for this item if it is a site, or the identification of its parent site if this item is a document. */
    /* CompleteClass */
    override def get_webId(): typingsJapgolly.sharepoint.SP.Guid = js.native
    
    /** Additional metadata associated with this item */
    /* CompleteClass */
    override def set_data(value: StringDictionary[Any]): StringDictionary[Any] = js.native
    
    /** Specifies the type of the file if this item is a file. Otherwise, this property is the empty string. */
    /* CompleteClass */
    override def set_fileType(value: String): String = js.native
    
    /** Provides information about the application that opens a followed document. */
    /* CompleteClass */
    override def set_fileTypeProgid(value: String): String = js.native
    
    /** Specifies additional information about the followed item.
      The server stores the data so that it can return it to the client. */
    /* CompleteClass */
    override def set_flags(value: String): String = js.native
    
    /** Indicates whether the followed site has a feed. */
    /* CompleteClass */
    override def set_hasFeed(value: Boolean): Boolean = js.native
    
    /** Specifies if the item is hidden from the user. If true this item will not generate activity in the user's feed. */
    /* CompleteClass */
    override def set_hidden(value: Boolean): Boolean = js.native
    
    /** Specifies the URL of an icon to represent this item. */
    /* CompleteClass */
    override def set_iconUrl(value: String): String = js.native
    
    /** Specifies the identification for this item in the Content database. */
    /* CompleteClass */
    override def set_itemId(value: Double): Double = js.native
    
    /** Specifies the type of this item. */
    /* CompleteClass */
    override def set_itemType(value: FollowedItemType): FollowedItemType = js.native
    
    /** The ListId property specifies the list identification (GUID) for this item in the Content database if this item is a list or the list identification for its parent list.
      If the ItemType is Document, this property is specified, but if the ItemType is Site, then this property is not specified. */
    /* CompleteClass */
    override def set_listId(value: String): String = js.native
    
    /** Specifies the URL of this item's parent list or web. */
    /* CompleteClass */
    override def set_parentUrl(value: String): String = js.native
    
    /** Provides information about the followed document to the application that opens it. */
    /* CompleteClass */
    override def set_serverUrlProgid(value: String): String = js.native
    
    /** Specifies the site identification (GUID) in the Content database for this item if this item is a site, or for its parent site if this item is not a site. */
    /* CompleteClass */
    override def set_siteId(value: String): String = js.native
    
    /** Specifies the subtype of this item.
      If the ItemType is Site, the Subtype specifies the web template identification.
      If the ItemType is Document, the Subtype has a value of 1. */
    /* CompleteClass */
    override def set_subtype(value: Double): Double = js.native
    
    /** Specifies the item of this item */
    /* CompleteClass */
    override def set_title(value: String): String = js.native
    
    /** Specifies the GUID for this item in the Content database. */
    /* CompleteClass */
    override def set_uniqueId(value: typingsJapgolly.sharepoint.SP.Guid): typingsJapgolly.sharepoint.SP.Guid = js.native
    
    /** Specifies the URL of this item. */
    /* CompleteClass */
    override def set_url(value: String): String = js.native
    
    /** Specifies the site identification (GUID) in the Content database for this item if it is a site, or the identification of its parent site if this item is a document. */
    /* CompleteClass */
    override def set_webId(value: typingsJapgolly.sharepoint.SP.Guid): Any = js.native
    
    /* CompleteClass */
    override def writeToXml(
      writer: typingsJapgolly.sharepoint.SP.XmlWriter,
      serializationContext: typingsJapgolly.sharepoint.SP.SerializationContext
    ): Unit = js.native
  }
  
  /** Contains additional data that can be attached to a FollowedItem object */
  @JSGlobal("SP.UserProfiles.FollowedItemData")
  @js.native
  open class FollowedItemData ()
    extends StObject
       with typingsJapgolly.sharepoint.SP.UserProfiles.FollowedItemData
  
  @JSGlobal("SP.UserProfiles.FollowedItemType")
  @js.native
  object FollowedItemType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.sharepoint.SP.UserProfiles.FollowedItemType & Double] = js.native
    
    /* 3 */ val all: typingsJapgolly.sharepoint.SP.UserProfiles.FollowedItemType.all & Double = js.native
    
    /* 1 */ val document: typingsJapgolly.sharepoint.SP.UserProfiles.FollowedItemType.document & Double = js.native
    
    /* 2 */ val site: typingsJapgolly.sharepoint.SP.UserProfiles.FollowedItemType.site & Double = js.native
    
    /* 0 */ val unknown: typingsJapgolly.sharepoint.SP.UserProfiles.FollowedItemType.unknown & Double = js.native
  }
  
  @JSGlobal("SP.UserProfiles.FollowedStatus")
  @js.native
  object FollowedStatus extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.sharepoint.SP.UserProfiles.FollowedStatus & Double] = js.native
    
    /* 0 */ val followed: typingsJapgolly.sharepoint.SP.UserProfiles.FollowedStatus.followed & Double = js.native
    
    /* 2 */ val notFollowable: typingsJapgolly.sharepoint.SP.UserProfiles.FollowedStatus.notFollowable & Double = js.native
    
    /* 1 */ val notFollowed: typingsJapgolly.sharepoint.SP.UserProfiles.FollowedStatus.notFollowed & Double = js.native
  }
  
  @JSGlobal("SP.UserProfiles.HashTag")
  @js.native
  open class HashTag ()
    extends StObject
       with typingsJapgolly.sharepoint.SP.UserProfiles.HashTag {
    
    /* CompleteClass */
    override def customFromJson(obj: Any): Boolean = js.native
    
    /* CompleteClass */
    override def customWriteToXml(
      writer: typingsJapgolly.sharepoint.SP.XmlWriter,
      serializationContext: typingsJapgolly.sharepoint.SP.SerializationContext
    ): Boolean = js.native
    
    /* CompleteClass */
    override def fromJson(obj: Any): Unit = js.native
    
    /* CompleteClass */
    override def get_name(): String = js.native
    
    /* CompleteClass */
    override def get_typeId(): String = js.native
    
    /* CompleteClass */
    override def get_useCount(): Double = js.native
    
    /* CompleteClass */
    override def writeToXml(
      writer: typingsJapgolly.sharepoint.SP.XmlWriter,
      serializationContext: typingsJapgolly.sharepoint.SP.SerializationContext
    ): Unit = js.native
  }
  
  /** Specifies types of user-related objects that can be changed in the user profile store. */
  @JSGlobal("SP.UserProfiles.ObjectTypes")
  @js.native
  object ObjectTypes extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.sharepoint.SP.UserProfiles.ObjectTypes & Double] = js.native
    
    /* 14 */ val all: typingsJapgolly.sharepoint.SP.UserProfiles.ObjectTypes.all & Double = js.native
    
    /* 3 */ val anniversary: typingsJapgolly.sharepoint.SP.UserProfiles.ObjectTypes.anniversary & Double = js.native
    
    /* 7 */ val colleague: typingsJapgolly.sharepoint.SP.UserProfiles.ObjectTypes.colleague & Double = js.native
    
    /* 11 */ val custom: typingsJapgolly.sharepoint.SP.UserProfiles.ObjectTypes.custom & Double = js.native
    
    /* 4 */ val dlMembership: typingsJapgolly.sharepoint.SP.UserProfiles.ObjectTypes.dlMembership & Double = js.native
    
    /* 2 */ val multiValueProperty: typingsJapgolly.sharepoint.SP.UserProfiles.ObjectTypes.multiValueProperty & Double = js.native
    
    /* 0 */ val none: typingsJapgolly.sharepoint.SP.UserProfiles.ObjectTypes.none & Double = js.native
    
    /* 13 */ val organizationMembership: typingsJapgolly.sharepoint.SP.UserProfiles.ObjectTypes.organizationMembership & Double = js.native
    
    /* 12 */ val organizationProfile: typingsJapgolly.sharepoint.SP.UserProfiles.ObjectTypes.organizationProfile & Double = js.native
    
    /* 8 */ val personalizationSite: typingsJapgolly.sharepoint.SP.UserProfiles.ObjectTypes.personalizationSite & Double = js.native
    
    /* 6 */ val quickLink: typingsJapgolly.sharepoint.SP.UserProfiles.ObjectTypes.quickLink & Double = js.native
    
    /* 1 */ val singleValueProperty: typingsJapgolly.sharepoint.SP.UserProfiles.ObjectTypes.singleValueProperty & Double = js.native
    
    /* 5 */ val siteMembership: typingsJapgolly.sharepoint.SP.UserProfiles.ObjectTypes.siteMembership & Double = js.native
    
    /* 9 */ val userProfile: typingsJapgolly.sharepoint.SP.UserProfiles.ObjectTypes.userProfile & Double = js.native
    
    /* 10 */ val webLog: typingsJapgolly.sharepoint.SP.UserProfiles.ObjectTypes.webLog & Double = js.native
  }
  
  /** Provides methods for operations related to people.
    Note: The SocialFollowingManager object is the recommended object for performing Following People and Following Content tasks.
    However, PeopleManager provides some methods that SocialFollowingManager doesn't. */
  @JSGlobal("SP.UserProfiles.PeopleManager")
  @js.native
  open class PeopleManager protected ()
    extends StObject
       with typingsJapgolly.sharepoint.SP.UserProfiles.PeopleManager {
    def this(context: typingsJapgolly.sharepoint.SP.ClientRuntimeContext) = this()
  }
  object PeopleManager {
    
    @JSGlobal("SP.UserProfiles.PeopleManager")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def getTrendingTags(context: typingsJapgolly.sharepoint.SP.ClientRuntimeContext): HashTagCollection = ^.asInstanceOf[js.Dynamic].applyDynamic("getTrendingTags")(context.asInstanceOf[js.Any]).asInstanceOf[HashTagCollection]
    
    /** Checks whether the first user is following the second user. */
    /* static member */
    inline def isFollowing(
      context: typingsJapgolly.sharepoint.SP.ClientRuntimeContext,
      possibleFollowerAccountName: String,
      possibleFolloweeAccountName: String
    ): typingsJapgolly.sharepoint.SP.BooleanResult = (^.asInstanceOf[js.Dynamic].applyDynamic("isFollowing")(context.asInstanceOf[js.Any], possibleFollowerAccountName.asInstanceOf[js.Any], possibleFolloweeAccountName.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.sharepoint.SP.BooleanResult]
  }
  
  /** Represents user properties. */
  @JSGlobal("SP.UserProfiles.PersonProperties")
  @js.native
  open class PersonProperties ()
    extends StObject
       with typingsJapgolly.sharepoint.SP.UserProfiles.PersonProperties
  
  /** Specifies the capabilities of a personal site. */
  @JSGlobal("SP.UserProfiles.PersonalSiteCapabilities")
  @js.native
  object PersonalSiteCapabilities extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.sharepoint.SP.UserProfiles.PersonalSiteCapabilities & Double] = js.native
    
    /* 5 */ val education: typingsJapgolly.sharepoint.SP.UserProfiles.PersonalSiteCapabilities.education & Double = js.native
    
    /* 6 */ val guest: typingsJapgolly.sharepoint.SP.UserProfiles.PersonalSiteCapabilities.guest & Double = js.native
    
    /* 4 */ val myTasksDashboard: typingsJapgolly.sharepoint.SP.UserProfiles.PersonalSiteCapabilities.myTasksDashboard & Double = js.native
    
    /* 0 */ val none: typingsJapgolly.sharepoint.SP.UserProfiles.PersonalSiteCapabilities.none & Double = js.native
    
    /* 1 */ val profile: typingsJapgolly.sharepoint.SP.UserProfiles.PersonalSiteCapabilities.profile & Double = js.native
    
    /* 2 */ val social: typingsJapgolly.sharepoint.SP.UserProfiles.PersonalSiteCapabilities.social & Double = js.native
    
    /* 3 */ val storage: typingsJapgolly.sharepoint.SP.UserProfiles.PersonalSiteCapabilities.storage & Double = js.native
  }
  
  /** Specifies an exception or status code for the state of a personal site instantiation. */
  @JSGlobal("SP.UserProfiles.PersonalSiteInstantiationState")
  @js.native
  object PersonalSiteInstantiationState extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.sharepoint.SP.UserProfiles.PersonalSiteInstantiationState & Double
      ] = js.native
    
    /* 2 */ val created: typingsJapgolly.sharepoint.SP.UserProfiles.PersonalSiteInstantiationState.created & Double = js.native
    
    /* 3 */ val deleted: typingsJapgolly.sharepoint.SP.UserProfiles.PersonalSiteInstantiationState.deleted & Double = js.native
    
    /* 1 */ val enqueued: typingsJapgolly.sharepoint.SP.UserProfiles.PersonalSiteInstantiationState.enqueued & Double = js.native
    
    /* 11 */ val errorGeneralFailure: typingsJapgolly.sharepoint.SP.UserProfiles.PersonalSiteInstantiationState.errorGeneralFailure & Double = js.native
    
    /* 13 */ val errorLanguageNotInstalled: typingsJapgolly.sharepoint.SP.UserProfiles.PersonalSiteInstantiationState.errorLanguageNotInstalled & Double = js.native
    
    /* 12 */ val errorManagedPathDoesNotExist: typingsJapgolly.sharepoint.SP.UserProfiles.PersonalSiteInstantiationState.errorManagedPathDoesNotExist & Double = js.native
    
    /* 14 */ val errorPartialCreate: typingsJapgolly.sharepoint.SP.UserProfiles.PersonalSiteInstantiationState.errorPartialCreate & Double = js.native
    
    /* 15 */ val errorPersonalSiteAlreadyExists: typingsJapgolly.sharepoint.SP.UserProfiles.PersonalSiteInstantiationState.errorPersonalSiteAlreadyExists & Double = js.native
    
    /* 16 */ val errorRootSiteNotPresent: typingsJapgolly.sharepoint.SP.UserProfiles.PersonalSiteInstantiationState.errorRootSiteNotPresent & Double = js.native
    
    /* 17 */ val errorSelfServiceSiteCreateCallFailed: typingsJapgolly.sharepoint.SP.UserProfiles.PersonalSiteInstantiationState.errorSelfServiceSiteCreateCallFailed & Double = js.native
    
    /* 9 */ val permissionsEmptyHostUrl: typingsJapgolly.sharepoint.SP.UserProfiles.PersonalSiteInstantiationState.permissionsEmptyHostUrl & Double = js.native
    
    /* 4 */ val permissionsGeneralFailure: typingsJapgolly.sharepoint.SP.UserProfiles.PersonalSiteInstantiationState.permissionsGeneralFailure & Double = js.native
    
    /* 10 */ val permissionsHostFailedToInitializePersonalSiteContext: typingsJapgolly.sharepoint.SP.UserProfiles.PersonalSiteInstantiationState.permissionsHostFailedToInitializePersonalSiteContext & Double = js.native
    
    /* 8 */ val permissionsNoMySitesInPeopleLight: typingsJapgolly.sharepoint.SP.UserProfiles.PersonalSiteInstantiationState.permissionsNoMySitesInPeopleLight & Double = js.native
    
    /* 7 */ val permissionsSelfServiceSiteCreationDisabled: typingsJapgolly.sharepoint.SP.UserProfiles.PersonalSiteInstantiationState.permissionsSelfServiceSiteCreationDisabled & Double = js.native
    
    /* 5 */ val permissionsUPANotGranted: typingsJapgolly.sharepoint.SP.UserProfiles.PersonalSiteInstantiationState.permissionsUPANotGranted & Double = js.native
    
    /* 6 */ val permissionsUserNotLicensed: typingsJapgolly.sharepoint.SP.UserProfiles.PersonalSiteInstantiationState.permissionsUserNotLicensed & Double = js.native
    
    /* 0 */ val uninitialized: typingsJapgolly.sharepoint.SP.UserProfiles.PersonalSiteInstantiationState.uninitialized & Double = js.native
  }
  
  /** Provides an alternate entry point to user profiles rather than calling methods directly. */
  @JSGlobal("SP.UserProfiles.ProfileLoader")
  @js.native
  open class ProfileLoader ()
    extends StObject
       with typingsJapgolly.sharepoint.SP.UserProfiles.ProfileLoader
  object ProfileLoader {
    
    @JSGlobal("SP.UserProfiles.ProfileLoader")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def getProfileLoader(context: typingsJapgolly.sharepoint.SP.ClientRuntimeContext): typingsJapgolly.sharepoint.SP.UserProfiles.ProfileLoader = ^.asInstanceOf[js.Dynamic].applyDynamic("getProfileLoader")(context.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.sharepoint.SP.UserProfiles.ProfileLoader]
  }
  
  @JSGlobal("SP.UserProfiles.SocialDataStoreExceptionCode")
  @js.native
  object SocialDataStoreExceptionCode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.sharepoint.SP.UserProfiles.SocialDataStoreExceptionCode & Double] = js.native
    
    /* 2 */ val cannotCreatePersonalSite: typingsJapgolly.sharepoint.SP.UserProfiles.SocialDataStoreExceptionCode.cannotCreatePersonalSite & Double = js.native
    
    /* 3 */ val noSocialFeatures: typingsJapgolly.sharepoint.SP.UserProfiles.SocialDataStoreExceptionCode.noSocialFeatures & Double = js.native
    
    /* 1 */ val personalSiteNotFound: typingsJapgolly.sharepoint.SP.UserProfiles.SocialDataStoreExceptionCode.personalSiteNotFound & Double = js.native
    
    /* 0 */ val socialListNotFound: typingsJapgolly.sharepoint.SP.UserProfiles.SocialDataStoreExceptionCode.socialListNotFound & Double = js.native
  }
  
  /** Represents a client-side user profile for a person.
    Note: The client-side UserProfile object provides methods you can use to create a personal site for the current user.
    However, it does not contain the user properties that the server-side UserProfile object contains.
    To access user properties from client-side code, use PeopleManager */
  @JSGlobal("SP.UserProfiles.UserProfile")
  @js.native
  open class UserProfile ()
    extends StObject
       with typingsJapgolly.sharepoint.SP.UserProfiles.UserProfile
  
  /** Represents a set of user profile properties for a specified user. */
  @JSGlobal("SP.UserProfiles.UserProfilePropertiesForUser")
  @js.native
  open class UserProfilePropertiesForUser protected ()
    extends StObject
       with typingsJapgolly.sharepoint.SP.UserProfiles.UserProfilePropertiesForUser {
    /** Creates new UserProfilePropertiesForUser object
      @param context Specifies the client context to use.
      @param accountName Specifies the user by account name.
      @param propertyNames Specifies an array of strings that specify the properties to retrieve. */
    def this(
      context: typingsJapgolly.sharepoint.SP.ClientContext,
      accountName: String,
      propertyNames: js.Array[String]
    ) = this()
  }
}
