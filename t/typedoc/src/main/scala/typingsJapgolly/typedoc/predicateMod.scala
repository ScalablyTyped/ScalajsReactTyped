package typingsJapgolly.typedoc

import typingsJapgolly.typedoc.componentsMod.ConverterTypeComponent
import typingsJapgolly.typedoc.contextMod.Context
import typingsJapgolly.typedoc.modelsTypesMod.PredicateType
import typingsJapgolly.typescript.mod.Node
import typingsJapgolly.typescript.mod.TypePredicateNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/converter/types/predicate", JSImport.Namespace)
@js.native
object predicateMod extends js.Object {
  @js.native
  class PredicateConverter () extends ConverterTypeComponent {
    def convertNode(context: Context, node: TypePredicateNode): PredicateType = js.native
    def supportsNode(_context: Context, node: Node): Boolean = js.native
  }
  
}

