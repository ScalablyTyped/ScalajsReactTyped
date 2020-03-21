package typingsJapgolly.jest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRejects[TPromise /* <: js.Object */] extends js.Object {
  /**
    * Unwraps the reason of a rejected promise so any other matcher can be chained.
    * If the promise is fulfilled the assertion fails.
    */
  var rejects: typingsJapgolly.jest.mod.jest.AndNot[TPromise]
  /**
    * Use resolves to unwrap the value of a fulfilled promise so any other
    * matcher can be chained. If the promise is rejected the assertion fails.
    */
  var resolves: typingsJapgolly.jest.mod.jest.AndNot[TPromise]
}

object AnonRejects {
  @scala.inline
  def apply[TPromise /* <: js.Object */](
    rejects: typingsJapgolly.jest.mod.jest.AndNot[TPromise],
    resolves: typingsJapgolly.jest.mod.jest.AndNot[TPromise]
  ): AnonRejects[TPromise] = {
    val __obj = js.Dynamic.literal(rejects = rejects.asInstanceOf[js.Any], resolves = resolves.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonRejects[TPromise]]
  }
}

