package typingsJapgolly.eggCore.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.eggCore.AnonPath
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileLoaderOption extends js.Object {
  /** determine whether invoke when exports is function */
  var call: js.UndefOr[Boolean] = js.undefined
  /** set property's case when converting a filepath to property list. */
  var caseStyle: js.UndefOr[String | (js.Function1[/* str */ String, js.Array[String]])] = js.undefined
  /** directories to be loaded */
  var directory: String | js.Array[String]
  /** a function that filter the exports which can be loaded */
  var filter: js.UndefOr[js.Function1[/* obj */ js.Object, Boolean]] = js.undefined
  /** ignore the files when load, support glob */
  var ignore: js.UndefOr[String | js.Array[String]] = js.undefined
  /** custom file exports, receive two parameters, first is the inject object(if not js file, will be content buffer), second is an `options` object that contain `path` */
  var initializer: js.UndefOr[js.Function2[/* obj */ js.Object, /* options */ AnonPath, _]] = js.undefined
  /** an object that be the argument when invoke the function */
  var inject: js.UndefOr[js.Object] = js.undefined
  /** match the files when load, support glob, default to all js files */
  var `match`: js.UndefOr[String | js.Array[String]] = js.undefined
  /** determine whether override the property when get the same name */
  var `override`: js.UndefOr[Boolean] = js.undefined
  /** attach the target object from loaded files */
  var target: js.Object
}

object FileLoaderOption {
  @scala.inline
  def apply(
    directory: String | js.Array[String],
    target: js.Object,
    call: js.UndefOr[Boolean] = js.undefined,
    caseStyle: String | (js.Function1[/* str */ String, js.Array[String]]) = null,
    filter: /* obj */ js.Object => CallbackTo[Boolean] = null,
    ignore: String | js.Array[String] = null,
    initializer: (/* obj */ js.Object, /* options */ AnonPath) => CallbackTo[js.Any] = null,
    inject: js.Object = null,
    `match`: String | js.Array[String] = null,
    `override`: js.UndefOr[Boolean] = js.undefined
  ): FileLoaderOption = {
    val __obj = js.Dynamic.literal(directory = directory.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    if (!js.isUndefined(call)) __obj.updateDynamic("call")(call.asInstanceOf[js.Any])
    if (caseStyle != null) __obj.updateDynamic("caseStyle")(caseStyle.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction1((t0: /* obj */ js.Object) => filter(t0).runNow()))
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (initializer != null) __obj.updateDynamic("initializer")(js.Any.fromFunction2((t0: /* obj */ js.Object, t1: /* options */ typingsJapgolly.eggCore.AnonPath) => initializer(t0, t1).runNow()))
    if (inject != null) __obj.updateDynamic("inject")(inject.asInstanceOf[js.Any])
    if (`match` != null) __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    if (!js.isUndefined(`override`)) __obj.updateDynamic("override")(`override`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileLoaderOption]
  }
}

