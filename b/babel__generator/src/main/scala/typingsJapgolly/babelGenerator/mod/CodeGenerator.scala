package typingsJapgolly.babelGenerator.mod

import typingsJapgolly.babelTypes.mod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@babel/generator", "CodeGenerator")
@js.native
class CodeGenerator protected () extends js.Object {
  def this(ast: Node) = this()
  def this(ast: Node, opts: GeneratorOptions) = this()
  def this(ast: Node, opts: GeneratorOptions, code: String) = this()
  def generate(): GeneratorResult = js.native
}

