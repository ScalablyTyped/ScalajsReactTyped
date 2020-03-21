package typingsJapgolly.titanium.Titanium.App.iOS

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.titanium.Titanium.Proxy
import typingsJapgolly.titanium.Titanium.UI.TabGroup
import typingsJapgolly.titanium.Titanium.UI.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
			 * The UserActivity module is used to enable device Handoff and to create User Activities.
			 */
trait UserActivity extends Proxy {
  /**
  				 * Name of the activity type.
  				 */
  var activityType: String
  /**
  				 * Set to true if this user activity should be eligible to be handed off to another device
  				 */
  var eligibleForHandoff: Boolean
  /**
  				 * A Boolean value that determines whether Siri can suggest the user activity as a shortcut to the user.
  				 */
  var eligibleForPrediction: Boolean
  /**
  				 * Set to `true` if the user activity can be publicly accessed by all iOS users.
  				 */
  var eligibleForPublicIndexing: Boolean
  /**
  				 * Set to true if the user activity should be added to the on-device index.
  				 */
  var eligibleForSearch: Boolean
  /**
  				 * Absolute date after which the activity is no longer eligible to be indexed or handed off.
  				 */
  var expirationDate: String
  /**
  				 * An array of string keywords representing words or phrases that might help the user to find the activity in the application history.
  				 */
  var keywords: js.Array[String]
  /**
  				 * Set to true everytime you have updated the user activity and need the changes to be saved before handing it off to another device.
  				 */
  var needsSave: Boolean
  /**
  				 * A value used to identify the user activity.
  				 */
  var persistentIdentifier: String
  /**
  				 * An array of String keys from the userInfo property which represent the minimal information about the user activity that should be stored for later restoration.
  				 */
  var requiredUserInfoKeys: js.Array[String]
  /**
  				 * Determines if user activities are supported (`true`) or not (`false`) by the device.
  				 */
  var supported: Boolean
  /**
  				 * An optional, user-visible title for this activity such as a document name or web page title.
  				 */
  var title: String
  /**
  				 * The userInfo dictionary contains application-specific state needed to continue an activity on another device.
  				 */
  var userInfo: js.Any
  /**
  				 * When no suitable application is installed on a resuming device and the `webpageURL` property is set,
  				 * the user activity will instead be continued in a web browser by loading the specified URL.
  				 */
  var webpageURL: String
  /**
  				 * Adds a Titanium.App.iOS.SearchableItemAttributeSet to the user activity.
  				 */
  def addContentAttributeSet(contentAttributeSet: SearchableItemAttributeSet): Unit
  /**
  				 * Marks the activity as currently in use by the user.
  				 */
  def becomeCurrent(): Unit
  /**
  				 * Deletes all user activities created by your app.
  				 */
  def deleteAllSavedUserActivities(): Unit
  /**
  				 * Deletes user activities created by your app that have the specified persistent identifiers.
  				 */
  def deleteSavedUserActivitiesForPersistentIdentifiers(persistentIdentifiers: js.Array[String]): Unit
  /**
  				 * Gets the value of the <Titanium.App.iOS.UserActivity.activityType> property.
  				 */
  def getActivityType(): String
  /**
  				 * Gets the value of the <Titanium.App.iOS.UserActivity.eligibleForHandoff> property.
  				 */
  def getEligibleForHandoff(): Boolean
  /**
  				 * Gets the value of the <Titanium.App.iOS.UserActivity.eligibleForPrediction> property.
  				 */
  def getEligibleForPrediction(): Boolean
  /**
  				 * Gets the value of the <Titanium.App.iOS.UserActivity.eligibleForPublicIndexing> property.
  				 */
  def getEligibleForPublicIndexing(): Boolean
  /**
  				 * Gets the value of the <Titanium.App.iOS.UserActivity.eligibleForSearch> property.
  				 */
  def getEligibleForSearch(): Boolean
  /**
  				 * Gets the value of the <Titanium.App.iOS.UserActivity.expirationDate> property.
  				 */
  def getExpirationDate(): String
  /**
  				 * Gets the value of the <Titanium.App.iOS.UserActivity.keywords> property.
  				 */
  def getKeywords(): js.Array[String]
  /**
  				 * Gets the value of the <Titanium.App.iOS.UserActivity.needsSave> property.
  				 */
  def getNeedsSave(): Boolean
  /**
  				 * Gets the value of the <Titanium.App.iOS.UserActivity.persistentIdentifier> property.
  				 */
  def getPersistentIdentifier(): String
  /**
  				 * Gets the value of the <Titanium.App.iOS.UserActivity.requiredUserInfoKeys> property.
  				 */
  def getRequiredUserInfoKeys(): js.Array[String]
  /**
  				 * Gets the value of the <Titanium.App.iOS.UserActivity.supported> property.
  				 */
  def getSupported(): Boolean
  /**
  				 * Gets the value of the <Titanium.App.iOS.UserActivity.title> property.
  				 */
  def getTitle(): String
  /**
  				 * Gets the value of the <Titanium.App.iOS.UserActivity.userInfo> property.
  				 */
  def getUserInfo(): js.Any
  /**
  				 * Gets the value of the <Titanium.App.iOS.UserActivity.webpageURL> property.
  				 */
  def getWebpageURL(): String
  /**
  				 * Invalidates an activity when it is no longer eligible for continuation.
  				 */
  def invalidate(): Unit
  /**
  				 * Determines if user activities are supported (`true`) or not (`false`) by the device.
  				 */
  def isSupported(): Boolean
  /**
  				 * Marks the activity as currently **not** in use and ineligible to be continued.
  				 */
  def resignCurrent(): Unit
  /**
  				 * Sets the value of the <Titanium.App.iOS.UserActivity.activityType> property.
  				 */
  def setActivityType(activityType: String): Unit
  /**
  				 * Sets the value of the <Titanium.App.iOS.UserActivity.eligibleForHandoff> property.
  				 */
  def setEligibleForHandoff(eligibleForHandoff: Boolean): Unit
  /**
  				 * Sets the value of the <Titanium.App.iOS.UserActivity.eligibleForPrediction> property.
  				 */
  def setEligibleForPrediction(eligibleForPrediction: Boolean): Unit
  /**
  				 * Sets the value of the <Titanium.App.iOS.UserActivity.eligibleForPublicIndexing> property.
  				 */
  def setEligibleForPublicIndexing(eligibleForPublicIndexing: Boolean): Unit
  /**
  				 * Sets the value of the <Titanium.App.iOS.UserActivity.eligibleForSearch> property.
  				 */
  def setEligibleForSearch(eligibleForSearch: Boolean): Unit
  /**
  				 * Sets the value of the <Titanium.App.iOS.UserActivity.expirationDate> property.
  				 */
  def setExpirationDate(expirationDate: String): Unit
  /**
  				 * Sets the value of the <Titanium.App.iOS.UserActivity.keywords> property.
  				 */
  def setKeywords(keywords: js.Array[String]): Unit
  /**
  				 * Sets the value of the <Titanium.App.iOS.UserActivity.needsSave> property.
  				 */
  def setNeedsSave(needsSave: Boolean): Unit
  /**
  				 * Sets the value of the <Titanium.App.iOS.UserActivity.persistentIdentifier> property.
  				 */
  def setPersistentIdentifier(persistentIdentifier: String): Unit
  /**
  				 * Sets the value of the <Titanium.App.iOS.UserActivity.requiredUserInfoKeys> property.
  				 */
  def setRequiredUserInfoKeys(requiredUserInfoKeys: js.Array[String]): Unit
  /**
  				 * Sets the value of the <Titanium.App.iOS.UserActivity.supported> property.
  				 */
  def setSupported(supported: Boolean): Unit
  /**
  				 * Sets the value of the <Titanium.App.iOS.UserActivity.title> property.
  				 */
  def setTitle(title: String): Unit
  /**
  				 * Sets the value of the <Titanium.App.iOS.UserActivity.userInfo> property.
  				 */
  def setUserInfo(userInfo: js.Any): Unit
  /**
  				 * Sets the value of the <Titanium.App.iOS.UserActivity.webpageURL> property.
  				 */
  def setWebpageURL(webpageURL: String): Unit
}

object UserActivity {
  @scala.inline
  def apply(
    activityType: String,
    addContentAttributeSet: SearchableItemAttributeSet => Callback,
    addEventListener: (String, js.Function1[/* param0 */ js.Any, js.Any]) => Callback,
    apiName: String,
    applyProperties: js.Any => Callback,
    becomeCurrent: Callback,
    bubbleParent: Boolean,
    deleteAllSavedUserActivities: Callback,
    deleteSavedUserActivitiesForPersistentIdentifiers: js.Array[String] => Callback,
    eligibleForHandoff: Boolean,
    eligibleForPrediction: Boolean,
    eligibleForPublicIndexing: Boolean,
    eligibleForSearch: Boolean,
    expirationDate: String,
    fireEvent: (String, js.Any) => Callback,
    getActivityType: CallbackTo[String],
    getApiName: CallbackTo[String],
    getBubbleParent: CallbackTo[Boolean],
    getEligibleForHandoff: CallbackTo[Boolean],
    getEligibleForPrediction: CallbackTo[Boolean],
    getEligibleForPublicIndexing: CallbackTo[Boolean],
    getEligibleForSearch: CallbackTo[Boolean],
    getExpirationDate: CallbackTo[String],
    getKeywords: CallbackTo[js.Array[String]],
    getNeedsSave: CallbackTo[Boolean],
    getPersistentIdentifier: CallbackTo[String],
    getRequiredUserInfoKeys: CallbackTo[js.Array[String]],
    getSupported: CallbackTo[Boolean],
    getTitle: CallbackTo[String],
    getUserInfo: CallbackTo[js.Any],
    getWebpageURL: CallbackTo[String],
    invalidate: Callback,
    isSupported: CallbackTo[Boolean],
    keywords: js.Array[String],
    needsSave: Boolean,
    persistentIdentifier: String,
    removeEventListener: (String, js.Function1[/* param0 */ js.Any, js.Any]) => Callback,
    requiredUserInfoKeys: js.Array[String],
    resignCurrent: Callback,
    setActivityType: String => Callback,
    setBubbleParent: Boolean => Callback,
    setEligibleForHandoff: Boolean => Callback,
    setEligibleForPrediction: Boolean => Callback,
    setEligibleForPublicIndexing: Boolean => Callback,
    setEligibleForSearch: Boolean => Callback,
    setExpirationDate: String => Callback,
    setKeywords: js.Array[String] => Callback,
    setNeedsSave: Boolean => Callback,
    setPersistentIdentifier: String => Callback,
    setRequiredUserInfoKeys: js.Array[String] => Callback,
    setSupported: Boolean => Callback,
    setTitle: String => Callback,
    setUserInfo: js.Any => Callback,
    setWebpageURL: String => Callback,
    supported: Boolean,
    title: String,
    userInfo: js.Any,
    webpageURL: String,
    getLifecycleContainer: js.UndefOr[CallbackTo[Window | TabGroup]] = js.undefined,
    lifecycleContainer: Window | TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ Window, Unit]) with (js.Function1[/* lifecycleContainer */ TabGroup, Unit]) = null
  ): UserActivity = {
    val __obj = js.Dynamic.literal(activityType = activityType.asInstanceOf[js.Any], apiName = apiName.asInstanceOf[js.Any], bubbleParent = bubbleParent.asInstanceOf[js.Any], eligibleForHandoff = eligibleForHandoff.asInstanceOf[js.Any], eligibleForPrediction = eligibleForPrediction.asInstanceOf[js.Any], eligibleForPublicIndexing = eligibleForPublicIndexing.asInstanceOf[js.Any], eligibleForSearch = eligibleForSearch.asInstanceOf[js.Any], expirationDate = expirationDate.asInstanceOf[js.Any], keywords = keywords.asInstanceOf[js.Any], needsSave = needsSave.asInstanceOf[js.Any], persistentIdentifier = persistentIdentifier.asInstanceOf[js.Any], requiredUserInfoKeys = requiredUserInfoKeys.asInstanceOf[js.Any], supported = supported.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], userInfo = userInfo.asInstanceOf[js.Any], webpageURL = webpageURL.asInstanceOf[js.Any])
    __obj.updateDynamic("addContentAttributeSet")(js.Any.fromFunction1((t0: typingsJapgolly.titanium.Titanium.App.iOS.SearchableItemAttributeSet) => addContentAttributeSet(t0).runNow()))
    __obj.updateDynamic("addEventListener")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[/* param0 */ js.Any, js.Any]) => addEventListener(t0, t1).runNow()))
    __obj.updateDynamic("applyProperties")(js.Any.fromFunction1((t0: js.Any) => applyProperties(t0).runNow()))
    __obj.updateDynamic("becomeCurrent")(becomeCurrent.toJsFn)
    __obj.updateDynamic("deleteAllSavedUserActivities")(deleteAllSavedUserActivities.toJsFn)
    __obj.updateDynamic("deleteSavedUserActivitiesForPersistentIdentifiers")(js.Any.fromFunction1((t0: js.Array[java.lang.String]) => deleteSavedUserActivitiesForPersistentIdentifiers(t0).runNow()))
    __obj.updateDynamic("fireEvent")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Any) => fireEvent(t0, t1).runNow()))
    __obj.updateDynamic("getActivityType")(getActivityType.toJsFn)
    __obj.updateDynamic("getApiName")(getApiName.toJsFn)
    __obj.updateDynamic("getBubbleParent")(getBubbleParent.toJsFn)
    __obj.updateDynamic("getEligibleForHandoff")(getEligibleForHandoff.toJsFn)
    __obj.updateDynamic("getEligibleForPrediction")(getEligibleForPrediction.toJsFn)
    __obj.updateDynamic("getEligibleForPublicIndexing")(getEligibleForPublicIndexing.toJsFn)
    __obj.updateDynamic("getEligibleForSearch")(getEligibleForSearch.toJsFn)
    __obj.updateDynamic("getExpirationDate")(getExpirationDate.toJsFn)
    __obj.updateDynamic("getKeywords")(getKeywords.toJsFn)
    __obj.updateDynamic("getNeedsSave")(getNeedsSave.toJsFn)
    __obj.updateDynamic("getPersistentIdentifier")(getPersistentIdentifier.toJsFn)
    __obj.updateDynamic("getRequiredUserInfoKeys")(getRequiredUserInfoKeys.toJsFn)
    __obj.updateDynamic("getSupported")(getSupported.toJsFn)
    __obj.updateDynamic("getTitle")(getTitle.toJsFn)
    __obj.updateDynamic("getUserInfo")(getUserInfo.toJsFn)
    __obj.updateDynamic("getWebpageURL")(getWebpageURL.toJsFn)
    __obj.updateDynamic("invalidate")(invalidate.toJsFn)
    __obj.updateDynamic("isSupported")(isSupported.toJsFn)
    __obj.updateDynamic("removeEventListener")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[/* param0 */ js.Any, js.Any]) => removeEventListener(t0, t1).runNow()))
    __obj.updateDynamic("resignCurrent")(resignCurrent.toJsFn)
    __obj.updateDynamic("setActivityType")(js.Any.fromFunction1((t0: java.lang.String) => setActivityType(t0).runNow()))
    __obj.updateDynamic("setBubbleParent")(js.Any.fromFunction1((t0: scala.Boolean) => setBubbleParent(t0).runNow()))
    __obj.updateDynamic("setEligibleForHandoff")(js.Any.fromFunction1((t0: scala.Boolean) => setEligibleForHandoff(t0).runNow()))
    __obj.updateDynamic("setEligibleForPrediction")(js.Any.fromFunction1((t0: scala.Boolean) => setEligibleForPrediction(t0).runNow()))
    __obj.updateDynamic("setEligibleForPublicIndexing")(js.Any.fromFunction1((t0: scala.Boolean) => setEligibleForPublicIndexing(t0).runNow()))
    __obj.updateDynamic("setEligibleForSearch")(js.Any.fromFunction1((t0: scala.Boolean) => setEligibleForSearch(t0).runNow()))
    __obj.updateDynamic("setExpirationDate")(js.Any.fromFunction1((t0: java.lang.String) => setExpirationDate(t0).runNow()))
    __obj.updateDynamic("setKeywords")(js.Any.fromFunction1((t0: js.Array[java.lang.String]) => setKeywords(t0).runNow()))
    __obj.updateDynamic("setNeedsSave")(js.Any.fromFunction1((t0: scala.Boolean) => setNeedsSave(t0).runNow()))
    __obj.updateDynamic("setPersistentIdentifier")(js.Any.fromFunction1((t0: java.lang.String) => setPersistentIdentifier(t0).runNow()))
    __obj.updateDynamic("setRequiredUserInfoKeys")(js.Any.fromFunction1((t0: js.Array[java.lang.String]) => setRequiredUserInfoKeys(t0).runNow()))
    __obj.updateDynamic("setSupported")(js.Any.fromFunction1((t0: scala.Boolean) => setSupported(t0).runNow()))
    __obj.updateDynamic("setTitle")(js.Any.fromFunction1((t0: java.lang.String) => setTitle(t0).runNow()))
    __obj.updateDynamic("setUserInfo")(js.Any.fromFunction1((t0: js.Any) => setUserInfo(t0).runNow()))
    __obj.updateDynamic("setWebpageURL")(js.Any.fromFunction1((t0: java.lang.String) => setWebpageURL(t0).runNow()))
    getLifecycleContainer.foreach(p => __obj.updateDynamic("getLifecycleContainer")(p.toJsFn))
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserActivity]
  }
}

