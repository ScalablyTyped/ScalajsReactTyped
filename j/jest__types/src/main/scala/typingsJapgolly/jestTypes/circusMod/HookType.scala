package typingsJapgolly.jestTypes.circusMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.jestTypes.jestTypesStrings.afterEach
  - typingsJapgolly.jestTypes.jestTypesStrings.beforeEach
  - typingsJapgolly.jestTypes.jestTypesStrings.afterAll
  - typingsJapgolly.jestTypes.jestTypesStrings.beforeAll
*/
trait HookType extends js.Object

object HookType {
  @scala.inline
  def afterAll: typingsJapgolly.jestTypes.jestTypesStrings.afterAll = this.cast("afterAll")
  @scala.inline
  def afterEach: typingsJapgolly.jestTypes.jestTypesStrings.afterEach = this.cast("afterEach")
  @scala.inline
  def beforeAll: typingsJapgolly.jestTypes.jestTypesStrings.beforeAll = this.cast("beforeAll")
  @scala.inline
  def beforeEach: typingsJapgolly.jestTypes.jestTypesStrings.beforeEach = this.cast("beforeEach")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

