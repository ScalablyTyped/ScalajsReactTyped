package typingsJapgolly.sequelize.mod

import typingsJapgolly.lodash.mod.LoDashStatic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SequelizeLoDash extends LoDashStatic {
  def camelizeIf(str: String, condition: Boolean): String = js.native
  /**
    * * Returns an array with some falsy values removed. The values null, "", undefined and NaN are considered
    * falsey.
    *
    * @param arr Array to compact.
    */
  def compactLite[T](arr: js.Array[T]): js.Array[T] = js.native
  def matchesDots(dots: String, value: js.Object): js.Function1[/* item */ js.Object, Boolean] = js.native
  def matchesDots(dots: js.Array[String], value: js.Object): js.Function1[/* item */ js.Object, Boolean] = js.native
  def underscoredIf(str: String, condition: Boolean): String = js.native
}

