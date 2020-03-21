package typingsJapgolly.canvaskitWasm.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SkParagraphBuilder extends SkObject[SkParagraphBuilder] {
  def addText(value: String): Unit
  def build(): SkParagraph
  def pop(): Unit
  def pushStyle(value: SkTextStyle): Unit
}

object SkParagraphBuilder {
  @scala.inline
  def apply(
    addText: String => Callback,
    build: CallbackTo[SkParagraph],
    delete: Callback,
    deleteAfter: Callback,
    isAliasOf: js.Any => CallbackTo[Boolean],
    isDeleted: CallbackTo[Boolean],
    pop: Callback,
    pushStyle: SkTextStyle => Callback
  ): SkParagraphBuilder = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addText")(js.Any.fromFunction1((t0: java.lang.String) => addText(t0).runNow()))
    __obj.updateDynamic("build")(build.toJsFn)
    __obj.updateDynamic("delete")(delete.toJsFn)
    __obj.updateDynamic("deleteAfter")(deleteAfter.toJsFn)
    __obj.updateDynamic("isAliasOf")(js.Any.fromFunction1((t0: js.Any) => isAliasOf(t0).runNow()))
    __obj.updateDynamic("isDeleted")(isDeleted.toJsFn)
    __obj.updateDynamic("pop")(pop.toJsFn)
    __obj.updateDynamic("pushStyle")(js.Any.fromFunction1((t0: typingsJapgolly.canvaskitWasm.mod.SkTextStyle) => pushStyle(t0).runNow()))
    __obj.asInstanceOf[SkParagraphBuilder]
  }
}

