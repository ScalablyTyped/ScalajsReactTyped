package typingsJapgolly.reactToggled.mod

import typingsJapgolly.react.mod.AllHTMLAttributes
import typingsJapgolly.react.mod.ClassAttributes
import typingsJapgolly.std.HTMLButtonElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetButtonPropsOptions
  extends AllHTMLAttributes[HTMLButtonElement]
     with ClassAttributes[HTMLButtonElement]

object GetButtonPropsOptions {
  @scala.inline
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[org.scalajs.dom.raw.HTMLButtonElement] = null,
    ClassAttributes: ClassAttributes[org.scalajs.dom.raw.HTMLButtonElement] = null
  ): GetButtonPropsOptions = {
    val __obj = js.Dynamic.literal()
    if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    __obj.asInstanceOf[GetButtonPropsOptions]
  }
}

