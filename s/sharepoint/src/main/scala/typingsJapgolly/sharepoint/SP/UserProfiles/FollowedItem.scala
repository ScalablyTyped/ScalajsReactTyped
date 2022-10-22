package typingsJapgolly.sharepoint.SP.UserProfiles

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.sharepoint.SP.ClientValueObject
import typingsJapgolly.sharepoint.SP.Guid
import typingsJapgolly.sharepoint.SP.SerializationContext
import typingsJapgolly.sharepoint.SP.XmlWriter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a followed content resource. */
trait FollowedItem
  extends StObject
     with ClientValueObject {
  
  /** Additional metadata associated with this item */
  def get_data(): StringDictionary[Any]
  
  /** Specifies the type of the file if this item is a file. Otherwise, this property is the empty string. */
  def get_fileType(): String
  
  /** Provides information about the application that opens a followed document. */
  def get_fileTypeProgid(): String
  
  /** Specifies additional information about the followed item.
    The server stores the data so that it can return it to the client. */
  def get_flags(): String
  
  /** Indicates whether the followed site has a feed. */
  def get_hasFeed(): Boolean
  
  /** Specifies if the item is hidden from the user. If true this item will not generate activity in the user's feed. */
  def get_hidden(): Boolean
  
  /** Specifies the URL of an icon to represent this item. */
  def get_iconUrl(): String
  
  /** Specifies the identification for this item in the Content database. */
  def get_itemId(): Double
  
  /** Specifies the type of this item. */
  def get_itemType(): FollowedItemType
  
  /** The ListId property specifies the list identification (GUID) for this item in the Content database if this item is a list or the list identification for its parent list.
    If the ItemType is Document, this property is specified, but if the ItemType is Site, then this property is not specified. */
  def get_listId(): String
  
  /** Specifies the URL of this item's parent list or web. */
  def get_parentUrl(): String
  
  /** Provides information about the followed document to the application that opens it. */
  def get_serverUrlProgid(): String
  
  /** Specifies the site identification (GUID) in the Content database for this item if this item is a site, or for its parent site if this item is not a site. */
  def get_siteId(): String
  
  /** Specifies the subtype of this item.
    If the ItemType is Site, the Subtype specifies the web template identification.
    If the ItemType is Document, the Subtype has a value of 1. */
  def get_subtype(): Double
  
  /** Specifies the item of this item */
  def get_title(): String
  
  /** Specifies the GUID for this item in the Content database. */
  def get_uniqueId(): Guid
  
  /** Specifies the URL of this item. */
  def get_url(): String
  
  /** Specifies the site identification (GUID) in the Content database for this item if it is a site, or the identification of its parent site if this item is a document. */
  def get_webId(): Guid
  
  /** Additional metadata associated with this item */
  def set_data(value: StringDictionary[Any]): StringDictionary[Any]
  
  /** Specifies the type of the file if this item is a file. Otherwise, this property is the empty string. */
  def set_fileType(value: String): String
  
  /** Provides information about the application that opens a followed document. */
  def set_fileTypeProgid(value: String): String
  
  /** Specifies additional information about the followed item.
    The server stores the data so that it can return it to the client. */
  def set_flags(value: String): String
  
  /** Indicates whether the followed site has a feed. */
  def set_hasFeed(value: Boolean): Boolean
  
  /** Specifies if the item is hidden from the user. If true this item will not generate activity in the user's feed. */
  def set_hidden(value: Boolean): Boolean
  
  /** Specifies the URL of an icon to represent this item. */
  def set_iconUrl(value: String): String
  
  /** Specifies the identification for this item in the Content database. */
  def set_itemId(value: Double): Double
  
  /** Specifies the type of this item. */
  def set_itemType(value: FollowedItemType): FollowedItemType
  
  /** The ListId property specifies the list identification (GUID) for this item in the Content database if this item is a list or the list identification for its parent list.
    If the ItemType is Document, this property is specified, but if the ItemType is Site, then this property is not specified. */
  def set_listId(value: String): String
  
  /** Specifies the URL of this item's parent list or web. */
  def set_parentUrl(value: String): String
  
  /** Provides information about the followed document to the application that opens it. */
  def set_serverUrlProgid(value: String): String
  
  /** Specifies the site identification (GUID) in the Content database for this item if this item is a site, or for its parent site if this item is not a site. */
  def set_siteId(value: String): String
  
  /** Specifies the subtype of this item.
    If the ItemType is Site, the Subtype specifies the web template identification.
    If the ItemType is Document, the Subtype has a value of 1. */
  def set_subtype(value: Double): Double
  
  /** Specifies the item of this item */
  def set_title(value: String): String
  
  /** Specifies the GUID for this item in the Content database. */
  def set_uniqueId(value: Guid): Guid
  
  /** Specifies the URL of this item. */
  def set_url(value: String): String
  
  /** Specifies the site identification (GUID) in the Content database for this item if it is a site, or the identification of its parent site if this item is a document. */
  def set_webId(value: Guid): Any
}
object FollowedItem {
  
  inline def apply(
    customFromJson: Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: Any => Callback,
    get_data: CallbackTo[StringDictionary[Any]],
    get_fileType: CallbackTo[String],
    get_fileTypeProgid: CallbackTo[String],
    get_flags: CallbackTo[String],
    get_hasFeed: CallbackTo[Boolean],
    get_hidden: CallbackTo[Boolean],
    get_iconUrl: CallbackTo[String],
    get_itemId: CallbackTo[Double],
    get_itemType: CallbackTo[FollowedItemType],
    get_listId: CallbackTo[String],
    get_parentUrl: CallbackTo[String],
    get_serverUrlProgid: CallbackTo[String],
    get_siteId: CallbackTo[String],
    get_subtype: CallbackTo[Double],
    get_title: CallbackTo[String],
    get_typeId: CallbackTo[String],
    get_uniqueId: CallbackTo[Guid],
    get_url: CallbackTo[String],
    get_webId: CallbackTo[Guid],
    set_data: StringDictionary[Any] => StringDictionary[Any],
    set_fileType: String => String,
    set_fileTypeProgid: String => String,
    set_flags: String => String,
    set_hasFeed: Boolean => Boolean,
    set_hidden: Boolean => Boolean,
    set_iconUrl: String => String,
    set_itemId: Double => Double,
    set_itemType: FollowedItemType => FollowedItemType,
    set_listId: String => String,
    set_parentUrl: String => String,
    set_serverUrlProgid: String => String,
    set_siteId: String => String,
    set_subtype: Double => Double,
    set_title: String => String,
    set_uniqueId: Guid => Guid,
    set_url: String => String,
    set_webId: Guid => Any,
    writeToXml: (XmlWriter, SerializationContext) => Callback
  ): FollowedItem = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1((t0: Any) => fromJson(t0).runNow()), get_data = get_data.toJsFn, get_fileType = get_fileType.toJsFn, get_fileTypeProgid = get_fileTypeProgid.toJsFn, get_flags = get_flags.toJsFn, get_hasFeed = get_hasFeed.toJsFn, get_hidden = get_hidden.toJsFn, get_iconUrl = get_iconUrl.toJsFn, get_itemId = get_itemId.toJsFn, get_itemType = get_itemType.toJsFn, get_listId = get_listId.toJsFn, get_parentUrl = get_parentUrl.toJsFn, get_serverUrlProgid = get_serverUrlProgid.toJsFn, get_siteId = get_siteId.toJsFn, get_subtype = get_subtype.toJsFn, get_title = get_title.toJsFn, get_typeId = get_typeId.toJsFn, get_uniqueId = get_uniqueId.toJsFn, get_url = get_url.toJsFn, get_webId = get_webId.toJsFn, set_data = js.Any.fromFunction1(set_data), set_fileType = js.Any.fromFunction1(set_fileType), set_fileTypeProgid = js.Any.fromFunction1(set_fileTypeProgid), set_flags = js.Any.fromFunction1(set_flags), set_hasFeed = js.Any.fromFunction1(set_hasFeed), set_hidden = js.Any.fromFunction1(set_hidden), set_iconUrl = js.Any.fromFunction1(set_iconUrl), set_itemId = js.Any.fromFunction1(set_itemId), set_itemType = js.Any.fromFunction1(set_itemType), set_listId = js.Any.fromFunction1(set_listId), set_parentUrl = js.Any.fromFunction1(set_parentUrl), set_serverUrlProgid = js.Any.fromFunction1(set_serverUrlProgid), set_siteId = js.Any.fromFunction1(set_siteId), set_subtype = js.Any.fromFunction1(set_subtype), set_title = js.Any.fromFunction1(set_title), set_uniqueId = js.Any.fromFunction1(set_uniqueId), set_url = js.Any.fromFunction1(set_url), set_webId = js.Any.fromFunction1(set_webId), writeToXml = js.Any.fromFunction2((t0: XmlWriter, t1: SerializationContext) => (writeToXml(t0, t1)).runNow()))
    __obj.asInstanceOf[FollowedItem]
  }
  
  extension [Self <: FollowedItem](x: Self) {
    
    inline def setGet_data(value: CallbackTo[StringDictionary[Any]]): Self = StObject.set(x, "get_data", value.toJsFn)
    
    inline def setGet_fileType(value: CallbackTo[String]): Self = StObject.set(x, "get_fileType", value.toJsFn)
    
    inline def setGet_fileTypeProgid(value: CallbackTo[String]): Self = StObject.set(x, "get_fileTypeProgid", value.toJsFn)
    
    inline def setGet_flags(value: CallbackTo[String]): Self = StObject.set(x, "get_flags", value.toJsFn)
    
    inline def setGet_hasFeed(value: CallbackTo[Boolean]): Self = StObject.set(x, "get_hasFeed", value.toJsFn)
    
    inline def setGet_hidden(value: CallbackTo[Boolean]): Self = StObject.set(x, "get_hidden", value.toJsFn)
    
    inline def setGet_iconUrl(value: CallbackTo[String]): Self = StObject.set(x, "get_iconUrl", value.toJsFn)
    
    inline def setGet_itemId(value: CallbackTo[Double]): Self = StObject.set(x, "get_itemId", value.toJsFn)
    
    inline def setGet_itemType(value: CallbackTo[FollowedItemType]): Self = StObject.set(x, "get_itemType", value.toJsFn)
    
    inline def setGet_listId(value: CallbackTo[String]): Self = StObject.set(x, "get_listId", value.toJsFn)
    
    inline def setGet_parentUrl(value: CallbackTo[String]): Self = StObject.set(x, "get_parentUrl", value.toJsFn)
    
    inline def setGet_serverUrlProgid(value: CallbackTo[String]): Self = StObject.set(x, "get_serverUrlProgid", value.toJsFn)
    
    inline def setGet_siteId(value: CallbackTo[String]): Self = StObject.set(x, "get_siteId", value.toJsFn)
    
    inline def setGet_subtype(value: CallbackTo[Double]): Self = StObject.set(x, "get_subtype", value.toJsFn)
    
    inline def setGet_title(value: CallbackTo[String]): Self = StObject.set(x, "get_title", value.toJsFn)
    
    inline def setGet_uniqueId(value: CallbackTo[Guid]): Self = StObject.set(x, "get_uniqueId", value.toJsFn)
    
    inline def setGet_url(value: CallbackTo[String]): Self = StObject.set(x, "get_url", value.toJsFn)
    
    inline def setGet_webId(value: CallbackTo[Guid]): Self = StObject.set(x, "get_webId", value.toJsFn)
    
    inline def setSet_data(value: StringDictionary[Any] => StringDictionary[Any]): Self = StObject.set(x, "set_data", js.Any.fromFunction1(value))
    
    inline def setSet_fileType(value: String => String): Self = StObject.set(x, "set_fileType", js.Any.fromFunction1(value))
    
    inline def setSet_fileTypeProgid(value: String => String): Self = StObject.set(x, "set_fileTypeProgid", js.Any.fromFunction1(value))
    
    inline def setSet_flags(value: String => String): Self = StObject.set(x, "set_flags", js.Any.fromFunction1(value))
    
    inline def setSet_hasFeed(value: Boolean => Boolean): Self = StObject.set(x, "set_hasFeed", js.Any.fromFunction1(value))
    
    inline def setSet_hidden(value: Boolean => Boolean): Self = StObject.set(x, "set_hidden", js.Any.fromFunction1(value))
    
    inline def setSet_iconUrl(value: String => String): Self = StObject.set(x, "set_iconUrl", js.Any.fromFunction1(value))
    
    inline def setSet_itemId(value: Double => Double): Self = StObject.set(x, "set_itemId", js.Any.fromFunction1(value))
    
    inline def setSet_itemType(value: FollowedItemType => FollowedItemType): Self = StObject.set(x, "set_itemType", js.Any.fromFunction1(value))
    
    inline def setSet_listId(value: String => String): Self = StObject.set(x, "set_listId", js.Any.fromFunction1(value))
    
    inline def setSet_parentUrl(value: String => String): Self = StObject.set(x, "set_parentUrl", js.Any.fromFunction1(value))
    
    inline def setSet_serverUrlProgid(value: String => String): Self = StObject.set(x, "set_serverUrlProgid", js.Any.fromFunction1(value))
    
    inline def setSet_siteId(value: String => String): Self = StObject.set(x, "set_siteId", js.Any.fromFunction1(value))
    
    inline def setSet_subtype(value: Double => Double): Self = StObject.set(x, "set_subtype", js.Any.fromFunction1(value))
    
    inline def setSet_title(value: String => String): Self = StObject.set(x, "set_title", js.Any.fromFunction1(value))
    
    inline def setSet_uniqueId(value: Guid => Guid): Self = StObject.set(x, "set_uniqueId", js.Any.fromFunction1(value))
    
    inline def setSet_url(value: String => String): Self = StObject.set(x, "set_url", js.Any.fromFunction1(value))
    
    inline def setSet_webId(value: Guid => Any): Self = StObject.set(x, "set_webId", js.Any.fromFunction1(value))
  }
}
