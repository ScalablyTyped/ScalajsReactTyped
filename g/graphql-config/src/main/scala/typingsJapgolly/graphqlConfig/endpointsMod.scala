package typingsJapgolly.graphqlConfig

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.graphqlConfig.endpointsExtensionMod.GraphQLConfigEnpointConfig
import typingsJapgolly.graphqlConfig.endpointsExtensionMod.GraphQLConfigEnpointsMapData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-config/lib/extensions/endpoints", JSImport.Namespace)
@js.native
object endpointsMod extends js.Object {
  @js.native
  class GraphQLEndpoint protected ()
    extends typingsJapgolly.graphqlConfig.endpointsExtensionMod.GraphQLEndpoint {
    def this(resolvedConfig: GraphQLConfigEnpointConfig) = this()
  }
  
  @js.native
  class GraphQLEndpointsExtension protected ()
    extends typingsJapgolly.graphqlConfig.endpointsExtensionMod.GraphQLEndpointsExtension {
    def this(endpointConfig: GraphQLConfigEnpointsMapData, configPath: String) = this()
  }
  
  def getUsedEnvs(config: js.Any): StringDictionary[String] = js.native
  def resolveEnvsInValues[T /* <: StringDictionary[js.Any] */](config: T, env: StringDictionary[js.UndefOr[String]]): T = js.native
  def resolveRefString(str: String): String = js.native
  def resolveRefString(str: String, values: js.Object): String = js.native
}

