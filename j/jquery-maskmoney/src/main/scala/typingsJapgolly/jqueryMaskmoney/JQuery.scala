package typingsJapgolly.jqueryMaskmoney

import typingsJapgolly.jqueryMaskmoney.jQueryMaskMoney.Options
import typingsJapgolly.jqueryMaskmoney.jqueryMaskmoneyStrings.destroy
import typingsJapgolly.jqueryMaskmoney.jqueryMaskmoneyStrings.mask
import typingsJapgolly.jqueryMaskmoney.jqueryMaskmoneyStrings.unmasked
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  /**
    * Apply mask to input when the argument are options
    * Remove maskMoney from an element when the argument is "destroy"
    */
  def maskMoney(): JQuery = js.native
  def maskMoney(methodOrOption: Options): JQuery = js.native
  /**
    * Returns a float value from input field masked
    */
  @JSName("maskMoney")
  def maskMoney_Array(): js.Array[Double] = js.native
  @JSName("maskMoney")
  def maskMoney_destroy(methodOrOption: destroy): JQuery = js.native
  /**
    * Apply mask to input, can be pass default value to it
    */
  @JSName("maskMoney")
  def maskMoney_mask(methodName: mask): JQuery = js.native
  @JSName("maskMoney")
  def maskMoney_mask(methodName: mask, defaultValue: Double): JQuery = js.native
  @JSName("maskMoney")
  def maskMoney_unmasked(method: unmasked): js.Array[Double] = js.native
}

