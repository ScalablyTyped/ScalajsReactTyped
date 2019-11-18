package typingsJapgolly.jqueryui.JQueryUI

import typingsJapgolly.jqueryui.JQuery
import typingsJapgolly.std.ThisType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Widget extends js.Object {
  def apply(methodName: String): JQuery = js.native
  def apply(optionLiteral: String, optionName: String): js.Any = js.native
  def apply(optionLiteral: String, optionName: String, optionValue: js.Any): JQuery = js.native
  def apply(optionLiteral: String, options: WidgetOptions): js.Any = js.native
  def apply(options: AccordionOptions): JQuery = js.native
  def apply(options: WidgetOptions): JQuery = js.native
  def apply[T](name: String, base: js.Function, prototype: T with (ThisType[T with WidgetCommonProperties])): JQuery = js.native
  def apply[T](name: String, prototype: T with (ThisType[T with WidgetCommonProperties])): JQuery = js.native
}

