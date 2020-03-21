package typingsJapgolly.hbs

import typingsJapgolly.handlebars.Handlebars.ResolvePartialOptions
import typingsJapgolly.handlebars.HandlebarsTemplateDelegate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofVM extends js.Object {
  def resolvePartial[T](partial: js.UndefOr[scala.Nothing], context: js.Any, options: ResolvePartialOptions): HandlebarsTemplateDelegate[T] = js.native
  def resolvePartial[T](partial: HandlebarsTemplateDelegate[T], context: js.Any, options: ResolvePartialOptions): HandlebarsTemplateDelegate[T] = js.native
}

