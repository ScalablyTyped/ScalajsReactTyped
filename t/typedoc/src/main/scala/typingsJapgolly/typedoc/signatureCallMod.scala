package typingsJapgolly.typedoc

import typingsJapgolly.typedoc.componentsMod.ConverterNodeComponent
import typingsJapgolly.typedoc.contextMod.Context
import typingsJapgolly.typedoc.modelsMod.Reflection
import typingsJapgolly.typescript.mod.FunctionExpression
import typingsJapgolly.typescript.mod.SignatureDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/converter/nodes/signature-call", JSImport.Namespace)
@js.native
object signatureCallMod extends js.Object {
  @js.native
  class SignatureConverter () extends ConverterNodeComponent[FunctionExpression | SignatureDeclaration] {
    def convert(context: Context, node: FunctionExpression): Reflection = js.native
    def convert(context: Context, node: SignatureDeclaration): Reflection = js.native
  }
  
}

