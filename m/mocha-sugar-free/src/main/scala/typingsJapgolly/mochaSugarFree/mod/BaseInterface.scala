package typingsJapgolly.mochaSugarFree.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.mochaSugarFree.mochaSugarFreeStrings.bdd
import typingsJapgolly.mochaSugarFree.mochaSugarFreeStrings.qunit
import typingsJapgolly.mochaSugarFree.mochaSugarFreeStrings.tdd
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// #region Test functions
trait BaseInterface extends js.Object {
  /**
  		 * The detected Mocha interface.
  		 *
  		 * @default "bdd"
  		 */
  var detectedInterface: bdd | tdd | qunit
  /**
  		 * Triggers root suite execution.
  		 *
  		 * - _Only available if flag `--delay` is passed to Mocha._
  		 *
  		 * @see https://mochajs.org/api/global.html#runWithSuite
  		 */
  def run(): Unit
}

object BaseInterface {
  @scala.inline
  def apply(detectedInterface: bdd | tdd | qunit, run: Callback): BaseInterface = {
    val __obj = js.Dynamic.literal(detectedInterface = detectedInterface.asInstanceOf[js.Any])
    __obj.updateDynamic("run")(run.toJsFn)
    __obj.asInstanceOf[BaseInterface]
  }
}

