package typingsJapgolly.octokitPluginRestEndpointMethods

import typingsJapgolly.octokitCore.mod.Octokit
import typingsJapgolly.octokitPluginRestEndpointMethods.distTypesGeneratedMethodTypesMod.RestEndpointMethods
import typingsJapgolly.octokitPluginRestEndpointMethods.distTypesTypesMod.EndpointsDefaultsAndDecorations
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesEndpointsToMethodsMod {
  
  @JSImport("@octokit/plugin-rest-endpoint-methods/dist-types/endpoints-to-methods", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def endpointsToMethods(octokit: Octokit, endpointsMap: EndpointsDefaultsAndDecorations): RestEndpointMethods = (^.asInstanceOf[js.Dynamic].applyDynamic("endpointsToMethods")(octokit.asInstanceOf[js.Any], endpointsMap.asInstanceOf[js.Any])).asInstanceOf[RestEndpointMethods]
}
