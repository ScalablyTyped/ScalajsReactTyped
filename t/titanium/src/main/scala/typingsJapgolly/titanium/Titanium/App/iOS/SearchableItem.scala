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
			 * Used to create a unique object containing all of the search information that will appear in the device search index.
			 */
trait SearchableItem extends Proxy {
  /**
  				 * Set of metadata properties to display for the item.
  				 */
  var attributeSet: SearchableItemAttributeSet
  /**
  				 * Identifier that represents the "domain" or owner of this item.
  				 */
  var domainIdentifier: String
  /**
  				 * Searchable items have an expiration date or time to live.  By default it is set to one month.
  				 */
  var expirationDate: String
  /**
  				 * Unique identifier to your application group.
  				 */
  var uniqueIdentifier: String
  /**
  				 * Gets the value of the <Titanium.App.iOS.SearchableItem.domainIdentifier> property.
  				 */
  def getDomainIdentifier(): String
  /**
  				 * Gets the value of the <Titanium.App.iOS.SearchableItem.expirationDate> property.
  				 */
  def getExpirationDate(): String
  /**
  				 * Gets the value of the <Titanium.App.iOS.SearchableItem.uniqueIdentifier> property.
  				 */
  def getUniqueIdentifier(): String
  /**
  				 * Sets the value of the <Titanium.App.iOS.SearchableItem.domainIdentifier> property.
  				 */
  def setDomainIdentifier(domainIdentifier: String): Unit
  /**
  				 * Sets the value of the <Titanium.App.iOS.SearchableItem.expirationDate> property.
  				 */
  def setExpirationDate(expirationDate: String): Unit
  /**
  				 * Sets the value of the <Titanium.App.iOS.SearchableItem.uniqueIdentifier> property.
  				 */
  def setUniqueIdentifier(uniqueIdentifier: String): Unit
}

object SearchableItem {
  @scala.inline
  def apply(
    addEventListener: (String, js.Function1[/* param0 */ js.Any, js.Any]) => Callback,
    apiName: String,
    applyProperties: js.Any => Callback,
    attributeSet: SearchableItemAttributeSet,
    bubbleParent: Boolean,
    domainIdentifier: String,
    expirationDate: String,
    fireEvent: (String, js.Any) => Callback,
    getApiName: CallbackTo[String],
    getBubbleParent: CallbackTo[Boolean],
    getDomainIdentifier: CallbackTo[String],
    getExpirationDate: CallbackTo[String],
    getUniqueIdentifier: CallbackTo[String],
    removeEventListener: (String, js.Function1[/* param0 */ js.Any, js.Any]) => Callback,
    setBubbleParent: Boolean => Callback,
    setDomainIdentifier: String => Callback,
    setExpirationDate: String => Callback,
    setUniqueIdentifier: String => Callback,
    uniqueIdentifier: String,
    getLifecycleContainer: js.UndefOr[CallbackTo[Window | TabGroup]] = js.undefined,
    lifecycleContainer: Window | TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ Window, Unit]) with (js.Function1[/* lifecycleContainer */ TabGroup, Unit]) = null
  ): SearchableItem = {
    val __obj = js.Dynamic.literal(apiName = apiName.asInstanceOf[js.Any], attributeSet = attributeSet.asInstanceOf[js.Any], bubbleParent = bubbleParent.asInstanceOf[js.Any], domainIdentifier = domainIdentifier.asInstanceOf[js.Any], expirationDate = expirationDate.asInstanceOf[js.Any], uniqueIdentifier = uniqueIdentifier.asInstanceOf[js.Any])
    __obj.updateDynamic("addEventListener")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[/* param0 */ js.Any, js.Any]) => addEventListener(t0, t1).runNow()))
    __obj.updateDynamic("applyProperties")(js.Any.fromFunction1((t0: js.Any) => applyProperties(t0).runNow()))
    __obj.updateDynamic("fireEvent")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Any) => fireEvent(t0, t1).runNow()))
    __obj.updateDynamic("getApiName")(getApiName.toJsFn)
    __obj.updateDynamic("getBubbleParent")(getBubbleParent.toJsFn)
    __obj.updateDynamic("getDomainIdentifier")(getDomainIdentifier.toJsFn)
    __obj.updateDynamic("getExpirationDate")(getExpirationDate.toJsFn)
    __obj.updateDynamic("getUniqueIdentifier")(getUniqueIdentifier.toJsFn)
    __obj.updateDynamic("removeEventListener")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[/* param0 */ js.Any, js.Any]) => removeEventListener(t0, t1).runNow()))
    __obj.updateDynamic("setBubbleParent")(js.Any.fromFunction1((t0: scala.Boolean) => setBubbleParent(t0).runNow()))
    __obj.updateDynamic("setDomainIdentifier")(js.Any.fromFunction1((t0: java.lang.String) => setDomainIdentifier(t0).runNow()))
    __obj.updateDynamic("setExpirationDate")(js.Any.fromFunction1((t0: java.lang.String) => setExpirationDate(t0).runNow()))
    __obj.updateDynamic("setUniqueIdentifier")(js.Any.fromFunction1((t0: java.lang.String) => setUniqueIdentifier(t0).runNow()))
    getLifecycleContainer.foreach(p => __obj.updateDynamic("getLifecycleContainer")(p.toJsFn))
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchableItem]
  }
}

