package typingsJapgolly.titanium.Titanium.Network

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.titanium.Titanium.Proxy
import typingsJapgolly.titanium.Titanium.UI.TabGroup
import typingsJapgolly.titanium.Titanium.UI.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * A browser for the discovery and retrieval of Bonjour services available on the network.
		 */
trait BonjourBrowser extends Proxy {
  /**
  			 * The domain the browser is searching in
  			 */
  var domain: String
  /**
  			 * Whether or not the browser is currently searching
  			 */
  var isSearching: Boolean
  /**
  			 * The type of the service the browser searches for
  			 */
  var serviceType: String
  /**
  			 * Gets the value of the <Titanium.Network.BonjourBrowser.domain> property.
  			 */
  def getDomain(): String
  /**
  			 * Gets the value of the <Titanium.Network.BonjourBrowser.isSearching> property.
  			 */
  def getIsSearching(): Boolean
  /**
  			 * Gets the value of the <Titanium.Network.BonjourBrowser.serviceType> property.
  			 */
  def getServiceType(): String
  /**
  			 * Conduct a search for Bonjour services matching the type and domain specified during creation
  			 */
  def search(): Unit
  /**
  			 * Sets the value of the <Titanium.Network.BonjourBrowser.domain> property.
  			 */
  def setDomain(domain: String): Unit
  /**
  			 * Sets the value of the <Titanium.Network.BonjourBrowser.isSearching> property.
  			 */
  def setIsSearching(isSearching: Boolean): Unit
  /**
  			 * Sets the value of the <Titanium.Network.BonjourBrowser.serviceType> property.
  			 */
  def setServiceType(serviceType: String): Unit
  /**
  			 * Halt an ongoing search
  			 */
  def stopSearch(): Unit
}

object BonjourBrowser {
  @scala.inline
  def apply(
    addEventListener: (String, js.Function1[/* param0 */ js.Any, js.Any]) => Callback,
    apiName: String,
    applyProperties: js.Any => Callback,
    bubbleParent: Boolean,
    domain: String,
    fireEvent: (String, js.Any) => Callback,
    getApiName: CallbackTo[String],
    getBubbleParent: CallbackTo[Boolean],
    getDomain: CallbackTo[String],
    getIsSearching: CallbackTo[Boolean],
    getServiceType: CallbackTo[String],
    isSearching: Boolean,
    removeEventListener: (String, js.Function1[/* param0 */ js.Any, js.Any]) => Callback,
    search: Callback,
    serviceType: String,
    setBubbleParent: Boolean => Callback,
    setDomain: String => Callback,
    setIsSearching: Boolean => Callback,
    setServiceType: String => Callback,
    stopSearch: Callback,
    getLifecycleContainer: js.UndefOr[CallbackTo[Window | TabGroup]] = js.undefined,
    lifecycleContainer: Window | TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ Window, Unit]) with (js.Function1[/* lifecycleContainer */ TabGroup, Unit]) = null
  ): BonjourBrowser = {
    val __obj = js.Dynamic.literal(apiName = apiName.asInstanceOf[js.Any], bubbleParent = bubbleParent.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any], isSearching = isSearching.asInstanceOf[js.Any], serviceType = serviceType.asInstanceOf[js.Any])
    __obj.updateDynamic("addEventListener")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[/* param0 */ js.Any, js.Any]) => addEventListener(t0, t1).runNow()))
    __obj.updateDynamic("applyProperties")(js.Any.fromFunction1((t0: js.Any) => applyProperties(t0).runNow()))
    __obj.updateDynamic("fireEvent")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Any) => fireEvent(t0, t1).runNow()))
    __obj.updateDynamic("getApiName")(getApiName.toJsFn)
    __obj.updateDynamic("getBubbleParent")(getBubbleParent.toJsFn)
    __obj.updateDynamic("getDomain")(getDomain.toJsFn)
    __obj.updateDynamic("getIsSearching")(getIsSearching.toJsFn)
    __obj.updateDynamic("getServiceType")(getServiceType.toJsFn)
    __obj.updateDynamic("removeEventListener")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[/* param0 */ js.Any, js.Any]) => removeEventListener(t0, t1).runNow()))
    __obj.updateDynamic("search")(search.toJsFn)
    __obj.updateDynamic("setBubbleParent")(js.Any.fromFunction1((t0: scala.Boolean) => setBubbleParent(t0).runNow()))
    __obj.updateDynamic("setDomain")(js.Any.fromFunction1((t0: java.lang.String) => setDomain(t0).runNow()))
    __obj.updateDynamic("setIsSearching")(js.Any.fromFunction1((t0: scala.Boolean) => setIsSearching(t0).runNow()))
    __obj.updateDynamic("setServiceType")(js.Any.fromFunction1((t0: java.lang.String) => setServiceType(t0).runNow()))
    __obj.updateDynamic("stopSearch")(stopSearch.toJsFn)
    getLifecycleContainer.foreach(p => __obj.updateDynamic("getLifecycleContainer")(p.toJsFn))
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer.asInstanceOf[js.Any])
    __obj.asInstanceOf[BonjourBrowser]
  }
}

