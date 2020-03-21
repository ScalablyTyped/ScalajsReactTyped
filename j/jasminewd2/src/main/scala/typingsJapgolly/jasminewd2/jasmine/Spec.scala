package typingsJapgolly.jasminewd2.jasmine

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Spec extends js.Object {
  def addMatchers(matchers: AsyncCustomMatcherFactories): Unit
}

object Spec {
  @scala.inline
  def apply(addMatchers: AsyncCustomMatcherFactories => Callback): Spec = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addMatchers")(js.Any.fromFunction1((t0: typingsJapgolly.jasminewd2.jasmine.AsyncCustomMatcherFactories) => addMatchers(t0).runNow()))
    __obj.asInstanceOf[Spec]
  }
}

