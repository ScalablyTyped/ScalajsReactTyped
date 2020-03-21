package typingsJapgolly.reactTagsinput.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderTagProps extends TagProps {
  val disabled: Boolean
  val tag: Tag
  def getTagDisplayValue(tag: Tag): String
  def onRemove(tagIndex: Double): Unit
}

object RenderTagProps {
  @scala.inline
  def apply(
    disabled: Boolean,
    getTagDisplayValue: Tag => CallbackTo[String],
    onRemove: Double => Callback,
    tag: Tag,
    StringDictionary: StringDictionary[js.Any] = null
  ): RenderTagProps = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    __obj.updateDynamic("getTagDisplayValue")(js.Any.fromFunction1((t0: typingsJapgolly.reactTagsinput.mod.Tag) => getTagDisplayValue(t0).runNow()))
    __obj.updateDynamic("onRemove")(js.Any.fromFunction1((t0: scala.Double) => onRemove(t0).runNow()))
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[RenderTagProps]
  }
}

