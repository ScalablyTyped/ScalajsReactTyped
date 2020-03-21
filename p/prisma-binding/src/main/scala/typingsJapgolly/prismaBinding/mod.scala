package typingsJapgolly.prismaBinding

import typingsJapgolly.apolloLink.mod.ApolloLink
import typingsJapgolly.graphql.definitionMod.GraphQLResolveInfo
import typingsJapgolly.graphqlBinding.distTypesMod.FragmentReplacement
import typingsJapgolly.graphqlTools.interfacesMod.IResolvers
import typingsJapgolly.prismaBinding.typesMod.PrismaOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prisma-binding", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class Prisma protected ()
    extends typingsJapgolly.prismaBinding.prismaMod.Prisma {
    def this(hasTypeDefsEndpointSecretFragmentReplacementsDebugDisableCache: PrismaOptions) = this()
  }
  
  def extractFragmentReplacements(resolvers: IResolvers[_, _]): js.Array[FragmentReplacement] = js.native
  def forwardTo(bindingName: String): js.Function4[
    /* parent */ js.Any, 
    /* args */ js.Any, 
    /* context */ js.Any, 
    /* info */ GraphQLResolveInfo, 
    _
  ] = js.native
  def makePrismaBindingClass[T](hasTypeDefs: AnonTypeDefs): T = js.native
  def makePrismaLink(hasEndpointTokenDebug: AnonDebug): ApolloLink = js.native
}

