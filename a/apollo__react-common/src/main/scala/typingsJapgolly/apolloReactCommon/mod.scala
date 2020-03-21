package typingsJapgolly.apolloReactCommon

import typingsJapgolly.apolloReactCommon.apolloConsumerMod.ApolloConsumerProps
import typingsJapgolly.apolloReactCommon.apolloContextMod.ApolloContextValue
import typingsJapgolly.apolloReactCommon.apolloProviderMod.ApolloProviderProps
import typingsJapgolly.apolloReactCommon.parserMod.DocumentType
import typingsJapgolly.apolloReactCommon.parserMod.IDocumentDefinition
import typingsJapgolly.graphql.astMod.DocumentNode
import typingsJapgolly.react.mod.Context
import typingsJapgolly.react.mod.FC
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@apollo/react-common", JSImport.Namespace)
@js.native
object mod extends js.Object {
  val ApolloConsumer: FC[ApolloConsumerProps] = js.native
  val ApolloProvider: FC[ApolloProviderProps[js.Any]] = js.native
  def getApolloContext(): Context[ApolloContextValue] = js.native
  def operationName(`type`: DocumentType): js.UndefOr[String] = js.native
  def parser(document: DocumentNode): IDocumentDefinition = js.native
  def resetApolloContext(): Unit = js.native
  @js.native
  object DocumentType extends js.Object {
    /* 1 */ val Mutation: typingsJapgolly.apolloReactCommon.parserMod.DocumentType.Mutation with Double = js.native
    /* 0 */ val Query: typingsJapgolly.apolloReactCommon.parserMod.DocumentType.Query with Double = js.native
    /* 2 */ val Subscription: typingsJapgolly.apolloReactCommon.parserMod.DocumentType.Subscription with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.apolloReactCommon.parserMod.DocumentType with Double] = js.native
  }
  
}

