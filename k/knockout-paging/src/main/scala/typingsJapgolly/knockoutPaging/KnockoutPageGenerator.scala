package typingsJapgolly.knockoutPaging

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KnockoutPageGenerator extends js.Object {
  def generate[T](pagedObservable: KnockoutPagedObservableArray[T]): js.Array[Double]
}

object KnockoutPageGenerator {
  @scala.inline
  def apply(generate: KnockoutPagedObservableArray[js.Any] => CallbackTo[js.Array[Double]]): KnockoutPageGenerator = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("generate")(js.Any.fromFunction1((t0: typingsJapgolly.knockoutPaging.KnockoutPagedObservableArray[js.Any]) => generate(t0).runNow()))
    __obj.asInstanceOf[KnockoutPageGenerator]
  }
}

