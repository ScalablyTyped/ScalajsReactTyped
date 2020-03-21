package typingsJapgolly.handlebars

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
* Implement this interface on your MVW/MVVM/MVC views such as Backbone.View
**/
@js.native
trait HandlebarsTemplatable extends js.Object {
  @JSName("template")
  var template_Original: HandlebarsTemplateDelegate[_] = js.native
  def template(context: js.Any): String = js.native
  def template(context: js.Any, options: typingsJapgolly.handlebars.Handlebars.RuntimeOptions): String = js.native
}

