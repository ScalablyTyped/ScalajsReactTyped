package typingsJapgolly.pEvent.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options[EmittedType /* <: js.Array[_] */] extends js.Object {
  /**
  		Filter function for accepting an event.
  		@example
  		```
  		import pEvent = require('p-event');
  		import emitter from './some-event-emitter';
  		(async () => {
  			const result = await pEvent(emitter, '🦄', value => value > 3);
  			// Do something with first 🦄 event with a value greater than 3
  		})();
  		```
  		*/
  val filter: js.UndefOr[FilterFunction[EmittedType]] = js.undefined
  /**
  		By default, the promisified function will only return the first argument from the event callback, which works fine for most APIs. This option can be useful for APIs that return multiple arguments in the callback. Turning this on will make it return an array of all arguments from the callback, instead of just the first argument. This also applies to rejections.
  		@default false
  		@example
  		```
  		import pEvent = require('p-event');
  		import emitter from './some-event-emitter';
  		(async () => {
  			const [foo, bar] = await pEvent(emitter, 'finish', {multiArgs: true});
  		})();
  		```
  		*/
  val multiArgs: js.UndefOr[Boolean] = js.undefined
  /**
  		Events that will reject the promise.
  		@default ['error']
  		*/
  val rejectionEvents: js.UndefOr[js.Array[String | js.Symbol]] = js.undefined
  /**
  		Time in milliseconds before timing out.
  		@default Infinity
  		*/
  val timeout: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply[EmittedType /* <: js.Array[_] */](
    filter: EmittedType => CallbackTo[Boolean] = null,
    multiArgs: js.UndefOr[Boolean] = js.undefined,
    rejectionEvents: js.Array[String | js.Symbol] = null,
    timeout: Int | Double = null
  ): Options[EmittedType] = {
    val __obj = js.Dynamic.literal()
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction1((t0: EmittedType) => filter(t0).runNow()))
    if (!js.isUndefined(multiArgs)) __obj.updateDynamic("multiArgs")(multiArgs.asInstanceOf[js.Any])
    if (rejectionEvents != null) __obj.updateDynamic("rejectionEvents")(rejectionEvents.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options[EmittedType]]
  }
}

