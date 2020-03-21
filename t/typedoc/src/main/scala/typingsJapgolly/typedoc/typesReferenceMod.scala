package typingsJapgolly.typedoc

import typingsJapgolly.typedoc.componentsMod.TypeNodeConverter
import typingsJapgolly.typedoc.contextMod.Context
import typingsJapgolly.typedoc.modelsTypesMod.Type
import typingsJapgolly.typescript.mod.TypeReference
import typingsJapgolly.typescript.mod.TypeReferenceNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/converter/types/reference", JSImport.Namespace)
@js.native
object typesReferenceMod extends js.Object {
  @js.native
  class ReferenceConverter () extends TypeNodeConverter[TypeReference, TypeReferenceNode] {
    var convertLiteral: js.Any = js.native
    def convertType(context: Context, `type`: TypeReference): js.UndefOr[Type] = js.native
    def supportsType(context: Context, `type`: TypeReference): Boolean = js.native
  }
  
}

