package typingsJapgolly.jsrender.JsViews

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Template extends TemplateRender {
  var _is: String = js.native
  var converters: js.UndefOr[Hash[Converter]] = js.native
  var fn: js.UndefOr[js.Function1[/* repeated */ js.Any, String]] = js.native
  var helpers: js.UndefOr[Hash[_]] = js.native
  var markup: String = js.native
  @JSName("render")
  var render_Original: TemplateRender = js.native
  var tags: js.UndefOr[Hash[Tag]] = js.native
  var templates: js.UndefOr[Hash[Template]] = js.native
  /* Compiled template object */
  var tmplName: String = js.native
  var useViews: js.UndefOr[Boolean] = js.native
  /**
  	 * Template render method: render the template as a string, using the specified data and helpers/context
  	 * var htmlString = template(data, myHelpersObject);
  	 * var htmlString = template.render(data, myHelpersObject);
  	 *
  	 * $("#tmpl").render(), tmpl.render(), tagCtx.render(), $.render.namedTmpl()
  	 *
  	 * @param {any}        data
  	 * @param {hash}       [helpersOrContext]
  	 * @param {boolean}    [noIteration]
  	 * @returns {string}   rendered template
  	 */
  def render(): String = js.native
  def render(data: js.Any): String = js.native
  def render(data: js.Any, helpersOrContext: Hash[_]): String = js.native
  def render(data: js.Any, helpersOrContext: Hash[_], noIteration: Boolean): String = js.native
  def render(data: js.Any, noIteration: Boolean): String = js.native
}

