package typingsJapgolly.styletronStandard.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StandardEngine extends js.Object {
  def renderFontFace(fontFace: FontFace): String
  def renderKeyframes(keyframes: KeyframesObject): String
  def renderStyle(style: StyleObject): String
}

object StandardEngine {
  @scala.inline
  def apply(
    renderFontFace: FontFace => CallbackTo[String],
    renderKeyframes: KeyframesObject => CallbackTo[String],
    renderStyle: StyleObject => CallbackTo[String]
  ): StandardEngine = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("renderFontFace")(js.Any.fromFunction1((t0: typingsJapgolly.styletronStandard.mod.FontFace) => renderFontFace(t0).runNow()))
    __obj.updateDynamic("renderKeyframes")(js.Any.fromFunction1((t0: typingsJapgolly.styletronStandard.mod.KeyframesObject) => renderKeyframes(t0).runNow()))
    __obj.updateDynamic("renderStyle")(js.Any.fromFunction1((t0: typingsJapgolly.styletronStandard.mod.StyleObject) => renderStyle(t0).runNow()))
    __obj.asInstanceOf[StandardEngine]
  }
}

