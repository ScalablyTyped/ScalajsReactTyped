package typingsJapgolly.i18nextNodeFsBackend.i18nextNodeFsBackEnd

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @summary Options for "i18next-node-fs-backend".
  * @interface
  */
trait i18nextNodeFsBackEndOptions extends js.Object {
  /**
    * @summary Path to post missing resources
    * @type {string}
    */
  var addPath: String
  /**
    * @summary jsonIndent to use when storing json files
    * @type {number}
    */
  var jsonIndent: Double
  /**
    * @summary Path where resources get loaded from.
    * @type {string}
    */
  var loadPath: String
  /**
    * @summary custom parser
    * @type {function}
    */
  var parse: js.UndefOr[js.Function1[/* data */ js.Any, _]] = js.undefined
}

object i18nextNodeFsBackEndOptions {
  @scala.inline
  def apply(
    addPath: String,
    jsonIndent: Double,
    loadPath: String,
    parse: /* data */ js.Any => CallbackTo[js.Any] = null
  ): i18nextNodeFsBackEndOptions = {
    val __obj = js.Dynamic.literal(addPath = addPath.asInstanceOf[js.Any], jsonIndent = jsonIndent.asInstanceOf[js.Any], loadPath = loadPath.asInstanceOf[js.Any])
    if (parse != null) __obj.updateDynamic("parse")(js.Any.fromFunction1((t0: /* data */ js.Any) => parse(t0).runNow()))
    __obj.asInstanceOf[i18nextNodeFsBackEndOptions]
  }
}

