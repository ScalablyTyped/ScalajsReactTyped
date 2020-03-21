package typingsJapgolly.reachCombobox.mod

import typingsJapgolly.react.mod.AllHTMLAttributes
import typingsJapgolly.react.mod.ClassAttributes
import typingsJapgolly.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComboboxOptionProps
  extends AllHTMLAttributes[HTMLElement]
     with ClassAttributes[HTMLElement] {
  @JSName("value")
  var value_ComboboxOptionProps: String
}

object ComboboxOptionProps {
  @scala.inline
  def apply(
    value: String,
    AllHTMLAttributes: AllHTMLAttributes[org.scalajs.dom.raw.HTMLElement] = null,
    ClassAttributes: ClassAttributes[org.scalajs.dom.raw.HTMLElement] = null
  ): ComboboxOptionProps = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    __obj.asInstanceOf[ComboboxOptionProps]
  }
}

