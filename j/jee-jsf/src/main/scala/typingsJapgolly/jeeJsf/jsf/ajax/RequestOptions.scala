package typingsJapgolly.jeeJsf.jsf.ajax

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestOptions extends js.Object {
  /**
    * space seperated list of client identifiers
    */
  var execute: js.UndefOr[String] = js.undefined
  /**
    * client behavior event name from the request parameter
    */
  @JSName("javax.faces.behavior.event")
  var javaxDotfacesDotbehaviorDotevent: js.UndefOr[js.Any] = js.undefined
  /**
    * function to callback for error
    * @param callback the callback function
    */
  var onerror: js.UndefOr[js.Function1[/* callback */ js.Function1[/* data */ RequestData, Unit], Unit]] = js.undefined
  /**
    * function to callback for event
    * @param callback the callback function
    */
  var onevent: js.UndefOr[js.Function1[/* callback */ js.Function1[/* data */ RequestData, Unit], Unit]] = js.undefined
  /**
    * object containing parameters to include in the request
    */
  var params: js.UndefOr[js.Any] = js.undefined
  /**
    * space seperated list of client identifiers
    */
  var render: js.UndefOr[String] = js.undefined
}

object RequestOptions {
  @scala.inline
  def apply(
    execute: String = null,
    javaxDotfacesDotbehaviorDotevent: js.Any = null,
    onerror: /* callback */ js.Function1[/* data */ RequestData, Unit] => Callback = null,
    onevent: /* callback */ js.Function1[/* data */ RequestData, Unit] => Callback = null,
    params: js.Any = null,
    render: String = null
  ): RequestOptions = {
    val __obj = js.Dynamic.literal()
    if (execute != null) __obj.updateDynamic("execute")(execute.asInstanceOf[js.Any])
    if (javaxDotfacesDotbehaviorDotevent != null) __obj.updateDynamic("javax.faces.behavior.event")(javaxDotfacesDotbehaviorDotevent.asInstanceOf[js.Any])
    if (onerror != null) __obj.updateDynamic("onerror")(js.Any.fromFunction1((t0: /* callback */ js.Function1[/* data */ typingsJapgolly.jeeJsf.jsf.ajax.RequestData, scala.Unit]) => onerror(t0).runNow()))
    if (onevent != null) __obj.updateDynamic("onevent")(js.Any.fromFunction1((t0: /* callback */ js.Function1[/* data */ typingsJapgolly.jeeJsf.jsf.ajax.RequestData, scala.Unit]) => onevent(t0).runNow()))
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    if (render != null) __obj.updateDynamic("render")(render.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestOptions]
  }
}

