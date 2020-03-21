package typingsJapgolly.protractorHttpMock.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.protractorHttpMock.mod.requests.PostData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Plugin for custom matching logic with 2 generic types.
  */
trait Plugin2[T1, T2] extends js.Object {
  /**
    * Match function.
    * Return a truthy value to indicate successfull match.
    *
    * @param mockRequest The mock to compare request with.
    * @param requestConfig The request object to compare mock with.
    */
  def `match`[O /* <: PostData[T1, T2] */](mockRequest: O, requestConfig: O): Boolean
}

object Plugin2 {
  @scala.inline
  def apply[T1, T2](`match`: (js.Any, js.Any) => CallbackTo[Boolean]): Plugin2[T1, T2] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("match")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => `match`(t0, t1).runNow()))
    __obj.asInstanceOf[Plugin2[T1, T2]]
  }
}

