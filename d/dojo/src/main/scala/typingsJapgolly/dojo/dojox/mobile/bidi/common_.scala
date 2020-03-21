package typingsJapgolly.dojo.dojox.mobile.bidi

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/mobile/bidi/common.html
  *
  *
  */
trait common_ extends js.Object {
  /**
    *
    */
  var MARK: js.Object
  /**
    * Wraps by UCC (Unicode control characters) displayed text according to textDir.
    * There's a dir problem with some HTML elements. For some Android browsers Hebrew text is displayed right to left also
    * when dir is set to LTR.
    * Therefore the only solution is to use UCC to display the text in correct orientation.
    *
    * @param text The text to be wrapped.
    * @param textDir Text direction.
    */
  def enforceTextDirWithUcc(text: js.Any, textDir: js.Any): String
  /**
    * Removes UCC from input string.
    *
    * @param text The text to be stripped from UCC.
    */
  def removeUCCFromText(text: js.Any): js.Any
  /**
    * Sets textDir property to children.
    *
    * @param widget parent widget
    */
  def setTextDirForButtons(widget: js.Any): Unit
}

object common_ {
  @scala.inline
  def apply(
    MARK: js.Object,
    enforceTextDirWithUcc: (js.Any, js.Any) => CallbackTo[String],
    removeUCCFromText: js.Any => CallbackTo[js.Any],
    setTextDirForButtons: js.Any => Callback
  ): common_ = {
    val __obj = js.Dynamic.literal(MARK = MARK.asInstanceOf[js.Any])
    __obj.updateDynamic("enforceTextDirWithUcc")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => enforceTextDirWithUcc(t0, t1).runNow()))
    __obj.updateDynamic("removeUCCFromText")(js.Any.fromFunction1((t0: js.Any) => removeUCCFromText(t0).runNow()))
    __obj.updateDynamic("setTextDirForButtons")(js.Any.fromFunction1((t0: js.Any) => setTextDirForButtons(t0).runNow()))
    __obj.asInstanceOf[common_]
  }
}

