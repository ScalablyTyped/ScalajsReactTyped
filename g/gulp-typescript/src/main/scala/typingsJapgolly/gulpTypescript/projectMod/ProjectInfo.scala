package typingsJapgolly.gulpTypescript.projectMod

import typingsJapgolly.gulpTypescript.Typeofts
import typingsJapgolly.gulpTypescript.compilerMod.ICompiler
import typingsJapgolly.gulpTypescript.inputMod.FileCache
import typingsJapgolly.gulpTypescript.outputMod.Output
import typingsJapgolly.gulpTypescript.reporterMod.Reporter
import typingsJapgolly.typescript.mod.CompilerOptions
import typingsJapgolly.typescript.mod.ProjectReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectInfo extends js.Object {
  var compiler: ICompiler
  var directory: String
  var input: FileCache
  var options: CompilerOptions
  var output: Output
  var projectReferences: js.Array[ProjectReference]
  var reporter: Reporter
  var singleOutput: Boolean
  var typescript: Typeofts
}

object ProjectInfo {
  @scala.inline
  def apply(
    compiler: ICompiler,
    directory: String,
    input: FileCache,
    options: CompilerOptions,
    output: Output,
    projectReferences: js.Array[ProjectReference],
    reporter: Reporter,
    singleOutput: Boolean,
    typescript: Typeofts
  ): ProjectInfo = {
    val __obj = js.Dynamic.literal(compiler = compiler.asInstanceOf[js.Any], directory = directory.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any], projectReferences = projectReferences.asInstanceOf[js.Any], reporter = reporter.asInstanceOf[js.Any], singleOutput = singleOutput.asInstanceOf[js.Any], typescript = typescript.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ProjectInfo]
  }
}

