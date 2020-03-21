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
			 * A search query object manages the criteria to apply when searching app content that you have previously
			 * indexed by using the Core Spotlight APIs.
			 */
trait SearchQuery extends Proxy {
  /**
  				 * An array of strings that represent the attributes of indexed items.
  				 */
  var attributes: js.Array[String]
  /**
  				 * A formatted string that defines the matching criteria to apply to indexed items.
  				 */
  var queryString: String
  /**
  				 * Cancels a query operation.
  				 */
  def cancel(): Unit
  /**
  				 * A Boolean value that indicates if the query has been cancelled (`true`) or not (`false`).
  				 */
  def isCancelled(): Boolean
  /**
  				 * Asynchronously queries the index for items that match the query object's specifications.
  				 */
  def start(): Unit
}

object SearchQuery {
  @scala.inline
  def apply(
    addEventListener: (String, js.Function1[/* param0 */ js.Any, js.Any]) => Callback,
    apiName: String,
    applyProperties: js.Any => Callback,
    attributes: js.Array[String],
    bubbleParent: Boolean,
    cancel: Callback,
    fireEvent: (String, js.Any) => Callback,
    getApiName: CallbackTo[String],
    getBubbleParent: CallbackTo[Boolean],
    isCancelled: CallbackTo[Boolean],
    queryString: String,
    removeEventListener: (String, js.Function1[/* param0 */ js.Any, js.Any]) => Callback,
    setBubbleParent: Boolean => Callback,
    start: Callback,
    getLifecycleContainer: js.UndefOr[CallbackTo[Window | TabGroup]] = js.undefined,
    lifecycleContainer: Window | TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ Window, Unit]) with (js.Function1[/* lifecycleContainer */ TabGroup, Unit]) = null
  ): SearchQuery = {
    val __obj = js.Dynamic.literal(apiName = apiName.asInstanceOf[js.Any], attributes = attributes.asInstanceOf[js.Any], bubbleParent = bubbleParent.asInstanceOf[js.Any], queryString = queryString.asInstanceOf[js.Any])
    __obj.updateDynamic("addEventListener")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[/* param0 */ js.Any, js.Any]) => addEventListener(t0, t1).runNow()))
    __obj.updateDynamic("applyProperties")(js.Any.fromFunction1((t0: js.Any) => applyProperties(t0).runNow()))
    __obj.updateDynamic("cancel")(cancel.toJsFn)
    __obj.updateDynamic("fireEvent")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Any) => fireEvent(t0, t1).runNow()))
    __obj.updateDynamic("getApiName")(getApiName.toJsFn)
    __obj.updateDynamic("getBubbleParent")(getBubbleParent.toJsFn)
    __obj.updateDynamic("isCancelled")(isCancelled.toJsFn)
    __obj.updateDynamic("removeEventListener")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[/* param0 */ js.Any, js.Any]) => removeEventListener(t0, t1).runNow()))
    __obj.updateDynamic("setBubbleParent")(js.Any.fromFunction1((t0: scala.Boolean) => setBubbleParent(t0).runNow()))
    __obj.updateDynamic("start")(start.toJsFn)
    getLifecycleContainer.foreach(p => __obj.updateDynamic("getLifecycleContainer")(p.toJsFn))
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchQuery]
  }
}

