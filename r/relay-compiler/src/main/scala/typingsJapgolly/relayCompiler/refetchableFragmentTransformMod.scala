package typingsJapgolly.relayCompiler

import typingsJapgolly.relayCompiler.compilerContextMod.CompilerContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("relay-compiler/lib/transforms/RefetchableFragmentTransform", JSImport.Namespace)
@js.native
object refetchableFragmentTransformMod extends js.Object {
  /**
    * This transform synthesizes "refetch" queries for fragments that
    * are trivially refetchable. This is comprised of three main stages:
    *
    * 1. Validating that fragments marked with @refetchable qualify for
    *    refetch query generation; mainly this means that the fragment
    *    type is able to be refetched in some canonical way.
    * 2. Determining the variable definitions to use for each generated
    *    query. GraphQL does not have a notion of fragment-local variables
    *    at all, and although Relay adds this concept developers are still
    *    allowed to reference global variables. This necessitates a
    *    visiting all reachable fragments for each @refetchable fragment,
    *    and finding the union of all global variables expceted to be defined.
    * 3. Building the refetch queries, a straightforward copying transform from
    *    Fragment to Root IR nodes.
    */
  def transform(context: CompilerContext): CompilerContext = js.native
}

