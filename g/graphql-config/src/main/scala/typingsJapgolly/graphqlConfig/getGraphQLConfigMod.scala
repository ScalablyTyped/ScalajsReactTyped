package typingsJapgolly.graphqlConfig

import typingsJapgolly.graphqlConfig.graphQLConfigMod.GraphQLConfig
import typingsJapgolly.graphqlConfig.graphQLProjectConfigMod.GraphQLProjectConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-config/lib/getGraphQLConfig", JSImport.Namespace)
@js.native
object getGraphQLConfigMod extends js.Object {
  def getGraphQLConfig(): GraphQLConfig = js.native
  def getGraphQLConfig(rootDir: String): GraphQLConfig = js.native
  def getGraphQLProjectConfig(): GraphQLProjectConfig = js.native
  def getGraphQLProjectConfig(rootDir: String): GraphQLProjectConfig = js.native
  def getGraphQLProjectConfig(rootDir: String, projectName: String): GraphQLProjectConfig = js.native
}

