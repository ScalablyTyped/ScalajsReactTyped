package typingsJapgolly.jest.mod.jest

import typingsJapgolly.jest.Typeofjest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest", "jest.retryTimes")
@js.native
object retryTimes extends js.Object {
  /**
    * Runs failed tests n-times until they pass or until the max number of retries is exhausted.
    * This only works with jest-circus!
    */
  def apply(numRetries: Double): Typeofjest = js.native
}

