package typingsJapgolly.jestTypes.circusMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.jestTypes.jestTypesStrings.afterAll
  - typingsJapgolly.jestTypes.jestTypesStrings.beforeAll
*/
trait SharedHookType extends js.Object

object SharedHookType {
  @scala.inline
  def afterAll: typingsJapgolly.jestTypes.jestTypesStrings.afterAll = this.cast("afterAll")
  @scala.inline
  def beforeAll: typingsJapgolly.jestTypes.jestTypesStrings.beforeAll = this.cast("beforeAll")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

