package typingsJapgolly.googleAdwordsScripts

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// User Lists
trait UserList extends js.Object {
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
  @scala.inline
  def apply(
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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("close")(close.toJsFn)
    __obj.updateDynamic("excludedAdGroups")(excludedAdGroups.toJsFn)
    __obj.updateDynamic("excludedCampaigns")(excludedCampaigns.toJsFn)
    __obj.updateDynamic("getDescription")(getDescription.toJsFn)
    __obj.updateDynamic("getId")(getId.toJsFn)
    __obj.updateDynamic("getMembershipLifeSpan")(getMembershipLifeSpan.toJsFn)
    __obj.updateDynamic("getName")(getName.toJsFn)
    __obj.updateDynamic("getSizeForDisplay")(getSizeForDisplay.toJsFn)
    __obj.updateDynamic("getSizeForSearch")(getSizeForSearch.toJsFn)
    __obj.updateDynamic("getSizeRangeForDisplay")(getSizeRangeForDisplay.toJsFn)
    __obj.updateDynamic("getSizeRangeForSearch")(getSizeRangeForSearch.toJsFn)
    __obj.updateDynamic("getType")(getType.toJsFn)
    __obj.updateDynamic("isClosed")(isClosed.toJsFn)
    __obj.updateDynamic("isEligibleForDisplay")(isEligibleForDisplay.toJsFn)
    __obj.updateDynamic("isEligibleForSearch")(isEligibleForSearch.toJsFn)
    __obj.updateDynamic("isOpen")(isOpen.toJsFn)
    __obj.updateDynamic("isReadOnly")(isReadOnly.toJsFn)
    __obj.updateDynamic("open")(open.toJsFn)
    __obj.updateDynamic("setDescription")(js.Any.fromFunction1((t0: java.lang.String) => setDescription(t0).runNow()))
    __obj.updateDynamic("setMembershipLifeSpan")(js.Any.fromFunction1((t0: scala.Double) => setMembershipLifeSpan(t0).runNow()))
    __obj.updateDynamic("setName")(js.Any.fromFunction1((t0: java.lang.String) => setName(t0).runNow()))
    __obj.updateDynamic("targetedAdGroups")(targetedAdGroups.toJsFn)
    __obj.updateDynamic("targetedCampaigns")(targetedCampaigns.toJsFn)
    __obj.asInstanceOf[UserList]
  }
}

