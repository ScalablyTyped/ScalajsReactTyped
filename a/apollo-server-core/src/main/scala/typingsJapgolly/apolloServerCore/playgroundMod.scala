package typingsJapgolly.apolloServerCore

import typingsJapgolly.apollographqlGraphqlPlaygroundHtml.renderPlaygroundPageMod.RenderPageOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server-core/dist/playground", JSImport.Namespace)
@js.native
object playgroundMod extends js.Object {
  def createPlaygroundOptions(): js.UndefOr[RenderPageOptions] = js.native
  def createPlaygroundOptions(playground: PlaygroundConfig): js.UndefOr[RenderPageOptions] = js.native
  @js.native
  object defaultPlaygroundOptions extends js.Object {
    var settings: AnonEditorcursorShape = js.native
    var version: String = js.native
  }
  
  type PlaygroundConfig = RecursivePartialRenderPag | Boolean
  type RecursivePartial[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]:? T[P] extends std.Array<infer U>? std.Array</ * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias apollo-server-core.apollo-server-core/dist/playground.RecursivePartial<U> * / object> : T[P] extends object | undefined? / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias apollo-server-core.apollo-server-core/dist/playground.RecursivePartial<T[P]> * / object : T[P]}
    */ typingsJapgolly.apolloServerCore.apolloServerCoreStrings.RecursivePartial with js.Any
}

