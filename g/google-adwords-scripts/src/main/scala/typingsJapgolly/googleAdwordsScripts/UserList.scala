package typingsJapgolly.googleAdwordsScripts

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// User Lists
trait UserList extends StObject {
  
  def close(): Unit
  
  def excludedAdGroups(): AdWordsSelector[AdGroup]
  
  def excludedCampaigns(): AdWordsSelector[Campaign]
  
  def getDescription(): String
  
  def getId(): Double
  
  def getMembershipLifeSpan(): Double
  
  def getName(): String
  
  def getSizeForDisplay(): Double
  
  def getSizeForSearch(): Double
  
  def getSizeRangeForDisplay(): UserListSizeRange
  
  def getSizeRangeForSearch(): UserListSizeRange
  
  def getType(): UserListType
  
  def isClosed(): Boolean
  
  def isEligibleForDisplay(): Boolean
  
  def isEligibleForSearch(): Boolean
  
  def isOpen(): Boolean
  
  def isReadOnly(): Boolean
  
  def open(): Unit
  
  def setDescription(description: String): Unit
  
  def setMembershipLifeSpan(membershipLifeSpan: Double): Unit
  
  def setName(name: String): Unit
  
  def targetedAdGroups(): AdWordsSelector[AdGroup]
  
  def targetedCampaigns(): AdWordsSelector[Campaign]
}
object UserList {
  
  inline def apply(
    close: Callback,
    excludedAdGroups: CallbackTo[AdWordsSelector[AdGroup]],
    excludedCampaigns: CallbackTo[AdWordsSelector[Campaign]],
    getDescription: CallbackTo[String],
    getId: CallbackTo[Double],
    getMembershipLifeSpan: CallbackTo[Double],
    getName: CallbackTo[String],
    getSizeForDisplay: CallbackTo[Double],
    getSizeForSearch: CallbackTo[Double],
    getSizeRangeForDisplay: CallbackTo[UserListSizeRange],
    getSizeRangeForSearch: CallbackTo[UserListSizeRange],
    getType: CallbackTo[UserListType],
    isClosed: CallbackTo[Boolean],
    isEligibleForDisplay: CallbackTo[Boolean],
    isEligibleForSearch: CallbackTo[Boolean],
    isOpen: CallbackTo[Boolean],
    isReadOnly: CallbackTo[Boolean],
    open: Callback,
    setDescription: String => Callback,
    setMembershipLifeSpan: Double => Callback,
    setName: String => Callback,
    targetedAdGroups: CallbackTo[AdWordsSelector[AdGroup]],
    targetedCampaigns: CallbackTo[AdWordsSelector[Campaign]]
  ): UserList = {
    val __obj = js.Dynamic.literal(close = close.toJsFn, excludedAdGroups = excludedAdGroups.toJsFn, excludedCampaigns = excludedCampaigns.toJsFn, getDescription = getDescription.toJsFn, getId = getId.toJsFn, getMembershipLifeSpan = getMembershipLifeSpan.toJsFn, getName = getName.toJsFn, getSizeForDisplay = getSizeForDisplay.toJsFn, getSizeForSearch = getSizeForSearch.toJsFn, getSizeRangeForDisplay = getSizeRangeForDisplay.toJsFn, getSizeRangeForSearch = getSizeRangeForSearch.toJsFn, getType = getType.toJsFn, isClosed = isClosed.toJsFn, isEligibleForDisplay = isEligibleForDisplay.toJsFn, isEligibleForSearch = isEligibleForSearch.toJsFn, isOpen = isOpen.toJsFn, isReadOnly = isReadOnly.toJsFn, open = open.toJsFn, setDescription = js.Any.fromFunction1((t0: String) => setDescription(t0).runNow()), setMembershipLifeSpan = js.Any.fromFunction1((t0: Double) => setMembershipLifeSpan(t0).runNow()), setName = js.Any.fromFunction1((t0: String) => setName(t0).runNow()), targetedAdGroups = targetedAdGroups.toJsFn, targetedCampaigns = targetedCampaigns.toJsFn)
    __obj.asInstanceOf[UserList]
  }
  
  extension [Self <: UserList](x: Self) {
    
    inline def setClose(value: Callback): Self = StObject.set(x, "close", value.toJsFn)
    
    inline def setExcludedAdGroups(value: CallbackTo[AdWordsSelector[AdGroup]]): Self = StObject.set(x, "excludedAdGroups", value.toJsFn)
    
    inline def setExcludedCampaigns(value: CallbackTo[AdWordsSelector[Campaign]]): Self = StObject.set(x, "excludedCampaigns", value.toJsFn)
    
    inline def setGetDescription(value: CallbackTo[String]): Self = StObject.set(x, "getDescription", value.toJsFn)
    
    inline def setGetId(value: CallbackTo[Double]): Self = StObject.set(x, "getId", value.toJsFn)
    
    inline def setGetMembershipLifeSpan(value: CallbackTo[Double]): Self = StObject.set(x, "getMembershipLifeSpan", value.toJsFn)
    
    inline def setGetName(value: CallbackTo[String]): Self = StObject.set(x, "getName", value.toJsFn)
    
    inline def setGetSizeForDisplay(value: CallbackTo[Double]): Self = StObject.set(x, "getSizeForDisplay", value.toJsFn)
    
    inline def setGetSizeForSearch(value: CallbackTo[Double]): Self = StObject.set(x, "getSizeForSearch", value.toJsFn)
    
    inline def setGetSizeRangeForDisplay(value: CallbackTo[UserListSizeRange]): Self = StObject.set(x, "getSizeRangeForDisplay", value.toJsFn)
    
    inline def setGetSizeRangeForSearch(value: CallbackTo[UserListSizeRange]): Self = StObject.set(x, "getSizeRangeForSearch", value.toJsFn)
    
    inline def setGetType(value: CallbackTo[UserListType]): Self = StObject.set(x, "getType", value.toJsFn)
    
    inline def setIsClosed(value: CallbackTo[Boolean]): Self = StObject.set(x, "isClosed", value.toJsFn)
    
    inline def setIsEligibleForDisplay(value: CallbackTo[Boolean]): Self = StObject.set(x, "isEligibleForDisplay", value.toJsFn)
    
    inline def setIsEligibleForSearch(value: CallbackTo[Boolean]): Self = StObject.set(x, "isEligibleForSearch", value.toJsFn)
    
    inline def setIsOpen(value: CallbackTo[Boolean]): Self = StObject.set(x, "isOpen", value.toJsFn)
    
    inline def setIsReadOnly(value: CallbackTo[Boolean]): Self = StObject.set(x, "isReadOnly", value.toJsFn)
    
    inline def setOpen(value: Callback): Self = StObject.set(x, "open", value.toJsFn)
    
    inline def setSetDescription(value: String => Callback): Self = StObject.set(x, "setDescription", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSetMembershipLifeSpan(value: Double => Callback): Self = StObject.set(x, "setMembershipLifeSpan", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetName(value: String => Callback): Self = StObject.set(x, "setName", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setTargetedAdGroups(value: CallbackTo[AdWordsSelector[AdGroup]]): Self = StObject.set(x, "targetedAdGroups", value.toJsFn)
    
    inline def setTargetedCampaigns(value: CallbackTo[AdWordsSelector[Campaign]]): Self = StObject.set(x, "targetedCampaigns", value.toJsFn)
  }
}
