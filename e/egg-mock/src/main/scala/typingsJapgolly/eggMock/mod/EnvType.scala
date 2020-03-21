package typingsJapgolly.eggMock.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.eggMock.eggMockStrings.default
  - typingsJapgolly.eggMock.eggMockStrings.test
  - typingsJapgolly.eggMock.eggMockStrings.prod
  - typingsJapgolly.eggMock.eggMockStrings.local
  - typingsJapgolly.eggMock.eggMockStrings.unittest
*/
trait EnvType extends js.Object

object EnvType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def default: typingsJapgolly.eggMock.eggMockStrings.default = this.cast("default")
  @scala.inline
  def local: typingsJapgolly.eggMock.eggMockStrings.local = this.cast("local")
  @scala.inline
  def prod: typingsJapgolly.eggMock.eggMockStrings.prod = this.cast("prod")
  @scala.inline
  def test: typingsJapgolly.eggMock.eggMockStrings.test = this.cast("test")
  @scala.inline
  def unittest: typingsJapgolly.eggMock.eggMockStrings.unittest = this.cast("unittest")
}

