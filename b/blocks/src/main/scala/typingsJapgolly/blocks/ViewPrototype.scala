package typingsJapgolly.blocks

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/////////////////////////////////////////
// App.View
/////////////////////////////////////////
trait ViewPrototype
  extends /* propertyName */ StringDictionary[js.Any] {
  /**
  	 * Override the init method to perform actions when the View is first created and shown on the page
  	 */
  var init: js.UndefOr[js.Function] = js.undefined
  /**
  	 * Determines if the view is visible
  	 */
  var isActive: js.UndefOr[js.Function0[Boolean]] = js.undefined
  var navigateTo: js.UndefOr[js.Function] = js.undefined
  var options: js.UndefOr[AnonRoute] = js.undefined
  var parentView: js.UndefOr[js.Any] = js.undefined
  /**
    * Override the ready method to perform actions when the DOM is ready and
    * all data-query have been executed.
  	 */
  var ready: js.UndefOr[js.Function] = js.undefined
  /**
  	 * Routes to a specific URL and actives the appropriate views associated with the URL
  	 * 
  	 * @param name Name of the route
  	 */
  var route: js.UndefOr[js.Function1[/* name */ String, this.type]] = js.undefined
  /**
  	 * Override the routed method to perform actions when the View have routing and routing mechanism actives it.
  	 */
  var routed: js.UndefOr[js.Function] = js.undefined
}

object ViewPrototype {
  @scala.inline
  def apply(
    StringDictionary: /* propertyName */ StringDictionary[js.Any] = null,
    init: js.Function = null,
    isActive: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    navigateTo: js.Function = null,
    options: AnonRoute = null,
    parentView: js.Any = null,
    ready: js.Function = null,
    route: /* name */ String => CallbackTo[ViewPrototype] = null,
    routed: js.Function = null
  ): ViewPrototype = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (init != null) __obj.updateDynamic("init")(init.asInstanceOf[js.Any])
    isActive.foreach(p => __obj.updateDynamic("isActive")(p.toJsFn))
    if (navigateTo != null) __obj.updateDynamic("navigateTo")(navigateTo.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (parentView != null) __obj.updateDynamic("parentView")(parentView.asInstanceOf[js.Any])
    if (ready != null) __obj.updateDynamic("ready")(ready.asInstanceOf[js.Any])
    if (route != null) __obj.updateDynamic("route")(js.Any.fromFunction1((t0: /* name */ java.lang.String) => route(t0).runNow()))
    if (routed != null) __obj.updateDynamic("routed")(routed.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewPrototype]
  }
}

