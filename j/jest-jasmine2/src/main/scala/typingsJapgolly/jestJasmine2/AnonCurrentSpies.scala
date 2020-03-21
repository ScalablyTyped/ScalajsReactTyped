package typingsJapgolly.jestJasmine2

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.jestJasmine2.typesMod.Spy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCurrentSpies extends js.Object {
  var currentSpies: js.UndefOr[js.Function0[js.Array[Spy]]] = js.undefined
}

object AnonCurrentSpies {
  @scala.inline
  def apply(currentSpies: js.UndefOr[CallbackTo[js.Array[Spy]]] = js.undefined): AnonCurrentSpies = {
    val __obj = js.Dynamic.literal()
    currentSpies.foreach(p => __obj.updateDynamic("currentSpies")(p.toJsFn))
    __obj.asInstanceOf[AnonCurrentSpies]
  }
}

