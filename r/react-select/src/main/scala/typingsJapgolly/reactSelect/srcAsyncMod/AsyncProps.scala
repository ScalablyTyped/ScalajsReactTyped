package typingsJapgolly.reactSelect.srcAsyncMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.reactSelect.typesMod.OptionTypeBase
import typingsJapgolly.reactSelect.typesMod.OptionsType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsyncProps[OptionType /* <: OptionTypeBase */] extends js.Object {
  /* If cacheOptions is truthy, then the loaded data will be cached. The cache
    will remain until `cacheOptions` changes value.
    Default: false. */
  var cacheOptions: js.UndefOr[js.Any] = js.undefined
  /* The default set of options to show before the user starts searching. When
    set to `true`, the results for loadOptions('') will be autoloaded.
    Default: false. */
  var defaultOptions: js.UndefOr[OptionsType[OptionType] | Boolean] = js.undefined
  /* Function that returns a promise, which is the set of options to be used
    once the promise resolves. */
  def loadOptions(inputValue: String, callback: js.Function1[/* options */ OptionsType[OptionType], Unit]): js.Promise[_] | Unit
}

object AsyncProps {
  @scala.inline
  def apply[OptionType /* <: OptionTypeBase */](
    loadOptions: (String, js.Function1[/* options */ OptionsType[OptionType], Unit]) => CallbackTo[js.Promise[js.Any] | Unit],
    cacheOptions: js.Any = null,
    defaultOptions: OptionsType[OptionType] | Boolean = null
  ): AsyncProps[OptionType] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("loadOptions")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[
  /* options */ typingsJapgolly.reactSelect.typesMod.OptionsType[OptionType], 
  scala.Unit]) => loadOptions(t0, t1).runNow()))
    if (cacheOptions != null) __obj.updateDynamic("cacheOptions")(cacheOptions.asInstanceOf[js.Any])
    if (defaultOptions != null) __obj.updateDynamic("defaultOptions")(defaultOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsyncProps[OptionType]]
  }
}

