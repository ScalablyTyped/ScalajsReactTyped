package typingsJapgolly.hammerjs

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttrRecognizerStatic extends js.Object {
  def attrTest(input: HammerInput): Boolean
  def process(input: HammerInput): js.Any
}

object AttrRecognizerStatic {
  @scala.inline
  def apply(attrTest: HammerInput => CallbackTo[Boolean], process: HammerInput => CallbackTo[js.Any]): AttrRecognizerStatic = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("attrTest")(js.Any.fromFunction1((t0: typingsJapgolly.hammerjs.HammerInput) => attrTest(t0).runNow()))
    __obj.updateDynamic("process")(js.Any.fromFunction1((t0: typingsJapgolly.hammerjs.HammerInput) => process(t0).runNow()))
    __obj.asInstanceOf[AttrRecognizerStatic]
  }
}

