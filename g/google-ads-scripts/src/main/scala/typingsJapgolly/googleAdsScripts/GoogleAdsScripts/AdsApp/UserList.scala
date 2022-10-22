package typingsJapgolly.googleAdsScripts.GoogleAdsScripts.AdsApp

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a Google Ads user list. */
trait UserList extends StObject {
  
  /** Close user list so it will no longer accumulate new members. */
  def close(): Unit
  
  /** Returns a selector of all the search ad groups negatively targeting this user list. */
  def excludedAdGroups(): AdGroupSelector
  
  /** Returns a selector of all the search campaigns negatively targeting this user list. */
  def excludedCampaigns(): CampaignSelector
  
  /** Returns the description of the user list. */
  def getDescription(): String
  
  /** Returns the type of this entity as a String, in this case, "UserList". */
  def getEntityType(): String
  
  /** Returns the ID of the user list. */
  def getId(): Double
  
  /** Returns the number of days a user's cookie stays on your list since its most recent addition to the list. */
  def getMembershipLifeSpan(): Double
  
  /** Returns the name of the user list. */
  def getName(): String
  
  /** Estimated number of users in this user list, on the Google Display Network. */
  def getSizeForDisplay(): Double
  
  /** Estimated number of users in this user list in the google.com domain. */
  def getSizeForSearch(): Double
  
  /** Size range in terms of number of users of the UserList for ads on Google Display Network. */
  def getSizeRangeForDisplay(): String
  
  /** Size range in terms of number of users of the UserList, for Search ads. */
  def getSizeRangeForSearch(): String
  
  /** Type of this list: remarketing/logical/external remarketing. */
  def getType(): String
  
  /** Is the user list closed to new members being added. */
  def isClosed(): Boolean
  
  /** Is the user list eligible for display campaigns/ad groups. */
  def isEligibleForDisplay(): Boolean
  
  /** Is the user list eligible for search campaigns/ad groups. */
  def isEligibleForSearch(): Boolean
  
  /** Is the user list accruing new members. */
  def isOpen(): Boolean
  
  /** Is the user list read only. */
  def isReadOnly(): Boolean
  
  /** Open user list to accrue new members. */
  def open(): Unit
  
  /** Sets the description of the user list. */
  def setDescription(description: String): Unit
  
  /** Sets the number of days a user's cookie stays on your list since its most recent addition to the list. */
  def setMembershipLifeSpan(membershipLifeSpan: Double): Unit
  
  /** Sets the name of the user list. */
  def setName(name: String): Unit
  
  /** Returns a selector of all the search ad groups targeting this user list. */
  def targetedAdGroups(): AdGroupSelector
  
  /** Returns a selector of all the search campaigns targeting this user list. */
  def targetedCampaigns(): CampaignSelector
}
object UserList {
  
  inline def apply(
    close: Callback,
    excludedAdGroups: CallbackTo[AdGroupSelector],
    excludedCampaigns: CallbackTo[CampaignSelector],
    getDescription: CallbackTo[String],
    getEntityType: CallbackTo[String],
    getId: CallbackTo[Double],
    getMembershipLifeSpan: CallbackTo[Double],
    getName: CallbackTo[String],
    getSizeForDisplay: CallbackTo[Double],
    getSizeForSearch: CallbackTo[Double],
    getSizeRangeForDisplay: CallbackTo[String],
    getSizeRangeForSearch: CallbackTo[String],
    getType: CallbackTo[String],
    isClosed: CallbackTo[Boolean],
    isEligibleForDisplay: CallbackTo[Boolean],
    isEligibleForSearch: CallbackTo[Boolean],
    isOpen: CallbackTo[Boolean],
    isReadOnly: CallbackTo[Boolean],
    open: Callback,
    setDescription: String => Callback,
    setMembershipLifeSpan: Double => Callback,
    setName: String => Callback,
    targetedAdGroups: CallbackTo[AdGroupSelector],
    targetedCampaigns: CallbackTo[CampaignSelector]
  ): UserList = {
    val __obj = js.Dynamic.literal(close = close.toJsFn, excludedAdGroups = excludedAdGroups.toJsFn, excludedCampaigns = excludedCampaigns.toJsFn, getDescription = getDescription.toJsFn, getEntityType = getEntityType.toJsFn, getId = getId.toJsFn, getMembershipLifeSpan = getMembershipLifeSpan.toJsFn, getName = getName.toJsFn, getSizeForDisplay = getSizeForDisplay.toJsFn, getSizeForSearch = getSizeForSearch.toJsFn, getSizeRangeForDisplay = getSizeRangeForDisplay.toJsFn, getSizeRangeForSearch = getSizeRangeForSearch.toJsFn, getType = getType.toJsFn, isClosed = isClosed.toJsFn, isEligibleForDisplay = isEligibleForDisplay.toJsFn, isEligibleForSearch = isEligibleForSearch.toJsFn, isOpen = isOpen.toJsFn, isReadOnly = isReadOnly.toJsFn, open = open.toJsFn, setDescription = js.Any.fromFunction1((t0: String) => setDescription(t0).runNow()), setMembershipLifeSpan = js.Any.fromFunction1((t0: Double) => setMembershipLifeSpan(t0).runNow()), setName = js.Any.fromFunction1((t0: String) => setName(t0).runNow()), targetedAdGroups = targetedAdGroups.toJsFn, targetedCampaigns = targetedCampaigns.toJsFn)
    __obj.asInstanceOf[UserList]
  }
  
  extension [Self <: UserList](x: Self) {
    
    inline def setClose(value: Callback): Self = StObject.set(x, "close", value.toJsFn)
    
    inline def setExcludedAdGroups(value: CallbackTo[AdGroupSelector]): Self = StObject.set(x, "excludedAdGroups", value.toJsFn)
    
    inline def setExcludedCampaigns(value: CallbackTo[CampaignSelector]): Self = StObject.set(x, "excludedCampaigns", value.toJsFn)
    
    inline def setGetDescription(value: CallbackTo[String]): Self = StObject.set(x, "getDescription", value.toJsFn)
    
    inline def setGetEntityType(value: CallbackTo[String]): Self = StObject.set(x, "getEntityType", value.toJsFn)
    
    inline def setGetId(value: CallbackTo[Double]): Self = StObject.set(x, "getId", value.toJsFn)
    
    inline def setGetMembershipLifeSpan(value: CallbackTo[Double]): Self = StObject.set(x, "getMembershipLifeSpan", value.toJsFn)
    
    inline def setGetName(value: CallbackTo[String]): Self = StObject.set(x, "getName", value.toJsFn)
    
    inline def setGetSizeForDisplay(value: CallbackTo[Double]): Self = StObject.set(x, "getSizeForDisplay", value.toJsFn)
    
    inline def setGetSizeForSearch(value: CallbackTo[Double]): Self = StObject.set(x, "getSizeForSearch", value.toJsFn)
    
    inline def setGetSizeRangeForDisplay(value: CallbackTo[String]): Self = StObject.set(x, "getSizeRangeForDisplay", value.toJsFn)
    
    inline def setGetSizeRangeForSearch(value: CallbackTo[String]): Self = StObject.set(x, "getSizeRangeForSearch", value.toJsFn)
    
    inline def setGetType(value: CallbackTo[String]): Self = StObject.set(x, "getType", value.toJsFn)
    
    inline def setIsClosed(value: CallbackTo[Boolean]): Self = StObject.set(x, "isClosed", value.toJsFn)
    
    inline def setIsEligibleForDisplay(value: CallbackTo[Boolean]): Self = StObject.set(x, "isEligibleForDisplay", value.toJsFn)
    
    inline def setIsEligibleForSearch(value: CallbackTo[Boolean]): Self = StObject.set(x, "isEligibleForSearch", value.toJsFn)
    
    inline def setIsOpen(value: CallbackTo[Boolean]): Self = StObject.set(x, "isOpen", value.toJsFn)
    
    inline def setIsReadOnly(value: CallbackTo[Boolean]): Self = StObject.set(x, "isReadOnly", value.toJsFn)
    
    inline def setOpen(value: Callback): Self = StObject.set(x, "open", value.toJsFn)
    
    inline def setSetDescription(value: String => Callback): Self = StObject.set(x, "setDescription", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSetMembershipLifeSpan(value: Double => Callback): Self = StObject.set(x, "setMembershipLifeSpan", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetName(value: String => Callback): Self = StObject.set(x, "setName", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setTargetedAdGroups(value: CallbackTo[AdGroupSelector]): Self = StObject.set(x, "targetedAdGroups", value.toJsFn)
    
    inline def setTargetedCampaigns(value: CallbackTo[CampaignSelector]): Self = StObject.set(x, "targetedCampaigns", value.toJsFn)
  }
}
