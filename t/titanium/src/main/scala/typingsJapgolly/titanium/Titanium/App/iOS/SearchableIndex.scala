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
			 * The SearchableIndex module is used to add or remove Ti.App.iOS.SearchableItem objects from the device search index.
			 */
trait SearchableIndex extends Proxy {
  /**
  				 * Adds an array of Titanium.App.iOS.SearchableItem objects to the default search index.
  				 */
  def addToDefaultSearchableIndex(Array: js.Array[SearchableItem], callback: js.Function1[/* param0 */ js.Any, _]): Unit
  /**
  				 * Removes search items based on an array of domain identifiers.
  				 */
  def deleteAllSearchableItemByDomainIdenifiers(Array: js.Array[String], callback: js.Function1[/* param0 */ js.Any, _]): Unit
  /**
  				 * Removes all search items added by the application.
  				 */
  def deleteAllSearchableItems(callback: js.Function1[/* param0 */ js.Any, _]): Unit
  /**
  				 * Removes search items based on an array of identifiers.
  				 */
  def deleteSearchableItemsByIdentifiers(Array: js.Array[String], callback: js.Function1[/* param0 */ js.Any, _]): Unit
  /**
  				 * Indicates whether indexing is supported by the device.
  				 */
  def isSupported(): Boolean
}

object SearchableIndex {
  @scala.inline
  def apply(
    addEventListener: (String, js.Function1[/* param0 */ js.Any, js.Any]) => Callback,
    addToDefaultSearchableIndex: (js.Array[SearchableItem], js.Function1[/* param0 */ js.Any, js.Any]) => Callback,
    apiName: String,
    applyProperties: js.Any => Callback,
    bubbleParent: Boolean,
    deleteAllSearchableItemByDomainIdenifiers: (js.Array[String], js.Function1[/* param0 */ js.Any, js.Any]) => Callback,
    deleteAllSearchableItems: js.Function1[/* param0 */ js.Any, js.Any] => Callback,
    deleteSearchableItemsByIdentifiers: (js.Array[String], js.Function1[/* param0 */ js.Any, js.Any]) => Callback,
    fireEvent: (String, js.Any) => Callback,
    getApiName: CallbackTo[String],
    getBubbleParent: CallbackTo[Boolean],
    isSupported: CallbackTo[Boolean],
    removeEventListener: (String, js.Function1[/* param0 */ js.Any, js.Any]) => Callback,
    setBubbleParent: Boolean => Callback,
    getLifecycleContainer: js.UndefOr[CallbackTo[Window | TabGroup]] = js.undefined,
    lifecycleContainer: Window | TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ Window, Unit]) with (js.Function1[/* lifecycleContainer */ TabGroup, Unit]) = null
  ): SearchableIndex = {
    val __obj = js.Dynamic.literal(apiName = apiName.asInstanceOf[js.Any], bubbleParent = bubbleParent.asInstanceOf[js.Any])
    __obj.updateDynamic("addEventListener")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[/* param0 */ js.Any, js.Any]) => addEventListener(t0, t1).runNow()))
    __obj.updateDynamic("addToDefaultSearchableIndex")(js.Any.fromFunction2((t0: js.Array[typingsJapgolly.titanium.Titanium.App.iOS.SearchableItem], t1: js.Function1[/* param0 */ js.Any, js.Any]) => addToDefaultSearchableIndex(t0, t1).runNow()))
    __obj.updateDynamic("applyProperties")(js.Any.fromFunction1((t0: js.Any) => applyProperties(t0).runNow()))
    __obj.updateDynamic("deleteAllSearchableItemByDomainIdenifiers")(js.Any.fromFunction2((t0: js.Array[java.lang.String], t1: js.Function1[/* param0 */ js.Any, js.Any]) => deleteAllSearchableItemByDomainIdenifiers(t0, t1).runNow()))
    __obj.updateDynamic("deleteAllSearchableItems")(js.Any.fromFunction1((t0: js.Function1[/* param0 */ js.Any, js.Any]) => deleteAllSearchableItems(t0).runNow()))
    __obj.updateDynamic("deleteSearchableItemsByIdentifiers")(js.Any.fromFunction2((t0: js.Array[java.lang.String], t1: js.Function1[/* param0 */ js.Any, js.Any]) => deleteSearchableItemsByIdentifiers(t0, t1).runNow()))
    __obj.updateDynamic("fireEvent")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Any) => fireEvent(t0, t1).runNow()))
    __obj.updateDynamic("getApiName")(getApiName.toJsFn)
    __obj.updateDynamic("getBubbleParent")(getBubbleParent.toJsFn)
    __obj.updateDynamic("isSupported")(isSupported.toJsFn)
    __obj.updateDynamic("removeEventListener")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[/* param0 */ js.Any, js.Any]) => removeEventListener(t0, t1).runNow()))
    __obj.updateDynamic("setBubbleParent")(js.Any.fromFunction1((t0: scala.Boolean) => setBubbleParent(t0).runNow()))
    getLifecycleContainer.foreach(p => __obj.updateDynamic("getLifecycleContainer")(p.toJsFn))
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchableIndex]
  }
}

