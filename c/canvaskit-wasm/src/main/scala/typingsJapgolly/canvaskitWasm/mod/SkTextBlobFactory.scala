package typingsJapgolly.canvaskitWasm.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SkTextBlobFactory extends js.Object {
  def MakeFromText(text: String, font: SkFont): SkTextBlob
}

object SkTextBlobFactory {
  @scala.inline
  def apply(MakeFromText: (String, SkFont) => CallbackTo[SkTextBlob]): SkTextBlobFactory = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("MakeFromText")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.canvaskitWasm.mod.SkFont) => MakeFromText(t0, t1).runNow()))
    __obj.asInstanceOf[SkTextBlobFactory]
  }
}

