package typingsJapgolly.typedoc

import typingsJapgolly.typedoc.componentsMod.TypeNodeConverter
import typingsJapgolly.typedoc.contextMod.Context
import typingsJapgolly.typescript.mod.IndexedAccessTypeNode
import typingsJapgolly.typescript.mod.Type
import typingsJapgolly.typescript.mod.TypeNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/converter/types/indexed-access", JSImport.Namespace)
@js.native
object indexedAccessMod extends js.Object {
  @js.native
  class IndexedAccessConverter () extends TypeNodeConverter[Type, IndexedAccessTypeNode] {
    def supportsNode(context: Context, node: TypeNode): Boolean = js.native
  }
  
}

