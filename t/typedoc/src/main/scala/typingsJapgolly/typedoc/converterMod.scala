package typingsJapgolly.typedoc

import typingsJapgolly.typescript.mod.EnumMember
import typingsJapgolly.typescript.mod.Expression
import typingsJapgolly.typescript.mod.ParameterDeclaration
import typingsJapgolly.typescript.mod.Program
import typingsJapgolly.typescript.mod.TypeChecker
import typingsJapgolly.typescript.mod.VariableDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/converter", JSImport.Namespace)
@js.native
object converterMod extends js.Object {
  @js.native
  class Context protected ()
    extends typingsJapgolly.typedoc.contextMod.Context {
    def this(
      converter: typingsJapgolly.typedoc.converterConverterMod.Converter,
      fileNames: js.Array[String],
      checker: TypeChecker,
      program: Program
    ) = this()
  }
  
  @js.native
  class Converter ()
    extends typingsJapgolly.typedoc.converterConverterMod.Converter
  
  def convertDefaultValue(node: EnumMember): js.UndefOr[String] = js.native
  def convertDefaultValue(node: ParameterDeclaration): js.UndefOr[String] = js.native
  def convertDefaultValue(node: VariableDeclaration): js.UndefOr[String] = js.native
  def convertExpression(expression: Expression): String = js.native
  /* static members */
  @js.native
  object Converter extends js.Object {
    var EVENT_BEGIN: String = js.native
    var EVENT_CREATE_DECLARATION: String = js.native
    var EVENT_CREATE_PARAMETER: String = js.native
    var EVENT_CREATE_SIGNATURE: String = js.native
    var EVENT_CREATE_TYPE_PARAMETER: String = js.native
    var EVENT_END: String = js.native
    var EVENT_FILE_BEGIN: String = js.native
    var EVENT_FUNCTION_IMPLEMENTATION: String = js.native
    var EVENT_RESOLVE: String = js.native
    var EVENT_RESOLVE_BEGIN: String = js.native
    var EVENT_RESOLVE_END: String = js.native
  }
  
}

