package typingsJapgolly.spex

import org.scalablytyped.runtime.Instantiable0
import typingsJapgolly.spex.mod.errors.BatchError
import typingsJapgolly.spex.mod.errors.PageError
import typingsJapgolly.spex.mod.errors.SequenceError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeoferrors extends js.Object {
  // API: http://vitaly-t.github.io/spex/errors.BatchError.html
  var BatchError: Instantiable0[typingsJapgolly.spex.mod.errors.BatchError]
  // API: http://vitaly-t.github.io/spex/errors.PageError.html
  var PageError: Instantiable0[typingsJapgolly.spex.mod.errors.PageError]
  // API: http://vitaly-t.github.io/spex/errors.SequenceError.html
  var SequenceError: Instantiable0[typingsJapgolly.spex.mod.errors.SequenceError]
}

object Typeoferrors {
  @scala.inline
  def apply(
    BatchError: Instantiable0[BatchError],
    PageError: Instantiable0[PageError],
    SequenceError: Instantiable0[SequenceError]
  ): Typeoferrors = {
    val __obj = js.Dynamic.literal(BatchError = BatchError.asInstanceOf[js.Any], PageError = PageError.asInstanceOf[js.Any], SequenceError = SequenceError.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Typeoferrors]
  }
}

