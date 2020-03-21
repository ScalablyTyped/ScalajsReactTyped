package typingsJapgolly.mocha.Mocha_

import typingsJapgolly.mocha.mochaStrings.fast
import typingsJapgolly.mocha.mochaStrings.medium
import typingsJapgolly.mocha.mochaStrings.slow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Initialize a new `Test` with the given `title` and callback `fn`.
  *
  * @see https://mochajs.org/api/Test.html
  */
@JSGlobal("Mocha.Test")
@js.native
class Test_ () extends Runnable {
   // added by reporters
  var err: js.UndefOr[js.Error] = js.native
  var speed: js.UndefOr[slow | medium | fast] = js.native
  var `type`: typingsJapgolly.mocha.mochaStrings.test = js.native
}

