package typingsJapgolly.faviconsWebpackPlugin

import typingsJapgolly.htmlWebpackPlugin.mod.Options
import typingsJapgolly.htmlWebpackPlugin.mod.TemplateFunction
import typingsJapgolly.webpack.mod.Compiler_
import typingsJapgolly.webpack.mod.compilation.Compilation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined html-webpack-plugin.html-webpack-plugin.^ & {  options  :html-webpack-plugin.html-webpack-plugin.Options} */
@js.native
trait optionsOptions extends js.Object {
  var options: this.type = js.native
  @JSName("apply")
  def apply(args: js.Any*): Unit = js.native
  @JSName("apply")
  def apply(compiler: Compiler_): Unit = js.native
  def evaluateCompilationResult(compilation: Compilation, content: String): js.Promise[String | TemplateFunction] = js.native
  def executeTemplate(templateFunction: TemplateFunction, chunks: js.Any, assets: js.Any, compilation: Compilation): js.Promise[String] = js.native
  def postProcessHtml(html: String, assets: js.Any, assetTags: js.Any): js.Promise[String] = js.native
}

