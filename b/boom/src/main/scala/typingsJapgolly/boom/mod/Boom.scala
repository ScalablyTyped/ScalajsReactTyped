package typingsJapgolly.boom.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * boom provides a set of utilities for returning HTTP errors. Each utility returns a Boom error response object (instance of Error) which includes the following properties:
  * @see {@link https://github.com/hapijs/boom#boom}
  */
trait Boom[Data] extends Error {
  /** https://github.com/hapijs/boom#createstatuscode-message-data and https://github.com/hapijs/boom/blob/v4.3.0/lib/index.js#L99 */
  var data: Data
  /** isBoom - if true, indicates this is a Boom object instance. */
  var isBoom: Boolean
  /**
    * "If message is unset, the 'error' segment of the header will not be present and
    * isMissing will be true on the error object." mentioned in
    * @see {@link https://github.com/hapijs/boom#boomunauthorizedmessage-scheme-attributes}
    */
  var isMissing: js.UndefOr[Boolean] = js.undefined
  /** isServer - convenience bool indicating status code >= 500. */
  var isServer: Boolean
  /** output - the formatted response. Can be directly manipulated after object construction to return a custom error response. Allowed root keys: */
  var output: Output
  /** reformat() - rebuilds error.output using the other object properties. */
  def reformat(): String
  /** typeof - the constructor used to create the error (e.g. Boom.badRequest). */
  def typeof(): js.Any
}

object Boom {
  @scala.inline
  def apply[Data](
    data: Data,
    isBoom: Boolean,
    isServer: Boolean,
    message: String,
    name: String,
    output: Output,
    reformat: CallbackTo[String],
    typeof: CallbackTo[js.Any],
    isMissing: js.UndefOr[Boolean] = js.undefined,
    stack: String = null
  ): Boom[Data] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], isBoom = isBoom.asInstanceOf[js.Any], isServer = isServer.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any])
    __obj.updateDynamic("reformat")(reformat.toJsFn)
    __obj.updateDynamic("typeof")(typeof.toJsFn)
    if (!js.isUndefined(isMissing)) __obj.updateDynamic("isMissing")(isMissing.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[Boom[Data]]
  }
}

