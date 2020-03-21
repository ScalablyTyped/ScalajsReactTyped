package typingsJapgolly.jest.mod.jest

import typingsJapgolly.jest.jestStrings.`return`
import typingsJapgolly.jest.jestStrings.`throw`
import typingsJapgolly.jest.jestStrings.incomplete
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.jest.mod.jest.MockResultReturn[T]
  - typingsJapgolly.jest.mod.jest.MockResultThrow
  - typingsJapgolly.jest.mod.jest.MockResultIncomplete
*/
trait MockResult[T] extends js.Object

object MockResult {
  @scala.inline
  def MockResultReturn[T](`type`: `return`, value: T): MockResult[T] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MockResult[T]]
  }
  @scala.inline
  def MockResultThrow[T](`type`: `throw`, value: js.Any): MockResult[T] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MockResult[T]]
  }
  @scala.inline
  def MockResultIncomplete[T](`type`: incomplete, value: js.UndefOr[scala.Nothing] = js.undefined): MockResult[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[MockResult[T]]
  }
}

