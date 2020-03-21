package typingsJapgolly.typedoc

import typingsJapgolly.typedoc.componentsMod.TypeNodeConverter
import typingsJapgolly.typescript.mod.Type
import typingsJapgolly.typescript.mod.TypeReferenceNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/converter/types/alias", JSImport.Namespace)
@js.native
object typesAliasMod extends js.Object {
  @js.native
  class AliasConverter () extends TypeNodeConverter[Type, TypeReferenceNode]
  
}

