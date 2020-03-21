package typingsJapgolly.dojo.dojox.lang

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/lang/async.html
  *
  *
  */
trait async_ extends js.Object {
  /**
    * Executes functions in parallel. As soon as one of them finishes
    * cancels the rest.
    *
    * @param x
    */
  def any(x: js.Any): Unit
  /**
    * Executes a condition, waits for it if necessary, and executes
    * one of two functions.
    *
    * @param cond
    * @param ifTrue
    * @param ifFalse
    */
  def ifThen(cond: js.Any, ifTrue: js.Any, ifFalse: js.Any): Unit
  /**
    * Executes a condition, waits for it if necessary, and executes
    * the body, if truthy value was returned.
    * Then it repeats the cycle until the condition function returns
    * a falsy value.
    *
    * @param cond
    * @param body
    */
  def loop(cond: js.Any, body: js.Any): Unit
  /**
    * Executes functions in parallel. Waits for all of them to finish.
    *
    * @param x
    */
  def par(x: js.Any): Unit
  /**
    * Executes a condition, waits for it if necessary, and executes
    * Nth function from list.
    *
    * @param cond
    * @param x
    */
  def select(cond: js.Any, x: js.Any): Unit
  /**
    * Executes functions sequentially. Waits if any of them returns Deferred.
    *
    * @param x
    */
  def seq(x: js.Any): Unit
}

object async_ {
  @scala.inline
  def apply(
    any: js.Any => Callback,
    ifThen: (js.Any, js.Any, js.Any) => Callback,
    loop: (js.Any, js.Any) => Callback,
    par: js.Any => Callback,
    select: (js.Any, js.Any) => Callback,
    seq: js.Any => Callback
  ): async_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("any")(js.Any.fromFunction1((t0: js.Any) => any(t0).runNow()))
    __obj.updateDynamic("ifThen")(js.Any.fromFunction3((t0: js.Any, t1: js.Any, t2: js.Any) => ifThen(t0, t1, t2).runNow()))
    __obj.updateDynamic("loop")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => loop(t0, t1).runNow()))
    __obj.updateDynamic("par")(js.Any.fromFunction1((t0: js.Any) => par(t0).runNow()))
    __obj.updateDynamic("select")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => select(t0, t1).runNow()))
    __obj.updateDynamic("seq")(js.Any.fromFunction1((t0: js.Any) => seq(t0).runNow()))
    __obj.asInstanceOf[async_]
  }
}

