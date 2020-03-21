package typingsJapgolly.plotlyJs.mod

import typingsJapgolly.plotlyJs.plotlyJsStrings.`back-in-out`
import typingsJapgolly.plotlyJs.plotlyJsStrings.`back-in`
import typingsJapgolly.plotlyJs.plotlyJsStrings.`back-out`
import typingsJapgolly.plotlyJs.plotlyJsStrings.`bounce-in-out`
import typingsJapgolly.plotlyJs.plotlyJsStrings.`bounce-in`
import typingsJapgolly.plotlyJs.plotlyJsStrings.`bounce-out`
import typingsJapgolly.plotlyJs.plotlyJsStrings.`circle-in-out`
import typingsJapgolly.plotlyJs.plotlyJsStrings.`circle-in`
import typingsJapgolly.plotlyJs.plotlyJsStrings.`circle-out`
import typingsJapgolly.plotlyJs.plotlyJsStrings.`cubic-in-out`
import typingsJapgolly.plotlyJs.plotlyJsStrings.`cubic-in`
import typingsJapgolly.plotlyJs.plotlyJsStrings.`cubic-out`
import typingsJapgolly.plotlyJs.plotlyJsStrings.`elastic-in-out`
import typingsJapgolly.plotlyJs.plotlyJsStrings.`elastic-in`
import typingsJapgolly.plotlyJs.plotlyJsStrings.`elastic-out`
import typingsJapgolly.plotlyJs.plotlyJsStrings.`exp-in-out`
import typingsJapgolly.plotlyJs.plotlyJsStrings.`exp-in`
import typingsJapgolly.plotlyJs.plotlyJsStrings.`exp-out`
import typingsJapgolly.plotlyJs.plotlyJsStrings.`linear-in-out`
import typingsJapgolly.plotlyJs.plotlyJsStrings.`linear-in`
import typingsJapgolly.plotlyJs.plotlyJsStrings.`linear-out`
import typingsJapgolly.plotlyJs.plotlyJsStrings.`quad-in-out`
import typingsJapgolly.plotlyJs.plotlyJsStrings.`quad-in`
import typingsJapgolly.plotlyJs.plotlyJsStrings.`quad-out`
import typingsJapgolly.plotlyJs.plotlyJsStrings.`sin-in-out`
import typingsJapgolly.plotlyJs.plotlyJsStrings.`sin-in`
import typingsJapgolly.plotlyJs.plotlyJsStrings.`sin-out`
import typingsJapgolly.plotlyJs.plotlyJsStrings.back
import typingsJapgolly.plotlyJs.plotlyJsStrings.bounce
import typingsJapgolly.plotlyJs.plotlyJsStrings.circle
import typingsJapgolly.plotlyJs.plotlyJsStrings.cubic
import typingsJapgolly.plotlyJs.plotlyJsStrings.elastic
import typingsJapgolly.plotlyJs.plotlyJsStrings.exp
import typingsJapgolly.plotlyJs.plotlyJsStrings.linear
import typingsJapgolly.plotlyJs.plotlyJsStrings.quad
import typingsJapgolly.plotlyJs.plotlyJsStrings.sin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Transition extends js.Object {
  /**
  	 * Sets the duration of the slider transition
  	 */
  var duration: Double
  /**
  	 * Sets the easing function of the slider transition
  	 */
  var easing: linear | quad | cubic | sin | exp | circle | elastic | back | bounce | `linear-in` | `quad-in` | `cubic-in` | `sin-in` | `exp-in` | `circle-in` | `elastic-in` | `back-in` | `bounce-in` | `linear-out` | `quad-out` | `cubic-out` | `sin-out` | `exp-out` | `circle-out` | `elastic-out` | `back-out` | `bounce-out` | `linear-in-out` | `quad-in-out` | `cubic-in-out` | `sin-in-out` | `exp-in-out` | `circle-in-out` | `elastic-in-out` | `back-in-out` | `bounce-in-out`
}

object Transition {
  @scala.inline
  def apply(
    duration: Double,
    easing: linear | quad | cubic | sin | exp | circle | elastic | back | bounce | `linear-in` | `quad-in` | `cubic-in` | `sin-in` | `exp-in` | `circle-in` | `elastic-in` | `back-in` | `bounce-in` | `linear-out` | `quad-out` | `cubic-out` | `sin-out` | `exp-out` | `circle-out` | `elastic-out` | `back-out` | `bounce-out` | `linear-in-out` | `quad-in-out` | `cubic-in-out` | `sin-in-out` | `exp-in-out` | `circle-in-out` | `elastic-in-out` | `back-in-out` | `bounce-in-out`
  ): Transition = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], easing = easing.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Transition]
  }
}

