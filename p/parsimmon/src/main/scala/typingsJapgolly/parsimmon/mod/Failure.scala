package typingsJapgolly.parsimmon.mod

import typingsJapgolly.parsimmon.parsimmonBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Failure
  extends Result[js.Any] {
  var expected: js.Array[String]
  var index: Index_
  var status: `false`
}

object Failure {
  @scala.inline
  def apply(expected: js.Array[String], index: Index_, status: `false`): Failure = {
    val __obj = js.Dynamic.literal(expected = expected.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Failure]
  }
}

