package typingsJapgolly.hapiJoi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typingsJapgolly.hapiJoi.mod._Schema because Already inherited */ @js.native
trait FunctionSchema
  extends ObjectSchema[js.Any] {
  /**
    * Specifies the arity of the function where:
    * @param n - the arity expected.
    */
  def arity(n: Double): this.type = js.native
  /**
    * Requires the function to be a class.
    */
  def `class`(): this.type = js.native
  /**
    * Specifies the minimal arity of the function where:
    * @param n - the minimal arity expected.
    */
  def maxArity(n: Double): this.type = js.native
  /**
    * Specifies the minimal arity of the function where:
    * @param n - the minimal arity expected.
    */
  def minArity(n: Double): this.type = js.native
}

