package typingsJapgolly.vueComponentCompilerUtils

import typingsJapgolly.vueComponentCompilerUtils.compileStyleMod.StyleCompileOptions
import typingsJapgolly.vueComponentCompilerUtils.compileStyleMod.StyleCompileResults
import typingsJapgolly.vueComponentCompilerUtils.compileTemplateMod.TemplateCompileOptions
import typingsJapgolly.vueComponentCompilerUtils.compileTemplateMod.TemplateCompileResult
import typingsJapgolly.vueComponentCompilerUtils.parseMod.ParseOptions
import typingsJapgolly.vueComponentCompilerUtils.parseMod.SFCDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@vue/component-compiler-utils", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def compileStyle(options: StyleCompileOptions): StyleCompileResults = js.native
  def compileStyleAsync(options: StyleCompileOptions): js.Promise[StyleCompileResults] = js.native
  def compileTemplate(options: TemplateCompileOptions): TemplateCompileResult = js.native
  def parse(options: ParseOptions): SFCDescriptor = js.native
}

