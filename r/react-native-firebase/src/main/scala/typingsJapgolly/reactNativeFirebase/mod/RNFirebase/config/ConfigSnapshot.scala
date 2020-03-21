package typingsJapgolly.reactNativeFirebase.mod.RNFirebase.config

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigSnapshot extends js.Object {
  var source: String
  def `val`(): js.Any
}

object ConfigSnapshot {
  @scala.inline
  def apply(source: String, `val`: CallbackTo[js.Any]): ConfigSnapshot = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("val")(`val`.toJsFn)
    __obj.asInstanceOf[ConfigSnapshot]
  }
}

