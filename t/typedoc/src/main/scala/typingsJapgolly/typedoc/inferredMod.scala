package typingsJapgolly.typedoc

import typingsJapgolly.typedoc.componentsMod.TypeNodeConverter
import typingsJapgolly.typedoc.contextMod.Context
import typingsJapgolly.typescript.mod.InferTypeNode
import typingsJapgolly.typescript.mod.Type
import typingsJapgolly.typescript.mod.TypeNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/converter/types/inferred", JSImport.Namespace)
@js.native
object inferredMod extends js.Object {
  @js.native
  class InferredConverter () extends TypeNodeConverter[Type, InferTypeNode] {
    def supportsNode(_context: Context, node: TypeNode): Boolean = js.native
  }
  
}

