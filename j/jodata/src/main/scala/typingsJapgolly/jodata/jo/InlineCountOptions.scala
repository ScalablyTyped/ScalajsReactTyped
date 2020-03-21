package typingsJapgolly.jodata.jo

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InlineCountOptions extends js.Object {
  def allPages(): typingsJapgolly.jodata.jo
  def none(): typingsJapgolly.jodata.jo
}

object InlineCountOptions {
  @scala.inline
  def apply(allPages: CallbackTo[typingsJapgolly.jodata.jo], none: CallbackTo[typingsJapgolly.jodata.jo]): InlineCountOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("allPages")(allPages.toJsFn)
    __obj.updateDynamic("none")(none.toJsFn)
    __obj.asInstanceOf[InlineCountOptions]
  }
}

