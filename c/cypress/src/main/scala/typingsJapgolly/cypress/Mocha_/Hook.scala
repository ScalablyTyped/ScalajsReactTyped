package typingsJapgolly.cypress.Mocha_

import typingsJapgolly.cypress.cypressStrings.hook
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// #endregion Runner untyped events
/**
  * Initialize a new `Hook` with the given `title` and callback `fn`
  *
  * @see https://mochajs.org/api/Hook.html
  */
@JSGlobal("Mocha.Hook")
@js.native
class Hook () extends Runnable {
  var _error: js.Any = js.native
  var originalTitle: js.UndefOr[String] = js.native
  var `type`: hook = js.native
   // added by Runner
  /**
    * Get the test `err`.
    *
    * @see https://mochajs.org/api/Hook.html#error
    */
  def error(): js.Any = js.native
  /**
    * Set the test `err`.
    *
    * @see https://mochajs.org/api/Hook.html#error
    */
  def error(err: js.Any): Unit = js.native
}

