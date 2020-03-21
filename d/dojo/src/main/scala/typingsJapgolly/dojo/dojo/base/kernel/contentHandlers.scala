package typingsJapgolly.dojo.dojo.base.kernel

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojo/_base/kernel.contentHandlers.html
  *
  * A map of available XHR transport handle types. Name matches the
  * handleAs attribute passed to XHR calls.
  * A map of available XHR transport handle types. Name matches the
  * handleAs attribute passed to XHR calls. Each contentHandler is
  * called, passing the xhr object for manipulation. The return value
  * from the contentHandler will be passed to the load or handle
  * functions defined in the original xhr call.
  *
  */
trait contentHandlers extends js.Object {
  /**
    *
    * @param xhr
    */
  def auto(xhr: js.Any): Unit
  /**
    * A contentHandler which evaluates the response data, expecting it to be valid JavaScript
    *
    * @param xhr
    */
  def javascript(xhr: js.Any): js.Any
  /**
    * A contentHandler which returns a JavaScript object created from the response data
    *
    * @param xhr
    */
  def json(xhr: js.Any): js.Any
  /**
    * A contentHandler which expects comment-filtered JSON.
    * A contentHandler which expects comment-filtered JSON.
    * the json-comment-filtered option was implemented to prevent
    * "JavaScript Hijacking", but it is less secure than standard JSON. Use
    * standard JSON instead. JSON prefixing can be used to subvert hijacking.
    *
    * Will throw a notice suggesting to use application/json mimetype, as
    * json-commenting can introduce security issues. To decrease the chances of hijacking,
    * use the standard json contentHandler, and prefix your "JSON" with: {}&&
    *
    * use djConfig.useCommentedJson = true to turn off the notice
    *
    * @param xhr
    */
  def json_comment_filtered(xhr: js.Any): js.Any
  /**
    * A contentHandler which checks the presence of comment-filtered JSON and
    * alternates between the json and json-comment-filtered contentHandlers.
    *
    * @param xhr
    */
  def json_comment_optional(xhr: js.Any): js.Any
  /**
    *
    * @param xhr
    */
  def olson_zoneinfo(xhr: js.Any): Unit
  /**
    * A contentHandler which simply returns the plaintext response data
    *
    * @param xhr
    */
  def text(xhr: js.Any): js.Any
  /**
    * A contentHandler returning an XML Document parsed from the response data
    *
    * @param xhr
    */
  def xml(xhr: js.Any): js.Any
}

object contentHandlers {
  @scala.inline
  def apply(
    auto: js.Any => Callback,
    javascript: js.Any => CallbackTo[js.Any],
    json: js.Any => CallbackTo[js.Any],
    json_comment_filtered: js.Any => CallbackTo[js.Any],
    json_comment_optional: js.Any => CallbackTo[js.Any],
    olson_zoneinfo: js.Any => Callback,
    text: js.Any => CallbackTo[js.Any],
    xml: js.Any => CallbackTo[js.Any]
  ): contentHandlers = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("auto")(js.Any.fromFunction1((t0: js.Any) => auto(t0).runNow()))
    __obj.updateDynamic("javascript")(js.Any.fromFunction1((t0: js.Any) => javascript(t0).runNow()))
    __obj.updateDynamic("json")(js.Any.fromFunction1((t0: js.Any) => json(t0).runNow()))
    __obj.updateDynamic("json_comment_filtered")(js.Any.fromFunction1((t0: js.Any) => json_comment_filtered(t0).runNow()))
    __obj.updateDynamic("json_comment_optional")(js.Any.fromFunction1((t0: js.Any) => json_comment_optional(t0).runNow()))
    __obj.updateDynamic("olson_zoneinfo")(js.Any.fromFunction1((t0: js.Any) => olson_zoneinfo(t0).runNow()))
    __obj.updateDynamic("text")(js.Any.fromFunction1((t0: js.Any) => text(t0).runNow()))
    __obj.updateDynamic("xml")(js.Any.fromFunction1((t0: js.Any) => xml(t0).runNow()))
    __obj.asInstanceOf[contentHandlers]
  }
}

