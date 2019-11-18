package typingsJapgolly.vue.typesVueMod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VueConfiguration extends js.Object {
  var async: Boolean
  var devtools: Boolean
  var ignoredElements: js.Array[String | js.RegExp]
  var keyCodes: StringDictionary[Double | js.Array[Double]]
  var optionMergeStrategies: js.Any
  var performance: Boolean
  var productionTip: Boolean
  var silent: Boolean
  def errorHandler(err: js.Error, vm: Vue, info: String): Unit
  def warnHandler(msg: String, vm: Vue, trace: String): Unit
}

object VueConfiguration {
  @scala.inline
  def apply(
    async: Boolean,
    devtools: Boolean,
    errorHandler: (js.Error, Vue, String) => Callback,
    ignoredElements: js.Array[String | js.RegExp],
    keyCodes: StringDictionary[Double | js.Array[Double]],
    optionMergeStrategies: js.Any,
    performance: Boolean,
    productionTip: Boolean,
    silent: Boolean,
    warnHandler: (String, Vue, String) => Callback
  ): VueConfiguration = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], devtools = devtools.asInstanceOf[js.Any], ignoredElements = ignoredElements.asInstanceOf[js.Any], keyCodes = keyCodes.asInstanceOf[js.Any], optionMergeStrategies = optionMergeStrategies.asInstanceOf[js.Any], performance = performance.asInstanceOf[js.Any], productionTip = productionTip.asInstanceOf[js.Any], silent = silent.asInstanceOf[js.Any])
    __obj.updateDynamic("errorHandler")(js.Any.fromFunction3((t0: js.Error, t1: typingsJapgolly.vue.typesVueMod.Vue, t2: java.lang.String) => errorHandler(t0, t1, t2).runNow()))
    __obj.updateDynamic("warnHandler")(js.Any.fromFunction3((t0: java.lang.String, t1: typingsJapgolly.vue.typesVueMod.Vue, t2: java.lang.String) => warnHandler(t0, t1, t2).runNow()))
    __obj.asInstanceOf[VueConfiguration]
  }
}

