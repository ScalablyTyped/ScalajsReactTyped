package typingsJapgolly.ioTs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("io-ts", "brand")
@js.native
object brand extends js.Object {
  def apply[C /* <: Any_ */, N /* <: String */, B /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {readonly [ K in N ]: symbol}
    */ typingsJapgolly.ioTs.ioTsStrings.brand with js.Any */](
    codec: C,
    predicate: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Refinement<C['_A'], Branded<C['_A'], B>> */ js.Any,
    name: N
  ): BrandC[C, B] = js.native
}

