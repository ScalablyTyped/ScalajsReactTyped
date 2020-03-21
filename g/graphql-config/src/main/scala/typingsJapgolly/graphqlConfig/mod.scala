package typingsJapgolly.graphqlConfig

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.graphql.mod.GraphQLSchema
import typingsJapgolly.graphqlConfig.endpointsExtensionMod.GraphQLConfigEnpointConfig
import typingsJapgolly.graphqlConfig.endpointsExtensionMod.GraphQLConfigEnpointsMapData
import typingsJapgolly.graphqlConfig.graphqlConfigStrings.Dotgraphqlconfig
import typingsJapgolly.graphqlConfig.graphqlConfigStrings.DotgraphqlconfigDotyaml
import typingsJapgolly.graphqlConfig.typesMod.GraphQLConfigData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-config", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class ConfigNotFoundError protected ()
    extends typingsJapgolly.graphqlConfig.errorsMod.ConfigNotFoundError {
    def this(message: String) = this()
  }
  
  @js.native
  class GraphQLConfig protected ()
    extends typingsJapgolly.graphqlConfig.graphQLConfigMod.GraphQLConfig {
    def this(config: GraphQLConfigData, configPath: String) = this()
  }
  
  @js.native
  class GraphQLEndpoint protected ()
    extends typingsJapgolly.graphqlConfig.extensionsMod.GraphQLEndpoint {
    def this(resolvedConfig: GraphQLConfigEnpointConfig) = this()
  }
  
  @js.native
  class GraphQLEndpointsExtension protected ()
    extends typingsJapgolly.graphqlConfig.extensionsMod.GraphQLEndpointsExtension {
    def this(endpointConfig: GraphQLConfigEnpointsMapData, configPath: String) = this()
  }
  
  @js.native
  class GraphQLProjectConfig protected ()
    extends typingsJapgolly.graphqlConfig.graphQLProjectConfigMod.GraphQLProjectConfig {
    def this(config: GraphQLConfigData, configPath: String) = this()
    def this(config: GraphQLConfigData, configPath: String, projectName: String) = this()
  }
  
  val GRAPHQL_CONFIG_NAME: Dotgraphqlconfig = js.native
  val GRAPHQL_CONFIG_YAML_NAME: DotgraphqlconfigDotyaml = js.native
  def findGraphQLConfigFile(filePath: String): String = js.native
  def getGraphQLConfig(): typingsJapgolly.graphqlConfig.graphQLConfigMod.GraphQLConfig = js.native
  def getGraphQLConfig(rootDir: String): typingsJapgolly.graphqlConfig.graphQLConfigMod.GraphQLConfig = js.native
  def getGraphQLProjectConfig(): typingsJapgolly.graphqlConfig.graphQLProjectConfigMod.GraphQLProjectConfig = js.native
  def getGraphQLProjectConfig(rootDir: String): typingsJapgolly.graphqlConfig.graphQLProjectConfigMod.GraphQLProjectConfig = js.native
  def getGraphQLProjectConfig(rootDir: String, projectName: String): typingsJapgolly.graphqlConfig.graphQLProjectConfigMod.GraphQLProjectConfig = js.native
  def getSchemaExtensions(path: String): StringDictionary[String] = js.native
  def getUsedEnvs(config: js.Any): StringDictionary[String] = js.native
  def resolveEnvsInValues[T /* <: StringDictionary[js.Any] */](config: T, env: StringDictionary[js.UndefOr[String]]): T = js.native
  def resolveRefString(str: String): String = js.native
  def resolveRefString(str: String, values: js.Object): String = js.native
  def validateConfig(config: GraphQLConfigData): Unit = js.native
  def writeSchema(path: String, schema: GraphQLSchema): js.Promise[Unit] = js.native
  def writeSchema(path: String, schema: GraphQLSchema, schemaExtensions: StringDictionary[String]): js.Promise[Unit] = js.native
}

