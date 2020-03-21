package typingsJapgolly.reactTagsinput.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Element
import typingsJapgolly.reactTagsinput.AnonValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderInputProps extends InputProps {
   // parameter is either a DOM element or a mounted React component
  val value: Tag
  def addTag(tag: Tag): Unit
  def onChange(e: ReactEventFrom[AnonValue with Element]): Unit
  def ref(r: js.Any): Unit
}

object RenderInputProps {
  @scala.inline
  def apply(
    addTag: Tag => Callback,
    onChange: ReactEventFrom[AnonValue with Element] => Callback,
    ref: js.Any => Callback,
    value: Tag,
    StringDictionary: StringDictionary[js.Any] = null
  ): RenderInputProps = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("addTag")(js.Any.fromFunction1((t0: typingsJapgolly.reactTagsinput.mod.Tag) => addTag(t0).runNow()))
    __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.reactTagsinput.AnonValue with org.scalajs.dom.raw.Element]) => onChange(t0).runNow()))
    __obj.updateDynamic("ref")(js.Any.fromFunction1((t0: js.Any) => ref(t0).runNow()))
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[RenderInputProps]
  }
}

