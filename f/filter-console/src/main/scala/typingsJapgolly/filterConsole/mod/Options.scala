package typingsJapgolly.filterConsole.mod

import typingsJapgolly.filterConsole.filterConsoleStrings.debug
import typingsJapgolly.filterConsole.filterConsoleStrings.error
import typingsJapgolly.filterConsole.filterConsoleStrings.info
import typingsJapgolly.filterConsole.filterConsoleStrings.log
import typingsJapgolly.filterConsole.filterConsoleStrings.warn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
  		Use a custom `console` object. Can be useful for testing or mocking.
  		@default console
  		*/
  val console: js.UndefOr[Console] = js.undefined
  /**
  		Console methods to filter.
  		@default ['log', 'debug', 'info', 'warn', 'error']
  		*/
  val methods: js.UndefOr[js.Array[log | debug | info | warn | error]] = js.undefined
}

object Options {
  @scala.inline
  def apply(console: Console = null, methods: js.Array[log | debug | info | warn | error] = null): Options = {
    val __obj = js.Dynamic.literal()
    if (console != null) __obj.updateDynamic("console")(console.asInstanceOf[js.Any])
    if (methods != null) __obj.updateDynamic("methods")(methods.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

