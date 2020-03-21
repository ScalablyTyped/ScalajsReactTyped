package typingsJapgolly.aphrodite.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Calling StyleSheet.extend() returns an object with each of the exported
  * properties on it.
  */
trait Exports extends js.Object {
  var StyleSheet: StyleSheetStatic
  var StyleSheetServer: StyleSheetServerStatic
  var StyleSheetTestUtils: StyleSheetTestUtilsStatic
  def css(styles: CSSInputTypes*): String
  def flushToStyleTag(): Unit
}

object Exports {
  @scala.inline
  def apply(
    StyleSheet: StyleSheetStatic,
    StyleSheetServer: StyleSheetServerStatic,
    StyleSheetTestUtils: StyleSheetTestUtilsStatic,
    css: /* repeated */ CSSInputTypes => CallbackTo[String],
    flushToStyleTag: Callback
  ): Exports = {
    val __obj = js.Dynamic.literal(StyleSheet = StyleSheet.asInstanceOf[js.Any], StyleSheetServer = StyleSheetServer.asInstanceOf[js.Any], StyleSheetTestUtils = StyleSheetTestUtils.asInstanceOf[js.Any])
    __obj.updateDynamic("css")(js.Any.fromFunction1((t0: /* repeated */ typingsJapgolly.aphrodite.mod.CSSInputTypes) => css(t0).runNow()))
    __obj.updateDynamic("flushToStyleTag")(flushToStyleTag.toJsFn)
    __obj.asInstanceOf[Exports]
  }
}

