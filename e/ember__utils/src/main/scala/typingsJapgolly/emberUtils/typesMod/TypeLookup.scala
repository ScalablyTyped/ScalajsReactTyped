package typingsJapgolly.emberUtils.typesMod

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.FileList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeLookup extends js.Object {
  var array: js.Array[_]
  var boolean: Boolean
  var date: js.Date
  var error: js.Error
  var filelist: FileList
  var `null`: Null
  var number: Double
  var regexp: js.RegExp
  var string: String
  var undefined: js.UndefOr[scala.Nothing] = js.undefined
  def function(args: js.Any*): js.Any
}

object TypeLookup {
  @scala.inline
  def apply(
    array: js.Array[_],
    boolean: Boolean,
    date: js.Date,
    error: js.Error,
    filelist: FileList,
    function: /* repeated */ js.Any => CallbackTo[js.Any],
    `null`: Null,
    number: Double,
    regexp: js.RegExp,
    string: String,
    undefined: js.UndefOr[scala.Nothing] = js.undefined
  ): TypeLookup = {
    val __obj = js.Dynamic.literal(array = array.asInstanceOf[js.Any], boolean = boolean.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], filelist = filelist.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], regexp = regexp.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any])
    __obj.updateDynamic("function")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => function(t0).runNow()))
    __obj.updateDynamic("null")(`null`.asInstanceOf[js.Any])
    if (!js.isUndefined(undefined)) __obj.updateDynamic("undefined")(undefined.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeLookup]
  }
}

