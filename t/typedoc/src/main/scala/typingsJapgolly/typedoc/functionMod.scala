package typingsJapgolly.typedoc

import typingsJapgolly.typedoc.componentsMod.ConverterNodeComponent
import typingsJapgolly.typedoc.contextMod.Context
import typingsJapgolly.typedoc.modelsMod.Reflection
import typingsJapgolly.typescript.mod.FunctionDeclaration
import typingsJapgolly.typescript.mod.MethodDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/converter/nodes/function", JSImport.Namespace)
@js.native
object functionMod extends js.Object {
  @js.native
  class FunctionConverter () extends ConverterNodeComponent[FunctionDeclaration | MethodDeclaration] {
    def convert(context: Context, node: FunctionDeclaration): js.UndefOr[Reflection] = js.native
    def convert(context: Context, node: MethodDeclaration): js.UndefOr[Reflection] = js.native
  }
  
}

