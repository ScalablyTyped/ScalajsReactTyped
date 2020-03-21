package typingsJapgolly.canvaskitWasm.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SkParagraphBuilderFactory extends js.Object {
  def Make(style: SkParagraphStyle, fontManager: SkFontManager): SkParagraphBuilder
}

object SkParagraphBuilderFactory {
  @scala.inline
  def apply(Make: (SkParagraphStyle, SkFontManager) => CallbackTo[SkParagraphBuilder]): SkParagraphBuilderFactory = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Make")(js.Any.fromFunction2((t0: typingsJapgolly.canvaskitWasm.mod.SkParagraphStyle, t1: typingsJapgolly.canvaskitWasm.mod.SkFontManager) => Make(t0, t1).runNow()))
    __obj.asInstanceOf[SkParagraphBuilderFactory]
  }
}

