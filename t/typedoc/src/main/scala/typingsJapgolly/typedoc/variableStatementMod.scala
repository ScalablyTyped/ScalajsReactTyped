package typingsJapgolly.typedoc

import typingsJapgolly.typedoc.componentsMod.ConverterNodeComponent
import typingsJapgolly.typedoc.contextMod.Context
import typingsJapgolly.typescript.mod.BindingPattern
import typingsJapgolly.typescript.mod.VariableStatement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/converter/nodes/variable-statement", JSImport.Namespace)
@js.native
object variableStatementMod extends js.Object {
  @js.native
  class VariableStatementConverter () extends ConverterNodeComponent[VariableStatement] {
    def convertBindingPattern(context: Context, node: BindingPattern): Unit = js.native
  }
  
}

