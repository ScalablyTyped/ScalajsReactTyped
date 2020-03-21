package typingsJapgolly.mochaPhantomjs

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Window extends js.Object {
  def mochaPhantomJS(): MochaPhantomJsWindowOptions
}

object Window {
  @scala.inline
  def apply(mochaPhantomJS: CallbackTo[MochaPhantomJsWindowOptions]): Window = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("mochaPhantomJS")(mochaPhantomJS.toJsFn)
    __obj.asInstanceOf[Window]
  }
}

