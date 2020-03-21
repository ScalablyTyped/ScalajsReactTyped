package typingsJapgolly.rotJs.stringgeneratorMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StringGenerator extends js.Object {
  var _boundary: String
  var _data: StringDictionary[Events]
  var _options: Options
  var _prefix: js.Array[String]
  var _priorValues: StringDictionary[Double]
  var _suffix: String
  /**
    * @param {string[]}
    * @returns {string[]}
    */
  def _backoff(context: js.Array[String]): js.Array[String]
  /**
    * @param {string[]}
    * @returns {string}
    */
  def _join(arr: js.Array[String]): String
  /**
    * @param {string[]} context
    * @param {string} event
    */
  def _observeEvent(context: js.Array[String], event: String): Unit
  /**
    * @param {string[]}
    * @returns {string}
    */
  def _sample(context: js.Array[String]): String
  /**
    * @param {string}
    * @returns {string[]}
    */
  def _split(str: String): js.Array[String]
  /**
    * Remove all learning data
    */
  def clear(): Unit
  /**
    * @returns {string} Generated string
    */
  def generate(): String
  def getStats(): String
  /**
    * Observe (learn) a string from a training set
    */
  def observe(string: String): Unit
}

object StringGenerator {
  @scala.inline
  def apply(
    _backoff: js.Array[String] => CallbackTo[js.Array[String]],
    _boundary: String,
    _data: StringDictionary[Events],
    _join: js.Array[String] => CallbackTo[String],
    _observeEvent: (js.Array[String], String) => Callback,
    _options: Options,
    _prefix: js.Array[String],
    _priorValues: StringDictionary[Double],
    _sample: js.Array[String] => CallbackTo[String],
    _split: String => CallbackTo[js.Array[String]],
    _suffix: String,
    clear: Callback,
    generate: CallbackTo[String],
    getStats: CallbackTo[String],
    observe: String => Callback
  ): StringGenerator = {
    val __obj = js.Dynamic.literal(_boundary = _boundary.asInstanceOf[js.Any], _data = _data.asInstanceOf[js.Any], _options = _options.asInstanceOf[js.Any], _prefix = _prefix.asInstanceOf[js.Any], _priorValues = _priorValues.asInstanceOf[js.Any], _suffix = _suffix.asInstanceOf[js.Any])
    __obj.updateDynamic("_backoff")(js.Any.fromFunction1((t0: js.Array[java.lang.String]) => _backoff(t0).runNow()))
    __obj.updateDynamic("_join")(js.Any.fromFunction1((t0: js.Array[java.lang.String]) => _join(t0).runNow()))
    __obj.updateDynamic("_observeEvent")(js.Any.fromFunction2((t0: js.Array[java.lang.String], t1: java.lang.String) => _observeEvent(t0, t1).runNow()))
    __obj.updateDynamic("_sample")(js.Any.fromFunction1((t0: js.Array[java.lang.String]) => _sample(t0).runNow()))
    __obj.updateDynamic("_split")(js.Any.fromFunction1((t0: java.lang.String) => _split(t0).runNow()))
    __obj.updateDynamic("clear")(clear.toJsFn)
    __obj.updateDynamic("generate")(generate.toJsFn)
    __obj.updateDynamic("getStats")(getStats.toJsFn)
    __obj.updateDynamic("observe")(js.Any.fromFunction1((t0: java.lang.String) => observe(t0).runNow()))
    __obj.asInstanceOf[StringGenerator]
  }
}

